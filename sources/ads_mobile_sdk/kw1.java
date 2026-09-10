package ads_mobile_sdk;

import android.view.View;
import android.view.ViewGroup;
import formularization.beachfront;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.glassmaker;
import saneness.homozygous;

/* JADX INFO: loaded from: classes.dex */
public final class kw1 extends el implements homozygous {
    public final saran c;
    public final h1 d;
    public final lv1 e;
    public final xq0 f;
    public final xw1 g;
    public final formularization.attabal h;
    public glassmaker i;
    public final List j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw1(CoroutineContext uiContext, saran uiScope, h1 adConfiguration, lv1 omid, xq0 webViewContainer, xw1 omidJavaScriptSessionService, jk0 flags) {
        super(flags, uiContext);
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(omid, "omid");
        Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        Intrinsics.checkNotNullParameter(omidJavaScriptSessionService, "omidJavaScriptSessionService");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.c = uiScope;
        this.d = adConfiguration;
        this.e = omid;
        this.f = webViewContainer;
        this.g = omidJavaScriptSessionService;
        this.h = beachfront.saneness(false, 1, null);
        this.j = Collections.synchronizedList(new ArrayList());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(kw1 kw1Var, wretchedly.dern dernVar) throws Throwable {
        dw1 dw1Var;
        formularization.attabal attabalVar;
        formularization.attabal attabalVar2;
        if (dernVar instanceof dw1) {
            dw1Var = (dw1) dernVar;
            int i = dw1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                dw1Var.e = i - Integer.MIN_VALUE;
            } else {
                dw1Var = new dw1(kw1Var, dernVar);
            }
        } else {
            dw1Var = new dw1(kw1Var, dernVar);
        }
        Object obj = dw1Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = dw1Var.e;
        boolean z = true;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                attabalVar = kw1Var.h;
                dw1Var.a = kw1Var;
                dw1Var.b = attabalVar;
                dw1Var.e = 1;
                if (attabalVar.attabal(null, dw1Var) != objBeachfront) {
                }
                return objBeachfront;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar2 = (formularization.attabal) dw1Var.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    if (((Boolean) obj).booleanValue()) {
                        attabalVar = attabalVar2;
                        attabalVar2 = attabalVar;
                    } else {
                        z = false;
                    }
                    Boolean boolAttabal = igo.attabal.attabal(z);
                    attabalVar2.wireman(null);
                    return boolAttabal;
                } catch (Throwable th) {
                    attabalVar = attabalVar2;
                    th = th;
                    attabalVar.wireman(null);
                    throw th;
                }
            }
            formularization.attabal attabalVar3 = dw1Var.b;
            kw1 kw1Var2 = (kw1) dw1Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar3;
            kw1Var = kw1Var2;
            if (kw1Var.i == null) {
                xw1 xw1Var = kw1Var.g;
                dw1Var.a = attabalVar;
                dw1Var.b = null;
                dw1Var.e = 2;
                xw1Var.getClass();
                Object objA = xw1.a(xw1Var, dw1Var);
                if (objA != objBeachfront) {
                    formularization.attabal attabalVar4 = attabalVar;
                    obj = objA;
                    attabalVar2 = attabalVar4;
                    if (((Boolean) obj).booleanValue()) {
                        attabalVar = attabalVar2;
                        attabalVar2 = attabalVar;
                    } else {
                        z = false;
                    }
                }
                return objBeachfront;
            }
            attabalVar2 = attabalVar;
            Boolean boolAttabal2 = igo.attabal.attabal(z);
            attabalVar2.wireman(null);
            return boolAttabal2;
        } catch (Throwable th2) {
            th = th2;
            attabalVar.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        if (r8.a(r5, r1) == r2) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object c(ads_mobile_sdk.kw1 r8, wretchedly.dern r9) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "omidRegisteredViews"
            boolean r1 = r9 instanceof ads_mobile_sdk.ew1
            if (r1 == 0) goto L15
            r1 = r9
            ads_mobile_sdk.ew1 r1 = (ads_mobile_sdk.ew1) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e = r2
            goto L1a
        L15:
            ads_mobile_sdk.ew1 r1 = new ads_mobile_sdk.ew1
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.c
            java.lang.Object r2 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r3 = r1.e
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L49
            if (r3 == r5) goto L3d
            if (r3 != r4) goto L35
            java.lang.Object r8 = r1.a
            formularization.attabal r8 = (formularization.attabal) r8
            p002kotlin.dern.saneness(r9)     // Catch: java.lang.Throwable -> L33
            goto L8b
        L33:
            r9 = move-exception
            goto L91
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            formularization.attabal r8 = r1.b
            java.lang.Object r3 = r1.a
            ads_mobile_sdk.kw1 r3 = (ads_mobile_sdk.kw1) r3
            p002kotlin.dern.saneness(r9)
            r9 = r8
            r8 = r3
            goto L5b
        L49:
            p002kotlin.dern.saneness(r9)
            formularization.attabal r9 = r8.h
            r1.a = r8
            r1.b = r9
            r1.e = r5
            java.lang.Object r3 = r9.attabal(r6, r1)
            if (r3 != r2) goto L5b
            goto L87
        L5b:
            saneness.glassmaker r3 = r8.i     // Catch: java.lang.Throwable -> L88
            if (r3 == 0) goto L8a
            java.util.List r5 = r8.j     // Catch: java.lang.Throwable -> L88
            p002kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)     // Catch: java.lang.Throwable -> L88
            p002kotlin.collections.cord.polder(r5)     // Catch: java.lang.Throwable -> L88
            java.util.List r5 = r8.j     // Catch: java.lang.Throwable -> L88
            p002kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)     // Catch: java.lang.Throwable -> L88
            java.lang.Object r0 = p002kotlin.collections.CollectionsKt.picketboat(r5)     // Catch: java.lang.Throwable -> L88
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L76
            ads_mobile_sdk.xq0 r0 = r8.f     // Catch: java.lang.Throwable -> L88
        L76:
            ads_mobile_sdk.fw1 r5 = new ads_mobile_sdk.fw1     // Catch: java.lang.Throwable -> L88
            r5.<init>(r8, r3, r0, r6)     // Catch: java.lang.Throwable -> L88
            r1.a = r9     // Catch: java.lang.Throwable -> L88
            r1.b = r6     // Catch: java.lang.Throwable -> L88
            r1.e = r4     // Catch: java.lang.Throwable -> L88
            java.lang.Object r8 = r8.a(r5, r1)     // Catch: java.lang.Throwable -> L88
            if (r8 != r2) goto L8a
        L87:
            return r2
        L88:
            r8 = move-exception
            goto L94
        L8a:
            r8 = r9
        L8b:
            kotlin.Unit r9 = p002kotlin.Unit.f29295attabal     // Catch: java.lang.Throwable -> L33
            r8.wireman(r6)
            return r9
        L91:
            r7 = r9
            r9 = r8
            r8 = r7
        L94:
            r9.wireman(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kw1.c(ads_mobile_sdk.kw1, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009a A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:14:0x0030, B:45:0x00b5, B:36:0x0092, B:38:0x009a, B:42:0x00a1), top: B:51:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
    
        if (r9.a(r4, "onSdkImpression", r0) == r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object d(ads_mobile_sdk.kw1 r8, wretchedly.dern r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.gw1
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.gw1 r0 = (ads_mobile_sdk.gw1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.gw1 r0 = new ads_mobile_sdk.gw1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.c
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L62
            if (r2 == r5) goto L53
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r8 = r0.a
            formularization.attabal r8 = (formularization.attabal) r8
            p002kotlin.dern.saneness(r9)     // Catch: java.lang.Throwable -> L35
            goto Lb5
        L35:
            r9 = move-exception
            goto Lbb
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.Object r8 = r0.b
            ads_mobile_sdk.gq0 r8 = (ads_mobile_sdk.gq0) r8
            java.lang.Object r2 = r0.a
            formularization.attabal r2 = (formularization.attabal) r2
            p002kotlin.dern.saneness(r9)     // Catch: java.lang.Throwable -> L50
            r7 = r9
            r9 = r8
            r8 = r2
            r2 = r7
            goto L92
        L50:
            r8 = move-exception
            goto Lbd
        L53:
            java.lang.Object r8 = r0.b
            formularization.attabal r8 = (formularization.attabal) r8
            java.lang.Object r2 = r0.a
            ads_mobile_sdk.kw1 r2 = (ads_mobile_sdk.kw1) r2
            p002kotlin.dern.saneness(r9)
            r7 = r2
            r2 = r8
            r8 = r7
            goto L75
        L62:
            p002kotlin.dern.saneness(r9)
            formularization.attabal r9 = r8.h
            r0.a = r8
            r0.b = r9
            r0.e = r5
            java.lang.Object r2 = r9.attabal(r6, r0)
            if (r2 != r1) goto L74
            goto Lb4
        L74:
            r2 = r9
        L75:
            ads_mobile_sdk.xq0 r9 = r8.f     // Catch: java.lang.Throwable -> L50
            ads_mobile_sdk.gq0 r9 = r9.a     // Catch: java.lang.Throwable -> L50
            saneness.glassmaker r5 = r8.i     // Catch: java.lang.Throwable -> L50
            if (r5 != 0) goto La0
            ads_mobile_sdk.xw1 r8 = r8.g     // Catch: java.lang.Throwable -> L50
            r0.a = r2     // Catch: java.lang.Throwable -> L50
            r0.b = r9     // Catch: java.lang.Throwable -> L50
            r0.e = r4     // Catch: java.lang.Throwable -> L50
            r8.getClass()     // Catch: java.lang.Throwable -> L50
            java.lang.Object r8 = ads_mobile_sdk.xw1.a(r8, r0)     // Catch: java.lang.Throwable -> L50
            if (r8 != r1) goto L8f
            goto Lb4
        L8f:
            r7 = r2
            r2 = r8
            r8 = r7
        L92:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L35
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r2 != 0) goto La1
            kotlin.Unit r9 = p002kotlin.Unit.f29295attabal     // Catch: java.lang.Throwable -> L35
            r8.wireman(r6)
            return r9
        La0:
            r8 = r2
        La1:
            java.lang.String r2 = "onSdkImpression"
            com.google.gson.JsonObject r4 = new com.google.gson.JsonObject     // Catch: java.lang.Throwable -> L35
            r4.<init>()     // Catch: java.lang.Throwable -> L35
            r0.a = r8     // Catch: java.lang.Throwable -> L35
            r0.b = r6     // Catch: java.lang.Throwable -> L35
            r0.e = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r9 = r9.a(r4, r2, r0)     // Catch: java.lang.Throwable -> L35
            if (r9 != r1) goto Lb5
        Lb4:
            return r1
        Lb5:
            kotlin.Unit r9 = p002kotlin.Unit.f29295attabal     // Catch: java.lang.Throwable -> L35
            r8.wireman(r6)
            return r9
        Lbb:
            r2 = r8
            r8 = r9
        Lbd:
            r2.wireman(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kw1.d(ads_mobile_sdk.kw1, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (ads_mobile_sdk.xw1.a(r7, r6, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r6.a(r7, (wretchedly.dern) r0) == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object e(ads_mobile_sdk.kw1 r6, wretchedly.dern r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.hw1
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.hw1 r0 = (ads_mobile_sdk.hw1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.hw1 r0 = new ads_mobile_sdk.hw1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            p002kotlin.dern.saneness(r7)
            goto L88
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            p002kotlin.dern.saneness(r7)
            goto L78
        L3b:
            ads_mobile_sdk.kw1 r6 = r0.a
            p002kotlin.dern.saneness(r7)
            goto L5d
        L41:
            p002kotlin.dern.saneness(r7)
            ads_mobile_sdk.h1 r7 = r6.d
            boolean r7 = r7.N
            if (r7 != 0) goto L4d
            kotlin.Unit r6 = p002kotlin.Unit.f29295attabal
            return r6
        L4d:
            ads_mobile_sdk.xw1 r7 = r6.g
            r0.a = r6
            r0.d = r5
            r7.getClass()
            java.lang.Object r7 = ads_mobile_sdk.xw1.a(r7, r0)
            if (r7 != r1) goto L5d
            goto L87
        L5d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r2 = 0
            if (r7 == 0) goto L7b
            ads_mobile_sdk.xw1 r7 = r6.g
            ads_mobile_sdk.xq0 r6 = r6.f
            r0.a = r2
            r0.d = r4
            r7.getClass()
            java.lang.Object r6 = ads_mobile_sdk.xw1.a(r7, r6, r0)
            if (r6 != r1) goto L78
            goto L87
        L78:
            kotlin.Unit r6 = p002kotlin.Unit.f29295attabal
            return r6
        L7b:
            ads_mobile_sdk.xq0 r7 = r6.f
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L88
        L87:
            return r1
        L88:
            kotlin.Unit r6 = p002kotlin.Unit.f29295attabal
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kw1.e(ads_mobile_sdk.kw1, wretchedly.dern):java.lang.Object");
    }

    @Override // saneness.homozygous
    public final Object a(View view, vk0 vk0Var, String str, wretchedly.dern dernVar) {
        return a(this, (ViewGroup) view, vk0Var, str, dernVar);
    }

    @Override // saneness.undertread
    public final Object i(wretchedly.dern dernVar) {
        return e(this, dernVar);
    }

    @Override // saneness.homozygous
    public final Object l(wretchedly.dern dernVar) {
        return b(this, dernVar);
    }

    @Override // saneness.homozygous
    public final Object m(wretchedly.dern dernVar) {
        return c(this, dernVar);
    }

    @Override // saneness.undertread
    public final Object q(wretchedly.dern dernVar) {
        return d(this, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(kw1 kw1Var, ViewGroup viewGroup, vk0 vk0Var, String str, wretchedly.dern dernVar) {
        wv1 wv1Var;
        View view;
        if (dernVar instanceof wv1) {
            wv1Var = (wv1) dernVar;
            int i = wv1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                wv1Var.g = i - Integer.MIN_VALUE;
            } else {
                wv1Var = new wv1(kw1Var, dernVar);
            }
        } else {
            wv1Var = new wv1(kw1Var, dernVar);
        }
        Object objA = wv1Var.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = wv1Var.g;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            xw1 xw1Var = kw1Var.g;
            wv1Var.a = kw1Var;
            wv1Var.b = viewGroup;
            wv1Var.c = vk0Var;
            wv1Var.d = str;
            wv1Var.g = 1;
            xw1Var.getClass();
            objA = xw1.a(xw1Var, wv1Var);
            if (objA != objBeachfront) {
            }
            view = viewGroup;
            return objBeachfront;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objA);
            return objA;
        }
        str = wv1Var.d;
        vk0Var = wv1Var.c;
        View view2 = wv1Var.b;
        kw1Var = wv1Var.a;
        p002kotlin.dern.saneness(objA);
        view = view2;
        view = viewGroup;
        kw1 kw1Var2 = kw1Var;
        View view3 = view;
        vk0 vk0Var2 = vk0Var;
        String str2 = str;
        if (!((Boolean) objA).booleanValue()) {
            return Unit.f29295attabal;
        }
        xv1 xv1Var = new xv1(kw1Var2, view3, vk0Var2, str2, null);
        wv1Var.a = null;
        wv1Var.b = null;
        wv1Var.c = null;
        wv1Var.d = null;
        wv1Var.g = 2;
        Object objA2 = kw1Var2.a(xv1Var, wv1Var);
        if (objA2 != objBeachfront) {
            return objA2;
        }
        view = viewGroup;
        return objBeachfront;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (kotlinx.coroutines.impromptu.competently(r9, r6, r0) == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [ads_mobile_sdk.xq0] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [ads_mobile_sdk.xq0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v4, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.xq0 r8, wretchedly.dern r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.yv1
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.yv1 r0 = (ads_mobile_sdk.yv1) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.yv1 r0 = new ads_mobile_sdk.yv1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.d
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.a
            formularization.attabal r8 = (formularization.attabal) r8
            p002kotlin.dern.saneness(r9)     // Catch: java.lang.Throwable -> L31
            goto L74
        L31:
            r9 = move-exception
            goto L7a
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            formularization.attabal r8 = r0.c
            ads_mobile_sdk.xq0 r2 = r0.b
            java.lang.Object r4 = r0.a
            ads_mobile_sdk.kw1 r4 = (ads_mobile_sdk.kw1) r4
            p002kotlin.dern.saneness(r9)
            goto L5e
        L47:
            p002kotlin.dern.saneness(r9)
            formularization.attabal r9 = r7.h
            r0.a = r7
            r0.b = r8
            r0.c = r9
            r0.f = r4
            java.lang.Object r2 = r9.attabal(r5, r0)
            if (r2 != r1) goto L5b
            goto L73
        L5b:
            r4 = r7
            r2 = r8
            r8 = r9
        L5e:
            kotlin.coroutines.CoroutineContext r9 = r4.b     // Catch: java.lang.Throwable -> L31
            ads_mobile_sdk.zv1 r6 = new ads_mobile_sdk.zv1     // Catch: java.lang.Throwable -> L31
            r6.<init>(r4, r2, r5)     // Catch: java.lang.Throwable -> L31
            r0.a = r8     // Catch: java.lang.Throwable -> L31
            r0.b = r5     // Catch: java.lang.Throwable -> L31
            r0.c = r5     // Catch: java.lang.Throwable -> L31
            r0.f = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r9 = kotlinx.coroutines.impromptu.competently(r9, r6, r0)     // Catch: java.lang.Throwable -> L31
            if (r9 != r1) goto L74
        L73:
            return r1
        L74:
            kotlin.Unit r9 = p002kotlin.Unit.f29295attabal     // Catch: java.lang.Throwable -> L31
            r8.wireman(r5)
            return r9
        L7a:
            r8.wireman(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kw1.a(ads_mobile_sdk.xq0, wretchedly.dern):java.lang.Object");
    }

    @Override // saneness.homozygous
    public final Object a(c93 c93Var) {
        return a(this, c93Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(kw1 kw1Var, wretchedly.dern dernVar) throws Throwable {
        aw1 aw1Var;
        formularization.attabal attabalVar;
        Throwable th;
        formularization.attabal attabalVar2;
        if (dernVar instanceof aw1) {
            aw1Var = (aw1) dernVar;
            int i = aw1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aw1Var.e = i - Integer.MIN_VALUE;
            } else {
                aw1Var = new aw1(kw1Var, dernVar);
            }
        } else {
            aw1Var = new aw1(kw1Var, dernVar);
        }
        Object obj = aw1Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = aw1Var.e;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                attabalVar = kw1Var.h;
                aw1Var.a = kw1Var;
                aw1Var.b = attabalVar;
                aw1Var.e = 1;
                if (attabalVar.attabal(null, aw1Var) != objBeachfront) {
                }
                return objBeachfront;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar2 = (formularization.attabal) aw1Var.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    Unit unit = Unit.f29295attabal;
                    attabalVar2.wireman(null);
                    return unit;
                } catch (Throwable th2) {
                    th = th2;
                    attabalVar2.wireman(null);
                    throw th;
                }
            }
            formularization.attabal attabalVar3 = aw1Var.b;
            kw1 kw1Var2 = (kw1) aw1Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar3;
            kw1Var = kw1Var2;
            CoroutineContext coroutineContext = kw1Var.b;
            cw1 cw1Var = new cw1(kw1Var, null);
            aw1Var.a = attabalVar;
            aw1Var.b = null;
            aw1Var.e = 2;
            if (impromptu.competently(coroutineContext, cw1Var, aw1Var) != objBeachfront) {
                attabalVar2 = attabalVar;
                Unit unit2 = Unit.f29295attabal;
                attabalVar2.wireman(null);
                return unit2;
            }
            return objBeachfront;
        } catch (Throwable th3) {
            formularization.attabal attabalVar4 = attabalVar;
            th = th3;
            attabalVar2 = attabalVar4;
            attabalVar2.wireman(null);
            throw th;
        }
    }

    @Override // saneness.homozygous
    public final Object a(View view, wretchedly.dern dernVar) {
        return a(this, view, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object a(kw1 kw1Var, View view, wretchedly.dern dernVar) throws Throwable {
        iw1 iw1Var;
        formularization.attabal attabalVar;
        formularization.attabal attabalVar2;
        kw1 kw1Var2;
        if (dernVar instanceof iw1) {
            iw1Var = (iw1) dernVar;
            int i = iw1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                iw1Var.f = i - Integer.MIN_VALUE;
            } else {
                iw1Var = new iw1(kw1Var, dernVar);
            }
        } else {
            iw1Var = new iw1(kw1Var, dernVar);
        }
        Object obj = iw1Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = iw1Var.f;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                attabalVar = kw1Var.h;
                iw1Var.a = kw1Var;
                iw1Var.b = view;
                iw1Var.c = attabalVar;
                iw1Var.f = 1;
                if (attabalVar.attabal(null, iw1Var) != objBeachfront) {
                }
                return objBeachfront;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar2 = iw1Var.c;
                view = iw1Var.b;
                kw1Var2 = iw1Var.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    kw1Var2.j.add(view);
                    Unit unit = Unit.f29295attabal;
                    attabalVar2.wireman(null);
                    return unit;
                } catch (Throwable th) {
                    th = th;
                    attabalVar2.wireman(null);
                    throw th;
                }
            }
            formularization.attabal attabalVar3 = iw1Var.c;
            view = iw1Var.b;
            kw1 kw1Var3 = iw1Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar3;
            kw1Var = kw1Var3;
            glassmaker glassmakerVar = kw1Var.i;
            if (glassmakerVar != null) {
                jw1 jw1Var = new jw1(kw1Var, glassmakerVar, view, null);
                iw1Var.a = kw1Var;
                iw1Var.b = view;
                iw1Var.c = attabalVar;
                iw1Var.f = 2;
                if (kw1Var.a(jw1Var, iw1Var) != objBeachfront) {
                    kw1Var2 = kw1Var;
                    attabalVar2 = attabalVar;
                    kw1Var2.j.add(view);
                }
                return objBeachfront;
            }
            attabalVar2 = attabalVar;
            Unit unit2 = Unit.f29295attabal;
            attabalVar2.wireman(null);
            return unit2;
        } catch (Throwable th2) {
            th = th2;
            attabalVar2 = attabalVar;
            attabalVar2.wireman(null);
            throw th;
        }
    }
}
