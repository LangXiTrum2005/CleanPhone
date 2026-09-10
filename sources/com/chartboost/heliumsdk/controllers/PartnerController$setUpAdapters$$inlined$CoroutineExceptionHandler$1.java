package com.chartboost.heliumsdk.controllers;

import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.utils.LogController;
import com.smartdigimkt.x.g;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", g.f39715A, "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PartnerController$setUpAdapters$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    final /* synthetic */ Ref.ObjectRef $setUpError$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerController$setUpAdapters$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key key, Ref.ObjectRef objectRef) {
        super(key);
        this.$setUpError$inlined = objectRef;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext context, Throwable exception) {
        LogController.INSTANCE.e("Failed to set up adapters: " + exception);
        this.$setUpError$inlined.X = ChartboostMediationError.CM_INITIALIZATION_FAILURE_EXCEPTION;
    }
}
