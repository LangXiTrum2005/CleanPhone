package com.smartdigimkt.u4;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class d implements a {
    @Override // com.smartdigimkt.u4.a
    public boolean a(String str) {
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
