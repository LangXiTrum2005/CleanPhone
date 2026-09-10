package com.mbridge.msdk.config.component.load.downloader.core;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f32178a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final i f32179a = new i();
    }

    public static i b() {
        return b.f32179a;
    }

    public void a(int i10) {
        this.f32178a = new com.mbridge.msdk.config.component.load.downloader.core.a(i10);
    }

    private i() {
    }

    public j a() {
        if (this.f32178a == null) {
            this.f32178a = new com.mbridge.msdk.config.component.load.downloader.core.a(10);
        }
        return this.f32178a;
    }
}
