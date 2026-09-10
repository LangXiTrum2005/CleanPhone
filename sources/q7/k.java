package q7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f48707a = xj.g0.t0("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    public static final boolean a(Context context, String str) {
        String string;
        kotlin.jvm.internal.n.f(context, "context");
        String brand = Build.BRAND;
        int i10 = context.getApplicationInfo().flags;
        kotlin.jvm.internal.n.e(brand, "brand");
        if (an.p.p0(brand, "generic", false) && (i10 & 2) != 0) {
            return true;
        }
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr != null && signatureArr.length != 0) {
                kotlin.jvm.internal.n.e(signatureArr, "packageInfo.signatures");
                for (Signature signature : signatureArr) {
                    HashSet hashSet = f48707a;
                    byte[] byteArray = signature.toByteArray();
                    kotlin.jvm.internal.n.e(byteArray, "it.toByteArray()");
                    try {
                        MessageDigest hash = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
                        kotlin.jvm.internal.n.e(hash, "hash");
                        hash.update(byteArray);
                        byte[] digest = hash.digest();
                        StringBuilder sb2 = new StringBuilder();
                        kotlin.jvm.internal.n.e(digest, "digest");
                        for (byte b10 : digest) {
                            sb2.append(Integer.toHexString((b10 >> 4) & 15));
                            sb2.append(Integer.toHexString(b10 & 15));
                        }
                        string = sb2.toString();
                        kotlin.jvm.internal.n.e(string, "builder.toString()");
                    } catch (NoSuchAlgorithmException unused) {
                        string = null;
                    }
                    if (xj.n.i0(hashSet, string)) {
                    }
                }
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return false;
    }
}
