package ads_mobile_sdk;

import android.os.Build;
import com.applovin.shadow.okio.Utf8;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import org.jacoco.core.data.ExecutionDataWriter;
import saneness.kaleidoscopic;

/* JADX INFO: loaded from: classes.dex */
public final class q73 {
    public static final byte[] a = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, Utf8.REPLACEMENT_BYTE, 50, 108, -113, -103, 74};
    public static final byte[] b = {-110, -13, -34, 70, -83, 43, 97, 21, -44, ExecutionDataWriter.BLOCK_SESSIONINFO, -54, -125, -28, -57, -125, -127, -7, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    public static boolean a(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] x509CertificateArrTaiyuan = kaleidoscopic.taiyuan(file.getAbsolutePath());
            if (x509CertificateArrTaiyuan.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(x509CertificateArrTaiyuan[0][0].getEncoded());
            return Arrays.equals(a, bArrDigest) || (!"user".equals(Build.TYPE) && Arrays.equals(b, bArrDigest));
        } catch (jd e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException | RuntimeException e2) {
            throw new GeneralSecurityException("Failed to verify signatures", e2);
        }
    }
}
