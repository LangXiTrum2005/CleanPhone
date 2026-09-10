package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateRegistry;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/SavedStateHandle;", "", "Companion", "SavingStateLiveData", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateHandle {
    public static final Class[] f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5260c;
    public final LinkedHashMap d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SavedStateRegistry.SavedStateProvider f5261e;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R$\u0010\u0004\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$Companion;", "", "", "Ljava/lang/Class;", "ACCEPTABLE_CLASSES", "[Ljava/lang/Class;", "", "KEYS", "Ljava/lang/String;", "VALUES", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static SavedStateHandle a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new SavedStateHandle();
                }
                HashMap map = new HashMap();
                for (String key : bundle2.keySet()) {
                    Intrinsics.e(key, "key");
                    map.put(key, bundle2.get(key));
                }
                return new SavedStateHandle(map);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = parcelableArrayList.get(i2);
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i2));
            }
            return new SavedStateHandle(linkedHashMap);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/lifecycle/MutableLiveData;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {
    }

    public SavedStateHandle(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f5258a = linkedHashMap;
        this.f5259b = new LinkedHashMap();
        this.f5260c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.f5261e = new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.a
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle a() {
                return SavedStateHandle.a(this.f5293a);
            }
        };
        linkedHashMap.putAll(map);
    }

    public static Bundle a(SavedStateHandle this$0) {
        Intrinsics.f(this$0, "this$0");
        Iterator it = MapsKt.q(this$0.f5259b).entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this$0.f5258a;
            if (!zHasNext) {
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                return BundleKt.a(new Pair("keys", arrayList), new Pair("values", arrayList2));
            }
            Map.Entry entry = (Map.Entry) it.next();
            String key = (String) entry.getKey();
            Bundle bundleA = ((SavedStateRegistry.SavedStateProvider) entry.getValue()).a();
            Intrinsics.f(key, "key");
            if (bundleA != null) {
                Class[] clsArr = f;
                int i2 = 0;
                while (true) {
                    if (i2 >= 29) {
                        throw new IllegalArgumentException("Can't put value with type " + bundleA.getClass() + " into saved state");
                    }
                    Class cls = clsArr[i2];
                    Intrinsics.c(cls);
                    if (cls.isInstance(bundleA)) {
                        break;
                    }
                    i2++;
                }
            }
            Object obj = this$0.f5260c.get(key);
            MutableLiveData mutableLiveData = obj instanceof MutableLiveData ? (MutableLiveData) obj : null;
            if (mutableLiveData != null) {
                mutableLiveData.j(bundleA);
            } else {
                linkedHashMap.put(key, bundleA);
            }
            MutableStateFlow mutableStateFlow = (MutableStateFlow) this$0.d.get(key);
            if (mutableStateFlow != null) {
                mutableStateFlow.setValue(bundleA);
            }
        }
    }

    public SavedStateHandle() {
        this.f5258a = new LinkedHashMap();
        this.f5259b = new LinkedHashMap();
        this.f5260c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.f5261e = new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.a
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle a() {
                return SavedStateHandle.a(this.f5293a);
            }
        };
    }
}
