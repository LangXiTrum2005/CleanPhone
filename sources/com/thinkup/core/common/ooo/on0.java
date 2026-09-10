package com.thinkup.core.common.ooo;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes6.dex */
final class on0 {
    private final PackageManager o;

    public enum o {
        ENABLED,
        DISABLED,
        NOT_INSTALLED;

        private static /* synthetic */ o[] o() {
            return new o[]{ENABLED, DISABLED, NOT_INSTALLED};
        }
    }

    public on0(Context context) {
        this.o = context.getPackageManager();
    }

    private int n(String str) {
        try {
            PackageInfo packageInfo = this.o.getPackageInfo(str, 16);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return 0;
    }

    private String o0(String str) {
        String str2;
        try {
            PackageInfo packageInfo = this.o.getPackageInfo(str, 16);
            return (packageInfo == null || (str2 = packageInfo.versionName) == null) ? "" : str2;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private byte[] oo(String str) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = this.o.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length > 0) {
                return signatureArr[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return new byte[0];
    }

    public final String m(String str) {
        byte[] bArrOo = oo(str);
        if (bArrOo == null || bArrOo.length == 0) {
            return null;
        }
        return oon.o(o(bArrOo));
    }

    public final o o(String str) {
        if (TextUtils.isEmpty(str)) {
            return o.NOT_INSTALLED;
        }
        try {
            return this.o.getApplicationInfo(str, 0).enabled ? o.ENABLED : o.DISABLED;
        } catch (PackageManager.NameNotFoundException unused) {
            return o.NOT_INSTALLED;
        }
    }

    private static byte[] o(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        }
    }
}
