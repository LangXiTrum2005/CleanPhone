package dent;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C3414a2;
import com.ironsource.X3;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.collections.arytenoidectomy;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SimpleArrayMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\rJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u001e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010(R\"\u0010-\u001a\u00020\u00048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u0007¨\u0006."}, d2 = {"Ldent/dern;", "K", "V", "", "", "capacity", "<init>", "(I)V", X3.i.W, "hash", "dern", "(Ljava/lang/Object;I)I", "marial", "()I", "", "attabal", "(Ljava/lang/Object;)Z", "wireman", "(Ljava/lang/Object;)I", "saneness", "(Ljava/lang/Object;)Ljava/lang/Object;", "index", "competently", "(I)Ljava/lang/Object;", "taiyuan", "beachfront", "()Z", "value", "impromptu", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", C3414a2.d, "equals", "hashCode", "", "toString", "()Ljava/lang/String;", "", "[I", "hashes", "", "[Ljava/lang/Object;", "keyValues", "I", "get_size", "set_size", "_size", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class dern<K, V> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public int[] hashes;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public int _size;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public Object[] keyValues;

    public dern(int i) {
        if (i == 0) {
            this.hashes = attabal.f25206attabal;
            this.keyValues = attabal.f25207saneness;
        } else {
            this.hashes = new int[i];
            this.keyValues = new Object[i << 1];
        }
        this._size = 0;
    }

    public final boolean attabal(K key) {
        return wireman(key) >= 0;
    }

    public final boolean beachfront() {
        return this._size <= 0;
    }

    public final K competently(int index) {
        return (K) this.keyValues[index << 1];
    }

    public final int dern(Object key, int hash) {
        int i = this._size;
        if (i == 0) {
            return -1;
        }
        int iAttabal = attabal.attabal(this.hashes, i, hash);
        if (iAttabal < 0 || Intrinsics.wireman(key, this.keyValues[iAttabal << 1])) {
            return iAttabal;
        }
        int i2 = iAttabal + 1;
        while (i2 < i && this.hashes[i2] == hash) {
            if (Intrinsics.wireman(key, this.keyValues[i2 << 1])) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iAttabal - 1; i3 >= 0 && this.hashes[i3] == hash; i3--) {
            if (Intrinsics.wireman(key, this.keyValues[i3 << 1])) {
                return i3;
            }
        }
        return ~i2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        try {
            if (other instanceof dern) {
                dern dernVar = (dern) other;
                int i = this._size;
                if (i != dernVar._size) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    K kCompetently = competently(i2);
                    V vTaiyuan = taiyuan(i2);
                    Object objSaneness = dernVar.saneness(kCompetently);
                    if (vTaiyuan == null) {
                        if (objSaneness != null || !dernVar.attabal(kCompetently)) {
                            return false;
                        }
                    } else if (!Intrinsics.wireman(vTaiyuan, objSaneness)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(other instanceof Map) || this._size != ((Map) other).size()) {
                return false;
            }
            int i3 = this._size;
            for (int i4 = 0; i4 < i3; i4++) {
                K kCompetently2 = competently(i4);
                V vTaiyuan2 = taiyuan(i4);
                Object obj = ((Map) other).get(kCompetently2);
                if (vTaiyuan2 == null) {
                    if (obj != null || !((Map) other).containsKey(kCompetently2)) {
                        return false;
                    }
                } else if (!Intrinsics.wireman(vTaiyuan2, obj)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.keyValues;
        int i = this._size;
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

    public final V impromptu(K key, V value) {
        int iHashCode;
        int iDern;
        int i = this._size;
        if (key == null) {
            iDern = marial();
            iHashCode = 0;
        } else {
            iHashCode = key.hashCode();
            iDern = dern(key, iHashCode);
        }
        if (iDern >= 0) {
            int i2 = (iDern << 1) + 1;
            Object[] objArr = this.keyValues;
            V v = (V) objArr[i2];
            objArr[i2] = value;
            return v;
        }
        int i3 = ~iDern;
        int[] iArr = this.hashes;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.keyValues, i4 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.keyValues = objArrCopyOf;
            if (i != this._size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.hashes;
            int i5 = i3 + 1;
            arytenoidectomy.competently(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.keyValues;
            arytenoidectomy.taiyuan(objArr2, objArr2, i5 << 1, i3 << 1, this._size << 1);
        }
        int i6 = this._size;
        if (i == i6) {
            int[] iArr3 = this.hashes;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.keyValues;
                int i7 = i3 << 1;
                objArr3[i7] = key;
                objArr3[i7 + 1] = value;
                this._size = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final int marial() {
        int i = this._size;
        if (i == 0) {
            return -1;
        }
        int iAttabal = attabal.attabal(this.hashes, i, 0);
        if (iAttabal < 0 || this.keyValues[iAttabal << 1] == null) {
            return iAttabal;
        }
        int i2 = iAttabal + 1;
        while (i2 < i && this.hashes[i2] == 0) {
            if (this.keyValues[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iAttabal - 1; i3 >= 0 && this.hashes[i3] == 0; i3--) {
            if (this.keyValues[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final V saneness(K key) {
        int iWireman = wireman(key);
        if (iWireman >= 0) {
            return (V) this.keyValues[(iWireman << 1) + 1];
        }
        return null;
    }

    public final V taiyuan(int index) {
        return (V) this.keyValues[(index << 1) + 1];
    }

    public String toString() {
        if (beachfront()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this._size * 28);
        sb.append('{');
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K kCompetently = competently(i2);
            if (kCompetently != this) {
                sb.append(kCompetently);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vTaiyuan = taiyuan(i2);
            if (vTaiyuan != this) {
                sb.append(vTaiyuan);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final int wireman(Object key) {
        return key == null ? marial() : dern(key, key.hashCode());
    }

    public /* synthetic */ dern(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
