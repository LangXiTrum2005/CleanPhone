package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b*\u00016\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001AB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher;", "Lkotlinx/coroutines/merc;", "Landroid/view/Choreographer;", "choreographer", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/view/Choreographer;Landroid/os/Handler;)V", "Landroid/view/Choreographer$FrameCallback;", "callback", "", "claque", "(Landroid/view/Choreographer$FrameCallback;)V", "hardpan", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "block", "itchy", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "julian", "()Ljava/lang/Runnable;", "unconsolidated", "()V", "", "frameTimeNanos", "achondroplasia", "(J)V", "arytenoidectomy", "Landroid/view/Choreographer;", "lightstruck", "()Landroid/view/Choreographer;", "monoploid", "Landroid/os/Handler;", "", "polloi", "Ljava/lang/Object;", "lock", "Lkotlin/collections/impassible;", "molybdenite", "Lkotlin/collections/impassible;", "toRunTrampolined", "", "graveside", "Ljava/util/List;", "toRunOnFrame", "adultoid", "spareToRunOnFrame", "", "dovishness", "Z", "scheduledTrampolineDispatch", "gintrap", "scheduledFrameDispatch", "androidx/compose/ui/platform/AndroidUiDispatcher$dern", "rotuma", "Landroidx/compose/ui/platform/AndroidUiDispatcher$dern;", "dispatchCallback", "Landroidx/compose/runtime/milliradian;", "preprohormone", "Landroidx/compose/runtime/milliradian;", "monroe", "()Landroidx/compose/runtime/milliradian;", "frameClock", "cord", "saneness", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidUiDispatcher extends kotlinx.coroutines.merc {

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public static final int f7256cuirassed = 8;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public static final patroclinal.taiyuan<CoroutineContext> f7257stratoscope = p002kotlin.saneness.saneness(new Function0<CoroutineContext>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2
        @Override // p002kotlin.jvm.functions.Function0
        public final CoroutineContext invoke() {
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(polder.saneness() ? Choreographer.getInstance() : (Choreographer) kotlinx.coroutines.impromptu.marial(kotlinx.coroutines.premeiotic.dern(), new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null)), claque.impromptu.attabal(Looper.getMainLooper()), null);
            return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
        }
    });

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public static final ThreadLocal<CoroutineContext> f7258trm = new attabal();

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public List<Choreographer.FrameCallback> spareToRunOnFrame;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final Choreographer choreographer;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public boolean scheduledTrampolineDispatch;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public boolean scheduledFrameDispatch;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public List<Choreographer.FrameCallback> toRunOnFrame;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final p002kotlin.collections.impassible<Runnable> toRunTrampolined;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final Handler handler;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final Object lock;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.milliradian frameClock;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public final dern dispatchCallback;

    /* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/AndroidUiDispatcher$attabal", "Ljava/lang/ThreadLocal;", "Lkotlin/coroutines/CoroutineContext;", "attabal", "()Lkotlin/coroutines/CoroutineContext;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal extends ThreadLocal<CoroutineContext> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public CoroutineContext initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, claque.impromptu.attabal(looperMyLooper), null);
            return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
        }
    }

    /* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/compose/ui/platform/AndroidUiDispatcher$dern", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "", "run", "()V", "", "frameTimeNanos", "doFrame", "(J)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class dern implements Choreographer.FrameCallback, Runnable {
        public dern() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            AndroidUiDispatcher.this.handler.removeCallbacks(this);
            AndroidUiDispatcher.this.unconsolidated();
            AndroidUiDispatcher.this.achondroplasia(frameTimeNanos);
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidUiDispatcher.this.unconsolidated();
            Object obj = AndroidUiDispatcher.this.lock;
            AndroidUiDispatcher androidUiDispatcher = AndroidUiDispatcher.this;
            synchronized (obj) {
                try {
                    if (androidUiDispatcher.toRunOnFrame.isEmpty()) {
                        androidUiDispatcher.getChoreographer().removeFrameCallback(this);
                        androidUiDispatcher.scheduledFrameDispatch = false;
                    }
                    Unit unit = Unit.f29295attabal;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher$saneness;", "", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "Main$delegate", "Lpatroclinal/taiyuan;", "saneness", "()Lkotlin/coroutines/CoroutineContext;", "Main", "attabal", "CurrentThread", "Ljava/lang/ThreadLocal;", "currentThread", "Ljava/lang/ThreadLocal;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CoroutineContext attabal() {
            if (polder.saneness()) {
                return saneness();
            }
            CoroutineContext coroutineContext = (CoroutineContext) AndroidUiDispatcher.f7258trm.get();
            if (coroutineContext != null) {
                return coroutineContext;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        public final CoroutineContext saneness() {
            return (CoroutineContext) AndroidUiDispatcher.f7257stratoscope.getValue();
        }

        public Companion() {
        }
    }

    public /* synthetic */ AndroidUiDispatcher(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }

    public final void achondroplasia(long frameTimeNanos) {
        synchronized (this.lock) {
            if (this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = false;
                List<Choreographer.FrameCallback> list = this.toRunOnFrame;
                this.toRunOnFrame = this.spareToRunOnFrame;
                this.spareToRunOnFrame = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).doFrame(frameTimeNanos);
                }
                list.clear();
            }
        }
    }

    public final void claque(Choreographer.FrameCallback callback) {
        synchronized (this.lock) {
            try {
                this.toRunOnFrame.add(callback);
                if (!this.scheduledFrameDispatch) {
                    this.scheduledFrameDispatch = true;
                    this.choreographer.postFrameCallback(this.dispatchCallback);
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void hardpan(Choreographer.FrameCallback callback) {
        synchronized (this.lock) {
            this.toRunOnFrame.remove(callback);
        }
    }

    @Override // kotlinx.coroutines.merc
    public void itchy(CoroutineContext context, Runnable block) {
        synchronized (this.lock) {
            try {
                this.toRunTrampolined.addLast(block);
                if (!this.scheduledTrampolineDispatch) {
                    this.scheduledTrampolineDispatch = true;
                    this.handler.post(this.dispatchCallback);
                    if (!this.scheduledFrameDispatch) {
                        this.scheduledFrameDispatch = true;
                        this.choreographer.postFrameCallback(this.dispatchCallback);
                    }
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Runnable julian() {
        Runnable runnableTriweekly;
        synchronized (this.lock) {
            runnableTriweekly = this.toRunTrampolined.triweekly();
        }
        return runnableTriweekly;
    }

    /* JADX INFO: renamed from: lightstruck, reason: from getter */
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    /* JADX INFO: renamed from: monroe, reason: from getter */
    public final androidx.compose.runtime.milliradian getFrameClock() {
        return this.frameClock;
    }

    public final void unconsolidated() {
        boolean z;
        do {
            Runnable runnableJulian = julian();
            while (runnableJulian != null) {
                runnableJulian.run();
                runnableJulian = julian();
            }
            synchronized (this.lock) {
                if (this.toRunTrampolined.isEmpty()) {
                    z = false;
                    this.scheduledTrampolineDispatch = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    public AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.choreographer = choreographer;
        this.handler = handler;
        this.lock = new Object();
        this.toRunTrampolined = new p002kotlin.collections.impassible<>();
        this.toRunOnFrame = new ArrayList();
        this.spareToRunOnFrame = new ArrayList();
        this.dispatchCallback = new dern();
        this.frameClock = new AndroidUiFrameClock(choreographer, this);
    }
}
