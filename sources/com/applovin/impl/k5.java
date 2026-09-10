package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f8297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f8298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.p f8299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f8300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f8301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8302f;

    public k5(String str, com.applovin.impl.sdk.l lVar) {
        this(str, lVar, false, null);
    }

    public com.applovin.impl.sdk.l b() {
        return this.f8297a;
    }

    public String c() {
        return this.f8298b;
    }

    public boolean d() {
        return this.f8302f;
    }

    public k5(String str, com.applovin.impl.sdk.l lVar, boolean z10) {
        this(str, lVar, z10, null);
    }

    public Context a() {
        return this.f8300d;
    }

    public ScheduledFuture b(Thread thread, long j10) {
        if (j10 <= 0) {
            return null;
        }
        return this.f8297a.s0().b(new u6(this.f8297a, "timeout:" + this.f8298b, new cj.l(this, thread, j10, 1)), f6.b.TIMEOUT, j10);
    }

    public k5(String str, com.applovin.impl.sdk.l lVar, String str2) {
        this(str, lVar, false, str2);
    }

    public void a(String str) {
        this.f8301e = str;
    }

    public k5(String str, com.applovin.impl.sdk.l lVar, boolean z10, String str2) {
        this.f8298b = str;
        this.f8297a = lVar;
        this.f8299c = lVar.Q();
        this.f8300d = com.applovin.impl.sdk.l.p();
        this.f8302f = z10;
        this.f8301e = str2;
    }

    public void a(boolean z10) {
        this.f8302f = z10;
    }

    public void a(Throwable th2) {
        Map map = CollectionUtils.map("source", this.f8298b);
        map.put("top_main_method", th2.toString());
        map.put("details", StringUtils.emptyIfNull(this.f8301e));
        this.f8297a.E().d(f2.f7850f1, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Thread thread, long j10) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("name", thread.getState().name());
        if (StringUtils.isValidString(this.f8301e)) {
            mapHashMap.put("details", this.f8301e);
        }
        this.f8297a.E().a(f2.f7852g1, this.f8298b, mapHashMap);
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.k(this.f8298b, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j10) + " seconds");
        }
    }
}
