package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStore;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001¨\u0006\u0005"}, d2 = {"Landroidx/datastore/preferences/PreferenceDataStoreSingletonDelegate;", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "datastore-preferences_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreferenceDataStoreSingletonDelegate implements ReadOnlyProperty<Context, DataStore<Preferences>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReplaceFileCorruptionHandler f4714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f4715c;
    public final CoroutineScope d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f4716e;
    public volatile PreferenceDataStore f;

    public PreferenceDataStoreSingletonDelegate(String name, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, Function1 function1, CoroutineScope coroutineScope) {
        Intrinsics.f(name, "name");
        this.f4713a = name;
        this.f4714b = replaceFileCorruptionHandler;
        this.f4715c = function1;
        this.d = coroutineScope;
        this.f4716e = new Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty property) {
        PreferenceDataStore preferenceDataStore;
        Context thisRef = (Context) obj;
        Intrinsics.f(thisRef, "thisRef");
        Intrinsics.f(property, "property");
        PreferenceDataStore preferenceDataStore2 = this.f;
        if (preferenceDataStore2 != null) {
            return preferenceDataStore2;
        }
        synchronized (this.f4716e) {
            try {
                if (this.f == null) {
                    final Context applicationContext = thisRef.getApplicationContext();
                    ReplaceFileCorruptionHandler replaceFileCorruptionHandler = this.f4714b;
                    Function1 function1 = this.f4715c;
                    Intrinsics.e(applicationContext, "applicationContext");
                    this.f = PreferenceDataStoreFactory.a(replaceFileCorruptionHandler, (List) function1.invoke(applicationContext), this.d, new Function0<File>() { // from class: androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate$getValue$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Context applicationContext2 = applicationContext;
                            Intrinsics.e(applicationContext2, "applicationContext");
                            String name = this.f4713a;
                            Intrinsics.f(name, "name");
                            return DataStoreFile.a(applicationContext2, name.concat(".preferences_pb"));
                        }
                    });
                }
                preferenceDataStore = this.f;
                Intrinsics.c(preferenceDataStore);
            } catch (Throwable th) {
                throw th;
            }
        }
        return preferenceDataStore;
    }
}
