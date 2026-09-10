package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class e1 extends u2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.l f7775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f7776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f7777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f7778h;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        RECENT_ADS,
        COUNT
    }

    public e1(Context context) {
        super(context);
        this.f7777g = new AtomicBoolean();
        this.f7778h = new ArrayList();
    }

    public void a(List list, com.applovin.impl.sdk.l lVar) {
        Activity activityW0;
        this.f7775e = lVar;
        this.f7776f = list;
        if (!(this.f9816a instanceof Activity) && (activityW0 = lVar.w0()) != null) {
            this.f9816a = activityW0;
        }
        if (list != null && this.f7777g.compareAndSet(false, true)) {
            this.f7778h = a(this.f7776f);
        }
        AppLovinSdkUtils.runOnUiThread(new u9(this, 6));
    }

    @Override // com.applovin.impl.u2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.u2
    public List c(int i10) {
        return this.f7778h;
    }

    public List d() {
        return this.f7776f;
    }

    public com.applovin.impl.sdk.l e() {
        return this.f7775e;
    }

    public boolean f() {
        return this.f7778h.size() == 0;
    }

    public void g() {
        this.f7777g.compareAndSet(true, false);
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.f7777g.get() + "}";
    }

    @Override // com.applovin.impl.u2
    public int d(int i10) {
        return this.f7778h.size();
    }

    @Override // com.applovin.impl.u2
    public t2 e(int i10) {
        return new x4("RECENT ADS");
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new q1((r1) it.next(), this.f9816a));
        }
        return arrayList;
    }
}
