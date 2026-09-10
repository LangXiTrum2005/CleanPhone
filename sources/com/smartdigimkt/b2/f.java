package com.smartdigimkt.b2;

import com.smartdigimkt.expressad.video.bt.module.ATTempContainer;

/* JADX INFO: loaded from: classes5.dex */
public class f extends ATTempContainer.i.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f33898c;

    public f(h hVar) {
        this.f33898c = hVar;
    }

    @Override // com.smartdigimkt.expressad.video.bt.module.ATTempContainer.i.a, com.smartdigimkt.expressad.video.bt.module.ATTempContainer.i
    public void a(String str) {
        super.a(str);
        h hVar = this.f33898c;
        if (hVar != null) {
            hVar.onShowFail(str);
        }
    }
}
