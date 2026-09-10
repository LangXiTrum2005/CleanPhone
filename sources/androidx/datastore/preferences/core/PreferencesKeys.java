package androidx.datastore.preferences.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"datastore-preferences-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PreferencesKeys {
    public static final Preferences.Key a(String name) {
        Intrinsics.f(name, "name");
        return new Preferences.Key(name);
    }

    public static final Preferences.Key b(String name) {
        Intrinsics.f(name, "name");
        return new Preferences.Key(name);
    }
}
