package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class Mi0 extends WG implements InterfaceC2766Sw {
    final /* synthetic */ Context $context;
    final /* synthetic */ Si0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mi0(Si0 si0, Context context) {
        super(1);
        this.this$0 = si0;
        this.$context = context;
    }

    public final void invoke(boolean z) {
        if (z) {
            this.this$0.downloadMraidJs(this.$context);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C5033xf0.f5238a;
    }
}
