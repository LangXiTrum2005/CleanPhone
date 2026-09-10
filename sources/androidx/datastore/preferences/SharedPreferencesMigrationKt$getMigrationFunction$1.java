package androidx.datastore.preferences;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "sharedPrefs", "Landroidx/datastore/migrations/SharedPreferencesView;", "currentData"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
final class SharedPreferencesMigrationKt$getMigrationFunction$1 extends SuspendLambda implements Function3<SharedPreferencesView, Preferences, Continuation<? super Preferences>, Object> {
    public /* synthetic */ SharedPreferencesView X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Preferences f4722Y;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SharedPreferencesMigrationKt$getMigrationFunction$1 sharedPreferencesMigrationKt$getMigrationFunction$1 = new SharedPreferencesMigrationKt$getMigrationFunction$1(3, (Continuation) obj3);
        sharedPreferencesMigrationKt$getMigrationFunction$1.X = (SharedPreferencesView) obj;
        sharedPreferencesMigrationKt$getMigrationFunction$1.f4722Y = (Preferences) obj2;
        return sharedPreferencesMigrationKt$getMigrationFunction$1.invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ResultKt.b(obj);
        SharedPreferencesView sharedPreferencesView = this.X;
        Preferences preferences = this.f4722Y;
        Set setKeySet = preferences.a().keySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.n(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Preferences.Key) it.next()).f4729a);
        }
        Map<String, ?> all = sharedPreferencesView.f4711a.getAll();
        Intrinsics.e(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            LinkedHashSet linkedHashSet = sharedPreferencesView.f4712b;
            if (linkedHashSet != null ? linkedHashSet.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.h(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = CollectionsKt.l0((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        MutablePreferences mutablePreferences = new MutablePreferences(MapsKt.s(preferences.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String name = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                Intrinsics.f(name, "name");
                mutablePreferences.e(new Preferences.Key(name), value2);
            } else if (value2 instanceof Float) {
                Intrinsics.f(name, "name");
                mutablePreferences.e(new Preferences.Key(name), value2);
            } else if (value2 instanceof Integer) {
                Intrinsics.f(name, "name");
                mutablePreferences.e(new Preferences.Key(name), value2);
            } else if (value2 instanceof Long) {
                mutablePreferences.e(PreferencesKeys.a(name), value2);
            } else if (value2 instanceof String) {
                Intrinsics.f(name, "name");
                mutablePreferences.e(new Preferences.Key(name), value2);
            } else if (value2 instanceof Set) {
                Preferences.Key keyB = PreferencesKeys.b(name);
                Intrinsics.d(value2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                mutablePreferences.e(keyB, (Set) value2);
            }
        }
        return new MutablePreferences(MapsKt.s(mutablePreferences.a()), true);
    }
}
