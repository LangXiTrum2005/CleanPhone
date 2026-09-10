package kotlinx.coroutines;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010&\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0006R\u0011\u0010*\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b)\u0010\tR\u0011\u0010,\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b+\u0010\t¨\u0006-"}, d2 = {"Lkotlinx/coroutines/lerp;", "Lkotlinx/coroutines/merc;", "<init>", "()V", "", "monroe", "()J", "", "julian", "()Z", "achondroplasia", "Lkotlinx/coroutines/dent;", "task", "", "wostteth", "(Lkotlinx/coroutines/dent;)V", "unconfined", "gusty", "(Z)V", "czestochowa", "", "parallelism", "", "name", "sayid", "(ILjava/lang/String;)Lkotlinx/coroutines/merc;", "shutdown", "preterite", "(Z)J", "arytenoidectomy", "J", "useCount", "monoploid", "Z", "shared", "Lkotlin/collections/impassible;", "polloi", "Lkotlin/collections/impassible;", "unconfinedQueue", "igbo", "nextTime", "palmyra", "isUnconfinedLoopActive", "lightstruck", "isUnconfinedQueueEmpty", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class lerp extends merc {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public long useCount;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public boolean shared;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public p002kotlin.collections.impassible<dent<?>> unconfinedQueue;

    public static /* synthetic */ void picketboat(lerp lerpVar, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        lerpVar.gusty(z);
    }

    public static /* synthetic */ void underbelly(lerp lerpVar, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        lerpVar.czestochowa(z);
    }

    public boolean achondroplasia() {
        return false;
    }

    public final void czestochowa(boolean unconfined) {
        long jPreterite = this.useCount - preterite(unconfined);
        this.useCount = jPreterite;
        if (jPreterite <= 0 && this.shared) {
            shutdown();
        }
    }

    public final void gusty(boolean unconfined) {
        this.useCount += preterite(unconfined);
        if (unconfined) {
            return;
        }
        this.shared = true;
    }

    public long igbo() {
        p002kotlin.collections.impassible<dent<?>> impassibleVar = this.unconfinedQueue;
        return (impassibleVar == null || impassibleVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final boolean julian() {
        dent<?> dentVarTriweekly;
        p002kotlin.collections.impassible<dent<?>> impassibleVar = this.unconfinedQueue;
        if (impassibleVar == null || (dentVarTriweekly = impassibleVar.triweekly()) == null) {
            return false;
        }
        dentVarTriweekly.run();
        return true;
    }

    public final boolean lightstruck() {
        p002kotlin.collections.impassible<dent<?>> impassibleVar = this.unconfinedQueue;
        if (impassibleVar != null) {
            return impassibleVar.isEmpty();
        }
        return true;
    }

    public long monroe() {
        return !julian() ? Long.MAX_VALUE : 0L;
    }

    public final boolean palmyra() {
        return this.useCount >= preterite(true);
    }

    public final long preterite(boolean unconfined) {
        return unconfined ? 4294967296L : 1L;
    }

    @Override // kotlinx.coroutines.merc
    public final merc sayid(int parallelism, String name) {
        pigboat.apical.attabal(parallelism);
        return pigboat.apical.saneness(this, name);
    }

    public final void wostteth(dent<?> task) {
        p002kotlin.collections.impassible<dent<?>> impassibleVar = this.unconfinedQueue;
        if (impassibleVar == null) {
            impassibleVar = new p002kotlin.collections.impassible<>();
            this.unconfinedQueue = impassibleVar;
        }
        impassibleVar.addLast(task);
    }

    public void shutdown() {
    }
}
