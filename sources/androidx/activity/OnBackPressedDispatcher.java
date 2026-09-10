package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "Api33Impl", "Api34Impl", "LifecycleOnBackPressedCancellable", "OnBackPressedCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f3231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f3232b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OnBackPressedCallback f3233c;
    public final OnBackInvokedCallback d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f3234e;
    public boolean f;
    public boolean g;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api33Impl;", "", "dispatcher", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "callback", "", "b", "(Ljava/lang/Object;ILjava/lang/Object;)V", "c", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "onBackInvoked", "Landroid/window/OnBackInvokedCallback;", "a", "(Lkotlin/jvm/functions/Function0;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api33Impl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Api33Impl f3235a = new Api33Impl();

        public final OnBackInvokedCallback a(final Function0<Unit> onBackInvoked) {
            Intrinsics.f(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.e
                public final void onBackInvoked() {
                    Function0 onBackInvoked2 = onBackInvoked;
                    Intrinsics.f(onBackInvoked2, "$onBackInvoked");
                    onBackInvoked2.invoke();
                }
            };
        }

        public final void b(Object dispatcher, int priority, Object callback) {
            Intrinsics.f(dispatcher, "dispatcher");
            Intrinsics.f(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(priority, (OnBackInvokedCallback) callback);
        }

        public final void c(Object dispatcher, Object callback) {
            Intrinsics.f(dispatcher, "dispatcher");
            Intrinsics.f(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001Jq\u0010\u000e\u001a\u00020\r2!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api34Impl;", "", "Lkotlin/Function1;", "Landroidx/activity/BackEventCompat;", "Lkotlin/ParameterName;", "name", "backEvent", "", "onBackStarted", "onBackProgressed", "Lkotlin/Function0;", "onBackInvoked", "onBackCancelled", "Landroid/window/OnBackInvokedCallback;", "a", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api34Impl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Api34Impl f3236a = new Api34Impl();

        public final OnBackInvokedCallback a(final Function1<? super BackEventCompat, Unit> onBackStarted, final Function1<? super BackEventCompat, Unit> onBackProgressed, final Function0<Unit> onBackInvoked, final Function0<Unit> onBackCancelled) {
            Intrinsics.f(onBackStarted, "onBackStarted");
            Intrinsics.f(onBackProgressed, "onBackProgressed");
            Intrinsics.f(onBackInvoked, "onBackInvoked");
            Intrinsics.f(onBackCancelled, "onBackCancelled");
            return new OnBackAnimationCallback() { // from class: androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1
                public final void onBackCancelled() {
                    onBackCancelled.invoke();
                }

                public final void onBackInvoked() {
                    onBackInvoked.invoke();
                }

                public final void onBackProgressed(BackEvent backEvent) {
                    Intrinsics.f(backEvent, "backEvent");
                    onBackProgressed.invoke(new BackEventCompat(backEvent));
                }

                public final void onBackStarted(BackEvent backEvent) {
                    Intrinsics.f(backEvent, "backEvent");
                    onBackStarted.invoke(new BackEventCompat(backEvent));
                }
            };
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/activity/Cancellable;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {
        public final Lifecycle X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final OnBackPressedCallback f3240Y;
        public Cancellable Z;
        public final /* synthetic */ OnBackPressedDispatcher e0;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
            Intrinsics.f(onBackPressedCallback, "onBackPressedCallback");
            this.e0 = onBackPressedDispatcher;
            this.X = lifecycle;
            this.f3240Y = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // androidx.activity.Cancellable
        public final void cancel() {
            this.X.c(this);
            this.f3240Y.removeCancellable(this);
            Cancellable cancellable = this.Z;
            if (cancellable != null) {
                ((OnBackPressedCancellable) cancellable).cancel();
            }
            this.Z = null;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                this.Z = this.e0.b(this.f3240Y);
            } else if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                Cancellable cancellable = this.Z;
                if (cancellable != null) {
                    ((OnBackPressedCancellable) cancellable).cancel();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$OnBackPressedCancellable;", "Landroidx/activity/Cancellable;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class OnBackPressedCancellable implements Cancellable {
        public final OnBackPressedCallback X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f3241Y;

        public OnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback) {
            Intrinsics.f(onBackPressedCallback, "onBackPressedCallback");
            this.f3241Y = onBackPressedDispatcher;
            this.X = onBackPressedCallback;
        }

        @Override // androidx.activity.Cancellable
        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f3241Y;
            ArrayDeque arrayDeque = onBackPressedDispatcher.f3232b;
            OnBackPressedCallback onBackPressedCallback = this.X;
            arrayDeque.remove(onBackPressedCallback);
            if (Intrinsics.a(onBackPressedDispatcher.f3233c, onBackPressedCallback)) {
                onBackPressedCallback.handleOnBackCancelled();
                onBackPressedDispatcher.f3233c = null;
            }
            onBackPressedCallback.removeCancellable(this);
            Function0<Unit> enabledChangedCallback$activity_release = onBackPressedCallback.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            onBackPressedCallback.setEnabledChangedCallback$activity_release(null);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f3231a = runnable;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.d = i2 >= 34 ? Api34Impl.f3236a.a(new Function1<BackEventCompat, Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object objPrevious;
                    BackEventCompat backEvent = (BackEventCompat) obj;
                    Intrinsics.f(backEvent, "backEvent");
                    OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                    ArrayDeque arrayDeque = onBackPressedDispatcher.f3232b;
                    ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.getF43279Y());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator.previous();
                    } while (!((OnBackPressedCallback) objPrevious).getIsEnabled());
                    OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) objPrevious;
                    onBackPressedDispatcher.f3233c = onBackPressedCallback;
                    if (onBackPressedCallback != null) {
                        onBackPressedCallback.handleOnBackStarted(backEvent);
                    }
                    return Unit.f43263a;
                }
            }, new Function1<BackEventCompat, Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object objPrevious;
                    BackEventCompat backEvent = (BackEventCompat) obj;
                    Intrinsics.f(backEvent, "backEvent");
                    ArrayDeque arrayDeque = OnBackPressedDispatcher.this.f3232b;
                    ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.getF43279Y());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator.previous();
                    } while (!((OnBackPressedCallback) objPrevious).getIsEnabled());
                    OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) objPrevious;
                    if (onBackPressedCallback != null) {
                        onBackPressedCallback.handleOnBackProgressed(backEvent);
                    }
                    return Unit.f43263a;
                }
            }, new Function0<Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    OnBackPressedDispatcher.this.c();
                    return Unit.f43263a;
                }
            }, new Function0<Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Object objPrevious;
                    OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                    ArrayDeque arrayDeque = onBackPressedDispatcher.f3232b;
                    ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.getF43279Y());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator.previous();
                    } while (!((OnBackPressedCallback) objPrevious).getIsEnabled());
                    OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) objPrevious;
                    onBackPressedDispatcher.f3233c = null;
                    if (onBackPressedCallback != null) {
                        onBackPressedCallback.handleOnBackCancelled();
                    }
                    return Unit.f43263a;
                }
            }) : Api33Impl.f3235a.a(new Function0<Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    OnBackPressedDispatcher.this.c();
                    return Unit.f43263a;
                }
            });
        }
    }

    public final void a(LifecycleOwner lifecycleOwner, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.f(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getD() == Lifecycle.State.X) {
            return;
        }
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        e();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCallback$1(0, this, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0));
    }

    public final Cancellable b(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.f(onBackPressedCallback, "onBackPressedCallback");
        this.f3232b.addLast(onBackPressedCallback);
        OnBackPressedCancellable onBackPressedCancellable = new OnBackPressedCancellable(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(onBackPressedCancellable);
        e();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCancellableCallback$1(0, this, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0));
        return onBackPressedCancellable;
    }

    public final void c() {
        Object objPrevious;
        ArrayDeque arrayDeque = this.f3232b;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.getF43279Y());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((OnBackPressedCallback) objPrevious).getIsEnabled());
        OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) objPrevious;
        this.f3233c = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackPressed();
        } else {
            this.f3231a.run();
        }
    }

    public final void d(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f3234e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        Api33Impl api33Impl = Api33Impl.f3235a;
        if (z2 && !this.f) {
            api33Impl.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z2 || !this.f) {
                return;
            }
            api33Impl.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void e() {
        boolean z2 = this.g;
        boolean z3 = false;
        ArrayDeque arrayDeque = this.f3232b;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            Iterator<E> it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (((OnBackPressedCallback) it.next()).getIsEnabled()) {
                    z3 = true;
                    break;
                }
            }
        }
        this.g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z3);
    }
}
