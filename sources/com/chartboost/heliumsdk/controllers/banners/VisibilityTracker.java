package com.chartboost.heliumsdk.controllers.banners;

import A.ViewTreeObserverOnPreDrawListenerC0893h;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.chartboost.heliumsdk.utils.Dips;
import com.chartboost.heliumsdk.utils.LogController;
import com.p004ironsource.ch;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 +2\u00020\u0001:\u0002+,B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0002\u0010\rJ\b\u0010#\u001a\u00020$H\u0002J\u0006\u0010%\u001a\u00020$J\b\u0010&\u001a\u00020\u0011H\u0002J\b\u0010'\u001a\u00020\u0011H\u0002J\b\u0010(\u001a\u00020$H\u0002J\b\u0010)\u001a\u00020$H\u0002J\u0006\u0010*\u001a\u00020$R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/chartboost/heliumsdk/controllers/banners/VisibilityTracker;", "", "context", "Landroid/content/Context;", "trackedView", "Landroid/view/View;", "rootView", "minVisibleDips", "", "minVisibleMs", "visibilityCheckIntervalMs", "", "traversalLimit", "(Landroid/content/Context;Landroid/view/View;Landroid/view/View;IIJI)V", "cachedRect", "Landroid/graphics/Rect;", "isVisibilityTracked", "", "job", "Lkotlinx/coroutines/Job;", "preDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "startTimeMs", "Ljava/lang/Long;", "visibilityTrackerListener", "Lcom/chartboost/heliumsdk/controllers/banners/VisibilityTracker$VisibilityTrackerListener;", "getVisibilityTrackerListener", "()Lcom/chartboost/heliumsdk/controllers/banners/VisibilityTracker$VisibilityTrackerListener;", "setVisibilityTrackerListener", "(Lcom/chartboost/heliumsdk/controllers/banners/VisibilityTracker$VisibilityTrackerListener;)V", "weakActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakViewTreeObserver", "Landroid/view/ViewTreeObserver;", "cancelVisibilityCheck", "", "destroy", "hasRequiredTimeElapsed", ch.f24531n, "scheduleVisibilityCheck", "setViewTreeObserver", "start", "Companion", "VisibilityTrackerListener", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VisibilityTracker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int MIN_VISIBLE_DIPS = 1;
    public static final int MIN_VISIBLE_DURATION_MS = 0;
    public static final int TRAVERSAL_LIMIT = 25;
    public static final long VISIBILITY_CHECK_INTERVAL_MS = 100;
    private final Rect cachedRect;
    private boolean isVisibilityTracked;
    private Job job;
    private final int minVisibleDips;
    private final int minVisibleMs;
    private ViewTreeObserver.OnPreDrawListener preDrawListener;
    private final View rootView;
    private Long startTimeMs;
    private final View trackedView;
    private final int traversalLimit;
    private final long visibilityCheckIntervalMs;
    private VisibilityTrackerListener visibilityTrackerListener;
    private final WeakReference<Activity> weakActivity;
    private WeakReference<ViewTreeObserver> weakViewTreeObserver;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/chartboost/heliumsdk/controllers/banners/VisibilityTracker$Companion;", "", "()V", "MIN_VISIBLE_DIPS", "", "MIN_VISIBLE_DURATION_MS", "TRAVERSAL_LIMIT", "VISIBILITY_CHECK_INTERVAL_MS", "", "getTopmostView", "Landroid/view/View;", "context", "Landroid/content/Context;", "view", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final View getTopmostView(Context context, View view) {
            View rootView;
            Window window;
            View decorView;
            View viewFindViewById;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewFindViewById = decorView.findViewById(R.id.content)) != null) {
                return viewFindViewById;
            }
            View viewFindViewById2 = (view == null || (rootView = view.getRootView()) == null) ? null : rootView.findViewById(R.id.content);
            if (viewFindViewById2 != null) {
                return viewFindViewById2;
            }
            if (view != null) {
                return view.getRootView();
            }
            return null;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/chartboost/heliumsdk/controllers/banners/VisibilityTracker$VisibilityTrackerListener;", "", "onVisibilityThresholdMet", "", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface VisibilityTrackerListener {
        void onVisibilityThresholdMet();
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.banners.VisibilityTracker$scheduleVisibilityCheck$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.controllers.banners.VisibilityTracker$scheduleVisibilityCheck$2", f = "VisibilityTracker.kt", l = {165}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.banners.VisibilityTracker$scheduleVisibilityCheck$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "com.chartboost.heliumsdk.controllers.banners.VisibilityTracker$scheduleVisibilityCheck$2$1", f = "VisibilityTracker.kt", l = {166}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ VisibilityTracker this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(VisibilityTracker visibilityTracker, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = visibilityTracker;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.b(obj);
                    long j = this.this$0.visibilityCheckIntervalMs;
                    this.label = 1;
                    if (DelayKt.a(j, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                return Unit.f43263a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
            }
        }

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = VisibilityTracker.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.b(obj);
                coroutineScope = (CoroutineScope) this.L$0;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.b(obj);
            }
            while (CoroutineScopeKt.e(coroutineScope) && !VisibilityTracker.this.isVisibilityTracked) {
                if (VisibilityTracker.this.isViewVisible()) {
                    VisibilityTracker visibilityTracker = VisibilityTracker.this;
                    Long l2 = visibilityTracker.startTimeMs;
                    if (l2 == null) {
                        l2 = new Long(SystemClock.uptimeMillis());
                    }
                    visibilityTracker.startTimeMs = l2;
                    if (VisibilityTracker.this.hasRequiredTimeElapsed()) {
                        VisibilityTrackerListener visibilityTrackerListener = VisibilityTracker.this.getVisibilityTrackerListener();
                        if (visibilityTrackerListener != null) {
                            visibilityTrackerListener.onVisibilityThresholdMet();
                        }
                        VisibilityTracker.this.isVisibilityTracked = true;
                        break;
                    }
                }
                DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(VisibilityTracker.this, null);
                this.L$0 = coroutineScope;
                this.label = 1;
                if (BuildersKt.f(defaultIoScheduler, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    public VisibilityTracker(Context context, View trackedView, View rootView, int i2, int i3, long j, int i4) {
        Intrinsics.f(context, "context");
        Intrinsics.f(trackedView, "trackedView");
        Intrinsics.f(rootView, "rootView");
        this.trackedView = trackedView;
        this.rootView = rootView;
        this.minVisibleDips = i2;
        this.minVisibleMs = i3;
        this.visibilityCheckIntervalMs = j;
        this.traversalLimit = i4;
        this.weakActivity = new WeakReference<>(context instanceof Activity ? (Activity) context : null);
        this.weakViewTreeObserver = new WeakReference<>(null);
        this.preDrawListener = new ViewTreeObserverOnPreDrawListenerC0893h(this, 1);
        this.cachedRect = new Rect();
    }

    private final void cancelVisibilityCheck() {
        Job job = this.job;
        if (job != null) {
            job.a(null);
        }
        this.job = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasRequiredTimeElapsed() {
        Long l2 = this.startTimeMs;
        if (l2 != null) {
            if (SystemClock.uptimeMillis() - l2.longValue() >= this.minVisibleMs) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isViewVisible() {
        if (this.trackedView.getVisibility() == 0 && this.rootView.getParent() != null && this.trackedView.getWidth() > 0 && this.trackedView.getHeight() > 0) {
            int i2 = 0;
            for (ViewParent parent = this.trackedView.getParent(); parent != null && i2 < this.traversalLimit; parent = parent.getParent()) {
                if ((parent instanceof View) && ((View) parent).getVisibility() != 0) {
                    return false;
                }
                i2++;
            }
            if (!this.trackedView.getGlobalVisibleRect(this.cachedRect)) {
                return false;
            }
            Dips dips = Dips.INSTANCE;
            int iWidth = this.cachedRect.width();
            Context context = this.trackedView.getContext();
            Intrinsics.e(context, "trackedView.context");
            int iDipsToPixelsInt = dips.dipsToPixelsInt(iWidth, context);
            int iHeight = this.cachedRect.height();
            Context context2 = this.trackedView.getContext();
            Intrinsics.e(context2, "trackedView.context");
            if (dips.dipsToPixelsInt(iHeight, context2) * iDipsToPixelsInt >= this.minVisibleDips) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean preDrawListener$lambda$0(VisibilityTracker this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.scheduleVisibilityCheck();
        return true;
    }

    private final void scheduleVisibilityCheck() {
        if (this.job != null) {
            return;
        }
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        this.job = BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), new VisibilityTracker$scheduleVisibilityCheck$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.X), null, new AnonymousClass2(null), 2);
    }

    private final void setViewTreeObserver() {
        try {
            ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                return;
            }
        } catch (Exception unused) {
            LogController.INSTANCE.d("Exception when accessing view tree observer.");
        }
        View topmostView = INSTANCE.getTopmostView(this.weakActivity.get(), this.trackedView);
        ViewTreeObserver viewTreeObserver2 = topmostView != null ? topmostView.getViewTreeObserver() : null;
        if (viewTreeObserver2 == null) {
            return;
        }
        if (!viewTreeObserver2.isAlive()) {
            LogController.INSTANCE.i("Unable to set ViewTreeObserver since it is not alive");
        } else {
            this.weakViewTreeObserver = new WeakReference<>(viewTreeObserver2);
            viewTreeObserver2.addOnPreDrawListener(this.preDrawListener);
        }
    }

    public final void destroy() {
        cancelVisibilityCheck();
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.preDrawListener);
        }
        this.weakViewTreeObserver.clear();
        this.visibilityTrackerListener = null;
    }

    public final VisibilityTrackerListener getVisibilityTrackerListener() {
        return this.visibilityTrackerListener;
    }

    public final void setVisibilityTrackerListener(VisibilityTrackerListener visibilityTrackerListener) {
        this.visibilityTrackerListener = visibilityTrackerListener;
    }

    public final void start() {
        setViewTreeObserver();
    }
}
