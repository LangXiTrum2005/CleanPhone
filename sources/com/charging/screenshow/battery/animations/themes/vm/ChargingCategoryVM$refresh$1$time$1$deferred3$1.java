package com.charging.screenshow.battery.animations.themes.vm;

import com.charging.screenshow.battery.animations.themes.entity.BaseMedia;
import com.charging.screenshow.battery.animations.themes.network.entity.ChargingResponseKt;
import com.charging.screenshow.battery.animations.themes.network.entity.Live;
import com.charging.screenshow.battery.animations.themes.network.entity.LiveResponse;
import com.charging.screenshow.battery.animations.themes.network.service.ServiceWallpaper;
import com.thinkup.core.common.n.mo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/charging/screenshow/battery/animations/themes/entity/BaseMedia;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.charging.screenshow.battery.animations.themes.vm.ChargingCategoryVM$refresh$1$time$1$deferred3$1", f = "ChargingCategoryVM.kt", l = {mo.oom.onn}, m = "invokeSuspend")
final class ChargingCategoryVM$refresh$1$time$1$deferred3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<BaseMedia>>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ChargingCategoryVM f13349Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargingCategoryVM$refresh$1$time$1$deferred3$1(ChargingCategoryVM chargingCategoryVM, Continuation continuation) {
        super(2, continuation);
        this.f13349Y = chargingCategoryVM;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargingCategoryVM$refresh$1$time$1$deferred3$1(this.f13349Y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargingCategoryVM$refresh$1$time$1$deferred3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LiveResponse liveResponseBody;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        this.X = 1;
        this.f13349Y.getClass();
        ArrayList arrayList = new ArrayList();
        try {
            Response<LiveResponse> responseExecute = new ServiceWallpaper().a().getLive2("favorites", 0, 0).execute();
            Intrinsics.e(responseExecute, "execute(...)");
            if (responseExecute.isSuccessful() && (liveResponseBody = responseExecute.body()) != null) {
                arrayList.clear();
                Iterator it = liveResponseBody.getImages().iterator();
                while (it.hasNext()) {
                    arrayList.add(ChargingResponseKt.b((Live) it.next()));
                }
            }
        } catch (Exception unused) {
        }
        return arrayList == coroutineSingletons ? coroutineSingletons : arrayList;
    }
}
