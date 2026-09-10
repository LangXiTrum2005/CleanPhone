package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.c f32191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f32192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f32193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.database.b f32194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.c f32195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InputStream f32196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.resource.stream.a f32197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b0 f32198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f32199i;

    private n(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        this.f32192b = dVar;
        this.f32194d = bVar;
        this.f32191a = cVar;
        this.f32193c = bVar2;
    }

    private boolean a(int i10) {
        return i10 == 206;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01b9  */
    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    public com.mbridge.msdk.config.component.load.downloader.c run() {
        this.f32195e = new com.mbridge.msdk.config.component.load.downloader.c();
        if (this.f32192b.i() == 5) {
            this.f32195e.a(true);
            return this.f32195e;
        }
        long jK = this.f32192b.k();
        long jF = this.f32192b.f();
        String strH = this.f32193c.h();
        if (jF != 0 && jK == jF) {
            if (TextUtils.isEmpty(strH)) {
                this.f32195e.b(false);
            } else if (new File(this.f32193c.h()).exists()) {
                this.f32195e.b(true);
                return this.f32195e;
            }
        }
        String strF = this.f32193c.f();
        long j10 = this.f32192b.j();
        long jB = this.f32192b.b();
        long jG = this.f32192b.g();
        long jL = this.f32192b.l();
        Locale locale = Locale.ENGLISH;
        String strJ = defpackage.e.j(jF, "bytes=", "-");
        try {
            v.b bVarS = l.c().d().s();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            com.mbridge.msdk.thrid.okhttp.d dVarA = bVarS.b(jB, timeUnit).a(new MBridgeHostnameVerifier(strF)).d(jG, timeUnit).e(jL, timeUnit).a(Math.max(0L, j10), timeUnit).b(true).a().a(new y.a().b(strF).a(new com.mbridge.msdk.thrid.okhttp.c.a().b().a()).a("Connection", CampaignEx.JSON_NATIVE_VIDEO_CLOSE).a(Command.HTTP_HEADER_RANGE, strJ).a(Command.HTTP_HEADER_USER_AGENT).a(Command.HTTP_HEADER_USER_AGENT, Command.DEFAULT_USER_AGENT).a());
            try {
                try {
                    a0 a0VarD = dVarA.d();
                    if (!com.mbridge.msdk.config.component.load.downloader.utils.a.b(a0VarD) && !com.mbridge.msdk.config.component.load.downloader.utils.a.b(a0VarD.d())) {
                        int iK = a0VarD.k();
                        if (a0VarD.n()) {
                            this.f32195e = a(strH, strF, a0VarD, iK);
                            com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f32196f);
                            com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f32197g);
                            com.mbridge.msdk.config.component.load.downloader.utils.a.a(a0VarD);
                            com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f32198h);
                            if (!dVarA.h()) {
                                dVarA.cancel();
                            }
                            return this.f32195e;
                        }
                        this.f32195e.a(new IOException("responseCode " + iK));
                        com.mbridge.msdk.config.component.load.downloader.c cVar = this.f32195e;
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f32196f);
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f32197g);
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(a0VarD);
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f32198h);
                        if (!dVarA.h()) {
                            dVarA.cancel();
                        }
                        return cVar;
                    }
                    this.f32195e.a(new IOException("response is null"));
                    com.mbridge.msdk.config.component.load.downloader.c cVar2 = this.f32195e;
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f32196f);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f32197g);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(a0VarD);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f32198h);
                    if (!dVarA.h()) {
                        dVarA.cancel();
                    }
                    return cVar2;
                } catch (Exception e10) {
                    a(e10);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f32196f);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f32197g);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a((a0) null);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f32198h);
                    if (!dVarA.h()) {
                        dVarA.cancel();
                    }
                }
            } catch (Throwable th2) {
                com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f32196f);
                com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f32197g);
                com.mbridge.msdk.config.component.load.downloader.utils.a.a((a0) null);
                com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f32198h);
                if (!dVarA.h()) {
                    dVarA.cancel();
                }
                throw th2;
            }
        } catch (Exception e11) {
            a(e11);
            this.f32195e.b(false);
            return this.f32195e;
        }
    }

    public static m a(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        return new n(dVar, bVar, cVar, bVar2);
    }

    private com.mbridge.msdk.config.component.load.downloader.c a(String str, String str2, a0 a0Var, int i10) throws IllegalAccessException, IOException {
        com.mbridge.msdk.config.component.load.downloader.c cVar = new com.mbridge.msdk.config.component.load.downloader.c();
        if (!a(i10)) {
            this.f32192b.a(0L);
            this.f32192b.b(0L);
            com.mbridge.msdk.config.component.load.downloader.database.b bVar = this.f32194d;
            if (bVar != null) {
                bVar.a(0);
                this.f32194d.c(0L);
                this.f32194d.b(0L);
            }
            com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(new File(this.f32193c.h()));
        }
        b0 b0VarD = a0Var.d();
        this.f32198h = b0VarD;
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(b0VarD)) {
            cVar.a(new IOException("response body is null"));
            this.f32192b.b(0L);
            this.f32192b.a(0L);
            return cVar;
        }
        long jK = this.f32198h.k();
        String strA = a0Var.a("Content-Type", "");
        this.f32199i = strA;
        this.f32192b.a(strA);
        if (jK <= 0) {
            cVar.a(new IOException("response content length is null"));
            return cVar;
        }
        if (this.f32192b.k() == 0) {
            this.f32192b.b(jK);
        }
        InputStream inputStreamD = this.f32198h.d();
        this.f32196f = inputStreamD;
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(inputStreamD)) {
            cVar.a(new IOException("response inputStream is null"));
            return cVar;
        }
        this.f32193c.a(this.f32192b.k());
        this.f32192b.c(this.f32193c);
        return a(str, str2);
    }

    private void a(Exception exc) {
        this.f32195e.a(exc);
    }

    private com.mbridge.msdk.config.component.load.downloader.c a(String str, String str2) throws IllegalAccessException, IOException {
        com.mbridge.msdk.config.component.load.downloader.c cVar = new com.mbridge.msdk.config.component.load.downloader.c();
        this.f32193c.b(System.currentTimeMillis());
        com.mbridge.msdk.config.component.load.downloader.resource.stream.a aVarB = com.mbridge.msdk.config.component.load.downloader.resource.a.a().b(new File(str));
        this.f32197g = aVarB;
        aVarB.seek(this.f32192b.f());
        byte[] bArr = new byte[l.c().a()];
        while (true) {
            int i10 = this.f32196f.read(bArr);
            if (i10 == -1) {
                break;
            }
            this.f32197g.write(bArr, 0, i10);
            d dVar = this.f32192b;
            dVar.a(dVar.f() + ((long) i10));
            this.f32197g.flushAndSync();
            int iA = com.mbridge.msdk.config.component.load.downloader.utils.b.a(this.f32192b.k(), this.f32192b.f());
            this.f32193c.a(iA);
            a(this.f32192b, this.f32193c, this.f32192b.f(), this.f32192b.k(), iA);
            if (this.f32193c.e() != 100 && iA >= this.f32193c.e()) {
                break;
            }
            if (this.f32192b.i() == 5) {
                cVar.a(true);
                break;
            }
        }
        try {
            if (this.f32192b.i() != 5 && this.f32192b.k() == this.f32192b.f()) {
                this.f32193c.b(com.mbridge.msdk.config.component.common.file.a.d(this.f32193c.h()));
                this.f32193c.c(System.currentTimeMillis());
            }
        } catch (Throwable th2) {
            q0.b(IDownloadTask.TAG, th2.getMessage(), th2);
        }
        if (!cVar.b()) {
            cVar.b(true);
        }
        return cVar;
    }

    private void a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, long j10, long j11, int i10) {
        if (dVar.i() != 5) {
            if (bVar != null) {
                bVar.a(i10);
                bVar.a(j11);
            }
            dVar.a(bVar, new DownloadProgress(j10, j11, i10));
        }
    }
}
