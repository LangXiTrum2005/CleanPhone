package com.vungle.ads.internal;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.core.view.premeiotic;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3474d8;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.internal.util.arytenoidectomy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ImpressionTracker.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 <2\u00020\u0001:\u0004=>?@B-\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\fJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0013¢\u0006\u0004\b \u0010\u0015J\r\u0010!\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\u0015R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010(\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u0015\u001a\u0004\b*\u0010+R0\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0-8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b/\u00100\u0012\u0004\b5\u0010\u0015\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0018\u00107\u001a\u000606R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:¨\u0006A"}, d2 = {"Lcom/vungle/ads/internal/marial;", "", "Landroid/content/Context;", "context", "", "Landroid/view/View;", "Lcom/vungle/ads/internal/marial$dern;", "trackedViews", "Landroid/os/Handler;", "visibilityHandler", "<init>", "(Landroid/content/Context;Ljava/util/Map;Landroid/os/Handler;)V", "(Landroid/content/Context;)V", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "setViewTreeObserver", "(Landroid/content/Context;Landroid/view/View;)Z", "getTopView", "(Landroid/content/Context;Landroid/view/View;)Landroid/view/View;", "", "scheduleVisibilityCheck", "()V", "", "minPercentageViewed", C3474d8.k, "(Landroid/view/View;I)Z", "Lcom/vungle/ads/internal/marial$saneness;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addView", "(Landroid/view/View;Lcom/vungle/ads/internal/marial$saneness;)V", "removeView", "(Landroid/view/View;)V", "clear", "destroy", "Ljava/util/Map;", "Landroid/os/Handler;", "Landroid/graphics/Rect;", "clipRect", "Landroid/graphics/Rect;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "getOnPreDrawListener", "()Landroid/view/ViewTreeObserver$OnPreDrawListener;", "getOnPreDrawListener$annotations", "Ljava/lang/ref/WeakReference;", "Landroid/view/ViewTreeObserver;", "weakViewTreeObserver", "Ljava/lang/ref/WeakReference;", "getWeakViewTreeObserver", "()Ljava/lang/ref/WeakReference;", "setWeakViewTreeObserver", "(Ljava/lang/ref/WeakReference;)V", "getWeakViewTreeObserver$annotations", "Lcom/vungle/ads/internal/marial$wireman;", "visibilityRunnable", "Lcom/vungle/ads/internal/marial$wireman;", "isVisibilityScheduled", "Z", "setViewTreeObserverSucceed", "Companion", "attabal", "saneness", "dern", "wireman", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class marial {
    private static final int MIN_VISIBILITY_PERCENTAGE = 1;
    private static final int VISIBILITY_THROTTLE_MILLIS = 100;
    private final Rect clipRect;
    private boolean isVisibilityScheduled;
    private final ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private boolean setViewTreeObserverSucceed;
    private final Map<View, dern> trackedViews;
    private final Handler visibilityHandler;
    private final wireman visibilityRunnable;
    private WeakReference<ViewTreeObserver> weakViewTreeObserver;
    private static final String TAG = marial.class.getSimpleName();

    /* JADX INFO: compiled from: ImpressionTracker.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/vungle/ads/internal/marial$dern;", "", "<init>", "()V", "", "minViewablePercent", "I", "getMinViewablePercent", "()I", "setMinViewablePercent", "(I)V", "Lcom/vungle/ads/internal/marial$saneness;", "impressionListener", "Lcom/vungle/ads/internal/marial$saneness;", "getImpressionListener", "()Lcom/vungle/ads/internal/marial$saneness;", "setImpressionListener", "(Lcom/vungle/ads/internal/marial$saneness;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class dern {
        private saneness impressionListener;
        private int minViewablePercent;

        public final saneness getImpressionListener() {
            return this.impressionListener;
        }

        public final int getMinViewablePercent() {
            return this.minViewablePercent;
        }

        public final void setImpressionListener(saneness sanenessVar) {
            this.impressionListener = sanenessVar;
        }

        public final void setMinViewablePercent(int i) {
            this.minViewablePercent = i;
        }
    }

    /* JADX INFO: compiled from: ImpressionTracker.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/marial$saneness;", "", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "onImpression", "(Landroid/view/View;)V", "onViewInvisible", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface saneness {
        void onImpression(View view);

        void onViewInvisible(View view);
    }

    /* JADX INFO: compiled from: ImpressionTracker.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/vungle/ads/internal/marial$wireman;", "Ljava/lang/Runnable;", "<init>", "(Lcom/vungle/ads/internal/marial;)V", "", "run", "()V", "Ljava/util/ArrayList;", "Landroid/view/View;", "visibleViews", "Ljava/util/ArrayList;", "invisibleViews", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class wireman implements Runnable {
        private final ArrayList<View> visibleViews = new ArrayList<>();
        private final ArrayList<View> invisibleViews = new ArrayList<>();

        public wireman() {
        }

        @Override // java.lang.Runnable
        public void run() {
            saneness impressionListener;
            saneness impressionListener2;
            marial.this.isVisibilityScheduled = false;
            for (Map.Entry entry : marial.this.trackedViews.entrySet()) {
                View view = (View) entry.getKey();
                if (marial.this.isVisible(view, ((dern) entry.getValue()).getMinViewablePercent())) {
                    this.visibleViews.add(view);
                } else {
                    this.invisibleViews.add(view);
                }
            }
            for (View view2 : this.visibleViews) {
                dern dernVar = (dern) marial.this.trackedViews.get(view2);
                if (dernVar != null && (impressionListener2 = dernVar.getImpressionListener()) != null) {
                    impressionListener2.onImpression(view2);
                }
                marial marialVar = marial.this;
                Intrinsics.checkNotNullExpressionValue(view2, "view");
                marialVar.removeView(view2);
            }
            this.visibleViews.clear();
            for (View view3 : this.invisibleViews) {
                dern dernVar2 = (dern) marial.this.trackedViews.get(view3);
                if (dernVar2 != null && (impressionListener = dernVar2.getImpressionListener()) != null) {
                    impressionListener.onViewInvisible(view3);
                }
            }
            this.invisibleViews.clear();
            if (marial.this.trackedViews.isEmpty() || marial.this.setViewTreeObserverSucceed) {
                return;
            }
            marial.this.scheduleVisibilityCheck();
        }
    }

    public marial(Context context, Map<View, dern> trackedViews, Handler visibilityHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(trackedViews, "trackedViews");
        Intrinsics.checkNotNullParameter(visibilityHandler, "visibilityHandler");
        this.trackedViews = trackedViews;
        this.visibilityHandler = visibilityHandler;
        this.clipRect = new Rect();
        this.visibilityRunnable = new wireman();
        this.onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.vungle.ads.internal.wireman
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return marial.m3232_init_$lambda0(this.f23816kowloon);
            }
        };
        this.weakViewTreeObserver = new WeakReference<>(null);
        this.setViewTreeObserverSucceed = setViewTreeObserver(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final boolean m3232_init_$lambda0(marial this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.scheduleVisibilityCheck();
        return true;
    }

    private final View getTopView(Context context, View view) {
        Window window;
        View decorView;
        View viewFindViewById = null;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && (decorView = window.getDecorView()) != null) {
            viewFindViewById = decorView.findViewById(R.id.content);
        }
        if (viewFindViewById == null && view != null) {
            if (!premeiotic.starveling(view)) {
                arytenoidectomy.Companion companion = arytenoidectomy.INSTANCE;
                String TAG2 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                companion.w(TAG2, "Trying to call View#rootView() on an unattached View.");
            }
            View rootView = view.getRootView();
            if (rootView != null) {
                viewFindViewById = rootView.findViewById(R.id.content);
            }
            if (viewFindViewById == null) {
                return rootView;
            }
        }
        return viewFindViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVisible(View view, int minPercentageViewed) {
        if (view != null && view.getVisibility() == 0 && view.getParent() != null) {
            ViewParent parent = view.getParent();
            while (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.getVisibility() != 0) {
                    arytenoidectomy.INSTANCE.w("ImpressionTracker", "Parent visibility is not visible: " + parent);
                    return false;
                }
                parent = viewGroup.getParent();
            }
            if (!view.getGlobalVisibleRect(this.clipRect)) {
                return false;
            }
            long jHeight = ((long) this.clipRect.height()) * ((long) this.clipRect.width());
            long height = ((long) view.getHeight()) * ((long) view.getWidth());
            if (height > 0 && ((long) 100) * jHeight >= ((long) minPercentageViewed) * height) {
                return true;
            }
        }
        return false;
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
            arytenoidectomy.Companion companion = arytenoidectomy.INSTANCE;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            companion.d(TAG2, "Unable to set ViewTreeObserver due to no available root view.");
            return false;
        }
        ViewTreeObserver viewTreeObserver2 = topView.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            this.weakViewTreeObserver = new WeakReference<>(viewTreeObserver2);
            viewTreeObserver2.addOnPreDrawListener(this.onPreDrawListener);
            return true;
        }
        arytenoidectomy.Companion companion2 = arytenoidectomy.INSTANCE;
        String TAG3 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
        companion2.d(TAG3, "The root view tree observer was not alive");
        return false;
    }

    public final void addView(View view, saneness listener) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.setViewTreeObserverSucceed = setViewTreeObserver(view.getContext(), view);
        dern dernVar = this.trackedViews.get(view);
        if (dernVar == null) {
            dernVar = new dern();
            this.trackedViews.put(view, dernVar);
            scheduleVisibilityCheck();
        }
        dernVar.setMinViewablePercent(1);
        dernVar.setImpressionListener(listener);
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

    public final void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.trackedViews.remove(view);
    }

    public final void setWeakViewTreeObserver(WeakReference<ViewTreeObserver> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.weakViewTreeObserver = weakReference;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public marial(Context context) {
        this(context, new WeakHashMap(10), new Handler(Looper.getMainLooper()));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getOnPreDrawListener$annotations() {
    }

    public static /* synthetic */ void getWeakViewTreeObserver$annotations() {
    }
}
