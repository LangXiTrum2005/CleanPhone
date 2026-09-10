package com.google.firebase.remoteconfig;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ConfigUpdate extends ConfigUpdate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f20910a;

    public AutoValue_ConfigUpdate(HashSet hashSet) {
        this.f20910a = hashSet;
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdate
    public final Set b() {
        return this.f20910a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConfigUpdate) {
            return this.f20910a.equals(((ConfigUpdate) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f20910a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f20910a + "}";
    }
}
