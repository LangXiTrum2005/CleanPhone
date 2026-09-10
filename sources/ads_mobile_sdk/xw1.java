package ads_mobile_sdk;

import android.webkit.WebView;
import formularization.beachfront;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.fastrack;

/* JADX INFO: loaded from: classes.dex */
public final class xw1 extends el {
    public final lv1 c;
    public final h1 d;
    public final formularization.attabal e;
    public d91 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw1(lv1 omid, h1 adConfiguration, jk0 flags, CoroutineContext uiContext) {
        super(flags, uiContext);
        Intrinsics.checkNotNullParameter(omid, "omid");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        this.c = omid;
        this.d = adConfiguration;
        this.e = beachfront.saneness(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r8.a(r7, r1) == r2) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [ads_mobile_sdk.xw1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v4, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [ads_mobile_sdk.el, ads_mobile_sdk.xw1] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object a(ads_mobile_sdk.xw1 r14, android.view.View r15, ads_mobile_sdk.vk0 r16, java.lang.String r17, wretchedly.dern r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof ads_mobile_sdk.ow1
            if (r1 == 0) goto L15
            r1 = r0
            ads_mobile_sdk.ow1 r1 = (ads_mobile_sdk.ow1) r1
            int r2 = r1.h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.h = r2
            goto L1a
        L15:
            ads_mobile_sdk.ow1 r1 = new ads_mobile_sdk.ow1
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.f
            java.lang.Object r2 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r3 = r1.h
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L50
            if (r3 == r5) goto L3d
            if (r3 != r4) goto L35
            java.lang.Object r14 = r1.a
            formularization.attabal r14 = (formularization.attabal) r14
            p002kotlin.dern.saneness(r0)     // Catch: java.lang.Throwable -> L33
            goto L8f
        L33:
            r0 = move-exception
            goto L95
        L35:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L3d:
            formularization.attabal r14 = r1.e
            java.lang.String r3 = r1.d
            ads_mobile_sdk.vk0 r5 = r1.c
            android.view.View r7 = r1.b
            java.lang.Object r8 = r1.a
            ads_mobile_sdk.xw1 r8 = (ads_mobile_sdk.xw1) r8
            p002kotlin.dern.saneness(r0)
            r12 = r3
            r11 = r5
            r10 = r7
            goto L71
        L50:
            p002kotlin.dern.saneness(r0)
            formularization.attabal r0 = r14.e
            r1.a = r14
            r1.b = r15
            r7 = r16
            r1.c = r7
            r8 = r17
            r1.d = r8
            r1.e = r0
            r1.h = r5
            java.lang.Object r5 = r0.attabal(r6, r1)
            if (r5 != r2) goto L6c
            goto L8e
        L6c:
            r10 = r15
            r11 = r7
            r12 = r8
            r8 = r14
            r14 = r0
        L71:
            ads_mobile_sdk.d91 r9 = r8.f     // Catch: java.lang.Throwable -> L33
            if (r9 != 0) goto L76
            goto L8f
        L76:
            ads_mobile_sdk.pw1 r7 = new ads_mobile_sdk.pw1     // Catch: java.lang.Throwable -> L33
            r13 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L33
            r1.a = r14     // Catch: java.lang.Throwable -> L33
            r1.b = r6     // Catch: java.lang.Throwable -> L33
            r1.c = r6     // Catch: java.lang.Throwable -> L33
            r1.d = r6     // Catch: java.lang.Throwable -> L33
            r1.e = r6     // Catch: java.lang.Throwable -> L33
            r1.h = r4     // Catch: java.lang.Throwable -> L33
            java.lang.Object r0 = r8.a(r7, r1)     // Catch: java.lang.Throwable -> L33
            if (r0 != r2) goto L8f
        L8e:
            return r2
        L8f:
            kotlin.Unit r0 = p002kotlin.Unit.f29295attabal     // Catch: java.lang.Throwable -> L33
            r14.wireman(r6)
            return r0
        L95:
            r14.wireman(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xw1.a(ads_mobile_sdk.xw1, android.view.View, ads_mobile_sdk.vk0, java.lang.String, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object a(xw1 xw1Var, fastrack fastrackVar, wretchedly.dern dernVar) throws Throwable {
        qw1 qw1Var;
        formularization.attabal attabalVar;
        formularization.attabal attabalVar2;
        Unit unit;
        xw1 xw1Var2;
        if (dernVar instanceof qw1) {
            qw1Var = (qw1) dernVar;
            int i = qw1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                qw1Var.f = i - Integer.MIN_VALUE;
            } else {
                qw1Var = new qw1(xw1Var, dernVar);
            }
        } else {
            qw1Var = new qw1(xw1Var, dernVar);
        }
        Object obj = qw1Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = qw1Var.f;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                attabalVar = xw1Var.e;
                qw1Var.a = xw1Var;
                qw1Var.b = fastrackVar;
                qw1Var.c = attabalVar;
                qw1Var.f = 1;
                if (attabalVar.attabal(null, qw1Var) != objBeachfront) {
                }
                return objBeachfront;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar2 = (formularization.attabal) qw1Var.b;
                xw1Var2 = qw1Var.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    xw1Var2.f = null;
                    unit = Unit.f29295attabal;
                    attabalVar = attabalVar2;
                    attabalVar.wireman(null);
                    return unit;
                } catch (Throwable th) {
                    th = th;
                    attabalVar2.wireman(null);
                    throw th;
                }
            }
            formularization.attabal attabalVar3 = qw1Var.c;
            fastrackVar = (fastrack) qw1Var.b;
            xw1 xw1Var3 = qw1Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar3;
            xw1Var = xw1Var3;
            d91 d91Var = xw1Var.f;
            if (d91Var != null) {
                rw1 rw1Var = new rw1(xw1Var, d91Var, fastrackVar, null);
                qw1Var.a = xw1Var;
                qw1Var.b = attabalVar;
                qw1Var.c = null;
                qw1Var.f = 2;
                if (xw1Var.a(rw1Var, qw1Var) != objBeachfront) {
                    xw1Var2 = xw1Var;
                    attabalVar2 = attabalVar;
                    xw1Var2.f = null;
                    unit = Unit.f29295attabal;
                    attabalVar = attabalVar2;
                }
                return objBeachfront;
            }
            unit = null;
            attabalVar.wireman(null);
            return unit;
        } catch (Throwable th2) {
            th = th2;
            attabalVar2 = attabalVar;
            attabalVar2.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r6.a(r4, r0) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object a(ads_mobile_sdk.xw1 r6, ads_mobile_sdk.xq0 r7, wretchedly.dern r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.sw1
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.sw1 r0 = (ads_mobile_sdk.sw1) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.sw1 r0 = new ads_mobile_sdk.sw1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.d
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.a
            formularization.attabal r6 = (formularization.attabal) r6
            p002kotlin.dern.saneness(r8)     // Catch: java.lang.Throwable -> L31
            goto L77
        L31:
            r7 = move-exception
            goto L7d
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            formularization.attabal r6 = r0.c
            ads_mobile_sdk.xq0 r7 = r0.b
            java.lang.Object r2 = r0.a
            ads_mobile_sdk.xw1 r2 = (ads_mobile_sdk.xw1) r2
            p002kotlin.dern.saneness(r8)
            r8 = r6
            r6 = r2
            goto L5d
        L49:
            p002kotlin.dern.saneness(r8)
            formularization.attabal r8 = r6.e
            r0.a = r6
            r0.b = r7
            r0.c = r8
            r0.f = r4
            java.lang.Object r2 = r8.attabal(r5, r0)
            if (r2 != r1) goto L5d
            goto L75
        L5d:
            ads_mobile_sdk.d91 r2 = r6.f     // Catch: java.lang.Throwable -> L7f
            if (r2 != 0) goto L62
            goto L76
        L62:
            ads_mobile_sdk.tw1 r4 = new ads_mobile_sdk.tw1     // Catch: java.lang.Throwable -> L7f
            r4.<init>(r7, r6, r2, r5)     // Catch: java.lang.Throwable -> L7f
            r0.a = r8     // Catch: java.lang.Throwable -> L7f
            r0.b = r5     // Catch: java.lang.Throwable -> L7f
            r0.c = r5     // Catch: java.lang.Throwable -> L7f
            r0.f = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r6 = r6.a(r4, r0)     // Catch: java.lang.Throwable -> L7f
            if (r6 != r1) goto L76
        L75:
            return r1
        L76:
            r6 = r8
        L77:
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal     // Catch: java.lang.Throwable -> L31
            r6.wireman(r5)
            return r7
        L7d:
            r8 = r6
            goto L81
        L7f:
            r6 = move-exception
            r7 = r6
        L81:
            r8.wireman(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xw1.a(ads_mobile_sdk.xw1, ads_mobile_sdk.xq0, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object a(xw1 xw1Var, wretchedly.dern dernVar) {
        uw1 uw1Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof uw1) {
            uw1Var = (uw1) dernVar;
            int i = uw1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                uw1Var.e = i - Integer.MIN_VALUE;
            } else {
                uw1Var = new uw1(xw1Var, dernVar);
            }
        } else {
            uw1Var = new uw1(xw1Var, dernVar);
        }
        Object obj = uw1Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = uw1Var.e;
        boolean z = true;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = xw1Var.e;
            uw1Var.a = xw1Var;
            uw1Var.b = attabalVar;
            uw1Var.e = 1;
            if (attabalVar.attabal(null, uw1Var) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = uw1Var.b;
            xw1 xw1Var2 = uw1Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            xw1Var = xw1Var2;
        }
        try {
            if (xw1Var.f == null) {
                z = false;
            }
            return igo.attabal.attabal(z);
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(xw1 xw1Var, gq0 gq0Var, boolean z, wretchedly.dern dernVar) throws Throwable {
        vw1 vw1Var;
        formularization.attabal attabalVar;
        WebView webView;
        Boolean bool;
        formularization.attabal attabalVar2;
        xw1 xw1Var2;
        if (dernVar instanceof vw1) {
            vw1Var = (vw1) dernVar;
            int i = vw1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                vw1Var.g = i - Integer.MIN_VALUE;
            } else {
                vw1Var = new vw1(xw1Var, dernVar);
            }
        } else {
            vw1Var = new vw1(xw1Var, dernVar);
        }
        Object obj = vw1Var.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = vw1Var.g;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                attabalVar = xw1Var.e;
                vw1Var.a = xw1Var;
                vw1Var.b = gq0Var;
                vw1Var.c = attabalVar;
                vw1Var.d = z;
                vw1Var.g = 1;
                if (attabalVar.attabal(null, vw1Var) != objBeachfront) {
                }
                webView = gq0Var;
                return objBeachfront;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xw1Var = (xw1) vw1Var.c;
                attabalVar2 = (formularization.attabal) vw1Var.b;
                xw1Var2 = vw1Var.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    xw1Var.f = (d91) obj;
                    Boolean boolAttabal = igo.attabal.attabal(xw1Var2.f != null);
                    attabalVar2.wireman(null);
                    return boolAttabal;
                } catch (Throwable th) {
                    th = th;
                    attabalVar = attabalVar2;
                    attabalVar.wireman(null);
                    throw th;
                }
            }
            z = vw1Var.d;
            formularization.attabal attabalVar3 = (formularization.attabal) vw1Var.c;
            WebView webView2 = (WebView) vw1Var.b;
            xw1 xw1Var3 = vw1Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar3;
            xw1Var = xw1Var3;
            webView = webView2;
            webView = gq0Var;
            if (xw1Var.d.N && (bool = (Boolean) xw1Var.c.f.attabal("IsActive", gv1.a)) != null && bool.booleanValue() && xw1Var.d.R.c && xw1Var.a.R()) {
                if (xw1Var.f != null) {
                    kn0.c("Already started javascript session service", null);
                } else {
                    ww1 ww1Var = new ww1(xw1Var, webView, z, null);
                    vw1Var.a = xw1Var;
                    vw1Var.b = attabalVar;
                    vw1Var.c = xw1Var;
                    vw1Var.g = 2;
                    Object objA = xw1Var.a(ww1Var, vw1Var);
                    if (objA != objBeachfront) {
                        formularization.attabal attabalVar4 = attabalVar;
                        obj = objA;
                        attabalVar2 = attabalVar4;
                        xw1Var2 = xw1Var;
                        xw1Var.f = (d91) obj;
                        Boolean boolAttabal2 = igo.attabal.attabal(xw1Var2.f != null);
                        attabalVar2.wireman(null);
                        return boolAttabal2;
                    }
                    webView = gq0Var;
                    return objBeachfront;
                }
            }
            Boolean boolAttabal3 = igo.attabal.attabal(false);
            attabalVar.wireman(null);
            return boolAttabal3;
        } catch (Throwable th2) {
            th = th2;
            attabalVar.wireman(null);
            throw th;
        }
    }
}
