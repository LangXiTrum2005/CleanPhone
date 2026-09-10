package com.google.firebase.sessions.settings;

import android.util.Log;
import androidx.datastore.core.DataStore;
import com.google.firebase.sessions.TimeProvider;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Singleton;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/settings/SettingsCacheImpl;", "Lcom/google/firebase/sessions/settings/SettingsCache;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SettingsCacheImpl implements SettingsCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f21175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeProvider f21176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DataStore f21177c;
    public final AtomicReference d;

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$1", f = "SettingsCache.kt", l = {73}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int X;

        /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        final /* synthetic */ class C02101 implements FlowCollector, FunctionAdapter {
            public final /* synthetic */ AtomicReference X;

            public C02101(AtomicReference atomicReference) {
                this.X = atomicReference;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                this.X.set((SessionConfigs) obj);
                Unit unit = Unit.f43263a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                return unit;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return getFunctionDelegate().equals(((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.X, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return SettingsCacheImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.X;
            if (i2 == 0) {
                ResultKt.b(obj);
                SettingsCacheImpl settingsCacheImpl = SettingsCacheImpl.this;
                Flow d = settingsCacheImpl.f21177c.getD();
                C02101 c02101 = new C02101(settingsCacheImpl.d);
                this.X = 1;
                if (d.collect(c02101, this) == coroutineSingletons) {
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

    public SettingsCacheImpl(CoroutineContext backgroundDispatcher, TimeProvider timeProvider, DataStore sessionConfigsDataStore) {
        Intrinsics.f(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.f(timeProvider, "timeProvider");
        Intrinsics.f(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.f21175a = backgroundDispatcher;
        this.f21176b = timeProvider;
        this.f21177c = sessionConfigsDataStore;
        this.d = new AtomicReference();
        BuildersKt.c(CoroutineScopeKt.a(backgroundDispatcher), null, null, new AnonymousClass1(null), 3);
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public final Double a() {
        return f().getSessionSamplingRate();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.firebase.sessions.settings.SettingsCache
    public final Object b(SessionConfigs sessionConfigs, ContinuationImpl continuationImpl) {
        SettingsCacheImpl$updateConfigs$1 settingsCacheImpl$updateConfigs$1;
        if (continuationImpl instanceof SettingsCacheImpl$updateConfigs$1) {
            settingsCacheImpl$updateConfigs$1 = (SettingsCacheImpl$updateConfigs$1) continuationImpl;
            int i2 = settingsCacheImpl$updateConfigs$1.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsCacheImpl$updateConfigs$1.Z = i2 - Integer.MIN_VALUE;
            } else {
                settingsCacheImpl$updateConfigs$1 = new SettingsCacheImpl$updateConfigs$1(this, continuationImpl);
            }
        } else {
            settingsCacheImpl$updateConfigs$1 = new SettingsCacheImpl$updateConfigs$1(this, continuationImpl);
        }
        Object obj = settingsCacheImpl$updateConfigs$1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = settingsCacheImpl$updateConfigs$1.Z;
        try {
            if (i3 == 0) {
                ResultKt.b(obj);
                DataStore dataStore = this.f21177c;
                SettingsCacheImpl$updateConfigs$2 settingsCacheImpl$updateConfigs$2 = new SettingsCacheImpl$updateConfigs$2(sessionConfigs, null);
                settingsCacheImpl$updateConfigs$1.Z = 1;
                if (dataStore.a(settingsCacheImpl$updateConfigs$2, settingsCacheImpl$updateConfigs$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
        } catch (IOException e2) {
            Log.w("FirebaseSessions", "Failed to update config values: " + e2);
        }
        return Unit.f43263a;
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public final boolean c() {
        Long cacheUpdatedTimeSeconds = f().getCacheUpdatedTimeSeconds();
        Integer cacheDurationSeconds = f().getCacheDurationSeconds();
        return cacheUpdatedTimeSeconds == null || cacheDurationSeconds == null || this.f21176b.a().getSeconds() - cacheUpdatedTimeSeconds.longValue() >= ((long) cacheDurationSeconds.intValue());
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public final Boolean d() {
        return f().getSessionsEnabled();
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public final Integer e() {
        return f().getSessionTimeoutSeconds();
    }

    public final SessionConfigs f() throws Throwable {
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == null) {
            Object objD = BuildersKt.d(EmptyCoroutineContext.X, new SettingsCacheImpl$sessionConfigs$1(this, null));
            while (!atomicReference.compareAndSet(null, objD) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        Intrinsics.e(obj, "get(...)");
        return (SessionConfigs) obj;
    }
}
