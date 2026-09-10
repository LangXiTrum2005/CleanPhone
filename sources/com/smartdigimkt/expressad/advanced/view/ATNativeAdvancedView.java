package com.smartdigimkt.expressad.advanced.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.p004ironsource.d9;
import com.smartdigimkt.expressad.advanced.js.NativeAdvancedJSBridgeImpl;
import com.smartdigimkt.expressad.advanced.js.NativeAdvancedJsUtils;
import com.smartdigimkt.f.c;
import com.smartdigimkt.m6.b;
import com.smartdigimkt.n.h;
import com.smartdigimkt.v0.n;
import com.smartdigimkt.v0.v;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ATNativeAdvancedView extends RelativeLayout {
    private static String m0 = "ATNativeAdvancedView";
    protected static final String n0 = "webviewshow";
    private ATNativeAdvancedWebview e0;
    private View f0;
    private boolean g0;
    private boolean h0;
    private boolean i0;
    private c j0;
    private NativeAdvancedJSBridgeImpl k0;
    private Context l0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = ATNativeAdvancedView.m0;
                String string = "";
                try {
                    int[] iArr = new int[2];
                    ATNativeAdvancedView.this.e0.getLocationOnScreen(iArr);
                    String unused2 = ATNativeAdvancedView.m0;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", v.b(b.p().k(), iArr[0]));
                    jSONObject.put("startY", v.b(b.p().k(), iArr[1]));
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    String unused3 = ATNativeAdvancedView.m0;
                    th.getMessage();
                }
                h.a().a((WebView) ATNativeAdvancedView.this.e0, ATNativeAdvancedView.n0, Base64.encodeToString(string.toString().getBytes(), 2));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public ATNativeAdvancedView(Context context) {
        this(context, null);
    }

    private void b() {
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.e0;
        if (aTNativeAdvancedWebview != null && aTNativeAdvancedWebview.getParent() == null) {
            addView(this.e0, new ViewGroup.LayoutParams(-1, -1));
        }
        c();
        View view = this.f0;
        if (view != null) {
            if (view.getParent() != null) {
                bringChildToFront(this.f0);
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v.a(getContext(), 28.0f), v.a(getContext(), 16.0f));
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.rightMargin = v.a(getContext(), 2.0f);
            layoutParams.topMargin = v.a(getContext(), 2.0f);
            addView(this.f0, layoutParams);
        }
    }

    private void c() {
        int[] iArr = new int[2];
        this.e0.getLocationInWindow(iArr);
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.e0;
        transInfoForMraid(aTNativeAdvancedWebview, iArr[0], iArr[1], aTNativeAdvancedWebview.getWidth(), this.e0.getHeight());
        ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.e0;
        if (aTNativeAdvancedWebview2 != null) {
            aTNativeAdvancedWebview2.setObject(this.k0);
            this.e0.post(new a());
        }
    }

    public static void transInfoForMraid(WebView webView, int i2, int i3, int i4, int i5) {
        String str;
        try {
            int i6 = b.p().k().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i6 == 2) {
                str = d9.h.C;
            } else {
                str = i6 == 1 ? d9.h.D : AdError.UNDEFINED_DOMAIN;
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", com.p004ironsource.mediationsdk.metadata.a.g);
            float fG = n.g(b.p().k());
            float f = n.f(b.p().k());
            HashMap mapJ = n.j(b.p().k());
            int iIntValue = ((Integer) mapJ.get("width")).intValue();
            int iIntValue2 = ((Integer) mapJ.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "inline");
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
        View view = this.f0;
        if (view != null) {
            if (i2 == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.i0 = false;
        this.h0 = false;
        this.g0 = false;
    }

    public void clearResStateAndRemoveClose() {
        clearResState();
        View view = this.f0;
        if (view == null || view.getParent() == null) {
            return;
        }
        removeView(this.f0);
    }

    public void destroy() {
        removeAllViews();
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.e0;
        if (aTNativeAdvancedWebview != null && !aTNativeAdvancedWebview.isDestroyed()) {
            this.e0.release();
            NativeAdvancedJsUtils.sendEventToH5(this.e0, "onSystemDestory", "");
        }
        if (this.l0 != null) {
            this.l0 = null;
        }
    }

    public NativeAdvancedJSBridgeImpl getAdvancedNativeJSBridgeImpl() {
        return this.k0;
    }

    public ATNativeAdvancedWebview getAdvancedNativeWebview() {
        return this.e0;
    }

    public View getCloseView() {
        return this.f0;
    }

    public boolean isEndCardReady() {
        return this.i0;
    }

    public boolean isH5Ready() {
        return this.g0;
    }

    public boolean isVideoReady() {
        return this.h0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void resetLoadState() {
        this.i0 = false;
        this.h0 = false;
        this.g0 = false;
    }

    public void setAdvancedNativeJSBridgeImpl(NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl) {
        this.k0 = nativeAdvancedJSBridgeImpl;
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.e0;
        if (aTNativeAdvancedWebview != null) {
            aTNativeAdvancedWebview.setObject(nativeAdvancedJSBridgeImpl);
        }
    }

    public void setAdvancedNativeWebview(ATNativeAdvancedWebview aTNativeAdvancedWebview) {
        this.e0 = aTNativeAdvancedWebview;
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = this.k0;
        if (nativeAdvancedJSBridgeImpl != null) {
            aTNativeAdvancedWebview.setObject(nativeAdvancedJSBridgeImpl);
        }
    }

    public void setCloseView(View view) {
        this.f0 = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setEndCardReady(boolean z2) {
        this.i0 = z2;
    }

    public void setH5Ready(boolean z2) {
        this.g0 = z2;
    }

    public void setVideoReady(boolean z2) {
        this.h0 = z2;
    }

    public void show() {
        b();
        clearResState();
    }

    public ATNativeAdvancedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ATNativeAdvancedView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.l0 = context;
    }
}
