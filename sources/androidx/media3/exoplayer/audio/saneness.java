package androidx.media3.exoplayer.audio;

/* JADX INFO: compiled from: AudioOffloadSupport.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final saneness f11712wireman = new C0084saneness().wireman();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final boolean f11713attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final boolean f11714dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final boolean f11715saneness;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.audio.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AudioOffloadSupport.java */
    public static final class C0084saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f11716attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public boolean f11717dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public boolean f11718saneness;

        public C0084saneness beachfront(boolean z) {
            this.f11718saneness = z;
            return this;
        }

        public C0084saneness competently(boolean z) {
            this.f11717dern = z;
            return this;
        }

        public C0084saneness marial(boolean z) {
            this.f11716attabal = z;
            return this;
        }

        public saneness wireman() {
            if (this.f11716attabal || !(this.f11718saneness || this.f11717dern)) {
                return new saneness(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && saneness.class == obj.getClass()) {
            saneness sanenessVar = (saneness) obj;
            if (this.f11713attabal == sanenessVar.f11713attabal && this.f11715saneness == sanenessVar.f11715saneness && this.f11714dern == sanenessVar.f11714dern) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11713attabal ? 1 : 0) << 2) + ((this.f11715saneness ? 1 : 0) << 1) + (this.f11714dern ? 1 : 0);
    }

    public saneness(C0084saneness c0084saneness) {
        this.f11713attabal = c0084saneness.f11716attabal;
        this.f11715saneness = c0084saneness.f11718saneness;
        this.f11714dern = c0084saneness.f11717dern;
    }
}
