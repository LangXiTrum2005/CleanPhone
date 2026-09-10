package com.thinkup.core.common.m;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o0 implements oo {
    static final int m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f41868n = 3;
    static final int o = 1;
    protected String o0;
    protected String om;
    protected long on;
    protected Context oo;

    public o0(Context context, String str, String str2, long j) {
        this.o0 = str;
        this.oo = context;
        this.om = str2;
        this.on = j;
    }

    private String o0() {
        return this.om;
    }

    private long oo() {
        return this.on;
    }

    @Override // com.thinkup.core.common.m.oo
    public final String o() {
        return this.o0;
    }
}
