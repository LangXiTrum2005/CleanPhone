package com.iab.omid.library.mmadbridge.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f25362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f25363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f25364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f25365e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f25361a = context;
        this.f25362b = (AudioManager) context.getSystemService("audio");
        this.f25363c = aVar;
        this.f25364d = cVar;
    }

    private float a() {
        return this.f25363c.a(this.f25362b.getStreamVolume(3), this.f25362b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f25364d.a(this.f25365e);
    }

    public void c() {
        this.f25365e = a();
        b();
        this.f25361a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f25361a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f25365e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f25365e;
    }
}
