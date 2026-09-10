package ghoulish;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: compiled from: PsBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class cord extends cybernatic.marial {

    /* JADX INFO: compiled from: PsBinarySearchSeeker.java */
    public static final class saneness implements cybernatic.marial.beachfront {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final decarock.kattegat f26849attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final decarock.stratoscope f26850saneness;

        public static void wireman(decarock.stratoscope stratoscopeVar) {
            int iApical;
            int iCompetently = stratoscopeVar.competently();
            if (stratoscopeVar.attabal() < 10) {
                stratoscopeVar.mathsort(iCompetently);
                return;
            }
            stratoscopeVar.splinterproof(9);
            int iSupplicat = stratoscopeVar.supplicat() & 7;
            if (stratoscopeVar.attabal() < iSupplicat) {
                stratoscopeVar.mathsort(iCompetently);
                return;
            }
            stratoscopeVar.splinterproof(iSupplicat);
            if (stratoscopeVar.attabal() < 4) {
                stratoscopeVar.mathsort(iCompetently);
                return;
            }
            if (cord.apical(stratoscopeVar.marial(), stratoscopeVar.beachfront()) == 443) {
                stratoscopeVar.splinterproof(4);
                int iSaran = stratoscopeVar.saran();
                if (stratoscopeVar.attabal() < iSaran) {
                    stratoscopeVar.mathsort(iCompetently);
                    return;
                }
                stratoscopeVar.splinterproof(iSaran);
            }
            while (stratoscopeVar.attabal() >= 4 && (iApical = cord.apical(stratoscopeVar.marial(), stratoscopeVar.beachfront())) != 442 && iApical != 441 && (iApical >>> 8) == 1) {
                stratoscopeVar.splinterproof(4);
                if (stratoscopeVar.attabal() < 2) {
                    stratoscopeVar.mathsort(iCompetently);
                    return;
                }
                stratoscopeVar.mathsort(Math.min(stratoscopeVar.competently(), stratoscopeVar.beachfront() + stratoscopeVar.saran()));
            }
        }

        @Override // cybernatic.marial.beachfront
        public cybernatic.marial.C0582marial attabal(cybernatic.monoploid monoploidVar, long j) throws IOException {
            long position = monoploidVar.getPosition();
            int iMin = (int) Math.min(20000L, monoploidVar.getLength() - position);
            this.f26850saneness.starveling(iMin);
            monoploidVar.peekFully(this.f26850saneness.marial(), 0, iMin);
            return dern(this.f26850saneness, j, position);
        }

        public final cybernatic.marial.C0582marial dern(decarock.stratoscope stratoscopeVar, long j, long j2) {
            int iBeachfront = -1;
            int iBeachfront2 = -1;
            long j3 = -9223372036854775807L;
            while (stratoscopeVar.attabal() >= 4) {
                if (cord.apical(stratoscopeVar.marial(), stratoscopeVar.beachfront()) != 442) {
                    stratoscopeVar.splinterproof(1);
                } else {
                    stratoscopeVar.splinterproof(4);
                    long jFormularize = cuirassed.formularize(stratoscopeVar);
                    if (jFormularize != C.TIME_UNSET) {
                        long jSaneness = this.f26849attabal.saneness(jFormularize);
                        if (jSaneness > j) {
                            return j3 == C.TIME_UNSET ? cybernatic.marial.C0582marial.wireman(jSaneness, j2) : cybernatic.marial.C0582marial.marial(j2 + ((long) iBeachfront2));
                        }
                        if (100000 + jSaneness > j) {
                            return cybernatic.marial.C0582marial.marial(j2 + ((long) stratoscopeVar.beachfront()));
                        }
                        iBeachfront2 = stratoscopeVar.beachfront();
                        j3 = jSaneness;
                    }
                    wireman(stratoscopeVar);
                    iBeachfront = stratoscopeVar.beachfront();
                }
            }
            return j3 != C.TIME_UNSET ? cybernatic.marial.C0582marial.beachfront(j3, j2 + ((long) iBeachfront)) : cybernatic.marial.C0582marial.f24712wireman;
        }

        @Override // cybernatic.marial.beachfront
        public void saneness() {
            this.f26850saneness.hydrovane(decarock.grimness.f25081beachfront);
        }

        public saneness(decarock.kattegat kattegatVar) {
            this.f26849attabal = kattegatVar;
            this.f26850saneness = new decarock.stratoscope();
        }
    }

    public cord(decarock.kattegat kattegatVar, long j, long j2) {
        super(new cybernatic.marial.saneness(), new saneness(kattegatVar), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    public static int apical(byte[] bArr, int i) {
        return (bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }
}
