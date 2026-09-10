package com.codejoy.boom.clap.fcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FcmTopicUpdateReceiver.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/codejoy/boom/clap/fcm/FcmTopicUpdateReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FcmTopicUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int f18230saneness = 8;

    /* JADX INFO: renamed from: com.codejoy.boom.clap.fcm.FcmTopicUpdateReceiver$onReceive$1, reason: invalid class name */
    /* JADX INFO: compiled from: FcmTopicUpdateReceiver.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
    @igo.wireman(c = "com.codejoy.boom.clap.fcm.FcmTopicUpdateReceiver$onReceive$1", f = "FcmTopicUpdateReceiver.kt", l = {24}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BroadcastReceiver.PendingResult pendingResult, Context context, wretchedly.dern<? super AnonymousClass1> dernVar) {
            super(2, dernVar);
            this.$pendingResult = pendingResult;
            this.$context = context;
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
            return new AnonymousClass1(this.$pendingResult, this.$context, dernVar);
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
                        this.$pendingResult.finish();
                        throw th;
                    }
                } else {
                    p002kotlin.dern.saneness(obj);
                    FcmTopicUpdateReceiver$onReceive$1$completed$1 fcmTopicUpdateReceiver$onReceive$1$completed$1 = new FcmTopicUpdateReceiver$onReceive$1$completed$1(this.$context, null);
                    this.label = 1;
                    obj = TimeoutKt.marial(9000L, fcmTopicUpdateReceiver$onReceive$1$completed$1, this);
                    if (obj == objBeachfront) {
                        return objBeachfront;
                    }
                }
                Boolean bool = (Boolean) obj;
                if (bool != null ? bool.booleanValue() : false) {
                    com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "覆盖安装主题刷新结束");
                } else {
                    com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "覆盖安装主题刷新超时");
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th2) {
                com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "覆盖安装主题刷新失败：" + th2.getMessage());
            }
            this.$pendingResult.finish();
            return Unit.f29295attabal;
        }

        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
            return ((AnonymousClass1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.wireman(intent.getAction(), "android.intent.action.MY_PACKAGE_REPLACED")) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "收到覆盖安装广播，开始刷新主题");
            kotlinx.coroutines.cutely.wireman(privatdozent.attabal(premeiotic.saneness()), null, null, new AnonymousClass1(goAsync(), context, null), 3, null);
        }
    }
}
