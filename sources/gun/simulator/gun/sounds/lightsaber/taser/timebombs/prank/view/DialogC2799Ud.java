package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import defpackage.HorizontalSpaceItemDecoration;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter.RvEffectChangeAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogChangeShootEffectBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogC2799Ud extends AbstractDialogC3851k9 {
    public static final /* synthetic */ int e = 0;
    public final Weapon b;
    public final InterfaceC2591Md c;
    public final RvEffectChangeAdapter d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC2799Ud(Context context, Weapon weapon, PL pl) {
        super(context, R.style.FullScreenDimEnabledStyle);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        this.b = weapon;
        this.c = pl;
        this.d = new RvEffectChangeAdapter();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractDialogC3851k9
    public final ViewBinding b() {
        DialogChangeShootEffectBinding dialogChangeShootEffectBindingInflate = DialogChangeShootEffectBinding.inflate(getLayoutInflater());
        AbstractC2995aW.p(dialogChangeShootEffectBindingInflate, "inflate(...)");
        return dialogChangeShootEffectBindingInflate;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractDialogC3851k9
    public final void c() {
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.AlphaAnimStyle);
        }
        ((DialogChangeShootEffectBinding) a()).rvEffectChoose.setLayoutManager(new GridLayoutManager(getContext(), 2));
        RecyclerView recyclerView = ((DialogChangeShootEffectBinding) a()).rvEffectChoose;
        RvEffectChangeAdapter rvEffectChangeAdapter = this.d;
        recyclerView.setAdapter(rvEffectChangeAdapter);
        ((DialogChangeShootEffectBinding) a()).rvEffectChoose.addItemDecoration(new HorizontalSpaceItemDecoration(AbstractC3375el.x(3.0f)));
        rvEffectChangeAdapter.f(AbstractC4781ul0.d);
        C2498In c2498In = App.n;
        final int i = 0;
        WD.D(C2498In.g(), null, 0, new C2643Od(this, null), 3);
        rvEffectChangeAdapter.d = new C2721Rd(this);
        ((DialogChangeShootEffectBinding) a()).ivCloseDialog.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ld
            public final /* synthetic */ DialogC2799Ud b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                DialogC2799Ud dialogC2799Ud = this.b;
                switch (i2) {
                    case 0:
                        AbstractC2995aW.q(dialogC2799Ud, "this$0");
                        Context context = dialogC2799Ud.getContext();
                        AbstractC2995aW.p(context, "getContext(...)");
                        C2498In c2498In2 = App.n;
                        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context, "button_sound/button_sound.ogg", null), 2);
                        AbstractC3651ht.b(dialogC2799Ud);
                        break;
                    default:
                        AbstractC2995aW.q(dialogC2799Ud, "this$0");
                        AbstractC3651ht.b(dialogC2799Ud);
                        break;
                }
            }
        });
        final int i2 = 1;
        ((DialogChangeShootEffectBinding) a()).rootBg.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ld
            public final /* synthetic */ DialogC2799Ud b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                DialogC2799Ud dialogC2799Ud = this.b;
                switch (i3) {
                    case 0:
                        AbstractC2995aW.q(dialogC2799Ud, "this$0");
                        Context context = dialogC2799Ud.getContext();
                        AbstractC2995aW.p(context, "getContext(...)");
                        C2498In c2498In2 = App.n;
                        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context, "button_sound/button_sound.ogg", null), 2);
                        AbstractC3651ht.b(dialogC2799Ud);
                        break;
                    default:
                        AbstractC2995aW.q(dialogC2799Ud, "this$0");
                        AbstractC3651ht.b(dialogC2799Ud);
                        break;
                }
            }
        });
        ((DialogChangeShootEffectBinding) a()).rvEffectChoose.post(new P0(this, 9));
    }
}
