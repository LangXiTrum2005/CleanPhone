package com.smartdigimkt.b2;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public class e extends c {
    private static final String m = "ProxyShowRewardListener";
    private h d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.smartdigimkt.f3.d f33894e;
    private String f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f33895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Context f33896i;
    private boolean j = false;
    private boolean k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f33897l = false;

    public e(Context context, boolean z2, com.smartdigimkt.f3.d dVar, com.smartdigimkt.x.d dVar2, h hVar, String str, String str2) {
        this.d = hVar;
        this.f33894e = dVar;
        this.f = str2;
        this.g = str;
        this.f33895h = z2;
        this.f33896i = context;
        a(dVar, dVar2);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    private void a(com.smartdigimkt.f3.d dVar, com.smartdigimkt.x.d dVar2) {
        long jG0;
        try {
            String strA = com.smartdigimkt.u.a.f().a();
            if (TextUtils.isEmpty(strA)) {
                jG0 = 0;
            } else {
                com.smartdigimkt.n1.a aVarC = com.smartdigimkt.n1.b.b().c(strA);
                if (aVarC == null) {
                    aVarC = com.smartdigimkt.n1.b.b().a();
                }
                if (aVarC != null) {
                    jG0 = aVarC.G0() * 1000;
                } else {
                    jG0 = 0;
                }
            }
            com.smartdigimkt.f3.a aVarC2 = com.smartdigimkt.f3.c.b().c();
            long jF = aVarC2 != null ? aVarC2.f() : 0L;
            if (dVar2 != null) {
                if (!dVar2.a(jF, jG0)) {
                    dVar2.k0(0);
                    dVar2.v(0);
                    return;
                }
                dVar2.k0(1);
                if (dVar.P() == 1) {
                    dVar2.v(1);
                } else {
                    dVar2.v(0);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.smartdigimkt.b2.c, com.smartdigimkt.b2.h
    public void onAdCloseWithIVReward(boolean z2, int i2) {
        super.onAdCloseWithIVReward(z2, i2);
        h hVar = this.d;
        if (hVar == null || this.f33897l) {
            return;
        }
        hVar.onAdCloseWithIVReward(z2, i2);
    }

    @Override // com.smartdigimkt.b2.c, com.smartdigimkt.b2.h
    public void onAdShow() {
        super.onAdShow();
        h hVar = this.d;
        if (hVar == null || this.j) {
            return;
        }
        this.j = true;
        hVar.onAdShow();
    }

    @Override // com.smartdigimkt.b2.c, com.smartdigimkt.b2.h
    public void onEndcardShow() {
        super.onEndcardShow();
        h hVar = this.d;
        if (hVar != null) {
            hVar.onEndcardShow();
        }
    }

    @Override // com.smartdigimkt.b2.c, com.smartdigimkt.b2.h
    public void onShowFail(String str) {
        super.onShowFail(str);
        h hVar = this.d;
        if (hVar == null || this.k) {
            return;
        }
        this.k = true;
        hVar.onShowFail(str);
    }

    @Override // com.smartdigimkt.b2.c, com.smartdigimkt.b2.h
    public void onVideoAdClicked(com.smartdigimkt.x.d dVar) {
        super.onVideoAdClicked(dVar);
        h hVar = this.d;
        if (hVar != null) {
            hVar.onVideoAdClicked(dVar);
        }
    }

    @Override // com.smartdigimkt.b2.c, com.smartdigimkt.b2.h
    public void onVideoComplete() {
        super.onVideoComplete();
        h hVar = this.d;
        if (hVar != null) {
            hVar.onVideoComplete();
        }
    }

    @Override // com.smartdigimkt.b2.c, com.smartdigimkt.b2.h
    public void a(boolean z2, com.smartdigimkt.d3.c cVar) {
        super.a(z2, cVar);
        h hVar = this.d;
        if (hVar == null || this.f33897l) {
            return;
        }
        this.f33897l = true;
        hVar.a(z2, cVar);
    }
}
