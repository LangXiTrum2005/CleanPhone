package com.mbridge.msdk.splash.view;

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
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class BaseSplashPopView extends RelativeLayout {
    public static final int TYPE_POP_DEFAULT = 1;
    public static final int TYPE_POP_LARGE = 4;
    public static final int TYPE_POP_MEDIUM = 3;
    public static final int TYPE_POP_SMALL = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final AtomicInteger f36005v = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f36006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f36007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CampaignEx f36009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.splash.middle.d f36010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageView f36011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f36012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f36013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f36014i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f36015j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f36016k;
    private TextView l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f36017m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected Handler f36018n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f36019o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f36020p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private j f36021q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Runnable f36022r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Runnable f36023s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    View.OnClickListener f36024t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    View.OnClickListener f36025u;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements j {
        public a() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, BaseSplashPopView.this);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, BaseSplashPopView.this);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            int iA;
            int iA2;
            if (BaseSplashPopView.this.f36008c == 1) {
                int iMin = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                int iA3 = (v0.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(iMin / 4, 70), iMin)) / 2;
                iA = v0.a(BaseSplashPopView.this.getContext(), 23.0f) + iA3;
                iA2 = v0.a(BaseSplashPopView.this.getContext(), 10.0f) + iA3;
            } else {
                iA = 0;
                iA2 = 0;
            }
            u0.a(campaign, BaseSplashPopView.this, iA, iA2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f36027a;

        public b(boolean z10) {
            this.f36027a = z10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                Bitmap bitmapB = this.f36027a ? p0.b(bitmap) : p0.a(bitmap, 1, 16);
                ImageView imageView = BaseSplashPopView.this.f36011f;
                if (bitmapB != null) {
                    bitmap = bitmapB;
                }
                imageView.setImageBitmap(bitmap);
            } catch (Throwable th2) {
                q0.b("MBSplashPopView", th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements com.mbridge.msdk.foundation.same.image.c {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                BaseSplashPopView.this.f36013h.setImageBitmap(a0.a(bitmap, 10));
            } catch (Throwable th2) {
                q0.b("MBSplashPopView", th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements com.mbridge.msdk.foundation.same.image.c {
        public d() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                BaseSplashPopView.this.f36012g.setImageBitmap(p0.a(bitmap, 1, 16));
            } catch (Throwable th2) {
                q0.b("MBSplashPopView", th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BaseSplashPopView.this.l != null) {
                if (BaseSplashPopView.this.f36017m != 0) {
                    BaseSplashPopView.g(BaseSplashPopView.this);
                    BaseSplashPopView.this.l.setText(String.valueOf(BaseSplashPopView.this.f36017m));
                    BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                    baseSplashPopView.f36018n.postDelayed(baseSplashPopView.f36022r, 1000L);
                    return;
                }
                BaseSplashPopView.this.f36017m = -1;
                BaseSplashPopView.this.g();
                BaseSplashPopView baseSplashPopView2 = BaseSplashPopView.this;
                baseSplashPopView2.f36018n.removeCallbacks(baseSplashPopView2.f36022r);
                BaseSplashPopView baseSplashPopView3 = BaseSplashPopView.this;
                com.mbridge.msdk.splash.middle.d dVar = baseSplashPopView3.f36010e;
                if (dVar != null) {
                    dVar.a(new MBridgeIds(baseSplashPopView3.f36006a, baseSplashPopView3.f36007b), 5);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
            com.mbridge.msdk.splash.middle.d dVar = baseSplashPopView.f36010e;
            if (dVar != null) {
                dVar.a(new MBridgeIds(baseSplashPopView.f36006a, baseSplashPopView.f36007b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.f36008c);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
            if (baseSplashPopView.f36010e != null) {
                baseSplashPopView.b(baseSplashPopView.f36009d);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSplashPopView baseSplashPopView;
            com.mbridge.msdk.splash.middle.d dVar;
            if (BaseSplashPopView.this.f36017m <= 0 && (dVar = (baseSplashPopView = BaseSplashPopView.this).f36010e) != null) {
                dVar.a(new MBridgeIds(baseSplashPopView.f36006a, baseSplashPopView.f36007b), 4);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f36035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f36036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f36037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CampaignEx f36038d;

        public i(String str, String str2, int i10, CampaignEx campaignEx) {
            this.f36035a = str;
            this.f36036b = str2;
            this.f36037c = i10;
            this.f36038d = campaignEx;
        }

        public CampaignEx a() {
            return this.f36038d;
        }

        public String b() {
            return this.f36035a;
        }

        public String c() {
            return this.f36036b;
        }

        public int d() {
            return this.f36037c;
        }
    }

    public BaseSplashPopView(Context context, i iVar, com.mbridge.msdk.splash.middle.d dVar) {
        super(context);
        this.f36008c = 1;
        this.f36017m = -1;
        this.f36018n = new Handler();
        this.f36019o = false;
        this.f36021q = new a();
        this.f36022r = new e();
        this.f36023s = new f();
        this.f36024t = new g();
        this.f36025u = new h();
        if (iVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f36007b = iVar.c();
        this.f36006a = iVar.b();
        this.f36008c = iVar.d();
        this.f36009d = iVar.a();
        this.f36010e = dVar;
        a();
    }

    private void a(String str, boolean z10) {
        f2.g().a(str, new b(z10));
    }

    public static /* synthetic */ int g(BaseSplashPopView baseSplashPopView) {
        int i10 = baseSplashPopView.f36017m;
        baseSplashPopView.f36017m = i10 - 1;
        return i10;
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = f36005v;
            i10 = atomicInteger.get();
            i11 = i10 + 1;
            if (i11 > 16777215) {
                i11 = 1;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    private void setBackgroundImage(String str) {
        f2.g().a(str, new c());
    }

    private void setForegroundImage(String str) {
        f2.g().a(str, new d());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f36010e != null) {
            postDelayed(this.f36023s, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    public void pauseCountDown() {
        this.f36019o = true;
        if (this.l != null) {
            this.f36018n.removeCallbacks(this.f36022r);
        }
    }

    public void reStartCountDown() {
        if (this.f36019o) {
            this.f36019o = false;
            int i10 = this.f36017m;
            if (i10 == -1 || i10 == 0) {
                g();
                return;
            }
            TextView textView = this.l;
            if (textView != null) {
                textView.setText(String.valueOf(i10));
                this.f36018n.postDelayed(this.f36022r, 1000L);
            }
        }
    }

    public void release() {
        try {
            this.f36018n.removeCallbacks(this.f36023s);
            this.f36018n.removeCallbacks(this.f36022r);
            this.f36022r = null;
            detachAllViewsFromParent();
            this.f36009d = null;
            this.f36010e = null;
        } catch (Exception e10) {
            q0.b("MBSplashPopView", e10.getMessage());
        }
    }

    public void setPopViewType(i iVar, com.mbridge.msdk.splash.middle.d dVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f36007b = iVar.c();
        this.f36006a = iVar.b();
        this.f36008c = iVar.d();
        this.f36009d = iVar.a();
        this.f36010e = dVar;
        a();
    }

    public void startCountDown() {
        this.f36018n.removeCallbacks(this.f36022r);
        CampaignEx campaignEx = this.f36009d;
        if (campaignEx == null || this.f36008c != 1) {
            return;
        }
        int flbSkipTime = campaignEx.getFlbSkipTime();
        if (flbSkipTime <= 0) {
            g();
            return;
        }
        this.f36017m = flbSkipTime;
        TextView textView = this.l;
        if (textView != null) {
            textView.setText(String.valueOf(flbSkipTime));
            this.f36018n.postDelayed(this.f36022r, 1000L);
        }
    }

    private void b() {
        String language;
        this.f36014i = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 32.0f), v0.a(getContext(), 13.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(8, this.f36011f.getId());
        this.f36014i.setLayoutParams(layoutParams);
        try {
            language = getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th2) {
            q0.b("MBSplashPopView", th2.getMessage());
            language = "ZH";
        }
        this.f36014i.setBackgroundResource((language.toUpperCase().equals("CN") || language.toUpperCase().equals("ZH")) ? getResources().getIdentifier("mbridge_splash_pop_ad", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()) : getResources().getIdentifier("mbridge_splash_pop_ad_en", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f36014i);
    }

    private void c() {
        View imageView = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 80.0f), v0.a(getContext(), 80.0f));
        layoutParams.addRule(9);
        layoutParams.topMargin = v0.a(getContext(), 16.0f);
        imageView.setId(generateViewId());
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_default", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        this.f36011f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(v0.a(getContext(), 60.0f), v0.a(getContext(), 60.0f));
        layoutParams2.addRule(6, imageView.getId());
        layoutParams2.topMargin = v0.a(getContext(), 7.0f);
        layoutParams2.leftMargin = v0.a(getContext(), 10.0f);
        this.f36011f.setId(generateViewId());
        this.f36011f.setLayoutParams(layoutParams2);
        this.f36011f.setScaleType(ImageView.ScaleType.FIT_CENTER);
        CampaignEx campaignEx = this.f36009d;
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getIconUrl())) {
            a(this.f36009d.getIconUrl(), true);
        }
        this.l = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, imageView.getId());
        layoutParams3.addRule(8, imageView.getId());
        layoutParams3.leftMargin = v0.a(getContext(), 62.0f);
        layoutParams3.bottomMargin = v0.a(getContext(), 70.0f);
        this.l.setId(generateViewId());
        this.l.setTextSize(10.0f);
        this.l.setTextColor(-1);
        this.l.setGravity(17);
        this.l.setMinWidth(v0.a(getContext(), 16.0f));
        this.l.setMaxHeight(v0.a(getContext(), 16.0f));
        this.l.setLayoutParams(layoutParams3);
        this.l.setBackgroundResource(getResources().getIdentifier("mbridge_cm_circle_50black", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(imageView);
        addView(this.l);
        addView(this.f36011f);
        CampaignEx campaignEx2 = this.f36009d;
        if (campaignEx2 != null && campaignEx2.getFlbSkipTime() <= 0) {
            g();
        }
        CampaignEx campaignEx3 = this.f36009d;
        if (campaignEx3 != null) {
            b1.a(this, campaignEx3.getLocalRequestId(), this.f36009d.getLocalAllowTrackClick());
        }
        setOnClickListener(this.f36024t);
        this.l.setOnClickListener(this.f36025u);
    }

    private void d() {
        this.f36013h = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, v0.a(getContext(), 131.0f));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        this.f36013h.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f36013h.setId(generateViewId());
        this.f36013h.setLayoutParams(layoutParams);
        setBackgroundImage(this.f36009d.getImageUrl());
        this.f36012g = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, v0.a(getContext(), 131.0f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(14);
        this.f36012g.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f36012g.setId(generateViewId());
        this.f36012g.setLayoutParams(layoutParams2);
        setForegroundImage(this.f36009d.getImageUrl());
        this.f36011f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(v0.a(getContext(), 50.0f), v0.a(getContext(), 50.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(3, this.f36013h.getId());
        layoutParams3.topMargin = 20;
        this.f36011f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f36011f.setId(generateViewId());
        this.f36011f.setLayoutParams(layoutParams3);
        a(this.f36009d.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(1, this.f36011f.getId());
        layoutParams4.addRule(6, this.f36011f.getId());
        layoutParams4.addRule(8, this.f36011f.getId());
        layoutParams4.leftMargin = v0.a(getContext(), 8.0f);
        layoutParams4.rightMargin = v0.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams4);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f36015j = textView;
        textView.setId(generateViewId());
        this.f36015j.setGravity(16);
        this.f36015j.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f36015j.setTextSize(12.0f);
        this.f36015j.setTextColor(-16777216);
        TextView textView2 = this.f36015j;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.f36015j.setMarqueeRepeatLimit(-1);
        this.f36015j.setSelected(true);
        this.f36015j.setSingleLine(true);
        this.f36015j.setText(this.f36009d.getAppName());
        TextView textView3 = new TextView(getContext());
        this.f36016k = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(5, this.f36015j.getId());
        layoutParams5.addRule(3, this.f36015j.getId());
        layoutParams5.topMargin = v0.a(getContext(), 4.0f);
        layoutParams5.rightMargin = v0.a(getContext(), 36.0f);
        this.f36016k.setGravity(16);
        this.f36016k.setLayoutParams(layoutParams5);
        this.f36016k.setTextSize(8.0f);
        this.f36016k.setTextColor(-10066330);
        this.f36016k.setEllipsize(truncateAt);
        this.f36016k.setMarqueeRepeatLimit(-1);
        this.f36016k.setSelected(true);
        this.f36016k.setSingleLine(true);
        this.f36016k.setText(this.f36009d.getAppDesc());
        relativeLayout.addView(this.f36015j);
        relativeLayout.addView(this.f36016k);
        addView(this.f36013h);
        addView(this.f36012g);
        addView(this.f36011f);
        addView(relativeLayout);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f36009d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f36009d.getBidToken(), eVar, this.f36009d, this.f36007b).t(), this.f36009d.getLocalAllowTrackClick());
        setOnClickListener(this.f36024t);
    }

    private void e() {
        int iA = v0.a(getContext(), 4.0f);
        this.f36011f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 50.0f), v0.a(getContext(), 50.0f));
        layoutParams.addRule(9);
        this.f36011f.setId(generateViewId());
        this.f36011f.setLayoutParams(layoutParams);
        this.f36011f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f36011f.setPadding(iA, iA, iA, iA);
        a(this.f36009d.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(1, this.f36011f.getId());
        layoutParams2.addRule(6, this.f36011f.getId());
        layoutParams2.addRule(8, this.f36011f.getId());
        layoutParams2.leftMargin = v0.a(getContext(), 8.0f);
        layoutParams2.rightMargin = v0.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f36015j = textView;
        textView.setId(generateViewId());
        this.f36015j.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f36015j.setGravity(16);
        this.f36015j.setTextSize(12.0f);
        this.f36015j.setSelected(true);
        TextView textView2 = this.f36015j;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.f36015j.setMarqueeRepeatLimit(-1);
        this.f36015j.setSingleLine(true);
        this.f36015j.setTextColor(-16777216);
        this.f36015j.setText(this.f36009d.getAppName());
        TextView textView3 = new TextView(getContext());
        this.f36016k = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, this.f36015j.getId());
        layoutParams3.addRule(3, this.f36015j.getId());
        layoutParams3.topMargin = v0.a(getContext(), 4.0f);
        layoutParams3.rightMargin = v0.a(getContext(), 36.0f);
        this.f36016k.setGravity(16);
        this.f36016k.setLayoutParams(layoutParams3);
        this.f36016k.setTextSize(8.0f);
        this.f36016k.setTextColor(-10066330);
        this.f36016k.setEllipsize(truncateAt);
        this.f36016k.setMarqueeRepeatLimit(-1);
        this.f36016k.setSelected(true);
        this.f36016k.setSingleLine(true);
        this.f36016k.setText(this.f36009d.getAppDesc());
        relativeLayout.addView(this.f36015j);
        relativeLayout.addView(this.f36016k);
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f36011f);
        addView(relativeLayout);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f36009d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f36009d.getBidToken(), eVar, this.f36009d, this.f36007b).t(), this.f36009d.getLocalAllowTrackClick());
        setOnClickListener(this.f36024t);
    }

    private void f() {
        int iA = v0.a(getContext(), 4.0f);
        this.f36011f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 28.0f), v0.a(getContext(), 28.0f));
        layoutParams.addRule(9);
        this.f36011f.setId(generateViewId());
        this.f36011f.setLayoutParams(layoutParams);
        this.f36011f.setPadding(iA, iA, iA, iA);
        this.f36011f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        a(this.f36009d.getIconUrl(), false);
        TextView textView = new TextView(getContext());
        this.f36015j = textView;
        textView.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.f36011f.getId());
        layoutParams2.addRule(6, this.f36011f.getId());
        layoutParams2.addRule(8, this.f36011f.getId());
        layoutParams2.leftMargin = v0.a(getContext(), 4.0f);
        layoutParams2.rightMargin = v0.a(getContext(), 40.0f);
        this.f36015j.setLayoutParams(layoutParams2);
        this.f36015j.setGravity(16);
        this.f36015j.setTextSize(10.0f);
        this.f36015j.setSelected(true);
        this.f36015j.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f36015j.setMarqueeRepeatLimit(-1);
        this.f36015j.setSingleLine(true);
        this.f36015j.setTextColor(-16777216);
        this.f36015j.setText(this.f36009d.getAppName());
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f36011f);
        addView(this.f36015j);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f36009d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f36009d.getBidToken(), eVar, this.f36009d, this.f36007b).t(), this.f36009d.getLocalAllowTrackClick());
        setOnClickListener(this.f36024t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TextView textView = this.l;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = v0.a(getContext(), 16.0f);
            layoutParams.height = v0.a(getContext(), 16.0f);
            this.l.setLayoutParams(layoutParams);
            this.l.setText("");
            this.l.setSelected(true);
            this.l.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_close", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        }
    }

    private void a() {
        if (this.f36009d == null) {
            return;
        }
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int i10 = this.f36008c;
        if (i10 == 1) {
            c();
            return;
        }
        if (i10 == 2) {
            f();
        } else if (i10 == 3) {
            e();
        } else {
            if (i10 != 4) {
                return;
            }
            d();
        }
    }

    public void a(CampaignEx campaignEx) {
        if (this.f36020p == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f36007b);
            this.f36020p = aVar;
            aVar.a(this.f36021q);
        }
        campaignEx.setCampaignUnitId(this.f36007b);
        this.f36020p.a(campaignEx);
        if (!campaignEx.isReportClick()) {
            campaignEx.setReportClick(true);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f36010e;
        if (dVar != null) {
            dVar.a(new MBridgeIds(this.f36006a, this.f36007b));
            this.f36010e.a(new MBridgeIds(this.f36006a, this.f36007b), 6);
        }
    }

    public void b(CampaignEx campaignEx) {
        com.mbridge.msdk.splash.report.a.a(campaignEx, this.f36007b);
    }

    public BaseSplashPopView(Context context) {
        super(context);
        this.f36008c = 1;
        this.f36017m = -1;
        this.f36018n = new Handler();
        this.f36019o = false;
        this.f36021q = new a();
        this.f36022r = new e();
        this.f36023s = new f();
        this.f36024t = new g();
        this.f36025u = new h();
        this.f36008c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36008c = 1;
        this.f36017m = -1;
        this.f36018n = new Handler();
        this.f36019o = false;
        this.f36021q = new a();
        this.f36022r = new e();
        this.f36023s = new f();
        this.f36024t = new g();
        this.f36025u = new h();
        this.f36008c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36008c = 1;
        this.f36017m = -1;
        this.f36018n = new Handler();
        this.f36019o = false;
        this.f36021q = new a();
        this.f36022r = new e();
        this.f36023s = new f();
        this.f36024t = new g();
        this.f36025u = new h();
        this.f36008c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f36008c = 1;
        this.f36017m = -1;
        this.f36018n = new Handler();
        this.f36019o = false;
        this.f36021q = new a();
        this.f36022r = new e();
        this.f36023s = new f();
        this.f36024t = new g();
        this.f36025u = new h();
        this.f36008c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }
}
