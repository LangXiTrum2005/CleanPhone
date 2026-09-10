package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.basic.lib.basic.view.RadiusImageView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;

/* JADX INFO: loaded from: classes4.dex */
public final class NotificationCustomContentBinding implements ViewBinding {

    @NonNull
    public final RadiusImageView iconApp;

    @NonNull
    public final ImageView img;

    @NonNull
    public final View oval;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tv;

    @NonNull
    public final TextView tvAppName;

    @NonNull
    public final TextView tvClaim;

    @NonNull
    public final TextView tvUnlocked;

    @NonNull
    public final TextView tvWeaponUnlocked;

    private NotificationCustomContentBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RadiusImageView radiusImageView, @NonNull ImageView imageView, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = constraintLayout;
        this.iconApp = radiusImageView;
        this.img = imageView;
        this.oval = view;
        this.tv = textView;
        this.tvAppName = textView2;
        this.tvClaim = textView3;
        this.tvUnlocked = textView4;
        this.tvWeaponUnlocked = textView5;
    }

    @NonNull
    public static NotificationCustomContentBinding bind(@NonNull View view) {
        int i = R.id.icon_app;
        RadiusImageView radiusImageView = (RadiusImageView) ViewBindings.findChildViewById(view, R.id.icon_app);
        if (radiusImageView != null) {
            i = R.id.img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img);
            if (imageView != null) {
                i = R.id.oval;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.oval);
                if (viewFindChildViewById != null) {
                    i = R.id.tv;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv);
                    if (textView != null) {
                        i = R.id.tv_app_name;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_name);
                        if (textView2 != null) {
                            i = R.id.tv_claim;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_claim);
                            if (textView3 != null) {
                                i = R.id.tv_unlocked;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_unlocked);
                                if (textView4 != null) {
                                    i = R.id.tv_weapon_unlocked;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_weapon_unlocked);
                                    if (textView5 != null) {
                                        return new NotificationCustomContentBinding((ConstraintLayout) view, radiusImageView, imageView, viewFindChildViewById, textView, textView2, textView3, textView4, textView5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static NotificationCustomContentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NotificationCustomContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.notification_custom_content, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
