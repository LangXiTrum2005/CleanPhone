package com.apm.insight.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.e;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f10080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.apm.insight.e.a.b f10081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SQLiteDatabase f10082c;

    private a() {
    }

    public static a a() {
        if (f10080a == null) {
            synchronized (a.class) {
                try {
                    if (f10080a == null) {
                        f10080a = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10080a;
    }

    private void b() {
        if (this.f10081b == null) {
            a(e.g());
        }
    }

    public final synchronized void a(Context context) {
        try {
            this.f10082c = new b(context).getWritableDatabase();
        } catch (Throwable th) {
            com.apm.insight.a.b(th);
        }
        this.f10081b = new com.apm.insight.e.a.b();
    }

    public final synchronized void a(com.apm.insight.d.a aVar) {
        b();
        com.apm.insight.e.a.b bVar = this.f10081b;
        if (bVar != null) {
            bVar.a(this.f10082c, aVar);
        }
    }

    public final synchronized boolean a(String str) {
        b();
        com.apm.insight.e.a.b bVar = this.f10081b;
        if (bVar == null) {
            return false;
        }
        return bVar.a(this.f10082c, str);
    }
}
