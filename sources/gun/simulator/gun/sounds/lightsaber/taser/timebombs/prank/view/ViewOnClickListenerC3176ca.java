package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.datepicker.MaterialDatePicker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.SettingActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogLoadingRewardAdsBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC3176ca implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4227a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ViewOnClickListenerC3176ca(Object obj, int i) {
        this.f4227a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f4227a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((InterfaceC3265da) obj).onClickView(view);
                break;
            case 1:
                ((MaterialDatePicker) obj).lambda$initHeaderToggle$0(view);
                break;
            case 2:
                C4663tT c4663tT = (C4663tT) obj;
                c4663tT.c(c4663tT.b);
                break;
            case 3:
                MainActivity mainActivity = (MainActivity) obj;
                int i2 = MainActivity.j;
                AbstractC2995aW.q(mainActivity, "this$0");
                S3.b("main_page_click", "settings");
                S3.b("setting_page_display", "russian_roulette");
                S3.b("setting_page_display", "main");
                C2498In c2498In = App.n;
                WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(mainActivity, "button_sound/button_sound.ogg", null), 2);
                mainActivity.toAty(SettingActivity.class);
                break;
            case 4:
                ((InterfaceC4593sf0) obj).onClickView(view);
                break;
            case 5:
                DialogC3094bd dialogC3094bd = (DialogC3094bd) obj;
                int i3 = DialogC3094bd.e;
                AbstractC2995aW.q(dialogC3094bd, "this$0");
                int i4 = dialogC3094bd.c.h;
                if (i4 == 0) {
                    S3.b("reload_click", "machine_gun");
                } else if (i4 == 1) {
                    S3.b("reload_click", "lightsaber");
                } else if (i4 == 2) {
                    S3.b("reload_click", "taser");
                } else if (i4 == 3) {
                    S3.b("reload_click", "time_bomb");
                } else if (i4 == 4) {
                    S3.b("reload_click", "sci_fi_gun");
                }
                Context context = dialogC3094bd.getContext();
                AbstractC2995aW.p(context, "getContext(...)");
                C2498In c2498In2 = App.n;
                WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context, "button_sound/button_sound.ogg", null), 2);
                InterfaceC2766Sw interfaceC2766Sw = dialogC3094bd.d;
                if (interfaceC2766Sw != null) {
                    interfaceC2766Sw.invoke(Boolean.TRUE);
                }
                AbstractC3651ht.b(dialogC3094bd);
                break;
            case 6:
                SI si = (SI) obj;
                int i5 = SI.l;
                AbstractC2995aW.q(si, "this$0");
                si.f++;
                si.f();
                ((DialogLoadingRewardAdsBinding) si.a()).conLoadingReward.setVisibility(0);
                ((DialogLoadingRewardAdsBinding) si.a()).conLoadingRewardError.setVisibility(8);
                break;
            case 7:
                DialogC4228oX dialogC4228oX = (DialogC4228oX) obj;
                int i6 = DialogC4228oX.e;
                AbstractC2995aW.q(dialogC4228oX, "this$0");
                AbstractC3651ht.b(dialogC4228oX);
                break;
            default:
                C2770Ta c2770Ta = (C2770Ta) obj;
                AbstractC2995aW.q(c2770Ta, "this$0");
                c2770Ta.a();
                ImageView imageView = c2770Ta.e;
                if (imageView != null) {
                    AbstractC2340Cl.D(imageView);
                }
                ImageView imageView2 = c2770Ta.e;
                if (imageView2 != null) {
                    imageView2.setEnabled(false);
                    break;
                }
                break;
        }
    }
}
