package com.mbridge.msdk.config.component.load.downloader.core;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.c f32180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.b f32182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f32183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.b f32184e;

    private k(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, String str, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        this.f32183d = dVar;
        this.f32182c = bVar;
        this.f32180a = cVar;
        this.f32181b = str;
        this.f32184e = bVar2;
    }

    public static m a(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, String str, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        return new k(dVar, bVar, cVar, str, bVar2);
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    public com.mbridge.msdk.config.component.load.downloader.c run() {
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(this.f32182c)) {
            return null;
        }
        com.mbridge.msdk.config.component.load.downloader.c cVar = new com.mbridge.msdk.config.component.load.downloader.c();
        File file = new File(this.f32184e.h());
        if (!com.mbridge.msdk.config.component.load.downloader.utils.a.b(file)) {
            this.f32183d.a(0L);
            cVar.b(false);
            return cVar;
        }
        long jC = com.mbridge.msdk.config.component.load.downloader.resource.a.a().c(file);
        long jK = this.f32182c.k();
        if (jK > 0 && jC != jK) {
            a(cVar, file);
            return cVar;
        }
        this.f32183d.b(jK);
        this.f32183d.a(jK != 0 ? jC : this.f32182c.g());
        cVar.b(a(jC));
        return cVar;
    }

    private void a(com.mbridge.msdk.config.component.load.downloader.c cVar, File file) {
        long length = file.length();
        long jLastModified = file.lastModified();
        this.f32183d.b(this.f32182c.k());
        this.f32183d.a(file.length());
        l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f32182c.f(), file.getAbsolutePath(), this.f32182c.d(), this.f32182c.n(), jLastModified, this.f32182c.k(), this.f32182c.g(), this.f32182c.e(), this.f32182c.c(), this.f32182c.j(), this.f32182c.h(), this.f32182c.b(), this.f32182c.a()), this.f32184e.h());
        cVar.b(a(length));
    }

    private boolean a(long j10) {
        return com.mbridge.msdk.config.component.load.downloader.utils.b.a(this.f32182c.k(), j10) >= this.f32184e.e();
    }
}
