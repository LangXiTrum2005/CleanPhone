package sg.bigo.ads.ad.interstitial;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.k;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class p<T extends k<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final p<T>.c f46455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final i<T> f46456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final sg.bigo.ads.ad.b.b f46457c;
    final sg.bigo.ads.api.a.m d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final b f46458e;
    FrameLayout f;
    TextView g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    RoundedFrameLayout f46459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    RoundedFrameLayout f46460i;
    p<T>.e j;
    d k;
    final a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final a f46462n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    l f46463p;
    View q;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f46461l = false;
    final List<Object> o = new ArrayList();
    private boolean r = false;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f46506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f46507c;
        long[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f46508e;

        private a() {
            this.f46505a = 0;
            this.f46506b = 3;
            this.f46507c = -1L;
            this.d = new long[5];
            this.f46508e = false;
        }

        public final void a(int i2, int i3, boolean z2) {
            if (i2 >= 0) {
                long[] jArr = this.d;
                if (i2 >= jArr.length) {
                    return;
                }
                boolean z3 = this.f46508e;
                if (!z3) {
                    this.f46505a = i2;
                    this.f46506b = i3;
                }
                if (i3 == 1) {
                    jArr[i2] = SystemClock.elapsedRealtime();
                    return;
                }
                if (!z3) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long[] jArr2 = this.d;
                    long j = jElapsedRealtime - jArr2[i2];
                    this.f46507c = j;
                    jArr2[i2] = j;
                } else if (this.f46507c == -1 || (z2 && i3 == 2)) {
                    this.f46505a = i2;
                    this.f46506b = i3;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long[] jArr3 = this.d;
                    long j2 = jElapsedRealtime2 - jArr3[i2];
                    this.f46507c = j2;
                    jArr3[i2] = j2;
                }
                this.f46508e = i3 == 2;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public interface b {
        void a(sg.bigo.ads.ad.b.d dVar);
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f46509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f46510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f46511c;

        private c() {
        }

        public static void a(String str) {
            sg.bigo.ads.core.d.b.a(1006, 10205, str);
        }

        public /* synthetic */ c(p pVar, byte b2) {
            this();
        }

        public static void a(sg.bigo.ads.ad.b.d dVar, int i2) {
            sg.bigo.ads.core.d.b.a(dVar == null ? null : (sg.bigo.ads.core.a.a) dVar.f(), false, 0, i2, false, -1L, -1, -1, -1L, -1, -1, -1L);
        }

        public final void a(sg.bigo.ads.ad.b.d dVar, int i2, boolean z2) {
            long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.f46509a) - this.f46511c;
            sg.bigo.ads.core.a.a aVar = dVar == null ? null : (sg.bigo.ads.core.a.a) dVar.f();
            p pVar = p.this;
            a aVar2 = pVar.m;
            int i3 = aVar2.f46505a;
            int i4 = aVar2.f46506b;
            long j = aVar2.f46507c;
            a aVar3 = pVar.f46462n;
            sg.bigo.ads.core.d.b.a(aVar, false, 2, i2, z2, jElapsedRealtime, i3, i4, j, aVar3.f46505a, aVar3.f46506b, aVar3.f46507c);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ArgbEvaluator f46512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        GradientDrawable f46513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Integer f46514c;
        Integer d;

        private d() {
            this.f46512a = new ArgbEvaluator();
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final sg.bigo.ads.common.utils.n f46515a;

        public e(int i2) {
            final long j = ((long) i2) * 1000;
            this.f46515a = new sg.bigo.ads.common.utils.n(j) { // from class: sg.bigo.ads.ad.interstitial.p.e.1
                @Override // sg.bigo.ads.common.utils.n
                public final void a() {
                    sg.bigo.ads.ad.b.b bVar = p.this.f46457c;
                    List<sg.bigo.ads.ad.b.d> listX = bVar.x();
                    sg.bigo.ads.ad.b.d dVar = (listX == null || !listX.contains(bVar.x)) ? null : bVar.x;
                    if (dVar != null) {
                        p pVar = p.this;
                        pVar.a(true, pVar.f46459h, dVar, 1, false, false);
                        return;
                    }
                    sg.bigo.ads.ad.b.b bVar2 = p.this.f46457c;
                    List<sg.bigo.ads.ad.b.d> listX2 = bVar2.x();
                    sg.bigo.ads.ad.b.d dVar2 = (listX2 == null || !listX2.contains(bVar2.y)) ? null : bVar2.y;
                    if (dVar2 != null) {
                        p pVar2 = p.this;
                        pVar2.a(true, pVar2.f46460i, dVar2, 2, false, false);
                    } else {
                        p.this.f46458e.a(null);
                        c.a("Error finish");
                    }
                }

                @Override // sg.bigo.ads.common.utils.n
                public final void a(final long j2) {
                    sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.e.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            TextView textView = p.this.g;
                            if (textView != null) {
                                textView.setText(textView.getContext().getString(R.string.bigo_ad_double_video_count_down, Long.valueOf((j2 + 900) / 1000)));
                            }
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            d dVar = p.this.k;
                            if (dVar == null || dVar.f46513b == null) {
                                return;
                            }
                            float f = (j2 * 1.0f) / j;
                            dVar.f46513b.setColors(new int[]{((Integer) dVar.f46512a.evaluate(f, dVar.f46514c, dVar.d)).intValue(), ((Integer) dVar.f46512a.evaluate(f, dVar.d, dVar.f46514c)).intValue()});
                        }
                    });
                }
            };
        }
    }

    public p(sg.bigo.ads.ad.b.b bVar, i<T> iVar, b bVar2) {
        byte b2 = 0;
        this.f46455a = new c(this, b2);
        this.m = new a(b2);
        this.f46462n = new a(b2);
        this.f46456b = iVar;
        this.f46457c = bVar;
        this.f46458e = bVar2;
        sg.bigo.ads.ad.b.d dVar = bVar.x;
        this.d = dVar == null ? null : ((sg.bigo.ads.core.a.a) dVar.f()).e();
    }

    private void b() {
        this.f46461l = true;
        this.o.clear();
    }

    public final void a() {
        sg.bigo.ads.common.utils.u.b(this.f);
        b();
    }

    public final void a(Context context, final RoundedFrameLayout roundedFrameLayout, final sg.bigo.ads.ad.b.d dVar, String str, final a aVar) {
        p<T> pVar;
        sg.bigo.ads.core.a.a aVar2;
        final String str2;
        int i2;
        final int i3;
        final Context context2 = context;
        final sg.bigo.ads.core.a.a aVar3 = (sg.bigo.ads.core.a.a) dVar.f();
        sg.bigo.ads.api.core.o.a aVarAv = aVar3.av();
        String strC = aVarAv == null ? null : aVarAv.c();
        FrameLayout frameLayout = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = sg.bigo.ads.common.utils.e.a(context2, 32);
        roundedFrameLayout.addView(frameLayout, layoutParams);
        final ImageView imageView = new ImageView(context2);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        final AdImageView adImageView = new AdImageView(context2);
        frameLayout.addView(adImageView, new FrameLayout.LayoutParams(-1, -1));
        adImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        adImageView.setBackgroundColor(sg.bigo.ads.common.utils.q.b("#FFE1E1E6", -7829368));
        adImageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(context2, R.drawable.bigo_ad_icon_default_only_icon));
        if (TextUtils.isEmpty(str) || !URLUtil.isNetworkUrl(str)) {
            pVar = this;
            final boolean[] zArr = {false};
            String strAT = aVar3.aT();
            final String strAz = aVar3.az();
            sg.bigo.ads.common.p.g gVar = new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.p.7
                @Override // sg.bigo.ads.common.p.g
                public final void a(int i4, String str3, String str4) {
                    aVar.a(1, 0, true);
                    if (TextUtils.isEmpty(strAz) || !URLUtil.isNetworkUrl(strAz)) {
                        return;
                    }
                    sg.bigo.ads.common.p.g gVar2 = new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.p.7.1
                        @Override // sg.bigo.ads.common.p.g
                        public final void a(int i5, String str5, String str6) {
                            aVar.a(3, 0, true);
                        }

                        @Override // sg.bigo.ads.common.p.g
                        public final void a(Bitmap bitmap, sg.bigo.ads.common.p.f fVar) {
                            aVar.a(3, 2, true);
                            AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                            zArr[0] = true;
                            p.a(p.this, context2, adImageView, imageView, bitmap);
                        }
                    };
                    p.this.o.add(gVar2);
                    aVar.a(3, 1, true);
                    sg.bigo.ads.common.p.e.a(context2, strAz, aVar3.al(), gVar2);
                }

                @Override // sg.bigo.ads.common.p.g
                public final void a(Bitmap bitmap, sg.bigo.ads.common.p.f fVar) {
                    aVar.a(1, 2, true);
                    zArr[0] = true;
                    p.a(p.this, context2, adImageView, imageView, bitmap);
                }
            };
            aVar2 = aVar3;
            aVar.a(1, 1, true);
            if (TextUtils.isEmpty(strAT) || !URLUtil.isNetworkUrl(strAT)) {
                gVar.a(0, "", "");
            } else {
                pVar.o.add(gVar);
                sg.bigo.ads.common.p.e.a(context2, strAT, aVar2.al(), gVar);
            }
            final String strB = (TextUtils.isEmpty(strC) || !URLUtil.isNetworkUrl(strC)) ? sg.bigo.ads.common.o.b(context2, aVar2.aN()) : strC;
            str2 = strC;
            sg.bigo.ads.common.p.g gVar2 = new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.p.8
                @Override // sg.bigo.ads.common.p.g
                public final void a(int i4, String str3, String str4) {
                    aVar.a(TextUtils.equals(strB, str2) ? 2 : 4, 0, false);
                }

                @Override // sg.bigo.ads.common.p.g
                public final void a(Bitmap bitmap, sg.bigo.ads.common.p.f fVar) {
                    aVar.a(TextUtils.equals(strB, str2) ? 2 : 4, 2, false);
                    if (zArr[0]) {
                        return;
                    }
                    p.a(p.this, context2, adImageView, imageView, bitmap);
                }
            };
            context2 = context2;
            if (!TextUtils.isEmpty(strB) && URLUtil.isNetworkUrl(strB)) {
                aVar.a(TextUtils.equals(strB, str2) ? 2 : 4, 1, false);
                pVar.o.add(gVar2);
                sg.bigo.ads.common.p.e.a(context2, strB, aVar2.al(), gVar2);
            }
        } else {
            if (TextUtils.equals(str, aVar3.aT())) {
                i3 = 1;
            } else {
                i3 = TextUtils.equals(str, aVar3.az()) ? 3 : 0;
            }
            aVar.a(i3, 1, true);
            pVar = this;
            sg.bigo.ads.common.p.g gVar3 = new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.p.6
                @Override // sg.bigo.ads.common.p.g
                public final void a(int i4, String str3, String str4) {
                    aVar.a(i3, 0, true);
                }

                @Override // sg.bigo.ads.common.p.g
                public final void a(Bitmap bitmap, sg.bigo.ads.common.p.f fVar) {
                    p.a(p.this, context2, adImageView, imageView, bitmap);
                    aVar.a(i3, 2, true);
                }
            };
            pVar.o.add(gVar3);
            sg.bigo.ads.common.p.e.a(context2, str, aVar3.al(), gVar3);
            aVar2 = aVar3;
            str2 = strC;
        }
        RoundedFrameLayout roundedFrameLayout2 = new RoundedFrameLayout(context2);
        roundedFrameLayout2.setCornerRadius(sg.bigo.ads.common.utils.e.a(context2, 6));
        roundedFrameLayout.addView(roundedFrameLayout2, new FrameLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(context2, 44), 80));
        View view = new View(context2);
        view.setBackgroundColor(-1);
        roundedFrameLayout2.addView(view, new FrameLayout.LayoutParams(-1, -1));
        final ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2) && URLUtil.isNetworkUrl(str2)) {
            arrayList.add(str2);
        }
        String strAT2 = aVar2.aT();
        if (!TextUtils.isEmpty(strAT2) && URLUtil.isNetworkUrl(strAT2)) {
            arrayList.add(strAT2);
        }
        String strAz2 = aVar2.az();
        if (!TextUtils.isEmpty(strAz2) && URLUtil.isNetworkUrl(strAz2)) {
            arrayList.add(strAz2);
        }
        String strB2 = sg.bigo.ads.common.o.b(context2, aVar2.aN());
        if (!TextUtils.isEmpty(strB2)) {
            arrayList.add(strB2);
        }
        if (arrayList.size() > 0) {
            String str3 = (String) arrayList.remove(0);
            final RoundedFrameLayout roundedFrameLayout3 = new RoundedFrameLayout(context2);
            roundedFrameLayout3.setCornerRadius(sg.bigo.ads.common.utils.e.a(context2, 4));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(context2, 44), sg.bigo.ads.common.utils.e.a(context2, 44), 83);
            layoutParams2.leftMargin = sg.bigo.ads.common.utils.e.a(context2, 12);
            layoutParams2.bottomMargin = sg.bigo.ads.common.utils.e.a(context2, 10);
            roundedFrameLayout.addView(roundedFrameLayout3, layoutParams2);
            final AdImageView adImageView2 = new AdImageView(context2);
            adImageView2.setIconTag(true);
            roundedFrameLayout3.addView(adImageView2, new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(context2, 44), sg.bigo.ads.common.utils.e.a(context2, 44), 17));
            i2 = 10;
            final Context context3 = context2;
            final sg.bigo.ads.core.a.a aVar4 = aVar2;
            sg.bigo.ads.common.p.g gVar4 = new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.p.9
                @Override // sg.bigo.ads.common.p.g
                public final void a(int i4, String str4, String str5) {
                    if (p.this.f46461l) {
                        return;
                    }
                    sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.9.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                            if (p.this.f46461l || arrayList.size() <= 0) {
                                return;
                            }
                            String str6 = (String) arrayList.remove(0);
                            AnonymousClass9 anonymousClass10 = AnonymousClass9.this;
                            adImageView2.a(str6, aVar4.al());
                        }
                    });
                }

                @Override // sg.bigo.ads.common.p.g
                public final void a(Bitmap bitmap, sg.bigo.ads.common.p.f fVar) {
                    if (p.this.f46461l) {
                        return;
                    }
                    roundedFrameLayout3.setShadowColor(sg.bigo.ads.common.utils.q.b("#50000000", -1));
                    roundedFrameLayout3.setShadowRadius(sg.bigo.ads.common.utils.e.a(context3, 4));
                }
            };
            context2 = context3;
            pVar.o.add(gVar4);
            adImageView2.a(gVar4);
            adImageView2.a(str3, aVar2.al());
        } else {
            i2 = 10;
        }
        TextView textView = new TextView(context2);
        textView.setTextColor(sg.bigo.ads.common.utils.q.b("#333333", -16777216));
        textView.setTextSize(16.0f);
        textView.setSingleLine(true);
        textView.setGravity(16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, sg.bigo.ads.common.utils.e.a(context2, 44), 83);
        layoutParams3.leftMargin = sg.bigo.ads.common.utils.e.a(context2, 65);
        layoutParams3.rightMargin = sg.bigo.ads.common.utils.e.a(context2, 52);
        roundedFrameLayout.addView(textView, layoutParams3);
        String title = dVar.getTitle();
        if (TextUtils.isEmpty(title)) {
            title = dVar.getDescription();
        }
        textView.setText(title);
        RoundedFrameLayout roundedFrameLayout4 = new RoundedFrameLayout(context2);
        roundedFrameLayout4.setCornerRadius(sg.bigo.ads.common.utils.e.a(context2, 14));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(context2, 28), sg.bigo.ads.common.utils.e.a(context2, 28), 85);
        layoutParams4.rightMargin = sg.bigo.ads.common.utils.e.a(context2, 12);
        layoutParams4.bottomMargin = sg.bigo.ads.common.utils.e.a(context2, 8);
        roundedFrameLayout.addView(roundedFrameLayout4, layoutParams4);
        View view2 = new View(context2);
        roundedFrameLayout4.addView(view2, new FrameLayout.LayoutParams(-1, -1));
        Integer numF = dVar.F();
        if (numF == null) {
            numF = Integer.valueOf(sg.bigo.ads.common.utils.q.b("#01B5FF", -16776961));
        }
        view2.setBackgroundColor(numF.intValue());
        ImageView imageView2 = new ImageView(context2);
        roundedFrameLayout4.addView(imageView2, new FrameLayout.LayoutParams(-1, -1));
        imageView2.setImageDrawable(sg.bigo.ads.common.utils.a.a(context2, R.drawable.bigo_ad_double_video_small_play));
        FrameLayout frameLayout2 = pVar.f;
        sg.bigo.ads.api.a.m mVar = pVar.d;
        if (frameLayout2 != null) {
            sg.bigo.ads.ad.b.a.a(frameLayout2, roundedFrameLayout, 8, new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.p.10
                @Override // sg.bigo.ads.core.adview.h
                public final void a(int i4, int i5, int i6, int i7, int i8, int i9) {
                    int i10;
                    sg.bigo.ads.ad.b.d dVar2 = dVar;
                    p pVar2 = p.this;
                    sg.bigo.ads.ad.b.b bVar = pVar2.f46457c;
                    if (dVar2 == bVar.x) {
                        i10 = 1;
                    } else {
                        i10 = dVar2 == bVar.y ? 2 : 0;
                    }
                    pVar2.a(true, roundedFrameLayout, dVar2, i10, true, false);
                }
            }, mVar == null ? 0 : mVar.a("multi_ads.click_type"));
        }
        ImageView imageView3 = new ImageView(context2);
        frameLayout.addView(imageView3, new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(context2, 60), sg.bigo.ads.common.utils.e.a(context2, 60), r3));
        imageView3.setImageDrawable(sg.bigo.ads.common.utils.a.a(context2, R.drawable.bigo_ad_double_video_play));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        frameLayout.addView(frameLayout3, new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(context2, 160), sg.bigo.ads.common.utils.e.a(context2, 160), 17));
        final ImageView imageView4 = new ImageView(context2);
        frameLayout3.addView(imageView4, new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(context2, 100), sg.bigo.ads.common.utils.e.a(context2, 100), 85));
        imageView4.setImageDrawable(sg.bigo.ads.common.utils.a.a(context2, R.drawable.bigo_ad_click_guide));
        final ImageView imageView5 = new ImageView(context2);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(context2, i2), sg.bigo.ads.common.utils.e.a(context2, i2), 85);
        layoutParams5.rightMargin = sg.bigo.ads.common.utils.e.a(context2, 64);
        layoutParams5.bottomMargin = sg.bigo.ads.common.utils.e.a(context2, 64);
        frameLayout3.addView(imageView5, layoutParams5);
        imageView5.setImageDrawable(sg.bigo.ads.common.utils.a.a(context2, R.drawable.bigo_ad_click_ripple));
        int iA = mVar.a("multi_ads.guided_click_gesture_show_time");
        int i4 = (iA == 2 || iA == 3) ? ((iA * 2) - 1) * 1000 : 0;
        imageView4.setVisibility(8);
        imageView5.setVisibility(8);
        frameLayout3.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.11
            @Override // java.lang.Runnable
            public final void run() {
                if (p.this.f46461l) {
                    return;
                }
                imageView4.setVisibility(0);
                imageView5.setVisibility(0);
                sg.bigo.ads.ad.interstitial.c.a(imageView4, 0.0f, 1.0f, new sg.bigo.ads.common.utils.b.c() { // from class: sg.bigo.ads.ad.interstitial.p.11.1
                    @Override // sg.bigo.ads.common.utils.b.c, android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        AnonymousClass11 anonymousClass11 = AnonymousClass11.this;
                        sg.bigo.ads.ad.interstitial.c.a(imageView4, imageView5, 0);
                    }
                });
            }
        }, i4);
    }

    private void a(View view, final sg.bigo.ads.ad.b.d dVar) {
        if (view == null) {
            a(dVar, true);
            return;
        }
        sg.bigo.ads.ad.interstitial.c.d(view, new sg.bigo.ads.common.utils.b.c() { // from class: sg.bigo.ads.ad.interstitial.p.3
            @Override // sg.bigo.ads.common.utils.b.c, android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                p.this.a(dVar, false);
                FrameLayout frameLayout = p.this.f;
                if (frameLayout != null) {
                    sg.bigo.ads.ad.interstitial.c.a(frameLayout, 1.0f, 0.0f, new sg.bigo.ads.common.utils.b.c() { // from class: sg.bigo.ads.ad.interstitial.p.3.1
                        @Override // sg.bigo.ads.common.utils.b.c, android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation2) {
                            p.this.a();
                        }
                    });
                }
            }
        });
        RoundedFrameLayout roundedFrameLayout = this.f46459h;
        if (view == roundedFrameLayout) {
            roundedFrameLayout = this.f46460i;
        }
        if (roundedFrameLayout != null) {
            sg.bigo.ads.ad.interstitial.c.a(roundedFrameLayout, 1.0f, 0.0f, null);
        }
    }

    public final void a(sg.bigo.ads.ad.b.d dVar, boolean z2) {
        if (z2) {
            a();
        }
        this.f46458e.a(dVar);
    }

    public static /* synthetic */ void a(p pVar, Context context, final AdImageView adImageView, final ImageView imageView, final Bitmap bitmap) {
        sg.bigo.ads.common.utils.d.a(context, bitmap, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.p.2
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap2) {
                Bitmap bitmap3 = bitmap2;
                if (bitmap3 != null) {
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    imageView.setImageBitmap(bitmap3);
                }
                adImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                adImageView.setBackground(null);
                adImageView.setImageBitmap(bitmap);
            }
        });
    }

    public final void a(boolean z2, View view, sg.bigo.ads.ad.b.d dVar, int i2, boolean z3, boolean z4) {
        if (this.r) {
            return;
        }
        this.r = true;
        if (z4) {
            c.a(dVar, i2);
        } else {
            this.f46455a.a(dVar, i2, z3);
        }
        if (z2) {
            a(view, dVar);
        } else {
            a(dVar, true);
        }
    }
}
