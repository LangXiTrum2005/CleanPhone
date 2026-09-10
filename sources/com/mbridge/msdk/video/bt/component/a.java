package com.mbridge.msdk.video.bt.component;

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
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.C0594u;
import com.ironsource.V5;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.tools.d0;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.video.bt.module.BTBaseView;
import com.mbridge.msdk.video.bt.module.MBTempContainer;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.bt.module.MBridgeBTLayout;
import com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC;
import com.mbridge.msdk.video.bt.module.MBridgeBTVideoView;
import com.mbridge.msdk.video.bt.module.MBridgeBTWebView;
import com.mbridge.msdk.video.signal.impl.k;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, LinkedHashMap<String, View>> f37114a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static LinkedHashMap<String, String> f37115b = new LinkedHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static LinkedHashMap<String, CampaignEx> f37116c = new LinkedHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static LinkedHashMap<String, com.mbridge.msdk.videocommon.setting.c> f37117d = new LinkedHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static LinkedHashMap<String, String> f37118e = new LinkedHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static LinkedHashMap<String, Integer> f37119f = new LinkedHashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static LinkedHashMap<String, Activity> f37120g = new LinkedHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile int f37121h = 10000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f37122i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f37123j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static String f37124k = "";
    private static int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f37125m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f37126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f37127o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f37128p;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.component.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class RunnableC0192a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f37129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f37131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f37132d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f37133e;

        public RunnableC0192a(Object obj, String str, Rect rect, int i10, int i11) {
            this.f37129a = obj;
            this.f37130b = str;
            this.f37131c = rect;
            this.f37132d = i10;
            this.f37133e = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            String rid;
            WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) this.f37129a).f34912b;
            if (windVaneWebView != null) {
                rid = windVaneWebView.getRid();
            } else {
                rid = "";
                windVaneWebView = null;
            }
            LinkedHashMap<String, View> linkedHashMapB = a.this.b(this.f37130b, rid);
            String strB = a.this.b();
            a.f37115b.put(strB, rid);
            MBridgeBTLayout mBridgeBTLayout = new MBridgeBTLayout(com.mbridge.msdk.foundation.controller.c.n().d());
            linkedHashMapB.put(strB, mBridgeBTLayout);
            mBridgeBTLayout.setInstanceId(strB);
            mBridgeBTLayout.setUnitId(this.f37130b);
            mBridgeBTLayout.setWebView(windVaneWebView);
            mBridgeBTLayout.setRect(this.f37131c);
            int i10 = this.f37132d;
            if (i10 > 0 || this.f37133e > 0) {
                mBridgeBTLayout.setLayout(i10, this.f37133e);
            }
            a.this.b(this.f37129a, strB);
            q0.a("OperateViews", "create view instanceId = " + strB);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f37135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37138d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f37139e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Rect f37140f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f37141g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f37142h;

        public b(Object obj, String str, String str2, String str3, String str4, Rect rect, int i10, int i11) {
            this.f37135a = obj;
            this.f37136b = str;
            this.f37137c = str2;
            this.f37138d = str3;
            this.f37139e = str4;
            this.f37140f = rect;
            this.f37141g = i10;
            this.f37142h = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            String rid;
            WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) this.f37135a).f34912b;
            if (windVaneWebView != null) {
                rid = windVaneWebView.getRid();
            } else {
                rid = "";
                windVaneWebView = null;
            }
            LinkedHashMap<String, View> linkedHashMapB = a.this.b(this.f37136b, rid);
            String strB = a.this.b();
            a.f37115b.put(strB, rid);
            MBridgeBTWebView mBridgeBTWebView = new MBridgeBTWebView(com.mbridge.msdk.foundation.controller.c.n().d());
            linkedHashMapB.put(strB, mBridgeBTWebView);
            mBridgeBTWebView.setInstanceId(strB);
            mBridgeBTWebView.setUnitId(this.f37136b);
            mBridgeBTWebView.setFileURL(this.f37137c);
            mBridgeBTWebView.setFilePath(this.f37138d);
            mBridgeBTWebView.setHtml(this.f37139e);
            mBridgeBTWebView.setRect(this.f37140f);
            mBridgeBTWebView.setWebViewRid(rid);
            mBridgeBTWebView.setCreateWebView(windVaneWebView);
            int i10 = this.f37141g;
            if (i10 > 0 || this.f37142h > 0) {
                mBridgeBTWebView.setLayout(i10, this.f37142h);
            }
            mBridgeBTWebView.preload();
            a.this.b(this.f37135a, strB);
            q0.a("OperateViews", "createWebview instanceId = " + strB);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f37144a;

        public c(CampaignEx campaignEx) {
            this.f37144a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j jVarA = j.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                if (jVarA != null) {
                    if (jVarA.a(this.f37144a.getId())) {
                        jVarA.b(this.f37144a.getId());
                    } else {
                        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                        gVar.a(this.f37144a.getId());
                        gVar.b(this.f37144a.getFca());
                        gVar.c(this.f37144a.getFcb());
                        gVar.a(0);
                        gVar.d(1);
                        gVar.a(System.currentTimeMillis());
                        jVarA.b(gVar);
                    }
                }
                a.this.a(this.f37144a.getCampaignUnitId(), this.f37144a);
            } catch (Throwable th2) {
                q0.b("OperateViews", th2.getMessage(), th2);
            }
        }
    }

    public void A(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (!linkedHashMapB.containsKey(strOptString2)) {
                a(obj, "instanceId not exit");
                q0.a("OperateViews", "playerUnmute failed: instanceId not exit");
                return;
            }
            View view = linkedHashMapB.get(strOptString2);
            if (!(view instanceof MBridgeBTVideoView)) {
                a(obj, "instanceId is not player");
                q0.a("OperateViews", "playerUnmute failed: instanceId is not player");
            } else if (!((MBridgeBTVideoView) view).playUnMute()) {
                b(obj, "set unmute failed");
                q0.a("OperateViews", "playerUnmute failed: set unmute failed");
            } else {
                b(obj, strOptString2);
                a(obj, "onUnmute", strOptString2);
                q0.a("OperateViews", "playerUnmute successed");
            }
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "playerUnmute failed: "), "OperateViews");
        }
    }

    public void B(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
            }
        } catch (Throwable th2) {
            a(obj, th2.getMessage());
        }
    }

    public void C(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (!linkedHashMapB.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapB.get(strOptString2);
            if (!(view instanceof MBTempContainer)) {
                a(obj, "view not exist");
            } else {
                ((MBTempContainer) view).preload();
                b(obj, strOptString2);
            }
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "preloadSubPlayTemplateView failed: "), "OperateViews");
        }
    }

    public void D(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (!linkedHashMapB.containsKey(strOptString2)) {
                a(obj, "params not enough");
                q0.a("OperateViews", "removeFromSuperView failed: params not enough instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapB.get(strOptString2);
            if (view == null || view.getParent() == null) {
                a(obj, "view is null");
                q0.a("OperateViews", "removeFromSuperView failed: view is null instanceId = " + strOptString2);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup == null) {
                a(obj, "parent is null");
                q0.a("OperateViews", "removeFromSuperView failed: parent is null instanceId = " + strOptString2);
                return;
            }
            viewGroup.removeView(view);
            b(obj, strOptString2);
            a(obj, "onRemoveFromView", strOptString2);
            q0.a("OperateViews", "removeFromSuperView instanceId = " + strOptString2);
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "removeFromSuperView failed: "), "OperateViews");
        }
    }

    public void E(Object obj, JSONObject jSONObject) {
        com.mbridge.msdk.videocommon.entity.c cVar;
        try {
            WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b;
            String strOptString = "";
            String rid = windVaneWebView != null ? windVaneWebView.getRid() : "";
            String strOptString2 = jSONObject.optString("unitId");
            String strOptString3 = jSONObject.optString("id");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            String strOptString4 = jSONObjectOptJSONObject.optString("userId");
            boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("expired");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(C0594u.f30746j);
            String strOptString5 = jSONObjectOptJSONObject.optString("extra");
            if (jSONObjectOptJSONObject2 != null) {
                com.mbridge.msdk.videocommon.entity.c cVar2 = new com.mbridge.msdk.videocommon.entity.c(jSONObjectOptJSONObject2.optString("name"), jSONObjectOptJSONObject2.optInt("amount"));
                strOptString = jSONObjectOptJSONObject2.optString("id");
                cVar = cVar2;
            } else {
                cVar = null;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString2, rid);
            if (linkedHashMapB.size() <= 0 || !f37118e.containsKey(strOptString3)) {
                a(obj, "unitId not exist");
                q0.a("OperateViews", "setSubPlayTemplateInfo failed: unitId not exist instanceId = " + strOptString3);
                return;
            }
            View view = linkedHashMapB.get(strOptString3);
            if (!(view instanceof MBTempContainer)) {
                a(obj, "instanceId not exist");
                q0.a("OperateViews", "setSubPlayTemplateInfo failed: instanceId not exist instanceId = " + strOptString3);
                return;
            }
            MBTempContainer mBTempContainer = (MBTempContainer) view;
            mBTempContainer.setReward(cVar);
            mBTempContainer.setUserId(strOptString4);
            mBTempContainer.setRewardId(strOptString);
            mBTempContainer.setCampaignExpired(zOptBoolean);
            if (!TextUtils.isEmpty(strOptString5)) {
                mBTempContainer.setDeveloperExtraData(strOptString5);
            }
            b(obj, strOptString3);
            q0.a("OperateViews", "setSubPlayTemplateInfo success instanceId = " + strOptString3);
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "setSubPlayTemplateInfo failed: "), "OperateViews");
        }
    }

    public void F(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            double dOptDouble = jSONObjectOptJSONObject.optDouble("alpha", 1.0d);
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (!linkedHashMapB.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                q0.a("OperateViews", "setViewAlpha failed: instanceId not exist instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapB.get(strOptString2);
            if (view == null) {
                a(obj, "view not exist");
                q0.a("OperateViews", "setViewAlpha failed: view not exist instanceId = " + strOptString2);
                return;
            }
            view.setAlpha((float) dOptDouble);
            b(obj, strOptString2);
            a(obj, "onViewAlphaChanged", strOptString2);
            q0.a("OperateViews", "setViewAlpha instanceId = " + strOptString2);
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "setViewAlpha failed: "), "OperateViews");
        }
    }

    public void G(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
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
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (!linkedHashMapB.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                q0.a("OperateViews", "setViewBgColor failed: instanceId not exist instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapB.get(strOptString2);
            if (view == null) {
                a(obj, "view not exist");
                q0.a("OperateViews", "setViewBgColor failed: view not exist instanceId = " + strOptString2);
                return;
            }
            b(obj, strOptString2);
            view.setBackgroundColor(Color.parseColor(strOptString3));
            a(obj, "onViewBgColorChanged", strOptString2);
            q0.a("OperateViews", "setViewBgColor instanceId = " + strOptString2);
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "setViewBgColor failed: "), "OperateViews");
        }
    }

    public void H(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
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
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            Rect rect = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject2.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
            int iOptInt = jSONObjectOptJSONObject2.optInt("width");
            int iOptInt2 = jSONObjectOptJSONObject2.optInt("height");
            if (!linkedHashMapB.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                q0.a("OperateViews", "setViewRect failed: instanceId not exist");
                return;
            }
            View view = linkedHashMapB.get(strOptString2);
            if (view == null) {
                a(obj, "view is null");
                q0.a("OperateViews", "setViewRect failed: view is null");
                return;
            }
            if (view.getParent() != null) {
                view.setLayoutParams(a(view.getLayoutParams(), rect, iOptInt, iOptInt2));
                view.requestLayout();
            } else {
                if (view instanceof MBridgeBTWebView) {
                    ((MBridgeBTWebView) view).setRect(rect);
                    ((MBridgeBTWebView) view).setLayout(iOptInt, iOptInt2);
                }
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).setRect(rect);
                    ((MBridgeBTVideoView) view).setLayout(iOptInt, iOptInt2);
                }
            }
            b(obj, strOptString2);
            a(obj, "onViewRectChanged", strOptString2);
            q0.a("OperateViews", "setViewRect instanceId = " + strOptString2);
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "setViewRect failed: "), "OperateViews");
        }
    }

    public void I(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            double dOptDouble = jSONObjectOptJSONObject.optDouble("vertical", 1.0d);
            double dOptDouble2 = jSONObjectOptJSONObject.optDouble("horizon", 1.0d);
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (!linkedHashMapB.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                q0.a("OperateViews", "setViewScale failed: instanceId not exist instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapB.get(strOptString2);
            if (view == null) {
                a(obj, "view not exist");
                q0.a("OperateViews", "setViewScale failed: view not exist instanceId = " + strOptString2);
                return;
            }
            view.setScaleX((float) dOptDouble2);
            view.setScaleY((float) dOptDouble);
            b(obj, strOptString2);
            a(obj, "onViewScaleChanged", strOptString2);
            q0.a("OperateViews", "setViewScale instanceId = " + strOptString2);
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "setViewScale failed: "), "OperateViews");
        }
    }

    public void J(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (!linkedHashMapB.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                q0.a("OperateViews", "showView failed: instanceId not exist instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapB.get(strOptString2);
            if (view == null) {
                a(obj, "view not exist");
                q0.a("OperateViews", "showView failed: view not exist instanceId = " + strOptString2);
                return;
            }
            view.setVisibility(0);
            b(obj, strOptString2);
            a(obj, "onShowView", strOptString2);
            q0.a("OperateViews", "showView instanceId = " + strOptString2);
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "showView failed: "), "OperateViews");
        }
    }

    public void K(Object obj, JSONObject jSONObject) {
        try {
            WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b;
            String rid = windVaneWebView != null ? windVaneWebView.getRid() : "";
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            String strOptString3 = jSONObjectOptJSONObject.optString(X3.i.f27798j0);
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("eventData");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, rid);
            if (linkedHashMapB.size() <= 0) {
                a(obj, "unitId not exist");
                q0.a("OperateViews", "webviewFireEvent failed: unitId not exist");
                return;
            }
            View view = linkedHashMapB.get(strOptString2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt instanceof WindVaneWebView) {
                        f.a().a((WebView) childAt, strOptString3, Base64.encodeToString(jSONObjectOptJSONObject2.toString().getBytes(), 2));
                        b(obj, strOptString2);
                        q0.a("OperateViews", "webviewFireEvent instanceId = " + strOptString2);
                        return;
                    }
                }
            }
            a(obj, "instanceId not exist");
            q0.a("OperateViews", "webviewFireEvent failed: instanceId not exist instanceId = " + strOptString2);
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "webviewFireEvent failed: "), "OperateViews");
        }
    }

    public void L(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (!linkedHashMapB.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                q0.a("OperateViews", "webviewGoBack failed instanceId not exist instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapB.get(strOptString2);
            if (!(view instanceof MBridgeBTWebView)) {
                a(obj, "view not exist");
                q0.a("OperateViews", "webviewGoBack failed view not exist instanceId = " + strOptString2);
                return;
            }
            if (((MBridgeBTWebView) view).webviewGoBack()) {
                b(obj, strOptString2);
                q0.a("OperateViews", "webviewGoBack instanceId = " + strOptString2);
                return;
            }
            a(obj, "webviewGoBack failed");
            q0.a("OperateViews", "webviewGoBack failed instanceId = " + strOptString2);
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "webviewGoBack failed: "), "OperateViews");
        }
    }

    public void M(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (!linkedHashMapB.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                q0.a("OperateViews", "webviewGoForward failed instanceId not exist instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapB.get(strOptString2);
            if (!(view instanceof MBridgeBTWebView)) {
                a(obj, "view not exist");
                q0.a("OperateViews", "webviewGoForward failed view not exist instanceId = " + strOptString2);
                return;
            }
            if (((MBridgeBTWebView) view).webviewGoForward()) {
                b(obj, strOptString2);
                q0.a("OperateViews", "webviewGoForward instanceId = " + strOptString2);
                return;
            }
            a(obj, "webviewGoForward failed");
            q0.a("OperateViews", "webviewGoForward failed instanceId = " + strOptString2);
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "webviewGoForward failed: "), "OperateViews");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void N(Object obj, JSONObject jSONObject) {
        String str;
        Object obj2;
        String str2;
        int iOptInt;
        Rect rect;
        Object obj3;
        int i10;
        WindVaneWebView windVaneWebView;
        Object obj4 = obj;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj4).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj4, "data is empty");
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("content");
            if (jSONObjectOptJSONObject2 == null) {
                a(obj4, "content is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject2.optString("fileURL");
            String strOptString4 = jSONObjectOptJSONObject2.optString(V5.c.f27367c);
            String strOptString5 = jSONObjectOptJSONObject2.optString("html");
            if (TextUtils.isEmpty(strOptString3) && TextUtils.isEmpty(strOptString4) && TextUtils.isEmpty(strOptString5)) {
                a(obj4, "url is empty");
                return;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("campaigns");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                int length = jSONArrayOptJSONArray.length();
                int i11 = 0;
                while (i11 < length) {
                    JSONArray jSONArray = jSONArrayOptJSONArray;
                    CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONArrayOptJSONArray.getJSONObject(i11));
                    if (campaignWithBackData != null) {
                        campaignWithBackData.setCampaignUnitId(strOptString);
                        arrayList.add(campaignWithBackData);
                    }
                    i11++;
                    jSONArrayOptJSONArray = jSONArray;
                }
            }
            String strOptString6 = jSONObjectOptJSONObject2.optString("unitId");
            com.mbridge.msdk.videocommon.setting.c cVarA = com.mbridge.msdk.videocommon.setting.c.a(jSONObjectOptJSONObject2.optJSONObject("unitSetting"));
            if (cVarA != null) {
                cVarA.h(strOptString6);
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("rect");
            Rect rect2 = new Rect(-999, -999, -999, -999);
            if (jSONObjectOptJSONObject3 != null) {
                try {
                    str2 = "OperateViews";
                    try {
                        Rect rect3 = new Rect(jSONObjectOptJSONObject3.optInt("left", -999), jSONObjectOptJSONObject3.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject3.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject3.optInt("bottom", -999));
                        int iOptInt2 = jSONObjectOptJSONObject3.optInt("width");
                        iOptInt = jSONObjectOptJSONObject3.optInt("height");
                        rect = rect3;
                        i10 = iOptInt2;
                    } catch (Throwable th2) {
                        th = th2;
                        obj3 = obj;
                        str = str2;
                        obj2 = obj3;
                        f2.x(th, f2.n(th, this, obj2, "webviewLoad failed: "), str);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str2 = "OperateViews";
                    obj3 = obj;
                    str = str2;
                    obj2 = obj3;
                    f2.x(th, f2.n(th, this, obj2, "webviewLoad failed: "), str);
                }
            } else {
                str2 = "OperateViews";
                iOptInt = 0;
                i10 = 0;
                rect = rect2;
            }
            int iOptInt3 = jSONObjectOptJSONObject2.optInt("refreshCache", 0);
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            try {
                if (!linkedHashMapB.containsKey(strOptString2)) {
                    a(obj, "instanceId not exist");
                    q0.a(str2, "webviewLoad failed: instanceId not exist instanceId = " + strOptString2);
                    return;
                }
                View view = linkedHashMapB.get(strOptString2);
                if (!(view instanceof MBridgeBTWebView)) {
                    a(obj, "view not exist");
                    q0.a(str2, "webviewLoad failed: view not exist instanceId = " + strOptString2);
                    return;
                }
                MBridgeBTWebView mBridgeBTWebView = (MBridgeBTWebView) view;
                mBridgeBTWebView.setHtml(strOptString5);
                mBridgeBTWebView.setFilePath(strOptString4);
                mBridgeBTWebView.setFileURL(strOptString3);
                mBridgeBTWebView.setRect(rect);
                mBridgeBTWebView.setLayout(i10, iOptInt);
                mBridgeBTWebView.setCampaigns(arrayList);
                mBridgeBTWebView.setRewardUnitSetting(cVarA);
                mBridgeBTWebView.webviewLoad(iOptInt3);
                Object obj5 = obj;
                try {
                    b(obj5, strOptString2);
                    q0.a(str2, "webviewLoad instanceId = " + strOptString2);
                } catch (Throwable th4) {
                    th = th4;
                    obj3 = obj5;
                    str = str2;
                    obj2 = obj3;
                    f2.x(th, f2.n(th, this, obj2, "webviewLoad failed: "), str);
                }
            } catch (Throwable th5) {
                th = th5;
                obj2 = i10;
                str = rect;
                f2.x(th, f2.n(th, this, obj2, "webviewLoad failed: "), str);
            }
        } catch (Throwable th6) {
            th = th6;
            str = "OperateViews";
            obj2 = obj4;
        }
    }

    public void O(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (!linkedHashMapB.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                q0.a("OperateViews", "webviewReload failed instanceId not exist instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapB.get(strOptString2);
            if (!(view instanceof MBridgeBTWebView)) {
                a(obj, "view not exist");
                q0.a("OperateViews", "webviewReload failed view not exist instanceId = " + strOptString2);
                return;
            }
            if (((MBridgeBTWebView) view).webviewReload()) {
                b(obj, strOptString2);
                q0.a("OperateViews", "webviewReload instanceId = " + strOptString2);
                return;
            }
            a(obj, "reload failed");
            q0.a("OperateViews", "webviewReload failed reload failed instanceId = " + strOptString2);
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "webviewReload failed: "), "OperateViews");
        }
    }

    public String b() {
        f37121h++;
        return String.valueOf(f37121h);
    }

    public CampaignEx c(String str) {
        if (f37116c.containsKey(str)) {
            return f37116c.get(str);
        }
        return null;
    }

    public void d(String str, String str2) {
        f37115b.put(str, str2);
    }

    public String e(String str) {
        return f37115b.containsKey(str) ? f37115b.get(str) : "";
    }

    public String f(String str) {
        return f37118e.containsKey(str) ? f37118e.get(str) : "";
    }

    public int g(String str) {
        if (f37119f.containsKey(str)) {
            return f37119f.get(str).intValue();
        }
        return 2;
    }

    public void h(String str) {
        f37120g.remove(str);
    }

    public void i(Object obj, JSONObject jSONObject) {
        a aVar;
        Object obj2;
        Throwable th2;
        int i10;
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
                jSONObjectOptJSONObject.optString("fileURL");
                jSONObjectOptJSONObject.optString(V5.c.f27367c);
                jSONObjectOptJSONObject.optString("html");
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                Rect rect = new Rect(-999, -999, -999, -999);
                if (jSONObjectOptJSONObject2 != null) {
                    rect = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject2.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                    int iOptInt3 = jSONObjectOptJSONObject2.optInt("width");
                    iOptInt = jSONObjectOptJSONObject2.optInt("height");
                    i10 = iOptInt3;
                } else {
                    i10 = 0;
                    iOptInt = 0;
                }
                Rect rect2 = rect;
                aVar = this;
                obj2 = obj;
                try {
                    new Handler(Looper.getMainLooper()).postDelayed(aVar.new RunnableC0192a(obj2, strOptString, rect2, i10, iOptInt), iOptInt2);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th2 = th4;
                aVar = this;
                obj2 = obj;
            }
        } catch (Throwable th5) {
            th = th5;
            aVar = this;
            obj2 = obj;
        }
        th2 = th;
        f2.x(th2, f2.n(th2, aVar, obj2, "create view failed："), "OperateViews");
    }

    public void j(Object obj, JSONObject jSONObject) {
        a aVar;
        Object obj2;
        Throwable th2;
        int i10;
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
                String strOptString3 = jSONObjectOptJSONObject.optString(V5.c.f27367c);
                String strOptString4 = jSONObjectOptJSONObject.optString("html");
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                Rect rect = new Rect(-999, -999, -999, -999);
                if (jSONObjectOptJSONObject2 != null) {
                    rect = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject2.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
                    int iOptInt3 = jSONObjectOptJSONObject2.optInt("width");
                    iOptInt = jSONObjectOptJSONObject2.optInt("height");
                    i10 = iOptInt3;
                } else {
                    i10 = 0;
                    iOptInt = 0;
                }
                Rect rect2 = rect;
                aVar = this;
                obj2 = obj;
                try {
                    new Handler(Looper.getMainLooper()).postDelayed(aVar.new b(obj2, strOptString, strOptString2, strOptString3, strOptString4, rect2, i10, iOptInt), iOptInt2);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th2 = th4;
                aVar = this;
                obj2 = obj;
            }
        } catch (Throwable th5) {
            th = th5;
            aVar = this;
            obj2 = obj;
        }
        th2 = th;
        f2.x(th2, f2.n(th2, aVar, obj2, "createWebview failed："), "OperateViews");
    }

    public void k(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") != null && !TextUtils.isEmpty(strOptString)) {
                String strE = e(strOptString2);
                if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                    strE = windVaneWebView.getRid();
                }
                LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
                if (linkedHashMapB == null || !linkedHashMapB.containsKey(strOptString2)) {
                    a(obj, "unitId or instanceId not exist");
                    q0.a("OperateViews", "destroyComponent failed");
                    return;
                }
                View view = linkedHashMapB.get(strOptString2);
                linkedHashMapB.remove(strOptString2);
                if (view != null && view.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                    }
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) view;
                        if (viewGroup2.getChildCount() > 0) {
                            int childCount = viewGroup2.getChildCount();
                            for (int i10 = 0; i10 < childCount; i10++) {
                                View childAt = viewGroup2.getChildAt(i10);
                                if (childAt instanceof MBridgeBTWebView) {
                                    linkedHashMapB.remove(((MBridgeBTWebView) childAt).getInstanceId());
                                    ((MBridgeBTWebView) childAt).onDestory();
                                } else if (childAt instanceof MBridgeBTVideoView) {
                                    linkedHashMapB.remove(((MBridgeBTVideoView) childAt).getInstanceId());
                                    ((MBridgeBTVideoView) childAt).onDestory();
                                } else if (childAt instanceof MBTempContainer) {
                                    linkedHashMapB.remove(((MBTempContainer) childAt).getInstanceId());
                                    ((MBTempContainer) childAt).onDestroy();
                                }
                            }
                        }
                    }
                }
                if (view instanceof MBTempContainer) {
                    ((MBTempContainer) view).onDestroy();
                }
                if (view instanceof MBridgeBTWebView) {
                    ((MBridgeBTWebView) view).onDestory();
                }
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).onDestory();
                }
                b(obj, strOptString2);
                a(obj, "onComponentDestroy", strOptString2);
                q0.a("OperateViews", "destroyComponent instanceId = " + strOptString2);
                return;
            }
            a(obj, "unidId or data is empty");
        } catch (Throwable th2) {
            a(obj, th2.getMessage());
            q0.a("OperateViews", "destroyComponent failed");
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
        } catch (Throwable th2) {
            a(obj, th2.getMessage());
        }
    }

    public void m(Object obj, JSONObject jSONObject) {
        int i10;
        boolean z10;
        String str;
        String str2 = "";
        JSONObject jSONObject2 = new JSONObject();
        int i11 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put("message", "params is null");
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e10) {
                q0.a("OperateViews", e10.getMessage());
                return;
            }
        }
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put("message", "");
            JSONArray jSONArray = jSONObject.getJSONArray("resource");
            if (jSONArray == null || jSONArray.length() <= 0) {
                try {
                    jSONObject2.put("code", 1);
                    jSONObject2.put("message", "resource is null");
                    f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    return;
                } catch (JSONException e11) {
                    q0.a("OperateViews", e11.getMessage());
                    return;
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            int length = jSONArray.length();
            int i12 = 0;
            while (i12 < length) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i12);
                String strOptString = jSONObject3.optString("ref", str2);
                int i13 = jSONObject3.getInt("type");
                JSONObject jSONObject4 = new JSONObject();
                JSONArray jSONArray3 = jSONArray;
                if (i13 != i11 || TextUtils.isEmpty(strOptString)) {
                    str2 = str2;
                    i10 = length;
                    z10 = false;
                    if (i13 == 2 && !TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("type", 2);
                        jSONObject5.put("path", H5DownLoadManager.getInstance().getH5ResAddress(strOptString) == null ? str2 : H5DownLoadManager.getInstance().getH5ResAddress(strOptString));
                        jSONObject4.put(strOptString, jSONObject5);
                        jSONArray2.put(jSONObject4);
                    } else if (i13 == 3 && !TextUtils.isEmpty(strOptString)) {
                        try {
                            File file = new File(strOptString);
                            if (file.exists() && file.isFile() && file.canRead()) {
                                q0.a("OperateViews", "getFileInfo Mraid file " + strOptString);
                                str = "file:////" + strOptString;
                            } else {
                                str = str2;
                            }
                        } catch (Throwable th2) {
                            if (MBridgeConstans.DEBUG) {
                                th2.printStackTrace();
                            }
                        }
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("type", 3);
                        jSONObject6.put("path", str);
                        jSONObject4.put(strOptString, jSONObject6);
                        jSONArray2.put(jSONObject4);
                    } else if (i13 == 4 && !TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject7 = new JSONObject();
                        jSONObject7.put("type", 4);
                        jSONObject7.put("path", u0.a(strOptString) == null ? str2 : u0.a(strOptString));
                        jSONObject4.put(strOptString, jSONObject7);
                        jSONArray2.put(jSONObject4);
                    }
                } else {
                    JSONObject jSONObject8 = new JSONObject();
                    m mVarB = com.mbridge.msdk.foundation.db.m.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d())).b(strOptString);
                    if (mVarB != null) {
                        q0.a("OperateViews", "VideoBean not null");
                        jSONObject8.put("type", 1);
                        i10 = length;
                        jSONObject8.put("videoDataLength", mVarB.d());
                        String strE = mVarB.e();
                        if (TextUtils.isEmpty(strE)) {
                            q0.a("OperateViews", "VideoPath null");
                            jSONObject8.put("path", str2);
                            jSONObject8.put("path4Web", str2);
                        } else {
                            q0.a("OperateViews", "VideoPath not null");
                            jSONObject8.put("path", strE);
                            jSONObject8.put("path4Web", strE);
                        }
                        if (mVarB.b() == 5) {
                            jSONObject8.put("downloaded", 1);
                            z10 = false;
                        } else {
                            z10 = false;
                            jSONObject8.put("downloaded", 0);
                        }
                        jSONObject4.put(strOptString, jSONObject8);
                        jSONArray2.put(jSONObject4);
                    } else {
                        str2 = str2;
                        i10 = length;
                        z10 = false;
                        q0.a("OperateViews", "VideoBean null");
                    }
                }
                i12++;
                jSONArray = jSONArray3;
                length = i10;
                str2 = str2;
                i11 = 1;
            }
            jSONObject2.put("resource", jSONArray2);
            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            return;
        } catch (Throwable th3) {
            jSONObject2.put("code", 1);
            jSONObject2.put("message", th3.getLocalizedMessage());
            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        }
        try {
            jSONObject2.put("code", 1);
            jSONObject2.put("message", th3.getLocalizedMessage());
            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (JSONException e12) {
            q0.a("OperateViews", e12.getMessage());
        }
    }

    public void n(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (!linkedHashMapB.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                q0.a("OperateViews", "hideView failed: instanceId not exist");
                return;
            }
            View view = linkedHashMapB.get(strOptString2);
            if (view == null) {
                a(obj, "view not exist");
                q0.a("OperateViews", "hideView failed: view not exist");
                return;
            }
            view.setVisibility(8);
            b(obj, strOptString2);
            a(obj, "onHideView", strOptString2);
            q0.a("OperateViews", "hideView instanceId = " + strOptString2);
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "hideView failed: + "), "OperateViews");
        }
    }

    public void o(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectOptJSONObject);
            if (campaignWithBackData == null) {
                a(obj, "data camapign is empty");
            } else {
                a(campaignWithBackData);
                b(obj, "");
            }
        } catch (Throwable th2) {
            a(obj, th2.getMessage());
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
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("id");
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (!linkedHashMapB.containsKey(strOptString3) || !linkedHashMapB.containsKey(strOptString2)) {
                a(obj, "instanceId is not exist");
                q0.a("OperateViews", "appendSubView failed: instanceId is not exist");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) linkedHashMapB.get(strOptString2);
            View view = linkedHashMapB.get(strOptString3);
            if (viewGroup != null && view != null) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                if (view instanceof MBTempContainer) {
                    q0.b("OperateViews", "OperateViews setNotchString = ".concat(String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(l), Integer.valueOf(f37125m), Integer.valueOf(f37126n), Integer.valueOf(f37127o), Integer.valueOf(f37128p))));
                    ((MBTempContainer) view).setNotchPadding(l, f37125m, f37126n, f37127o, f37128p);
                    for (View view2 : linkedHashMapB.values()) {
                        if (view2 instanceof MBridgeBTContainer) {
                            f1.a(view);
                            ((MBridgeBTContainer) view2).appendSubView((MBridgeBTContainer) view2, (MBTempContainer) view, jSONObjectOptJSONObject2);
                            break;
                        }
                    }
                } else {
                    if (jSONObjectOptJSONObject2 != null) {
                        Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject2.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
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
                q0.a("OperateViews", "appendSubView parentId = " + strOptString2 + " childId = " + strOptString3);
                return;
            }
            a(obj, "view is not exist");
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "appendSubView failed: "), "OperateViews");
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
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                String strOptString3 = jSONObjectOptJSONObject.optString("id");
                LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
                if (!linkedHashMapB.containsKey(strOptString2) || !linkedHashMapB.containsKey(strOptString3)) {
                    a(obj, "instanceId is not exist");
                    q0.a("OperateViews", "appendViewTo failed: instanceId is not exist");
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) linkedHashMapB.get(strOptString3);
                View view = linkedHashMapB.get(strOptString2);
                if (viewGroup != null && view != null) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                    if (view instanceof MBTempContainer) {
                        for (View view2 : linkedHashMapB.values()) {
                            if (view2 instanceof MBridgeBTContainer) {
                                f1.a(view);
                                ((MBridgeBTContainer) view2).appendSubView((MBridgeBTContainer) view2, (MBTempContainer) view, jSONObjectOptJSONObject2);
                                break;
                            }
                        }
                    } else {
                        if (jSONObjectOptJSONObject2 != null) {
                            Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject2.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
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
                    q0.a("OperateViews", "appendViewTo parentId = " + strOptString3 + " childId = " + strOptString2);
                    return;
                }
                a(obj, "view is not exist");
                return;
            }
            a(obj, "unitId or data is empty");
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "appendViewTo failed: "), "OperateViews");
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
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("targetComponentId");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (!linkedHashMapB.containsKey(strOptString2) || !linkedHashMapB.containsKey(strOptString3)) {
                a(obj, "instanceId not exist");
                q0.a("OperateViews", "insertViewAbove failed: instanceId not exist instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapB.get(strOptString2);
            View view2 = linkedHashMapB.get(strOptString3);
            if (view2 == null || view2.getParent() == null) {
                a(obj, "view not exist");
                q0.a("OperateViews", "insertViewAbove failed: view not exist instanceId = " + strOptString2);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(view2);
            if (jSONObjectOptJSONObject2 != null) {
                Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject2.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
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
            q0.a("OperateViews", "insertViewAbove instanceId = " + strOptString2 + " brotherId = " + strOptString3);
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "insertViewAbove failed: "), "OperateViews");
        }
    }

    public void s(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (!linkedHashMapB.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                q0.a("OperateViews", "playerGetMuteState failed instanceId not exist");
                return;
            }
            View view = linkedHashMapB.get(strOptString2);
            if (!(view instanceof MBridgeBTVideoView)) {
                a(obj, "instanceId is not player");
                q0.a("OperateViews", "playerGetMuteState failed instanceId is not player");
                return;
            }
            int mute = ((MBridgeBTVideoView) view).getMute();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f37122i);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("id", strOptString2);
            jSONObject3.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, mute);
            jSONObject2.put("data", jSONObject3);
            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            q0.a("OperateViews", "playerGetMuteState successed mute = " + mute);
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "playerGetMuteState failed: "), "OperateViews");
        }
    }

    public void t(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (!linkedHashMapB.containsKey(strOptString2)) {
                a(obj, "instanceId not exist");
                q0.a("OperateViews", "playerMute failed: instanceId is not exist");
                return;
            }
            View view = linkedHashMapB.get(strOptString2);
            if (!(view instanceof MBridgeBTVideoView)) {
                a(obj, "instanceId is not player");
                q0.a("OperateViews", "playerMute failed: instanceId is not player");
            } else if (((MBridgeBTVideoView) view).playMute()) {
                b(obj, strOptString2);
                q0.a("OperateViews", "playerMute success");
            } else {
                a(obj, "set mute failed");
                q0.a("OperateViews", "playerMute failed set mute failed");
            }
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "playerMute failed: "), "OperateViews");
        }
    }

    public void u(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (!linkedHashMapB.containsKey(strOptString2)) {
                a(obj, "instanceId not exit");
                q0.a("OperateViews", "playerPause failed instanceId not exit instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapB.get(strOptString2);
            if (view instanceof MBridgeBTVideoView) {
                ((MBridgeBTVideoView) view).pause();
                b(obj, strOptString2);
                q0.a("OperateViews", "playerPause success");
            } else {
                a(obj, "instanceId is not player");
                q0.a("OperateViews", "playerPause failed instanceId is not player instanceId = " + strOptString2);
            }
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "playerPause failed: "), "OperateViews");
        }
    }

    public void v(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (!linkedHashMapB.containsKey(strOptString2)) {
                a(obj, "instanceId not exit");
                q0.a("OperateViews", "playerPlay failed instanceId not exit instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapB.get(strOptString2);
            if (!(view instanceof MBridgeBTVideoView)) {
                a(obj, "instanceId is not player");
                q0.a("OperateViews", "playerPlay failed instanceId is not player instanceId = " + strOptString2);
                return;
            }
            MBridgeBTVideoView mBridgeBTVideoView = (MBridgeBTVideoView) view;
            MBridgeBTContainer mBridgeBTContainerA = a(strOptString, strE);
            if (mBridgeBTContainerA != null) {
                mBridgeBTVideoView.setAdEvents(mBridgeBTContainerA.getAdEvents());
                mBridgeBTVideoView.setAdSession(mBridgeBTContainerA.getAdSession());
                mBridgeBTVideoView.setVideoEvents(mBridgeBTContainerA.getVideoEvents());
            }
            mBridgeBTVideoView.play();
            b(obj, strOptString2);
            q0.a("OperateViews", "playerPlay success");
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "playerPlay failed: "), "OperateViews");
        }
    }

    public void w(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (!linkedHashMapB.containsKey(strOptString2)) {
                a(obj, "instanceId not exit");
                q0.a("OperateViews", "playerResume failed instanceId not exit instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapB.get(strOptString2);
            if (view instanceof MBridgeBTVideoView) {
                ((MBridgeBTVideoView) view).resume();
                b(obj, strOptString2);
                q0.a("OperateViews", "playerResume success");
            } else {
                a(obj, "instanceId is not player");
                q0.a("OperateViews", "playerResume failed instanceId is not player instanceId = " + strOptString2);
            }
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "playerResume failed: "), "OperateViews");
        }
    }

    public void x(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
            } else {
                a(obj, "android mediaPlayer not support setScaleType");
            }
        } catch (Throwable th2) {
            a(obj, th2.getMessage());
        }
    }

    public void y(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
            }
        } catch (Throwable th2) {
            a(obj, th2.getMessage());
        }
    }

    public void z(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (!linkedHashMapB.containsKey(strOptString2)) {
                a(obj, "instanceId not exit");
                q0.a("OperateViews", "playerStop failed instanceId not exit instanceId = " + strOptString2);
                return;
            }
            View view = linkedHashMapB.get(strOptString2);
            if (view instanceof MBridgeBTVideoView) {
                ((MBridgeBTVideoView) view).stop();
                b(obj, strOptString2);
                q0.a("OperateViews", "playerStop success");
            } else {
                a(obj, "instanceId is not player");
                q0.a("OperateViews", "playerStop failed instanceId is not player instanceId = " + strOptString2);
            }
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "playerStop failed: "), "OperateViews");
        }
    }

    public com.mbridge.msdk.videocommon.setting.c d(String str) {
        if (f37117d.containsKey(str)) {
            return f37117d.get(str);
        }
        return null;
    }

    public void h(Object obj, JSONObject jSONObject) {
        String str;
        WindVaneWebView windVaneWebView;
        String str2 = "OperateViews";
        try {
            String strOptString = jSONObject.optString("unitId");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                int iOptInt = jSONObjectOptJSONObject.optInt(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                String rid = "";
                CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectOptJSONObject.optJSONObject(MBInterstitialActivity.INTENT_CAMAPIGN));
                if (campaignWithBackData != null && !TextUtils.isEmpty(strOptString)) {
                    campaignWithBackData.setCampaignUnitId(strOptString);
                    rid = campaignWithBackData.getRequestId();
                }
                com.mbridge.msdk.videocommon.setting.c cVarA = com.mbridge.msdk.videocommon.setting.c.a(jSONObjectOptJSONObject.optJSONObject("unitSetting"));
                if (cVarA != null) {
                    cVarA.h(strOptString);
                }
                String strOptString2 = jSONObjectOptJSONObject.optString("userId");
                if (TextUtils.isEmpty(rid) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                    rid = windVaneWebView.getRid();
                }
                LinkedHashMap<String, View> linkedHashMapB = b(strOptString, rid);
                String strB = b();
                f37115b.put(strB, rid);
                MBTempContainer mBTempContainer = new MBTempContainer(com.mbridge.msdk.foundation.controller.c.n().d());
                try {
                    k kVar = (k) ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b.getObject();
                    mBTempContainer.setAdEvents(kVar.j());
                    mBTempContainer.setAdSession(kVar.k());
                    mBTempContainer.setVideoEvents(kVar.o());
                } catch (Exception e10) {
                    q0.b("OperateViews", e10.getMessage());
                }
                mBTempContainer.setInstanceId(strB);
                mBTempContainer.setUnitId(strOptString);
                mBTempContainer.setCampaign(campaignWithBackData);
                mBTempContainer.setRewardUnitSetting(cVarA);
                mBTempContainer.setBigOffer(true);
                if (!TextUtils.isEmpty(strOptString2)) {
                    mBTempContainer.setUserId(strOptString2);
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(C0594u.f30746j);
                if (jSONObjectOptJSONObject2 != null) {
                    try {
                        String strOptString3 = jSONObjectOptJSONObject2.optString("id");
                        str = "OperateViews";
                        try {
                            com.mbridge.msdk.videocommon.entity.c cVar = new com.mbridge.msdk.videocommon.entity.c(jSONObjectOptJSONObject2.optString("name"), jSONObjectOptJSONObject2.optInt("amount"));
                            if (!TextUtils.isEmpty(strOptString3)) {
                                mBTempContainer.setRewardId(strOptString3);
                            }
                            if (!TextUtils.isEmpty(cVar.c())) {
                                mBTempContainer.setReward(cVar);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = str;
                            f2.x(th, f2.n(th, this, obj, "createSubPlayTemplateView failed："), str2);
                            return;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        f2.x(th, f2.n(th, this, obj, "createSubPlayTemplateView failed："), str2);
                        return;
                    }
                } else {
                    str = "OperateViews";
                }
                String strOptString4 = jSONObjectOptJSONObject.optString("extra");
                if (!TextUtils.isEmpty(strOptString4)) {
                    mBTempContainer.setDeveloperExtraData(strOptString4);
                }
                mBTempContainer.setMute(iOptInt);
                linkedHashMapB.put(strB, mBTempContainer);
                f37118e.put(strB, strOptString);
                f37116c.put(strB, campaignWithBackData);
                f37117d.put(strB, cVarA);
                b(obj, strB);
                q0.a(str, "createSubPlayTemplateView instanceId = " + strB);
                return;
            }
            a(obj, "unitId or data is empty");
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public void a(String str, Activity activity) {
        f37120g.put(str, activity);
    }

    public void b(String str) {
        if (f37119f.containsKey(str)) {
            f37119f.remove(str);
        }
    }

    public void c(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (linkedHashMapB.containsKey(strOptString2)) {
                View view = linkedHashMapB.get(strOptString2);
                if (view != null && view.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.bringChildToFront(view);
                        b(obj, strOptString2);
                        a(obj, "onBringViewToFront", strOptString2);
                        q0.a("OperateViews", "bringViewToFront instanceId = " + strOptString2);
                        return;
                    }
                    a(obj, "parent is null");
                    q0.a("OperateViews", "bringViewToFront failed: parent is null");
                    return;
                }
                a(obj, "view is null");
                q0.a("OperateViews", "bringViewToFront failed: view is null");
                return;
            }
            a(obj, "instanceId is not exist");
            q0.a("OperateViews", "bringViewToFront failed: instanceId is not exist");
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "bringViewToFront failed: "), "OperateViews");
        }
    }

    public void g(Object obj, JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("unitId");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                String rid = "";
                CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectOptJSONObject.optJSONObject(MBInterstitialActivity.INTENT_CAMAPIGN));
                if (campaignWithBackData != null && !TextUtils.isEmpty(strOptString)) {
                    campaignWithBackData.setCampaignUnitId(strOptString);
                    rid = campaignWithBackData.getRequestId();
                }
                int iOptInt = jSONObjectOptJSONObject.optInt("show_time", 0);
                int iOptInt2 = jSONObjectOptJSONObject.optInt("show_mute", 0);
                int iOptInt3 = jSONObjectOptJSONObject.optInt("show_close", 0);
                int iOptInt4 = jSONObjectOptJSONObject.optInt("orientation", 1);
                int iOptInt5 = jSONObjectOptJSONObject.optInt("show_pgb", 0);
                MBridgeBTVideoView mBridgeBTVideoView = new MBridgeBTVideoView(com.mbridge.msdk.foundation.controller.c.n().d());
                try {
                    k kVar = (k) ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b.getObject();
                    mBridgeBTVideoView.setAdEvents(kVar.j());
                    mBridgeBTVideoView.setAdSession(kVar.k());
                    mBridgeBTVideoView.setVideoEvents(kVar.o());
                } catch (Exception e10) {
                    q0.b("OperateViews", e10.getMessage());
                }
                mBridgeBTVideoView.setCampaign(campaignWithBackData);
                mBridgeBTVideoView.setUnitId(strOptString);
                mBridgeBTVideoView.setShowMute(iOptInt2);
                mBridgeBTVideoView.setShowTime(iOptInt);
                mBridgeBTVideoView.setShowClose(iOptInt3);
                mBridgeBTVideoView.setOrientation(iOptInt4);
                mBridgeBTVideoView.setProgressBarState(iOptInt5);
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b;
                if (windVaneWebView != null) {
                    rid = windVaneWebView.getRid();
                    mBridgeBTVideoView.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> linkedHashMapB = b(strOptString, rid);
                String strB = b();
                f37115b.put(strB, rid);
                mBridgeBTVideoView.setInstanceId(strB);
                linkedHashMapB.put(strB, mBridgeBTVideoView);
                mBridgeBTVideoView.preLoadData();
                if (campaignWithBackData == null) {
                    a(obj, "campaign is null");
                    q0.a("OperateViews", "createPlayerView failed");
                } else {
                    b(obj, strB);
                    q0.a("OperateViews", "createPlayerView instanceId = " + strB);
                }
                com.mbridge.msdk.video.bt.component.b.a().a(strB, mBridgeBTVideoView);
                return;
            }
            a(obj, "unitId or data is empty");
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "createPlayerView failed："), "OperateViews");
        }
    }

    public void a(String str, int i10) {
        f37119f.put(str, Integer.valueOf(i10));
    }

    public void d(Object obj, JSONObject jSONObject) {
        try {
            WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b;
            String rid = windVaneWebView != null ? windVaneWebView.getRid() : "";
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString(X3.i.f27798j0);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, rid);
            if (linkedHashMapB != null && linkedHashMapB.size() > 0) {
                for (View view : linkedHashMapB.values()) {
                    if (view instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) view).broadcast(strOptString2, jSONObjectOptJSONObject);
                    }
                    if (view instanceof MBridgeBTLayout) {
                        ((MBridgeBTLayout) view).broadcast(strOptString2, jSONObjectOptJSONObject);
                    }
                }
                b(obj, "");
                return;
            }
            a(obj, "unitId not exist");
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "broadcast failed: "), "OperateViews");
        }
    }

    public void e(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                a(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (linkedHashMapB.size() > 0) {
                MBridgeBTContainer mBridgeBTContainer = null;
                for (View view : linkedHashMapB.values()) {
                    if (view instanceof MBridgeBTContainer) {
                        mBridgeBTContainer = (MBridgeBTContainer) view;
                    } else if (view instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) view).onDestory();
                    } else if (view instanceof MBridgeBTVideoView) {
                        com.mbridge.msdk.video.bt.component.b.a().a(((MBridgeBTVideoView) view).getInstanceId());
                        ((MBridgeBTVideoView) view).onDestory();
                    } else if (view instanceof MBTempContainer) {
                        ((MBTempContainer) view).onDestroy();
                    }
                }
                if (mBridgeBTContainer != null) {
                    mBridgeBTContainer.onAdClose();
                    f37114a.remove(linkedHashMapB);
                    linkedHashMapB.clear();
                    f37114a.remove(strOptString + "_" + strE);
                    b(obj, strOptString2);
                    return;
                }
                a(obj, "not found MBridgeBTContainer");
                q0.a("OperateViews", "closeAd successed");
                return;
            }
            a(obj, "unitId or instanceId not exist");
            q0.a("OperateViews", "closeAd failed: unitId or instanceId not exist unitId = " + strOptString);
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "closeAd failed: "), "OperateViews");
        }
    }

    public void f(Object obj, JSONObject jSONObject) {
        q0.a("OperateViews", "createNativeEC:" + jSONObject);
        try {
            String strOptString = jSONObject.optString("unitId");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                String rid = "";
                CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectOptJSONObject.optJSONObject(MBInterstitialActivity.INTENT_CAMAPIGN));
                if (campaignWithBackData != null && !TextUtils.isEmpty(strOptString)) {
                    campaignWithBackData.setCampaignUnitId(strOptString);
                    rid = campaignWithBackData.getRequestId();
                }
                com.mbridge.msdk.videocommon.setting.c cVarA = com.mbridge.msdk.videocommon.setting.c.a(jSONObjectOptJSONObject.optJSONObject("unitSetting"));
                if (cVarA != null) {
                    cVarA.h(strOptString);
                }
                MBridgeBTNativeEC mBridgeBTNativeEC = new MBridgeBTNativeEC(com.mbridge.msdk.foundation.controller.c.n().d());
                mBridgeBTNativeEC.setCampaign(campaignWithBackData);
                k kVar = new k(null, campaignWithBackData);
                kVar.setUnitId(strOptString);
                mBridgeBTNativeEC.setJSCommon(kVar);
                mBridgeBTNativeEC.setUnitId(strOptString);
                mBridgeBTNativeEC.setRewardUnitSetting(cVarA);
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b;
                if (windVaneWebView != null) {
                    rid = windVaneWebView.getRid();
                    mBridgeBTNativeEC.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> linkedHashMapB = b(strOptString, rid);
                String strB = b();
                f37115b.put(strB, rid);
                mBridgeBTNativeEC.setInstanceId(strB);
                linkedHashMapB.put(strB, mBridgeBTNativeEC);
                mBridgeBTNativeEC.preLoadData();
                if (campaignWithBackData == null) {
                    a(obj, "campaign is null");
                    q0.a("OperateViews", "createNativeEC failed");
                    return;
                } else {
                    b(obj, strB);
                    q0.a("OperateViews", "createNativeEC instanceId = " + strB);
                    return;
                }
            }
            a(obj, "unitId or data is empty");
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "createNativeEC failed："), "OperateViews");
        }
    }

    public void a(String str) {
        if (f37118e.containsKey(str)) {
            f37118e.remove(str);
        }
        if (f37117d.containsKey(str)) {
            f37117d.remove(str);
        }
        if (f37116c.containsKey(str)) {
            f37116c.remove(str);
        }
        if (f37115b.containsKey(str)) {
            f37115b.remove(str);
        }
    }

    public synchronized LinkedHashMap<String, View> b(String str, String str2) {
        if (f37114a.containsKey(str + "_" + str2)) {
            return f37114a.get(str + "_" + str2);
        }
        LinkedHashMap<String, View> linkedHashMap = new LinkedHashMap<>();
        f37114a.put(str + "_" + str2, linkedHashMap);
        return linkedHashMap;
    }

    public void b(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f37122i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            a(obj, e10.getMessage());
            q0.a("OperateViews", e10.getMessage());
        }
    }

    public void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f37123j);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            q0.a("OperateViews", e10.getMessage());
        }
    }

    public void b(Object obj, JSONObject jSONObject) {
        int iOptInt;
        int iOptInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                String strOptString3 = jSONObjectOptJSONObject.optString("id");
                LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
                if (linkedHashMapB.containsKey(strOptString2) && linkedHashMapB.containsKey(strOptString3)) {
                    ViewGroup viewGroup = (ViewGroup) linkedHashMapB.get(strOptString3);
                    View view = linkedHashMapB.get(strOptString2);
                    f1.a(view);
                    if (viewGroup != null && view != null) {
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                        if (view instanceof MBTempContainer) {
                            for (View view2 : linkedHashMapB.values()) {
                                if (view2 instanceof MBridgeBTContainer) {
                                    f1.a(view);
                                    ((MBridgeBTContainer) view2).appendSubView((MBridgeBTContainer) view2, (MBTempContainer) view, jSONObjectOptJSONObject2);
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
                                Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject2.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
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
                            f1.a(view);
                            viewGroup.addView(view, layoutParamsA);
                        }
                        b(obj, strOptString2);
                        a(obj, "onAppendViewTo", strOptString2);
                        q0.a("OperateViews", "appendViewTo parentId = " + strOptString3 + " childId = " + strOptString2);
                        return;
                    }
                    a(obj, "view is not exist");
                    return;
                }
                a(obj, "instanceId is not exist");
                q0.a("OperateViews", "appendViewTo failed: instanceId is not exist");
                return;
            }
            a(obj, "unitId or data is empty");
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "appendViewTo failed: "), "OperateViews");
        }
    }

    public void a(WebView webView, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f37123j);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            f.a().b(webView, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            q0.a("OperateViews", e10.getMessage());
        }
    }

    public void a(Object obj, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f37122i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put("data", jSONObject2);
            f.a().a(obj, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            a(obj, e10.getMessage());
            q0.a("OperateViews", e10.getMessage());
        }
    }

    public void a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f37122i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put("data", jSONObject2);
            f.a().a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            a(webView, e10.getMessage());
            q0.a("OperateViews", e10.getMessage());
        }
    }

    public void c(Object obj, String str) {
        q0.a("OperateViews", "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                int iOptInt = jSONObject.optInt("type");
                String strA = v0.a(jSONObject.optString("url"), "&tun=", m0.A() + "");
                int iOptInt2 = jSONObject.optInt("report");
                if (iOptInt2 == 0) {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), (CampaignEx) null, "", strA, false, iOptInt != 0);
                } else {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), (CampaignEx) null, "", strA, false, iOptInt != 0, iOptInt2);
                }
            }
            b(obj, "");
        } catch (Throwable th2) {
            q0.b("OperateViews", "reportUrls", th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.widget.LinearLayout$LayoutParams] */
    public ViewGroup.LayoutParams a(ViewGroup.LayoutParams layoutParams, Rect rect, int i10, int i11) {
        if (rect == null) {
            rect = new Rect(-999, -999, -999, -999);
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                int i12 = rect.left;
                if (i12 != -999) {
                    layoutParams2.leftMargin = v0.a(contextD, i12);
                }
                int i13 = rect.top;
                if (i13 != -999) {
                    layoutParams2.topMargin = v0.a(contextD, i13);
                }
                int i14 = rect.right;
                if (i14 != -999) {
                    layoutParams2.rightMargin = v0.a(contextD, i14);
                }
                int i15 = rect.bottom;
                if (i15 != -999) {
                    layoutParams2.bottomMargin = v0.a(contextD, i15);
                }
                if (i10 > 0) {
                    layoutParams2.width = v0.a(contextD, i10);
                }
                if (i11 > 0) {
                    layoutParams2.height = v0.a(contextD, i11);
                }
                return layoutParams2;
            }
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                int i16 = rect.left;
                if (i16 != -999) {
                    layoutParams3.leftMargin = v0.a(contextD, i16);
                }
                int i17 = rect.top;
                if (i17 != -999) {
                    layoutParams3.topMargin = v0.a(contextD, i17);
                }
                int i18 = rect.right;
                if (i18 != -999) {
                    layoutParams3.rightMargin = v0.a(contextD, i18);
                }
                int i19 = rect.bottom;
                if (i19 != -999) {
                    layoutParams3.bottomMargin = v0.a(contextD, i19);
                }
                if (i10 > 0) {
                    layoutParams3.width = v0.a(contextD, i10);
                }
                if (i11 > 0) {
                    layoutParams3.height = v0.a(contextD, i11);
                }
                return layoutParams3;
            }
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                layoutParams = new LinearLayout.LayoutParams(-1, -1);
                int i20 = rect.left;
                if (i20 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).leftMargin = v0.a(contextD, i20);
                }
                int i21 = rect.top;
                if (i21 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).topMargin = v0.a(contextD, i21);
                }
                int i22 = rect.right;
                if (i22 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).rightMargin = v0.a(contextD, i22);
                }
                int i23 = rect.bottom;
                if (i23 != -999) {
                    ((LinearLayout.LayoutParams) layoutParams).bottomMargin = v0.a(contextD, i23);
                }
                if (i10 > 0) {
                    ((LinearLayout.LayoutParams) layoutParams).width = v0.a(contextD, i10);
                }
                if (i11 > 0) {
                    ((LinearLayout.LayoutParams) layoutParams).height = v0.a(contextD, i11);
                }
            }
        }
        return layoutParams;
    }

    public void c(String str, String str2) {
        try {
            LinkedHashMap<String, View> linkedHashMapB = b(str, str2);
            if (linkedHashMapB != null && !linkedHashMapB.isEmpty()) {
                for (View view : linkedHashMapB.values()) {
                    if (view instanceof MBridgeBTContainer) {
                        ((MBridgeBTContainer) view).addNativeCloseButtonWhenWebViewCrash();
                    }
                }
            }
        } catch (Throwable th2) {
            q0.b("OperateViews", th2.getMessage());
        }
    }

    public void b(Object obj, JSONObject jSONObject, boolean z10) {
        int iOptInt;
        int iOptInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("targetComponentId");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (linkedHashMapB.containsKey(strOptString2) && linkedHashMapB.containsKey(strOptString3)) {
                View view = linkedHashMapB.get(strOptString2);
                View view2 = linkedHashMapB.get(strOptString3);
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
                        Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject2.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
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
                    if (z10) {
                        f1.a(view);
                    }
                    int i10 = iIndexOfChild - 1;
                    viewGroup.addView(view, i10 > -1 ? i10 : 0, layoutParamsA);
                    b(obj, strOptString2);
                    a(obj, "onInsertViewBelow", strOptString2);
                    q0.a("OperateViews", "insertViewBelow instanceId = " + strOptString2);
                    return;
                }
                a(obj, "view not exist");
                q0.a("OperateViews", "insertViewBelow failed: view not exist instanceId = " + strOptString2);
                return;
            }
            a(obj, "instanceId not exist");
            q0.a("OperateViews", "insertViewBelow failed: instanceId not exist instanceId = " + strOptString2);
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "insertViewBelow failed: "), "OperateViews");
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
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("id");
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (linkedHashMapB.containsKey(strOptString3) && linkedHashMapB.containsKey(strOptString2)) {
                ViewGroup viewGroup = (ViewGroup) linkedHashMapB.get(strOptString2);
                View view = linkedHashMapB.get(strOptString3);
                f1.a(view);
                if (viewGroup != null && view != null) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                    if (view instanceof MBTempContainer) {
                        q0.b("OperateViews", "OperateViews setNotchString = ".concat(String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(l), Integer.valueOf(f37125m), Integer.valueOf(f37126n), Integer.valueOf(f37127o), Integer.valueOf(f37128p))));
                        ((MBTempContainer) view).setNotchPadding(l, f37125m, f37126n, f37127o, f37128p);
                        for (View view2 : linkedHashMapB.values()) {
                            if (view2 instanceof MBridgeBTContainer) {
                                f1.a(view);
                                try {
                                    MBTempContainer mBTempContainer = (MBTempContainer) view;
                                    k kVar = (k) ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b.getObject();
                                    mBTempContainer.setAdEvents(kVar.j());
                                    mBTempContainer.setAdSession(kVar.k());
                                    mBTempContainer.setVideoEvents(kVar.o());
                                } catch (Exception e10) {
                                    q0.b("OperateViews", e10.getMessage());
                                }
                                ((MBridgeBTContainer) view2).appendSubView((MBridgeBTContainer) view2, (MBTempContainer) view, jSONObjectOptJSONObject2);
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
                            Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject2.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
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
                        f1.a(view);
                        viewGroup.addView(view, layoutParamsA);
                    }
                    b(obj, strOptString2);
                    a(obj, "onAppendView", strOptString2);
                    q0.a("OperateViews", "appendSubView parentId = " + strOptString2 + " childId = " + strOptString3);
                    return;
                }
                a(obj, "view is not exist");
                return;
            }
            a(obj, "instanceId is not exist");
            q0.a("OperateViews", "appendSubView failed: instanceId is not exist");
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "appendSubView failed: "), "OperateViews");
        }
    }

    public void a(Object obj, JSONObject jSONObject, boolean z10) {
        int iOptInt;
        int iOptInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strE = e(strOptString2);
            if (TextUtils.isEmpty(strE) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                strE = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("targetComponentId");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> linkedHashMapB = b(strOptString, strE);
            if (linkedHashMapB.containsKey(strOptString2) && linkedHashMapB.containsKey(strOptString3)) {
                View view = linkedHashMapB.get(strOptString2);
                View view2 = linkedHashMapB.get(strOptString3);
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
                        Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt("left", -999), jSONObjectOptJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999), jSONObjectOptJSONObject2.optInt(TtmlNode.RIGHT, -999), jSONObjectOptJSONObject2.optInt("bottom", -999));
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
                    if (z10) {
                        f1.a(view);
                    }
                    viewGroup.addView(view, iIndexOfChild + 1, layoutParamsA);
                    b(obj, strOptString2);
                    a(obj, "onInsertViewAbove", strOptString2);
                    q0.a("OperateViews", "insertViewAbove instanceId = " + strOptString2 + " brotherId = " + strOptString3);
                    return;
                }
                a(obj, "view not exist");
                q0.a("OperateViews", "insertViewAbove failed: view not exist instanceId = " + strOptString2);
                return;
            }
            a(obj, "instanceId not exist");
            q0.a("OperateViews", "insertViewAbove failed: instanceId not exist instanceId = " + strOptString2);
        } catch (Throwable th2) {
            f2.x(th2, f2.n(th2, this, obj, "insertViewAbove failed: "), "OperateViews");
        }
    }

    private MBridgeBTContainer a(String str, String str2) {
        LinkedHashMap<String, View> linkedHashMapB = b(str, str2);
        if (linkedHashMapB.size() <= 0) {
            return null;
        }
        for (View view : linkedHashMapB.values()) {
            if (view instanceof MBridgeBTContainer) {
                return (MBridgeBTContainer) view;
            }
        }
        return null;
    }

    private void a(CampaignEx campaignEx) {
        new Thread(new c(campaignEx)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, CampaignEx campaignEx) {
        if (com.mbridge.msdk.foundation.same.buffer.b.f33755k == null || TextUtils.isEmpty(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.buffer.b.a(str, campaignEx, C0594u.f30746j);
    }

    public void a(int i10, int i11, int i12, int i13, int i14) {
        q0.a("OperateViews", "OperateViews setNotchString = ".concat(String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14))));
        f37124k = d0.a(i10, i11, i12, i13, i14);
        l = i10;
        f37125m = i11;
        f37126n = i12;
        f37127o = i13;
        f37128p = i14;
    }
}
