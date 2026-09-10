package com.codejoy.boom.clap.module.splash;

import androidx.p001lifecycle.arytenoidectomy;
import androidx.p001lifecycle.marial;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.splinterproof;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HotActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.module.splash.HotActivity$checkAd$1", f = "HotActivity.kt", l = {55}, m = "invokeSuspend", v = 1)
public final class HotActivity$checkAd$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    int label;
    final /* synthetic */ HotActivity this$0;

    /* JADX INFO: compiled from: HotActivity.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/codejoy/boom/clap/module/splash/HotActivity$checkAd$1$attabal", "Landroidx/lifecycle/marial;", "Landroidx/lifecycle/arytenoidectomy;", "owner", "", "monoploid", "(Landroidx/lifecycle/arytenoidectomy;)V", "dovishness", "onDestroy", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal implements marial {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ HotActivity f18496kowloon;

        public attabal(HotActivity hotActivity) {
            this.f18496kowloon = hotActivity;
        }

        @Override // androidx.p001lifecycle.marial
        public /* bridge */ void dern(arytenoidectomy arytenoidectomyVar) {
            super.dern(arytenoidectomyVar);
        }

        @Override // androidx.p001lifecycle.marial
        public void dovishness(arytenoidectomy owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            super.dovishness(owner);
            this.f18496kowloon.itchy();
        }

        @Override // androidx.p001lifecycle.marial
        public void monoploid(arytenoidectomy owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            super.monoploid(owner);
            this.f18496kowloon.coffeecake();
        }

        @Override // androidx.p001lifecycle.marial
        public void onDestroy(arytenoidectomy owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            super.onDestroy(owner);
            this.f18496kowloon.itchy();
        }

        @Override // androidx.p001lifecycle.marial
        public /* bridge */ void onStart(arytenoidectomy arytenoidectomyVar) {
            super.onStart(arytenoidectomyVar);
        }

        @Override // androidx.p001lifecycle.marial
        public /* bridge */ void onStop(arytenoidectomy arytenoidectomyVar) {
            super.onStop(arytenoidectomyVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotActivity$checkAd$1(HotActivity hotActivity, wretchedly.dern<? super HotActivity$checkAd$1> dernVar) {
        super(2, dernVar);
        this.this$0 = hotActivity;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new HotActivity$checkAd$1(this.this$0, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            this.label = 1;
            if (splinterproof.attabal(2000L, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        this.this$0.coffeecake();
        this.this$0.getLifecycle().attabal(new attabal(this.this$0));
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((HotActivity$checkAd$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
