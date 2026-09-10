package com.ironsource.sdk.controller;

import android.app.Activity;
import android.media.AudioManager;
import com.ironsource.C0474n4;
import com.ironsource.R7;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class t {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AudioManager f30508a;

        public a(AudioManager audioManager) {
            this.f30508a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.a(this.f30508a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AudioManager f30509a;

        public b(AudioManager audioManager) {
            this.f30509a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.b(this.f30509a);
        }
    }

    public static void a(Activity activity) {
        R7.f27125a.b(new a((AudioManager) activity.getSystemService("audio")));
    }

    public static void b(Activity activity) {
        R7.f27125a.b(new b((AudioManager) activity.getSystemService("audio")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(AudioManager audioManager) {
        try {
            audioManager.abandonAudioFocus(null);
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(AudioManager audioManager) {
        try {
            audioManager.requestAudioFocus(null, 3, 2);
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }
}
