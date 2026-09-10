package nattier;

import decarock.grimness;

/* JADX INFO: compiled from: TrackSampleTable.java */
/* JADX INFO: loaded from: classes.dex */
public final class dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final molybdenite f33707attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final long[] f33708beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final int[] f33709competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long[] f33710dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final long f33711impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f33712marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f33713saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int[] f33714wireman;

    public dovishness(molybdenite molybdeniteVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        decarock.attabal.attabal(iArr.length == jArr2.length);
        decarock.attabal.attabal(jArr.length == jArr2.length);
        decarock.attabal.attabal(iArr2.length == jArr2.length);
        this.f33707attabal = molybdeniteVar;
        this.f33710dern = jArr;
        this.f33714wireman = iArr;
        this.f33712marial = i;
        this.f33708beachfront = jArr2;
        this.f33709competently = iArr2;
        this.f33711impromptu = j;
        this.f33713saneness = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int attabal(long j) {
        for (int iCompetently = grimness.competently(this.f33708beachfront, j, true, false); iCompetently >= 0; iCompetently--) {
            if ((this.f33709competently[iCompetently] & 1) != 0) {
                return iCompetently;
            }
        }
        return -1;
    }

    public int saneness(long j) {
        for (int iWireman = grimness.wireman(this.f33708beachfront, j, true, false); iWireman < this.f33708beachfront.length; iWireman++) {
            if ((this.f33709competently[iWireman] & 1) != 0) {
                return iWireman;
            }
        }
        return -1;
    }
}
