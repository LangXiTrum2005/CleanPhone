package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class W1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f3904a = new ConcurrentHashMap();
    public static C4573sR b = null;

    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context != null) {
            byte[] bArr = {-31, -97, -51, -93, 120, 85, -94, -9, -12, -103, -41, -76};
            byte[] bArr2 = {-126, -16, -93, -51, 29, 54, -42, -98};
            int length = bArr.length;
            int length2 = bArr2.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                if (i2 >= length2) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(new String(bArr, StandardCharsets.UTF_8));
            return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) ? false : true;
        }
        return false;
    }
}
