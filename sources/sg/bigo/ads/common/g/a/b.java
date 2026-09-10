package sg.bigo.ads.common.g.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f47226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static WeakReference<Context> f47227b;

    private b(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 4);
        f47227b = new WeakReference<>(context);
        sg.bigo.ads.common.t.a.a(0, 3, "DBHelper", "DbOpenHelper newInstance");
    }

    public static synchronized b a(Context context) {
        try {
            if (f47226a == null) {
                f47226a = new b(context, "bigo_ads_sdk.db");
            }
        } catch (Throwable th) {
            throw th;
        }
        return f47226a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sg.bigo.ads.common.t.a.a(0, 3, "DBHelper", "onCreate start");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_event (_id INTEGER PRIMARY KEY AUTOINCREMENT,event_action TEXT NOT NULL,event_info TEXT NOT NULL,states INTEGER DEFAULT 0 NOT NULL,ext TEXT,ctime LONG DEFAULT 0 NOT NULL,mtime LONG DEFAULT 0 NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_tracker (_id INTEGER PRIMARY KEY AUTOINCREMENT,ad_data TEXT NOT NULL,tracker_imp TEXT,tracker_cli TEXT,tracker_nurl TEXT,tracker_lurl TEXT,tracker_type INTEGER DEFAULT 0 NOT NULL,last_retry_ts LONG DEFAULT 0 NOT NULL,ext TEXT,ctime LONG DEFAULT 0 NOT NULL,mtime LONG DEFAULT 0 NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_stat (_id INTEGER PRIMARY KEY AUTOINCREMENT,event_id TEXT NOT NULL,event_info TEXT NOT NULL,expired_ts LONG DEFAULT 0 NOT NULL,ext TEXT,ctime LONG DEFAULT 0 NOT NULL,mtime LONG DEFAULT 0 NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_report (_id INTEGER PRIMARY KEY AUTOINCREMENT,pkg_name TEXT NOT NULL,status INTEGER DEFAULT 0,source INTEGER DEFAULT 0,check_ts LONG DEFAULT 0,result INTEGER DEFAULT 0,install_ts LONG DEFAULT 0,valid_date_ts LONG DEFAULT 0,sid LONG DEFAULT 0,ad_id TEXT,dsp TEXT,ext TEXT,mtime LONG DEFAULT 0 NOT NULL,ctime DATETIME DEFAULT CURRENT_TIMESTAMP,UNIQUE (pkg_name,status,source,sid));");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_addata (_id INTEGER PRIMARY KEY AUTOINCREMENT,slot TEXT NOT NULL UNIQUE,log_id TEXT,start_time LONG DEFAULT 0,end_time LONG DEFAULT 0,ad_data TEXT NOT NULL,ext TEXT,mtime LONG DEFAULT 0,ctime DATETIME DEFAULT CURRENT_TIMESTAMP);");
        sg.bigo.ads.common.t.a.a(0, 3, "DBHelper", "onCreate end");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        Context context;
        String strG = android.support.v4.media.a.g(i2, i3, "onDowngrade oldVersion=", ",newVersion=");
        sg.bigo.ads.common.t.a.a(0, 3, "DBHelper", strG);
        super.onDowngrade(sQLiteDatabase, i2, i3);
        WeakReference<Context> weakReference = f47227b;
        if (weakReference == null || (context = weakReference.get()) == null) {
            return;
        }
        a.a(context, strG);
        a.a(context);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sg.bigo.ads.common.t.a.a(1, 4, "DBHelper", android.support.v4.media.a.g(i2, i3, "Upgrading database from version ", " to "));
        if (i2 < 2) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_report (_id INTEGER PRIMARY KEY AUTOINCREMENT,pkg_name TEXT NOT NULL,status INTEGER DEFAULT 0,source INTEGER DEFAULT 0,check_ts LONG DEFAULT 0,result INTEGER DEFAULT 0,install_ts LONG DEFAULT 0,valid_date_ts LONG DEFAULT 0,sid LONG DEFAULT 0,ad_id TEXT,dsp TEXT,ext TEXT,mtime LONG DEFAULT 0 NOT NULL,ctime DATETIME DEFAULT CURRENT_TIMESTAMP,UNIQUE (pkg_name,status,source,sid));");
        }
        if (i2 < 3) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_addata (_id INTEGER PRIMARY KEY AUTOINCREMENT,slot TEXT NOT NULL UNIQUE,log_id TEXT,start_time LONG DEFAULT 0,end_time LONG DEFAULT 0,ad_data TEXT NOT NULL,ext TEXT,mtime LONG DEFAULT 0,ctime DATETIME DEFAULT CURRENT_TIMESTAMP);");
        }
        if (i2 < 4) {
            sQLiteDatabase.execSQL("ALTER TABLE tb_tracker ADD tracker_nurl TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE tb_tracker ADD tracker_lurl TEXT");
        }
    }

    public static void a() {
        f47226a = null;
    }
}
