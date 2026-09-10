package com.bytedance.sdk.openadsdk.multipro.aidl.Lxb;

import android.content.ContentValues;
import android.net.Uri;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.settings.sLN;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class lc extends com.bytedance.sdk.component.lc.Lxb.lc.Lxb {
    private static volatile lc Lxb;

    public static lc LD() {
        if (Lxb == null) {
            synchronized (lc.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new lc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.lc
    public Map Lxb(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!sLN.Lxb()) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.Lxb.Lxb.Lxb(com.bytedance.sdk.openadsdk.multipro.JXs.Lxb(kqm.Lxb()).Lxb(uri, strArr, str, strArr2, str2));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.lc
    public String Lxb(Uri uri) {
        if (sLN.Lxb()) {
            return com.bytedance.sdk.openadsdk.multipro.JXs.Lxb(kqm.Lxb()).Lxb(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.lc
    public String Lxb(Uri uri, ContentValues contentValues) {
        Uri uriLxb;
        if (sLN.Lxb() && (uriLxb = com.bytedance.sdk.openadsdk.multipro.JXs.Lxb(kqm.Lxb()).Lxb(uri, contentValues)) != null) {
            return uriLxb.toString();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.lc
    public int Lxb(Uri uri, String str, String[] strArr) {
        if (sLN.Lxb()) {
            return com.bytedance.sdk.openadsdk.multipro.JXs.Lxb(kqm.Lxb()).Lxb(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.lc
    public int Lxb(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (sLN.Lxb()) {
            return com.bytedance.sdk.openadsdk.multipro.JXs.Lxb(kqm.Lxb()).Lxb(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
