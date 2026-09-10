package com.smartdigimkt.expressad.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.smartdigimkt.u2.j;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.x.d;
import com.smartdigimkt.x2.f;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AnythinkVideoEndCoverView extends AnythinkBaseView implements f {
    private final String s0;
    private View t0;
    private ImageView u0;
    private ImageView v0;
    private TextView w0;
    private TextView x0;
    private TextView y0;
    private com.smartdigimkt.y2.b z0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.t2.a aVar = AnythinkVideoEndCoverView.this.i0;
            if (aVar != null) {
                aVar.a(104, "");
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AnythinkVideoEndCoverView.this.f();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AnythinkVideoEndCoverView.this.f();
        }
    }

    public AnythinkVideoEndCoverView(Context context) {
        super(context);
        this.s0 = "AnythinkVideoEndCoverView";
    }

    private boolean a(View view) {
        if (view == null) {
            return true;
        }
        try {
            this.u0 = (ImageView) view.findViewById(findID("sdm_vec_iv_icon"));
            this.v0 = (ImageView) view.findViewById(findID("sdm_vec_iv_close"));
            this.w0 = (TextView) view.findViewById(findID("sdm_vec_tv_title"));
            this.x0 = (TextView) view.findViewById(findID("sdm_vec_tv_desc"));
            this.y0 = (TextView) view.findViewById(findID("sdm_vec_btn"));
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    private void d() {
        ImageView imageView;
        d dVar = this.f0;
        if (dVar != null) {
            if (!TextUtils.isEmpty(dVar.i()) && (imageView = this.u0) != null) {
                com.smartdigimkt.f0.b.a(this.e0.getApplicationContext()).a(this.f0.i(), new j(imageView, v.a(com.smartdigimkt.m6.b.p().k(), 8.0f)));
            }
            TextView textView = this.w0;
            if (textView != null) {
                textView.setText(this.f0.f());
            }
            TextView textView2 = this.y0;
            if (textView2 != null) {
                textView2.setText(this.f0.b());
            }
            TextView textView3 = this.x0;
            if (textView3 != null) {
                textView3.setText(this.f0.e());
            }
        }
    }

    private void e() {
        View view = this.t0;
        if (view == null) {
            init(this.e0);
            preLoadData(this.z0);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.t0.getParent()).removeView(this.t0);
        }
        addView(this.t0);
        a(this.t0);
        c();
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void c() {
        super.c();
        this.v0.setOnClickListener(new a());
        this.u0.setOnClickListener(new b());
        this.y0.setOnClickListener(new c());
    }

    public void f() {
        JSONException e2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONException e3;
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(com.smartdigimkt.b0.a.g2, v.b(com.smartdigimkt.m6.b.p().k(), this.k0));
                    jSONObject2.put(com.smartdigimkt.b0.a.h2, v.b(com.smartdigimkt.m6.b.p().k(), this.l0));
                    jSONObject2.put(com.smartdigimkt.b0.a.j2, 0);
                    try {
                        this.h0 = getContext().getResources().getConfiguration().orientation;
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                    jSONObject2.put(com.smartdigimkt.b0.a.k2, this.h0);
                    jSONObject2.put(com.smartdigimkt.b0.a.l2, v.d(getContext()));
                } catch (JSONException e5) {
                    e3 = e5;
                    e3.getMessage();
                }
            } catch (JSONException e6) {
                jSONObject2 = jSONObject3;
                e3 = e6;
            }
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.smartdigimkt.b0.a.i2, jSONObject2);
            } catch (JSONException e7) {
                e2 = e7;
                e2.printStackTrace();
            }
        } catch (JSONException e8) {
            e2 = e8;
            jSONObject = null;
        }
        com.smartdigimkt.t2.a aVar = this.i0;
        if (aVar != null) {
            aVar.a(105, jSONObject);
        }
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("sdm_reward_videoend_cover");
        if (iFindLayout >= 0) {
            View viewInflate = this.g0.inflate(iFindLayout, (ViewGroup) null);
            this.t0 = viewInflate;
            if (viewInflate != null) {
                this.j0 = a(viewInflate);
                addView(this.t0, -1, -1);
                c();
            }
        }
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.k0 = motionEvent.getRawX();
        this.l0 = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.h0 = configuration.orientation;
        removeView(this.t0);
        e();
    }

    @Override // com.smartdigimkt.x2.f
    public void preLoadData(com.smartdigimkt.y2.b bVar) {
        this.z0 = bVar;
        try {
            if (this.f0 == null || !this.j0) {
                return;
            }
            d();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public AnythinkVideoEndCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s0 = "AnythinkVideoEndCoverView";
    }
}
