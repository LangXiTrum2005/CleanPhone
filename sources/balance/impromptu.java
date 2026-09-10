package balance;

import cybernatic.merc;
import cybernatic.polder;
import cybernatic.sealless;
import decarock.grimness;
import decarock.stratoscope;
import decarock.triweekly;

/* JADX INFO: compiled from: VbriSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class impromptu implements competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long[] f14890attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long f14891dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f14892marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long[] f14893saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final long f14894wireman;

    public impromptu(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.f14890attabal = jArr;
        this.f14893saneness = jArr2;
        this.f14891dern = j;
        this.f14894wireman = j2;
        this.f14892marial = i;
    }

    public static impromptu attabal(long j, long j2, sealless.attabal attabalVar, stratoscope stratoscopeVar) {
        int iSupplicat;
        stratoscope stratoscopeVar2 = stratoscopeVar;
        stratoscopeVar2.splinterproof(10);
        int iMonoploid = stratoscopeVar2.monoploid();
        impromptu impromptuVar = null;
        if (iMonoploid <= 0) {
            return null;
        }
        int i = attabalVar.f24772wireman;
        long jDeadwork = grimness.deadwork(iMonoploid, ((long) (i >= 32000 ? 1152 : 576)) * 1000000, i);
        int iSaran = stratoscopeVar2.saran();
        int iSaran2 = stratoscopeVar2.saran();
        int iSaran3 = stratoscopeVar2.saran();
        stratoscopeVar2.splinterproof(2);
        long j3 = j2 + ((long) attabalVar.f24769dern);
        long[] jArr = new long[iSaran];
        long[] jArr2 = new long[iSaran];
        int i2 = 0;
        long j4 = j2;
        while (i2 < iSaran) {
            impromptu impromptuVar2 = impromptuVar;
            int i3 = iSaran2;
            long j5 = j3;
            jArr[i2] = (((long) i2) * jDeadwork) / ((long) iSaran);
            jArr2[i2] = Math.max(j4, j5);
            if (iSaran3 == 1) {
                iSupplicat = stratoscopeVar2.supplicat();
            } else if (iSaran3 == 2) {
                iSupplicat = stratoscopeVar2.saran();
            } else if (iSaran3 == 3) {
                iSupplicat = stratoscopeVar2.polder();
            } else {
                if (iSaran3 != 4) {
                    return impromptuVar2;
                }
                iSupplicat = stratoscopeVar2.seminary();
            }
            j4 += ((long) iSupplicat) * ((long) i3);
            i2++;
            stratoscopeVar2 = stratoscopeVar;
            j3 = j5;
            iSaran2 = i3;
            impromptuVar = impromptuVar2;
            iSaran = iSaran;
        }
        if (j != -1 && j != j4) {
            triweekly.impromptu("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new impromptu(jArr, jArr2, jDeadwork, j4, attabalVar.f24767beachfront);
    }

    @Override // balance.competently
    public int competently() {
        return this.f14892marial;
    }

    @Override // balance.competently
    public long dern() {
        return this.f14894wireman;
    }

    @Override // cybernatic.merc
    public long getDurationUs() {
        return this.f14891dern;
    }

    @Override // cybernatic.merc
    public merc.attabal getSeekPoints(long j) {
        int iCompetently = grimness.competently(this.f14890attabal, j, true, true);
        polder polderVar = new polder(this.f14890attabal[iCompetently], this.f14893saneness[iCompetently]);
        if (polderVar.f24722attabal >= j || iCompetently == this.f14890attabal.length - 1) {
            return new merc.attabal(polderVar);
        }
        int i = iCompetently + 1;
        return new merc.attabal(polderVar, new polder(this.f14890attabal[i], this.f14893saneness[i]));
    }

    @Override // balance.competently
    public long getTimeUs(long j) {
        return this.f14890attabal[grimness.competently(this.f14893saneness, j, true, true)];
    }

    @Override // cybernatic.merc
    public boolean isSeekable() {
        return true;
    }
}
