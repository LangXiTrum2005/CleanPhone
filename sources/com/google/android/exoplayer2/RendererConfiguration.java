package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes3.dex */
public final class RendererConfiguration {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final RendererConfiguration f17196b = new RendererConfiguration(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17197a;

    public RendererConfiguration(boolean z2) {
        this.f17197a = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && RendererConfiguration.class == obj.getClass() && this.f17197a == ((RendererConfiguration) obj).f17197a;
    }

    public final int hashCode() {
        return !this.f17197a ? 1 : 0;
    }
}
