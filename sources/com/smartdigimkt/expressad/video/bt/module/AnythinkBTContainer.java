package com.smartdigimkt.expressad.video.bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.d9;
import com.smartdigimkt.b2.h;
import com.smartdigimkt.c0.f;
import com.smartdigimkt.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.expressad.video.signal.container.AbstractJSContainer;
import com.smartdigimkt.expressad.widget.FeedBackButton;
import com.smartdigimkt.f1.k;
import com.smartdigimkt.v0.i;
import com.smartdigimkt.v0.n;
import com.smartdigimkt.v0.u;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.z2.j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AnythinkBTContainer extends AbstractJSContainer implements com.smartdigimkt.x2.b {
    private static final String Z0 = "AnythinkBTContainer";
    private WindVaneWebView A0;
    private LayoutInflater B0;
    private Context C0;
    private TextView D0;
    private ImageView E0;
    private boolean F0;
    private boolean G0;
    private String H0;
    private boolean I0;
    private List<com.smartdigimkt.x.d> J0;
    private List<com.smartdigimkt.c3.c> K0;
    private com.smartdigimkt.a2.a L0;
    private h M0;
    private h N0;
    private com.smartdigimkt.a2.b O0;
    private String P0;
    private String Q0;
    private boolean R0;
    private int S0;
    private boolean T0;
    private int U0;
    private String V0;
    private com.smartdigimkt.i2.d W0;
    private com.smartdigimkt.s2.a X0;
    com.smartdigimkt.x.d Y0;
    private int w0;
    private int x0;
    private FrameLayout y0;
    private AnythinkBTLayout z0;

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AnythinkBTContainer.this.onAdClose();
        }
    }

    public class e extends com.smartdigimkt.z2.c.a {
        private e() {
        }

        @Override // com.smartdigimkt.z2.c.a, com.smartdigimkt.x2.c.a
        public void a() {
            super.a();
        }

        @Override // com.smartdigimkt.z2.c.a, com.smartdigimkt.x2.c.a
        public void b() {
            super.b();
        }

        @Override // com.smartdigimkt.z2.c.a, com.smartdigimkt.f1.q.c
        public void onFinishRedirection(k kVar, String str) {
            super.onFinishRedirection(kVar, str);
            AnythinkBTContainer.this.a(kVar);
            if (kVar == null || !(kVar instanceof com.smartdigimkt.x.d)) {
                return;
            }
            try {
                com.smartdigimkt.x.d dVar = (com.smartdigimkt.x.d) kVar;
                String strOptString = new JSONObject(AnythinkBTContainer.this.getJSVideoModule().getCurrentProgress()).optString("progress", "");
                if (dVar.e1() == 3 && dVar.y0() == 2 && strOptString.equals("1.0") && ((AbstractJSContainer) AnythinkBTContainer.this).g0 != null) {
                    if (AnythinkBTContainer.this.G0) {
                        AnythinkBTContainer.this.onAdClose();
                    } else {
                        ((AbstractJSContainer) AnythinkBTContainer.this).g0.finish();
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.smartdigimkt.z2.c.a, com.smartdigimkt.f1.q.c
        public void onRedirectionFailed(k kVar, String str) {
            super.onRedirectionFailed(kVar, str);
            AnythinkBTContainer.this.a(kVar);
        }

        public /* synthetic */ e(AnythinkBTContainer anythinkBTContainer, a aVar) {
            this();
        }

        @Override // com.smartdigimkt.z2.c.a, com.smartdigimkt.f1.q.c
        public void a(com.smartdigimkt.x.d dVar, String str) {
            super.a(dVar, str);
            u.b(dVar, AnythinkBTContainer.this.y0);
        }

        @Override // com.smartdigimkt.z2.c.a, com.smartdigimkt.x2.c.a
        public void a(com.smartdigimkt.x.d dVar, boolean z2) {
            super.a(dVar, z2);
            AnythinkBTContainer.this.N0.onVideoAdClicked(dVar);
        }

        @Override // com.smartdigimkt.z2.c.a, com.smartdigimkt.x2.c.a
        public void a(int i2, String str) {
            super.a(i2, str);
        }
    }

    public AnythinkBTContainer(Context context) {
        super(context);
        this.w0 = 0;
        this.x0 = 1;
        this.F0 = false;
        this.G0 = true;
        this.I0 = false;
        this.S0 = 1;
        init(context);
    }

    private int getCBPRuleType() {
        return 1;
    }

    private boolean j(int i2) {
        return true;
    }

    private void n() {
    }

    public void addNativeCloseButtonWhenWebViewCrash() {
        try {
            ImageView imageView = new ImageView(com.smartdigimkt.m6.b.p().k());
            int iA = v.a(com.smartdigimkt.m6.b.p().k(), 48.0f);
            int iA2 = v.a(com.smartdigimkt.m6.b.p().k(), 20.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
            layoutParams.setMargins(iA2, iA2, iA2, iA2);
            layoutParams.gravity = 5;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(com.smartdigimkt.v0.k.a(com.smartdigimkt.m6.b.p().k(), "sdm_reward_close", com.smartdigimkt.v0.k.d));
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setOnClickListener(new d());
            addView(imageView);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void appendSubView(AnythinkBTContainer anythinkBTContainer, ATTempContainer aTTempContainer, JSONObject jSONObject) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (jSONObject != null) {
                Context contextK = com.smartdigimkt.m6.b.p().k();
                int iOptInt = jSONObject.optInt(TtmlNode.LEFT, -999);
                int iOptInt2 = jSONObject.optInt("top", -999);
                int iOptInt3 = jSONObject.optInt(TtmlNode.RIGHT, -999);
                int iOptInt4 = jSONObject.optInt("bottom", -999);
                if (iOptInt != -999 && contextK != null) {
                    layoutParams.leftMargin = v.a(contextK, iOptInt);
                }
                if (iOptInt2 != -999 && contextK != null) {
                    layoutParams.topMargin = v.a(contextK, iOptInt2);
                }
                if (iOptInt3 != -999 && contextK != null) {
                    layoutParams.rightMargin = v.a(contextK, iOptInt3);
                }
                if (iOptInt4 != -999 && contextK != null) {
                    layoutParams.bottomMargin = v.a(contextK, iOptInt4);
                }
                int iOptInt5 = jSONObject.optInt("width");
                int iOptInt6 = jSONObject.optInt("height");
                if (iOptInt5 > 0) {
                    layoutParams.width = iOptInt5;
                }
                if (iOptInt6 > 0) {
                    layoutParams.height = iOptInt6;
                }
            }
            anythinkBTContainer.addView(aTTempContainer, layoutParams);
            aTTempContainer.setActivity(this.g0);
            aTTempContainer.setMute(this.n0);
            aTTempContainer.setBidCampaign(this.F0);
            aTTempContainer.setIV(this.o0);
            aTTempContainer.setBigOffer(this.G0);
            aTTempContainer.setIVRewardEnable(this.q0, this.r0, this.s0);
            aTTempContainer.setShowRewardListener(this.N0);
            aTTempContainer.setCampaignDownLoadTask(c(aTTempContainer.getCampaign()));
            aTTempContainer.setAnythinkTempCallback(m());
            aTTempContainer.setH5Cbp(getJSCommon().e());
            aTTempContainer.setWebViewFront(getJSCommon().c());
            aTTempContainer.init(this.C0);
            aTTempContainer.onCreate();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.A0 != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", this.w0);
                jSONObject2.put("id", this.H0);
                jSONObject2.put(d9.h.j0, str);
                jSONObject2.put("data", jSONObject);
                com.smartdigimkt.n.h.a().a((WebView) this.A0, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.smartdigimkt.z1.c.c().a((WebView) this.A0, "broadcast", this.H0);
            }
        }
    }

    @Override // com.smartdigimkt.x2.d
    public void click(int i2, String str) {
    }

    public int findID(String str) {
        return com.smartdigimkt.v0.k.a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return com.smartdigimkt.v0.k.a(getContext(), str, "layout");
    }

    @Override // com.smartdigimkt.x2.d
    public void handlerH5Exception(int i2, String str) {
    }

    public void init(Context context) {
        this.C0 = context;
        this.B0 = LayoutInflater.from(context);
    }

    public boolean isNativeKilledCallback(com.smartdigimkt.x.d dVar) {
        if (getJSCommon().e() != 1 && dVar != null) {
            if (dVar.a2() == 1) {
                com.smartdigimkt.f3.d dVar2 = this.j0;
                if (dVar2 != null) {
                    if (dVar2.P() == 1) {
                        dVar.v(1);
                        return true;
                    }
                    dVar.v(0);
                    return false;
                }
            } else {
                if (dVar.D2()) {
                    dVar.v(0);
                    return false;
                }
                int iX = this.j0.x();
                dVar.v(iX);
                if (iX == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public void onAdClose() {
        Activity activity = this.g0;
        if (activity != null) {
            activity.finish();
        }
    }

    public void onBackPressed() {
        try {
            LinkedHashMap<String, View> linkedHashMapA = com.smartdigimkt.z1.c.c().a(this.h0, this.Q0);
            if (linkedHashMapA == null || linkedHashMapA.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapA.values()) {
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).onBackPressed();
                } else if (view instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) view).onBackPressed();
                } else if (view instanceof AnythinkBTLayout) {
                    ((AnythinkBTLayout) view).onBackPressed();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        try {
            LinkedHashMap<String, View> linkedHashMapA = com.smartdigimkt.z1.c.c().a(this.h0, this.Q0);
            if (linkedHashMapA == null || linkedHashMapA.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapA.values()) {
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).onConfigurationChanged(configuration);
                } else if (view instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) view).onConfigurationChanged(configuration);
                } else if (view instanceof AnythinkBTLayout) {
                    ((AnythinkBTLayout) view).onConfigurationChanged(configuration);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void onCreate() {
        String strG0;
        com.smartdigimkt.x.d dVar;
        try {
            int iFindLayout = findLayout("sdm_bt_container");
            if (iFindLayout < 0) {
                b("sdm_bt_container layout null");
                return;
            }
            FrameLayout frameLayout = (FrameLayout) this.B0.inflate(iFindLayout, this);
            this.y0 = frameLayout;
            if (frameLayout == null) {
                b("ViewIds null");
                return;
            }
            this.Q0 = "";
            List<com.smartdigimkt.x.d> list = this.J0;
            if (list == null || list.size() <= 0) {
                strG0 = "";
            } else {
                com.smartdigimkt.x.d dVar2 = this.J0.get(0);
                strG0 = dVar2.g0();
                this.Q0 = dVar2.N1();
            }
            this.A0 = c(this.h0 + "_" + this.Q0 + "_" + strG0);
            com.smartdigimkt.a3.a.g(this.h0 + "_" + this.Q0 + "_" + strG0);
            WindVaneWebView windVaneWebView = this.A0;
            if (windVaneWebView == null) {
                List<com.smartdigimkt.x.d> list2 = this.J0;
                if (list2 == null || list2.size() <= 0 || (dVar = this.J0.get(0)) == null || !dVar.H2()) {
                    b("big template webview is null");
                    return;
                } else {
                    b(this.C0);
                    return;
                }
            }
            com.smartdigimkt.y2.b bVar = new com.smartdigimkt.y2.b(this.g0, this, windVaneWebView);
            registerJsFactory(bVar);
            this.A0.setApiManagerJSFactory(bVar);
            if (this.A0.getParent() != null) {
                b("preload template webview is null or load error");
                return;
            }
            RelativeLayout.LayoutParams layoutParams = null;
            byte b2 = 0;
            if (this.A0.getObject() instanceof j) {
                bVar.a((j) this.A0.getObject());
                if (this.A0 != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(com.smartdigimkt.b0.a.l2, v.d(getContext()));
                    try {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("name", this.l0.c());
                            jSONObject2.put("amount", this.l0.a());
                            jSONObject2.put("id", this.m0);
                            jSONObject.put("userId", this.k0);
                            jSONObject.put("reward", jSONObject2);
                            jSONObject.put("playVideoMute", this.n0);
                            jSONObject.put("extra", this.V0);
                        } catch (JSONException e2) {
                            e2.getMessage();
                        }
                    } catch (Exception e3) {
                        e3.getMessage();
                    }
                    this.N0 = new com.smartdigimkt.b2.d(m(), "");
                    getJSNotifyProxy().a(jSONObject.toString());
                    getJSCommon().b(true);
                    getJSCommon().a(new e(this, b2 == true ? 1 : 0));
                }
                ((com.smartdigimkt.z2.c) getJSCommon()).o0.a();
            }
            this.A0.setBackgroundColor(0);
            LinkedHashMap<String, View> linkedHashMapA = com.smartdigimkt.z1.c.c().a(this.h0, this.Q0);
            if (linkedHashMapA == null || !linkedHashMapA.containsKey(this.H0)) {
                b("big template webviewLayout is null");
                return;
            }
            View view = linkedHashMapA.get(this.H0);
            if (view instanceof AnythinkBTLayout) {
                AnythinkBTLayout anythinkBTLayout = (AnythinkBTLayout) view;
                this.z0 = anythinkBTLayout;
                anythinkBTLayout.addView(this.A0, 0, new FrameLayout.LayoutParams(-1, -1));
                com.smartdigimkt.z.b.b().a(this.h0 + "_1", new a());
                com.smartdigimkt.z.b.b().d(this.h0 + "_2");
                FeedBackButton feedBackButtonA = com.smartdigimkt.z.b.b().a(this.h0 + "_1");
                if (com.smartdigimkt.z.b.b().a() && feedBackButtonA != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) feedBackButtonA.getLayoutParams();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(com.smartdigimkt.z.b.d, com.smartdigimkt.z.b.f40278e);
                    }
                    layoutParams.topMargin = v.a(com.smartdigimkt.m6.b.p().k(), 10.0f);
                    layoutParams.leftMargin = v.a(com.smartdigimkt.m6.b.p().k(), 10.0f);
                    feedBackButtonA.setLayoutParams(layoutParams);
                    ViewGroup viewGroup = (ViewGroup) feedBackButtonA.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(feedBackButtonA);
                    }
                    this.z0.addView(feedBackButtonA);
                }
                this.z0.setTag(this.H0);
                linkedHashMapA.put(this.H0, this.z0);
                for (View view2 : linkedHashMapA.values()) {
                    if (view2 instanceof AnythinkBTRootLayout) {
                        AnythinkBTRootLayout anythinkBTRootLayout = (AnythinkBTRootLayout) view2;
                        this.P0 = anythinkBTRootLayout.getInstanceId();
                        this.y0.addView(anythinkBTRootLayout, new FrameLayout.LayoutParams(-1, -1));
                        break;
                    }
                }
                linkedHashMapA.remove(this.P0);
                linkedHashMapA.put(this.P0, this);
            }
            com.smartdigimkt.z1.c.c().a(this.h0, this.n0);
            com.smartdigimkt.z1.c.c().d(this.H0, this.Q0);
            com.smartdigimkt.z1.c.c().d(this.P0, this.Q0);
            com.smartdigimkt.z1.c.c().a(this.h0 + "_" + this.Q0, this.g0);
            List<com.smartdigimkt.x.d> list3 = this.J0;
            if (list3 == null || list3.size() <= 0) {
                return;
            }
            a(this.j0, this.J0.get(0));
        } catch (Throwable th) {
            b("onCreate exception " + th);
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        if (this.I0) {
            return;
        }
        this.I0 = true;
        super.onDestroy();
        com.smartdigimkt.z1.c.c().i(this.h0 + "_" + this.Q0);
        n();
        try {
            WindVaneWebView windVaneWebView = this.A0;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.A0.clearWebView();
                this.A0.release();
            }
            if (this.O0 != null) {
                this.O0 = null;
            }
            if (this.L0 != null) {
                this.L0 = null;
            }
            if (this.C0 != null) {
                this.C0 = null;
            }
            List<com.smartdigimkt.x.d> list = this.J0;
            if (list != null && list.size() > 0) {
                for (com.smartdigimkt.x.d dVar : this.J0) {
                    if (dVar != null && dVar.U1() != null) {
                        com.smartdigimkt.a3.a.g(this.h0 + "_" + dVar.N1() + "_" + dVar.U1().f());
                    }
                }
                com.smartdigimkt.e2.a.a().d();
            }
            com.smartdigimkt.z1.c.c().c(this.h0, this.Q0);
            com.smartdigimkt.z1.c.c().a(this.H0);
            com.smartdigimkt.z1.c.c().b(this.h0);
            com.smartdigimkt.z1.c.c().a(this.h0, this.Q0).remove(this.H0);
            com.smartdigimkt.z1.c.c().a(this.h0, this.Q0).remove(this.P0);
            com.smartdigimkt.z1.c.c().a(this.h0, this.Q0).clear();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.smartdigimkt.expressad.video.signal.container.AbstractJSContainer
    public void onPause() {
        com.smartdigimkt.x.d dVar;
        super.onPause();
        List<com.smartdigimkt.x.d> list = this.J0;
        if (list != null && list.size() > 0 && (dVar = this.J0.get(0)) != null && dVar.H2()) {
            com.smartdigimkt.e2.a.a().b();
        }
        try {
            LinkedHashMap<String, View> linkedHashMapA = com.smartdigimkt.z1.c.c().a(this.h0, this.Q0);
            if (linkedHashMapA == null || linkedHashMapA.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapA.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).onPause();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.container.AbstractJSContainer
    public void onResume() {
        com.smartdigimkt.x.d dVar;
        super.onResume();
        List<com.smartdigimkt.x.d> list = this.J0;
        if (list != null && list.size() > 0 && (dVar = this.J0.get(0)) != null && dVar.H2()) {
            com.smartdigimkt.e2.a.a().c();
        }
        if (com.smartdigimkt.z.b.f) {
            return;
        }
        try {
            LinkedHashMap<String, View> linkedHashMapA = com.smartdigimkt.z1.c.c().a(this.h0, this.Q0);
            if (linkedHashMapA == null || linkedHashMapA.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapA.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).onResume(this.X0);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.container.AbstractJSContainer
    public void onStop() {
        com.smartdigimkt.x.d dVar;
        super.onStop();
        List<com.smartdigimkt.x.d> list = this.J0;
        if (list != null && list.size() > 0 && (dVar = this.J0.get(0)) != null && dVar.H2()) {
            com.smartdigimkt.e2.a.a().d();
        }
        try {
            LinkedHashMap<String, View> linkedHashMapA = com.smartdigimkt.z1.c.c().a(this.h0, this.Q0);
            if (linkedHashMapA == null || linkedHashMapA.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapA.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).onStop();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.x2.b
    public void reactDeveloper(Object obj, String str) {
        int i2;
        int i3;
        if (this.L0 == null || TextUtils.isEmpty(str)) {
            a(obj, "listener is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("type");
            int iOptInt2 = jSONObject.optInt("hit");
            String strOptString = jSONObject.optString("unitId", getUnitId());
            jSONObject.optString(com.smartdigimkt.b.b.f33814z, getPlacementId());
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            com.smartdigimkt.x.d dVar = this.J0.get(0);
            if (iOptInt == 1) {
                boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("expired");
                if (dVar != null) {
                    if (zOptBoolean) {
                        dVar.k0(1);
                    } else {
                        dVar.k0(0);
                    }
                }
                this.R0 = isNativeKilledCallback(dVar);
            }
            switch (iOptInt) {
                case 1:
                    this.L0.onAdShow();
                    break;
                case 2:
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("error");
                    String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("msg") : "";
                    if (TextUtils.isEmpty(strOptString2)) {
                        strOptString2 = jSONObjectOptJSONObject.optString("error");
                    }
                    if (!this.R0) {
                        if (iOptInt2 != this.S0) {
                            this.L0.onShowFail(strOptString2);
                        }
                    } else if (!j(1)) {
                        this.L0.onShowFail(strOptString2);
                    }
                    break;
                case 3:
                    this.L0.onVideoComplete();
                    break;
                case 4:
                    this.L0.onEndcardShow();
                    break;
                case 5:
                    com.smartdigimkt.a2.a aVar = this.L0;
                    com.smartdigimkt.x.d dVar2 = this.Y0;
                    if (dVar2 != null) {
                        dVar = dVar2;
                    }
                    aVar.onVideoAdClicked(dVar);
                    break;
                case 6:
                    boolean z2 = jSONObjectOptJSONObject.optInt("convert") == 1;
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("reward");
                    com.smartdigimkt.x.d dVarB = com.smartdigimkt.x.d.b(jSONObjectOptJSONObject.optJSONObject(MBInterstitialActivity.INTENT_CAMAPIGN));
                    com.smartdigimkt.d3.c cVarA = com.smartdigimkt.d3.c.a(jSONObjectOptJSONObject3);
                    if (cVarA == null) {
                        cVarA = this.l0;
                    }
                    String strOptString3 = jSONObjectOptJSONObject.optString("extra");
                    if (!TextUtils.isEmpty(strOptString3)) {
                        this.V0 = strOptString3;
                    }
                    if (!this.R0) {
                        if (iOptInt2 != this.S0) {
                            if (this.o0 && ((i2 = this.q0) == com.smartdigimkt.b0.a.v2 || i2 == com.smartdigimkt.b0.a.w2)) {
                                this.L0.onAdCloseWithIVReward(this.T0, this.U0);
                            }
                            if (!z2) {
                                cVarA.a(0);
                            }
                            this.L0.a(z2, cVarA);
                            if (!this.o0 && z2) {
                                if (dVarB == null) {
                                    com.smartdigimkt.v2.a.a(dVar, cVarA, strOptString, this.k0, this.V0);
                                } else {
                                    com.smartdigimkt.v2.a.a(dVarB, cVarA, strOptString, this.k0, this.V0);
                                }
                            }
                        }
                    } else if (!j(5)) {
                        if (getCBPRuleType() == 0 && j(1)) {
                            this.L0.onShowFail("");
                        }
                        if (this.o0 && ((i3 = this.q0) == com.smartdigimkt.b0.a.v2 || i3 == com.smartdigimkt.b0.a.w2)) {
                            this.L0.onAdCloseWithIVReward(this.T0, this.U0);
                        }
                        if (!z2) {
                            cVarA.a(0);
                        }
                        this.L0.a(z2, cVarA);
                        if (!this.o0 && z2) {
                            if (dVarB == null) {
                                com.smartdigimkt.v2.a.a(dVar, cVarA, strOptString, this.k0, this.V0);
                            } else {
                                com.smartdigimkt.v2.a.a(dVarB, cVarA, strOptString, this.k0, this.V0);
                            }
                        }
                    }
                    break;
            }
            b(obj);
        } catch (JSONException e2) {
            a(obj, e2.getMessage());
            e2.getMessage();
        }
    }

    @Override // com.smartdigimkt.x2.b
    public void reportUrls(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                int iOptInt = jSONObject.optInt("type");
                String strA = v.a(jSONObject.optString("url"), "&tun=", n.q() + "");
                int iOptInt2 = jSONObject.optInt("report");
                if (iOptInt2 == 0) {
                    Context contextK = com.smartdigimkt.m6.b.p().k();
                    List<com.smartdigimkt.x.d> list = this.J0;
                    com.smartdigimkt.o.a.a(contextK, list != null ? list.get(0) : null, "", strA, false, iOptInt != 0);
                } else {
                    Context contextK2 = com.smartdigimkt.m6.b.p().k();
                    List<com.smartdigimkt.x.d> list2 = this.J0;
                    com.smartdigimkt.o.a.a(contextK2, list2 != null ? list2.get(0) : null, "", strA, false, iOptInt != 0, iOptInt2);
                }
            }
            b(obj, "");
        } catch (Throwable unused) {
        }
    }

    public void setBTContainerCallback(com.smartdigimkt.a2.a aVar) {
        this.L0 = aVar;
    }

    public void setCampaignDownLoadTasks(List<com.smartdigimkt.c3.c> list) {
        this.K0 = list;
    }

    public void setCampaigns(List<com.smartdigimkt.x.d> list) {
        this.J0 = list;
    }

    public void setChoiceOneCallback(com.smartdigimkt.i2.d dVar) {
        this.W0 = dVar;
    }

    public void setDeveloperExtraData(String str) {
        this.V0 = str;
    }

    public void setJSFactory(com.smartdigimkt.y2.b bVar) {
        this.u0 = bVar;
    }

    public void setNotchPadding(int i2, int i3, int i4, int i5, int i6) {
        int i7 = i6;
        try {
            String strA = i.a(i2, i3, i4, i5, i6);
            WindVaneWebView windVaneWebView = this.A0;
            if (windVaneWebView != null && (windVaneWebView.getObject() instanceof j) && !TextUtils.isEmpty(strA)) {
                ((j) this.A0.getObject()).a(strA);
                com.smartdigimkt.n.h.a().a((WebView) this.A0, "oncutoutfetched", Base64.encodeToString(strA.getBytes(), 0));
            }
            a(i3, i5, i4, i7);
            com.smartdigimkt.z1.c.c().a(i2, i3, i4, i5, i7);
            LinkedHashMap<String, View> linkedHashMapA = com.smartdigimkt.z1.c.c().a(this.h0, this.Q0);
            if (linkedHashMapA == null || linkedHashMapA.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapA.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).setNotchPadding(i3, i4, i5, i7);
                }
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).setNotchPadding(i2, i3, i4, i5, i7);
                }
                if ((view instanceof WindVaneWebView) && !TextUtils.isEmpty(strA)) {
                    com.smartdigimkt.n.h.a().a(view, "oncutoutfetched", Base64.encodeToString(strA.getBytes(), 0));
                }
                i7 = i6;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void setShowRewardVideoListener(h hVar) {
        this.M0 = hVar;
    }

    public void setSoundListener(com.smartdigimkt.s2.a aVar) {
        this.X0 = aVar;
    }

    private void b(Context context) {
        if (this.W0 == null) {
            b("ChoiceOneCallback is null");
            return;
        }
        HashMap map = new HashMap();
        map.put(com.smartdigimkt.d2.a.f34394F, this.W0);
        com.smartdigimkt.c2.b.a().a(context, this.J0, new b(), map);
    }

    private WindVaneWebView c(String str) {
        com.smartdigimkt.a3.a.C0428a c0428aB = com.smartdigimkt.a3.a.b(str);
        if (c0428aB == null) {
            return null;
        }
        this.H0 = c0428aB.a();
        c0428aB.a("");
        return c0428aB.b();
    }

    private com.smartdigimkt.a2.b m() {
        if (this.O0 == null) {
            this.O0 = new c();
        }
        return this.O0;
    }

    private boolean o() {
        try {
            com.smartdigimkt.f3.d dVar = this.j0;
            if (dVar == null) {
                return false;
            }
            double dM = dVar.m();
            return dM != 1.0d && new Random().nextDouble() > dM;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void d(com.smartdigimkt.x.d dVar) {
        if (dVar != null) {
            try {
                List<String> listH1 = dVar.H1();
                if (listH1 == null || listH1.size() <= 0) {
                    return;
                }
                Iterator<String> it = listH1.iterator();
                while (it.hasNext()) {
                    com.smartdigimkt.x.d dVar2 = dVar;
                    com.smartdigimkt.o.a.a(com.smartdigimkt.m6.b.p().k(), dVar2, this.h0, it.next(), false, true);
                    dVar = dVar2;
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    private com.smartdigimkt.c3.c c(com.smartdigimkt.x.d dVar) {
        List<com.smartdigimkt.c3.c> list = this.K0;
        if (list == null || dVar == null) {
            return null;
        }
        for (com.smartdigimkt.c3.c cVar : list) {
            if (cVar.c().j().equals(dVar.j())) {
                return cVar;
            }
        }
        return null;
    }

    public class a implements com.smartdigimkt.z.a {
        public a() {
        }

        @Override // com.smartdigimkt.z.a
        public void a() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.smartdigimkt.m6.b.p().k() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = AnythinkBTContainer.Z0;
                th.getMessage();
                string = "";
            }
            com.smartdigimkt.n.h.a().a((WebView) AnythinkBTContainer.this.A0, BaseAbsFeedBackForH5.g, Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.smartdigimkt.z.a
        public void close() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.smartdigimkt.m6.b.p().k() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = AnythinkBTContainer.Z0;
                th.getMessage();
                string = "";
            }
            com.smartdigimkt.n.h.a().a((WebView) AnythinkBTContainer.this.A0, BaseAbsFeedBackForH5.g, Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.smartdigimkt.z.a
        public void a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.smartdigimkt.m6.b.p().k() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = AnythinkBTContainer.Z0;
                th.getMessage();
                string = "";
            }
            com.smartdigimkt.n.h.a().a((WebView) AnythinkBTContainer.this.A0, BaseAbsFeedBackForH5.g, Base64.encodeToString(string.getBytes(), 2));
        }
    }

    private void a(int i2, int i3, int i4, int i5) {
        TextView textView;
        FrameLayout.LayoutParams layoutParams;
        List<com.smartdigimkt.x.d> list = this.J0;
        if (list == null || list.size() <= 0) {
            return;
        }
        try {
            if (this.J0.get(0).H2() && (textView = this.D0) != null && (layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams()) != null) {
                if (i2 > 0) {
                    layoutParams.leftMargin = i2;
                }
                if (i4 > 0) {
                    layoutParams.rightMargin = i4;
                }
                if (i3 > 0) {
                    layoutParams.topMargin = i3;
                }
                if (i5 > 0) {
                    layoutParams.bottomMargin = i5;
                }
                this.D0.setLayoutParams(layoutParams);
                if (this.E0 != null) {
                    try {
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.E0.getLayoutParams());
                        layoutParams2.leftMargin = layoutParams.rightMargin;
                        layoutParams2.topMargin = layoutParams.topMargin;
                        this.E0.setLayoutParams(layoutParams2);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.container.AbstractJSContainer
    public void b(String str) {
        h hVar = this.M0;
        if (hVar != null) {
            hVar.onShowFail(str);
        }
        super.b(str);
    }

    public AnythinkBTContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w0 = 0;
        this.x0 = 1;
        this.F0 = false;
        this.G0 = true;
        this.I0 = false;
        this.S0 = 1;
        init(context);
    }

    private boolean c(boolean z2) {
        try {
            com.smartdigimkt.f3.d dVar = this.j0;
            if (dVar == null) {
                return false;
            }
            int iN = dVar.n();
            if (iN == 1) {
                return z2;
            }
            if (iN == 2) {
                return z2 && o();
            }
            if (iN != 3) {
                return false;
            }
            return o();
        } catch (Throwable unused) {
        }
    }

    public class c implements com.smartdigimkt.a2.b {
        public c() {
        }

        @Override // com.smartdigimkt.a2.b
        public void a(String str, boolean z2, com.smartdigimkt.d3.c cVar) {
            if (AnythinkBTContainer.this.A0 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    JSONObject jSONObject2 = new JSONObject();
                    if (cVar != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("name", cVar.c());
                        jSONObject3.put("amount", cVar.a());
                        jSONObject2.put("reward", jSONObject3);
                    }
                    jSONObject2.put("isComplete", z2);
                    jSONObject2.put("convert", z2 ? 1 : 2);
                    jSONObject.put("data", jSONObject2);
                    String unused = AnythinkBTContainer.Z0;
                    jSONObject.toString();
                } catch (JSONException e2) {
                    String unused2 = AnythinkBTContainer.Z0;
                    e2.getMessage();
                }
                com.smartdigimkt.n.h.a().a((WebView) AnythinkBTContainer.this.A0, "onSubPlayTemplateViewCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                com.smartdigimkt.n.h.a().a((WebView) AnythinkBTContainer.this.A0, "onSubPlayTemplateViewDismissed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }

        @Override // com.smartdigimkt.a2.b
        public void b(String str) {
            if (AnythinkBTContainer.this.A0 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("convert", true);
                    jSONObject2.put(com.smartdigimkt.b.b.f33814z, ((AbstractJSContainer) AnythinkBTContainer.this).i0);
                    jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).h0);
                    jSONObject.put("data", jSONObject2);
                    String unused = AnythinkBTContainer.Z0;
                    jSONObject.toString();
                } catch (JSONException e2) {
                    String unused2 = AnythinkBTContainer.Z0;
                    e2.getMessage();
                }
                com.smartdigimkt.n.h.a().a((WebView) AnythinkBTContainer.this.A0, "onSubPlayTemplateViewPlayCompleted", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }

        @Override // com.smartdigimkt.a2.b
        public void c(String str) {
        }

        @Override // com.smartdigimkt.a2.b
        public void d(String str) {
            if (AnythinkBTContainer.this.A0 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(com.smartdigimkt.b.b.f33814z, ((AbstractJSContainer) AnythinkBTContainer.this).i0);
                    jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).h0);
                    jSONObject.put("data", jSONObject2);
                    String unused = AnythinkBTContainer.Z0;
                    jSONObject.toString();
                } catch (JSONException e2) {
                    String unused2 = AnythinkBTContainer.Z0;
                    e2.getMessage();
                }
                com.smartdigimkt.n.h.a().a((WebView) AnythinkBTContainer.this.A0, "onSubPlayTemplateViewPlayStart", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }

        @Override // com.smartdigimkt.a2.b
        public void onAdCloseWithIVReward(boolean z2, int i2) {
            AnythinkBTContainer.this.T0 = z2;
            AnythinkBTContainer.this.U0 = i2;
        }

        @Override // com.smartdigimkt.a2.b
        public void a(String str, String str2) {
            if (AnythinkBTContainer.this.A0 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(com.smartdigimkt.b.b.f33814z, ((AbstractJSContainer) AnythinkBTContainer.this).i0);
                    jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).h0);
                    jSONObject2.put("error", str2);
                    jSONObject.put("data", jSONObject2);
                    String unused = AnythinkBTContainer.Z0;
                    jSONObject.toString();
                } catch (JSONException e2) {
                    String unused2 = AnythinkBTContainer.Z0;
                    e2.getMessage();
                }
                com.smartdigimkt.n.h.a().a((WebView) AnythinkBTContainer.this.A0, "onSubPlayTemplateViewPlayFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }

        @Override // com.smartdigimkt.a2.b
        public void a(String str, com.smartdigimkt.x.d dVar) {
            AnythinkBTContainer anythinkBTContainer = AnythinkBTContainer.this;
            anythinkBTContainer.Y0 = dVar;
            if (anythinkBTContainer.A0 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(com.smartdigimkt.b.b.f33814z, ((AbstractJSContainer) AnythinkBTContainer.this).i0);
                    jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).h0);
                    jSONObject.put("data", jSONObject2);
                    String unused = AnythinkBTContainer.Z0;
                    jSONObject.toString();
                } catch (JSONException e2) {
                    String unused2 = AnythinkBTContainer.Z0;
                    e2.getMessage();
                }
                com.smartdigimkt.n.h.a().a((WebView) AnythinkBTContainer.this.A0, "onSubPlayTemplateViewClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }

        @Override // com.smartdigimkt.a2.b
        public void a(String str) {
            if (AnythinkBTContainer.this.A0 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(com.smartdigimkt.b.b.f33814z, ((AbstractJSContainer) AnythinkBTContainer.this).i0);
                    jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).h0);
                    jSONObject.put("data", jSONObject2);
                    String unused = AnythinkBTContainer.Z0;
                    jSONObject.toString();
                } catch (JSONException e2) {
                    String unused2 = AnythinkBTContainer.Z0;
                    e2.getMessage();
                }
                com.smartdigimkt.n.h.a().a((WebView) AnythinkBTContainer.this.A0, "onSubPlayTemplateViewEndcardShowSuccess", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(k kVar) {
        u.a(kVar, this.y0);
    }

    public class b implements com.smartdigimkt.i2.h {
        public b() {
        }

        @Override // com.smartdigimkt.i2.h
        public void a(com.smartdigimkt.c2.a aVar) {
            com.smartdigimkt.x.d dVar;
            String string;
            if (aVar != null) {
                if (AnythinkBTContainer.this.y0 == null || aVar.b() == null) {
                    AnythinkBTContainer.this.b("nativeview is null");
                    return;
                }
                AnythinkBTContainer.this.y0.removeAllViews();
                AnythinkBTContainer.this.y0.addView(aVar.b());
                AnythinkBTContainer anythinkBTContainer = AnythinkBTContainer.this;
                anythinkBTContainer.D0 = (TextView) anythinkBTContainer.findViewById(anythinkBTContainer.findID("sdm_choice_one_countdown_tv"));
                AnythinkBTContainer anythinkBTContainer2 = AnythinkBTContainer.this;
                anythinkBTContainer2.E0 = (ImageView) anythinkBTContainer2.findViewById(anythinkBTContainer2.findID("sdm_iv_link"));
                if (AnythinkBTContainer.this.L0 != null) {
                    AnythinkBTContainer.this.L0.onAdShow();
                }
                if (AnythinkBTContainer.this.J0 == null || AnythinkBTContainer.this.J0.size() <= 0 || (dVar = (com.smartdigimkt.x.d) AnythinkBTContainer.this.J0.get(0)) == null) {
                    return;
                }
                String strY1 = dVar.y1();
                com.smartdigimkt.f3.d dVarB = com.smartdigimkt.f3.c.b().b(com.smartdigimkt.u.a.f().a(), ((AbstractJSContainer) AnythinkBTContainer.this).h0);
                int iP = dVarB != null ? dVarB.P() : 1;
                if (dVar.a2() == 1) {
                    StringBuilder sbX = android.support.v4.media.a.x(strY1, "&to=1&cbt=");
                    sbX.append(dVar.m0());
                    sbX.append("&tmorl=");
                    sbX.append(iP);
                    string = sbX.toString();
                } else {
                    StringBuilder sbX2 = android.support.v4.media.a.x(strY1, "&to=0&cbt=");
                    sbX2.append(dVar.m0());
                    sbX2.append("&tmorl=");
                    sbX2.append(iP);
                    string = sbX2.toString();
                }
                com.smartdigimkt.o.a.a(com.smartdigimkt.m6.b.p().k(), dVar, ((AbstractJSContainer) AnythinkBTContainer.this).h0, string, false, true, com.smartdigimkt.q.a.q);
                f.f34029i.put(dVar.y1(), Long.valueOf(System.currentTimeMillis()));
                AnythinkBTContainer.this.d(dVar);
            }
        }

        @Override // com.smartdigimkt.i2.h
        public void a(com.smartdigimkt.f2.b bVar) {
            String str;
            if (bVar != null) {
                str = "errorCode:" + bVar.c() + "Msg:" + bVar.d();
            } else {
                str = "";
            }
            AnythinkBTContainer.this.b("nativeview is null" + str);
        }
    }
}
