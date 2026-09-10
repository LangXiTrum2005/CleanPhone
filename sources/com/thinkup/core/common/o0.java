package com.thinkup.core.common;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.omn;
import com.thinkup.core.common.ooo.onm;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class o0 {
    private static final String o = "o0";
    private static volatile o0 oo;
    private Context m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<String, omn> f42130n = new ConcurrentHashMap(8);
    private Map<String, String> o0;

    private o0() {
    }

    public static o0 o() {
        if (oo == null) {
            synchronized (o0.class) {
                try {
                    if (oo == null) {
                        oo = new o0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oo;
    }

    public final void m(String str, String str2, String str3) {
        o0mm o0mmVarO;
        omn omnVar = this.f42130n.get(str);
        if (omnVar == null || (o0mmVarO = omnVar.o()) == null || !TextUtils.equals(o0mmVarO.m0o(), str3) || !TextUtils.equals(omnVar.n(), str2)) {
            return;
        }
        omnVar.oo();
        m(str);
    }

    public final synchronized String n(String str) {
        Map<String, String> map = this.o0;
        if (map == null) {
            return null;
        }
        return map.remove(str);
    }

    public final void m(String str) {
        try {
            omn omnVar = this.f42130n.get(str);
            if (omnVar != null) {
                onm.m(this.m, com.thinkup.core.common.n.oo0.m.nn, str, omnVar.mo().toString());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void o(String str, omn omnVar) {
        Objects.toString(omnVar);
        this.f42130n.put(str, omnVar);
    }

    public final void o(String str, String str2, String str3) {
        o0mm o0mmVarO;
        omn omnVar = this.f42130n.get(str);
        if (omnVar == null || (o0mmVarO = omnVar.o()) == null || !TextUtils.equals(o0mmVarO.m0o(), str3) || !TextUtils.equals(omnVar.n(), str2)) {
            return;
        }
        omnVar.o0();
        m(str);
    }

    public final omn o(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        omn omnVarRemove = this.f42130n.remove(str);
        Objects.toString(omnVarRemove);
        if (omnVarRemove != null) {
            onm.o(this.m, com.thinkup.core.common.n.oo0.m.nn, str);
        }
        return omnVarRemove;
    }

    public final void o(Context context) {
        omn omnVarO;
        this.m = context;
        try {
            Map<String, ?> mapM = onm.m(context, com.thinkup.core.common.n.oo0.m.nn);
            if (mapM != null) {
                for (Map.Entry<String, ?> entry : mapM.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if ((value instanceof String) && (omnVarO = omn.o((String) value)) != null) {
                        this.f42130n.put(key, omnVarO);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final synchronized void o(String str, String str2) {
        try {
            if (this.o0 == null) {
                this.o0 = new ConcurrentHashMap();
            }
            this.o0.put(str, str2);
        } catch (Throwable th) {
            throw th;
        }
    }
}
