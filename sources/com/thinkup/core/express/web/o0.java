package com.thinkup.core.express.web;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 implements o {
    @Override // com.thinkup.core.express.web.o
    public final boolean o(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String scheme = Uri.parse(str).getScheme();
        if (TextUtils.isEmpty(scheme)) {
            return false;
        }
        scheme.equals("intent");
        return false;
    }
}
