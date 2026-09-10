package com.chartboost.sdk.impl;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j0 {
    public static final String a(String url) {
        Intrinsics.f(url, "url");
        if (url.length() <= 0) {
            return "";
        }
        if (!StringsKt.M(url, "https://", false) && !StringsKt.M(url, "http://", false)) {
            url = "https://".concat(url);
        }
        Uri uri = Uri.parse(url);
        if (uri == null) {
            return "";
        }
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.c(pathSegments);
        return CollectionsKt.D(pathSegments, "_", null, null, null, 62);
    }

    public static final kb a(int i2) {
        Object next;
        Iterator<E> it = kb.b().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((kb) next).c() != i2);
        kb kbVar = (kb) next;
        return kbVar == null ? kb.UNKNOWN : kbVar;
    }
}
