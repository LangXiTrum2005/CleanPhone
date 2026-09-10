package com.smartdigimkt.sdk.basead.ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.smartdigimkt.d7.b;
import com.smartdigimkt.d7.e;
import com.smartdigimkt.k5.d;
import com.smartdigimkt.o5.c;
import com.smartdigimkt.sdk.basead.ui.WrapRoundImageView;
import com.smartdigimkt.sdk.basead.ui.animplayerview.scale.AlbumScaleAnimatorView;
import com.smartdigimkt.v3.i;
import com.smartdigimkt.w6.f;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class AlbumScaleAnimPlayerView extends BaseMainAnimPlayerView {
    private c G0;
    private boolean H0;
    private List<Bitmap> I0;
    private Paint J0;

    public AlbumScaleAnimPlayerView(Context context) {
        this(context, null);
    }

    private void k() {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), new int[]{Color.parseColor("#DF4B32"), Color.parseColor("#800915")}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        this.J0 = paint;
        paint.setShader(linearGradient);
    }

    private void l() {
        b.a(getContext()).a(new e(1, this.B0), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new a());
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView
    public void d() {
        c cVar = this.G0;
        if (cVar != null) {
            cVar.release();
            this.G0 = null;
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView
    public void f() {
        c cVar = this.G0;
        if (cVar != null) {
            cVar.start();
        } else {
            this.H0 = true;
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView
    public int getMinAnimDuration() {
        return 4000;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView
    public void h() {
        c cVar = this.G0;
        if (cVar != null) {
            cVar.stop();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseMainAnimPlayerView, com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView, com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void init(f fVar, com.smartdigimkt.v6.a aVar, boolean z2, List<Bitmap> list, d dVar) {
        this.I0 = list;
        super.init(fVar, aVar, z2, list, dVar);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.J0 != null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.J0);
        }
    }

    public AlbumScaleAnimPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView
    public void c() {
        c cVar = this.G0;
        if (cVar != null) {
            cVar.pause();
        }
    }

    public AlbumScaleAnimPlayerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseMainAnimPlayerView
    public void a(Context context) {
        k();
        l();
    }

    public class a implements b.f {
        public a() {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, AlbumScaleAnimPlayerView.this.B0)) {
                if (AlbumScaleAnimPlayerView.this.G0 == null) {
                    AlbumScaleAnimPlayerView.this.G0 = new AlbumScaleAnimatorView(AlbumScaleAnimPlayerView.this.getContext().getApplicationContext());
                    AlbumScaleAnimPlayerView.this.G0.setBitmapResources(AlbumScaleAnimPlayerView.this.I0);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(13);
                    AlbumScaleAnimPlayerView albumScaleAnimPlayerView = AlbumScaleAnimPlayerView.this;
                    albumScaleAnimPlayerView.addView((View) albumScaleAnimPlayerView.G0, layoutParams);
                    AlbumScaleAnimPlayerView.this.G0.addMainView(bitmap, new WrapRoundImageView[0]);
                }
                if (AlbumScaleAnimPlayerView.this.H0) {
                    AlbumScaleAnimPlayerView.this.H0 = false;
                    if (AlbumScaleAnimPlayerView.this.G0 != null) {
                        AlbumScaleAnimPlayerView.this.G0.start();
                    }
                }
            }
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
            AlbumScaleAnimPlayerView.this.b(i.a("40003", "Animation render fail"));
        }
    }
}
