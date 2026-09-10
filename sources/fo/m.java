package fo;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends ao.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f41250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f41251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f41252g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, n nVar, int i10, long j10) {
        super(str, true);
        this.f41250e = nVar;
        this.f41251f = i10;
        this.f41252g = j10;
    }

    @Override // ao.a
    public final long a() {
        n nVar = this.f41250e;
        try {
            nVar.f41275w.n(this.f41251f, this.f41252g);
            return -1L;
        } catch (IOException e10) {
            nVar.a(2, 2, e10);
            return -1L;
        }
    }
}
