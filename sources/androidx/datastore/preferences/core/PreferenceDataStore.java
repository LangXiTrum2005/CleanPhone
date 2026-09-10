package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/datastore/preferences/core/PreferenceDataStore;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreferenceDataStore implements DataStore<Preferences> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataStore f4727a;

    public PreferenceDataStore(DataStore dataStore) {
        this.f4727a = dataStore;
    }

    @Override // androidx.datastore.core.DataStore
    public final Object a(Function2 function2, Continuation continuation) {
        return this.f4727a.a(new PreferenceDataStore$updateData$2(function2, null), continuation);
    }

    @Override // androidx.datastore.core.DataStore
    /* JADX INFO: renamed from: getData */
    public final Flow getD() {
        return this.f4727a.getD();
    }
}
