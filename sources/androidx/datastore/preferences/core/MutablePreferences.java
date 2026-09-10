package androidx.datastore.preferences.core;

import com.smartdigimkt.b0.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "Landroidx/datastore/preferences/core/Preferences;", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutablePreferences extends Preferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f4726b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.core.MutablePreferences$toString$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", a.n0, "", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    final class AnonymousClass1 extends Lambda implements Function1<Map.Entry<Preferences.Key<?>, Object>, CharSequence> {
        public static final AnonymousClass1 X = new AnonymousClass1(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Intrinsics.f(entry, "entry");
            Object value = entry.getValue();
            return android.support.v4.media.a.s(new StringBuilder("  "), ((Preferences.Key) entry.getKey()).f4729a, " = ", value instanceof byte[] ? ArraysKt.H((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
        }
    }

    public MutablePreferences(LinkedHashMap linkedHashMap, boolean z2) {
        this.f4725a = linkedHashMap;
        this.f4726b = new AtomicBoolean(z2);
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public final Map a() {
        Pair pair;
        Set<Map.Entry> setEntrySet = this.f4725a.entrySet();
        int iH = MapsKt.h(CollectionsKt.n(setEntrySet, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.e(bArrCopyOf, "copyOf(this, size)");
                pair = new Pair(key, bArrCopyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.X, pair.f43249Y);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.e(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (this.f4726b.f4724a.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void c(Preferences.Key key) {
        Intrinsics.f(key, "key");
        b();
        this.f4725a.remove(key);
    }

    public final void d(Preferences.Key key, Object obj) {
        Intrinsics.f(key, "key");
        e(key, obj);
    }

    public final void e(Preferences.Key key, Object obj) {
        Intrinsics.f(key, "key");
        b();
        if (obj == null) {
            c(key);
            return;
        }
        boolean z2 = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f4725a;
        if (z2) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(CollectionsKt.l0((Set) obj));
            Intrinsics.e(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(key, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(key, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            Intrinsics.e(bArrCopyOf, "copyOf(this, size)");
            linkedHashMap.put(key, bArrCopyOf);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    public final boolean equals(Object obj) {
        boolean zA;
        if (obj instanceof MutablePreferences) {
            MutablePreferences mutablePreferences = (MutablePreferences) obj;
            LinkedHashMap linkedHashMap = mutablePreferences.f4725a;
            LinkedHashMap linkedHashMap2 = this.f4725a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    LinkedHashMap linkedHashMap3 = mutablePreferences.f4725a;
                    if (!linkedHashMap3.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zA = Intrinsics.a(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zA = true;
                                } else {
                                    zA = false;
                                }
                            } else {
                                zA = false;
                            }
                            if (!zA) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.f4725a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return CollectionsKt.D(this.f4725a.entrySet(), ",\n", "{\n", "\n}", AnonymousClass1.X, 24);
    }

    public /* synthetic */ MutablePreferences(boolean z2) {
        this(new LinkedHashMap(), z2);
    }
}
