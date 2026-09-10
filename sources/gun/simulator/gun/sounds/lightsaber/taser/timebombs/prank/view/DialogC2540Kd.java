package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import defpackage.HorizontalSpaceItemDecoration;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter.RvSceneChangeAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogChangeSceneBackgroundBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogC2540Kd extends AbstractDialogC3851k9 {
    public static final /* synthetic */ int e = 0;
    public final Weapon b;
    public final WeaponUseActivity c;
    public final RvSceneChangeAdapter d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC2540Kd(Context context, Weapon weapon, WeaponUseActivity weaponUseActivity) {
        super(context, R.style.FullScreenDimEnabledStyle);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        this.b = weapon;
        this.c = weaponUseActivity;
        this.d = new RvSceneChangeAdapter();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0078 A[RETURN, SYNTHETIC] */
    public static final int d(DialogC2540Kd dialogC2540Kd, int i) {
        String resourceEntryName;
        Context context = dialogC2540Kd.getContext();
        AbstractC2995aW.p(context, "getContext(...)");
        try {
            resourceEntryName = context.getResources().getResourceEntryName(i);
            AbstractC2995aW.n(resourceEntryName);
        } catch (Resources.NotFoundException unused) {
            resourceEntryName = "unknown";
        }
        switch (resourceEntryName) {
            case "universe":
                return R.drawable.bg_scene_universe;
            case "unknown":
                Object obj = AbstractC3197ck0.l.get(dialogC2540Kd.c.h);
                AbstractC2995aW.n(obj);
                return ((Number) obj).intValue();
            case "war":
                return R.drawable.bg_scene_war;
            case "city":
                return R.drawable.bg_scene_city_war;
            case "rain":
                return R.drawable.bg_scene_rain;
            case "sebo":
                return R.drawable.bg_scene_sebo;
            default:
                return 0;
        }
    }

    public static final int e(DialogC2540Kd dialogC2540Kd, int i) {
        dialogC2540Kd.getClass();
        if (i == 1) {
            return R.raw.war;
        }
        if (i == 2) {
            return R.raw.rain;
        }
        if (i == 3) {
            return R.raw.universe;
        }
        if (i == 4) {
            return R.raw.sebo;
        }
        if (i != 5) {
            return 0;
        }
        return R.raw.city;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractDialogC3851k9
    public final ViewBinding b() {
        DialogChangeSceneBackgroundBinding dialogChangeSceneBackgroundBindingInflate = DialogChangeSceneBackgroundBinding.inflate(getLayoutInflater());
        AbstractC2995aW.p(dialogChangeSceneBackgroundBindingInflate, "inflate(...)");
        return dialogChangeSceneBackgroundBindingInflate;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractDialogC3851k9
    public final void c() {
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.AlphaAnimStyle);
        }
        ((DialogChangeSceneBackgroundBinding) a()).rvSceneChoose.setLayoutManager(new GridLayoutManager(getContext(), 2));
        RecyclerView recyclerView = ((DialogChangeSceneBackgroundBinding) a()).rvSceneChoose;
        RvSceneChangeAdapter rvSceneChangeAdapter = this.d;
        recyclerView.setAdapter(rvSceneChangeAdapter);
        ((DialogChangeSceneBackgroundBinding) a()).rvSceneChoose.addItemDecoration(new HorizontalSpaceItemDecoration(AbstractC3375el.x(3.0f)));
        rvSceneChangeAdapter.f(AbstractC3197ck0.j);
        rvSceneChangeAdapter.d = new C2462Hd(this);
        final int i = 0;
        ((DialogChangeSceneBackgroundBinding) a()).ivCloseDialog.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fd
            public final /* synthetic */ DialogC2540Kd b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                DialogC2540Kd dialogC2540Kd = this.b;
                switch (i2) {
                    case 0:
                        AbstractC2995aW.q(dialogC2540Kd, "this$0");
                        Context context = dialogC2540Kd.getContext();
                        AbstractC2995aW.p(context, "getContext(...)");
                        C2498In c2498In = App.n;
                        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context, "button_sound/button_sound.ogg", null), 2);
                        AbstractC3651ht.b(dialogC2540Kd);
                        break;
                    default:
                        AbstractC2995aW.q(dialogC2540Kd, "this$0");
                        AbstractC3651ht.b(dialogC2540Kd);
                        break;
                }
            }
        });
        final int i2 = 1;
        ((DialogChangeSceneBackgroundBinding) a()).rootBg.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fd
            public final /* synthetic */ DialogC2540Kd b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                DialogC2540Kd dialogC2540Kd = this.b;
                switch (i3) {
                    case 0:
                        AbstractC2995aW.q(dialogC2540Kd, "this$0");
                        Context context = dialogC2540Kd.getContext();
                        AbstractC2995aW.p(context, "getContext(...)");
                        C2498In c2498In = App.n;
                        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context, "button_sound/button_sound.ogg", null), 2);
                        AbstractC3651ht.b(dialogC2540Kd);
                        break;
                    default:
                        AbstractC2995aW.q(dialogC2540Kd, "this$0");
                        AbstractC3651ht.b(dialogC2540Kd);
                        break;
                }
            }
        });
        ((DialogChangeSceneBackgroundBinding) a()).rvSceneChoose.post(new P0(this, 8));
    }
}
