package com.facebook.appevents.suggestedevents;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.appevents.codeless.internal.SensitiveUserDataUtils;
import com.facebook.appevents.internal.AppEventUtility;
import com.mbridge.msdk.config.component.info.provider.subprovider.f;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import v7.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/facebook/appevents/suggestedevents/ViewObserver;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Lwj/r;", "startTracking", "()V", "stopTracking", "process", "onGlobalLayout", "Ljava/lang/ref/WeakReference;", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "Landroid/os/Handler;", "uiThreadHandler", "Landroid/os/Handler;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTracking", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ViewObserver implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final int MAX_TEXT_LENGTH = 300;
    private final WeakReference<Activity> activityWeakReference;
    private final AtomicBoolean isTracking;
    private final Handler uiThreadHandler;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<Integer, ViewObserver> observers = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/facebook/appevents/suggestedevents/ViewObserver$Companion;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Lwj/r;", "startTrackingActivity", "(Landroid/app/Activity;)V", "stopTrackingActivity", "", "MAX_TEXT_LENGTH", "I", "", "Lcom/facebook/appevents/suggestedevents/ViewObserver;", "observers", "Ljava/util/Map;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final void startTrackingActivity(Activity activity) {
            n.f(activity, "activity");
            int iHashCode = activity.hashCode();
            Map mapAccess$getObservers$cp = ViewObserver.access$getObservers$cp();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object viewObserver = mapAccess$getObservers$cp.get(numValueOf);
            if (viewObserver == null) {
                viewObserver = new ViewObserver(activity, null);
                mapAccess$getObservers$cp.put(numValueOf, viewObserver);
            }
            ViewObserver.access$startTracking((ViewObserver) viewObserver);
        }

        public final void stopTrackingActivity(Activity activity) {
            n.f(activity, "activity");
            ViewObserver viewObserver = (ViewObserver) ViewObserver.access$getObservers$cp().remove(Integer.valueOf(activity.hashCode()));
            if (viewObserver != null) {
                ViewObserver.access$stopTracking(viewObserver);
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ ViewObserver(Activity activity, g gVar) {
        this(activity);
    }

    public static final /* synthetic */ Map access$getObservers$cp() {
        if (a.b(ViewObserver.class)) {
            return null;
        }
        try {
            return observers;
        } catch (Throwable th2) {
            a.a(ViewObserver.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ void access$startTracking(ViewObserver viewObserver) {
        if (a.b(ViewObserver.class)) {
            return;
        }
        try {
            viewObserver.startTracking();
        } catch (Throwable th2) {
            a.a(ViewObserver.class, th2);
        }
    }

    public static final /* synthetic */ void access$stopTracking(ViewObserver viewObserver) {
        if (a.b(ViewObserver.class)) {
            return;
        }
        try {
            viewObserver.stopTracking();
        } catch (Throwable th2) {
            a.a(ViewObserver.class, th2);
        }
    }

    private final void process() {
        if (a.b(this)) {
            return;
        }
        try {
            f fVar = new f(this, 25);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                fVar.run();
            } else {
                this.uiThreadHandler.post(fVar);
            }
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void process$lambda$0(ViewObserver this$0) {
        if (a.b(ViewObserver.class)) {
            return;
        }
        try {
            n.f(this$0, "this$0");
            try {
                View rootView = AppEventUtility.getRootView(this$0.activityWeakReference.get());
                Activity activity = this$0.activityWeakReference.get();
                if (rootView != null && activity != null) {
                    for (View view : SuggestedEventViewHierarchy.getAllClickableViews(rootView)) {
                        if (!SensitiveUserDataUtils.isSensitiveUserData(view)) {
                            String textOfViewRecursively = SuggestedEventViewHierarchy.getTextOfViewRecursively(view);
                            if (textOfViewRecursively.length() > 0 && textOfViewRecursively.length() <= MAX_TEXT_LENGTH) {
                                ViewOnClickListener.Companion companion = ViewOnClickListener.INSTANCE;
                                String localClassName = activity.getLocalClassName();
                                n.e(localClassName, "activity.localClassName");
                                companion.attachListener$facebook_core_release(view, rootView, localClassName);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            a.a(ViewObserver.class, th2);
        }
    }

    private final void startTracking() {
        View rootView;
        if (a.b(this)) {
            return;
        }
        try {
            if (!this.isTracking.getAndSet(true) && (rootView = AppEventUtility.getRootView(this.activityWeakReference.get())) != null) {
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                    process();
                }
            }
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    public static final void startTrackingActivity(Activity activity) {
        if (a.b(ViewObserver.class)) {
            return;
        }
        try {
            INSTANCE.startTrackingActivity(activity);
        } catch (Throwable th2) {
            a.a(ViewObserver.class, th2);
        }
    }

    private final void stopTracking() {
        View rootView;
        if (a.b(this)) {
            return;
        }
        try {
            if (this.isTracking.getAndSet(false) && (rootView = AppEventUtility.getRootView(this.activityWeakReference.get())) != null) {
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    public static final void stopTrackingActivity(Activity activity) {
        if (a.b(ViewObserver.class)) {
            return;
        }
        try {
            INSTANCE.stopTrackingActivity(activity);
        } catch (Throwable th2) {
            a.a(ViewObserver.class, th2);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (a.b(this)) {
            return;
        }
        try {
            process();
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    private ViewObserver(Activity activity) {
        this.activityWeakReference = new WeakReference<>(activity);
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.isTracking = new AtomicBoolean(false);
    }
}
