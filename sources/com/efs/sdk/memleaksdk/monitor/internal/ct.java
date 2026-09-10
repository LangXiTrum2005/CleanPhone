package com.efs.sdk.memleaksdk.monitor.internal;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public final class ct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f665a;

    static {
        Charset charsetForName = Charset.forName(C.UTF8_NAME);
        AbstractC2995aW.p(charsetForName, "Charset.forName(\"UTF-8\")");
        f665a = charsetForName;
    }

    public static final String a(String str, char c) {
        AbstractC2995aW.q(str, "$this$lastSegment");
        int iW0 = AbstractC3089ba0.w0(str, c, 0, 6);
        if (iW0 == -1) {
            return str;
        }
        String strSubstring = str.substring(iW0 + 1);
        AbstractC2995aW.p(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public static final byte[] b(String str) {
        AbstractC2995aW.q(str, "$this$getBytes");
        byte[] bytes = str.getBytes(f665a);
        AbstractC2995aW.p(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String a(String str) {
        AbstractC2995aW.q(str, "$this$createSHA1Hash");
        return a(str, AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    private static final String a(String str, String str2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(b(str));
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(Integer.toHexString(b & 255));
            }
            String string = sb.toString();
            AbstractC2995aW.p(string, "hexString.toString()");
            return string;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError(AbstractC3888ke0.i("Unable to construct MessageDigest for ", str2));
        }
    }
}
