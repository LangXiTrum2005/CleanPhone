package ads_mobile_sdk;

import android.view.View;
import com.google.gson.JsonObject;
import com.ironsource.If;
import com.ironsource.X3;
import formularization.beachfront;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.preprohormone;
import kotlinx.coroutines.saran;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;
import saneness.glassmaker;
import saneness.homozygous;
import tetrahedral.triweekly;

/* JADX INFO: loaded from: classes.dex */
public final class tx1 extends el implements homozygous {
    public final saran c;
    public final JsonObject d;
    public final h1 e;
    public final lv1 f;
    public final hj1 g;
    public final gk2 h;
    public final formularization.attabal i;
    public monroe j;
    public gq0 k;
    public glassmaker l;
    public final boolean m;
    public final List n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx1(CoroutineContext uiContext, saran backgroundScope, JsonObject nativeAdJson, h1 adConfiguration, lv1 omid, hj1 nativeAdAssets, jk0 flags, gk2 safeBrowsingManager) {
        super(flags, uiContext);
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(nativeAdJson, "nativeAdJson");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(omid, "omid");
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(safeBrowsingManager, "safeBrowsingManager");
        this.c = backgroundScope;
        this.d = nativeAdJson;
        this.e = adConfiguration;
        this.f = omid;
        this.g = nativeAdAssets;
        this.h = safeBrowsingManager;
        this.i = beachfront.saneness(false, 1, null);
        ay1 ay1Var = nativeAdAssets.n;
        this.m = (ay1Var != null ? ay1Var.a : null) == zx1.VIDEO;
        this.n = Collections.synchronizedList(new ArrayList());
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d5 A[Catch: all -> 0x0038, PHI: r2 r11
  0x00d5: PHI (r2v11 ??) = (r2v7 ??), (r2v15 ??), (r2v16 ??) binds: [B:48:0x00d3, B:44:0x00ce, B:22:0x0047] A[DONT_GENERATE, DONT_INLINE]
  0x00d5: PHI (r11v9 formularization.attabal) = (r11v6 formularization.attabal), (r11v19 formularization.attabal), (r11v20 formularization.attabal) binds: [B:48:0x00d3, B:44:0x00ce, B:22:0x0047] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0033, B:55:0x00e7, B:22:0x0047, B:49:0x00d5, B:51:0x00d9, B:25:0x0050, B:43:0x00a0), top: B:63:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0033, B:55:0x00e7, B:22:0x0047, B:49:0x00d5, B:51:0x00d9, B:25:0x0050, B:43:0x00a0), top: B:63:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e3, code lost:
    
        if (r12.a(r0) == r1) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [ads_mobile_sdk.tx1] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r11v0, types: [ads_mobile_sdk.tx1] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v4, types: [ads_mobile_sdk.el, ads_mobile_sdk.tx1] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r2v10, types: [ads_mobile_sdk.el, ads_mobile_sdk.tx1] */
    /* JADX WARN: Type inference failed for: r2v11, types: [ads_mobile_sdk.tx1] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(ads_mobile_sdk.tx1 r11, wretchedly.dern r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tx1.b(ads_mobile_sdk.tx1, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object c(tx1 tx1Var, wretchedly.dern dernVar) {
        mx1 mx1Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof mx1) {
            mx1Var = (mx1) dernVar;
            int i = mx1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                mx1Var.e = i - Integer.MIN_VALUE;
            } else {
                mx1Var = new mx1(tx1Var, dernVar);
            }
        } else {
            mx1Var = new mx1(tx1Var, dernVar);
        }
        Object obj = mx1Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = mx1Var.e;
        boolean z = true;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = tx1Var.i;
            mx1Var.a = tx1Var;
            mx1Var.b = attabalVar;
            mx1Var.e = 1;
            if (attabalVar.attabal(null, mx1Var) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = mx1Var.b;
            tx1 tx1Var2 = mx1Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            tx1Var = tx1Var2;
        }
        try {
            if (tx1Var.l == null && tx1Var.j == null) {
                z = false;
            }
            return igo.attabal.attabal(z);
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
    
        if ((r8 != null ? r8.a : null) == ads_mobile_sdk.zx1.DISPLAY) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        if (r7.a("Google", true, ads_mobile_sdk.iv0.e, (wretchedly.dern) r0) == r1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object d(ads_mobile_sdk.tx1 r7, wretchedly.dern r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.qx1
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.qx1 r0 = (ads_mobile_sdk.qx1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.qx1 r0 = new ads_mobile_sdk.qx1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            p002kotlin.dern.saneness(r8)
            goto Laa
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            ads_mobile_sdk.tx1 r7 = r0.a
            p002kotlin.dern.saneness(r8)
            goto L7d
        L3b:
            p002kotlin.dern.saneness(r8)
            ads_mobile_sdk.lv1 r8 = r7.f
            saneness.loun r8 = r8.f
            ads_mobile_sdk.gv1 r2 = ads_mobile_sdk.gv1.a
            java.lang.String r5 = "IsActive"
            java.lang.Object r8 = r8.attabal(r5, r2)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto Lad
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lad
            com.google.gson.JsonObject r8 = r7.d
            java.lang.String r2 = "enable_omid"
            java.lang.String r5 = "key"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            if (r8 != 0) goto L60
            goto Lad
        L60:
            java.lang.String r6 = "<this>"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r6)     // Catch: java.lang.Exception -> Lad
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)     // Catch: java.lang.Exception -> Lad
            com.google.gson.JsonElement r8 = r8.get(r2)     // Catch: java.lang.Exception -> Lad
            boolean r8 = r8.getAsBoolean()     // Catch: java.lang.Exception -> Lad
            if (r8 == 0) goto Lad
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = c(r7, r0)
            if (r8 != r1) goto L7d
            goto La9
        L7d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto Lad
            ads_mobile_sdk.hj1 r8 = r7.g
            ads_mobile_sdk.fj1 r2 = r8.b
            ads_mobile_sdk.fj1 r5 = ads_mobile_sdk.fj1.CUSTOM_NATIVE
            r6 = 0
            if (r2 != r5) goto L9b
            ads_mobile_sdk.ay1 r8 = r8.n
            if (r8 == 0) goto L95
            ads_mobile_sdk.zx1 r8 = r8.a
            goto L96
        L95:
            r8 = r6
        L96:
            ads_mobile_sdk.zx1 r2 = ads_mobile_sdk.zx1.DISPLAY
            if (r8 != r2) goto L9b
            goto Lad
        L9b:
            r0.a = r6
            r0.d = r3
            java.lang.String r8 = "Google"
            ads_mobile_sdk.iv0 r2 = ads_mobile_sdk.iv0.e
            java.lang.Object r7 = r7.a(r8, r4, r2, r0)
            if (r7 != r1) goto Laa
        La9:
            return r1
        Laa:
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        Lad:
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tx1.d(ads_mobile_sdk.tx1, wretchedly.dern):java.lang.Object");
    }

    @Override // saneness.homozygous
    public final Object a(View view, vk0 vk0Var, String str, wretchedly.dern dernVar) throws Throwable {
        Object objA = a("addFriendlyObstruction", new cx1(this, view, vk0Var, str, null), dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Object i(wretchedly.dern dernVar) {
        return d(this, dernVar);
    }

    @Override // saneness.homozygous
    public final Object l(wretchedly.dern dernVar) {
        return c(this, dernVar);
    }

    @Override // saneness.homozygous
    public final Object m(wretchedly.dern dernVar) throws Throwable {
        Object objA = a("measurePreviousView", new nx1(this, null), dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Object n(wretchedly.dern dernVar) throws Throwable {
        ay1 ay1Var = this.g.n;
        if ((ay1Var != null ? ay1Var.a : null) != zx1.VIDEO) {
            return Unit.f29295attabal;
        }
        Object objA = a(If.f, new ox1(null), dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Object q(wretchedly.dern dernVar) throws Throwable {
        Object objA = a("onAdImpression", new px1(null), dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, ads_mobile_sdk.fw] */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, ads_mobile_sdk.sz1] */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, kotlinx.coroutines.walach] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, kotlinx.coroutines.gintrap] */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, ads_mobile_sdk.fw] */
    /* JADX WARN: Type inference failed for: r5v8, types: [T, ads_mobile_sdk.sz1] */
    public final Object a(String str, boolean z, iv0 iv0Var, wretchedly.dern dernVar) throws Throwable {
        dx1 dx1Var;
        formularization.attabal attabalVar;
        iv0 iv0Var2;
        String str2;
        tx1 tx1Var;
        boolean z2;
        Object obj;
        if (dernVar instanceof dx1) {
            dx1Var = (dx1) dernVar;
            int i = dx1Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                dx1Var.h = i - Integer.MIN_VALUE;
            } else {
                dx1Var = new dx1(this, dernVar);
            }
        } else {
            dx1Var = new dx1(this, dernVar);
        }
        Object obj2 = dx1Var.f;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = dx1Var.h;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj2);
            attabalVar = this.i;
            dx1Var.a = this;
            dx1Var.b = str;
            iv0Var2 = iv0Var;
            dx1Var.c = iv0Var2;
            dx1Var.d = attabalVar;
            dx1Var.e = z;
            dx1Var.h = 1;
            if (attabalVar.attabal(null, dx1Var) == objBeachfront) {
                return objBeachfront;
            }
            str2 = str;
            tx1Var = this;
            z2 = z;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = dx1Var.e;
            attabalVar = dx1Var.d;
            iv0Var2 = dx1Var.c;
            String str3 = dx1Var.b;
            tx1 tx1Var2 = dx1Var.a;
            p002kotlin.dern.saneness(obj2);
            tx1Var = tx1Var2;
            z2 = z3;
            str2 = str3;
        }
        iv0 iv0Var3 = iv0Var2;
        try {
            ay1 ay1Var = tx1Var.g.n;
            try {
                if (ay1Var == null) {
                    Unit unit = Unit.f29295attabal;
                    attabalVar.wireman(null);
                    return unit;
                }
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                int iOrdinal = ay1Var.a.ordinal();
                if (iOrdinal == 0) {
                    gq0 gq0Var = tx1Var.g.j;
                    if (gq0Var == null) {
                        kn0.c("No media webview in OmidNativeMonitor", null);
                        Unit unit2 = Unit.f29295attabal;
                        attabalVar.wireman(null);
                        return unit2;
                    }
                    if (gq0Var.d() == null) {
                        kn0.c("No video controller in OmidNativeMonitor", null);
                        Unit unit3 = Unit.f29295attabal;
                        attabalVar.wireman(null);
                        return unit3;
                    }
                    ref$ObjectRef.element = preprohormone.attabal(gq0Var);
                    tx1Var.k = gq0Var;
                    ref$ObjectRef2.element = fw.e;
                    ref$ObjectRef3.element = sz1.c;
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        kn0.c("Unknown media type in OmidNativeMonitor", null);
                        Unit unit4 = Unit.f29295attabal;
                        attabalVar.wireman(null);
                        return unit4;
                    }
                    ?? r0 = tx1Var.g.o;
                    if (r0 == 0) {
                        kn0.c("No omid webview in OmidNativeMonitor", null);
                        Unit unit5 = Unit.f29295attabal;
                        attabalVar.wireman(null);
                        return unit5;
                    }
                    ref$ObjectRef.element = r0;
                    ref$ObjectRef2.element = fw.d;
                    ref$ObjectRef3.element = sz1.d;
                    jk0 jk0Var = tx1Var.a;
                    jk0Var.getClass();
                    Intrinsics.checkNotNullParameter("gads:native_click_protection:enabled", X3.i.W);
                    if (((Boolean) jk0Var.a("gads:native_click_protection:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
                        saran saranVar = tx1Var.c;
                        ex1 block = new ex1(r0, tx1Var, null);
                        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                        Intrinsics.checkNotNullParameter(saranVar, "<this>");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(block, "block");
                        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
                    }
                }
                saran saranVar2 = tx1Var.c;
                gx1 block2 = new gx1(ref$ObjectRef, tx1Var, str2, ref$ObjectRef2, iv0Var3, ref$ObjectRef3, z2, null);
                EmptyCoroutineContext context2 = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar2, "<this>");
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(block2, "block");
                tx1Var.j = cutely.wireman(saranVar2, context2, null, new x13(block2, null), 2, null);
                Unit unit6 = Unit.f29295attabal;
                attabalVar.wireman(null);
                return unit6;
            } catch (Throwable th) {
                th = th;
                obj = null;
                attabalVar.wireman(obj);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5 A[Catch: all -> 0x00cb, TRY_LEAVE, TryCatch #3 {all -> 0x00cb, blocks: (B:44:0x00c1, B:46:0x00c5, B:51:0x00ce, B:53:0x00d2, B:56:0x00d8), top: B:81:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ce A[Catch: all -> 0x00cb, TRY_ENTER, TryCatch #3 {all -> 0x00cb, blocks: (B:44:0x00c1, B:46:0x00c5, B:51:0x00ce, B:53:0x00d2, B:56:0x00d8), top: B:81:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2 A[Catch: all -> 0x00cb, TRY_LEAVE, TryCatch #3 {all -> 0x00cb, blocks: (B:44:0x00c1, B:46:0x00c5, B:51:0x00ce, B:53:0x00d2, B:56:0x00d8), top: B:81:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8 A[Catch: all -> 0x00cb, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00cb, blocks: (B:44:0x00c1, B:46:0x00c5, B:51:0x00ce, B:53:0x00d2, B:56:0x00d8), top: B:81:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.StringBuilder] */
    public final Object a(String str, triweekly triweeklyVar, wretchedly.dern dernVar) throws Throwable {
        ix1 ix1Var;
        ?? r10;
        tx1 tx1Var;
        String str2;
        formularization.attabal attabalVar;
        formularization.attabal attabalVar2;
        tx1 tx1Var2;
        Throwable th;
        gq0 gq0Var;
        glassmaker glassmakerVar;
        jx1 jx1Var;
        if (dernVar instanceof ix1) {
            ix1Var = (ix1) dernVar;
            int i = ix1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ix1Var.g = i - Integer.MIN_VALUE;
            } else {
                ix1Var = new ix1(this, dernVar);
            }
        } else {
            ix1Var = new ix1(this, dernVar);
        }
        Object obj = ix1Var.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        ?? r2 = ix1Var.g;
        try {
            try {
                if (r2 == 0) {
                    p002kotlin.dern.saneness(obj);
                    formularization.attabal attabalVar3 = this.i;
                    ix1Var.a = this;
                    ix1Var.b = str;
                    ix1Var.c = triweeklyVar;
                    ix1Var.d = attabalVar3;
                    ix1Var.g = 1;
                    if (attabalVar3.attabal(null, ix1Var) != objBeachfront) {
                        tx1Var = this;
                        str2 = str;
                        attabalVar = attabalVar3;
                    }
                    return objBeachfront;
                }
                if (r2 != 1) {
                    if (r2 == 2) {
                        triweekly triweeklyVar2 = ix1Var.c;
                        str2 = (String) ix1Var.b;
                        tx1 tx1Var3 = (tx1) ix1Var.a;
                        p002kotlin.dern.saneness(obj);
                        tx1Var = tx1Var3;
                        triweeklyVar = triweeklyVar2;
                        attabalVar2 = tx1Var.i;
                        ix1Var.a = tx1Var;
                        ix1Var.b = str2;
                        ix1Var.c = triweeklyVar;
                        ix1Var.d = attabalVar2;
                        ix1Var.g = 3;
                        if (attabalVar2.attabal(null, ix1Var) != objBeachfront) {
                            tx1Var2 = tx1Var;
                            gq0Var = tx1Var2.k;
                            if (gq0Var == null) {
                                Unit unit = Unit.f29295attabal;
                                attabalVar2.wireman(null);
                                return unit;
                            }
                            glassmakerVar = tx1Var2.l;
                            if (glassmakerVar == null) {
                                Unit unit2 = Unit.f29295attabal;
                                attabalVar2.wireman(null);
                                return unit2;
                            }
                            jx1Var = new jx1(triweeklyVar, gq0Var, glassmakerVar, null);
                            ix1Var.a = str2;
                            ix1Var.b = attabalVar2;
                            ix1Var.c = null;
                            ix1Var.d = null;
                            ix1Var.g = 4;
                            if (tx1Var2.a(jx1Var, ix1Var) != objBeachfront) {
                                r10 = str2;
                                Unit unit3 = Unit.f29295attabal;
                                attabalVar2.wireman(null);
                                return Unit.f29295attabal;
                            }
                        }
                        return objBeachfront;
                    }
                    if (r2 != 3) {
                        if (r2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        attabalVar2 = (formularization.attabal) ix1Var.b;
                        r10 = (String) ix1Var.a;
                        try {
                            p002kotlin.dern.saneness(obj);
                            r10 = r10;
                            Unit unit4 = Unit.f29295attabal;
                            try {
                                attabalVar2.wireman(null);
                            } catch (CancellationException unused) {
                                r2 = r10;
                                r10 = r2;
                                com.google.common.base.triweekly triweeklyVar3 = kn0.a;
                                kn0.c("Ad session was cancelled in " + r10, null);
                            }
                            return Unit.f29295attabal;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                attabalVar2.wireman(null);
                                throw th;
                            } catch (CancellationException unused2) {
                                com.google.common.base.triweekly triweeklyVar4 = kn0.a;
                                kn0.c("Ad session was cancelled in " + r10, null);
                                return Unit.f29295attabal;
                            }
                        }
                    }
                    attabalVar2 = ix1Var.d;
                    triweeklyVar = ix1Var.c;
                    str2 = (String) ix1Var.b;
                    tx1Var2 = (tx1) ix1Var.a;
                    p002kotlin.dern.saneness(obj);
                    try {
                        gq0Var = tx1Var2.k;
                        if (gq0Var == null) {
                            Unit unit5 = Unit.f29295attabal;
                            attabalVar2.wireman(null);
                            return unit5;
                        }
                        glassmakerVar = tx1Var2.l;
                        if (glassmakerVar == null) {
                            Unit unit6 = Unit.f29295attabal;
                            attabalVar2.wireman(null);
                            return unit6;
                        }
                        jx1Var = new jx1(triweeklyVar, gq0Var, glassmakerVar, null);
                        ix1Var.a = str2;
                        ix1Var.b = attabalVar2;
                        ix1Var.c = null;
                        ix1Var.d = null;
                        ix1Var.g = 4;
                        if (tx1Var2.a(jx1Var, ix1Var) != objBeachfront) {
                            r10 = str2;
                            Unit unit7 = Unit.f29295attabal;
                            attabalVar2.wireman(null);
                            return Unit.f29295attabal;
                        }
                        return objBeachfront;
                    } catch (Throwable th3) {
                        th = th3;
                        r10 = str2;
                        attabalVar2.wireman(null);
                        throw th;
                    }
                }
                attabalVar = ix1Var.d;
                triweeklyVar = ix1Var.c;
                str2 = (String) ix1Var.b;
                tx1Var = (tx1) ix1Var.a;
                p002kotlin.dern.saneness(obj);
                monroe monroeVar = tx1Var.j;
                attabalVar.wireman(null);
                if (monroeVar == null) {
                    return Unit.f29295attabal;
                }
                ix1Var.a = tx1Var;
                ix1Var.b = str2;
                ix1Var.c = triweeklyVar;
                ix1Var.d = null;
                ix1Var.g = 2;
                if (monroeVar.starveling(ix1Var) != objBeachfront) {
                    attabalVar2 = tx1Var.i;
                    ix1Var.a = tx1Var;
                    ix1Var.b = str2;
                    ix1Var.c = triweeklyVar;
                    ix1Var.d = attabalVar2;
                    ix1Var.g = 3;
                    if (attabalVar2.attabal(null, ix1Var) != objBeachfront) {
                        tx1Var2 = tx1Var;
                        gq0Var = tx1Var2.k;
                        if (gq0Var == null) {
                            Unit unit8 = Unit.f29295attabal;
                            attabalVar2.wireman(null);
                            return unit8;
                        }
                        glassmakerVar = tx1Var2.l;
                        if (glassmakerVar == null) {
                            Unit unit9 = Unit.f29295attabal;
                            attabalVar2.wireman(null);
                            return unit9;
                        }
                        jx1Var = new jx1(triweeklyVar, gq0Var, glassmakerVar, null);
                        ix1Var.a = str2;
                        ix1Var.b = attabalVar2;
                        ix1Var.c = null;
                        ix1Var.d = null;
                        ix1Var.g = 4;
                        if (tx1Var2.a(jx1Var, ix1Var) != objBeachfront) {
                            r10 = str2;
                            Unit unit10 = Unit.f29295attabal;
                            attabalVar2.wireman(null);
                            return Unit.f29295attabal;
                        }
                    }
                }
                return objBeachfront;
            } catch (Throwable th4) {
                attabalVar.wireman(null);
                throw th4;
            }
        } catch (CancellationException unused3) {
        }
    }

    @Override // saneness.homozygous
    public final Object a(c93 c93Var) {
        return b(this, c93Var);
    }

    @Override // saneness.undertread
    public final Object a(wretchedly.dern dernVar) throws Throwable {
        Object objB = b(this, dernVar);
        return objB == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objB : Unit.f29295attabal;
    }

    @Override // saneness.homozygous
    public final Object a(View view, wretchedly.dern dernVar) throws Throwable {
        if (this.m) {
            return Unit.f29295attabal;
        }
        Object objA = a("updateRegisteredAdView", new sx1(this, view, null), dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }
}
