package com.smartdigimkt.f;

import com.smartdigimkt.f1.p;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public class d implements com.smartdigimkt.d.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final String f34954e = "NativeAdvancedShowListenerImpl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected p f34955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected com.smartdigimkt.x.d f34956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34957c;
    protected c d;

    public d(c cVar, p pVar, double d, com.smartdigimkt.x.d dVar) {
        this.d = cVar;
        this.f34955a = pVar;
        this.f34956b = dVar;
        this.f34957c = a(d, dVar);
    }

    public void a() {
        if (this.f34955a != null) {
            this.f34955a = null;
        }
    }

    @Override // com.smartdigimkt.d.b
    public void closeFullScreen() {
        p pVar = this.f34955a;
        if (pVar != null) {
            pVar.closeFullScreen();
        }
    }

    @Override // com.smartdigimkt.d.b
    public void onAdClicked(com.smartdigimkt.x.d dVar) {
        p pVar = this.f34955a;
        if (pVar == null || this.f34957c) {
            return;
        }
        pVar.onClick(dVar);
    }

    @Override // com.smartdigimkt.d.b
    public void onClose() {
        p pVar = this.f34955a;
        if (pVar != null) {
            pVar.onClose();
            c cVar = this.d;
            if (cVar != null) {
                cVar.D0 = false;
            }
        }
    }

    @Override // com.smartdigimkt.d.b
    public void onLeaveApp() {
        p pVar = this.f34955a;
        if (pVar != null) {
            pVar.onLeaveApp();
        }
    }

    @Override // com.smartdigimkt.d.b
    public void onShowFailed(String str) {
    }

    @Override // com.smartdigimkt.d.b
    public void onShowSuccessed() {
        c cVar = this.d;
        if (cVar != null) {
            cVar.D0 = true;
        }
        cVar.g();
        p pVar = this.f34955a;
        if (pVar == null || this.f34957c) {
            return;
        }
        pVar.onLogImpression();
    }

    @Override // com.smartdigimkt.d.b
    public void showFullScreen() {
        p pVar = this.f34955a;
        if (pVar != null) {
            pVar.showFullScreen();
        }
    }

    private boolean a(double d, com.smartdigimkt.x.d dVar) {
        long jG0;
        long jF0;
        try {
            com.smartdigimkt.n1.a aVarA = com.smartdigimkt.n1.b.b().a();
            if (aVarA != null) {
                jG0 = aVarA.G0() * 1000;
                jF0 = aVarA.F0() * 1000;
            } else {
                jG0 = 0;
                jF0 = 0;
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
