package com.bytedance.sdk.component.fi.lr.lr;

import com.bytedance.sdk.component.fi.tan;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class fi implements di {
    @Override // com.bytedance.sdk.component.fi.lr.lr.di
    public boolean ri(com.bytedance.sdk.component.fi.lr.ik.ik ikVar, tan tanVar, com.bytedance.sdk.component.fi.lr.ik.ri riVar) {
        List<com.bytedance.sdk.component.fi.lr.ik.ik> copyOnWriteArrayList;
        String strTan = ikVar.tan();
        Map<String, List<com.bytedance.sdk.component.fi.lr.ik.ik>> mapJbs = ikVar.slm().jbs();
        ikVar.sf();
        ikVar.ri();
        synchronized (mapJbs) {
            try {
                copyOnWriteArrayList = mapJbs.get(strTan);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                    mapJbs.put(strTan, copyOnWriteArrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(ikVar);
            if (copyOnWriteArrayList.size() <= 1) {
                return true;
            }
            ikVar.sf();
            ikVar.ri();
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.fi.lr.lr.di
    public String ri() {
        return "check_duplicate";
    }
}
