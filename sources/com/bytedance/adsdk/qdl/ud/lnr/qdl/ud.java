package com.bytedance.adsdk.qdl.ud.lnr.qdl;

import com.bytedance.adsdk.qdl.ud.ud.qdl.aaj;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public class ud extends mo {
    @Override // com.bytedance.adsdk.qdl.ud.lnr.qdl.mo
    public int qdl(String str, int i2, Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> deque, com.bytedance.adsdk.qdl.ud.lnr.qdl qdlVar) {
        if ('\'' != qdl(i2, str)) {
            return qdlVar.qdl(str, i2, deque);
        }
        int i3 = i2 + 1;
        int length = str.length();
        int i4 = i3;
        while (i4 < length && qdl(i4, str) != '\'') {
            i4++;
        }
        if (qdl(i4, str) != '\'') {
            throw new com.bytedance.adsdk.qdl.qdl.qdl("String expression not surrounded by '", str.substring(i2));
        }
        deque.push(new aaj(str.substring(i3, i4)));
        return i4 + 1;
    }
}
