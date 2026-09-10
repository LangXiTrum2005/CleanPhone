package androidx.collection;

import com.ironsource.X3;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0013\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\rJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0000¢\u0006\u0004\b!\u0010\rJ\u000f\u0010\"\u001a\u00020\bH\u0000¢\u0006\u0004\b\"\u0010\rJ\u0017\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0004H\u0000¢\u0006\u0004\b$\u0010\u0007R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/collection/grimness;", "K", "V", "Landroidx/collection/walach;", "", "initialCapacity", "<init>", "(I)V", "", "kowloon", "capacity", "triweekly", "impassible", "()V", "hash1", "apical", "(I)I", X3.i.W, "value", "graveside", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "from", "arytenoidectomy", "(Ljava/util/Map;)V", "monoploid", "(Ljava/lang/Object;)Ljava/lang/Object;", "index", "polloi", "(I)Ljava/lang/Object;", "taiyuan", "formularize", "(Ljava/lang/Object;)I", "impromptu", "cutely", "newCapacity", "molybdenite", "beachfront", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class grimness<K, V> extends walach<K, V> {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public int growthLimit;

    public /* synthetic */ grimness(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public final int apical(int hash1) {
        int i = this._capacity;
        int i2 = hash1 & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            long j = ((jArr[i4 + 1] << (64 - i5)) & ((-i5) >> 63)) | (jArr[i4] >>> i5);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i2 + (Long.numberOfTrailingZeros(j2) >> 3)) & i;
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
    }

    public final void arytenoidectomy(Map<K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            graveside(entry.getKey(), entry.getValue());
        }
    }

    public final void cutely() {
        long[] jArr = this.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int i = this._capacity;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i2 = (i + 7) >> 3;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long j = jArr[i4] & (-9187201950435737472L);
            jArr[i4] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int iHydrovane = p002kotlin.collections.polloi.hydrovane(jArr);
        int i5 = iHydrovane - 1;
        jArr[i5] = (jArr[i5] & 72057594037927935L) | (-72057594037927936L);
        jArr[iHydrovane] = jArr[0];
        int i6 = 0;
        while (i6 != i) {
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j2 = (jArr[i7] >> i8) & 255;
            if (j2 != 128 && j2 == 254) {
                Object obj = objArr[i6];
                int iHashCode = (obj != null ? obj.hashCode() : i3) * (-862048943);
                int i9 = iHashCode ^ (iHashCode << 16);
                int i10 = i9 >>> 7;
                int iApical = apical(i10);
                int i11 = i10 & i;
                int i12 = i3;
                if (((iApical - i11) & i) / 8 == ((i6 - i11) & i) / 8) {
                    jArr[i7] = (((long) (i9 & 127)) << i8) | ((~(255 << i8)) & jArr[i7]);
                    jArr[p002kotlin.collections.polloi.hydrovane(jArr)] = jArr[i12];
                } else {
                    int i13 = iApical >> 3;
                    long j3 = jArr[i13];
                    int i14 = (iApical & 7) << 3;
                    if (((j3 >> i14) & 255) == 128) {
                        jArr[i13] = (((long) (i9 & 127)) << i14) | (j3 & (~(255 << i14)));
                        jArr[i7] = (jArr[i7] & (~(255 << i8))) | (128 << i8);
                        objArr[iApical] = objArr[i6];
                        objArr[i6] = null;
                        objArr2[iApical] = objArr2[i6];
                        objArr2[i6] = null;
                    } else {
                        jArr[i13] = (((long) (i9 & 127)) << i14) | (j3 & (~(255 << i14)));
                        Object obj2 = objArr[iApical];
                        objArr[iApical] = objArr[i6];
                        objArr[i6] = obj2;
                        Object obj3 = objArr2[iApical];
                        objArr2[iApical] = objArr2[i6];
                        objArr2[i6] = obj3;
                        i6--;
                    }
                    jArr[p002kotlin.collections.polloi.hydrovane(jArr)] = jArr[i12];
                }
                i6++;
                i3 = i12;
            } else {
                i6++;
            }
        }
        impassible();
    }

    public final int formularize(K key) {
        int iHashCode = (key != null ? key.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this._capacity;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i9 = i3;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = (i5 + (Long.numberOfTrailingZeros(j4) >> 3)) & i4;
                if (Intrinsics.wireman(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iApical = apical(i2);
                if (this.growthLimit == 0 && ((this.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String[iApical >> 3] >> ((iApical & 7) << 3)) & 255) != 254) {
                    impromptu();
                    iApical = apical(i2);
                }
                this._size++;
                int i10 = this.growthLimit;
                long[] jArr2 = this.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                int i11 = iApical >> 3;
                long j5 = jArr2[i11];
                int i12 = (iApical & 7) << 3;
                this.growthLimit = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                int i13 = this._capacity;
                long j6 = ((~(255 << i12)) & j5) | (j2 << i12);
                jArr2[i11] = j6;
                jArr2[(((iApical - 7) & i13) + (i13 & 7)) >> 3] = j6;
                return ~iApical;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    public final void graveside(K key, V value) {
        int iFormularize = formularize(key);
        if (iFormularize < 0) {
            iFormularize = ~iFormularize;
        }
        this.keys[iFormularize] = key;
        this.values[iFormularize] = value;
    }

    public final void impassible() {
        this.growthLimit = peridotite.saneness(get_capacity()) - this._size;
    }

    public final void impromptu() {
        if (this._capacity <= 8 || Long.compare(patroclinal.monoploid.dern(patroclinal.monoploid.dern(this._size) * 32) ^ Long.MIN_VALUE, patroclinal.monoploid.dern(patroclinal.monoploid.dern(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            molybdenite(peridotite.wireman(this._capacity));
        } else {
            cutely();
        }
    }

    public final void kowloon(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, peridotite.marial(initialCapacity)) : 0;
        this._capacity = iMax;
        triweekly(iMax);
        this.keys = iMax == 0 ? molybdenite.attabal.f33568dern : new Object[iMax];
        this.values = iMax == 0 ? molybdenite.attabal.f33568dern : new Object[iMax];
    }

    public final void molybdenite(int newCapacity) {
        int i;
        long[] jArr = this.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i2 = this._capacity;
        kowloon(newCapacity);
        long[] jArr2 = this.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        Object[] objArr3 = this.keys;
        Object[] objArr4 = this.values;
        int i3 = this._capacity;
        int i4 = 0;
        while (i4 < i2) {
            if (((jArr[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i4];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i5 = iHashCode ^ (iHashCode << 16);
                int iApical = apical(i5 >>> 7);
                i = i4;
                long j = i5 & 127;
                int i6 = iApical >> 3;
                int i7 = (iApical & 7) << 3;
                long j2 = (j << i7) | (jArr2[i6] & (~(255 << i7)));
                jArr2[i6] = j2;
                jArr2[(((iApical - 7) & i3) + (i3 & 7)) >> 3] = j2;
                objArr3[iApical] = obj;
                objArr4[iApical] = objArr2[i];
            } else {
                i = i4;
            }
            i4 = i + 1;
        }
    }

    public final V monoploid(K key) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (key != null ? key.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (Intrinsics.wireman(this.keys[iNumberOfTrailingZeros], key)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i += 8;
            i5 = i6 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return polloi(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final V polloi(int index) {
        this._size--;
        long[] jArr = this.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int i = this._capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j;
        this.keys[index] = null;
        Object[] objArr = this.values;
        V v = (V) objArr[index];
        objArr[index] = null;
        return v;
    }

    public final void taiyuan() {
        this._size = 0;
        long[] jArr = this.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        if (jArr != peridotite.f5721attabal) {
            p002kotlin.collections.arytenoidectomy.adultoid(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
            int i = this._capacity;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        p002kotlin.collections.arytenoidectomy.molybdenite(this.values, null, 0, this._capacity);
        p002kotlin.collections.arytenoidectomy.molybdenite(this.keys, null, 0, this._capacity);
        impassible();
    }

    public final void triweekly(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = peridotite.f5721attabal;
        } else {
            long[] jArr2 = new long[((capacity + 15) & (-8)) >> 3];
            p002kotlin.collections.arytenoidectomy.adultoid(jArr2, -9187201950435737472L, 0, 0, 6, null);
            int i = capacity >> 3;
            long j = 255 << ((capacity & 7) << 3);
            jArr2[i] = (jArr2[i] & (~j)) | j;
            jArr = jArr2;
        }
        this.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String = jArr;
        impassible();
    }

    public grimness(int i) {
        super(null);
        if (!(i >= 0)) {
            molybdenite.wireman.attabal("Capacity must be a positive value.");
        }
        kowloon(peridotite.beachfront(i));
    }
}
