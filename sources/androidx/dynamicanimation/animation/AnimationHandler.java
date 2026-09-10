package androidx.dynamicanimation.animation;

import android.os.SystemClock;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
class AnimationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FrameCallbackProvider16 f4951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4952b;

    public class AnimationCallbackDispatcher {
    }

    public interface AnimationFrameCallback {
        boolean a(long j);
    }

    public static abstract class AnimationFrameCallbackProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AnimationCallbackDispatcher f4953a;

        public AnimationFrameCallbackProvider(AnimationCallbackDispatcher animationCallbackDispatcher) {
            this.f4953a = animationCallbackDispatcher;
        }
    }

    public static class FrameCallbackProvider14 extends AnimationFrameCallbackProvider {

        /* JADX INFO: renamed from: androidx.dynamicanimation.animation.AnimationHandler$FrameCallbackProvider14$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                SystemClock.uptimeMillis();
                throw null;
            }
        }
    }

    public static class FrameCallbackProvider16 extends AnimationFrameCallbackProvider {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Choreographer f4954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Choreographer.FrameCallback f4955c;

        public FrameCallbackProvider16(AnimationCallbackDispatcher animationCallbackDispatcher) {
            super(animationCallbackDispatcher);
            this.f4954b = Choreographer.getInstance();
            this.f4955c = new Choreographer.FrameCallback() { // from class: androidx.dynamicanimation.animation.AnimationHandler.FrameCallbackProvider16.1
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    FrameCallbackProvider16.this.f4953a.getClass();
                    SystemClock.uptimeMillis();
                    throw null;
                }
            };
        }
    }

    static {
        new ThreadLocal();
    }
}
