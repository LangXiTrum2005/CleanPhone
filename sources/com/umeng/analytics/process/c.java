package com.umeng.analytics.process;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f2611a;
    private ConcurrentHashMap<String, a> b = new ConcurrentHashMap<>();
    private Context c;

    private c() {
    }

    public static c a(Context context) {
        if (f2611a == null) {
            synchronized (c.class) {
                try {
                    if (f2611a == null) {
                        f2611a = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c cVar = f2611a;
        cVar.c = context;
        return cVar;
    }

    private a c(String str) {
        if (this.b.get(str) != null) {
            return this.b.get(str);
        }
        a aVarA = a.a(this.c, str);
        this.b.put(str, aVarA);
        return aVarA;
    }

    public synchronized void b(String str) {
        c(str).b();
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AtomicInteger f2612a = new AtomicInteger();
        private SQLiteOpenHelper b;
        private SQLiteDatabase c;

        private a() {
        }

        public static a a(Context context, String str) {
            Context appContext = UMGlobalContext.getAppContext(context);
            a aVar = new a();
            aVar.b = b.a(appContext, str);
            return aVar;
        }

        public synchronized void b() {
            try {
                if (this.f2612a.decrementAndGet() == 0) {
                    this.c.close();
                }
            } catch (Throwable unused) {
            }
        }

        public synchronized SQLiteDatabase a() {
            try {
                if (this.f2612a.incrementAndGet() == 1) {
                    this.c = this.b.getWritableDatabase();
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.c;
        }
    }

    public synchronized SQLiteDatabase a(String str) {
        return c(str).a();
    }
}
