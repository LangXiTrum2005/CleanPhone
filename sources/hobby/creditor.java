package hobby;

import com.google.crypto.tink.internal.TinkBugException;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes3.dex */
public final class creditor {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Charset f27763attabal = Charset.forName(C.UTF8_NAME);

    public static final byte attabal(char c) throws GeneralSecurityException {
        if (c >= '!' && c <= '~') {
            return (byte) c;
        }
        throw new GeneralSecurityException("Not a printable ASCII character: " + c);
    }

    public static int beachfront() {
        int i = 0;
        while (i == 0) {
            byte[] bArrWireman = grimness.wireman(4);
            i = (bArrWireman[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArrWireman[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArrWireman[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArrWireman[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        }
        return i;
    }

    public static final byte competently(char c) {
        if (c >= '!' && c <= '~') {
            return (byte) c;
        }
        throw new TinkBugException("Not a printable ASCII character: " + c);
    }

    @Nullable
    public static Integer dern() {
        if (wireman()) {
            return saneness.attabal();
        }
        return null;
    }

    public static final ebullioscopic.attabal impromptu(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            bArr[i] = competently(str.charAt(i));
        }
        return ebullioscopic.attabal.attabal(bArr);
    }

    public static boolean marial(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static final ebullioscopic.attabal saneness(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            bArr[i] = attabal(str.charAt(i));
        }
        return ebullioscopic.attabal.attabal(bArr);
    }

    public static boolean wireman() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }
}
