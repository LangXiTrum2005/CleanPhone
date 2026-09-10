package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes5.dex */
public class t8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f27284a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IronSourceError f27285b = null;

    public IronSourceError a() {
        return this.f27285b;
    }

    public boolean b() {
        return this.f27284a;
    }

    public void c() {
        this.f27284a = true;
        this.f27285b = null;
    }

    public String toString() {
        StringBuilder sb;
        if (b()) {
            sb = new StringBuilder("valid:");
            sb.append(this.f27284a);
        } else {
            sb = new StringBuilder("valid:");
            sb.append(this.f27284a);
            sb.append(", IronSourceError:");
            sb.append(this.f27285b);
        }
        return sb.toString();
    }

    public void a(IronSourceError ironSourceError) {
        this.f27284a = false;
        this.f27285b = ironSourceError;
    }
}
