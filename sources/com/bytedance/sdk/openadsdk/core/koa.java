package com.bytedance.sdk.openadsdk.core;

import android.content.Intent;
import android.support.v4.media.a;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class koa {
    private static koa qdl;
    private com.bytedance.sdk.openadsdk.qdl.lnr.ud mo;
    private com.bytedance.sdk.openadsdk.qdl.mzz.qdl mzz;
    private com.bytedance.sdk.openadsdk.qdl.mml.ud wd;
    private final AtomicInteger ud = new AtomicInteger(0);
    private Map<Integer, com.bytedance.sdk.openadsdk.core.model.qdl> lnr = new ConcurrentHashMap();
    private final ConcurrentHashMap<String, qdl<?>> mml = new ConcurrentHashMap<>();
    private final Map<String, ud> jpc = new HashMap();

    public static class qdl<T> {
        public final long lnr = System.currentTimeMillis();
        public final T qdl;
        public final String ud;

        public qdl(T t, String str) {
            this.qdl = t;
            this.ud = str;
        }
    }

    public interface ud {
        void qdl();
    }

    private koa() {
    }

    public com.bytedance.sdk.openadsdk.qdl.lnr.ud lnr() {
        return this.mo;
    }

    public com.bytedance.sdk.openadsdk.qdl.mml.ud mml() {
        return this.wd;
    }

    public void mzz() {
        this.mzz = null;
        this.mo = null;
        this.wd = null;
    }

    public <T> void qdl(String str, T t) {
        if (TextUtils.isEmpty(str) || t == null) {
            return;
        }
        this.mml.put(str, new qdl<>(t, str));
    }

    public com.bytedance.sdk.openadsdk.qdl.mzz.qdl ud() {
        return this.mzz;
    }

    private static String mml(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (ljhVar == null) {
            return null;
        }
        String strCev = ljhVar.cev();
        return TextUtils.isEmpty(strCev) ? String.valueOf(ljhVar.hashCode()) : strCev;
    }

    public void lnr(int i2) {
        this.lnr.remove(Integer.valueOf(i2));
    }

    public com.bytedance.sdk.openadsdk.core.model.qdl ud(int i2) {
        return this.lnr.remove(Integer.valueOf(i2));
    }

    public void lnr(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        String strMml = mml(ljhVar);
        if (TextUtils.isEmpty(strMml)) {
            return;
        }
        this.jpc.remove(strMml);
    }

    public <T> T qdl(String str, Class<T> cls) {
        qdl<?> qdlVar;
        if (TextUtils.isEmpty(str) || cls == null || (qdlVar = this.mml.get(str)) == null || !cls.isInstance(qdlVar.qdl)) {
            return null;
        }
        return cls.cast(qdlVar.qdl);
    }

    public void ud(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        ud udVar;
        if (ljhVar == null) {
            return;
        }
        String strMml = mml(ljhVar);
        if (TextUtils.isEmpty(strMml) || (udVar = this.jpc.get(strMml)) == null) {
            return;
        }
        udVar.qdl();
    }

    public qdl<?> qdl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mml.remove(str);
    }

    public static koa qdl() {
        if (qdl == null) {
            qdl = new koa();
        }
        return qdl;
    }

    public com.bytedance.sdk.openadsdk.core.model.ljh qdl(int i2) {
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVarRemove = this.lnr.remove(Integer.valueOf(i2));
        if (qdlVarRemove != null) {
            return qdlVarRemove.bjy();
        }
        return null;
    }

    public int qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVar = new com.bytedance.sdk.openadsdk.core.model.qdl();
        qdlVar.ud(ljhVar);
        return qdl(qdlVar);
    }

    public void qdl(com.bytedance.sdk.openadsdk.qdl.lnr.ud udVar) {
        this.mo = udVar;
    }

    public void qdl(com.bytedance.sdk.openadsdk.qdl.mzz.qdl qdlVar) {
        this.mzz = qdlVar;
    }

    public void qdl(com.bytedance.sdk.openadsdk.qdl.mml.ud udVar) {
        this.wd = udVar;
    }

    public int qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        int iIncrementAndGet = this.ud.incrementAndGet();
        this.lnr.put(Integer.valueOf(iIncrementAndGet), qdlVar);
        return iIncrementAndGet;
    }

    public static int qdl(Intent intent) {
        if (intent != null) {
            return intent.getIntExtra("meta_index", -1);
        }
        return -1;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, ud udVar) {
        if (ljhVar == null || udVar == null) {
            return;
        }
        String strMml = mml(ljhVar);
        if (TextUtils.isEmpty(strMml)) {
            return;
        }
        this.jpc.put(strMml, udVar);
    }

    public void qdl(String str, boolean z2, boolean z3) {
        boolean z4 = z2 || !z3;
        boolean zYt = tvp.ud().yt();
        if (zYt) {
            com.bytedance.sdk.component.utils.aaj.qdl("BVA", "cleanListener: isFinish = " + z2 + ",isConfigChange = " + z3);
        }
        if (z4) {
            qdl(str, zYt);
        } else if (z2 || !z3) {
            qdl(str, zYt);
        }
    }

    private void qdl(String str, boolean z2) {
        qdl<?> qdlVarQdl = qdl(str);
        if (z2) {
            if (qdlVarQdl == null) {
                com.bytedance.sdk.component.utils.aaj.qdl("BVA", "cleanListener: removeCallback failed,listenerKey=".concat(String.valueOf(str)));
                return;
            }
            StringBuilder sbY = a.y("cleanListener: removeCallback success,listenerKey=", str, ",callback=");
            sbY.append(qdlVarQdl.qdl);
            com.bytedance.sdk.component.utils.aaj.qdl("BVA", sbY.toString());
        }
    }
}
