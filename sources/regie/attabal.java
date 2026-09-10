package regie;

import android.text.TextUtils;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.A5;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: HmacMD5.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {
    public static String attabal(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(A5.O), "HmacMD5");
                Mac mac = Mac.getInstance("HmacMD5");
                mac.init(secretKeySpec);
                byte[] bArrDoFinal = mac.doFinal(str.getBytes(A5.O));
                StringBuffer stringBuffer = new StringBuffer();
                for (byte b : bArrDoFinal) {
                    String hexString = Integer.toHexString(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    if (hexString.length() == 1) {
                        stringBuffer.append('0');
                    }
                    stringBuffer.append(hexString);
                }
                return stringBuffer.toString();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (InvalidKeyException e2) {
                e2.printStackTrace();
            } catch (NoSuchAlgorithmException e3) {
                e3.printStackTrace();
            }
        }
        return null;
    }
}
