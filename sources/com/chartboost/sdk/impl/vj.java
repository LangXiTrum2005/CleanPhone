package com.chartboost.sdk.impl;

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
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
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
public final class vj {
    public static final a r = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f15431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f15432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15433c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15434e;
    public final int f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f15435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f15436i;
    public Job j;
    public WeakReference k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ViewTreeObserver.OnPreDrawListener f15437l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Long f15438n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Long f15439p;
    public final Rect q;

    public static final class a {
        public a() {
        }

        public final View a(Context context, View view) {
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

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public interface b {
        void a();
    }

    public static final class c extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public c(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            za.a("Visibility check ran into a problem: " + th, (Throwable) null, 2, (Object) null);
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15441c;

        public static final class a extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f15442b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ vj f15443c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(vj vjVar, Continuation continuation) {
                super(2, continuation);
                this.f15443c = vjVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f15443c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                int i2 = this.f15442b;
                if (i2 == 0) {
                    ResultKt.b(obj);
                    long j = this.f15443c.f15434e;
                    this.f15442b = 1;
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
        }

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = vj.this.new d(continuation);
            dVar.f15441c = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f15440b;
            if (i2 == 0) {
                ResultKt.b(obj);
                coroutineScope = (CoroutineScope) this.f15441c;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.f15441c;
                ResultKt.b(obj);
            }
            while (CoroutineScopeKt.e(coroutineScope) && (!vj.this.m || (vj.this.g && !vj.this.o))) {
                if (!vj.this.m && vj.this.f()) {
                    vj vjVar = vj.this;
                    Long l2 = vjVar.f15438n;
                    if (l2 == null) {
                        l2 = new Long(SystemClock.uptimeMillis());
                    }
                    vjVar.f15438n = l2;
                    if (vj.this.d()) {
                        vj.this.m = true;
                        if (!vj.this.g || vj.this.o) {
                            b bVarC = vj.this.c();
                            if (bVarC == null) {
                                break;
                            }
                            bVarC.a();
                            break;
                        }
                    }
                } else if (!vj.this.m) {
                    vj.this.f15438n = null;
                }
                if (vj.this.g && !vj.this.o) {
                    if (!vj.this.e()) {
                        vj.this.f15439p = null;
                    } else if (vj.this.f15439p != null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        Long l3 = vj.this.f15439p;
                        Intrinsics.c(l3);
                        if (jUptimeMillis - l3.longValue() >= 2000) {
                            vj.this.o = true;
                            if (vj.this.m) {
                                b bVarC2 = vj.this.c();
                                if (bVarC2 == null) {
                                    break;
                                }
                                bVarC2.a();
                                break;
                            }
                        }
                    } else {
                        vj.this.f15439p = new Long(SystemClock.uptimeMillis());
                    }
                }
                DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
                a aVar = new a(vj.this, null);
                this.f15441c = coroutineScope;
                this.f15440b = 1;
                if (BuildersKt.f(defaultIoScheduler, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f43263a;
        }
    }

    public vj(Context context, View trackedView, View rootView, int i2, int i3, long j, int i4, boolean z2) {
        Intrinsics.f(context, "context");
        Intrinsics.f(trackedView, "trackedView");
        Intrinsics.f(rootView, "rootView");
        this.f15431a = trackedView;
        this.f15432b = rootView;
        this.f15433c = i2;
        this.d = i3;
        this.f15434e = j;
        this.f = i4;
        this.g = z2;
        this.f15436i = new WeakReference(context instanceof Activity ? (Activity) context : null);
        this.k = new WeakReference(null);
        this.f15437l = new ViewTreeObserverOnPreDrawListenerC0893h(this, 3);
        this.q = new Rect();
    }

    public static final boolean j(vj this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.g();
        return true;
    }

    public final b c() {
        return this.f15435h;
    }

    public final boolean d() {
        Long l2 = this.f15438n;
        if (l2 != null) {
            return SystemClock.uptimeMillis() - l2.longValue() >= ((long) this.d);
        }
        return false;
    }

    public final boolean e() {
        if (this.f15431a.getVisibility() != 0 || this.f15432b.getParent() == null || this.f15431a.getWidth() <= 0 || this.f15431a.getHeight() <= 0 || !this.f15431a.getGlobalVisibleRect(this.q)) {
            return false;
        }
        return ((float) (this.q.height() * this.q.width())) / ((float) (this.f15431a.getHeight() * this.f15431a.getWidth())) >= 0.5f;
    }

    public final boolean f() {
        if (this.f15431a.getVisibility() == 0 && this.f15432b.getParent() != null && this.f15431a.getWidth() > 0 && this.f15431a.getHeight() > 0) {
            int i2 = 0;
            for (ViewParent parent = this.f15431a.getParent(); parent != null && i2 < this.f; parent = parent.getParent()) {
                if ((parent instanceof View) && ((View) parent).getVisibility() != 0) {
                    return false;
                }
                i2++;
            }
            if (!this.f15431a.getGlobalVisibleRect(this.q)) {
                return false;
            }
            int iWidth = this.q.width();
            Context context = this.f15431a.getContext();
            Intrinsics.e(context, "getContext(...)");
            int iA = a(iWidth, context);
            int iHeight = this.q.height();
            Context context2 = this.f15431a.getContext();
            Intrinsics.e(context2, "getContext(...)");
            if (a(iHeight, context2) * iA >= this.f15433c) {
                return true;
            }
        }
        return false;
    }

    public final void g() {
        if (this.j != null) {
            return;
        }
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        this.j = BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), new c(CoroutineExceptionHandler.Key.X), null, new d(null), 2);
    }

    public final void h() {
        try {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.k.get();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                return;
            }
        } catch (Exception unused) {
            za.a("Exception when accessing view tree observer.", (Throwable) null, 2, (Object) null);
        }
        View viewA = r.a((Context) this.f15436i.get(), this.f15431a);
        ViewTreeObserver viewTreeObserver2 = viewA != null ? viewA.getViewTreeObserver() : null;
        if (viewTreeObserver2 == null) {
            return;
        }
        if (!viewTreeObserver2.isAlive()) {
            za.b("Unable to set ViewTreeObserver since it is not alive", (Throwable) null, 2, (Object) null);
        } else {
            this.k = new WeakReference(viewTreeObserver2);
            viewTreeObserver2.addOnPreDrawListener(this.f15437l);
        }
    }

    public final void i() {
        h();
    }

    public final void a() {
        Job job = this.j;
        if (job != null) {
            job.a(null);
        }
        this.j = null;
    }

    public final void b() {
        a();
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.k.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f15437l);
        }
        this.k.clear();
        this.f15435h = null;
    }

    public final int a(int i2, Context context) {
        return MathKt.b(i2 * context.getResources().getDisplayMetrics().density);
    }

    public final void a(b bVar) {
        this.f15435h = bVar;
    }

    public /* synthetic */ vj(Context context, View view, View view2, int i2, int i3, long j, int i4, boolean z2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, view, view2, i2, i3, j, i4, (i5 & 128) != 0 ? false : z2);
    }
}
