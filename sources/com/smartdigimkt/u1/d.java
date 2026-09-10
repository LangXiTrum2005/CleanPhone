package com.smartdigimkt.u1;

import android.text.TextUtils;
import com.smartdigimkt.f1.e;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public class d implements com.smartdigimkt.s1.d {
    private static final String f = "SplashShowListenerImpl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f38786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.x.d f38787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38788c;
    private c d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f38789e = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.onShowFailed("show timeout!");
        }
    }

    public d(c cVar, e eVar, double d, com.smartdigimkt.x.d dVar) {
        this.d = cVar;
        this.f38786a = eVar;
        this.f38787b = dVar;
        this.f38788c = a(d, dVar);
    }

    public void a(int i2, int i3, int i4) {
        e eVar = this.f38786a;
        if (eVar != null) {
            eVar.onZoomOutPlayStart();
        }
    }

    public void b() {
        com.smartdigimkt.l7.b.a().b(this.f38789e, 10000L);
    }

    @Override // com.smartdigimkt.s1.d
    public void onAdClicked(com.smartdigimkt.x.d dVar) {
        e eVar = this.f38786a;
        if (eVar == null || this.f38788c) {
            return;
        }
        eVar.onAdClicked(dVar);
    }

    @Override // com.smartdigimkt.s1.d
    public void onAdTick(long j) {
        e eVar = this.f38786a;
        if (eVar != null) {
            eVar.onAdTick(j);
        }
    }

    @Override // com.smartdigimkt.s1.d
    public void onDismiss(int i2) {
        if (i2 != 1 && i2 != 2 && i2 != 6 && i2 != 11) {
            i2 = -999;
        }
        e eVar = this.f38786a;
        if (eVar != null) {
            eVar.onDismiss(i2);
        }
        c cVar = this.d;
        if (cVar != null) {
            cVar.z0 = false;
        }
    }

    @Override // com.smartdigimkt.s1.d
    public void onShowFailed(String str) {
        c cVar = this.d;
        if (cVar != null) {
            cVar.z0 = false;
        }
        e eVar = this.f38786a;
        if (eVar != null) {
            eVar.onShowFailed(str);
        }
    }

    @Override // com.smartdigimkt.s1.d
    public void onShowSuccessed() {
        if (this.f38789e != null) {
            com.smartdigimkt.l7.b.a().a(this.f38789e);
        }
        c cVar = this.d;
        if (cVar != null) {
            cVar.z0 = true;
        }
        cVar.e();
        this.d.f();
        this.d.d();
        e eVar = this.f38786a;
        if (eVar == null || this.f38788c) {
            return;
        }
        eVar.onShowSuccessed();
    }

    public void a(int i2, int i3) {
        e eVar = this.f38786a;
        if (eVar != null) {
            eVar.onZoomOutPlayFinish();
        }
    }

    public void a() {
        if (this.f38786a != null) {
            this.f38786a = null;
        }
    }

    private boolean a(double d, com.smartdigimkt.x.d dVar) {
        long jG0;
        long jF0;
        com.smartdigimkt.n1.a aVarC;
        try {
            String strA = com.smartdigimkt.u.a.f().a();
            if (TextUtils.isEmpty(strA) || (aVarC = com.smartdigimkt.n1.b.b().c(strA)) == null) {
                jG0 = 0;
                jF0 = 0;
            } else {
                jG0 = aVarC.G0() * 1000;
                jF0 = aVarC.F0() * 1000;
            }
            if (dVar != null) {
                if (dVar.a(jF0, jG0)) {
                    dVar.k0(1);
                    return true;
                }
                dVar.k0(0);
            }
            return (dVar == null || dVar.D2() || d == 1.0d || new Random().nextDouble() <= d) ? false : true;
        } catch (Exception unused) {
        }
    }
}
