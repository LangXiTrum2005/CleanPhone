package com.mbridge.msdk.config.component.load.downloader;

import com.mbridge.msdk.config.component.load.downloader.core.i;
import com.mbridge.msdk.config.component.load.downloader.core.l;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f28957a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g f28958a = new g();
    }

    public static g a() {
        return b.f28958a;
    }

    public synchronized String b(String str) {
        return com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(str);
    }

    private g() {
        this.f28957a = false;
    }

    public synchronized void a(String str) {
        com.mbridge.msdk.config.component.load.downloader.core.f.a().a(str);
    }

    public boolean b() {
        return this.f28957a;
    }

    public synchronized com.mbridge.msdk.config.component.load.downloader.core.e a(com.mbridge.msdk.config.component.load.downloader.b<?> bVar) {
        return new com.mbridge.msdk.config.component.load.downloader.core.e(bVar);
    }

    public void a(f fVar) {
        if (this.f28957a) {
            return;
        }
        l.c().a(fVar);
        i.b().a(fVar.e());
        com.mbridge.msdk.config.component.load.downloader.core.f.a().c();
        this.f28957a = true;
    }
}
