package com.bytedance.sdk.component.mzz.mzz;

import android.graphics.Bitmap;
import androidx.datastore.preferences.protobuf.a;

/* JADX INFO: loaded from: classes.dex */
public class mzz extends qdl {
    private byte[] qdl;
    private com.bytedance.sdk.component.mzz.mo ud;

    public mzz(byte[] bArr, com.bytedance.sdk.component.mzz.mo moVar) {
        this.qdl = bArr;
        this.ud = moVar;
    }

    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public void qdl(com.bytedance.sdk.component.mzz.lnr.lnr lnrVar) {
        com.bytedance.sdk.component.mzz.lnr.mo moVarJl = lnrVar.jl();
        com.bytedance.sdk.component.mzz.lnr.ud.qdl qdlVarQdl = moVarJl.qdl(lnrVar);
        try {
            lnrVar.jyq();
            Bitmap bitmapQdl = qdlVarQdl.qdl(this.qdl);
            if (bitmapQdl == null) {
                qdl(1002, "decode failed bitmap null", null, lnrVar);
                return;
            }
            lnrVar.qdl(new exu(bitmapQdl, this.ud, false));
            moVarJl.qdl(lnrVar.exc()).qdl(lnrVar.to(), bitmapQdl);
        } catch (Throwable th) {
            qdl(1002, a.o(th, new StringBuilder("decode failed:")), th, lnrVar);
        }
    }

    private void qdl(int i2, String str, Throwable th, com.bytedance.sdk.component.mzz.lnr.lnr lnrVar) {
        if (this.ud == null) {
            lnrVar.qdl(new rq());
        } else {
            lnrVar.qdl(new jpc(i2, str, th));
        }
    }

    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public String qdl() {
        return "decode";
    }
}
