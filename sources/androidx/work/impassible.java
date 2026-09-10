package androidx.work;

/* JADX INFO: compiled from: Operation.java */
/* JADX INFO: loaded from: classes.dex */
public interface impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final saneness.dern f14050attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final saneness.C0110saneness f14051saneness;

    /* JADX INFO: compiled from: Operation.java */
    public static abstract class saneness {

        /* JADX INFO: compiled from: Operation.java */
        public static final class attabal extends saneness {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final Throwable f14052attabal;

            public attabal(Throwable th) {
                this.f14052attabal = th;
            }

            public Throwable attabal() {
                return this.f14052attabal;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f14052attabal.getMessage());
            }
        }

        /* JADX INFO: compiled from: Operation.java */
        public static final class dern extends saneness {
            public String toString() {
                return "SUCCESS";
            }

            public dern() {
            }
        }

        /* JADX INFO: renamed from: androidx.work.impassible$saneness$saneness, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Operation.java */
        public static final class C0110saneness extends saneness {
            public String toString() {
                return "IN_PROGRESS";
            }

            public C0110saneness() {
            }
        }
    }

    static {
        f14050attabal = new saneness.dern();
        f14051saneness = new saneness.C0110saneness();
    }
}
