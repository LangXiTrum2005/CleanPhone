package com.mbridge.msdk.config.component.load.downloader.core;

import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.HandlerThread;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile l f32185e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32186a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.d f32187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.database.c f32188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile v f32189d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements com.mbridge.msdk.config.component.load.downloader.database.d {
        public a() {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.database.d
        public SQLiteDatabase getWritableDatabase() {
            return com.mbridge.msdk.config.component.database.a.a().a(true);
        }
    }

    private l() {
    }

    public static l c() {
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(f32185e)) {
            synchronized (l.class) {
                try {
                    if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(f32185e)) {
                        f32185e = new l();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f32185e;
    }

    private void e() {
        HandlerThread handlerThread = new HandlerThread("mb_db_thread");
        handlerThread.start();
        this.f32188c = new com.mbridge.msdk.config.component.load.downloader.database.a(new Handler(handlerThread.getLooper()), new a());
    }

    public int a() {
        return this.f32186a;
    }

    public com.mbridge.msdk.config.component.load.downloader.database.c b() {
        return this.f32188c;
    }

    public v d() {
        if (this.f32189d == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(w.HTTP_1_1);
            com.mbridge.msdk.thrid.okhttp.m mVar = new com.mbridge.msdk.thrid.okhttp.m(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Dispatcher", false)));
            mVar.a(this.f32187b.f());
            mVar.b(this.f32187b.g());
            v.b bVar = new v.b();
            long jA = this.f32187b.a();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f32189d = bVar.b(jA, timeUnit).d(this.f32187b.a(), timeUnit).e(this.f32187b.d(), timeUnit).a(mVar).c(this.f32187b.b(), timeUnit).b(true).a(new com.mbridge.msdk.thrid.okhttp.i(32, 5L, TimeUnit.MINUTES)).a(arrayList).a();
        }
        return this.f32189d;
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.d dVar) {
        this.f32187b = dVar;
        e();
    }
}
