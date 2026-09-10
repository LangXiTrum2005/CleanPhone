package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.44, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass44 {
    public static String[] A00 = {"EztRdnRdnxII2dimpNbIGIFL", "yBPkb8rrKyWAtXIO8vHrmMLgNIFMukmC", "ruf61JzVv", "IfWYroKwc", "5HPqTBNR8piE8Sks8fUTmtRJQLpo0nUy", "FxyxfNH4TJBWtje7DU0sksr0G0lHlrNk", "mC", "vPIo9e1233jy8mUAOhcfZhe0yZqmz6aB"};

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.23 != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.24> */
    public static <T extends AnonymousClass24> SparseArray<T> A00(AnonymousClass23<T> anonymousClass23, SparseArray<Bundle> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            parcelableSparseArray.put(sparseArray.keyAt(i2), anonymousClass23.A6f(sparseArray.valueAt(i2)));
        }
        return parcelableSparseArray;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.23 != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.24> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<T extends com.facebook.ads.redexgen.X.24> */
    public static <T extends AnonymousClass24> BP<T> A01(AnonymousClass23<T> anonymousClass23, List<Bundle> list) {
        C2K c2kA01 = BP.A01();
        int i2 = 0;
        while (true) {
            int size = list.size();
            int i3 = A00[2].length();
            if (i3 == 29) {
                throw new RuntimeException();
            }
            A00[1] = "WptazREDdEStXNqRDkkRjPq2B5lfZI6H";
            if (i2 < size) {
                c2kA01.A04(anonymousClass23.A6f((Bundle) AbstractC10843y.A01(list.get(i2))));
                i2++;
            } else {
                return c2kA01.A05();
            }
        }
    }

    public static void A02(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) C5C.A0f(AnonymousClass44.class.getClassLoader()));
        }
    }
}
