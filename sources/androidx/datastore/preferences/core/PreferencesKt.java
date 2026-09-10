package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"datastore-preferences-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PreferencesKt {
    public static final Object a(DataStore dataStore, Function2 function2, SuspendLambda suspendLambda) {
        return dataStore.a(new PreferencesKt$edit$2(function2, null), suspendLambda);
    }
}
