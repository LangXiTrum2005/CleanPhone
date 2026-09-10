package decarock;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: LongArrayQueue.java */
/* JADX INFO: loaded from: classes.dex */
public final class arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f25060attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f25061dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f25062marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f25063saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public long[] f25064wireman;

    public arytenoidectomy() {
        this(16);
    }

    public void attabal() {
        this.f25060attabal = 0;
        this.f25063saneness = -1;
        this.f25061dern = 0;
    }

    public boolean dern() {
        return this.f25061dern == 0;
    }

    public long saneness() {
        if (this.f25061dern != 0) {
            return this.f25064wireman[this.f25060attabal];
        }
        throw new NoSuchElementException();
    }

    public long wireman() {
        int i = this.f25061dern;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f25064wireman;
        int i2 = this.f25060attabal;
        long j = jArr[i2];
        this.f25060attabal = this.f25062marial & (i2 + 1);
        this.f25061dern = i - 1;
        return j;
    }

    public arytenoidectomy(int i) {
        attabal.attabal(i >= 0 && i <= 1073741824);
        i = i == 0 ? 1 : i;
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.f25060attabal = 0;
        this.f25063saneness = -1;
        this.f25061dern = 0;
        long[] jArr = new long[i];
        this.f25064wireman = jArr;
        this.f25062marial = jArr.length - 1;
    }
}
