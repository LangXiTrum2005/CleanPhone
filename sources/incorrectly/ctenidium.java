package incorrectly;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* JADX INFO: compiled from: PlayerId.java */
/* JADX INFO: loaded from: classes.dex */
public final class ctenidium {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final ctenidium f28640dern;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal f28641attabal;
    public final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Object f28642saneness;

    /* JADX INFO: compiled from: PlayerId.java */
    public static final class attabal {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final attabal f28643saneness = new attabal(LogSessionId.LOG_SESSION_ID_NONE);

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final LogSessionId f28644attabal;

        public attabal(LogSessionId logSessionId) {
            this.f28644attabal = logSessionId;
        }
    }

    static {
        f28640dern = decarock.grimness.f25080attabal < 31 ? new ctenidium("") : new ctenidium(attabal.f28643saneness, "");
    }

    public ctenidium(String str) {
        decarock.attabal.competently(decarock.grimness.f25080attabal < 31);
        this.name = str;
        this.f28641attabal = null;
        this.f28642saneness = new Object();
    }

    public LogSessionId attabal() {
        return ((attabal) decarock.attabal.marial(this.f28641attabal)).f28644attabal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctenidium)) {
            return false;
        }
        ctenidium ctenidiumVar = (ctenidium) obj;
        return Objects.equals(this.name, ctenidiumVar.name) && Objects.equals(this.f28641attabal, ctenidiumVar.f28641attabal) && Objects.equals(this.f28642saneness, ctenidiumVar.f28642saneness);
    }

    public int hashCode() {
        return Objects.hash(this.name, this.f28641attabal, this.f28642saneness);
    }

    public ctenidium(LogSessionId logSessionId, String str) {
        this(new attabal(logSessionId), str);
    }

    public ctenidium(attabal attabalVar, String str) {
        this.f28641attabal = attabalVar;
        this.name = str;
        this.f28642saneness = new Object();
    }
}
