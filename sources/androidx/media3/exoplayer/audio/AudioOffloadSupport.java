package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final class AudioOffloadSupport {
    public static final AudioOffloadSupport d = new Builder().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6076c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f6078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f6079c;

        public final AudioOffloadSupport a() {
            if (this.f6077a || !(this.f6078b || this.f6079c)) {
                return new AudioOffloadSupport(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
    }

    public AudioOffloadSupport(Builder builder) {
        this.f6074a = builder.f6077a;
        this.f6075b = builder.f6078b;
        this.f6076c = builder.f6079c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AudioOffloadSupport.class != obj.getClass()) {
            return false;
        }
        AudioOffloadSupport audioOffloadSupport = (AudioOffloadSupport) obj;
        return this.f6074a == audioOffloadSupport.f6074a && this.f6075b == audioOffloadSupport.f6075b && this.f6076c == audioOffloadSupport.f6076c;
    }

    public final int hashCode() {
        return ((this.f6074a ? 1 : 0) << 2) + ((this.f6075b ? 1 : 0) << 1) + (this.f6076c ? 1 : 0);
    }
}
