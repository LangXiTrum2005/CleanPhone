package com.bytedance.adsdk.ri.lr.ik.ri;

import com.bytedance.adsdk.ri.lr.lr.ri.ihz;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends di {
    @Override // com.bytedance.adsdk.ri.lr.ik.ri.di
    public int ri(String str, int i, Deque<com.bytedance.adsdk.ri.lr.lr.ri> deque, com.bytedance.adsdk.ri.lr.ik.ri riVar) {
        if (',' != ri(i, str)) {
            return riVar.ri(str, i, deque);
        }
        deque.push(new ihz(com.bytedance.adsdk.ri.lr.ka.ka.COMMA));
        return i + 1;
    }
}
