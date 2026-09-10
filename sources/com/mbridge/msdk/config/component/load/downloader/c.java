package com.mbridge.msdk.config.component.load.downloader;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f32116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32118c;

    public a a() {
        return this.f32116a;
    }

    public boolean b() {
        return this.f32117b;
    }

    public boolean c() {
        return this.f32118c;
    }

    public void a(a aVar) {
        this.f32116a = aVar;
        b(false);
    }

    public void b(boolean z10) {
        this.f32118c = z10;
    }

    public void a(Exception exc) {
        a(new a(exc));
    }

    public void a(boolean z10) {
        this.f32117b = z10;
    }
}
