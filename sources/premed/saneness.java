package premed;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;

/* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness implements iconoclasm.dern {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public boolean f35630adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final String f35631arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public attabal f35632graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Context f35633kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final Object f35634molybdenite = new Object();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final iconoclasm.dern.attabal f35635monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final boolean f35636polloi;

    /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.java */
    public static class attabal extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final iconoclasm.dern.attabal f35637arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final premed.attabal[] f35638kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public boolean f35639monoploid;

        /* JADX INFO: renamed from: premed.saneness$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.java */
        public class C0776attabal implements DatabaseErrorHandler {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final /* synthetic */ iconoclasm.dern.attabal f35640attabal;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public final /* synthetic */ premed.attabal[] f35641saneness;

            public C0776attabal(iconoclasm.dern.attabal attabalVar, premed.attabal[] attabalVarArr) {
                this.f35640attabal = attabalVar;
                this.f35641saneness = attabalVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f35640attabal.dern(attabal.saneness(this.f35641saneness, sQLiteDatabase));
            }
        }

        public attabal(Context context, String str, premed.attabal[] attabalVarArr, iconoclasm.dern.attabal attabalVar) {
            super(context, str, null, attabalVar.f28353attabal, new C0776attabal(attabalVar, attabalVarArr));
            this.f35637arytenoidectomy = attabalVar;
            this.f35638kowloon = attabalVarArr;
        }

        public static premed.attabal saneness(premed.attabal[] attabalVarArr, SQLiteDatabase sQLiteDatabase) {
            premed.attabal attabalVar = attabalVarArr[0];
            if (attabalVar == null || !attabalVar.attabal(sQLiteDatabase)) {
                attabalVarArr[0] = new premed.attabal(sQLiteDatabase);
            }
            return attabalVarArr[0];
        }

        public premed.attabal attabal(SQLiteDatabase sQLiteDatabase) {
            return saneness(this.f35638kowloon, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f35638kowloon[0] = null;
        }

        public synchronized iconoclasm.saneness dern() {
            this.f35639monoploid = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.f35639monoploid) {
                return attabal(writableDatabase);
            }
            close();
            return dern();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f35637arytenoidectomy.saneness(attabal(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f35637arytenoidectomy.wireman(attabal(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f35639monoploid = true;
            this.f35637arytenoidectomy.marial(attabal(sQLiteDatabase), i, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f35639monoploid) {
                return;
            }
            this.f35637arytenoidectomy.beachfront(attabal(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f35639monoploid = true;
            this.f35637arytenoidectomy.competently(attabal(sQLiteDatabase), i, i2);
        }
    }

    public saneness(Context context, String str, iconoclasm.dern.attabal attabalVar, boolean z) {
        this.f35633kowloon = context;
        this.f35631arytenoidectomy = str;
        this.f35635monoploid = attabalVar;
        this.f35636polloi = z;
    }

    public final attabal attabal() {
        attabal attabalVar;
        synchronized (this.f35634molybdenite) {
            try {
                if (this.f35632graveside == null) {
                    premed.attabal[] attabalVarArr = new premed.attabal[1];
                    if (this.f35631arytenoidectomy == null || !this.f35636polloi) {
                        this.f35632graveside = new attabal(this.f35633kowloon, this.f35631arytenoidectomy, attabalVarArr, this.f35635monoploid);
                    } else {
                        this.f35632graveside = new attabal(this.f35633kowloon, new File(this.f35633kowloon.getNoBackupFilesDir(), this.f35631arytenoidectomy).getAbsolutePath(), attabalVarArr, this.f35635monoploid);
                    }
                    this.f35632graveside.setWriteAheadLoggingEnabled(this.f35630adultoid);
                }
                attabalVar = this.f35632graveside;
            } catch (Throwable th) {
                throw th;
            }
        }
        return attabalVar;
    }

    @Override // iconoclasm.dern, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        attabal().close();
    }

    @Override // iconoclasm.dern
    public String getDatabaseName() {
        return this.f35631arytenoidectomy;
    }

    @Override // iconoclasm.dern
    public iconoclasm.saneness getWritableDatabase() {
        return attabal().dern();
    }

    @Override // iconoclasm.dern
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f35634molybdenite) {
            try {
                attabal attabalVar = this.f35632graveside;
                if (attabalVar != null) {
                    attabalVar.setWriteAheadLoggingEnabled(z);
                }
                this.f35630adultoid = z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
