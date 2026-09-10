package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4681tf0 implements InterfaceC4593sf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5044a;
    public final ViewBinding b;

    public AbstractC4681tf0(ConstraintLayout constraintLayout, LifecycleOwner lifecycleOwner) {
        AbstractC2340Cl.I(new X9(this, 3));
        this.b = e(constraintLayout);
        for (View view : d()) {
            c(view, null);
        }
        AbstractC2277Aa.a((V9) this, lifecycleOwner);
        Context context = this.b.getRoot().getContext();
        AbstractC2995aW.p(context, "getContext(...)");
        this.f5044a = context;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2303Ba
    public final void b(LifecycleOwner lifecycleOwner, Lifecycle.State state) {
        AbstractC2995aW.q(lifecycleOwner, "source");
        AbstractC2995aW.q(state, "targetState");
    }

    public final void c(View view, final InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        if (interfaceC2766Sw == null) {
            view.setOnClickListener(new ViewOnClickListenerC3176ca(this, 4));
        } else {
            final int i = 1;
            view.setOnClickListener(new View.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ba
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i2 = i;
                    InterfaceC2766Sw interfaceC2766Sw2 = interfaceC2766Sw;
                    switch (i2) {
                        case 0:
                            AbstractC2995aW.q(interfaceC2766Sw2, "$tmp0");
                            interfaceC2766Sw2.invoke(view2);
                            break;
                        default:
                            AbstractC2995aW.q(interfaceC2766Sw2, "$tmp0");
                            interfaceC2766Sw2.invoke(view2);
                            break;
                    }
                }
            });
        }
    }

    public abstract View[] d();

    public abstract ViewBinding e(ConstraintLayout constraintLayout);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2303Ba
    public void a() {
    }
}
