package com.google.android.exoplayer2.trackselection;

/* JADX INFO: loaded from: classes3.dex */
public final class RandomTrackSelection extends BaseTrackSelection {

    public static final class Factory implements ExoTrackSelection.Factory {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final int getSelectedIndex() {
        return 0;
    }
}
