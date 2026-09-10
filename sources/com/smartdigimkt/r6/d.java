package com.smartdigimkt.r6;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f38100e = 1;
    static final int f = 2;
    static final int g = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f38101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f38102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f38103c;
    protected long d;

    public d(Context context, String str, String str2, long j) {
        this.f38101a = str;
        this.f38102b = context;
        this.f38103c = str2;
        this.d = j;
    }

    @Override // com.smartdigimkt.r6.e
    public String b() {
        return this.f38101a;
    }

    public long d() {
        return this.d;
    }

    public String e() {
        return this.f38103c;
    }
}
