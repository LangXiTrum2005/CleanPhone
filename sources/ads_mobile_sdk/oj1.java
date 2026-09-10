package ads_mobile_sdk;

import com.google.gson.JsonObject;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class oj1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ vj1 b;
    public final /* synthetic */ JsonObject c;
    public final /* synthetic */ a22 d;
    public final /* synthetic */ hj1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj1(a22 a22Var, hj1 hj1Var, vj1 vj1Var, JsonObject jsonObject, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = vj1Var;
        this.c = jsonObject;
        this.d = a22Var;
        this.e = hj1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new oj1(this.d, this.e, this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((oj1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        if (ads_mobile_sdk.vj1.a(r3, r1, r13, r12) == r0) goto L33;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r12.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            p002kotlin.dern.saneness(r13)
            goto Lb0
        L13:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1b:
            p002kotlin.dern.saneness(r13)
            goto L34
        L1f:
            p002kotlin.dern.saneness(r13)
            ads_mobile_sdk.vj1 r13 = r12.b
            ads_mobile_sdk.hn1 r13 = r13.c
            com.google.gson.JsonObject r1 = r12.c
            ads_mobile_sdk.a22 r4 = r12.d
            r12.a = r3
            java.lang.Object r13 = r13.a(r1, r4, r12)
            if (r13 != r0) goto L34
            goto Lac
        L34:
            ads_mobile_sdk.gq0 r13 = (ads_mobile_sdk.gq0) r13
            if (r13 == 0) goto Lb0
            ads_mobile_sdk.hj1 r1 = r12.e
            ads_mobile_sdk.vj1 r3 = r12.b
            com.google.gson.JsonObject r4 = r12.c
            r1.j = r13
            r1.k = r13
            ads_mobile_sdk.er0 r5 = r13.d()
            r1.l = r5
            ads_mobile_sdk.er0 r5 = r13.d()
            r1.m = r5
            ads_mobile_sdk.jk0 r5 = r3.f
            r5.getClass()
            java.lang.String r6 = "gads:immersive_video_ads:enabled"
            java.lang.String r7 = "key"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            ads_mobile_sdk.jk r9 = ads_mobile_sdk.zk.b
            java.lang.Object r5 = r5.a(r6, r8, r9)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto Lb0
            java.lang.String r5 = "video"
            r6 = 0
            com.google.gson.JsonObject r4 = ads_mobile_sdk.cb1.a(r4, r5, r6)
            if (r4 == 0) goto Lb0
            java.lang.String r5 = "flags"
            com.google.gson.JsonArray r4 = ads_mobile_sdk.cb1.d(r4, r5)
            if (r4 == 0) goto Lb0
            int r5 = r4.size()
            r6 = 0
        L80:
            if (r6 >= r5) goto Lb0
            com.google.gson.JsonObject r8 = ads_mobile_sdk.cb1.a(r4, r6)
            if (r8 != 0) goto L89
            goto Lad
        L89:
            java.lang.String r9 = ""
            java.lang.String r10 = ads_mobile_sdk.cb1.a(r8, r7, r9)
            java.lang.String r11 = "afma_video_player_type"
            boolean r10 = p002kotlin.jvm.internal.Intrinsics.wireman(r10, r11)
            if (r10 == 0) goto Lad
            java.lang.String r4 = "value"
            java.lang.String r4 = ads_mobile_sdk.cb1.a(r8, r4, r9)     // Catch: java.lang.NumberFormatException -> Lb0
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> Lb0
            r5 = 3
            if (r4 != r5) goto Lb0
            r12.a = r2
            java.lang.Object r13 = ads_mobile_sdk.vj1.a(r3, r1, r13, r12)
            if (r13 != r0) goto Lb0
        Lac:
            return r0
        Lad:
            int r6 = r6 + 1
            goto L80
        Lb0:
            kotlin.Unit r13 = p002kotlin.Unit.f29295attabal
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.oj1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
