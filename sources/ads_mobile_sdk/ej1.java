package ads_mobile_sdk;

import formularization.beachfront;
import p002kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class ej1 {
    public final formularization.attabal a = beachfront.attabal(false);
    public Object b;

    public ej1(Object obj) {
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(wretchedly.dern dernVar) {
        bj1 bj1Var;
        ej1 ej1Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof bj1) {
            bj1Var = (bj1) dernVar;
            int i = bj1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bj1Var.e = i - Integer.MIN_VALUE;
            } else {
                bj1Var = new bj1(this, dernVar);
            }
        } else {
            bj1Var = new bj1(this, dernVar);
        }
        Object obj = bj1Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = bj1Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = this.a;
            bj1Var.a = this;
            bj1Var.b = attabalVar2;
            bj1Var.e = 1;
            if (attabalVar2.attabal(null, bj1Var) == objBeachfront) {
                return objBeachfront;
            }
            ej1Var = this;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = bj1Var.b;
            ej1Var = bj1Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            return ej1Var.b;
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if (((java.lang.Boolean) r2.invoke(r4)).booleanValue() != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [ads_mobile_sdk.e23, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.d23 r7, ads_mobile_sdk.e23 r8, wretchedly.dern r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.cj1
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.cj1 r0 = (ads_mobile_sdk.cj1) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.cj1 r0 = new ads_mobile_sdk.cj1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.e
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L55
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.c
            ads_mobile_sdk.ej1 r7 = (ads_mobile_sdk.ej1) r7
            java.lang.Object r8 = r0.b
            formularization.attabal r8 = (formularization.attabal) r8
            ads_mobile_sdk.ej1 r0 = r0.a
            p002kotlin.dern.saneness(r9)     // Catch: java.lang.Throwable -> L37
            goto L95
        L37:
            r7 = move-exception
            goto La1
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            formularization.attabal r7 = r0.d
            java.lang.Object r8 = r0.c
            kotlin.jvm.functions.Function1 r8 = (p002kotlin.jvm.functions.Function1) r8
            java.lang.Object r2 = r0.b
            kotlin.jvm.functions.Function1 r2 = (p002kotlin.jvm.functions.Function1) r2
            ads_mobile_sdk.ej1 r4 = r0.a
            p002kotlin.dern.saneness(r9)
            r9 = r8
            r8 = r7
            r7 = r4
            goto L70
        L55:
            p002kotlin.dern.saneness(r9)
            formularization.attabal r9 = r6.a
            r0.a = r6
            r0.b = r7
            r0.c = r8
            r0.d = r9
            r0.g = r4
            java.lang.Object r2 = r9.attabal(r5, r0)
            if (r2 != r1) goto L6b
            goto L93
        L6b:
            r2 = r9
            r9 = r8
            r8 = r2
            r2 = r7
            r7 = r6
        L70:
            java.lang.Object r4 = r7.b     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L83
            p002kotlin.jvm.internal.Intrinsics.beachfront(r4)     // Catch: java.lang.Throwable -> L37
            java.lang.Object r2 = r2.invoke(r4)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L37
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L98
        L83:
            r0.a = r7     // Catch: java.lang.Throwable -> L37
            r0.b = r8     // Catch: java.lang.Throwable -> L37
            r0.c = r7     // Catch: java.lang.Throwable -> L37
            r0.d = r5     // Catch: java.lang.Throwable -> L37
            r0.g = r3     // Catch: java.lang.Throwable -> L37
            java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L37
            if (r9 != r1) goto L94
        L93:
            return r1
        L94:
            r0 = r7
        L95:
            r7.b = r9     // Catch: java.lang.Throwable -> L37
            r7 = r0
        L98:
            java.lang.Object r7 = r7.b     // Catch: java.lang.Throwable -> L37
            p002kotlin.jvm.internal.Intrinsics.beachfront(r7)     // Catch: java.lang.Throwable -> L37
            r8.wireman(r5)
            return r7
        La1:
            r8.wireman(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ej1.a(ads_mobile_sdk.d23, ads_mobile_sdk.e23, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, wretchedly.dern dernVar) {
        dj1 dj1Var;
        formularization.attabal attabalVar;
        ej1 ej1Var;
        if (dernVar instanceof dj1) {
            dj1Var = (dj1) dernVar;
            int i = dj1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                dj1Var.f = i - Integer.MIN_VALUE;
            } else {
                dj1Var = new dj1(this, dernVar);
            }
        } else {
            dj1Var = new dj1(this, dernVar);
        }
        Object obj2 = dj1Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = dj1Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj2);
            attabalVar = this.a;
            dj1Var.a = this;
            dj1Var.b = obj;
            dj1Var.c = attabalVar;
            dj1Var.f = 1;
            if (attabalVar.attabal(null, dj1Var) == objBeachfront) {
                return objBeachfront;
            }
            ej1Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = dj1Var.c;
            Object obj3 = dj1Var.b;
            ej1Var = dj1Var.a;
            p002kotlin.dern.saneness(obj2);
            attabalVar = attabalVar2;
            obj = obj3;
        }
        try {
            ej1Var.b = obj;
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }
}
