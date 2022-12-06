/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DBUtil;

import Model.Configuration;
import Model.EcoModel;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author ramya
 */
public class DBUtil {
    private static final String FILENAME = Paths.get("database.db4o").toAbsolutePath().toString();
    private static DBUtil dbUtil;

    public synchronized static DBUtil getInstance() {
        if (dbUtil == null) 
        {
            dbUtil = new DBUtil();
        }
        return dbUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {
            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);            
            config.common().activationDepth(Integer.MAX_VALUE);
            config.common().updateDepth(Integer.MAX_VALUE);
            config.common().add(new TransparentPersistenceSupport());            
            config.common().objectClass(EcoModel.class).cascadeOnUpdate(true);
            return db;
        } catch (Exception ex) {}
        return null;
    }

    public synchronized void storeSystem(EcoModel system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }

    public EcoModel retrieveSystem() {
        ObjectContainer conn = createConnection();
        ObjectSet<EcoModel> systems = conn.query(EcoModel.class);
       
        EcoModel system;
        if (systems.isEmpty()) {
            system = Configuration.configure();
        } else {
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }    
}
