package com.smartdigimkt.basead.oversea_plugin.bridge;

import android.content.Context;
import android.webkit.WebView;
import com.iab.omid.library.toponad.Omid;
import com.smartdigimkt.a.d;
import com.smartdigimkt.k5.b;
import com.smartdigimkt.sdk.api.business.omsdk.IOmsdkHandler;
import com.smartdigimkt.v6.a;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes5.dex */
public class OmsdkHandler implements IOmsdkHandler {
    private final String TAG = "OmsdkHandler";
    Boolean checkSupportOMSdk = null;

    @Override // com.smartdigimkt.sdk.api.business.omsdk.IOmsdkHandler
    public b createNativeAdSession(Context context, boolean z2, f fVar, a aVar) {
        if (supportOmsdk()) {
            return d.a(context, z2, fVar, aVar);
        }
        return null;
    }

    @Override // com.smartdigimkt.sdk.api.business.omsdk.IOmsdkHandler
    public b createWebViewAdSession(Context context, WebView webView, f fVar, a aVar) {
        if (supportOmsdk()) {
            return d.a(context, webView, fVar, aVar);
        }
        return null;
    }

    @Override // com.smartdigimkt.sdk.api.business.omsdk.IOmsdkHandler
    public String getOmsdkVersion() {
        try {
            return Omid.getVersion();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.smartdigimkt.sdk.api.business.omsdk.IOmsdkHandler
    public String injectScriptContentIntoHtml(String str, f fVar, a aVar) {
        return !supportOmsdk() ? str : d.a(str, fVar, aVar);
    }

    @Override // com.smartdigimkt.sdk.api.business.omsdk.IOmsdkHandler
    public boolean supportOmsdk() {
        Boolean bool = this.checkSupportOMSdk;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Omid.getVersion();
            this.checkSupportOMSdk = Boolean.TRUE;
        } catch (Throwable th) {
            th.getMessage();
            this.checkSupportOMSdk = Boolean.FALSE;
        }
        return this.checkSupportOMSdk.booleanValue();
    }
}
