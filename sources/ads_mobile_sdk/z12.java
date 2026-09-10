package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import saneness.distortionist;

/* JADX INFO: loaded from: classes.dex */
public abstract class z12 {
    public static final hc1 a = new hc1("PhoneskyVerificationUtils");

    public static boolean a(Context context) {
        String strEncodeToString;
        try {
            boolean z = context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled;
            if (!z) {
                a.b("Play Store package is disabled.", new Object[0]);
            }
            if (!z) {
                return false;
            }
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || signatureArr.length == 0) {
                    a.b("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
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
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                        String str = Build.TAGS;
                        if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                        }
                    }
                    return true;
                }
                a.b("Play Store package certs are not valid. Found these sha256 certs: [" + distortionist.attabal(", ", arrayList) + "].", new Object[0]);
                return false;
            } catch (PackageManager.NameNotFoundException unused2) {
                a.b("Play Store package is not found.", new Object[0]);
                return false;
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            a.b("Play Store package is not found.", new Object[0]);
            return false;
        }
    }
}
