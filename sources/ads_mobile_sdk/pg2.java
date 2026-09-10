package ads_mobile_sdk;

import android.net.Uri;
import java.util.Map;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class pg2 extends SuspendLambda implements Function2 {
    public long a;
    public int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ os1 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ qg2 f;
    public final /* synthetic */ Uri g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Map i;
    public final /* synthetic */ e2 j;
    public final /* synthetic */ h1 k;
    public final /* synthetic */ Boolean l;
    public final /* synthetic */ l13 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg2(int i, long j, Uri uri, h1 h1Var, e2 e2Var, os1 os1Var, l13 l13Var, qg2 qg2Var, Boolean bool, String str, Map map, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.c = i;
        this.d = os1Var;
        this.e = j;
        this.f = qg2Var;
        this.g = uri;
        this.h = str;
        this.i = map;
        this.j = e2Var;
        this.k = h1Var;
        this.l = bool;
        this.m = l13Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        int i = this.c;
        os1 os1Var = this.d;
        long j = this.e;
        qg2 qg2Var = this.f;
        Uri uri = this.g;
        String str = this.h;
        Map map = this.i;
        e2 e2Var = this.j;
        return new pg2(i, j, uri, this.k, e2Var, os1Var, this.m, qg2Var, this.l, str, map, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pg2) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (r0.a(r3, r2, r7, r4, r6, r7, r8, r9, r10, r11, r15) == r13) goto L20;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            java.lang.Object r13 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r0 = r15.b
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L21
            if (r0 == r2) goto L1a
            if (r0 != r1) goto L12
            p002kotlin.dern.saneness(r16)
            goto L71
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1a:
            long r3 = r15.a
            p002kotlin.dern.saneness(r16)
        L1f:
            r4 = r3
            goto L4a
        L21:
            p002kotlin.dern.saneness(r16)
            int r0 = r15.c
            if (r0 != r2) goto L35
            kotlin.time.saneness$attabal r0 = p002kotlin.time.saneness.INSTANCE
            ads_mobile_sdk.os1 r0 = r15.d
            int r0 = r0.b
            kotlin.time.DurationUnit r3 = p002kotlin.time.DurationUnit.MILLISECONDS
            long r3 = p002kotlin.time.dern.molybdenite(r0, r3)
            goto L3f
        L35:
            long r3 = r15.e
            ads_mobile_sdk.os1 r0 = r15.d
            double r5 = r0.d
            long r3 = p002kotlin.time.saneness.seminary(r3, r5)
        L3f:
            r15.a = r3
            r15.b = r2
            java.lang.Object r0 = kotlinx.coroutines.splinterproof.saneness(r3, r15)
            if (r0 != r13) goto L1f
            goto L70
        L4a:
            ads_mobile_sdk.qg2 r0 = r15.f
            android.net.Uri r3 = r15.g
            r6 = r2
            ads_mobile_sdk.os1 r2 = r15.d
            int r7 = r15.c
            int r7 = r7 + r6
            java.lang.String r6 = r15.h
            r8 = r3
            r3 = r7
            java.util.Map r7 = r15.i
            r9 = r8
            ads_mobile_sdk.e2 r8 = r15.j
            r10 = r9
            ads_mobile_sdk.h1 r9 = r15.k
            r11 = r10
            java.lang.Boolean r10 = r15.l
            r14 = r11
            ads_mobile_sdk.l13 r11 = r15.m
            r15.b = r1
            r12 = r15
            r1 = r14
            java.lang.Object r0 = r0.a(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            if (r0 != r13) goto L71
        L70:
            return r13
        L71:
            kotlin.Unit r0 = p002kotlin.Unit.f29295attabal
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pg2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
