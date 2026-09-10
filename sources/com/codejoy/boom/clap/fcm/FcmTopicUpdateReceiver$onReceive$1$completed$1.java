package com.codejoy.boom.clap.fcm;

import android.content.Context;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FcmTopicUpdateReceiver.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)Z"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.fcm.FcmTopicUpdateReceiver$onReceive$1$completed$1", f = "FcmTopicUpdateReceiver.kt", l = {26}, m = "invokeSuspend", v = 1)
public final class FcmTopicUpdateReceiver$onReceive$1$completed$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Boolean>, Object> {
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FcmTopicUpdateReceiver$onReceive$1$completed$1(Context context, wretchedly.dern<? super FcmTopicUpdateReceiver$onReceive$1$completed$1> dernVar) {
        super(2, dernVar);
        this.$context = context;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new FcmTopicUpdateReceiver$onReceive$1$completed$1(this.$context, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            if (iiion.beachfront.formularize(this.$context).isEmpty()) {
                iiion.beachfront.polloi(this.$context);
            }
            FcmActionHelper fcmActionHelper = FcmActionHelper.f18220attabal;
            this.label = 1;
            if (fcmActionHelper.triweekly(this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return igo.attabal.attabal(true);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Boolean> dernVar) {
        return ((FcmTopicUpdateReceiver$onReceive$1$completed$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
