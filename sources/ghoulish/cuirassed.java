package ghoulish;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: compiled from: PsDurationReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class cuirassed {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f26854dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f26856marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f26858wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final decarock.kattegat f26851attabal = new decarock.kattegat(0);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public long f26852beachfront = C.TIME_UNSET;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public long f26853competently = C.TIME_UNSET;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public long f26855impromptu = C.TIME_UNSET;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final decarock.stratoscope f26857saneness = new decarock.stratoscope();

    public static boolean attabal(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public static long formularize(decarock.stratoscope stratoscopeVar) {
        int iBeachfront = stratoscopeVar.beachfront();
        if (stratoscopeVar.attabal() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        stratoscopeVar.formularize(bArr, 0, 9);
        stratoscopeVar.mathsort(iBeachfront);
        return !attabal(bArr) ? C.TIME_UNSET : impassible(bArr);
    }

    public static long impassible(byte[] bArr) {
        byte b = bArr[0];
        long j = (((((long) b) & 56) >> 3) << 30) | ((((long) b) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b2 = bArr[2];
        return j | (((((long) b2) & 248) >> 3) << 15) | ((((long) b2) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public final long apical(decarock.stratoscope stratoscopeVar) {
        int iBeachfront = stratoscopeVar.beachfront();
        for (int iCompetently = stratoscopeVar.competently() - 4; iCompetently >= iBeachfront; iCompetently--) {
            if (beachfront(stratoscopeVar.marial(), iCompetently) == 442) {
                stratoscopeVar.mathsort(iCompetently + 4);
                long jFormularize = formularize(stratoscopeVar);
                if (jFormularize != C.TIME_UNSET) {
                    return jFormularize;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public final int beachfront(byte[] bArr, int i) {
        return (bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public int competently(cybernatic.monoploid monoploidVar, cybernatic.restrictive restrictiveVar) throws IOException {
        if (!this.f26856marial) {
            return cutely(monoploidVar, restrictiveVar);
        }
        if (this.f26853competently == C.TIME_UNSET) {
            return saneness(monoploidVar);
        }
        if (!this.f26858wireman) {
            return impromptu(monoploidVar, restrictiveVar);
        }
        long j = this.f26852beachfront;
        if (j == C.TIME_UNSET) {
            return saneness(monoploidVar);
        }
        this.f26855impromptu = this.f26851attabal.dern(this.f26853competently) - this.f26851attabal.saneness(j);
        return saneness(monoploidVar);
    }

    public final int cutely(cybernatic.monoploid monoploidVar, cybernatic.restrictive restrictiveVar) throws IOException {
        long length = monoploidVar.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j = length - ((long) iMin);
        if (monoploidVar.getPosition() != j) {
            restrictiveVar.f24743attabal = j;
            return 1;
        }
        this.f26857saneness.starveling(iMin);
        monoploidVar.resetPeekPosition();
        monoploidVar.peekFully(this.f26857saneness.marial(), 0, iMin);
        this.f26853competently = apical(this.f26857saneness);
        this.f26856marial = true;
        return 0;
    }

    public long dern() {
        return this.f26855impromptu;
    }

    public final int impromptu(cybernatic.monoploid monoploidVar, cybernatic.restrictive restrictiveVar) throws IOException {
        int iMin = (int) Math.min(20000L, monoploidVar.getLength());
        long j = 0;
        if (monoploidVar.getPosition() != j) {
            restrictiveVar.f24743attabal = j;
            return 1;
        }
        this.f26857saneness.starveling(iMin);
        monoploidVar.resetPeekPosition();
        monoploidVar.peekFully(this.f26857saneness.marial(), 0, iMin);
        this.f26852beachfront = taiyuan(this.f26857saneness);
        this.f26858wireman = true;
        return 0;
    }

    public boolean marial() {
        return this.f26854dern;
    }

    public final int saneness(cybernatic.monoploid monoploidVar) {
        this.f26857saneness.hydrovane(decarock.grimness.f25081beachfront);
        this.f26854dern = true;
        monoploidVar.resetPeekPosition();
        return 0;
    }

    public final long taiyuan(decarock.stratoscope stratoscopeVar) {
        int iCompetently = stratoscopeVar.competently();
        for (int iBeachfront = stratoscopeVar.beachfront(); iBeachfront < iCompetently - 3; iBeachfront++) {
            if (beachfront(stratoscopeVar.marial(), iBeachfront) == 442) {
                stratoscopeVar.mathsort(iBeachfront + 4);
                long jFormularize = formularize(stratoscopeVar);
                if (jFormularize != C.TIME_UNSET) {
                    return jFormularize;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public decarock.kattegat wireman() {
        return this.f26851attabal;
    }
}
