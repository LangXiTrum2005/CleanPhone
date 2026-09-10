package com.google.android.gms.internal.ads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
final class zzfyz extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzfza zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfyz(zzfza zzfzaVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzfzaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzfyz(this.zzb, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfyz) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.zza;
        ResultKt.b(obj);
        if (i2 == 0) {
            zzfza zzfzaVar = this.zzb;
            this.zza = 1;
            if (zzfzaVar.zzk(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f43263a;
    }
}
