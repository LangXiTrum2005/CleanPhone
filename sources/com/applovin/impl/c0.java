package com.applovin.impl;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f7611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f7612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.p f7613c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final AtomicBoolean f7615e = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f7614d = com.applovin.impl.sdk.l.p();

    public c0(String str, com.applovin.impl.sdk.l lVar) {
        this.f7612b = str;
        this.f7611a = lVar;
        this.f7613c = lVar.Q();
    }

    public Context a() {
        return this.f7614d;
    }

    public void a(boolean z10) {
        this.f7615e.set(z10);
    }
}
