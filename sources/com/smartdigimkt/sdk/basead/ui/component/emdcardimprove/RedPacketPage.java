package com.smartdigimkt.sdk.basead.ui.component.emdcardimprove;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.component.RoundImageView;
import com.smartdigimkt.v0.k;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class RedPacketPage extends RelativeLayout {
    RelativeLayout e0;
    RelativeLayout f0;
    RoundImageView g0;
    RoundImageView h0;
    TextView i0;
    TextView j0;
    TextView k0;
    TextView l0;
    TextView m0;
    ImageView n0;
    ImageView o0;
    ImageView p0;
    ImageView q0;
    TextView r0;
    private com.smartdigimkt.n5.e s0;
    ValueAnimator t0;
    ValueAnimator u0;
    private List<Integer> v0;
    private int w0;
    com.smartdigimkt.a6.b.a x0;

    public class a implements com.smartdigimkt.d7.b.f {
        public a() {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            ImageView imageView = RedPacketPage.this.o0;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    public class b implements View.OnClickListener {

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                RedPacketPage redPacketPage = RedPacketPage.this;
                if (redPacketPage.q0 == null || iIntValue >= redPacketPage.v0.size()) {
                    return;
                }
                RedPacketPage redPacketPage2 = RedPacketPage.this;
                redPacketPage2.q0.setImageResource(((Integer) redPacketPage2.v0.get(iIntValue)).intValue());
            }
        }

        /* JADX INFO: renamed from: com.smartdigimkt.sdk.basead.ui.component.emdcardimprove.RedPacketPage$b$b, reason: collision with other inner class name */
        public class C0606b extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: com.smartdigimkt.sdk.basead.ui.component.emdcardimprove.RedPacketPage$b$b$a */
            public class a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ int f38479a;

                public a(int i2) {
                    this.f38479a = i2;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    float f = -iIntValue;
                    RedPacketPage.this.o0.setTranslationY(f);
                    RedPacketPage.this.g0.setTranslationY(f);
                    RedPacketPage.this.i0.setTranslationY(f);
                    RedPacketPage.this.l0.setTranslationY(f);
                    RedPacketPage.this.o0.setTranslationY(f);
                    float f2 = iIntValue;
                    RedPacketPage.this.p0.setTranslationY(f2);
                    RelativeLayout relativeLayout = RedPacketPage.this.f0;
                    if (relativeLayout != null) {
                        relativeLayout.setAlpha(((f2 * 1.0f) / this.f38479a) * 0.8f);
                    }
                }
            }

            /* JADX INFO: renamed from: com.smartdigimkt.sdk.basead.ui.component.emdcardimprove.RedPacketPage$b$b$b, reason: collision with other inner class name */
            public class C0607b extends AnimatorListenerAdapter {
                public C0607b() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    RelativeLayout relativeLayout = RedPacketPage.this.e0;
                    if (relativeLayout != null) {
                        relativeLayout.setVisibility(8);
                    }
                    RelativeLayout relativeLayout2 = RedPacketPage.this.f0;
                    if (relativeLayout2 != null) {
                        relativeLayout2.setAlpha(1.0f);
                        RedPacketPage.this.f0.setVisibility(0);
                    }
                    RedPacketPage redPacketPage = RedPacketPage.this;
                    redPacketPage.a(redPacketPage.r0);
                }
            }

            public C0606b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                int y = (int) RedPacketPage.this.e0.getY();
                RedPacketPage.this.u0 = ValueAnimator.ofInt(0, y);
                RedPacketPage.this.u0.setDuration(300L);
                RedPacketPage.this.u0.addUpdateListener(new a(y));
                RedPacketPage.this.u0.addListener(new C0607b());
                RelativeLayout relativeLayout = RedPacketPage.this.f0;
                if (relativeLayout != null) {
                    relativeLayout.setAlpha(0.0f);
                    RedPacketPage.this.f0.setVisibility(0);
                }
                RedPacketPage.this.u0.start();
                RedPacketPage.this.q0.setVisibility(8);
            }
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.a6.b.a aVar = RedPacketPage.this.x0;
            if (aVar != null) {
                aVar.a(14, 27);
            }
            RedPacketPage.this.stopAnimation();
            if (RedPacketPage.this.w0 == 1) {
                RedPacketPage.this.n0.setVisibility(8);
                RedPacketPage.this.q0.setVisibility(0);
                RedPacketPage redPacketPage = RedPacketPage.this;
                redPacketPage.t0 = ValueAnimator.ofInt(0, redPacketPage.v0.size() - 1);
                RedPacketPage redPacketPage2 = RedPacketPage.this;
                redPacketPage2.t0.setDuration(redPacketPage2.v0.size() * 80);
                RedPacketPage.this.t0.setRepeatCount(1);
                RedPacketPage.this.t0.addUpdateListener(new a());
                RedPacketPage.this.t0.addListener(new C0606b());
                RedPacketPage.this.t0.start();
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.a6.b.a aVar = RedPacketPage.this.x0;
            if (aVar != null) {
                aVar.a(14, 28);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.a6.b.a aVar = RedPacketPage.this.x0;
            if (aVar != null) {
                aVar.a(14, 29);
            }
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.a6.b.a aVar = RedPacketPage.this.x0;
            if (aVar != null) {
                aVar.a(14, 30);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.a6.b.a aVar = RedPacketPage.this.x0;
            if (aVar != null) {
                aVar.a(14, 31);
            }
        }
    }

    public class g implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38482a;

        public g(String str) {
            this.f38482a = str;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f38482a)) {
                RoundImageView roundImageView = RedPacketPage.this.g0;
                if (roundImageView != null) {
                    roundImageView.setImageBitmap(bitmap);
                }
                RoundImageView roundImageView2 = RedPacketPage.this.h0;
                if (roundImageView2 != null) {
                    roundImageView2.setImageBitmap(bitmap);
                }
            }
        }
    }

    public RedPacketPage(Context context) {
        this(context, null);
    }

    private void c() {
        com.smartdigimkt.n5.e eVar = this.s0;
        if (eVar != null) {
            eVar.pause();
        }
    }

    private void d() {
        com.smartdigimkt.n5.e eVar = this.s0;
        if (eVar != null) {
            eVar.resume();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopAnimation();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (i2 == 0) {
            d();
        } else {
            c();
        }
    }

    public void setAdBless(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.l0.setText(str);
        this.m0.setText(str);
    }

    public void setAdIconUrl(String str) {
        if (this.g0 == null || this.h0 == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.g0.setVisibility(8);
            this.h0.setVisibility(8);
        } else {
            ViewGroup.LayoutParams layoutParams = this.g0.getLayoutParams();
            com.smartdigimkt.d7.b.a(getContext()).a(new com.smartdigimkt.d7.e(1, str), layoutParams.width, layoutParams.height, new g(str));
        }
    }

    public void setAdNotice(String str, int i2) {
        if (!TextUtils.isEmpty(str)) {
            this.k0.setText(str);
        } else if (i2 == 4) {
            this.k0.setText(getResources().getString(h.a(getContext(), "myoffer_red_packet_hint_link4_text", k.f38992h)));
        }
    }

    public void setAdTitle(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.i0.setText(str);
        this.j0.setText(str);
    }

    public void setCTAText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.r0.setText(str);
    }

    public void setOpenIconClickClickAction(int i2) {
        this.w0 = i2;
    }

    public void setRedPacketClickListener(com.smartdigimkt.a6.b.a aVar) {
        this.x0 = aVar;
    }

    public void stopAnimation() {
        com.smartdigimkt.n5.e eVar = this.s0;
        if (eVar != null) {
            eVar.stop();
            this.s0 = null;
        }
        ValueAnimator valueAnimator = this.t0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.t0 = null;
        }
        ValueAnimator valueAnimator2 = this.u0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.u0 = null;
        }
    }

    public RedPacketPage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b() {
        this.n0.setOnClickListener(new b());
        this.e0.setOnClickListener(new c());
        setOnClickListener(new d());
        e eVar = new e();
        this.r0.setOnClickListener(eVar);
        this.j0.setOnClickListener(eVar);
        this.h0.setOnClickListener(eVar);
        this.m0.setOnClickListener(eVar);
        this.k0.setOnClickListener(eVar);
        this.f0.setOnClickListener(new f());
    }

    public RedPacketPage(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }

    private void a() {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_endcard_improve_red_packet", "layout"), this);
        this.f0 = (RelativeLayout) findViewById(h.a(getContext(), "myoffer_red_packet_receive_page", "id"));
        this.e0 = (RelativeLayout) findViewById(h.a(getContext(), "myoffer_red_packet_cover", "id"));
        this.o0 = (ImageView) findViewById(h.a(getContext(), "myoffer_red_packet_half_topbg", "id"));
        this.p0 = (ImageView) findViewById(h.a(getContext(), "myoffer_red_packet_half_bottombg", "id"));
        this.g0 = (RoundImageView) findViewById(h.a(getContext(), "myoffer_red_packet_ad_icon", "id"));
        this.h0 = (RoundImageView) findViewById(h.a(getContext(), "myoffer_red_packet_ad_icon_2", "id"));
        this.i0 = (TextView) findViewById(h.a(getContext(), "myoffer_red_packet_ad_title", "id"));
        this.j0 = (TextView) findViewById(h.a(getContext(), "myoffer_red_packet_ad_title_2", "id"));
        this.l0 = (TextView) findViewById(h.a(getContext(), "myoffer_red_packet_ad_bless", "id"));
        this.m0 = (TextView) findViewById(h.a(getContext(), "myoffer_red_packet_ad_bless_2", "id"));
        this.k0 = (TextView) findViewById(h.a(getContext(), "myoffer_red_packet_ad_hint_link", "id"));
        this.n0 = (ImageView) findViewById(h.a(getContext(), "myoffer_red_packet_open_icon", "id"));
        this.q0 = (ImageView) findViewById(h.a(getContext(), "myoffer_red_packet_anim_open_icon", "id"));
        this.r0 = (TextView) findViewById(h.a(getContext(), "myoffer_red_packet_cta", "id"));
        this.g0.setRadiusInDip(18);
        this.g0.setNeedRadiu(true);
        this.h0.setRadiusInDip(12);
        this.h0.setNeedRadiu(true);
        ArrayList arrayList = new ArrayList();
        this.v0 = arrayList;
        arrayList.add(Integer.valueOf(h.a(getContext(), "myoffer_red_packet_frame1", k.d)));
        this.v0.add(Integer.valueOf(h.a(getContext(), "myoffer_red_packet_frame2", k.d)));
        this.v0.add(Integer.valueOf(h.a(getContext(), "myoffer_red_packet_frame3", k.d)));
        this.v0.add(Integer.valueOf(h.a(getContext(), "myoffer_red_packet_frame4", k.d)));
        this.v0.add(Integer.valueOf(h.a(getContext(), "myoffer_red_packet_frame5", k.d)));
        this.v0.add(Integer.valueOf(h.a(getContext(), "myoffer_red_packet_frame6", k.d)));
        a(this.n0);
        b();
        String strC = com.smartdigimkt.j5.a.a().c("ec_rp_top");
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        com.google.firebase.crashlytics.internal.model.a.g().a(new com.smartdigimkt.d7.e(3, strC), new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        if (view == null) {
            return;
        }
        com.smartdigimkt.n5.e eVar = this.s0;
        if (eVar != null) {
            eVar.stop();
        }
        com.smartdigimkt.n5.e eVar2 = new com.smartdigimkt.n5.e(view);
        this.s0 = eVar2;
        eVar2.a(0.85f);
        this.s0.start();
    }
}
