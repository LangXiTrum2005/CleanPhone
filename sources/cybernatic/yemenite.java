package cybernatic;

/* JADX INFO: compiled from: IndexSeekMap.java */
/* JADX INFO: loaded from: classes.dex */
public final class yemenite implements merc {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long[] f24821attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long f24822dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long[] f24823saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final boolean f24824wireman;

    public yemenite(long[] jArr, long[] jArr2, long j) {
        decarock.attabal.attabal(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f24824wireman = z;
        if (!z || jArr2[0] <= 0) {
            this.f24821attabal = jArr;
            this.f24823saneness = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f24821attabal = jArr3;
            long[] jArr4 = new long[i];
            this.f24823saneness = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f24822dern = j;
    }

    @Override // cybernatic.merc
    public long getDurationUs() {
        return this.f24822dern;
    }

    @Override // cybernatic.merc
    public merc.attabal getSeekPoints(long j) {
        if (!this.f24824wireman) {
            return new merc.attabal(polder.f24721dern);
        }
        int iCompetently = decarock.grimness.competently(this.f24823saneness, j, true, true);
        polder polderVar = new polder(this.f24823saneness[iCompetently], this.f24821attabal[iCompetently]);
        if (polderVar.f24722attabal == j || iCompetently == this.f24823saneness.length - 1) {
            return new merc.attabal(polderVar);
        }
        int i = iCompetently + 1;
        return new merc.attabal(polderVar, new polder(this.f24823saneness[i], this.f24821attabal[i]));
    }

    @Override // cybernatic.merc
    public boolean isSeekable() {
        return this.f24824wireman;
    }
}
