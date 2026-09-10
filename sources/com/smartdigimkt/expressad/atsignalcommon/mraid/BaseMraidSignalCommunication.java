package com.smartdigimkt.expressad.atsignalcommon.mraid;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.b.b;
import com.smartdigimkt.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.s4.a;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class BaseMraidSignalCommunication extends AbsFeedBackForH5 {
    private IMraidSignalCommunication m;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.smartdigimkt.n.j
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof IMraidSignalCommunication) {
                this.m = (IMraidSignalCommunication) context;
                return;
            }
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof IMraidSignalCommunication)) {
                this.m = (IMraidSignalCommunication) windVaneWebView.getObject();
            }
            if (windVaneWebView.getMraidObject() == null || !(windVaneWebView.getMraidObject() instanceof IMraidSignalCommunication)) {
                return;
            }
            this.m = (IMraidSignalCommunication) windVaneWebView.getMraidObject();
        } catch (Exception e2) {
            if (b.f33800a) {
                e2.printStackTrace();
            }
        }
    }

    public void open(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (obj instanceof com.smartdigimkt.n.b) {
            windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a;
            a.a().b(windVaneWebView, MRAIDPresenter.OPEN);
        } else {
            windVaneWebView = null;
        }
        try {
            String strOptString = new JSONObject(str).optString("url");
            if (this.m == null || TextUtils.isEmpty(strOptString)) {
                return;
            }
            if (windVaneWebView == null || System.currentTimeMillis() - windVaneWebView.lastTouchTime <= com.smartdigimkt.r.a.f37982e || !com.smartdigimkt.r.a.a(this.m.getMraidCampaign(), windVaneWebView.getUrl(), com.smartdigimkt.r.a.f37981c)) {
                this.m.open(strOptString);
            }
        } catch (Throwable unused) {
        }
    }
}
