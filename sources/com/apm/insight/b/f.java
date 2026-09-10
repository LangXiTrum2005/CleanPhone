package com.apm.insight.b;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f f10011a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static g f10012c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f10013b;

    private f(Context context) {
        this.f10013b = new b(context);
        g gVar = new g();
        f10012c = gVar;
        gVar.a();
    }

    public static f a(Context context) {
        if (f10011a == null) {
            synchronized (f.class) {
                try {
                    if (f10011a == null) {
                        f10011a = new f(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10011a;
    }

    public static g b() {
        return f10012c;
    }

    public final void c() {
        this.f10013b.a();
    }

    public final void d() {
        this.f10013b.b();
    }

    public final b a() {
        return this.f10013b;
    }
}
