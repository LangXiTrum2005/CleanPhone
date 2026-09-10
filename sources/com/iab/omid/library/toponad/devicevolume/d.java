package com.iab.omid.library.toponad.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f22335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f22336c;
    private final c d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f22337e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f22334a = context;
        this.f22335b = (AudioManager) context.getSystemService("audio");
        this.f22336c = aVar;
        this.d = cVar;
    }

    private float a() {
        return this.f22336c.a(this.f22335b.getStreamVolume(3), this.f22335b.getStreamMaxVolume(3));
    }

    private void b() {
        this.d.a(this.f22337e);
    }

    public void c() {
        this.f22337e = a();
        b();
        this.f22334a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f22334a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2) {
        super.onChange(z2);
        float fA = a();
        if (a(fA)) {
            this.f22337e = fA;
            b();
        }
    }

    private boolean a(float f) {
        return f != this.f22337e;
    }
}
