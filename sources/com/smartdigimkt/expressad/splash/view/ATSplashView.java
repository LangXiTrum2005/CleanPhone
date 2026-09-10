package com.smartdigimkt.expressad.splash.view;

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
import com.p004ironsource.d9;
import com.smartdigimkt.expressad.splash.js.SplashJSBridgeImpl;
import com.smartdigimkt.expressad.splash.js.SplashJsUtils;
import com.smartdigimkt.n.h;
import com.smartdigimkt.v0.i;
import com.smartdigimkt.v0.n;
import com.smartdigimkt.v0.v;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ATSplashView extends RelativeLayout {
    private static String v0 = "ATSplashView";
    protected static final String w0 = "webviewshow";
    protected static final String x0 = "updateCountdown";
    private int e0;
    private ATSplashWebview f0;
    private com.smartdigimkt.v1.b g0;
    private ViewGroup h0;
    private View i0;
    private View j0;
    private int k0;
    private boolean l0;
    private boolean m0;
    private ViewGroup n0;
    private boolean o0;
    private View p0;
    private boolean q0;
    private boolean r0;
    private RelativeLayout.LayoutParams s0;
    private SplashJSBridgeImpl t0;
    private boolean u0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = ATSplashView.v0;
                String string = "";
                try {
                    int[] iArr = new int[2];
                    ATSplashView.this.f0.getLocationOnScreen(iArr);
                    String unused2 = ATSplashView.v0;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", v.b(com.smartdigimkt.m6.b.p().k(), iArr[0]));
                    jSONObject.put("startY", v.b(com.smartdigimkt.m6.b.p().k(), iArr[1]));
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    String unused3 = ATSplashView.v0;
                    th.getMessage();
                }
                int[] iArr2 = new int[2];
                ATSplashView.this.f0.getLocationInWindow(iArr2);
                ATSplashView.transInfoForMraid(ATSplashView.this.f0, iArr2[0], iArr2[1], ATSplashView.this.f0.getWidth(), ATSplashView.this.f0.getHeight());
                h.a().a((WebView) ATSplashView.this.f0, ATSplashView.w0, Base64.encodeToString(string.toString().getBytes(), 2));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public class b implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f34736a;

        public b(boolean z2) {
            this.f34736a = z2;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return !this.f34736a;
        }
    }

    public class c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f34738a;

        public c(boolean z2) {
            this.f34738a = z2;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return !this.f34738a;
        }
    }

    public ATSplashView(Context context) {
        this(context, null);
    }

    private void b() {
        setBackgroundColor(0);
        this.e0 = getResources().getConfiguration().orientation;
        this.u0 = false;
    }

    private void c() {
        View view;
        View view2;
        View view3;
        if (this.j0 != null) {
            if (this.h0 == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.h0 = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.e0 == 2) {
                this.k0 = v.g(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.h0.getId());
                if (!this.q0 || (view2 = this.p0) == null) {
                    ATSplashWebview aTSplashWebview = this.f0;
                    if (aTSplashWebview != null && aTSplashWebview.getParent() == null) {
                        addView(this.f0, layoutParams);
                    }
                    d();
                } else {
                    if (view2.getParent() != null) {
                        com.smartdigimkt.j7.c.a(this.p0);
                    }
                    addView(this.p0, layoutParams);
                }
                ViewGroup viewGroup = this.h0;
                if (viewGroup != null && viewGroup.getParent() == null) {
                    int i2 = this.s0.width;
                    com.smartdigimkt.j7.c.a(this.j0);
                    int i3 = this.k0 / 4;
                    if (i2 > i3) {
                        this.h0.addView(this.j0, i3, -1);
                        i2 = i3;
                    } else {
                        this.h0.addView(this.j0, i2, -1);
                    }
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i2, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.h0, layoutParams2);
                }
            } else {
                this.k0 = v.f(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.h0.getId());
                if (!this.q0 || (view = this.p0) == null) {
                    ATSplashWebview aTSplashWebview2 = this.f0;
                    if (aTSplashWebview2 != null && aTSplashWebview2.getParent() == null) {
                        addView(this.f0, layoutParams3);
                    }
                    d();
                } else {
                    if (view.getParent() != null) {
                        com.smartdigimkt.j7.c.a(this.p0);
                    }
                    addView(this.p0, layoutParams3);
                }
                ViewGroup viewGroup2 = this.h0;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i4 = this.s0.height;
                    int i5 = this.k0 / 4;
                    if (i4 > i5) {
                        i4 = i5;
                    }
                    com.smartdigimkt.j7.c.a(this.j0);
                    this.h0.addView(this.j0, -1, i4);
                    addView(this.h0, androidx.media3.extractor.text.ttml.a.f(-1, i4, 12));
                }
            }
        } else if (!this.q0 || (view3 = this.p0) == null) {
            ATSplashWebview aTSplashWebview3 = this.f0;
            if (aTSplashWebview3 != null && aTSplashWebview3.getParent() == null) {
                addView(this.f0, new ViewGroup.LayoutParams(-1, -1));
            }
            d();
        } else {
            if (view3.getParent() != null) {
                com.smartdigimkt.j7.c.a(this.p0);
            }
            addView(this.p0, new ViewGroup.LayoutParams(-1, -1));
        }
        View view4 = this.i0;
        if (view4 != null) {
            if (view4.getParent() != null) {
                bringChildToFront(this.i0);
                return;
            }
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(v.a(getContext(), 100.0f), v.a(getContext(), 30.0f));
            layoutParams4.addRule(10);
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = v.a(getContext(), 10.0f);
            layoutParams4.topMargin = v.a(getContext(), 10.0f);
            addView(this.i0, layoutParams4);
        }
    }

    private void d() {
        ATSplashWebview aTSplashWebview = this.f0;
        if (aTSplashWebview != null) {
            aTSplashWebview.setObject(this.t0);
            this.f0.post(new a());
        }
    }

    public static void transInfoForMraid(WebView webView, int i2, int i3, int i4, int i5) {
        String str;
        try {
            int i6 = com.smartdigimkt.m6.b.p().k().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i6 == 2) {
                str = d9.h.C;
            } else {
                str = i6 == 1 ? d9.h.D : AdError.UNDEFINED_DOMAIN;
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", com.p004ironsource.mediationsdk.metadata.a.g);
            float fG = n.g(com.smartdigimkt.m6.b.p().k());
            float f = n.f(com.smartdigimkt.m6.b.p().k());
            HashMap mapJ = n.j(com.smartdigimkt.m6.b.p().k());
            int iIntValue = ((Integer) mapJ.get("width")).intValue();
            int iIntValue2 = ((Integer) mapJ.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "Interstitial");
            map.put("state", "default");
            map.put("viewable", com.p004ironsource.mediationsdk.metadata.a.g);
            map.put("currentAppOrientation", jSONObject);
            float f2 = i2;
            float f3 = i3;
            float f4 = i4;
            float f5 = i5;
            com.smartdigimkt.s4.a.a().b(webView, f2, f3, f4, f5);
            com.smartdigimkt.s4.a.a().a(webView, f2, f3, f4, f5);
            com.smartdigimkt.s4.a.a().b(webView, fG, f);
            com.smartdigimkt.s4.a.a().a(webView, iIntValue, iIntValue2);
            com.smartdigimkt.s4.a.a().a(webView, map);
            com.smartdigimkt.s4.a.a().a(webView);
        } catch (Throwable unused) {
        }
    }

    public void changeCloseBtnState(int i2) {
        View view = this.i0;
        if (view != null) {
            if (i2 == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void checkSkipViewLocation() {
        if (this.u0) {
            return;
        }
        try {
            View view = this.i0;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    int i2 = ((RelativeLayout.LayoutParams) layoutParams).topMargin;
                    int iF = com.smartdigimkt.n8.h.f(getContext()) + i2;
                    if (i2 > 0) {
                        this.u0 = true;
                    }
                    int[] iArr = new int[2];
                    this.i0.getLocationOnScreen(iArr);
                    int i3 = iArr[1];
                    if (i3 < iF) {
                        ((RelativeLayout.LayoutParams) layoutParams).topMargin = i2 + (iF - i3);
                        this.i0.setLayoutParams(layoutParams);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void clearResState() {
        this.o0 = false;
        this.m0 = false;
        this.l0 = false;
    }

    public void destroy() {
        ATSplashWebview aTSplashWebview = this.f0;
        if (aTSplashWebview == null || aTSplashWebview.isDestroyed()) {
            return;
        }
        this.f0.finishAdSession();
        SplashJsUtils.sendEventToH5(this.f0, "onSystemDestory", "");
        this.f0.release();
        this.f0 = null;
    }

    public View getCloseView() {
        return this.i0;
    }

    public ViewGroup getDevContainer() {
        return this.n0;
    }

    public View getIconVg() {
        return this.j0;
    }

    public SplashJSBridgeImpl getSplashJSBridgeImpl() {
        return this.t0;
    }

    public ATSplashWebview getSplashWebview() {
        return this.f0;
    }

    public boolean isAttach() {
        return this.r0;
    }

    public boolean isDynamicView() {
        return this.q0;
    }

    public boolean isH5Ready() {
        return this.l0;
    }

    public boolean isImageReady() {
        return this.o0;
    }

    public boolean isVideoReady() {
        return this.m0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r0 = true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        checkSkipViewLocation();
    }

    public void onPause() {
        View view = this.p0;
        if (view == null || !(view instanceof ATSplashNativeView)) {
            return;
        }
        ((ATSplashNativeView) view).setIsPause(true);
    }

    public void onResume() {
        View view = this.p0;
        if (view == null || !(view instanceof ATSplashNativeView)) {
            return;
        }
        ((ATSplashNativeView) view).setIsPause(false);
    }

    public void resetLoadState() {
        this.m0 = false;
        this.l0 = false;
    }

    public void setAllowClickSplash(boolean z2) {
        ATSplashWebview aTSplashWebview = this.f0;
        if (aTSplashWebview != null) {
            aTSplashWebview.setOnTouchListener(new b(z2));
        }
        setOnTouchListener(new c(z2));
    }

    public void setCloseView(View view) {
        this.i0 = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setDevContainer(ViewGroup viewGroup) {
        this.n0 = viewGroup;
    }

    public void setDynamicView(boolean z2) {
        this.q0 = z2;
    }

    public void setH5Ready(boolean z2) {
        this.l0 = z2;
    }

    public void setIconVg(View view, RelativeLayout.LayoutParams layoutParams) {
        this.j0 = view;
        this.s0 = layoutParams;
    }

    public void setImageReady(boolean z2) {
        this.o0 = z2;
    }

    public void setNotchPadding(int i2, int i3, int i4, int i5) {
        View view = this.p0;
        if (view != null && (view instanceof ATSplashNativeView)) {
            ((ATSplashNativeView) view).setNotchPadding(i2, i3, i4, i5);
        }
        if (this.f0 != null) {
            h.a().a((WebView) this.f0, "oncutoutfetched", Base64.encodeToString(i.a(-999, i2, i3, i4, i5).getBytes(), 0));
        }
    }

    public void setSplashJSBridgeImpl(SplashJSBridgeImpl splashJSBridgeImpl) {
        this.t0 = splashJSBridgeImpl;
        ATSplashWebview aTSplashWebview = this.f0;
        if (aTSplashWebview != null) {
            aTSplashWebview.setObject(splashJSBridgeImpl);
        }
    }

    public void setSplashNativeView(View view) {
        if (view != null) {
            this.p0 = view;
        }
    }

    public void setSplashWebview() {
        if (this.f0 == null) {
            try {
                ATSplashWebview aTSplashWebview = new ATSplashWebview(getContext());
                this.f0 = aTSplashWebview;
                SplashJSBridgeImpl splashJSBridgeImpl = this.t0;
                if (splashJSBridgeImpl != null) {
                    aTSplashWebview.setObject(splashJSBridgeImpl);
                }
                com.smartdigimkt.v1.b bVar = this.g0;
                if (bVar != null) {
                    this.f0.setWebViewClient(bVar);
                    return;
                }
                com.smartdigimkt.v1.b bVar2 = new com.smartdigimkt.v1.b();
                this.g0 = bVar2;
                this.f0.setWebViewClient(bVar2);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public void setVideoReady(boolean z2) {
        this.m0 = z2;
    }

    public void show() {
        ViewGroup viewGroup;
        if (this.t0 != null && (viewGroup = this.n0) != null && (viewGroup.getContext() instanceof Activity)) {
            this.t0.updateContext(this.n0.getContext());
            com.smartdigimkt.v1.b bVar = this.g0;
            if (bVar != null) {
                bVar.a(this.t0.getSplashBridgeListener());
            }
        }
        c();
        clearResState();
    }

    public void updateCountdown(int i2) {
        View view;
        if (this.f0 != null && !this.q0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.smartdigimkt.o1.b.l3, i2);
                h.a().a((WebView) this.f0, x0, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        if (this.q0 && (view = this.p0) != null && (view instanceof ATSplashNativeView)) {
            ((ATSplashNativeView) view).updateCountDown(i2);
        }
    }

    public ATSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ATSplashView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.u0 = false;
        b();
    }
}
