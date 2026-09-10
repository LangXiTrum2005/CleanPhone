package cybernatic;

import com.ironsource.X3;

/* JADX INFO: compiled from: SeekPoint.java */
/* JADX INFO: loaded from: classes.dex */
public final class polder {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final polder f24721dern = new polder(0, 0);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f24722attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f24723saneness;

    public polder(long j, long j2) {
        this.f24722attabal = j;
        this.f24723saneness = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && polder.class == obj.getClass()) {
            polder polderVar = (polder) obj;
            if (this.f24722attabal == polderVar.f24722attabal && this.f24723saneness == polderVar.f24723saneness) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f24722attabal) * 31) + ((int) this.f24723saneness);
    }

    public String toString() {
        return "[timeUs=" + this.f24722attabal + ", position=" + this.f24723saneness + X3.j.e;
    }
}
