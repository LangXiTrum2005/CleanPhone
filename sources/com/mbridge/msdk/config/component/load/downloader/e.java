package com.mbridge.msdk.config.component.load.downloader;

import com.mbridge.msdk.config.component.load.downloader.core.i;
import com.mbridge.msdk.config.component.load.downloader.core.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f32242a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final e f32243a = new e();
    }

    public static e a() {
        return b.f32243a;
    }

    public synchronized String b(String str) {
        return com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(str);
    }

    private e() {
        this.f32242a = false;
    }

    public synchronized void a(String str) {
        com.mbridge.msdk.config.component.load.downloader.core.f.a().a(str);
    }

    public boolean b() {
        return this.f32242a;
    }

    public synchronized com.mbridge.msdk.config.component.load.downloader.core.e a(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        return new com.mbridge.msdk.config.component.load.downloader.core.e(bVar);
    }

    public void a(d dVar) {
        if (this.f32242a) {
            return;
        }
        l.c().a(dVar);
        i.b().a(dVar.e());
        com.mbridge.msdk.config.component.load.downloader.core.f.a().c();
        this.f32242a = true;
    }
}
