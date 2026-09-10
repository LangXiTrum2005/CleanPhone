package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ClipData;
import android.location.LocationRequest;
import android.media.MediaDrm;
import android.view.ContentInfo;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class D4 {
    public static /* bridge */ /* synthetic */ ContentInfo B(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ LocationRequest e(Object obj) {
        return (LocationRequest) obj;
    }

    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent g(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    public static /* synthetic */ ContentInfo.Builder k(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* synthetic */ ContentInfo.Builder l(ContentInfo contentInfo) {
        return new ContentInfo.Builder(contentInfo);
    }

    public static /* bridge */ /* synthetic */ ContentInfo n(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* synthetic */ void r() {
    }
}
