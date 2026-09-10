package ads_mobile_sdk;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.common.base.triweekly;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import http.arytenoidectomy;
import http.kowloon;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.gintrap;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.preprohormone;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.taiyuan;
import org.chromium.support_lib_boundary.util.Features;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.dishoard;
import saneness.gerenuk;
import saneness.imari;
import saneness.libya;
import saneness.loun;
import saneness.microchemistry;
import saneness.moresque;
import saneness.phytopathogen;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class gq0 extends WebView {
    public final CoroutineContext a;
    public final saran b;
    public final saran c;
    public final u20 d;
    public final loun e;
    public final g6 f;
    public final microchemistry g;
    public final rs0 h;
    public final jk0 i;
    public final AtomicBoolean j;
    public final AtomicBoolean k;
    public final AtomicBoolean l;
    public libya m;
    public volatile phytopathogen n;
    public volatile x83 o;
    public er0 p;
    public ia3 q;
    public int r;
    public moresque s;
    public final b03 t;
    public b03 u;
    public final DisplayMetrics v;
    public gerenuk w;
    public pq0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq0(CoroutineContext uiContext, saran uiScope, saran backgroundScope, u20 u20Var, loun traceLogger, g6 adSpamClient, Context context, String userAgent, ia3 size, microchemistry webViewCompatWrapper, rs0 htmlUtil, jk0 flags) throws InterruptedException {
        super(context);
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(webViewCompatWrapper, "webViewCompatWrapper");
        Intrinsics.checkNotNullParameter(htmlUtil, "htmlUtil");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = uiContext;
        this.b = uiScope;
        this.c = backgroundScope;
        this.d = u20Var;
        this.e = traceLogger;
        this.f = adSpamClient;
        this.g = webViewCompatWrapper;
        this.h = htmlUtil;
        this.i = flags;
        this.j = new AtomicBoolean(false);
        this.k = new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        this.q = size;
        this.r = -1;
        this.t = (b03) taiyuan.saneness(null, new fq0(this, null), 1, null);
        this.v = imari.dern(context);
        taiyuan.saneness(null, new lp0(this, null), 1, null);
        WebSettings settings = getSettings();
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setMixedContentMode(2);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setTextZoom(100);
        settings.setSupportMultipleWindows(true);
        settings.setSupportZoom(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setUserAgentString(userAgent);
        if (flags.n()) {
            clearCache(true);
        }
        setWillNotDraw(false);
        setLayerType(0, null);
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        setBackgroundColor(0);
        if (flags.u()) {
            setSoundEffectsEnabled(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0101  */
    /* JADX WARN: Code duplicated, block: B:58:0x0111  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, String str2, UUID uuid, wretchedly.dern dernVar) {
        mp0 mp0Var;
        UUID uuid2;
        gintrap gintrapVar;
        String str3;
        String str4;
        gq0 gq0Var;
        gq0 gq0Var2;
        gq0 gq0Var3;
        if (dernVar instanceof mp0) {
            mp0Var = (mp0) dernVar;
            int i = mp0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                mp0Var.h = i - Integer.MIN_VALUE;
            } else {
                mp0Var = new mp0(this, dernVar);
            }
        } else {
            mp0Var = new mp0(this, dernVar);
        }
        Object objDent = mp0Var.f;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = mp0Var.h;
        k41 k41Var = null;
        byte b = 0;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objDent);
            if (this.j.get()) {
                return wn0.c;
            }
            gintrap gintrapVarDern = preprohormone.dern(null, 1, null);
            gerenuk gerenukVarC = c();
            String string = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            mp0Var.a = this;
            mp0Var.b = str;
            mp0Var.c = str2;
            uuid2 = uuid;
            mp0Var.d = uuid2;
            mp0Var.e = gintrapVarDern;
            mp0Var.h = 1;
            Object objA = gerenukVarC.a(string, gintrapVarDern, mp0Var);
            if (objA != objBeachfront) {
                gintrapVar = gintrapVarDern;
                objDent = objA;
                str3 = str2;
                str4 = str;
                gq0Var = this;
            }
            return objBeachfront;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gq0Var2 = mp0Var.a;
                try {
                    p002kotlin.dern.saneness(objDent);
                    return new tn0(objDent);
                } catch (Exception e) {
                    e = e;
                    gq0Var3 = gq0Var2;
                    if (!(e instanceof CancellationException)) {
                        cutely.wireman(gq0Var3.b, null, null, new op0(gq0Var3, null), 3, null);
                    }
                    return new on0(e, k41Var, b == true ? 1 : 0, 6);
                }
            }
            gintrapVar = (gintrap) mp0Var.b;
            gq0Var3 = mp0Var.a;
            try {
                p002kotlin.dern.saneness(objDent);
                mp0Var.a = gq0Var3;
                mp0Var.b = null;
                mp0Var.h = 3;
                objDent = gintrapVar.dent(mp0Var);
                if (objDent != objBeachfront) {
                    gq0Var2 = gq0Var3;
                    return new tn0(objDent);
                }
                return objBeachfront;
            } catch (Exception e2) {
                e = e2;
                if (!(e instanceof CancellationException)) {
                    cutely.wireman(gq0Var3.b, null, null, new op0(gq0Var3, null), 3, null);
                }
                return new on0(e, k41Var, b == true ? 1 : 0, 6);
            }
        }
        gintrapVar = mp0Var.e;
        UUID uuid3 = mp0Var.d;
        String str5 = mp0Var.c;
        String str6 = (String) mp0Var.b;
        gq0 gq0Var4 = mp0Var.a;
        p002kotlin.dern.saneness(objDent);
        str4 = str6;
        gq0Var = gq0Var4;
        uuid2 = uuid3;
        str3 = str5;
        if (!((Boolean) objDent).booleanValue()) {
            return new rn0("Unable to register result listener. Did you forget to register the result GMSG handler?", k41.INTERNAL_ERROR);
        }
        dishoard dishoardVar = gq0Var.i.s;
        dishoardVar.getClass();
        Intrinsics.checkNotNullParameter("gads:use_javascript_interface_for_result:enabled", X3.i.W);
        String str7 = ((Boolean) dishoardVar.a("gads:use_javascript_interface_for_result:enabled", Boolean.TRUE, zk.b)).booleanValue() ? "1" : "0";
        try {
            CoroutineContext coroutineContext = gq0Var.a;
            np0 np0Var = new np0(gq0Var, str4, uuid2, str3, str7, null);
            mp0Var.a = gq0Var;
            mp0Var.b = gintrapVar;
            mp0Var.c = null;
            mp0Var.d = null;
            mp0Var.e = null;
            mp0Var.h = 2;
            if (impromptu.competently(coroutineContext, np0Var, mp0Var) != objBeachfront) {
                gq0Var3 = gq0Var;
                mp0Var.a = gq0Var3;
                mp0Var.b = null;
                mp0Var.h = 3;
                objDent = gintrapVar.dent(mp0Var);
                if (objDent != objBeachfront) {
                    gq0Var2 = gq0Var3;
                    return new tn0(objDent);
                }
            }
            return objBeachfront;
        } catch (Exception e3) {
            e = e3;
            gq0Var2 = gq0Var;
            gq0Var3 = gq0Var2;
            if (!(e instanceof CancellationException)) {
                cutely.wireman(gq0Var3.b, null, null, new op0(gq0Var3, null), 3, null);
            }
            return new on0(e, k41Var, b == true ? 1 : 0, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, UUID uuid, wretchedly.dern dernVar) {
        pp0 pp0Var;
        if (dernVar instanceof pp0) {
            pp0Var = (pp0) dernVar;
            int i = pp0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pp0Var.d = i - Integer.MIN_VALUE;
            } else {
                pp0Var = new pp0(this, dernVar);
            }
        } else {
            pp0Var = new pp0(this, dernVar);
        }
        Object objA = pp0Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = pp0Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            pp0Var.a = str;
            pp0Var.d = 1;
            objA = a(str, str2, uuid, pp0Var);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = pp0Var.a;
            p002kotlin.dern.saneness(objA);
        }
        spartacist spartacistVar = (spartacist) objA;
        if (spartacistVar instanceof nn0) {
            return (nn0) spartacistVar;
        }
        Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
        JsonObject jsonObject = (JsonObject) ((tn0) spartacistVar).a();
        if (jsonObject != null) {
            return new tn0(jsonObject);
        }
        return new rn0("Null response from " + str);
    }

    public final gerenuk c() {
        gerenuk gerenukVar = this.w;
        if (gerenukVar != null) {
            return gerenukVar;
        }
        Intrinsics.preprohormone("jsContext");
        return null;
    }

    public final er0 d() {
        er0 er0Var;
        synchronized (this) {
            er0Var = this.p;
        }
        return er0Var;
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.j.set(true);
        u20 u20Var = this.d;
        if (u20Var != null) {
            saran saranVar = u20Var.a;
            p20 block = new p20(u20Var, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        super.destroy();
    }

    public final ia3 e() {
        ia3 ia3Var;
        synchronized (this) {
            ia3Var = this.q;
        }
        return ia3Var;
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ha3 ha3Var;
        if (this.j.get()) {
            setMeasuredDimension(0, 0);
            return;
        }
        ia3 ia3VarE = e();
        if (isInEditMode() || ia3VarE.a() || this.l.get() || (ha3Var = ia3VarE.a) == ha3.FULLSCREEN) {
            super.onMeasure(i, i2);
            return;
        }
        if (ha3Var == ha3.VIDEO_RECT) {
            er0 er0VarD = d();
            float fA = er0VarD != null ? er0VarD.a() : 0.0f;
            if (fA <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                super.onMeasure(i, i2);
                return;
            }
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int i3 = (int) (size2 * fA);
            int i4 = (int) (size / fA);
            if (size2 == 0 && i4 != 0) {
                i3 = size;
                size2 = i4;
            } else if (size != 0 || i3 == 0) {
                i3 = size;
                size = i3;
                i4 = size2;
                size2 = i4;
            } else {
                i4 = size2;
                size = i3;
            }
            setMeasuredDimension(Math.min(size, i3), Math.min(size2, i4));
            return;
        }
        if (ia3VarE.d) {
            y13.a(this.c, new aq0(this, null));
            int iA = a();
            setMeasuredDimension(View.MeasureSpec.getSize(i), iA == -1 ? View.MeasureSpec.getSize(i2) : (int) (iA * this.v.density));
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size3 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size4 = View.MeasureSpec.getSize(i2);
        int i5 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size3 : Integer.MAX_VALUE;
        int i6 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size4 : Integer.MAX_VALUE;
        int i7 = ia3VarE.b;
        if (i7 > i5 || ia3VarE.c > i6) {
            float f = this.v.density;
            int i8 = (int) (size3 / f);
            int i9 = (int) (size4 / f);
            String str = "Not enough space to show the full ad. Need " + ((int) (i7 / f)) + "x" + ((int) (ia3VarE.c / f)) + " dp, but only have " + i8 + "x" + i9 + " dp.";
            kn0.c(str, null);
            if (!this.k.getAndSet(true)) {
                y13.a(this.c, new bq0(this, str, null));
            }
        }
        if (getVisibility() != 8) {
            setVisibility(0);
        }
        setMeasuredDimension(ia3VarE.b, ia3VarE.c);
    }

    @Override // android.webkit.WebView
    public final void onPause() {
        super.onPause();
        this.g.getClass();
        Intrinsics.checkNotNullParameter(this, "webView");
        try {
            if (arytenoidectomy.attabal(Features.MUTE_AUDIO)) {
                kowloon.triweekly(this, true);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public final void onResume() {
        super.onResume();
        this.g.getClass();
        Intrinsics.checkNotNullParameter(this, "webView");
        try {
            if (arytenoidectomy.attabal(Features.MUTE_AUDIO)) {
                kowloon.triweekly(this, false);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent inputEvent) {
        Unit unit;
        Intrinsics.checkNotNullParameter(inputEvent, "event");
        moresque moresqueVar = this.s;
        if (moresqueVar != null) {
            moresqueVar.attabal(inputEvent);
            unit = Unit.f29295attabal;
        } else {
            unit = null;
        }
        if (unit == null) {
            g6 g6Var = this.f;
            g6Var.getClass();
            Intrinsics.checkNotNullParameter(inputEvent, "inputEvent");
            g6Var.b().a(inputEvent);
            x83 x83Var = this.o;
            if (x83Var != null) {
                x83Var.a = inputEvent;
            }
        }
        if (this.j.get()) {
            return false;
        }
        return super.onTouchEvent(inputEvent);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object c(String str, wretchedly.dern dernVar) {
        eq0 eq0Var;
        u20 u20Var;
        if (dernVar instanceof eq0) {
            eq0Var = (eq0) dernVar;
            int i = eq0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eq0Var.c = i - Integer.MIN_VALUE;
            } else {
                eq0Var = new eq0(this, dernVar);
            }
        } else {
            eq0Var = new eq0(this, dernVar);
        }
        eq0 eq0Var2 = eq0Var;
        Object obj = eq0Var2.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = eq0Var2.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            b03 b03Var = this.t;
            if (b03Var == null || (u20Var = this.d) == null) {
                return null;
            }
            eq0Var2.c = 1;
            String str2 = b03Var.a;
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            u20Var.c.getClass();
            Object objA = u20Var.a(str, str2, p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), eq0Var2);
            if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                objA = Unit.f29295attabal;
            }
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }

    public final pq0 b() {
        pq0 pq0Var = this.x;
        if (pq0Var != null) {
            return pq0Var;
        }
        Intrinsics.preprohormone("gmaWebViewClient");
        return null;
    }

    public final Object b(JsonObject jsonObject, String str, wretchedly.dern dernVar) {
        Object objA = a(str + "(" + jsonObject + ");", dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0123  */
    /* JADX WARN: Code duplicated, block: B:61:0x012a A[Catch: all -> 0x0141, TRY_LEAVE, TryCatch #0 {all -> 0x0141, blocks: (B:59:0x0126, B:61:0x012a, B:97:0x01a4, B:99:0x01a8, B:85:0x0176, B:87:0x017a), top: B:130:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:87:0x017a A[Catch: all -> 0x0141, TRY_LEAVE, TryCatch #0 {all -> 0x0141, blocks: (B:59:0x0126, B:61:0x012a, B:97:0x01a4, B:99:0x01a8, B:85:0x0176, B:87:0x017a), top: B:130:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:94:0x019a A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #8 {all -> 0x004e, blocks: (B:18:0x0049, B:104:0x01c5, B:24:0x0066, B:92:0x0195, B:94:0x019a), top: B:130:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01a8 A[Catch: all -> 0x0141, TRY_LEAVE, TryCatch #0 {all -> 0x0141, blocks: (B:59:0x0126, B:61:0x012a, B:97:0x01a4, B:99:0x01a8, B:85:0x0176, B:87:0x017a), top: B:130:0x002b }] */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01bd, code lost:
    
        if (kotlinx.coroutines.impromptu.competently(r6, r7, r2) == r3) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01bf, code lost:
    
        r4 = r4;
        r13 = r13;
        r4 = r4;
        r13 = r13;
        r4 = r4;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013d, code lost:
    
        if (kotlinx.coroutines.impromptu.competently(r5, r6, r2) == r3) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018f, code lost:
    
        if (kotlinx.coroutines.impromptu.competently(r0, r5, r2) == r3) goto L129;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r4v42 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r22, wretchedly.dern r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.gq0.b(java.lang.String, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(wretchedly.dern dernVar) {
        qp0 qp0Var;
        gq0 gq0Var;
        if (dernVar instanceof qp0) {
            qp0Var = (qp0) dernVar;
            int i = qp0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qp0Var.d = i - Integer.MIN_VALUE;
            } else {
                qp0Var = new qp0(this, dernVar);
            }
        } else {
            qp0Var = new qp0(this, dernVar);
        }
        Object obj = qp0Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = qp0Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            if (this.j.getAndSet(true)) {
                return Unit.f29295attabal;
            }
            try {
                CoroutineContext coroutineContext = this.a;
                rp0 rp0Var = new rp0(this, null);
                qp0Var.a = this;
                qp0Var.d = 1;
                if (impromptu.competently(coroutineContext, rp0Var, qp0Var) == objBeachfront) {
                    return objBeachfront;
                }
            } catch (Throwable th) {
                th = th;
                gq0Var = this;
                ((d13) gq0Var.e).a("GmaWebView.destroySafe", th);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gq0Var = qp0Var.a;
            try {
                p002kotlin.dern.saneness(obj);
            } catch (Throwable th2) {
                th = th2;
                ((d13) gq0Var.e).a("GmaWebView.destroySafe", th);
            }
        }
        return Unit.f29295attabal;
    }

    public final Object a(JsonObject jsonObject, String str, wretchedly.dern dernVar) {
        String str2 = "(window.AFMA_ReceiveMessage || function() {})('" + str + "', " + jsonObject + ");";
        triweekly triweeklyVar = kn0.a;
        kn0.b("Dispatching AFMA event: " + str2, null);
        Object objA = a(str2, dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    public final int a() {
        int i;
        synchronized (this) {
            i = this.r;
        }
        return i;
    }

    public final Object a(String str, q01 q01Var) {
        Object objA = a("window.inspectorInfo(" + str + ");", (wretchedly.dern) q01Var);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    public final Object a(String str, wretchedly.dern dernVar) {
        if (this.j.get()) {
            return Unit.f29295attabal;
        }
        if (Looper.getMainLooper().isCurrentThread()) {
            evaluateJavascript(str, null);
            return Unit.f29295attabal;
        }
        Object objCompetently = impromptu.competently(this.a, new tp0(this, str, null), dernVar);
        return objCompetently == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCompetently : Unit.f29295attabal;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5431. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.lang.Object a(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22, wretchedly.dern r23) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.gq0.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, wretchedly.dern):java.lang.Object");
    }

    public static /* synthetic */ Object a(gq0 gq0Var, String str, String str2, boolean z, wretchedly.dern dernVar, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return gq0Var.a(str, str2, "text/html", C.UTF8_NAME, z, dernVar);
    }

    public final void a(int i, boolean z) {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        y13.a(this.b, new cq0(this, null));
        y13.a(this.c, new dq0(this, null));
        String str = "WebView render process gone. Crashed? " + z + " Priority? " + i;
        ((d13) this.e).a(str, new Exception(str));
    }

    public final void a(int i) {
        synchronized (this) {
            this.r = i;
            Unit unit = Unit.f29295attabal;
        }
    }

    public final void a(ia3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this) {
            this.q = value;
            Unit unit = Unit.f29295attabal;
        }
        requestLayout();
    }
}
