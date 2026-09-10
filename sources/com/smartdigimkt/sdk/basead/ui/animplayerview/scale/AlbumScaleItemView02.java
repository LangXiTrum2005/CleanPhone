package com.smartdigimkt.sdk.basead.ui.animplayerview.scale;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.smartdigimkt.n8.h;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class AlbumScaleItemView02 extends BaseAlbumScaleItemView {
    private ImageView j0;
    private ImageView k0;
    private ImageView l0;

    public AlbumScaleItemView02(Context context) {
        this(context, null);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.scale.BaseAlbumScaleItemView
    public int a(Context context) {
        return h.a(context, "myoffer_scale_second", "layout");
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.scale.BaseAlbumScaleItemView
    public void initView(View view) {
        super.initView(view);
        Context context = getContext();
        this.j0 = (ImageView) view.findViewById(h.a(context, "iv_left", "id"));
        this.k0 = (ImageView) view.findViewById(h.a(context, "iv_right_top", "id"));
        this.l0 = (ImageView) view.findViewById(h.a(context, "iv_right_bottom", "id"));
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.scale.BaseAlbumScaleItemView, com.smartdigimkt.o5.b
    public void setBitmapResources(List<Bitmap> list) {
        if (list == null || list.size() < 4) {
            return;
        }
        ImageView imageView = this.k0;
        if (imageView != null) {
            imageView.setImageBitmap(list.get(0));
        }
        ImageView imageView2 = this.j0;
        if (imageView2 != null) {
            imageView2.setImageBitmap(list.get(1));
        }
        ImageView imageView3 = this.l0;
        if (imageView3 != null) {
            imageView3.setImageBitmap(list.get(3));
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.scale.BaseAlbumScaleItemView, com.smartdigimkt.o5.b
    public void start() {
        if (this.f0 == null) {
            this.f0 = new AnimatorSet();
            ImageView imageView = this.j0;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "translationX", 0.0f, -(imageView.getX() + this.j0.getWidth()));
            ImageView imageView2 = this.j0;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView2, "translationY", 0.0f, (float) (-Math.cos(imageView2.getY())));
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.k0, "translationX", 0.0f, getScreenWidth() - this.k0.getX());
            ImageView imageView3 = this.k0;
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(imageView3, "translationY", 0.0f, (float) (-Math.cos(imageView3.getY())));
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.l0, "translationX", 0.0f, getScreenWidth() - this.l0.getX());
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.l0, "translationY", 0.0f, (float) Math.cos(getScreenHeight() - this.l0.getY()));
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, 5.0f);
            ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, 5.0f);
            this.f0.setDuration(2000L);
            this.f0.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f0.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat6, objectAnimatorOfFloat5, objectAnimatorOfFloat7, objectAnimatorOfFloat8);
            long j = this.i0;
            if (j > 0) {
                this.f0.setStartDelay(j);
            }
        }
        this.f0.start();
    }

    public AlbumScaleItemView02(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlbumScaleItemView02(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
