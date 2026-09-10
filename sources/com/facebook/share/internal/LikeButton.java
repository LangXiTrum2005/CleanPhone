package com.facebook.share.internal;

import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import com.charging.screenshow.battery.animations.themes.R;
import com.facebook.FacebookButtonBase;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class LikeButton extends FacebookButtonBase {
    @Override // com.facebook.FacebookButtonBase
    public int getDefaultRequestCode() {
        return 0;
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultStyleResource() {
        return R.style.com_facebook_button_like;
    }

    @Override // android.widget.TextView, android.view.View
    @Deprecated
    public void setSelected(boolean z2) {
        super.setSelected(z2);
        if (isSelected()) {
            setCompoundDrawablesWithIntrinsicBounds(2131231082, 0, 0, 0);
            setText(getResources().getString(R.string.com_facebook_like_button_liked));
        } else {
            setCompoundDrawablesWithIntrinsicBounds(AppCompatResources.a(getContext(), R.drawable.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
            setText(getResources().getString(R.string.com_facebook_like_button_not_liked));
        }
    }
}
