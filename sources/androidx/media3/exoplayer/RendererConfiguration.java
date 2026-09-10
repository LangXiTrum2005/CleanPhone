package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class RendererConfiguration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final RendererConfiguration f5981c = new RendererConfiguration(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5983b;

    public RendererConfiguration(int i2, boolean z2) {
        this.f5982a = i2;
        this.f5983b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RendererConfiguration.class != obj.getClass()) {
            return false;
        }
        RendererConfiguration rendererConfiguration = (RendererConfiguration) obj;
        return this.f5982a == rendererConfiguration.f5982a && this.f5983b == rendererConfiguration.f5983b;
    }

    public final int hashCode() {
        return (this.f5982a << 1) + (this.f5983b ? 1 : 0);
    }
}
