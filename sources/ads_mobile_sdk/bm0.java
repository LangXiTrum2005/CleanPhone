package ads_mobile_sdk;

import ads_mobile_sdk.bm0;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.textclassifier.TextClassifier;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import androidx.core.view.cig;
import androidx.core.view.czestochowa;
import androidx.core.view.hardpan;
import androidx.p000activity.ComponentActivity;
import androidx.p000activity.OnBackPressedDispatcher;
import androidx.p000activity.sealless;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.google.common.base.triweekly;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import formularization.beachfront;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.taiyuan;
import kurbash.formularize;
import org.objectweb.asm.Opcodes;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.MutablePropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import saneness.grout;
import saneness.libya;
import saneness.loun;
import saneness.storiette;
import saneness.sunback;

/* JADX INFO: loaded from: classes.dex */
public abstract class bm0 extends sealless implements sunback, libya {
    public static final /* synthetic */ formularize[] C = {polloi.competently(new MutablePropertyReference1Impl(bm0.class, "hasContentViewBeenSet", "getHasContentViewBeenSet()Z", 0))};
    public monroe A;
    public boolean B;
    public final Context a;
    public final saran b;
    public final CoroutineContext c;
    public final saran d;
    public final jk0 e;
    public final loun f;
    public final String g;
    public final ip0 h;
    public final storiette i;
    public final Optional j;
    public monroe k;
    public ComponentActivity l;
    public final vw2 m;
    public final AtomicBoolean n;
    public final AtomicBoolean o;
    public RelativeLayout p;
    public View q;
    public vq r;
    public boolean s;
    public cr t;
    public boolean u;
    public boolean v;
    public boolean w;
    public Toolbar x;
    public final formularization.attabal y;
    public boolean z;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ bm0(Context context, saran saranVar, CoroutineContext coroutineContext, saran saranVar2, jk0 jk0Var, loun lounVar, String str, ip0 ip0Var, storiette storietteVar) {
        Optional optionalEmpty = Optional.empty();
        Intrinsics.checkNotNullExpressionValue(optionalEmpty, "empty(...)");
        this(context, saranVar, coroutineContext, saranVar2, jk0Var, lounVar, str, ip0Var, storietteVar, optionalEmpty);
    }

    public static final void a(String str, String str2, String str3, String str4, long j) {
    }

    public static final void c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // saneness.sunback
    public abstract Object a(FullScreenContentError fullScreenContentError, wretchedly.dern dernVar);

    public abstract Object a(wretchedly.dern dernVar);

    public abstract void a(int i);

    public final RelativeLayout b(ComponentActivity componentActivity) throws InterruptedException {
        o();
        if (i()) {
            j().setLayerType(1, null);
        } else {
            Window window = componentActivity.getWindow();
            if (window != null) {
                window.setFlags(16777216, 16777216);
            }
        }
        RelativeLayout relativeLayout = new RelativeLayout(componentActivity);
        relativeLayout.setId(View.generateViewId());
        relativeLayout.setBackgroundColor(this.v ? 0 : -16777216);
        this.p = relativeLayout;
        if (this.w) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(j(), false);
            jk0 jk0Var = this.e;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:custom_webview_disable_text_classifier:enabled", X3.i.W);
            Boolean bool = Boolean.FALSE;
            jk jkVar = zk.b;
            if (((Boolean) jk0Var.a("gads:custom_webview_disable_text_classifier:enabled", bool, jkVar)).booleanValue() && Build.VERSION.SDK_INT >= 27) {
                j().setTextClassifier(TextClassifier.NO_OP);
            }
            jk0 jk0Var2 = this.e;
            jk0Var2.getClass();
            Intrinsics.checkNotNullParameter("gads:custom_webview_disable_downloads:enabled", X3.i.W);
            if (((Boolean) jk0Var2.a("gads:custom_webview_disable_downloads:enabled", bool, jkVar)).booleanValue()) {
                j().setDownloadListener(new DownloadListener() { // from class: saneness.palmyra
                    @Override // android.webkit.DownloadListener
                    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                        bm0.a(str, str2, str3, str4, j);
                    }
                });
            }
            if (Build.VERSION.SDK_INT >= 28) {
                componentActivity.setShowWhenLocked(true);
            } else {
                componentActivity.getWindow().addFlags(Opcodes.ASM8);
            }
            this.x = a(relativeLayout);
        } else {
            relativeLayout.addView(g(), -1, -1);
            jk0 jk0Var3 = this.e;
            jk0Var3.getClass();
            Intrinsics.checkNotNullParameter("gad:interstitial:close_button_padding_dip", X3.i.W);
            int iIntValue = ((Number) jk0Var3.a("gad:interstitial:close_button_padding_dip", 20, zk.f)).intValue();
            jk0 jk0Var4 = this.e;
            jk0Var4.getClass();
            Intrinsics.checkNotNullParameter("gads:force_top_right_close_button:enabled", X3.i.W);
            boolean zBooleanValue = ((Boolean) jk0Var4.a("gads:force_top_right_close_button:enabled", Boolean.TRUE, zk.b)).booleanValue();
            wq wqVar = new wq(zBooleanValue ? iIntValue : 0, zBooleanValue ? 0 : iIntValue, iIntValue);
            jk0 jk0Var5 = this.e;
            grout.attabal(jk0Var5, "gads:close_button_asset_name", X3.i.W, "white", "defaultValue");
            vq vqVar = new vq(componentActivity, (String) jk0Var5.a("gads:close_button_asset_name", "white", zk.o), wqVar);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10);
            if (zBooleanValue) {
                layoutParams.addRule(11);
            } else {
                layoutParams.addRule(9);
            }
            this.r = vqVar;
            vqVar.a = new dl0(this);
            if ((!this.s || h()) && !f()) {
                vq vqVar2 = this.r;
                if (vqVar2 != null) {
                    vqVar2.setVisibility(0);
                }
                this.s = false;
            } else {
                vq vqVar3 = this.r;
                if (vqVar3 != null) {
                    vqVar3.setVisibility(8);
                }
                this.s = true;
            }
            RelativeLayout relativeLayout2 = this.p;
            if (relativeLayout2 != null) {
                relativeLayout2.addView(vqVar, layoutParams);
            }
            a(vqVar);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(10);
        layoutParams2.addRule(9);
        componentActivity.setContentView(relativeLayout, layoutParams2);
        taiyuan.saneness(null, new el0(this, null), 1, null);
        return relativeLayout;
    }

    public abstract Object c(wretchedly.dern dernVar);

    @Override // saneness.sunback
    public final void d() {
        Optional optional = this.j;
        final ul0 ul0Var = ul0.a;
        optional.ifPresent(new Consumer() { // from class: saneness.hardpan
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                bm0.d(ul0Var, obj);
            }
        });
    }

    public boolean f() {
        return false;
    }

    public final View g() {
        View view = this.q;
        if (view != null) {
            return view;
        }
        Intrinsics.preprohormone("contentView");
        return null;
    }

    public boolean h() {
        return false;
    }

    @Override // androidx.p000activity.sealless
    public final void handleOnBackPressed() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        if (j().canGoBack()) {
            j().goBack();
            return;
        }
        if (((uh) this.i).a.get() || j().j.get()) {
            this.t = cr.BACK_BUTTON;
            setEnabled(false);
            ComponentActivity componentActivity = this.l;
            if (componentActivity == null || (onBackPressedDispatcher = componentActivity.getOnBackPressedDispatcher()) == null) {
                return;
            }
            onBackPressedDispatcher.formularize();
            return;
        }
        saran saranVar = this.b;
        ml0 block = new ml0(this, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    public boolean i() {
        return false;
    }

    public abstract gq0 j();

    public abstract int k();

    public final void l() {
        saran saranVar = this.d;
        pl0 block = new pl0(this, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        this.k = cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    public final void m() {
        this.u = true;
    }

    public final void n() {
        ComponentActivity componentActivity = this.l;
        if (componentActivity == null || !componentActivity.isFinishing() || this.o.get()) {
            return;
        }
        saran saranVar = this.b;
        zl0 block = new zl0(this, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    public final void o() {
        try {
            ComponentActivity componentActivity = this.l;
            if (componentActivity == null) {
                return;
            }
            componentActivity.setRequestedOrientation(k());
        } catch (IllegalStateException e) {
            triweekly triweeklyVar = kn0.a;
            kn0.c("Unable to update orientation: " + e, null);
        }
    }

    @Override // saneness.sunback
    public final void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
    }

    @Override // saneness.sunback
    public final void onDestroy() {
        n();
        Optional optional = this.j;
        final sl0 sl0Var = sl0.a;
        optional.ifPresent(new Consumer() { // from class: saneness.julian
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                bm0.b(sl0Var, obj);
            }
        });
    }

    @Override // saneness.sunback
    public final void onPause() {
        n();
        Optional optional = this.j;
        final tl0 tl0Var = tl0.a;
        optional.ifPresent(new Consumer() { // from class: saneness.achondroplasia
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                bm0.c(tl0Var, obj);
            }
        });
    }

    @Override // saneness.sunback
    public final void onResume() {
        ComponentActivity componentActivity;
        Window window;
        ComponentActivity componentActivity2 = this.l;
        if (componentActivity2 != null && !componentActivity2.isInMultiWindowMode() && (componentActivity = this.l) != null && (window = componentActivity.getWindow()) != null) {
            cig cigVarAttabal = czestochowa.attabal(window, window.getDecorView());
            Intrinsics.checkNotNullExpressionValue(cigVarAttabal, "getInsetsController(...)");
            if (this.u) {
                cigVarAttabal.marial(2);
            }
            cigVarAttabal.attabal(this.u ? hardpan.triweekly.competently() : hardpan.triweekly.beachfront());
        }
        if (!j().j.get()) {
            j().onResume();
        }
        Optional optional = this.j;
        final vl0 vl0Var = vl0.a;
        optional.ifPresent(new Consumer() { // from class: saneness.herdbook
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                bm0.e(vl0Var, obj);
            }
        });
    }

    public static final void d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public Toolbar a(RelativeLayout expandableLayout) {
        Intrinsics.checkNotNullParameter(expandableLayout, "expandableLayout");
        return a(expandableLayout, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm0(Context applicationContext, saran uiScope, CoroutineContext uiContext, saran backgroundScope, jk0 flags, loun traceLogger, String afmaVersion, ip0 gmaUtil, storiette backButtonStateDelegate, Optional adActivityLifecycleEventEmitter) {
        super(true);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(backButtonStateDelegate, "backButtonStateDelegate");
        Intrinsics.checkNotNullParameter(adActivityLifecycleEventEmitter, "adActivityLifecycleEventEmitter");
        this.a = applicationContext;
        this.b = uiScope;
        this.c = uiContext;
        this.d = backgroundScope;
        this.e = flags;
        this.f = traceLogger;
        this.g = afmaVersion;
        this.h = gmaUtil;
        this.i = backButtonStateDelegate;
        this.j = adActivityLifecycleEventEmitter;
        this.m = new vw2(Boolean.FALSE);
        this.n = new AtomicBoolean(false);
        this.o = new AtomicBoolean(false);
        this.y = beachfront.saneness(false, 1, null);
    }

    @Override // saneness.sunback
    public final void c() {
        Optional optional = this.j;
        final yl0 yl0Var = yl0.a;
        optional.ifPresent(new Consumer() { // from class: saneness.unconsolidated
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                bm0.h(yl0Var, obj);
            }
        });
    }

    @Override // saneness.sunback
    public final void e() {
        this.m.setValue(this, C[0], Boolean.TRUE);
    }

    public final Toolbar a(RelativeLayout expandableLayout, String str) {
        Intrinsics.checkNotNullParameter(expandableLayout, "expandableLayout");
        Toolbar toolbar = new Toolbar(this.l);
        toolbar.setId(View.generateViewId());
        g().setId(View.generateViewId());
        toolbar.setBackgroundColor(-12303292);
        toolbar.setTitleMarginStart(0);
        toolbar.setSubtitle(str);
        toolbar.setVisibility(0);
        toolbar.setContentDescription("gma_custom_webview_toolbar");
        try {
            toolbar.setNavigationIcon(this.a.getResources().getDrawable(danae.saneness.admob_close_button_white_cross, null));
        } catch (Resources.NotFoundException e) {
            kn0.a("Error obtaining close icon.", e, null, 4);
        } catch (NullPointerException e2) {
            kn0.a("Error obtaining close icon.", e2, null, 4);
        }
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: saneness.lightstruck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bm0.a(this.f37190kowloon, view);
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        expandableLayout.addView(toolbar, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, toolbar.getId());
        layoutParams2.addRule(12);
        expandableLayout.addView(g(), layoutParams2);
        return toolbar;
    }

    public static final void a(bm0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        cr closeReason = cr.CLOSE_BUTTON;
        this$0.getClass();
        Intrinsics.checkNotNullParameter(closeReason, "closeReason");
        this$0.t = closeReason;
        ComponentActivity componentActivity = this$0.l;
        if (componentActivity != null) {
            componentActivity.finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0 A[Catch: all -> 0x0038, PHI: r2 r14
  0x00d0: PHI (r2v4 ??) = (r2v7 ??), (r2v8 ??) binds: [B:52:0x00cd, B:21:0x0044] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r14v9 formularization.attabal) = (r14v23 formularization.attabal), (r14v24 formularization.attabal) binds: [B:52:0x00cd, B:21:0x0044] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x0038, blocks: (B:15:0x0033, B:62:0x0117, B:54:0x00d0, B:56:0x00d4, B:58:0x00d8, B:59:0x00ff), top: B:67:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:15:0x0033, B:62:0x0117, B:54:0x00d0, B:56:0x00d4, B:58:0x00d8, B:59:0x00ff), top: B:67:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ff A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:15:0x0033, B:62:0x0117, B:54:0x00d0, B:56:0x00d4, B:58:0x00d8, B:59:0x00ff), top: B:67:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0114, code lost:
    
        if (kotlinx.coroutines.impromptu.competently(r15, r4, r0) == r1) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [ads_mobile_sdk.bm0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r14v10, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r14v15, types: [ads_mobile_sdk.bm0] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v4, types: [ads_mobile_sdk.bm0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r2v3, types: [ads_mobile_sdk.bm0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [ads_mobile_sdk.bm0] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.bm0 r14, wretchedly.dern r15) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bm0.a(ads_mobile_sdk.bm0, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(gq0 gq0Var, wretchedly.dern dernVar) {
        jl0 jl0Var;
        int iOrdinal;
        String strValueOf;
        bm0 bm0Var;
        bm0 bm0Var2;
        u20 u20Var;
        Object objA;
        Object objC;
        if (dernVar instanceof jl0) {
            jl0Var = (jl0) dernVar;
            int i = jl0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                jl0Var.f = i - Integer.MIN_VALUE;
            } else {
                jl0Var = new jl0(this, dernVar);
            }
        } else {
            jl0Var = new jl0(this, dernVar);
        }
        Object obj = jl0Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = jl0Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            cr crVar = this.t;
            if (crVar != null) {
                iOrdinal = crVar.ordinal();
            } else {
                cr crVar2 = cr.BACK_BUTTON;
                iOrdinal = 3;
            }
            strValueOf = String.valueOf(iOrdinal);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("closetype", strValueOf);
            jsonObject.addProperty("version", this.g);
            jl0Var.a = this;
            jl0Var.b = gq0Var;
            jl0Var.c = strValueOf;
            jl0Var.f = 1;
            if (gq0Var.a(jsonObject, "onhide", jl0Var) != objBeachfront) {
                bm0Var = this;
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            String str = jl0Var.c;
            gq0 gq0Var2 = jl0Var.b;
            bm0Var = jl0Var.a;
            p002kotlin.dern.saneness(obj);
            strValueOf = str;
            gq0Var = gq0Var2;
        } else {
            if (i2 == 2) {
                String str2 = jl0Var.c;
                gq0 gq0Var3 = jl0Var.b;
                bm0 bm0Var3 = jl0Var.a;
                p002kotlin.dern.saneness(obj);
                strValueOf = str2;
                gq0Var = gq0Var3;
                bm0Var2 = bm0Var3;
                jl0Var.a = bm0Var2;
                jl0Var.b = gq0Var;
                jl0Var.c = null;
                jl0Var.f = 3;
                u20Var = gq0Var.d;
                if (u20Var != null) {
                    objA = u20Var.a("close_type", strValueOf, true, (wretchedly.dern) jl0Var);
                    if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                        objA = Unit.f29295attabal;
                    }
                } else {
                    objA = null;
                }
                if (objA != objBeachfront) {
                }
                return objBeachfront;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
                return obj;
            }
            gq0Var = jl0Var.b;
            bm0Var2 = jl0Var.a;
            p002kotlin.dern.saneness(obj);
        }
        if (bm0Var2.t == cr.BACK_BUTTON) {
            jl0Var.a = null;
            jl0Var.b = null;
            jl0Var.f = 4;
            objC = gq0Var.c("aebb2", jl0Var);
            if (objC != objBeachfront) {
                return objBeachfront;
            }
            return objC;
        }
        return Unit.f29295attabal;
        jl0Var.a = bm0Var;
        jl0Var.b = gq0Var;
        jl0Var.c = strValueOf;
        jl0Var.f = 2;
        if (gq0Var.c("aeh2", jl0Var) != objBeachfront) {
            bm0Var2 = bm0Var;
            jl0Var.a = bm0Var2;
            jl0Var.b = gq0Var;
            jl0Var.c = null;
            jl0Var.f = 3;
            u20Var = gq0Var.d;
            if (u20Var != null) {
                objA = u20Var.a("close_type", strValueOf, true, (wretchedly.dern) jl0Var);
                if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    objA = Unit.f29295attabal;
                }
            } else {
                objA = null;
            }
            if (objA != objBeachfront) {
                if (bm0Var2.t == cr.BACK_BUTTON) {
                    jl0Var.a = null;
                    jl0Var.b = null;
                    jl0Var.f = 4;
                    objC = gq0Var.c("aebb2", jl0Var);
                    if (objC != objBeachfront) {
                        return objC;
                    }
                } else {
                    return Unit.f29295attabal;
                }
            }
        }
        return objBeachfront;
    }

    public Object b(wretchedly.dern dernVar) {
        return a(this, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r5 == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ads_mobile_sdk.gq0 r8, wretchedly.dern r9) throws java.lang.InterruptedException {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.kl0
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.kl0 r0 = (ads_mobile_sdk.kl0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.kl0 r0 = new ads_mobile_sdk.kl0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            p002kotlin.dern.saneness(r9)
            goto L79
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            ads_mobile_sdk.gq0 r8 = r0.a
            p002kotlin.dern.saneness(r9)
            goto L5f
        L3b:
            p002kotlin.dern.saneness(r9)
            com.google.gson.JsonObject r9 = new com.google.gson.JsonObject
            r9.<init>()
            java.lang.String r2 = r7.g
            java.lang.String r6 = "version"
            r9.addProperty(r6, r2)
            ads_mobile_sdk.ll0 r2 = new ads_mobile_sdk.ll0
            r2.<init>(r8, r9, r5)
            kotlinx.coroutines.impromptu.beachfront(r5, r2, r4, r5)
            r0.a = r8
            r0.d = r4
            java.lang.String r9 = "aes2"
            java.lang.Object r9 = r8.c(r9, r0)
            if (r9 != r1) goto L5f
            goto L78
        L5f:
            r0.a = r5
            r0.d = r3
            ads_mobile_sdk.u20 r8 = r8.d
            if (r8 == 0) goto L76
            java.lang.String r9 = "native:view_show"
            java.lang.Object r5 = r8.a(r9, r0)
            java.lang.Object r8 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            if (r5 != r8) goto L74
            goto L76
        L74:
            ads_mobile_sdk.b03 r5 = (ads_mobile_sdk.b03) r5
        L76:
            if (r5 != r1) goto L79
        L78:
            return r1
        L79:
            kotlin.Unit r8 = p002kotlin.Unit.f29295attabal
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bm0.b(ads_mobile_sdk.gq0, wretchedly.dern):java.lang.Object");
    }

    public static final void b(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // saneness.sunback
    public final void b() {
        if (!j().j.get()) {
            j().onResume();
        }
        Optional optional = this.j;
        final wl0 wl0Var = wl0.a;
        optional.ifPresent(new Consumer() { // from class: saneness.claque
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                bm0.f(wl0Var, obj);
            }
        });
    }

    public final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            j().m = this;
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(this.h.a(context, this));
            l();
            return true;
        } catch (ActivityNotFoundException e) {
            y13.a(this.d, new nl0(this, null));
            y13.a("Exception starting Activity", e, 4);
            ((d13) this.f).a("AdActivityLauncher.show", e);
            return false;
        } catch (SecurityException e2) {
            y13.a(this.d, new ol0(this, null));
            y13.a("Exception starting Activity", e2, 4);
            ((d13) this.f).a("AdActivityLauncher.show", e2);
            return false;
        }
    }

    public void a(vq closeButton) {
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
    }

    @Override // saneness.sunback
    public final void a(ComponentActivity activity) throws InterruptedException {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.l = activity;
        if (this.o.get()) {
            activity.finish();
            return;
        }
        if (!this.n.getAndSet(true)) {
            monroe monroeVar = this.k;
            if (monroeVar != null) {
                monroe.attabal.attabal(monroeVar, null, 1, null);
            }
            activity.getOnBackPressedDispatcher().taiyuan(activity, this);
            RelativeLayout relativeLayoutB = b(activity);
            saran saranVar = this.d;
            ql0 block = new ql0(this, relativeLayoutB, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        Optional optional = this.j;
        final rl0 rl0Var = rl0.a;
        optional.ifPresent(new Consumer() { // from class: saneness.monroe
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                bm0.a(rl0Var, obj);
            }
        });
    }

    public static final void a(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // saneness.sunback
    public void a() {
        if (!j().j.get()) {
            j().onPause();
        }
        n();
        Optional optional = this.j;
        final xl0 xl0Var = xl0.a;
        optional.ifPresent(new Consumer() { // from class: saneness.picketboat
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                bm0.g(xl0Var, obj);
            }
        });
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.q = view;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0081 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:36:0x007d, B:38:0x0081, B:39:0x0084, B:41:0x0088), top: B:46:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r6.a(r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r9, wretchedly.dern r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.am0
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.am0 r0 = (ads_mobile_sdk.am0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.am0 r0 = new ads_mobile_sdk.am0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.d
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            formularization.attabal r9 = r0.b
            ads_mobile_sdk.bm0 r0 = r0.a
            p002kotlin.dern.saneness(r10)     // Catch: java.lang.Throwable -> L31
            goto L7d
        L31:
            r10 = move-exception
            goto L8e
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            boolean r9 = r0.c
            formularization.attabal r2 = r0.b
            ads_mobile_sdk.bm0 r6 = r0.a
            p002kotlin.dern.saneness(r10)
            r10 = r2
            goto L5b
        L46:
            p002kotlin.dern.saneness(r10)
            formularization.attabal r10 = r8.y
            r0.a = r8
            r0.b = r10
            r0.c = r9
            r0.f = r4
            java.lang.Object r2 = r10.attabal(r5, r0)
            if (r2 != r1) goto L5a
            goto L75
        L5a:
            r6 = r8
        L5b:
            boolean r2 = r6.B     // Catch: java.lang.Throwable -> L76
            if (r2 != 0) goto L87
            r6.z = r9     // Catch: java.lang.Throwable -> L76
            if (r9 != 0) goto L87
            r6.B = r4     // Catch: java.lang.Throwable -> L76
            kotlinx.coroutines.monroe r9 = r6.A     // Catch: java.lang.Throwable -> L76
            if (r9 == 0) goto L7b
            r0.a = r6     // Catch: java.lang.Throwable -> L76
            r0.b = r10     // Catch: java.lang.Throwable -> L76
            r0.f = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r9 = r6.a(r0)     // Catch: java.lang.Throwable -> L76
            if (r9 != r1) goto L7b
        L75:
            return r1
        L76:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
            goto L8e
        L7b:
            r9 = r10
            r0 = r6
        L7d:
            kotlinx.coroutines.monroe r10 = r0.A     // Catch: java.lang.Throwable -> L31
            if (r10 == 0) goto L84
            kotlinx.coroutines.monroe.attabal.attabal(r10, r5, r4, r5)     // Catch: java.lang.Throwable -> L31
        L84:
            r0.A = r5     // Catch: java.lang.Throwable -> L31
            goto L88
        L87:
            r9 = r10
        L88:
            kotlin.Unit r10 = p002kotlin.Unit.f29295attabal     // Catch: java.lang.Throwable -> L31
            r9.wireman(r5)
            return r10
        L8e:
            r9.wireman(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bm0.a(boolean, wretchedly.dern):java.lang.Object");
    }

    public Object a(View view, wretchedly.dern dernVar) {
        return Unit.f29295attabal;
    }
}
