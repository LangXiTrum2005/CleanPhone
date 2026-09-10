package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.module.listener.impl.j;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class MBridgeVideoEndCoverView extends MBridgeBaseView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f37679m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f37680n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ImageView f37681o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ImageView f37682p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f37683q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f37684r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private TextView f37685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.mbridge.msdk.video.signal.factory.b f37686t;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoEndCoverView.this.notifyListener.a(InterfaceC0435l1.d.b.f29108e, "");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoEndCoverView.this.g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoEndCoverView.this.g();
        }
    }

    public MBridgeVideoEndCoverView(Context context) {
        super(context);
        this.f37679m = "MBridgeVideoEndCoverView";
    }

    private boolean a(View view) {
        if (view == null) {
            return true;
        }
        try {
            this.f37681o = (ImageView) view.findViewById(findID("mbridge_vec_iv_icon"));
            this.f37682p = (ImageView) view.findViewById(findID("mbridge_vec_iv_close"));
            this.f37683q = (TextView) view.findViewById(findID("mbridge_vec_tv_title"));
            this.f37684r = (TextView) view.findViewById(findID("mbridge_vec_tv_desc"));
            this.f37685s = (TextView) view.findViewById(findID("mbridge_vec_btn"));
            return true;
        } catch (Throwable th2) {
            q0.b("MBridgeVideoEndCoverView", th2.getMessage());
            return false;
        }
    }

    private void e() {
        ImageView imageView;
        CampaignEx campaignEx = this.f37560b;
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getIconUrl()) && (imageView = this.f37681o) != null) {
                b1.a(imageView, this.f37560b.getLocalRequestId(), this.f37560b.getLocalAllowTrackClick());
                com.mbridge.msdk.foundation.same.image.b.a(this.f37559a.getApplicationContext()).a(this.f37560b.getIconUrl(), new j(this.f37681o, f2.c(8.0f)));
            }
            TextView textView = this.f37683q;
            if (textView != null) {
                textView.setText(this.f37560b.getAppName());
            }
            TextView textView2 = this.f37685s;
            if (textView2 != null) {
                b1.a(textView2, this.f37560b.getLocalRequestId(), this.f37560b.getLocalAllowTrackClick());
                this.f37685s.setText(this.f37560b.getAdCall());
            }
            TextView textView3 = this.f37684r;
            if (textView3 != null) {
                textView3.setText(this.f37560b.getAppDesc());
            }
        }
    }

    private void f() {
        View view = this.f37680n;
        if (view == null) {
            init(this.f37559a);
            preLoadData(this.f37686t);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.f37680n.getParent()).removeView(this.f37680n);
        }
        addView(this.f37680n);
        a(this.f37680n);
        d();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void d() {
        super.d();
        this.f37682p.setOnClickListener(new a());
        this.f37681o.setOnClickListener(new b());
        this.f37685s.setOnClickListener(new c());
    }

    public void g() {
        JSONException e10;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONException e11;
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f33722h, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37564f));
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f33723i, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37565g));
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f33726m, 0);
                    try {
                        this.f37562d = getContext().getResources().getConfiguration().orientation;
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f33725k, this.f37562d);
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.l, v0.d(getContext()));
                } catch (JSONException e13) {
                    e11 = e13;
                    q0.b("MBridgeVideoEndCoverView", e11.getMessage());
                }
            } catch (JSONException e14) {
                jSONObject2 = jSONObject3;
                e11 = e14;
            }
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.mbridge.msdk.foundation.same.a.f33724j, jSONObject2);
            } catch (JSONException e15) {
                e10 = e15;
                e10.printStackTrace();
            }
        } catch (JSONException e16) {
            e10 = e16;
            jSONObject = null;
        }
        this.notifyListener.a(InterfaceC0435l1.d.b.f29109f, jSONObject);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_videoend_cover");
        if (i0.a(iFindLayout)) {
            View viewInflate = this.f37561c.inflate(iFindLayout, (ViewGroup) null);
            this.f37680n = viewInflate;
            if (viewInflate != null) {
                this.f37563e = a(viewInflate);
                addView(this.f37680n, -1, -1);
                d();
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f37564f = motionEvent.getRawX();
        this.f37565g = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f37562d = configuration.orientation;
        removeView(this.f37680n);
        f();
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f37686t = bVar;
        try {
            if (this.f37560b == null || !this.f37563e) {
                return;
            }
            e();
        } catch (Throwable th2) {
            q0.a("MBridgeVideoEndCoverView", th2.getMessage());
        }
    }

    public MBridgeVideoEndCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37679m = "MBridgeVideoEndCoverView";
    }
}
