package com.iab.omid.library.chartboost.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f21833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f21834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioManager f21835c;
    private final com.iab.omid.library.chartboost.devicevolume.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f21836e;
    private final AtomicReference<Float> f;
    private final AtomicBoolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f21837h;

    public class a implements Runnable {

        /* JADX INFO: renamed from: com.iab.omid.library.chartboost.devicevolume.d$a$a, reason: collision with other inner class name */
        public class RunnableC0225a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f21839a;

            public RunnableC0225a(float f) {
                this.f21839a = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f21836e.a(this.f21839a);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            d.this.g.set(false);
            if (((Float) d.this.f.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f21833a.post(new RunnableC0225a(fA));
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.chartboost.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.g = new AtomicBoolean(false);
        this.f21837h = Executors.newSingleThreadExecutor();
        this.f21833a = handler;
        this.f21834b = context;
        this.f21835c = (AudioManager) context.getSystemService("audio");
        this.d = aVar;
        this.f21836e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.d.a(this.f21835c.getStreamVolume(3), this.f21835c.getStreamMaxVolume(3));
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2) {
        if (this.g.getAndSet(true)) {
            return;
        }
        d();
    }

    private void d() {
        this.f21837h.submit(new a());
    }

    public void b() {
        d();
        this.f21834b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f21834b.getContentResolver().unregisterContentObserver(this);
    }
}
