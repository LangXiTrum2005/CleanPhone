package androidx.media3.common;

import com.google.common.collect.ImmutableList;
import decarock.grimness;

/* JADX INFO: compiled from: TrackSelectionOverride.java */
/* JADX INFO: loaded from: classes.dex */
public final class sealless {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final String f11288dern = grimness.igbo(0);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final String f11289wireman = grimness.igbo(1);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final yemenite f11290attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ImmutableList<Integer> f11291saneness;

    public int attabal() {
        return this.f11290attabal.f11333dern;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sealless.class == obj.getClass()) {
            sealless seallessVar = (sealless) obj;
            if (this.f11290attabal.equals(seallessVar.f11290attabal) && this.f11291saneness.equals(seallessVar.f11291saneness)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f11290attabal.hashCode() + (this.f11291saneness.hashCode() * 31);
    }
}
