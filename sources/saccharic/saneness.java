package saccharic;

import cybernatic.dovishness;
import cybernatic.marial;
import cybernatic.monoploid;
import cybernatic.preprohormone;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: FlacBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness extends marial {

    /* JADX INFO: renamed from: saccharic.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FlacBinarySearchSeeker.java */
    public static final class C0792saneness implements marial.beachfront {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final preprohormone f37005attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final dovishness.attabal f37006dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f37007saneness;

        @Override // cybernatic.marial.beachfront
        public marial.C0582marial attabal(monoploid monoploidVar, long j) throws IOException {
            long position = monoploidVar.getPosition();
            long jDern = dern(monoploidVar);
            long peekPosition = monoploidVar.getPeekPosition();
            monoploidVar.advancePeekPosition(Math.max(6, this.f37005attabal.f24730dern));
            long jDern2 = dern(monoploidVar);
            long peekPosition2 = monoploidVar.getPeekPosition();
            if (jDern > j || jDern2 <= j) {
                return jDern2 <= j ? marial.C0582marial.beachfront(jDern2, peekPosition2) : marial.C0582marial.wireman(jDern, position);
            }
            return marial.C0582marial.marial(peekPosition);
        }

        public final long dern(monoploid monoploidVar) throws IOException {
            while (monoploidVar.getPeekPosition() < monoploidVar.getLength() - 6 && !dovishness.impromptu(monoploidVar, this.f37005attabal, this.f37007saneness, this.f37006dern)) {
                monoploidVar.advancePeekPosition(1);
            }
            if (monoploidVar.getPeekPosition() < monoploidVar.getLength() - 6) {
                return this.f37006dern.f24627attabal;
            }
            monoploidVar.advancePeekPosition((int) (monoploidVar.getLength() - monoploidVar.getPeekPosition()));
            return this.f37005attabal.f24729cutely;
        }

        public C0792saneness(preprohormone preprohormoneVar, int i) {
            this.f37005attabal = preprohormoneVar;
            this.f37007saneness = i;
            this.f37006dern = new dovishness.attabal();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public saneness(final preprohormone preprohormoneVar, int i, long j, long j2) {
        super(new marial.wireman() { // from class: saccharic.attabal
            @Override // cybernatic.marial.wireman
            public final long attabal(long j3) {
                return preprohormoneVar.taiyuan(j3);
            }
        }, new C0792saneness(preprohormoneVar, i), preprohormoneVar.beachfront(), 0L, preprohormoneVar.f24729cutely, j, j2, preprohormoneVar.wireman(), Math.max(6, preprohormoneVar.f24730dern));
        Objects.requireNonNull(preprohormoneVar);
    }
}
