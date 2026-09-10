package com.iab.omid.library.adcolony.a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f21445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f21446c;
    private final c d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f21447e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f21444a = context;
        this.f21445b = (AudioManager) context.getSystemService("audio");
        this.f21446c = aVar;
        this.d = cVar;
    }

    private float c() {
        return this.f21446c.a(this.f21445b.getStreamVolume(3), this.f21445b.getStreamMaxVolume(3));
    }

    private void d() {
        this.d.a(this.f21447e);
    }

    public void a() {
        this.f21447e = c();
        d();
        this.f21444a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void b() {
        this.f21444a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2) {
        super.onChange(z2);
        float fC = c();
        if (a(fC)) {
            this.f21447e = fC;
            d();
        }
    }

    private boolean a(float f) {
        return f != this.f21447e;
    }
}
