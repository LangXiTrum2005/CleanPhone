package com.smartdigimkt.l3;

import A.AbstractC0891g;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f36333c = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AudioManager f36334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AudioFocusRequest f36335b;

    public void a(Context context) {
        this.f36334a = (AudioManager) context.getSystemService("audio");
        if (Build.VERSION.SDK_INT >= 26) {
            this.f36335b = AbstractC0891g.m().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build()).setAcceptsDelayedFocusGain(false).build();
        }
    }

    public boolean b() {
        try {
            return (Build.VERSION.SDK_INT >= 26 ? this.f36334a.requestAudioFocus(this.f36335b) : this.f36334a.requestAudioFocus(null, 3, 2)) == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    public void a() {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f36334a.abandonAudioFocusRequest(this.f36335b);
            } else {
                this.f36334a.abandonAudioFocus(null);
            }
        } catch (Exception unused) {
        }
    }
}
