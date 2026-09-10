package com.chartboost.sdk.impl;

import android.view.View;
import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.media.Position;
import com.iab.omid.library.chartboost.adsession.media.VastProperties;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public class vb implements oj {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f15407i = new a(null);
    public static final AtomicInteger j = new AtomicInteger(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kj f15408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdSession f15409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdEvents f15410c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15411e;
    public qj f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CoroutineScope f15412h;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15413a;

        static {
            int[] iArr = new int[qj.values().length];
            try {
                iArr[qj.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qj.STARTED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qj.IMPRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[qj.STOPPED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f15413a = iArr;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15414b;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return vb.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f15414b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            try {
                vb.this.f15410c.loaded();
            } catch (Exception e2) {
                za.b("Signaling ad loaded for viewability failed.", e2);
            }
            return Unit.f43263a;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15416b;
        public final /* synthetic */ VastProperties d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(VastProperties vastProperties, Continuation continuation) {
            super(2, continuation);
            this.d = vastProperties;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return vb.this.new d(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f15416b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            try {
                vb.this.f15410c.loaded(this.d);
            } catch (Exception e2) {
                za.b("Signaling video loaded for viewability failed.", e2);
            }
            return Unit.f43263a;
        }
    }

    public static final class e extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15418b;
        public final /* synthetic */ Ref.BooleanRef d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Ref.BooleanRef booleanRef, Continuation continuation) {
            super(2, continuation);
            this.d = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return vb.this.new e(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f15418b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            try {
                vb.this.f15410c.impressionOccurred();
                vb.this.d = true;
                this.d.X = true;
            } catch (Exception e2) {
                za.b("Counting the viewability impression failed.", e2);
            }
            return Unit.f43263a;
        }
    }

    public static final class f extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15420b;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return vb.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f15420b;
            if (i2 == 0) {
                ResultKt.b(obj);
                this.f15420b = 1;
                if (DelayKt.a(100L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            try {
                vb.this.f15409b.finish();
            } catch (Exception e2) {
                za.b("Finishing the viewability ad session failed.", e2);
            }
            return Unit.f43263a;
        }
    }

    public vb(kj manager, AdSession adSession, AdEvents adEvents, View adView) {
        Intrinsics.f(manager, "manager");
        Intrinsics.f(adSession, "adSession");
        Intrinsics.f(adEvents, "adEvents");
        Intrinsics.f(adView, "adView");
        this.f15408a = manager;
        this.f15409b = adSession;
        this.f15410c = adEvents;
        this.f = qj.INIT;
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        this.f15412h = CoroutineScopeKt.a(MainDispatcherLoader.f45042a.j0());
        this.g = j.incrementAndGet();
        a(adView);
    }

    @Override // com.chartboost.sdk.impl.oj
    public void c() {
        a(qj.IMPRESSED);
    }

    public final CoroutineScope d() {
        return this.f15412h;
    }

    public final boolean e() {
        return this.f15411e;
    }

    @Override // com.chartboost.sdk.impl.oj
    public void b() {
        a(qj.STARTED);
    }

    public final void a(qj newState) {
        Intrinsics.f(newState, "newState");
        if (this.f15408a.isActive()) {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            int i2 = b.f15413a[newState.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            return;
                        }
                        qj qjVar = this.f;
                        if (qjVar != qj.INIT && qjVar != qj.STOPPED) {
                            BuildersKt.c(this.f15412h, null, null, new f(null), 3);
                            this.f15411e = false;
                            booleanRef.X = true;
                        }
                    } else {
                        if (this.d) {
                            return;
                        }
                        qj qjVar2 = this.f;
                        if (qjVar2 == qj.STARTED || qjVar2 == qj.STARTED_VIDEO) {
                            BuildersKt.c(this.f15412h, null, null, new e(booleanRef, null), 3);
                        }
                    }
                } else if (this.f == qj.INIT) {
                    try {
                        this.f15409b.start();
                        VastProperties vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                        Intrinsics.e(vastPropertiesCreateVastPropertiesForNonSkippableMedia, "createVastPropertiesForNonSkippableMedia(...)");
                        BuildersKt.c(this.f15412h, null, null, new d(vastPropertiesCreateVastPropertiesForNonSkippableMedia, null), 3);
                        this.f15411e = true;
                        booleanRef.X = true;
                    } catch (Exception e2) {
                        za.b("Ad session start for viewability failed.", e2);
                    }
                }
            } else if (this.f == qj.INIT) {
                try {
                    this.f15409b.start();
                    BuildersKt.c(this.f15412h, null, null, new c(null), 3);
                    this.f15411e = true;
                    booleanRef.X = true;
                } catch (Exception e3) {
                    za.b("Ad session start for viewability failed.", e3);
                }
            }
            if (booleanRef.X) {
                this.f = newState;
            }
        }
    }

    @Override // com.chartboost.sdk.impl.oj
    public void a(View view, mj purpose) {
        Intrinsics.f(view, "view");
        Intrinsics.f(purpose, "purpose");
        try {
            this.f15409b.addFriendlyObstruction(view, purpose.b(), null);
        } catch (Exception e2) {
            za.b("Adding a friendly obstruction failed.", e2);
        }
    }

    public final void a(View adView) {
        Intrinsics.f(adView, "adView");
        try {
            this.f15409b.registerAdView(adView);
        } catch (Exception e2) {
            za.b("Unable to register ad view.", e2);
        }
    }

    @Override // com.chartboost.sdk.impl.oj
    public void a() {
        a(qj.STOPPED);
    }

    @Override // com.chartboost.sdk.impl.oj
    public void a(float f2) {
        oj.a.a(this, f2);
    }
}
