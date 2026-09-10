package com.smartdigimkt.s6;

import android.content.Context;
import com.smartdigimkt.n8.p;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class d {
    private static volatile d f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f38212c;
    int d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38210a = "d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f38211b = -100;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<Integer, Boolean> f38213e = new ConcurrentHashMap<>(5);

    private d(Context context) {
        this.d = 2;
        if (context != null) {
            this.f38212c = context.getApplicationContext();
        }
        this.d = p.a(this.f38212c, "sdm_sdk", "UPLOAD_DATA_LEVEL", 2);
    }

    public static d a(Context context) {
        if (f == null) {
            synchronized (d.class) {
                try {
                    if (f == null) {
                        f = new d(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public int b() {
        return this.d;
    }

    public boolean c() {
        return p.a(this.f38212c, "sdm_sdk", "EU_INFO", -100) == 1;
    }

    public boolean d() {
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        if (aVarB == null || aVarB.M0()) {
            return this.d != 1;
        }
        if (this.d == 2) {
            return aVarB.O() == 0;
        }
        if (aVarB.R() == 1) {
            return aVarB.Q() == 0;
        }
        return this.d == 0 || aVarB.O() == 0;
    }

    public void a(int i2) {
        this.d = i2;
        p.b(this.f38212c, "sdm_sdk", "UPLOAD_DATA_LEVEL", i2);
    }

    public boolean a() {
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        if (aVarB == null || aVarB.M0()) {
            return this.d != 1;
        }
        if (aVarB.O() == 0) {
            return true;
        }
        int iQ = this.d;
        if (aVarB.R() == 1) {
            iQ = aVarB.Q();
        }
        return iQ == 0;
    }
}
