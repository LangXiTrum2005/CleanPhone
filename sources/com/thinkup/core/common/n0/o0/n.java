package com.thinkup.core.common.n0.o0;

import android.text.TextUtils;
import com.p004ironsource.dc;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends o0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f41966n;
    String o;
    private final String n0 = dc.q;
    boolean m = true;

    public n(String str, int i2) {
        this.f41966n = 1;
        this.o = str;
        if (i2 == 1000) {
            this.f41966n = 1;
        } else if (i2 == 1001) {
            this.f41966n = 2;
        }
    }

    @Override // com.thinkup.core.common.n0.o0.o0
    public final int n() {
        return this.f41966n;
    }

    @Override // com.thinkup.core.common.n0.o0.o0
    public final void o(String str, String str2, String str3, int i2) {
    }

    @Override // com.thinkup.core.common.n0.o0.o0
    public final int o0() {
        return 3;
    }

    @Override // com.thinkup.core.common.n0.o0.o0
    public final boolean om() {
        return this.m;
    }

    @Override // com.thinkup.core.common.n0.o0.o0
    public final byte[] oo() {
        return !TextUtils.isEmpty(this.o) ? o0.o(this.o) : new byte[0];
    }
}
