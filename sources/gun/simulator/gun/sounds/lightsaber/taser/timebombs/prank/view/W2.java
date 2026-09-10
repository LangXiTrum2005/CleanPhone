package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.UiModeManager;
import android.os.Build;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class W2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3906a;
    public C4363q1 c;
    public VN d;
    public long f = System.nanoTime();
    public int e = 1;
    public Im0 b = new Im0(null);

    public W2(String str) {
        this.f3906a = str;
    }

    public void a(C3203cn0 c3203cn0, TN tn) {
        b(c3203cn0, tn, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0060  */
    public final void b(C3203cn0 c3203cn0, TN tn, JSONObject jSONObject) {
        int i;
        String str;
        String str2;
        List<C3719ih0> listUnmodifiableList;
        String str3;
        String str4;
        String str5 = c3203cn0.h;
        JSONObject jSONObject2 = new JSONObject();
        En0.b(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        En0.b(jSONObject2, "adSessionType", (S2) tn.i);
        JSONObject jSONObject3 = new JSONObject();
        En0.b(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        En0.b(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        En0.b(jSONObject3, com.umeng.analytics.pro.bc.x, AnalyticsConstants.SDK_TYPE);
        En0.b(jSONObject2, "deviceInfo", jSONObject3);
        UiModeManager uiModeManager = AbstractC2995aW.e;
        if (uiModeManager == null) {
            i = 3;
        } else {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType == 1) {
                i = 2;
            } else if (currentModeType != 4) {
                i = 3;
            } else {
                i = 1;
            }
        }
        En0.b(jSONObject2, "deviceCategory", AbstractC5044xl.c(i));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        En0.b(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        Ig0 ig0 = (Ig0) tn.c;
        int i2 = ig0.f3232a;
        En0.b(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, ig0.b);
        Ig0 ig1 = (Ig0) tn.c;
        int i3 = ig1.f3232a;
        En0.b(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, ig1.c);
        En0.b(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        En0.b(jSONObject5, "libraryVersion", "1.4.13-Mmadbridge");
        En0.b(jSONObject5, "appId", C4260oo0.d.f4809a.getApplicationContext().getPackageName());
        En0.b(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject5);
        int i4 = tn.f3770a;
        switch (i4) {
            case 1:
                str = (String) tn.h;
                break;
            default:
                str = (String) tn.h;
                break;
        }
        if (str != null) {
            switch (i4) {
                case 1:
                    str4 = (String) tn.h;
                    break;
                default:
                    str4 = (String) tn.h;
                    break;
            }
            En0.b(jSONObject2, "contentUrl", str4);
        }
        switch (i4) {
            case 1:
                str2 = (String) tn.g;
                break;
            default:
                str2 = (String) tn.g;
                break;
        }
        if (str2 != null) {
            switch (i4) {
                case 1:
                    str3 = (String) tn.g;
                    break;
                default:
                    str3 = (String) tn.g;
                    break;
            }
            En0.b(jSONObject2, "customReferenceData", str3);
        }
        JSONObject jSONObject6 = new JSONObject();
        switch (i4) {
            case 1:
                listUnmodifiableList = Collections.unmodifiableList((List) tn.e);
                break;
            default:
                listUnmodifiableList = Collections.unmodifiableList((List) tn.e);
                break;
        }
        for (C3719ih0 c3719ih0 : listUnmodifiableList) {
            En0.b(jSONObject6, c3719ih0.f4515a, c3719ih0.c);
        }
        CD.b.a(f(), "startSession", str5, jSONObject2, jSONObject6, jSONObject);
    }

    public final void c(String str, JSONObject jSONObject) {
        CD.b.a(f(), "publishMediaEvent", str, jSONObject, this.f3906a);
    }

    public final void d(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        En0.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        CD.b.a(f(), "setLastActivity", jSONObject);
    }

    public void e() {
        this.b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView f() {
        return (WebView) this.b.get();
    }

    public void g() {
    }
}
