package com.bytedance.sdk.openadsdk.core;

import android.content.Intent;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class dw {
    private static dw ri;
    private com.bytedance.sdk.openadsdk.ri.ik.lr di;
    private com.bytedance.sdk.openadsdk.ri.fi.ri fi;
    private com.bytedance.sdk.openadsdk.ri.ka.lr xha;
    private final AtomicInteger lr = new AtomicInteger(0);
    private Map<Integer, com.bytedance.sdk.openadsdk.core.model.ri> ik = new ConcurrentHashMap();
    private final ConcurrentHashMap<String, ri<?>> ka = new ConcurrentHashMap<>();
    private final Map<String, lr> mj = new HashMap();

    public interface lr {
        void ri();
    }

    public static class ri<T> {
        public final long ik = System.currentTimeMillis();
        public final String lr;
        public final T ri;

        public ri(T t, String str) {
            this.ri = t;
            this.lr = str;
        }
    }

    private dw() {
    }

    public void fi() {
        this.fi = null;
        this.di = null;
        this.xha = null;
    }

    public com.bytedance.sdk.openadsdk.ri.ik.lr ik() {
        return this.di;
    }

    public com.bytedance.sdk.openadsdk.ri.ka.lr ka() {
        return this.xha;
    }

    public com.bytedance.sdk.openadsdk.ri.fi.ri lr() {
        return this.fi;
    }

    public <T> void ri(String str, T t) {
        if (TextUtils.isEmpty(str) || t == null) {
            return;
        }
        this.ka.put(str, new ri<>(t, str));
    }

    private static String ka(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (wjvVar == null) {
            return null;
        }
        String strJf = wjvVar.jf();
        return TextUtils.isEmpty(strJf) ? String.valueOf(wjvVar.hashCode()) : strJf;
    }

    public void ik(int i) {
        this.ik.remove(Integer.valueOf(i));
    }

    public com.bytedance.sdk.openadsdk.core.model.ri lr(int i) {
        return this.ik.remove(Integer.valueOf(i));
    }

    public void ik(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        String strKa = ka(wjvVar);
        if (TextUtils.isEmpty(strKa)) {
            return;
        }
        this.mj.remove(strKa);
    }

    public void lr(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        lr lrVar;
        if (wjvVar == null) {
            return;
        }
        String strKa = ka(wjvVar);
        if (TextUtils.isEmpty(strKa) || (lrVar = this.mj.get(strKa)) == null) {
            return;
        }
        lrVar.ri();
    }

    public <T> T ri(String str, Class<T> cls) {
        ri<?> riVar;
        if (TextUtils.isEmpty(str) || cls == null || (riVar = this.ka.get(str)) == null || !cls.isInstance(riVar.ri)) {
            return null;
        }
        return cls.cast(riVar.ri);
    }

    public ri<?> ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.ka.remove(str);
    }

    public static dw ri() {
        if (ri == null) {
            ri = new dw();
        }
        return ri;
    }

    public com.bytedance.sdk.openadsdk.core.model.wjv ri(int i) {
        com.bytedance.sdk.openadsdk.core.model.ri riVarRemove = this.ik.remove(Integer.valueOf(i));
        if (riVarRemove != null) {
            return riVarRemove.co();
        }
        return null;
    }

    public int ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        com.bytedance.sdk.openadsdk.core.model.ri riVar = new com.bytedance.sdk.openadsdk.core.model.ri();
        riVar.lr(wjvVar);
        return ri(riVar);
    }

    public void ri(com.bytedance.sdk.openadsdk.ri.ik.lr lrVar) {
        this.di = lrVar;
    }

    public void ri(com.bytedance.sdk.openadsdk.ri.fi.ri riVar) {
        this.fi = riVar;
    }

    public void ri(com.bytedance.sdk.openadsdk.ri.ka.lr lrVar) {
        this.xha = lrVar;
    }

    public int ri(com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        int iIncrementAndGet = this.lr.incrementAndGet();
        this.ik.put(Integer.valueOf(iIncrementAndGet), riVar);
        return iIncrementAndGet;
    }

    public static int ri(Intent intent) {
        if (intent != null) {
            return intent.getIntExtra("meta_index", -1);
        }
        return -1;
    }

    public void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, lr lrVar) {
        if (wjvVar == null || lrVar == null) {
            return;
        }
        String strKa = ka(wjvVar);
        if (TextUtils.isEmpty(strKa)) {
            return;
        }
        this.mj.put(strKa, lrVar);
    }

    public void ri(String str, boolean z, boolean z2) {
        boolean z3 = z || !z2;
        boolean zVr = qt.lr().vr();
        if (zVr) {
            com.bytedance.sdk.component.utils.ac.ri("BVA", "cleanListener: isFinish = " + z + ",isConfigChange = " + z2);
        }
        if (z3) {
            ri(str, zVr);
        } else if (z || !z2) {
            ri(str, zVr);
        }
    }

    private void ri(String str, boolean z) {
        ri<?> riVarRi = ri(str);
        if (z) {
            if (riVarRi == null) {
                com.bytedance.sdk.component.utils.ac.ri("BVA", "cleanListener: removeCallback failed,listenerKey=".concat(String.valueOf(str)));
                return;
            }
            com.bytedance.sdk.component.utils.ac.ri("BVA", "cleanListener: removeCallback success,listenerKey=" + str + ",callback=" + riVarRi.ri);
        }
    }
}
