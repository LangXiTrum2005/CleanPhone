package n2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f46502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.c f46503c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(androidx.recyclerview.widget.c cVar, t tVar, t tVar2) {
        super(tVar);
        this.f46503c = cVar;
        this.f46502b = tVar2;
    }

    @Override // n2.p, n2.t
    public final s getSeekPoints(long j10) {
        s seekPoints = this.f46502b.getSeekPoints(j10);
        u uVar = seekPoints.f46490a;
        long j11 = uVar.f46493a;
        long j12 = uVar.f46494b;
        long j13 = this.f46503c.f4728b;
        u uVar2 = new u(j11, j12 + j13);
        u uVar3 = seekPoints.f46491b;
        return new s(uVar2, new u(uVar3.f46493a, uVar3.f46494b + j13));
    }
}
