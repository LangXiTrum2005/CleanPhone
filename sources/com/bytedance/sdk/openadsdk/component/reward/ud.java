package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.utils.jl;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.fco;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ud extends com.bytedance.sdk.component.jpc.jpc {
    private final List<? extends com.bytedance.sdk.component.jpc.jpc> qdl;

    public ud(String str, List<? extends com.bytedance.sdk.component.jpc.jpc> list) {
        super(str);
        this.qdl = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends com.bytedance.sdk.component.jpc.jpc> list;
        if (jl.lnr(yt.qdl()) != 0 && (list = this.qdl) != null) {
            Iterator<? extends com.bytedance.sdk.component.jpc.jpc> it = list.iterator();
            while (it.hasNext()) {
                fco.qdl(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.tvp.qdl().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
