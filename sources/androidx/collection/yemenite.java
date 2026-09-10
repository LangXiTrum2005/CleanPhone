package androidx.collection;

import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: IntObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0018\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0015\u0010\u0006J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u0011J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/collection/yemenite;", "V", "Landroidx/collection/kowloon;", "", "initialCapacity", "<init>", "(I)V", X3.i.W, "value", "", "molybdenite", "(ILjava/lang/Object;)V", "arytenoidectomy", "(I)Ljava/lang/Object;", "index", "monoploid", "taiyuan", "()V", "impromptu", "cutely", "newCapacity", "polloi", "kowloon", "capacity", "triweekly", "impassible", "apical", "(I)I", "hash1", "formularize", "beachfront", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class yemenite<V> extends kowloon<V> {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public int growthLimit;

    public /* synthetic */ yemenite(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public final int apical(int key) {
        int iHashCode = Integer.hashCode(key) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this._capacity;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            int i9 = 1;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i10 = i6;
            long j3 = j ^ (j2 * 72340172838076673L);
            long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (j4 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                int i11 = i9;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
                j4 &= j4 - 1;
                i9 = i11;
            }
            int i12 = i9;
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iFormularize = formularize(i2);
                if (this.growthLimit == 0 && ((this.metadata[iFormularize >> 3] >> ((iFormularize & 7) << 3)) & 255) != 254) {
                    impromptu();
                    iFormularize = formularize(i2);
                }
                this._size++;
                int i13 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i14 = iFormularize >> 3;
                long j5 = jArr2[i14];
                int i15 = (iFormularize & 7) << 3;
                this.growthLimit = i13 - (((j5 >> i15) & 255) == 128 ? i12 : 0);
                int i16 = this._capacity;
                long j6 = ((~(255 << i15)) & j5) | (j2 << i15);
                jArr2[i14] = j6;
                jArr2[(((iFormularize - 7) & i16) + (i16 & 7)) >> 3] = j6;
                return iFormularize;
            }
            i6 = i10 + 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final V arytenoidectomy(int key) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(key) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this._capacity;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return monoploid(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final void cutely() {
        long[] jArr = this.metadata;
        int i = this._capacity;
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                int iHashCode = Integer.hashCode(iArr[i6]) * (-862048943);
                int i9 = iHashCode ^ (iHashCode << 16);
                int i10 = i9 >>> 7;
                int iFormularize = formularize(i10);
                int i11 = i10 & i;
                int i12 = i3;
                if (((iFormularize - i11) & i) / 8 == ((i6 - i11) & i) / 8) {
                    jArr[i7] = (((long) (i9 & 127)) << i8) | ((~(255 << i8)) & jArr[i7]);
                    jArr[p002kotlin.collections.polloi.hydrovane(jArr)] = (jArr[i12] & j2) | Long.MIN_VALUE;
                    i6++;
                    i3 = i12;
                } else {
                    int i13 = iFormularize >> 3;
                    long j4 = jArr[i13];
                    int i14 = (iFormularize & 7) << 3;
                    if (((j4 >> i14) & 255) == 128) {
                        jArr[i13] = (((long) (i9 & 127)) << i14) | (j4 & (~(255 << i14)));
                        jArr[i7] = (jArr[i7] & (~(255 << i8))) | (128 << i8);
                        iArr[iFormularize] = iArr[i6];
                        iArr[i6] = i12;
                        objArr[iFormularize] = objArr[i6];
                        objArr[i6] = null;
                    } else {
                        jArr[i13] = (((long) (i9 & 127)) << i14) | (j4 & (~(255 << i14)));
                        int i15 = iArr[iFormularize];
                        iArr[iFormularize] = iArr[i6];
                        iArr[i6] = i15;
                        Object obj = objArr[iFormularize];
                        objArr[iFormularize] = objArr[i6];
                        objArr[i6] = obj;
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

    public final int formularize(int hash1) {
        int i = this._capacity;
        int i2 = hash1 & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.metadata;
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

    public final void impassible() {
        this.growthLimit = peridotite.saneness(get_capacity()) - this._size;
    }

    public final void impromptu() {
        if (this._capacity <= 8 || Long.compare(patroclinal.monoploid.dern(patroclinal.monoploid.dern(this._size) * 32) ^ Long.MIN_VALUE, patroclinal.monoploid.dern(patroclinal.monoploid.dern(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            polloi(peridotite.wireman(this._capacity));
        } else {
            cutely();
        }
    }

    public final void kowloon(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, peridotite.marial(initialCapacity)) : 0;
        this._capacity = iMax;
        triweekly(iMax);
        this.keys = new int[iMax];
        this.values = new Object[iMax];
    }

    public final void molybdenite(int key, V value) {
        int iApical = apical(key);
        this.keys[iApical] = key;
        this.values[iApical] = value;
    }

    public final V monoploid(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j;
        Object[] objArr = this.values;
        V v = (V) objArr[index];
        objArr[index] = null;
        return v;
    }

    public final void polloi(int newCapacity) {
        yemenite<V> yemeniteVar = this;
        long[] jArr = yemeniteVar.metadata;
        int[] iArr = yemeniteVar.keys;
        Object[] objArr = yemeniteVar.values;
        int i = yemeniteVar._capacity;
        kowloon(newCapacity);
        long[] jArr2 = yemeniteVar.metadata;
        int[] iArr2 = yemeniteVar.keys;
        Object[] objArr2 = yemeniteVar.values;
        int i2 = yemeniteVar._capacity;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                int i4 = iArr[i3];
                int iHashCode = Integer.hashCode(i4) * (-862048943);
                int i5 = iHashCode ^ (iHashCode << 16);
                int iFormularize = yemeniteVar.formularize(i5 >>> 7);
                long j = i5 & 127;
                int i6 = iFormularize >> 3;
                int i7 = (iFormularize & 7) << 3;
                long j2 = (jArr2[i6] & (~(255 << i7))) | (j << i7);
                jArr2[i6] = j2;
                jArr2[(((iFormularize - 7) & i2) + (i2 & 7)) >> 3] = j2;
                iArr2[iFormularize] = i4;
                objArr2[iFormularize] = objArr[i3];
            }
            i3++;
            yemeniteVar = this;
            jArr = jArr;
        }
    }

    public final void taiyuan() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != peridotite.f5721attabal) {
            p002kotlin.collections.arytenoidectomy.adultoid(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.metadata;
            int i = this._capacity;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        p002kotlin.collections.arytenoidectomy.molybdenite(this.values, null, 0, this._capacity);
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
        this.metadata = jArr;
        int i = capacity >> 3;
        long j = 255 << ((capacity & 7) << 3);
        jArr[i] = (jArr[i] & (~j)) | j;
        impassible();
    }

    public yemenite(int i) {
        super(null);
        if (!(i >= 0)) {
            molybdenite.wireman.attabal("Capacity must be a positive value.");
        }
        kowloon(peridotite.beachfront(i));
    }
}
