package androidx.datastore.preferences;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"datastore-preferences_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SharedPreferencesMigrationKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f4721a = new LinkedHashSet();

    public static final Function3 a() {
        return new SharedPreferencesMigrationKt$getMigrationFunction$1(3, null);
    }

    public static final Function2 b(Set set) {
        return new SharedPreferencesMigrationKt$getShouldRunMigration$1(set, null);
    }
}
