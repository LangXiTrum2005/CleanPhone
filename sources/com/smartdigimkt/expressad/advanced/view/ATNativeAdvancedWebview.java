package com.smartdigimkt.expressad.advanced.view;

import android.content.Context;
import android.content.IntentFilter;
import com.smartdigimkt.c.d;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;

/* JADX INFO: loaded from: classes5.dex */
public class ATNativeAdvancedWebview extends WindVaneWebView {
    private static final String x0 = "ATNativeAdvancedWebview";
    private d w0;

    public ATNativeAdvancedWebview(Context context) {
        super(context);
        setBackgroundColor(0);
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
            if (this.w0 == null) {
                this.w0 = new d(this);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            getContext().registerReceiver(this.w0, intentFilter);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void unregisterNetWorkReceiver() {
        try {
            d dVar = this.w0;
            if (dVar != null) {
                dVar.a();
                getContext().unregisterReceiver(this.w0);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
