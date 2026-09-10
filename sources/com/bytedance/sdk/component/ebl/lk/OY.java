package com.bytedance.sdk.component.ebl.lk;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class OY {
    private static HashMap<Integer, lc> LD;
    private static volatile OY Lxb;
    private static HashMap<Integer, Lxb> lk;

    private OY() {
        LD = new HashMap<>();
        lk = new HashMap<>();
    }

    public static synchronized OY Lxb() {
        try {
            if (Lxb == null) {
                synchronized (OY.class) {
                    try {
                        if (Lxb == null) {
                            Lxb = new OY();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return Lxb;
    }

    public lc Lxb(int i) {
        lc lcVar = LD.get(Integer.valueOf(i));
        if (lcVar != null) {
            return lcVar;
        }
        lc lcVar2 = new lc(i);
        LD.put(Integer.valueOf(i), lcVar2);
        return lcVar2;
    }

    public Lxb Lxb(int i, Context context) {
        Lxb lxb = lk.get(Integer.valueOf(i));
        if (lxb != null) {
            return lxb;
        }
        Lxb lxb2 = new Lxb(context, i);
        lk.put(Integer.valueOf(i), lxb2);
        return lxb2;
    }
}
