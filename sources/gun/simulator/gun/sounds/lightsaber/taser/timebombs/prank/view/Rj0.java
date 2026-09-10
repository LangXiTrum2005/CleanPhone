package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.LayoutTimeBombBinding;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class Rj0 extends WG implements InterfaceC2766Sw {
    public static final Rj0 f = new Rj0(1);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final Object invoke(Object obj) {
        LayoutTimeBombBinding layoutTimeBombBinding = (LayoutTimeBombBinding) obj;
        AbstractC2995aW.q(layoutTimeBombBinding, "binding");
        OS os = new OS();
        FrameLayout frameLayout = layoutTimeBombBinding.ivMinusOneMin;
        AbstractC2995aW.p(frameLayout, "ivMinusOneMin");
        FrameLayout frameLayout2 = layoutTimeBombBinding.ivAddOneMin;
        AbstractC2995aW.p(frameLayout2, "ivAddOneMin");
        FrameLayout frameLayout3 = layoutTimeBombBinding.ivMinusOneSecond;
        AbstractC2995aW.p(frameLayout3, "ivMinusOneSecond");
        FrameLayout frameLayout4 = layoutTimeBombBinding.ivAddOneSecond;
        AbstractC2995aW.p(frameLayout4, "ivAddOneSecond");
        FrameLayout frameLayout5 = layoutTimeBombBinding.ivBgRefresh;
        AbstractC2995aW.p(frameLayout5, "ivBgRefresh");
        FrameLayout frameLayout6 = layoutTimeBombBinding.ivBgPause;
        AbstractC2995aW.p(frameLayout6, "ivBgPause");
        ImageView imageView = layoutTimeBombBinding.ivBgStart;
        AbstractC2995aW.p(imageView, "ivBgStart");
        Iterator it = AbstractC2340Cl.h(frameLayout, frameLayout2, frameLayout3, frameLayout4, frameLayout5, frameLayout6, imageView).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnTouchListener(os);
        }
        return C5033xf0.f5238a;
    }
}
