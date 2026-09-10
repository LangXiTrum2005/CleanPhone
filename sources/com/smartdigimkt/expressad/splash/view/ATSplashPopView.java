package com.smartdigimkt.expressad.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.q;
import com.smartdigimkt.v0.v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public class ATSplashPopView extends RelativeLayout {
    public static final int TYPE_POP_DEFAULT = 1;
    public static final int TYPE_POP_LARGE = 4;
    public static final int TYPE_POP_MEDIUM = 3;
    public static final int TYPE_POP_SMALL = 2;
    private static final String y0 = "ATSplashPopView";
    private static final AtomicInteger z0 = new AtomicInteger(1);
    private String e0;
    private String f0;
    private int g0;
    private com.smartdigimkt.x.d h0;
    private com.smartdigimkt.u1.d i0;
    private ImageView j0;
    private ImageView k0;
    private ImageView l0;
    private ImageView m0;
    private TextView n0;
    private TextView o0;
    private TextView p0;
    private int q0;
    private Handler r0;
    private boolean s0;
    private com.smartdigimkt.o.a t0;
    private Runnable u0;
    private Runnable v0;
    View.OnClickListener w0;
    View.OnClickListener x0;

    public class a implements com.smartdigimkt.f0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f34729a;

        public a(boolean z2) {
            this.f34729a = z2;
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                Bitmap bitmapB = this.f34729a ? q.b(bitmap) : q.a(bitmap, 1, 16);
                ImageView imageView = ATSplashPopView.this.j0;
                if (bitmapB != null) {
                    bitmap = bitmapB;
                }
                imageView.setImageBitmap(bitmap);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public class b implements com.smartdigimkt.f0.c {
        public b() {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
        }
    }

    public class c implements com.smartdigimkt.f0.c {
        public c() {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                ATSplashPopView.this.k0.setImageBitmap(q.a(bitmap, 1, 16));
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ATSplashPopView.this.p0 != null) {
                if (ATSplashPopView.this.q0 != 0) {
                    ATSplashPopView.e(ATSplashPopView.this);
                    ATSplashPopView.this.p0.setText(String.valueOf(ATSplashPopView.this.q0));
                    ATSplashPopView.this.r0.postDelayed(ATSplashPopView.this.u0, 1000L);
                } else {
                    ATSplashPopView.this.q0 = -1;
                    ATSplashPopView.this.g();
                    ATSplashPopView.this.r0.removeCallbacks(ATSplashPopView.this.u0);
                    if (ATSplashPopView.this.i0 != null) {
                        ATSplashPopView.this.i0.onDismiss(5);
                    }
                }
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ATSplashPopView.this.i0 != null) {
                ATSplashPopView.this.i0.a(ATSplashPopView.this.getWidth(), ATSplashPopView.this.getHeight(), ATSplashPopView.this.g0);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ATSplashPopView.this.i0 != null) {
                ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                aTSplashPopView.b(aTSplashPopView.h0);
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ATSplashPopView.this.q0 <= 0 && ATSplashPopView.this.i0 != null) {
                ATSplashPopView.this.i0.onDismiss(4);
            }
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f34733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f34734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f34735c;
        private com.smartdigimkt.x.d d;

        public h(String str, String str2, int i2, com.smartdigimkt.x.d dVar) {
            this.f34733a = str;
            this.f34734b = str2;
            this.f34735c = i2;
            this.d = dVar;
        }

        public void a(String str) {
            this.f34733a = str;
        }

        public String b() {
            return this.f34733a;
        }

        public String c() {
            return this.f34734b;
        }

        public int d() {
            return this.f34735c;
        }

        public void a(int i2) {
            this.f34735c = i2;
        }

        public void b(String str) {
            this.f34734b = str;
        }

        public com.smartdigimkt.x.d a() {
            return this.d;
        }

        public void a(com.smartdigimkt.x.d dVar) {
            this.d = dVar;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    public ATSplashPopView(Context context, h hVar, com.smartdigimkt.u1.d dVar) {
        super(context);
        this.g0 = 1;
        this.q0 = -1;
        this.r0 = new Handler();
        this.s0 = false;
        this.u0 = new d();
        this.v0 = new e();
        this.w0 = new f();
        this.x0 = new g();
        if (hVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f0 = hVar.c();
        this.e0 = hVar.b();
        this.g0 = hVar.d();
        this.h0 = hVar.a();
        this.i0 = dVar;
        a();
    }

    public static /* synthetic */ int e(ATSplashPopView aTSplashPopView) {
        int i2 = aTSplashPopView.q0;
        aTSplashPopView.q0 = i2 - 1;
        return i2;
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i2;
        int i3;
        do {
            atomicInteger = z0;
            i2 = atomicInteger.get();
            i3 = i2 + 1;
            if (i3 > 16777215) {
                i3 = 1;
            }
        } while (!atomicInteger.compareAndSet(i2, i3));
        return i2;
    }

    private void setBackgroundImage(String str) {
        com.smartdigimkt.f0.b.a(com.smartdigimkt.m6.b.p().k()).a(str, new b());
    }

    private void setForegroundImage(String str) {
        com.smartdigimkt.f0.b.a(com.smartdigimkt.m6.b.p().k()).a(str, new c());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i0 != null) {
            postDelayed(this.v0, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    public void pauseCountDown() {
        this.s0 = true;
        if (this.p0 != null) {
            this.r0.removeCallbacks(this.u0);
        }
    }

    public void reStartCountDown() {
        if (this.s0) {
            this.s0 = false;
            int i2 = this.q0;
            if (i2 == -1 || i2 == 0) {
                g();
                return;
            }
            TextView textView = this.p0;
            if (textView != null) {
                textView.setText(String.valueOf(i2));
                this.r0.postDelayed(this.u0, 1000L);
            }
        }
    }

    public void release() {
        try {
            this.r0.removeCallbacks(this.v0);
            this.r0.removeCallbacks(this.u0);
            this.u0 = null;
            detachAllViewsFromParent();
            this.h0 = null;
            this.i0 = null;
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void setPopViewType(h hVar, com.smartdigimkt.u1.d dVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f0 = hVar.c();
        this.e0 = hVar.b();
        this.g0 = hVar.d();
        this.h0 = hVar.a();
        this.i0 = dVar;
        a();
    }

    public void startCountDown() {
        this.r0.removeCallbacks(this.u0);
        com.smartdigimkt.x.d dVar = this.h0;
        if (dVar == null || this.g0 != 1) {
            return;
        }
        int iE0 = dVar.E0();
        if (iE0 <= 0) {
            g();
            return;
        }
        this.q0 = iE0;
        TextView textView = this.p0;
        if (textView != null) {
            textView.setText(String.valueOf(iE0));
            this.r0.postDelayed(this.u0, 1000L);
        }
    }

    private void b() {
        String language;
        this.m0 = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v.a(getContext(), 32.0f), v.a(getContext(), 13.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(8, this.j0.getId());
        this.m0.setLayoutParams(layoutParams);
        try {
            language = getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th) {
            th.getMessage();
            language = "ZH";
        }
        this.m0.setBackgroundResource((language.toUpperCase().equals("CN") || language.toUpperCase().equals("ZH")) ? k.a(getContext(), "sdm_splash_pop_ad", k.d) : k.a(getContext(), "sdm_splash_pop_ad_en", k.d));
        addView(this.m0);
    }

    private void c() {
        View imageView = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v.a(getContext(), 80.0f), v.a(getContext(), 80.0f));
        layoutParams.addRule(9);
        layoutParams.topMargin = v.a(getContext(), 16.0f);
        imageView.setId(generateViewId());
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundResource(k.a(getContext(), "sdm_splash_popview_default", k.d));
        this.j0 = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(v.a(getContext(), 60.0f), v.a(getContext(), 60.0f));
        layoutParams2.addRule(6, imageView.getId());
        layoutParams2.topMargin = v.a(getContext(), 7.0f);
        layoutParams2.leftMargin = v.a(getContext(), 10.0f);
        this.j0.setId(generateViewId());
        this.j0.setLayoutParams(layoutParams2);
        this.j0.setScaleType(ImageView.ScaleType.FIT_CENTER);
        com.smartdigimkt.x.d dVar = this.h0;
        if (dVar != null && !TextUtils.isEmpty(dVar.i())) {
            a(this.h0.i(), true);
        }
        this.p0 = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, imageView.getId());
        layoutParams3.addRule(8, imageView.getId());
        layoutParams3.leftMargin = v.a(getContext(), 62.0f);
        layoutParams3.bottomMargin = v.a(getContext(), 70.0f);
        this.p0.setId(generateViewId());
        this.p0.setTextSize(10.0f);
        this.p0.setTextColor(-1);
        this.p0.setGravity(17);
        this.p0.setMinWidth(v.a(getContext(), 16.0f));
        this.p0.setMaxHeight(v.a(getContext(), 16.0f));
        this.p0.setLayoutParams(layoutParams3);
        this.p0.setBackgroundResource(k.a(getContext(), "sdm_cm_circle_50black", k.d));
        addView(imageView);
        addView(this.p0);
        addView(this.j0);
        com.smartdigimkt.x.d dVar2 = this.h0;
        if (dVar2 != null && dVar2.E0() <= 0) {
            g();
        }
        setOnClickListener(this.w0);
        this.p0.setOnClickListener(this.x0);
    }

    private void d() {
        this.l0 = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, v.a(getContext(), 131.0f));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        this.l0.setScaleType(ImageView.ScaleType.FIT_XY);
        this.l0.setId(generateViewId());
        this.l0.setLayoutParams(layoutParams);
        setBackgroundImage(this.h0.k());
        this.k0 = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, v.a(getContext(), 131.0f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(14);
        this.k0.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.k0.setId(generateViewId());
        this.k0.setLayoutParams(layoutParams2);
        setForegroundImage(this.h0.k());
        this.j0 = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(v.a(getContext(), 50.0f), v.a(getContext(), 50.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(3, this.l0.getId());
        layoutParams3.topMargin = 20;
        this.j0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.j0.setId(generateViewId());
        this.j0.setLayoutParams(layoutParams3);
        a(this.h0.i(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(1, this.j0.getId());
        layoutParams4.addRule(6, this.j0.getId());
        layoutParams4.addRule(8, this.j0.getId());
        layoutParams4.leftMargin = v.a(getContext(), 8.0f);
        layoutParams4.rightMargin = v.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams4);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.n0 = textView;
        textView.setId(generateViewId());
        this.n0.setGravity(16);
        this.n0.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.n0.setTextSize(12.0f);
        this.n0.setTextColor(-16777216);
        TextView textView2 = this.n0;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.n0.setMarqueeRepeatLimit(-1);
        this.n0.setSelected(true);
        this.n0.setSingleLine(true);
        this.n0.setText(this.h0.f());
        TextView textView3 = new TextView(getContext());
        this.o0 = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(5, this.n0.getId());
        layoutParams5.addRule(3, this.n0.getId());
        layoutParams5.topMargin = v.a(getContext(), 4.0f);
        layoutParams5.rightMargin = v.a(getContext(), 36.0f);
        this.o0.setGravity(16);
        this.o0.setLayoutParams(layoutParams5);
        this.o0.setTextSize(8.0f);
        this.o0.setTextColor(-10066330);
        this.o0.setEllipsize(truncateAt);
        this.o0.setMarqueeRepeatLimit(-1);
        this.o0.setSelected(true);
        this.o0.setSingleLine(true);
        this.o0.setText(this.h0.e());
        relativeLayout.addView(this.n0);
        relativeLayout.addView(this.o0);
        addView(this.l0);
        addView(this.k0);
        addView(this.j0);
        addView(relativeLayout);
        b();
        setOnClickListener(this.w0);
    }

    private void e() {
        int iA = v.a(getContext(), 4.0f);
        this.j0 = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v.a(getContext(), 50.0f), v.a(getContext(), 50.0f));
        layoutParams.addRule(9);
        this.j0.setId(generateViewId());
        this.j0.setLayoutParams(layoutParams);
        this.j0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.j0.setPadding(iA, iA, iA, iA);
        a(this.h0.i(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(1, this.j0.getId());
        layoutParams2.addRule(6, this.j0.getId());
        layoutParams2.addRule(8, this.j0.getId());
        layoutParams2.leftMargin = v.a(getContext(), 8.0f);
        layoutParams2.rightMargin = v.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.n0 = textView;
        textView.setId(generateViewId());
        this.n0.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.n0.setGravity(16);
        this.n0.setTextSize(12.0f);
        this.n0.setSelected(true);
        TextView textView2 = this.n0;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.n0.setMarqueeRepeatLimit(-1);
        this.n0.setSingleLine(true);
        this.n0.setTextColor(-16777216);
        this.n0.setText(this.h0.f());
        TextView textView3 = new TextView(getContext());
        this.o0 = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, this.n0.getId());
        layoutParams3.addRule(3, this.n0.getId());
        layoutParams3.topMargin = v.a(getContext(), 4.0f);
        layoutParams3.rightMargin = v.a(getContext(), 36.0f);
        this.o0.setGravity(16);
        this.o0.setLayoutParams(layoutParams3);
        this.o0.setTextSize(8.0f);
        this.o0.setTextColor(-10066330);
        this.o0.setEllipsize(truncateAt);
        this.o0.setMarqueeRepeatLimit(-1);
        this.o0.setSelected(true);
        this.o0.setSingleLine(true);
        this.o0.setText(this.h0.e());
        relativeLayout.addView(this.n0);
        relativeLayout.addView(this.o0);
        setBackgroundResource(k.a(getContext(), "sdm_shape_corners_bg", k.d));
        addView(this.j0);
        addView(relativeLayout);
        b();
        setOnClickListener(this.w0);
    }

    private void f() {
        int iA = v.a(getContext(), 4.0f);
        this.j0 = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v.a(getContext(), 28.0f), v.a(getContext(), 28.0f));
        layoutParams.addRule(9);
        this.j0.setId(generateViewId());
        this.j0.setLayoutParams(layoutParams);
        this.j0.setPadding(iA, iA, iA, iA);
        this.j0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        a(this.h0.i(), false);
        TextView textView = new TextView(getContext());
        this.n0 = textView;
        textView.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.j0.getId());
        layoutParams2.addRule(6, this.j0.getId());
        layoutParams2.addRule(8, this.j0.getId());
        layoutParams2.leftMargin = v.a(getContext(), 4.0f);
        layoutParams2.rightMargin = v.a(getContext(), 40.0f);
        this.n0.setLayoutParams(layoutParams2);
        this.n0.setGravity(16);
        this.n0.setTextSize(10.0f);
        this.n0.setSelected(true);
        this.n0.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.n0.setMarqueeRepeatLimit(-1);
        this.n0.setSingleLine(true);
        this.n0.setTextColor(-16777216);
        this.n0.setText(this.h0.f());
        setBackgroundResource(k.a(getContext(), "sdm_shape_corners_bg", k.d));
        addView(this.j0);
        addView(this.n0);
        b();
        setOnClickListener(this.w0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TextView textView = this.p0;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = v.a(getContext(), 16.0f);
            layoutParams.height = v.a(getContext(), 16.0f);
            this.p0.setLayoutParams(layoutParams);
            this.p0.setText("");
            this.p0.setSelected(true);
            this.p0.setBackgroundResource(k.a(getContext(), "sdm_splash_popview_close", k.d));
        }
    }

    private void a() {
        if (this.h0 == null) {
            return;
        }
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int i2 = this.g0;
        if (i2 == 1) {
            c();
            return;
        }
        if (i2 == 2) {
            f();
        } else if (i2 == 3) {
            e();
        } else {
            if (i2 != 4) {
                return;
            }
            d();
        }
    }

    private void a(String str, boolean z2) {
        com.smartdigimkt.f0.b.a(com.smartdigimkt.m6.b.p().k()).a(str, new a(z2));
    }

    private void a(com.smartdigimkt.x.d dVar) {
        com.smartdigimkt.u1.d dVar2 = this.i0;
        if (dVar2 != null) {
            dVar2.onAdClicked(dVar);
            this.i0.onDismiss(6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.smartdigimkt.x.d dVar) {
        a(dVar);
    }

    public ATSplashPopView(Context context) {
        super(context);
        this.g0 = 1;
        this.q0 = -1;
        this.r0 = new Handler();
        this.s0 = false;
        this.u0 = new d();
        this.v0 = new e();
        this.w0 = new f();
        this.x0 = new g();
        this.g0 = 1;
    }

    public ATSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g0 = 1;
        this.q0 = -1;
        this.r0 = new Handler();
        this.s0 = false;
        this.u0 = new d();
        this.v0 = new e();
        this.w0 = new f();
        this.x0 = new g();
        this.g0 = 1;
    }

    public ATSplashPopView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.g0 = 1;
        this.q0 = -1;
        this.r0 = new Handler();
        this.s0 = false;
        this.u0 = new d();
        this.v0 = new e();
        this.w0 = new f();
        this.x0 = new g();
        this.g0 = 1;
    }

    public ATSplashPopView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.g0 = 1;
        this.q0 = -1;
        this.r0 = new Handler();
        this.s0 = false;
        this.u0 = new d();
        this.v0 = new e();
        this.w0 = new f();
        this.x0 = new g();
        this.g0 = 1;
    }
}
