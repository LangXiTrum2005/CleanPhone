package com.adcolony.sdk;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
class i extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AudioManager f9171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdColonyInterstitial f9172b;

    public i(Handler handler, AdColonyInterstitial adColonyInterstitial) {
        super(handler);
        Context contextA = a.a();
        if (contextA != null) {
            this.f9171a = (AudioManager) contextA.getSystemService("audio");
            this.f9172b = adColonyInterstitial;
            contextA.getApplicationContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
        }
    }

    public void a() {
        Context contextA = a.a();
        if (contextA != null) {
            contextA.getApplicationContext().getContentResolver().unregisterContentObserver(this);
        }
        this.f9172b = null;
        this.f9171a = null;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2) {
        AdColonyInterstitial adColonyInterstitial;
        if (this.f9171a == null || (adColonyInterstitial = this.f9172b) == null || adColonyInterstitial.d() == null) {
            return;
        }
        double streamVolume = (this.f9171a.getStreamVolume(3) / 15.0f) * 100.0f;
        f1 f1VarB = c0.b();
        c0.a(f1VarB, "audio_percentage", streamVolume);
        c0.a(f1VarB, "ad_session_id", this.f9172b.d().a());
        c0.b(f1VarB, "id", this.f9172b.d().c());
        new h0("AdContainer.on_audio_change", this.f9172b.d().k(), f1VarB).c();
    }
}
