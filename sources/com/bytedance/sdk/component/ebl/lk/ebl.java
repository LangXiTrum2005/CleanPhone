package com.bytedance.sdk.component.ebl.lk;

import com.bytedance.sdk.component.LD.Lxb.IeN;
import com.bytedance.sdk.component.LD.Lxb.NXR;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class ebl implements com.bytedance.sdk.component.LD.Lxb.OY {
    private int Lxb;

    public void Lxb(int i) {
        this.Lxb = i;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.OY
    public IeN Lxb(com.bytedance.sdk.component.LD.Lxb.OY.Lxb lxb) throws IOException {
        IeN ieNLxb;
        Exception e;
        NXR nxrLxb = lxb.Lxb();
        if (OY.Lxb().Lxb(this.Lxb).LD() != null) {
            OY.Lxb().Lxb(this.Lxb).LD().JXs();
        }
        String string = nxrLxb.LD().toString();
        String strLxb = OY.Lxb().Lxb(this.Lxb).Lxb(string);
        if (!string.equals(strLxb)) {
            nxrLxb = nxrLxb.QAg().LD(strLxb).LD();
        }
        IOException iOException = null;
        try {
            ieNLxb = lxb.Lxb(nxrLxb);
            try {
                if (ieNLxb.lk() == -1) {
                    OY.Lxb().Lxb(this.Lxb).Lxb(nxrLxb, new IOException());
                }
            } catch (Exception e2) {
                e = e2;
                IOException iOException2 = new IOException(e.getMessage());
                OY.Lxb().Lxb(this.Lxb).Lxb(nxrLxb, e);
                iOException = iOException2;
            }
        } catch (Exception e3) {
            ieNLxb = null;
            e = e3;
        }
        OY.Lxb().Lxb(this.Lxb).Lxb(nxrLxb, ieNLxb);
        if (iOException == null) {
            return ieNLxb == null ? lxb.Lxb(nxrLxb) : ieNLxb;
        }
        throw iOException;
    }
}
