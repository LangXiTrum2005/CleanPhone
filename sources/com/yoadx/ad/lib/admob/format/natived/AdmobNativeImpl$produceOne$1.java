package com.yoadx.ad.lib.admob.format.natived;

import igo.wireman;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: compiled from: AdmobNativeImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 0, 0})
@wireman(c = "com.yoadx.ad.lib.admob.format.natived.AdmobNativeImpl$produceOne$1", f = "AdmobNativeImpl.kt", l = {128}, m = "invokeSuspend")
public final class AdmobNativeImpl$produceOne$1 extends SuspendLambda implements Function2<saran, dern<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ AdmobNativeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdmobNativeImpl$produceOne$1(AdmobNativeImpl admobNativeImpl, dern<? super AdmobNativeImpl$produceOne$1> dernVar) {
        super(2, dernVar);
        this.this$0 = admobNativeImpl;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern<Unit> create(Object obj, dern<?> dernVar) {
        return new AdmobNativeImpl$produceOne$1(this.this$0, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:13:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x002e A[PHI: r1
  0x002e: PHI (r1v3 java.util.Iterator<com.yoadx.ad.lib.bean.AdUnitConfig>) = 
  (r1v2 java.util.Iterator<com.yoadx.ad.lib.bean.AdUnitConfig>)
  (r1v4 java.util.Iterator<com.yoadx.ad.lib.bean.AdUnitConfig>)
 binds: [B:8:0x001b, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0048 -> B:14:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r5.L$0
            java.util.Iterator r1 = (java.util.Iterator) r1
            p002kotlin.dern.saneness(r6)
            goto L4b
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            p002kotlin.dern.saneness(r6)
            com.yoadx.ad.lib.admob.format.natived.AdmobNativeImpl r6 = r5.this$0
            java.util.concurrent.CopyOnWriteArrayList r6 = r6.impromptu()
            java.util.Iterator r6 = r6.iterator()
            java.lang.String r1 = "iterator(...)"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            r1 = r6
        L2e:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L51
            java.lang.Object r6 = r1.next()
            com.yoadx.ad.lib.bean.AdUnitConfig r6 = (com.yoadx.ad.lib.bean.AdUnitConfig) r6
            com.yoadx.ad.lib.admob.format.natived.AdmobNativeImpl r3 = r5.this$0
            p002kotlin.jvm.internal.Intrinsics.beachfront(r6)
            r5.L$0 = r1
            r5.label = r2
            r4 = 0
            java.lang.Object r6 = com.yoadx.ad.lib.admob.format.natived.AdmobNativeImpl.yemenite(r3, r6, r2, r4, r5)
            if (r6 != r0) goto L4b
            return r0
        L4b:
            com.yoadx.ad.lib.bean.AdState r6 = (com.yoadx.ad.lib.bean.AdState) r6
            com.yoadx.ad.lib.bean.AdState r3 = com.yoadx.ad.lib.bean.AdState.LOADED
            if (r6 != r3) goto L2e
        L51:
            kotlin.Unit r6 = p002kotlin.Unit.f29295attabal
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yoadx.ad.lib.admob.format.natived.AdmobNativeImpl$produceOne$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, dern<? super Unit> dernVar) {
        return ((AdmobNativeImpl$produceOne$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
