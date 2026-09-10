package com.bytedance.sdk.component.mzz.mzz;

/* JADX INFO: loaded from: classes.dex */
public class rq extends qdl {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public void qdl(com.bytedance.sdk.component.mzz.lnr.lnr lnrVar) {
        com.bytedance.sdk.component.mzz.lnr.lnr lnrVar2;
        final com.bytedance.sdk.component.mzz.lnr.mo moVarJl = lnrVar.jl();
        com.bytedance.sdk.component.mzz.mml mmlVarMml = moVarJl.mml();
        lnrVar.qdl(false);
        try {
            com.bytedance.sdk.component.mzz.mo moVarQdl = mmlVarMml.qdl(new com.bytedance.sdk.component.mzz.ud.ud(lnrVar.qdl(), lnrVar.exu(), lnrVar.rdp(), lnrVar.jyq()));
            int iUd = moVarQdl.ud();
            lnrVar.qdl(moVarQdl.qdl());
            lnrVar2 = 200;
            try {
                if (moVarQdl.ud() != 200) {
                    String.valueOf(moVarQdl);
                    Object objLnr = moVarQdl.lnr();
                    qdl(iUd, moVarQdl.mml(), objLnr instanceof Throwable ? (Throwable) objLnr : null, lnrVar);
                    return;
                }
                final byte[] bArr = (byte[]) moVarQdl.lnr();
                lnrVar.qdl(new ud(bArr, moVarQdl));
                final String strTvp = lnrVar.tvp();
                final com.bytedance.sdk.component.mzz.ud udVarExc = lnrVar.exc();
                if (udVarExc.mzz()) {
                    moVarJl.ud(lnrVar.exc()).qdl(strTvp, bArr);
                }
                final com.bytedance.sdk.component.mzz.lnr.lnr lnrVar3 = lnrVar;
                try {
                    moVarJl.wd().submit(new Runnable() { // from class: com.bytedance.sdk.component.mzz.mzz.rq.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (udVarExc.wd()) {
                                moVarJl.lnr(lnrVar3.exc()).qdl(strTvp, bArr);
                            }
                        }
                    });
                    return;
                } catch (Throwable th) {
                    th = th;
                    lnrVar2 = lnrVar3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            lnrVar2 = lnrVar;
        }
        qdl(1004, "net request failed!", th, lnrVar2);
    }

    private void qdl(int i2, String str, Throwable th, com.bytedance.sdk.component.mzz.lnr.lnr lnrVar) {
        lnrVar.qdl(new jpc(i2, str, th));
    }

    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public String qdl() {
        return "net_request";
    }
}
