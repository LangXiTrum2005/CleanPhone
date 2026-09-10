package likeable;

import decarock.grimness;
import decarock.stratoscope;
import decarock.triweekly;

/* JADX INFO: compiled from: AviStreamHeaderChunk.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman implements attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f33046attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final int f33047beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f33048dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f33049marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f33050saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f33051wireman;

    public wireman(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f33046attabal = i;
        this.f33050saneness = i2;
        this.f33048dern = i3;
        this.f33051wireman = i4;
        this.f33049marial = i5;
        this.f33047beachfront = i6;
    }

    public static wireman dern(stratoscope stratoscopeVar) {
        int iAdultoid = stratoscopeVar.adultoid();
        stratoscopeVar.splinterproof(12);
        int iAdultoid2 = stratoscopeVar.adultoid();
        int iAdultoid3 = stratoscopeVar.adultoid();
        int iAdultoid4 = stratoscopeVar.adultoid();
        stratoscopeVar.splinterproof(4);
        int iAdultoid5 = stratoscopeVar.adultoid();
        int iAdultoid6 = stratoscopeVar.adultoid();
        stratoscopeVar.splinterproof(8);
        return new wireman(iAdultoid, iAdultoid2, iAdultoid3, iAdultoid4, iAdultoid5, iAdultoid6);
    }

    public long attabal() {
        return grimness.deadwork(this.f33049marial, ((long) this.f33048dern) * 1000000, this.f33051wireman);
    }

    @Override // likeable.attabal
    public int getType() {
        return 1752331379;
    }

    public int saneness() {
        int i = this.f33046attabal;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        triweekly.impromptu("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f33046attabal));
        return -1;
    }
}
