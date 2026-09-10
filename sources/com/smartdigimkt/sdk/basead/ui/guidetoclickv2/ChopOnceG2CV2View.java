package com.smartdigimkt.sdk.basead.ui.guidetoclickv2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.smartdigimkt.n8.h;

/* JADX INFO: loaded from: classes6.dex */
public class ChopOnceG2CV2View extends BaseLifecycleG2CV2View {
    ImageView m0;
    ImageView n0;
    Animation o0;
    Animation p0;
    ImageView q0;

    public class a implements com.smartdigimkt.d7.b.f {
        public a() {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            ImageView imageView = ChopOnceG2CV2View.this.m0;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Throwable {
            ChopOnceG2CV2View.this.removeAllViews();
            ChopOnceG2CV2View.this.d();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Throwable {
            ChopOnceG2CV2View.this.removeAllViews();
            ChopOnceG2CV2View.this.d();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChopOnceG2CV2View.this.a();
        }
    }

    public ChopOnceG2CV2View(Context context) {
        super(context);
    }

    private void e() {
        Animation animation = this.o0;
        if (animation != null) {
            animation.cancel();
            this.o0 = null;
        }
        Animation animation2 = this.p0;
        if (animation2 != null) {
            animation2.cancel();
            this.p0 = null;
        }
    }

    private void startAnim() {
        if (this.o0 == null && this.m0 != null) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            this.o0 = rotateAnimation;
            rotateAnimation.setDuration(2000L);
            this.o0.setInterpolator(new LinearInterpolator());
            this.o0.setRepeatCount(-1);
            this.m0.startAnimation(this.o0);
        }
        if (this.p0 != null || this.n0 == null) {
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, h.a(getContext(), 10.0f));
        this.p0 = translateAnimation;
        translateAnimation.setDuration(500L);
        this.p0.setRepeatCount(-1);
        this.p0.setRepeatMode(2);
        this.n0.startAnimation(this.p0);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void a(int i2, int i3) {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_g2c_v2_chop_once", "layout"), this);
        setBackgroundColor(Color.parseColor("#80000000"));
        this.m0 = (ImageView) findViewById(h.a(getContext(), "myoffer_g2c_gift_group", "id"));
        this.n0 = (ImageView) findViewById(h.a(getContext(), "myoffer_g2c_gift_chop", "id"));
        this.q0 = (ImageView) findViewById(h.a(getContext(), "myoffer_g2c_item_close_iv", "id"));
        String strC = com.smartdigimkt.j5.a.a().c("g2c_chop");
        if (!TextUtils.isEmpty(strC)) {
            com.google.firebase.crashlytics.internal.model.a.g().a(new com.smartdigimkt.d7.e(3, strC), new a());
        }
        ImageView imageView = this.m0;
        if (imageView != null) {
            imageView.setOnClickListener(new b());
        }
        ImageView imageView2 = this.n0;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new c());
        }
        setOnClickListener(new d());
        ImageView imageView3 = this.q0;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new e());
        }
        setClipChildren(false);
        startAnim();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseLifecycleG2CV2View, com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void b() {
        super.b();
        Animation animation = this.o0;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.p0;
        if (animation2 != null) {
            animation2.cancel();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseLifecycleG2CV2View, com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void c() throws Throwable {
        super.c();
        Animation animation = this.o0;
        if (animation != null) {
            animation.start();
        }
        Animation animation2 = this.p0;
        if (animation2 != null) {
            animation2.start();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseLifecycleG2CV2View
    public int getClickArea() {
        return 44;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseLifecycleG2CV2View, com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        e();
    }

    public ChopOnceG2CV2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChopOnceG2CV2View(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
