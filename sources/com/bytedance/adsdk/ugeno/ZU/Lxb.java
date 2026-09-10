package com.bytedance.adsdk.ugeno.ZU;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Lxb implements ZU {
    @Override // com.bytedance.adsdk.ugeno.ZU.ZU
    public List<lk> Lxb() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new lk("slide") { // from class: com.bytedance.adsdk.ugeno.ZU.Lxb.1
            @Override // com.bytedance.adsdk.ugeno.ZU.lk
            public com.bytedance.adsdk.ugeno.ZU.lk.Lxb Lxb(Context context) {
                return new com.bytedance.adsdk.ugeno.ZU.lk.lk(context);
            }
        });
        arrayList.add(new lk("tap") { // from class: com.bytedance.adsdk.ugeno.ZU.Lxb.2
            @Override // com.bytedance.adsdk.ugeno.ZU.lk
            public com.bytedance.adsdk.ugeno.ZU.lk.Lxb Lxb(Context context) {
                return new com.bytedance.adsdk.ugeno.ZU.lk.ZU(context);
            }
        });
        arrayList.add(new lk("timer") { // from class: com.bytedance.adsdk.ugeno.ZU.Lxb.3
            @Override // com.bytedance.adsdk.ugeno.ZU.lk
            public com.bytedance.adsdk.ugeno.ZU.lk.Lxb Lxb(Context context) {
                return new com.bytedance.adsdk.ugeno.ZU.lk.JXs(context);
            }
        });
        return arrayList;
    }
}
