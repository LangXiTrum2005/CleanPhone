package com.charging.screenshow.battery.animations.themes.fragment;

import com.charging.screenshow.battery.animations.themes.databinding.FragHomeBinding;
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
@DebugMetadata(c = "com.charging.screenshow.battery.animations.themes.fragment.HomeFrag$initDatas$4", f = "HomeFrag.kt", l = {103}, m = "invokeSuspend")
final class HomeFrag$initDatas$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ HomeFrag f13259Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFrag$initDatas$4(HomeFrag homeFrag, Continuation continuation) {
        super(2, continuation);
        this.f13259Y = homeFrag;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeFrag$initDatas$4(this.f13259Y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeFrag$initDatas$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
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
        final HomeFrag homeFrag = this.f13259Y;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.charging.screenshow.battery.animations.themes.fragment.HomeFrag$initDatas$4.1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj2, Continuation continuation) {
                BatteryInfo batteryInfo = (BatteryInfo) obj2;
                HomeFrag homeFrag2 = homeFrag;
                FragHomeBinding fragHomeBinding = homeFrag2.Z;
                if (fragHomeBinding == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                fragHomeBinding.g.setText(String.valueOf(batteryInfo.getStatus()));
                FragHomeBinding fragHomeBinding2 = homeFrag2.Z;
                if (fragHomeBinding2 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                fragHomeBinding2.f13182i.setText(String.valueOf(batteryInfo.getEstimatedTimeText()));
                FragHomeBinding fragHomeBinding3 = homeFrag2.Z;
                if (fragHomeBinding3 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(batteryInfo.getLevel());
                sb.append('%');
                fragHomeBinding3.f.setText(sb.toString());
                FragHomeBinding fragHomeBinding4 = homeFrag2.Z;
                if (fragHomeBinding4 != null) {
                    TextViewExt.a(fragHomeBinding4.f);
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
