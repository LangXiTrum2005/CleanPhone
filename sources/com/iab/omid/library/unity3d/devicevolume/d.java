package com.iab.omid.library.unity3d.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f25496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f25497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f25498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f25499e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f25495a = context;
        this.f25496b = (AudioManager) context.getSystemService("audio");
        this.f25497c = aVar;
        this.f25498d = cVar;
    }

    private float a() {
        return this.f25497c.a(this.f25496b.getStreamVolume(3), this.f25496b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f25498d.a(this.f25499e);
    }

    public void c() {
        this.f25499e = a();
        b();
        this.f25495a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f25495a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f25499e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f25499e;
    }
}
