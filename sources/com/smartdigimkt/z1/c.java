package com.smartdigimkt.z1;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.d9;
import com.p004ironsource.vc;
import com.smartdigimkt.c0.f;
import com.smartdigimkt.c3.i;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.expressad.video.bt.module.ATTempContainer;
import com.smartdigimkt.expressad.video.bt.module.AnythinkBTContainer;
import com.smartdigimkt.expressad.video.bt.module.AnythinkBTLayout;
import com.smartdigimkt.expressad.video.bt.module.AnythinkBTNativeEC;
import com.smartdigimkt.expressad.video.bt.module.AnythinkBTVideoView;
import com.smartdigimkt.expressad.video.bt.module.AnythinkBTWebView;
import com.smartdigimkt.expressad.video.bt.module.BTBaseView;
import com.smartdigimkt.n.h;
import com.smartdigimkt.p6.o;
import com.smartdigimkt.v0.u;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.x.d;
import com.smartdigimkt.z2.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f40309a = "OperateViews";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f40314i = -999;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f40316n;
    private static int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f40317p;
    private static int q;
    private static int r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, LinkedHashMap<String, View>> f40310b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static LinkedHashMap<String, String> f40311c = new LinkedHashMap<>();
    private static LinkedHashMap<String, d> d = new LinkedHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static LinkedHashMap<String, com.smartdigimkt.f3.d> f40312e = new LinkedHashMap<>();
    private static LinkedHashMap<String, String> f = new LinkedHashMap<>();
    private static LinkedHashMap<String, Integer> g = new LinkedHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static LinkedHashMap<String, Activity> f40313h = new LinkedHashMap<>();
    private static volatile int j = 10000;
    private static int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f40315l = 1;
    private static String m = "";

    public class a implements Runnable {
        final /* synthetic */ Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f40318Y;
        final /* synthetic */ Rect Z;
        final /* synthetic */ int e0;
        final /* synthetic */ int f0;

        public a(Object obj, String str, Rect rect, int i2, int i3) {
            this.X = obj;
            this.f40318Y = str;
            this.Z = rect;
            this.e0 = i2;
            this.f0 = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            String rid;
            WindVaneWebView windVaneWebView = ((com.smartdigimkt.n.b) this.X).f36886a;
            if (windVaneWebView != null) {
                rid = windVaneWebView.getRid();
            } else {
                rid = "";
                windVaneWebView = null;
            }
            LinkedHashMap<String, View> linkedHashMapA = c.this.a(this.f40318Y, rid);
            String strB = c.this.b();
            c.f40311c.put(strB, rid);
            AnythinkBTLayout anythinkBTLayout = new AnythinkBTLayout(com.smartdigimkt.m6.b.p().k());
            linkedHashMapA.put(strB, anythinkBTLayout);
            anythinkBTLayout.setInstanceId(strB);
            anythinkBTLayout.setUnitId(this.f40318Y);
            anythinkBTLayout.setWebView(windVaneWebView);
            anythinkBTLayout.setRect(this.Z);
            int i2 = this.e0;
            if (i2 > 0 || this.f0 > 0) {
                anythinkBTLayout.setLayout(i2, this.f0);
            }
            c.this.b(this.X, strB);
        }
    }

    public class b implements Runnable {
        final /* synthetic */ Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f40319Y;
        final /* synthetic */ String Z;
        final /* synthetic */ String e0;
        final /* synthetic */ String f0;
        final /* synthetic */ Rect g0;
        final /* synthetic */ int h0;
        final /* synthetic */ int i0;

        public b(Object obj, String str, String str2, String str3, String str4, Rect rect, int i2, int i3) {
            this.X = obj;
            this.f40319Y = str;
            this.Z = str2;
            this.e0 = str3;
            this.f0 = str4;
            this.g0 = rect;
            this.h0 = i2;
            this.i0 = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            String rid;
            WindVaneWebView windVaneWebView = ((com.smartdigimkt.n.b) this.X).f36886a;
            if (windVaneWebView != null) {
                rid = windVaneWebView.getRid();
            } else {
                rid = "";
                windVaneWebView = null;
            }
            LinkedHashMap<String, View> linkedHashMapA = c.this.a(this.f40319Y, rid);
            String strB = c.this.b();
            c.f40311c.put(strB, rid);
            AnythinkBTWebView anythinkBTWebView = new AnythinkBTWebView(com.smartdigimkt.m6.b.p().k());
            linkedHashMapA.put(strB, anythinkBTWebView);
            anythinkBTWebView.setInstanceId(strB);
            anythinkBTWebView.setUnitId(this.f40319Y);
            anythinkBTWebView.setFileURL(this.Z);
            anythinkBTWebView.setFilePath(this.e0);
            anythinkBTWebView.setHtml(this.f0);
            anythinkBTWebView.setRect(this.g0);
            anythinkBTWebView.setWebViewRid(rid);
            anythinkBTWebView.setCreateWebView(windVaneWebView);
            int i2 = this.h0;
            if (i2 > 0 || this.i0 > 0) {
                anythinkBTWebView.setLayout(i2, this.i0);
            }
            anythinkBTWebView.preload();
            c.this.b(this.X, strB);
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.z1.c$c, reason: collision with other inner class name */
    public static class C0650c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static c f40320a = new c(null);

        private C0650c() {
        }
    }

    public /* synthetic */ c(a aVar) {
        this();
    }

    public static c c() {
        return C0650c.f40320a;
    }

    public void A(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (!linkedHashMapA.containsKey(strOptString2)) {
                a(obj, "instanceId not exit");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            if (!(view instanceof AnythinkBTVideoView)) {
                a(obj, "instanceId is not player");
            } else {
                ((AnythinkBTVideoView) view).stop();
                b(obj, strOptString2);
            }
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void B(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (!linkedHashMapA.containsKey(strOptString2)) {
                a(obj, "instanceId not exit");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            if (!(view instanceof AnythinkBTVideoView)) {
                a(obj, "instanceId is not player");
            } else if (!((AnythinkBTVideoView) view).playUnMute()) {
                b(obj, "set unmute failed");
            } else {
                b(obj, strOptString2);
                a(obj, "onUnmute", strOptString2);
            }
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void C(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
            }
        } catch (Throwable th) {
            a(obj, th.getMessage());
        }
    }

    public void D(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (!linkedHashMapA.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            if (!(view instanceof ATTempContainer)) {
                a(obj, "view not exist");
            } else {
                ((ATTempContainer) view).preload();
                b(obj, strOptString2);
            }
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void E(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (!linkedHashMapA.containsKey(strOptString2)) {
                a(obj, "params not enough");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            if (view == null || view.getParent() == null) {
                a(obj, "view is null");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup == null) {
                a(obj, "parent is null");
                return;
            }
            viewGroup.removeView(view);
            b(obj, strOptString2);
            a(obj, "onRemoveFromView", strOptString2);
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void F(Object obj, JSONObject jSONObject) {
        com.smartdigimkt.d3.c cVar;
        try {
            WindVaneWebView windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a;
            String strOptString = "";
            String rid = windVaneWebView != null ? windVaneWebView.getRid() : "";
            String strOptString2 = jSONObject.optString("unitId");
            String strOptString3 = jSONObject.optString("id");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            String strOptString4 = jSONObjectOptJSONObject.optString("userId");
            boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("expired");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("reward");
            String strOptString5 = jSONObjectOptJSONObject.optString("extra");
            if (jSONObjectOptJSONObject2 != null) {
                com.smartdigimkt.d3.c cVar2 = new com.smartdigimkt.d3.c(jSONObjectOptJSONObject2.optString("name"), jSONObjectOptJSONObject2.optInt("amount"));
                strOptString = jSONObjectOptJSONObject2.optString("id");
                cVar = cVar2;
            } else {
                cVar = null;
            }
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString2, rid);
            if (linkedHashMapA.size() <= 0 || !f.containsKey(strOptString3)) {
                a(obj, "unitId not exist");
                return;
            }
            View view = linkedHashMapA.get(strOptString3);
            if (!(view instanceof ATTempContainer)) {
                a(obj, "instanceId not exist");
                return;
            }
            ATTempContainer aTTempContainer = (ATTempContainer) view;
            aTTempContainer.setReward(cVar);
            aTTempContainer.setUserId(strOptString4);
            aTTempContainer.setRewardId(strOptString);
            aTTempContainer.setCampaignExpired(zOptBoolean);
            if (!TextUtils.isEmpty(strOptString5)) {
                aTTempContainer.setDeveloperExtraData(strOptString5);
            }
            b(obj, strOptString3);
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void G(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            double dOptDouble = jSONObjectOptJSONObject.optDouble("alpha", 1.0d);
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (!linkedHashMapA.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            if (view == null) {
                a(obj, "view not exist");
                return;
            }
            view.setAlpha((float) dOptDouble);
            b(obj, strOptString2);
            a(obj, "onViewAlphaChanged", strOptString2);
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void H(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("color");
            if (TextUtils.isEmpty(strOptString3)) {
                a(obj, "color is not exist");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (!linkedHashMapA.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            if (view == null) {
                a(obj, "view not exist");
                return;
            }
            b(obj, strOptString2);
            view.setBackgroundColor(Color.parseColor(strOptString3));
            a(obj, "onViewBgColorChanged", strOptString2);
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void I(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            if (jSONObjectOptJSONObject2 == null) {
                a(obj, "rect not exist");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            Rect rect = new Rect(jSONObjectOptJSONObject2.optInt(TtmlNode.LEFT, -999), jSONObjectOptJSONObject2.optInt("top", -999), jSONObjectOptJSONObject2.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
            int iOptInt = jSONObjectOptJSONObject2.optInt("width");
            int iOptInt2 = jSONObjectOptJSONObject2.optInt("height");
            if (!linkedHashMapA.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            if (view == null) {
                a(obj, "view is null");
                return;
            }
            if (view.getParent() != null) {
                view.setLayoutParams(a(view.getLayoutParams(), rect, iOptInt, iOptInt2));
                view.requestLayout();
            } else {
                if (view instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) view).setRect(rect);
                    ((AnythinkBTWebView) view).setLayout(iOptInt, iOptInt2);
                }
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).setRect(rect);
                    ((AnythinkBTVideoView) view).setLayout(iOptInt, iOptInt2);
                }
            }
            b(obj, strOptString2);
            a(obj, "onViewRectChanged", strOptString2);
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void J(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            double dOptDouble = jSONObjectOptJSONObject.optDouble("vertical", 1.0d);
            double dOptDouble2 = jSONObjectOptJSONObject.optDouble("horizon", 1.0d);
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (!linkedHashMapA.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            if (view == null) {
                a(obj, "view not exist");
                return;
            }
            view.setScaleX((float) dOptDouble2);
            view.setScaleY((float) dOptDouble);
            b(obj, strOptString2);
            a(obj, "onViewScaleChanged", strOptString2);
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void K(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (!linkedHashMapA.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            if (view == null) {
                a(obj, "view not exist");
                return;
            }
            view.setVisibility(0);
            b(obj, strOptString2);
            a(obj, "onShowView", strOptString2);
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void L(Object obj, JSONObject jSONObject) {
        try {
            WindVaneWebView windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a;
            String rid = windVaneWebView != null ? windVaneWebView.getRid() : "";
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            String strOptString3 = jSONObjectOptJSONObject.optString(d9.h.j0);
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("eventData");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, rid);
            if (linkedHashMapA.size() <= 0) {
                a(obj, "unitId not exist");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof WindVaneWebView) {
                        h.a().a((WebView) childAt, strOptString3, Base64.encodeToString(jSONObjectOptJSONObject2.toString().getBytes(), 2));
                        b(obj, strOptString2);
                        return;
                    }
                }
            }
            a(obj, "instanceId not exist");
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void M(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (!linkedHashMapA.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            if (!(view instanceof AnythinkBTWebView)) {
                a(obj, "view not exist");
            } else if (((AnythinkBTWebView) view).webviewGoBack()) {
                b(obj, strOptString2);
            } else {
                a(obj, "webviewGoBack failed");
            }
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void N(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (!linkedHashMapA.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            if (!(view instanceof AnythinkBTWebView)) {
                a(obj, "view not exist");
            } else if (((AnythinkBTWebView) view).webviewGoForward()) {
                b(obj, strOptString2);
            } else {
                a(obj, "webviewGoForward failed");
            }
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void O(Object obj, JSONObject jSONObject) {
        int iOptInt;
        int iOptInt2;
        WindVaneWebView windVaneWebView;
        Object obj2 = obj;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj2).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj2, "data is empty");
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("content");
            if (jSONObjectOptJSONObject2 == null) {
                a(obj2, "content is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject2.optString("fileURL");
            String strOptString4 = jSONObjectOptJSONObject2.optString(vc.c.f27495c);
            String strOptString5 = jSONObjectOptJSONObject2.optString("html");
            if (TextUtils.isEmpty(strOptString3) && TextUtils.isEmpty(strOptString4) && TextUtils.isEmpty(strOptString5)) {
                a(obj2, "url is empty");
                return;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("campaigns");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                int length = jSONArrayOptJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    d dVarB = d.b(jSONArrayOptJSONArray.getJSONObject(i2));
                    if (dVarB != null) {
                        dVarB.G(strOptString);
                        arrayList.add(dVarB);
                    }
                }
            }
            String strOptString6 = jSONObjectOptJSONObject2.optString("unitId");
            com.smartdigimkt.f3.d dVarA = com.smartdigimkt.f3.d.a(jSONObjectOptJSONObject2.optJSONObject("unitSetting"));
            if (dVarA != null) {
                dVarA.g(strOptString6);
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("rect");
            Rect rect = new Rect(-999, -999, -999, -999);
            if (jSONObjectOptJSONObject3 != null) {
                try {
                    Rect rect2 = new Rect(jSONObjectOptJSONObject3.optInt(TtmlNode.LEFT, -999), jSONObjectOptJSONObject3.optInt("top", -999), jSONObjectOptJSONObject3.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject3.optInt("bottom", -999));
                    iOptInt = jSONObjectOptJSONObject3.optInt("width");
                    iOptInt2 = jSONObjectOptJSONObject3.optInt("height");
                    rect = rect2;
                } catch (Throwable th) {
                    th = th;
                    obj2 = obj;
                    com.google.firebase.crashlytics.internal.model.a.A(th, this, obj2);
                    return;
                }
            } else {
                iOptInt2 = 0;
                iOptInt = 0;
            }
            int iOptInt3 = jSONObjectOptJSONObject2.optInt("refreshCache", 0);
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (!linkedHashMapA.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            if (!(view instanceof AnythinkBTWebView)) {
                a(obj, "view not exist");
                return;
            }
            AnythinkBTWebView anythinkBTWebView = (AnythinkBTWebView) view;
            anythinkBTWebView.setHtml(strOptString5);
            anythinkBTWebView.setFilePath(strOptString4);
            anythinkBTWebView.setFileURL(strOptString3);
            anythinkBTWebView.setRect(rect);
            anythinkBTWebView.setLayout(iOptInt, iOptInt2);
            anythinkBTWebView.setCampaigns(arrayList);
            anythinkBTWebView.setRewardUnitSetting(dVarA);
            anythinkBTWebView.webviewLoad(iOptInt3);
            b(obj, strOptString2);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void P(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (!linkedHashMapA.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            if (!(view instanceof AnythinkBTWebView)) {
                a(obj, "view not exist");
            } else if (((AnythinkBTWebView) view).webviewReload()) {
                b(obj, strOptString2);
            } else {
                a(obj, "reload failed");
            }
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public String b() {
        j++;
        return String.valueOf(j);
    }

    public d d(String str) {
        if (d.containsKey(str)) {
            return d.get(str);
        }
        return null;
    }

    public com.smartdigimkt.f3.d e(String str) {
        if (f40312e.containsKey(str)) {
            return f40312e.get(str);
        }
        return null;
    }

    public String f(String str) {
        return f40311c.containsKey(str) ? f40311c.get(str) : "";
    }

    public String g(String str) {
        return f.containsKey(str) ? f.get(str) : "";
    }

    public int h(String str) {
        if (g.containsKey(str)) {
            return g.get(str).intValue();
        }
        return 2;
    }

    public void i(String str) {
        f40313h.remove(str);
    }

    public void j(Object obj, JSONObject jSONObject) {
        Object obj2;
        Throwable th;
        int i2;
        int iOptInt;
        try {
            String strOptString = jSONObject.optString("unitId");
            try {
                if (TextUtils.isEmpty(strOptString)) {
                    a(obj, "unitId is empty");
                    return;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                int iOptInt2 = jSONObjectOptJSONObject.optInt("delay", 0);
                String strOptString2 = jSONObjectOptJSONObject.optString("fileURL");
                String strOptString3 = jSONObjectOptJSONObject.optString(vc.c.f27495c);
                String strOptString4 = jSONObjectOptJSONObject.optString("html");
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                Rect rect = new Rect(-999, -999, -999, -999);
                if (jSONObjectOptJSONObject2 != null) {
                    rect = new Rect(jSONObjectOptJSONObject2.optInt(TtmlNode.LEFT, -999), jSONObjectOptJSONObject2.optInt("top", -999), jSONObjectOptJSONObject2.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                    int iOptInt3 = jSONObjectOptJSONObject2.optInt("width");
                    iOptInt = jSONObjectOptJSONObject2.optInt("height");
                    i2 = iOptInt3;
                } else {
                    i2 = 0;
                    iOptInt = 0;
                }
                obj2 = obj;
                try {
                    new Handler(Looper.getMainLooper()).postDelayed(new b(obj2, strOptString, strOptString2, strOptString3, strOptString4, rect, i2, iOptInt), iOptInt2);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                obj2 = obj;
            }
        } catch (Throwable th4) {
            th = th4;
            obj2 = obj;
        }
        th = th;
        com.google.firebase.crashlytics.internal.model.a.A(th, this, obj2);
    }

    public void k(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") != null && !TextUtils.isEmpty(strOptString)) {
                String strF = f(strOptString2);
                if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                    strF = windVaneWebView.getRid();
                }
                LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
                if (linkedHashMapA == null || !linkedHashMapA.containsKey(strOptString2)) {
                    a(obj, "unitId or instanceId not exist");
                    return;
                }
                View view = linkedHashMapA.get(strOptString2);
                linkedHashMapA.remove(strOptString2);
                if (view != null && view.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                    }
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) view;
                        if (viewGroup2.getChildCount() > 0) {
                            int childCount = viewGroup2.getChildCount();
                            for (int i2 = 0; i2 < childCount; i2++) {
                                View childAt = viewGroup2.getChildAt(i2);
                                if (childAt instanceof AnythinkBTWebView) {
                                    linkedHashMapA.remove(((AnythinkBTWebView) childAt).getInstanceId());
                                    ((AnythinkBTWebView) childAt).onDestory();
                                } else if (childAt instanceof AnythinkBTVideoView) {
                                    linkedHashMapA.remove(((AnythinkBTVideoView) childAt).getInstanceId());
                                    ((AnythinkBTVideoView) childAt).onDestory();
                                } else if (childAt instanceof ATTempContainer) {
                                    linkedHashMapA.remove(((ATTempContainer) childAt).getInstanceId());
                                    ((ATTempContainer) childAt).onDestroy();
                                }
                            }
                        }
                    }
                }
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).onDestroy();
                }
                if (view instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) view).onDestory();
                }
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).onDestory();
                }
                b(obj, strOptString2);
                a(obj, "onComponentDestroy", strOptString2);
                return;
            }
            a(obj, "unidId or data is empty");
        } catch (Throwable th) {
            a(obj, th.getMessage());
        }
    }

    public void l(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            String strOptString = jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
            } else {
                b(obj, strOptString);
            }
        } catch (Throwable th) {
            a(obj, th.getMessage());
        }
    }

    public void m(Object obj, JSONObject jSONObject) {
        int i2;
        int i3;
        boolean z2;
        String str;
        JSONObject jSONObject2 = new JSONObject();
        int i4 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "params is null");
                h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e2) {
                e2.getMessage();
                return;
            }
        }
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "");
            JSONArray jSONArray = jSONObject.getJSONArray("resource");
            if (jSONArray == null || jSONArray.length() <= 0) {
                try {
                    jSONObject2.put("code", 1);
                    jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "resource is null");
                    h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    return;
                } catch (JSONException e3) {
                    e3.getMessage();
                    return;
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            int length = jSONArray.length();
            int i5 = 0;
            while (i5 < length) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i5);
                String strOptString = jSONObject3.optString("ref", "");
                int i6 = jSONObject3.getInt("type");
                JSONObject jSONObject4 = new JSONObject();
                if (i6 != i4 || TextUtils.isEmpty(strOptString)) {
                    i2 = length;
                    i3 = i5;
                    z2 = false;
                    if (i6 == 2 && !TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("type", 2);
                        jSONObject5.put("path", i.a().c(strOptString) == null ? "" : i.a().c(strOptString));
                        jSONObject4.put(strOptString, jSONObject5);
                        jSONArray2.put(jSONObject4);
                    } else if (i6 == 3 && !TextUtils.isEmpty(strOptString)) {
                        try {
                            File file = new File(strOptString);
                            if (file.exists() && file.isFile() && file.canRead()) {
                                str = "file:////" + strOptString;
                            } else {
                                str = "";
                            }
                        } catch (Throwable th) {
                            if (com.smartdigimkt.b.b.f33800a) {
                                th.printStackTrace();
                            }
                        }
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("type", 3);
                        jSONObject6.put("path", str);
                        jSONObject4.put(strOptString, jSONObject6);
                        jSONArray2.put(jSONObject4);
                    } else if (i6 == 4 && !TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject7 = new JSONObject();
                        jSONObject7.put("type", 4);
                        jSONObject7.put("path", u.a(strOptString) == null ? "" : u.a(strOptString));
                        jSONObject4.put(strOptString, jSONObject7);
                        jSONArray2.put(jSONObject4);
                    }
                } else {
                    JSONObject jSONObject8 = new JSONObject();
                    o oVarB = com.smartdigimkt.c3.a.a().b(strOptString);
                    if (oVarB != null) {
                        jSONObject8.put("type", 1);
                        i2 = length;
                        i3 = i5;
                        jSONObject8.put("videoDataLength", oVarB.d());
                        String strE = oVarB.e();
                        if (TextUtils.isEmpty(strE)) {
                            jSONObject8.put("path", "");
                            jSONObject8.put("path4Web", "");
                        } else {
                            jSONObject8.put("path", strE);
                            jSONObject8.put("path4Web", strE);
                        }
                        if (oVarB.c() == 100) {
                            jSONObject8.put("downloaded", 1);
                            z2 = false;
                        } else {
                            z2 = false;
                            jSONObject8.put("downloaded", 0);
                        }
                        jSONObject4.put(strOptString, jSONObject8);
                        jSONArray2.put(jSONObject4);
                    } else {
                        i2 = length;
                        i3 = i5;
                        z2 = false;
                    }
                }
                i5 = i3 + 1;
                length = i2;
                i4 = 1;
            }
            jSONObject2.put("resource", jSONArray2);
            h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            return;
        } catch (Throwable th2) {
            jSONObject2.put("code", 1);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, th2.getLocalizedMessage());
            h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        }
        try {
            jSONObject2.put("code", 1);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, th2.getLocalizedMessage());
            h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (JSONException e4) {
            e4.getMessage();
        }
    }

    public void n(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (!linkedHashMapA.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            if (view == null) {
                a(obj, "view not exist");
                return;
            }
            view.setVisibility(8);
            b(obj, strOptString2);
            a(obj, "onHideView", strOptString2);
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void o(Object obj, JSONObject jSONObject) {
        try {
            b(obj, "");
        } catch (Throwable th) {
            a(obj, th.getMessage());
        }
    }

    public void p(Object obj, JSONObject jSONObject) {
        int iOptInt;
        int iOptInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("id");
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (!linkedHashMapA.containsKey(strOptString3) || !linkedHashMapA.containsKey(strOptString2)) {
                a(obj, "instanceId is not exist");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) linkedHashMapA.get(strOptString2);
            View view = linkedHashMapA.get(strOptString3);
            if (viewGroup != null && view != null) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                if (view instanceof ATTempContainer) {
                    String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(f40316n), Integer.valueOf(o), Integer.valueOf(f40317p), Integer.valueOf(q), Integer.valueOf(r));
                    ((ATTempContainer) view).setNotchPadding(f40316n, o, f40317p, q, r);
                    for (View view2 : linkedHashMapA.values()) {
                        if (view2 instanceof AnythinkBTContainer) {
                            com.smartdigimkt.j7.c.a(view);
                            ((AnythinkBTContainer) view2).appendSubView((AnythinkBTContainer) view2, (ATTempContainer) view, jSONObjectOptJSONObject2);
                            break;
                        }
                    }
                } else {
                    if (jSONObjectOptJSONObject2 != null) {
                        Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt(TtmlNode.LEFT, -999), jSONObjectOptJSONObject2.optInt("top", -999), jSONObjectOptJSONObject2.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                        iOptInt = jSONObjectOptJSONObject2.optInt("width");
                        iOptInt2 = jSONObjectOptJSONObject2.optInt("height");
                        rect = rect2;
                    } else if (view instanceof BTBaseView) {
                        rect = ((BTBaseView) view).getRect();
                        iOptInt = ((BTBaseView) view).getViewWidth();
                        iOptInt2 = ((BTBaseView) view).getViewHeight();
                    } else {
                        iOptInt = 0;
                        rect = null;
                        iOptInt2 = 0;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    viewGroup.addView(view, a(layoutParams, rect, iOptInt, iOptInt2));
                }
                b(obj, strOptString2);
                a(obj, "onAppendView", strOptString2);
                return;
            }
            a(obj, "view is not exist");
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void q(Object obj, JSONObject jSONObject) {
        int iOptInt;
        int iOptInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                String strOptString3 = jSONObjectOptJSONObject.optString("id");
                LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
                if (!linkedHashMapA.containsKey(strOptString2) || !linkedHashMapA.containsKey(strOptString3)) {
                    a(obj, "instanceId is not exist");
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) linkedHashMapA.get(strOptString3);
                View view = linkedHashMapA.get(strOptString2);
                if (viewGroup != null && view != null) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                    if (view instanceof ATTempContainer) {
                        for (View view2 : linkedHashMapA.values()) {
                            if (view2 instanceof AnythinkBTContainer) {
                                com.smartdigimkt.j7.c.a(view);
                                ((AnythinkBTContainer) view2).appendSubView((AnythinkBTContainer) view2, (ATTempContainer) view, jSONObjectOptJSONObject2);
                                break;
                            }
                        }
                    } else {
                        if (jSONObjectOptJSONObject2 != null) {
                            Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt(TtmlNode.LEFT, -999), jSONObjectOptJSONObject2.optInt("top", -999), jSONObjectOptJSONObject2.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                            iOptInt = jSONObjectOptJSONObject2.optInt("width");
                            iOptInt2 = jSONObjectOptJSONObject2.optInt("height");
                            rect = rect2;
                        } else if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            iOptInt = ((BTBaseView) view).getViewWidth();
                            iOptInt2 = ((BTBaseView) view).getViewHeight();
                        } else {
                            iOptInt = 0;
                            rect = null;
                            iOptInt2 = 0;
                        }
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        if (viewGroup instanceof FrameLayout) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof RelativeLayout) {
                            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof LinearLayout) {
                            layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        }
                        viewGroup.addView(view, a(layoutParams, rect, iOptInt, iOptInt2));
                    }
                    b(obj, strOptString2);
                    a(obj, "onAppendViewTo", strOptString2);
                    return;
                }
                a(obj, "view is not exist");
                return;
            }
            a(obj, "unitId or data is empty");
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void r(Object obj, JSONObject jSONObject) {
        int iOptInt;
        int iOptInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("targetComponentId");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (!linkedHashMapA.containsKey(strOptString2) || !linkedHashMapA.containsKey(strOptString3)) {
                a(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            View view2 = linkedHashMapA.get(strOptString3);
            if (view2 == null || view2.getParent() == null) {
                a(obj, "view not exist");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(view2);
            if (jSONObjectOptJSONObject2 != null) {
                Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt(TtmlNode.LEFT, -999), jSONObjectOptJSONObject2.optInt("top", -999), jSONObjectOptJSONObject2.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                iOptInt = jSONObjectOptJSONObject2.optInt("width");
                iOptInt2 = jSONObjectOptJSONObject2.optInt("height");
                rect = rect2;
            } else if (view instanceof BTBaseView) {
                rect = ((BTBaseView) view).getRect();
                iOptInt = ((BTBaseView) view).getViewWidth();
                iOptInt2 = ((BTBaseView) view).getViewHeight();
            } else {
                iOptInt = 0;
                rect = null;
                iOptInt2 = 0;
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(-1, -1);
            }
            viewGroup.addView(view, iIndexOfChild + 1, a(layoutParams, rect, iOptInt, iOptInt2));
            b(obj, strOptString2);
            a(obj, "onInsertViewAbove", strOptString2);
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void s(Object obj, JSONObject jSONObject) {
        int iOptInt;
        int iOptInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("targetComponentId");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (!linkedHashMapA.containsKey(strOptString2) || !linkedHashMapA.containsKey(strOptString3)) {
                a(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            View view2 = linkedHashMapA.get(strOptString3);
            if (view2 == null || view2.getParent() == null) {
                a(obj, "view not exist");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(view2);
            if (jSONObjectOptJSONObject2 != null) {
                Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt(TtmlNode.LEFT, -999), jSONObjectOptJSONObject2.optInt("top", -999), jSONObjectOptJSONObject2.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                iOptInt = jSONObjectOptJSONObject2.optInt("width");
                iOptInt2 = jSONObjectOptJSONObject2.optInt("height");
                rect = rect2;
            } else if (view instanceof BTBaseView) {
                rect = ((BTBaseView) view).getRect();
                iOptInt = ((BTBaseView) view).getViewWidth();
                iOptInt2 = ((BTBaseView) view).getViewHeight();
            } else {
                iOptInt = 0;
                rect = null;
                iOptInt2 = 0;
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(-1, -1);
            }
            viewGroup.addView(view, iIndexOfChild, a(layoutParams, rect, iOptInt, iOptInt2));
            b(obj, strOptString2);
            a(obj, "onInsertViewBelow", strOptString2);
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void t(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (!linkedHashMapA.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            if (!(view instanceof AnythinkBTVideoView)) {
                a(obj, "instanceId is not player");
                return;
            }
            int mute = ((AnythinkBTVideoView) view).getMute();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", k);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("id", strOptString2);
            jSONObject3.put("mute", mute);
            jSONObject2.put("data", jSONObject3);
            h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void u(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (!linkedHashMapA.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            if (!(view instanceof AnythinkBTVideoView)) {
                a(obj, "instanceId is not player");
            } else if (((AnythinkBTVideoView) view).playMute()) {
                b(obj, strOptString2);
            } else {
                a(obj, "set mute failed");
            }
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void v(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (!linkedHashMapA.containsKey(strOptString2)) {
                a(obj, "instanceId not exit");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            if (!(view instanceof AnythinkBTVideoView)) {
                a(obj, "instanceId is not player");
            } else {
                ((AnythinkBTVideoView) view).pause();
                b(obj, strOptString2);
            }
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void w(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (!linkedHashMapA.containsKey(strOptString2)) {
                a(obj, "instanceId not exit");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            if (!(view instanceof AnythinkBTVideoView)) {
                a(obj, "instanceId is not player");
            } else {
                ((AnythinkBTVideoView) view).play();
                b(obj, strOptString2);
            }
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void x(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (!linkedHashMapA.containsKey(strOptString2)) {
                a(obj, "instanceId not exit");
                return;
            }
            View view = linkedHashMapA.get(strOptString2);
            if (!(view instanceof AnythinkBTVideoView)) {
                a(obj, "instanceId is not player");
            } else {
                ((AnythinkBTVideoView) view).resume();
                b(obj, strOptString2);
            }
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void y(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
            } else {
                a(obj, "android mediaPlayer not support setScaleType");
            }
        } catch (Throwable th) {
            a(obj, th.getMessage());
        }
    }

    public void z(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
            }
        } catch (Throwable th) {
            a(obj, th.getMessage());
        }
    }

    private c() {
    }

    public void a(String str, Activity activity) {
        f40313h.put(str, activity);
    }

    public Activity c(String str) {
        if (f40313h.containsKey(str)) {
            return f40313h.get(str);
        }
        return null;
    }

    public void i(Object obj, JSONObject jSONObject) {
        Object obj2;
        Throwable th;
        int i2;
        int iOptInt;
        try {
            String strOptString = jSONObject.optString("unitId");
            try {
                if (TextUtils.isEmpty(strOptString)) {
                    a(obj, "unitId is empty");
                    return;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                int iOptInt2 = jSONObjectOptJSONObject.optInt("delay", 0);
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                Rect rect = new Rect(-999, -999, -999, -999);
                if (jSONObjectOptJSONObject2 != null) {
                    rect = new Rect(jSONObjectOptJSONObject2.optInt(TtmlNode.LEFT, -999), jSONObjectOptJSONObject2.optInt("top", -999), jSONObjectOptJSONObject2.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                    int iOptInt3 = jSONObjectOptJSONObject2.optInt("width");
                    iOptInt = jSONObjectOptJSONObject2.optInt("height");
                    i2 = iOptInt3;
                } else {
                    i2 = 0;
                    iOptInt = 0;
                }
                obj2 = obj;
                try {
                    new Handler(Looper.getMainLooper()).postDelayed(new a(obj2, strOptString, rect, i2, iOptInt), iOptInt2);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                obj2 = obj;
            }
        } catch (Throwable th4) {
            th = th4;
            obj2 = obj;
        }
        th = th;
        com.google.firebase.crashlytics.internal.model.a.A(th, this, obj2);
    }

    public void a(String str, int i2) {
        g.put(str, Integer.valueOf(i2));
    }

    public void b(String str) {
        if (g.containsKey(str)) {
            g.remove(str);
        }
    }

    public void d(String str, String str2) {
        f40311c.put(str, str2);
    }

    public void e(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (linkedHashMapA.size() > 0) {
                AnythinkBTContainer anythinkBTContainer = null;
                for (View view : linkedHashMapA.values()) {
                    if (view instanceof AnythinkBTContainer) {
                        anythinkBTContainer = (AnythinkBTContainer) view;
                    } else if (view instanceof AnythinkBTWebView) {
                        ((AnythinkBTWebView) view).onDestory();
                    } else if (view instanceof AnythinkBTVideoView) {
                        com.smartdigimkt.z1.a.a().a(((AnythinkBTVideoView) view).getInstanceId());
                        ((AnythinkBTVideoView) view).onDestory();
                    } else if (view instanceof ATTempContainer) {
                        ((ATTempContainer) view).onDestroy();
                    }
                }
                if (anythinkBTContainer != null) {
                    anythinkBTContainer.onAdClose();
                    f40310b.remove(linkedHashMapA);
                    linkedHashMapA.clear();
                    f40310b.remove(strOptString + "_" + strF);
                    b(obj, strOptString2);
                    return;
                }
                a(obj, "not found AnythinkBTContainer");
                return;
            }
            a(obj, "unitId or instanceId not exist");
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void h(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                int iOptInt = jSONObjectOptJSONObject.optInt("mute");
                String rid = "";
                d dVarB = d.b(jSONObjectOptJSONObject.optJSONObject(MBInterstitialActivity.INTENT_CAMAPIGN));
                if (dVarB != null && !TextUtils.isEmpty(strOptString)) {
                    dVarB.G(strOptString);
                    rid = dVarB.N1();
                }
                com.smartdigimkt.f3.d dVarA = com.smartdigimkt.f3.d.a(jSONObjectOptJSONObject.optJSONObject("unitSetting"));
                if (dVarA != null) {
                    dVarA.g(strOptString);
                }
                String strOptString2 = jSONObjectOptJSONObject.optString("userId");
                if (TextUtils.isEmpty(rid) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                    rid = windVaneWebView.getRid();
                }
                LinkedHashMap<String, View> linkedHashMapA = a(strOptString, rid);
                String strB = b();
                f40311c.put(strB, rid);
                ATTempContainer aTTempContainer = new ATTempContainer(com.smartdigimkt.m6.b.p().k());
                aTTempContainer.setInstanceId(strB);
                aTTempContainer.setUnitId(strOptString);
                aTTempContainer.setCampaign(dVarB);
                aTTempContainer.setRewardUnitSetting(dVarA);
                aTTempContainer.setBigOffer(true);
                if (!TextUtils.isEmpty(strOptString2)) {
                    aTTempContainer.setUserId(strOptString2);
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("reward");
                if (jSONObjectOptJSONObject2 != null) {
                    String strOptString3 = jSONObjectOptJSONObject2.optString("id");
                    com.smartdigimkt.d3.c cVar = new com.smartdigimkt.d3.c(jSONObjectOptJSONObject2.optString("name"), jSONObjectOptJSONObject2.optInt("amount"));
                    if (!TextUtils.isEmpty(strOptString3)) {
                        aTTempContainer.setRewardId(strOptString3);
                    }
                    if (!TextUtils.isEmpty(cVar.c())) {
                        aTTempContainer.setReward(cVar);
                    }
                }
                String strOptString4 = jSONObjectOptJSONObject.optString("extra");
                if (!TextUtils.isEmpty(strOptString4)) {
                    aTTempContainer.setDeveloperExtraData(strOptString4);
                }
                aTTempContainer.setMute(iOptInt);
                linkedHashMapA.put(strB, aTTempContainer);
                f.put(strB, strOptString);
                d.put(strB, dVarB);
                f40312e.put(strB, dVarA);
                b(obj, strB);
                return;
            }
            a(obj, "unitId or data is empty");
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void a(String str) {
        if (f.containsKey(str)) {
            f.remove(str);
        }
        if (f40312e.containsKey(str)) {
            f40312e.remove(str);
        }
        if (d.containsKey(str)) {
            d.remove(str);
        }
        if (f40311c.containsKey(str)) {
            f40311c.remove(str);
        }
    }

    public void c(String str, String str2) {
        LinkedHashMap<String, View> linkedHashMapA = a(str, str2);
        if (linkedHashMapA != null && !linkedHashMapA.isEmpty()) {
            Iterator<Map.Entry<String, View>> it = linkedHashMapA.entrySet().iterator();
            while (it.hasNext()) {
                View value = it.next().getValue();
                if (value != null && value.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) value.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(value);
                    }
                    if (value instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) value;
                        if (viewGroup2.getChildCount() > 0) {
                            int childCount = viewGroup2.getChildCount();
                            for (int i2 = 0; i2 < childCount; i2++) {
                                View childAt = viewGroup2.getChildAt(i2);
                                if (childAt instanceof AnythinkBTWebView) {
                                    AnythinkBTWebView anythinkBTWebView = (AnythinkBTWebView) childAt;
                                    linkedHashMapA.remove(anythinkBTWebView.getInstanceId());
                                    anythinkBTWebView.onDestory();
                                } else if (childAt instanceof AnythinkBTVideoView) {
                                    AnythinkBTVideoView anythinkBTVideoView = (AnythinkBTVideoView) childAt;
                                    linkedHashMapA.remove(anythinkBTVideoView.getInstanceId());
                                    anythinkBTVideoView.onDestory();
                                } else if (childAt instanceof ATTempContainer) {
                                    ATTempContainer aTTempContainer = (ATTempContainer) childAt;
                                    linkedHashMapA.remove(aTTempContainer.getInstanceId());
                                    aTTempContainer.onDestroy();
                                }
                            }
                        }
                    }
                }
                if (value instanceof ATTempContainer) {
                    ((ATTempContainer) value).onDestroy();
                }
                if (value instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) value).onDestory();
                }
                if (value instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) value).onDestory();
                }
            }
        }
        if (linkedHashMapA != null) {
            linkedHashMapA.clear();
        }
    }

    public void d(Object obj, JSONObject jSONObject) {
        try {
            WindVaneWebView windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a;
            String rid = windVaneWebView != null ? windVaneWebView.getRid() : "";
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString(d9.h.j0);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, rid);
            if (linkedHashMapA != null && linkedHashMapA.size() > 0) {
                for (View view : linkedHashMapA.values()) {
                    if (view instanceof AnythinkBTWebView) {
                        ((AnythinkBTWebView) view).broadcast(strOptString2, jSONObjectOptJSONObject);
                    }
                    if (view instanceof AnythinkBTLayout) {
                        ((AnythinkBTLayout) view).broadcast(strOptString2, jSONObjectOptJSONObject);
                    }
                }
                b(obj, "");
                return;
            }
            a(obj, "unitId not exist");
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void f(Object obj, JSONObject jSONObject) {
        Objects.toString(jSONObject);
        try {
            String strOptString = jSONObject.optString("unitId");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                String rid = "";
                d dVarB = d.b(jSONObjectOptJSONObject.optJSONObject(MBInterstitialActivity.INTENT_CAMAPIGN));
                if (dVarB != null && !TextUtils.isEmpty(strOptString)) {
                    dVarB.G(strOptString);
                    rid = dVarB.N1();
                }
                com.smartdigimkt.f3.d dVarA = com.smartdigimkt.f3.d.a(jSONObjectOptJSONObject.optJSONObject("unitSetting"));
                if (dVarA != null) {
                    dVarA.g(strOptString);
                }
                AnythinkBTNativeEC anythinkBTNativeEC = new AnythinkBTNativeEC(com.smartdigimkt.m6.b.p().k());
                anythinkBTNativeEC.setCampaign(dVarB);
                j jVar = new j(null, dVarB);
                jVar.setUnitId(strOptString);
                anythinkBTNativeEC.setJSCommon(jVar);
                anythinkBTNativeEC.setUnitId(strOptString);
                anythinkBTNativeEC.setRewardUnitSetting(dVarA);
                WindVaneWebView windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a;
                if (windVaneWebView != null) {
                    rid = windVaneWebView.getRid();
                    anythinkBTNativeEC.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> linkedHashMapA = a(strOptString, rid);
                String strB = b();
                f40311c.put(strB, rid);
                anythinkBTNativeEC.setInstanceId(strB);
                linkedHashMapA.put(strB, anythinkBTNativeEC);
                anythinkBTNativeEC.preLoadData();
                if (dVarB == null) {
                    a(obj, "campaign is null");
                    return;
                } else {
                    b(obj, strB);
                    return;
                }
            }
            a(obj, "unitId or data is empty");
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void g(Object obj, JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("unitId");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                String rid = "";
                d dVarB = d.b(jSONObjectOptJSONObject.optJSONObject(MBInterstitialActivity.INTENT_CAMAPIGN));
                if (dVarB != null && !TextUtils.isEmpty(strOptString)) {
                    dVarB.G(strOptString);
                    rid = dVarB.N1();
                }
                int iOptInt = jSONObjectOptJSONObject.optInt("show_time", 0);
                int iOptInt2 = jSONObjectOptJSONObject.optInt("show_mute", 0);
                int iOptInt3 = jSONObjectOptJSONObject.optInt("show_close", 0);
                int iOptInt4 = jSONObjectOptJSONObject.optInt("orientation", 1);
                int iOptInt5 = jSONObjectOptJSONObject.optInt("show_pgb", 0);
                AnythinkBTVideoView anythinkBTVideoView = new AnythinkBTVideoView(com.smartdigimkt.m6.b.p().k());
                anythinkBTVideoView.setCampaign(dVarB);
                anythinkBTVideoView.setUnitId(strOptString);
                anythinkBTVideoView.setShowMute(iOptInt2);
                anythinkBTVideoView.setShowTime(iOptInt);
                anythinkBTVideoView.setShowClose(iOptInt3);
                anythinkBTVideoView.setOrientation(iOptInt4);
                anythinkBTVideoView.setProgressBarState(iOptInt5);
                WindVaneWebView windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a;
                if (windVaneWebView != null) {
                    rid = windVaneWebView.getRid();
                    anythinkBTVideoView.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> linkedHashMapA = a(strOptString, rid);
                String strB = b();
                f40311c.put(strB, rid);
                anythinkBTVideoView.setInstanceId(strB);
                linkedHashMapA.put(strB, anythinkBTVideoView);
                anythinkBTVideoView.preLoadData();
                if (dVarB == null) {
                    a(obj, "campaign is null");
                } else {
                    b(obj, strB);
                }
                com.smartdigimkt.z1.a.a().a(strB, anythinkBTVideoView);
                return;
            }
            a(obj, "unitId or data is empty");
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void b(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", k);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            a(obj, e2.getMessage());
            e2.getMessage();
        }
    }

    public synchronized LinkedHashMap<String, View> a(String str, String str2) {
        if (f40310b.containsKey(str + "_" + str2)) {
            return f40310b.get(str + "_" + str2);
        }
        LinkedHashMap<String, View> linkedHashMap = new LinkedHashMap<>();
        f40310b.put(str + "_" + str2, linkedHashMap);
        return linkedHashMap;
    }

    public void b(Object obj, JSONObject jSONObject) {
        int iOptInt;
        int iOptInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                String strOptString3 = jSONObjectOptJSONObject.optString("id");
                LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
                if (linkedHashMapA.containsKey(strOptString2) && linkedHashMapA.containsKey(strOptString3)) {
                    ViewGroup viewGroup = (ViewGroup) linkedHashMapA.get(strOptString3);
                    View view = linkedHashMapA.get(strOptString2);
                    com.smartdigimkt.j7.c.a(view);
                    if (viewGroup != null && view != null) {
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                        if (view instanceof ATTempContainer) {
                            for (View view2 : linkedHashMapA.values()) {
                                if (view2 instanceof AnythinkBTContainer) {
                                    com.smartdigimkt.j7.c.a(view);
                                    ((AnythinkBTContainer) view2).appendSubView((AnythinkBTContainer) view2, (ATTempContainer) view, jSONObjectOptJSONObject2);
                                    break;
                                }
                            }
                        } else {
                            if (jSONObjectOptJSONObject2 == null) {
                                if (view instanceof BTBaseView) {
                                    rect = ((BTBaseView) view).getRect();
                                    iOptInt = ((BTBaseView) view).getViewWidth();
                                    iOptInt2 = ((BTBaseView) view).getViewHeight();
                                } else {
                                    iOptInt = 0;
                                    rect = null;
                                    iOptInt2 = 0;
                                }
                            } else {
                                Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt(TtmlNode.LEFT, -999), jSONObjectOptJSONObject2.optInt("top", -999), jSONObjectOptJSONObject2.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                                iOptInt = jSONObjectOptJSONObject2.optInt("width");
                                iOptInt2 = jSONObjectOptJSONObject2.optInt("height");
                                rect = rect2;
                            }
                            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                            if (viewGroup instanceof FrameLayout) {
                                layoutParams = new FrameLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof RelativeLayout) {
                                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof LinearLayout) {
                                layoutParams = new LinearLayout.LayoutParams(-1, -1);
                            }
                            ViewGroup.LayoutParams layoutParamsA = a(layoutParams, rect, iOptInt, iOptInt2);
                            com.smartdigimkt.j7.c.a(view);
                            viewGroup.addView(view, layoutParamsA);
                        }
                        b(obj, strOptString2);
                        a(obj, "onAppendViewTo", strOptString2);
                        return;
                    }
                    a(obj, "view is not exist");
                    return;
                }
                a(obj, "instanceId is not exist");
                return;
            }
            a(obj, "unitId or data is empty");
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f40315l);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            jSONObject.put("data", new JSONObject());
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void a(WebView webView, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f40315l);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            jSONObject.put("data", new JSONObject());
            h.a().b(webView, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void a(Object obj, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", k);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put("data", jSONObject2);
            h.a().a(obj, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            a(obj, e2.getMessage());
            e2.getMessage();
        }
    }

    public void c(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (linkedHashMapA.containsKey(strOptString2)) {
                View view = linkedHashMapA.get(strOptString2);
                if (view != null && view.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.bringChildToFront(view);
                        b(obj, strOptString2);
                        a(obj, "onBringViewToFront", strOptString2);
                        return;
                    }
                    a(obj, "parent is null");
                    return;
                }
                a(obj, "view is null");
                return;
            }
            a(obj, "instanceId is not exist");
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", k);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put("data", jSONObject2);
            h.a().a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            a(webView, e2.getMessage());
            e2.getMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.widget.LinearLayout$LayoutParams] */
    public ViewGroup.LayoutParams a(ViewGroup.LayoutParams layoutParams, Rect rect, int i2, int i3) {
        if (rect == null) {
            rect = new Rect(-999, -999, -999, -999);
        }
        Context contextK = com.smartdigimkt.m6.b.p().k();
        if (contextK != null) {
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                int i4 = rect.left;
                if (i4 != -999) {
                    layoutParams2.leftMargin = v.a(contextK, i4);
                }
                int i5 = rect.top;
                if (i5 != -999) {
                    layoutParams2.topMargin = v.a(contextK, i5);
                }
                int i6 = rect.right;
                if (i6 != -999) {
                    layoutParams2.rightMargin = v.a(contextK, i6);
                }
                int i7 = rect.bottom;
                if (i7 != -999) {
                    layoutParams2.bottomMargin = v.a(contextK, i7);
                }
                if (i2 > 0) {
                    layoutParams2.width = v.a(contextK, i2);
                }
                if (i3 > 0) {
                    layoutParams2.height = v.a(contextK, i3);
                }
                return layoutParams2;
            }
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                int i8 = rect.left;
                if (i8 != -999) {
                    layoutParams3.leftMargin = v.a(contextK, i8);
                }
                int i9 = rect.top;
                if (i9 != -999) {
                    layoutParams3.topMargin = v.a(contextK, i9);
                }
                int i10 = rect.right;
                if (i10 != -999) {
                    layoutParams3.rightMargin = v.a(contextK, i10);
                }
                int i11 = rect.bottom;
                if (i11 != -999) {
                    layoutParams3.bottomMargin = v.a(contextK, i11);
                }
                if (i2 > 0) {
                    layoutParams3.width = v.a(contextK, i2);
                }
                if (i3 > 0) {
                    layoutParams3.height = v.a(contextK, i3);
                }
                return layoutParams3;
            }
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                layoutParams = new LinearLayout.LayoutParams(-1, -1);
                int i12 = rect.left;
                if (i12 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).leftMargin = v.a(contextK, i12);
                }
                int i13 = rect.top;
                if (i13 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).topMargin = v.a(contextK, i13);
                }
                int i14 = rect.right;
                if (i14 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).rightMargin = v.a(contextK, i14);
                }
                int i15 = rect.bottom;
                if (i15 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).bottomMargin = v.a(contextK, i15);
                }
                if (i2 > 0) {
                    ((LinearLayout.LayoutParams) layoutParams).width = v.a(contextK, i2);
                }
                if (i3 > 0) {
                    ((LinearLayout.LayoutParams) layoutParams).height = v.a(contextK, i3);
                }
            }
        }
        return layoutParams;
    }

    public void c(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                int iOptInt = jSONObject.optInt("type");
                String strOptString = jSONObject.optString("url");
                int iOptInt2 = jSONObject.optInt("report");
                if (iOptInt2 == 0) {
                    com.smartdigimkt.o.a.a(com.smartdigimkt.m6.b.p().k(), (d) null, "", strOptString, false, iOptInt != 0);
                } else {
                    com.smartdigimkt.o.a.a(com.smartdigimkt.m6.b.p().k(), null, "", strOptString, false, iOptInt != 0, iOptInt2);
                }
            }
            b(obj, "");
        } catch (Throwable unused) {
        }
    }

    public void b(Object obj, JSONObject jSONObject, boolean z2) {
        int iOptInt;
        int iOptInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("targetComponentId");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (linkedHashMapA.containsKey(strOptString2) && linkedHashMapA.containsKey(strOptString3)) {
                View view = linkedHashMapA.get(strOptString2);
                View view2 = linkedHashMapA.get(strOptString3);
                if (view2 != null && view2.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    int iIndexOfChild = viewGroup.indexOfChild(view2);
                    if (jSONObjectOptJSONObject2 == null) {
                        if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            iOptInt = ((BTBaseView) view).getViewWidth();
                            iOptInt2 = ((BTBaseView) view).getViewHeight();
                        } else {
                            rect = null;
                            iOptInt = 0;
                            iOptInt2 = 0;
                        }
                    } else {
                        Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt(TtmlNode.LEFT, -999), jSONObjectOptJSONObject2.optInt("top", -999), jSONObjectOptJSONObject2.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                        iOptInt = jSONObjectOptJSONObject2.optInt("width");
                        iOptInt2 = jSONObjectOptJSONObject2.optInt("height");
                        rect = rect2;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    ViewGroup.LayoutParams layoutParamsA = a(layoutParams, rect, iOptInt, iOptInt2);
                    if (z2) {
                        com.smartdigimkt.j7.c.a(view);
                    }
                    int i2 = iIndexOfChild - 1;
                    viewGroup.addView(view, i2 > -1 ? i2 : 0, layoutParamsA);
                    b(obj, strOptString2);
                    a(obj, "onInsertViewBelow", strOptString2);
                    return;
                }
                a(obj, "view not exist");
                return;
            }
            a(obj, "instanceId not exist");
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void a(Object obj, JSONObject jSONObject) {
        int iOptInt;
        int iOptInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("id");
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (linkedHashMapA.containsKey(strOptString3) && linkedHashMapA.containsKey(strOptString2)) {
                ViewGroup viewGroup = (ViewGroup) linkedHashMapA.get(strOptString2);
                View view = linkedHashMapA.get(strOptString3);
                com.smartdigimkt.j7.c.a(view);
                if (viewGroup != null && view != null) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                    if (view instanceof ATTempContainer) {
                        String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(f40316n), Integer.valueOf(o), Integer.valueOf(f40317p), Integer.valueOf(q), Integer.valueOf(r));
                        ((ATTempContainer) view).setNotchPadding(f40316n, o, f40317p, q, r);
                        for (View view2 : linkedHashMapA.values()) {
                            if (view2 instanceof AnythinkBTContainer) {
                                com.smartdigimkt.j7.c.a(view);
                                ((AnythinkBTContainer) view2).appendSubView((AnythinkBTContainer) view2, (ATTempContainer) view, jSONObjectOptJSONObject2);
                                break;
                            }
                        }
                    } else {
                        if (jSONObjectOptJSONObject2 == null) {
                            if (view instanceof BTBaseView) {
                                rect = ((BTBaseView) view).getRect();
                                iOptInt = ((BTBaseView) view).getViewWidth();
                                iOptInt2 = ((BTBaseView) view).getViewHeight();
                            } else {
                                iOptInt = 0;
                                rect = null;
                                iOptInt2 = 0;
                            }
                        } else {
                            Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt(TtmlNode.LEFT, -999), jSONObjectOptJSONObject2.optInt("top", -999), jSONObjectOptJSONObject2.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                            iOptInt = jSONObjectOptJSONObject2.optInt("width");
                            iOptInt2 = jSONObjectOptJSONObject2.optInt("height");
                            rect = rect2;
                        }
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        if (viewGroup instanceof FrameLayout) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof RelativeLayout) {
                            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof LinearLayout) {
                            layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        }
                        ViewGroup.LayoutParams layoutParamsA = a(layoutParams, rect, iOptInt, iOptInt2);
                        com.smartdigimkt.j7.c.a(view);
                        viewGroup.addView(view, layoutParamsA);
                    }
                    b(obj, strOptString2);
                    a(obj, "onAppendView", strOptString2);
                    return;
                }
                a(obj, "view is not exist");
                return;
            }
            a(obj, "instanceId is not exist");
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    public void b(String str, String str2) {
        try {
            LinkedHashMap<String, View> linkedHashMapA = a(str, str2);
            if (linkedHashMapA != null && !linkedHashMapA.isEmpty()) {
                for (View view : linkedHashMapA.values()) {
                    if (view instanceof AnythinkBTContainer) {
                        ((AnythinkBTContainer) view).addNativeCloseButtonWhenWebViewCrash();
                    }
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void a(Object obj, JSONObject jSONObject, boolean z2) {
        int iOptInt;
        int iOptInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strF = f(strOptString2);
            if (TextUtils.isEmpty(strF) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                strF = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("targetComponentId");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> linkedHashMapA = a(strOptString, strF);
            if (linkedHashMapA.containsKey(strOptString2) && linkedHashMapA.containsKey(strOptString3)) {
                View view = linkedHashMapA.get(strOptString2);
                View view2 = linkedHashMapA.get(strOptString3);
                if (view2 != null && view2.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    int iIndexOfChild = viewGroup.indexOfChild(view2);
                    if (jSONObjectOptJSONObject2 == null) {
                        if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            iOptInt = ((BTBaseView) view).getViewWidth();
                            iOptInt2 = ((BTBaseView) view).getViewHeight();
                        } else {
                            iOptInt = 0;
                            rect = null;
                            iOptInt2 = 0;
                        }
                    } else {
                        Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt(TtmlNode.LEFT, -999), jSONObjectOptJSONObject2.optInt("top", -999), jSONObjectOptJSONObject2.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                        iOptInt = jSONObjectOptJSONObject2.optInt("width");
                        iOptInt2 = jSONObjectOptJSONObject2.optInt("height");
                        rect = rect2;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    ViewGroup.LayoutParams layoutParamsA = a(layoutParams, rect, iOptInt, iOptInt2);
                    if (z2) {
                        com.smartdigimkt.j7.c.a(view);
                    }
                    viewGroup.addView(view, iIndexOfChild + 1, layoutParamsA);
                    b(obj, strOptString2);
                    a(obj, "onInsertViewAbove", strOptString2);
                    return;
                }
                a(obj, "view not exist");
                return;
            }
            a(obj, "instanceId not exist");
        } catch (Throwable th) {
            com.google.firebase.crashlytics.internal.model.a.A(th, this, obj);
        }
    }

    private void a(String str, d dVar) {
        if (f.f34030l == null || TextUtils.isEmpty(dVar.j())) {
            return;
        }
        f.a(str, dVar, "reward");
    }

    public void a(String str, String str2, String str3) {
        try {
            LinkedHashMap<String, View> linkedHashMapA = c().a(str, str2);
            if (linkedHashMapA == null || linkedHashMapA.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapA.values()) {
                if (!(view instanceof ATTempContainer) && !(view instanceof AnythinkBTWebView) && (view instanceof AnythinkBTLayout)) {
                    ((AnythinkBTLayout) view).notifyEvent(str3);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void a(int i2, int i3, int i4, int i5, int i6) {
        String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
        m = com.smartdigimkt.v0.i.a(i2, i3, i4, i5, i6);
        f40316n = i2;
        o = i3;
        f40317p = i4;
        q = i5;
        r = i6;
    }
}
