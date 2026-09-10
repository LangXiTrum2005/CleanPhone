package com.mbridge.msdk.video.bt.module;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.module.listener.impl.j;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.mbridge.msdk.videocommon.view.StarLevelView;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class MBridgeBTNativeEC extends MBridgeBTNativeECDiff {
    private TextView A;
    private StarLevelView B;
    private boolean C;
    private boolean D;
    private int E;
    private Runnable F;
    private boolean G;
    private View H;
    private String I;
    private k J;
    private WebView K;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ViewGroup f37227p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ViewGroup f37228q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private RelativeLayout f37229r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ImageView f37230s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private RoundImageView f37231t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f37232u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ImageView f37233v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ImageView f37234w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ImageView f37235x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private TextView f37236y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private TextView f37237z;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeBTNativeEC.this.D = true;
            if (MBridgeBTNativeEC.this.H != null) {
                MBridgeBTNativeEC.this.H.setVisibility(0);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeBTNativeEC.this.C) {
                MBridgeBTNativeEC.this.a(1, view.getContext());
                MBridgeBTNativeEC.this.a(view.getX(), view.getY());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeBTNativeEC.this.K != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", MBridgeBTNativeEC.this.f37157d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("unitId", MBridgeBTNativeEC.this.I);
                    jSONObject.put("data", jSONObject2);
                    q0.a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
                } catch (JSONException e10) {
                    q0.a(BTBaseView.TAG, e10.getMessage());
                }
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(MBridgeBTNativeEC.this.K, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d extends com.mbridge.msdk.widget.a {
        public d() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            MBridgeBTNativeEC.this.a(0, view.getContext());
            MBridgeBTNativeEC.this.a(view.getX(), view.getY());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e extends com.mbridge.msdk.widget.a {
        public e() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            if (!com.mbridge.msdk.util.b.a() || MBridgeBTNativeEC.this.checkChinaProgressBarStatus()) {
                MBridgeBTNativeEC.this.a(0, view.getContext());
            }
            MBridgeBTNativeEC.this.a(view.getX(), view.getY());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f extends com.mbridge.msdk.widget.a {
        public f() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            if (!com.mbridge.msdk.util.b.a() || MBridgeBTNativeEC.this.checkChinaProgressBarStatus()) {
                MBridgeBTNativeEC.this.a(0, view.getContext());
            }
            MBridgeBTNativeEC.this.a(view.getX(), view.getY());
        }
    }

    public MBridgeBTNativeEC(Context context) {
        super(context);
        this.C = false;
        this.D = false;
        this.E = 0;
        this.G = false;
    }

    @TargetApi(17)
    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            RenderScript renderScriptCreate = RenderScript.create(this.f37154a.getApplicationContext());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(10.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            bitmap.recycle();
            renderScriptCreate.destroy();
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTNativeECDiff, com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        int iC = c();
        if (i0.a(iC)) {
            this.f37161h = b(iC);
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.F == null) {
            this.F = new a();
        }
        Runnable runnable = this.F;
        if (runnable != null) {
            postDelayed(runnable, this.E * 1000);
        }
        if (!this.f37161h && this.K != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.f37157d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("unitId", this.I);
                jSONObject.put("data", jSONObject2);
                q0.a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
            } catch (JSONException e10) {
                q0.a(BTBaseView.TAG, e10.getMessage());
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.K, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        }
        if (this.K != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", this.f37157d);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("unitId", this.I);
                jSONObject3.put("data", jSONObject4);
                q0.a(BTBaseView.TAG, "NativeEC Call H5 onEndCardShow " + jSONObject3.toString());
            } catch (JSONException e11) {
                q0.a(BTBaseView.TAG, e11.getMessage());
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.K, "onNativeECShow", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.F;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        int i10 = configuration.orientation;
        this.f37160g = i10;
        if (i10 == 2) {
            removeView(this.f37227p);
            b(this.f37228q);
        } else {
            removeView(this.f37228q);
            b(this.f37227p);
        }
    }

    public void preLoadData() {
        Bitmap bitmapBlurBitmap;
        try {
            CampaignEx campaignEx = this.f37155b;
            if (campaignEx == null || !this.f37161h) {
                return;
            }
            if (campaignEx.getCbd() > -2) {
                this.E = this.f37155b.getCbd();
            } else {
                com.mbridge.msdk.videocommon.setting.c cVar = this.f37158e;
                if (cVar != null) {
                    this.E = cVar.i();
                }
            }
            com.mbridge.msdk.foundation.same.image.b.a(this.f37154a.getApplicationContext()).a(this.f37155b.getImageUrl(), new com.mbridge.msdk.video.module.listener.impl.e(this.f37231t, this.f37155b, this.I));
            com.mbridge.msdk.foundation.same.image.b.a(this.f37154a.getApplicationContext()).a(this.f37155b.getIconUrl(), new j(this.f37232u, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 8.0f)));
            this.f37236y.setText(this.f37155b.getAppName());
            this.f37237z.setText(this.f37155b.getAppDesc());
            this.A.setText(this.f37155b.getNumberRating() + ")");
            this.B.removeAllViews();
            if (com.mbridge.msdk.util.b.a()) {
                setChinaCTAData(this.f37155b);
            }
            double rating = this.f37155b.getRating();
            if (rating <= 0.0d) {
                rating = 5.0d;
            }
            this.B.initScore(rating);
            try {
                Bitmap bitmapA = a(this.f37231t.getDrawable());
                if (bitmapA != null && (bitmapBlurBitmap = blurBitmap(bitmapA)) != null) {
                    this.f37230s.setImageBitmap(bitmapBlurBitmap);
                }
            } catch (Throwable unused) {
                this.f37230s.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.f37155b.getendcard_url()) && this.f37155b.getendcard_url().contains("alecfc=1")) {
                this.C = true;
            }
            if (!TextUtils.isEmpty(this.f37155b.getendcard_url()) && this.f37155b.getendcard_url().contains("wlgo=1")) {
                this.G = true;
            }
            String language = Locale.getDefault().getLanguage();
            if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                this.f37233v.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_en", "drawable", com.mbridge.msdk.foundation.controller.c.n().i())));
            } else {
                this.f37233v.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", com.mbridge.msdk.foundation.controller.c.n().i())));
            }
            if (!this.G) {
                this.f37233v.setVisibility(4);
                this.f37235x.setVisibility(4);
            }
            v0.a(2, this.f37234w, this.f37155b, this.f37154a, true, null);
            if (this.D) {
                return;
            }
            this.H.setVisibility(8);
        } catch (Throwable th2) {
            q0.a(BTBaseView.TAG, th2.getMessage());
        }
    }

    public void setCreateWebView(WebView webView) {
        this.K = webView;
    }

    public void setJSCommon(k kVar) {
        this.J = kVar;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setUnitId(String str) {
        this.I = str;
    }

    private void b(View view) {
        if (view == null) {
            init(this.f37154a);
            preLoadData();
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        addView(view);
        a(view);
        b();
    }

    private int c() {
        return findLayout(isLandscape() ? "mbridge_reward_endcard_native_land" : "mbridge_reward_endcard_native_hor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, Context context) {
        JSONObject jSONObject;
        try {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.mbridge.msdk.foundation.same.a.f33724j, a(i10));
                } catch (JSONException e10) {
                    e = e10;
                    e.printStackTrace();
                }
            } catch (Throwable th2) {
                q0.a(BTBaseView.TAG, th2.getMessage());
                return;
            }
        } catch (JSONException e11) {
            e = e11;
            jSONObject = null;
        }
        if (this.J != null) {
            if (com.mbridge.msdk.util.b.a()) {
                doChinaJumpClick(context, this.J);
            }
            this.J.click(1, jSONObject != null ? jSONObject.toString() : "");
        }
    }

    public MBridgeBTNativeEC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = false;
        this.D = false;
        this.E = 0;
        this.G = false;
    }

    private boolean b(int i10) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f37159f.inflate(i10, (ViewGroup) null);
            this.f37228q = viewGroup;
            addView(viewGroup);
            return a(this.f37228q);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f37159f.inflate(i10, (ViewGroup) null);
        this.f37227p = viewGroup2;
        addView(viewGroup2);
        return a(this.f37227p);
    }

    private boolean a(View view) {
        try {
            this.f37229r = (RelativeLayout) view.findViewById(findID("mbridge_native_ec_layout"));
            this.f37230s = (ImageView) view.findViewById(findID("mbridge_iv_adbanner_bg"));
            this.f37231t = (RoundImageView) view.findViewById(findID("mbridge_iv_adbanner"));
            this.f37232u = (ImageView) view.findViewById(findID("mbridge_iv_icon"));
            this.f37233v = (ImageView) view.findViewById(findID("mbridge_iv_flag"));
            this.f37234w = (ImageView) view.findViewById(findID("mbridge_iv_link"));
            this.f37236y = (TextView) view.findViewById(findID("mbridge_tv_apptitle"));
            this.f37237z = (TextView) view.findViewById(findID("mbridge_tv_appdesc"));
            this.A = (TextView) view.findViewById(findID("mbridge_tv_number"));
            this.B = (StarLevelView) view.findViewById(findID("mbridge_sv_starlevel"));
            this.H = view.findViewById(findID("mbridge_iv_close"));
            this.ctaView = view.findViewById(findID("mbridge_tv_cta"));
            this.f37235x = (ImageView) view.findViewById(findID("mbridge_iv_logo"));
            return isNotNULL(this.f37230s, this.f37231t, this.f37232u, this.f37236y, this.f37237z, this.A, this.B, this.H, this.ctaView);
        } catch (Throwable th2) {
            q0.b(BTBaseView.TAG, th2.getMessage(), th2);
            return false;
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void b() {
        if (this.f37161h) {
            this.f37229r.setOnClickListener(new b());
            this.H.setOnClickListener(new c());
            this.ctaView.setOnClickListener(new d());
            this.f37232u.setOnClickListener(new e());
            this.f37231t.setOnClickListener(new f());
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTNativeECDiff, com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
    }

    private Bitmap a(Drawable drawable) {
        try {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            q0.a(BTBaseView.TAG, th2.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f10, float f11) {
        if (this.K != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", BTBaseView.f37152n);
                jSONObject.put("id", this.f37157d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", String.valueOf(f10));
                jSONObject2.put("y", String.valueOf(f11));
                jSONObject.put("data", jSONObject2);
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.K, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.mbridge.msdk.video.bt.component.d.c().a(this.K, "onClicked", this.f37157d);
            }
        }
    }
}
