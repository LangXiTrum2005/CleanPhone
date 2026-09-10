package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public abstract class SG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MessageDigest f3710a;
    public static final char[] b;

    static {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        f3710a = messageDigest;
        b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static String a(String str) {
        byte[] bArrDigest;
        MessageDigest messageDigest = f3710a;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
        synchronized (SG.class) {
            bArrDigest = messageDigest.digest(bytes);
        }
        if (bArrDigest == null || bArrDigest.length == 0) {
            return null;
        }
        char[] cArr = new char[bArrDigest.length << 1];
        int i = 0;
        for (byte b2 : bArrDigest) {
            int i2 = i + 1;
            char[] cArr2 = b;
            cArr[i] = cArr2[(b2 & 240) >> 4];
            i += 2;
            cArr[i2] = cArr2[b2 & com.umeng.analytics.pro.cw.m];
        }
        return new String(cArr);
    }
}
