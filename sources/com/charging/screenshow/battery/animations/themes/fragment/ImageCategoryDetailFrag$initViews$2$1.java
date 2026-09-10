package com.charging.screenshow.battery.animations.themes.fragment;

import com.charging.screenshow.battery.animations.themes.vm.CategoryDetailVM;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.charging.screenshow.battery.animations.themes.fragment.ImageCategoryDetailFrag$initViews$2$1", f = "ImageCategoryDetailFrag.kt", l = {}, m = "invokeSuspend")
final class ImageCategoryDetailFrag$initViews$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ImageCategoryDetailFrag X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageCategoryDetailFrag$initViews$2$1(ImageCategoryDetailFrag imageCategoryDetailFrag, Continuation continuation) {
        super(2, continuation);
        this.X = imageCategoryDetailFrag;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ImageCategoryDetailFrag$initViews$2$1(this.X, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ImageCategoryDetailFrag$initViews$2$1 imageCategoryDetailFrag$initViews$2$1 = (ImageCategoryDetailFrag$initViews$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f43263a;
        imageCategoryDetailFrag$initViews$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ResultKt.b(obj);
        ImageCategoryDetailFrag imageCategoryDetailFrag = this.X;
        CategoryDetailVM.e(imageCategoryDetailFrag.g(), imageCategoryDetailFrag.h0, imageCategoryDetailFrag.i0);
        return Unit.f43263a;
    }
}
