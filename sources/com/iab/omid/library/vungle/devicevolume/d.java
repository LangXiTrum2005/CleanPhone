package com.iab.omid.library.vungle.devicevolume;

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
    private final Handler f22529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f22530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioManager f22531c;
    private final com.iab.omid.library.vungle.devicevolume.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f22532e;
    private final AtomicReference<Float> f;
    private final AtomicBoolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f22533h;

    public class a implements Runnable {

        /* JADX INFO: renamed from: com.iab.omid.library.vungle.devicevolume.d$a$a, reason: collision with other inner class name */
        public class RunnableC0254a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f22535a;

            public RunnableC0254a(float f) {
                this.f22535a = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f22532e.a(this.f22535a);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            d.this.g.set(false);
            if (((Float) d.this.f.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f22529a.post(new RunnableC0254a(fA));
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.vungle.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.g = new AtomicBoolean(false);
        this.f22533h = Executors.newSingleThreadExecutor();
        this.f22529a = handler;
        this.f22530b = context;
        this.f22531c = (AudioManager) context.getSystemService("audio");
        this.d = aVar;
        this.f22532e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.d.a(this.f22531c.getStreamVolume(3), this.f22531c.getStreamMaxVolume(3));
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2) {
        if (this.g.getAndSet(true)) {
            return;
        }
        d();
    }

    private void d() {
        this.f22533h.submit(new a());
    }

    public void b() {
        d();
        this.f22530b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f22530b.getContentResolver().unregisterContentObserver(this);
    }
}
