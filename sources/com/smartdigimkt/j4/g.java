package com.smartdigimkt.j4;

/* JADX INFO: loaded from: classes.dex */
public class g implements z {
    protected final z[] X;

    public g(z[] zVarArr) {
        this.X = zVarArr;
    }

    @Override // com.smartdigimkt.j4.z
    public boolean a(long j) {
        boolean zA;
        boolean z2 = false;
        do {
            long jB = b();
            if (jB == Long.MIN_VALUE) {
                return z2;
            }
            zA = false;
            for (z zVar : this.X) {
                long jB2 = zVar.b();
                boolean z3 = jB2 != Long.MIN_VALUE && jB2 <= j;
                if (jB2 == jB || z3) {
                    zA |= zVar.a(j);
                }
            }
            z2 |= zA;
        } while (zA);
        return z2;
    }

    @Override // com.smartdigimkt.j4.z
    public final long b() {
        long jMin = Long.MAX_VALUE;
        for (z zVar : this.X) {
            long jB = zVar.b();
            if (jB != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jB);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.smartdigimkt.j4.z
    public final long c() {
        long jMin = Long.MAX_VALUE;
        for (z zVar : this.X) {
            long jC = zVar.c();
            if (jC != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jC);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.smartdigimkt.j4.z
    public final void b(long j) {
        for (z zVar : this.X) {
            zVar.b(j);
        }
    }
}
