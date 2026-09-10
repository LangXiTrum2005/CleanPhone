package com.bytedance.sdk.component.JXs.ZU;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ebl extends Lxb {
    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public void Lxb(com.bytedance.sdk.component.JXs.lk.lk lkVar) {
        List<com.bytedance.sdk.component.JXs.lk.lk> linkedList;
        String strEK = lkVar.eK();
        Map<String, List<com.bytedance.sdk.component.JXs.lk.lk>> mapEbl = lkVar.tD().ebl();
        synchronized (mapEbl) {
            try {
                linkedList = mapEbl.get(strEK);
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (linkedList) {
            try {
                linkedList.add(lkVar);
                mapEbl.put(strEK, linkedList);
                if (linkedList.size() <= 1) {
                    lkVar.Lxb(new ZU());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public String Lxb() {
        return "check_duplicate";
    }
}
