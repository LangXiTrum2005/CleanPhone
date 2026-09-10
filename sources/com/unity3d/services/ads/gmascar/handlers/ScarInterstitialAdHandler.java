package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.b;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import ph.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class ScarInterstitialAdHandler extends ScarAdHandlerBase {
    public ScarInterstitialAdHandler(c cVar, EventSubject<b> eventSubject, GMAEventSender gMAEventSender) {
        super(cVar, eventSubject, gMAEventSender);
    }

    @Override // com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase, com.unity3d.scar.adapter.common.d
    public void onAdClosed() {
        if (!this._eventSubject.eventQueueIsEmpty()) {
            onAdSkipped();
        }
        super.onAdClosed();
    }

    public void onAdFailedToShow(int i10, String str) {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        c cVar = this._scarAdMetadata;
        gMAEventSender.send(b.f38576u, cVar.f48371a, cVar.f48372b, str, Integer.valueOf(i10));
    }

    public void onAdImpression() {
        this._gmaEventSender.send(b.l, new Object[0]);
    }

    public void onAdLeftApplication() {
        this._gmaEventSender.send(b.C, new Object[0]);
    }

    public void onAdSkipped() {
        this._gmaEventSender.send(b.B, new Object[0]);
    }
}
