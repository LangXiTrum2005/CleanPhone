package com.bytedance.adsdk.qdl.ud.lnr.qdl;

import com.bytedance.adsdk.qdl.ud.ud.qdl.oth;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public class lnr extends mo {
    @Override // com.bytedance.adsdk.qdl.ud.lnr.qdl.mo
    public int qdl(String str, int i2, Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> deque, com.bytedance.adsdk.qdl.ud.lnr.qdl qdlVar) {
        char cQdl = qdl(i2, str);
        return (com.bytedance.adsdk.qdl.ud.mzz.qdl.ud(cQdl) || cQdl == '$') ? qdl(str, i2, deque) : qdlVar.qdl(str, i2, deque);
    }

    private int qdl(String str, int i2, Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> deque) {
        int i3;
        int i4 = 0;
        while (true) {
            i3 = i4 + i2;
            char cQdl = qdl(i3, str);
            if (!com.bytedance.adsdk.qdl.ud.mzz.qdl.ud(cQdl) && !com.bytedance.adsdk.qdl.ud.mzz.qdl.lnr(cQdl) && '.' != cQdl && '[' != cQdl && ']' != cQdl && '_' != cQdl && '$' != cQdl) {
                break;
            }
            i4++;
        }
        String strSubstring = str.substring(i2, i3);
        if (com.bytedance.adsdk.qdl.ud.mml.qdl.qdl(strSubstring) != null) {
            deque.push(new com.bytedance.adsdk.qdl.ud.ud.qdl.wd(strSubstring));
            return i3;
        }
        deque.push(new oth(strSubstring));
        return i3;
    }
}
