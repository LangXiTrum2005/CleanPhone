package ads_mobile_sdk;

import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class cw1 extends SuspendLambda implements Function2 {
    public kw1 a;
    public int b;
    public final /* synthetic */ kw1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw1(kw1 kw1Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.c = kw1Var;
    }

    public static final void a(kw1 kw1Var, boolean z) {
        saran saranVar = kw1Var.c;
        bw1 block = new bw1(kw1Var, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new cw1(this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new cw1(this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (ads_mobile_sdk.xw1.a(r1, r2, r9) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
    
        if (r10.a(r9) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
    
        if (r10.a(r9) == r0) goto L33;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cw1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
