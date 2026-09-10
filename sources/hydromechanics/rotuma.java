package hydromechanics;

import androidx.media3.common.yemenite;

/* JADX INFO: compiled from: ExoTrackSelection.java */
/* JADX INFO: loaded from: classes.dex */
public interface rotuma extends cuirassed {

    /* JADX INFO: compiled from: ExoTrackSelection.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final yemenite f28184attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f28185dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int[] f28186saneness;

        public attabal(yemenite yemeniteVar, int... iArr) {
            this(yemeniteVar, iArr, 0);
        }

        public attabal(yemenite yemeniteVar, int[] iArr, int i) {
            if (iArr.length == 0) {
                decarock.triweekly.wireman("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f28184attabal = yemeniteVar;
            this.f28186saneness = iArr;
            this.f28185dern = i;
        }
    }

    /* JADX INFO: compiled from: ExoTrackSelection.java */
    public interface saneness {
        rotuma[] attabal(attabal[] attabalVarArr, polyfoil.wireman wiremanVar, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, androidx.media3.common.oilcan oilcanVar);
    }

    void disable();

    void enable();

    androidx.media3.common.polloi getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    @Override // hydromechanics.cuirassed
    /* synthetic */ int length();

    void onPlaybackSpeed(float f);

    default void attabal() {
    }

    default void dern() {
    }

    default void saneness(boolean z) {
    }
}
