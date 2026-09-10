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
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter.RvSceneChangeAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogChangeSceneBackgroundBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogC2384Ed extends AbstractDialogC3851k9 {
    public static final /* synthetic */ int d = 0;
    public final RussianRouletteActivity b;
    public final RvSceneChangeAdapter c;

    public DialogC2384Ed(RussianRouletteActivity russianRouletteActivity, RussianRouletteActivity russianRouletteActivity2) {
        super(russianRouletteActivity, R.style.FullScreenDimEnabledStyle);
        this.b = russianRouletteActivity2;
        this.c = new RvSceneChangeAdapter();
    }

    public static final int d(DialogC2384Ed dialogC2384Ed, int i) {
        dialogC2384Ed.getClass();
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
        RvSceneChangeAdapter rvSceneChangeAdapter = this.c;
        recyclerView.setAdapter(rvSceneChangeAdapter);
        ((DialogChangeSceneBackgroundBinding) a()).rvSceneChoose.addItemDecoration(new HorizontalSpaceItemDecoration(AbstractC3375el.x(3.0f)));
        rvSceneChangeAdapter.f(AbstractC3197ck0.j);
        rvSceneChangeAdapter.d = new C2306Bd(this);
        final int i = 0;
        ((DialogChangeSceneBackgroundBinding) a()).ivCloseDialog.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zd
            public final /* synthetic */ DialogC2384Ed b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                DialogC2384Ed dialogC2384Ed = this.b;
                switch (i2) {
                    case 0:
                        AbstractC2995aW.q(dialogC2384Ed, "this$0");
                        Context context = dialogC2384Ed.getContext();
                        AbstractC2995aW.p(context, "getContext(...)");
                        C2498In c2498In = App.n;
                        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context, "button_sound/button_sound.ogg", null), 2);
                        AbstractC3651ht.b(dialogC2384Ed);
                        break;
                    default:
                        AbstractC2995aW.q(dialogC2384Ed, "this$0");
                        AbstractC3651ht.b(dialogC2384Ed);
                        break;
                }
            }
        });
        final int i2 = 1;
        ((DialogChangeSceneBackgroundBinding) a()).rootBg.setOnClickListener(new View.OnClickListener(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zd
            public final /* synthetic */ DialogC2384Ed b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                DialogC2384Ed dialogC2384Ed = this.b;
                switch (i3) {
                    case 0:
                        AbstractC2995aW.q(dialogC2384Ed, "this$0");
                        Context context = dialogC2384Ed.getContext();
                        AbstractC2995aW.p(context, "getContext(...)");
                        C2498In c2498In = App.n;
                        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C8(context, "button_sound/button_sound.ogg", null), 2);
                        AbstractC3651ht.b(dialogC2384Ed);
                        break;
                    default:
                        AbstractC2995aW.q(dialogC2384Ed, "this$0");
                        AbstractC3651ht.b(dialogC2384Ed);
                        break;
                }
            }
        });
        ((DialogChangeSceneBackgroundBinding) a()).rvSceneChoose.post(new P0(this, 7));
    }
}
