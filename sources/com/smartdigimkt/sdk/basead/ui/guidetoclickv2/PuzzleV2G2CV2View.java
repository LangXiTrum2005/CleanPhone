package com.smartdigimkt.sdk.basead.ui.guidetoclickv2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.TextSeekbar;

/* JADX INFO: loaded from: classes6.dex */
public class PuzzleV2G2CV2View extends BaseLifecycleG2CV2View {
    ImageView m0;
    ImageView n0;
    ImageView o0;
    ImageView p0;
    int q0;
    Animation r0;
    TextSeekbar s0;
    int t0;
    private boolean u0;
    boolean v0;
    private final int w0;
    ValueAnimator x0;
    int y0;
    private final int z0;

    public class a implements com.smartdigimkt.d7.b.f {
        public a() {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            ImageView imageView = PuzzleV2G2CV2View.this.n0;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    public class b implements com.smartdigimkt.d7.b.f {
        public b() {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            ImageView imageView = PuzzleV2G2CV2View.this.p0;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    public class c implements SeekBar.OnSeekBarChangeListener {
        public c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) throws Throwable {
            int iA = PuzzleV2G2CV2View.this.a(i2);
            if (!z2) {
                PuzzleV2G2CV2View.this.c(iA);
                if (iA == 100 && i2 == 100) {
                    PuzzleV2G2CV2View.this.e();
                    return;
                }
                return;
            }
            PuzzleV2G2CV2View puzzleV2G2CV2View = PuzzleV2G2CV2View.this;
            if (puzzleV2G2CV2View.v0) {
                puzzleV2G2CV2View.v0 = false;
                if (iA > 30) {
                    puzzleV2G2CV2View.u0 = false;
                } else {
                    puzzleV2G2CV2View.u0 = true;
                }
            }
            if (!PuzzleV2G2CV2View.this.u0) {
                seekBar.setProgress(0);
            } else if (iA > 30) {
                PuzzleV2G2CV2View.this.b(i2);
            } else {
                PuzzleV2G2CV2View.this.c(iA);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            PuzzleV2G2CV2View puzzleV2G2CV2View = PuzzleV2G2CV2View.this;
            puzzleV2G2CV2View.v0 = true;
            ImageView imageView = puzzleV2G2CV2View.p0;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            Animation animation = PuzzleV2G2CV2View.this.r0;
            if (animation != null) {
                animation.cancel();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (PuzzleV2G2CV2View.this.u0) {
                PuzzleV2G2CV2View.this.c(0);
                ImageView imageView = PuzzleV2G2CV2View.this.p0;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                Animation animation = PuzzleV2G2CV2View.this.r0;
                if (animation != null) {
                    animation.start();
                }
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PuzzleV2G2CV2View.this.a();
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            PuzzleV2G2CV2View puzzleV2G2CV2View = PuzzleV2G2CV2View.this;
            if (puzzleV2G2CV2View.y0 != iIntValue) {
                puzzleV2G2CV2View.y0 = iIntValue;
                puzzleV2G2CV2View.s0.setProgress(iIntValue);
            }
        }
    }

    public PuzzleV2G2CV2View(Context context) {
        super(context);
        this.w0 = 30;
        this.y0 = -1;
        this.z0 = 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i2) {
        if (i2 < 15) {
            return 0;
        }
        if (i2 > 85) {
            return 100;
        }
        return i2 - 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() throws Throwable {
        removeAllViews();
        d();
    }

    private void startAnim() {
        if (this.r0 != null || this.p0 == null) {
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, this.q0, 0.0f, 0.0f);
        this.r0 = translateAnimation;
        translateAnimation.setDuration(1000L);
        this.r0.setRepeatCount(-1);
        this.p0.startAnimation(this.r0);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public boolean canStartNextAnim() {
        ValueAnimator valueAnimator = this.x0;
        return valueAnimator == null || !valueAnimator.isRunning();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseLifecycleG2CV2View
    public int getClickArea() {
        return 45;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseLifecycleG2CV2View, com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        Animation animation = this.r0;
        if (animation != null) {
            animation.cancel();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseLifecycleG2CV2View, com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void c() throws Throwable {
        super.c();
        Animation animation = this.r0;
        if (animation != null) {
            animation.start();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseLifecycleG2CV2View, com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void b() {
        super.b();
        Animation animation = this.r0;
        if (animation != null) {
            animation.cancel();
        }
    }

    public PuzzleV2G2CV2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w0 = 30;
        this.y0 = -1;
        this.z0 = 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i2) {
        ImageView imageView = this.n0;
        if (imageView != null) {
            imageView.setTranslationX((i2 * this.t0) / 100);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void a(int i2, int i3) {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_g2c_v2_puzzle_v2", "layout"), this);
        setBackgroundColor(Color.parseColor("#80000000"));
        this.m0 = (ImageView) findViewById(h.a(getContext(), "myoffer_g2c_item_close_iv", "id"));
        this.n0 = (ImageView) findViewById(h.a(getContext(), "myoffer_g2c_item_lucky_bag_iv", "id"));
        this.o0 = (ImageView) findViewById(h.a(getContext(), "myoffer_g2c_item_lucky_bag_mask_iv", "id"));
        this.p0 = (ImageView) findViewById(h.a(getContext(), "myoffer_g2c_item_g2c_finger", "id"));
        if (this.n0 != null) {
            String strC = com.smartdigimkt.j5.a.a().c("g2c_lucky_bag");
            if (!TextUtils.isEmpty(strC)) {
                com.google.firebase.crashlytics.internal.model.a.g().a(new com.smartdigimkt.d7.e(3, strC), new a());
            }
        }
        if (this.p0 != null) {
            String strC2 = com.smartdigimkt.j5.a.a().c("g2c_finger_icon_v2");
            if (!TextUtils.isEmpty(strC2)) {
                com.google.firebase.crashlytics.internal.model.a.g().a(new com.smartdigimkt.d7.e(3, strC2), new b());
            }
        }
        this.q0 = h.a(getContext(), 20.0f);
        this.t0 = h.a(getContext(), 176.0f);
        TextSeekbar textSeekbar = (TextSeekbar) findViewById(h.a(getContext(), "myoffer_g2c_picvertify_seekbar", "id"));
        this.s0 = textSeekbar;
        if (textSeekbar != null) {
            textSeekbar.hideAll();
            this.s0.setProgressDrawable(null);
            this.s0.setThumb(null);
            this.s0.setThumbOffset(0);
            this.s0.setOnSeekBarChangeListener(new c());
        }
        ImageView imageView = this.m0;
        if (imageView != null) {
            imageView.setOnClickListener(new d());
        }
        startAnim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2) {
        TextSeekbar textSeekbar = this.s0;
        if (textSeekbar != null) {
            textSeekbar.setClickable(false);
            this.s0.setEnabled(false);
            if (this.x0 == null) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, 100);
                this.x0 = valueAnimatorOfInt;
                valueAnimatorOfInt.addUpdateListener(new e());
                this.x0.setDuration(300L);
                this.x0.start();
            }
        }
    }

    public PuzzleV2G2CV2View(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.w0 = 30;
        this.y0 = -1;
        this.z0 = 300;
    }
}
