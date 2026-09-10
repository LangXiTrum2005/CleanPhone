package androidx.collection;

import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ObjectFloatMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0015\u0010\u0006J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u0011J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Landroidx/collection/merc;", "K", "Landroidx/collection/privatdozent;", "", "initialCapacity", "<init>", "(I)V", X3.i.W, "", "value", "", "polloi", "(Ljava/lang/Object;F)V", "from", "arytenoidectomy", "(Landroidx/collection/privatdozent;)V", "taiyuan", "()V", "impromptu", "cutely", "newCapacity", "monoploid", "kowloon", "capacity", "triweekly", "impassible", "formularize", "(Ljava/lang/Object;)I", "hash1", "apical", "(I)I", "beachfront", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class merc<K> extends privatdozent<K> {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public int growthLimit;

    public /* synthetic */ merc(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void arytenoidectomy(privatdozent<K> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.keys;
        float[] fArr = from.values;
        long[] jArr = from.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        polloi(objArr[i4], fArr[i4]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void cutely() {
        long[] jArr = this.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int i = this._capacity;
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        int i2 = (i + 7) >> 3;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long j = jArr[i4] & (-9187201950435737472L);
            jArr[i4] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int iHydrovane = p002kotlin.collections.polloi.hydrovane(jArr);
        int i5 = iHydrovane - 1;
        long j2 = 72057594037927935L;
        jArr[i5] = (jArr[i5] & 72057594037927935L) | (-72057594037927936L);
        jArr[iHydrovane] = jArr[0];
        int i6 = 0;
        while (i6 != i) {
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j3 = (jArr[i7] >> i8) & 255;
            if (j3 != 128 && j3 == 254) {
                Object obj = objArr[i6];
                int iHashCode = (obj != null ? obj.hashCode() : i3) * (-862048943);
                int i9 = iHashCode ^ (iHashCode << 16);
                int i10 = i9 >>> 7;
                int iApical = apical(i10);
                int i11 = i10 & i;
                int i12 = i3;
                if (((iApical - i11) & i) / 8 == ((i6 - i11) & i) / 8) {
                    jArr[i7] = (((long) (i9 & 127)) << i8) | ((~(255 << i8)) & jArr[i7]);
                    jArr[p002kotlin.collections.polloi.hydrovane(jArr)] = (jArr[i12] & j2) | Long.MIN_VALUE;
                    i6++;
                    i3 = i12;
                } else {
                    int i13 = iApical >> 3;
                    long j4 = jArr[i13];
                    int i14 = (iApical & 7) << 3;
                    if (((j4 >> i14) & 255) == 128) {
                        jArr[i13] = (((long) (i9 & 127)) << i14) | (j4 & (~(255 << i14)));
                        jArr[i7] = (jArr[i7] & (~(255 << i8))) | (128 << i8);
                        objArr[iApical] = objArr[i6];
                        objArr[i6] = null;
                        fArr[iApical] = fArr[i6];
                        fArr[i6] = 0.0f;
                    } else {
                        jArr[i13] = (((long) (i9 & 127)) << i14) | (j4 & (~(255 << i14)));
                        Object obj2 = objArr[iApical];
                        objArr[iApical] = objArr[i6];
                        objArr[i6] = obj2;
                        float f = fArr[iApical];
                        fArr[iApical] = fArr[i6];
                        fArr[i6] = f;
                        i6--;
                    }
                    jArr[p002kotlin.collections.polloi.hydrovane(jArr)] = (jArr[i12] & j2) | Long.MIN_VALUE;
                    i6++;
                    i3 = i12;
                    j2 = j2;
                }
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

    public final void impassible() {
        this.growthLimit = peridotite.saneness(get_capacity()) - this._size;
    }

    public final void impromptu() {
        if (this._capacity <= 8 || Long.compare(patroclinal.monoploid.dern(patroclinal.monoploid.dern(this._size) * 32) ^ Long.MIN_VALUE, patroclinal.monoploid.dern(patroclinal.monoploid.dern(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            monoploid(peridotite.wireman(this._capacity));
        } else {
            cutely();
        }
    }

    public final void kowloon(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, peridotite.marial(initialCapacity)) : 0;
        this._capacity = iMax;
        triweekly(iMax);
        this.keys = new Object[iMax];
        this.values = new float[iMax];
    }

    public final void monoploid(int newCapacity) {
        int i;
        long[] jArr = this.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        int i2 = this._capacity;
        kowloon(newCapacity);
        long[] jArr2 = this.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        Object[] objArr2 = this.keys;
        float[] fArr2 = this.values;
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
                objArr2[iApical] = obj;
                fArr2[iApical] = fArr[i];
            } else {
                i = i4;
            }
            i4 = i + 1;
        }
    }

    public final void polloi(K key, float value) {
        int iFormularize = formularize(key);
        if (iFormularize < 0) {
            iFormularize = ~iFormularize;
        }
        this.keys[iFormularize] = key;
        this.values[iFormularize] = value;
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
            jArr = jArr2;
        }
        this.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String = jArr;
        int i = capacity >> 3;
        long j = 255 << ((capacity & 7) << 3);
        jArr[i] = (jArr[i] & (~j)) | j;
        impassible();
    }

    public merc(int i) {
        super(null);
        if (!(i >= 0)) {
            molybdenite.wireman.attabal("Capacity must be a positive value.");
        }
        kowloon(peridotite.beachfront(i));
    }
}
