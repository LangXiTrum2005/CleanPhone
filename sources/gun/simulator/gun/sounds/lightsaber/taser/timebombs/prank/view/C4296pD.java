package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4296pD {
    public static final C4296pD INSTANCE = new C4296pD();

    private C4296pD() {
    }

    public final String convertForSending(String str) throws IOException {
        AbstractC2995aW.q(str, "stringToConvert");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                byte[] bytes = str.getBytes(AbstractC2307Be.f2881a);
                AbstractC2995aW.p(bytes, "this as java.lang.String).getBytes(charset)");
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.close();
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                AbstractC2995aW.p(strEncodeToString, "encodeToString(compressed, Base64.NO_WRAP)");
                AbstractC3375el.n(gZIPOutputStream, null);
                AbstractC3375el.n(byteArrayOutputStream, null);
                return strEncodeToString;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3375el.n(gZIPOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC3375el.n(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }
}
