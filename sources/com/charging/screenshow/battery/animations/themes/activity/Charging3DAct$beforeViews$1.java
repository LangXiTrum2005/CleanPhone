package com.charging.screenshow.battery.animations.themes.activity;

import com.charging.screenshow.battery.animations.themes.adapter.Charging3DPagerAdapter;
import com.charging.screenshow.battery.animations.themes.databinding.ActThreeDBinding;
import com.charging.screenshow.battery.animations.themes.entity.BaseMedia;
import com.charging.screenshow.battery.animations.themes.entity.Charging3D;
import com.charging.screenshow.battery.animations.themes.entity.ChargingCategoryBean;
import com.thinkup.core.common.n.mo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.charging.screenshow.battery.animations.themes.activity.Charging3DAct$beforeViews$1", f = "Charging3DAct.kt", l = {mo.oom.mo0}, m = "invokeSuspend")
final class Charging3DAct$beforeViews$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Charging3DAct f13030Y;
    public final /* synthetic */ ChargingCategoryBean Z;

    /* JADX INFO: renamed from: com.charging.screenshow.battery.animations.themes.activity.Charging3DAct$beforeViews$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.charging.screenshow.battery.animations.themes.activity.Charging3DAct$beforeViews$1$1", f = "Charging3DAct.kt", l = {}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Charging3DAct X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ ChargingCategoryBean f13031Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Charging3DAct charging3DAct, ChargingCategoryBean chargingCategoryBean, Continuation continuation) {
            super(2, continuation);
            this.X = charging3DAct;
            this.f13031Y = chargingCategoryBean;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.X, this.f13031Y, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f43263a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            ResultKt.b(obj);
            int i2 = this.f13031Y.get_position();
            Charging3DAct charging3DAct = this.X;
            charging3DAct.l0 = i2;
            charging3DAct.j0 = (Charging3D) charging3DAct.i0.get(i2);
            ActThreeDBinding actThreeDBinding = charging3DAct.h0;
            if (actThreeDBinding == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actThreeDBinding.f13154n.d(charging3DAct.l0, false);
            Charging3DPagerAdapter charging3DPagerAdapter = charging3DAct.k0;
            if (charging3DPagerAdapter != null) {
                charging3DPagerAdapter.notifyDataSetChanged();
            }
            return Unit.f43263a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Charging3DAct$beforeViews$1(Charging3DAct charging3DAct, ChargingCategoryBean chargingCategoryBean, Continuation continuation) {
        super(2, continuation);
        this.f13030Y = charging3DAct;
        this.Z = chargingCategoryBean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Charging3DAct$beforeViews$1(this.f13030Y, this.Z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Charging3DAct$beforeViews$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        if (i2 == 0) {
            ResultKt.b(obj);
            Charging3DAct charging3DAct = this.f13030Y;
            charging3DAct.i0.clear();
            ChargingCategoryBean chargingCategoryBean = this.Z;
            for (BaseMedia baseMedia : chargingCategoryBean.get_list()) {
                if (baseMedia instanceof Charging3D) {
                    charging3DAct.i0.add(baseMedia);
                }
            }
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.f45042a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(charging3DAct, chargingCategoryBean, null);
            this.X = 1;
            if (BuildersKt.f(mainCoroutineDispatcher, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f43263a;
    }
}
