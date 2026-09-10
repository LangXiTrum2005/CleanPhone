package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C3414a2;
import com.ironsource.X3;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SimpleArrayMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0018\u0010\b\u001a\u0014\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0001H\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u001a\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00028\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010!\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010\u001cJ'\u0010&\u001a\u00020\n2\u0016\u0010\b\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b&\u0010\tJ!\u0010'\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\u001cJ\u0019\u0010(\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010\u0019J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010\u001fJ!\u0010+\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010\u001cJ'\u0010+\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u00012\u0006\u0010-\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010.J\u000f\u0010/\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b2\u0010\u0012J\u000f\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u00100J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u00107\u001a\u00020\u0004H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0004H\u0002¢\u0006\u0004\b:\u00100R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006E"}, d2 = {"Landroidx/collection/splinterproof;", "K", "V", "", "", "capacity", "<init>", "(I)V", "map", "(Landroidx/collection/splinterproof;)V", "", "clear", "()V", "minimumCapacity", "saneness", X3.i.W, "", "containsKey", "(Ljava/lang/Object;)Z", "marial", "(Ljava/lang/Object;)I", "value", "attabal", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "defaultValue", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "index", "competently", "(I)Ljava/lang/Object;", "formularize", "cutely", "(ILjava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "put", "impromptu", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "taiyuan", "replace", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "size", "()I", C3414a2.d, "equals", "hashCode", "", "toString", "()Ljava/lang/String;", "hash", "wireman", "(Ljava/lang/Object;I)I", "beachfront", "", "kowloon", "[I", "hashes", "", "arytenoidectomy", "[Ljava/lang/Object;", "array", "monoploid", "I", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class splinterproof<K, V> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public Object[] array;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public int[] hashes;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public int size;

    public splinterproof() {
        this(0, 1, null);
    }

    public final int attabal(V value) {
        int i = this.size * 2;
        Object[] objArr = this.array;
        if (value == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (Intrinsics.wireman(value, objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final int beachfront() {
        int i = this.size;
        if (i == 0) {
            return -1;
        }
        int iAttabal = molybdenite.attabal.attabal(this.hashes, i, 0);
        if (iAttabal < 0 || this.array[iAttabal << 1] == null) {
            return iAttabal;
        }
        int i2 = iAttabal + 1;
        while (i2 < i && this.hashes[i2] == 0) {
            if (this.array[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iAttabal - 1; i3 >= 0 && this.hashes[i3] == 0; i3--) {
            if (this.array[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = molybdenite.attabal.f33567attabal;
            this.array = molybdenite.attabal.f33568dern;
            this.size = 0;
        }
        if (this.size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public K competently(int index) {
        boolean z = false;
        if (index >= 0 && index < this.size) {
            z = true;
        }
        if (!z) {
            molybdenite.wireman.attabal("Expected index to be within 0..size()-1, but was " + index);
        }
        return (K) this.array[index << 1];
    }

    public boolean containsKey(K key) {
        return marial(key) >= 0;
    }

    public boolean containsValue(V value) {
        return attabal(value) >= 0;
    }

    public V cutely(int index, V value) {
        boolean z = false;
        if (index >= 0 && index < this.size) {
            z = true;
        }
        if (!z) {
            molybdenite.wireman.attabal("Expected index to be within 0..size()-1, but was " + index);
        }
        int i = (index << 1) + 1;
        Object[] objArr = this.array;
        V v = (V) objArr[i];
        objArr[i] = value;
        return v;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        try {
            if (other instanceof splinterproof) {
                if (getSize() != ((splinterproof) other).getSize()) {
                    return false;
                }
                splinterproof splinterproofVar = (splinterproof) other;
                int i = this.size;
                for (int i2 = 0; i2 < i; i2++) {
                    K kCompetently = competently(i2);
                    V vFormularize = formularize(i2);
                    Object obj = splinterproofVar.get(kCompetently);
                    if (vFormularize == null) {
                        if (obj != null || !splinterproofVar.containsKey(kCompetently)) {
                            return false;
                        }
                    } else if (!Intrinsics.wireman(vFormularize, obj)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(other instanceof Map) || getSize() != ((Map) other).size()) {
                return false;
            }
            int i3 = this.size;
            for (int i4 = 0; i4 < i3; i4++) {
                K kCompetently2 = competently(i4);
                V vFormularize2 = formularize(i4);
                Object obj2 = ((Map) other).get(kCompetently2);
                if (vFormularize2 == null) {
                    if (obj2 != null || !((Map) other).containsKey(kCompetently2)) {
                        return false;
                    }
                } else if (!Intrinsics.wireman(vFormularize2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public V formularize(int index) {
        boolean z = false;
        if (index >= 0 && index < this.size) {
            z = true;
        }
        if (!z) {
            molybdenite.wireman.attabal("Expected index to be within 0..size()-1, but was " + index);
        }
        return (V) this.array[(index << 1) + 1];
    }

    public V get(K key) {
        int iMarial = marial(key);
        if (iMarial >= 0) {
            return (V) this.array[(iMarial << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(Object key, V defaultValue) {
        int iMarial = marial(key);
        return iMarial >= 0 ? (V) this.array[(iMarial << 1) + 1] : defaultValue;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i = this.size;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public void impromptu(splinterproof<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        int i = map.size;
        saneness(this.size + i);
        if (this.size != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(map.competently(i2), map.formularize(i2));
            }
        } else if (i > 0) {
            p002kotlin.collections.arytenoidectomy.competently(map.hashes, this.hashes, 0, 0, i);
            p002kotlin.collections.arytenoidectomy.taiyuan(map.array, this.array, 0, 0, i << 1);
            this.size = i;
        }
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public int marial(K key) {
        return key == null ? beachfront() : wireman(key, key.hashCode());
    }

    public V put(K key, V value) {
        int i = this.size;
        int iHashCode = key != null ? key.hashCode() : 0;
        int iWireman = key != null ? wireman(key, iHashCode) : beachfront();
        if (iWireman >= 0) {
            int i2 = (iWireman << 1) + 1;
            Object[] objArr = this.array;
            V v = (V) objArr[i2];
            objArr[i2] = value;
            return v;
        }
        int i3 = ~iWireman;
        int[] iArr = this.hashes;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i4 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.array = objArrCopyOf;
            if (i != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.hashes;
            int i5 = i3 + 1;
            p002kotlin.collections.arytenoidectomy.competently(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.array;
            p002kotlin.collections.arytenoidectomy.taiyuan(objArr2, objArr2, i5 << 1, i3 << 1, this.size << 1);
        }
        int i6 = this.size;
        if (i == i6) {
            int[] iArr3 = this.hashes;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.array;
                int i7 = i3 << 1;
                objArr3[i7] = key;
                objArr3[i7 + 1] = value;
                this.size = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K key, V value) {
        V v = get(key);
        return v == null ? put(key, value) : v;
    }

    public V remove(K key) {
        int iMarial = marial(key);
        if (iMarial >= 0) {
            return taiyuan(iMarial);
        }
        return null;
    }

    public V replace(K key, V value) {
        int iMarial = marial(key);
        if (iMarial >= 0) {
            return cutely(iMarial, value);
        }
        return null;
    }

    public void saneness(int minimumCapacity) {
        int i = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < minimumCapacity) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, minimumCapacity);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, minimumCapacity * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.array = objArrCopyOf;
        }
        if (this.size != i) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: size, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public V taiyuan(int index) {
        if (!(index >= 0 && index < this.size)) {
            molybdenite.wireman.attabal("Expected index to be within 0..size()-1, but was " + index);
        }
        Object[] objArr = this.array;
        int i = index << 1;
        V v = (V) objArr[i + 1];
        int i2 = this.size;
        if (i2 <= 1) {
            clear();
            return v;
        }
        int i3 = i2 - 1;
        int[] iArr = this.hashes;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (index < i3) {
                int i4 = index + 1;
                p002kotlin.collections.arytenoidectomy.competently(iArr, iArr, index, i4, i2);
                Object[] objArr2 = this.array;
                p002kotlin.collections.arytenoidectomy.taiyuan(objArr2, objArr2, i, i4 << 1, i2 << 1);
            }
            Object[] objArr3 = this.array;
            int i5 = i3 << 1;
            objArr3[i5] = null;
            objArr3[i5 + 1] = null;
        } else {
            int i6 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i6);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i6 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.array = objArrCopyOf;
            if (i2 != this.size) {
                throw new ConcurrentModificationException();
            }
            if (index > 0) {
                p002kotlin.collections.arytenoidectomy.competently(iArr, this.hashes, 0, 0, index);
                p002kotlin.collections.arytenoidectomy.taiyuan(objArr, this.array, 0, 0, i);
            }
            if (index < i3) {
                int i7 = index + 1;
                p002kotlin.collections.arytenoidectomy.competently(iArr, this.hashes, index, i7, i2);
                p002kotlin.collections.arytenoidectomy.taiyuan(objArr, this.array, i, i7 << 1, i2 << 1);
            }
        }
        if (i2 != this.size) {
            throw new ConcurrentModificationException();
        }
        this.size = i3;
        return v;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K kCompetently = competently(i2);
            if (kCompetently != sb) {
                sb.append(kCompetently);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vFormularize = formularize(i2);
            if (vFormularize != sb) {
                sb.append(vFormularize);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final int wireman(K key, int hash) {
        int i = this.size;
        if (i == 0) {
            return -1;
        }
        int iAttabal = molybdenite.attabal.attabal(this.hashes, i, hash);
        if (iAttabal < 0 || Intrinsics.wireman(key, this.array[iAttabal << 1])) {
            return iAttabal;
        }
        int i2 = iAttabal + 1;
        while (i2 < i && this.hashes[i2] == hash) {
            if (Intrinsics.wireman(key, this.array[i2 << 1])) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iAttabal - 1; i3 >= 0 && this.hashes[i3] == hash; i3--) {
            if (Intrinsics.wireman(key, this.array[i3 << 1])) {
                return i3;
            }
        }
        return ~i2;
    }

    public splinterproof(int i) {
        this.hashes = i == 0 ? molybdenite.attabal.f33567attabal : new int[i];
        this.array = i == 0 ? molybdenite.attabal.f33568dern : new Object[i << 1];
    }

    public boolean remove(K key, V value) {
        int iMarial = marial(key);
        if (iMarial < 0 || !Intrinsics.wireman(value, formularize(iMarial))) {
            return false;
        }
        taiyuan(iMarial);
        return true;
    }

    public boolean replace(K key, V oldValue, V newValue) {
        int iMarial = marial(key);
        if (iMarial < 0 || !Intrinsics.wireman(oldValue, formularize(iMarial))) {
            return false;
        }
        cutely(iMarial, newValue);
        return true;
    }

    public /* synthetic */ splinterproof(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public splinterproof(splinterproof<? extends K, ? extends V> splinterproofVar) {
        this(0, 1, null);
        if (splinterproofVar != null) {
            impromptu(splinterproofVar);
        }
    }
}
