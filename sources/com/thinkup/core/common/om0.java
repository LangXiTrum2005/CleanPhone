package com.thinkup.core.common;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.common.on.o0nm;
import com.thinkup.core.common.ooo.onm;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class om0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f42184n = "om0";
    private static volatile om0 o0;
    Context m;
    Map<String, o0nm> o;

    private om0(Context context) {
        this.m = context.getApplicationContext();
        o();
    }

    private static void m() {
    }

    public static om0 o(Context context) {
        if (o0 == null) {
            synchronized (om0.class) {
                try {
                    if (o0 == null) {
                        o0 = new om0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o0;
    }

    private o0nm m(String str) {
        Map<String, o0nm> map = this.o;
        if (map != null) {
            return map.remove(str);
        }
        return null;
    }

    private void o() {
        if (this.o == null) {
            this.o = new ConcurrentHashMap(5);
            try {
                Map<String, ?> mapM = onm.m(this.m, com.thinkup.core.common.n.oo0.m.n0);
                if (mapM != null) {
                    for (Map.Entry<String, ?> entry : mapM.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            this.o.put(key, o0nm.o((String) value));
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void o(String str, String str2, o0nm.o oVar, o0nm.o oVar2) {
        Map<String, o0nm> map = this.o;
        if (map == null) {
            return;
        }
        o0nm o0nmVar = map.get(str);
        if (o0nmVar == null) {
            synchronized (this) {
                try {
                    o0nmVar = this.o.get(str);
                    if (o0nmVar == null) {
                        o0nmVar = new o0nm();
                        o0nmVar.m(str2);
                        this.o.put(str, o0nmVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (TextUtils.equals(str2, o0nmVar.m())) {
            if (oVar != null) {
                o0nmVar.o(oVar);
                o0nmVar.o(System.currentTimeMillis());
            }
            if (oVar2 != null) {
                o0nmVar.m(oVar2);
            }
        }
    }

    public final void o(String str) {
        Map<String, o0nm> map = this.o;
        if (map == null) {
            return;
        }
        try {
            o0nm o0nmVar = map.get(str);
            if (o0nmVar != null) {
                onm.m(this.m, com.thinkup.core.common.n.oo0.m.n0, str, o0nmVar.o().toString());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
