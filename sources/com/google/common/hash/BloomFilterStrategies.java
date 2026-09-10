package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
enum BloomFilterStrategies implements BloomFilter.Strategy {
    /* JADX INFO: Fake field, exist only in values array */
    EF2 { // from class: com.google.common.hash.BloomFilterStrategies.1
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF7 { // from class: com.google.common.hash.BloomFilterStrategies.2
    };

    public static final class LockFreeBitArray {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicLongArray f19999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LongAddable f20000b;

        public LockFreeBitArray(long[] jArr) {
            Preconditions.e("data length is zero!", jArr.length > 0);
            this.f19999a = new AtomicLongArray(jArr);
            this.f20000b = (LongAddable) LongAddables.f20004a.get();
            long jBitCount = 0;
            for (long j : jArr) {
                jBitCount += (long) Long.bitCount(j);
            }
            this.f20000b.a(jBitCount);
        }

        public static long[] a(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = atomicLongArray.get(i2);
            }
            return jArr;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof LockFreeBitArray) {
                return Arrays.equals(a(this.f19999a), a(((LockFreeBitArray) obj).f19999a));
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(a(this.f19999a));
        }
    }
}
