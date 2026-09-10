package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/RunOnce;", "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class RunOnce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutexImpl f4678a = MutexKt.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompletableDeferred f4679b = CompletableDeferredKt.a();

    public abstract Object a(ContinuationImpl continuationImpl);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) throws Throwable {
        RunOnce$runIfNeeded$1 runOnce$runIfNeeded$1;
        Mutex mutex;
        RunOnce runOnce;
        Mutex mutex2;
        Throwable th;
        RunOnce runOnce2;
        if (continuationImpl instanceof RunOnce$runIfNeeded$1) {
            runOnce$runIfNeeded$1 = (RunOnce$runIfNeeded$1) continuationImpl;
            int i2 = runOnce$runIfNeeded$1.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                runOnce$runIfNeeded$1.f0 = i2 - Integer.MIN_VALUE;
            } else {
                runOnce$runIfNeeded$1 = new RunOnce$runIfNeeded$1(this, continuationImpl);
            }
        } else {
            runOnce$runIfNeeded$1 = new RunOnce$runIfNeeded$1(this, continuationImpl);
        }
        Object obj = runOnce$runIfNeeded$1.Z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = runOnce$runIfNeeded$1.f0;
        Unit unit = Unit.f43263a;
        try {
            if (i3 == 0) {
                ResultKt.b(obj);
                if (((JobSupport) this.f4679b).h()) {
                    return unit;
                }
                mutex = this.f4678a;
                runOnce$runIfNeeded$1.X = this;
                runOnce$runIfNeeded$1.f4680Y = mutex;
                runOnce$runIfNeeded$1.f0 = 1;
                if (mutex.a(runOnce$runIfNeeded$1) != coroutineSingletons) {
                    runOnce = this;
                }
                return coroutineSingletons;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = runOnce$runIfNeeded$1.f4680Y;
                runOnce2 = runOnce$runIfNeeded$1.X;
                try {
                    ResultKt.b(obj);
                    runOnce2.f4679b.H(unit);
                    mutex2.b(null);
                    return unit;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.b(null);
                    throw th;
                }
            }
            Mutex mutex3 = runOnce$runIfNeeded$1.f4680Y;
            runOnce = runOnce$runIfNeeded$1.X;
            ResultKt.b(obj);
            mutex = mutex3;
            if (((JobSupport) runOnce.f4679b).h()) {
                mutex.b(null);
                return unit;
            }
            runOnce$runIfNeeded$1.X = runOnce;
            runOnce$runIfNeeded$1.f4680Y = mutex;
            runOnce$runIfNeeded$1.f0 = 2;
            if (runOnce.a(runOnce$runIfNeeded$1) != coroutineSingletons) {
                mutex2 = mutex;
                runOnce2 = runOnce;
                runOnce2.f4679b.H(unit);
                mutex2.b(null);
                return unit;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.b(null);
            throw th;
        }
    }
}
