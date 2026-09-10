package regius;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import patty.graveside;

/* JADX INFO: compiled from: FirstFrameWaiter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class impromptu implements taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Set<Activity> f36200attabal = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public volatile boolean f36201saneness;

    /* JADX INFO: compiled from: FirstFrameWaiter.java */
    public class attabal implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ View f36203kowloon;

        /* JADX INFO: renamed from: regius.impromptu$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FirstFrameWaiter.java */
        public class RunnableC0782attabal implements Runnable {

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnDrawListener f36205kowloon;

            public RunnableC0782attabal(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f36205kowloon = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                graveside.saneness().impromptu();
                impromptu.this.f36201saneness = true;
                impromptu.saneness(attabal.this.f36203kowloon, this.f36205kowloon);
                impromptu.this.f36200attabal.clear();
            }
        }

        public attabal(View view) {
            this.f36203kowloon = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            com.bumptech.glide.util.formularize.gintrap(new RunnableC0782attabal(this));
        }
    }

    public static void saneness(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // regius.taiyuan
    public void attabal(Activity activity) {
        if (!this.f36201saneness && this.f36200attabal.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new attabal(decorView));
        }
    }
}
