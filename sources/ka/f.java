package ka;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import la.k;
import la.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final la.e f44543c = new la.e("ReviewService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f44544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44545b;

    public f(Context context) {
        String strEncodeToString;
        this.f44545b = context.getPackageName();
        la.e eVar = l.f45272a;
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                eVar.b("Play Store package is disabled.", new Object[0]);
                return;
            }
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    eVar.b("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    return;
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
                    this.f44544a = new k(context, f44543c, new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"));
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb2.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        } else {
                            sb2.append((CharSequence) ", ");
                        }
                    }
                }
                eVar.b(defpackage.e.o("Play Store package certs are not valid. Found these sha256 certs: [", sb2.toString(), "]."), new Object[0]);
            } catch (PackageManager.NameNotFoundException unused2) {
                eVar.b("Play Store package is not found.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            eVar.b("Play Store package is not found.", new Object[0]);
        }
    }
}
