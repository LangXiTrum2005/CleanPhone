package com.bytedance.sdk.component.mzz.mml.ud;

import com.bytedance.sdk.component.mzz.exc;
import com.bytedance.sdk.component.mzz.jl;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class lnr implements mo {
    private void ud(final com.bytedance.sdk.component.mzz.ud udVar, final com.bytedance.sdk.component.mzz.mml.lnr.mo moVar, final String str, final byte[] bArr) {
        if (udVar == null || !udVar.wd()) {
            return;
        }
        moVar.jpc().submit(new Runnable() { // from class: com.bytedance.sdk.component.mzz.mml.ud.lnr.1
            @Override // java.lang.Runnable
            public void run() {
                moVar.lnr(udVar).qdl(str, bArr);
            }
        });
    }

    @Override // com.bytedance.sdk.component.mzz.mml.ud.mo
    public boolean qdl(com.bytedance.sdk.component.mzz.mml.lnr.lnr lnrVar, exc excVar, com.bytedance.sdk.component.mzz.mml.lnr.qdl qdlVar) {
        com.bytedance.sdk.component.mzz.ud udVarJl = lnrVar.jl();
        com.bytedance.sdk.component.mzz.mml.lnr.mo moVarYt = lnrVar.yt();
        byte[] bArrQdl = null;
        if (udVarJl != null && moVarYt != null) {
            if (udVarJl.mo()) {
                if (excVar != null) {
                    excVar.qdl("data_cache", lnrVar);
                }
                jl jlVarUd = moVarYt.ud(udVarJl);
                bArrQdl = jlVarUd != null ? jlVarUd.qdl(lnrVar.tvp()) : null;
                if (excVar != null) {
                    excVar.ud("data_cache", lnrVar);
                }
                lnrVar.tvp();
                lnrVar.qdl();
            }
            if (udVarJl.wd() && bArrQdl == null) {
                if (excVar != null) {
                    excVar.qdl("disk_cache", lnrVar);
                }
                byte[] bArrQdl2 = qdl(udVarJl, moVarYt, lnrVar.tvp());
                if (bArrQdl2 != null) {
                    qdl(lnrVar.jl(), moVarYt, lnrVar.tvp(), bArrQdl2);
                }
                if (excVar != null) {
                    excVar.ud("disk_cache", lnrVar);
                }
                lnrVar.tvp();
                lnrVar.qdl();
                bArrQdl = bArrQdl2;
            }
        }
        if (moVarYt != null && bArrQdl == null) {
            if (excVar != null) {
                excVar.qdl("net_request", lnrVar);
            }
            bArrQdl = qdl(moVarYt, lnrVar, qdlVar);
            lnrVar.tvp();
            lnrVar.qdl();
            if (excVar != null) {
                excVar.ud("net_request", lnrVar);
            }
        }
        if (bArrQdl != null) {
            lnrVar.qdl(bArrQdl);
            return true;
        }
        lnrVar.tvp();
        lnrVar.qdl();
        return false;
    }

    @Override // com.bytedance.sdk.component.mzz.mml.ud.mo
    public String qdl() {
        return "data_intercept";
    }

    private byte[] qdl(com.bytedance.sdk.component.mzz.mml.lnr.mo moVar, com.bytedance.sdk.component.mzz.mml.lnr.lnr lnrVar, com.bytedance.sdk.component.mzz.mml.lnr.qdl qdlVar) {
        com.bytedance.sdk.component.mzz.mml mmlVarMml = moVar.mml();
        lnrVar.qdl(false);
        try {
            com.bytedance.sdk.component.mzz.mo moVarQdl = mmlVarMml.qdl(new com.bytedance.sdk.component.mzz.ud.ud(lnrVar.qdl(), false, false, lnrVar.exc()));
            if (moVarQdl == null) {
                qdlVar.qdl(1004, "call is empty", new Exception("call is empty"));
                return null;
            }
            int iUd = moVarQdl.ud();
            if (iUd == 200) {
                byte[] bArr = (byte[]) moVarQdl.lnr();
                if (bArr == null) {
                    qdlVar.qdl(iUd, moVarQdl.mml(), new Exception("net data is empty"));
                    return null;
                }
                qdl(lnrVar.jl(), moVar, lnrVar.tvp(), bArr);
                ud(lnrVar.jl(), moVar, lnrVar.tvp(), bArr);
                return bArr;
            }
            Object objLnr = moVarQdl.lnr();
            qdlVar.qdl(iUd, moVarQdl.mml(), objLnr instanceof Throwable ? (Throwable) objLnr : null);
            return null;
        } catch (Throwable th) {
            qdlVar.qdl(1004, "net request failed!", th);
            return null;
        }
    }

    private byte[] qdl(com.bytedance.sdk.component.mzz.ud udVar, com.bytedance.sdk.component.mzz.mml.lnr.mo moVar, String str) {
        moVar.lnr(udVar);
        Collection<com.bytedance.sdk.component.mzz.lnr> collectionLnr = moVar.lnr();
        if (collectionLnr == null) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.mzz.lnr> it = collectionLnr.iterator();
        while (it.hasNext()) {
            byte[] bArrQdl = it.next().qdl(str);
            if (bArrQdl != null) {
                return bArrQdl;
            }
        }
        return null;
    }

    private void qdl(com.bytedance.sdk.component.mzz.ud udVar, com.bytedance.sdk.component.mzz.mml.lnr.mo moVar, String str, byte[] bArr) {
        if (udVar == null || !udVar.mo()) {
            return;
        }
        moVar.ud(udVar).qdl(str, bArr);
    }
}
