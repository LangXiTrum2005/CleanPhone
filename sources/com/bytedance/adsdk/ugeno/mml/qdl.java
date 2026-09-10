package com.bytedance.adsdk.ugeno.mml;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class qdl implements jpc {
    @Override // com.bytedance.adsdk.ugeno.mml.jpc
    public List<wd> qdl() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new wd("slide") { // from class: com.bytedance.adsdk.ugeno.mml.qdl.1
            @Override // com.bytedance.adsdk.ugeno.mml.wd
            public com.bytedance.adsdk.ugeno.mml.mml.lnr qdl(Context context) {
                return new com.bytedance.adsdk.ugeno.mml.mml.mzz(context);
            }
        });
        arrayList.add(new wd("tap") { // from class: com.bytedance.adsdk.ugeno.mml.qdl.2
            @Override // com.bytedance.adsdk.ugeno.mml.wd
            public com.bytedance.adsdk.ugeno.mml.mml.lnr qdl(Context context) {
                return new com.bytedance.adsdk.ugeno.mml.mml.tvp(context);
            }
        });
        arrayList.add(new wd("timer") { // from class: com.bytedance.adsdk.ugeno.mml.qdl.3
            @Override // com.bytedance.adsdk.ugeno.mml.wd
            public com.bytedance.adsdk.ugeno.mml.mml.lnr qdl(Context context) {
                return new com.bytedance.adsdk.ugeno.mml.mml.to(context);
            }
        });
        arrayList.add(new wd("touchStart") { // from class: com.bytedance.adsdk.ugeno.mml.qdl.4
            @Override // com.bytedance.adsdk.ugeno.mml.wd
            public com.bytedance.adsdk.ugeno.mml.mml.lnr qdl(Context context) {
                return new com.bytedance.adsdk.ugeno.mml.mml.fs(context);
            }
        });
        arrayList.add(new wd("touchEnd") { // from class: com.bytedance.adsdk.ugeno.mml.qdl.5
            @Override // com.bytedance.adsdk.ugeno.mml.wd
            public com.bytedance.adsdk.ugeno.mml.mml.lnr qdl(Context context) {
                return new com.bytedance.adsdk.ugeno.mml.mml.rq(context);
            }
        });
        arrayList.add(new wd("animateState") { // from class: com.bytedance.adsdk.ugeno.mml.qdl.6
            @Override // com.bytedance.adsdk.ugeno.mml.wd
            public com.bytedance.adsdk.ugeno.mml.mml.lnr qdl(Context context) {
                return new com.bytedance.adsdk.ugeno.mml.mml.ud(context);
            }
        });
        return arrayList;
    }
}
