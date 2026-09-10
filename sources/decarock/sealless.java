package decarock;

import java.util.Arrays;

/* JADX INFO: compiled from: TimedValueQueue.java */
/* JADX INFO: loaded from: classes.dex */
public final class sealless<V> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public long[] f25129attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f25130dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public V[] f25131saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f25132wireman;

    public sealless() {
        this(10);
    }

    public static <V> V[] beachfront(int i) {
        return (V[]) new Object[i];
    }

    public final V apical() {
        attabal.competently(this.f25132wireman > 0);
        V[] vArr = this.f25131saneness;
        int i = this.f25130dern;
        V v = vArr[i];
        vArr[i] = null;
        this.f25130dern = (i + 1) % vArr.length;
        this.f25132wireman--;
        return v;
    }

    public synchronized void attabal(long j, V v) {
        wireman(j);
        marial();
        saneness(j, v);
    }

    public synchronized V competently(long j) {
        return impromptu(j, false);
    }

    public synchronized V cutely(long j) {
        return impromptu(j, true);
    }

    public synchronized void dern() {
        this.f25130dern = 0;
        this.f25132wireman = 0;
        Arrays.fill(this.f25131saneness, (Object) null);
    }

    public synchronized int formularize() {
        return this.f25132wireman;
    }

    public final V impromptu(long j, boolean z) {
        V vApical = null;
        long j2 = Long.MAX_VALUE;
        while (this.f25132wireman > 0) {
            long j3 = j - this.f25129attabal[this.f25130dern];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            vApical = apical();
            j2 = j3;
        }
        return vApical;
    }

    public final void marial() {
        int length = this.f25131saneness.length;
        if (this.f25132wireman < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) beachfront(i);
        int i2 = this.f25130dern;
        int i3 = length - i2;
        System.arraycopy(this.f25129attabal, i2, jArr, 0, i3);
        System.arraycopy(this.f25131saneness, this.f25130dern, vArr, 0, i3);
        int i4 = this.f25130dern;
        if (i4 > 0) {
            System.arraycopy(this.f25129attabal, 0, jArr, i3, i4);
            System.arraycopy(this.f25131saneness, 0, vArr, i3, this.f25130dern);
        }
        this.f25129attabal = jArr;
        this.f25131saneness = vArr;
        this.f25130dern = 0;
    }

    public final void saneness(long j, V v) {
        int i = this.f25130dern;
        int i2 = this.f25132wireman;
        V[] vArr = this.f25131saneness;
        int length = (i + i2) % vArr.length;
        this.f25129attabal[length] = j;
        vArr[length] = v;
        this.f25132wireman = i2 + 1;
    }

    public synchronized V taiyuan() {
        return this.f25132wireman == 0 ? null : apical();
    }

    public final void wireman(long j) {
        int i = this.f25132wireman;
        if (i > 0) {
            if (j <= this.f25129attabal[((this.f25130dern + i) - 1) % this.f25131saneness.length]) {
                dern();
            }
        }
    }

    public sealless(int i) {
        this.f25129attabal = new long[i];
        this.f25131saneness = (V[]) beachfront(i);
    }
}
