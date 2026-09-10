package androidx.p000activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.core.app.NotificationCompat;
import androidx.p001lifecycle.Lifecycle;
import androidx.p001lifecycle.arytenoidectomy;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;
import java.util.ListIterator;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.collections.impassible;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0004&(+.B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0003¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0003¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\fH\u0003¢\u0006\u0004\b%\u0010\u001bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00109¨\u0006<"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "Ljava/lang/Runnable;", "fallbackOnBackPressed", "Ltechnofreak/saneness;", "", "onHasEnabledCallbacksChanged", "<init>", "(Ljava/lang/Runnable;Ltechnofreak/saneness;)V", "(Ljava/lang/Runnable;)V", "Landroid/window/OnBackInvokedDispatcher;", "invoker", "", "kowloon", "(Landroid/window/OnBackInvokedDispatcher;)V", "Landroidx/activity/sealless;", "onBackPressedCallback", "impromptu", "(Landroidx/activity/sealless;)V", "Landroidx/activity/dern;", "cutely", "(Landroidx/activity/sealless;)Landroidx/activity/dern;", "Landroidx/lifecycle/arytenoidectomy;", "owner", "taiyuan", "(Landroidx/lifecycle/arytenoidectomy;Landroidx/activity/sealless;)V", "formularize", "()V", "shouldBeRegistered", "arytenoidectomy", "(Z)V", "monoploid", "Landroidx/activity/saneness;", "backEvent", "triweekly", "(Landroidx/activity/saneness;)V", "impassible", "apical", "attabal", "Ljava/lang/Runnable;", "saneness", "Ltechnofreak/saneness;", "Lkotlin/collections/impassible;", "dern", "Lkotlin/collections/impassible;", "onBackPressedCallbacks", "wireman", "Landroidx/activity/sealless;", "inProgressCallback", "Landroid/window/OnBackInvokedCallback;", "marial", "Landroid/window/OnBackInvokedCallback;", "onBackInvokedCallback", "beachfront", "Landroid/window/OnBackInvokedDispatcher;", "invokedDispatcher", "competently", "Z", "backInvokedCallbackRegistered", "hasEnabledCallbacks", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Runnable fallbackOnBackPressed;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public OnBackInvokedDispatcher invokedDispatcher;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public boolean backInvokedCallbackRegistered;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final impassible<sealless> onBackPressedCallbacks;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public boolean hasEnabledCallbacks;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public OnBackInvokedCallback onBackInvokedCallback;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final technofreak.saneness<Boolean> onHasEnabledCallbacksChanged;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public sealless inProgressCallback;

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$attabal;", "", "<init>", "()V", "dispatcher", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "callback", "", "wireman", "(Ljava/lang/Object;ILjava/lang/Object;)V", "marial", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "onBackInvoked", "Landroid/window/OnBackInvokedCallback;", "saneness", "(Lkotlin/jvm/functions/Function0;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f4450attabal = new attabal();

        public static final void dern(Function0 function0) {
            function0.invoke();
        }

        public final void marial(Object dispatcher, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }

        public final OnBackInvokedCallback saneness(final Function0<Unit> onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.kattegat
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.attabal.dern(onBackInvoked);
                }
            };
        }

        public final void wireman(Object dispatcher, int priority, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(priority, (OnBackInvokedCallback) callback);
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$dern;", "Landroidx/lifecycle/impassible;", "Landroidx/activity/dern;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/activity/sealless;", "onBackPressedCallback", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/Lifecycle;Landroidx/activity/sealless;)V", "Landroidx/lifecycle/arytenoidectomy;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "", "onStateChanged", "(Landroidx/lifecycle/arytenoidectomy;Landroidx/lifecycle/Lifecycle$Event;)V", "cancel", "()V", "kowloon", "Landroidx/lifecycle/Lifecycle;", "arytenoidectomy", "Landroidx/activity/sealless;", "monoploid", "Landroidx/activity/dern;", "currentCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class dern implements androidx.p001lifecycle.impassible, androidx.p000activity.dern {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public final sealless onBackPressedCallback;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final Lifecycle lifecycle;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public androidx.p000activity.dern currentCancellable;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f4454polloi;

        public dern(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, sealless onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f4454polloi = onBackPressedDispatcher;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = onBackPressedCallback;
            lifecycle.attabal(this);
        }

        @Override // androidx.p000activity.dern
        public void cancel() {
            this.lifecycle.wireman(this);
            this.onBackPressedCallback.removeCancellable(this);
            androidx.p000activity.dern dernVar = this.currentCancellable;
            if (dernVar != null) {
                dernVar.cancel();
            }
            this.currentCancellable = null;
        }

        @Override // androidx.p001lifecycle.impassible
        public void onStateChanged(arytenoidectomy source, Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == Lifecycle.Event.ON_START) {
                this.currentCancellable = this.f4454polloi.cutely(this.onBackPressedCallback);
                return;
            }
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.p000activity.dern dernVar = this.currentCancellable;
                if (dernVar != null) {
                    dernVar.cancel();
                }
            }
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\r\u001a\u00020\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$saneness;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/activity/saneness;", "", "onBackStarted", "onBackProgressed", "Lkotlin/Function0;", "onBackInvoked", "onBackCancelled", "Landroid/window/OnBackInvokedCallback;", "attabal", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final saneness f4455attabal = new saneness();

        /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"androidx/activity/OnBackPressedDispatcher$saneness$attabal", "Landroid/window/OnBackAnimationCallback;", "Landroid/window/BackEvent;", "backEvent", "", "onBackStarted", "(Landroid/window/BackEvent;)V", "onBackProgressed", "onBackInvoked", "()V", "onBackCancelled", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class attabal implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final /* synthetic */ Function1<androidx.p000activity.saneness, Unit> f4456attabal;

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f4457dern;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public final /* synthetic */ Function1<androidx.p000activity.saneness, Unit> f4458saneness;

            /* JADX INFO: renamed from: wireman, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f4459wireman;

            /* JADX WARN: Multi-variable type inference failed */
            public attabal(Function1<? super androidx.p000activity.saneness, Unit> function1, Function1<? super androidx.p000activity.saneness, Unit> function2, Function0<Unit> function0, Function0<Unit> function3) {
                this.f4456attabal = function1;
                this.f4458saneness = function2;
                this.f4457dern = function0;
                this.f4459wireman = function3;
            }

            public void onBackCancelled() {
                this.f4459wireman.invoke();
            }

            public void onBackInvoked() {
                this.f4457dern.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.f4458saneness.invoke(new androidx.p000activity.saneness(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.f4456attabal.invoke(new androidx.p000activity.saneness(backEvent));
            }
        }

        public final OnBackInvokedCallback attabal(Function1<? super androidx.p000activity.saneness, Unit> onBackStarted, Function1<? super androidx.p000activity.saneness, Unit> onBackProgressed, Function0<Unit> onBackInvoked, Function0<Unit> onBackCancelled) {
            Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
            Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
            return new attabal(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$wireman;", "Landroidx/activity/dern;", "Landroidx/activity/sealless;", "onBackPressedCallback", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/activity/sealless;)V", "", "cancel", "()V", "kowloon", "Landroidx/activity/sealless;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class wireman implements androidx.p000activity.dern {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f4460arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final sealless onBackPressedCallback;

        public wireman(OnBackPressedDispatcher onBackPressedDispatcher, sealless onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f4460arytenoidectomy = onBackPressedDispatcher;
            this.onBackPressedCallback = onBackPressedCallback;
        }

        @Override // androidx.p000activity.dern
        public void cancel() {
            this.f4460arytenoidectomy.onBackPressedCallbacks.remove(this.onBackPressedCallback);
            if (Intrinsics.wireman(this.f4460arytenoidectomy.inProgressCallback, this.onBackPressedCallback)) {
                this.onBackPressedCallback.handleOnBackCancelled();
                this.f4460arytenoidectomy.inProgressCallback = null;
            }
            this.onBackPressedCallback.removeCancellable(this);
            Function0<Unit> enabledChangedCallback$activity_release = this.onBackPressedCallback.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.onBackPressedCallback.setEnabledChangedCallback$activity_release(null);
        }
    }

    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void apical() {
        sealless seallessVarPrevious;
        sealless seallessVar = this.inProgressCallback;
        if (seallessVar == null) {
            impassible<sealless> impassibleVar = this.onBackPressedCallbacks;
            ListIterator<sealless> listIterator = impassibleVar.listIterator(impassibleVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    seallessVarPrevious = null;
                    break;
                }
                seallessVarPrevious = listIterator.previous();
            } while (!seallessVarPrevious.getIsEnabled());
            seallessVar = seallessVarPrevious;
        }
        this.inProgressCallback = null;
        if (seallessVar != null) {
            seallessVar.handleOnBackCancelled();
        }
    }

    public final void arytenoidectomy(boolean shouldBeRegistered) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.invokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (shouldBeRegistered && !this.backInvokedCallbackRegistered) {
            attabal.f4450attabal.wireman(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = true;
        } else {
            if (shouldBeRegistered || !this.backInvokedCallbackRegistered) {
                return;
            }
            attabal.f4450attabal.marial(onBackInvokedDispatcher, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = false;
        }
    }

    public final androidx.p000activity.dern cutely(sealless onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.onBackPressedCallbacks.add(onBackPressedCallback);
        wireman wiremanVar = new wireman(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(wiremanVar);
        monoploid();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCancellableCallback$1(this));
        return wiremanVar;
    }

    public final void formularize() {
        sealless seallessVarPrevious;
        sealless seallessVar = this.inProgressCallback;
        if (seallessVar == null) {
            impassible<sealless> impassibleVar = this.onBackPressedCallbacks;
            ListIterator<sealless> listIterator = impassibleVar.listIterator(impassibleVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    seallessVarPrevious = null;
                    break;
                }
                seallessVarPrevious = listIterator.previous();
            } while (!seallessVarPrevious.getIsEnabled());
            seallessVar = seallessVarPrevious;
        }
        this.inProgressCallback = null;
        if (seallessVar != null) {
            seallessVar.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void impassible(androidx.p000activity.saneness backEvent) {
        sealless seallessVarPrevious;
        sealless seallessVar = this.inProgressCallback;
        if (seallessVar == null) {
            impassible<sealless> impassibleVar = this.onBackPressedCallbacks;
            ListIterator<sealless> listIterator = impassibleVar.listIterator(impassibleVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    seallessVarPrevious = null;
                    break;
                }
                seallessVarPrevious = listIterator.previous();
            } while (!seallessVarPrevious.getIsEnabled());
            seallessVar = seallessVarPrevious;
        }
        if (seallessVar != null) {
            seallessVar.handleOnBackProgressed(backEvent);
        }
    }

    public final void impromptu(sealless onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        cutely(onBackPressedCallback);
    }

    public final void kowloon(OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.invokedDispatcher = invoker;
        arytenoidectomy(this.hasEnabledCallbacks);
    }

    public final void monoploid() {
        boolean z = this.hasEnabledCallbacks;
        impassible<sealless> impassibleVar = this.onBackPressedCallbacks;
        boolean z2 = false;
        if (impassibleVar == null || !impassibleVar.isEmpty()) {
            Iterator<sealless> it = impassibleVar.iterator();
            while (it.hasNext()) {
                if (it.next().getIsEnabled()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.hasEnabledCallbacks = z2;
        if (z2 != z) {
            technofreak.saneness<Boolean> sanenessVar = this.onHasEnabledCallbacksChanged;
            if (sanenessVar != null) {
                sanenessVar.accept(Boolean.valueOf(z2));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                arytenoidectomy(z2);
            }
        }
    }

    public final void taiyuan(arytenoidectomy owner, sealless onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new dern(this, lifecycle, onBackPressedCallback));
        monoploid();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCallback$1(this));
    }

    public final void triweekly(androidx.p000activity.saneness backEvent) {
        sealless seallessVarPrevious;
        impassible<sealless> impassibleVar = this.onBackPressedCallbacks;
        ListIterator<sealless> listIterator = impassibleVar.listIterator(impassibleVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                seallessVarPrevious = null;
                break;
            }
            seallessVarPrevious = listIterator.previous();
        } while (!seallessVarPrevious.getIsEnabled());
        sealless seallessVar = seallessVarPrevious;
        if (this.inProgressCallback != null) {
            apical();
        }
        this.inProgressCallback = seallessVar;
        if (seallessVar != null) {
            seallessVar.handleOnBackStarted(backEvent);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable, technofreak.saneness<Boolean> sanenessVar) {
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = sanenessVar;
        this.onBackPressedCallbacks = new impassible<>();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.onBackInvokedCallback = i >= 34 ? saneness.f4455attabal.attabal(new Function1<androidx.p000activity.saneness, Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.1
                {
                    super(1);
                }

                @Override // p002kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(androidx.p000activity.saneness sanenessVar2) {
                    invoke2(sanenessVar2);
                    return Unit.f29295attabal;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.p000activity.saneness backEvent) {
                    Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                    OnBackPressedDispatcher.this.triweekly(backEvent);
                }
            }, new Function1<androidx.p000activity.saneness, Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.2
                {
                    super(1);
                }

                @Override // p002kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(androidx.p000activity.saneness sanenessVar2) {
                    invoke2(sanenessVar2);
                    return Unit.f29295attabal;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.p000activity.saneness backEvent) {
                    Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                    OnBackPressedDispatcher.this.impassible(backEvent);
                }
            }, new Function0<Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.3
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f29295attabal;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnBackPressedDispatcher.this.formularize();
                }
            }, new Function0<Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.4
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f29295attabal;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnBackPressedDispatcher.this.apical();
                }
            }) : attabal.f4450attabal.saneness(new Function0<Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.5
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f29295attabal;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnBackPressedDispatcher.this.formularize();
                }
            });
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : runnable);
    }
}
