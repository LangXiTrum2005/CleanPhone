package com.startapp.simple.bloomfilter.algo;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class BitSetHandling {
    private final int numberOfHashes;
    private final int sizeOfBucket;

    public BitSetHandling(int i2, int i3) {
        this.numberOfHashes = i2;
        this.sizeOfBucket = i3;
    }

    private void add(ByteBuffer byteBuffer, OpenBitSet openBitSet) {
        for (long j : getHashBuckets(byteBuffer, openBitSet.size())) {
            openBitSet.set(j);
        }
    }

    private long[] getHashBuckets(ByteBuffer byteBuffer, long j) {
        int i2 = this.numberOfHashes;
        long[] jArr = new long[i2];
        long j2 = j / ((long) i2);
        long jHash64 = MurmurHash.hash64(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), 0L);
        long jHash65 = MurmurHash.hash64(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), jHash64);
        for (int i3 = 0; i3 < this.numberOfHashes; i3++) {
            long j3 = i3;
            jArr[i3] = Math.abs(((j3 * jHash65) + jHash64) % j2) + (j3 * j2);
        }
        return jArr;
    }

    public void fillBitSetWithKeys(List<String> list, OpenBitSet openBitSet) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            add(ByteBuffer.wrap(it.next().getBytes()), openBitSet);
        }
    }

    public long[] hashBucketsFromApplication(String str) {
        return getHashBuckets(ByteBuffer.wrap(str.getBytes()), new OpenBitSet(this.numberOfHashes * this.sizeOfBucket).size());
    }

    public boolean isPresent(long[] jArr, OpenBitSet openBitSet) {
        if (jArr.length == 0) {
            return false;
        }
        for (long j : jArr) {
            if (!openBitSet.indexInBits(j)) {
                return false;
            }
        }
        return true;
    }

    public OpenBitSet keysToBitSet(List<String> list) {
        OpenBitSet openBitSet = new OpenBitSet(this.numberOfHashes * this.sizeOfBucket);
        fillBitSetWithKeys(list, openBitSet);
        return openBitSet;
    }

    public boolean isPresent(String str, OpenBitSet openBitSet) {
        return isPresent(ByteBuffer.wrap(str.getBytes()), openBitSet);
    }

    private boolean isPresent(ByteBuffer byteBuffer, OpenBitSet openBitSet) {
        return isPresent(getHashBuckets(byteBuffer, openBitSet.size()), openBitSet);
    }
}
