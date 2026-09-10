package com.smartdigimkt.t1;

import android.content.Context;
import android.os.Handler;
import com.smartdigimkt.expressad.splash.js.SplashJsUtils;
import com.smartdigimkt.expressad.splash.view.ATSplashView;
import com.smartdigimkt.expressad.splash.view.ATSplashWebview;

/* JADX INFO: loaded from: classes6.dex */
public class f extends b {
    public f(Context context, String str, String str2) {
        super(context, str, str2);
    }

    @Override // com.smartdigimkt.t1.b
    public void b(com.smartdigimkt.x.d dVar, boolean z2, String str) {
        if (dVar != null) {
            try {
                dVar.P2();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        a(dVar, z2, str);
    }

    public void k() {
        ATSplashWebview splashWebview;
        Handler handler;
        this.r = false;
        if (this.k > 0 && (handler = this.f38619z) != null) {
            handler.removeMessages(1);
            this.f38619z.sendEmptyMessageDelayed(1, 1000L);
        }
        ATSplashView aTSplashView = this.f38610c;
        if (aTSplashView == null || (splashWebview = aTSplashView.getSplashWebview()) == null || splashWebview.isDestroyed()) {
            return;
        }
        SplashJsUtils.sendEventToH5(splashWebview, "onInstallAlertHide", "");
    }

    public void l() {
        ATSplashWebview splashWebview;
        Handler handler;
        this.r = true;
        if (this.k > 0 && (handler = this.f38619z) != null) {
            handler.removeMessages(1);
        }
        ATSplashView aTSplashView = this.f38610c;
        if (aTSplashView == null || (splashWebview = aTSplashView.getSplashWebview()) == null || splashWebview.isDestroyed()) {
            return;
        }
        SplashJsUtils.sendEventToH5(splashWebview, "onInstallAlertShow", "");
    }
}
