package com.smartdigimkt.expressad.atsignalcommon.mraid;

import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.d9;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.n.b;
import com.smartdigimkt.s4.a;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class MraidSignalCommunication extends BaseMraidSignalCommunication {
    protected static final String o = "MraidSignalCommunication";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IMraidSignalCommunication f34692n;

    public void close(Object obj, String str) {
        if (obj instanceof b) {
            a.a().b(((b) obj).f36886a, "close");
        }
        try {
            IMraidSignalCommunication iMraidSignalCommunication = this.f34692n;
            if (iMraidSignalCommunication != null) {
                iMraidSignalCommunication.close();
            }
        } catch (Throwable unused) {
        }
    }

    public void expand(Object obj, String str) {
        if (obj instanceof b) {
            a.a().b(((b) obj).f36886a, "expand");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            String strOptString2 = jSONObject.optString("shouldUseCustomClose");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || this.f34692n == null) {
                return;
            }
            this.f34692n.expand(strOptString, strOptString2.toLowerCase().equals(com.p004ironsource.mediationsdk.metadata.a.g));
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.smartdigimkt.expressad.atsignalcommon.mraid.BaseMraidSignalCommunication, com.smartdigimkt.n.j
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof IMraidSignalCommunication) {
                this.f34692n = (IMraidSignalCommunication) context;
                return;
            }
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof IMraidSignalCommunication)) {
                this.f34692n = (IMraidSignalCommunication) windVaneWebView.getObject();
            }
            if (windVaneWebView.getMraidObject() == null || !(windVaneWebView.getMraidObject() instanceof IMraidSignalCommunication)) {
                return;
            }
            this.f34692n = (IMraidSignalCommunication) windVaneWebView.getMraidObject();
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.mraid.BaseMraidSignalCommunication
    public void open(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (obj instanceof b) {
            b bVar = (b) obj;
            windVaneWebView = bVar.f36886a;
            a.a().b(bVar.f36886a, MRAIDPresenter.OPEN);
        } else {
            windVaneWebView = null;
        }
        try {
            String strOptString = new JSONObject(str).optString("url");
            if (this.f34692n == null || TextUtils.isEmpty(strOptString)) {
                return;
            }
            if (windVaneWebView == null || System.currentTimeMillis() - windVaneWebView.lastTouchTime <= com.smartdigimkt.r.a.f37982e || !com.smartdigimkt.r.a.a(this.f34692n.getMraidCampaign(), windVaneWebView.getUrl(), com.smartdigimkt.r.a.f37981c)) {
                this.f34692n.open(strOptString);
            }
        } catch (Throwable unused) {
        }
    }

    public void setOrientationProperties(Object obj, String str) {
        String str2;
        if (obj instanceof b) {
            a.a().b(((b) obj).f36886a, MRAIDPresenter.SET_ORIENTATION_PROPERTIES);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("allowOrientationChange");
            String strOptString2 = jSONObject.optString("forceOrientation");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || this.f34692n == null) {
                return;
            }
            strOptString.toLowerCase().equals(com.p004ironsource.mediationsdk.metadata.a.g);
            String lowerCase = strOptString2.toLowerCase();
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == 729267099) {
                str2 = d9.h.D;
            } else if (iHashCode != 1430647483) {
                return;
            } else {
                str2 = d9.h.C;
            }
            lowerCase.equals(str2);
        } catch (Throwable unused) {
        }
    }

    public void unload(Object obj, String str) {
        if (obj instanceof b) {
            a.a().b(((b) obj).f36886a, "unload");
        }
        try {
            IMraidSignalCommunication iMraidSignalCommunication = this.f34692n;
            if (iMraidSignalCommunication != null) {
                iMraidSignalCommunication.unload();
            }
        } catch (Throwable unused) {
        }
    }

    public void useCustomClose(Object obj, String str) {
        if (obj instanceof b) {
            a.a().b(((b) obj).f36886a, "useCustomClose");
        }
        try {
            String strOptString = new JSONObject(str).optString("shouldUseCustomClose");
            if (TextUtils.isEmpty(strOptString) || this.f34692n == null) {
                return;
            }
            this.f34692n.useCustomClose(strOptString.toLowerCase().equals(com.p004ironsource.mediationsdk.metadata.a.g));
        } catch (Throwable unused) {
        }
    }
}
