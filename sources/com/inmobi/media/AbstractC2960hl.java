package com.inmobi.media;

import android.os.Build;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2960hl {
    public static final C3392z5 a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() != 2 ? new C3392z5(0, 0) : new C3392z5(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }

    public static final String a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (Build.VERSION.SDK_INT >= 33) {
            return URLEncoder.encode(url, Charset.defaultCharset());
        }
        return URLEncoder.encode(url);
    }
}
