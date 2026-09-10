package com.google.firebase.remoteconfig;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ConfigUpdate {
    public static ConfigUpdate a(HashSet hashSet) {
        return new AutoValue_ConfigUpdate(hashSet);
    }

    public abstract Set b();
}
