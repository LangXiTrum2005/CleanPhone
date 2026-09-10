package sg.bigo.ads.common.utils;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public final class m {
    public static String a(String str) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(16);
        sb.append(random.nextInt(99999999));
        sb.append(random.nextInt(99999999));
        while (sb.length() < 16) {
            sb.append('0');
        }
        if (sb.length() > 16) {
            sb.delete(16, sb.length());
        }
        String strB = b(str + ((Object) sb));
        if (q.a((CharSequence) strB)) {
            sg.bigo.ads.common.t.a.a(0, "MD5", "md5WithSalt is empty!");
            return strB;
        }
        char[] cArr = new char[48];
        for (int i2 = 0; i2 < 48; i2++) {
            int i3 = i2 / 3;
            int i4 = i2 % 3;
            if (i4 == 0) {
                cArr[i2] = strB.charAt(i3 * 2);
            } else if (i4 != 1) {
                cArr[i2] = strB.charAt((i3 * 2) + 1);
            } else {
                cArr[i2] = sb.charAt(i3);
            }
        }
        String str2 = new String(cArr);
        StringBuilder sb2 = new StringBuilder("getMD5MixSalt, val=");
        sb2.append(str);
        sb2.append(", salt=");
        sb2.append((Object) sb);
        sb2.append(", md5WithSalt=");
        sg.bigo.ads.common.t.a.a(0, 3, "MD5", android.support.v4.media.a.s(sb2, strB, ", md5MixSalt=", str2));
        return str2;
    }

    private static String b(String str) {
        byte[] bArrDigest;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes("UTF-8"));
            bArrDigest = messageDigest.digest();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            bArrDigest = null;
        }
        if (bArrDigest == null || bArrDigest.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArrDigest) {
            int i2 = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i2 <= 15) {
                sb.append(0);
            }
            sb.append(Integer.toHexString(i2));
        }
        return sb.toString().toLowerCase();
    }
}
