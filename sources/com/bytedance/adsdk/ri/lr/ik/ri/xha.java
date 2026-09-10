package com.bytedance.adsdk.ri.lr.ik.ri;

import com.bytedance.adsdk.ri.lr.lr.ri.vr;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public class xha extends di {
    private boolean ri(String str, int i, Deque<com.bytedance.adsdk.ri.lr.lr.ri> deque) {
        if ('-' != ri(i, str)) {
            return com.bytedance.adsdk.ri.lr.fi.ri.ik(ri(i, str));
        }
        if (deque.peek() != null && !com.bytedance.adsdk.ri.lr.ka.ik.ri(deque.peek().ri())) {
            return false;
        }
        if (com.bytedance.adsdk.ri.lr.fi.ri.ik(ri(i + 1, str))) {
            return true;
        }
        throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i));
    }

    @Override // com.bytedance.adsdk.ri.lr.ik.ri.di
    public int ri(String str, int i, Deque<com.bytedance.adsdk.ri.lr.lr.ri> deque, com.bytedance.adsdk.ri.lr.ik.ri riVar) {
        char cRi;
        if (!ri(str, i, deque)) {
            return riVar.ri(str, i, deque);
        }
        int i2 = ri(i, str) == '-' ? i + 1 : i;
        boolean z = false;
        while (true) {
            cRi = ri(i2, str);
            if (!com.bytedance.adsdk.ri.lr.fi.ri.ik(cRi) && (z || cRi != '.')) {
                break;
            }
            i2++;
            if (cRi == '.') {
                z = true;
            }
        }
        if (cRi != '.') {
            deque.push(new vr(str.substring(i, i2)));
            return i2;
        }
        throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i, i2));
    }
}
