package com.smartdigimkt.sdk.basead.ui.guidetoclickv2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.PictureVerifyView;
import com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.TextSeekbar;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes6.dex */
public class PicVerifyG2CV2View extends BaseG2CV2View {
    PictureVerifyView l0;
    TextSeekbar m0;
    String n0;
    private boolean o0;
    private boolean p0;
    private final int q0;
    ValueAnimator r0;
    private final int s0;
    private final int t0;
    ValueAnimator u0;
    private final int v0;
    int w0;

    public class a implements PictureVerifyView.a {
        public a() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.PictureVerifyView.a
        public void a() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.PictureVerifyView.a
        public void a(long j) {
            com.smartdigimkt.w5.c.a aVar = PicVerifyG2CV2View.this.i0;
            if (aVar != null) {
                aVar.a(11, 16);
            }
        }
    }

    public class b implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f38517a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ((RelativeLayout.LayoutParams) PicVerifyG2CV2View.this.m0.getLayoutParams()).setMargins(0, (b.this.f38517a / 2) + (PicVerifyG2CV2View.this.getMeasuredHeight() / 2), 0, 0);
                PicVerifyG2CV2View.this.m0.setVisibility(0);
                PicVerifyG2CV2View.this.e();
            }
        }

        public b(int i2) {
            this.f38517a = i2;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, PicVerifyG2CV2View.this.n0)) {
                DisplayMetrics displayMetrics = PicVerifyG2CV2View.this.getContext().getResources().getDisplayMetrics();
                int[] iArrA = com.smartdigimkt.j7.c.a(displayMetrics.widthPixels, displayMetrics.heightPixels, bitmap.getWidth() / bitmap.getHeight());
                int i2 = this.f38517a * 2;
                if (bitmap.getWidth() < i2 || bitmap.getHeight() < i2) {
                    BaseG2CV2View.c cVar = PicVerifyG2CV2View.this.f0;
                    if (cVar != null) {
                        cVar.b();
                        return;
                    }
                    return;
                }
                int iA = h.a(PicVerifyG2CV2View.this.getContext(), 180.0f);
                if (iArrA[0] < iA || iArrA[1] < iA) {
                    BaseG2CV2View.c cVar2 = PicVerifyG2CV2View.this.f0;
                    if (cVar2 != null) {
                        cVar2.b();
                        return;
                    }
                    return;
                }
                ViewGroup.LayoutParams layoutParams = PicVerifyG2CV2View.this.l0.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = iArrA[0];
                    layoutParams.height = iArrA[1];
                    PicVerifyG2CV2View.this.l0.setLayoutParams(layoutParams);
                }
                PicVerifyG2CV2View.this.l0.setImageBitmap(bitmap);
                PicVerifyG2CV2View.this.post(new a());
            }
        }
    }

    public class c implements SeekBar.OnSeekBarChangeListener {
        public c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
            if (!z2) {
                PicVerifyG2CV2View.this.l0.move(i2);
                if (i2 == 100) {
                    PicVerifyG2CV2View.this.l0.loose();
                    return;
                }
                return;
            }
            if (PicVerifyG2CV2View.this.p0) {
                PicVerifyG2CV2View.this.p0 = false;
                if (i2 > 30) {
                    PicVerifyG2CV2View.this.o0 = false;
                } else {
                    PicVerifyG2CV2View.this.o0 = true;
                }
            }
            if (!PicVerifyG2CV2View.this.o0) {
                seekBar.setProgress(0);
            } else if (i2 > 30) {
                PicVerifyG2CV2View.this.a(i2);
            } else {
                PicVerifyG2CV2View.this.l0.move(i2);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            PicVerifyG2CV2View.this.p0 = true;
            PicVerifyG2CV2View.this.f();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (PicVerifyG2CV2View.this.o0) {
                PicVerifyG2CV2View.this.l0.loose();
            }
            PicVerifyG2CV2View.this.e();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            PicVerifyG2CV2View.this.m0.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            PicVerifyG2CV2View picVerifyG2CV2View = PicVerifyG2CV2View.this;
            if (picVerifyG2CV2View.w0 != iIntValue) {
                picVerifyG2CV2View.w0 = iIntValue;
                picVerifyG2CV2View.m0.setProgress(iIntValue);
            }
        }
    }

    public PicVerifyG2CV2View(Context context) {
        super(context);
        this.q0 = 30;
        this.s0 = 15;
        this.t0 = 500;
        this.v0 = 300;
        this.w0 = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.r0 == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 15);
            this.r0 = valueAnimatorOfInt;
            valueAnimatorOfInt.addUpdateListener(new d());
            this.r0.setRepeatMode(2);
            this.r0.setRepeatCount(-1);
            this.r0.setDuration(500L);
        }
        if (this.r0.isStarted() || this.u0 != null) {
            return;
        }
        this.r0.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ValueAnimator valueAnimator = this.r0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public boolean canStartNextAnim() {
        return this.u0 == null;
    }

    public void loadImage(String str) {
        this.n0 = str;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        ValueAnimator valueAnimator = this.r0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.u0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    private void d() {
        this.m0.setProgress(0);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void a(int i2, int i3) {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_g2c_v2_pic_vertify", "layout"), this);
        this.l0 = (PictureVerifyView) findViewById(h.a(getContext(), "myoffer_g2c_picvertify", "id"));
        this.m0 = (TextSeekbar) findViewById(h.a(getContext(), "myoffer_g2c_picvertify_seekbar", "id"));
        int iA = h.a(getContext(), 48.0f);
        this.l0.setBlockSize(iA);
        this.l0.callback(new a());
        if (!TextUtils.isEmpty(this.n0)) {
            com.smartdigimkt.d7.b.a(getContext()).a(new com.smartdigimkt.d7.e(1, this.n0), new b(iA));
        }
        this.m0.setProgressDrawable(getResources().getDrawable(h.a(getContext(), "myoffer_g2c_seek_bar_bg", k.d)));
        this.m0.setThumb(a(getContext(), h.a(getContext(), "myoffer_seek_bar_icon", k.d), h.a(getContext(), 60.0f), h.a(getContext(), 24.0f)));
        this.m0.setThumbOffset(0);
        this.m0.setOnSeekBarChangeListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2) {
        this.m0.setClickable(false);
        this.m0.setEnabled(false);
        this.m0.getProgressDrawable().setAlpha(255);
        if (this.u0 == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, 100);
            this.u0 = valueAnimatorOfInt;
            valueAnimatorOfInt.addUpdateListener(new e());
            this.u0.setDuration(300L);
            this.u0.start();
        }
    }

    private BitmapDrawable a(Context context, int i2, int i3, int i4) {
        return new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), i2), i3, i4, false));
    }
}
