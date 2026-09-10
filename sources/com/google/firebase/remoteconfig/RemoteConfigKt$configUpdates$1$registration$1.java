package com.google.firebase.remoteconfig;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExceptionsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/google/firebase/remoteconfig/RemoteConfigKt$configUpdates$1$registration$1", "Lcom/google/firebase/remoteconfig/ConfigUpdateListener;", "com.google.firebase-firebase-config"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RemoteConfigKt$configUpdates$1$registration$1 implements ConfigUpdateListener {
    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public final void a(ConfigUpdate configUpdate) {
        throw null;
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public final void b(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        CoroutineScopeKt.c(null, ExceptionsKt.a("Error listening for config updates.", firebaseRemoteConfigException));
        throw null;
    }
}
