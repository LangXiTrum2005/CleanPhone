package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tf1 f19890a = new tf1("PhoneskyVerificationUtils");

    public static boolean a(Context context) {
        String strEncodeToString;
        tf1 tf1Var = f19890a;
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                tf1Var.c("Play Store package is disabled.", new Object[0]);
                return false;
            }
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    tf1Var.c("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    return false;
                }
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        strEncodeToString = "";
                    }
                    arrayList.add(strEncodeToString);
                    if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                        return true;
                    }
                    String str = Build.TAGS;
                    if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                        return true;
                    }
                }
                tf1Var.c(defpackage.e.o("Play Store package certs are not valid. Found these sha256 certs: [", String.join(", ", arrayList), "]."), new Object[0]);
                return false;
            } catch (PackageManager.NameNotFoundException unused2) {
                tf1Var.c("Play Store package is not found.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            tf1Var.c("Play Store package is not found.", new Object[0]);
        }
    }
}
