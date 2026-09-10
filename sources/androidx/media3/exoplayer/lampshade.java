package androidx.media3.exoplayer;

/* JADX INFO: compiled from: RendererCapabilities.java */
/* JADX INFO: loaded from: classes.dex */
public interface lampshade {

    /* JADX INFO: compiled from: RendererCapabilities.java */
    public interface attabal {
        void attabal(homozygous homozygousVar);
    }

    static int adultoid(int i) {
        return i & 64;
    }

    static int apical(int i) {
        return i & 24;
    }

    static boolean beachfront(int i, boolean z) {
        int iCuirassed = cuirassed(i);
        if (iCuirassed != 4) {
            return z && iCuirassed == 3;
        }
        return true;
    }

    static int competently(int i, int i2, int i3, int i4, int i5) {
        return polloi(i, i2, i3, i4, i5, 0);
    }

    static int cuirassed(int i) {
        return i & 7;
    }

    static int cutely(int i) {
        return i & 32;
    }

    static int formularize(int i) {
        return taiyuan(i, 0, 0, 0);
    }

    static int kowloon(int i) {
        return i & 3584;
    }

    static int marial(int i) {
        return i & 384;
    }

    static int polloi(int i, int i2, int i3, int i4, int i5, int i6) {
        return i | i2 | i3 | i4 | i5 | i6;
    }

    static int taiyuan(int i, int i2, int i3, int i4) {
        return polloi(i, i2, i3, 0, 128, i4);
    }

    int attabal(androidx.media3.common.polloi polloiVar) throws ExoPlaybackException;

    String getName();

    int getTrackType();

    int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException;

    default void wireman() {
    }

    default void dovishness(attabal attabalVar) {
    }
}
