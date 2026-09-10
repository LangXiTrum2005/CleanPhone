package com.google.android.gms.internal.ads;

import android.os.Build;
import com.applovin.shadow.okio.Utf8;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f18840a = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, Utf8.REPLACEMENT_BYTE, 50, 108, -113, -103, 74};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f18841b = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    public static boolean a(File file) {
        try {
            X509Certificate[][] x509CertificateArrN = pi1.n(file.getAbsolutePath());
            if (x509CertificateArrN.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(x509CertificateArrN[0][0].getEncoded());
            return Arrays.equals(f18840a, bArrDigest) || (!"user".equals(Build.TYPE) && Arrays.equals(f18841b, bArrDigest));
        } catch (ta e10) {
            throw new GeneralSecurityException("Package is not signed", e10);
        } catch (IOException | RuntimeException e11) {
            throw new GeneralSecurityException("Failed to verify signatures", e11);
        }
    }
}
