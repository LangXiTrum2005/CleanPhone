package com.codejoy.boom.clap.module.vip;

import ammonoid.VipStatusResponse;
import java.util.Objects;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: VipInfoManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.module.vip.VipInfoManager$updateVipStatusFromServer$1", f = "VipInfoManager.kt", l = {80}, m = "invokeSuspend", v = 1)
public final class VipInfoManager$updateVipStatusFromServer$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $callback;
    final /* synthetic */ int $count;
    int label;
    final /* synthetic */ VipInfoManager this$0;

    /* JADX INFO: renamed from: com.codejoy.boom.clap.module.vip.VipInfoManager$updateVipStatusFromServer$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: VipInfoManager.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/wireman;", "Lammonoid/attabal;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/wireman;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
    @igo.wireman(c = "com.codejoy.boom.clap.module.vip.VipInfoManager$updateVipStatusFromServer$1$1", f = "VipInfoManager.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements tetrahedral.triweekly<kotlinx.coroutines.flow.wireman<? super VipStatusResponse>, Throwable, wretchedly.dern<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $callback;
        final /* synthetic */ int $count;
        int label;
        final /* synthetic */ VipInfoManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VipInfoManager vipInfoManager, int i, Function0<Unit> function0, wretchedly.dern<? super AnonymousClass1> dernVar) {
            super(3, dernVar);
            this.this$0 = vipInfoManager;
            this.$count = i;
            this.$callback = function0;
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            p002kotlin.coroutines.intrinsics.attabal.beachfront();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            this.this$0.job = null;
            this.this$0.molybdenite(this.$count + 1, this.$callback);
            return Unit.f29295attabal;
        }

        @Override // tetrahedral.triweekly
        public final Object invoke(kotlinx.coroutines.flow.wireman<? super VipStatusResponse> wiremanVar, Throwable th, wretchedly.dern<? super Unit> dernVar) {
            return new AnonymousClass1(this.this$0, this.$count, this.$callback, dernVar).invokeSuspend(Unit.f29295attabal);
        }
    }

    /* JADX INFO: compiled from: VipInfoManager.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class attabal<T> implements kotlinx.coroutines.flow.wireman {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f18532arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ VipInfoManager f18533kowloon;

        public attabal(VipInfoManager vipInfoManager, Function0<Unit> function0) {
            this.f18533kowloon = vipInfoManager;
            this.f18532arytenoidectomy = function0;
        }

        @Override // kotlinx.coroutines.flow.wireman
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public final Object emit(VipStatusResponse vipStatusResponse, wretchedly.dern<? super Unit> dernVar) {
            Objects.toString(vipStatusResponse);
            if (vipStatusResponse.getIsVip()) {
                this.f18533kowloon.polloi(true);
            } else {
                this.f18533kowloon.arytenoidectomy();
            }
            this.f18532arytenoidectomy.invoke();
            return Unit.f29295attabal;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipInfoManager$updateVipStatusFromServer$1(VipInfoManager vipInfoManager, int i, Function0<Unit> function0, wretchedly.dern<? super VipInfoManager$updateVipStatusFromServer$1> dernVar) {
        super(2, dernVar);
        this.this$0 = vipInfoManager;
        this.$count = i;
        this.$callback = function0;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new VipInfoManager$updateVipStatusFromServer$1(this.this$0, this.$count, this.$callback, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            kotlinx.coroutines.flow.dern dernVarBeachfront = kotlinx.coroutines.flow.marial.beachfront(spatterdash.dern.Companion.saneness(spatterdash.dern.INSTANCE, null, 1, null).dern(), new AnonymousClass1(this.this$0, this.$count, this.$callback, null));
            attabal attabalVar = new attabal(this.this$0, this.$callback);
            this.label = 1;
            if (dernVarBeachfront.collect(attabalVar, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((VipInfoManager$updateVipStatusFromServer$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
