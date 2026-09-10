package hobby;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: MonitoringAnnotations.java */
/* JADX INFO: loaded from: classes3.dex */
public final class polloi {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final polloi f27814saneness = saneness().attabal();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<String, String> f27815attabal;

    /* JADX INFO: compiled from: MonitoringAnnotations.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public HashMap<String, String> f27816attabal = new HashMap<>();

        public polloi attabal() {
            if (this.f27816attabal == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            polloi polloiVar = new polloi(Collections.unmodifiableMap(this.f27816attabal));
            this.f27816attabal = null;
            return polloiVar;
        }
    }

    public static saneness saneness() {
        return new saneness();
    }

    public boolean attabal() {
        return this.f27815attabal.isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj instanceof polloi) {
            return this.f27815attabal.equals(((polloi) obj).f27815attabal);
        }
        return false;
    }

    public int hashCode() {
        return this.f27815attabal.hashCode();
    }

    public String toString() {
        return this.f27815attabal.toString();
    }

    public polloi(Map<String, String> map) {
        this.f27815attabal = map;
    }
}
