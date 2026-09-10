package com.chartboost.heliumsdk.utils;

import android.content.Context;
import com.chartboost.heliumsdk.HeliumSdk;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.utils.Environment$fetchAppSetId$2", f = "Environment.kt", l = {696, IronSourceError.ERROR_CAPPED_PER_SESSION}, m = "invokeSuspend")
public final class Environment$fetchAppSetId$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;

    public Environment$fetchAppSetId$2(Continuation<? super Environment$fetchAppSetId$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Environment$fetchAppSetId$2(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        Context context;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                mutex = Environment.appSetIdMutex;
                this.L$0 = mutex;
                this.label = 1;
                if (mutex.a(this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) this.L$0;
                try {
                    ResultKt.b(obj);
                    mutex = mutex2;
                    mutex.b(null);
                    return Unit.f43263a;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.b(null);
                    throw th;
                }
            }
            Mutex mutex3 = (Mutex) this.L$0;
            ResultKt.b(obj);
            mutex = mutex3;
            if (Environment._appSetId == null && (context = HeliumSdk.INSTANCE.getContext()) != null) {
                Environment environment = Environment.INSTANCE;
                this.L$0 = mutex;
                this.label = 2;
                if (environment.updateAppSetIdAndScope(context, this) != coroutineSingletons) {
                    mutex2 = mutex;
                    mutex = mutex2;
                }
                return coroutineSingletons;
            }
            mutex.b(null);
            return Unit.f43263a;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.b(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Environment$fetchAppSetId$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
