package com.smartdigimkt.sdk.basead.ui.animplayerview.scale;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.o5.c;
import com.smartdigimkt.sdk.basead.ui.WrapRoundImageView;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class AlbumScaleAnimatorView extends FrameLayout implements c {
    private List<Bitmap> e0;
    private AlbumScaleMainView f0;
    private BaseAlbumScaleItemView g0;
    private BaseAlbumScaleItemView h0;
    private BaseAlbumScaleItemView i0;
    private boolean j0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AlbumScaleAnimatorView.this.j0 = true;
            AlbumScaleAnimatorView.this.g0.start();
            AlbumScaleAnimatorView.this.h0.setStartDelay(200L);
            AlbumScaleAnimatorView.this.h0.start();
            AlbumScaleAnimatorView.this.f0.setStartDelay(300L);
            AlbumScaleAnimatorView.this.f0.start();
            AlbumScaleAnimatorView.this.i0.setMainViewScale(AlbumScaleAnimatorView.this.f0.getMainViewScale());
            AlbumScaleAnimatorView.this.i0.setStartDelay(300L);
            AlbumScaleAnimatorView.this.i0.start();
        }
    }

    public AlbumScaleAnimatorView(Context context) {
        this(context, null);
    }

    @Override // com.smartdigimkt.o5.c
    public void addMainView(Bitmap bitmap, WrapRoundImageView... wrapRoundImageViewArr) {
        if (bitmap == null) {
            return;
        }
        a(bitmap);
        c();
        b();
        a();
    }

    @Override // com.smartdigimkt.o5.b
    public void pause() {
        AlbumScaleMainView albumScaleMainView = this.f0;
        if (albumScaleMainView != null) {
            albumScaleMainView.pause();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView = this.g0;
        if (baseAlbumScaleItemView != null) {
            baseAlbumScaleItemView.pause();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView2 = this.h0;
        if (baseAlbumScaleItemView2 != null) {
            baseAlbumScaleItemView2.pause();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView3 = this.i0;
        if (baseAlbumScaleItemView3 != null) {
            baseAlbumScaleItemView3.pause();
        }
    }

    @Override // com.smartdigimkt.o5.c
    public void release() {
        List<Bitmap> list = this.e0;
        if (list != null) {
            for (Bitmap bitmap : list) {
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
            this.e0.clear();
        }
        AlbumScaleMainView albumScaleMainView = this.f0;
        if (albumScaleMainView != null) {
            albumScaleMainView.release();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView = this.g0;
        if (baseAlbumScaleItemView != null) {
            baseAlbumScaleItemView.release();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView2 = this.h0;
        if (baseAlbumScaleItemView2 != null) {
            baseAlbumScaleItemView2.release();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView3 = this.i0;
        if (baseAlbumScaleItemView3 != null) {
            baseAlbumScaleItemView3.release();
        }
        removeAllViews();
    }

    @Override // com.smartdigimkt.o5.b
    public void resume() {
        AlbumScaleMainView albumScaleMainView = this.f0;
        if (albumScaleMainView != null) {
            albumScaleMainView.resume();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView = this.g0;
        if (baseAlbumScaleItemView != null) {
            baseAlbumScaleItemView.resume();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView2 = this.h0;
        if (baseAlbumScaleItemView2 != null) {
            baseAlbumScaleItemView2.resume();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView3 = this.i0;
        if (baseAlbumScaleItemView3 != null) {
            baseAlbumScaleItemView3.resume();
        }
    }

    @Override // com.smartdigimkt.o5.b
    public void setBitmapResources(List<Bitmap> list) {
        this.e0 = list;
    }

    @Override // com.smartdigimkt.o5.b
    public void start() {
        if (this.f0 == null || this.g0 == null || this.h0 == null || this.i0 == null) {
            return;
        }
        if (this.j0) {
            resume();
        } else {
            post(new a());
        }
    }

    @Override // com.smartdigimkt.o5.b
    public void stop() {
        AlbumScaleMainView albumScaleMainView = this.f0;
        if (albumScaleMainView != null) {
            albumScaleMainView.stop();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView = this.g0;
        if (baseAlbumScaleItemView != null) {
            baseAlbumScaleItemView.stop();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView2 = this.h0;
        if (baseAlbumScaleItemView2 != null) {
            baseAlbumScaleItemView2.stop();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView3 = this.i0;
        if (baseAlbumScaleItemView3 != null) {
            baseAlbumScaleItemView3.stop();
        }
        this.j0 = false;
    }

    public AlbumScaleAnimatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b() {
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        AlbumScaleItemView02 albumScaleItemView02 = new AlbumScaleItemView02(getContext());
        albumScaleItemView02.setOrientation(d());
        albumScaleItemView02.setBitmapResources(this.e0);
        addView(albumScaleItemView02, layoutParams);
        this.h0 = albumScaleItemView02;
    }

    private void c() {
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        AlbumScaleItemView03 albumScaleItemView03 = new AlbumScaleItemView03(getContext());
        albumScaleItemView03.setBitmapResources(this.e0);
        albumScaleItemView03.setOrientation(d());
        addView(albumScaleItemView03, layoutParams);
        this.i0 = albumScaleItemView03;
    }

    private boolean d() {
        return h.g(getContext());
    }

    public AlbumScaleAnimatorView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.j0 = false;
    }

    private void a(Bitmap bitmap) {
        AlbumScaleMainView albumScaleMainView = new AlbumScaleMainView(getContext());
        this.f0 = albumScaleMainView;
        albumScaleMainView.setLayoutParams(a(d()));
        addView(this.f0);
        this.f0.initView(bitmap, true);
    }

    private ViewGroup.LayoutParams a(boolean z2) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z2 ? a(90) : a(42), z2 ? a(42) : a(90));
        layoutParams.gravity = 17;
        return layoutParams;
    }

    private void a() {
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        AlbumScaleItemView01 albumScaleItemView01 = new AlbumScaleItemView01(getContext());
        albumScaleItemView01.setBitmapResources(this.e0);
        albumScaleItemView01.setOrientation(d());
        addView(albumScaleItemView01, layoutParams);
        this.g0 = albumScaleItemView01;
    }

    private int a(int i2) {
        return h.a(getContext(), i2);
    }
}
