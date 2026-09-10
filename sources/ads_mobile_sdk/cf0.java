package ads_mobile_sdk;

import com.google.gson.JsonObject;
import formularization.beachfront;
import java.util.UUID;
import kotlinx.coroutines.dhss;
import kotlinx.coroutines.impromptu;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hydrofracturing;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public abstract class cf0 implements hydrofracturing {
    public final formularization.attabal a = beachfront.saneness(false, 1, null);
    public e51 b;

    @Override // saneness.hydrofracturing
    public final Object a(String str, String str2, wretchedly.dern dernVar) {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        return a(new te0(str, str2, uuidRandomUUID, null), dernVar);
    }

    public abstract Object a(String str, wretchedly.dern dernVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r7.c(r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r2.a(r6, r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ads_mobile_sdk.e51 r6, wretchedly.dern r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.re0
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.re0 r0 = (ads_mobile_sdk.re0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.re0 r0 = new ads_mobile_sdk.re0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p002kotlin.dern.saneness(r7)
            goto L61
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            ads_mobile_sdk.e51 r6 = r0.b
            ads_mobile_sdk.cf0 r2 = r0.a
            p002kotlin.dern.saneness(r7)
            goto L53
        L3c:
            p002kotlin.dern.saneness(r7)
            ads_mobile_sdk.e51 r7 = r5.b
            r5.b = r6
            if (r7 == 0) goto L52
            r0.a = r5
            r0.b = r6
            r0.e = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L52
            goto L60
        L52:
            r2 = r5
        L53:
            r7 = 0
            r0.a = r7
            r0.b = r7
            r0.e = r3
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L61
        L60:
            return r1
        L61:
            kotlin.Unit r6 = p002kotlin.Unit.f29295attabal
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cf0.b(ads_mobile_sdk.e51, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(e51 e51Var, wretchedly.dern dernVar) throws Throwable {
        se0 se0Var;
        formularization.attabal attabalVar;
        cf0 cf0Var;
        Throwable th;
        formularization.attabal attabalVar2;
        if (dernVar instanceof se0) {
            se0Var = (se0) dernVar;
            int i = se0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                se0Var.f = i - Integer.MIN_VALUE;
            } else {
                se0Var = new se0(this, dernVar);
            }
        } else {
            se0Var = new se0(this, dernVar);
        }
        Object obj = se0Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = se0Var.f;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                attabalVar = this.a;
                se0Var.a = this;
                se0Var.b = e51Var;
                se0Var.c = attabalVar;
                se0Var.f = 1;
                if (attabalVar.attabal(null, se0Var) != objBeachfront) {
                    cf0Var = this;
                }
                return objBeachfront;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar2 = (formularization.attabal) se0Var.a;
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
            formularization.attabal attabalVar3 = se0Var.c;
            e51 e51Var2 = se0Var.b;
            cf0Var = (cf0) se0Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar3;
            e51Var = e51Var2;
            se0Var.a = attabalVar;
            se0Var.b = null;
            se0Var.c = null;
            se0Var.f = 2;
            if (cf0Var.b(e51Var, se0Var) != objBeachfront) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(wretchedly.dern dernVar) throws Throwable {
        xe0 xe0Var;
        if (dernVar instanceof xe0) {
            xe0Var = (xe0) dernVar;
            int i = xe0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xe0Var.c = i - Integer.MIN_VALUE;
            } else {
                xe0Var = new xe0(this, dernVar);
            }
        } else {
            xe0Var = new xe0(this, dernVar);
        }
        Object objB = xe0Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = xe0Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objB);
            xe0Var.c = 1;
            objB = b(xe0Var);
            if (objB == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objB);
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.hydrofracturing
    public final Object a(JsonObject jsonObject, String str, wretchedly.dern dernVar) throws Throwable {
        Object objA = a(new ue0(jsonObject, str, null), dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [ads_mobile_sdk.cf0] */
    /* JADX WARN: Type inference failed for: r11v0, types: [ads_mobile_sdk.te0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [ads_mobile_sdk.e51] */
    /* JADX WARN: Type inference failed for: r11v2, types: [ads_mobile_sdk.e51] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.functions.Function2] */
    public final Object a(te0 te0Var, wretchedly.dern dernVar) throws Throwable {
        ye0 ye0Var;
        ?? r11;
        ?? r2;
        e51 e51Var;
        spartacist spartacistVar;
        dhss dhssVar;
        ze0 ze0Var;
        if (dernVar instanceof ye0) {
            ye0Var = (ye0) dernVar;
            int i = ye0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ye0Var.e = i - Integer.MIN_VALUE;
            } else {
                ye0Var = new ye0(this, dernVar);
            }
        } else {
            ye0Var = new ye0(this, dernVar);
        }
        Object objB = ye0Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ye0Var.e;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(objB);
                ye0Var.a = te0Var;
                ye0Var.e = 1;
                objB = b(ye0Var);
                if (objB != objBeachfront) {
                }
                r11 = te0Var;
                return objBeachfront;
            }
            if (i2 == 1) {
                Function2 function2 = (Function2) ye0Var.a;
                p002kotlin.dern.saneness(objB);
                r11 = function2;
            } else {
                if (i2 == 2) {
                    e51 e51Var2 = ye0Var.b;
                    Function2 function3 = (Function2) ye0Var.a;
                    p002kotlin.dern.saneness(objB);
                    r2 = function3;
                    e51Var = e51Var2;
                    ye0Var.a = e51Var;
                    ye0Var.b = null;
                    ye0Var.e = 3;
                    objB = r2.invoke(e51Var, ye0Var);
                    te0Var = e51Var;
                    if (objB != objBeachfront) {
                    }
                    r11 = te0Var;
                    return objBeachfront;
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        spartacist spartacistVar2 = (spartacist) ye0Var.a;
                        p002kotlin.dern.saneness(objB);
                        return spartacistVar2;
                    }
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th = (Throwable) ye0Var.a;
                    p002kotlin.dern.saneness(objB);
                    throw th;
                }
                e51 e51Var3 = (e51) ye0Var.a;
                p002kotlin.dern.saneness(objB);
                te0Var = e51Var3;
            }
            spartacistVar = (spartacist) objB;
            dhssVar = dhss.f32190kowloon;
            ze0Var = new ze0(te0Var, null);
            ye0Var.a = spartacistVar;
            ye0Var.e = 4;
            if (impromptu.competently(dhssVar, ze0Var, ye0Var) == objBeachfront) {
                return spartacistVar;
            }
            r11 = te0Var;
            return objBeachfront;
            r11 = te0Var;
            spartacist spartacistVar3 = (spartacist) objB;
            if (spartacistVar3 instanceof nn0) {
                return (nn0) spartacistVar3;
            }
            Intrinsics.competently(spartacistVar3, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
            e51 e51Var4 = (e51) ((tn0) spartacistVar3).b;
            try {
                ye0Var.a = r11;
                ye0Var.b = e51Var4;
                ye0Var.e = 2;
                if (e51Var4.d(ye0Var) != objBeachfront) {
                    r2 = r11;
                    e51Var = e51Var4;
                    ye0Var.a = e51Var;
                    ye0Var.b = null;
                    ye0Var.e = 3;
                    objB = r2.invoke(e51Var, ye0Var);
                    te0Var = e51Var;
                    if (objB != objBeachfront) {
                        spartacistVar = (spartacist) objB;
                        dhssVar = dhss.f32190kowloon;
                        ze0Var = new ze0(te0Var, null);
                        ye0Var.a = spartacistVar;
                        ye0Var.e = 4;
                        if (impromptu.competently(dhssVar, ze0Var, ye0Var) == objBeachfront) {
                            return spartacistVar;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                te0Var = e51Var4;
                dhss dhssVar2 = dhss.f32190kowloon;
                ze0 ze0Var2 = new ze0(te0Var, null);
                ye0Var.a = th;
                ye0Var.b = null;
                ye0Var.e = 5;
                if (impromptu.competently(dhssVar2, ze0Var2, ye0Var) != objBeachfront) {
                    throw th;
                }
            }
            r11 = te0Var;
            return objBeachfront;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009b A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:19:0x0049, B:38:0x0095, B:40:0x009b, B:41:0x009e), top: B:58:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009e A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #1 {all -> 0x00c4, blocks: (B:19:0x0049, B:38:0x0095, B:40:0x009b, B:41:0x009e), top: B:58:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(wretchedly.dern dernVar) throws Throwable {
        ve0 ve0Var;
        formularization.attabal attabalVar;
        cf0 cf0Var;
        formularization.attabal attabalVar2;
        Throwable th;
        formularization.attabal attabalVar3;
        cf0 cf0Var2;
        e51 e51Var;
        spartacist spartacistVar;
        e51 e51Var2;
        Object tn0Var;
        if (dernVar instanceof ve0) {
            ve0Var = (ve0) dernVar;
            int i = ve0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ve0Var.e = i - Integer.MIN_VALUE;
            } else {
                ve0Var = new ve0(this, dernVar);
            }
        } else {
            ve0Var = new ve0(this, dernVar);
        }
        Object obj = ve0Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ve0Var.e;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                attabalVar = this.a;
                ve0Var.a = this;
                ve0Var.b = attabalVar;
                ve0Var.e = 1;
                if (attabalVar.attabal(null, ve0Var) != objBeachfront) {
                    cf0Var = this;
                }
                return objBeachfront;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e51Var = (e51) ve0Var.b;
                    attabalVar2 = (formularization.attabal) ve0Var.a;
                    try {
                        p002kotlin.dern.saneness(obj);
                        tn0Var = new tn0(e51Var);
                        attabalVar3 = attabalVar2;
                        attabalVar3.wireman(null);
                        return tn0Var;
                    } catch (Throwable th2) {
                        th = th2;
                        attabalVar3 = attabalVar2;
                        attabalVar3.wireman(null);
                        throw th;
                    }
                }
                attabalVar3 = (formularization.attabal) ve0Var.b;
                cf0Var2 = (cf0) ve0Var.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    spartacistVar = (spartacist) obj;
                    if (!(spartacistVar instanceof nn0)) {
                        Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                        e51Var2 = (e51) ((tn0) spartacistVar).b;
                        ve0Var.a = attabalVar3;
                        ve0Var.b = e51Var2;
                        ve0Var.e = 3;
                        if (cf0Var2.b(e51Var2, ve0Var) != objBeachfront) {
                            e51Var = e51Var2;
                            attabalVar2 = attabalVar3;
                            tn0Var = new tn0(e51Var);
                            attabalVar3 = attabalVar2;
                        }
                        return objBeachfront;
                    }
                    tn0Var = (nn0) spartacistVar;
                    attabalVar3.wireman(null);
                    return tn0Var;
                } catch (Throwable th3) {
                    th = th3;
                    attabalVar3.wireman(null);
                    throw th;
                }
            }
            formularization.attabal attabalVar4 = (formularization.attabal) ve0Var.b;
            cf0Var = (cf0) ve0Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar4;
            e51 e51Var3 = cf0Var.b;
            if (e51Var3 == null || e51Var3.a.j.get()) {
                ve0Var.a = cf0Var;
                ve0Var.b = attabalVar;
                ve0Var.e = 2;
                Object objA = cf0Var.a((String) null, ve0Var);
                if (objA != objBeachfront) {
                    attabalVar3 = attabalVar;
                    obj = objA;
                    cf0Var2 = cf0Var;
                    spartacistVar = (spartacist) obj;
                    if (!(spartacistVar instanceof nn0)) {
                        tn0Var = (nn0) spartacistVar;
                    } else {
                        Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                        e51Var2 = (e51) ((tn0) spartacistVar).b;
                        ve0Var.a = attabalVar3;
                        ve0Var.b = e51Var2;
                        ve0Var.e = 3;
                        if (cf0Var2.b(e51Var2, ve0Var) != objBeachfront) {
                            e51Var = e51Var2;
                            attabalVar2 = attabalVar3;
                        }
                    }
                    attabalVar3.wireman(null);
                    return tn0Var;
                }
                return objBeachfront;
            }
            attabalVar2 = attabalVar;
            e51Var = e51Var3;
            tn0Var = new tn0(e51Var);
            attabalVar3 = attabalVar2;
            attabalVar3.wireman(null);
            return tn0Var;
        } catch (Throwable th4) {
            attabalVar2 = attabalVar;
            th = th4;
            attabalVar3 = attabalVar2;
            attabalVar3.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(wretchedly.dern dernVar) {
        we0 we0Var;
        cf0 cf0Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof we0) {
            we0Var = (we0) dernVar;
            int i = we0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                we0Var.e = i - Integer.MIN_VALUE;
            } else {
                we0Var = new we0(this, dernVar);
            }
        } else {
            we0Var = new we0(this, dernVar);
        }
        Object obj = we0Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = we0Var.e;
        boolean z = true;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = this.a;
            we0Var.a = this;
            we0Var.b = attabalVar2;
            we0Var.e = 1;
            if (attabalVar2.attabal(null, we0Var) == objBeachfront) {
                return objBeachfront;
            }
            cf0Var = this;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = we0Var.b;
            cf0Var = we0Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            e51 e51Var = cf0Var.b;
            if (e51Var == null || e51Var.a.j.get()) {
                z = false;
            }
            return igo.attabal.attabal(z);
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a0 A[PHI: r11
  0x00a0: PHI (r11v10 ads_mobile_sdk.e51) = (r11v9 ads_mobile_sdk.e51), (r11v17 ads_mobile_sdk.e51) binds: [B:39:0x009d, B:20:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
    
        if (kotlinx.coroutines.impromptu.competently(r12, r2, r0) == r1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [ads_mobile_sdk.cf0] */
    /* JADX WARN: Type inference failed for: r11v0, types: [ads_mobile_sdk.ue0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [ads_mobile_sdk.e51] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.functions.Function2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.ue0 r11, wretchedly.dern r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cf0.a(ads_mobile_sdk.ue0, wretchedly.dern):java.lang.Object");
    }

    public Object a(e51 e51Var, wretchedly.dern dernVar) {
        return Unit.f29295attabal;
    }
}
