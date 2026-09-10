package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\r\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00132\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010\u0015J\u0018\u0010#\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b#\u0010\u0017J\u001b\u0010$\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b$\u0010\u001bJ\u001e\u0010%\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0086\u0002¢\u0006\u0004\b%\u0010\u001fJ\u001b\u0010'\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000&¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0003H\u0001¢\u0006\u0004\b*\u0010\u0006J\r\u0010+\u001a\u00020\u0007¢\u0006\u0004\b+\u0010\fJ\u000f\u0010,\u001a\u00020\u0007H\u0000¢\u0006\u0004\b,\u0010\fJ\u000f\u0010-\u001a\u00020\u0007H\u0000¢\u0006\u0004\b-\u0010\fJ\u0017\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0003H\u0000¢\u0006\u0004\b/\u0010\u0006J\u0013\u00101\u001a\b\u0012\u0004\u0012\u00028\u000000¢\u0006\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Landroidx/collection/saran;", "E", "Landroidx/collection/ScatterSet;", "", "initialCapacity", "<init>", "(I)V", "", "molybdenite", "capacity", "polloi", "monoploid", "()V", "element", "kowloon", "(Ljava/lang/Object;)I", "hash1", "arytenoidectomy", "(I)I", "", "impromptu", "(Ljava/lang/Object;)Z", "rotuma", "(Ljava/lang/Object;)V", "", "elements", "cutely", "(Ljava/lang/Iterable;)Z", "taiyuan", "(Landroidx/collection/ScatterSet;)Z", "gintrap", "(Ljava/lang/Iterable;)V", "dovishness", "(Landroidx/collection/ScatterSet;)V", "preprohormone", "adultoid", "cord", "graveside", "", "trm", "(Ljava/util/Collection;)Z", "index", "cuirassed", "impassible", "apical", "triweekly", "newCapacity", "stratoscope", "", "formularize", "()Ljava/util/Set;", "wireman", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class saran<E> extends ScatterSet<E> {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public int growthLimit;

    public saran() {
        this(0, 1, null);
    }

    public final void adultoid(E element) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.metadata;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (Intrinsics.wireman(this.elements[iNumberOfTrailingZeros], element)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i += 8;
                i5 = i6 + i;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            cuirassed(iNumberOfTrailingZeros);
        }
    }

    public final void apical() {
        if (this._capacity <= 8 || Long.compare(patroclinal.monoploid.dern(patroclinal.monoploid.dern(this._size) * 32) ^ Long.MIN_VALUE, patroclinal.monoploid.dern(patroclinal.monoploid.dern(this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            stratoscope(peridotite.wireman(this._capacity));
        } else {
            triweekly();
        }
    }

    public final int arytenoidectomy(int hash1) {
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

    public final boolean cord(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = get_size();
        graveside(elements);
        return i != get_size();
    }

    public final void cuirassed(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j;
        this.elements[index] = null;
    }

    public final boolean cutely(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = get_size();
        gintrap(elements);
        return i != get_size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dovishness(ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.elements;
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
                        rotuma(objArr[(i << 3) + i3]);
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

    public final Set<E> formularize() {
        return new MutableSetWrapper(this);
    }

    public final void gintrap(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            rotuma(it.next());
        }
    }

    public final void graveside(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            adultoid(it.next());
        }
    }

    public final void impassible() {
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
        p002kotlin.collections.arytenoidectomy.molybdenite(this.elements, null, 0, this._capacity);
        monoploid();
    }

    public final boolean impromptu(E element) {
        int i = get_size();
        this.elements[kowloon(element)] = element;
        return get_size() != i;
    }

    public final int kowloon(E element) {
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
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
            int i9 = i3;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = (i5 + (Long.numberOfTrailingZeros(j4) >> 3)) & i4;
                if (Intrinsics.wireman(this.elements[iNumberOfTrailingZeros], element)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iArytenoidectomy = arytenoidectomy(i2);
                if (this.growthLimit == 0 && ((this.metadata[iArytenoidectomy >> 3] >> ((iArytenoidectomy & 7) << 3)) & 255) != 254) {
                    apical();
                    iArytenoidectomy = arytenoidectomy(i2);
                }
                this._size++;
                int i10 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i11 = iArytenoidectomy >> 3;
                long j5 = jArr2[i11];
                int i12 = (iArytenoidectomy & 7) << 3;
                this.growthLimit = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                int i13 = this._capacity;
                long j6 = ((~(255 << i12)) & j5) | (j2 << i12);
                jArr2[i11] = j6;
                jArr2[(((iArytenoidectomy - 7) & i13) + (i13 & 7)) >> 3] = j6;
                return iArytenoidectomy;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    public final void molybdenite(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, peridotite.marial(initialCapacity)) : 0;
        this._capacity = iMax;
        polloi(iMax);
        this.elements = iMax == 0 ? molybdenite.attabal.f33568dern : new Object[iMax];
    }

    public final void monoploid() {
        this.growthLimit = peridotite.saneness(get_capacity()) - this._size;
    }

    public final void polloi(int capacity) {
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
        monoploid();
    }

    public final boolean preprohormone(E element) {
        int iNumberOfTrailingZeros;
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
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
                if (Intrinsics.wireman(this.elements[iNumberOfTrailingZeros], element)) {
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
            cuirassed(iNumberOfTrailingZeros);
        }
        return z;
    }

    public final void rotuma(E element) {
        this.elements[kowloon(element)] = element;
    }

    public final void stratoscope(int newCapacity) {
        long[] jArr = this.metadata;
        Object[] objArr = this.elements;
        int i = this._capacity;
        molybdenite(newCapacity);
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.elements;
        int i2 = this._capacity;
        for (int i3 = 0; i3 < i; i3++) {
            if (((jArr[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i3];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i4 = iHashCode ^ (iHashCode << 16);
                int iArytenoidectomy = arytenoidectomy(i4 >>> 7);
                long j = i4 & 127;
                int i5 = iArytenoidectomy >> 3;
                int i6 = (iArytenoidectomy & 7) << 3;
                long j2 = (jArr2[i5] & (~(255 << i6))) | (j << i6);
                jArr2[i5] = j2;
                jArr2[(((iArytenoidectomy - 7) & i2) + (i2 & 7)) >> 3] = j2;
                objArr2[iArytenoidectomy] = obj;
            }
        }
    }

    public final boolean taiyuan(ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = get_size();
        dovishness(elements);
        return i != get_size();
    }

    public final void triweekly() {
        long[] jArr = this.metadata;
        int i = this._capacity;
        Object[] objArr = this.elements;
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
                int iArytenoidectomy = arytenoidectomy(i10);
                int i11 = i10 & i;
                int i12 = i3;
                if (((iArytenoidectomy - i11) & i) / 8 == ((i6 - i11) & i) / 8) {
                    jArr[i7] = (((long) (i9 & 127)) << i8) | ((~(255 << i8)) & jArr[i7]);
                    jArr[p002kotlin.collections.polloi.hydrovane(jArr)] = (jArr[i12] & j2) | Long.MIN_VALUE;
                    i6++;
                    i3 = i12;
                } else {
                    int i13 = iArytenoidectomy >> 3;
                    long j4 = jArr[i13];
                    int i14 = (iArytenoidectomy & 7) << 3;
                    if (((j4 >> i14) & 255) == 128) {
                        jArr[i13] = (((long) (i9 & 127)) << i14) | (j4 & (~(255 << i14)));
                        jArr[i7] = (jArr[i7] & (~(255 << i8))) | (128 << i8);
                        objArr[iArytenoidectomy] = objArr[i6];
                        objArr[i6] = null;
                    } else {
                        jArr[i13] = (((long) (i9 & 127)) << i14) | (j4 & (~(255 << i14)));
                        Object obj2 = objArr[iArytenoidectomy];
                        objArr[iArytenoidectomy] = objArr[i6];
                        objArr[i6] = obj2;
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
        monoploid();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[LOOP:0: B:5:0x0016->B:17:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[EDGE_INSN: B:24:0x0057->B:18:0x0057 BREAK  A[LOOP:0: B:5:0x0016->B:17:0x0054], SYNTHETIC] */
    public final boolean trm(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = this.elements;
        int i = this._size;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!CollectionsKt.permissivist(elements, objArr[i5])) {
                                cuirassed(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != this._size;
    }

    public saran(int i) {
        super(null);
        if (!(i >= 0)) {
            molybdenite.wireman.attabal("Capacity must be a positive value.");
        }
        molybdenite(peridotite.beachfront(i));
    }

    public /* synthetic */ saran(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }
}
