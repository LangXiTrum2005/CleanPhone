package com.smartdigimkt.expressad.video.bt.module;

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
import com.smartdigimkt.expressad.videocommon.view.RoundImageView;
import com.smartdigimkt.expressad.videocommon.view.StarLevelView;
import com.smartdigimkt.n.h;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.z2.j;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AnythinkBTNativeEC extends BTBaseView {
    private static final String P0 = "sdm_reward_endcard_native_hor";
    private static final String Q0 = "sdm_reward_endcard_native_land";
    private ImageView A0;
    private ImageView B0;
    private TextView C0;
    private TextView D0;
    private TextView E0;
    private StarLevelView F0;
    private boolean G0;
    private boolean H0;
    private int I0;
    private Runnable J0;
    private View K0;
    private View L0;
    private String M0;
    private j N0;
    private WebView O0;
    private ViewGroup u0;
    private ViewGroup v0;
    private RelativeLayout w0;
    private ImageView x0;
    private RoundImageView y0;
    private ImageView z0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AnythinkBTNativeEC.this.H0 = true;
            if (AnythinkBTNativeEC.this.K0 != null) {
                AnythinkBTNativeEC.this.K0.setVisibility(0);
            }
        }
    }

    public class b implements com.smartdigimkt.f0.c {
        public b() {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            try {
                float width = (bitmap.getWidth() * 1.0f) / bitmap.getHeight();
                int iA = v.a(AnythinkBTNativeEC.this.e0, 12.0f);
                AnythinkBTNativeEC.this.A0.getLayoutParams().height = iA;
                AnythinkBTNativeEC.this.A0.getLayoutParams().width = (int) (iA * width);
                AnythinkBTNativeEC.this.A0.setImageBitmap(bitmap);
                AnythinkBTNativeEC.this.A0.setBackgroundColor(1426063360);
            } catch (Throwable unused) {
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (AnythinkBTNativeEC.this.G0) {
                AnythinkBTNativeEC.this.c(1);
                AnythinkBTNativeEC.this.a(view.getX(), view.getY());
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (AnythinkBTNativeEC.this.O0 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", AnythinkBTNativeEC.this.h0);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("unitId", AnythinkBTNativeEC.this.M0);
                    jSONObject.put("data", jSONObject2);
                    jSONObject.toString();
                } catch (JSONException e2) {
                    e2.getMessage();
                }
                h.a().a(AnythinkBTNativeEC.this.O0, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }
    }

    public class e extends com.smartdigimkt.g3.a {
        public e() {
        }

        @Override // com.smartdigimkt.g3.a
        public void a(View view) {
            AnythinkBTNativeEC.this.c(0);
            AnythinkBTNativeEC.this.a(view.getX(), view.getY());
        }
    }

    public class f extends com.smartdigimkt.g3.a {
        public f() {
        }

        @Override // com.smartdigimkt.g3.a
        public void a(View view) {
            AnythinkBTNativeEC.this.c(0);
            AnythinkBTNativeEC.this.a(view.getX(), view.getY());
        }
    }

    public class g extends com.smartdigimkt.g3.a {
        public g() {
        }

        @Override // com.smartdigimkt.g3.a
        public void a(View view) {
            AnythinkBTNativeEC.this.c(0);
            AnythinkBTNativeEC.this.a(view.getX(), view.getY());
        }
    }

    public AnythinkBTNativeEC(Context context) {
        super(context);
        this.G0 = false;
        this.H0 = false;
        this.I0 = 0;
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            RenderScript renderScriptCreate = RenderScript.create(this.e0.getApplicationContext());
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

    @Override // com.smartdigimkt.expressad.video.bt.module.BTBaseView
    public void init(Context context) {
        int iC = c();
        if (iC > 0) {
            this.l0 = b(iC);
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.J0 == null) {
            this.J0 = new a();
        }
        Runnable runnable = this.J0;
        if (runnable != null) {
            postDelayed(runnable, this.I0 * 1000);
        }
        if (!this.l0 && this.O0 != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.h0);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("unitId", this.M0);
                jSONObject.put("data", jSONObject2);
                jSONObject.toString();
            } catch (JSONException e2) {
                e2.getMessage();
            }
            h.a().a(this.O0, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        }
        if (this.O0 != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", this.h0);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("unitId", this.M0);
                jSONObject3.put("data", jSONObject4);
                jSONObject3.toString();
            } catch (JSONException e3) {
                e3.getMessage();
            }
            h.a().a(this.O0, "onNativeECShow", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
        }
    }

    @Override // com.smartdigimkt.expressad.video.bt.module.BTBaseView
    public void onDestory() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.J0;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // com.smartdigimkt.expressad.video.bt.module.BTBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        int i2 = configuration.orientation;
        this.k0 = i2;
        if (i2 == 2) {
            removeView(this.u0);
            b(this.v0);
        } else {
            removeView(this.v0);
            b(this.u0);
        }
    }

    public void preLoadData() {
        Bitmap bitmapBlurBitmap;
        try {
            if (this.f0 == null || !this.l0) {
                return;
            }
            com.smartdigimkt.f3.d dVar = this.i0;
            if (dVar != null) {
                this.I0 = dVar.q();
            }
            com.smartdigimkt.f0.b.a(this.e0.getApplicationContext()).a(this.f0.k(), new com.smartdigimkt.u2.e(this.y0, this.f0, this.M0));
            com.smartdigimkt.f0.b.a(this.e0.getApplicationContext()).a(this.f0.i(), new com.smartdigimkt.u2.j(this.z0, v.a(com.smartdigimkt.u.a.f().d(), 8.0f)));
            this.C0.setText(this.f0.f());
            this.D0.setText(this.f0.e());
            this.E0.setText(this.f0.m() + ")");
            this.F0.removeAllViews();
            double dO = this.f0.o();
            if (dO <= 0.0d) {
                dO = 5.0d;
            }
            this.F0.initScore(dO);
            try {
                Bitmap bitmapA = a(this.y0.getDrawable());
                if (bitmapA != null && (bitmapBlurBitmap = blurBitmap(bitmapA)) != null) {
                    this.x0.setImageBitmap(bitmapBlurBitmap);
                }
            } catch (Throwable unused) {
                this.x0.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.f0.B2()) && this.f0.B2().contains("alecfc=1")) {
                this.G0 = true;
            }
            com.smartdigimkt.f0.b.a(this.e0.getApplicationContext()).a(TextUtils.isEmpty(this.f0.P()) ? com.smartdigimkt.b.b.e0 : this.f0.P(), new b());
            v.a(this.B0, this.f0, this.e0, true);
            if (this.H0) {
                return;
            }
            this.K0.setVisibility(8);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void setCreateWebView(WebView webView) {
        this.O0 = webView;
    }

    public void setJSCommon(j jVar) {
        this.N0 = jVar;
    }

    @Override // com.smartdigimkt.expressad.video.bt.module.BTBaseView
    public void setUnitId(String str) {
        this.M0 = str;
    }

    private void b(View view) {
        if (view == null) {
            init(this.e0);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i2) {
        JSONObject jSONObject;
        try {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.smartdigimkt.b0.a.i2, a(i2));
                } catch (JSONException e2) {
                    e = e2;
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        } catch (JSONException e3) {
            e = e3;
            jSONObject = null;
        }
        j jVar = this.N0;
        if (jVar != null) {
            jVar.click(1, jSONObject != null ? jSONObject.toString() : "");
        }
    }

    public AnythinkBTNativeEC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G0 = false;
        this.H0 = false;
        this.I0 = 0;
    }

    private boolean a(View view) {
        try {
            this.w0 = (RelativeLayout) view.findViewById(findID("sdm_native_ec_layout"));
            this.x0 = (ImageView) view.findViewById(findID("sdm_iv_adbanner_bg"));
            this.y0 = (RoundImageView) view.findViewById(findID("sdm_iv_adbanner"));
            this.z0 = (ImageView) view.findViewById(findID("sdm_iv_icon"));
            this.A0 = (ImageView) view.findViewById(findID("sdm_iv_flag"));
            this.B0 = (ImageView) view.findViewById(findID("sdm_iv_link"));
            this.C0 = (TextView) view.findViewById(findID("sdm_tv_apptitle"));
            this.D0 = (TextView) view.findViewById(findID("sdm_tv_appdesc"));
            this.E0 = (TextView) view.findViewById(findID("sdm_tv_nuater"));
            this.F0 = (StarLevelView) view.findViewById(findID("sdm_sv_starlevel"));
            this.K0 = view.findViewById(findID("sdm_iv_close"));
            View viewFindViewById = view.findViewById(findID("sdm_tv_cta"));
            this.L0 = viewFindViewById;
            return isNotNULL(this.x0, this.y0, this.z0, this.C0, this.D0, this.E0, this.F0, this.K0, viewFindViewById);
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    private boolean b(int i2) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.j0.inflate(i2, (ViewGroup) null);
            this.v0 = viewGroup;
            addView(viewGroup);
            return a(this.v0);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.j0.inflate(i2, (ViewGroup) null);
        this.u0 = viewGroup2;
        addView(viewGroup2);
        return a(this.u0);
    }

    private int c() {
        String str;
        if (isLandscape()) {
            str = Q0;
        } else {
            str = P0;
        }
        return findLayout(str);
    }

    @Override // com.smartdigimkt.expressad.video.bt.module.BTBaseView
    public void b() {
        if (this.l0) {
            this.w0.setOnClickListener(new c());
            this.K0.setOnClickListener(new d());
            this.L0.setOnClickListener(new e());
            this.z0.setOnClickListener(new f());
            this.y0.setOnClickListener(new g());
        }
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
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f2, float f3) {
        if (this.O0 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", BTBaseView.s0);
                jSONObject.put("id", this.h0);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", String.valueOf(f2));
                jSONObject2.put("y", String.valueOf(f3));
                jSONObject.put("data", jSONObject2);
                h.a().a(this.O0, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.smartdigimkt.z1.c.c().a(this.O0, "onClicked", this.h0);
            }
        }
    }
}
