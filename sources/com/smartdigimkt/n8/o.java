package com.smartdigimkt.n8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PackageManager f37222a;

    public enum a {
        ENABLED,
        DISABLED,
        NOT_INSTALLED
    }

    public o(Context context) {
        this.f37222a = context.getPackageManager();
    }

    private byte[] e(String str) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = this.f37222a.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length > 0) {
                return signatureArr[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return new byte[0];
    }

    public String a(String str) {
        byte[] bArrE = e(str);
        if (bArrE == null || bArrE.length == 0) {
            return null;
        }
        return m.b(a(bArrE), true);
    }

    public a b(String str) {
        if (TextUtils.isEmpty(str)) {
            return a.NOT_INSTALLED;
        }
        try {
            return this.f37222a.getApplicationInfo(str, 0).enabled ? a.ENABLED : a.DISABLED;
        } catch (PackageManager.NameNotFoundException unused) {
            return a.NOT_INSTALLED;
        }
    }

    public int c(String str) {
        try {
            PackageInfo packageInfo = this.f37222a.getPackageInfo(str, 16);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return 0;
    }

    public String d(String str) {
        String str2;
        try {
            PackageInfo packageInfo = this.f37222a.getPackageInfo(str, 16);
            return (packageInfo == null || (str2 = packageInfo.versionName) == null) ? "" : str2;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static byte[] a(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        }
    }
}
