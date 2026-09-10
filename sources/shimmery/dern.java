package shimmery;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final MessageDigest f37627attabal = dern();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final char[] f37628saneness = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String attabal(String str) {
        byte[] bArrDigest;
        MessageDigest messageDigest = f37627attabal;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName(C.UTF8_NAME));
        synchronized (dern.class) {
            bArrDigest = messageDigest.digest(bytes);
        }
        return saneness(bArrDigest);
    }

    public static MessageDigest dern() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String saneness(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f37628saneness;
            cArr[i] = cArr2[(b & 240) >> 4];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
