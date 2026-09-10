package ads_mobile_sdk;

import complexometry.formularize;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lj2 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ pj2 b;
    public final /* synthetic */ formularize c;
    public final /* synthetic */ String d;
    public final /* synthetic */ liquory.attabal e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj2(pj2 pj2Var, formularize formularizeVar, String str, liquory.attabal attabalVar, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.b = pj2Var;
        this.c = formularizeVar;
        this.d = str;
        this.e = attabalVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new lj2(this.b, this.c, this.d, this.e, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((lj2) create((wretchedly.dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
    
        if (kotlinx.coroutines.AwaitKt.dern(r13, r18) == r1) goto L19;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.a
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            p002kotlin.dern.saneness(r19)
            goto La9
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1d:
            p002kotlin.dern.saneness(r19)
            r2 = r19
            goto L3c
        L23:
            p002kotlin.dern.saneness(r19)
            ads_mobile_sdk.pj2 r2 = r0.b
            ads_mobile_sdk.ug r2 = r2.c
            complexometry.formularize r5 = r0.c
            java.lang.String r5 = r5.getAdUnitId()
            java.lang.String r6 = r0.d
            r0.a = r4
            java.lang.Object r2 = r2.a(r5, r6, r0)
            if (r2 != r1) goto L3c
            goto La8
        L3c:
            r9 = r2
            java.util.Map r9 = (java.util.Map) r9
            r2 = 0
            kotlinx.coroutines.cord r4 = kotlinx.coroutines.sakeen.saneness(r2, r4, r2)
            ads_mobile_sdk.pj2 r6 = r0.b
            complexometry.formularize r8 = r0.c
            java.lang.String r10 = r0.d
            liquory.attabal r11 = r0.e
            java.util.ArrayList r13 = new java.util.ArrayList
            int r5 = r9.size()
            r13.<init>(r5)
            java.util.Set r5 = r9.entrySet()
            java.util.Iterator r16 = r5.iterator()
        L5d:
            boolean r5 = r16.hasNext()
            if (r5 == 0) goto L9f
            java.lang.Object r5 = r16.next()
            r7 = r5
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            kotlinx.coroutines.saran r14 = r6.f
            ads_mobile_sdk.kj2 r5 = new ads_mobile_sdk.kj2
            r12 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r7 = r10
            r10 = r5
            r5 = r7
            r7 = r11
            java.lang.String r11 = "<this>"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r11)
            java.lang.String r11 = "context"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r11)
            java.lang.String r11 = "block"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r11)
            r11 = r13
            ads_mobile_sdk.x13 r13 = new ads_mobile_sdk.x13
            r13.<init>(r10, r2)
            r10 = r14
            r14 = 2
            r15 = 0
            r17 = r11
            r11 = r4
            r4 = r17
            kotlinx.coroutines.monroe r10 = kotlinx.coroutines.impromptu.wireman(r10, r11, r12, r13, r14, r15)
            r4.add(r10)
            r13 = r4
            r10 = r5
            r4 = r11
            r11 = r7
            goto L5d
        L9f:
            r4 = r13
            r0.a = r3
            java.lang.Object r2 = kotlinx.coroutines.AwaitKt.dern(r4, r0)
            if (r2 != r1) goto La9
        La8:
            return r1
        La9:
            kotlin.Unit r1 = p002kotlin.Unit.f29295attabal
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lj2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
