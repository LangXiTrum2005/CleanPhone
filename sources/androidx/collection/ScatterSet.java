package androidx.collection;

import com.p004ironsource.d9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/collection/ScatterSet;", "E", "", "Landroidx/collection/MutableScatterSet;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ScatterSet<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f3766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f3767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3768c;

    public final boolean equals(Object obj) {
        boolean z2;
        long j;
        int i2;
        long j2;
        int iNumberOfTrailingZeros;
        if (obj != this) {
            if (!(obj instanceof ScatterSet)) {
                return false;
            }
            ScatterSet scatterSet = (ScatterSet) obj;
            scatterSet.getClass();
            Object[] objArr = this.f3767b;
            long[] jArr = this.f3766a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j3 = jArr[i3];
                    char c2 = 7;
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j3 & 255) < 128) {
                                Object obj2 = objArr[(i3 << 3) + i6];
                                int iHashCode = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i7 = iHashCode ^ (iHashCode << 16);
                                int i8 = i7 & 127;
                                int i9 = scatterSet.f3768c;
                                int i10 = (i7 >>> 7) & i9;
                                j2 = j4;
                                int i11 = 0;
                                while (true) {
                                    long[] jArr2 = scatterSet.f3766a;
                                    int i12 = i10 >> 3;
                                    i2 = i4;
                                    int i13 = (i10 & 7) << 3;
                                    j = j3;
                                    long j5 = (jArr2[i12] >>> i13) | (((-i13) >> 63) & (jArr2[i12 + 1] << (64 - i13)));
                                    long j6 = (((long) i8) * 72340172838076673L) ^ j5;
                                    for (long j7 = (j6 - 72340172838076673L) & (~j6) & j2; j7 != 0; j7 &= j7 - 1) {
                                        iNumberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j7) >> 3)) & i9;
                                        if (Intrinsics.a(scatterSet.f3767b[iNumberOfTrailingZeros], obj2)) {
                                            break;
                                        }
                                    }
                                    if ((j5 & ((~j5) << 6) & j2) != 0) {
                                        iNumberOfTrailingZeros = -1;
                                        break;
                                    }
                                    i11 += 8;
                                    i10 = (i10 + i11) & i9;
                                    i4 = i2;
                                    j3 = j;
                                }
                                if (!(iNumberOfTrailingZeros >= 0)) {
                                    return false;
                                }
                            } else {
                                j = j3;
                                i2 = i4;
                                j2 = j4;
                            }
                            j3 = j >> i2;
                            i6++;
                            c2 = c2;
                            j4 = j2;
                            i4 = i2;
                        }
                        z2 = true;
                        if (i5 != i4) {
                            return true;
                        }
                    } else {
                        z2 = true;
                    }
                    if (i3 == length) {
                        return z2;
                    }
                    i3++;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = (this.f3768c * 31) + 0;
        Object[] objArr = this.f3767b;
        long[] jArr = this.f3766a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i2 << 3) + i4];
                            if (!Intrinsics.a(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return iHashCode;
                    }
                }
                if (i2 != length) {
                    i2++;
                }
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0065 A[DONT_INVERT, PHI: r8
  0x0065: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x0028, B:18:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[LOOP:0: B:5:0x001a->B:20:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x006a A[SYNTHETIC] */
    public final String toString() {
        Function1<Object, CharSequence> function1 = new Function1<Object, CharSequence>() { // from class: androidx.collection.ScatterSet.toString.1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return obj == ScatterSet.this ? "(this)" : String.valueOf(obj);
            }
        };
        StringBuilder sb = new StringBuilder(d9.i.d);
        Object[] objArr = this.f3767b;
        long[] jArr = this.f3766a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) d9.i.f24752e);
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j) < 128) {
                        Object obj = objArr[(i2 << 3) + i5];
                        if (i3 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i3 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) function1.invoke(obj));
                        i3++;
                    }
                    j >>= 8;
                }
                if (i4 == 8) {
                    if (i2 == length) {
                        i2++;
                    }
                }
                sb.append((CharSequence) d9.i.f24752e);
                break;
            }
            if (i2 == length) {
                sb.append((CharSequence) d9.i.f24752e);
                break;
            }
            i2++;
        }
        String string = sb.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }
}
