package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: ContentUriTriggers.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Set<attabal> f14046attabal = new HashSet();

    /* JADX INFO: compiled from: ContentUriTriggers.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Uri f14047attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final boolean f14048saneness;

        public attabal(Uri uri, boolean z) {
            this.f14047attabal = uri;
            this.f14048saneness = z;
        }

        public Uri attabal() {
            return this.f14047attabal;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && attabal.class == obj.getClass()) {
                attabal attabalVar = (attabal) obj;
                if (this.f14048saneness == attabalVar.f14048saneness && this.f14047attabal.equals(attabalVar.f14047attabal)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f14047attabal.hashCode() * 31) + (this.f14048saneness ? 1 : 0);
        }

        public boolean saneness() {
            return this.f14048saneness;
        }
    }

    public void attabal(Uri uri, boolean z) {
        this.f14046attabal.add(new attabal(uri, z));
    }

    public int dern() {
        return this.f14046attabal.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dern.class != obj.getClass()) {
            return false;
        }
        return this.f14046attabal.equals(((dern) obj).f14046attabal);
    }

    public int hashCode() {
        return this.f14046attabal.hashCode();
    }

    public Set<attabal> saneness() {
        return this.f14046attabal;
    }
}
