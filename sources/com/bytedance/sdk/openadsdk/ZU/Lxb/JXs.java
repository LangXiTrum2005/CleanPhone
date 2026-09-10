package com.bytedance.sdk.openadsdk.ZU.Lxb;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public class JXs implements com.bytedance.sdk.openadsdk.multipro.Lxb {
    private final com.bytedance.sdk.component.lc.Lxb.LD.LD.LD Lxb;

    public JXs(com.bytedance.sdk.component.lc.Lxb.LD.LD.LD ld) {
        this.Lxb = ld;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public String Lxb() {
        com.bytedance.sdk.component.lc.Lxb.LD.LD.LD ld = this.Lxb;
        if (ld != null) {
            return ld.lk();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public String Lxb(Uri uri) {
        com.bytedance.sdk.component.lc.Lxb.LD.LD.LD ld = this.Lxb;
        if (ld != null) {
            return ld.Lxb(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public Cursor Lxb(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        com.bytedance.sdk.component.lc.Lxb.LD.LD.LD ld = this.Lxb;
        if (ld != null) {
            return ld.Lxb(uri, strArr, str, strArr2, str2);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public Uri Lxb(Uri uri, ContentValues contentValues) {
        com.bytedance.sdk.component.lc.Lxb.LD.LD.LD ld = this.Lxb;
        if (ld != null) {
            return ld.Lxb(uri, contentValues);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public int Lxb(Uri uri, String str, String[] strArr) {
        com.bytedance.sdk.component.lc.Lxb.LD.LD.LD ld = this.Lxb;
        if (ld != null) {
            return ld.Lxb(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public int Lxb(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        com.bytedance.sdk.component.lc.Lxb.LD.LD.LD ld = this.Lxb;
        if (ld != null) {
            return ld.Lxb(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
