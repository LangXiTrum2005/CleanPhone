package j1;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import oa.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f43592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f43593b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f43594c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f43595d;

    public g(j0 j0Var) {
        this.f43592a = j0Var;
        h hVar = h.f43596e;
        this.f43595d = false;
    }

    public final void a() {
        i iVar = i.f43601b;
        ArrayList arrayList = this.f43593b;
        arrayList.clear();
        this.f43595d = false;
        long jB = iVar.f43602a;
        int i10 = 0;
        while (true) {
            j0 j0Var = this.f43592a;
            if (i10 >= j0Var.size()) {
                break;
            }
            k kVar = (k) j0Var.get(i10);
            new i(jB);
            kVar.flush();
            if (kVar.isActive()) {
                jB = kVar.b(jB);
                go.k.t(jB >= 0);
                arrayList.add(kVar);
            }
            i10++;
        }
        this.f43594c = new ByteBuffer[arrayList.size()];
        for (int i11 = 0; i11 <= b(); i11++) {
            this.f43594c[i11] = ((k) arrayList.get(i11)).getOutput();
        }
    }

    public final int b() {
        return this.f43594c.length - 1;
    }

    public final boolean c() {
        return this.f43595d && ((k) this.f43593b.get(b())).isEnded() && !this.f43594c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.f43593b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z10;
        for (boolean z11 = true; z11; z11 = z10) {
            z10 = false;
            for (int i10 = 0; i10 <= b(); i10++) {
                if (!this.f43594c[i10].hasRemaining()) {
                    ArrayList arrayList = this.f43593b;
                    k kVar = (k) arrayList.get(i10);
                    if (!kVar.isEnded()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f43594c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : k.f43603a;
                        long jRemaining = byteBuffer2.remaining();
                        kVar.queueInput(byteBuffer2);
                        this.f43594c[i10] = kVar.getOutput();
                        z10 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f43594c[i10].hasRemaining();
                    } else if (!this.f43594c[i10].hasRemaining() && i10 < b()) {
                        ((k) arrayList.get(i10 + 1)).queueEndOfStream();
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        j0 j0Var = ((g) obj).f43592a;
        j0 j0Var2 = this.f43592a;
        if (j0Var2.size() != j0Var.size()) {
            return false;
        }
        for (int i10 = 0; i10 < j0Var2.size(); i10++) {
            if (j0Var2.get(i10) != j0Var.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f43592a.hashCode();
    }
}
