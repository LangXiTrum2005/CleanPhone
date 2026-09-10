package com.chartboost.sdk.internal.interruption;

import android.app.Application;
import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.chartboost.sdk.impl.m6;
import com.chartboost.sdk.impl.ma;
import com.chartboost.sdk.impl.na;
import com.chartboost.sdk.impl.za;
import com.p004ironsource.d9;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class InterruptionController implements AudioManager.OnAudioFocusChangeListener {
    public static Context g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static AudioManager f15840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static AudioFocusRequest f15841i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterruptionController f15836a = new InterruptionController();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f15837b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f15838c = new LinkedHashSet();
    public static final List d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f15839e = new ArrayList();
    public static final List f = new ArrayList();
    public static ma j = new ma(0, 1, null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/internal/interruption/InterruptionController$AppProcessLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "()V", d9.h.u0, "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStart", "onStop", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AppProcessLifecycleObserver implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AppProcessLifecycleObserver f15842a = new AppProcessLifecycleObserver();

        private AppProcessLifecycleObserver() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            super.onCreate(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
            super.onDestroy(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            super.onPause(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner owner) {
            Intrinsics.f(owner, "owner");
            synchronized (InterruptionController.f15837b) {
                Set set = InterruptionController.f15838c;
                com.chartboost.sdk.internal.interruption.a.C0183a c0183a = com.chartboost.sdk.internal.interruption.a.f15852b;
                if (!set.contains(c0183a.a()) && InterruptionController.f15838c.contains(c0183a.b())) {
                    InterruptionController.f15836a.b(c0183a.b());
                }
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(LifecycleOwner owner) {
            Intrinsics.f(owner, "owner");
            InterruptionController.f15836a.b(com.chartboost.sdk.internal.interruption.a.f15852b.a());
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(LifecycleOwner owner) {
            Intrinsics.f(owner, "owner");
            InterruptionController.f15836a.a(com.chartboost.sdk.internal.interruption.a.f15852b.a());
        }
    }

    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15843b;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f15843b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.j0;
            ProcessLifecycleOwner.j0.g0.a(AppProcessLifecycleObserver.f15842a);
            za.c("InterruptionController initialized with ProcessLifecycleOwner.", null, 2, null);
            return Unit.f43263a;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f15845c;

        public static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f15846b = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(WeakReference it) {
                Intrinsics.f(it, "it");
                return Boolean.valueOf(it.get() == null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z2, Continuation continuation) {
            super(2, continuation);
            this.f15845c = z2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f15845c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f15844b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Object obj2 = InterruptionController.f15837b;
            boolean z2 = this.f15845c;
            synchronized (obj2) {
                try {
                    CollectionsKt.Q(InterruptionController.f15839e, a.f15846b);
                    Iterator it = InterruptionController.f15839e.iterator();
                    while (it.hasNext()) {
                        m6 m6Var = (m6) ((WeakReference) it.next()).get();
                        if (m6Var != null) {
                            m6Var.b(z2);
                        }
                    }
                    za.c((z2 ? "Ducking" : "Restoring") + " ad audio volume", null, 2, null);
                    unit = Unit.f43263a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return unit;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Set f15848c;

        public static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f15849b = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(WeakReference it) {
                Intrinsics.f(it, "it");
                return Boolean.valueOf(it.get() == null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Set set, Continuation continuation) {
            super(2, continuation);
            this.f15848c = set;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f15848c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f15847b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Object obj2 = InterruptionController.f15837b;
            Set set = this.f15848c;
            synchronized (obj2) {
                try {
                    CollectionsKt.Q(InterruptionController.d, a.f15849b);
                    Iterator it = InterruptionController.d.iterator();
                    while (it.hasNext()) {
                        na naVar = (na) ((WeakReference) it.next()).get();
                        if (naVar != null) {
                            naVar.a(set);
                        }
                    }
                    unit = Unit.f43263a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return unit;
        }
    }

    public static final class d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m6 f15850b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m6 m6Var) {
            super(1);
            this.f15850b = m6Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference it) {
            Intrinsics.f(it, "it");
            return Boolean.valueOf(it.get() == null || it.get() == this.f15850b);
        }
    }

    public static final class e extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ na f15851b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(na naVar) {
            super(1);
            this.f15851b = naVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference it) {
            Intrinsics.f(it, "it");
            return Boolean.valueOf(it.get() == null || it.get() == this.f15851b);
        }
    }

    public final void a(m6 listener) {
        Intrinsics.f(listener, "listener");
        synchronized (f15837b) {
            f15839e.add(new WeakReference(listener));
        }
    }

    public final void b(m6 listener) {
        Intrinsics.f(listener, "listener");
        synchronized (f15837b) {
            CollectionsKt.Q(f15839e, new d(listener));
        }
    }

    public final Set f() {
        Set setL0;
        synchronized (f15837b) {
            setL0 = CollectionsKt.l0(f15838c);
        }
        return setL0;
    }

    public final void g() {
        Set setF = f();
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new c(setF, null), 3);
    }

    public final int h() {
        int iRequestAudioFocus;
        Unit unit;
        AudioManager audioManager = f15840h;
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                androidx.media3.exoplayer.a.o();
                AudioFocusRequest audioFocusRequestBuild = androidx.media3.exoplayer.a.f(j.a()).setOnAudioFocusChangeListener(this).setWillPauseWhenDucked(true).build();
                f15841i = audioFocusRequestBuild;
                iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequestBuild);
            } else {
                iRequestAudioFocus = audioManager.requestAudioFocus(this, 3, j.a());
            }
            if (iRequestAudioFocus == 0) {
                za.b("Audio focus request FAILED.", (Throwable) null, 2, (Object) null);
            } else if (iRequestAudioFocus == 1) {
                za.c("Audio focus request GRANTED.", null, 2, null);
            } else if (iRequestAudioFocus != 2) {
                za.e("Audio focus request returned unknown result: " + iRequestAudioFocus, null, 2, null);
            } else {
                za.c("Audio focus request DELAYED.", null, 2, null);
            }
            unit = Unit.f43263a;
        } else {
            iRequestAudioFocus = 0;
            unit = null;
        }
        if (unit == null) {
            za.b("AudioManager is null, cannot request audio focus.", (Throwable) null, 2, (Object) null);
        }
        return iRequestAudioFocus;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i2) {
        if (i2 == -3) {
            a(true);
            return;
        }
        if (i2 == -2 || i2 == -1) {
            a(com.chartboost.sdk.internal.interruption.a.f15852b.b());
        } else {
            if (i2 != 1) {
                return;
            }
            a(false);
            b(com.chartboost.sdk.internal.interruption.a.f15852b.b());
        }
    }

    public final void a(na listener) {
        Intrinsics.f(listener, "listener");
        synchronized (f15837b) {
            d.add(new WeakReference(listener));
        }
    }

    public final void b(na listener) {
        Intrinsics.f(listener, "listener");
        synchronized (f15837b) {
            CollectionsKt.Q(d, new e(listener));
        }
    }

    public final void a(Application application, ma config) {
        Intrinsics.f(application, "application");
        Intrinsics.f(config, "config");
        Context applicationContext = application.getApplicationContext();
        Intrinsics.e(applicationContext, "getApplicationContext(...)");
        g = applicationContext;
        j = config;
        Object systemService = applicationContext.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager == null) {
            za.b("Failed to get AudioManager. Audio focus handling will be disabled.", (Throwable) null, 2, (Object) null);
            audioManager = null;
        }
        f15840h = audioManager;
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new a(null), 3);
    }

    public final void b(com.chartboost.sdk.internal.interruption.a aVar) {
        boolean zRemove;
        synchronized (f15837b) {
            zRemove = f15838c.remove(aVar);
        }
        if (zRemove) {
            za.c("Ad interruption ended: " + aVar, null, 2, null);
            g();
        }
    }

    public static /* synthetic */ void a(InterruptionController interruptionController, Application application, ma maVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            maVar = new ma(0, 1, null);
        }
        interruptionController.a(application, maVar);
    }

    public final void a() {
        AudioManager audioManager = f15840h;
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequest = f15841i;
                if (audioFocusRequest != null) {
                    za.c("Abandoning audio focus (API 26+).", null, 2, null);
                    audioManager.abandonAudioFocusRequest(audioFocusRequest);
                }
                f15841i = null;
                return;
            }
            za.c("Abandoning audio focus (API < 26).", null, 2, null);
            audioManager.abandonAudioFocus(this);
            return;
        }
        za.b("AudioManager is null, cannot abandon audio focus.", (Throwable) null, 2, (Object) null);
    }

    public final void a(com.chartboost.sdk.internal.interruption.a aVar) {
        boolean z2;
        synchronized (f15837b) {
            Set set = f15838c;
            z2 = set.isEmpty() || set.add(aVar);
        }
        if (z2) {
            za.c("Ad interruption began: " + aVar, null, 2, null);
            g();
        }
    }

    public final void a(boolean z2) {
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new b(z2, null), 3);
    }
}
