package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class B6 {
    public static C6 a(Context context, String fileKey) {
        Intrinsics.f(context, "context");
        Intrinsics.f(fileKey, "fileKey");
        String strConcat = "com.im.keyValueStore.".concat(fileKey);
        C6 c6 = (C6) C6.f22734b.get(strConcat);
        if (c6 == null) {
            c6 = new C6(context, strConcat);
            C6 c7 = (C6) C6.f22734b.putIfAbsent(strConcat, c6);
            if (c7 != null) {
                return c7;
            }
        }
        return c6;
    }
}
