package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.UiModeManager;
import android.os.Build;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3855a;
    public final String b;
    public long c;
    public Im0 d;
    public Object e;
    public Enum f;

    public V2(String str, int i) {
        this.f3855a = i;
        if (i != 1) {
            k();
            this.b = str;
            this.d = new Im0(null);
        } else {
            k();
            this.b = str;
            this.d = new Im0(null);
        }
    }

    public final void a(float f) {
        String str = this.b;
        switch (this.f3855a) {
            case 0:
                G7.m.n(q(), "setDeviceVolume", Float.valueOf(f), str);
                break;
            default:
                C4003lv.b.a(q(), "setDeviceVolume", Float.valueOf(f), str);
                break;
        }
    }

    public final void b(WebView webView) {
        switch (this.f3855a) {
            case 0:
                this.d = new Im0(webView);
                break;
            default:
                this.d = new Im0(webView);
                break;
        }
    }

    public void c(Jm0 jm0, TN tn) {
        d(jm0, tn, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0060  */
    public final void d(Jm0 jm0, TN tn, JSONObject jSONObject) {
        int i;
        String str;
        String str2;
        List<C3632hh0> listUnmodifiableList;
        String str3;
        String str4;
        String str5 = jm0.h;
        JSONObject jSONObject2 = new JSONObject();
        In0.b(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        In0.b(jSONObject2, "adSessionType", (R2) tn.i);
        JSONObject jSONObject3 = new JSONObject();
        In0.b(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        In0.b(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        In0.b(jSONObject3, com.umeng.analytics.pro.bc.x, AnalyticsConstants.SDK_TYPE);
        In0.b(jSONObject2, "deviceInfo", jSONObject3);
        UiModeManager uiModeManager = WD.j;
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
        In0.b(jSONObject2, "deviceCategory", AbstractC5044xl.b(i));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        In0.b(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        Ig0 ig0 = (Ig0) tn.c;
        int i2 = ig0.f3232a;
        In0.b(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, ig0.b);
        Ig0 ig1 = (Ig0) tn.c;
        int i3 = ig1.f3232a;
        In0.b(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, ig1.c);
        In0.b(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        In0.b(jSONObject5, "libraryVersion", "1.5.2-Vungle");
        In0.b(jSONObject5, "appId", C4260oo0.c.f4809a.getApplicationContext().getPackageName());
        In0.b(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject5);
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
            In0.b(jSONObject2, "contentUrl", str4);
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
            In0.b(jSONObject2, "customReferenceData", str3);
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
        for (C3632hh0 c3632hh0 : listUnmodifiableList) {
            In0.b(jSONObject6, c3632hh0.f4464a, c3632hh0.c);
        }
        C4003lv.b.a(q(), "startSession", str5, jSONObject2, jSONObject6, jSONObject);
    }

    public void e(C3026an0 c3026an0, P2 p2) {
        f(c3026an0, p2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x005e  */
    public final void f(C3026an0 c3026an0, P2 p2, JSONObject jSONObject) {
        int i;
        String str = c3026an0.h;
        JSONObject jSONObject2 = new JSONObject();
        Gn0.b(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        Gn0.b(jSONObject2, "adSessionType", p2.h);
        JSONObject jSONObject3 = new JSONObject();
        Gn0.b(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        Gn0.b(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        Gn0.b(jSONObject3, com.umeng.analytics.pro.bc.x, AnalyticsConstants.SDK_TYPE);
        Gn0.b(jSONObject2, "deviceInfo", jSONObject3);
        UiModeManager uiModeManager = AbstractC2871Wx.k;
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
        Gn0.b(jSONObject2, "deviceCategory", AbstractC5044xl.a(i));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        Gn0.b(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        NT nt = p2.f3531a;
        Gn0.b(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, nt.f3458a);
        Gn0.b(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, nt.b);
        Gn0.b(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        Gn0.b(jSONObject5, "libraryVersion", "1.4.9-Unity3d");
        Gn0.b(jSONObject5, "appId", C4260oo0.b.f4809a.getApplicationContext().getPackageName());
        Gn0.b(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject5);
        String str2 = p2.g;
        if (str2 != null) {
            Gn0.b(jSONObject2, "contentUrl", str2);
        }
        String str3 = p2.f;
        if (str3 != null) {
            Gn0.b(jSONObject2, "customReferenceData", str3);
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = Collections.unmodifiableList(p2.c).iterator();
        if (it.hasNext()) {
            AbstractC3950lJ.z(it.next());
            throw null;
        }
        G7.m.n(q(), "startSession", str, jSONObject2, jSONObject6, jSONObject);
    }

    public final void g(String str, long j) {
        String str2 = this.b;
        switch (this.f3855a) {
            case 0:
                if (j >= this.c) {
                    U2 u2 = (U2) this.f;
                    U2 u3 = U2.c;
                    if (u2 != u3) {
                        this.f = u3;
                        G7.m.n(q(), "setNativeViewHierarchy", str, str2);
                    }
                }
                break;
            default:
                if (j >= this.c) {
                    T2 t2 = (T2) this.f;
                    T2 t3 = T2.c;
                    if (t2 != t3) {
                        this.f = t3;
                        C4003lv.b.a(q(), "setNativeViewHierarchy", str, str2);
                    }
                }
                break;
        }
    }

    public final void h(Date date) {
        switch (this.f3855a) {
            case 0:
                if (date != null) {
                    JSONObject jSONObject = new JSONObject();
                    Gn0.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
                    G7.m.n(q(), "setLastActivity", jSONObject);
                    break;
                }
                break;
            default:
                if (date != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    In0.b(jSONObject2, "timestamp", Long.valueOf(date.getTime()));
                    C4003lv.b.a(q(), "setLastActivity", jSONObject2);
                    break;
                }
                break;
        }
    }

    public final void i(boolean z) {
        String str = this.b;
        switch (this.f3855a) {
            case 0:
                if (n()) {
                    G7.m.n(q(), "setState", z ? "foregrounded" : "backgrounded", str);
                }
                break;
            default:
                if (n()) {
                    C4003lv.b.a(q(), "setState", z ? "foregrounded" : "backgrounded", str);
                }
                break;
        }
    }

    public final void j() {
        String str = this.b;
        switch (this.f3855a) {
            case 0:
                G7.m.n(q(), "publishLoadedEvent", null, str);
                break;
            default:
                C4003lv.b.a(q(), "publishLoadedEvent", null, str);
                break;
        }
    }

    public final void k() {
        switch (this.f3855a) {
            case 0:
                this.c = System.nanoTime();
                this.f = U2.f3807a;
                break;
            default:
                this.c = System.nanoTime();
                this.f = T2.f3748a;
                break;
        }
    }

    public final void l(String str, long j) {
        String str2 = this.b;
        switch (this.f3855a) {
            case 0:
                if (j >= this.c) {
                    this.f = U2.b;
                    G7.m.n(q(), "setNativeViewHierarchy", str, str2);
                }
                break;
            default:
                if (j >= this.c) {
                    this.f = T2.b;
                    C4003lv.b.a(q(), "setNativeViewHierarchy", str, str2);
                }
                break;
        }
    }

    public void m() {
        switch (this.f3855a) {
            case 0:
                this.d.clear();
                break;
            default:
                this.d.clear();
                break;
        }
    }

    public final boolean n() {
        switch (this.f3855a) {
            case 0:
                return this.d.get() != 0;
            default:
                return this.d.get() != 0;
        }
    }

    public final void o() {
        String str = this.b;
        switch (this.f3855a) {
            case 0:
                G7.m.n(q(), "finishSession", str);
                break;
            default:
                C4003lv.b.a(q(), "finishSession", str);
                break;
        }
    }

    public final void p() {
        String str = this.b;
        switch (this.f3855a) {
            case 0:
                G7.m.n(q(), "publishImpressionEvent", str);
                break;
            default:
                C4003lv.b.a(q(), "publishImpressionEvent", str);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView q() {
        switch (this.f3855a) {
            case 0:
                break;
        }
        return (WebView) this.d.get();
    }

    public void r() {
    }
}
