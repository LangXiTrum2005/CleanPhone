package com.google.android.exoplayer2.util;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class BundleableUtil {
    public static ImmutableList a(Bundleable.Creator creator, ArrayList arrayList) {
        ImmutableList.Builder builderS = ImmutableList.s();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Bundle bundle = (Bundle) arrayList.get(i2);
            bundle.getClass();
            builderS.h(creator.e(bundle));
        }
        return builderS.j();
    }
}
