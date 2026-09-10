package com.bytedance.adsdk.ugeno.ka;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class fi implements ik {
    @Override // com.bytedance.adsdk.ugeno.ka.ik
    public List<lr> ri() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new lr("update") { // from class: com.bytedance.adsdk.ugeno.ka.fi.1
            @Override // com.bytedance.adsdk.ugeno.ka.lr
            public com.bytedance.adsdk.ugeno.ka.lr.ri ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, String str, di.ri riVar) {
                return new com.bytedance.adsdk.ugeno.ka.lr.fi(ikVar, str, riVar);
            }
        });
        arrayList.add(new lr("emit") { // from class: com.bytedance.adsdk.ugeno.ka.fi.2
            @Override // com.bytedance.adsdk.ugeno.ka.lr
            public com.bytedance.adsdk.ugeno.ka.lr.ri ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, String str, di.ri riVar) {
                return new com.bytedance.adsdk.ugeno.ka.lr.lr(ikVar, str, riVar);
            }
        });
        arrayList.add(new lr("startAnimate") { // from class: com.bytedance.adsdk.ugeno.ka.fi.3
            @Override // com.bytedance.adsdk.ugeno.ka.lr
            public com.bytedance.adsdk.ugeno.ka.lr.ri ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, String str, di.ri riVar) {
                return new com.bytedance.adsdk.ugeno.ka.lr.ka(ikVar, str, riVar);
            }
        });
        return arrayList;
    }
}
