package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4661tR {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Md0 f5034a;

    public C4661tR(Md0 md0) {
        this.f5034a = md0;
    }

    public static String a(String str, EnumC2815Ut enumC2815Ut, boolean z) {
        String strI = enumC2815Ut.f3848a;
        if (z) {
            strI = AbstractC3888ke0.i(".temp", strI);
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strI.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance(SameMD5.TAG).digest(strReplaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                strReplaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return DM.B("lottie_cache_", strReplaceAll, strI);
    }

    public final File b(String str) {
        File file = new File(c(), a(str, EnumC2815Ut.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(c(), a(str, EnumC2815Ut.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(c(), a(str, EnumC2815Ut.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public final File c() {
        File file = new File(((Context) this.f5034a.b).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File d(String str, InputStream inputStream, EnumC2815Ut enumC2815Ut) throws IOException {
        File file = new File(c(), a(str, enumC2815Ut, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }
}
