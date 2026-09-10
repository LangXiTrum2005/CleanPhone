package com.google.android.gms.internal.ads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
final class zzfyn extends SuspendLambda implements Function2 {
    /* synthetic */ Object zza;
    final /* synthetic */ zzfxs zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfyn(zzfxs zzfxsVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzfxsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzfyn zzfynVar = new zzfyn(this.zzb, continuation);
        zzfynVar.zza = obj;
        return zzfynVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfyn) create((zzfxw) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ResultKt.b(obj);
        zzfxy zzfxyVarZza = zzfxx.zza((zzfxu) ((zzfxw) this.zza).zzcc());
        zzidv zzidvVarZzb = zzfxyVarZza.zzb();
        zzfxs zzfxsVar = this.zzb;
        String strZza = zzfxsVar.zza();
        Intrinsics.e(strZza, "getGwsQueryId(...)");
        zzfxyVarZza.zzc(zzidvVarZzb, strZza, zzfxsVar);
        return zzfxyVarZza.zza();
    }
}
