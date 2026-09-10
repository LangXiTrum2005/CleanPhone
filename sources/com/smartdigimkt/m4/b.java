package com.smartdigimkt.m4;

import android.os.SystemClock;
import com.smartdigimkt.j4.e0;
import com.smartdigimkt.w3.m;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final e0 f36642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f36643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int[] f36644c;
    private final m[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long[] f36645e;
    private int f;

    /* JADX INFO: renamed from: com.smartdigimkt.m4.b$b, reason: collision with other inner class name */
    public static final class C0540b implements Comparator<m> {
        private C0540b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(m mVar, m mVar2) {
            return mVar2.f39332b - mVar.f39332b;
        }
    }

    public b(e0 e0Var, int... iArr) {
        int i2 = 0;
        com.smartdigimkt.p4.a.b(iArr.length > 0);
        this.f36642a = (e0) com.smartdigimkt.p4.a.a(e0Var);
        int length = iArr.length;
        this.f36643b = length;
        this.d = new m[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.d[i3] = e0Var.a(iArr[i3]);
        }
        Arrays.sort(this.d, new C0540b());
        this.f36644c = new int[this.f36643b];
        while (true) {
            int i4 = this.f36643b;
            if (i2 >= i4) {
                this.f36645e = new long[i4];
                return;
            } else {
                this.f36644c[i2] = e0Var.a(this.d[i2]);
                i2++;
            }
        }
    }

    @Override // com.smartdigimkt.m4.f
    public void a(float f) {
    }

    @Override // com.smartdigimkt.m4.f
    public final int b(int i2) {
        return this.f36644c[i2];
    }

    @Override // com.smartdigimkt.m4.f
    public void c() {
    }

    @Override // com.smartdigimkt.m4.f
    public void d() {
    }

    @Override // com.smartdigimkt.m4.f
    public final int e() {
        return this.f36644c[i()];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f36642a == bVar.f36642a && Arrays.equals(this.f36644c, bVar.f36644c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.smartdigimkt.m4.f
    public final e0 f() {
        return this.f36642a;
    }

    @Override // com.smartdigimkt.m4.f
    public final m g() {
        return this.d[i()];
    }

    public int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.f36644c) + (System.identityHashCode(this.f36642a) * 31);
        }
        return this.f;
    }

    @Override // com.smartdigimkt.m4.f
    public final int j() {
        return this.f36644c.length;
    }

    @Override // com.smartdigimkt.m4.f
    public final m a(int i2) {
        return this.d[i2];
    }

    public final boolean b(int i2, long j) {
        return this.f36645e[i2] > j;
    }

    @Override // com.smartdigimkt.m4.f
    public final int c(int i2) {
        for (int i3 = 0; i3 < this.f36643b; i3++) {
            if (this.f36644c[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.smartdigimkt.m4.f
    public final int a(m mVar) {
        for (int i2 = 0; i2 < this.f36643b; i2++) {
            if (this.d[i2] == mVar) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.smartdigimkt.m4.f
    public int a(long j, List<? extends com.smartdigimkt.l4.i> list) {
        return list.size();
    }

    @Override // com.smartdigimkt.m4.f
    public final boolean a(int i2, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zB = b(i2, jElapsedRealtime);
        int i3 = 0;
        while (i3 < this.f36643b && !zB) {
            zB = (i3 == i2 || b(i3, jElapsedRealtime)) ? false : true;
            i3++;
        }
        if (!zB) {
            return false;
        }
        long[] jArr = this.f36645e;
        jArr[i2] = Math.max(jArr[i2], jElapsedRealtime + j);
        return true;
    }
}
