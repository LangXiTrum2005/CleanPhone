package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.job.JobInfo;
import android.net.Uri;
import android.view.PointerIcon;
import android.webkit.ServiceWorkerWebSettings;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class UR {
    public static /* synthetic */ JobInfo.TriggerContentUri d(Uri uri, int i) {
        return new JobInfo.TriggerContentUri(uri, i);
    }

    public static /* bridge */ /* synthetic */ PointerIcon j(Object obj) {
        return (PointerIcon) obj;
    }

    public static /* bridge */ /* synthetic */ ServiceWorkerWebSettings k(Object obj) {
        return (ServiceWorkerWebSettings) obj;
    }

    public static /* synthetic */ void q() {
    }
}
