package com.mbridge.msdk.mbsignalcommon.base;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c implements a {
    @Override // com.mbridge.msdk.mbsignalcommon.base.a
    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String scheme = Uri.parse(str).getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equals("intent")) {
            return false;
        }
        return com.mbridge.msdk.click.c.d(com.mbridge.msdk.foundation.controller.c.n().d(), str);
    }
}
