package androidx.collection;

import com.ironsource.X3;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: LongObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0006J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/collection/supplicat;", "V", "Landroidx/collection/graveside;", "", "initialCapacity", "<init>", "(I)V", "", X3.i.W, "value", "", "kowloon", "(JLjava/lang/Object;)V", "competently", "()V", "beachfront", "impromptu", "newCapacity", "triweekly", "impassible", "capacity", "formularize", "apical", "taiyuan", "(J)I", "hash1", "cutely", "(I)I", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class supplicat<V> extends graveside<V> {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public int growthLimit;

    public supplicat(int i) {
        super(null);
        if (!(i >= 0)) {
            molybdenite.wireman.attabal("Capacity must be a positive value.");
        }
        impassible(peridotite.beachfront(i));
    }

    public final void apical() {
        this.growthLimit = peridotite.saneness(get_capacity()) - this._size;
    }

    public final void beachfront() {
        if (this._capacity <= 8 || Long.compare(patroclinal.monoploid.dern(patroclinal.monoploid.dern(this._size) * 32) ^ Long.MIN_VALUE, patroclinal.monoploid.dern(patroclinal.monoploid.dern(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            triweekly(peridotite.wireman(this._capacity));
        } else {
            impromptu();
        }
    }

    public final void competently() {
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
        apical();
    }

    public final int cutely(int hash1) {
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

    public final void formularize(int capacity) {
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
        apical();
    }

    public final void impassible(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, peridotite.marial(initialCapacity)) : 0;
        this._capacity = iMax;
        formularize(iMax);
        this.keys = new long[iMax];
        this.values = new Object[iMax];
    }

    public final void impromptu() {
        long[] jArr = this.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int i = this._capacity;
        long[] jArr2 = this.keys;
        Object[] objArr = this.values;
        int i2 = (i + 7) >> 3;
        char c = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = jArr[i3] & (-9187201950435737472L);
            jArr[i3] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int iHydrovane = p002kotlin.collections.polloi.hydrovane(jArr);
        int i4 = iHydrovane - 1;
        long j2 = 72057594037927935L;
        jArr[i4] = (jArr[i4] & 72057594037927935L) | (-72057594037927936L);
        jArr[iHydrovane] = jArr[0];
        int i5 = 0;
        while (i5 != i) {
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j3 = (jArr[i6] >> i7) & 255;
            if (j3 != 128 && j3 == 254) {
                int iHashCode = Long.hashCode(jArr2[i5]) * (-862048943);
                int i8 = iHashCode ^ (iHashCode << 16);
                int i9 = i8 >>> 7;
                int iCutely = cutely(i9);
                int i10 = i9 & i;
                char c2 = c;
                if (((iCutely - i10) & i) / 8 == ((i5 - i10) & i) / 8) {
                    jArr[i6] = (((long) (i8 & 127)) << i7) | ((~(255 << i7)) & jArr[i6]);
                    jArr[p002kotlin.collections.polloi.hydrovane(jArr)] = (jArr[c2] & j2) | Long.MIN_VALUE;
                    i5++;
                    c = c2;
                } else {
                    int i11 = iCutely >> 3;
                    long j4 = jArr[i11];
                    int i12 = (iCutely & 7) << 3;
                    if (((j4 >> i12) & 255) == 128) {
                        jArr[i11] = (((long) (i8 & 127)) << i12) | (j4 & (~(255 << i12)));
                        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (128 << i7);
                        jArr2[iCutely] = jArr2[i5];
                        jArr2[i5] = 0;
                        objArr[iCutely] = objArr[i5];
                        objArr[i5] = null;
                    } else {
                        jArr[i11] = (((long) (i8 & 127)) << i12) | (j4 & (~(255 << i12)));
                        long j5 = jArr2[iCutely];
                        jArr2[iCutely] = jArr2[i5];
                        jArr2[i5] = j5;
                        Object obj = objArr[iCutely];
                        objArr[iCutely] = objArr[i5];
                        objArr[i5] = obj;
                        i5--;
                    }
                    jArr[p002kotlin.collections.polloi.hydrovane(jArr)] = (jArr[c2] & j2) | Long.MIN_VALUE;
                    i5++;
                    c = c2;
                    j2 = j2;
                }
            } else {
                i5++;
            }
        }
        apical();
    }

    public final void kowloon(long key, V value) {
        int iTaiyuan = taiyuan(key);
        this.keys[iTaiyuan] = key;
        this.values[iTaiyuan] = value;
    }

    public final int taiyuan(long key) {
        int iHashCode = Long.hashCode(key) * (-862048943);
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
            int i9 = i6;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iCutely = cutely(i2);
                if (this.growthLimit == 0 && ((this.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String[iCutely >> 3] >> ((iCutely & 7) << 3)) & 255) != 254) {
                    beachfront();
                    iCutely = cutely(i2);
                }
                this._size++;
                int i10 = this.growthLimit;
                long[] jArr2 = this.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                int i11 = iCutely >> 3;
                long j5 = jArr2[i11];
                int i12 = (iCutely & 7) << 3;
                this.growthLimit = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                int i13 = this._capacity;
                long j6 = ((~(255 << i12)) & j5) | (j2 << i12);
                jArr2[i11] = j6;
                jArr2[(((iCutely - 7) & i13) + (i13 & 7)) >> 3] = j6;
                return iCutely;
            }
            i6 = i9 + 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final void triweekly(int newCapacity) {
        supplicat<V> supplicatVar = this;
        long[] jArr = supplicatVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        long[] jArr2 = supplicatVar.keys;
        Object[] objArr = supplicatVar.values;
        int i = supplicatVar._capacity;
        impassible(newCapacity);
        long[] jArr3 = supplicatVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        long[] jArr4 = supplicatVar.keys;
        Object[] objArr2 = supplicatVar.values;
        int i2 = supplicatVar._capacity;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                long j = jArr2[i3];
                int iHashCode = Long.hashCode(j) * (-862048943);
                int i4 = iHashCode ^ (iHashCode << 16);
                int iCutely = supplicatVar.cutely(i4 >>> 7);
                long j2 = i4 & 127;
                int i5 = iCutely >> 3;
                int i6 = (iCutely & 7) << 3;
                long j3 = (jArr3[i5] & (~(255 << i6))) | (j2 << i6);
                jArr3[i5] = j3;
                jArr3[(((iCutely - 7) & i2) + (i2 & 7)) >> 3] = j3;
                jArr4[iCutely] = j;
                objArr2[iCutely] = objArr[i3];
            }
            i3++;
            supplicatVar = this;
            jArr = jArr;
        }
    }
}
