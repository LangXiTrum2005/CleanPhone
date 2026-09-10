package com.bytedance.adsdk.qdl.ud.lnr.qdl;

import android.support.v4.media.a;
import com.bytedance.adsdk.qdl.ud.ud.qdl.jtx;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public class jpc extends mo {
    @Override // com.bytedance.adsdk.qdl.ud.lnr.qdl.mo
    public int qdl(String str, int i2, Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> deque, com.bytedance.adsdk.qdl.ud.lnr.qdl qdlVar) {
        if (!com.bytedance.adsdk.qdl.ud.mzz.qdl.mml(qdl(i2, str))) {
            return qdlVar.qdl(str, i2, deque);
        }
        int i3 = i2 + 1;
        String str2 = new String(new char[]{qdl(i2, str), qdl(i3, str)});
        if (com.bytedance.adsdk.qdl.ud.mml.lnr.qdl(str2) != null) {
            deque.push(new jtx(com.bytedance.adsdk.qdl.ud.mml.lnr.qdl(str2)));
            return i2 + 2;
        }
        String strValueOf = String.valueOf(qdl(i2, str));
        if (com.bytedance.adsdk.qdl.ud.mml.lnr.qdl(strValueOf) != null) {
            deque.push(new jtx(com.bytedance.adsdk.qdl.ud.mml.lnr.qdl(strValueOf)));
            return i3;
        }
        StringBuilder sbY = a.y("Unrecognized:", strValueOf, "examine:");
        sbY.append(str.substring(0, i2));
        throw new IllegalArgumentException(sbY.toString());
    }
}
