package com.chartboost.heliumsdk.utils;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/chartboost/heliumsdk/utils/FullscreenAdShowingState;", "", "()V", "isFullscreenAdShowing", "", "()Z", "setFullscreenAdShowing", "(Z)V", "observers", "", "Lcom/chartboost/heliumsdk/utils/FullscreenAdShowingState$FullscreenAdShowingStateObserver;", "notifyFullscreenAdClosed", "", "notifyFullscreenAdShown", "subscribe", "fullscreenAdShowingStateObserver", "unsubscribe", "FullscreenAdShowingStateObserver", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FullscreenAdShowingState {
    private boolean isFullscreenAdShowing;
    private final Set<FullscreenAdShowingStateObserver> observers = new LinkedHashSet();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/chartboost/heliumsdk/utils/FullscreenAdShowingState$FullscreenAdShowingStateObserver;", "", "onFullscreenAdDismissed", "", "onFullscreenAdShown", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface FullscreenAdShowingStateObserver {
        void onFullscreenAdDismissed();

        void onFullscreenAdShown();
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.utils.FullscreenAdShowingState$notifyFullscreenAdClosed$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.utils.FullscreenAdShowingState$notifyFullscreenAdClosed$1", f = "FullscreenAdShowingState.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FullscreenAdShowingStateObserver $observer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FullscreenAdShowingStateObserver fullscreenAdShowingStateObserver, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$observer = fullscreenAdShowingStateObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$observer, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            this.$observer.onFullscreenAdDismissed();
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.utils.FullscreenAdShowingState$notifyFullscreenAdShown$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.utils.FullscreenAdShowingState$notifyFullscreenAdShown$1", f = "FullscreenAdShowingState.kt", l = {}, m = "invokeSuspend")
    public static final class C10041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FullscreenAdShowingStateObserver $observer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10041(FullscreenAdShowingStateObserver fullscreenAdShowingStateObserver, Continuation<? super C10041> continuation) {
            super(2, continuation);
            this.$observer = fullscreenAdShowingStateObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C10041(this.$observer, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            this.$observer.onFullscreenAdShown();
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10041) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.utils.FullscreenAdShowingState$subscribe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.utils.FullscreenAdShowingState$subscribe$1", f = "FullscreenAdShowingState.kt", l = {}, m = "invokeSuspend")
    public static final class C10051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FullscreenAdShowingStateObserver $fullscreenAdShowingStateObserver;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10051(FullscreenAdShowingStateObserver fullscreenAdShowingStateObserver, Continuation<? super C10051> continuation) {
            super(2, continuation);
            this.$fullscreenAdShowingStateObserver = fullscreenAdShowingStateObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FullscreenAdShowingState.this.new C10051(this.$fullscreenAdShowingStateObserver, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            FullscreenAdShowingState.this.observers.add(this.$fullscreenAdShowingStateObserver);
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10051) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.utils.FullscreenAdShowingState$unsubscribe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.utils.FullscreenAdShowingState$unsubscribe$1", f = "FullscreenAdShowingState.kt", l = {}, m = "invokeSuspend")
    public static final class C10061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FullscreenAdShowingStateObserver $fullscreenAdShowingStateObserver;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10061(FullscreenAdShowingStateObserver fullscreenAdShowingStateObserver, Continuation<? super C10061> continuation) {
            super(2, continuation);
            this.$fullscreenAdShowingStateObserver = fullscreenAdShowingStateObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FullscreenAdShowingState.this.new C10061(this.$fullscreenAdShowingStateObserver, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            FullscreenAdShowingState.this.observers.remove(this.$fullscreenAdShowingStateObserver);
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10061) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX INFO: renamed from: isFullscreenAdShowing, reason: from getter */
    public final boolean getIsFullscreenAdShowing() {
        return this.isFullscreenAdShowing;
    }

    public final void notifyFullscreenAdClosed() {
        this.isFullscreenAdShowing = false;
        for (FullscreenAdShowingStateObserver fullscreenAdShowingStateObserver : this.observers) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a.j0()), null, null, new AnonymousClass1(fullscreenAdShowingStateObserver, null), 3);
        }
    }

    public final void notifyFullscreenAdShown() {
        this.isFullscreenAdShowing = true;
        for (FullscreenAdShowingStateObserver fullscreenAdShowingStateObserver : this.observers) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a.j0()), null, null, new C10041(fullscreenAdShowingStateObserver, null), 3);
        }
    }

    public final void setFullscreenAdShowing(boolean z2) {
        this.isFullscreenAdShowing = z2;
    }

    public final void subscribe(FullscreenAdShowingStateObserver fullscreenAdShowingStateObserver) {
        Intrinsics.f(fullscreenAdShowingStateObserver, "fullscreenAdShowingStateObserver");
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a.j0()), null, null, new C10051(fullscreenAdShowingStateObserver, null), 3);
    }

    public final void unsubscribe(FullscreenAdShowingStateObserver fullscreenAdShowingStateObserver) {
        Intrinsics.f(fullscreenAdShowingStateObserver, "fullscreenAdShowingStateObserver");
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a.j0()), null, null, new C10061(fullscreenAdShowingStateObserver, null), 3);
    }
}
