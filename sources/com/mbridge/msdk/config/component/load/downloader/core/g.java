package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class g implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.database.c f32169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f32170c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile d f32173f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f32168a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.database.b f32171d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f32172e = true;

    private g(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar) {
        this.f32173f = dVar;
        this.f32170c = bVar;
        this.f32169b = cVar;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    public com.mbridge.msdk.config.component.load.downloader.c run() {
        String strE = this.f32173f.e();
        if (this.f32173f.i() == 5) {
            com.mbridge.msdk.config.component.load.downloader.c cVar = new com.mbridge.msdk.config.component.load.downloader.c();
            cVar.a(true);
            return cVar;
        }
        if (this.f32170c.e() == 0) {
            this.f32170c.b(100);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f32169b.a(strE, this.f32170c.b(), new cj.h(15, this, countDownLatch));
        try {
            try {
                countDownLatch.await(10L, TimeUnit.SECONDS);
                synchronized (this.f32168a) {
                    this.f32172e = false;
                }
            } catch (InterruptedException e10) {
                q0.a(IDownloadTask.TAG, e10.getMessage(), e10);
                countDownLatch.countDown();
                synchronized (this.f32168a) {
                    this.f32172e = false;
                }
            }
            com.mbridge.msdk.config.component.load.downloader.c cVarRun = k.a(this.f32173f, this.f32171d, this.f32169b, strE, this.f32170c).run();
            if (!com.mbridge.msdk.config.component.load.downloader.utils.a.a(cVarRun) || !cVarRun.c()) {
                if (this.f32170c != null) {
                    this.f32170c.a(false);
                }
                return n.a(this.f32173f, this.f32171d, this.f32169b, this.f32170c).run();
            }
            if (this.f32170c != null) {
                this.f32170c.a(true);
                this.f32170c.a(this.f32173f.k());
                this.f32170c.b(this.f32171d.h());
                this.f32170c.b(this.f32171d.d());
                this.f32170c.c(this.f32171d.n());
                this.f32170c.a(com.mbridge.msdk.config.component.load.downloader.utils.b.a(this.f32173f.k(), this.f32173f.f()));
            }
            a(this.f32173f, this.f32170c);
            return cVarRun;
        } catch (Throwable th2) {
            synchronized (this.f32168a) {
                this.f32172e = false;
                throw th2;
            }
        }
    }

    public static m a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar) {
        return new g(dVar, bVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(CountDownLatch countDownLatch, com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        synchronized (this.f32168a) {
            try {
                if (this.f32172e) {
                    this.f32171d = bVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        countDownLatch.countDown();
    }

    private void a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar) {
        if (dVar.i() != 5) {
            long jF = this.f32173f.f();
            long jK = this.f32173f.k();
            dVar.a(bVar, new DownloadProgress(jF, jK, com.mbridge.msdk.config.component.load.downloader.utils.b.a(jK, jF)));
        }
    }
}
