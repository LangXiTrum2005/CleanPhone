package decarock;

import java.util.Arrays;

/* JADX INFO: compiled from: LongArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f25112attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public long[] f25113saneness;

    public kowloon() {
        this(32);
    }

    public void attabal(long j) {
        int i = this.f25112attabal;
        long[] jArr = this.f25113saneness;
        if (i == jArr.length) {
            this.f25113saneness = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f25113saneness;
        int i2 = this.f25112attabal;
        this.f25112attabal = i2 + 1;
        jArr2[i2] = j;
    }

    public int dern() {
        return this.f25112attabal;
    }

    public long saneness(int i) {
        if (i >= 0 && i < this.f25112attabal) {
            return this.f25113saneness[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f25112attabal);
    }

    public kowloon(int i) {
        this.f25113saneness = new long[i];
    }
}
