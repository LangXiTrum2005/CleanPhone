package androidx.media3.ui;

import android.view.View;
import androidx.media3.common.Player;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f7753Y;

    public /* synthetic */ b(Object obj, int i2) {
        this.X = i2;
        this.f7753Y = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f7753Y;
        switch (this.X) {
            case 0:
                PlayerControlView playerControlView = PlayerControlView.this;
                Player player = playerControlView.k1;
                if (player != null && player.k(29)) {
                    TrackSelectionParameters trackSelectionParametersN = playerControlView.k1.n();
                    Player player2 = playerControlView.k1;
                    int i2 = Util.f5683a;
                    player2.u(trackSelectionParametersN.a().b(1).f(1).a());
                    playerControlView.j0.j[1] = playerControlView.getResources().getString(com.charging.screenshow.battery.animations.themes.R.string.exo_track_selection_auto);
                    playerControlView.o0.dismiss();
                    break;
                }
                break;
            case 1:
                int i3 = PlayerControlView.SettingViewHolder.g;
                PlayerControlView.SettingViewHolder settingViewHolder = (PlayerControlView.SettingViewHolder) obj;
                int bindingAdapterPosition = settingViewHolder.getBindingAdapterPosition();
                PlayerControlView playerControlView2 = PlayerControlView.this;
                View view2 = playerControlView2.D0;
                if (bindingAdapterPosition == 0) {
                    view2.getClass();
                    playerControlView2.e(playerControlView2.k0, view2);
                } else if (bindingAdapterPosition != 1) {
                    playerControlView2.o0.dismiss();
                } else {
                    view2.getClass();
                    playerControlView2.e(playerControlView2.m0, view2);
                }
                break;
            case 2:
                PlayerControlView playerControlView3 = PlayerControlView.this;
                Player player3 = playerControlView3.k1;
                if (player3 != null && player3.k(29)) {
                    playerControlView3.k1.u(playerControlView3.k1.n().a().b(3).d().a());
                    playerControlView3.o0.dismiss();
                    break;
                }
                break;
            case 3:
                PlayerControlViewLayoutManager playerControlViewLayoutManager = (PlayerControlViewLayoutManager) obj;
                playerControlViewLayoutManager.g();
                if (view.getId() == com.charging.screenshow.battery.animations.themes.R.id.exo_overflow_show) {
                    playerControlViewLayoutManager.q.start();
                } else if (view.getId() == com.charging.screenshow.battery.animations.themes.R.id.exo_overflow_hide) {
                    playerControlViewLayoutManager.r.start();
                }
                break;
            default:
                PlayerControlView.a((PlayerControlView) obj);
                break;
        }
    }
}
