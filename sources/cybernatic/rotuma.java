package cybernatic;

/* JADX INFO: compiled from: FlacSeekTableSeekMap.java */
/* JADX INFO: loaded from: classes.dex */
public final class rotuma implements merc {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final preprohormone f24744attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f24745saneness;

    public rotuma(preprohormone preprohormoneVar, long j) {
        this.f24744attabal = preprohormoneVar;
        this.f24745saneness = j;
    }

    public final polder attabal(long j, long j2) {
        return new polder((j * 1000000) / ((long) this.f24744attabal.f24733marial), this.f24745saneness + j2);
    }

    @Override // cybernatic.merc
    public long getDurationUs() {
        return this.f24744attabal.beachfront();
    }

    @Override // cybernatic.merc
    public merc.attabal getSeekPoints(long j) {
        decarock.attabal.taiyuan(this.f24744attabal.f24725apical);
        preprohormone preprohormoneVar = this.f24744attabal;
        preprohormone.attabal attabalVar = preprohormoneVar.f24725apical;
        long[] jArr = attabalVar.f24737attabal;
        long[] jArr2 = attabalVar.f24738saneness;
        int iCompetently = decarock.grimness.competently(jArr, preprohormoneVar.taiyuan(j), true, false);
        polder polderVarAttabal = attabal(iCompetently == -1 ? 0L : jArr[iCompetently], iCompetently != -1 ? jArr2[iCompetently] : 0L);
        if (polderVarAttabal.f24722attabal == j || iCompetently == jArr.length - 1) {
            return new merc.attabal(polderVarAttabal);
        }
        int i = iCompetently + 1;
        return new merc.attabal(polderVarAttabal, attabal(jArr[i], jArr2[i]));
    }

    @Override // cybernatic.merc
    public boolean isSeekable() {
        return true;
    }
}
