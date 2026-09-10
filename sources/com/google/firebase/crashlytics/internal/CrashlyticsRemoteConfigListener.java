package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/crashlytics/internal/CrashlyticsRemoteConfigListener;", "Lcom/google/firebase/remoteconfig/interop/rollouts/RolloutsStateSubscriber;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CrashlyticsRemoteConfigListener implements RolloutsStateSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserMetadata f20284a;

    public CrashlyticsRemoteConfigListener(UserMetadata userMetadata) {
        this.f20284a = userMetadata;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber
    public final void a(RolloutsState rolloutsState) {
        final UserMetadata userMetadata = this.f20284a;
        Set setB = rolloutsState.b();
        ArrayList arrayList = new ArrayList(CollectionsKt.n(setB, 10));
        for (RolloutAssignment rolloutAssignment : (HashSet) setB) {
            arrayList.add(com.google.firebase.crashlytics.internal.metadata.RolloutAssignment.a(rolloutAssignment.d(), rolloutAssignment.b(), rolloutAssignment.c(), rolloutAssignment.f(), rolloutAssignment.e()));
        }
        synchronized (userMetadata.f) {
            try {
                if (userMetadata.f.b(arrayList)) {
                    final List listA = userMetadata.f.a();
                    userMetadata.f20415b.f20377b.a(new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.b
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            UserMetadata userMetadata2 = userMetadata;
                            userMetadata2.f20414a.i(userMetadata2.f20416c, listA);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Logger.f20289a.b("Updated Crashlytics Rollout State", null);
    }
}
