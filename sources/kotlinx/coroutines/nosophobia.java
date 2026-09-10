package kotlinx.coroutines;

import com.ironsource.C3414a2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004@A0BB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0004J%\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00132\n\u0010 \u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0013H\u0016¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&2\n\u0010 \u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\rH\u0004¢\u0006\u0004\b.\u0010\u0004R$\u00104\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00106\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u00101R\u0014\u00108\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b7\u0010%R\u0013\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:098\u0002X\u0082\u0004R\u0013\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<098\u0002X\u0082\u0004R\u000b\u0010?\u001a\u00020>8\u0002X\u0082\u0004¨\u0006C"}, d2 = {"Lkotlinx/coroutines/nosophobia;", "Lkotlinx/coroutines/lotta;", "Lkotlinx/coroutines/mathsort;", "<init>", "()V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "setterwort", "(Ljava/lang/Runnable;)Z", "outmarry", "()Ljava/lang/Runnable;", "", "vesuvio", "technofreak", "Lkotlinx/coroutines/nosophobia$dern;", "tectonization", "(Lkotlinx/coroutines/nosophobia$dern;)Z", "", "now", "delayedTask", "", "sakeen", "(JLkotlinx/coroutines/nosophobia$dern;)I", "libyan", "shutdown", "timeMillis", "Lkotlinx/coroutines/impassible;", "continuation", "monoploid", "(JLkotlinx/coroutines/impassible;)V", "block", "Lkotlinx/coroutines/milliradian;", "immediately", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/milliradian;", "monroe", "()J", "Lkotlin/coroutines/CoroutineContext;", "context", "itchy", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dhss", "(Ljava/lang/Runnable;)V", "molet", "(JLkotlinx/coroutines/nosophobia$dern;)V", "deadwork", "value", "saneness", "()Z", "basify", "(Z)V", "isCompleted", "lampshade", "isEmpty", "igbo", "nextTime", "Lkotlinx/atomicfu/AtomicRef;", "", "_queue", "Lkotlinx/coroutines/nosophobia$wireman;", "_delayed", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleted", "dern", "attabal", "wireman", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class nosophobia extends lotta implements mathsort {
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32367molybdenite = AtomicReferenceFieldUpdater.newUpdater(nosophobia.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32366graveside = AtomicReferenceFieldUpdater.newUpdater(nosophobia.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32365adultoid = AtomicIntegerFieldUpdater.newUpdater(nosophobia.class, "_isCompleted$volatile");

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/nosophobia$attabal;", "Lkotlinx/coroutines/nosophobia$dern;", "", "nanoTime", "Lkotlinx/coroutines/impassible;", "", "cont", "<init>", "(Lkotlinx/coroutines/nosophobia;JLkotlinx/coroutines/impassible;)V", "run", "()V", "", "toString", "()Ljava/lang/String;", "monoploid", "Lkotlinx/coroutines/impassible;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class attabal extends dern {

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public final impassible<Unit> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(long j, impassible<? super Unit> impassibleVar) {
            super(j);
            this.cont = impassibleVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.cont.molybdenite(nosophobia.this, Unit.f29295attabal);
        }

        @Override // kotlinx.coroutines.nosophobia.dern
        public String toString() {
            return super.toString() + this.cont;
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R0\u00101\u001a\b\u0012\u0002\b\u0003\u0018\u00010+2\f\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00062"}, d2 = {"Lkotlinx/coroutines/nosophobia$dern;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/milliradian;", "Lpigboat/seminary;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "nanoTime", "<init>", "(J)V", C3414a2.d, "", "taiyuan", "(Lkotlinx/coroutines/nosophobia$dern;)I", "now", "", "apical", "(J)Z", "Lkotlinx/coroutines/nosophobia$wireman;", "delayed", "Lkotlinx/coroutines/nosophobia;", "eventLoop", "cutely", "(JLkotlinx/coroutines/nosophobia$wireman;Lkotlinx/coroutines/nosophobia;)I", "", "attabal", "()V", "", "toString", "()Ljava/lang/String;", "kowloon", "J", "_heap", "Ljava/lang/Object;", "arytenoidectomy", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "Lpigboat/polder;", "value", "wireman", "()Lpigboat/polder;", "marial", "(Lpigboat/polder;)V", "heap", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class dern implements Runnable, Comparable<dern>, milliradian, pigboat.seminary {
        private volatile Object _heap;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public int index = -1;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public long nanoTime;

        public dern(long j) {
            this.nanoTime = j;
        }

        public final boolean apical(long now) {
            return now - this.nanoTime >= 0;
        }

        @Override // kotlinx.coroutines.milliradian
        public final void attabal() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == empress.f32191attabal) {
                        return;
                    }
                    wireman wiremanVar = obj instanceof wireman ? (wireman) obj : null;
                    if (wiremanVar != null) {
                        wiremanVar.impromptu(this);
                    }
                    this._heap = empress.f32191attabal;
                    Unit unit = Unit.f29295attabal;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final int cutely(long now, wireman delayed, nosophobia eventLoop) {
            synchronized (this) {
                if (this._heap == empress.f32191attabal) {
                    return 2;
                }
                synchronized (delayed) {
                    try {
                        dern dernVarSaneness = delayed.saneness();
                        if (eventLoop.saneness()) {
                            return 1;
                        }
                        if (dernVarSaneness == null) {
                            delayed.timeNow = now;
                        } else {
                            long j = dernVarSaneness.nanoTime;
                            if (j - now < 0) {
                                now = j;
                            }
                            if (now - delayed.timeNow > 0) {
                                delayed.timeNow = now;
                            }
                        }
                        long j2 = this.nanoTime;
                        long j3 = delayed.timeNow;
                        if (j2 - j3 < 0) {
                            this.nanoTime = j3;
                        }
                        delayed.attabal(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // pigboat.seminary
        public int getIndex() {
            return this.index;
        }

        @Override // pigboat.seminary
        public void marial(pigboat.polder<?> polderVar) {
            if (this._heap == empress.f32191attabal) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = polderVar;
        }

        @Override // pigboat.seminary
        public void setIndex(int i) {
            this.index = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public int compareTo(dern other) {
            long j = this.nanoTime - other.nanoTime;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.nanoTime + ']';
        }

        @Override // pigboat.seminary
        public pigboat.polder<?> wireman() {
            Object obj = this._heap;
            if (obj instanceof pigboat.polder) {
                return (pigboat.polder) obj;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/nosophobia$saneness;", "Lkotlinx/coroutines/nosophobia$dern;", "", "nanoTime", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "<init>", "(JLjava/lang/Runnable;)V", "", "run", "()V", "", "toString", "()Ljava/lang/String;", "monoploid", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class saneness extends dern {

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public final Runnable block;

        public saneness(long j, Runnable runnable) {
            super(j);
            this.block = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.block.run();
        }

        @Override // kotlinx.coroutines.nosophobia.dern
        public String toString() {
            return super.toString() + this.block;
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/nosophobia$wireman;", "Lpigboat/polder;", "Lkotlinx/coroutines/nosophobia$dern;", "", "timeNow", "<init>", "(J)V", "dern", "J", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class wireman extends pigboat.polder<dern> {

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public long timeNow;

        public wireman(long j) {
            this.timeNow = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean saneness() {
        return f32365adultoid.get(this) == 1;
    }

    public final void basify(boolean z) {
        f32365adultoid.set(this, z ? 1 : 0);
    }

    public final void deadwork() {
        f32367molybdenite.set(this, null);
        f32366graveside.set(this, null);
    }

    public void dhss(Runnable task) {
        vesuvio();
        if (setterwort(task)) {
            hardpan();
        } else {
            starveling.f32447dovishness.dhss(task);
        }
    }

    @Override // kotlinx.coroutines.lerp
    public long igbo() {
        dern dernVarBeachfront;
        if (super.igbo() == 0) {
            return 0L;
        }
        Object obj = f32367molybdenite.get(this);
        if (obj != null) {
            if (!(obj instanceof pigboat.kowloon)) {
                return obj == empress.f32192saneness ? Long.MAX_VALUE : 0L;
            }
            if (!((pigboat.kowloon) obj).cutely()) {
                return 0L;
            }
        }
        wireman wiremanVar = (wireman) f32366graveside.get(this);
        if (wiremanVar == null || (dernVarBeachfront = wiremanVar.beachfront()) == null) {
            return Long.MAX_VALUE;
        }
        long j = dernVarBeachfront.nanoTime;
        kotlinx.coroutines.dern.attabal();
        return p002kotlin.ranges.wireman.marial(j - System.nanoTime(), 0L);
    }

    public final milliradian immediately(long timeMillis, Runnable block) {
        long jDern = empress.dern(timeMillis);
        if (jDern >= 4611686018427387903L) {
            return vesuvio.f32469kowloon;
        }
        kotlinx.coroutines.dern.attabal();
        long jNanoTime = System.nanoTime();
        saneness sanenessVar = new saneness(jDern + jNanoTime, block);
        molet(jNanoTime, sanenessVar);
        return sanenessVar;
    }

    @Override // kotlinx.coroutines.merc
    public final void itchy(CoroutineContext context, Runnable block) {
        dhss(block);
    }

    public boolean lampshade() {
        if (!lightstruck()) {
            return false;
        }
        wireman wiremanVar = (wireman) f32366graveside.get(this);
        if (wiremanVar != null && !wiremanVar.marial()) {
            return false;
        }
        Object obj = f32367molybdenite.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof pigboat.kowloon) {
            return ((pigboat.kowloon) obj).cutely();
        }
        return obj == empress.f32192saneness;
    }

    public final void libyan() {
        dern dernVarCutely;
        kotlinx.coroutines.dern.attabal();
        long jNanoTime = System.nanoTime();
        while (true) {
            wireman wiremanVar = (wireman) f32366graveside.get(this);
            if (wiremanVar == null || (dernVarCutely = wiremanVar.cutely()) == null) {
                return;
            } else {
                claque(jNanoTime, dernVarCutely);
            }
        }
    }

    @Override // kotlinx.coroutines.mathsort
    public milliradian merc(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return mathsort.attabal.attabal(this, j, runnable, coroutineContext);
    }

    public final void molet(long now, dern delayedTask) {
        int iSakeen = sakeen(now, delayedTask);
        if (iSakeen == 0) {
            if (tectonization(delayedTask)) {
                hardpan();
            }
        } else if (iSakeen == 1) {
            claque(now, delayedTask);
        } else if (iSakeen != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    @Override // kotlinx.coroutines.mathsort
    public void monoploid(long timeMillis, impassible<? super Unit> continuation) {
        long jDern = empress.dern(timeMillis);
        if (jDern < 4611686018427387903L) {
            kotlinx.coroutines.dern.attabal();
            long jNanoTime = System.nanoTime();
            attabal attabalVar = new attabal(jDern + jNanoTime, continuation);
            molet(jNanoTime, attabalVar);
            monoploid.attabal(continuation, attabalVar);
        }
    }

    @Override // kotlinx.coroutines.lerp
    public long monroe() {
        if (julian()) {
            return 0L;
        }
        vesuvio();
        Runnable runnableOutmarry = outmarry();
        if (runnableOutmarry == null) {
            return igbo();
        }
        runnableOutmarry.run();
        return 0L;
    }

    public final Runnable outmarry() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32367molybdenite;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof pigboat.kowloon) {
                Intrinsics.competently(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                pigboat.kowloon kowloonVar = (pigboat.kowloon) obj;
                Object objImpassible = kowloonVar.impassible();
                if (objImpassible != pigboat.kowloon.f35356impromptu) {
                    return (Runnable) objImpassible;
                }
                androidx.concurrent.futures.attabal.attabal(f32367molybdenite, this, obj, kowloonVar.formularize());
            } else {
                if (obj == empress.f32192saneness) {
                    return null;
                }
                if (androidx.concurrent.futures.attabal.attabal(f32367molybdenite, this, obj, null)) {
                    Intrinsics.competently(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    public final int sakeen(long now, dern delayedTask) {
        if (saneness()) {
            return 1;
        }
        wireman wiremanVar = (wireman) f32366graveside.get(this);
        if (wiremanVar == null) {
            androidx.concurrent.futures.attabal.attabal(f32366graveside, this, null, new wireman(now));
            Object obj = f32366graveside.get(this);
            Intrinsics.beachfront(obj);
            wiremanVar = (wireman) obj;
        }
        return delayedTask.cutely(now, wiremanVar, this);
    }

    public final boolean setterwort(Runnable task) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32367molybdenite;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (saneness()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.attabal.attabal(f32367molybdenite, this, null, task)) {
                    return true;
                }
            } else if (obj instanceof pigboat.kowloon) {
                Intrinsics.competently(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                pigboat.kowloon kowloonVar = (pigboat.kowloon) obj;
                int iAttabal = kowloonVar.attabal(task);
                if (iAttabal == 0) {
                    return true;
                }
                if (iAttabal == 1) {
                    androidx.concurrent.futures.attabal.attabal(f32367molybdenite, this, obj, kowloonVar.formularize());
                } else if (iAttabal == 2) {
                    return false;
                }
            } else {
                if (obj == empress.f32192saneness) {
                    return false;
                }
                pigboat.kowloon kowloonVar2 = new pigboat.kowloon(8, true);
                Intrinsics.competently(obj, "null cannot be cast to non-null type java.lang.Runnable");
                kowloonVar2.attabal((Runnable) obj);
                kowloonVar2.attabal(task);
                if (androidx.concurrent.futures.attabal.attabal(f32367molybdenite, this, obj, kowloonVar2)) {
                    return true;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.lerp
    public void shutdown() {
        basify.f32112attabal.dern();
        basify(true);
        technofreak();
        while (monroe() <= 0) {
        }
        libyan();
    }

    public final void technofreak() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32367molybdenite;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.attabal.attabal(f32367molybdenite, this, null, empress.f32192saneness)) {
                    return;
                }
            } else if (obj instanceof pigboat.kowloon) {
                ((pigboat.kowloon) obj).wireman();
                return;
            } else {
                if (obj == empress.f32192saneness) {
                    return;
                }
                pigboat.kowloon kowloonVar = new pigboat.kowloon(8, true);
                Intrinsics.competently(obj, "null cannot be cast to non-null type java.lang.Runnable");
                kowloonVar.attabal((Runnable) obj);
                if (androidx.concurrent.futures.attabal.attabal(f32367molybdenite, this, obj, kowloonVar)) {
                    return;
                }
            }
        }
    }

    public final boolean tectonization(dern task) {
        wireman wiremanVar = (wireman) f32366graveside.get(this);
        return (wiremanVar != null ? wiremanVar.beachfront() : null) == task;
    }

    public final void vesuvio() {
        dern dernVarTaiyuan;
        wireman wiremanVar = (wireman) f32366graveside.get(this);
        if (wiremanVar == null || wiremanVar.marial()) {
            return;
        }
        kotlinx.coroutines.dern.attabal();
        long jNanoTime = System.nanoTime();
        do {
            synchronized (wiremanVar) {
                try {
                    dern dernVarSaneness = wiremanVar.saneness();
                    dernVarTaiyuan = null;
                    if (dernVarSaneness != null) {
                        dern dernVar = dernVarSaneness;
                        dernVarTaiyuan = dernVar.apical(jNanoTime) ? setterwort(dernVar) : false ? wiremanVar.taiyuan(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (dernVarTaiyuan != null);
    }
}
