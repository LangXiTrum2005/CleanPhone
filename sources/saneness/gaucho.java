package saneness;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import org.jacoco.core.data.ExecutionDataWriter;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gaucho {
    public static final byte[] attabal(SecretKey secretKey, byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(secretKey);
        byte[] bArrDoFinal = mac.doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    public static final byte[] saneness(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
        messageDigest.update(new byte[]{0, 0, 0, ExecutionDataWriter.BLOCK_SESSIONINFO});
        messageDigest.update(bArr);
        messageDigest.update(bArr2);
        byte[] bArrDigest = messageDigest.digest();
        if (bArrDigest.length < 4) {
            return null;
        }
        return new byte[]{0, bArrDigest[0], bArrDigest[1], bArrDigest[2], bArrDigest[3]};
    }
}
