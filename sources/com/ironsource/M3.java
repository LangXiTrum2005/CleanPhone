package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class M3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26540a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IronSourceError f26541b = null;

    public void a(IronSourceError ironSourceError) {
        this.f26540a = false;
        this.f26541b = ironSourceError;
    }

    public boolean b() {
        return this.f26540a;
    }

    public void c() {
        this.f26540a = true;
        this.f26541b = null;
    }

    public String toString() {
        if (b()) {
            return "valid:" + this.f26540a;
        }
        return "valid:" + this.f26540a + ", IronSourceError:" + this.f26541b;
    }

    public IronSourceError a() {
        return this.f26541b;
    }
}
