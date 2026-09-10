package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.location.Location;
import android.os.Bundle;
import androidx.core.location.LocationListenerCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class YI {
    public static void b(LocationListenerCompat locationListenerCompat, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            locationListenerCompat.onLocationChanged((Location) list.get(i));
        }
    }

    public static void a(LocationListenerCompat locationListenerCompat, int i) {
    }

    public static void c(LocationListenerCompat locationListenerCompat, String str) {
    }

    public static void d(LocationListenerCompat locationListenerCompat, String str) {
    }

    public static void e(LocationListenerCompat locationListenerCompat, String str, int i, Bundle bundle) {
    }
}
