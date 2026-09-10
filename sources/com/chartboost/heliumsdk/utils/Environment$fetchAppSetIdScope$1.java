package com.chartboost.heliumsdk.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.utils.Environment", f = "Environment.kt", l = {546}, m = "fetchAppSetIdScope$Helium_release")
public final class Environment$fetchAppSetIdScope$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Environment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Environment$fetchAppSetIdScope$1(Environment environment, Continuation<? super Environment$fetchAppSetIdScope$1> continuation) {
        super(continuation);
        this.this$0 = environment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchAppSetIdScope$Helium_release(this);
    }
}
