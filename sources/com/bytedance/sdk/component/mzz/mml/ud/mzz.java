package com.bytedance.sdk.component.mzz.mml.ud;

import com.bytedance.sdk.component.mzz.exc;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class mzz implements mo {
    @Override // com.bytedance.sdk.component.mzz.mml.ud.mo
    public boolean qdl(com.bytedance.sdk.component.mzz.mml.lnr.lnr lnrVar, exc excVar, com.bytedance.sdk.component.mzz.mml.lnr.qdl qdlVar) {
        List<com.bytedance.sdk.component.mzz.mml.lnr.lnr> copyOnWriteArrayList;
        String strAaj = lnrVar.aaj();
        Map<String, List<com.bytedance.sdk.component.mzz.mml.lnr.lnr>> mapTvp = lnrVar.yt().tvp();
        lnrVar.fs();
        lnrVar.qdl();
        synchronized (mapTvp) {
            try {
                copyOnWriteArrayList = mapTvp.get(strAaj);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                    mapTvp.put(strAaj, copyOnWriteArrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(lnrVar);
            if (copyOnWriteArrayList.size() <= 1) {
                return true;
            }
            lnrVar.fs();
            lnrVar.qdl();
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.mzz.mml.ud.mo
    public String qdl() {
        return "check_duplicate";
    }
}
