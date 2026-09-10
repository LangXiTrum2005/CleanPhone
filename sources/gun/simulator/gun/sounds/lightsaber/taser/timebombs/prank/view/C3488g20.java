package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ContextWrapper;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Build;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.g20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3488g20 extends WG implements InterfaceC2714Qw {
    public static final C3488g20 g = new C3488g20(0);
    public static final C3488g20 h = new C3488g20(1);
    public static final C3488g20 i = new C3488g20(2);
    public static final C3488g20 j = new C3488g20(3);
    public static final C3488g20 k = new C3488g20(4);
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3488g20(int i2) {
        super(0);
        this.f = i2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final Object invoke() {
        int i2 = this.f;
        switch (i2) {
            case 0:
                SoundPool.Builder maxStreams = new SoundPool.Builder().setMaxStreams(20);
                AudioAttributes.Builder builder = new AudioAttributes.Builder();
                builder.setLegacyStreamType(3);
                return maxStreams.setAudioAttributes(builder.build()).build();
            case 1:
                switch (i2) {
                    case 1:
                        return new C3894kh0();
                    default:
                        return new C3894kh0();
                }
            case 2:
                return AbstractC4748uQ.a();
            case 3:
                ContextWrapper contextWrapper = (ContextWrapper) App.n.f();
                return Build.VERSION.SDK_INT >= 23 ? new C3213cv(contextWrapper, 1) : new C3213cv(contextWrapper, 0);
            default:
                switch (i2) {
                    case 1:
                        return new C3894kh0();
                    default:
                        return new C3894kh0();
                }
        }
    }
}
