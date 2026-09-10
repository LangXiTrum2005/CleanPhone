package com.bytedance.adsdk.ugeno.ka;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements mj {
    @Override // com.bytedance.adsdk.ugeno.ka.mj
    public List<xha> ri() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xha("slide") { // from class: com.bytedance.adsdk.ugeno.ka.ri.1
            @Override // com.bytedance.adsdk.ugeno.ka.xha
            public com.bytedance.adsdk.ugeno.ka.ka.ik ri(Context context) {
                return new com.bytedance.adsdk.ugeno.ka.ka.fi(context);
            }
        });
        arrayList.add(new xha("tap") { // from class: com.bytedance.adsdk.ugeno.ka.ri.2
            @Override // com.bytedance.adsdk.ugeno.ka.xha
            public com.bytedance.adsdk.ugeno.ka.ka.ik ri(Context context) {
                return new com.bytedance.adsdk.ugeno.ka.ka.jbs(context);
            }
        });
        arrayList.add(new xha("timer") { // from class: com.bytedance.adsdk.ugeno.ka.ri.3
            @Override // com.bytedance.adsdk.ugeno.ka.xha
            public com.bytedance.adsdk.ugeno.ka.ka.ik ri(Context context) {
                return new com.bytedance.adsdk.ugeno.ka.ka.qt(context);
            }
        });
        arrayList.add(new xha("touchStart") { // from class: com.bytedance.adsdk.ugeno.ka.ri.4
            @Override // com.bytedance.adsdk.ugeno.ka.xha
            public com.bytedance.adsdk.ugeno.ka.ka.ik ri(Context context) {
                return new com.bytedance.adsdk.ugeno.ka.ka.co(context);
            }
        });
        arrayList.add(new xha("touchEnd") { // from class: com.bytedance.adsdk.ugeno.ka.ri.5
            @Override // com.bytedance.adsdk.ugeno.ka.xha
            public com.bytedance.adsdk.ugeno.ka.ka.ik ri(Context context) {
                return new com.bytedance.adsdk.ugeno.ka.ka.sf(context);
            }
        });
        arrayList.add(new xha("animateState") { // from class: com.bytedance.adsdk.ugeno.ka.ri.6
            @Override // com.bytedance.adsdk.ugeno.ka.xha
            public com.bytedance.adsdk.ugeno.ka.ka.ik ri(Context context) {
                return new com.bytedance.adsdk.ugeno.ka.ka.lr(context);
            }
        });
        return arrayList;
    }
}
