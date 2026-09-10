package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MraidSignalCommunication extends BaseMraidSignalCommunication {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f34875h = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f34876g;

    public void close(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.a().b(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        }
        try {
            q0.b("MraidSignalCommunication", "MRAID close");
            b bVar = this.f34876g;
            if (bVar != null) {
                bVar.close();
            }
        } catch (Throwable th2) {
            q0.b("MraidSignalCommunication", "MRAID close", th2);
        }
    }

    public void expand(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
            windVaneWebView = aVar.f34912b;
            a.a().b(aVar.f34912b, "expand");
        } else {
            windVaneWebView = null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            String strOptString2 = jSONObject.optString("shouldUseCustomClose");
            q0.b("MraidSignalCommunication", "MRAID expand " + strOptString + " " + strOptString2);
            if ((windVaneWebView != null && System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.mbridge.msdk.click.utils.a.f31780d && com.mbridge.msdk.click.utils.a.a(this.f34876g.getMraidCampaign(), windVaneWebView.getUrl(), com.mbridge.msdk.click.utils.a.f31779c)) || TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || this.f34876g == null) {
                return;
            }
            this.f34876g.expand(strOptString, strOptString2.toLowerCase().equals(com.ironsource.mediationsdk.metadata.a.f29610g));
        } catch (Throwable th2) {
            q0.b("MraidSignalCommunication", "MRAID expand", th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.g
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof b) {
                this.f34876g = (b) context;
                return;
            }
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof b)) {
                this.f34876g = (b) windVaneWebView.getObject();
            }
            if (windVaneWebView.getMraidObject() == null || !(windVaneWebView.getMraidObject() instanceof b)) {
                return;
            }
            this.f34876g = (b) windVaneWebView.getMraidObject();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void open(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
            windVaneWebView = aVar.f34912b;
            a.a().b(aVar.f34912b, "open");
        } else {
            windVaneWebView = null;
        }
        try {
            String strOptString = new JSONObject(str).optString("url");
            q0.b("MraidSignalCommunication", "MRAID Open " + strOptString);
            if (this.f34876g == null || TextUtils.isEmpty(strOptString)) {
                return;
            }
            if (windVaneWebView == null || System.currentTimeMillis() - windVaneWebView.lastTouchTime <= com.mbridge.msdk.click.utils.a.f31780d || !com.mbridge.msdk.click.utils.a.a(this.f34876g.getMraidCampaign(), windVaneWebView.getUrl(), com.mbridge.msdk.click.utils.a.f31777a)) {
                this.f34876g.open(strOptString);
            }
        } catch (Throwable th2) {
            q0.b("MraidSignalCommunication", "MRAID Open", th2);
        }
    }

    public void setOrientationProperties(Object obj, String str) {
        String str2;
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.a().b(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b, "setOrientationProperties");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("allowOrientationChange");
            String strOptString2 = jSONObject.optString("forceOrientation");
            q0.b("MraidSignalCommunication", "MRAID setOrientationProperties");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || this.f34876g == null) {
                return;
            }
            strOptString.toLowerCase().equals(com.ironsource.mediationsdk.metadata.a.f29610g);
            String lowerCase = strOptString2.toLowerCase();
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == 729267099) {
                str2 = X3.i.D;
            } else if (iHashCode != 1430647483) {
                return;
            } else {
                str2 = X3.i.C;
            }
            lowerCase.equals(str2);
        } catch (Throwable th2) {
            q0.b("MraidSignalCommunication", "MRAID setOrientationProperties", th2);
        }
    }

    public void unload(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.a().b(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b, "unload");
        }
        try {
            q0.b("MraidSignalCommunication", "MRAID unload");
            b bVar = this.f34876g;
            if (bVar != null) {
                bVar.unload();
            }
        } catch (Throwable th2) {
            q0.b("MraidSignalCommunication", "MRAID unload", th2);
        }
    }

    public void useCustomClose(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.a().b(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b, "useCustomClose");
        }
        try {
            String strOptString = new JSONObject(str).optString("shouldUseCustomClose");
            q0.b("MraidSignalCommunication", "MRAID useCustomClose " + strOptString);
            if (TextUtils.isEmpty(strOptString) || this.f34876g == null) {
                return;
            }
            this.f34876g.useCustomClose(strOptString.toLowerCase().equals(com.ironsource.mediationsdk.metadata.a.f29610g));
        } catch (Throwable th2) {
            q0.b("MraidSignalCommunication", "MRAID useCustomClose", th2);
        }
    }
}
