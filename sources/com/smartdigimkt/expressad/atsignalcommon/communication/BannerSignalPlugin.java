package com.smartdigimkt.expressad.atsignalcommon.communication;

import android.content.Context;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.j.c;

/* JADX INFO: loaded from: classes5.dex */
public class BannerSignalPlugin extends BaseBannerSignalPlugin {
    public void cai(Object obj, String str) {
        try {
            c cVar = this.g;
            if (cVar != null) {
                cVar.cai(obj, str);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.communication.BaseBannerSignalPlugin
    public void click(Object obj, String str) {
        try {
            c cVar = this.g;
            if (cVar != null) {
                cVar.click(obj, str);
            }
        } catch (Throwable unused) {
        }
    }

    public void gial(Object obj, String str) {
        try {
            c cVar = this.g;
            if (cVar != null) {
                cVar.gial(obj, str);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.communication.BaseBannerSignalPlugin, com.smartdigimkt.n.j
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
    }
}
