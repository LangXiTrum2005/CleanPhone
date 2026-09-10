package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.exoplayer2.ui.PlayerView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;

/* JADX INFO: loaded from: classes4.dex */
public final class LayoutBombEffectVideoBinding implements ViewBinding {

    @NonNull
    public final PlayerView playerView;

    @NonNull
    private final PlayerView rootView;

    private LayoutBombEffectVideoBinding(@NonNull PlayerView playerView, @NonNull PlayerView playerView2) {
        this.rootView = playerView;
        this.playerView = playerView2;
    }

    @NonNull
    public static LayoutBombEffectVideoBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        PlayerView playerView = (PlayerView) view;
        return new LayoutBombEffectVideoBinding(playerView, playerView);
    }

    @NonNull
    public static LayoutBombEffectVideoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutBombEffectVideoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_bomb_effect_video, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public PlayerView getRoot() {
        return this.rootView;
    }
}
