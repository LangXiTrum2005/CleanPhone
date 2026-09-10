package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.b;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import qh.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class SignalsHandler implements a {
    private GMAEventSender _gmaEventSender;

    public SignalsHandler(GMAEventSender gMAEventSender) {
        this._gmaEventSender = gMAEventSender;
    }

    @Override // qh.a
    public void onSignalsCollected(String str) {
        this._gmaEventSender.send(b.f38564h, str);
    }

    @Override // qh.a
    public void onSignalsCollectionFailed(String str) {
        this._gmaEventSender.send(b.f38565i, str);
    }
}
