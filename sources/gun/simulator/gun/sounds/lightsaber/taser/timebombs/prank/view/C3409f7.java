package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.f7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3409f7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f4352a;
    public final C3233d7 b;
    public InterfaceC3321e7 c;
    public Z6 d;
    public int e;
    public int f;
    public float g = 1.0f;
    public AudioFocusRequest h;

    public C3409f7(Context context, Handler handler, SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f4352a = audioManager;
        this.c = surfaceHolderCallbackC2658Os;
        this.b = new C3233d7(this, handler);
        this.e = 0;
    }

    public final void a() {
        if (this.e == 0) {
            return;
        }
        int i = Ug0.f3833a;
        AudioManager audioManager = this.f4352a;
        if (i >= 26) {
            AudioFocusRequest audioFocusRequest = this.h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.b);
        }
        d(0);
    }

    public final void b(int i) {
        InterfaceC3321e7 interfaceC3321e7 = this.c;
        if (interfaceC3321e7 != null) {
            C2736Rs c2736Rs = ((SurfaceHolderCallbackC2658Os) interfaceC3321e7).f3526a;
            boolean zV = c2736Rs.v();
            int i2 = 1;
            if (zV && i != 1) {
                i2 = 2;
            }
            c2736Rs.N(i, i2, zV);
        }
    }

    public final void c() {
        if (Ug0.a(this.d, null)) {
            return;
        }
        this.d = null;
        this.f = 0;
    }

    public final void d(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        InterfaceC3321e7 interfaceC3321e7 = this.c;
        if (interfaceC3321e7 != null) {
            C2736Rs c2736Rs = ((SurfaceHolderCallbackC2658Os) interfaceC3321e7).f3526a;
            c2736Rs.H(1, 2, Float.valueOf(c2736Rs.Z * c2736Rs.z.g));
        }
    }

    public final int e(int i, boolean z) {
        int iRequestAudioFocus;
        AudioFocusRequest.Builder builderI;
        int i2 = 1;
        if (i == 1 || this.f != 1) {
            a();
            return z ? 1 : -1;
        }
        if (!z) {
            return -1;
        }
        if (this.e != 1) {
            int i3 = Ug0.f3833a;
            AudioManager audioManager = this.f4352a;
            C3233d7 c3233d7 = this.b;
            if (i3 >= 26) {
                AudioFocusRequest audioFocusRequest = this.h;
                if (audioFocusRequest == null) {
                    if (audioFocusRequest == null) {
                        AbstractC3921l0.r();
                        builderI = AbstractC3921l0.e(this.f);
                    } else {
                        AbstractC3921l0.r();
                        builderI = AbstractC3921l0.i(this.h);
                    }
                    Z6 z6 = this.d;
                    boolean z2 = z6 != null && z6.f4055a == 1;
                    z6.getClass();
                    this.h = builderI.setAudioAttributes((AudioAttributes) z6.a().b).setWillPauseWhenDucked(z2).setOnAudioFocusChangeListener(c3233d7).build();
                }
                iRequestAudioFocus = audioManager.requestAudioFocus(this.h);
            } else {
                Z6 z7 = this.d;
                z7.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(c3233d7, Ug0.B(z7.c), this.f);
            }
            if (iRequestAudioFocus == 1) {
                d(1);
            } else {
                d(0);
                i2 = -1;
            }
        }
        return i2;
    }
}
