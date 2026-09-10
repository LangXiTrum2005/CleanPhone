package iconoclasm;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: SupportSQLiteOpenHelper.java */
/* JADX INFO: loaded from: classes.dex */
public interface dern extends Closeable {

    /* JADX INFO: renamed from: iconoclasm.dern$dern, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.java */
    public interface InterfaceC0641dern {
        dern attabal(saneness sanenessVar);
    }

    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Context f28354attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final boolean f28355dern;
        public final String name;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final attabal f28356saneness;

        /* JADX INFO: compiled from: SupportSQLiteOpenHelper.java */
        public static class attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public Context f28357attabal;

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public attabal f28358dern;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public String f28359saneness;

            /* JADX INFO: renamed from: wireman, reason: collision with root package name */
            public boolean f28360wireman;

            public attabal(Context context) {
                this.f28357attabal = context;
            }

            public saneness attabal() {
                if (this.f28358dern == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f28357attabal == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                if (this.f28360wireman && TextUtils.isEmpty(this.f28359saneness)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new saneness(this.f28357attabal, this.f28359saneness, this.f28358dern, this.f28360wireman);
            }

            public attabal dern(String str) {
                this.f28359saneness = str;
                return this;
            }

            public attabal saneness(attabal attabalVar) {
                this.f28358dern = attabalVar;
                return this;
            }

            public attabal wireman(boolean z) {
                this.f28360wireman = z;
                return this;
            }
        }

        public saneness(Context context, String str, attabal attabalVar, boolean z) {
            this.f28354attabal = context;
            this.name = str;
            this.f28356saneness = attabalVar;
            this.f28355dern = z;
        }

        public static attabal attabal(Context context) {
            return new attabal(context);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    iconoclasm.saneness getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);

    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.java */
    public static abstract class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f28353attabal;

        public attabal(int i) {
            this.f28353attabal = i;
        }

        public final void attabal(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception unused) {
            }
        }

        public abstract void competently(iconoclasm.saneness sanenessVar, int i, int i2);

        public void dern(iconoclasm.saneness sanenessVar) {
            sanenessVar.getPath();
            if (!sanenessVar.isOpen()) {
                attabal(sanenessVar.getPath());
                return;
            }
            List<Pair<String, String>> listApical = null;
            try {
                try {
                    listApical = sanenessVar.apical();
                } finally {
                    if (listApical != null) {
                        Iterator<Pair<String, String>> it = listApical.iterator();
                        while (it.hasNext()) {
                            attabal((String) it.next().second);
                        }
                    } else {
                        attabal(sanenessVar.getPath());
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                sanenessVar.close();
            } catch (IOException unused2) {
            }
        }

        public abstract void marial(iconoclasm.saneness sanenessVar, int i, int i2);

        public abstract void wireman(iconoclasm.saneness sanenessVar);

        public void beachfront(iconoclasm.saneness sanenessVar) {
        }

        public void saneness(iconoclasm.saneness sanenessVar) {
        }
    }
}
