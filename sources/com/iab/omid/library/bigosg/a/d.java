package com.iab.omid.library.bigosg.a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f21633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f21634c;
    private final c d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f21635e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f21632a = context;
        this.f21633b = (AudioManager) context.getSystemService("audio");
        this.f21634c = aVar;
        this.d = cVar;
    }

    private float c() {
        return this.f21634c.a(this.f21633b.getStreamVolume(3), this.f21633b.getStreamMaxVolume(3));
    }

    private void d() {
        this.d.a(this.f21635e);
    }

    public final void a() {
        this.f21635e = c();
        d();
        this.f21632a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f21632a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        super.onChange(z2);
        float fC = c();
        if (a(fC)) {
            this.f21635e = fC;
            d();
        }
    }

    private boolean a(float f) {
        return f != this.f21635e;
    }
}
