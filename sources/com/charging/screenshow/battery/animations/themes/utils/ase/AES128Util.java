package com.charging.screenshow.battery.animations.themes.utils.ase;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class AES128Util {
    public static String a(String str) {
        byte[] bArrDoFinal;
        if (str.length() < 1) {
            bArrDoFinal = null;
        } else {
            byte[] bArr = new byte[str.length() / 2];
            for (int i2 = 0; i2 < str.length() / 2; i2++) {
                int i3 = i2 * 2;
                int i4 = i3 + 1;
                bArr[i2] = (byte) ((Integer.parseInt(str.substring(i3, i4), 16) * 16) + Integer.parseInt(str.substring(i4, i3 + 2), 16));
            }
            bArrDoFinal = bArr;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec("gGeSUnh1k5JKjl7W".getBytes(StandardCharsets.UTF_8), "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(2, secretKeySpec);
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return new String(bArrDoFinal);
    }
}
