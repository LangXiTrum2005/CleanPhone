package com.smartdigimkt.sdk.basead.webtemplet.adformat.splash;

import com.smartdigimkt.j6.a;
import com.smartdigimkt.sdk.basead.webtemplet.WTWebView;
import com.smartdigimkt.sdk.basead.webtemplet.adformat.WTCommonJSBridgePlugin;

/* JADX INFO: loaded from: classes6.dex */
public class WTSplashJSBridgePlugin extends WTCommonJSBridgePlugin {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f38594e = getClass().getSimpleName();
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
