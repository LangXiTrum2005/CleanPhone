package utwa;

/* JADX INFO: compiled from: MeanCalculator.java */
/* JADX INFO: loaded from: classes.dex */
public class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public float f39256attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f39257saneness;

    public void attabal(float f) {
        float f2 = this.f39256attabal + f;
        this.f39256attabal = f2;
        int i = this.f39257saneness + 1;
        this.f39257saneness = i;
        if (i == Integer.MAX_VALUE) {
            this.f39256attabal = f2 / 2.0f;
            this.f39257saneness = i / 2;
        }
    }
}
