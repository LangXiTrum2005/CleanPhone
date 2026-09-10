package picketboat;

import android.content.LocusId;
import android.os.Build;
import com.ironsource.X3;
import technofreak.cutely;

/* JADX INFO: compiled from: LocusIdCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f35326attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final LocusId f35327saneness;

    /* JADX INFO: compiled from: LocusIdCompat.java */
    public static class attabal {
        public static LocusId attabal(String str) {
            return new LocusId(str);
        }

        public static String saneness(LocusId locusId) {
            return locusId.getId();
        }
    }

    public wireman(String str) {
        this.f35326attabal = (String) cutely.cutely(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f35327saneness = attabal.attabal(str);
        } else {
            this.f35327saneness = null;
        }
    }

    public static wireman dern(LocusId locusId) {
        cutely.impromptu(locusId, "locusId cannot be null");
        return new wireman((String) cutely.cutely(attabal.saneness(locusId), "id cannot be empty"));
    }

    public final String attabal() {
        return this.f35326attabal.length() + "_chars";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wireman.class != obj.getClass()) {
            return false;
        }
        wireman wiremanVar = (wireman) obj;
        String str = this.f35326attabal;
        if (str == null) {
            return wiremanVar.f35326attabal == null;
        }
        return str.equals(wiremanVar.f35326attabal);
    }

    public int hashCode() {
        String str = this.f35326attabal;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public LocusId saneness() {
        return this.f35327saneness;
    }

    public String toString() {
        return "LocusIdCompat[" + attabal() + X3.j.e;
    }
}
