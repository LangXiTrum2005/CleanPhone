package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class H8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f3157a;
    public static final String b;

    static {
        byte[] bArr = {-79, -66, -69, -73};
        byte[] bArr2 = {-45, -33, -46, -61, 75, 77, -27, -14};
        int i = 0;
        int i2 = 0;
        while (i < 4) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        b = new String(bArr, StandardCharsets.UTF_8);
        f3157a = new HashMap();
    }

    public static G8 a(int i, int i2, String str) {
        HashMap map = f3157a;
        G8 g8 = (G8) map.get(str);
        if (g8 != null) {
            Bitmap bitmap = g8.f3107a;
            if (!bitmap.isRecycled()) {
                if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
                    return g8;
                }
                try {
                    G8 g9 = new G8(str, Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565));
                    map.put(str, g9);
                    return g9;
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
        try {
            G8 g10 = new G8(str, Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565));
            map.put(str, g10);
            return g10;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
