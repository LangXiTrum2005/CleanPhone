package com.mbridge.msdk.advanced.view;

import android.content.Context;
import android.content.IntentFilter;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.advanced.common.NetWorkStateReceiver;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBNativeAdvancedWebview extends WindVaneWebView {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f31591t = "MBNativeAdvancedWebview";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AdSession f31592r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private NetWorkStateReceiver f31593s;

    public MBNativeAdvancedWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void finishAdSession() {
        try {
            AdSession adSession = this.f31592r;
            if (adSession != null) {
                adSession.finish();
                this.f31592r = null;
                q0.a("OMSDK", "finish adSession");
            }
        } catch (Exception e10) {
            q0.a("OMSDK", e10.getMessage());
        }
    }

    public AdSession getAdSession() {
        return this.f31592r;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        registerNetWorkReceiver();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        unregisterNetWorkReceiver();
    }

    public void registerNetWorkReceiver() {
        try {
            if (this.f31593s == null) {
                this.f31593s = new NetWorkStateReceiver(this);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            getContext().registerReceiver(this.f31593s, intentFilter);
        } catch (Throwable th2) {
            q0.a(f31591t, th2.getMessage());
        }
    }

    public void setAdSession(AdSession adSession) {
        this.f31592r = adSession;
    }

    public void unregisterNetWorkReceiver() {
        try {
            NetWorkStateReceiver netWorkStateReceiver = this.f31593s;
            if (netWorkStateReceiver != null) {
                netWorkStateReceiver.a();
                getContext().unregisterReceiver(this.f31593s);
            }
        } catch (Throwable th2) {
            q0.a(f31591t, th2.getMessage());
        }
    }
}
