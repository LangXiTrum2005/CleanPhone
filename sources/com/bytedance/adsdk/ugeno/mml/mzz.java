package com.bytedance.adsdk.ugeno.mml;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class mzz implements lnr {
    @Override // com.bytedance.adsdk.ugeno.mml.lnr
    public List<ud> qdl() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ud("update") { // from class: com.bytedance.adsdk.ugeno.mml.mzz.1
            @Override // com.bytedance.adsdk.ugeno.mml.ud
            public com.bytedance.adsdk.ugeno.mml.ud.qdl qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, mo.qdl qdlVar) {
                return new com.bytedance.adsdk.ugeno.mml.ud.mzz(lnrVar, str, qdlVar);
            }
        });
        arrayList.add(new ud("emit") { // from class: com.bytedance.adsdk.ugeno.mml.mzz.2
            @Override // com.bytedance.adsdk.ugeno.mml.ud
            public com.bytedance.adsdk.ugeno.mml.ud.qdl qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, mo.qdl qdlVar) {
                return new com.bytedance.adsdk.ugeno.mml.ud.ud(lnrVar, str, qdlVar);
            }
        });
        arrayList.add(new ud("startAnimate") { // from class: com.bytedance.adsdk.ugeno.mml.mzz.3
            @Override // com.bytedance.adsdk.ugeno.mml.ud
            public com.bytedance.adsdk.ugeno.mml.ud.qdl qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, mo.qdl qdlVar) {
                return new com.bytedance.adsdk.ugeno.mml.ud.mml(lnrVar, str, qdlVar);
            }
        });
        return arrayList;
    }
}
