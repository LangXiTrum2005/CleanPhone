package com.google.android.play.core.ktx;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.android.play.core.ktx.ReviewManagerKtxKt", f = "ReviewManagerKtx.kt", l = {23}, m = "requestReview")
final class ReviewManagerKtxKt$requestReview$1 extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f19649Y;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.X = obj;
        int i2 = (this.f19649Y | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f19649Y = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        if (i2 == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Intrinsics.c(obj);
        return obj;
    }
}
