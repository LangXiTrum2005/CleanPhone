package com.smartdigimkt.sdk.basead.ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.smartdigimkt.d7.b;
import com.smartdigimkt.d7.e;
import com.smartdigimkt.k5.d;
import com.smartdigimkt.sdk.basead.ui.WrapRoundImageView;
import com.smartdigimkt.sdk.core.common.res.image.RecycleImageView;
import com.smartdigimkt.v3.i;
import com.smartdigimkt.w6.f;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseMainAnimPlayerView extends BaseAnimPlayerView {
    public BaseMainAnimPlayerView(Context context) {
        this(context, null);
    }

    public void a(Context context) {
        RecycleImageView recycleImageView = new RecycleImageView(context);
        this.C0 = recycleImageView;
        recycleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.C0, -1, -1);
        this.D0 = new WrapRoundImageView(context);
        RelativeLayout.LayoutParams layoutParamsF = androidx.media3.extractor.text.ttml.a.f(-1, -1, 13);
        this.D0.setScaleType(ImageView.ScaleType.FIT_CENTER);
        addView(this.D0, layoutParamsF);
        a(this.D0);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView, com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void init(f fVar, com.smartdigimkt.v6.a aVar, boolean z2, List<Bitmap> list, d dVar) {
        super.init(fVar, aVar, z2, list, dVar);
        a(getContext().getApplicationContext());
    }

    public BaseMainAnimPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseMainAnimPlayerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public class a implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WrapRoundImageView f38454a;

        /* JADX INFO: renamed from: com.smartdigimkt.sdk.basead.ui.animplayerview.BaseMainAnimPlayerView$a$a, reason: collision with other inner class name */
        public class RunnableC0604a implements Runnable {
            final /* synthetic */ Bitmap X;

            public RunnableC0604a(Bitmap bitmap) {
                this.X = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f38454a.setBitmapAndResize(this.X, BaseMainAnimPlayerView.this.getWidth(), BaseMainAnimPlayerView.this.getHeight());
            }
        }

        public class b implements com.smartdigimkt.o8.b.InterfaceC0563b {
            public b() {
            }

            @Override // com.smartdigimkt.o8.b.InterfaceC0563b
            public void a() {
            }

            @Override // com.smartdigimkt.o8.b.InterfaceC0563b
            public void a(Bitmap bitmap) {
                BaseMainAnimPlayerView.this.C0.setImageBitmap(bitmap);
            }
        }

        public a(WrapRoundImageView wrapRoundImageView) {
            this.f38454a = wrapRoundImageView;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, BaseMainAnimPlayerView.this.B0)) {
                WrapRoundImageView wrapRoundImageView = this.f38454a;
                if (wrapRoundImageView != null) {
                    wrapRoundImageView.post(new RunnableC0604a(bitmap));
                }
                BaseMainAnimPlayerView baseMainAnimPlayerView = BaseMainAnimPlayerView.this;
                if (baseMainAnimPlayerView.C0 == null || bitmap == null) {
                    return;
                }
                com.smartdigimkt.o8.b.a(baseMainAnimPlayerView.getContext(), bitmap, new b());
            }
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
            BaseMainAnimPlayerView.this.b(i.a("40003", "Animation render fail"));
        }
    }

    public void a(WrapRoundImageView wrapRoundImageView) {
        b.a(getContext()).a(new e(1, this.B0), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new a(wrapRoundImageView));
    }
}
