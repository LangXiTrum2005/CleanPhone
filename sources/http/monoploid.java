package http;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: WebViewStartUpConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class monoploid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Executor f28010attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Set<String> f28011dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final boolean f28012saneness;

    /* JADX INFO: compiled from: WebViewStartUpConfig.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Executor f28013attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public boolean f28015saneness = true;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public Set<String> f28014dern = null;

        public saneness(Executor executor) {
            this.f28013attabal = executor;
        }

        public monoploid attabal() {
            return new monoploid(this.f28013attabal, this.f28015saneness, this.f28014dern);
        }

        public saneness dern(boolean z) {
            if (this.f28014dern != null && !z) {
                throw new IllegalArgumentException("Can't specify profiles to load without running UI thread startup tasks");
            }
            this.f28015saneness = z;
            return this;
        }

        public saneness saneness(Set<String> set) {
            if (!this.f28015saneness) {
                throw new IllegalArgumentException("Can't specify profiles to load without running UI thread startup tasks");
            }
            this.f28014dern = new HashSet(set);
            return this;
        }
    }

    public Executor attabal() {
        return this.f28010attabal;
    }

    public boolean dern() {
        return this.f28012saneness;
    }

    public Set<String> saneness() {
        return this.f28011dern;
    }

    public monoploid(Executor executor, boolean z, Set<String> set) {
        this.f28010attabal = executor;
        this.f28012saneness = z;
        this.f28011dern = set;
    }
}
