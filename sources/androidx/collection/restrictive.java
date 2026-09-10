package androidx.collection;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: LongSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0005J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/collection/restrictive;", "Landroidx/collection/adultoid;", "", "initialCapacity", "<init>", "(I)V", "", "element", "", "formularize", "(J)V", "", "impassible", "(J)Z", "marial", "()V", "beachfront", "newCapacity", "kowloon", "apical", "capacity", "cutely", "taiyuan", "index", "triweekly", "competently", "(J)I", "hash1", "impromptu", "(I)I", "wireman", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class restrictive extends adultoid {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public int growthLimit;

    public restrictive(int i) {
        super(null);
        if (!(i >= 0)) {
            molybdenite.wireman.attabal("Capacity must be a positive value.");
        }
        apical(peridotite.beachfront(i));
    }

    public final void apical(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, peridotite.marial(initialCapacity)) : 0;
        this._capacity = iMax;
        cutely(iMax);
        this.elements = new long[iMax];
    }

    public final void beachfront() {
        long[] jArr = this.metadata;
        int i = this._capacity;
        long[] jArr2 = this.elements;
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
                int iImpromptu = impromptu(i9);
                int i10 = i9 & i;
                char c2 = c;
                if (((iImpromptu - i10) & i) / 8 == ((i5 - i10) & i) / 8) {
                    jArr[i6] = (((long) (i8 & 127)) << i7) | ((~(255 << i7)) & jArr[i6]);
                    jArr[p002kotlin.collections.polloi.hydrovane(jArr)] = (jArr[c2] & j2) | Long.MIN_VALUE;
                    i5++;
                    c = c2;
                } else {
                    int i11 = iImpromptu >> 3;
                    long j4 = jArr[i11];
                    int i12 = (iImpromptu & 7) << 3;
                    if (((j4 >> i12) & 255) == 128) {
                        jArr[i11] = (((long) (i8 & 127)) << i12) | (j4 & (~(255 << i12)));
                        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (128 << i7);
                        jArr2[iImpromptu] = jArr2[i5];
                        jArr2[i5] = 0;
                    } else {
                        jArr[i11] = (((long) (i8 & 127)) << i12) | (j4 & (~(255 << i12)));
                        long j5 = jArr2[iImpromptu];
                        jArr2[iImpromptu] = jArr2[i5];
                        jArr2[i5] = j5;
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
        taiyuan();
    }

    public final int competently(long element) {
        int iHashCode = Long.hashCode(element) * (-862048943);
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
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i9 = i6;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.elements[iNumberOfTrailingZeros] == element) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iImpromptu = impromptu(i2);
                if (this.growthLimit == 0 && ((this.metadata[iImpromptu >> 3] >> ((iImpromptu & 7) << 3)) & 255) != 254) {
                    marial();
                    iImpromptu = impromptu(i2);
                }
                this._size++;
                int i10 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i11 = iImpromptu >> 3;
                long j5 = jArr2[i11];
                int i12 = (iImpromptu & 7) << 3;
                this.growthLimit = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                int i13 = this._capacity;
                long j6 = ((~(255 << i12)) & j5) | (j2 << i12);
                jArr2[i11] = j6;
                jArr2[(((iImpromptu - 7) & i13) + (i13 & 7)) >> 3] = j6;
                return iImpromptu;
            }
            i6 = i9 + 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final void cutely(int capacity) {
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
        taiyuan();
    }

    public final void formularize(long element) {
        this.elements[competently(element)] = element;
    }

    public final boolean impassible(long element) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(element) * (-862048943);
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
            triweekly(iNumberOfTrailingZeros);
        }
        return z;
    }

    public final int impromptu(int hash1) {
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

    public final void kowloon(int newCapacity) {
        long[] jArr = this.metadata;
        long[] jArr2 = this.elements;
        int i = this._capacity;
        apical(newCapacity);
        long[] jArr3 = this.metadata;
        long[] jArr4 = this.elements;
        int i2 = this._capacity;
        for (int i3 = 0; i3 < i; i3++) {
            if (((jArr[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                long j = jArr2[i3];
                int iHashCode = Long.hashCode(j) * (-862048943);
                int i4 = iHashCode ^ (iHashCode << 16);
                int iImpromptu = impromptu(i4 >>> 7);
                long j2 = i4 & 127;
                int i5 = iImpromptu >> 3;
                int i6 = (iImpromptu & 7) << 3;
                long j3 = (jArr3[i5] & (~(255 << i6))) | (j2 << i6);
                jArr3[i5] = j3;
                jArr3[(((iImpromptu - 7) & i2) + (i2 & 7)) >> 3] = j3;
                jArr4[iImpromptu] = j;
            }
        }
    }

    public final void marial() {
        if (this._capacity <= 8 || Long.compare(patroclinal.monoploid.dern(patroclinal.monoploid.dern(this._size) * 32) ^ Long.MIN_VALUE, patroclinal.monoploid.dern(patroclinal.monoploid.dern(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            kowloon(peridotite.wireman(this._capacity));
        } else {
            beachfront();
        }
    }

    public final void taiyuan() {
        this.growthLimit = peridotite.saneness(get_capacity()) - this._size;
    }

    public final void triweekly(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j;
    }
}
