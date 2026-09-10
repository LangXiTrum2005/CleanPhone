package com.smartdigimkt.u;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.smartdigimkt.v0.n;
import com.smartdigimkt.v0.t;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class b {
    private static final String m = "SDKController";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile b f38766n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f38767a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f38770e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f38773l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38768b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38769c = "";
    private boolean d = false;
    public final int f = 1;
    public final int g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f38771h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f38772i = 4;
    public final int j = 5;
    public final int k = 6;

    public class a implements Runnable {
        final /* synthetic */ Context X;

        public a(Context context) {
            this.X = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.e(this.X);
        }
    }

    private b() {
    }

    public static b a() {
        if (f38766n == null) {
            synchronized (b.class) {
                try {
                    if (f38766n == null) {
                        f38766n = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38766n;
    }

    private void d() {
        com.smartdigimkt.u.a.f().b(this.f38768b);
        com.smartdigimkt.u.a.f().c(this.f38769c);
        com.smartdigimkt.u.a.f().j();
    }

    public String b() {
        return com.smartdigimkt.f1.b.f34972a;
    }

    public void c() {
        d();
        a(this.f38767a.getApplicationContext());
        t.c(this.f38767a);
        this.d = true;
    }

    public void e() {
    }

    public void a(Map map, Context context) {
        if (context != null) {
            this.f38767a = context.getApplicationContext();
            com.smartdigimkt.u.a.f().b(this.f38767a);
            try {
                com.smartdigimkt.h0.n.a(this.f38767a);
            } catch (Exception unused) {
            }
            com.smartdigimkt.l7.b.a().b((Runnable) new a(context), 300L);
            if (map != null) {
                if (map.containsKey(com.smartdigimkt.b.b.d)) {
                    this.f38768b = (String) map.get(com.smartdigimkt.b.b.d);
                }
                if (map.containsKey(com.smartdigimkt.b.b.f33806e)) {
                    this.f38769c = (String) map.get(com.smartdigimkt.b.b.f33806e);
                }
                c();
            }
        }
    }

    private void a(Context context) {
        String string;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("exc_log", 0);
            String string2 = "";
            if (sharedPreferences != null) {
                string = sharedPreferences.getString("exc_sys", "");
                string2 = sharedPreferences.getString("exc_bk", "");
            } else {
                string = "";
            }
            if (TextUtils.isEmpty(com.smartdigimkt.b0.a.s2) && TextUtils.isEmpty(com.smartdigimkt.b0.a.t2)) {
                com.smartdigimkt.b0.a.s2 = string;
                com.smartdigimkt.b0.a.t2 = string2;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
