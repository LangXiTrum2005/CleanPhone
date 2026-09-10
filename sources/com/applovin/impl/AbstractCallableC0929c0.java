package com.applovin.impl;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.applovin.impl.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractCallableC0929c0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f10623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f10624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f10625c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final AtomicBoolean f10626e = new AtomicBoolean();
    private final Context d = com.applovin.impl.sdk.k.o();

    public AbstractCallableC0929c0(String str, com.applovin.impl.sdk.k kVar) {
        this.f10624b = str;
        this.f10623a = kVar;
        this.f10625c = kVar.O();
    }

    public Context a() {
        return this.d;
    }

    public void a(boolean z2) {
        this.f10626e.set(z2);
    }
}
