package androidx.core.service.quicksettings;

import android.app.PendingIntent;
import android.content.Intent;
import android.service.quicksettings.TileService;

/* JADX INFO: loaded from: classes.dex */
public class TileServiceCompat {

    public static class Api24Impl {
        public static void a(TileService tileService, Intent intent) {
            tileService.startActivityAndCollapse(intent);
        }
    }

    public static class Api34Impl {
        public static void a(TileService tileService, PendingIntent pendingIntent) {
            tileService.startActivityAndCollapse(pendingIntent);
        }
    }

    public interface TileServiceWrapper {
    }
}
