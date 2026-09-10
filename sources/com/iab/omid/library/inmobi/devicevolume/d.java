package com.iab.omid.library.inmobi.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f21938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.a f21939c;
    private final c d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference<Float> f21940e;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            if (((Float) d.this.f21940e.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.d.a(fA);
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.inmobi.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f21940e = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f21937a = context;
        this.f21938b = (AudioManager) context.getSystemService("audio");
        this.f21939c = aVar;
        this.d = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.f21939c.a(this.f21938b.getStreamVolume(3), this.f21938b.getStreamMaxVolume(3));
    }

    private void d() {
        new Thread(new a()).start();
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2) {
        d();
    }

    public void b() {
        d();
        this.f21937a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f21937a.getContentResolver().unregisterContentObserver(this);
    }
}
