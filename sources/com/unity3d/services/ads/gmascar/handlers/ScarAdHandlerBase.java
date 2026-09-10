package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.b;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.misc.IEventListener;
import ph.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ScarAdHandlerBase implements d {
    protected final EventSubject<b> _eventSubject;
    protected final GMAEventSender _gmaEventSender;
    protected final c _scarAdMetadata;

    public ScarAdHandlerBase(c cVar, EventSubject<b> eventSubject, GMAEventSender gMAEventSender) {
        this._scarAdMetadata = cVar;
        this._eventSubject = eventSubject;
        this._gmaEventSender = gMAEventSender;
    }

    @Override // com.unity3d.scar.adapter.common.d
    public void onAdClicked() {
        this._gmaEventSender.send(b.A, new Object[0]);
    }

    @Override // com.unity3d.scar.adapter.common.d
    public void onAdClosed() {
        this._gmaEventSender.send(b.D, new Object[0]);
        this._eventSubject.unsubscribe();
    }

    @Override // com.unity3d.scar.adapter.common.d
    public void onAdFailedToLoad(int i10, String str) {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        c cVar = this._scarAdMetadata;
        gMAEventSender.send(b.f38570o, cVar.f48371a, cVar.f48372b, str, Integer.valueOf(i10));
    }

    @Override // com.unity3d.scar.adapter.common.d
    public void onAdLoaded() {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        c cVar = this._scarAdMetadata;
        gMAEventSender.send(b.f38567k, cVar.f48371a, cVar.f48372b);
    }

    @Override // com.unity3d.scar.adapter.common.d
    public void onAdOpened() {
        this._gmaEventSender.send(b.f38572q, new Object[0]);
        this._eventSubject.subscribe(new IEventListener<b>() { // from class: com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase.1
            @Override // com.unity3d.services.core.misc.IEventListener
            public void onNextEvent(b bVar) {
                ScarAdHandlerBase.this._gmaEventSender.send(bVar, new Object[0]);
            }
        });
    }
}
