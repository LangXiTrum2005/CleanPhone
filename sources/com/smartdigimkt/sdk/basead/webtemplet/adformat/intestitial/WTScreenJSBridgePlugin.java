package com.smartdigimkt.sdk.basead.webtemplet.adformat.intestitial;

import com.smartdigimkt.i6.a;
import com.smartdigimkt.sdk.basead.webtemplet.WTWebView;
import com.smartdigimkt.sdk.basead.webtemplet.adformat.WTCommonJSBridgePlugin;

/* JADX INFO: loaded from: classes6.dex */
public class WTScreenJSBridgePlugin extends WTCommonJSBridgePlugin {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f38593e = getClass().getSimpleName();
    private a f;

    @Override // com.smartdigimkt.sdk.basead.webtemplet.adformat.WTCommonJSBridgePlugin, com.smartdigimkt.g6.d
    public void initialize(WTWebView wTWebView) {
        super.initialize(wTWebView);
        try {
            if (wTWebView.getJsCommunicationObject() == null || !(wTWebView.getJsCommunicationObject() instanceof a)) {
                return;
            }
            this.f = (a) wTWebView.getJsCommunicationObject();
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
