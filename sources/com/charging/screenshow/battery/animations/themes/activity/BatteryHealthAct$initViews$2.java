package com.charging.screenshow.battery.animations.themes.activity;

import com.charging.screenshow.battery.animations.themes.databinding.ActBatteryHealthBinding;
import com.charging.screenshow.battery.animations.themes.entity.BatteryInfo;
import com.charging.screenshow.battery.animations.themes.manager.BatteryManager;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.TextViewExt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.charging.screenshow.battery.animations.themes.activity.BatteryHealthAct$initViews$2", f = "BatteryHealthAct.kt", l = {53}, m = "invokeSuspend")
final class BatteryHealthAct$initViews$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ BatteryHealthAct f13029Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryHealthAct$initViews$2(BatteryHealthAct batteryHealthAct, Continuation continuation) {
        super(2, continuation);
        this.f13029Y = batteryHealthAct;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BatteryHealthAct$initViews$2(this.f13029Y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BatteryHealthAct$initViews$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StateFlow stateFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            throw new KotlinNothingValueException();
        }
        ResultKt.b(obj);
        BatteryManager batteryManager = AppExt.a().Z;
        if (batteryManager == null || (stateFlow = batteryManager.f13276c) == null) {
            return Unit.f43263a;
        }
        final BatteryHealthAct batteryHealthAct = this.f13029Y;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.charging.screenshow.battery.animations.themes.activity.BatteryHealthAct$initViews$2.1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj2, Continuation continuation) {
                BatteryInfo batteryInfo = (BatteryInfo) obj2;
                BatteryHealthAct batteryHealthAct2 = batteryHealthAct;
                ActBatteryHealthBinding actBatteryHealthBinding = batteryHealthAct2.h0;
                if (actBatteryHealthBinding == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                actBatteryHealthBinding.f.setText(String.valueOf(batteryInfo.getHealth()));
                ActBatteryHealthBinding actBatteryHealthBinding2 = batteryHealthAct2.h0;
                if (actBatteryHealthBinding2 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                actBatteryHealthBinding2.f13090h.setText(batteryInfo.getTemperature() + "°C");
                ActBatteryHealthBinding actBatteryHealthBinding3 = batteryHealthAct2.h0;
                if (actBatteryHealthBinding3 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(batteryInfo.getVoltage());
                sb.append('V');
                actBatteryHealthBinding3.k.setText(sb.toString());
                ActBatteryHealthBinding actBatteryHealthBinding4 = batteryHealthAct2.h0;
                if (actBatteryHealthBinding4 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                actBatteryHealthBinding4.j.setText(String.valueOf(batteryInfo.getChargeType()));
                ActBatteryHealthBinding actBatteryHealthBinding5 = batteryHealthAct2.h0;
                if (actBatteryHealthBinding5 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                actBatteryHealthBinding5.f13091i.setText(String.valueOf(batteryInfo.getEstimatedTimeText()));
                ActBatteryHealthBinding actBatteryHealthBinding6 = batteryHealthAct2.h0;
                if (actBatteryHealthBinding6 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                actBatteryHealthBinding6.f13089e.setText(batteryInfo.getCapacity() + "mAh");
                ActBatteryHealthBinding actBatteryHealthBinding7 = batteryHealthAct2.h0;
                if (actBatteryHealthBinding7 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(batteryInfo.getLevel());
                sb2.append('%');
                actBatteryHealthBinding7.g.setText(sb2.toString());
                ActBatteryHealthBinding actBatteryHealthBinding8 = batteryHealthAct2.h0;
                if (actBatteryHealthBinding8 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                TextViewExt.a(actBatteryHealthBinding8.g);
                ActBatteryHealthBinding actBatteryHealthBinding9 = batteryHealthAct2.h0;
                if (actBatteryHealthBinding9 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                actBatteryHealthBinding9.f13088c.setProgress(batteryInfo.getLevel(), true);
                ActBatteryHealthBinding actBatteryHealthBinding10 = batteryHealthAct2.h0;
                if (actBatteryHealthBinding10 != null) {
                    actBatteryHealthBinding10.f13092l.setProgressValue(batteryInfo.getLevel());
                    return Unit.f43263a;
                }
                Intrinsics.m("binding");
                throw null;
            }
        };
        this.X = 1;
        stateFlow.collect(flowCollector, this);
        return coroutineSingletons;
    }
}
