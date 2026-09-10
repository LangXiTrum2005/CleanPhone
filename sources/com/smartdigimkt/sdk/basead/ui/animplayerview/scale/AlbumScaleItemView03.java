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
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class AlbumScaleItemView03 extends BaseAlbumScaleItemView {
    private ImageView j0;
    private ImageView k0;
    private ImageView l0;
    private ImageView m0;
    private ImageView n0;
    private ImageView o0;
    private ImageView p0;

    public AlbumScaleItemView03(Context context) {
        this(context, null);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.scale.BaseAlbumScaleItemView
    public int a(Context context) {
        return h.a(context, "myoffer_scale_third", "layout");
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.scale.BaseAlbumScaleItemView
    public void initView(View view) {
        super.initView(view);
        Context context = getContext();
        this.j0 = (ImageView) view.findViewById(h.a(context, "iv_left_01", "id"));
        this.k0 = (ImageView) view.findViewById(h.a(context, "iv_left_02", "id"));
        this.l0 = (ImageView) view.findViewById(h.a(context, "iv_left_03", "id"));
        this.m0 = (ImageView) view.findViewById(h.a(context, "iv_left_04", "id"));
        this.n0 = (ImageView) view.findViewById(h.a(context, "iv_right_01", "id"));
        this.o0 = (ImageView) view.findViewById(h.a(context, "iv_right_02", "id"));
        this.p0 = (ImageView) view.findViewById(h.a(context, "iv_right_03", "id"));
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.scale.BaseAlbumScaleItemView, com.smartdigimkt.o5.b
    public void setBitmapResources(List<Bitmap> list) {
        if (list == null || list.size() < 4) {
            return;
        }
        ImageView imageView = this.j0;
        if (imageView != null) {
            imageView.setImageBitmap(list.get(2));
        }
        ImageView imageView2 = this.k0;
        if (imageView2 != null) {
            imageView2.setImageBitmap(list.get(0));
        }
        ImageView imageView3 = this.l0;
        if (imageView3 != null) {
            imageView3.setImageBitmap(list.get(3));
        }
        ImageView imageView4 = this.m0;
        if (imageView4 != null) {
            imageView4.setImageBitmap(list.get(0));
        }
        ImageView imageView5 = this.n0;
        if (imageView5 != null) {
            imageView5.setImageBitmap(list.get(1));
        }
        ImageView imageView6 = this.o0;
        if (imageView6 != null) {
            imageView6.setImageBitmap(list.get(2));
        }
        ImageView imageView7 = this.p0;
        if (imageView7 != null) {
            imageView7.setImageBitmap(list.get(3));
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.scale.BaseAlbumScaleItemView, com.smartdigimkt.o5.b
    public void start() {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        if (this.f0 == null) {
            this.f0 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            if (this.h0) {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.l0, "translationX", 0.0f, -dip2px(20.0f));
                objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.l0, "translationY", 0.0f, dip2px(15.0f));
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.n0, "translationX", 0.0f, dip2px(15.0f));
                objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.n0, "translationY", 0.0f, dip2px(15.0f));
            }
            arrayList.add(objectAnimatorOfFloat);
            arrayList.add(objectAnimatorOfFloat2);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, this.g0);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, this.g0);
            arrayList.add(objectAnimatorOfFloat3);
            arrayList.add(objectAnimatorOfFloat4);
            this.f0.setDuration(4000L);
            this.f0.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f0.playTogether(arrayList);
            long j = this.i0;
            if (j > 0) {
                this.f0.setStartDelay(j);
            }
        }
        this.f0.start();
    }

    public AlbumScaleItemView03(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlbumScaleItemView03(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
