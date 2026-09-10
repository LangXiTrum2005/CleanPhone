package ads_mobile_sdk;

import kotlinx.coroutines.flow.arytenoidectomy;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zd2 extends SuspendLambda implements Function2 {
    public formularization.attabal a;
    public ee2 b;
    public int c;
    public final /* synthetic */ ee2 d;
    public final /* synthetic */ arytenoidectomy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd2(ee2 ee2Var, arytenoidectomy arytenoidectomyVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.d = ee2Var;
        this.e = arytenoidectomyVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new zd2(this.d, this.e, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new zd2(this.d, this.e, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r1.collect(r3, r5) == r0) goto L21;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r5.c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1b
            if (r1 == r2) goto L17
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            p002kotlin.dern.saneness(r6)
            goto L56
        L1b:
            ads_mobile_sdk.ee2 r1 = r5.b
            formularization.attabal r3 = r5.a
            p002kotlin.dern.saneness(r6)
            goto L38
        L23:
            p002kotlin.dern.saneness(r6)
            ads_mobile_sdk.ee2 r1 = r5.d
            formularization.attabal r6 = r1.f
            r5.a = r6
            r5.b = r1
            r5.c = r3
            java.lang.Object r3 = r6.attabal(r4, r5)
            if (r3 != r0) goto L37
            goto L55
        L37:
            r3 = r6
        L38:
            kotlinx.coroutines.monroe r6 = r1.g     // Catch: java.lang.Throwable -> L5c
            r3.wireman(r4)
            if (r6 != 0) goto L42
            kotlin.Unit r6 = p002kotlin.Unit.f29295attabal
            return r6
        L42:
            kotlinx.coroutines.flow.arytenoidectomy r1 = r5.e
            ads_mobile_sdk.yd2 r3 = new ads_mobile_sdk.yd2
            r3.<init>(r6)
            r5.a = r4
            r5.b = r4
            r5.c = r2
            java.lang.Object r6 = r1.collect(r3, r5)
            if (r6 != r0) goto L56
        L55:
            return r0
        L56:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        L5c:
            r6 = move-exception
            r3.wireman(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zd2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
