package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.AudioAttributes;
import android.media.AudioTrack;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.um, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4782um {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4619sw f5100a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final InterfaceC3759j7[] i;

    public C4782um(C4619sw c4619sw, int i, int i2, int i3, int i4, int i5, int i6, int i7, InterfaceC3759j7[] interfaceC3759j7Arr) {
        this.f5100a = c4619sw;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = interfaceC3759j7Arr;
    }

    public static AudioAttributes c(Z6 z6, boolean z) {
        return z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) z6.a().b;
    }

    public final AudioTrack a(boolean z, Z6 z6, int i) {
        int i2 = this.c;
        try {
            AudioTrack audioTrackB = b(z, z6, i);
            int state = audioTrackB.getState();
            if (state == 1) {
                return audioTrackB;
            }
            try {
                audioTrackB.release();
            } catch (Exception unused) {
            }
            throw new C4462r7(state, this.e, this.f, this.h, this.f5100a, i2 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new C4462r7(0, this.e, this.f, this.h, this.f5100a, i2 == 1, e);
        }
    }

    public final AudioTrack b(boolean z, Z6 z6, int i) {
        int i2 = Ug0.f3833a;
        int i3 = this.g;
        int i4 = this.f;
        int i5 = this.e;
        if (i2 >= 29) {
            return AbstractC4255om.e().setAudioAttributes(c(z6, z)).setAudioFormat(C2315Bm.e(i5, i4, i3)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(this.c == 1).build();
        }
        if (i2 >= 21) {
            return new AudioTrack(c(z6, z), C2315Bm.e(i5, i4, i3), this.h, 1, i);
        }
        int iB = Ug0.B(z6.c);
        if (i == 0) {
            return new AudioTrack(iB, this.e, this.f, this.g, this.h, 1);
        }
        return new AudioTrack(iB, this.e, this.f, this.g, this.h, 1, i);
    }
}
