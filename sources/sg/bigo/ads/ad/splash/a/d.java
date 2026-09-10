package sg.bigo.ads.ad.splash.a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Iterator;
import sg.bigo.ads.R;
import sg.bigo.ads.api.SplashAd;
import sg.bigo.ads.api.a.m;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static float f46857l = 20.0f;
    private sg.bigo.ads.common.q.b m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f46858n;
    private float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f46859p;
    private final float q;
    private final float[] r;
    private long s;
    private boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private View.OnTouchListener f46860u;

    public d(sg.bigo.ads.api.core.g gVar, m mVar, m mVar2, sg.bigo.ads.ad.splash.b bVar) {
        super(gVar, mVar, mVar2, bVar);
        this.f46858n = true;
        this.o = 0.0f;
        this.f46859p = 0.0f;
        this.q = -1.0f;
        this.r = new float[]{-1.0f, -1.0f, -1.0f};
        this.s = 0L;
        this.f46860u = new View.OnTouchListener() { // from class: sg.bigo.ads.ad.splash.a.d.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    sg.bigo.ads.common.t.a.a(0, 3, "splashSlide", "down...");
                    d.this.o = motionEvent.getX();
                    d.this.f46859p = motionEvent.getY();
                    return true;
                }
                if (action == 1) {
                    int iA = d.a(Math.round(d.this.o), Math.round(d.this.f46859p), Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
                    sg.bigo.ads.common.t.a.a(0, 3, "splashSlide", "up...".concat(String.valueOf(iA)));
                    if (iA > 30) {
                        d.c(d.this);
                        return true;
                    }
                }
                return false;
            }
        };
    }

    public static /* synthetic */ float a(int i2) {
        if (i2 != 4) {
            return (i2 == 9 || i2 == 1) ? 4.0f : 20.0f;
        }
        return 20.0f;
    }

    private int l() {
        return sg.bigo.ads.ad.splash.a.b(this.f46824b) ? R.layout.bigo_ad_splash_style_halfscreen_interaction : R.layout.bigo_ad_splash_style_fullscreen_interaction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int m() {
        m mVar = this.f46825c;
        if (mVar == null) {
            return 0;
        }
        return mVar.a("video_play_page.interactive_method", 0);
    }

    @Override // sg.bigo.ads.ad.splash.a.b, sg.bigo.ads.ad.splash.a.c
    public final void c() {
        super.c();
        sg.bigo.ads.common.q.b bVar = this.m;
        if (bVar != null) {
            SensorManager sensorManager = bVar.f47430c;
            if (sensorManager != null) {
                sensorManager.unregisterListener(bVar.g);
                bVar.g = null;
                bVar.f47430c = null;
            }
            bVar.f47429b = null;
            this.m = null;
        }
        this.f46860u = null;
    }

    @Override // sg.bigo.ads.ad.splash.a.b
    public final int e() {
        if (this.f46825c != null && f()) {
            return sg.bigo.ads.ad.splash.a.b(this.f46824b) ? R.layout.bigo_ad_splash_style_halfscreen_interaction : R.layout.bigo_ad_splash_style_fullscreen_interaction_immersive;
        }
        return l();
    }

    @Override // sg.bigo.ads.ad.splash.a.b
    public final boolean g() {
        return false;
    }

    public static /* synthetic */ void c(d dVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - dVar.s;
        if (!dVar.f46858n || j <= 2000) {
            return;
        }
        dVar.s = jElapsedRealtime;
        dVar.f46827h.x.a(8, 22);
    }

    public static /* synthetic */ int a(int i2, int i3, int i4, int i5) {
        return Math.max(Math.abs(i2 - i4), Math.abs(i3 - i5));
    }

    @Override // sg.bigo.ads.ad.splash.a.b, sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z2) {
        super.a(z2);
        this.f46858n = z2;
    }

    @Override // sg.bigo.ads.ad.splash.a.b, sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z2, ViewGroup viewGroup, int i2) {
        super.a(z2, viewGroup, i2);
        if (!z2 || this.t) {
            return;
        }
        sg.bigo.ads.ad.splash.a.f46784a = true;
        this.t = true;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.inter_fl_interaction_container);
        int i3 = R.layout.bigo_ad_item_interaction_vertical;
        if (this.f46827h.getStyle() == SplashAd.Style.HORIZONTAL) {
            i3 = R.layout.bigo_ad_item_interaction_horizontal;
        }
        if (viewGroup2 != null) {
            View viewA = sg.bigo.ads.common.utils.a.a(viewGroup2.getContext(), i3, viewGroup2, false);
            viewGroup2.removeAllViews();
            viewGroup2.addView(viewA);
            ImageView imageView = (ImageView) viewA.findViewById(R.id.inter_iv_interaction_arrow);
            ImageView imageView2 = (ImageView) viewA.findViewById(R.id.inter_iv_interaction_phone);
            TextView textView = (TextView) viewA.findViewById(R.id.inter_tv_interaction_type);
            if (imageView != null && imageView2 != null && textView != null) {
                int iM = m();
                int i4 = R.drawable.bigo_ad_interaction_shake_arrow;
                int i5 = R.drawable.bigo_ad_interaction_shake_phone;
                String string = viewA.getContext().getString(R.string.bigo_ad_interaction_shake);
                if (iM != 1) {
                    if (iM == 2) {
                        i5 = R.drawable.bigo_ad_interaction_slide_hand;
                        i4 = R.drawable.bigo_ad_interaction_slide_line;
                        string = viewA.getContext().getString(R.string.bigo_ad_interaction_slide);
                    } else if (iM == 3) {
                        i4 = R.drawable.bigo_ad_interaction_twist_arrow;
                        string = viewA.getContext().getString(R.string.bigo_ad_interaction_twist);
                        i5 = sg.bigo.ads.ad.splash.a.b() ? R.drawable.bigo_ad_interaction_twist_landscape_phone : R.drawable.bigo_ad_interaction_twist_phone;
                    }
                } else if (sg.bigo.ads.ad.splash.a.b()) {
                    i5 = R.drawable.bigo_ad_interaction_shake_landscape_phone;
                }
                imageView.setImageResource(i4);
                imageView2.setImageResource(i5);
                textView.setText(string);
                if (iM == 1) {
                    sg.bigo.ads.ad.splash.a.b(imageView2);
                } else if (iM == 2) {
                    imageView2.setTranslationY(sg.bigo.ads.common.utils.e.a(imageView2.getContext(), 60));
                    sg.bigo.ads.ad.splash.a.a(imageView2, imageView2.getTranslationY());
                } else if (iM == 3) {
                    sg.bigo.ads.ad.splash.a.a(imageView2);
                }
            }
        }
        View viewFindViewById = viewGroup.findViewById(R.id.bigo_ad_splash_media);
        if (2 == m()) {
            if (viewFindViewById != null) {
                viewFindViewById.setOnTouchListener(this.f46860u);
            }
            if (viewGroup2 != null) {
                viewGroup2.setOnTouchListener(this.f46860u);
            }
        }
        Context context = viewGroup.getContext();
        int iM2 = m();
        int iIntValue = 4;
        if (this.m == null && context != null && (1 == iM2 || 3 == iM2)) {
            this.m = new sg.bigo.ads.common.q.b(context, Arrays.asList(4, 9, 1), new sg.bigo.ads.common.q.a() { // from class: sg.bigo.ads.ad.splash.a.d.2
                @Override // sg.bigo.ads.common.q.a
                public final void a(int i6, float[] fArr, float[] fArr2) {
                    char c2;
                    if (i6 == 4) {
                        c2 = 2;
                        fArr = fArr2;
                    } else {
                        c2 = 0;
                    }
                    if (fArr.length == 3) {
                        int iM3 = d.this.m();
                        if (iM3 == 1) {
                            for (int i7 = 0; i7 < fArr.length; i7++) {
                                float f = fArr[i7];
                                if (-1.0f == d.this.r[i7]) {
                                    d.this.r[i7] = f;
                                }
                                if (Math.abs(f - d.this.r[i7]) > d.a(i6)) {
                                    d.this.r[i7] = f;
                                }
                            }
                            return;
                        }
                        if (iM3 != 3) {
                            return;
                        }
                        float f2 = fArr[c2];
                        if (-1.0f == d.this.r[c2]) {
                            d.this.r[c2] = f2;
                        }
                        if (Math.abs(f2 - d.this.r[c2]) <= d.a(i6)) {
                            return;
                        } else {
                            d.this.r[c2] = f2;
                        }
                        d.c(d.this);
                    }
                }
            });
        }
        sg.bigo.ads.common.q.b bVar = this.m;
        if (bVar != null) {
            try {
                bVar.f47430c = (SensorManager) bVar.f47428a.get().getApplicationContext().getSystemService("sensor");
                Iterator<Integer> it = bVar.f.iterator();
                Sensor defaultSensor = null;
                while (it.hasNext() && (defaultSensor = bVar.f47430c.getDefaultSensor((iIntValue = it.next().intValue()))) == null) {
                }
                bVar.f47430c.registerListener(bVar.g, defaultSensor, iIntValue);
            } catch (Throwable unused) {
            }
        }
    }
}
