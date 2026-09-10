package com.bytedance.sdk.component.mzz.lnr;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.mzz.bjy;
import com.bytedance.sdk.component.mzz.exu;
import com.bytedance.sdk.component.mzz.jl;
import com.bytedance.sdk.component.mzz.to;
import com.bytedance.sdk.component.utils.jtx;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ud implements bjy {
    private volatile mo qdl;

    private ud() {
    }

    public static bjy qdl(Context context, exu exuVar) {
        ud udVar = new ud();
        udVar.ud(context, exuVar);
        return udVar;
    }

    private void ud(Context context, exu exuVar) {
        if (this.qdl != null) {
            Log.w("ImageLoader", "already init!");
        }
        if (exuVar == null) {
            exuVar = mzz.qdl(context);
        }
        this.qdl = new mo(context, exuVar);
    }

    @Override // com.bytedance.sdk.component.mzz.bjy
    public to qdl(String str) {
        return new lnr.ud(this.qdl).lnr(str);
    }

    @Override // com.bytedance.sdk.component.mzz.bjy
    public InputStream qdl(String str, String str2) {
        if (this.qdl != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = jtx.qdl(str);
            }
            Collection<jl> collectionUd = this.qdl.ud();
            if (collectionUd != null) {
                Iterator<jl> it = collectionUd.iterator();
                while (it.hasNext()) {
                    byte[] bArrQdl = it.next().qdl(str2);
                    if (bArrQdl != null) {
                        return new ByteArrayInputStream(bArrQdl);
                    }
                }
            }
            Collection<com.bytedance.sdk.component.mzz.lnr> collectionLnr = this.qdl.lnr();
            if (collectionLnr != null) {
                Iterator<com.bytedance.sdk.component.mzz.lnr> it2 = collectionLnr.iterator();
                while (it2.hasNext()) {
                    InputStream inputStreamQdl = it2.next().qdl(str2);
                    if (inputStreamQdl != null) {
                        return inputStreamQdl;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.mzz.bjy
    public boolean qdl(String str, String str2, String str3) {
        if (this.qdl == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = jtx.qdl(str);
        }
        com.bytedance.sdk.component.mzz.lnr lnrVarQdl = this.qdl.qdl(str3);
        if (lnrVarQdl != null) {
            return lnrVarQdl.ud(str2);
        }
        return false;
    }
}
