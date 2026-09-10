package com.smartdigimkt.b2;

/* JADX INFO: loaded from: classes5.dex */
public class d extends c {
    private static final String f = "H5ShowRewardListener";
    private com.smartdigimkt.a2.b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f33893e;

    public d(com.smartdigimkt.a2.b bVar, String str) {
        this.d = bVar;
        this.f33893e = str;
    }

    @Override // com.smartdigimkt.b2.c, com.smartdigimkt.b2.h
    public void a(boolean z2, com.smartdigimkt.d3.c cVar) {
        com.smartdigimkt.a2.b bVar = this.d;
        if (bVar != null) {
            bVar.a(this.f33893e, z2, cVar);
        }
    }

    @Override // com.smartdigimkt.b2.c, com.smartdigimkt.b2.h
    public void onAdShow() {
        com.smartdigimkt.a2.b bVar = this.d;
        if (bVar != null) {
            bVar.d(this.f33893e);
        }
    }

    @Override // com.smartdigimkt.b2.c, com.smartdigimkt.b2.h
    public void onEndcardShow() {
        com.smartdigimkt.a2.b bVar = this.d;
        if (bVar != null) {
            bVar.a(this.f33893e);
        }
    }

    @Override // com.smartdigimkt.b2.c, com.smartdigimkt.b2.h
    public void onShowFail(String str) {
        com.smartdigimkt.a2.b bVar = this.d;
        if (bVar != null) {
            bVar.a(this.f33893e, str);
        }
    }

    @Override // com.smartdigimkt.b2.c, com.smartdigimkt.b2.h
    public void onVideoAdClicked(com.smartdigimkt.x.d dVar) {
        com.smartdigimkt.a2.b bVar = this.d;
        if (bVar != null) {
            bVar.a(this.f33893e, dVar);
        }
    }

    @Override // com.smartdigimkt.b2.c, com.smartdigimkt.b2.h
    public void onVideoComplete() {
        com.smartdigimkt.a2.b bVar = this.d;
        if (bVar != null) {
            bVar.b(this.f33893e);
        }
    }
}
