package com.iab.omid.library.bytedance2.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f21738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f21739c;
    private final c d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f21740e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f21737a = context;
        this.f21738b = (AudioManager) context.getSystemService("audio");
        this.f21739c = aVar;
        this.d = cVar;
    }

    private float a() {
        return this.f21739c.a(this.f21738b.getStreamVolume(3), this.f21738b.getStreamMaxVolume(3));
    }

    private void b() {
        this.d.a(this.f21740e);
    }

    public void c() {
        this.f21740e = a();
        b();
        this.f21737a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f21737a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2) {
        super.onChange(z2);
        float fA = a();
        if (a(fA)) {
            this.f21740e = fA;
            b();
        }
    }

    private boolean a(float f) {
        return f != this.f21740e;
    }
}
