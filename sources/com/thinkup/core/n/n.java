package com.thinkup.core.n;

import android.support.v4.media.a;
import android.text.TextUtils;
import com.p004ironsource.dc;
import com.thinkup.core.api.MediationBidManager;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.on0;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class n {
    private static n oo;
    ConcurrentHashMap<String, Integer> m;
    private MediationBidManager om;
    private final String o0 = dc.q;
    ConcurrentHashMap<String, on0> o = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    List<Integer> f42407n = new CopyOnWriteArrayList();

    private n() {
    }

    public static n o() {
        if (oo == null) {
            oo = new n();
        }
        return oo;
    }

    public final MediationBidManager m() {
        return this.om;
    }

    private boolean m(String str) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.m;
        if (concurrentHashMap == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_c2sfirstStatus");
        return concurrentHashMap.get(sb.toString()) == null;
    }

    public final boolean m(int i2) {
        boolean z2;
        synchronized (this.f42407n) {
            z2 = !this.f42407n.contains(Integer.valueOf(i2));
        }
        return z2;
    }

    private void o(String str, o0mm o0mmVar, on0 on0Var) {
        ConcurrentHashMap<String, on0> concurrentHashMap = this.o;
        StringBuilder sbW = a.w(str);
        sbW.append(on0Var.mn);
        concurrentHashMap.put(sbW.toString(), on0Var);
        if (o0mmVar.o0on()) {
            com.thinkup.core.common.o.o.o().o(str, on0Var);
        }
    }

    public final void o(String str, on0 on0Var) {
        if (on0Var == null) {
            return;
        }
        ConcurrentHashMap<String, on0> concurrentHashMap = this.o;
        StringBuilder sbW = a.w(str);
        sbW.append(on0Var.mn);
        on0 on0Var2 = concurrentHashMap.get(sbW.toString());
        if (on0Var2 == null || !TextUtils.equals(on0Var.token, on0Var2.token)) {
            return;
        }
        ConcurrentHashMap<String, on0> concurrentHashMap2 = this.o;
        StringBuilder sbW2 = a.w(str);
        sbW2.append(on0Var.mn);
        concurrentHashMap2.remove(sbW2.toString());
    }

    public final on0 o(String str, o0mm o0mmVar) {
        ConcurrentHashMap<String, on0> concurrentHashMap = this.o;
        StringBuilder sbW = a.w(str);
        sbW.append(o0mmVar.m0o());
        on0 on0VarO = concurrentHashMap.get(sbW.toString());
        if (o0mmVar.o0on() && on0VarO == null) {
            on0VarO = com.thinkup.core.common.o.o.o().o(str, o0mmVar.m0o());
            if (on0VarO != null) {
                o0mmVar.toString();
                ConcurrentHashMap<String, on0> concurrentHashMap2 = this.o;
                StringBuilder sbW2 = a.w(str);
                sbW2.append(o0mmVar.m0o());
                concurrentHashMap2.put(sbW2.toString(), on0VarO);
                return on0VarO;
            }
            o0mmVar.toString();
        }
        return on0VarO;
    }

    public final void o(MediationBidManager mediationBidManager) {
        this.om = mediationBidManager;
    }

    private void o(String str) {
        if (this.m == null) {
            this.m = new ConcurrentHashMap<>();
        }
        this.m.put(a.m(str, "_c2sfirstStatus"), 1);
    }

    public final void o(int i2) {
        synchronized (this.f42407n) {
            try {
                if (!this.f42407n.contains(Integer.valueOf(i2))) {
                    this.f42407n.add(Integer.valueOf(i2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
