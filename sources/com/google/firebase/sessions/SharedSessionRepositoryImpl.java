package com.google.firebase.sessions;

import android.util.Log;
import androidx.datastore.core.DataStore;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.thinkup.core.common.n.mo;
import java.util.Map;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;

/* JADX INFO: loaded from: classes4.dex */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/SharedSessionRepositoryImpl;", "Lcom/google/firebase/sessions/SharedSessionRepository;", "NotificationType", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SharedSessionRepositoryImpl implements SharedSessionRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SessionsSettings f21122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SessionGenerator f21123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SessionFirelogPublisher f21124c;
    public final TimeProvider d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DataStore f21125e;
    public final ProcessDataManager f;
    public final CoroutineContext g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SessionData f21126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21127i;
    public String j;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1", f = "SharedSessionRepository.kt", l = {94}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int X;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/google/firebase/sessions/SessionData;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1", f = "SharedSessionRepository.kt", l = {mo.oom.m0n}, m = "invokeSuspend")
        final class C02091 extends SuspendLambda implements Function3<FlowCollector<? super SessionData>, Throwable, Continuation<? super Unit>, Object> {
            public int X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public /* synthetic */ FlowCollector f21129Y;
            public /* synthetic */ Throwable Z;
            public final /* synthetic */ SharedSessionRepositoryImpl e0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02091(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, Continuation continuation) {
                super(3, continuation);
                this.e0 = sharedSessionRepositoryImpl;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                C02091 c02091 = new C02091(this.e0, (Continuation) obj3);
                c02091.f21129Y = (FlowCollector) obj;
                c02091.Z = (Throwable) obj2;
                return c02091.invokeSuspend(Unit.f43263a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                int i2 = this.X;
                if (i2 == 0) {
                    ResultKt.b(obj);
                    FlowCollector flowCollector = this.f21129Y;
                    Throwable th = this.Z;
                    SessionData sessionData = new SessionData(this.e0.f21123b.a(null), (Time) null, (Map) null, 4, (DefaultConstructorMarker) null);
                    Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th.getMessage() + ". Emit fallback session " + sessionData.getSessionDetails().getSessionId());
                    this.f21129Y = null;
                    this.X = 1;
                    if (flowCollector.emit(sessionData, this) == coroutineSingletons) {
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

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return SharedSessionRepositoryImpl.this.new AnonymousClass1(continuation);
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
                final SharedSessionRepositoryImpl sharedSessionRepositoryImpl = SharedSessionRepositoryImpl.this;
                FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(sharedSessionRepositoryImpl.f21125e.getD(), new C02091(sharedSessionRepositoryImpl, null));
                FlowCollector flowCollector = new FlowCollector() { // from class: com.google.firebase.sessions.SharedSessionRepositoryImpl.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        SessionData sessionData = (SessionData) obj2;
                        SharedSessionRepositoryImpl sharedSessionRepositoryImpl2 = sharedSessionRepositoryImpl;
                        sharedSessionRepositoryImpl2.getClass();
                        Intrinsics.f(sessionData, "<set-?>");
                        sharedSessionRepositoryImpl2.f21126h = sessionData;
                        Object objD = SharedSessionRepositoryImpl.d(sharedSessionRepositoryImpl2, sessionData.getSessionDetails().getSessionId(), NotificationType.X, continuation);
                        return objD == CoroutineSingletons.X ? objD : Unit.f43263a;
                    }
                };
                this.X = 1;
                if (flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.collect(flowCollector, this) == coroutineSingletons) {
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotificationType {
        public static final NotificationType X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final NotificationType f21130Y;
        public static final /* synthetic */ NotificationType[] Z;
        public static final /* synthetic */ EnumEntries e0;

        static {
            NotificationType notificationType = new NotificationType("GENERAL", 0);
            X = notificationType;
            NotificationType notificationType2 = new NotificationType("FALLBACK", 1);
            f21130Y = notificationType2;
            NotificationType[] notificationTypeArr = {notificationType, notificationType2};
            Z = notificationTypeArr;
            e0 = EnumEntriesKt.a(notificationTypeArr);
        }

        public static NotificationType valueOf(String str) {
            return (NotificationType) Enum.valueOf(NotificationType.class, str);
        }

        public static NotificationType[] values() {
            return (NotificationType[]) Z.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[NotificationType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                NotificationType notificationType = NotificationType.X;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public SharedSessionRepositoryImpl(SessionsSettings sessionsSettings, SessionGenerator sessionGenerator, SessionFirelogPublisher sessionFirelogPublisher, TimeProvider timeProvider, DataStore sessionDataStore, ProcessDataManager processDataManager, CoroutineContext backgroundDispatcher) {
        Intrinsics.f(sessionsSettings, "sessionsSettings");
        Intrinsics.f(sessionGenerator, "sessionGenerator");
        Intrinsics.f(sessionFirelogPublisher, "sessionFirelogPublisher");
        Intrinsics.f(timeProvider, "timeProvider");
        Intrinsics.f(sessionDataStore, "sessionDataStore");
        Intrinsics.f(processDataManager, "processDataManager");
        Intrinsics.f(backgroundDispatcher, "backgroundDispatcher");
        this.f21122a = sessionsSettings;
        this.f21123b = sessionGenerator;
        this.f21124c = sessionFirelogPublisher;
        this.d = timeProvider;
        this.f21125e = sessionDataStore;
        this.f = processDataManager;
        this.g = backgroundDispatcher;
        NotificationType notificationType = NotificationType.X;
        this.j = "";
        BuildersKt.c(CoroutineScopeKt.a(backgroundDispatcher), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, String str, NotificationType notificationType, Continuation continuation) {
        SharedSessionRepositoryImpl$notifySubscribers$1 sharedSessionRepositoryImpl$notifySubscribers$1;
        String str2;
        sharedSessionRepositoryImpl.getClass();
        if (continuation instanceof SharedSessionRepositoryImpl$notifySubscribers$1) {
            sharedSessionRepositoryImpl$notifySubscribers$1 = (SharedSessionRepositoryImpl$notifySubscribers$1) continuation;
            int i2 = sharedSessionRepositoryImpl$notifySubscribers$1.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharedSessionRepositoryImpl$notifySubscribers$1.f0 = i2 - Integer.MIN_VALUE;
            } else {
                sharedSessionRepositoryImpl$notifySubscribers$1 = new SharedSessionRepositoryImpl$notifySubscribers$1(sharedSessionRepositoryImpl, continuation);
            }
        } else {
            sharedSessionRepositoryImpl$notifySubscribers$1 = new SharedSessionRepositoryImpl$notifySubscribers$1(sharedSessionRepositoryImpl, continuation);
        }
        Object registeredSubscribers$com_google_firebase_firebase_sessions = sharedSessionRepositoryImpl$notifySubscribers$1.Z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = sharedSessionRepositoryImpl$notifySubscribers$1.f0;
        Unit unit = Unit.f43263a;
        if (i3 == 0) {
            ResultKt.b(registeredSubscribers$com_google_firebase_firebase_sessions);
            if (!Intrinsics.a(sharedSessionRepositoryImpl.j, str)) {
                sharedSessionRepositoryImpl.j = str;
                FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
                sharedSessionRepositoryImpl$notifySubscribers$1.X = str;
                sharedSessionRepositoryImpl$notifySubscribers$1.f21135Y = notificationType;
                sharedSessionRepositoryImpl$notifySubscribers$1.f0 = 1;
                registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(sharedSessionRepositoryImpl$notifySubscribers$1);
                if (registeredSubscribers$com_google_firebase_firebase_sessions == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return unit;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        notificationType = sharedSessionRepositoryImpl$notifySubscribers$1.f21135Y;
        str = sharedSessionRepositoryImpl$notifySubscribers$1.X;
        ResultKt.b(registeredSubscribers$com_google_firebase_firebase_sessions);
        for (SessionSubscriber sessionSubscriber : ((Map) registeredSubscribers$com_google_firebase_firebase_sessions).values()) {
            sessionSubscriber.onSessionChanged(new SessionSubscriber.SessionDetails(str));
            int iOrdinal = notificationType.ordinal();
            if (iOrdinal == 0) {
                str2 = "Notified " + sessionSubscriber.getSessionSubscriberName() + " of new session " + str;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "Notified " + sessionSubscriber.getSessionSubscriberName() + " of new fallback session " + str;
            }
            Log.d("FirebaseSessions", str2);
        }
        return unit;
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF21127i() {
        return this.f21127i;
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    public final void b() {
        this.f21127i = false;
        if (this.f21126h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.a());
        BuildersKt.c(CoroutineScopeKt.a(this.g), null, null, new SharedSessionRepositoryImpl$appBackground$1(this, null), 3);
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    public final void c() {
        this.f21127i = true;
        SessionData sessionData = this.f21126h;
        if (sessionData == null) {
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        if (sessionData == null) {
            Intrinsics.m("localSessionData");
            throw null;
        }
        Log.d("FirebaseSessions", "App foregrounded on " + this.f.a());
        if (f(sessionData) || e(sessionData)) {
            BuildersKt.c(CoroutineScopeKt.a(this.g), null, null, new SharedSessionRepositoryImpl$appForeground$1(this, sessionData, null), 3);
        }
    }

    public final boolean e(SessionData sessionData) {
        Map<String, ProcessData> processDataMap = sessionData.getProcessDataMap();
        ProcessDataManager processDataManager = this.f;
        if (processDataMap == null) {
            Log.d("FirebaseSessions", "No process data for " + processDataManager.a());
            return true;
        }
        boolean zB = processDataManager.b(processDataMap);
        if (zB) {
            Log.d("FirebaseSessions", "Process " + processDataManager.a() + " is stale");
        }
        return zB;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:13:0x0038  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    public final boolean f(SessionData sessionData) {
        Duration durationB;
        long jG;
        Time backgroundTime = sessionData.getBackgroundTime();
        if (backgroundTime == null) {
            Log.d("FirebaseSessions", "Session " + sessionData.getSessionDetails().getSessionId() + " has not backgrounded yet");
            return false;
        }
        long jM191minus5sfh64U = this.d.a().m191minus5sfh64U(backgroundTime);
        SessionsSettings sessionsSettings = this.f21122a;
        Duration durationB2 = sessionsSettings.f21170a.b();
        if (durationB2 != null) {
            Duration.Companion companion = Duration.f44719Y;
            jG = durationB2.X;
            if (jG <= 0 || Duration.h(jG)) {
                durationB = sessionsSettings.f21171b.b();
                if (durationB != null) {
                    Duration.Companion companion2 = Duration.f44719Y;
                    jG = durationB.X;
                    if (jG > 0 || Duration.h(jG)) {
                        Duration.Companion companion3 = Duration.f44719Y;
                        jG = DurationKt.g(30, DurationUnit.MINUTES);
                    }
                } else {
                    Duration.Companion companion4 = Duration.f44719Y;
                    jG = DurationKt.g(30, DurationUnit.MINUTES);
                }
            }
        } else {
            durationB = sessionsSettings.f21171b.b();
            if (durationB != null) {
                Duration.Companion companion5 = Duration.f44719Y;
                jG = durationB.X;
                if (jG > 0) {
                    Duration.Companion companion6 = Duration.f44719Y;
                    jG = DurationKt.g(30, DurationUnit.MINUTES);
                } else {
                    Duration.Companion companion7 = Duration.f44719Y;
                    jG = DurationKt.g(30, DurationUnit.MINUTES);
                }
            } else {
                Duration.Companion companion8 = Duration.f44719Y;
                jG = DurationKt.g(30, DurationUnit.MINUTES);
            }
        }
        boolean z2 = Duration.d(jM191minus5sfh64U, jG) > 0;
        if (z2) {
            Log.d("FirebaseSessions", "Session " + sessionData.getSessionDetails().getSessionId() + " is expired");
        }
        return z2;
    }
}
