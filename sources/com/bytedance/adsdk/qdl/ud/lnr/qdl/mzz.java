package com.bytedance.adsdk.qdl.ud.lnr.qdl;

import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public class mzz extends mo {
    @Override // com.bytedance.adsdk.qdl.ud.lnr.qdl.mo
    public int qdl(String str, int i2, Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> deque, com.bytedance.adsdk.qdl.ud.lnr.qdl qdlVar) {
        char cQdl;
        int i3 = i2;
        while (true) {
            cQdl = qdl(i3, str);
            if (!com.bytedance.adsdk.qdl.ud.mzz.qdl.ud(cQdl) && !com.bytedance.adsdk.qdl.ud.mzz.qdl.lnr(cQdl)) {
                break;
            }
            i3++;
        }
        if (cQdl != '(') {
            return qdlVar.qdl(str, i2, deque);
        }
        deque.push(new com.bytedance.adsdk.qdl.ud.ud.qdl.to(str.substring(i2, i3)));
        return i3 + 1;
    }
}
