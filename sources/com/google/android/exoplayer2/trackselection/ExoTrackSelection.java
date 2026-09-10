package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public interface ExoTrackSelection extends TrackSelection {

    public static final class Definition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrackGroup f18686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f18687b;

        public Definition(int i2, TrackGroup trackGroup, int[] iArr) {
            if (iArr.length == 0) {
                Log.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f18686a = trackGroup;
            this.f18687b = iArr;
        }
    }

    public interface Factory {
    }

    default void a() {
    }

    default void b(boolean z2) {
    }

    default void c() {
    }

    void disable();

    void enable();

    Format getSelectedFormat();

    int getSelectedIndex();

    void onPlaybackSpeed(float f);
}
