package strother;

import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;

/* JADX INFO: compiled from: SubtitleParser.java */
/* JADX INFO: loaded from: classes.dex */
public interface polloi {

    /* JADX INFO: compiled from: SubtitleParser.java */
    public interface attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f38202attabal = new C0801attabal();

        /* JADX INFO: renamed from: strother.polloi$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SubtitleParser.java */
        public class C0801attabal implements attabal {
            @Override // strother.polloi.attabal
            public boolean attabal(androidx.media3.common.polloi polloiVar) {
                return false;
            }

            @Override // strother.polloi.attabal
            public polloi dern(androidx.media3.common.polloi polloiVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            @Override // strother.polloi.attabal
            public int saneness(androidx.media3.common.polloi polloiVar) {
                return 1;
            }
        }

        boolean attabal(androidx.media3.common.polloi polloiVar);

        polloi dern(androidx.media3.common.polloi polloiVar);

        int saneness(androidx.media3.common.polloi polloiVar);
    }

    /* JADX INFO: compiled from: SubtitleParser.java */
    public static class saneness {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final saneness f38203dern = new saneness(C.TIME_UNSET, false);

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final long f38204attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final boolean f38205saneness;

        public saneness(long j, boolean z) {
            this.f38204attabal = j;
            this.f38205saneness = z;
        }

        public static saneness dern(long j) {
            return new saneness(j, true);
        }

        public static saneness saneness() {
            return f38203dern;
        }
    }

    default apical attabal(byte[] bArr, int i, int i2) {
        final ImmutableList.attabal attabalVarBuilder = ImmutableList.builder();
        saneness sanenessVar = saneness.f38203dern;
        Objects.requireNonNull(attabalVarBuilder);
        saneness(bArr, i, i2, sanenessVar, new decarock.impromptu() { // from class: strother.monoploid
            @Override // decarock.impromptu
            public final void accept(Object obj) {
                attabalVarBuilder.attabal((marial) obj);
            }
        });
        return new competently(attabalVarBuilder.impassible());
    }

    int dern();

    void saneness(byte[] bArr, int i, int i2, saneness sanenessVar, decarock.impromptu<marial> impromptuVar);

    default void reset() {
    }
}
