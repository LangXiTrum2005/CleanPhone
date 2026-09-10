package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class dk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fk f40923b;

    public dk(fk fkVar, String str) {
        this.f40923b = fkVar;
        this.f40922a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40923b.d.a(this.f40922a);
    }
}
