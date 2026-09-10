package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import androidx.annotation.DoNotInline;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3056b7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AudioAttributes f4158a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    @DoNotInline
    public static int[] a() {
        C5086yC c5086yC = AC.b;
        C4998xC c4998xC = new C4998xC();
        Yf0 it = C3144c7.e.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), f4158a)) {
                c4998xC.H0(num);
            }
        }
        c4998xC.H0(2);
        return AbstractC2995aW.z0(c4998xC.J0());
    }

    @DoNotInline
    public static int b(int i, int i2) {
        for (int i3 = 8; i3 > 0; i3--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(Ug0.p(i3)).build(), f4158a)) {
                return i3;
            }
        }
        return 0;
    }
}
