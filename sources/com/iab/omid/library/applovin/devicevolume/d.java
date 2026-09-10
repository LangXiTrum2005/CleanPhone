package com.iab.omid.library.applovin.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f25094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f25095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f25096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f25097e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f25093a = context;
        this.f25094b = (AudioManager) context.getSystemService("audio");
        this.f25095c = aVar;
        this.f25096d = cVar;
    }

    private float a() {
        return this.f25095c.a(this.f25094b.getStreamVolume(3), this.f25094b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f25096d.a(this.f25097e);
    }

    public void c() {
        this.f25097e = a();
        b();
        this.f25093a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f25093a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f25097e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f25097e;
    }
}
