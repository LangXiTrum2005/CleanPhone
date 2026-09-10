package com.smartdigimkt.j4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes.dex */
final class u implements r, r.a {
    public final r[] X;
    private final h Z;
    private r.a f0;
    private f0 g0;
    private r[] h0;
    private z i0;
    private final ArrayList<r> e0 = new ArrayList<>();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final IdentityHashMap<y, Integer> f36039Y = new IdentityHashMap<>();

    public u(h hVar, r... rVarArr) {
        this.Z = hVar;
        this.X = rVarArr;
        this.i0 = hVar.a(new z[0]);
    }

    @Override // com.smartdigimkt.j4.r, com.smartdigimkt.j4.z
    public void b(long j) {
        this.i0.b(j);
    }

    @Override // com.smartdigimkt.j4.r, com.smartdigimkt.j4.z
    public long c() {
        return this.i0.c();
    }

    @Override // com.smartdigimkt.j4.r
    public long e() {
        long jE = this.X[0].e();
        int i2 = 1;
        while (true) {
            r[] rVarArr = this.X;
            if (i2 >= rVarArr.length) {
                if (jE != -9223372036854775807L) {
                    for (r rVar : this.h0) {
                        if (rVar != this.X[0] && rVar.c(jE) != jE) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                }
                return jE;
            }
            if (rVarArr[i2].e() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity.");
            }
            i2++;
        }
    }

    @Override // com.smartdigimkt.j4.r
    public f0 f() {
        return this.g0;
    }

    @Override // com.smartdigimkt.j4.r
    public void g() throws IOException {
        for (r rVar : this.X) {
            rVar.g();
        }
    }

    @Override // com.smartdigimkt.j4.r
    public void a(r.a aVar, long j) {
        this.f0 = aVar;
        Collections.addAll(this.e0, this.X);
        for (r rVar : this.X) {
            rVar.a(this, j);
        }
    }

    @Override // com.smartdigimkt.j4.r, com.smartdigimkt.j4.z
    public long b() {
        return this.i0.b();
    }

    @Override // com.smartdigimkt.j4.r
    public long c(long j) {
        long jC = this.h0[0].c(j);
        int i2 = 1;
        while (true) {
            r[] rVarArr = this.h0;
            if (i2 >= rVarArr.length) {
                return jC;
            }
            if (rVarArr[i2].c(jC) != jC) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i2++;
        }
    }

    @Override // com.smartdigimkt.j4.z.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(r rVar) {
        this.f0.a(this);
    }

    @Override // com.smartdigimkt.j4.r
    public long a(com.smartdigimkt.m4.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j) {
        com.smartdigimkt.m4.f[] fVarArr2 = fVarArr;
        int[] iArr = new int[fVarArr2.length];
        int[] iArr2 = new int[fVarArr2.length];
        for (int i2 = 0; i2 < fVarArr2.length; i2++) {
            y yVar = yVarArr[i2];
            iArr[i2] = yVar == null ? -1 : this.f36039Y.get(yVar).intValue();
            iArr2[i2] = -1;
            com.smartdigimkt.m4.f fVar = fVarArr2[i2];
            if (fVar != null) {
                e0 e0VarF = fVar.f();
                int i3 = 0;
                while (true) {
                    r[] rVarArr = this.X;
                    if (i3 >= rVarArr.length) {
                        break;
                    }
                    if (rVarArr[i3].f().a(e0VarF) != -1) {
                        iArr2[i2] = i3;
                        break;
                    }
                    i3++;
                }
            }
        }
        this.f36039Y.clear();
        int length = fVarArr2.length;
        y[] yVarArr2 = new y[length];
        y[] yVarArr3 = new y[fVarArr2.length];
        com.smartdigimkt.m4.f[] fVarArr3 = new com.smartdigimkt.m4.f[fVarArr2.length];
        ArrayList arrayList = new ArrayList(this.X.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.X.length) {
            for (int i5 = 0; i5 < fVarArr2.length; i5++) {
                com.smartdigimkt.m4.f fVar2 = null;
                yVarArr3[i5] = iArr[i5] == i4 ? yVarArr[i5] : null;
                if (iArr2[i5] == i4) {
                    fVar2 = fVarArr2[i5];
                }
                fVarArr3[i5] = fVar2;
            }
            int i6 = i4;
            long jA = this.X[i4].a(fVarArr3, zArr, yVarArr3, zArr2, j2);
            if (i6 == 0) {
                j2 = jA;
            } else if (jA != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            int i7 = 0;
            boolean z2 = false;
            while (i7 < fVarArr2.length) {
                if (iArr2[i7] == i6) {
                    com.smartdigimkt.p4.a.b(yVarArr3[i7] != null);
                    yVarArr2[i7] = yVarArr3[i7];
                    this.f36039Y.put(yVarArr3[i7], Integer.valueOf(i6));
                    z2 = true;
                } else if (iArr[i7] == i6) {
                    com.smartdigimkt.p4.a.b(yVarArr3[i7] == null);
                }
                i7++;
                fVarArr2 = fVarArr;
            }
            if (z2) {
                arrayList.add(this.X[i6]);
            }
            i4 = i6 + 1;
            fVarArr2 = fVarArr;
        }
        System.arraycopy(yVarArr2, 0, yVarArr, 0, length);
        r[] rVarArr2 = new r[arrayList.size()];
        this.h0 = rVarArr2;
        arrayList.toArray(rVarArr2);
        this.i0 = this.Z.a(this.h0);
        return j2;
    }

    @Override // com.smartdigimkt.j4.r
    public void a(long j, boolean z2) {
        for (r rVar : this.h0) {
            rVar.a(j, z2);
        }
    }

    @Override // com.smartdigimkt.j4.r, com.smartdigimkt.j4.z
    public boolean a(long j) {
        if (!this.e0.isEmpty()) {
            int size = this.e0.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.e0.get(i2).a(j);
            }
            return false;
        }
        return this.i0.a(j);
    }

    @Override // com.smartdigimkt.j4.r
    public long a(long j, com.smartdigimkt.w3.c0 c0Var) {
        return this.h0[0].a(j, c0Var);
    }

    @Override // com.smartdigimkt.j4.r.a
    public void a(r rVar) {
        this.e0.remove(rVar);
        if (this.e0.isEmpty()) {
            int i2 = 0;
            for (r rVar2 : this.X) {
                i2 += rVar2.f().f35974a;
            }
            e0[] e0VarArr = new e0[i2];
            int i3 = 0;
            for (r rVar3 : this.X) {
                f0 f0VarF = rVar3.f();
                int i4 = f0VarF.f35974a;
                int i5 = 0;
                while (i5 < i4) {
                    e0VarArr[i3] = f0VarF.a(i5);
                    i5++;
                    i3++;
                }
            }
            this.g0 = new f0(e0VarArr);
            this.f0.a((r) this);
        }
    }
}
