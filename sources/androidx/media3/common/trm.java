package androidx.media3.common;

import android.view.Surface;

/* JADX INFO: compiled from: SurfaceInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class trm {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Surface f11304attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f11305dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f11306saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f11307wireman;

    public trm(Surface surface, int i, int i2) {
        this(surface, i, i2, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trm)) {
            return false;
        }
        trm trmVar = (trm) obj;
        return this.f11306saneness == trmVar.f11306saneness && this.f11305dern == trmVar.f11305dern && this.f11307wireman == trmVar.f11307wireman && this.f11304attabal.equals(trmVar.f11304attabal);
    }

    public int hashCode() {
        return (((((this.f11304attabal.hashCode() * 31) + this.f11306saneness) * 31) + this.f11305dern) * 31) + this.f11307wireman;
    }

    public trm(Surface surface, int i, int i2, int i3) {
        decarock.attabal.saneness(i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f11304attabal = surface;
        this.f11306saneness = i;
        this.f11305dern = i2;
        this.f11307wireman = i3;
    }
}
