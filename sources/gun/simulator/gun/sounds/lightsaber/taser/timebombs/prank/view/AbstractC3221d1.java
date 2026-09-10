package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3221d1 {
    static {
        byte[] bArr = {-19, 101, -53, -53, 53, 18, -84, 90, -59, 109};
        byte[] bArr2 = {-84, 1, -120, -92, 88, 127, -7, 46};
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
        new String(bArr, StandardCharsets.UTF_8);
    }

    public static boolean a() {
        long jB;
        try {
            if (AbstractC3375el.I(Qm0.D(new byte[]{101, 12, 118, 10, 67, -10, 76, -117, 101, 10, 69, com.umeng.analytics.pro.cw.l, 106, -28, 85, -122, 103, com.umeng.analytics.pro.cw.k}, new byte[]{4, 104, 41, 107, 53, -105, 37, -25}))) {
                String strD = Qm0.D(new byte[]{-57, -3, -49, 21, 55, -125, 18, 11, -57, -5, -4, 17, 30, -111, 11, 6, -59, -4}, new byte[]{-90, -103, -112, 116, 65, -30, 123, 103});
                String str = AbstractC4969wu.f5203a;
                jB = C2375Du.a().b(strD);
            } else {
                jB = 50;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong() >= jB * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }
}
