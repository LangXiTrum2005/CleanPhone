package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/FacebookSignatureValidator;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FacebookSignatureValidator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f16283a = SetsKt.b("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    public static final boolean a(Context context, String str) {
        Intrinsics.f(context, "context");
        String brand = Build.BRAND;
        int i2 = context.getApplicationInfo().flags;
        Intrinsics.e(brand, "brand");
        if (StringsKt.M(brand, "generic", false) && (i2 & 2) != 0) {
            return true;
        }
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr != null && signatureArr.length != 0) {
                Intrinsics.e(signatureArr, "packageInfo.signatures");
                for (Signature signature : signatureArr) {
                    HashSet hashSet = f16283a;
                    byte[] byteArray = signature.toByteArray();
                    Intrinsics.e(byteArray, "it.toByteArray()");
                    if (CollectionsKt.o(hashSet, Utility.x(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1, byteArray))) {
                    }
                }
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
