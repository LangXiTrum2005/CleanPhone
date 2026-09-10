package pc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements mc.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f48321a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f48322b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mc.c f48323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f48324d;

    public h(f fVar) {
        this.f48324d = fVar;
    }

    @Override // mc.g
    public final mc.g b(String str) {
        if (this.f48321a) {
            throw new mc.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f48321a = true;
        this.f48324d.h(this.f48323c, str, this.f48322b);
        return this;
    }

    @Override // mc.g
    public final mc.g d(boolean z10) {
        if (this.f48321a) {
            throw new mc.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f48321a = true;
        this.f48324d.d(this.f48323c, z10 ? 1 : 0, this.f48322b);
        return this;
    }
}
