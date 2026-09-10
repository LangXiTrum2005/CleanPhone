package com.smartdigimkt.expressad.video.dynview.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.smartdigimkt.expressad.video.module.AnythinkBaseView;
import com.smartdigimkt.expressad.widget.FeedBackButton;
import com.smartdigimkt.i2.h;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AnyThinkOrderCampView extends AnythinkBaseView {
    private ImageView A0;
    private boolean B0;
    private com.smartdigimkt.i2.c C0;
    private com.smartdigimkt.i2.b D0;
    private boolean E0;
    private AnyThinkOrderCampView s0;
    private List<com.smartdigimkt.x.d> t0;
    private int u0;
    private int v0;
    private int w0;
    private int x0;
    private String y0;
    private FeedBackButton z0;

    public class a implements com.smartdigimkt.i2.c {
        public a() {
        }

        @Override // com.smartdigimkt.i2.c
        public void a(com.smartdigimkt.x.d dVar, int i2) {
            if (dVar != null) {
                try {
                    AnyThinkOrderCampView.this.setCampaign(dVar);
                    AnyThinkOrderCampView.this.a(dVar, 0, i2);
                } catch (Exception e2) {
                    e2.getMessage();
                }
            }
        }

        @Override // com.smartdigimkt.i2.c
        public void close() {
            AnyThinkOrderCampView.this.f();
        }
    }

    public class c implements com.smartdigimkt.z.a {
        public c() {
        }

        @Override // com.smartdigimkt.z.a
        public void a() {
        }

        @Override // com.smartdigimkt.z.a
        public void close() {
        }

        @Override // com.smartdigimkt.z.a
        public void a(String str) {
        }
    }

    public class d implements View.OnClickListener {
        final /* synthetic */ String X;

        public d(String str) {
            this.X = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.o8.c.a(this.X);
        }
    }

    public AnyThinkOrderCampView(Context context) {
        super(context);
        this.B0 = false;
        this.C0 = new a();
        this.E0 = false;
    }

    private void d() {
        FeedBackButton feedBackButton = this.z0;
        if (feedBackButton == null) {
            return;
        }
        List<com.smartdigimkt.x.d> list = this.t0;
        if (list == null) {
            feedBackButton.setVisibility(8);
            return;
        }
        if (list.get(0) == null) {
            this.z0.setVisibility(8);
            return;
        }
        if (!com.smartdigimkt.z.b.b().a()) {
            this.z0.setVisibility(8);
            return;
        }
        this.y0 = this.t0.get(0).i0();
        this.f0 = this.t0.get(0);
        com.smartdigimkt.z.b.b().a(android.support.v4.media.a.r(new StringBuilder(), this.y0, "_2"), new c());
        com.smartdigimkt.z.b.b().a(android.support.v4.media.a.r(new StringBuilder(), this.y0, "_2"), this.f0);
        com.smartdigimkt.z.b.b().a(android.support.v4.media.a.r(new StringBuilder(), this.y0, "_2"), this.z0);
    }

    private void e() {
        if (this.A0 == null) {
            return;
        }
        com.smartdigimkt.n1.a aVarC = com.smartdigimkt.n1.b.b().c(com.smartdigimkt.u.a.f().a());
        if (aVarC == null) {
            this.A0.setVisibility(8);
            return;
        }
        String strJ = aVarC.j();
        if (TextUtils.isEmpty(strJ)) {
            this.A0.setVisibility(8);
        }
        this.A0.setOnClickListener(new d(strJ));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        com.smartdigimkt.t2.a aVar = this.i0;
        if (aVar != null) {
            aVar.a(104, "");
        }
    }

    private void g() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 2, 0.5f, 2, 0.5f);
        scaleAnimation.setDuration(500L);
        this.s0.startAnimation(scaleAnimation);
    }

    public void createView(ViewGroup viewGroup) {
        if (this.t0 == null) {
            com.smartdigimkt.i2.b bVar = this.D0;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        map.put(com.smartdigimkt.d2.a.G, this.C0);
        com.smartdigimkt.c2.b.a().a(new com.smartdigimkt.r2.c().b(com.smartdigimkt.m6.b.p().k(), this.t0), new b(viewGroup), map);
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        this.s0 = this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        JSONException e2;
        JSONObject jSONObject;
        super.onAttachedToWindow();
        if (this.t0 == null) {
            return;
        }
        for (int i2 = 0; i2 < this.t0.size(); i2++) {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("camp_position", i2);
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
                aVar.a(110, jSONObject);
            }
        }
    }

    public void setCampOrderViewBuildCallback(com.smartdigimkt.i2.b bVar) {
        this.D0 = bVar;
    }

    public void setCampaignExes(List<com.smartdigimkt.x.d> list) {
        this.t0 = list;
    }

    public void setNotchPadding(int i2, int i3, int i4, int i5) {
        this.u0 = i2;
        this.v0 = i3;
        this.w0 = i4;
        this.x0 = i5;
        setViewStatus();
    }

    public void setRewarded(boolean z2) {
        this.E0 = z2;
    }

    public void setViewStatus() {
        AnyThinkOrderCampView anyThinkOrderCampView = this.s0;
        if (anyThinkOrderCampView == null || !this.E0) {
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) anyThinkOrderCampView.findViewById(filterFindViewId(this.B0, "sdm_native_order_camp_controller"));
        this.z0 = (FeedBackButton) this.s0.findViewById(filterFindViewId(this.B0, "sdm_native_order_camp_feed_btn"));
        this.A0 = (ImageView) this.s0.findViewById(filterFindViewId(this.B0, "sdm_iv_link"));
        if (relativeLayout != null) {
            relativeLayout.setPadding(this.u0, this.w0, this.v0, this.x0);
        }
        if (this.z0 != null) {
            try {
                d();
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        if (this.A0 != null) {
            try {
                e();
            } catch (Exception e3) {
                e3.getMessage();
            }
        }
    }

    public void startAlphaAnimation() {
        this.s0.startAnimation(androidx.media3.extractor.text.ttml.a.e(0.0f, 1.0f, 500L));
    }

    public void startTranslateAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(500L);
        this.s0.startAnimation(translateAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.smartdigimkt.x.d dVar, int i2, int i3) {
        JSONException e2;
        JSONObject jSONObject;
        if (dVar != null && dVar.H2()) {
            try {
                com.smartdigimkt.x.d.c cVarU1 = dVar.U1();
                if (cVarU1 != null) {
                    cVarU1.g();
                }
            } catch (Exception e3) {
                e3.getMessage();
            }
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.smartdigimkt.b0.a.i2, a(i2));
                jSONObject.put("camp_position", i3);
            } catch (JSONException e4) {
                e2 = e4;
                e2.printStackTrace();
            }
        } catch (JSONException e5) {
            e2 = e5;
            jSONObject = null;
        }
        com.smartdigimkt.t2.a aVar = this.i0;
        if (aVar != null) {
            aVar.a(105, jSONObject);
        }
    }

    public AnyThinkOrderCampView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B0 = false;
        this.C0 = new a();
        this.E0 = false;
    }

    public class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f34770a;

        public b(ViewGroup viewGroup) {
            this.f34770a = viewGroup;
        }

        @Override // com.smartdigimkt.i2.h
        public void a(com.smartdigimkt.c2.a aVar) {
            if (aVar != null) {
                try {
                    AnyThinkOrderCampView.this.s0.addView(aVar.b());
                    AnyThinkOrderCampView.this.B0 = aVar.c();
                    this.f34770a.removeAllViews();
                    this.f34770a.addView(AnyThinkOrderCampView.this.s0);
                    AnyThinkOrderCampView.this.setViewStatus();
                    if (AnyThinkOrderCampView.this.D0 != null) {
                        AnyThinkOrderCampView.this.D0.a();
                    }
                } catch (Exception e2) {
                    e2.getMessage();
                }
            }
        }

        @Override // com.smartdigimkt.i2.h
        public void a(com.smartdigimkt.f2.b bVar) {
            try {
                if (AnyThinkOrderCampView.this.D0 != null) {
                    AnyThinkOrderCampView.this.D0.b();
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
    }
}
