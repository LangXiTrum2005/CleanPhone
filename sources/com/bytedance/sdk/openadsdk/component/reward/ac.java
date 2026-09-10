package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ac {
    private static final Map<Integer, ri<?, ?>> ri = new ConcurrentHashMap();

    private static ri<?, ?> lr(Context context, int i) {
        if (i == 7) {
            return new bu(context);
        }
        if (i == 8) {
            return new xha(context);
        }
        throw new IllegalArgumentException("Unsupported ad type: ".concat(String.valueOf(i)));
    }

    public static ri<?, ?> ri(Context context, int i) {
        ri<?, ?> riVarLr;
        Map<Integer, ri<?, ?>> map = ri;
        ri<?, ?> riVar = map.get(Integer.valueOf(i));
        if (riVar != null) {
            return riVar;
        }
        synchronized (ac.class) {
            try {
                riVarLr = map.get(Integer.valueOf(i));
                if (riVarLr == null) {
                    riVarLr = lr(context, i);
                    map.put(Integer.valueOf(i), riVarLr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return riVarLr;
    }
}
