package p002kotlin.reflect.jvm.internal.impl.protobuf;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionRegistryLite.java */
/* JADX INFO: loaded from: classes5.dex */
public class beachfront {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final beachfront f31103saneness = new beachfront(true);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<attabal, GeneratedMessageLite.marial<?, ?>> f31104attabal;

    /* JADX INFO: compiled from: ExtensionRegistryLite.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Object f31105attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f31106saneness;

        public attabal(Object obj, int i) {
            this.f31105attabal = obj;
            this.f31106saneness = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof attabal)) {
                return false;
            }
            attabal attabalVar = (attabal) obj;
            return this.f31105attabal == attabalVar.f31105attabal && this.f31106saneness == attabalVar.f31106saneness;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f31105attabal) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f31106saneness;
        }
    }

    public beachfront() {
        this.f31104attabal = new HashMap();
    }

    public static beachfront dern() {
        return f31103saneness;
    }

    public static beachfront wireman() {
        return new beachfront();
    }

    public final void attabal(GeneratedMessageLite.marial<?, ?> marialVar) {
        this.f31104attabal.put(new attabal(marialVar.saneness(), marialVar.wireman()), marialVar);
    }

    public <ContainingType extends triweekly> GeneratedMessageLite.marial<ContainingType, ?> saneness(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.marial) this.f31104attabal.get(new attabal(containingtype, i));
    }

    public beachfront(boolean z) {
        this.f31104attabal = Collections.EMPTY_MAP;
    }
}
