package com.mbridge.msdk.splash.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.ironsource.X3;
import com.mbridge.msdk.dycreator.listener.DyCountDownListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.d0;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.h;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.unity3d.ads.BuildConfig;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBSplashView extends RelativeLayout {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static String f36041u = "MBSplashView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MBSplashWebview f36043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.splash.view.a f36044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewGroup f36045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f36046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f36047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f36049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f36050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f36051j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ViewGroup f36052k;
    private View l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f36053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f36054n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RelativeLayout.LayoutParams f36055o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.mbridge.msdk.splash.signal.b f36056p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private DyCountDownListener f36057q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f36058r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View.OnTouchListener f36059s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f36060t;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return !MBSplashView.this.f36058r;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f36062a;

        public b(CampaignEx campaignEx) {
            this.f36062a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBSplashView.this.b(this.f36062a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                q0.a(MBSplashView.f36041u, "webviewshow");
                String string = "";
                try {
                    int[] iArr = new int[2];
                    MBSplashView.this.f36043b.getLocationOnScreen(iArr);
                    q0.b(MBSplashView.f36041u, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), (float) iArr[0]));
                    jSONObject.put("startY", v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), (float) iArr[1]));
                    string = jSONObject.toString();
                } catch (Throwable th2) {
                    q0.b(MBSplashView.f36041u, th2.getMessage(), th2);
                }
                int[] iArr2 = new int[2];
                MBSplashView.this.f36043b.getLocationInWindow(iArr2);
                MBSplashView.transInfoForMraid(MBSplashView.this.f36043b, iArr2[0], iArr2[1], MBSplashView.this.f36043b.getWidth(), MBSplashView.this.f36043b.getHeight());
                f.a().a((WebView) MBSplashView.this.f36043b, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public MBSplashView(Context context) {
        this(context, null);
    }

    public static void transInfoForMraid(WebView webView, int i10, int i11, int i12, int i13) {
        String str;
        q0.b(f36041u, "transInfoForMraid");
        try {
            int i14 = com.mbridge.msdk.foundation.controller.c.n().d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i14 == 2) {
                str = X3.i.C;
            } else {
                str = i14 == 1 ? X3.i.D : AdError.UNDEFINED_DOMAIN;
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", com.ironsource.mediationsdk.metadata.a.f29610g);
            float fN = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());
            float fM = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());
            HashMap mapV = m0.v(com.mbridge.msdk.foundation.controller.c.n().d());
            int iIntValue = ((Integer) mapV.get("width")).intValue();
            int iIntValue2 = ((Integer) mapV.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "Interstitial");
            map.put("state", BuildConfig.FLAVOR);
            map.put("viewable", com.ironsource.mediationsdk.metadata.a.f29610g);
            map.put("currentAppOrientation", jSONObject);
            float f10 = i10;
            float f11 = i11;
            float f12 = i12;
            float f13 = i13;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, iIntValue, iIntValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, map);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView);
        } catch (Throwable th2) {
            q0.b(f36041u, "transInfoForMraid", th2);
        }
    }

    public void changeCloseBtnState(int i10) {
        View view = this.f36046e;
        if (view != null) {
            if (i10 == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.f36051j = false;
        this.f36050i = false;
        this.f36049h = false;
    }

    public void destroy() {
        removeAllViews();
        ViewGroup viewGroup = this.f36052k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        MBSplashWebview mBSplashWebview = this.f36043b;
        if (mBSplashWebview == null || mBSplashWebview.isDestoryed()) {
            return;
        }
        this.f36043b.finishAdSession();
        com.mbridge.msdk.splash.signal.c.a(this.f36043b, "onSystemDestory", "");
        this.f36043b.release();
        this.f36043b = null;
    }

    public View.OnTouchListener getAllowClickSplashTouchListener() {
        return this.f36059s;
    }

    public View getCloseView() {
        return this.f36046e;
    }

    public ViewGroup getDevContainer() {
        return this.f36052k;
    }

    public View getIconVg() {
        return this.f36047f;
    }

    public View getSplashNativeView() {
        return this.l;
    }

    public com.mbridge.msdk.splash.signal.b getSplashSignalCommunicationImpl() {
        return this.f36056p;
    }

    public MBSplashWebview getSplashWebview() {
        return this.f36043b;
    }

    public boolean isAttach() {
        return this.f36054n;
    }

    public boolean isDynamicView() {
        return this.f36053m;
    }

    public boolean isH5Ready() {
        return this.f36049h;
    }

    public boolean isImageReady() {
        return this.f36051j;
    }

    public boolean isVideoReady() {
        return this.f36050i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36054n = true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public void onPause() {
        View view = this.l;
        if (view == null || !(view instanceof MBSplashNativeView)) {
            return;
        }
        ((MBSplashNativeView) view).setIsPause(true);
    }

    public void onResume() {
        View view = this.l;
        if (view == null || !(view instanceof MBSplashNativeView)) {
            return;
        }
        ((MBSplashNativeView) view).setIsPause(false);
    }

    public void resetLoadState() {
        this.f36050i = false;
        this.f36049h = false;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setAllowClickSplash(boolean z10) {
        this.f36058r = z10;
        setOnTouchListener(this.f36059s);
    }

    public void setCloseView(View view) {
        this.f36046e = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setDevContainer(ViewGroup viewGroup) {
        this.f36052k = viewGroup;
    }

    public void setDyCountDownListener(DyCountDownListener dyCountDownListener) {
        this.f36057q = dyCountDownListener;
    }

    public void setDynamicView(boolean z10) {
        this.f36053m = z10;
    }

    public void setH5Ready(boolean z10) {
        this.f36049h = z10;
    }

    public void setIconVg(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f36047f = view;
        this.f36055o = layoutParams;
    }

    public void setImageReady(boolean z10) {
        this.f36051j = z10;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        View view = this.l;
        if (view != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).setNotchPadding(i10, i11, i12, i13);
        }
        if (this.f36043b != null) {
            f.a().a((WebView) this.f36043b, "oncutoutfetched", Base64.encodeToString(d0.a(-999, i10, i11, i12, i13).getBytes(), 0));
        }
    }

    public void setSplashNativeView(View view) {
        if (view != null) {
            this.l = view;
        }
    }

    public void setSplashSignalCommunicationImpl(com.mbridge.msdk.splash.signal.b bVar) {
        this.f36056p = bVar;
        MBSplashWebview mBSplashWebview = this.f36043b;
        if (mBSplashWebview != null) {
            mBSplashWebview.setObject(bVar);
        }
    }

    public void setSplashWebView() {
        if (this.f36043b == null) {
            try {
                MBSplashWebview mBSplashWebview = new MBSplashWebview(getContext());
                this.f36043b = mBSplashWebview;
                com.mbridge.msdk.splash.signal.b bVar = this.f36056p;
                if (bVar != null) {
                    mBSplashWebview.setObject(bVar);
                }
                com.mbridge.msdk.splash.view.a aVar = this.f36044c;
                if (aVar != null) {
                    this.f36043b.setWebViewClient(aVar);
                    return;
                }
                com.mbridge.msdk.splash.view.a aVar2 = new com.mbridge.msdk.splash.view.a();
                this.f36044c = aVar2;
                this.f36043b.setWebViewClient(aVar2);
            } catch (Throwable th2) {
                q0.b(f36041u, th2.getMessage());
            }
        }
    }

    public void setVideoReady(boolean z10) {
        this.f36050i = z10;
    }

    public void show(CampaignEx campaignEx) {
        ViewGroup viewGroup;
        if (this.f36056p != null && (viewGroup = this.f36052k) != null && (viewGroup.getContext() instanceof Activity)) {
            this.f36056p.a(this.f36052k.getContext());
            com.mbridge.msdk.splash.view.a aVar = this.f36044c;
            if (aVar != null) {
                aVar.a(this.f36056p.a());
            }
        }
        a(campaignEx);
        clearResState();
    }

    public void updateCountdown(int i10) {
        DyCountDownListener dyCountDownListener;
        View view;
        if (this.f36043b != null && !this.f36053m) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("countdown", i10);
                f.a().a((WebView) this.f36043b, "updateCountdown", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        if (this.f36053m && (view = this.l) != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).updateCountDown(i10);
        }
        if (!this.f36053m || (dyCountDownListener = this.f36057q) == null) {
            return;
        }
        dyCountDownListener.getCountDownValue(i10);
    }

    public MBSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b() {
        setBackgroundColor(0);
        this.f36042a = getResources().getConfiguration().orientation;
    }

    public MBSplashView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36058r = true;
        this.f36059s = new a();
        this.f36060t = true;
        b();
    }

    private void a(CampaignEx campaignEx) {
        View view;
        View view2;
        View view3;
        this.f36060t = true;
        if (this.f36047f == null) {
            if (this.f36053m && (view3 = this.l) != null) {
                if (view3.getParent() != null) {
                    f1.a(this.l);
                }
                addView(this.l, new ViewGroup.LayoutParams(-1, -1));
            } else {
                MBSplashWebview mBSplashWebview = this.f36043b;
                if (mBSplashWebview != null && mBSplashWebview.getParent() == null) {
                    addView(this.f36043b, new ViewGroup.LayoutParams(-1, -1));
                }
                b(campaignEx);
            }
        } else {
            if (this.f36045d == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f36045d = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.f36042a == 2) {
                this.f36048g = v0.g(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.f36045d.getId());
                if (this.f36053m && (view2 = this.l) != null) {
                    if (view2.getParent() != null) {
                        f1.a(this.l);
                    }
                    addView(this.l, layoutParams);
                } else {
                    MBSplashWebview mBSplashWebview2 = this.f36043b;
                    if (mBSplashWebview2 != null && mBSplashWebview2.getParent() == null) {
                        addView(this.f36043b, layoutParams);
                    }
                    b(campaignEx);
                }
                ViewGroup viewGroup = this.f36045d;
                if (viewGroup != null && viewGroup.getParent() == null) {
                    int i10 = this.f36055o.width;
                    f1.a(this.f36047f);
                    int i11 = this.f36048g / 4;
                    if (i10 > i11) {
                        this.f36045d.addView(this.f36047f, i11, -1);
                        i10 = i11;
                    } else {
                        this.f36045d.addView(this.f36047f, i10, -1);
                    }
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.f36045d, layoutParams2);
                }
            } else {
                this.f36048g = v0.f(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.f36045d.getId());
                if (this.f36053m && (view = this.l) != null) {
                    if (view.getParent() != null) {
                        f1.a(this.l);
                    }
                    addView(this.l, layoutParams3);
                } else {
                    MBSplashWebview mBSplashWebview3 = this.f36043b;
                    if (mBSplashWebview3 != null && mBSplashWebview3.getParent() == null) {
                        addView(this.f36043b, layoutParams3);
                    }
                    b(campaignEx);
                }
                ViewGroup viewGroup2 = this.f36045d;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i12 = this.f36055o.height;
                    int i13 = this.f36048g / 4;
                    if (i12 > i13) {
                        i12 = i13;
                    }
                    f1.a(this.f36047f);
                    this.f36045d.addView(this.f36047f, -1, i12);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i12);
                    layoutParams4.addRule(12);
                    addView(this.f36045d, layoutParams4);
                }
            }
        }
        View view4 = this.f36046e;
        if (view4 != null) {
            if (view4.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(v0.a(getContext(), 100.0f), v0.a(getContext(), 30.0f));
                layoutParams5.addRule(10);
                layoutParams5.addRule(11);
                layoutParams5.rightMargin = v0.a(getContext(), 10.0f);
                layoutParams5.topMargin = v0.a(getContext(), 10.0f);
                addView(this.f36046e, layoutParams5);
                return;
            }
            bringChildToFront(this.f36046e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CampaignEx campaignEx) {
        MBSplashWebview mBSplashWebview = this.f36043b;
        if (mBSplashWebview != null) {
            if (!(campaignEx != null ? h.b(campaignEx, null, mBSplashWebview, campaignEx.getImpReportType()) : true)) {
                if (this.f36060t) {
                    this.f36060t = false;
                    this.f36043b.postDelayed(new b(campaignEx), 200L);
                    return;
                }
                return;
            }
            this.f36043b.setObject(this.f36056p);
            this.f36043b.post(new c());
        }
    }
}
