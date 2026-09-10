package com.google.firebase.remoteconfig.interop.rollouts;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RolloutsState {
    public static RolloutsState a(HashSet hashSet) {
        return new AutoValue_RolloutsState(hashSet);
    }

    public abstract Set b();
}
