package com.mbridge.msdk.splash.view;

import android.content.Context;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBSplashWebview extends WindVaneWebView {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f36065r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private AdSession f36066s;

    public MBSplashWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void finishAdSession() {
        try {
            AdSession adSession = this.f36066s;
            if (adSession != null) {
                adSession.finish();
                this.f36066s = null;
                q0.a("OMSDK", "finish adSession");
            }
        } catch (Exception e10) {
            q0.a("OMSDK", e10.getMessage());
        }
    }

    public AdSession getAdSession() {
        return this.f36066s;
    }

    public String getRequestId() {
        return this.f36065r;
    }

    public void setAdSession(AdSession adSession) {
        this.f36066s = adSession;
    }

    public void setRequestId(String str) {
        this.f36065r = str;
    }
}
