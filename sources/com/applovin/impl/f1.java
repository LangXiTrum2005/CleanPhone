package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.applovin.creative.MaxCreativeDebuggerActivity;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.O6;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class f1 implements n1.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static WeakReference f7818m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final AtomicBoolean f7819n = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f7821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f7822c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e1 f7824e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private n1 f7826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j7 f7827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f7828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f7829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f7830k;
    private boolean l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f7823d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference f7825f = new WeakReference(null);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends LinkedHashMap {
        public a(int i10) {
            super(i10);
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends com.applovin.impl.b {
        public b() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.p.g("AppLovinSdk", "Started Creative Debugger");
                if (!f1.this.h() || f1.f7818m.get() != activity) {
                    MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                    WeakReference unused = f1.f7818m = new WeakReference(maxCreativeDebuggerActivity);
                    maxCreativeDebuggerActivity.a(f1.this.f7824e, f1.this.f7820a.e());
                }
                f1.f7819n.set(false);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.p.g("AppLovinSdk", "Creative Debugger destroyed");
                WeakReference unused = f1.f7818m = null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f7833a;

        public c(Object obj) {
            this.f7833a = obj;
        }

        @Override // com.applovin.impl.d.b
        public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
            maxCreativeDebuggerDisplayedAdActivity.a(new r1(this.f7833a, f1.this.f7820a.J().b()), f1.this.f7820a);
            f1.f7819n.set(false);
        }
    }

    public f1(com.applovin.impl.sdk.l lVar) {
        this.f7820a = lVar;
        Context contextP = com.applovin.impl.sdk.l.p();
        this.f7821b = contextP;
        this.f7822c = new a(10);
        this.f7824e = new e1(contextP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.f7828i = 0;
    }

    private void m() {
        this.f7820a.e().a(new b());
    }

    public void k() {
        n1 n1Var = this.f7826g;
        if (n1Var != null) {
            n1Var.b();
        }
    }

    public void l() {
        if (g()) {
            this.f7829j = ((Boolean) this.f7820a.a(z4.f10223p1)).booleanValue();
            if (this.f7826g == null) {
                this.f7826g = new n1(this.f7820a, this);
            }
            this.f7826g.a();
        }
    }

    public void n() {
        ArrayList arrayList;
        if (h() || !f7819n.compareAndSet(false, true)) {
            com.applovin.impl.sdk.p.h("AppLovinSdk", "Creative Debugger is already showing");
            return;
        }
        Object objA = this.f7820a.J().a();
        if (objA != null) {
            e(objA);
            return;
        }
        synchronized (this.f7823d) {
            arrayList = new ArrayList(this.f7822c.values());
        }
        Collections.reverse(arrayList);
        this.f7824e.a(arrayList, this.f7820a);
        if (!this.l) {
            m();
            this.l = true;
        }
        com.applovin.impl.sdk.p.g("AppLovinSdk", "Starting Creative Debugger...");
        d.a(this.f7821b, MaxCreativeDebuggerActivity.class);
    }

    private void e(Object obj) {
        com.applovin.impl.sdk.p.g("AppLovinSdk", "Starting Creative Debugger for current fullscreen ad...");
        d.a(this.f7821b, MaxCreativeDebuggerDisplayedAdActivity.class, this.f7820a.e(), new c(obj));
    }

    private Drawable f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, 131, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        WeakReference weakReference = f7818m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.f7830k);
        if (this.f7830k == 0 || seconds < 10) {
            return;
        }
        this.f7820a.E().a(f2.f7842d, "showingMediationDebuggerFromHoldingCreativeDebuggerButton");
        this.f7820a.Y0();
    }

    @Override // com.applovin.impl.n1.a
    public void b() {
        if (this.f7828i == 0) {
            this.f7827h = j7.a(TimeUnit.SECONDS.toMillis(3L), this.f7820a, new a9(this, 0));
        }
        int i10 = this.f7828i;
        if (i10 % 2 == 0) {
            this.f7828i = i10 + 1;
        }
    }

    public boolean g() {
        return ((Boolean) this.f7820a.a(z4.f10216o1)).booleanValue() && this.f7820a.p0().isCreativeDebuggerEnabled();
    }

    private boolean c(Object obj) {
        MaxAdFormat format;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            format = ((com.applovin.impl.sdk.ad.b) obj).getAdZone().d();
        } else {
            format = obj instanceof a3 ? ((a3) obj).getFormat() : null;
        }
        return format != null && format.isFullscreenAd();
    }

    public void d(Object obj) {
        if (g() && obj != null) {
            if (!y3.a(obj) || c(obj)) {
                String strB = b(obj);
                synchronized (this.f7823d) {
                    try {
                        r1 r1Var = (r1) this.f7822c.get(strB);
                        if (r1Var != null) {
                            r1Var.a(obj);
                        } else {
                            this.f7822c.put(strB, new r1(obj, System.currentTimeMillis()));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (g() && this.f7825f.get() == null && !h()) {
            Activity activityB = this.f7820a.e().b();
            if (activityB == null) {
                this.f7820a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7820a.Q().b("AppLovinSdk", "Failed to display Creative Debugger button");
                    return;
                }
                return;
            }
            View viewFindViewById = activityB.findViewById(R.id.content);
            if (viewFindViewById instanceof FrameLayout) {
                final FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                final View viewA = a(frameLayout, activityB);
                frameLayout.addView(viewA);
                AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                alphaAnimation.setDuration(150L);
                viewA.startAnimation(alphaAnimation);
                ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.y8
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        this.f10081a.a(viewA, frameLayout);
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                AppLovinSdkUtils.runOnUiThreadDelayed(new z8(this, viewA, frameLayout, viewTreeObserver, onGlobalLayoutListener, 0), TimeUnit.SECONDS.toMillis(5L));
                this.f7825f = new WeakReference(viewA);
            }
        }
    }

    @Override // com.applovin.impl.n1.a
    public void a() {
        int i10 = this.f7828i;
        if (i10 % 2 == 1) {
            this.f7828i = i10 + 1;
        }
        if (this.f7828i / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new a9(this, 1));
            this.f7828i = 0;
            this.f7827h.a();
        }
    }

    private void b(View view, FrameLayout frameLayout) {
        if (this.f7829j) {
            view.setOnTouchListener(null);
            this.f7830k = 0L;
        }
        frameLayout.removeView(view);
        this.f7825f = new WeakReference(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout) {
        if (view.getParent() != null || this.f7825f.get() == null) {
            return;
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (this.f7830k > 0 && this.f7829j) {
            view.setVisibility(4);
        } else {
            b(view, frameLayout);
        }
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public String b(r1 r1Var) {
        com.applovin.impl.sdk.ad.b bVarC = r1Var.c();
        a3 a3VarE = r1Var.e();
        if (bVarC == null) {
            if (a3VarE != null) {
                return a3VarE.E();
            }
            return null;
        }
        return "json_v3!" + Base64.encodeToString(bVarC.getOriginalFullResponse().toString().getBytes(), 2);
    }

    private View a(final FrameLayout frameLayout, Activity activity) {
        View view;
        int iDpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i10 = iDpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx, iDpToPx, 8388629);
        layoutParams.setMargins(i10, i10, i10, i10);
        try {
            ImageButton imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i10, i10, i10, i10 * 2);
            view = imageButton;
        } catch (Throwable unused) {
            Button button = new Button(activity);
            button.setText("ⓘ");
            button.setTextColor(-1);
            button.setAllCaps(false);
            button.setTextSize(2, 20.0f);
            button.setPadding(0, 0, 0, 0);
            view = button;
        }
        view.setLayoutParams(layoutParams);
        view.setBackground(f());
        if (this.f7829j) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.b9
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return this.f7604a.a(frameLayout, view2, motionEvent);
                }
            });
        } else {
            view.setOnClickListener(new c9(this, 0));
        }
        view.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        return view;
    }

    private String b(Object obj) {
        String strT;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            strT = ((com.applovin.impl.sdk.ad.b) obj).getMediationServeId();
        } else {
            strT = obj instanceof a3 ? ((a3) obj).T() : null;
        }
        return StringUtils.isValidString(strT) ? strT : UUID.randomUUID().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(FrameLayout frameLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f7830k = SystemClock.elapsedRealtime();
            AppLovinSdkUtils.runOnUiThreadDelayed(new a9(this, 2), TimeUnit.SECONDS.toMillis(10L));
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        }
        if (view.getVisibility() == 0) {
            this.f7830k = 0L;
            n();
            return true;
        }
        b(view, frameLayout);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.Serializable, java.lang.Object[]] */
    public void a(r1 r1Var, Context context, boolean z10) {
        String strA = a(r1Var);
        x2 x2Var = new x2();
        if (z10) {
            x2Var.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        x2Var.b(strA);
        String strB = b(r1Var);
        if (strB != null) {
            x2Var.a("\nBid Response:\n");
            x2Var.a(strB);
        }
        String str = r1Var.c() != null ? "AppLovin Ad Report" : "MAX Ad Report";
        Intent intentCreateChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", x2Var.toString()).setPackage(null), "Share Ad Report");
        if (z10) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:")).putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", x2Var.toString()).setPackage("com.google.android.gm");
                String str2 = this.f7820a.p0().getExtraParameters().get("creative_debugger_email_recipients");
                if (StringUtils.isValidString(str2)) {
                    intent.putExtra("android.intent.extra.EMAIL", (Serializable) CollectionUtils.explode(str2).toArray());
                }
                context.startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                context.startActivity(intentCreateChooser);
                return;
            }
        }
        context.startActivity(intentCreateChooser);
    }

    public String a(r1 r1Var) {
        x2 x2Var = new x2();
        x2Var.b("Ad Info:\n");
        a3 a3VarE = r1Var.e();
        com.applovin.impl.sdk.ad.b bVarC = r1Var.c();
        if (a3VarE != null) {
            x2Var.a(a3VarE);
        } else if (bVarC != null) {
            x2Var.a(AndroidInitializeBoldSDK.MSG_NETWORK, "APPLOVIN").a(bVarC).b(bVarC);
        }
        x2Var.a(this.f7820a);
        x2Var.a("Epoch Timestamp (ms)", Long.valueOf(r1Var.b()));
        x2 x2Var2 = new x2();
        Map mapG = this.f7820a.B().G();
        x2Var2.a("Platform", "fireos".equals(mapG.get(O6.H)) ? "Fire OS" : X3.f27645d).a("OS Version", Build.VERSION.RELEASE).a("Device", Build.BRAND + " " + Build.MODEL + " (" + Build.DEVICE + ")").a("App Package Name", this.f7821b.getPackageName()).a("App Version", mapG.get("app_version")).a("App Version Code", mapG.get("app_version_code")).a("User ID", this.f7820a.y0().e() != null ? this.f7820a.y0().e() : "None");
        x2Var.a("\nApp Info:").a(x2Var2.toString());
        x2 x2Var3 = new x2();
        x2Var3.a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.f7820a.a(z4.R3)).a("AppLovin Random Token", this.f7820a.j0()).a("Ad Review Version", j.b()).a(a(r1Var.a())).a("MD", this.f7820a.a(z4.f10251t));
        x2Var.a("\nDebug Info:\n").a(w4.b(x2Var3.toString(), q7.a(this.f7820a), w4.a.V2, this.f7820a));
        return x2Var.toString();
    }

    private Bundle a(Object obj) {
        this.f7820a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7820a.Q().a("CreativeDebuggerService", "Retrieving Ad Review info for ad: " + obj);
        }
        String strA = q7.a(obj);
        Bundle bundleA = this.f7820a.k().a(strA);
        this.f7820a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            defpackage.e.A("Serve id: ", strA, this.f7820a.Q(), "CreativeDebuggerService");
        }
        this.f7820a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7820a.Q().a("CreativeDebuggerService", "Public data: " + bundleA);
        }
        if (bundleA == null) {
            return null;
        }
        for (String str : bundleA.keySet()) {
            Object obj2 = bundleA.get(str);
            bundleA.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, bundleA);
        }
        return bundleA;
    }
}
