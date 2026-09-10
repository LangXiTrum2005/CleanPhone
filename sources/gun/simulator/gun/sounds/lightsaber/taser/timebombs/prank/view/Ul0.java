package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaCodecInfo;
import android.view.WindowInsets;
import com.badlogic.gdx.graphics.GL20;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class Ul0 {
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint d() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(GL20.GL_INVALID_ENUM, 720, 60);
    }

    public static /* synthetic */ WindowInsets.Builder e() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder f(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }
}
