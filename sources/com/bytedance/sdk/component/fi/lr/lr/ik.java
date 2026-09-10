package com.bytedance.sdk.component.fi.lr.lr;

import com.bytedance.sdk.component.fi.nr;
import com.bytedance.sdk.component.fi.tan;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class ik implements di {
    private void lr(final com.bytedance.sdk.component.fi.lr lrVar, final com.bytedance.sdk.component.fi.lr.ik.di diVar, final String str, final byte[] bArr) {
        if (lrVar == null || !lrVar.xha()) {
            return;
        }
        diVar.mj().submit(new Runnable() { // from class: com.bytedance.sdk.component.fi.lr.lr.ik.1
            @Override // java.lang.Runnable
            public void run() {
                diVar.ik(lrVar).ri(str, bArr);
            }
        });
    }

    @Override // com.bytedance.sdk.component.fi.lr.lr.di
    public boolean ri(com.bytedance.sdk.component.fi.lr.ik.ik ikVar, tan tanVar, com.bytedance.sdk.component.fi.lr.ik.ri riVar) {
        com.bytedance.sdk.component.fi.lr lrVarBu = ikVar.bu();
        com.bytedance.sdk.component.fi.lr.ik.di diVarSlm = ikVar.slm();
        byte[] bArrRi = null;
        if (lrVarBu != null && diVarSlm != null) {
            if (lrVarBu.di()) {
                if (tanVar != null) {
                    tanVar.ri("data_cache", ikVar);
                }
                nr nrVarLr = diVarSlm.lr(lrVarBu);
                bArrRi = nrVarLr != null ? nrVarLr.ri(ikVar.xha()) : null;
                if (tanVar != null) {
                    tanVar.lr("data_cache", ikVar);
                }
                ikVar.xha();
                ikVar.ri();
            }
            if (lrVarBu.xha() && bArrRi == null) {
                if (tanVar != null) {
                    tanVar.ri("disk_cache", ikVar);
                }
                byte[] bArrRi2 = ri(lrVarBu, diVarSlm, ikVar.xha());
                if (bArrRi2 != null) {
                    ri(ikVar.bu(), diVarSlm, ikVar.xha(), bArrRi2);
                }
                if (tanVar != null) {
                    tanVar.lr("disk_cache", ikVar);
                }
                ikVar.xha();
                ikVar.ri();
                bArrRi = bArrRi2;
            }
        }
        if (diVarSlm != null && bArrRi == null) {
            if (tanVar != null) {
                tanVar.ri("net_request", ikVar);
            }
            bArrRi = ri(diVarSlm, ikVar, riVar);
            ikVar.xha();
            ikVar.ri();
            if (tanVar != null) {
                tanVar.lr("net_request", ikVar);
            }
        }
        if (bArrRi != null) {
            ikVar.ri(bArrRi);
            return true;
        }
        ikVar.xha();
        ikVar.ri();
        return false;
    }

    @Override // com.bytedance.sdk.component.fi.lr.lr.di
    public String ri() {
        return "data_intercept";
    }

    private byte[] ri(com.bytedance.sdk.component.fi.lr.ik.di diVar, com.bytedance.sdk.component.fi.lr.ik.ik ikVar, com.bytedance.sdk.component.fi.lr.ik.ri riVar) {
        com.bytedance.sdk.component.fi.ka kaVarFi = diVar.fi();
        ikVar.ri(false);
        try {
            com.bytedance.sdk.component.fi.di diVarRi = kaVarFi.ri(new com.bytedance.sdk.component.fi.ri.lr(ikVar.ri(), false, false, ikVar.nr()));
            if (diVarRi == null) {
                riVar.ri(1004, "call is empty", new Exception("call is empty"));
                return null;
            }
            int iRi = diVarRi.ri();
            if (iRi == 200) {
                byte[] bArr = (byte[]) diVarRi.lr();
                if (bArr == null) {
                    riVar.ri(iRi, diVarRi.ik(), new Exception("net data is empty"));
                    return null;
                }
                ri(ikVar.bu(), diVar, ikVar.xha(), bArr);
                lr(ikVar.bu(), diVar, ikVar.xha(), bArr);
                return bArr;
            }
            Object objLr = diVarRi.lr();
            riVar.ri(iRi, diVarRi.ik(), objLr instanceof Throwable ? (Throwable) objLr : null);
            return null;
        } catch (Throwable th) {
            riVar.ri(1004, "net request failed!", th);
            return null;
        }
    }

    private byte[] ri(com.bytedance.sdk.component.fi.lr lrVar, com.bytedance.sdk.component.fi.lr.ik.di diVar, String str) {
        diVar.ik(lrVar);
        Collection<com.bytedance.sdk.component.fi.ik> collectionKa = diVar.ka();
        if (collectionKa == null) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.fi.ik> it = collectionKa.iterator();
        while (it.hasNext()) {
            byte[] bArrRi = it.next().ri(str);
            if (bArrRi != null) {
                return bArrRi;
            }
        }
        return null;
    }

    private void ri(com.bytedance.sdk.component.fi.lr lrVar, com.bytedance.sdk.component.fi.lr.ik.di diVar, String str, byte[] bArr) {
        if (lrVar == null || !lrVar.di()) {
            return;
        }
        diVar.lr(lrVar).ri(str, bArr);
    }
}
