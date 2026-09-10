package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zs extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ bt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs(bt btVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = btVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new zs(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new zs(this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (ads_mobile_sdk.v8.a(r2, r18) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010b, code lost:
    
        if (kotlinx.coroutines.TimeoutKt.wireman(r3, r5, r18) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011b, code lost:
    
        if (ads_mobile_sdk.v8.a(r2, r18) == r1) goto L38;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zs.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
