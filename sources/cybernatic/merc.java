package cybernatic;

import com.ironsource.X3;

/* JADX INFO: compiled from: SeekMap.java */
/* JADX INFO: loaded from: classes.dex */
public interface merc {

    /* JADX INFO: compiled from: SeekMap.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final polder f24716attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final polder f24717saneness;

        public attabal(polder polderVar) {
            this(polderVar, polderVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && attabal.class == obj.getClass()) {
                attabal attabalVar = (attabal) obj;
                if (this.f24716attabal.equals(attabalVar.f24716attabal) && this.f24717saneness.equals(attabalVar.f24717saneness)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f24716attabal.hashCode() * 31) + this.f24717saneness.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(X3.j.d);
            sb.append(this.f24716attabal);
            if (this.f24716attabal.equals(this.f24717saneness)) {
                str = "";
            } else {
                str = ", " + this.f24717saneness;
            }
            sb.append(str);
            sb.append(X3.j.e);
            return sb.toString();
        }

        public attabal(polder polderVar, polder polderVar2) {
            this.f24716attabal = (polder) decarock.attabal.marial(polderVar);
            this.f24717saneness = (polder) decarock.attabal.marial(polderVar2);
        }
    }

    /* JADX INFO: compiled from: SeekMap.java */
    public static class saneness implements merc {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final long f24718attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final attabal f24719saneness;

        public saneness(long j) {
            this(j, 0L);
        }

        @Override // cybernatic.merc
        public long getDurationUs() {
            return this.f24718attabal;
        }

        @Override // cybernatic.merc
        public attabal getSeekPoints(long j) {
            return this.f24719saneness;
        }

        @Override // cybernatic.merc
        public boolean isSeekable() {
            return false;
        }

        public saneness(long j, long j2) {
            this.f24718attabal = j;
            this.f24719saneness = new attabal(j2 == 0 ? polder.f24721dern : new polder(0L, j2));
        }
    }

    long getDurationUs();

    attabal getSeekPoints(long j);

    boolean isSeekable();
}
