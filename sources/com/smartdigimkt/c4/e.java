package com.smartdigimkt.c4;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.smartdigimkt.p4.c0;
import com.smartdigimkt.p4.f0;
import com.smartdigimkt.p4.p;
import com.smartdigimkt.p4.s;
import com.smartdigimkt.w3.t;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements com.smartdigimkt.b4.e {
    public static final int L = 1;
    public static final int M = 2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f34206N = 4;
    private static final int O = 8;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f34207P = 16;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final String f34208Q = "FragmentedMp4Extractor";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final int f34210U = 0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final int f34211V = 1;
    private static final int W = 2;
    private static final int X = 3;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final int f34212Y = 4;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f34213A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private d f34214B;
    private int C;
    private int D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f34215E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f34216F;
    private com.smartdigimkt.b4.g G;
    private com.smartdigimkt.b4.m[] H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private com.smartdigimkt.b4.m[] f34217I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f34218J;
    private final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j f34219e;
    private final List<com.smartdigimkt.w3.m> f;
    private final com.smartdigimkt.a4.e g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SparseArray<d> f34220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s f34221i;
    private final s j;
    private final s k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c0 f34222l;
    private final s m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final byte[] f34223n;
    private final ArrayDeque<com.smartdigimkt.c4.a.C0451a> o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayDeque<c> f34224p;
    private final com.smartdigimkt.b4.m q;
    private int r;
    private int s;
    private long t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f34225u;
    private s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f34226w;
    private int x;
    private long y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f34227z;
    public static final com.smartdigimkt.b4.h K = new a();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final int f34209R = f0.d("seig");
    private static final byte[] S = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final com.smartdigimkt.w3.m T = com.smartdigimkt.w3.m.a(null, "application/x-emsg", Long.MAX_VALUE);

    public class a implements com.smartdigimkt.b4.h {
        @Override // com.smartdigimkt.b4.h
        public com.smartdigimkt.b4.e[] a() {
            return new com.smartdigimkt.b4.e[]{new e()};
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f34228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f34229b;

        public c(long j, int i2) {
            this.f34228a = j;
            this.f34229b = i2;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.smartdigimkt.b4.m f34230a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public j f34232c;
        public com.smartdigimkt.c4.c d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f34233e;
        public int f;
        public int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f34234h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f34231b = new l();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final s f34235i = new s(1);
        private final s j = new s();

        public d(com.smartdigimkt.b4.m mVar) {
            this.f34230a = mVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            l lVar = this.f34231b;
            if (lVar.m) {
                s sVar = lVar.q;
                int i2 = a().d;
                if (i2 != 0) {
                    sVar.f(i2);
                }
                if (this.f34231b.f34290n[this.f34233e]) {
                    sVar.f(sVar.D() * 6);
                }
            }
        }

        public boolean b() {
            this.f34233e++;
            int i2 = this.f + 1;
            this.f = i2;
            int[] iArr = this.f34231b.f34287h;
            int i3 = this.g;
            if (i2 != iArr[i3]) {
                return true;
            }
            this.g = i3 + 1;
            this.f = 0;
            return false;
        }

        public int c() {
            s sVar;
            if (!this.f34231b.m) {
                return 0;
            }
            k kVarA = a();
            int length = kVarA.d;
            if (length != 0) {
                sVar = this.f34231b.q;
            } else {
                byte[] bArr = kVarA.f34282e;
                this.j.a(bArr, bArr.length);
                s sVar2 = this.j;
                length = bArr.length;
                sVar = sVar2;
            }
            boolean z2 = this.f34231b.f34290n[this.f34233e];
            s sVar3 = this.f34235i;
            sVar3.f37616a[0] = (byte) ((z2 ? 128 : 0) | length);
            sVar3.e(0);
            this.f34230a.a(this.f34235i, 1);
            this.f34230a.a(sVar, length);
            if (!z2) {
                return length + 1;
            }
            s sVar4 = this.f34231b.q;
            int iD = sVar4.D();
            sVar4.f(-2);
            int i2 = (iD * 6) + 2;
            this.f34230a.a(sVar4, i2);
            return length + 1 + i2;
        }

        public void d() {
            this.f34231b.a();
            this.f34233e = 0;
            this.g = 0;
            this.f = 0;
            this.f34234h = 0;
        }

        public void a(j jVar, com.smartdigimkt.c4.c cVar) {
            this.f34232c = (j) com.smartdigimkt.p4.a.a(jVar);
            this.d = (com.smartdigimkt.c4.c) com.smartdigimkt.p4.a.a(cVar);
            this.f34230a.a(jVar.f);
            d();
        }

        public void a(com.smartdigimkt.a4.e eVar) {
            k kVarA = this.f34232c.a(this.f34231b.f34283a.f34198a);
            this.f34230a.a(this.f34232c.f.a(eVar.a(kVarA != null ? kVarA.f34280b : null)));
        }

        public void a(long j) {
            long jB = com.smartdigimkt.w3.b.b(j);
            int i2 = this.f34233e;
            while (true) {
                l lVar = this.f34231b;
                if (i2 >= lVar.f || lVar.a(i2) >= jB) {
                    return;
                }
                if (this.f34231b.f34289l[i2]) {
                    this.f34234h = i2;
                }
                i2++;
            }
        }

        private k a() {
            l lVar = this.f34231b;
            int i2 = lVar.f34283a.f34198a;
            k kVar = lVar.o;
            return kVar != null ? kVar : this.f34232c.a(i2);
        }
    }

    public e() {
        this(0);
    }

    private boolean b(com.smartdigimkt.b4.f fVar) throws InterruptedException, IOException {
        if (this.f34225u == 0) {
            if (!fVar.a(this.m.f37616a, 0, 8, true)) {
                return false;
            }
            this.f34225u = 8;
            this.m.e(0);
            this.t = this.m.z();
            this.s = this.m.i();
        }
        long j = this.t;
        if (j == 1) {
            fVar.c(this.m.f37616a, 8, 8);
            this.f34225u += 8;
            this.t = this.m.C();
        } else if (j == 0) {
            long jA = fVar.a();
            if (jA == -1 && !this.o.isEmpty()) {
                jA = this.o.peek().V0;
            }
            if (jA != -1) {
                this.t = (jA - fVar.d()) + ((long) this.f34225u);
            }
        }
        if (this.t < this.f34225u) {
            throw new t("Atom size less than header length (unsupported).");
        }
        long jD = fVar.d() - ((long) this.f34225u);
        if (this.s == com.smartdigimkt.c4.a.f34152Q) {
            int size = this.f34220h.size();
            for (int i2 = 0; i2 < size; i2++) {
                l lVar = this.f34220h.valueAt(i2).f34231b;
                lVar.f34284b = jD;
                lVar.d = jD;
                lVar.f34285c = jD;
            }
        }
        int i3 = this.s;
        if (i3 == com.smartdigimkt.c4.a.f34166n) {
            this.f34214B = null;
            this.f34226w = this.t + jD;
            if (!this.f34218J) {
                this.G.a(new com.smartdigimkt.b4.k.b(this.f34227z, jD));
                this.f34218J = true;
            }
            this.r = 2;
            return true;
        }
        if (a(i3)) {
            long jD2 = (fVar.d() + this.t) - 8;
            this.o.push(new com.smartdigimkt.c4.a.C0451a(this.s, jD2));
            if (this.t == this.f34225u) {
                b(jD2);
            } else {
                a();
            }
        } else if (b(this.s)) {
            if (this.f34225u != 8) {
                throw new t("Leaf atom defines extended atom size (unsupported).");
            }
            long j2 = this.t;
            if (j2 > 2147483647L) {
                throw new t("Leaf atom with length > 2147483647 (unsupported).");
            }
            s sVar = new s((int) j2);
            this.v = sVar;
            System.arraycopy(this.m.f37616a, 0, sVar.f37616a, 0, 8);
            this.r = 1;
        } else {
            if (this.t > 2147483647L) {
                throw new t("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.v = null;
            this.r = 1;
        }
        return true;
    }

    private void c(com.smartdigimkt.b4.f fVar) throws InterruptedException, IOException {
        int i2 = ((int) this.t) - this.f34225u;
        s sVar = this.v;
        if (sVar != null) {
            fVar.c(sVar.f37616a, 8, i2);
            a(new com.smartdigimkt.c4.a.b(this.s, this.v), fVar.d());
        } else {
            fVar.b(i2);
        }
        b(fVar.d());
    }

    private static Pair<Integer, com.smartdigimkt.c4.c> d(s sVar) {
        sVar.e(12);
        return Pair.create(Integer.valueOf(sVar.i()), new com.smartdigimkt.c4.c(sVar.B() - 1, sVar.B(), sVar.B(), sVar.i()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.smartdigimkt.b4.m] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean e(com.smartdigimkt.b4.f fVar) throws InterruptedException, IOException {
        ?? r17;
        com.smartdigimkt.b4.m.a aVar;
        ?? r1;
        int iA;
        int i2 = 4;
        int i3 = 1;
        int i4 = 0;
        if (this.r == 3) {
            if (this.f34214B == null) {
                d dVarA = a(this.f34220h);
                if (dVarA == null) {
                    int iD = (int) (this.f34226w - fVar.d());
                    if (iD < 0) {
                        throw new t("Offset to end of mdat was negative.");
                    }
                    fVar.b(iD);
                    a();
                    return false;
                }
                int iD2 = (int) (dVarA.f34231b.g[dVarA.g] - fVar.d());
                if (iD2 < 0) {
                    Log.w(f34208Q, "Ignoring negative offset to sample data.");
                    iD2 = 0;
                }
                fVar.b(iD2);
                this.f34214B = dVarA;
            }
            d dVar = this.f34214B;
            int[] iArr = dVar.f34231b.f34288i;
            int i5 = dVar.f34233e;
            int i6 = iArr[i5];
            this.C = i6;
            if (i5 < dVar.f34234h) {
                fVar.b(i6);
                this.f34214B.e();
                if (!this.f34214B.b()) {
                    this.f34214B = null;
                }
                this.r = 3;
                return true;
            }
            if (dVar.f34232c.g == 1) {
                this.C = i6 - 8;
                fVar.b(8);
            }
            int iC = this.f34214B.c();
            this.D = iC;
            this.C += iC;
            this.r = 4;
            this.f34215E = 0;
        }
        d dVar2 = this.f34214B;
        l lVar = dVar2.f34231b;
        j jVar = dVar2.f34232c;
        ?? r10 = dVar2.f34230a;
        int i7 = dVar2.f34233e;
        long jA = lVar.a(i7) * 1000;
        c0 c0Var = this.f34222l;
        if (c0Var != null) {
            jA = c0Var.a(jA);
        }
        int i8 = jVar.j;
        if (i8 == 0) {
            r17 = 1;
            while (true) {
                int i9 = this.D;
                int i10 = this.C;
                if (i9 >= i10) {
                    break;
                }
                this.D += r10.a(fVar, i10 - i9, false);
            }
        } else {
            byte[] bArr = this.j.f37616a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i11 = i8 + 1;
            int i12 = 4 - i8;
            while (this.D < this.C) {
                int i13 = this.f34215E;
                if (i13 == 0) {
                    fVar.c(bArr, i12, i11);
                    this.j.e(i4);
                    this.f34215E = this.j.B() - i3;
                    this.f34221i.e(i4);
                    r10.a(this.f34221i, i2);
                    r10.a(this.j, i3);
                    this.f34216F = (this.f34217I.length <= 0 || !p.a(jVar.f.f, bArr[i2])) ? i4 : i3;
                    this.D += 5;
                    this.C += i12;
                } else {
                    if (this.f34216F) {
                        this.k.c(i13);
                        fVar.c(this.k.f37616a, i4, this.f34215E);
                        r10.a(this.k, this.f34215E);
                        iA = this.f34215E;
                        s sVar = this.k;
                        int iC2 = p.c(sVar.f37616a, sVar.d());
                        this.k.e("video/hevc".equals(jVar.f.f) ? 1 : 0);
                        this.k.d(iC2);
                    } else {
                        iA = r10.a(fVar, i13, i4);
                    }
                    this.D += iA;
                    this.f34215E -= iA;
                    i3 = i3;
                    i2 = 4;
                    i4 = 0;
                }
            }
            r17 = i3;
        }
        boolean z2 = lVar.f34289l[i7];
        if (lVar.m) {
            int i14 = (z2 ? 1 : 0) | 1073741824;
            k kVarA = lVar.o;
            if (kVarA == null) {
                kVarA = jVar.a(lVar.f34283a.f34198a);
            }
            aVar = kVarA.f34281c;
            r1 = i14;
        } else {
            aVar = null;
            r1 = z2;
        }
        r10.a(jA, r1 == true ? 1 : 0, this.C, 0, aVar);
        a(jA);
        if (!this.f34214B.b()) {
            this.f34214B = null;
        }
        this.r = 3;
        return r17;
    }

    @Override // com.smartdigimkt.b4.e
    public boolean a(com.smartdigimkt.b4.f fVar) throws InterruptedException, IOException {
        return i.a(fVar);
    }

    @Override // com.smartdigimkt.b4.e
    public void release() {
    }

    public e(int i2) {
        this(i2, null);
    }

    @Override // com.smartdigimkt.b4.e
    public void a(com.smartdigimkt.b4.g gVar) {
        this.G = gVar;
        j jVar = this.f34219e;
        if (jVar != null) {
            d dVar = new d(gVar.a(0, jVar.f34274b));
            dVar.a(this.f34219e, new com.smartdigimkt.c4.c(0, 0, 0, 0));
            this.f34220h.put(0, dVar);
            b();
            this.G.a();
        }
    }

    public e(int i2, c0 c0Var) {
        this(i2, c0Var, null, null);
    }

    public e(int i2, c0 c0Var, j jVar, com.smartdigimkt.a4.e eVar) {
        this(i2, c0Var, jVar, eVar, Collections.EMPTY_LIST);
    }

    public e(int i2, c0 c0Var, j jVar, com.smartdigimkt.a4.e eVar, List<com.smartdigimkt.w3.m> list) {
        this(i2, c0Var, jVar, eVar, list, null);
    }

    public e(int i2, c0 c0Var, j jVar, com.smartdigimkt.a4.e eVar, List<com.smartdigimkt.w3.m> list, com.smartdigimkt.b4.m mVar) {
        this.d = i2 | (jVar != null ? 8 : 0);
        this.f34222l = c0Var;
        this.f34219e = jVar;
        this.g = eVar;
        this.f = Collections.unmodifiableList(list);
        this.q = mVar;
        this.m = new s(16);
        this.f34221i = new s(p.f37595b);
        this.j = new s(5);
        this.k = new s();
        this.f34223n = new byte[16];
        this.o = new ArrayDeque<>();
        this.f34224p = new ArrayDeque<>();
        this.f34220h = new SparseArray<>();
        this.f34227z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.f34213A = -9223372036854775807L;
        a();
    }

    private void c(com.smartdigimkt.c4.a.C0451a c0451a) throws t {
        int i2 = 0;
        com.smartdigimkt.p4.a.b(this.f34219e == null, "Unexpected moov box.");
        com.smartdigimkt.a4.e eVarA = this.g;
        if (eVarA == null) {
            eVarA = a(c0451a.W0);
        }
        com.smartdigimkt.a4.e eVar = eVarA;
        com.smartdigimkt.c4.a.C0451a c0451aE = c0451a.e(com.smartdigimkt.c4.a.S);
        SparseArray<com.smartdigimkt.c4.c> sparseArray = new SparseArray<>();
        int size = c0451aE.W0.size();
        long jB = -9223372036854775807L;
        for (int i3 = 0; i3 < size; i3++) {
            com.smartdigimkt.c4.a.b bVar = c0451aE.W0.get(i3);
            int i4 = bVar.f34171a;
            if (i4 == com.smartdigimkt.c4.a.f34146E) {
                Pair<Integer, com.smartdigimkt.c4.c> pairD = d(bVar.V0);
                sparseArray.put(((Integer) pairD.first).intValue(), (com.smartdigimkt.c4.c) pairD.second);
            } else if (i4 == com.smartdigimkt.c4.a.T) {
                jB = b(bVar.V0);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = c0451a.X0.size();
        for (int i5 = 0; i5 < size2; i5++) {
            com.smartdigimkt.c4.a.C0451a c0451a2 = c0451a.X0.get(i5);
            if (c0451a2.f34171a == com.smartdigimkt.c4.a.f34149J) {
                j jVarA = com.smartdigimkt.c4.b.a(c0451a2, c0451a.f(com.smartdigimkt.c4.a.f34148I), jB, eVar, (this.d & 16) != 0, false);
                if (jVarA != null) {
                    sparseArray2.put(jVarA.f34273a, jVarA);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.f34220h.size() == 0) {
            while (i2 < size3) {
                j jVar = (j) sparseArray2.valueAt(i2);
                d dVar = new d(this.G.a(i2, jVar.f34274b));
                dVar.a(jVar, a(sparseArray, jVar.f34273a));
                this.f34220h.put(jVar.f34273a, dVar);
                this.f34227z = Math.max(this.f34227z, jVar.f34276e);
                i2++;
            }
            b();
            this.G.a();
            return;
        }
        com.smartdigimkt.p4.a.b(this.f34220h.size() == size3);
        while (i2 < size3) {
            j jVar2 = (j) sparseArray2.valueAt(i2);
            this.f34220h.get(jVar2.f34273a).a(jVar2, a(sparseArray, jVar2.f34273a));
            i2++;
        }
    }

    private void d(com.smartdigimkt.b4.f fVar) throws InterruptedException, IOException {
        int size = this.f34220h.size();
        d dVarValueAt = null;
        long j = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            l lVar = this.f34220h.valueAt(i2).f34231b;
            if (lVar.r) {
                long j2 = lVar.d;
                if (j2 < j) {
                    dVarValueAt = this.f34220h.valueAt(i2);
                    j = j2;
                }
            }
        }
        if (dVarValueAt == null) {
            this.r = 3;
            return;
        }
        int iD = (int) (j - fVar.d());
        if (iD >= 0) {
            fVar.b(iD);
            dVarValueAt.f34231b.a(fVar);
            return;
        }
        throw new t("Offset to encryption data was negative.");
    }

    @Override // com.smartdigimkt.b4.e
    public void a(long j, long j2) {
        int size = this.f34220h.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f34220h.valueAt(i2).d();
        }
        this.f34224p.clear();
        this.x = 0;
        this.y = j2;
        this.o.clear();
        a();
    }

    @Override // com.smartdigimkt.b4.e
    public int a(com.smartdigimkt.b4.f fVar, com.smartdigimkt.b4.j jVar) throws InterruptedException, IOException {
        while (true) {
            int i2 = this.r;
            if (i2 != 0) {
                if (i2 == 1) {
                    c(fVar);
                } else if (i2 != 2) {
                    if (e(fVar)) {
                        return 0;
                    }
                } else {
                    d(fVar);
                }
            } else if (!b(fVar)) {
                return -1;
            }
        }
    }

    private void a() {
        this.r = 0;
        this.f34225u = 0;
    }

    private void a(com.smartdigimkt.c4.a.b bVar, long j) throws t {
        if (!this.o.isEmpty()) {
            this.o.peek().a(bVar);
            return;
        }
        int i2 = bVar.f34171a;
        if (i2 == com.smartdigimkt.c4.a.G) {
            Pair<Long, com.smartdigimkt.b4.a> pairA = a(bVar.V0, j);
            this.f34213A = ((Long) pairA.first).longValue();
            this.G.a((com.smartdigimkt.b4.k) pairA.second);
            this.f34218J = true;
            return;
        }
        if (i2 == com.smartdigimkt.c4.a.M0) {
            a(bVar.V0);
        }
    }

    private void a(com.smartdigimkt.c4.a.C0451a c0451a) throws t {
        int i2 = c0451a.f34171a;
        if (i2 == com.smartdigimkt.c4.a.H) {
            c(c0451a);
        } else if (i2 == com.smartdigimkt.c4.a.f34152Q) {
            b(c0451a);
        } else {
            if (this.o.isEmpty()) {
                return;
            }
            this.o.peek().a(c0451a);
        }
    }

    private com.smartdigimkt.c4.c a(SparseArray<com.smartdigimkt.c4.c> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (com.smartdigimkt.c4.c) com.smartdigimkt.p4.a.a(sparseArray.get(i2));
    }

    private static long c(s sVar) {
        sVar.e(8);
        return com.smartdigimkt.c4.a.c(sVar.i()) == 1 ? sVar.C() : sVar.z();
    }

    private void a(s sVar) {
        com.smartdigimkt.b4.m[] mVarArr = this.H;
        if (mVarArr == null || mVarArr.length == 0) {
            return;
        }
        sVar.e(12);
        int iA = sVar.a();
        sVar.u();
        sVar.u();
        long jC = f0.c(sVar.z(), 1000000L, sVar.z());
        for (com.smartdigimkt.b4.m mVar : this.H) {
            sVar.e(12);
            mVar.a(sVar, iA);
        }
        long j = this.f34213A;
        if (j != -9223372036854775807L) {
            long jA = j + jC;
            c0 c0Var = this.f34222l;
            if (c0Var != null) {
                jA = c0Var.a(jA);
            }
            long j2 = jA;
            for (com.smartdigimkt.b4.m mVar2 : this.H) {
                mVar2.a(j2, 1, iA, 0, null);
            }
            return;
        }
        this.f34224p.addLast(new c(jC, iA));
        this.x += iA;
    }

    private void b(long j) throws t {
        while (!this.o.isEmpty() && this.o.peek().V0 == j) {
            a(this.o.pop());
        }
        a();
    }

    private void b(com.smartdigimkt.c4.a.C0451a c0451a) throws t {
        a(c0451a, this.f34220h, this.d, this.f34223n);
        com.smartdigimkt.a4.e eVarA = this.g != null ? null : a(c0451a.W0);
        if (eVarA != null) {
            int size = this.f34220h.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f34220h.valueAt(i2).a(eVarA);
            }
        }
        if (this.y != -9223372036854775807L) {
            int size2 = this.f34220h.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.f34220h.valueAt(i3).a(this.y);
            }
            this.y = -9223372036854775807L;
        }
    }

    private static void a(com.smartdigimkt.c4.a.C0451a c0451a, SparseArray<d> sparseArray, int i2, byte[] bArr) throws t {
        int size = c0451a.X0.size();
        for (int i3 = 0; i3 < size; i3++) {
            com.smartdigimkt.c4.a.C0451a c0451a2 = c0451a.X0.get(i3);
            if (c0451a2.f34171a == com.smartdigimkt.c4.a.f34153R) {
                b(c0451a2, sparseArray, i2, bArr);
            }
        }
    }

    private void b() {
        int i2;
        if (this.H == null) {
            com.smartdigimkt.b4.m[] mVarArr = new com.smartdigimkt.b4.m[2];
            this.H = mVarArr;
            com.smartdigimkt.b4.m mVar = this.q;
            if (mVar != null) {
                mVarArr[0] = mVar;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if ((this.d & 4) != 0) {
                mVarArr[i2] = this.G.a(this.f34220h.size(), 4);
                i2++;
            }
            com.smartdigimkt.b4.m[] mVarArr2 = (com.smartdigimkt.b4.m[]) Arrays.copyOf(this.H, i2);
            this.H = mVarArr2;
            for (com.smartdigimkt.b4.m mVar2 : mVarArr2) {
                mVar2.a(T);
            }
        }
        if (this.f34217I == null) {
            this.f34217I = new com.smartdigimkt.b4.m[this.f.size()];
            for (int i3 = 0; i3 < this.f34217I.length; i3++) {
                com.smartdigimkt.b4.m mVarA = this.G.a(this.f34220h.size() + 1 + i3, 3);
                mVarA.a(this.f.get(i3));
                this.f34217I[i3] = mVarA;
            }
        }
    }

    private static void a(com.smartdigimkt.c4.a.C0451a c0451a, d dVar, long j, int i2) {
        d dVar2;
        long j2;
        int i3;
        List<com.smartdigimkt.c4.a.b> list = c0451a.W0;
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            com.smartdigimkt.c4.a.b bVar = list.get(i7);
            if (bVar.f34171a == com.smartdigimkt.c4.a.f34147F) {
                s sVar = bVar.V0;
                sVar.e(12);
                int iB = sVar.B();
                if (iB > 0) {
                    i6 += iB;
                    i5++;
                }
            }
        }
        dVar.g = 0;
        dVar.f = 0;
        dVar.f34233e = 0;
        dVar.f34231b.a(i5, i6);
        int i8 = 0;
        int iA = 0;
        while (i4 < size) {
            com.smartdigimkt.c4.a.b bVar2 = list.get(i4);
            if (bVar2.f34171a == com.smartdigimkt.c4.a.f34147F) {
                s sVar2 = bVar2.V0;
                dVar2 = dVar;
                j2 = j;
                i3 = i2;
                iA = a(dVar2, i8, j2, i3, sVar2, iA);
                i8++;
            } else {
                dVar2 = dVar;
                j2 = j;
                i3 = i2;
            }
            i4++;
            dVar = dVar2;
            j = j2;
            i2 = i3;
        }
    }

    private static void a(k kVar, s sVar, l lVar) throws t {
        int i2;
        int i3 = kVar.d;
        sVar.e(8);
        if ((com.smartdigimkt.c4.a.b(sVar.i()) & 1) == 1) {
            sVar.f(8);
        }
        int iX = sVar.x();
        int iB = sVar.B();
        if (iB == lVar.f) {
            if (iX == 0) {
                boolean[] zArr = lVar.f34290n;
                i2 = 0;
                for (int i4 = 0; i4 < iB; i4++) {
                    int iX2 = sVar.x();
                    i2 += iX2;
                    zArr[i4] = iX2 > i3;
                }
            } else {
                i2 = iX * iB;
                Arrays.fill(lVar.f34290n, 0, iB, iX > i3);
            }
            lVar.b(i2);
            return;
        }
        StringBuilder sbU = android.support.v4.media.a.u(iB, "Length mismatch: ", ", ");
        sbU.append(lVar.f);
        throw new t(sbU.toString());
    }

    private static long b(s sVar) {
        sVar.e(8);
        return com.smartdigimkt.c4.a.c(sVar.i()) == 0 ? sVar.z() : sVar.C();
    }

    private static void b(com.smartdigimkt.c4.a.C0451a c0451a, SparseArray<d> sparseArray, int i2, byte[] bArr) throws t {
        d dVarA = a(c0451a.f(com.smartdigimkt.c4.a.D).V0, sparseArray);
        if (dVarA == null) {
            return;
        }
        l lVar = dVarA.f34231b;
        long jC = lVar.s;
        dVarA.d();
        int i3 = com.smartdigimkt.c4.a.C;
        if (c0451a.f(i3) != null && (i2 & 2) == 0) {
            jC = c(c0451a.f(i3).V0);
        }
        a(c0451a, dVarA, jC, i2);
        k kVarA = dVarA.f34232c.a(lVar.f34283a.f34198a);
        com.smartdigimkt.c4.a.b bVarF = c0451a.f(com.smartdigimkt.c4.a.i0);
        if (bVarF != null) {
            a(kVarA, bVarF.V0, lVar);
        }
        com.smartdigimkt.c4.a.b bVarF2 = c0451a.f(com.smartdigimkt.c4.a.j0);
        if (bVarF2 != null) {
            a(bVarF2.V0, lVar);
        }
        com.smartdigimkt.c4.a.b bVarF3 = c0451a.f(com.smartdigimkt.c4.a.n0);
        if (bVarF3 != null) {
            b(bVarF3.V0, lVar);
        }
        com.smartdigimkt.c4.a.b bVarF4 = c0451a.f(com.smartdigimkt.c4.a.k0);
        com.smartdigimkt.c4.a.b bVarF5 = c0451a.f(com.smartdigimkt.c4.a.l0);
        if (bVarF4 != null && bVarF5 != null) {
            a(bVarF4.V0, bVarF5.V0, kVarA != null ? kVarA.f34280b : null, lVar);
        }
        int size = c0451a.W0.size();
        for (int i4 = 0; i4 < size; i4++) {
            com.smartdigimkt.c4.a.b bVar = c0451a.W0.get(i4);
            if (bVar.f34171a == com.smartdigimkt.c4.a.m0) {
                a(bVar.V0, lVar, bArr);
            }
        }
    }

    private static void a(s sVar, l lVar) throws t {
        sVar.e(8);
        int i2 = sVar.i();
        if ((com.smartdigimkt.c4.a.b(i2) & 1) == 1) {
            sVar.f(8);
        }
        int iB = sVar.B();
        if (iB == 1) {
            lVar.d += com.smartdigimkt.c4.a.c(i2) == 0 ? sVar.z() : sVar.C();
            return;
        }
        throw new t(android.support.v4.media.a.h(iB, "Unexpected saio entry count: "));
    }

    private static d b(SparseArray<d> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i2);
    }

    private static void b(s sVar, l lVar) throws t {
        a(sVar, 0, lVar);
    }

    private static boolean b(int i2) {
        return i2 == com.smartdigimkt.c4.a.f34156Y || i2 == com.smartdigimkt.c4.a.X || i2 == com.smartdigimkt.c4.a.f34148I || i2 == com.smartdigimkt.c4.a.G || i2 == com.smartdigimkt.c4.a.Z || i2 == com.smartdigimkt.c4.a.C || i2 == com.smartdigimkt.c4.a.D || i2 == com.smartdigimkt.c4.a.f34154U || i2 == com.smartdigimkt.c4.a.f34146E || i2 == com.smartdigimkt.c4.a.f34147F || i2 == com.smartdigimkt.c4.a.a0 || i2 == com.smartdigimkt.c4.a.i0 || i2 == com.smartdigimkt.c4.a.j0 || i2 == com.smartdigimkt.c4.a.n0 || i2 == com.smartdigimkt.c4.a.m0 || i2 == com.smartdigimkt.c4.a.k0 || i2 == com.smartdigimkt.c4.a.l0 || i2 == com.smartdigimkt.c4.a.W || i2 == com.smartdigimkt.c4.a.T || i2 == com.smartdigimkt.c4.a.M0;
    }

    private static d a(s sVar, SparseArray<d> sparseArray) {
        sVar.e(8);
        int iB = com.smartdigimkt.c4.a.b(sVar.i());
        d dVarB = b(sparseArray, sVar.i());
        if (dVarB == null) {
            return null;
        }
        if ((iB & 1) != 0) {
            long jC = sVar.C();
            l lVar = dVarB.f34231b;
            lVar.f34285c = jC;
            lVar.d = jC;
        }
        com.smartdigimkt.c4.c cVar = dVarB.d;
        dVarB.f34231b.f34283a = new com.smartdigimkt.c4.c((iB & 2) != 0 ? sVar.B() - 1 : cVar.f34198a, (iB & 8) != 0 ? sVar.B() : cVar.f34199b, (iB & 16) != 0 ? sVar.B() : cVar.f34200c, (iB & 32) != 0 ? sVar.B() : cVar.d);
        return dVarB;
    }

    /* JADX WARN: Failed to calculate best type for var: r7v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v1 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v1 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v7 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    private static int a(com.smartdigimkt.c4.e.d r27, int r28, long r29, int r31, com.smartdigimkt.p4.s r32, int r33) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smartdigimkt.c4.e.a(com.smartdigimkt.c4.e$d, int, long, int, com.smartdigimkt.p4.s, int):int");
    }

    private static void a(s sVar, l lVar, byte[] bArr) throws t {
        sVar.e(8);
        sVar.a(bArr, 0, 16);
        if (Arrays.equals(bArr, S)) {
            a(sVar, 16, lVar);
        }
    }

    private static void a(s sVar, int i2, l lVar) throws t {
        sVar.e(i2 + 8);
        int iB = com.smartdigimkt.c4.a.b(sVar.i());
        if ((iB & 1) == 0) {
            boolean z2 = (iB & 2) != 0;
            int iB2 = sVar.B();
            if (iB2 == lVar.f) {
                Arrays.fill(lVar.f34290n, 0, iB2, z2);
                lVar.b(sVar.a());
                lVar.a(sVar);
                return;
            } else {
                StringBuilder sbU = android.support.v4.media.a.u(iB2, "Length mismatch: ", ", ");
                sbU.append(lVar.f);
                throw new t(sbU.toString());
            }
        }
        throw new t("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static void a(s sVar, s sVar2, String str, l lVar) throws t {
        byte[] bArr;
        sVar.e(8);
        int i2 = sVar.i();
        int i3 = sVar.i();
        int i4 = f34209R;
        if (i3 != i4) {
            return;
        }
        if (com.smartdigimkt.c4.a.c(i2) == 1) {
            sVar.f(4);
        }
        if (sVar.i() == 1) {
            sVar2.e(8);
            int i5 = sVar2.i();
            if (sVar2.i() != i4) {
                return;
            }
            int iC = com.smartdigimkt.c4.a.c(i5);
            if (iC == 1) {
                if (sVar2.z() == 0) {
                    throw new t("Variable length description in sgpd found (unsupported)");
                }
            } else if (iC >= 2) {
                sVar2.f(4);
            }
            if (sVar2.z() == 1) {
                sVar2.f(1);
                int iX = sVar2.x();
                int i6 = (iX & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                int i7 = iX & 15;
                boolean z2 = sVar2.x() == 1;
                if (z2) {
                    int iX2 = sVar2.x();
                    byte[] bArr2 = new byte[16];
                    sVar2.a(bArr2, 0, 16);
                    if (z2 && iX2 == 0) {
                        int iX3 = sVar2.x();
                        bArr = new byte[iX3];
                        sVar2.a(bArr, 0, iX3);
                    } else {
                        bArr = null;
                    }
                    byte[] bArr3 = bArr;
                    lVar.m = true;
                    lVar.o = new k(z2, str, iX2, bArr2, i6, i7, bArr3);
                    return;
                }
                return;
            }
            throw new t("Entry count in sgpd != 1 (unsupported).");
        }
        throw new t("Entry count in sbgp != 1 (unsupported).");
    }

    private static Pair<Long, com.smartdigimkt.b4.a> a(s sVar, long j) throws t {
        long jC;
        long jC2;
        sVar.e(8);
        int iC = com.smartdigimkt.c4.a.c(sVar.i());
        sVar.f(4);
        long jZ = sVar.z();
        if (iC == 0) {
            jC = sVar.z();
            jC2 = sVar.z();
        } else {
            jC = sVar.C();
            jC2 = sVar.C();
        }
        long j2 = jC2 + j;
        long jC3 = f0.c(jC, 1000000L, jZ);
        sVar.f(2);
        int iD = sVar.D();
        int[] iArr = new int[iD];
        long[] jArr = new long[iD];
        long[] jArr2 = new long[iD];
        long[] jArr3 = new long[iD];
        long j3 = j2;
        long jC4 = jC3;
        int i2 = 0;
        while (i2 < iD) {
            int i3 = sVar.i();
            if ((Integer.MIN_VALUE & i3) == 0) {
                long jZ2 = sVar.z();
                iArr[i2] = i3 & Integer.MAX_VALUE;
                jArr[i2] = j3;
                jArr3[i2] = jC4;
                jC += jZ2;
                long[] jArr4 = jArr3;
                jC4 = f0.c(jC, 1000000L, jZ);
                jArr2[i2] = jC4 - jArr4[i2];
                sVar.f(4);
                j3 += (long) iArr[i2];
                i2++;
                jArr3 = jArr4;
            } else {
                throw new t("Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(jC3), new com.smartdigimkt.b4.a(iArr, jArr, jArr2, jArr3));
    }

    private void a(long j) {
        while (!this.f34224p.isEmpty()) {
            c cVarRemoveFirst = this.f34224p.removeFirst();
            this.x -= cVarRemoveFirst.f34229b;
            long jA = cVarRemoveFirst.f34228a + j;
            c0 c0Var = this.f34222l;
            if (c0Var != null) {
                jA = c0Var.a(jA);
            }
            long j2 = jA;
            for (com.smartdigimkt.b4.m mVar : this.H) {
                mVar.a(j2, 1, cVarRemoveFirst.f34229b, this.x, null);
            }
        }
    }

    private static d a(SparseArray<d> sparseArray) {
        int size = sparseArray.size();
        d dVar = null;
        long j = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            d dVarValueAt = sparseArray.valueAt(i2);
            int i3 = dVarValueAt.g;
            l lVar = dVarValueAt.f34231b;
            if (i3 != lVar.f34286e) {
                long j2 = lVar.g[i3];
                if (j2 < j) {
                    dVar = dVarValueAt;
                    j = j2;
                }
            }
        }
        return dVar;
    }

    private static com.smartdigimkt.a4.e a(List<com.smartdigimkt.c4.a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            com.smartdigimkt.c4.a.b bVar = list.get(i2);
            if (bVar.f34171a == com.smartdigimkt.c4.a.a0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.V0.f37616a;
                UUID uuidB = h.b(bArr);
                if (uuidB == null) {
                    Log.w(f34208Q, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new com.smartdigimkt.a4.e.b(uuidB, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new com.smartdigimkt.a4.e(arrayList);
    }

    private static boolean a(int i2) {
        return i2 == com.smartdigimkt.c4.a.H || i2 == com.smartdigimkt.c4.a.f34149J || i2 == com.smartdigimkt.c4.a.K || i2 == com.smartdigimkt.c4.a.L || i2 == com.smartdigimkt.c4.a.M || i2 == com.smartdigimkt.c4.a.f34152Q || i2 == com.smartdigimkt.c4.a.f34153R || i2 == com.smartdigimkt.c4.a.S || i2 == com.smartdigimkt.c4.a.f34155V;
    }
}
