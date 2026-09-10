package naming;

/* JADX INFO: compiled from: StateVerifier.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class dern {

    /* JADX INFO: compiled from: StateVerifier.java */
    public static class saneness extends dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public volatile boolean f33671attabal;

        public saneness() {
            super();
        }

        @Override // naming.dern
        public void dern() {
            if (this.f33671attabal) {
                throw new IllegalStateException("Already released");
            }
        }

        @Override // naming.dern
        public void saneness(boolean z) {
            this.f33671attabal = z;
        }
    }

    public static dern attabal() {
        return new saneness();
    }

    public abstract void dern();

    public abstract void saneness(boolean z);

    public dern() {
    }
}
