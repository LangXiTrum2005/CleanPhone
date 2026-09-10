package f2;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1.g f40502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a4.a f40503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oa.k0 f40504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ea.b0 f40505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40506e;

    public w0(n1.g gVar, n2.i iVar) {
        a4.a aVar = new a4.a(iVar, 24);
        oa.k0 k0Var = new oa.k0(16);
        ea.b0 b0Var = new ea.b0(29);
        this.f40502a = gVar;
        this.f40503b = aVar;
        this.f40504c = k0Var;
        this.f40505d = b0Var;
        this.f40506e = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
    }

    @Override // f2.b0
    public final a a(i1.y yVar) {
        yVar.f42714b.getClass();
        return new x0(yVar, this.f40502a, this.f40503b, this.f40504c.E(yVar), this.f40505d, this.f40506e, null);
    }
}
