package wf;

import kotlin.jvm.internal.n;
import wj.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements mg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ec.a f53200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mg.a f53201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f53202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f53203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f53204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f53205f;

    public h(ec.a aVar, mg.a user, h hVar) {
        n.f(user, "user");
        this.f53200a = aVar;
        this.f53201b = user;
        this.f53202c = Long.MIN_VALUE;
        this.f53203d = Long.MIN_VALUE;
        this.f53204e = Long.MIN_VALUE;
        this.f53205f = r9.b.u(new dg.a(2, hVar, this));
    }

    @Override // mg.a
    public final long b(vf.c type, long j10) {
        n.f(type, "type");
        if (this.f53202c == Long.MIN_VALUE) {
            this.f53202c = j10;
        }
        long jLongValue = (j10 - this.f53202c) + ((Number) this.f53205f.getValue()).longValue();
        this.f53204e = jLongValue;
        long jB = this.f53201b.b(type, jLongValue);
        long j11 = this.f53203d;
        if (jB > j11) {
            this.f53203d = jB;
            return jB;
        }
        StringBuilder sbL = wi.d.l(jB, "Timestamps must be monotonically increasing: ", ", ");
        sbL.append(j11);
        throw new IllegalStateException(sbL.toString().toString());
    }
}
