package ghoulish;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: TsBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class kattegat extends cybernatic.marial {

    /* JADX INFO: compiled from: TsBinarySearchSeeker.java */
    public static final class attabal implements cybernatic.marial.beachfront {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final decarock.kattegat f26920attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f26921dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final decarock.stratoscope f26922saneness = new decarock.stratoscope();

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f26923wireman;

        public attabal(int i, decarock.kattegat kattegatVar, int i2) {
            this.f26921dern = i;
            this.f26920attabal = kattegatVar;
            this.f26923wireman = i2;
        }

        @Override // cybernatic.marial.beachfront
        public cybernatic.marial.C0582marial attabal(cybernatic.monoploid monoploidVar, long j) throws IOException {
            long position = monoploidVar.getPosition();
            int iMin = (int) Math.min(this.f26923wireman, monoploidVar.getLength() - position);
            this.f26922saneness.starveling(iMin);
            monoploidVar.peekFully(this.f26922saneness.marial(), 0, iMin);
            return dern(this.f26922saneness, j, position);
        }

        public final cybernatic.marial.C0582marial dern(decarock.stratoscope stratoscopeVar, long j, long j2) {
            int iAttabal;
            int iAttabal2;
            int iCompetently = stratoscopeVar.competently();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (stratoscopeVar.attabal() >= 188 && (iAttabal2 = (iAttabal = seminary.attabal(stratoscopeVar.marial(), stratoscopeVar.beachfront(), iCompetently)) + Opcodes.NEWARRAY) <= iCompetently) {
                long jDern = seminary.dern(stratoscopeVar, iAttabal, this.f26921dern);
                if (jDern != C.TIME_UNSET) {
                    long jSaneness = this.f26920attabal.saneness(jDern);
                    if (jSaneness > j) {
                        return j5 == C.TIME_UNSET ? cybernatic.marial.C0582marial.wireman(jSaneness, j2) : cybernatic.marial.C0582marial.marial(j2 + j4);
                    }
                    if (100000 + jSaneness > j) {
                        return cybernatic.marial.C0582marial.marial(j2 + ((long) iAttabal));
                    }
                    j4 = iAttabal;
                    j5 = jSaneness;
                }
                stratoscopeVar.mathsort(iAttabal2);
                j3 = iAttabal2;
            }
            return j5 != C.TIME_UNSET ? cybernatic.marial.C0582marial.beachfront(j5, j2 + j3) : cybernatic.marial.C0582marial.f24712wireman;
        }

        @Override // cybernatic.marial.beachfront
        public void saneness() {
            this.f26922saneness.hydrovane(decarock.grimness.f25081beachfront);
        }
    }

    public kattegat(decarock.kattegat kattegatVar, long j, long j2, int i, int i2) {
        super(new cybernatic.marial.saneness(), new attabal(i, kattegatVar, i2), j, 0L, j + 1, 0L, j2, 188L, 940);
    }
}
