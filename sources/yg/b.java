package yg;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import cn.y1;
import com.adjust.sdk.Constants;
import f.q;
import kotlin.jvm.internal.n;
import sg.c;
import wj.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f54398a = r9.b.u(new q(this, 8));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y1 f54399b;

    public static Vibrator a(b bVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService = super.h().getSystemService("vibrator_manager");
            n.d(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
            return ((VibratorManager) systemService).getDefaultVibrator();
        }
        Object systemService2 = super.h().getSystemService("vibrator");
        n.d(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
        return (Vibrator) systemService2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void b(String str, double d10, double d11) {
        Vibrator vibratorC = c();
        if (vibratorC == null || !vibratorC.hasVibrator()) {
            return;
        }
        switch (str.hashCode()) {
            case -1867169789:
                if (str.equals("success")) {
                    VibrationEffect vibrationEffectCreateOneShot = VibrationEffect.createOneShot(100L, -1);
                    Vibrator vibratorC2 = c();
                    if (vibratorC2 != null) {
                        vibratorC2.vibrate(vibrationEffectCreateOneShot);
                    }
                    break;
                }
                break;
            case -1078030475:
                if (str.equals(Constants.MEDIUM)) {
                    VibrationEffect vibrationEffectCreateOneShot2 = VibrationEffect.createOneShot(100L, 128);
                    Vibrator vibratorC3 = c();
                    if (vibratorC3 != null) {
                        vibratorC3.vibrate(vibrationEffectCreateOneShot2);
                    }
                    break;
                }
                break;
            case -891986215:
                if (str.equals("stride") && d10 > 0.0d) {
                    y1 y1Var = this.f54399b;
                    if (y1Var != null) {
                        y1Var.a(null);
                    }
                    this.f54399b = android.support.v4.media.session.a.B(new a(d10, this, d11, null));
                }
                break;
            case 3327612:
                if (str.equals(Constants.LONG)) {
                    VibrationEffect vibrationEffectCreateOneShot3 = VibrationEffect.createOneShot(1000L, -1);
                    Vibrator vibratorC4 = c();
                    if (vibratorC4 != null) {
                        vibratorC4.vibrate(vibrationEffectCreateOneShot3);
                    }
                    break;
                }
                break;
            case 96784904:
                if (str.equals("error")) {
                    VibrationEffect vibrationEffectCreateWaveform = VibrationEffect.createWaveform(new long[]{0, 300, 100, 300, 100, 300}, new int[]{0, 255, 0, 255, 0, 255}, -1);
                    Vibrator vibratorC5 = c();
                    if (vibratorC5 != null) {
                        vibratorC5.vibrate(vibrationEffectCreateWaveform);
                    }
                    break;
                }
                break;
            case 99152071:
                if (str.equals("heavy")) {
                    VibrationEffect vibrationEffectCreateOneShot4 = VibrationEffect.createOneShot(150L, 255);
                    Vibrator vibratorC6 = c();
                    if (vibratorC6 != null) {
                        vibratorC6.vibrate(vibrationEffectCreateOneShot4);
                    }
                    break;
                }
                break;
            case 102970646:
                if (str.equals("light")) {
                    VibrationEffect vibrationEffectCreateOneShot5 = VibrationEffect.createOneShot(50L, 64);
                    Vibrator vibratorC7 = c();
                    if (vibratorC7 != null) {
                        vibratorC7.vibrate(vibrationEffectCreateOneShot5);
                    }
                    break;
                }
                break;
            case 1124446108:
                if (str.equals("warning")) {
                    VibrationEffect vibrationEffectCreateWaveform2 = VibrationEffect.createWaveform(new long[]{0, 200, 100, 200}, new int[]{0, 128, 0, 128}, -1);
                    Vibrator vibratorC8 = c();
                    if (vibratorC8 != null) {
                        vibratorC8.vibrate(vibrationEffectCreateWaveform2);
                    }
                    break;
                }
                break;
            case 1249833864:
                if (str.equals("selectionChanged")) {
                    VibrationEffect vibrationEffectCreateOneShot6 = VibrationEffect.createOneShot(25L, 32);
                    Vibrator vibratorC9 = c();
                    if (vibratorC9 != null) {
                        vibratorC9.vibrate(vibrationEffectCreateOneShot6);
                    }
                    break;
                }
                break;
        }
    }

    public final Vibrator c() {
        return (Vibrator) this.f54398a.getValue();
    }
}
