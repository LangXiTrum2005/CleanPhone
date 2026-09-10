package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;

/* JADX INFO: loaded from: classes4.dex */
public final class LayoutBombEffectBinding implements ViewBinding {

    @NonNull
    public final ImageView ivEffect;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextureView vvEffect;

    private LayoutBombEffectBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull TextureView textureView) {
        this.rootView = frameLayout;
        this.ivEffect = imageView;
        this.vvEffect = textureView;
    }

    @NonNull
    public static LayoutBombEffectBinding bind(@NonNull View view) {
        int i = R.id.iv_effect;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_effect);
        if (imageView != null) {
            i = R.id.vv_effect;
            TextureView textureView = (TextureView) ViewBindings.findChildViewById(view, R.id.vv_effect);
            if (textureView != null) {
                return new LayoutBombEffectBinding((FrameLayout) view, imageView, textureView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutBombEffectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutBombEffectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_bomb_effect, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
