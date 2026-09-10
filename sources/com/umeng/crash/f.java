package com.umeng.crash;

import android.app.Application;
import android.content.Context;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
final class f {

    public interface a {
        void a(String str, OutputStream outputStream) throws IOException;

        void a(String str, String str2);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f2719a;
        boolean b;
        boolean c;
        boolean d;
        boolean e;
        boolean g;
        boolean h;
        boolean j;
        boolean l;
        boolean m;
        boolean q;
        boolean f = true;
        boolean i = true;
        boolean k = true;
        boolean n = true;
        boolean o = true;
        boolean p = true;
    }

    public static synchronized int a(Context context, b bVar) {
        if (context == null) {
            return -1;
        }
        try {
            com.umeng.crash.a.a().f2712a = bVar;
            if (bVar.b || bVar.g || bVar.l) {
                if (context instanceof Application) {
                    ((Application) context).registerActivityLifecycleCallbacks(e.a());
                }
            }
            if (bVar.b) {
                d dVarA = d.a();
                dVarA.f2717a = bVar;
                dVarA.b = Thread.getDefaultUncaughtExceptionHandler();
                try {
                    Thread.setDefaultUncaughtExceptionHandler(dVarA);
                } catch (Throwable th) {
                    UCrash.a().a("UCrash.Java", "setDefaultUncaughtExceptionHandler failed", th);
                }
            }
            return (bVar.g || bVar.l) ? i.a().a(bVar) : 0;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
