package i2;

import android.os.SystemClock;
import i1.q0;
import java.util.Arrays;
import java.util.List;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f42742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f42744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1.p[] f42745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f42746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42747f;

    public c(q0 q0Var, int[] iArr) {
        int i10 = 0;
        go.k.t(iArr.length > 0);
        q0Var.getClass();
        this.f42742a = q0Var;
        int length = iArr.length;
        this.f42743b = length;
        this.f42745d = new i1.p[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f42745d[i11] = q0Var.f42662d[iArr[i11]];
        }
        Arrays.sort(this.f42745d, new b2.j(4));
        this.f42744c = new int[this.f42743b];
        while (true) {
            int i12 = this.f42743b;
            if (i10 >= i12) {
                this.f42746e = new long[i12];
                return;
            } else {
                this.f42744c[i10] = q0Var.a(this.f42745d[i10]);
                i10++;
            }
        }
    }

    @Override // i2.r
    public final boolean a(int i10, long j10) {
        return this.f42746e[i10] > j10;
    }

    @Override // i2.r
    public final boolean c(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = a(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f42743b && !zA) {
            zA = (i11 == i10 || a(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zA) {
            return false;
        }
        long[] jArr = this.f42746e;
        jArr[i10] = Math.max(jArr[i10], y.a(jElapsedRealtime, j10));
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f42742a.equals(cVar.f42742a) && Arrays.equals(this.f42744c, cVar.f42744c)) {
                return true;
            }
        }
        return false;
    }

    @Override // i2.r
    public int evaluateQueueSize(long j10, List list) {
        return list.size();
    }

    @Override // i2.r
    public final int f(i1.p pVar) {
        for (int i10 = 0; i10 < this.f42743b; i10++) {
            if (this.f42745d[i10] == pVar) {
                return i10;
            }
        }
        return -1;
    }

    @Override // i2.r
    public final i1.p getFormat(int i10) {
        return this.f42745d[i10];
    }

    @Override // i2.r
    public final int getIndexInTrackGroup(int i10) {
        return this.f42744c[i10];
    }

    @Override // i2.r
    public final i1.p getSelectedFormat() {
        return this.f42745d[getSelectedIndex()];
    }

    @Override // i2.r
    public final int getSelectedIndexInTrackGroup() {
        return this.f42744c[getSelectedIndex()];
    }

    @Override // i2.r
    public final q0 getTrackGroup() {
        return this.f42742a;
    }

    public final int hashCode() {
        if (this.f42747f == 0) {
            this.f42747f = Arrays.hashCode(this.f42744c) + (System.identityHashCode(this.f42742a) * 31);
        }
        return this.f42747f;
    }

    @Override // i2.r
    public final int indexOf(int i10) {
        for (int i11 = 0; i11 < this.f42743b; i11++) {
            if (this.f42744c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // i2.r
    public final int length() {
        return this.f42744c.length;
    }

    @Override // i2.r
    public void disable() {
    }

    @Override // i2.r
    public void enable() {
    }

    @Override // i2.r
    public final void g(boolean z10) {
    }

    @Override // i2.r
    public void onPlaybackSpeed(float f10) {
    }
}
