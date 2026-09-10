package A;

import android.app.NotificationChannel;
import android.app.usage.StorageStatsManager;
import android.media.AudioFocusRequest;

/* JADX INFO: renamed from: A.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC0891g {
    public static /* bridge */ /* synthetic */ NotificationChannel f(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ NotificationChannel g(String str, String str2) {
        return new NotificationChannel(str, str2, 3);
    }

    public static /* bridge */ /* synthetic */ StorageStatsManager i(Object obj) {
        return (StorageStatsManager) obj;
    }

    public static /* synthetic */ AudioFocusRequest.Builder m() {
        return new AudioFocusRequest.Builder(2);
    }
}
