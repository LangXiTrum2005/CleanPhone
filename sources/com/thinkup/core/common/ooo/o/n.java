package com.thinkup.core.common.ooo.o;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class n {
    public static final int m = 2;
    public static final int o = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final om f42336n;
    private final Map<View, m> o0;
    private final om.m om;
    private om.o0 on;
    private final Map<View, o0<m>> oo;

    private n(int i2) {
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        om.m mVar = new om.m(i2);
        om omVar = new om(i2);
        new Handler(Looper.getMainLooper());
        this(weakHashMap, weakHashMap2, mVar, omVar);
    }

    private void m() {
        o();
        this.f42336n.m();
        this.on = null;
    }

    @Deprecated
    private om.o0 n() {
        return this.on;
    }

    public final void o(View view, m mVar) {
        if (this.o0.get(view) == mVar) {
            return;
        }
        o(view);
        if (mVar.isImpressionRecorded()) {
            return;
        }
        this.o0.put(view, mVar);
        om omVar = this.f42336n;
        int impressionMinPercentageViewed = mVar.getImpressionMinPercentageViewed();
        omVar.o(view, view, impressionMinPercentageViewed, impressionMinPercentageViewed, mVar.getImpressionMinVisiblePx());
    }

    public n() {
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        om.m mVar = new om.m(1);
        om omVar = new om();
        new Handler(Looper.getMainLooper());
        this(weakHashMap, weakHashMap2, mVar, omVar);
    }

    private void m(View view) {
        this.oo.remove(view);
    }

    private n(Map<View, m> map, Map<View, o0<m>> map2, om.m mVar, om omVar) {
        this.o0 = map;
        this.oo = map2;
        this.om = mVar;
        this.f42336n = omVar;
        om.o0 o0Var = new om.o0() { // from class: com.thinkup.core.common.ooo.o.n.1
            @Override // com.thinkup.core.common.ooo.o.om.o0
            public final void o(List<View> list) {
                for (View view : list) {
                    m mVar2 = (m) n.this.o0.get(view);
                    if (mVar2 == null) {
                        n.this.o(view);
                    } else {
                        mVar2.recordImpression(view);
                        mVar2.setImpressionRecorded();
                    }
                }
            }
        };
        this.on = o0Var;
        omVar.o(o0Var);
    }

    public final void o(View view) {
        this.o0.remove(view);
        m(view);
        this.f42336n.o(view);
    }

    public final void o() {
        this.o0.clear();
        this.oo.clear();
        this.f42336n.o();
    }
}
