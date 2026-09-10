package com.google.android.gms.internal.ads;

import androidx.datastore.core.DataStore;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfza implements zzfxt {
    private final CoroutineScope zza;
    private final Mutex zzb;
    private final Mutex zzc;
    private final Mutex zzd;
    private boolean zze;
    private zzfxr zzf;
    private boolean zzg;
    private final DataStore zzh;
    private final zzduo zzi;

    public zzfza(DataStore adQualityDataStore, zzfzc coroutineScopeProvider, zzduo dataPinger, zzfyc clock) {
        Intrinsics.f(adQualityDataStore, "adQualityDataStore");
        Intrinsics.f(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.f(dataPinger, "dataPinger");
        Intrinsics.f(clock, "clock");
        this.zzi = dataPinger;
        this.zza = coroutineScopeProvider.zza();
        this.zzb = MutexKt.a();
        this.zzc = MutexKt.a();
        this.zzd = MutexKt.a();
        this.zzh = adQualityDataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzs(String str, Continuation continuation) throws Throwable {
        zzfyf zzfyfVar;
        Mutex mutex;
        Throwable th;
        Mutex mutex2;
        if (continuation instanceof zzfyf) {
            zzfyfVar = (zzfyf) continuation;
            int i2 = zzfyfVar.zze;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfyfVar.zze = i2 - Integer.MIN_VALUE;
            } else {
                zzfyfVar = new zzfyf(this, continuation);
            }
        } else {
            zzfyfVar = new zzfyf(this, continuation);
        }
        Object obj = zzfyfVar.zzc;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = zzfyfVar.zze;
        try {
            if (i3 == 0) {
                ResultKt.b(obj);
                mutex = this.zzd;
                zzfyfVar.zza = str;
                zzfyfVar.zzb = mutex;
                zzfyfVar.zze = 1;
                if (mutex.a(zzfyfVar) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) zzfyfVar.zza;
                try {
                    ResultKt.b(obj);
                    mutex2.b(null);
                    return Unit.f43263a;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.b(null);
                    throw th;
                }
            }
            Mutex mutex3 = (Mutex) zzfyfVar.zzb;
            String str2 = (String) zzfyfVar.zza;
            ResultKt.b(obj);
            mutex = mutex3;
            str = str2;
            DataStore dataStore = this.zzh;
            zzfyg zzfygVar = new zzfyg(str, null);
            zzfyfVar.zza = mutex;
            zzfyfVar.zzb = null;
            zzfyfVar.zze = 2;
            Object objA = dataStore.a(zzfygVar, zzfyfVar);
            if (objA != coroutineSingletons) {
                Mutex mutex4 = mutex;
                obj = objA;
                mutex2 = mutex4;
                mutex2.b(null);
                return Unit.f43263a;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            Mutex mutex5 = mutex;
            th = th3;
            mutex2 = mutex5;
            mutex2.b(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzt(Continuation continuation) throws Throwable {
        zzfyi zzfyiVar;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        if (continuation instanceof zzfyi) {
            zzfyiVar = (zzfyi) continuation;
            int i2 = zzfyiVar.zzd;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfyiVar.zzd = i2 - Integer.MIN_VALUE;
            } else {
                zzfyiVar = new zzfyi(this, continuation);
            }
        } else {
            zzfyiVar = new zzfyi(this, continuation);
        }
        Object obj = zzfyiVar.zzb;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = zzfyiVar.zzd;
        try {
            if (i3 == 0) {
                ResultKt.b(obj);
                mutex = this.zzd;
                zzfyiVar.zza = mutex;
                zzfyiVar.zzd = 1;
                if (mutex.a(zzfyiVar) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) zzfyiVar.zza;
                try {
                    ResultKt.b(obj);
                    mutex2.b(null);
                    return Unit.f43263a;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.b(null);
                    throw th;
                }
            }
            Mutex mutex3 = (Mutex) zzfyiVar.zza;
            ResultKt.b(obj);
            mutex = mutex3;
            DataStore dataStore = this.zzh;
            zzfyj zzfyjVar = new zzfyj(null);
            zzfyiVar.zza = mutex;
            zzfyiVar.zzd = 2;
            Object objA = dataStore.a(zzfyjVar, zzfyiVar);
            if (objA != coroutineSingletons) {
                mutex2 = mutex;
                obj = objA;
                mutex2.b(null);
                return Unit.f43263a;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.b(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzu(long j, Continuation continuation) {
        zzfyh zzfyhVar;
        Mutex mutex;
        if (continuation instanceof zzfyh) {
            zzfyhVar = (zzfyh) continuation;
            int i2 = zzfyhVar.zze;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfyhVar.zze = i2 - Integer.MIN_VALUE;
            } else {
                zzfyhVar = new zzfyh(this, continuation);
            }
        } else {
            zzfyhVar = new zzfyh(this, continuation);
        }
        Object obj = zzfyhVar.zzc;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = zzfyhVar.zze;
        if (i3 == 0) {
            ResultKt.b(obj);
            Mutex mutex2 = this.zzb;
            zzfyhVar.zzb = mutex2;
            zzfyhVar.zza = j;
            zzfyhVar.zze = 1;
            if (mutex2.a(zzfyhVar) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutex = mutex2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = zzfyhVar.zza;
            mutex = (Mutex) zzfyhVar.zzb;
            ResultKt.b(obj);
        }
        try {
            zzfxr zzfxrVar = this.zzf;
            if (zzfxrVar == null) {
                Intrinsics.m("adQualityDataBuilder");
                throw null;
            }
            long jZzi = j - zzfxrVar.zzi();
            zzfxr zzfxrVar2 = this.zzf;
            if (zzfxrVar2 == null) {
                Intrinsics.m("adQualityDataBuilder");
                throw null;
            }
            zzfxrVar.zzb(jZzi - zzfxrVar2.zzg());
            mutex.b(null);
            return Unit.f43263a;
        } catch (Throwable th) {
            mutex.b(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzv(Continuation continuation) throws Throwable {
        zzfym zzfymVar;
        Mutex mutex;
        Mutex mutex2;
        zzfxs zzfxsVar;
        Mutex mutex3;
        if (continuation instanceof zzfym) {
            zzfymVar = (zzfym) continuation;
            int i2 = zzfymVar.zze;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfymVar.zze = i2 - Integer.MIN_VALUE;
            } else {
                zzfymVar = new zzfym(this, continuation);
            }
        } else {
            zzfymVar = new zzfym(this, continuation);
        }
        Object objA = zzfymVar.zzc;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = zzfymVar.zze;
        try {
            if (i3 == 0) {
                ResultKt.b(objA);
                mutex = this.zzb;
                zzfymVar.zza = mutex;
                zzfymVar.zze = 1;
                if (mutex.a(zzfymVar) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex3 = (Mutex) zzfymVar.zza;
                    try {
                        ResultKt.b(objA);
                        mutex3.b(null);
                        return Unit.f43263a;
                    } catch (Throwable th) {
                        th = th;
                        mutex3.b(null);
                        throw th;
                    }
                }
                mutex2 = (Mutex) zzfymVar.zzb;
                zzfxsVar = (zzfxs) zzfymVar.zza;
                ResultKt.b(objA);
                try {
                    DataStore dataStore = this.zzh;
                    zzfyn zzfynVar = new zzfyn(zzfxsVar, null);
                    zzfymVar.zza = mutex2;
                    zzfymVar.zzb = null;
                    zzfymVar.zze = 3;
                    objA = dataStore.a(zzfynVar, zzfymVar);
                    if (objA != coroutineSingletons) {
                        mutex3 = mutex2;
                        mutex3.b(null);
                        return Unit.f43263a;
                    }
                    return coroutineSingletons;
                } catch (Throwable th2) {
                    th = th2;
                    mutex3 = mutex2;
                    mutex3.b(null);
                    throw th;
                }
            }
            mutex = (Mutex) zzfymVar.zza;
            ResultKt.b(objA);
            zzfxr zzfxrVar = this.zzf;
            if (zzfxrVar == null) {
                Intrinsics.m("adQualityDataBuilder");
                throw null;
            }
            zzfxs zzfxsVar2 = (zzfxs) zzfxrVar.zzbu();
            mutex.b(null);
            Intrinsics.c(zzfxsVar2);
            mutex2 = this.zzd;
            zzfymVar.zza = zzfxsVar2;
            zzfymVar.zzb = mutex2;
            zzfymVar.zze = 2;
            if (mutex2.a(zzfymVar) != coroutineSingletons) {
                zzfxsVar = zzfxsVar2;
                DataStore dataStore2 = this.zzh;
                zzfyn zzfynVar2 = new zzfyn(zzfxsVar, null);
                zzfymVar.zza = mutex2;
                zzfymVar.zzb = null;
                zzfymVar.zze = 3;
                objA = dataStore2.a(zzfynVar2, zzfymVar);
                if (objA != coroutineSingletons) {
                    mutex3 = mutex2;
                    mutex3.b(null);
                    return Unit.f43263a;
                }
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            mutex.b(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    private static final boolean zzw(zzfxs zzfxsVar) {
        boolean z2;
        List listZzk = zzfxsVar.zzk();
        Long l2 = listZzk != null ? (Long) CollectionsKt.G(listZzk) : null;
        boolean z3 = zzfxsVar.zzl() > zzfxsVar.zzm() && !zzfxsVar.zzd();
        if (l2 != null) {
            if (zzfxsVar.zzi() - l2.longValue() > 5000) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        return z3 || z2;
    }

    @Override // com.google.android.gms.internal.ads.zzfxt
    public final void zza() {
        BuildersKt.c(this.zza, null, null, new zzfyv(this, null), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfxt
    public final void zzb(String gwsQueryId) {
        Intrinsics.f(gwsQueryId, "gwsQueryId");
        BuildersKt.c(this.zza, null, null, new zzfyp(this, gwsQueryId, null), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfxt
    public final void zzc() {
        BuildersKt.c(this.zza, null, null, new zzfyl(this, null), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfxt
    public final void zzd() {
        BuildersKt.c(this.zza, null, null, new zzfyz(this, null), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfxt
    public final void zze() {
        BuildersKt.c(this.zza, null, null, new zzfyt(this, null), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfxt
    public final void zzf() {
        BuildersKt.c(this.zza, null, null, new zzfyx(this, null), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfxt
    public final void zzg() {
        BuildersKt.c(this.zza, null, null, new zzfyr(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.internal.ads.zzfza] */
    public final Object zzh(Continuation continuation) {
        zzfyu zzfyuVar;
        Mutex mutex;
        zzfxw zzfxwVar;
        zzfxr zzfxrVar;
        Object value;
        if (continuation instanceof zzfyu) {
            zzfyuVar = (zzfyu) continuation;
            int i2 = zzfyuVar.zzd;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfyuVar.zzd = i2 - Integer.MIN_VALUE;
            } else {
                zzfyuVar = new zzfyu(this, continuation);
            }
        } else {
            zzfyuVar = new zzfyu(this, continuation);
        }
        Object objN = zzfyuVar.zzb;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ?? r2 = zzfyuVar.zzd;
        Unit unit = Unit.f43263a;
        try {
            if (r2 == 0) {
                ResultKt.b(objN);
                Mutex mutex2 = this.zzd;
                zzfyuVar.zza = mutex2;
                zzfyuVar.zzd = 1;
                if (mutex2.a(zzfyuVar) != coroutineSingletons) {
                    mutex = mutex2;
                }
                return coroutineSingletons;
            }
            if (r2 == 1) {
                Mutex mutex3 = (Mutex) zzfyuVar.zza;
                ResultKt.b(objN);
                mutex = mutex3;
            } else {
                if (r2 != 2) {
                    if (r2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(objN);
                    return unit;
                }
                Mutex mutex4 = (Mutex) zzfyuVar.zza;
                ResultKt.b(objN);
                r2 = mutex4;
            }
            zzfxwVar = (zzfxw) objN;
            r2.b(null);
            if (zzfxwVar != null && zzfxwVar.zza() != 0) {
                for (Map.Entry entry : zzfxwVar.zzb().entrySet()) {
                    zzial zzialVarZzcc = ((zzfxs) entry.getValue()).zzcc();
                    Intrinsics.e(zzialVarZzcc, "toBuilder(...)");
                    zzfxrVar = (zzfxr) zzialVarZzcc;
                    value = entry.getValue();
                    Intrinsics.e(value, "<get-value>(...)");
                    if (zzw((zzfxs) value)) {
                        zzfxrVar.zzf(true);
                    }
                    zzduo zzduoVar = this.zzi;
                    zziar zziarVarZzbu = zzfxrVar.zzbu();
                    Intrinsics.e(zziarVarZzbu, "build(...)");
                    zzduoVar.zza((zzfxs) zziarVarZzbu);
                }
                zzfyuVar.zza = null;
                zzfyuVar.zzd = 3;
                if (zzt(zzfyuVar) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return unit;
            Flow d = this.zzh.getD();
            zzfyuVar.zza = mutex;
            zzfyuVar.zzd = 2;
            objN = FlowKt.n(d, zzfyuVar);
            r2 = mutex;
            if (objN != coroutineSingletons) {
                zzfxwVar = (zzfxw) objN;
                r2.b(null);
                if (zzfxwVar != null) {
                    while (r10.hasNext()) {
                        zzial zzialVarZzcc2 = ((zzfxs) entry.getValue()).zzcc();
                        Intrinsics.e(zzialVarZzcc2, "toBuilder(...)");
                        zzfxrVar = (zzfxr) zzialVarZzcc2;
                        value = entry.getValue();
                        Intrinsics.e(value, "<get-value>(...)");
                        if (zzw((zzfxs) value)) {
                            zzfxrVar.zzf(true);
                        }
                        zzduo zzduoVar2 = this.zzi;
                        zziar zziarVarZzbu2 = zzfxrVar.zzbu();
                        Intrinsics.e(zziarVarZzbu2, "build(...)");
                        zzduoVar2.zza((zzfxs) zziarVarZzbu2);
                    }
                    zzfyuVar.zza = null;
                    zzfyuVar.zzd = 3;
                    if (zzt(zzfyuVar) == coroutineSingletons) {
                    }
                }
                return unit;
            }
            return coroutineSingletons;
        } catch (Throwable th) {
            r2.b(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzi(String str, Continuation continuation) {
        zzfyo zzfyoVar;
        String str2;
        Mutex mutex;
        long j;
        if (continuation instanceof zzfyo) {
            zzfyoVar = (zzfyo) continuation;
            int i2 = zzfyoVar.zze;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfyoVar.zze = i2 - Integer.MIN_VALUE;
            } else {
                zzfyoVar = new zzfyo(this, continuation);
            }
        } else {
            zzfyoVar = new zzfyo(this, continuation);
        }
        Object obj = zzfyoVar.zzc;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = zzfyoVar.zze;
        if (i3 == 0) {
            ResultKt.b(obj);
            Mutex mutex2 = this.zzb;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzfyoVar.zzf = str;
            zzfyoVar.zza = mutex2;
            zzfyoVar.zzb = jCurrentTimeMillis;
            zzfyoVar.zze = 1;
            if (mutex2.a(zzfyoVar) == coroutineSingletons) {
                return coroutineSingletons;
            }
            str2 = str;
            mutex = mutex2;
            j = jCurrentTimeMillis;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = zzfyoVar.zzb;
            mutex = (Mutex) zzfyoVar.zza;
            str2 = zzfyoVar.zzf;
            ResultKt.b(obj);
        }
        try {
            boolean z2 = this.zze;
            Unit unit = Unit.f43263a;
            if (z2) {
                return unit;
            }
            this.zze = true;
            zzial zzialVarZzcc = zzfxs.zzp().zzcc();
            Intrinsics.e(zzialVarZzcc, "toBuilder(...)");
            zzfxr zzfxrVar = (zzfxr) zzialVarZzcc;
            this.zzf = zzfxrVar;
            zzfxrVar.zza(str2);
            zzfxrVar.zzj(j);
            return unit;
        } finally {
            mutex.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0084 A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #1 {all -> 0x009e, blocks: (B:31:0x0080, B:33:0x0084, B:42:0x00a0, B:43:0x00a5), top: B:52:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0 A[Catch: all -> 0x009e, TRY_ENTER, TryCatch #1 {all -> 0x009e, blocks: (B:31:0x0080, B:33:0x0084, B:42:0x00a0, B:43:0x00a5), top: B:52:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzj(Continuation continuation) {
        zzfyk zzfykVar;
        Mutex mutex;
        Mutex mutex2;
        long j;
        zzfxr zzfxrVar;
        if (continuation instanceof zzfyk) {
            zzfykVar = (zzfyk) continuation;
            int i2 = zzfykVar.zze;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfykVar.zze = i2 - Integer.MIN_VALUE;
            } else {
                zzfykVar = new zzfyk(this, continuation);
            }
        } else {
            zzfykVar = new zzfyk(this, continuation);
        }
        Object obj = zzfykVar.zzc;
        Object obj2 = CoroutineSingletons.X;
        int i3 = zzfykVar.zze;
        Unit unit = Unit.f43263a;
        try {
            if (i3 == 0) {
                ResultKt.b(obj);
                mutex = this.zzc;
                zzfykVar.zza = mutex;
                zzfykVar.zze = 1;
                if (mutex.a(zzfykVar) != obj2) {
                }
                return obj2;
            }
            if (i3 == 1) {
                mutex = (Mutex) zzfykVar.zza;
                ResultKt.b(obj);
            } else {
                if (i3 == 2) {
                    j = zzfykVar.zzb;
                    mutex2 = (Mutex) zzfykVar.zza;
                    ResultKt.b(obj);
                    try {
                        zzfxrVar = this.zzf;
                        if (zzfxrVar != null) {
                            Intrinsics.m("adQualityDataBuilder");
                            throw null;
                        }
                        zzfxrVar.zzo(j);
                        mutex2.b(null);
                        zzfykVar.zza = null;
                        zzfykVar.zze = 3;
                        if (zzu(j, zzfykVar) != obj2) {
                        }
                        return obj2;
                    } catch (Throwable th) {
                        mutex2.b(null);
                        throw th;
                    }
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return unit;
                }
                ResultKt.b(obj);
            }
            zzfykVar.zze = 4;
            if (zzv(zzfykVar) != obj2) {
                return obj2;
            }
            return unit;
            if (this.zzg) {
                mutex.b(null);
                return unit;
            }
            this.zzg = true;
            mutex.b(null);
            mutex2 = this.zzb;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzfykVar.zza = mutex2;
            zzfykVar.zzb = jCurrentTimeMillis;
            zzfykVar.zze = 2;
            if (mutex2.a(zzfykVar) != obj2) {
                j = jCurrentTimeMillis;
                zzfxrVar = this.zzf;
                if (zzfxrVar != null) {
                    Intrinsics.m("adQualityDataBuilder");
                    throw null;
                }
                zzfxrVar.zzo(j);
                mutex2.b(null);
                zzfykVar.zza = null;
                zzfykVar.zze = 3;
                if (zzu(j, zzfykVar) != obj2) {
                    zzfykVar.zze = 4;
                    if (zzv(zzfykVar) != obj2) {
                        return unit;
                    }
                }
            }
            return obj2;
        } catch (Throwable th2) {
            mutex.b(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007a A[Catch: all -> 0x00b8, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0082 A[Catch: all -> 0x00b8, TRY_ENTER, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0086 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00af A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00be A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ca A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f9 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00fd A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0105 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x010c A[Catch: all -> 0x00b8, TRY_ENTER, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0110 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0114 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:27:0x0074, B:30:0x007a, B:33:0x0082, B:35:0x0086, B:37:0x00a2, B:39:0x00ab, B:41:0x00af, B:44:0x00ba, B:45:0x00bd, B:46:0x00be, B:47:0x00c1, B:48:0x00c2, B:49:0x00c5, B:50:0x00c6, B:52:0x00ca, B:54:0x00d0, B:56:0x00d4, B:58:0x00f0, B:59:0x00f9, B:60:0x00fc, B:61:0x00fd, B:62:0x0100, B:63:0x0101, B:65:0x0105, B:68:0x010c, B:69:0x010f, B:70:0x0110, B:71:0x0113, B:72:0x0114, B:73:0x0117), top: B:80:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzk(Continuation continuation) {
        zzfyy zzfyyVar;
        Mutex mutex;
        Mutex mutex2;
        long j;
        zzfxr zzfxrVar;
        zzfxr zzfxrVar2;
        zzfxr zzfxrVar3;
        zzfxr zzfxrVar4;
        long jLongValue;
        zzfxr zzfxrVar5;
        zzfxr zzfxrVar6;
        long jLongValue2;
        zzfxr zzfxrVar7;
        zzfxr zzfxrVar8;
        if (continuation instanceof zzfyy) {
            zzfyyVar = (zzfyy) continuation;
            int i2 = zzfyyVar.zze;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfyyVar.zze = i2 - Integer.MIN_VALUE;
            } else {
                zzfyyVar = new zzfyy(this, continuation);
            }
        } else {
            zzfyyVar = new zzfyy(this, continuation);
        }
        Object obj = zzfyyVar.zzc;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = zzfyyVar.zze;
        Unit unit = Unit.f43263a;
        try {
            if (i3 == 0) {
                ResultKt.b(obj);
                mutex = this.zzc;
                zzfyyVar.zza = mutex;
                zzfyyVar.zze = 1;
                if (mutex.a(zzfyyVar) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i3 == 1) {
                mutex = (Mutex) zzfyyVar.zza;
                ResultKt.b(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = zzfyyVar.zzb;
                mutex2 = (Mutex) zzfyyVar.zza;
                ResultKt.b(obj);
            }
            try {
                zzfxrVar = this.zzf;
                if (zzfxrVar != null) {
                    Intrinsics.m("adQualityDataBuilder");
                    throw null;
                }
                if (zzfxrVar.zzr() > 0) {
                    zzfxrVar6 = this.zzf;
                    if (zzfxrVar6 != null) {
                        Intrinsics.m("adQualityDataBuilder");
                        throw null;
                    }
                    List listZzq = zzfxrVar6.zzq();
                    Intrinsics.e(listZzq, "getAdClickTimestampsMsList(...)");
                    Object objF = CollectionsKt.F(listZzq);
                    Intrinsics.e(objF, "last(...)");
                    jLongValue2 = j - ((Number) objF).longValue();
                    zzfxrVar7 = this.zzf;
                    if (zzfxrVar7 != null) {
                        Intrinsics.m("adQualityDataBuilder");
                        throw null;
                    }
                    zzfxrVar7.zzt();
                    if (jLongValue2 < 5000) {
                        zzfxrVar8 = this.zzf;
                        if (zzfxrVar8 != null) {
                            Intrinsics.m("adQualityDataBuilder");
                            throw null;
                        }
                        zzfxrVar8.zzd(zzfxrVar8.zzc() + 1);
                    }
                }
                zzfxrVar2 = this.zzf;
                if (zzfxrVar2 != null) {
                    Intrinsics.m("adQualityDataBuilder");
                    throw null;
                }
                if (zzfxrVar2.zzn() > 0) {
                    zzfxrVar4 = this.zzf;
                    if (zzfxrVar4 != null) {
                        Intrinsics.m("adQualityDataBuilder");
                        throw null;
                    }
                    List listZzm = zzfxrVar4.zzm();
                    Intrinsics.e(listZzm, "getAppBackgroundTimestampsMsList(...)");
                    Object objF2 = CollectionsKt.F(listZzm);
                    Intrinsics.e(objF2, "last(...)");
                    jLongValue = j - ((Number) objF2).longValue();
                    zzfxrVar5 = this.zzf;
                    if (zzfxrVar5 != null) {
                        Intrinsics.m("adQualityDataBuilder");
                        throw null;
                    }
                    zzfxrVar5.zzh(zzfxrVar5.zzg() + jLongValue);
                }
                zzfxrVar3 = this.zzf;
                if (zzfxrVar3 != null) {
                    Intrinsics.m("adQualityDataBuilder");
                    throw null;
                }
                zzfxrVar3.zzp(j);
                mutex2.b(null);
                return unit;
            } catch (Throwable th) {
                mutex2.b(null);
                throw th;
            }
            if (!this.zzg) {
                mutex.b(null);
                return unit;
            }
            this.zzg = false;
            mutex.b(null);
            Mutex mutex3 = this.zzb;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzfyyVar.zza = mutex3;
            zzfyyVar.zzb = jCurrentTimeMillis;
            zzfyyVar.zze = 2;
            if (mutex3.a(zzfyyVar) != coroutineSingletons) {
                mutex2 = mutex3;
                j = jCurrentTimeMillis;
                zzfxrVar = this.zzf;
                if (zzfxrVar != null) {
                    Intrinsics.m("adQualityDataBuilder");
                    throw null;
                }
                if (zzfxrVar.zzr() > 0) {
                    zzfxrVar6 = this.zzf;
                    if (zzfxrVar6 != null) {
                        Intrinsics.m("adQualityDataBuilder");
                        throw null;
                    }
                    List listZzq2 = zzfxrVar6.zzq();
                    Intrinsics.e(listZzq2, "getAdClickTimestampsMsList(...)");
                    Object objF3 = CollectionsKt.F(listZzq2);
                    Intrinsics.e(objF3, "last(...)");
                    jLongValue2 = j - ((Number) objF3).longValue();
                    zzfxrVar7 = this.zzf;
                    if (zzfxrVar7 != null) {
                        Intrinsics.m("adQualityDataBuilder");
                        throw null;
                    }
                    zzfxrVar7.zzt();
                    if (jLongValue2 < 5000) {
                        zzfxrVar8 = this.zzf;
                        if (zzfxrVar8 != null) {
                            Intrinsics.m("adQualityDataBuilder");
                            throw null;
                        }
                        zzfxrVar8.zzd(zzfxrVar8.zzc() + 1);
                    }
                }
                zzfxrVar2 = this.zzf;
                if (zzfxrVar2 != null) {
                    Intrinsics.m("adQualityDataBuilder");
                    throw null;
                }
                if (zzfxrVar2.zzn() > 0) {
                    zzfxrVar4 = this.zzf;
                    if (zzfxrVar4 != null) {
                        Intrinsics.m("adQualityDataBuilder");
                        throw null;
                    }
                    List listZzm2 = zzfxrVar4.zzm();
                    Intrinsics.e(listZzm2, "getAppBackgroundTimestampsMsList(...)");
                    Object objF4 = CollectionsKt.F(listZzm2);
                    Intrinsics.e(objF4, "last(...)");
                    jLongValue = j - ((Number) objF4).longValue();
                    zzfxrVar5 = this.zzf;
                    if (zzfxrVar5 != null) {
                        Intrinsics.m("adQualityDataBuilder");
                        throw null;
                    }
                    zzfxrVar5.zzh(zzfxrVar5.zzg() + jLongValue);
                }
                zzfxrVar3 = this.zzf;
                if (zzfxrVar3 != null) {
                    Intrinsics.m("adQualityDataBuilder");
                    throw null;
                }
                zzfxrVar3.zzp(j);
                mutex2.b(null);
                return unit;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            mutex.b(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008c A[Catch: all -> 0x00dd, TRY_ENTER, TryCatch #1 {all -> 0x00dd, blocks: (B:32:0x0086, B:35:0x008c, B:37:0x0096, B:39:0x00a2, B:41:0x00a9, B:53:0x00df, B:54:0x00e2, B:55:0x00e3, B:56:0x00e6, B:57:0x00e7, B:58:0x00ea, B:59:0x00eb, B:60:0x00ee), top: B:69:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0096 A[Catch: all -> 0x00dd, TryCatch #1 {all -> 0x00dd, blocks: (B:32:0x0086, B:35:0x008c, B:37:0x0096, B:39:0x00a2, B:41:0x00a9, B:53:0x00df, B:54:0x00e2, B:55:0x00e3, B:56:0x00e6, B:57:0x00e7, B:58:0x00ea, B:59:0x00eb, B:60:0x00ee), top: B:69:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2 A[Catch: all -> 0x00dd, TryCatch #1 {all -> 0x00dd, blocks: (B:32:0x0086, B:35:0x008c, B:37:0x0096, B:39:0x00a2, B:41:0x00a9, B:53:0x00df, B:54:0x00e2, B:55:0x00e3, B:56:0x00e6, B:57:0x00e7, B:58:0x00ea, B:59:0x00eb, B:60:0x00ee), top: B:69:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9 A[Catch: all -> 0x00dd, TRY_LEAVE, TryCatch #1 {all -> 0x00dd, blocks: (B:32:0x0086, B:35:0x008c, B:37:0x0096, B:39:0x00a2, B:41:0x00a9, B:53:0x00df, B:54:0x00e2, B:55:0x00e3, B:56:0x00e6, B:57:0x00e7, B:58:0x00ea, B:59:0x00eb, B:60:0x00ee), top: B:69:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00df A[Catch: all -> 0x00dd, TRY_ENTER, TryCatch #1 {all -> 0x00dd, blocks: (B:32:0x0086, B:35:0x008c, B:37:0x0096, B:39:0x00a2, B:41:0x00a9, B:53:0x00df, B:54:0x00e2, B:55:0x00e3, B:56:0x00e6, B:57:0x00e7, B:58:0x00ea, B:59:0x00eb, B:60:0x00ee), top: B:69:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e3 A[Catch: all -> 0x00dd, TryCatch #1 {all -> 0x00dd, blocks: (B:32:0x0086, B:35:0x008c, B:37:0x0096, B:39:0x00a2, B:41:0x00a9, B:53:0x00df, B:54:0x00e2, B:55:0x00e3, B:56:0x00e6, B:57:0x00e7, B:58:0x00ea, B:59:0x00eb, B:60:0x00ee), top: B:69:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e7 A[Catch: all -> 0x00dd, TryCatch #1 {all -> 0x00dd, blocks: (B:32:0x0086, B:35:0x008c, B:37:0x0096, B:39:0x00a2, B:41:0x00a9, B:53:0x00df, B:54:0x00e2, B:55:0x00e3, B:56:0x00e6, B:57:0x00e7, B:58:0x00ea, B:59:0x00eb, B:60:0x00ee), top: B:69:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb A[Catch: all -> 0x00dd, TryCatch #1 {all -> 0x00dd, blocks: (B:32:0x0086, B:35:0x008c, B:37:0x0096, B:39:0x00a2, B:41:0x00a9, B:53:0x00df, B:54:0x00e2, B:55:0x00e3, B:56:0x00e6, B:57:0x00e7, B:58:0x00ea, B:59:0x00eb, B:60:0x00ee), top: B:69:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzl(Continuation continuation) {
        zzfys zzfysVar;
        Mutex mutex;
        Mutex mutex2;
        long j;
        zzfxr zzfxrVar;
        long jZzi;
        zzfxr zzfxrVar2;
        zzfxr zzfxrVar3;
        zzfxr zzfxrVar4;
        zzfxs zzfxsVar;
        zzfxs zzfxsVar2;
        String strZza;
        if (continuation instanceof zzfys) {
            zzfysVar = (zzfys) continuation;
            int i2 = zzfysVar.zze;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfysVar.zze = i2 - Integer.MIN_VALUE;
            } else {
                zzfysVar = new zzfys(this, continuation);
            }
        } else {
            zzfysVar = new zzfys(this, continuation);
        }
        Object obj = zzfysVar.zzc;
        Object obj2 = CoroutineSingletons.X;
        int i3 = zzfysVar.zze;
        Unit unit = Unit.f43263a;
        try {
            if (i3 == 0) {
                ResultKt.b(obj);
                mutex = this.zzb;
                zzfysVar.zza = mutex;
                zzfysVar.zze = 1;
                if (mutex.a(zzfysVar) != obj2) {
                }
                return obj2;
            }
            if (i3 == 1) {
                mutex = (Mutex) zzfysVar.zza;
                ResultKt.b(obj);
            } else {
                if (i3 == 2) {
                    j = zzfysVar.zzb;
                    mutex2 = (Mutex) zzfysVar.zza;
                    ResultKt.b(obj);
                    try {
                        zzfxrVar = this.zzf;
                        if (zzfxrVar != null) {
                            Intrinsics.m("adQualityDataBuilder");
                            throw null;
                        }
                        jZzi = j - zzfxrVar.zzi();
                        zzfxrVar2 = this.zzf;
                        if (zzfxrVar2 != null) {
                            Intrinsics.m("adQualityDataBuilder");
                            throw null;
                        }
                        zzfxrVar.zzb(jZzi - zzfxrVar2.zzg());
                        zzfxrVar3 = this.zzf;
                        if (zzfxrVar3 != null) {
                            Intrinsics.m("adQualityDataBuilder");
                            throw null;
                        }
                        zzfxrVar3.zzl(j);
                        zzfxrVar4 = this.zzf;
                        if (zzfxrVar4 != null) {
                            Intrinsics.m("adQualityDataBuilder");
                            throw null;
                        }
                        zzfxsVar = (zzfxs) zzfxrVar4.zzbu();
                        mutex2.b(null);
                        Intrinsics.c(zzfxsVar);
                        zzfysVar.zza = zzfxsVar;
                        zzfysVar.zze = 3;
                        if (zzv(zzfysVar) != obj2) {
                            zzfxsVar2 = zzfxsVar;
                        }
                        return obj2;
                    } catch (Throwable th) {
                        mutex2.b(null);
                        throw th;
                    }
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return unit;
                }
                zzfxsVar2 = (zzfxs) zzfysVar.zza;
                ResultKt.b(obj);
            }
            if (this.zzi.zza(zzfxsVar2)) {
                strZza = zzfxsVar2.zza();
                Intrinsics.e(strZza, "getGwsQueryId(...)");
                zzfysVar.zza = null;
                zzfysVar.zze = 4;
                if (zzs(strZza, zzfysVar) == obj2) {
                    return obj2;
                }
            }
            return unit;
            if (!this.zze) {
                mutex.b(null);
                return unit;
            }
            this.zze = false;
            mutex.b(null);
            mutex2 = this.zzb;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzfysVar.zza = mutex2;
            zzfysVar.zzb = jCurrentTimeMillis;
            zzfysVar.zze = 2;
            if (mutex2.a(zzfysVar) != obj2) {
                j = jCurrentTimeMillis;
                zzfxrVar = this.zzf;
                if (zzfxrVar != null) {
                    Intrinsics.m("adQualityDataBuilder");
                    throw null;
                }
                jZzi = j - zzfxrVar.zzi();
                zzfxrVar2 = this.zzf;
                if (zzfxrVar2 != null) {
                    Intrinsics.m("adQualityDataBuilder");
                    throw null;
                }
                zzfxrVar.zzb(jZzi - zzfxrVar2.zzg());
                zzfxrVar3 = this.zzf;
                if (zzfxrVar3 != null) {
                    Intrinsics.m("adQualityDataBuilder");
                    throw null;
                }
                zzfxrVar3.zzl(j);
                zzfxrVar4 = this.zzf;
                if (zzfxrVar4 != null) {
                    Intrinsics.m("adQualityDataBuilder");
                    throw null;
                }
                zzfxsVar = (zzfxs) zzfxrVar4.zzbu();
                mutex2.b(null);
                Intrinsics.c(zzfxsVar);
                zzfysVar.zza = zzfxsVar;
                zzfysVar.zze = 3;
                if (zzv(zzfysVar) != obj2) {
                    zzfxsVar2 = zzfxsVar;
                    if (this.zzi.zza(zzfxsVar2)) {
                        strZza = zzfxsVar2.zza();
                        Intrinsics.e(strZza, "getGwsQueryId(...)");
                        zzfysVar.zza = null;
                        zzfysVar.zze = 4;
                        if (zzs(strZza, zzfysVar) == obj2) {
                        }
                    }
                    return unit;
                }
            }
            return obj2;
        } catch (Throwable th2) {
            mutex.b(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008f A[Catch: all -> 0x00e7, TRY_ENTER, TryCatch #1 {all -> 0x00e7, blocks: (B:31:0x0089, B:34:0x008f, B:36:0x0099, B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:54:0x00e9, B:55:0x00ec, B:56:0x00ed, B:57:0x00f0, B:58:0x00f1, B:59:0x00f4, B:60:0x00f5, B:61:0x00f8, B:62:0x00f9, B:63:0x00fc), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0099 A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:31:0x0089, B:34:0x008f, B:36:0x0099, B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:54:0x00e9, B:55:0x00ec, B:56:0x00ed, B:57:0x00f0, B:58:0x00f1, B:59:0x00f4, B:60:0x00f5, B:61:0x00f8, B:62:0x00f9, B:63:0x00fc), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5 A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:31:0x0089, B:34:0x008f, B:36:0x0099, B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:54:0x00e9, B:55:0x00ec, B:56:0x00ed, B:57:0x00f0, B:58:0x00f1, B:59:0x00f4, B:60:0x00f5, B:61:0x00f8, B:62:0x00f9, B:63:0x00fc), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:31:0x0089, B:34:0x008f, B:36:0x0099, B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:54:0x00e9, B:55:0x00ec, B:56:0x00ed, B:57:0x00f0, B:58:0x00f1, B:59:0x00f4, B:60:0x00f5, B:61:0x00f8, B:62:0x00f9, B:63:0x00fc), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3 A[Catch: all -> 0x00e7, TRY_LEAVE, TryCatch #1 {all -> 0x00e7, blocks: (B:31:0x0089, B:34:0x008f, B:36:0x0099, B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:54:0x00e9, B:55:0x00ec, B:56:0x00ed, B:57:0x00f0, B:58:0x00f1, B:59:0x00f4, B:60:0x00f5, B:61:0x00f8, B:62:0x00f9, B:63:0x00fc), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9 A[Catch: all -> 0x00e7, TRY_ENTER, TryCatch #1 {all -> 0x00e7, blocks: (B:31:0x0089, B:34:0x008f, B:36:0x0099, B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:54:0x00e9, B:55:0x00ec, B:56:0x00ed, B:57:0x00f0, B:58:0x00f1, B:59:0x00f4, B:60:0x00f5, B:61:0x00f8, B:62:0x00f9, B:63:0x00fc), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ed A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:31:0x0089, B:34:0x008f, B:36:0x0099, B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:54:0x00e9, B:55:0x00ec, B:56:0x00ed, B:57:0x00f0, B:58:0x00f1, B:59:0x00f4, B:60:0x00f5, B:61:0x00f8, B:62:0x00f9, B:63:0x00fc), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f1 A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:31:0x0089, B:34:0x008f, B:36:0x0099, B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:54:0x00e9, B:55:0x00ec, B:56:0x00ed, B:57:0x00f0, B:58:0x00f1, B:59:0x00f4, B:60:0x00f5, B:61:0x00f8, B:62:0x00f9, B:63:0x00fc), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f5 A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:31:0x0089, B:34:0x008f, B:36:0x0099, B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:54:0x00e9, B:55:0x00ec, B:56:0x00ed, B:57:0x00f0, B:58:0x00f1, B:59:0x00f4, B:60:0x00f5, B:61:0x00f8, B:62:0x00f9, B:63:0x00fc), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f9 A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:31:0x0089, B:34:0x008f, B:36:0x0099, B:38:0x00a5, B:40:0x00ac, B:42:0x00b3, B:54:0x00e9, B:55:0x00ec, B:56:0x00ed, B:57:0x00f0, B:58:0x00f1, B:59:0x00f4, B:60:0x00f5, B:61:0x00f8, B:62:0x00f9, B:63:0x00fc), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object zzm(Continuation continuation) {
        zzfyw zzfywVar;
        Mutex mutex;
        Mutex mutex2;
        long jCurrentTimeMillis;
        zzfxr zzfxrVar;
        long jZzi;
        zzfxr zzfxrVar2;
        zzfxr zzfxrVar3;
        zzfxr zzfxrVar4;
        zzfxr zzfxrVar5;
        zzfxs zzfxsVar;
        zzfxs zzfxsVar2;
        String strZza;
        if (continuation instanceof zzfyw) {
            zzfywVar = (zzfyw) continuation;
            int i2 = zzfywVar.zze;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfywVar.zze = i2 - Integer.MIN_VALUE;
            } else {
                zzfywVar = new zzfyw(this, continuation);
            }
        } else {
            zzfywVar = new zzfyw(this, continuation);
        }
        Object obj = zzfywVar.zzc;
        Object obj2 = CoroutineSingletons.X;
        int i3 = zzfywVar.zze;
        Unit unit = Unit.f43263a;
        try {
            if (i3 == 0) {
                ResultKt.b(obj);
                mutex = this.zzb;
                zzfywVar.zza = mutex;
                zzfywVar.zze = 1;
                if (mutex.a(zzfywVar) != obj2) {
                }
                return obj2;
            }
            if (i3 == 1) {
                mutex = (Mutex) zzfywVar.zza;
                ResultKt.b(obj);
            } else {
                if (i3 == 2) {
                    jCurrentTimeMillis = zzfywVar.zzb;
                    mutex2 = (Mutex) zzfywVar.zza;
                    ResultKt.b(obj);
                    try {
                        zzfxrVar = this.zzf;
                        if (zzfxrVar != null) {
                            Intrinsics.m("adQualityDataBuilder");
                            throw null;
                        }
                        jZzi = jCurrentTimeMillis - zzfxrVar.zzi();
                        zzfxrVar2 = this.zzf;
                        if (zzfxrVar2 != null) {
                            Intrinsics.m("adQualityDataBuilder");
                            throw null;
                        }
                        zzfxrVar.zzb(jZzi - zzfxrVar2.zzg());
                        zzfxrVar3 = this.zzf;
                        if (zzfxrVar3 != null) {
                            Intrinsics.m("adQualityDataBuilder");
                            throw null;
                        }
                        zzfxrVar3.zzk(jCurrentTimeMillis);
                        zzfxrVar4 = this.zzf;
                        if (zzfxrVar4 != null) {
                            Intrinsics.m("adQualityDataBuilder");
                            throw null;
                        }
                        zzfxrVar4.zze(true);
                        zzfxrVar5 = this.zzf;
                        if (zzfxrVar5 != null) {
                            Intrinsics.m("adQualityDataBuilder");
                            throw null;
                        }
                        zzfxsVar = (zzfxs) zzfxrVar5.zzbu();
                        mutex2.b(null);
                        Intrinsics.c(zzfxsVar);
                        zzfywVar.zza = zzfxsVar;
                        zzfywVar.zze = 3;
                        if (zzv(zzfywVar) != obj2) {
                            zzfxsVar2 = zzfxsVar;
                        }
                        return obj2;
                    } catch (Throwable th) {
                        mutex2.b(null);
                        throw th;
                    }
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return unit;
                }
                zzfxsVar2 = (zzfxs) zzfywVar.zza;
                ResultKt.b(obj);
            }
            if (this.zzi.zza(zzfxsVar2)) {
                strZza = zzfxsVar2.zza();
                Intrinsics.e(strZza, "getGwsQueryId(...)");
                zzfywVar.zza = null;
                zzfywVar.zze = 4;
                if (zzs(strZza, zzfywVar) == obj2) {
                    return obj2;
                }
            }
            return unit;
            if (!this.zze) {
                mutex.b(null);
                return unit;
            }
            this.zze = false;
            mutex.b(null);
            mutex2 = this.zzb;
            jCurrentTimeMillis = System.currentTimeMillis();
            zzfywVar.zza = mutex2;
            zzfywVar.zzb = jCurrentTimeMillis;
            zzfywVar.zze = 2;
            if (mutex2.a(zzfywVar) != obj2) {
                zzfxrVar = this.zzf;
                if (zzfxrVar != null) {
                    Intrinsics.m("adQualityDataBuilder");
                    throw null;
                }
                jZzi = jCurrentTimeMillis - zzfxrVar.zzi();
                zzfxrVar2 = this.zzf;
                if (zzfxrVar2 != null) {
                    Intrinsics.m("adQualityDataBuilder");
                    throw null;
                }
                zzfxrVar.zzb(jZzi - zzfxrVar2.zzg());
                zzfxrVar3 = this.zzf;
                if (zzfxrVar3 != null) {
                    Intrinsics.m("adQualityDataBuilder");
                    throw null;
                }
                zzfxrVar3.zzk(jCurrentTimeMillis);
                zzfxrVar4 = this.zzf;
                if (zzfxrVar4 != null) {
                    Intrinsics.m("adQualityDataBuilder");
                    throw null;
                }
                zzfxrVar4.zze(true);
                zzfxrVar5 = this.zzf;
                if (zzfxrVar5 != null) {
                    Intrinsics.m("adQualityDataBuilder");
                    throw null;
                }
                zzfxsVar = (zzfxs) zzfxrVar5.zzbu();
                mutex2.b(null);
                Intrinsics.c(zzfxsVar);
                zzfywVar.zza = zzfxsVar;
                zzfywVar.zze = 3;
                if (zzv(zzfywVar) != obj2) {
                    zzfxsVar2 = zzfxsVar;
                    if (this.zzi.zza(zzfxsVar2)) {
                        strZza = zzfxsVar2.zza();
                        Intrinsics.e(strZza, "getGwsQueryId(...)");
                        zzfywVar.zza = null;
                        zzfywVar.zze = 4;
                        if (zzs(strZza, zzfywVar) == obj2) {
                        }
                    }
                    return unit;
                }
            }
            return obj2;
        } catch (Throwable th2) {
            mutex.b(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzn(Continuation continuation) {
        zzfyq zzfyqVar;
        Mutex mutex;
        long j;
        if (continuation instanceof zzfyq) {
            zzfyqVar = (zzfyq) continuation;
            int i2 = zzfyqVar.zze;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfyqVar.zze = i2 - Integer.MIN_VALUE;
            } else {
                zzfyqVar = new zzfyq(this, continuation);
            }
        } else {
            zzfyqVar = new zzfyq(this, continuation);
        }
        Object obj = zzfyqVar.zzc;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = zzfyqVar.zze;
        if (i3 == 0) {
            ResultKt.b(obj);
            Mutex mutex2 = this.zzb;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzfyqVar.zzb = mutex2;
            zzfyqVar.zza = jCurrentTimeMillis;
            zzfyqVar.zze = 1;
            if (mutex2.a(zzfyqVar) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutex = mutex2;
            j = jCurrentTimeMillis;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = zzfyqVar.zza;
            mutex = (Mutex) zzfyqVar.zzb;
            ResultKt.b(obj);
        }
        try {
            zzfxr zzfxrVar = this.zzf;
            if (zzfxrVar == null) {
                Intrinsics.m("adQualityDataBuilder");
                throw null;
            }
            zzfxrVar.zzs(j);
            mutex.b(null);
            return Unit.f43263a;
        } catch (Throwable th) {
            mutex.b(null);
            throw th;
        }
    }
}
