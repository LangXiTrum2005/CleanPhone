package com.bytedance.sdk.component.mzz.mzz;

/* JADX INFO: loaded from: classes.dex */
public class ud implements tvp {
    private byte[] qdl;
    private com.bytedance.sdk.component.mzz.mo ud;

    public ud(byte[] bArr, com.bytedance.sdk.component.mzz.mo moVar) {
        this.qdl = bArr;
        this.ud = moVar;
    }

    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public void qdl(com.bytedance.sdk.component.mzz.lnr.lnr lnrVar) {
        tvp rqVar;
        int iFs = lnrVar.fs();
        lnrVar.qdl(this.qdl.length);
        if (iFs != 2) {
            if (iFs != 3) {
                boolean zUd = com.bytedance.sdk.component.utils.mo.ud(this.qdl);
                rqVar = (!zUd && com.bytedance.sdk.component.utils.mo.qdl(this.qdl)) ? new mzz(this.qdl, this.ud) : new exu(this.qdl, this.ud, zUd);
            } else {
                byte[] bArr = this.qdl;
                rqVar = new exu(bArr, this.ud, com.bytedance.sdk.component.utils.mo.ud(bArr));
            }
        } else if (com.bytedance.sdk.component.utils.mo.qdl(this.qdl)) {
            rqVar = new mzz(this.qdl, this.ud);
        } else {
            rqVar = this.ud == null ? new rq() : new jpc(1001, "not image format", null);
        }
        lnrVar.qdl(rqVar);
    }

    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public String qdl() {
        return "image_type";
    }
}
