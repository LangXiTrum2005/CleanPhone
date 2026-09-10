package com.bytedance.sdk.openadsdk.multipro.aidl.qdl;

import android.content.ContentValues;
import android.net.Uri;
import com.bytedance.sdk.openadsdk.core.yt;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class mo extends com.bytedance.sdk.component.mo.qdl.mo.qdl {
    private static volatile mo qdl;

    public static mo ud() {
        if (qdl == null) {
            synchronized (mo.class) {
                try {
                    if (qdl == null) {
                        qdl = new mo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mo
    public Map qdl(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!com.bytedance.sdk.openadsdk.core.settings.wd.qdl()) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl(com.bytedance.sdk.openadsdk.multipro.mzz.qdl(yt.qdl()).qdl(uri, strArr, str, strArr2, str2));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mo
    public String qdl(Uri uri) {
        if (com.bytedance.sdk.openadsdk.core.settings.wd.qdl()) {
            return com.bytedance.sdk.openadsdk.multipro.mzz.qdl(yt.qdl()).qdl(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mo
    public String qdl(Uri uri, ContentValues contentValues) {
        Uri uriQdl;
        if (com.bytedance.sdk.openadsdk.core.settings.wd.qdl() && (uriQdl = com.bytedance.sdk.openadsdk.multipro.mzz.qdl(yt.qdl()).qdl(uri, contentValues)) != null) {
            return uriQdl.toString();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mo
    public int qdl(Uri uri, String str, String[] strArr) {
        if (com.bytedance.sdk.openadsdk.core.settings.wd.qdl()) {
            return com.bytedance.sdk.openadsdk.multipro.mzz.qdl(yt.qdl()).qdl(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mo
    public int qdl(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (com.bytedance.sdk.openadsdk.core.settings.wd.qdl()) {
            return com.bytedance.sdk.openadsdk.multipro.mzz.qdl(yt.qdl()).qdl(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
