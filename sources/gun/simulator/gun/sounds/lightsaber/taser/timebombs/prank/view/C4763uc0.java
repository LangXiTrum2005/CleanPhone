package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4763uc0 extends WG implements InterfaceC2714Qw {
    public final /* synthetic */ int f;
    public final /* synthetic */ C5027xc0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4763uc0(C5027xc0 c5027xc0, int i) {
        super(0);
        this.f = i;
        this.g = c5027xc0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final Object invoke() {
        int i = this.f;
        C5027xc0 c5027xc0 = this.g;
        switch (i) {
            case 0:
                return new Formatter((StringBuilder) c5027xc0.z.getValue(), Locale.getDefault());
            case 1:
                return new Handler(c5027xc0.f5232a.getMainLooper(), new W9(c5027xc0, 6));
            default:
                c5027xc0.c(true);
                c5027xc0.d(c5027xc0.t);
                return C5033xf0.f5238a;
        }
    }
}
