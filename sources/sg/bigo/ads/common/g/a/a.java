package sg.bigo.ads.common.g.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.utils.t;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static c f47221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static AtomicBoolean f47222b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static SQLiteDatabase f47223c;

    /* JADX INFO: renamed from: sg.bigo.ads.common.g.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0840a {
        void a();

        void a(String str);
    }

    public static int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        b();
        SQLiteDatabase sQLiteDatabase = f47223c;
        if (sQLiteDatabase == null) {
            return 0;
        }
        try {
            return sQLiteDatabase.update(str, contentValues, str2, strArr);
        } catch (SQLException unused) {
            sg.bigo.ads.common.t.a.a(0, "DbHelper", "Failed: ".concat(String.valueOf(contentValues)));
            return 0;
        }
    }

    public static int b(String str, String str2, String[] strArr) {
        b();
        SQLiteDatabase sQLiteDatabase = f47223c;
        if (sQLiteDatabase == null) {
            return 0;
        }
        try {
            return sQLiteDatabase.delete(str, str2, strArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static long a(String str, ContentValues contentValues) {
        b();
        if (f47223c != null && !sg.bigo.ads.common.x.a.q()) {
            try {
                return f47223c.insert(str, null, contentValues);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public static long b(String str, ContentValues contentValues) {
        b();
        if (f47223c != null && !sg.bigo.ads.common.x.a.q()) {
            try {
                return f47223c.insertWithOnConflict(str, null, contentValues, 5);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public static Cursor a(String str, String str2, String[] strArr) {
        b();
        SQLiteDatabase sQLiteDatabase = f47223c;
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            return sQLiteDatabase.query(str, null, str2, strArr, null, null, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void b() {
        Runnable runnablePoll;
        c cVar = f47221a;
        if (cVar == null || f47222b.get()) {
            return;
        }
        while (true) {
            synchronized (cVar.f47229b) {
                runnablePoll = cVar.f47228a.poll();
            }
            if (runnablePoll == null) {
                return;
            } else {
                runnablePoll.run();
            }
        }
    }

    public static Cursor a(String str, String str2, String[] strArr, String str3, int i2) {
        b();
        SQLiteDatabase sQLiteDatabase = f47223c;
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            return sQLiteDatabase.query(str, null, str2, strArr, null, null, str3, Integer.toString(i2));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a() {
        t.a();
    }

    public static void a(Context context) {
        f47222b.set(false);
        f47221a = null;
        a(context, (InterfaceC0840a) null);
    }

    public static void a(Context context, String str) {
        File databasePath = context.getDatabasePath("bigo_ads_sdk.db");
        boolean zExists = databasePath.exists();
        boolean zIsFile = databasePath.isFile();
        boolean zCanRead = databasePath.canRead();
        boolean zCanWrite = databasePath.canWrite();
        boolean zCanExecute = databasePath.canExecute();
        boolean zIsHidden = databasePath.isHidden();
        sg.bigo.ads.common.t.a.a(0, "DbHelper", "exception path:" + databasePath.getPath() + " exists:" + zExists + " isfile:" + zIsFile + " read:" + zCanRead + " write:" + zCanWrite + " exec:" + zCanExecute + " hidden:" + zIsHidden + " errormsg:" + str);
        sg.bigo.ads.common.t.a.a(0, 3, "DbHelper", "deleteDatabase start");
        context.deleteDatabase("bigo_ads_sdk.db");
        b.a();
        sg.bigo.ads.common.t.a.a(0, 3, "DbHelper", "deleteDatabase end");
    }

    public static void a(final Context context, final InterfaceC0840a interfaceC0840a) {
        c cVar = new c();
        f47221a = cVar;
        c.a aVar = new c.a(new Runnable() { // from class: sg.bigo.ads.common.g.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.common.t.a.a(0, 3, "DbHelper", "init start");
                try {
                    a.f47223c = b.a(context).getWritableDatabase();
                } catch (Throwable th) {
                    a.a(context, Log.getStackTraceString(th));
                    try {
                        a.f47223c = b.a(context).getWritableDatabase();
                    } catch (Throwable th2) {
                        sg.bigo.ads.common.t.a.a(0, "DbHelper", "can't get db final," + th2.getMessage());
                        a.f47223c = null;
                    }
                }
                a.f47222b.set(true);
                a.f47221a = null;
                InterfaceC0840a interfaceC0840a2 = interfaceC0840a;
                if (interfaceC0840a2 != null) {
                    if (a.f47223c != null) {
                        interfaceC0840a2.a();
                    } else {
                        interfaceC0840a2.a("");
                    }
                }
                sg.bigo.ads.common.t.a.a(0, 3, "DbHelper", "init end");
            }
        });
        Runnable runnable = aVar.f47235b;
        synchronized (cVar.f47229b) {
            cVar.f47228a.add(runnable);
        }
        cVar.f47230c.execute(new Runnable() { // from class: sg.bigo.ads.common.g.a.c.1

            /* JADX INFO: renamed from: a */
            final /* synthetic */ a f47231a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Runnable f47232b;

            public AnonymousClass1() {
                aVar = aVar;
                runnable = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aVar.run();
                runnable.run();
                synchronized (c.this.f47229b) {
                    c.this.f47228a.remove(runnable);
                }
            }
        });
    }
}
