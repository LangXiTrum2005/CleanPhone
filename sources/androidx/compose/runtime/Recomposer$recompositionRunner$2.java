package androidx.compose.runtime;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import java.util.List;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 0, 0})
@igo.wireman(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {1160}, m = "invokeSuspend")
public final class Recomposer$recompositionRunner$2 extends SuspendLambda implements Function2<kotlinx.coroutines.saran, wretchedly.dern<? super Unit>, Object> {
    final /* synthetic */ tetrahedral.triweekly<kotlinx.coroutines.saran, milliradian, wretchedly.dern<? super Unit>, Object> $block;
    final /* synthetic */ milliradian $parentFrameClock;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 0, 0})
    @igo.wireman(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {1160}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<kotlinx.coroutines.saran, wretchedly.dern<? super Unit>, Object> {
        final /* synthetic */ tetrahedral.triweekly<kotlinx.coroutines.saran, milliradian, wretchedly.dern<? super Unit>, Object> $block;
        final /* synthetic */ milliradian $parentFrameClock;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(tetrahedral.triweekly<? super kotlinx.coroutines.saran, ? super milliradian, ? super wretchedly.dern<? super Unit>, ? extends Object> triweeklyVar, milliradian milliradianVar, wretchedly.dern<? super AnonymousClass2> dernVar) {
            super(2, dernVar);
            this.$block = triweeklyVar;
            this.$parentFrameClock = milliradianVar;
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.$parentFrameClock, dernVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
            int i = this.label;
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                kotlinx.coroutines.saran saranVar = (kotlinx.coroutines.saran) this.L$0;
                tetrahedral.triweekly<kotlinx.coroutines.saran, milliradian, wretchedly.dern<? super Unit>, Object> triweeklyVar = this.$block;
                milliradian milliradianVar = this.$parentFrameClock;
                this.label = 1;
                if (triweeklyVar.invoke(saranVar, milliradianVar, this) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
            return Unit.f29295attabal;
        }

        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.saran saranVar, wretchedly.dern<? super Unit> dernVar) {
            return ((AnonymousClass2) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Recomposer$recompositionRunner$2(Recomposer recomposer, tetrahedral.triweekly<? super kotlinx.coroutines.saran, ? super milliradian, ? super wretchedly.dern<? super Unit>, ? extends Object> triweeklyVar, milliradian milliradianVar, wretchedly.dern<? super Recomposer$recompositionRunner$2> dernVar) {
        super(2, dernVar);
        this.this$0 = recomposer;
        this.$block = triweeklyVar;
        this.$parentFrameClock = milliradianVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[Catch: all -> 0x006f, LOOP:0: B:11:0x0033->B:28:0x007c, LOOP_END, TryCatch #0 {all -> 0x006f, blocks: (B:4:0x0007, B:6:0x0019, B:8:0x0022, B:11:0x0033, B:13:0x0043, B:15:0x004f, B:17:0x0058, B:19:0x0061, B:24:0x0071, B:25:0x0074, B:28:0x007c, B:38:0x00a5, B:29:0x007f, B:30:0x0085, B:32:0x008b, B:34:0x0093, B:37:0x00a1), top: B:48:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5 A[EDGE_INSN: B:51:0x00a5->B:38:0x00a5 BREAK  A[LOOP:0: B:11:0x0033->B:28:0x007c], SYNTHETIC] */
    public static final Unit triweekly(Recomposer recomposer, Set set, androidx.compose.runtime.snapshots.formularize formularizeVar) {
        kotlinx.coroutines.impassible impassibleVarLerp;
        synchronized (recomposer.stateLock) {
            try {
                if (((Recomposer.State) recomposer._state.getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                    androidx.collection.saran saranVar = recomposer.snapshotInvalidations;
                    if (set instanceof ScatterSetWrapper) {
                        ScatterSet scatterSetSaneness = ((ScatterSetWrapper) set).saneness();
                        Object[] objArr = scatterSetSaneness.elements;
                        long[] jArr = scatterSetSaneness.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            Object obj = objArr[(i << 3) + i3];
                                            if (!(obj instanceof androidx.compose.runtime.snapshots.seminary) || ((androidx.compose.runtime.snapshots.seminary) obj).graveside(androidx.compose.runtime.snapshots.impromptu.attabal(1))) {
                                                saranVar.impromptu(obj);
                                            }
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                    if (i != length) {
                                        break;
                                    }
                                    i++;
                                }
                            }
                        }
                    } else {
                        for (Object obj2 : set) {
                            if (!(obj2 instanceof androidx.compose.runtime.snapshots.seminary) || ((androidx.compose.runtime.snapshots.seminary) obj2).graveside(androidx.compose.runtime.snapshots.impromptu.attabal(1))) {
                                saranVar.impromptu(obj2);
                            }
                        }
                    }
                    impassibleVarLerp = recomposer.lerp();
                } else {
                    impassibleVarLerp = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (impassibleVarLerp != null) {
            Result.Companion companion = Result.INSTANCE;
            impassibleVarLerp.resumeWith(Result.m3351constructorimpl(Unit.f29295attabal));
        }
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.this$0, this.$block, this.$parentFrameClock, dernVar);
        recomposer$recompositionRunner$2.L$0 = obj;
        return recomposer$recompositionRunner$2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009a A[Catch: all -> 0x009e, TryCatch #3 {all -> 0x009e, blocks: (B:24:0x0094, B:26:0x009a, B:29:0x00a0), top: B:54:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6 A[Catch: all -> 0x00ca, TryCatch #1 {all -> 0x00ca, blocks: (B:37:0x00c0, B:39:0x00c6, B:42:0x00cc), top: B:50:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        kotlinx.coroutines.monroe monroeVarCutely;
        androidx.compose.runtime.snapshots.competently competentlyVar;
        Throwable th;
        Object obj2;
        Recomposer recomposer;
        Object obj3;
        Recomposer recomposer2;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            competentlyVar = (androidx.compose.runtime.snapshots.competently) this.L$1;
            monroeVarCutely = (kotlinx.coroutines.monroe) this.L$0;
            try {
                p002kotlin.dern.saneness(obj);
                competentlyVar.attabal();
                obj3 = this.this$0.stateLock;
                recomposer2 = this.this$0;
                synchronized (obj3) {
                    try {
                        if (recomposer2.runnerJob == monroeVarCutely) {
                            recomposer2.runnerJob = null;
                        }
                        recomposer2.lerp();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Recomposer.INSTANCE.wireman(this.this$0.recomposerInfo);
                return Unit.f29295attabal;
            } catch (Throwable th3) {
                th = th3;
                competentlyVar.attabal();
                obj2 = this.this$0.stateLock;
                recomposer = this.this$0;
                synchronized (obj2) {
                    try {
                        if (recomposer.runnerJob == monroeVarCutely) {
                            recomposer.runnerJob = null;
                        }
                        recomposer.lerp();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                Recomposer.INSTANCE.wireman(this.this$0.recomposerInfo);
                throw th;
            }
        }
        p002kotlin.dern.saneness(obj);
        monroeVarCutely = kotlinx.coroutines.achondroplasia.cutely(((kotlinx.coroutines.saran) this.L$0).getCoroutineContext());
        this.this$0.mastfed(monroeVarCutely);
        androidx.compose.runtime.snapshots.formularize.Companion companion = androidx.compose.runtime.snapshots.formularize.INSTANCE;
        final Recomposer recomposer3 = this.this$0;
        androidx.compose.runtime.snapshots.competently competentlyVarTaiyuan = companion.taiyuan(new Function2() { // from class: androidx.compose.runtime.libyan
            @Override // p002kotlin.jvm.functions.Function2
            public final Object invoke(Object obj4, Object obj5) {
                return Recomposer$recompositionRunner$2.triweekly(recomposer3, (Set) obj4, (androidx.compose.runtime.snapshots.formularize) obj5);
            }
        });
        Recomposer.INSTANCE.dern(this.this$0.recomposerInfo);
        try {
            List listGusty = this.this$0.gusty();
            int size = listGusty.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((supplicat) listGusty.get(i2)).gintrap();
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.$parentFrameClock, null);
            this.L$0 = monroeVarCutely;
            this.L$1 = competentlyVarTaiyuan;
            this.label = 1;
            if (kotlinx.coroutines.privatdozent.marial(anonymousClass2, this) == objBeachfront) {
                return objBeachfront;
            }
            competentlyVar = competentlyVarTaiyuan;
            competentlyVar.attabal();
            obj3 = this.this$0.stateLock;
            recomposer2 = this.this$0;
            synchronized (obj3) {
                if (recomposer2.runnerJob == monroeVarCutely) {
                    recomposer2.runnerJob = null;
                }
                recomposer2.lerp();
                Recomposer.INSTANCE.wireman(this.this$0.recomposerInfo);
                return Unit.f29295attabal;
            }
        } catch (Throwable th5) {
            competentlyVar = competentlyVarTaiyuan;
            th = th5;
            competentlyVar.attabal();
            obj2 = this.this$0.stateLock;
            recomposer = this.this$0;
            synchronized (obj2) {
                if (recomposer.runnerJob == monroeVarCutely) {
                    recomposer.runnerJob = null;
                }
                recomposer.lerp();
                Recomposer.INSTANCE.wireman(this.this$0.recomposerInfo);
                throw th;
            }
        }
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((Recomposer$recompositionRunner$2) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
