package ads_mobile_sdk;

import android.content.Context;
import kotlinx.coroutines.flow.arytenoidectomy;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.saran;
import kurbash.formularize;
import liquory.marial;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.MutablePropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import saneness.adultoid;
import saneness.alloy;
import saneness.coffeecake;
import saneness.imperceivable;
import saneness.pimpled;
import saneness.reparation;

/* JADX INFO: loaded from: classes.dex */
public final class na2 extends k92 {
    public static final /* synthetic */ formularize[] y = {polloi.competently(new MutablePropertyReference1Impl(na2.class, "refreshCallback", "getRefreshCallback()Lcom/google/android/libraries/ads/mobile/sdk/banner/BannerAdRefreshCallback;", 0))};
    public final Context o;
    public final CoroutineContext p;
    public final CoroutineContext q;
    public final adultoid r;
    public final ee2 s;
    public final nd0 t;
    public final marial u;
    public final hb1 v;
    public final vw2 w;
    public cg2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na2(Context applicationContext, CoroutineContext uiContext, CoroutineContext loadContext, saran loadScope, saran backgroundScope, coffeecake componentProvider, ee2 refreshHelper, nd0 displayUtil, marial bannerAdRequest, l13 traceMetaSet, jk0 flags, ri2 rootTraceCreator, String publisherRequestId, yf2 requestType, String appId, boolean z, gy0 inspectorAdLifecycleMonitor, arytenoidectomy cancellationChannel) {
        super(loadScope, backgroundScope, traceMetaSet, flags, rootTraceCreator, publisherRequestId, requestType, bannerAdRequest, z, appId, inspectorAdLifecycleMonitor, cancellationChannel);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(loadContext, "loadContext");
        Intrinsics.checkNotNullParameter(loadScope, "loadScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        Intrinsics.checkNotNullParameter(refreshHelper, "refreshHelper");
        Intrinsics.checkNotNullParameter(displayUtil, "displayUtil");
        Intrinsics.checkNotNullParameter(bannerAdRequest, "bannerAdRequest");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(publisherRequestId, "publisherRequestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(inspectorAdLifecycleMonitor, "inspectorAdLifecycleMonitor");
        Intrinsics.checkNotNullParameter(cancellationChannel, "cancellationChannel");
        this.o = applicationContext;
        this.p = uiContext;
        this.q = loadContext;
        this.r = componentProvider;
        this.s = refreshHelper;
        this.t = displayUtil;
        this.u = bannerAdRequest;
        this.v = new hb1();
        this.w = new vw2(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r7 == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.na2 r6, wretchedly.dern r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof ads_mobile_sdk.ba2
            if (r0 == 0) goto L16
            r0 = r7
            ads_mobile_sdk.ba2 r0 = (ads_mobile_sdk.ba2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.c = r1
            goto L1b
        L16:
            ads_mobile_sdk.ba2 r0 = new ads_mobile_sdk.ba2
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            p002kotlin.dern.saneness(r7)     // Catch: java.lang.Exception -> L30
            goto L55
        L30:
            r6 = move-exception
            goto L67
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            p002kotlin.dern.saneness(r7)     // Catch: java.lang.Exception -> L30
            goto L4a
        L3e:
            p002kotlin.dern.saneness(r7)
            r0.c = r5     // Catch: java.lang.Exception -> L30
            java.lang.Object r7 = b(r6, r0)     // Catch: java.lang.Exception -> L30
            if (r7 != r1) goto L4a
            goto L54
        L4a:
            kotlinx.coroutines.flow.dern r7 = (kotlinx.coroutines.flow.dern) r7     // Catch: java.lang.Exception -> L30
            r0.c = r4     // Catch: java.lang.Exception -> L30
            java.lang.Object r7 = kotlinx.coroutines.flow.marial.molybdenite(r7, r0)     // Catch: java.lang.Exception -> L30
            if (r7 != r1) goto L55
        L54:
            return r1
        L55:
            kotlin.Pair r7 = (p002kotlin.Pair) r7     // Catch: java.lang.Exception -> L30
            java.lang.Object r6 = r7.getFirst()     // Catch: java.lang.Exception -> L30
            saneness.spartacist r6 = (saneness.spartacist) r6     // Catch: java.lang.Exception -> L30
            boolean r0 = r6 instanceof ads_mobile_sdk.nn0     // Catch: java.lang.Exception -> L30
            if (r0 == 0) goto L66
            ads_mobile_sdk.nn0 r6 = (ads_mobile_sdk.nn0) r6     // Catch: java.lang.Exception -> L30
            ads_mobile_sdk.y13.a(r6, r3)     // Catch: java.lang.Exception -> L30
        L66:
            return r7
        L67:
            java.lang.String r7 = "exception"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            ads_mobile_sdk.w03 r7 = ads_mobile_sdk.j13.a()
            ads_mobile_sdk.o12 r0 = r7.e()
            r0.m = r3
            r7.a(r6)
            kotlin.Pair r7 = new kotlin.Pair
            ads_mobile_sdk.on0 r0 = new ads_mobile_sdk.on0
            r1 = 6
            r2 = 0
            r0.<init>(r6, r2, r2, r1)
            r7.<init>(r0, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.na2.a(ads_mobile_sdk.na2, wretchedly.dern):java.lang.Object");
    }

    public final cg2 b() {
        cg2 cg2Var = this.x;
        if (cg2Var != null) {
            return cg2Var;
        }
        Intrinsics.preprohormone("adFrame");
        return null;
    }

    public final hb1 c() {
        return this.v;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(na2 na2Var, wretchedly.dern dernVar) {
        y92 y92Var;
        na2 na2Var2;
        Object objA;
        if (dernVar instanceof y92) {
            y92Var = (y92) dernVar;
            int i = y92Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                y92Var.e = i - Integer.MIN_VALUE;
            } else {
                y92Var = new y92(na2Var, dernVar);
            }
        } else {
            y92Var = new y92(na2Var, dernVar);
        }
        Object objCompetently = y92Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = y92Var.e;
        boolean z = true;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objCompetently);
            if (na2Var.x == null) {
                CoroutineContext coroutineContext = na2Var.p;
                z92 z92Var = new z92(na2Var, null);
                y92Var.a = na2Var;
                y92Var.b = na2Var;
                y92Var.e = 1;
                objCompetently = impromptu.competently(coroutineContext, z92Var, y92Var);
                if (objCompetently != objBeachfront) {
                    na2Var2 = na2Var;
                }
            } else {
                l13 l13Var = na2Var.c;
                l13Var.getClass();
                l13Var.b = new j71();
                l13Var.c = new le2();
                l13Var.d = new o6();
                Object obj = na2Var.r.get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                v60 v60Var = (v60) ((pimpled) na2Var.a((reparation) obj, na2Var.u));
                v60Var.m = Boolean.valueOf(z);
                v60Var.l = new he2(na2Var.s);
                ee2 ee2Var = na2Var.s;
                ee2Var.getClass();
                v60Var.k = ee2Var;
                marial marialVar = na2Var.u;
                marialVar.getClass();
                v60Var.n = marialVar;
                alloy alloyVar = (alloy) v60Var.a().x0.get();
                y92Var.a = null;
                y92Var.b = null;
                y92Var.e = 2;
                objA = ((j31) alloyVar).a(y92Var);
                if (objA != objBeachfront) {
                    return objA;
                }
            }
            return objBeachfront;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objCompetently);
            return objCompetently;
        }
        na2Var = y92Var.b;
        na2Var2 = y92Var.a;
        p002kotlin.dern.saneness(objCompetently);
        cg2 cg2Var = (cg2) objCompetently;
        na2Var.getClass();
        Intrinsics.checkNotNullParameter(cg2Var, "<set-?>");
        na2Var.x = cg2Var;
        z = false;
        na2Var = na2Var2;
        l13 l13Var2 = na2Var.c;
        l13Var2.getClass();
        l13Var2.b = new j71();
        l13Var2.c = new le2();
        l13Var2.d = new o6();
        Object obj2 = na2Var.r.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        v60 v60Var2 = (v60) ((pimpled) na2Var.a((reparation) obj2, na2Var.u));
        v60Var2.m = Boolean.valueOf(z);
        v60Var2.l = new he2(na2Var.s);
        ee2 ee2Var2 = na2Var.s;
        ee2Var2.getClass();
        v60Var2.k = ee2Var2;
        marial marialVar2 = na2Var.u;
        marialVar2.getClass();
        v60Var2.n = marialVar2;
        alloy alloyVar2 = (alloy) v60Var2.a().x0.get();
        y92Var.a = null;
        y92Var.b = null;
        y92Var.e = 2;
        objA = ((j31) alloyVar2).a(y92Var);
        if (objA != objBeachfront) {
            return objBeachfront;
        }
        return objA;
    }

    @Override // ads_mobile_sdk.k92
    public final Object a(w82 w82Var) {
        return b(this, w82Var);
    }

    @Override // ads_mobile_sdk.k92
    public final Object a(imperceivable imperceivableVar, t82 t82Var) {
        return a(this, (d41) imperceivableVar, t82Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r8.a(r7, new java.util.concurrent.atomic.AtomicBoolean(false), r9, r0) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.na2 r7, ads_mobile_sdk.d41 r8, wretchedly.dern r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.ca2
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.ca2 r0 = (ads_mobile_sdk.ca2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.ca2 r0 = new ads_mobile_sdk.ca2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            p002kotlin.dern.saneness(r9)
            goto L8e
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            ads_mobile_sdk.na2 r7 = r0.a
            p002kotlin.dern.saneness(r9)
            goto L7a
        L3c:
            p002kotlin.dern.saneness(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.m
            r9.set(r3)
            r7.n = r6
            ads_mobile_sdk.hb1 r9 = r7.v
            boolean r9 = r9.b()
            if (r9 == 0) goto L59
            ads_mobile_sdk.hb1 r9 = r7.v
            java.lang.String r2 = "The backing field has not yet been initialized."
            java.lang.Object r9 = r9.a(r2)
            ads_mobile_sdk.d41 r9 = (ads_mobile_sdk.d41) r9
            goto L5a
        L59:
            r9 = r6
        L5a:
            ads_mobile_sdk.hb1 r2 = r7.v
            r2.a(r8)
            r0.a = r7
            r0.d = r5
            kotlin.coroutines.CoroutineContext r2 = r7.p
            ads_mobile_sdk.ma2 r5 = new ads_mobile_sdk.ma2
            r5.<init>(r9, r7, r8, r6)
            java.lang.Object r8 = kotlinx.coroutines.impromptu.competently(r2, r5, r0)
            java.lang.Object r9 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            if (r8 != r9) goto L75
            goto L77
        L75:
            kotlin.Unit r8 = p002kotlin.Unit.f29295attabal
        L77:
            if (r8 != r1) goto L7a
            goto L8d
        L7a:
            ads_mobile_sdk.ee2 r8 = r7.s
            kotlinx.coroutines.flow.arytenoidectomy r9 = r7.l
            r0.a = r6
            r0.d = r4
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>(r3)
            java.lang.Object r7 = r8.a(r7, r2, r9, r0)
            if (r7 != r1) goto L8e
        L8d:
            return r1
        L8e:
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.na2.a(ads_mobile_sdk.na2, ads_mobile_sdk.d41, wretchedly.dern):java.lang.Object");
    }

    @Override // ads_mobile_sdk.k92
    public final Object b(wretchedly.dern dernVar) {
        if (this.m.get() && this.n != null) {
            Object objA = this.s.a(this, this.m, this.l, dernVar);
            return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008d A[PHI: r9 r10
  0x008d: PHI (r9v4 saneness.spartacist) = (r9v3 saneness.spartacist), (r9v9 saneness.spartacist) binds: [B:27:0x008a, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]
  0x008d: PHI (r10v7 ads_mobile_sdk.na2) = (r10v6 ads_mobile_sdk.na2), (r10v9 ads_mobile_sdk.na2) binds: [B:27:0x008a, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        if (kotlinx.coroutines.impromptu.competently(r11, r2, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bd, code lost:
    
        if (kotlinx.coroutines.impromptu.competently(r11, r2, r0) == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(saneness.spartacist r9, complexometry.ResponseInfo r10, wretchedly.dern r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.da2
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.da2 r0 = (ads_mobile_sdk.da2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.da2 r0 = new ads_mobile_sdk.da2
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.c
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.e
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L50
            if (r2 == r6) goto L48
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            p002kotlin.dern.saneness(r11)
            goto Lc0
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            p002kotlin.dern.saneness(r11)
            goto La5
        L40:
            saneness.spartacist r9 = r0.b
            ads_mobile_sdk.na2 r10 = r0.a
            p002kotlin.dern.saneness(r11)
            goto L8d
        L48:
            saneness.spartacist r9 = r0.b
            ads_mobile_sdk.na2 r10 = r0.a
            p002kotlin.dern.saneness(r11)
            goto L79
        L50:
            p002kotlin.dern.saneness(r11)
            boolean r11 = r9 instanceof ads_mobile_sdk.tn0
            if (r11 == 0) goto La8
            ads_mobile_sdk.l13 r10 = r8.c
            r11 = r9
            ads_mobile_sdk.tn0 r11 = (ads_mobile_sdk.tn0) r11
            java.lang.Object r2 = r11.b
            ads_mobile_sdk.d41 r2 = (ads_mobile_sdk.d41) r2
            ads_mobile_sdk.l13 r2 = r2.a()
            r10.a(r2)
            java.lang.Object r10 = r11.b
            ads_mobile_sdk.d41 r10 = (ads_mobile_sdk.d41) r10
            r0.a = r8
            r0.b = r9
            r0.e = r6
            java.lang.Object r10 = r10.a(r0)
            if (r10 != r1) goto L78
            goto Lbf
        L78:
            r10 = r8
        L79:
            r11 = r9
            ads_mobile_sdk.tn0 r11 = (ads_mobile_sdk.tn0) r11
            java.lang.Object r11 = r11.b
            ads_mobile_sdk.d41 r11 = (ads_mobile_sdk.d41) r11
            r0.a = r10
            r0.b = r9
            r0.e = r5
            java.lang.Object r11 = r10.a(r11, r0)
            if (r11 != r1) goto L8d
            goto Lbf
        L8d:
            kotlinx.coroutines.saran r11 = r10.b
            kotlin.coroutines.CoroutineContext r11 = r11.getCoroutineContext()
            ads_mobile_sdk.ha2 r2 = new ads_mobile_sdk.ha2
            r2.<init>(r10, r9, r7)
            r0.a = r7
            r0.b = r7
            r0.e = r4
            java.lang.Object r9 = kotlinx.coroutines.impromptu.competently(r11, r2, r0)
            if (r9 != r1) goto La5
            goto Lbf
        La5:
            kotlin.Unit r9 = p002kotlin.Unit.f29295attabal
            return r9
        La8:
            boolean r11 = r9 instanceof ads_mobile_sdk.nn0
            if (r11 == 0) goto Lc3
            kotlinx.coroutines.saran r11 = r8.b
            kotlin.coroutines.CoroutineContext r11 = r11.getCoroutineContext()
            ads_mobile_sdk.ka2 r2 = new ads_mobile_sdk.ka2
            r2.<init>(r10, r8, r9, r7)
            r0.e = r3
            java.lang.Object r9 = kotlinx.coroutines.impromptu.competently(r11, r2, r0)
            if (r9 != r1) goto Lc0
        Lbf:
            return r1
        Lc0:
            kotlin.Unit r9 = p002kotlin.Unit.f29295attabal
            return r9
        Lc3:
            kotlin.Unit r9 = p002kotlin.Unit.f29295attabal
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.na2.a(saneness.spartacist, complexometry.molybdenite, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(d41 d41Var, wretchedly.dern dernVar) {
        la2 la2Var;
        d41 d41Var2;
        if (dernVar instanceof la2) {
            la2Var = (la2) dernVar;
            int i = la2Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                la2Var.d = i - Integer.MIN_VALUE;
            } else {
                la2Var = new la2(this, dernVar);
            }
        } else {
            la2Var = new la2(this, dernVar);
        }
        Object obj = la2Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = la2Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            d41 d41Var3 = this.v.b() ? (d41) this.v.a("The backing field has not yet been initialized.") : null;
            this.v.a(d41Var);
            if (d41Var3 != null) {
                ((d41) this.v.a("The backing field has not yet been initialized.")).c().a.set(d41Var3.c().a.get());
                synchronized (d41Var3.h()) {
                }
                d41Var3.h().a((liquory.dern) null);
                ((d41) this.v.a("The backing field has not yet been initialized.")).h().a((liquory.dern) null);
            }
            la2Var.a = d41Var3;
            la2Var.d = 1;
            Object objCompetently = impromptu.competently(this.p, new ma2(d41Var3, this, d41Var, null), la2Var);
            if (objCompetently != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                objCompetently = Unit.f29295attabal;
            }
            if (objCompetently == objBeachfront) {
                return objBeachfront;
            }
            d41Var2 = d41Var3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d41Var2 = la2Var.a;
            p002kotlin.dern.saneness(obj);
        }
        if (d41Var2 != null) {
            d41Var2.destroy();
        }
        return Unit.f29295attabal;
    }
}
