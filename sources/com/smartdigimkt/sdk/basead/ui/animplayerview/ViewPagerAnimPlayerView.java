package com.smartdigimkt.sdk.basead.ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.smartdigimkt.d7.b;
import com.smartdigimkt.d7.e;
import com.smartdigimkt.o5.c;
import com.smartdigimkt.sdk.basead.ui.WrapRoundImageView;
import com.smartdigimkt.sdk.basead.ui.animplayerview.viewpager.VpMainImgAnimatorView;
import com.smartdigimkt.sdk.core.common.res.image.RecycleImageView;
import com.smartdigimkt.v3.i;

/* JADX INFO: loaded from: classes6.dex */
public class ViewPagerAnimPlayerView extends BaseMainAnimPlayerView {
    private RecycleImageView G0;
    private c H0;
    private boolean I0;

    public ViewPagerAnimPlayerView(Context context) {
        this(context, null);
    }

    private void k() {
        WrapRoundImageView wrapRoundImageView = new WrapRoundImageView(getContext().getApplicationContext());
        WrapRoundImageView wrapRoundImageView2 = new WrapRoundImageView(getContext().getApplicationContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        wrapRoundImageView.setScaleType(scaleType);
        wrapRoundImageView2.setScaleType(scaleType);
        b.a(getContext()).a(new e(1, this.B0), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new a(wrapRoundImageView, wrapRoundImageView2));
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView
    public void d() {
        c cVar = this.H0;
        if (cVar != null) {
            cVar.release();
            this.H0 = null;
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView
    public void f() {
        c cVar = this.H0;
        if (cVar != null) {
            cVar.start();
        } else {
            this.I0 = true;
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView
    public void h() {
        c cVar = this.H0;
        if (cVar != null) {
            cVar.stop();
        }
    }

    public ViewPagerAnimPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView
    public void c() {
        c cVar = this.H0;
        if (cVar != null) {
            cVar.pause();
        }
    }

    public ViewPagerAnimPlayerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseMainAnimPlayerView
    public void a(Context context) {
        RecycleImageView recycleImageView = new RecycleImageView(context);
        this.G0 = recycleImageView;
        recycleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.G0, -1, -1);
        k();
    }

    public class a implements b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WrapRoundImageView f38458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WrapRoundImageView f38459b;

        /* JADX INFO: renamed from: com.smartdigimkt.sdk.basead.ui.animplayerview.ViewPagerAnimPlayerView$a$a, reason: collision with other inner class name */
        public class C0605a implements com.smartdigimkt.o8.b.InterfaceC0563b {
            public C0605a() {
            }

            @Override // com.smartdigimkt.o8.b.InterfaceC0563b
            public void a() {
            }

            @Override // com.smartdigimkt.o8.b.InterfaceC0563b
            public void a(Bitmap bitmap) {
                ViewPagerAnimPlayerView.this.G0.setImageBitmap(bitmap);
            }
        }

        public a(WrapRoundImageView wrapRoundImageView, WrapRoundImageView wrapRoundImageView2) {
            this.f38458a = wrapRoundImageView;
            this.f38459b = wrapRoundImageView2;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, ViewPagerAnimPlayerView.this.B0)) {
                if (ViewPagerAnimPlayerView.this.G0 != null && bitmap != null) {
                    com.smartdigimkt.o8.b.a(ViewPagerAnimPlayerView.this.getContext(), bitmap, new C0605a());
                }
                if (ViewPagerAnimPlayerView.this.H0 == null) {
                    ViewPagerAnimPlayerView.this.H0 = new VpMainImgAnimatorView(ViewPagerAnimPlayerView.this.getContext().getApplicationContext());
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(13);
                    ((View) ViewPagerAnimPlayerView.this.H0).setLayoutParams(layoutParams);
                    ViewPagerAnimPlayerView viewPagerAnimPlayerView = ViewPagerAnimPlayerView.this;
                    viewPagerAnimPlayerView.addView((View) viewPagerAnimPlayerView.H0);
                    ViewPagerAnimPlayerView.this.H0.addMainView(bitmap, this.f38458a, this.f38459b);
                }
                if (ViewPagerAnimPlayerView.this.I0) {
                    ViewPagerAnimPlayerView.this.I0 = false;
                    if (ViewPagerAnimPlayerView.this.H0 != null) {
                        ViewPagerAnimPlayerView.this.H0.start();
                    }
                }
            }
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
            ViewPagerAnimPlayerView.this.b(i.a("40003", "Animation render fail"));
        }
    }
}
