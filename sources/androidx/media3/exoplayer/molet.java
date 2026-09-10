package androidx.media3.exoplayer;

/* JADX INFO: compiled from: SeekParameters.java */
/* JADX INFO: loaded from: classes.dex */
public final class molet {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final molet f12113beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final molet f12114competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final molet f12115dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final molet f12116marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final molet f12117wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f12118attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f12119saneness;

    static {
        molet moletVar = new molet(0L, 0L);
        f12115dern = moletVar;
        f12117wireman = new molet(Long.MAX_VALUE, Long.MAX_VALUE);
        f12116marial = new molet(Long.MAX_VALUE, 0L);
        f12113beachfront = new molet(0L, Long.MAX_VALUE);
        f12114competently = moletVar;
    }

    public molet(long j, long j2) {
        decarock.attabal.attabal(j >= 0);
        decarock.attabal.attabal(j2 >= 0);
        this.f12118attabal = j;
        this.f12119saneness = j2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051 A[RETURN] */
    public long attabal(long j, long j2, long j3) {
        long j4 = this.f12118attabal;
        if (j4 == 0 && this.f12119saneness == 0) {
            return j;
        }
        long jFastrack = decarock.grimness.fastrack(j, j4, Long.MIN_VALUE);
        long jSaneness = decarock.grimness.saneness(j, this.f12119saneness, Long.MAX_VALUE);
        boolean z = false;
        boolean z2 = jFastrack <= j2 && j2 <= jSaneness;
        if (jFastrack <= j3 && j3 <= jSaneness) {
            z = true;
        }
        if (z2 && z) {
            if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
            return j3;
        }
        if (!z2) {
            if (z) {
                return j3;
            }
            return jFastrack;
        }
        return j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && molet.class == obj.getClass()) {
            molet moletVar = (molet) obj;
            if (this.f12118attabal == moletVar.f12118attabal && this.f12119saneness == moletVar.f12119saneness) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f12118attabal) * 31) + ((int) this.f12119saneness);
    }
}
