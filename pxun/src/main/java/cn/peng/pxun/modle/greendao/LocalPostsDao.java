package cn.peng.pxun.modle.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LOCAL_POSTS".
*/
public class LocalPostsDao extends AbstractDao<LocalPosts, Long> {

    public static final String TABLENAME = "LOCAL_POSTS";

    /**
     * Properties of entity LocalPosts.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property PublishUserId = new Property(1, String.class, "publishUserId", false, "PUBLISH_USER_ID");
        public final static Property PublishUserName = new Property(2, String.class, "publishUserName", false, "PUBLISH_USER_NAME");
        public final static Property PublishUserIcon = new Property(3, String.class, "publishUserIcon", false, "PUBLISH_USER_ICON");
        public final static Property Content = new Property(4, String.class, "content", false, "CONTENT");
        public final static Property PicPath = new Property(5, String.class, "picPath", false, "PIC_PATH");
        public final static Property PostsType = new Property(6, String.class, "postsType", false, "POSTS_TYPE");
        public final static Property ContentType = new Property(7, String.class, "contentType", false, "CONTENT_TYPE");
    }


    public LocalPostsDao(DaoConfig config) {
        super(config);
    }
    
    public LocalPostsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LOCAL_POSTS\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"PUBLISH_USER_ID\" TEXT," + // 1: publishUserId
                "\"PUBLISH_USER_NAME\" TEXT," + // 2: publishUserName
                "\"PUBLISH_USER_ICON\" TEXT," + // 3: publishUserIcon
                "\"CONTENT\" TEXT," + // 4: content
                "\"PIC_PATH\" TEXT," + // 5: picPath
                "\"POSTS_TYPE\" TEXT," + // 6: postsType
                "\"CONTENT_TYPE\" TEXT);"); // 7: contentType
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LOCAL_POSTS\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, LocalPosts entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String publishUserId = entity.getPublishUserId();
        if (publishUserId != null) {
            stmt.bindString(2, publishUserId);
        }
 
        String publishUserName = entity.getPublishUserName();
        if (publishUserName != null) {
            stmt.bindString(3, publishUserName);
        }
 
        String publishUserIcon = entity.getPublishUserIcon();
        if (publishUserIcon != null) {
            stmt.bindString(4, publishUserIcon);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(5, content);
        }
 
        String picPath = entity.getPicPath();
        if (picPath != null) {
            stmt.bindString(6, picPath);
        }
 
        String postsType = entity.getPostsType();
        if (postsType != null) {
            stmt.bindString(7, postsType);
        }
 
        String contentType = entity.getContentType();
        if (contentType != null) {
            stmt.bindString(8, contentType);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, LocalPosts entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String publishUserId = entity.getPublishUserId();
        if (publishUserId != null) {
            stmt.bindString(2, publishUserId);
        }
 
        String publishUserName = entity.getPublishUserName();
        if (publishUserName != null) {
            stmt.bindString(3, publishUserName);
        }
 
        String publishUserIcon = entity.getPublishUserIcon();
        if (publishUserIcon != null) {
            stmt.bindString(4, publishUserIcon);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(5, content);
        }
 
        String picPath = entity.getPicPath();
        if (picPath != null) {
            stmt.bindString(6, picPath);
        }
 
        String postsType = entity.getPostsType();
        if (postsType != null) {
            stmt.bindString(7, postsType);
        }
 
        String contentType = entity.getContentType();
        if (contentType != null) {
            stmt.bindString(8, contentType);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public LocalPosts readEntity(Cursor cursor, int offset) {
        LocalPosts entity = new LocalPosts( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // publishUserId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // publishUserName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // publishUserIcon
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // content
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // picPath
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // postsType
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // contentType
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, LocalPosts entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPublishUserId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPublishUserName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPublishUserIcon(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setContent(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPicPath(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setPostsType(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setContentType(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(LocalPosts entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(LocalPosts entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(LocalPosts entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
