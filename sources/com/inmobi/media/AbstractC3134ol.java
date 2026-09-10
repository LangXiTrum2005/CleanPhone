package com.inmobi.media;

import android.webkit.URLUtil;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.inmobi.media.ol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3134ol {
    public static final boolean a(String str) {
        if (str == null || StringsKt.splinterproof(StringsKt.stupefactive(str).toString(), ' ', false, 2, null)) {
            return false;
        }
        return URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str);
    }

    public static final String b(String str) {
        if (str == null) {
            return "";
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.taiyuan(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string = str.subSequence(i, length + 1).toString();
        return string == null ? "" : string;
    }
}
