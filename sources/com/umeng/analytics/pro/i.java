package com.umeng.analytics.pro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
class i {
    private static SQLiteOpenHelper b;
    private static Context d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicInteger f2575a;
    private SQLiteDatabase c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final i f2576a = new i();

        private a() {
        }
    }

    public static i a(Context context) {
        if (d == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            d = applicationContext;
            b = h.a(applicationContext);
        }
        return a.f2576a;
    }

    public synchronized void b() {
        try {
            if (this.f2575a.decrementAndGet() == 0) {
                this.c.close();
            }
        } catch (Throwable unused) {
        }
    }

    private i() {
        this.f2575a = new AtomicInteger();
    }

    public synchronized SQLiteDatabase a() {
        try {
            if (this.f2575a.incrementAndGet() == 1) {
                this.c = b.getWritableDatabase();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }
}
