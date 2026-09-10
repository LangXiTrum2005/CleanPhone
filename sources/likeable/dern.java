package likeable;

import decarock.stratoscope;

/* JADX INFO: compiled from: AviMainHeaderChunk.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern implements attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f33009attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f33010dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f33011saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f33012wireman;

    public dern(int i, int i2, int i3, int i4) {
        this.f33009attabal = i;
        this.f33011saneness = i2;
        this.f33010dern = i3;
        this.f33012wireman = i4;
    }

    public static dern saneness(stratoscope stratoscopeVar) {
        int iAdultoid = stratoscopeVar.adultoid();
        stratoscopeVar.splinterproof(8);
        int iAdultoid2 = stratoscopeVar.adultoid();
        int iAdultoid3 = stratoscopeVar.adultoid();
        stratoscopeVar.splinterproof(4);
        int iAdultoid4 = stratoscopeVar.adultoid();
        stratoscopeVar.splinterproof(12);
        return new dern(iAdultoid, iAdultoid2, iAdultoid3, iAdultoid4);
    }

    public boolean attabal() {
        return (this.f33011saneness & 16) == 16;
    }

    @Override // likeable.attabal
    public int getType() {
        return 1751742049;
    }
}
