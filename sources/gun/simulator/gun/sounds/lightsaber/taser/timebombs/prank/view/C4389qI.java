package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4389qI extends WG implements InterfaceC2766Sw {
    public final /* synthetic */ int f;
    public final /* synthetic */ DialogC4476rI g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4389qI(DialogC4476rI dialogC4476rI, int i) {
        super(1);
        this.f = i;
        this.g = dialogC4476rI;
    }

    public final void a(View view) {
        int i = this.f;
        DialogC4476rI dialogC4476rI = this.g;
        switch (i) {
            case 0:
                AbstractC2995aW.q(view, "it");
                AbstractC3651ht.b(dialogC4476rI);
                break;
            case 1:
                AbstractC2995aW.q(view, "it");
                ((DialogC4228oX) dialogC4476rI.d.getValue()).show();
                AbstractC3651ht.b(dialogC4476rI);
                break;
            default:
                AbstractC2995aW.q(view, "it");
                AbstractC3651ht.b(dialogC4476rI);
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        switch (this.f) {
            case 0:
                a((View) obj);
                break;
            case 1:
                a((View) obj);
                break;
            default:
                a((View) obj);
                break;
        }
        return c5033xf0;
    }
}
