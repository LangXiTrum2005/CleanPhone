package androidx.datastore.preferences.core;

import java.util.Arrays;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PreferencesFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\u0007\u001a\u00020\u00062\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/datastore/preferences/core/dern;", "attabal", "()Landroidx/datastore/preferences/core/dern;", "", "Landroidx/datastore/preferences/core/dern$saneness;", "pairs", "Landroidx/datastore/preferences/core/MutablePreferences;", "saneness", "([Landroidx/datastore/preferences/core/dern$saneness;)Landroidx/datastore/preferences/core/MutablePreferences;", "datastore-preferences-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class wireman {
    public static final dern attabal() {
        return new MutablePreferences(null, true, 1, null);
    }

    public static final MutablePreferences saneness(dern.saneness<?>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        MutablePreferences mutablePreferences = new MutablePreferences(null, false, 1, null);
        mutablePreferences.competently((dern.saneness[]) Arrays.copyOf(pairs, pairs.length));
        return mutablePreferences;
    }
}
