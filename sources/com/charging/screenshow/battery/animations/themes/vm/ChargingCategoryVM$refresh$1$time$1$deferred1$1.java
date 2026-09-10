package com.charging.screenshow.battery.animations.themes.vm;

import com.charging.screenshow.battery.animations.themes.entity.BaseMedia;
import com.charging.screenshow.battery.animations.themes.network.entity.ChargingResponse;
import com.charging.screenshow.battery.animations.themes.network.service.ServiceWallpaper;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
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
@DebugMetadata(c = "com.charging.screenshow.battery.animations.themes.vm.ChargingCategoryVM$refresh$1$time$1$deferred1$1", f = "ChargingCategoryVM.kt", l = {Sdk.SDKMetric.SDKMetricType.AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE}, m = "invokeSuspend")
final class ChargingCategoryVM$refresh$1$time$1$deferred1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<BaseMedia>>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ChargingCategoryVM f13347Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargingCategoryVM$refresh$1$time$1$deferred1$1(ChargingCategoryVM chargingCategoryVM, Continuation continuation) {
        super(2, continuation);
        this.f13347Y = chargingCategoryVM;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargingCategoryVM$refresh$1$time$1$deferred1$1(this.f13347Y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargingCategoryVM$refresh$1$time$1$deferred1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChargingResponse chargingResponseBody;
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
        ChargingCategoryVM chargingCategoryVM = this.f13347Y;
        chargingCategoryVM.getClass();
        ArrayList arrayList = new ArrayList();
        try {
            Response<ChargingResponse> responseExecute = new ServiceWallpaper().a().getChargingList2().execute();
            Intrinsics.e(responseExecute, "execute(...)");
            chargingCategoryVM.f.set(false);
            if (responseExecute.isSuccessful() && (chargingResponseBody = responseExecute.body()) != null) {
                arrayList.clear();
                if (!chargingResponseBody.getData().getData().getVideoList().isEmpty()) {
                    arrayList.clear();
                    arrayList.addAll(chargingResponseBody.getData().getData().getVideoList());
                }
            }
        } catch (Exception unused) {
        }
        return arrayList == coroutineSingletons ? coroutineSingletons : arrayList;
    }
}
