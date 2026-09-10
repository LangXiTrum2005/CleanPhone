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
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter.RvLightSaberEffectChangeAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogChangeLightSaberEffectBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogC5116yd extends AbstractDialogC3851k9 {
    public static final /* synthetic */ int e = 0;
    public final Weapon b;
    public final Lj0 c;
    public final RvLightSaberEffectChangeAdapter d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC5116yd(Context context, Weapon weapon, Lj0 lj0) {
        super(context, R.style.FullScreenDimEnabledStyle);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        this.b = weapon;
        this.c = lj0;
        this.d = new RvLightSaberEffectChangeAdapter();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractDialogC3851k9
    public final ViewBinding b() {
        DialogChangeLightSaberEffectBinding dialogChangeLightSaberEffectBindingInflate = DialogChangeLightSaberEffectBinding.inflate(getLayoutInflater());
        AbstractC2995aW.p(dialogChangeLightSaberEffectBindingInflate, "inflate(...)");
        return dialogChangeLightSaberEffectBindingInflate;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractDialogC3851k9
    public final void c() {
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.AlphaAnimStyle);
        }
        ((DialogChangeLightSaberEffectBinding) a()).rvEffectChoose.setLayoutManager(new GridLayoutManager(getContext(), 2));
        RecyclerView recyclerView = ((DialogChangeLightSaberEffectBinding) a()).rvEffectChoose;
        RvLightSaberEffectChangeAdapter rvLightSaberEffectChangeAdapter = this.d;
        recyclerView.setAdapter(rvLightSaberEffectChangeAdapter);
        ((DialogChangeLightSaberEffectBinding) a()).rvEffectChoose.addItemDecoration(new HorizontalSpaceItemDecoration(AbstractC3375el.x(3.0f)));
        rvLightSaberEffectChangeAdapter.f(AbstractC4781ul0.e);
        rvLightSaberEffectChangeAdapter.d = new C4764ud(this);
        final int i = 0;
        ((DialogChangeLightSaberEffectBinding) a()).ivCloseDialog.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sd
            public final /* synthetic */ DialogC5116yd b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                DialogC5116yd dialogC5116yd = this.b;
                switch (i2) {
                    case 0:
                        AbstractC2995aW.q(dialogC5116yd, "this$0");
                        Context context = dialogC5116yd.getContext();
                        AbstractC2995aW.p(context, "getContext(...)");
                        C2498In c2498In = App.n;
                        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context, "button_sound/button_sound.ogg", null), 2);
                        AbstractC3651ht.b(dialogC5116yd);
                        break;
                    default:
                        AbstractC2995aW.q(dialogC5116yd, "this$0");
                        AbstractC3651ht.b(dialogC5116yd);
                        break;
                }
            }
        });
        final int i2 = 1;
        ((DialogChangeLightSaberEffectBinding) a()).rootBg.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sd
            public final /* synthetic */ DialogC5116yd b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                DialogC5116yd dialogC5116yd = this.b;
                switch (i3) {
                    case 0:
                        AbstractC2995aW.q(dialogC5116yd, "this$0");
                        Context context = dialogC5116yd.getContext();
                        AbstractC2995aW.p(context, "getContext(...)");
                        C2498In c2498In = App.n;
                        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context, "button_sound/button_sound.ogg", null), 2);
                        AbstractC3651ht.b(dialogC5116yd);
                        break;
                    default:
                        AbstractC2995aW.q(dialogC5116yd, "this$0");
                        AbstractC3651ht.b(dialogC5116yd);
                        break;
                }
            }
        });
        ((DialogChangeLightSaberEffectBinding) a()).rvEffectChoose.post(new P0(this, 6));
    }
}
