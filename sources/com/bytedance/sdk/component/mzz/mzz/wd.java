package com.bytedance.sdk.component.mzz.mzz;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class wd extends qdl {
    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public void qdl(com.bytedance.sdk.component.mzz.lnr.lnr lnrVar) {
        List<com.bytedance.sdk.component.mzz.lnr.lnr> linkedList;
        String strOth = lnrVar.oth();
        Map<String, List<com.bytedance.sdk.component.mzz.lnr.lnr>> mapJpc = lnrVar.jl().jpc();
        synchronized (mapJpc) {
            try {
                linkedList = mapJpc.get(strOth);
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (linkedList) {
            try {
                linkedList.add(lnrVar);
                mapJpc.put(strOth, linkedList);
                if (linkedList.size() <= 1) {
                    lnrVar.qdl(new mml());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public String qdl() {
        return "check_duplicate";
    }
}
