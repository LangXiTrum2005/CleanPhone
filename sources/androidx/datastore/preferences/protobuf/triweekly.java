package androidx.datastore.preferences.protobuf;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionRegistryLite.java */
/* JADX INFO: loaded from: classes.dex */
public class triweekly {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final triweekly f9892dern = new triweekly(true);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static volatile triweekly f9893saneness;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<attabal, GeneratedMessageLite.marial<?, ?>> f9894attabal;

    /* JADX INFO: compiled from: ExtensionRegistryLite.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Object f9895attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f9896saneness;

        public attabal(Object obj, int i) {
            this.f9895attabal = obj;
            this.f9896saneness = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof attabal)) {
                return false;
            }
            attabal attabalVar = (attabal) obj;
            return this.f9895attabal == attabalVar.f9895attabal && this.f9896saneness == attabalVar.f9896saneness;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f9895attabal) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f9896saneness;
        }
    }

    public triweekly() {
        this.f9894attabal = new HashMap();
    }

    public static triweekly saneness() {
        triweekly triweeklyVarAttabal;
        if (clubfoot.f9694wireman) {
            return f9892dern;
        }
        triweekly triweeklyVar = f9893saneness;
        if (triweeklyVar != null) {
            return triweeklyVar;
        }
        synchronized (triweekly.class) {
            try {
                triweeklyVarAttabal = f9893saneness;
                if (triweeklyVarAttabal == null) {
                    triweeklyVarAttabal = impassible.attabal();
                    f9893saneness = triweeklyVarAttabal;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return triweeklyVarAttabal;
    }

    public <ContainingType extends saran> GeneratedMessageLite.marial<ContainingType, ?> attabal(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.marial) this.f9894attabal.get(new attabal(containingtype, i));
    }

    public triweekly(boolean z) {
        this.f9894attabal = Collections.EMPTY_MAP;
    }
}
