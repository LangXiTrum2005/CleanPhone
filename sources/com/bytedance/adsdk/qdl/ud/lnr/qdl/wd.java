package com.bytedance.adsdk.qdl.ud.lnr.qdl;

import com.bytedance.adsdk.qdl.ud.ud.qdl.bjy;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public class wd extends mo {
    private boolean qdl(String str, int i2, Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> deque) {
        if ('-' != qdl(i2, str)) {
            return com.bytedance.adsdk.qdl.ud.mzz.qdl.lnr(qdl(i2, str));
        }
        if (deque.peek() != null && !com.bytedance.adsdk.qdl.ud.mml.lnr.qdl(deque.peek().qdl())) {
            return false;
        }
        if (com.bytedance.adsdk.qdl.ud.mzz.qdl.lnr(qdl(i2 + 1, str))) {
            return true;
        }
        throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i2));
    }

    @Override // com.bytedance.adsdk.qdl.ud.lnr.qdl.mo
    public int qdl(String str, int i2, Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> deque, com.bytedance.adsdk.qdl.ud.lnr.qdl qdlVar) {
        char cQdl;
        if (!qdl(str, i2, deque)) {
            return qdlVar.qdl(str, i2, deque);
        }
        int i3 = qdl(i2, str) == '-' ? i2 + 1 : i2;
        boolean z2 = false;
        while (true) {
            cQdl = qdl(i3, str);
            if (!com.bytedance.adsdk.qdl.ud.mzz.qdl.lnr(cQdl) && (z2 || cQdl != '.')) {
                break;
            }
            i3++;
            if (cQdl == '.') {
                z2 = true;
            }
        }
        if (cQdl != '.') {
            deque.push(new bjy(str.substring(i2, i3)));
            return i3;
        }
        throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i2, i3));
    }
}
