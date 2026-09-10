package com.smartdigimkt.expressad.video.module;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.i2.h;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.x2.f;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AnythinkClickCTAView extends AnythinkBaseView implements f {
    private static final String C0 = "sdm_reward_clickable_cta";
    private int A0;
    private ObjectAnimator B0;
    private ViewGroup s0;
    private ImageView t0;
    private TextView u0;
    private TextView v0;
    private TextView w0;
    private String x0;
    private float y0;
    private float z0;

    public class b extends com.smartdigimkt.g3.a {
        public b() {
        }

        @Override // com.smartdigimkt.g3.a
        public void a(View view) {
            AnythinkClickCTAView.this.d();
        }
    }

    public class c extends com.smartdigimkt.g3.a {
        public c() {
        }

        @Override // com.smartdigimkt.g3.a
        public void a(View view) {
            AnythinkClickCTAView.this.d();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class e extends com.smartdigimkt.u2.e {
        public e(ImageView imageView, com.smartdigimkt.x.d dVar, String str) {
            super(imageView, dVar, str);
        }

        @Override // com.smartdigimkt.u2.e, com.smartdigimkt.f0.c
        public void a(String str, String str2) {
            super.a(str, str2);
            AnythinkClickCTAView.this.f();
        }
    }

    public AnythinkClickCTAView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        JSONException e2;
        JSONObject jSONObject;
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar != null) {
            dVar.H2();
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.smartdigimkt.b0.a.i2, a(0));
            } catch (JSONException e3) {
                e2 = e3;
                e2.printStackTrace();
            }
        } catch (JSONException e4) {
            e2 = e4;
            jSONObject = null;
        }
        com.smartdigimkt.t2.a aVar = this.i0;
        if (aVar != null) {
            aVar.a(105, jSONObject);
        }
    }

    private void e() {
        int iFindLayout = findLayout(C0);
        if (iFindLayout >= 0) {
            this.g0.inflate(iFindLayout, this);
            this.j0 = g();
            c();
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ImageView imageView = this.t0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        this.s0 = (ViewGroup) findViewById(findID("sdm_viewgroup_ctaroot"));
        this.t0 = (ImageView) findViewById(findID("sdm_iv_appicon"));
        this.u0 = (TextView) findViewById(findID("sdm_tv_title"));
        TextView textView = (TextView) findViewById(findID("sdm_tv_install"));
        this.w0 = textView;
        return isNotNULL(this.s0, this.t0, this.u0, textView);
    }

    private void h() {
        setWrapContent();
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.B0;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.B0;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.y0 = motionEvent.getRawX();
        this.z0 = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.A0 = configuration.orientation;
    }

    @Override // com.smartdigimkt.x2.f
    public void preLoadData(com.smartdigimkt.y2.b bVar) {
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar != null) {
            if (dVar.H2()) {
                a(this, this.f0);
            } else {
                e();
            }
            if (this.j0) {
                if (this.f0.R() == 2) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v.a(getContext(), 95.0f), v.a(getContext(), 38.0f));
                    layoutParams.addRule(11);
                    this.w0.setLayoutParams(layoutParams);
                }
                this.w0.setText(this.f0.b());
                if (TextUtils.isEmpty(this.f0.i())) {
                    f();
                } else {
                    com.smartdigimkt.f0.b.a(this.e0.getApplicationContext()).a(this.f0.i(), new e(this.t0, this.f0, this.x0));
                }
                if (this.u0 != null && !TextUtils.isEmpty(this.f0.f())) {
                    this.u0.setText(this.f0.f());
                }
                if (this.v0 == null || TextUtils.isEmpty(this.f0.e())) {
                    return;
                }
                this.v0.setText(this.f0.e());
            }
        }
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.B0 = objectAnimator;
    }

    public void setUnitId(String str) {
        this.x0 = str;
    }

    public AnythinkClickCTAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void c() {
        super.c();
        if (this.j0) {
            com.smartdigimkt.x.d dVar = this.f0;
            if (dVar != null && dVar.H2()) {
                setOnClickListener(new b());
            }
            this.w0.setOnClickListener(new c());
            ImageView imageView = this.t0;
            if (imageView != null) {
                imageView.setOnClickListener(new d());
            }
        }
    }

    private void a(ViewGroup viewGroup, com.smartdigimkt.x.d dVar) {
        com.smartdigimkt.c2.b.a().a(new com.smartdigimkt.r2.c().a(viewGroup, dVar), new a(viewGroup));
    }

    public class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f34784a;

        public a(ViewGroup viewGroup) {
            this.f34784a = viewGroup;
        }

        @Override // com.smartdigimkt.i2.h
        public void a(com.smartdigimkt.c2.a aVar) {
            if (aVar != null) {
                this.f34784a.addView(aVar.b());
                AnythinkClickCTAView anythinkClickCTAView = AnythinkClickCTAView.this;
                anythinkClickCTAView.j0 = anythinkClickCTAView.g();
                AnythinkClickCTAView anythinkClickCTAView2 = AnythinkClickCTAView.this;
                anythinkClickCTAView2.v0 = (TextView) anythinkClickCTAView2.findViewById(anythinkClickCTAView2.findID("sdm_tv_desc"));
                AnythinkClickCTAView.this.c();
            }
        }

        @Override // com.smartdigimkt.i2.h
        public void a(com.smartdigimkt.f2.b bVar) {
            bVar.d();
        }
    }
}
