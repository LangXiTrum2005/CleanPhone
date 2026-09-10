package com.google.firebase.remoteconfig.interop.rollouts;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_RolloutsState extends RolloutsState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f21013a;

    public AutoValue_RolloutsState(HashSet hashSet) {
        this.f21013a = hashSet;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutsState
    public final Set b() {
        return this.f21013a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RolloutsState) {
            return this.f21013a.equals(((RolloutsState) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f21013a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f21013a + "}";
    }
}
