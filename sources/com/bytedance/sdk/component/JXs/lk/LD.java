package com.bytedance.sdk.component.JXs.lk;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.JXs.IeN;
import com.bytedance.sdk.component.JXs.NXR;
import com.bytedance.sdk.component.JXs.nBu;
import com.bytedance.sdk.component.JXs.tD;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class LD implements IeN {
    private volatile lc Lxb;

    private LD() {
    }

    private void LD(Context context, NXR nxr) {
        if (nxr == null) {
            nxr = JXs.Lxb(context);
        }
        this.Lxb = new lc(context, nxr);
    }

    public static IeN Lxb(Context context, NXR nxr) {
        LD ld = new LD();
        ld.LD(context, nxr);
        return ld;
    }

    @Override // com.bytedance.sdk.component.JXs.IeN
    public nBu Lxb(String str) {
        return new lk.LD(this.Lxb).lk(str);
    }

    @Override // com.bytedance.sdk.component.JXs.IeN
    public InputStream Lxb(String str, String str2) {
        if (this.Lxb != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = com.bytedance.sdk.component.JXs.lk.lk.lk.Lxb(str);
            }
            Collection<tD> collectionLD = this.Lxb.LD();
            if (collectionLD != null) {
                Iterator<tD> it = collectionLD.iterator();
                while (it.hasNext()) {
                    byte[] bArrLxb = it.next().Lxb(str2);
                    if (bArrLxb != null) {
                        return new ByteArrayInputStream(bArrLxb);
                    }
                }
            }
            Collection<com.bytedance.sdk.component.JXs.lk> collectionLk = this.Lxb.lk();
            if (collectionLk != null) {
                Iterator<com.bytedance.sdk.component.JXs.lk> it2 = collectionLk.iterator();
                while (it2.hasNext()) {
                    InputStream inputStreamLxb = it2.next().Lxb(str2);
                    if (inputStreamLxb != null) {
                        return inputStreamLxb;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.JXs.IeN
    public boolean Lxb(String str, String str2, String str3) {
        if (this.Lxb == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = com.bytedance.sdk.component.JXs.lk.lk.lk.Lxb(str);
        }
        com.bytedance.sdk.component.JXs.lk lkVarLxb = this.Lxb.Lxb(str3);
        if (lkVarLxb != null) {
            return lkVarLxb.LD(str2);
        }
        return false;
    }
}
