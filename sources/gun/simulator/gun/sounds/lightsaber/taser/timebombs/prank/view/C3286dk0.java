package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Vibrator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3286dk0 extends WG implements InterfaceC2714Qw {
    public final /* synthetic */ int f;
    public final /* synthetic */ AbstractC4340pk0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3286dk0(AbstractC4340pk0 abstractC4340pk0, int i) {
        super(0);
        this.f = i;
        this.g = abstractC4340pk0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final Object invoke() {
        int i = this.f;
        AbstractC4340pk0 abstractC4340pk0 = this.g;
        switch (i) {
            case 0:
                return new R7(abstractC4340pk0.f4847a, null, new W9(abstractC4340pk0, 5), 2);
            case 1:
                SoundPool.Builder maxStreams = new SoundPool.Builder().setMaxStreams(abstractC4340pk0.b.getMagazineCapacity());
                AudioAttributes.Builder builder = new AudioAttributes.Builder();
                builder.setLegacyStreamType(3);
                return maxStreams.setAudioAttributes(builder.build()).build();
            default:
                Object systemService = abstractC4340pk0.f4847a.getSystemService("vibrator");
                if (systemService instanceof Vibrator) {
                    return (Vibrator) systemService;
                }
                return null;
        }
    }
}
