package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile d f32176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f32177d;

    public h(d dVar) {
        this.f32176c = dVar;
        this.f32174a = dVar.d();
        this.f32175b = dVar.h();
    }

    @Override // java.lang.Runnable
    public void run() {
        q0.a(IDownloadTask.TAG, "Start download task.");
        this.f32177d = this.f32176c.c();
        if (this.f32176c.i() != 7) {
            this.f32176c.d(this.f32177d);
        }
        this.f32176c.b(0);
        com.mbridge.msdk.config.component.load.downloader.c cVarRun = g.a(this.f32176c, this.f32177d, l.c().b()).run();
        if (cVarRun.c()) {
            this.f32176c.e(this.f32177d);
        } else if (cVarRun.a() != null) {
            this.f32176c.a(this.f32177d, cVarRun.a());
        } else if (cVarRun.b()) {
            this.f32176c.b(this.f32177d);
        }
    }
}
