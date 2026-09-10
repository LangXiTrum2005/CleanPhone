package com.startapp.sdk.internal;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41172c;
    public final j2 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41173e;

    public k2(Context context, String str, j2 j2Var, int i2) {
        this.f41170a = context;
        this.f41172c = str;
        this.d = j2Var;
        this.f41173e = i2;
    }

    public final void a() {
        ((Executor) com.startapp.sdk.components.a.a(this.f41170a).f40725B.a()).execute(new i2(this));
    }
}
