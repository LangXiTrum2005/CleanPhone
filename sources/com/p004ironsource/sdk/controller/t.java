package com.p004ironsource.sdk.controller;

import android.app.Activity;
import android.media.AudioManager;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.pg;
import com.p004ironsource.q9;

/* JADX INFO: loaded from: classes5.dex */
class t {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AudioManager f27020a;

        public a(AudioManager audioManager) {
            this.f27020a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.a(this.f27020a);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AudioManager f27021a;

        public b(AudioManager audioManager) {
            this.f27021a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.d(this.f27021a);
        }
    }

    public static void a(Activity activity) {
        pg.f26494a.b(new a((AudioManager) activity.getSystemService("audio")));
    }

    public static void b(Activity activity) {
        pg.f26494a.b(new b((AudioManager) activity.getSystemService("audio")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(AudioManager audioManager) {
        try {
            audioManager.requestAudioFocus(null, 3, 2);
        } catch (Throwable th) {
            q9.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(AudioManager audioManager) {
        try {
            audioManager.abandonAudioFocus(null);
        } catch (Throwable th) {
            q9.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }
}
