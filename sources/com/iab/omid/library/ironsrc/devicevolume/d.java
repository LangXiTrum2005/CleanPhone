package com.iab.omid.library.ironsrc.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f25228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f25229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f25230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f25231e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f25227a = context;
        this.f25228b = (AudioManager) context.getSystemService("audio");
        this.f25229c = aVar;
        this.f25230d = cVar;
    }

    private float a() {
        return this.f25229c.a(this.f25228b.getStreamVolume(3), this.f25228b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f25230d.a(this.f25231e);
    }

    public void c() {
        this.f25231e = a();
        b();
        this.f25227a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f25227a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f25231e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f25231e;
    }
}
