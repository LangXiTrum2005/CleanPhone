package com.iab.omid.library.startio.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f22239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f22240c;
    private final c d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f22241e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f22238a = context;
        this.f22239b = (AudioManager) context.getSystemService("audio");
        this.f22240c = aVar;
        this.d = cVar;
    }

    private float a() {
        return this.f22240c.a(this.f22239b.getStreamVolume(3), this.f22239b.getStreamMaxVolume(3));
    }

    private void b() {
        this.d.a(this.f22241e);
    }

    public void c() {
        this.f22241e = a();
        b();
        this.f22238a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f22238a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2) {
        super.onChange(z2);
        float fA = a();
        if (a(fA)) {
            this.f22241e = fA;
            b();
        }
    }

    private boolean a(float f) {
        return f != this.f22241e;
    }
}
