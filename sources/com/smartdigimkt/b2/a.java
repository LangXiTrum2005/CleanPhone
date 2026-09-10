package com.smartdigimkt.b2;

/* JADX INFO: loaded from: classes5.dex */
public class a implements com.smartdigimkt.e3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f33888a;

    public a(g gVar) {
        this.f33888a = gVar;
    }

    @Override // com.smartdigimkt.e3.a
    public void onAdClose(boolean z2, String str, float f) {
        g gVar = this.f33888a;
        if (gVar != null) {
            gVar.onAdClose(z2, str, f);
        }
    }

    @Override // com.smartdigimkt.e3.a
    public void onAdCloseWithIVReward(boolean z2, int i2) {
    }

    @Override // com.smartdigimkt.e3.a
    public void onAdShow() {
        g gVar = this.f33888a;
        if (gVar != null) {
            gVar.onAdShow();
        }
    }

    @Override // com.smartdigimkt.e3.a
    public void onEndcardShow() {
        g gVar = this.f33888a;
        if (gVar != null) {
            gVar.onEndcardShow();
        }
    }

    @Override // com.smartdigimkt.e3.a
    public void onLoadSuccess() {
        g gVar = this.f33888a;
        if (gVar != null) {
            gVar.onLoadSuccess();
        }
    }

    @Override // com.smartdigimkt.e3.a
    public void onShowFail(String str) {
        g gVar = this.f33888a;
        if (gVar != null) {
            gVar.onShowFail(str);
        }
    }

    @Override // com.smartdigimkt.e3.a
    public void onVideoAdClicked(com.smartdigimkt.x.d dVar) {
        g gVar = this.f33888a;
        if (gVar != null) {
            gVar.onVideoAdClicked(dVar);
        }
    }

    @Override // com.smartdigimkt.e3.a
    public void onVideoComplete() {
        g gVar = this.f33888a;
        if (gVar != null) {
            gVar.onVideoComplete();
        }
    }

    @Override // com.smartdigimkt.e3.a
    public void onVideoLoadFail(String str) {
        g gVar = this.f33888a;
        if (gVar != null) {
            gVar.onVideoLoadFail(str);
        }
    }

    @Override // com.smartdigimkt.e3.a
    public void onVideoLoadSuccess() {
        g gVar = this.f33888a;
        if (gVar != null) {
            gVar.onVideoLoadSuccess();
        }
    }
}
