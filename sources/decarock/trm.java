package decarock;

/* JADX INFO: compiled from: Size.java */
/* JADX INFO: loaded from: classes.dex */
public final class trm {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final trm f25148dern = new trm(-1, -1);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final trm f25149wireman = new trm(0, 0);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f25150attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f25151saneness;

    public trm(int i, int i2) {
        attabal.attabal((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.f25150attabal = i;
        this.f25151saneness = i2;
    }

    public int attabal() {
        return this.f25151saneness;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof trm) {
            trm trmVar = (trm) obj;
            if (this.f25150attabal == trmVar.f25150attabal && this.f25151saneness == trmVar.f25151saneness) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f25151saneness;
        int i2 = this.f25150attabal;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public int saneness() {
        return this.f25150attabal;
    }

    public String toString() {
        return this.f25150attabal + "x" + this.f25151saneness;
    }
}
