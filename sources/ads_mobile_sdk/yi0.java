package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.google.android.material.card.MaterialCardView;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.amphitheatre;
import saneness.carport;
import saneness.evenfall;
import saneness.loun;
import saneness.lymphoblast;
import saneness.philologize;
import saneness.technofreak;

/* JADX INFO: loaded from: classes.dex */
public final class yi0 extends yj1 {
    public final gk2 A;
    public final Gson B;
    public final loun C;
    public final a22 D;
    public Point E;
    public Point F;
    public long G;
    public long H;
    public final AtomicBoolean I;
    public final JsonObject g;
    public final saran h;
    public final saran i;
    public final g6 j;
    public final hj1 k;
    public final xl1 l;
    public final com.google.android.libraries.ads.mobile.sdk.nativead.dern m;
    public final ri2 n;
    public final l13 o;
    public final amphitheatre p;
    public final carport q;
    public final x83 r;
    public final tx1 s;
    public final wb0 t;
    public final wp1 u;
    public final cq1 v;
    public final yf2 w;
    public final h1 x;
    public final boolean y;
    public final jk0 z;

    public yi0(JsonObject nativeAdJson, saran uiScope, saran backgroundScope, g6 adSpamClient, hj1 nativeAdAssets, xl1 nativeAdUtil, com.google.android.libraries.ads.mobile.sdk.nativead.dern nativeRequest, ri2 rootTraceCreator, l13 traceMetaSet, amphitheatre clock, carport nativeJavascriptEngine, x83 webViewInputEventStore, tx1 omidMonitor, wb0 delegatingAdEventListener, rg2 urlPinger, e2 adEventEmitter, wp1 nativeOnePointFiveOverlayFactory, cq1 nativePolicyValidatorOverlayFactory, yf2 requestType, h1 adConfiguration, boolean z, jk0 flags, gk2 safeBrowsingManager, Gson gson, loun traceLogger, a22 placementIdWrapper) {
        Intrinsics.checkNotNullParameter(nativeAdJson, "nativeAdJson");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(nativeAdUtil, "nativeAdUtil");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(nativeJavascriptEngine, "nativeJavascriptEngine");
        Intrinsics.checkNotNullParameter(webViewInputEventStore, "webViewInputEventStore");
        Intrinsics.checkNotNullParameter(omidMonitor, "omidMonitor");
        Intrinsics.checkNotNullParameter(delegatingAdEventListener, "delegatingAdEventListener");
        Intrinsics.checkNotNullParameter(urlPinger, "urlPinger");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(nativeOnePointFiveOverlayFactory, "nativeOnePointFiveOverlayFactory");
        Intrinsics.checkNotNullParameter(nativePolicyValidatorOverlayFactory, "nativePolicyValidatorOverlayFactory");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(safeBrowsingManager, "safeBrowsingManager");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(placementIdWrapper, "placementIdWrapper");
        this.g = nativeAdJson;
        this.h = uiScope;
        this.i = backgroundScope;
        this.j = adSpamClient;
        this.k = nativeAdAssets;
        this.l = nativeAdUtil;
        this.m = nativeRequest;
        this.n = rootTraceCreator;
        this.o = traceMetaSet;
        this.p = clock;
        this.q = nativeJavascriptEngine;
        this.r = webViewInputEventStore;
        this.s = omidMonitor;
        this.t = delegatingAdEventListener;
        this.u = nativeOnePointFiveOverlayFactory;
        this.v = nativePolicyValidatorOverlayFactory;
        this.w = requestType;
        this.x = adConfiguration;
        this.y = z;
        this.z = flags;
        this.A = safeBrowsingManager;
        this.B = gson;
        this.C = traceLogger;
        this.D = placementIdWrapper;
        this.E = new Point();
        this.F = new Point();
        new AtomicBoolean(false);
        this.I = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(yi0 yi0Var, technofreak technofreakVar, wretchedly.dern dernVar) {
        wi0 wi0Var;
        JsonObject asJsonObject;
        FrameLayout frameLayoutD;
        AtomicBoolean atomicBoolean;
        yi0Var.getClass();
        if (dernVar instanceof wi0) {
            wi0Var = (wi0) dernVar;
            int i = wi0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                wi0Var.e = i - Integer.MIN_VALUE;
            } else {
                wi0Var = new wi0(yi0Var, dernVar);
            }
        } else {
            wi0Var = new wi0(yi0Var, dernVar);
        }
        Object objA = wi0Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = wi0Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            if (yi0Var.w == yf2.g) {
                return Unit.f29295attabal;
            }
            JsonObject jsonObject = yi0Var.g;
            Intrinsics.checkNotNullParameter("overlay", X3.i.W);
            Boolean boolAttabal = null;
            if (jsonObject == null) {
                asJsonObject = null;
            } else {
                try {
                    asJsonObject = jsonObject.getAsJsonObject("overlay");
                } catch (Exception unused) {
                    asJsonObject = null;
                }
            }
            if (asJsonObject == null || asJsonObject.isEmpty()) {
                return Unit.f29295attabal;
            }
            gq0 gq0Var = (gq0) yi0Var.d.get();
            if (gq0Var != null && (atomicBoolean = gq0Var.j) != null) {
                boolAttabal = igo.attabal.attabal(atomicBoolean.get());
            }
            if (gq0Var != null && Intrinsics.wireman(boolAttabal, igo.attabal.attabal(false))) {
                return Unit.f29295attabal;
            }
            if (gq0Var != null && Intrinsics.wireman(boolAttabal, igo.attabal.attabal(true)) && (frameLayoutD = ((cm1) technofreakVar).d()) != null) {
                frameLayoutD.removeView(gq0Var);
            }
            wp1 wp1Var = yi0Var.u;
            wi0Var.a = yi0Var;
            wi0Var.b = technofreakVar;
            wi0Var.e = 1;
            wp1Var.getClass();
            objA = wp1.a(wp1Var, wi0Var);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            technofreakVar = wi0Var.b;
            yi0Var = wi0Var.a;
            p002kotlin.dern.saneness(objA);
        }
        gq0 gq0Var2 = (gq0) objA;
        WeakReference weakReference = new WeakReference(gq0Var2);
        yi0Var.getClass();
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        yi0Var.d = weakReference;
        FrameLayout frameLayoutD2 = ((cm1) technofreakVar).d();
        if (frameLayoutD2 != null) {
            frameLayoutD2.addView(gq0Var2);
        }
        return Unit.f29295attabal;
    }

    @Override // ads_mobile_sdk.yj1
    public final void a() {
    }

    @Override // ads_mobile_sdk.yj1
    public final void c() {
        technofreak technofreakVar = (technofreak) this.c.get();
        if (technofreakVar == null) {
            kn0.a("Ad should be associated with an ad view before click happens.", null, null, 6);
            return;
        }
        ri2 ri2Var = this.n;
        l13 l13Var = this.o;
        xl1 xl1Var = this.l;
        cm1 cm1Var = (cm1) technofreakVar;
        FrameLayout frameLayoutC = cm1Var.c();
        Map mapB = cm1Var.b();
        ImageView.ScaleType scaleTypeE = cm1Var.e();
        if (scaleTypeE == null) {
            scaleTypeE = ImageView.ScaleType.CENTER_INSIDE;
        }
        tl1 tl1VarAttabal = lymphoblast.attabal(ri2Var, l13Var, xl1Var, frameLayoutC, mapB, scaleTypeE);
        String strA = a((View) this.f.get(), cm1Var.b());
        a(this, cm1Var.c(), tl1VarAttabal, strA, this.l.a(strA, this.F, this.E), false, 48);
    }

    @Override // ads_mobile_sdk.yj1
    public final boolean d() {
        if (e() == 0) {
            return true;
        }
        return this.m.getCustomClickGestureAllowTaps();
    }

    @Override // ads_mobile_sdk.yj1
    public final int e() {
        NativeAd.SwipeGestureDirection customClickGestureDirection = this.m.getCustomClickGestureDirection();
        if (customClickGestureDirection != null) {
            return customClickGestureDirection.getValue();
        }
        return 0;
    }

    public final boolean j() {
        JsonObject jsonObject = this.g;
        Intrinsics.checkNotNullParameter("allow_custom_click_gesture", X3.i.W);
        if (jsonObject == null) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(jsonObject, "<this>");
            Intrinsics.checkNotNullParameter("allow_custom_click_gesture", X3.i.W);
            return jsonObject.get("allow_custom_click_gesture").getAsBoolean();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // ads_mobile_sdk.yj1
    public final boolean k() {
        return (this.k.p.isEmpty() || this.k.q == null) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(yi0 yi0Var, technofreak technofreakVar, wretchedly.dern dernVar) {
        vi0 vi0Var;
        WindowManager windowManager;
        yi0Var.getClass();
        if (dernVar instanceof vi0) {
            vi0Var = (vi0) dernVar;
            int i = vi0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                vi0Var.e = i - Integer.MIN_VALUE;
            } else {
                vi0Var = new vi0(yi0Var, dernVar);
            }
        } else {
            vi0Var = new vi0(yi0Var, dernVar);
        }
        Object objA = vi0Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = vi0Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            if (!yi0Var.x.o0 || yi0Var.y) {
                return Unit.f29295attabal;
            }
            FrameLayout frameLayoutC = ((cm1) technofreakVar).c();
            Context context = frameLayoutC != null ? frameLayoutC.getContext() : null;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null) {
                return Unit.f29295attabal;
            }
            windowManager = (WindowManager) activity.getSystemService(WindowManager.class);
            cq1 cq1Var = yi0Var.v;
            vi0Var.a = yi0Var;
            vi0Var.b = windowManager;
            vi0Var.e = 1;
            cq1Var.getClass();
            objA = cq1.a(cq1Var, vi0Var);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            WindowManager windowManager2 = vi0Var.b;
            yi0 yi0Var2 = vi0Var.a;
            p002kotlin.dern.saneness(objA);
            windowManager = windowManager2;
            yi0Var = yi0Var2;
        }
        gq0 gq0Var = (gq0) objA;
        xl1 xl1Var = yi0Var.l;
        xl1Var.getClass();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        jk0 jk0Var = xl1Var.b;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:policy_validator_layoutparam:flags", X3.i.W);
        layoutParams.flags = ((Number) jk0Var.a("gads:policy_validator_layoutparam:flags", 808, zk.f)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_TOP_START;
        windowManager.addView(gq0Var, layoutParams);
        WeakReference weakReference = new WeakReference(gq0Var);
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        yi0Var.e = weakReference;
        return Unit.f29295attabal;
    }

    @Override // ads_mobile_sdk.yj1
    public final void a(String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        a(this, null, null, assetName, null, false, 48);
    }

    @Override // ads_mobile_sdk.yj1
    public final void b(FrameLayout nativeAdView, ImageView.ScaleType mediaviewScaleType, Map assetViews) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaviewScaleType, "mediaviewScaleType");
        cutely.wireman(this.h, null, null, new qi0(this, lymphoblast.attabal(this.n, this.o, this.l, nativeAdView, assetViews, mediaviewScaleType), null, a(nativeAdView), !this.x.o0 ? false : !this.y, null), 3, null);
    }

    @Override // ads_mobile_sdk.yj1
    public final void a(View clickedView, FrameLayout frameLayout, LinkedHashMap assetViews, ImageView.ScaleType mediaViewScaleType) {
        Intrinsics.checkNotNullParameter(clickedView, "clickedView");
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaViewScaleType, "mediaViewScaleType");
        cutely.wireman(this.h, null, null, new mi0(this, null), 3, null);
        tl1 tl1VarAttabal = lymphoblast.attabal(this.n, this.o, this.l, frameLayout, assetViews, mediaViewScaleType);
        String strA = a(clickedView, assetViews);
        a(this, frameLayout, tl1VarAttabal, strA, this.l.a(strA, this.F, this.E), false, 48);
    }

    @Override // ads_mobile_sdk.yj1
    public final JsonObject b(FrameLayout frameLayout, ImageView.ScaleType mediaViewScaleType, LinkedHashMap assetViews) {
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaViewScaleType, "mediaViewScaleType");
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("nas", a(frameLayout, mediaViewScaleType, assetViews));
        if (this.I.get() && j()) {
            jsonObject.addProperty("custom_click_gesture_eligible", Boolean.TRUE);
        }
        return jsonObject;
    }

    public static void a(yi0 yi0Var, FrameLayout frameLayout, tl1 tl1Var, String str, JsonObject jsonObject, boolean z, int i) {
        if ((i & 32) != 0) {
            z = false;
        }
        cutely.wireman(yi0Var.h, null, null, new ni0(yi0Var, tl1Var, jsonObject, null, str, frameLayout, z, null), 3, null);
    }

    @Override // ads_mobile_sdk.yj1
    public final void a(FrameLayout nativeAdView, ImageView.ScaleType mediaviewScaleType, Map assetViews) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaviewScaleType, "mediaviewScaleType");
        cutely.wireman(this.h, null, null, new oi0(this, null), 3, null);
        cutely.wireman(this.h, null, null, new pi0(this, lymphoblast.attabal(this.n, this.o, this.l, nativeAdView, assetViews, mediaviewScaleType), null, a(nativeAdView), !this.x.o0 ? false : !this.y, null), 3, null);
    }

    public final String a(FrameLayout frameLayout) {
        ri2 ri2Var = this.n;
        no0 no0Var = no0.CUI_NAME_VIEW_SIGNALS;
        l13 l13Var = this.o;
        List listFormularize = adultoid.formularize();
        if (j13.b().a == null) {
            v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
            try {
                String strA = this.j.a(frameLayout);
                interaction.saneness.attabal(v62VarA, null);
                return strA;
            } catch (Throwable th) {
                try {
                    v62VarA.b(th);
                    if (!(th instanceof evenfall)) {
                        v62VarA.a(th);
                        if (!(th instanceof TimeoutCancellationException)) {
                            if (!(th instanceof CancellationException)) {
                                if (th instanceof yn0) {
                                    throw th;
                                }
                                throw new gn0(th);
                            }
                            throw new bn0(th);
                        }
                        throw new cp0(th);
                    }
                    throw th;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        interaction.saneness.attabal(v62VarA, th2);
                        throw th3;
                    }
                }
            }
        }
        w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
        try {
            String strA2 = this.j.a(frameLayout);
            interaction.saneness.attabal(w03VarA, null);
            return strA2;
        } catch (Throwable th4) {
            try {
                w03VarA.b(th4);
                if (!(th4 instanceof evenfall)) {
                    w03VarA.a(th4);
                    if (!(th4 instanceof TimeoutCancellationException)) {
                        if (!(th4 instanceof CancellationException)) {
                            if (th4 instanceof yn0) {
                                throw th4;
                            }
                            throw new gn0(th4);
                        }
                        throw new bn0(th4);
                    }
                    throw new cp0(th4);
                }
                throw th4;
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    interaction.saneness.attabal(w03VarA, th5);
                    throw th6;
                }
            }
        }
    }

    public final String a(View view, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (Intrinsics.wireman(view, (View) ((WeakReference) entry.getValue()).get())) {
                return str;
            }
        }
        fj1 fj1Var = this.k.b;
        if (fj1Var != null && philologize.f37248attabal[fj1Var.ordinal()] == 1) {
            return "3099";
        }
        return null;
    }

    @Override // ads_mobile_sdk.yj1
    public final JsonObject a(FrameLayout frameLayout, ImageView.ScaleType mediaViewScaleType, LinkedHashMap assetViews) {
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaViewScaleType, "mediaViewScaleType");
        tl1 tl1VarAttabal = lymphoblast.attabal(this.n, this.o, this.l, frameLayout, assetViews, mediaViewScaleType);
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("asset_view_signal", tl1VarAttabal.a);
        jsonObject.add("ad_view_signal", tl1VarAttabal.b);
        jsonObject.add("scroll_view_signal", tl1VarAttabal.c);
        jsonObject.add("lock_screen_signal", tl1VarAttabal.d);
        return jsonObject;
    }

    @Override // ads_mobile_sdk.yj1
    public final void a(View view, int i) {
        boolean asBoolean = false;
        boolean z = this.m.getCustomClickGestureDirection() != null;
        JsonObject jsonObject = this.g;
        Intrinsics.checkNotNullParameter("allow_sdk_custom_click_gesture", X3.i.W);
        if (jsonObject != null) {
            try {
                Intrinsics.checkNotNullParameter(jsonObject, "<this>");
                Intrinsics.checkNotNullParameter("allow_sdk_custom_click_gesture", X3.i.W);
                asBoolean = jsonObject.get("allow_sdk_custom_click_gesture").getAsBoolean();
            } catch (Exception unused) {
            }
        }
        JsonObject jsonObject2 = null;
        if (!asBoolean) {
            if (!z && j()) {
                if (!this.I.get()) {
                    kn0.c("Custom click reporting failed. enableCustomClickGesture is not set.", null);
                    return;
                }
            } else {
                kn0.c("Custom click reporting failed. Ad unit id is not in the allow list.", null);
                return;
            }
        }
        technofreak technofreakVar = (technofreak) this.c.get();
        if (technofreakVar == null) {
            kn0.a("Ad should be associated with an ad view before calling performClickForCustomGesture()", null, null, 6);
            return;
        }
        ri2 ri2Var = this.n;
        l13 l13Var = this.o;
        xl1 xl1Var = this.l;
        cm1 cm1Var = (cm1) technofreakVar;
        FrameLayout frameLayoutC = cm1Var.c();
        Map mapB = cm1Var.b();
        ImageView.ScaleType scaleTypeE = cm1Var.e();
        if (scaleTypeE == null) {
            scaleTypeE = ImageView.ScaleType.CENTER_INSIDE;
        }
        tl1 tl1VarAttabal = lymphoblast.attabal(ri2Var, l13Var, xl1Var, frameLayoutC, mapB, scaleTypeE);
        String strA = a(view, cm1Var.b());
        JsonObject jsonObjectA = this.l.a(strA, this.F, this.E);
        if (asBoolean) {
            JsonObject jsonObject3 = this.g;
            xl1 xl1Var2 = this.l;
            Point point = this.F;
            Point point2 = this.E;
            xl1Var2.getClass();
            try {
                JsonObject jsonObject4 = new JsonObject();
                if (point != null) {
                    jsonObject4.addProperty("x", Integer.valueOf(point.x));
                    jsonObject4.addProperty("y", Integer.valueOf(point.y));
                }
                JsonObject jsonObject5 = new JsonObject();
                if (point2 != null) {
                    jsonObject5.addProperty("x", Integer.valueOf(point2.x));
                    jsonObject5.addProperty("y", Integer.valueOf(point2.y));
                }
                JsonObject jsonObject6 = new JsonObject();
                jsonObject6.add("start_point", jsonObject4);
                jsonObject6.add("end_point", jsonObject5);
                jsonObject6.addProperty("duration_ms", Integer.valueOf(i));
                jsonObject2 = jsonObject6;
            } catch (Exception e) {
                kn0.a("Error occurred while grabbing custom click gesture signals.", e);
            }
            jsonObject3.add("custom_click_gesture_signal", jsonObject2);
        }
        a(this, cm1Var.c(), tl1VarAttabal, strA, jsonObjectA, true, 16);
    }

    @Override // ads_mobile_sdk.yj1
    public final void a(FrameLayout frameLayout, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        this.l.getClass();
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        int[] iArr = new int[2];
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(iArr);
        }
        this.E = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        this.p.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.H = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.r.a = motionEvent;
            this.G = jCurrentTimeMillis;
            this.F = this.E;
        }
        MotionEvent inputEvent = MotionEvent.obtain(motionEvent);
        Point point = this.E;
        inputEvent.setLocation(point.x, point.y);
        g6 g6Var = this.j;
        Intrinsics.beachfront(inputEvent);
        g6Var.getClass();
        Intrinsics.checkNotNullParameter(inputEvent, "inputEvent");
        g6Var.b().a(inputEvent);
        inputEvent.recycle();
    }

    @Override // ads_mobile_sdk.yj1
    public final void a(WeakReference nativeAdViewContainer, FrameLayout frameLayout, LinkedHashMap assetViews, View.OnTouchListener touchListener, View.OnClickListener clickListener) {
        Intrinsics.checkNotNullParameter(nativeAdViewContainer, "nativeAdViewContainer");
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(touchListener, "touchListener");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        Intrinsics.checkNotNullParameter(nativeAdViewContainer, "<set-?>");
        this.c = nativeAdViewContainer;
        this.E = new Point();
        this.F = new Point();
        if (frameLayout != null) {
            cutely.wireman(this.i, null, null, new xi0(this, frameLayout, nativeAdViewContainer, null), 3, null);
        }
        if (frameLayout != null) {
            frameLayout.setOnTouchListener(touchListener);
            frameLayout.setClickable(true);
            frameLayout.setOnClickListener(clickListener);
        }
        Iterator it = assetViews.entrySet().iterator();
        while (it.hasNext()) {
            View view = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (view != null) {
                view.setOnTouchListener(touchListener);
                view.setClickable(true);
                view.setOnClickListener(clickListener);
            }
        }
    }

    @Override // ads_mobile_sdk.yj1
    public final void a(FrameLayout frameLayout, LinkedHashMap assetViews) {
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        WeakReference weakReference = new WeakReference(null);
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.c = weakReference;
        WeakReference weakReference2 = new WeakReference(null);
        Intrinsics.checkNotNullParameter(weakReference2, "<set-?>");
        this.d = weakReference2;
        this.E = new Point();
        this.F = new Point();
    }
}
