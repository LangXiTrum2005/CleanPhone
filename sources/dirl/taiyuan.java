package dirl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final preprohormone f25281attabal = new preprohormone("PhoneskyVerificationUtils");

    public static boolean attabal(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled && saneness(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures);
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean saneness(Signature[] signatureArr) {
        if (signatureArr == null || (signatureArr.length) == 0) {
            f25281attabal.wireman("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            return false;
        }
        for (Signature signature : signatureArr) {
            String strAttabal = impromptu.attabal(signature.toByteArray());
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strAttabal)) {
                return true;
            }
            String str = Build.TAGS;
            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strAttabal)) {
                return true;
            }
        }
        return false;
    }
}
