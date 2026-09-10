package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public final class RandomTrackSelection extends BaseTrackSelection {

    public static final class Factory implements ExoTrackSelection.Factory {
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final int getSelectedIndex() {
        return 0;
    }
}
