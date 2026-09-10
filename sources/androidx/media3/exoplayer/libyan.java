package androidx.media3.exoplayer;

/* JADX INFO: compiled from: RendererConfiguration.java */
/* JADX INFO: loaded from: classes.dex */
public final class libyan {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final libyan f11958dern = new libyan(0, false);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f11959attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final boolean f11960saneness;

    public libyan(int i, boolean z) {
        this.f11959attabal = i;
        this.f11960saneness = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && libyan.class == obj.getClass()) {
            libyan libyanVar = (libyan) obj;
            if (this.f11959attabal == libyanVar.f11959attabal && this.f11960saneness == libyanVar.f11960saneness) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f11959attabal << 1) + (this.f11960saneness ? 1 : 0);
    }
}
