package com.bytedance.sdk.openadsdk.mml.qdl;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public class lnr implements com.bytedance.sdk.openadsdk.multipro.qdl {
    private final com.bytedance.sdk.component.mo.qdl.ud.ud.ud qdl;

    public lnr(com.bytedance.sdk.component.mo.qdl.ud.ud.ud udVar) {
        this.qdl = udVar;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public String qdl() {
        com.bytedance.sdk.component.mo.qdl.ud.ud.ud udVar = this.qdl;
        if (udVar != null) {
            return udVar.lnr();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public String qdl(Uri uri) {
        com.bytedance.sdk.component.mo.qdl.ud.ud.ud udVar = this.qdl;
        if (udVar != null) {
            return udVar.qdl(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public Cursor qdl(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        com.bytedance.sdk.component.mo.qdl.ud.ud.ud udVar = this.qdl;
        if (udVar != null) {
            return udVar.qdl(uri, strArr, str, strArr2, str2);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public Uri qdl(Uri uri, ContentValues contentValues) {
        com.bytedance.sdk.component.mo.qdl.ud.ud.ud udVar = this.qdl;
        if (udVar != null) {
            return udVar.qdl(uri, contentValues);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public int qdl(Uri uri, String str, String[] strArr) {
        com.bytedance.sdk.component.mo.qdl.ud.ud.ud udVar = this.qdl;
        if (udVar != null) {
            return udVar.qdl(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public int qdl(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        com.bytedance.sdk.component.mo.qdl.ud.ud.ud udVar = this.qdl;
        if (udVar != null) {
            return udVar.qdl(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
