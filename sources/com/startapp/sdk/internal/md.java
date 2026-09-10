package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class md implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f41250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f41251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f41252c;
    public final /* synthetic */ od d;

    public md(od odVar, String str, boolean z2, String str2) {
        this.d = odVar;
        this.f41250a = str;
        this.f41251b = z2;
        this.f41252c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a(this.f41250a, this.f41252c, this.f41251b);
    }
}
