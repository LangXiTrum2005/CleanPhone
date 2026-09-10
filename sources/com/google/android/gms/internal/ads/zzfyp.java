package com.google.android.gms.internal.ads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
final class zzfyp extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzfza zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfyp(zzfza zzfzaVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzfzaVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzfyp(this.zzb, this.zzc, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfyp) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.zza;
        ResultKt.b(obj);
        if (i2 == 0) {
            zzfza zzfzaVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            if (zzfzaVar.zzi(str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f43263a;
    }
}
