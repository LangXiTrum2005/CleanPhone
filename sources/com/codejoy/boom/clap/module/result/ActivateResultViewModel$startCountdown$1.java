package com.codejoy.boom.clap.module.result;

import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ActivateResultViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.module.result.ActivateResultViewModel$startCountdown$1", f = "ActivateResultViewModel.kt", l = {106}, m = "invokeSuspend", v = 1)
public final class ActivateResultViewModel$startCountdown$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    int I$0;
    int label;
    final /* synthetic */ ActivateResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateResultViewModel$startCountdown$1(ActivateResultViewModel activateResultViewModel, wretchedly.dern<? super ActivateResultViewModel$startCountdown$1> dernVar) {
        super(2, dernVar);
        this.this$0 = activateResultViewModel;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new ActivateResultViewModel$startCountdown$1(this.this$0, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x003f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003d -> B:13:0x0040). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            int r1 = r5.I$0
            p002kotlin.dern.saneness(r6)
            goto L40
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            p002kotlin.dern.saneness(r6)
            com.codejoy.boom.clap.module.result.ActivateResultViewModel r6 = r5.this$0
            int r6 = com.codejoy.boom.clap.module.result.ActivateResultViewModel.marial(r6)
            r1 = r6
        L23:
            if (r1 <= 0) goto L43
            com.codejoy.boom.clap.module.result.ActivateResultViewModel r6 = r5.this$0
            kotlinx.coroutines.flow.formularize r6 = com.codejoy.boom.clap.module.result.ActivateResultViewModel.beachfront(r6)
            com.codejoy.boom.clap.module.result.cutely$saneness r3 = new com.codejoy.boom.clap.module.result.cutely$saneness
            r3.<init>(r1)
            r6.setValue(r3)
            r5.I$0 = r1
            r5.label = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r6 = kotlinx.coroutines.splinterproof.attabal(r3, r5)
            if (r6 != r0) goto L40
            return r0
        L40:
            int r1 = r1 + (-1)
            goto L23
        L43:
            com.codejoy.boom.clap.module.result.ActivateResultViewModel r6 = r5.this$0
            com.codejoy.boom.clap.module.result.ActivateResultViewModel.competently(r6)
            kotlin.Unit r6 = p002kotlin.Unit.f29295attabal
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.codejoy.boom.clap.module.result.ActivateResultViewModel$startCountdown$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((ActivateResultViewModel$startCountdown$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
