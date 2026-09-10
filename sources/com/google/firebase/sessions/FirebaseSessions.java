package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.vungle.ads.internal.protos.Sdk;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes4.dex */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessions;", "", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseSessions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseApp f21066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SessionsSettings f21067b;

    /* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessions$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {Sdk.SDKMetric.SDKMetricType.AD_REWARD_USER_VALUE, Sdk.SDKMetric.SDKMetricType.AD_CLOSED_BEFORE_IMPRESSION_VALUE}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int X;
        public final /* synthetic */ SessionsActivityLifecycleCallbacks Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks, Continuation continuation) {
            super(2, continuation);
            this.Z = sessionsActivityLifecycleCallbacks;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return FirebaseSessions.this.new AnonymousClass1(this.Z, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        
            if (r7.b(r6) == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
                int r1 = r6.X
                r2 = 1
                java.lang.String r3 = "FirebaseSessions"
                r4 = 2
                com.google.firebase.sessions.FirebaseSessions r5 = com.google.firebase.sessions.FirebaseSessions.this
                if (r1 == 0) goto L20
                if (r1 == r2) goto L1c
                if (r1 != r4) goto L14
                kotlin.ResultKt.b(r7)
                goto L65
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                kotlin.ResultKt.b(r7)
                goto L2e
            L20:
                kotlin.ResultKt.b(r7)
                com.google.firebase.sessions.api.FirebaseSessionsDependencies r7 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
                r6.X = r2
                java.lang.Object r7 = r7.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r6)
                if (r7 != r0) goto L2e
                goto L64
            L2e:
                java.util.Map r7 = (java.util.Map) r7
                java.util.Collection r7 = r7.values()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                boolean r1 = r7 instanceof java.util.Collection
                if (r1 == 0) goto L44
                r1 = r7
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L44
                goto La3
            L44:
                java.util.Iterator r7 = r7.iterator()
            L48:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto La3
                java.lang.Object r1 = r7.next()
                com.google.firebase.sessions.api.SessionSubscriber r1 = (com.google.firebase.sessions.api.SessionSubscriber) r1
                boolean r1 = r1.isDataCollectionEnabled()
                if (r1 == 0) goto L48
                com.google.firebase.sessions.settings.SessionsSettings r7 = r5.f21067b
                r6.X = r4
                java.lang.Object r7 = r7.b(r6)
                if (r7 != r0) goto L65
            L64:
                return r0
            L65:
                com.google.firebase.sessions.settings.SessionsSettings r7 = r5.f21067b
                com.google.firebase.sessions.settings.SettingsProvider r0 = r7.f21170a
                java.lang.Boolean r0 = r0.a()
                if (r0 == 0) goto L74
                boolean r2 = r0.booleanValue()
                goto L80
            L74:
                com.google.firebase.sessions.settings.SettingsProvider r7 = r7.f21171b
                java.lang.Boolean r7 = r7.a()
                if (r7 == 0) goto L80
                boolean r2 = r7.booleanValue()
            L80:
                if (r2 != 0) goto L8e
                java.lang.String r7 = "Sessions SDK disabled. Not listening to lifecycle events."
                int r7 = android.util.Log.d(r3, r7)
                java.lang.Integer r0 = new java.lang.Integer
                r0.<init>(r7)
                goto Lae
            L8e:
                com.google.common.net.a r7 = new com.google.common.net.a
                r0 = 11
                r7.<init>(r0)
                com.google.firebase.FirebaseApp r0 = r5.f21066a
                r0.a()
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
                java.util.concurrent.CopyOnWriteArrayList r0 = r0.j
                r0.add(r7)
                goto Lae
            La3:
                java.lang.String r7 = "No Sessions subscribers. Not listening to lifecycle events."
                int r7 = android.util.Log.d(r3, r7)
                java.lang.Integer r0 = new java.lang.Integer
                r0.<init>(r7)
            Lae:
                kotlin.Unit r7 = kotlin.Unit.f43263a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.FirebaseSessions.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessions$Companion;", "", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public FirebaseSessions(FirebaseApp firebaseApp, SessionsSettings settings, CoroutineContext backgroundDispatcher, SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks) {
        Intrinsics.f(firebaseApp, "firebaseApp");
        Intrinsics.f(settings, "settings");
        Intrinsics.f(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.f(sessionsActivityLifecycleCallbacks, "sessionsActivityLifecycleCallbacks");
        this.f21066a = firebaseApp;
        this.f21067b = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.3.");
        firebaseApp.a();
        Context applicationContext = firebaseApp.f20145a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            BuildersKt.c(CoroutineScopeKt.a(backgroundDispatcher), null, null, new AnonymousClass1(sessionsActivityLifecycleCallbacks, null), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
