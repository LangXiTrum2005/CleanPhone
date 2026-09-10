package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class BloomFilter<T> implements Predicate<T>, Serializable {
    private static final long serialVersionUID = 912559;
    public final BloomFilterStrategies.LockFreeBitArray X;

    public static class SerialForm<T> implements Serializable {
        private static final long serialVersionUID = 1;
        public final long[] X;

        public SerialForm(BloomFilter bloomFilter) {
            this.X = BloomFilterStrategies.LockFreeBitArray.a(bloomFilter.X.f19999a);
        }

        public Object readResolve() {
            new BloomFilter(new BloomFilterStrategies.LockFreeBitArray(this.X));
            throw null;
        }
    }

    public interface Strategy extends Serializable {
    }

    public BloomFilter(BloomFilterStrategies.LockFreeBitArray lockFreeBitArray) {
        Preconditions.c(0, "numHashFunctions (%s) must be > 0", false);
        this.X = lockFreeBitArray;
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private Object writeReplace() {
        return new SerialForm(this);
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        throw null;
    }

    @Override // com.google.common.base.Predicate
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BloomFilter)) {
            return false;
        }
        ((BloomFilter) obj).getClass();
        throw null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0, null, null, this.X});
    }
}
