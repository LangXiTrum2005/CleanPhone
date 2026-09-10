package com.facebook.internal.logging.dumpsys;

import android.content.res.Resources;
import androidx.datastore.preferences.protobuf.a;
import com.applovin.impl.Z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/logging/dumpsys/ResourcesUtil;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ResourcesUtil {
    public static final String a(Resources resources, int i2) {
        String resourcePackageName;
        String str;
        if (resources == null) {
            return a.h(i2, new StringBuilder("#"));
        }
        if (((i2 >>> 24) & 255) != 127) {
            resourcePackageName = resources.getResourcePackageName(i2);
            Intrinsics.e(resourcePackageName, "r.getResourcePackageName(resourceId)");
            str = ":";
        } else {
            resourcePackageName = "";
            str = "";
        }
        String resourceTypeName = resources.getResourceTypeName(i2);
        String resourceEntryName = resources.getResourceEntryName(i2);
        StringBuilder sb = new StringBuilder(resourceEntryName.length() + Z.d(resourceTypeName, str.length() + resourcePackageName.length() + 1, 1));
        androidx.media3.extractor.text.ttml.a.C(sb, "@", resourcePackageName, str, resourceTypeName);
        sb.append("/");
        sb.append(resourceEntryName);
        String string = sb.toString();
        Intrinsics.e(string, "sb.toString()");
        return string;
    }
}
