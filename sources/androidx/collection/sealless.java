package androidx.collection;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IntSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\f\u0010\u0005J\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0005J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\u001fR\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/collection/sealless;", "Landroidx/collection/monoploid;", "", "initialCapacity", "<init>", "(I)V", "element", "", "beachfront", "(I)Z", "monoploid", "", "kowloon", "elements", "polloi", "(Landroidx/collection/monoploid;)Z", "arytenoidectomy", "(Landroidx/collection/monoploid;)V", "impromptu", "()V", "competently", "taiyuan", "newCapacity", "graveside", "triweekly", "capacity", "impassible", "formularize", "index", "molybdenite", "cutely", "(I)I", "hash1", "apical", "wireman", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class sealless extends monoploid {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public int growthLimit;

    public sealless() {
        this(0, 1, null);
    }

    public final int apical(int hash1) {
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

    public final void arytenoidectomy(monoploid elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int[] iArr = elements.elements;
        long[] jArr = elements.metadata;
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
                        kowloon(iArr[(i << 3) + i3]);
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

    public final boolean beachfront(int element) {
        int i = this._size;
        this.elements[cutely(element)] = element;
        return this._size != i;
    }

    public final void competently() {
        if (this._capacity <= 8 || Long.compare(patroclinal.monoploid.dern(patroclinal.monoploid.dern(this._size) * 32) ^ Long.MIN_VALUE, patroclinal.monoploid.dern(patroclinal.monoploid.dern(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            graveside(peridotite.wireman(this._capacity));
        } else {
            taiyuan();
        }
    }

    public final int cutely(int element) {
        int iHashCode = Integer.hashCode(element) * (-862048943);
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
                if (this.elements[iNumberOfTrailingZeros] == element) {
                    return iNumberOfTrailingZeros;
                }
                j4 &= j4 - 1;
                i9 = i11;
            }
            int i12 = i9;
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iApical = apical(i2);
                if (this.growthLimit == 0 && ((this.metadata[iApical >> 3] >> ((iApical & 7) << 3)) & 255) != 254) {
                    competently();
                    iApical = apical(i2);
                }
                this._size++;
                int i13 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i14 = iApical >> 3;
                long j5 = jArr2[i14];
                int i15 = (iApical & 7) << 3;
                this.growthLimit = i13 - (((j5 >> i15) & 255) == 128 ? i12 : 0);
                int i16 = this._capacity;
                long j6 = ((~(255 << i15)) & j5) | (j2 << i15);
                jArr2[i14] = j6;
                jArr2[(((iApical - 7) & i16) + (i16 & 7)) >> 3] = j6;
                return iApical;
            }
            i6 = i10 + 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final void formularize() {
        this.growthLimit = peridotite.saneness(get_capacity()) - this._size;
    }

    public final void graveside(int newCapacity) {
        long[] jArr = this.metadata;
        int[] iArr = this.elements;
        int i = this._capacity;
        triweekly(newCapacity);
        long[] jArr2 = this.metadata;
        int[] iArr2 = this.elements;
        int i2 = this._capacity;
        for (int i3 = 0; i3 < i; i3++) {
            if (((jArr[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                int i4 = iArr[i3];
                int iHashCode = Integer.hashCode(i4) * (-862048943);
                int i5 = iHashCode ^ (iHashCode << 16);
                int iApical = apical(i5 >>> 7);
                long j = i5 & 127;
                int i6 = iApical >> 3;
                int i7 = (iApical & 7) << 3;
                long j2 = (jArr2[i6] & (~(255 << i7))) | (j << i7);
                jArr2[i6] = j2;
                jArr2[(((iApical - 7) & i2) + (i2 & 7)) >> 3] = j2;
                iArr2[iApical] = i4;
            }
        }
    }

    public final void impassible(int capacity) {
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
        formularize();
    }

    public final void impromptu() {
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
        formularize();
    }

    public final void kowloon(int element) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(element) * (-862048943);
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
                if (this.elements[iNumberOfTrailingZeros] == element) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i5 += 8;
                i4 = (i4 + i5) & i3;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            molybdenite(iNumberOfTrailingZeros);
        }
    }

    public final void molybdenite(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j;
    }

    public final boolean monoploid(int element) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(element) * (-862048943);
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
                if (this.elements[iNumberOfTrailingZeros] == element) {
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
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            molybdenite(iNumberOfTrailingZeros);
        }
        return z;
    }

    public final boolean polloi(monoploid elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = this._size;
        arytenoidectomy(elements);
        return i != this._size;
    }

    public final void taiyuan() {
        long[] jArr = this.metadata;
        int i = this._capacity;
        int[] iArr = this.elements;
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
                        iArr[iApical] = iArr[i6];
                        iArr[i6] = i12;
                    } else {
                        jArr[i13] = (((long) (i9 & 127)) << i14) | (j4 & (~(255 << i14)));
                        int i15 = iArr[iApical];
                        iArr[iApical] = iArr[i6];
                        iArr[i6] = i15;
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
        formularize();
    }

    public final void triweekly(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, peridotite.marial(initialCapacity)) : 0;
        this._capacity = iMax;
        impassible(iMax);
        this.elements = new int[iMax];
    }

    public sealless(int i) {
        super(null);
        if (!(i >= 0)) {
            molybdenite.wireman.attabal("Capacity must be a positive value.");
        }
        triweekly(peridotite.beachfront(i));
    }

    public /* synthetic */ sealless(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }
}
