package lo;

import com.applovin.shadow.okio.Segment;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f45659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f45663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f45664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f45665g;

    public o() {
        this.f45659a = new byte[Segment.SIZE];
        this.f45663e = true;
        this.f45662d = false;
    }

    public final o a() {
        o oVar = this.f45664f;
        if (oVar == this) {
            oVar = null;
        }
        o oVar2 = this.f45665g;
        kotlin.jvm.internal.n.c(oVar2);
        oVar2.f45664f = this.f45664f;
        o oVar3 = this.f45664f;
        kotlin.jvm.internal.n.c(oVar3);
        oVar3.f45665g = this.f45665g;
        this.f45664f = null;
        this.f45665g = null;
        return oVar;
    }

    public final void b(o segment) {
        kotlin.jvm.internal.n.f(segment, "segment");
        segment.f45665g = this;
        segment.f45664f = this.f45664f;
        o oVar = this.f45664f;
        kotlin.jvm.internal.n.c(oVar);
        oVar.f45665g = segment;
        this.f45664f = segment;
    }

    public final o c() {
        this.f45662d = true;
        return new o(this.f45659a, this.f45660b, this.f45661c, true);
    }

    public final void d(o sink, int i10) {
        kotlin.jvm.internal.n.f(sink, "sink");
        byte[] bArr = sink.f45659a;
        if (!sink.f45663e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.f45661c;
        int i12 = i11 + i10;
        if (i12 > 8192) {
            if (sink.f45662d) {
                throw new IllegalArgumentException();
            }
            int i13 = sink.f45660b;
            if (i12 - i13 > 8192) {
                throw new IllegalArgumentException();
            }
            xj.k.g0(bArr, 0, i13, bArr, i11);
            sink.f45661c -= sink.f45660b;
            sink.f45660b = 0;
        }
        int i14 = sink.f45661c;
        int i15 = this.f45660b;
        xj.k.g0(this.f45659a, i14, i15, bArr, i15 + i10);
        sink.f45661c += i10;
        this.f45660b += i10;
    }

    public o(byte[] data, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.n.f(data, "data");
        this.f45659a = data;
        this.f45660b = i10;
        this.f45661c = i11;
        this.f45662d = z10;
        this.f45663e = false;
    }
}
