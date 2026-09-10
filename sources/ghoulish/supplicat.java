package ghoulish;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: compiled from: TsDurationReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class supplicat {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f27072attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f27073beachfront;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f27077marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f27080wireman;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final decarock.kattegat f27078saneness = new decarock.kattegat(0);

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public long f27074competently = C.TIME_UNSET;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public long f27076impromptu = C.TIME_UNSET;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public long f27079taiyuan = C.TIME_UNSET;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final decarock.stratoscope f27075dern = new decarock.stratoscope();

    public supplicat(int i) {
        this.f27072attabal = i;
    }

    public final int attabal(cybernatic.monoploid monoploidVar) {
        this.f27075dern.hydrovane(decarock.grimness.f25081beachfront);
        this.f27080wireman = true;
        monoploidVar.resetPeekPosition();
        return 0;
    }

    public final int beachfront(cybernatic.monoploid monoploidVar, cybernatic.restrictive restrictiveVar, int i) throws IOException {
        int iMin = (int) Math.min(this.f27072attabal, monoploidVar.getLength());
        long j = 0;
        if (monoploidVar.getPosition() != j) {
            restrictiveVar.f24743attabal = j;
            return 1;
        }
        this.f27075dern.starveling(iMin);
        monoploidVar.resetPeekPosition();
        monoploidVar.peekFully(this.f27075dern.marial(), 0, iMin);
        this.f27074competently = competently(this.f27075dern, i);
        this.f27077marial = true;
        return 0;
    }

    public final long competently(decarock.stratoscope stratoscopeVar, int i) {
        int iCompetently = stratoscopeVar.competently();
        for (int iBeachfront = stratoscopeVar.beachfront(); iBeachfront < iCompetently; iBeachfront++) {
            if (stratoscopeVar.marial()[iBeachfront] == 71) {
                long jDern = seminary.dern(stratoscopeVar, iBeachfront, i);
                if (jDern != C.TIME_UNSET) {
                    return jDern;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public decarock.kattegat dern() {
        return this.f27078saneness;
    }

    public final int impromptu(cybernatic.monoploid monoploidVar, cybernatic.restrictive restrictiveVar, int i) throws IOException {
        long length = monoploidVar.getLength();
        int iMin = (int) Math.min(this.f27072attabal, length);
        long j = length - ((long) iMin);
        if (monoploidVar.getPosition() != j) {
            restrictiveVar.f24743attabal = j;
            return 1;
        }
        this.f27075dern.starveling(iMin);
        monoploidVar.resetPeekPosition();
        monoploidVar.peekFully(this.f27075dern.marial(), 0, iMin);
        this.f27076impromptu = taiyuan(this.f27075dern, i);
        this.f27073beachfront = true;
        return 0;
    }

    public int marial(cybernatic.monoploid monoploidVar, cybernatic.restrictive restrictiveVar, int i) throws IOException {
        if (i <= 0) {
            return attabal(monoploidVar);
        }
        if (!this.f27073beachfront) {
            return impromptu(monoploidVar, restrictiveVar, i);
        }
        if (this.f27076impromptu == C.TIME_UNSET) {
            return attabal(monoploidVar);
        }
        if (!this.f27077marial) {
            return beachfront(monoploidVar, restrictiveVar, i);
        }
        long j = this.f27074competently;
        if (j == C.TIME_UNSET) {
            return attabal(monoploidVar);
        }
        this.f27079taiyuan = this.f27078saneness.dern(this.f27076impromptu) - this.f27078saneness.saneness(j);
        return attabal(monoploidVar);
    }

    public long saneness() {
        return this.f27079taiyuan;
    }

    public final long taiyuan(decarock.stratoscope stratoscopeVar, int i) {
        int iBeachfront = stratoscopeVar.beachfront();
        int iCompetently = stratoscopeVar.competently();
        for (int i2 = iCompetently - 188; i2 >= iBeachfront; i2--) {
            if (seminary.saneness(stratoscopeVar.marial(), iBeachfront, iCompetently, i2)) {
                long jDern = seminary.dern(stratoscopeVar, i2, i);
                if (jDern != C.TIME_UNSET) {
                    return jDern;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public boolean wireman() {
        return this.f27080wireman;
    }
}
