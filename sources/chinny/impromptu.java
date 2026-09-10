package chinny;

/* JADX INFO: compiled from: MarkerEdgeTreatment.java */
/* JADX INFO: loaded from: classes3.dex */
public final class impromptu extends competently {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final float f15487kowloon;

    public impromptu(float f) {
        this.f15487kowloon = f - 0.001f;
    }

    @Override // chinny.competently
    public boolean attabal() {
        return true;
    }

    @Override // chinny.competently
    public void dern(float f, float f2, float f3, monoploid monoploidVar) {
        float fSqrt = (float) ((((double) this.f15487kowloon) * Math.sqrt(2.0d)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(this.f15487kowloon, 2.0d) - Math.pow(fSqrt, 2.0d));
        monoploidVar.triweekly(f2 - fSqrt, ((float) (-((((double) this.f15487kowloon) * Math.sqrt(2.0d)) - ((double) this.f15487kowloon)))) + fSqrt2);
        monoploidVar.impassible(f2, (float) (-((((double) this.f15487kowloon) * Math.sqrt(2.0d)) - ((double) this.f15487kowloon))));
        monoploidVar.impassible(f2 + fSqrt, ((float) (-((((double) this.f15487kowloon) * Math.sqrt(2.0d)) - ((double) this.f15487kowloon)))) + fSqrt2);
    }
}
