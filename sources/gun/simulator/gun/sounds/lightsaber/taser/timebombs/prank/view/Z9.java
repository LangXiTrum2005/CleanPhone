package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import com.basic.lib.basic.BasicRvAdapterNotBinding;
import com.basic.lib.basic.BasicRvViewHolderNotBinding;
import com.basic.lib.withbinding.BasicRvAdapter;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.material.snackbar.Snackbar;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.underlying.UnderlyingRvAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.underlying.UnderlyingRvViewHolder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Z9 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4057a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ Z9(int i, Object obj, Object obj2) {
        this.f4057a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object objB;
        int i = this.f4057a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                AbstractC2995aW.q((BasicRvAdapterNotBinding) obj2, "this$0");
                AbstractC2995aW.q((BasicRvViewHolderNotBinding) obj, "$viewHolder");
                break;
            case 1:
                BasicRvAdapter basicRvAdapter = (BasicRvAdapter) obj2;
                BasicRvViewHolderNotBinding basicRvViewHolderNotBinding = (BasicRvViewHolderNotBinding) obj;
                AbstractC2995aW.q(basicRvAdapter, "this$0");
                AbstractC2995aW.q(basicRvViewHolderNotBinding, "$viewHolder");
                InterfaceC3567gx interfaceC3567gx = basicRvAdapter.d;
                if (interfaceC3567gx != null && (objB = basicRvAdapter.b(basicRvViewHolderNotBinding.getAdapterPosition())) != null) {
                    interfaceC3567gx.invoke(objB, basicRvViewHolderNotBinding);
                    break;
                }
                break;
            case 2:
                ((Snackbar) obj2).lambda$setAction$0((View.OnClickListener) obj, view);
                break;
            case 3:
                Integer num = C4663tT.s;
                ((C4663tT) obj2).c((C3784jT) obj);
                break;
            case 4:
                AbstractC2995aW.q((UnderlyingRvAdapter) obj2, "this$0");
                AbstractC2995aW.q((UnderlyingRvViewHolder) obj, "$viewHolder");
                break;
            default:
                C3355eb c3355eb = (C3355eb) obj2;
                C2770Ta c2770Ta = (C2770Ta) obj;
                AbstractC2995aW.q(c3355eb, "this$0");
                AbstractC2995aW.q(c2770Ta, "this$1");
                WeaponUseActivity weaponUseActivity = c3355eb.f4847a;
                if (Ch0.a(weaponUseActivity).b) {
                    c3355eb.E = false;
                    PlayerView playerView = c2770Ta.d;
                    if (playerView != null) {
                        AbstractC2340Cl.D(playerView);
                    }
                    Ch0 ch0A = Ch0.a(weaponUseActivity);
                    C2736Rs c2736Rs = ch0A.c;
                    if (c2736Rs != null) {
                        c2736Rs.J(false);
                        ch0A.c.e(0, 0L, false);
                    }
                    c2770Ta.a();
                }
                break;
        }
    }
}
