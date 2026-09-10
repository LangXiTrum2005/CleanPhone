package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.LightSaber;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Taser;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TechnologyGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogExitRetainBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogRewardBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogC5143ys extends AbstractDialogC3851k9 {
    public static final /* synthetic */ int f = 0;
    public final /* synthetic */ int b;
    public final Weapon c;
    public C5055xs d;
    public AnimatorSet e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC5143ys(MainActivity mainActivity, Weapon weapon, int i) {
        super(mainActivity, R.style.FullScreenStyle);
        this.b = i;
        if (i != 1) {
            AbstractC2995aW.q(mainActivity, com.umeng.analytics.pro.f.X);
            AbstractC2995aW.q(weapon, "mWeapon");
            this.c = weapon;
            return;
        }
        AbstractC2995aW.q(mainActivity, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(weapon, "mWeapon");
        super(mainActivity, R.style.FullScreenStyle);
        this.c = weapon;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractDialogC3851k9
    public final ViewBinding b() {
        switch (this.b) {
            case 0:
                DialogExitRetainBinding dialogExitRetainBindingInflate = DialogExitRetainBinding.inflate(getLayoutInflater());
                AbstractC2995aW.p(dialogExitRetainBindingInflate, "inflate(...)");
                return dialogExitRetainBindingInflate;
            default:
                DialogRewardBinding dialogRewardBindingInflate = DialogRewardBinding.inflate(getLayoutInflater());
                AbstractC2995aW.p(dialogRewardBindingInflate, "inflate(...)");
                return dialogRewardBindingInflate;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractDialogC3851k9
    public final void c() {
        int i = this.b;
        final int i2 = 2;
        final int i3 = 1;
        final int i4 = 0;
        Weapon weapon = this.c;
        switch (i) {
            case 0:
                S3.a("exit_record_display");
                ImageView imageView = ((DialogExitRetainBinding) a()).ivWeapon;
                AbstractC2995aW.p(imageView, "ivWeapon");
                Oh0.d(imageView, weapon.getThumbnailId());
                ((DialogExitRetainBinding) a()).tvTry.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vs
                    public final /* synthetic */ DialogC5143ys b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5 = i4;
                        DialogC5143ys dialogC5143ys = this.b;
                        switch (i5) {
                            case 0:
                                AbstractC2995aW.q(dialogC5143ys, "this$0");
                                S3.b("exit_record_click", "try");
                                Context context = dialogC5143ys.getContext();
                                AbstractC2995aW.p(context, "getContext(...)");
                                C2498In c2498In = App.n;
                                WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context, "button_sound/button_sound.ogg", null), 2);
                                AbstractC3651ht.b(dialogC5143ys);
                                C5055xs c5055xs = dialogC5143ys.d;
                                if (c5055xs != null) {
                                    c5055xs.a();
                                }
                                break;
                            case 1:
                                AbstractC2995aW.q(dialogC5143ys, "this$0");
                                S3.b("exit_record_click", "exit");
                                Context context2 = dialogC5143ys.getContext();
                                AbstractC2995aW.p(context2, "getContext(...)");
                                C2498In c2498In2 = App.n;
                                WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context2, "button_sound/button_sound.ogg", null), 2);
                                AbstractC3651ht.b(dialogC5143ys);
                                C5055xs c5055xs2 = dialogC5143ys.d;
                                if (c5055xs2 != null) {
                                    int i6 = c5055xs2.f5251a;
                                    InterfaceC2714Qw interfaceC2714Qw = c5055xs2.c;
                                    switch (i6) {
                                        case 0:
                                            if (interfaceC2714Qw != null) {
                                                interfaceC2714Qw.invoke();
                                            }
                                            break;
                                        case 1:
                                            if (interfaceC2714Qw != null) {
                                                interfaceC2714Qw.invoke();
                                            }
                                            break;
                                        default:
                                            if (interfaceC2714Qw != null) {
                                                interfaceC2714Qw.invoke();
                                            }
                                            break;
                                    }
                                }
                                break;
                            default:
                                AbstractC2995aW.q(dialogC5143ys, "this$0");
                                S3.b("exit_record_click", "close");
                                AbstractC3651ht.b(dialogC5143ys);
                                break;
                        }
                    }
                });
                ((DialogExitRetainBinding) a()).tvExit.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vs
                    public final /* synthetic */ DialogC5143ys b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5 = i3;
                        DialogC5143ys dialogC5143ys = this.b;
                        switch (i5) {
                            case 0:
                                AbstractC2995aW.q(dialogC5143ys, "this$0");
                                S3.b("exit_record_click", "try");
                                Context context = dialogC5143ys.getContext();
                                AbstractC2995aW.p(context, "getContext(...)");
                                C2498In c2498In = App.n;
                                WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context, "button_sound/button_sound.ogg", null), 2);
                                AbstractC3651ht.b(dialogC5143ys);
                                C5055xs c5055xs = dialogC5143ys.d;
                                if (c5055xs != null) {
                                    c5055xs.a();
                                }
                                break;
                            case 1:
                                AbstractC2995aW.q(dialogC5143ys, "this$0");
                                S3.b("exit_record_click", "exit");
                                Context context2 = dialogC5143ys.getContext();
                                AbstractC2995aW.p(context2, "getContext(...)");
                                C2498In c2498In2 = App.n;
                                WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context2, "button_sound/button_sound.ogg", null), 2);
                                AbstractC3651ht.b(dialogC5143ys);
                                C5055xs c5055xs2 = dialogC5143ys.d;
                                if (c5055xs2 != null) {
                                    int i6 = c5055xs2.f5251a;
                                    InterfaceC2714Qw interfaceC2714Qw = c5055xs2.c;
                                    switch (i6) {
                                        case 0:
                                            if (interfaceC2714Qw != null) {
                                                interfaceC2714Qw.invoke();
                                            }
                                            break;
                                        case 1:
                                            if (interfaceC2714Qw != null) {
                                                interfaceC2714Qw.invoke();
                                            }
                                            break;
                                        default:
                                            if (interfaceC2714Qw != null) {
                                                interfaceC2714Qw.invoke();
                                            }
                                            break;
                                    }
                                }
                                break;
                            default:
                                AbstractC2995aW.q(dialogC5143ys, "this$0");
                                S3.b("exit_record_click", "close");
                                AbstractC3651ht.b(dialogC5143ys);
                                break;
                        }
                    }
                });
                ((DialogExitRetainBinding) a()).ivClose.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vs
                    public final /* synthetic */ DialogC5143ys b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5 = i2;
                        DialogC5143ys dialogC5143ys = this.b;
                        switch (i5) {
                            case 0:
                                AbstractC2995aW.q(dialogC5143ys, "this$0");
                                S3.b("exit_record_click", "try");
                                Context context = dialogC5143ys.getContext();
                                AbstractC2995aW.p(context, "getContext(...)");
                                C2498In c2498In = App.n;
                                WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context, "button_sound/button_sound.ogg", null), 2);
                                AbstractC3651ht.b(dialogC5143ys);
                                C5055xs c5055xs = dialogC5143ys.d;
                                if (c5055xs != null) {
                                    c5055xs.a();
                                }
                                break;
                            case 1:
                                AbstractC2995aW.q(dialogC5143ys, "this$0");
                                S3.b("exit_record_click", "exit");
                                Context context2 = dialogC5143ys.getContext();
                                AbstractC2995aW.p(context2, "getContext(...)");
                                C2498In c2498In2 = App.n;
                                WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context2, "button_sound/button_sound.ogg", null), 2);
                                AbstractC3651ht.b(dialogC5143ys);
                                C5055xs c5055xs2 = dialogC5143ys.d;
                                if (c5055xs2 != null) {
                                    int i6 = c5055xs2.f5251a;
                                    InterfaceC2714Qw interfaceC2714Qw = c5055xs2.c;
                                    switch (i6) {
                                        case 0:
                                            if (interfaceC2714Qw != null) {
                                                interfaceC2714Qw.invoke();
                                            }
                                            break;
                                        case 1:
                                            if (interfaceC2714Qw != null) {
                                                interfaceC2714Qw.invoke();
                                            }
                                            break;
                                        default:
                                            if (interfaceC2714Qw != null) {
                                                interfaceC2714Qw.invoke();
                                            }
                                            break;
                                    }
                                }
                                break;
                            default:
                                AbstractC2995aW.q(dialogC5143ys, "this$0");
                                S3.b("exit_record_click", "close");
                                AbstractC3651ht.b(dialogC5143ys);
                                break;
                        }
                    }
                });
                ((DialogExitRetainBinding) a()).lavWeapon.a(new C4967ws(this, i4));
                break;
            default:
                S3.a("rewarded_pop_display");
                ImageView imageView2 = ((DialogRewardBinding) a()).ivWeapon;
                AbstractC2995aW.p(imageView2, "ivWeapon");
                Oh0.d(imageView2, weapon.getThumbnailId());
                ((DialogRewardBinding) a()).tvWeapon.setText(weapon.getName());
                ((DialogRewardBinding) a()).tvWeapon.setVisibility(((weapon instanceof LightSaber) || (weapon instanceof Taser) || (weapon instanceof TechnologyGun)) ? 8 : 0);
                ((DialogRewardBinding) a()).tvTry.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.YZ
                    public final /* synthetic */ DialogC5143ys b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5 = i4;
                        DialogC5143ys dialogC5143ys = this.b;
                        switch (i5) {
                            case 0:
                                int i6 = DialogC5143ys.f;
                                AbstractC2995aW.q(dialogC5143ys, "this$0");
                                S3.b("rewarded_pop_click", "try_now");
                                Context context = dialogC5143ys.getContext();
                                AbstractC2995aW.p(context, "getContext(...)");
                                C2498In c2498In = App.n;
                                WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context, "button_sound/button_sound.ogg", null), 2);
                                AbstractC3651ht.b(dialogC5143ys);
                                C5055xs c5055xs = dialogC5143ys.d;
                                if (c5055xs != null) {
                                    c5055xs.a();
                                }
                                break;
                            default:
                                int i7 = DialogC5143ys.f;
                                AbstractC2995aW.q(dialogC5143ys, "this$0");
                                S3.b("rewarded_pop_click", "close");
                                Context context2 = dialogC5143ys.getContext();
                                AbstractC2995aW.p(context2, "getContext(...)");
                                C2498In c2498In2 = App.n;
                                WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context2, "button_sound/button_sound.ogg", null), 2);
                                AbstractC3651ht.b(dialogC5143ys);
                                break;
                        }
                    }
                });
                ((DialogRewardBinding) a()).ivClose.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.YZ
                    public final /* synthetic */ DialogC5143ys b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5 = i3;
                        DialogC5143ys dialogC5143ys = this.b;
                        switch (i5) {
                            case 0:
                                int i6 = DialogC5143ys.f;
                                AbstractC2995aW.q(dialogC5143ys, "this$0");
                                S3.b("rewarded_pop_click", "try_now");
                                Context context = dialogC5143ys.getContext();
                                AbstractC2995aW.p(context, "getContext(...)");
                                C2498In c2498In = App.n;
                                WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context, "button_sound/button_sound.ogg", null), 2);
                                AbstractC3651ht.b(dialogC5143ys);
                                C5055xs c5055xs = dialogC5143ys.d;
                                if (c5055xs != null) {
                                    c5055xs.a();
                                }
                                break;
                            default:
                                int i7 = DialogC5143ys.f;
                                AbstractC2995aW.q(dialogC5143ys, "this$0");
                                S3.b("rewarded_pop_click", "close");
                                Context context2 = dialogC5143ys.getContext();
                                AbstractC2995aW.p(context2, "getContext(...)");
                                C2498In c2498In2 = App.n;
                                WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context2, "button_sound/button_sound.ogg", null), 2);
                                AbstractC3651ht.b(dialogC5143ys);
                                break;
                        }
                    }
                });
                ((DialogRewardBinding) a()).lavWeapon.a(new C4967ws(this, i2));
                break;
        }
    }
}
