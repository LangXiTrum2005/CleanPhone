package zm;

import java.util.Iterator;
import xj.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements i, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f55096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55097c;

    public b(i sequence, int i10, int i11) {
        this.f55095a = i11;
        switch (i11) {
            case 1:
                this.f55096b = sequence;
                this.f55097c = i10;
                if (i10 >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
            default:
                kotlin.jvm.internal.n.f(sequence, "sequence");
                this.f55096b = sequence;
                this.f55097c = i10;
                if (i10 >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
        }
    }

    @Override // zm.c
    public final i a(int i10) {
        switch (this.f55095a) {
            case 0:
                int i11 = this.f55097c + i10;
                return i11 < 0 ? new b(this, i10, 0) : new b(this.f55096b, i11, 0);
            default:
                int i12 = this.f55097c;
                return i10 >= i12 ? d.f55098a : new q(this.f55096b, i10, i12);
        }
    }

    @Override // zm.c
    public final i b(int i10) {
        switch (this.f55095a) {
            case 0:
                int i11 = this.f55097c;
                int i12 = i11 + i10;
                return i12 < 0 ? new b(this, i10, 1) : new q(this.f55096b, i11, i12);
            default:
                return i10 >= this.f55097c ? this : new b(this.f55096b, i10, 1);
        }
    }

    @Override // zm.i
    public final Iterator iterator() {
        switch (this.f55095a) {
            case 0:
                return new z(this);
            default:
                return new z(this, (byte) 0);
        }
    }
}
