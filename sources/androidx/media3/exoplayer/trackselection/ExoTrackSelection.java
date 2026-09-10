package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Log;

/* JADX INFO: loaded from: classes.dex */
public interface ExoTrackSelection extends TrackSelection {

    public static final class Definition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrackGroup f6530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f6531b;

        public Definition(TrackGroup trackGroup, int[] iArr) {
            if (iArr.length == 0) {
                Log.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f6530a = trackGroup;
            this.f6531b = iArr;
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

    int getSelectedIndexInTrackGroup();

    void onPlaybackSpeed(float f);
}
