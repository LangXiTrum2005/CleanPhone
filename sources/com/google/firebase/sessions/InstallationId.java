package com.google.firebase.sessions;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/InstallationId;", "", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InstallationId {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Companion f21080c = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21082b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/InstallationId$Companion;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
        
            if (r10 == r1) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v16 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [com.google.firebase.installations.FirebaseInstallationsApi] */
        /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.installations.FirebaseInstallationsApi, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v20 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(com.google.firebase.installations.FirebaseInstallationsApi r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof com.google.firebase.sessions.InstallationId$Companion$create$1
                if (r0 == 0) goto L13
                r0 = r10
                com.google.firebase.sessions.InstallationId$Companion$create$1 r0 = (com.google.firebase.sessions.InstallationId$Companion$create$1) r0
                int r1 = r0.e0
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e0 = r1
                goto L18
            L13:
                com.google.firebase.sessions.InstallationId$Companion$create$1 r0 = new com.google.firebase.sessions.InstallationId$Companion$create$1
                r0.<init>(r8, r10)
            L18:
                java.lang.Object r10 = r0.f21083Y
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
                int r2 = r0.e0
                java.lang.String r3 = "FirebaseSessions"
                r4 = 2
                r5 = 1
                java.lang.String r6 = ""
                if (r2 == 0) goto L46
                if (r2 == r5) goto L3c
                if (r2 != r4) goto L34
                java.lang.Object r9 = r0.X
                java.lang.String r9 = (java.lang.String) r9
                kotlin.ResultKt.b(r10)     // Catch: java.lang.Exception -> L32
                goto L82
            L32:
                r10 = move-exception
                goto L89
            L34:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3c:
                java.lang.Object r9 = r0.X
                com.google.firebase.installations.FirebaseInstallationsApi r9 = (com.google.firebase.installations.FirebaseInstallationsApi) r9
                kotlin.ResultKt.b(r10)     // Catch: java.lang.Exception -> L44
                goto L5d
            L44:
                r10 = move-exception
                goto L67
            L46:
                kotlin.ResultKt.b(r10)
                com.google.android.gms.tasks.Task r10 = r9.getToken()     // Catch: java.lang.Exception -> L44
                java.lang.String r2 = "getToken(...)"
                kotlin.jvm.internal.Intrinsics.e(r10, r2)     // Catch: java.lang.Exception -> L44
                r0.X = r9     // Catch: java.lang.Exception -> L44
                r0.e0 = r5     // Catch: java.lang.Exception -> L44
                java.lang.Object r10 = kotlinx.coroutines.tasks.TasksKt.a(r10, r0)     // Catch: java.lang.Exception -> L44
                if (r10 != r1) goto L5d
                goto L81
            L5d:
                com.google.firebase.installations.InstallationTokenResult r10 = (com.google.firebase.installations.InstallationTokenResult) r10     // Catch: java.lang.Exception -> L44
                java.lang.String r10 = r10.a()     // Catch: java.lang.Exception -> L44
                r7 = r10
                r10 = r9
                r9 = r7
                goto L6e
            L67:
                java.lang.String r2 = "Error getting authentication token."
                android.util.Log.w(r3, r2, r10)
                r10 = r9
                r9 = r6
            L6e:
                com.google.android.gms.tasks.Task r10 = r10.getId()     // Catch: java.lang.Exception -> L32
                java.lang.String r2 = "getId(...)"
                kotlin.jvm.internal.Intrinsics.e(r10, r2)     // Catch: java.lang.Exception -> L32
                r0.X = r9     // Catch: java.lang.Exception -> L32
                r0.e0 = r4     // Catch: java.lang.Exception -> L32
                java.lang.Object r10 = kotlinx.coroutines.tasks.TasksKt.a(r10, r0)     // Catch: java.lang.Exception -> L32
                if (r10 != r1) goto L82
            L81:
                return r1
            L82:
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L32
                if (r10 != 0) goto L87
                goto L8e
            L87:
                r6 = r10
                goto L8e
            L89:
                java.lang.String r0 = "Error getting Firebase installation id ."
                android.util.Log.w(r3, r0, r10)
            L8e:
                com.google.firebase.sessions.InstallationId r10 = new com.google.firebase.sessions.InstallationId
                r10.<init>(r6, r9)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.InstallationId.Companion.a(com.google.firebase.installations.FirebaseInstallationsApi, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }
    }

    public InstallationId(String str, String str2) {
        this.f21081a = str;
        this.f21082b = str2;
    }
}
