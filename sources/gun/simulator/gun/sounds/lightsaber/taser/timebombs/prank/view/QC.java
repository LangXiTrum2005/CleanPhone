package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class QC {
    private static final int MIN_VISIBILITY_PERCENTAGE = 1;
    private static final int VISIBILITY_THROTTLE_MILLIS = 100;
    private final Rect clipRect;
    private boolean isVisibilityScheduled;
    private final ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private boolean setViewTreeObserverSucceed;
    private final Map<View, OC> trackedViews;
    private final Handler visibilityHandler;
    private final PC visibilityRunnable;
    private WeakReference<ViewTreeObserver> weakViewTreeObserver;
    public static final MC Companion = new MC(null);
    private static final String TAG = QC.class.getSimpleName();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QC(Context context) {
        this(context, new WeakHashMap(10), new Handler());
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final boolean m197_init_$lambda0(QC qc) {
        AbstractC2995aW.q(qc, "this$0");
        qc.scheduleVisibilityCheck();
        return true;
    }

    private final View getTopView(Context context, View view) {
        View viewFindViewById = context instanceof Activity ? ((Activity) context).getWindow().getDecorView().findViewById(R.id.content) : null;
        if (viewFindViewById != null || view == null) {
            return viewFindViewById;
        }
        if (!ViewCompat.isAttachedToWindow(view)) {
            C4829vJ c4829vJ = C4917wJ.Companion;
            String str = TAG;
            AbstractC2995aW.p(str, "TAG");
            c4829vJ.w(str, "Trying to call View#rootView() on an unattached View.");
        }
        View rootView = view.getRootView();
        if (rootView != null) {
            viewFindViewById = rootView.findViewById(R.id.content);
        }
        return viewFindViewById == null ? rootView : viewFindViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVisible(View view, int i) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null) {
            return false;
        }
        ViewParent parent = view.getParent();
        while (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getVisibility() != 0) {
                C4917wJ.Companion.w("ImpressionTracker", "Parent visibility is not visible: " + parent);
                return false;
            }
            parent = viewGroup.getParent();
        }
        if (!view.getGlobalVisibleRect(this.clipRect)) {
            return false;
        }
        long jHeight = ((long) this.clipRect.height()) * ((long) this.clipRect.width());
        long height = ((long) view.getHeight()) * ((long) view.getWidth());
        return height > 0 && ((long) 100) * jHeight >= ((long) i) * height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleVisibilityCheck() {
        if (this.isVisibilityScheduled) {
            return;
        }
        this.isVisibilityScheduled = true;
        this.visibilityHandler.postDelayed(this.visibilityRunnable, 100L);
    }

    private final boolean setViewTreeObserver(Context context, View view) {
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            return true;
        }
        View topView = getTopView(context, view);
        if (topView == null) {
            C4829vJ c4829vJ = C4917wJ.Companion;
            String str = TAG;
            AbstractC2995aW.p(str, "TAG");
            c4829vJ.d(str, "Unable to set ViewTreeObserver due to no available root view.");
            return false;
        }
        ViewTreeObserver viewTreeObserver2 = topView.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            this.weakViewTreeObserver = new WeakReference<>(viewTreeObserver2);
            viewTreeObserver2.addOnPreDrawListener(this.onPreDrawListener);
            return true;
        }
        C4829vJ c4829vJ2 = C4917wJ.Companion;
        String str2 = TAG;
        AbstractC2995aW.p(str2, "TAG");
        c4829vJ2.d(str2, "The root view tree observer was not alive");
        return false;
    }

    public final void addView(View view, NC nc) {
        AbstractC2995aW.q(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.setViewTreeObserverSucceed = setViewTreeObserver(view.getContext(), view);
        OC oc = this.trackedViews.get(view);
        if (oc == null) {
            oc = new OC();
            this.trackedViews.put(view, oc);
            scheduleVisibilityCheck();
        }
        oc.setMinViewablePercent(1);
        oc.setImpressionListener(nc);
    }

    public final void clear() {
        this.trackedViews.clear();
        this.visibilityHandler.removeMessages(0);
        this.isVisibilityScheduled = false;
    }

    public final void destroy() {
        clear();
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.onPreDrawListener);
        }
        this.weakViewTreeObserver.clear();
    }

    public final ViewTreeObserver.OnPreDrawListener getOnPreDrawListener() {
        return this.onPreDrawListener;
    }

    public final WeakReference<ViewTreeObserver> getWeakViewTreeObserver() {
        return this.weakViewTreeObserver;
    }

    @VisibleForTesting
    public final void removeView(View view) {
        AbstractC2995aW.q(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.trackedViews.remove(view);
    }

    public final void setWeakViewTreeObserver(WeakReference<ViewTreeObserver> weakReference) {
        AbstractC2995aW.q(weakReference, "<set-?>");
        this.weakViewTreeObserver = weakReference;
    }

    @VisibleForTesting
    public QC(Context context, Map<View, OC> map, Handler handler) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(map, "trackedViews");
        AbstractC2995aW.q(handler, "visibilityHandler");
        this.trackedViews = map;
        this.visibilityHandler = handler;
        this.clipRect = new Rect();
        this.visibilityRunnable = new PC(this);
        this.onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LC
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return QC.m197_init_$lambda0(this.f3344a);
            }
        };
        this.weakViewTreeObserver = new WeakReference<>(null);
        this.setViewTreeObserverSucceed = setViewTreeObserver(context, null);
    }

    @VisibleForTesting
    public static /* synthetic */ void getOnPreDrawListener$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWeakViewTreeObserver$annotations() {
    }
}
