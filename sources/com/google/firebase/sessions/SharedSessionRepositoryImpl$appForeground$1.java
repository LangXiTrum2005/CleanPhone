package com.google.firebase.sessions;

import android.util.Log;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1", f = "SharedSessionRepository.kt", l = {135, 186}, m = "invokeSuspend")
final class SharedSessionRepositoryImpl$appForeground$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ SharedSessionRepositoryImpl f21133Y;
    public final /* synthetic */ SessionData Z;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/google/firebase/sessions/SessionData;", "currentSessionData"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1", f = "SharedSessionRepository.kt", l = {}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements Function2<SessionData, Continuation<? super SessionData>, Object> {
        public /* synthetic */ Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ SharedSessionRepositoryImpl f21134Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, Continuation continuation) {
            super(2, continuation);
            this.f21134Y = sharedSessionRepositoryImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f21134Y, continuation);
            anonymousClass1.X = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((SessionData) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean zE;
            Map mapC;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            ResultKt.b(obj);
            SessionData sessionData = (SessionData) this.X;
            SharedSessionRepositoryImpl sharedSessionRepositoryImpl = this.f21134Y;
            boolean zF = sharedSessionRepositoryImpl.f(sessionData);
            Map processDataMap = sessionData.getProcessDataMap();
            ProcessDataManager processDataManager = sharedSessionRepositoryImpl.f;
            if (processDataMap != null) {
                zE = processDataManager.e(processDataMap);
                if (zE) {
                    Log.d("FirebaseSessions", "Cold app start detected");
                }
            } else {
                Log.d("FirebaseSessions", "No process data map");
                zE = true;
            }
            boolean zE2 = sharedSessionRepositoryImpl.e(sessionData);
            if (zE) {
                mapC = processDataManager.f();
            } else {
                mapC = zE2 ? processDataManager.c(sessionData.getProcessDataMap()) : sessionData.getProcessDataMap();
            }
            SessionDetails sessionDetails = zE ? null : sessionData.getSessionDetails();
            if (!zF && !zE) {
                return zE2 ? SessionData.copy$default(sessionData, null, null, processDataManager.c(mapC), 3, null) : sessionData;
            }
            SessionDetails sessionDetailsA = sharedSessionRepositoryImpl.f21123b.a(sessionDetails);
            sharedSessionRepositoryImpl.f21124c.a(sessionDetailsA);
            processDataManager.d();
            return sessionData.copy(sessionDetailsA, null, mapC);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSessionRepositoryImpl$appForeground$1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, SessionData sessionData, Continuation continuation) {
        super(2, continuation);
        this.f21133Y = sharedSessionRepositoryImpl;
        this.Z = sessionData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedSessionRepositoryImpl$appForeground$1(this.f21133Y, this.Z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedSessionRepositoryImpl$appForeground$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r12.a(r0, r11) == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.firebase.sessions.SharedSessionRepositoryImpl.d(r4, r12, r0, r11) == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        return r1;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r0 = r11.X
            r2 = 2
            r3 = 1
            com.google.firebase.sessions.SharedSessionRepositoryImpl r4 = r11.f21133Y
            if (r0 == 0) goto L21
            if (r0 == r3) goto L1a
            if (r0 != r2) goto L12
            kotlin.ResultKt.b(r12)
            goto L81
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            kotlin.ResultKt.b(r12)     // Catch: java.lang.Exception -> L1e
            goto L81
        L1e:
            r0 = move-exception
            r12 = r0
            goto L35
        L21:
            kotlin.ResultKt.b(r12)
            androidx.datastore.core.DataStore r12 = r4.f21125e     // Catch: java.lang.Exception -> L1e
            com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1 r0 = new com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1     // Catch: java.lang.Exception -> L1e
            r5 = 0
            r0.<init>(r4, r5)     // Catch: java.lang.Exception -> L1e
            r11.X = r3     // Catch: java.lang.Exception -> L1e
            java.lang.Object r12 = r12.a(r0, r11)     // Catch: java.lang.Exception -> L1e
            if (r12 != r1) goto L81
            goto L80
        L35:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "App foregrounded, failed to update data. Message: "
            r0.<init>(r3)
            java.lang.String r12 = r12.getMessage()
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            java.lang.String r0 = "FirebaseSessions"
            android.util.Log.d(r0, r12)
            com.google.firebase.sessions.SessionData r5 = r11.Z
            boolean r12 = r4.f(r5)
            if (r12 == 0) goto L81
            com.google.firebase.sessions.SessionDetails r12 = r5.getSessionDetails()
            com.google.firebase.sessions.SessionGenerator r0 = r4.f21123b
            com.google.firebase.sessions.SessionDetails r6 = r0.a(r12)
            r7 = 0
            r8 = 0
            r9 = 4
            r10 = 0
            com.google.firebase.sessions.SessionData r12 = com.google.firebase.sessions.SessionData.copy$default(r5, r6, r7, r8, r9, r10)
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.f(r12, r0)
            r4.f21126h = r12
            com.google.firebase.sessions.SessionFirelogPublisher r12 = r4.f21124c
            r12.a(r6)
            java.lang.String r12 = r6.getSessionId()
            com.google.firebase.sessions.SharedSessionRepositoryImpl$NotificationType r0 = com.google.firebase.sessions.SharedSessionRepositoryImpl.NotificationType.f21130Y
            r11.X = r2
            java.lang.Object r12 = com.google.firebase.sessions.SharedSessionRepositoryImpl.d(r4, r12, r0, r11)
            if (r12 != r1) goto L81
        L80:
            return r1
        L81:
            kotlin.Unit r12 = kotlin.Unit.f43263a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
