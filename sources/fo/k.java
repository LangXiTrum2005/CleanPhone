package fo;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends ao.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f41242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f41243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ lo.e f41244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f41245h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, n nVar, int i10, lo.e eVar, int i11, boolean z10) {
        super(str, true);
        this.f41242e = nVar;
        this.f41243f = i10;
        this.f41244g = eVar;
        this.f41245h = i11;
    }

    @Override // ao.a
    public final long a() {
        try {
            y yVar = this.f41242e.f41264k;
            lo.e eVar = this.f41244g;
            int i10 = this.f41245h;
            yVar.getClass();
            eVar.skip(i10);
            this.f41242e.f41275w.k(this.f41243f, 9);
            synchronized (this.f41242e) {
                this.f41242e.f41277y.remove(Integer.valueOf(this.f41243f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
