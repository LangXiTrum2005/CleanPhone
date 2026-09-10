package com.codejoy.boom.clap.fcm;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FcmActionHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.fcm.FcmActionHelper$refreshLanguageTopicSubscription$1", f = "FcmActionHelper.kt", l = {108}, m = "invokeSuspend", v = 1)
public final class FcmActionHelper$refreshLanguageTopicSubscription$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    final /* synthetic */ boolean $isForceRefreshTopic;
    final /* synthetic */ Function0<Unit> $onComplete;
    final /* synthetic */ String $trigger;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FcmActionHelper$refreshLanguageTopicSubscription$1(String str, boolean z, Function0<Unit> function0, wretchedly.dern<? super FcmActionHelper$refreshLanguageTopicSubscription$1> dernVar) {
        super(2, dernVar);
        this.$trigger = str;
        this.$isForceRefreshTopic = z;
        this.$onComplete = function0;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new FcmActionHelper$refreshLanguageTopicSubscription$1(this.$trigger, this.$isForceRefreshTopic, this.$onComplete, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        try {
            if (i != 0) {
                try {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p002kotlin.dern.saneness(obj);
                } catch (Throwable th) {
                    this.$onComplete.invoke();
                    throw th;
                }
            } else {
                p002kotlin.dern.saneness(obj);
                FcmActionHelper fcmActionHelper = FcmActionHelper.f18220attabal;
                String str = this.$trigger;
                boolean z = this.$isForceRefreshTopic;
                this.label = 1;
                if (fcmActionHelper.taiyuan(str, z, this) == objBeachfront) {
                    return objBeachfront;
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th2) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "刷新主题失败：来源=" + this.$trigger + "，原因=" + th2.getMessage());
        }
        this.$onComplete.invoke();
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((FcmActionHelper$refreshLanguageTopicSubscription$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
