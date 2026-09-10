package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.drawable.Icon;
import android.media.AudioDeviceInfo;
import android.media.MediaDrmResetException;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class YB {
    public static /* bridge */ /* synthetic */ Icon f(Parcelable parcelable) {
        return (Icon) parcelable;
    }

    public static /* bridge */ /* synthetic */ Icon g(Object obj) {
        return (Icon) obj;
    }

    public static /* bridge */ /* synthetic */ AudioDeviceInfo i(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj) {
        return obj instanceof Icon;
    }

    public static /* bridge */ /* synthetic */ boolean z(Throwable th) {
        return th instanceof MediaDrmResetException;
    }
}
