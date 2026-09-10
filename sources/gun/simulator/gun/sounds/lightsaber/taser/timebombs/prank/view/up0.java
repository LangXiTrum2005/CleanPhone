package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public final class up0 {
    public static final B4 c = new B4("ReviewService", 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cp0 f5105a;
    public final String b;

    public up0(Context context) {
        String strEncodeToString;
        this.b = context.getPackageName();
        B4 b4 = Dp0.f2992a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    Object[] objArr = new Object[0];
                    boolean zIsLoggable = Log.isLoggable("PlayCore", 5);
                    B4 b5 = Dp0.f2992a;
                    if (zIsLoggable) {
                        B4.d(b5.f2852a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
                        return;
                    } else {
                        b5.getClass();
                        return;
                    }
                }
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        strEncodeToString = "";
                    }
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                        String str = Build.TAGS;
                        if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                        }
                    }
                    this.f5105a = new Cp0(context, c, new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"));
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
