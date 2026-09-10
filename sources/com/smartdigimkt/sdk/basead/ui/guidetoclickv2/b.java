package com.smartdigimkt.sdk.basead.ui.guidetoclickv2;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f38535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f38536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.smartdigimkt.v6.a f38537c;
    RelativeLayout d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    View f38538e;
    private int f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BaseG2CV2View.c f38539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private BaseG2CV2View f38540i;
    private long j;
    private long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f38541l;
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f38542n;
    private com.smartdigimkt.w5.c.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Runnable f38543p;
    private boolean q = false;
    private int r;
    private long s;
    private long t;

    public class a implements Runnable {
        final /* synthetic */ int X;

        public a(int i2) {
            this.X = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f38540i == null) {
                b bVar = b.this;
                bVar.f38540i = bVar.a(bVar.g);
                if (b.this.f38540i != null) {
                    b.this.s = System.currentTimeMillis();
                    b.this.f38540i.init(b.this.f38541l, this.X, b.this.f38542n, b.this.o, b.this.f38539h);
                    b bVar2 = b.this;
                    RelativeLayout relativeLayout = bVar2.d;
                    if (relativeLayout != null) {
                        relativeLayout.addView(bVar2.f38540i);
                    }
                    b bVar3 = b.this;
                    bVar3.c(bVar3.g);
                }
            }
            b.this.f38540i.resumeAnimPlay();
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.sdk.basead.ui.guidetoclickv2.b$b, reason: collision with other inner class name */
    public class RunnableC0609b implements Runnable {
        final /* synthetic */ BaseG2CV2View X;

        public RunnableC0609b(BaseG2CV2View baseG2CV2View) {
            this.X = baseG2CV2View;
        }

        @Override // java.lang.Runnable
        public void run() {
            RelativeLayout relativeLayout = b.this.d;
            if (relativeLayout == null || relativeLayout.getMeasuredHeight() <= h.a(b.this.f38535a, 90.0f)) {
                return;
            }
            ((FingerG2CV2View) this.X).setFingerViewMode(506);
        }
    }

    public class c implements Runnable {
        final /* synthetic */ FullOrientationG2CV2View X;

        public c(FullOrientationG2CV2View fullOrientationG2CV2View) {
            this.X = fullOrientationG2CV2View;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = b.this;
            if (bVar.d != null) {
                int iA = h.a(bVar.f38535a, 120.0f);
                int iMin = Math.min(b.this.d.getMeasuredWidth(), b.this.d.getMeasuredHeight());
                if (iMin < iA) {
                    this.X.updateSize(iMin);
                    b.this.f38538e.setVisibility(0);
                }
            }
        }
    }

    public class d implements Runnable {
        final /* synthetic */ int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ View f38547Y;

        public d(int i2, View view) {
            this.X = i2;
            this.f38547Y = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.X != 11) {
                RelativeLayout relativeLayout = b.this.d;
                if (relativeLayout != null && ((relativeLayout.getMeasuredHeight() < 100 || b.this.d.getMeasuredWidth() < 200) && b.this.f38539h != null)) {
                    b.this.f38539h.a();
                    return;
                }
            } else {
                RelativeLayout relativeLayout2 = b.this.d;
                if (relativeLayout2 != null && ((relativeLayout2.getMeasuredHeight() < h.a(b.this.d.getContext(), com.smartdigimkt.sdk.basead.ui.guidetoclickv2.a.b.f38533a) || b.this.d.getMeasuredWidth() < h.a(b.this.d.getContext(), com.smartdigimkt.sdk.basead.ui.guidetoclickv2.a.b.f38534b)) && b.this.f38539h != null)) {
                    b.this.f38539h.a();
                    return;
                }
            }
            this.f38547Y.setVisibility(0);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f38549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f38550c;
        public long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f38551e;
        private int f;

        public e(int i2, int i3, long j, long j2, String str, int i4) {
            this.f38548a = i2;
            this.f38549b = i3;
            this.f38550c = j;
            this.d = j2;
            this.f38551e = str;
            this.f = i4;
        }
    }

    public b(Context context, f fVar, com.smartdigimkt.v6.a aVar, int i2, e eVar, RelativeLayout relativeLayout, View view, com.smartdigimkt.w5.c.a aVar2, BaseG2CV2View.c cVar) {
        this.k = 0L;
        this.f38541l = 5000L;
        this.m = "";
        this.f38542n = 1;
        this.f38535a = context;
        this.f38536b = fVar;
        this.f38537c = aVar;
        this.d = relativeLayout;
        this.f38538e = view;
        this.f = i2;
        this.o = aVar2;
        this.f38539h = cVar;
        this.g = eVar.f38549b;
        this.f38541l = eVar.f38550c;
        this.k = eVar.d;
        this.m = eVar.f38551e;
        this.f38542n = eVar.f;
        this.r = eVar.f38548a;
        this.f38543p = new a(i2);
    }

    private void d() {
        if (this.s > 0) {
            com.smartdigimkt.v6.a aVar = this.f38537c;
            f fVar = this.f38536b;
            com.smartdigimkt.i7.d.a(aVar, fVar, i.g(fVar, aVar), this.r, this.g, this.s, this.t);
        }
    }

    public void c() {
        if (this.q) {
            return;
        }
        this.q = true;
        this.j = SystemClock.elapsedRealtime();
        com.smartdigimkt.l7.b.a().b(this.f38543p, this.k);
    }

    public void b() {
        this.t = System.currentTimeMillis() - this.s;
        d();
        com.smartdigimkt.l7.b.a().a(this.f38543p);
        BaseG2CV2View baseG2CV2View = this.f38540i;
        if (baseG2CV2View != null) {
            baseG2CV2View.release();
            com.smartdigimkt.j7.c.a(this.f38540i);
        }
        View view = this.f38538e;
        if (view != null) {
            view.setBackgroundColor(Color.parseColor("#80000000"));
            this.f38538e.setVisibility(8);
        }
    }

    public void a() {
        if (this.q) {
            this.q = false;
            long j = this.k;
            if (j > 0) {
                this.k = Math.max(j - (SystemClock.elapsedRealtime() - this.j), 0L);
            }
            com.smartdigimkt.l7.b.a().a(this.f38543p);
            BaseG2CV2View baseG2CV2View = this.f38540i;
            if (baseG2CV2View != null) {
                baseG2CV2View.pauseAnimPlay();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i2) {
        if (i2 != 3 && i2 != 4 && i2 != 6 && i2 != 13) {
            View view = this.f38538e;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.f38538e;
        if (view2 != null) {
            if (i2 == 13) {
                view2.setBackgroundResource(h.a(this.f38535a, "myoffer_mask_half_shadow_bg", k.d));
            }
            this.f38538e.setVisibility(0);
        }
    }

    private RelativeLayout.LayoutParams b(int i2) {
        if (i2 != 13) {
            switch (i2) {
                case 1:
                    return new RelativeLayout.LayoutParams(-1, -1);
                case 2:
                    return new RelativeLayout.LayoutParams(-1, -1);
                case 3:
                    return androidx.media3.extractor.text.ttml.a.f(-2, -2, 13);
                case 4:
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    if (this.f != 2 && this.f38542n == 1) {
                        layoutParams.setMargins(0, 0, 0, h.a(this.d.getContext(), 290.0f));
                        layoutParams.addRule(12);
                        return layoutParams;
                    }
                    layoutParams.addRule(13);
                    return layoutParams;
                case 5:
                    if (this.f == 2) {
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, h.a(this.d.getContext(), 48.0f));
                        layoutParams2.setMargins(h.a(this.d.getContext(), 36.0f), 0, h.a(this.d.getContext(), 36.0f), 0);
                        layoutParams2.addRule(13);
                        return layoutParams2;
                    }
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(h.a(this.d.getContext(), 300.0f), h.a(this.d.getContext(), 48.0f));
                    if (this.f38542n == 2) {
                        layoutParams3.setMargins(0, 0, h.a(this.d.getContext(), 24.0f), h.a(this.d.getContext(), 96.0f));
                        layoutParams3.addRule(11);
                        layoutParams3.addRule(12);
                        return layoutParams3;
                    }
                    layoutParams3.setMargins(0, 0, 0, h.a(this.d.getContext(), 290.0f));
                    layoutParams3.addRule(14);
                    layoutParams3.addRule(12);
                    return layoutParams3;
                case 6:
                    return new RelativeLayout.LayoutParams(-1, -1);
                case 7:
                    return new RelativeLayout.LayoutParams(-1, -1);
                case 8:
                case 9:
                case 10:
                    return new RelativeLayout.LayoutParams(-1, -1);
                default:
                    return new RelativeLayout.LayoutParams(-2, -2);
            }
        }
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        int i3 = this.f;
        if (i3 == 3) {
            layoutParams4.addRule(12);
            return layoutParams4;
        }
        if (i3 == 2) {
            layoutParams4.addRule(12);
            return layoutParams4;
        }
        if (i3 == 1) {
            layoutParams4.addRule(12);
        }
        return layoutParams4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BaseG2CV2View a(int i2) {
        String strR;
        BaseG2CV2View baseG2CV2View;
        BaseG2CV2View baseG2CV2View2;
        FingerSlideUpG2CV2View fingerSlideUpG2CV2View;
        int i3 = 502;
        switch (i2) {
            case 1:
                GestureG2CV2View gestureG2CV2View = new GestureG2CV2View(this.f38535a);
                gestureG2CV2View.setLayoutParams(b(i2));
                gestureG2CV2View.setVerticalLandscape(this.f38538e == null);
                baseG2CV2View2 = gestureG2CV2View;
                break;
            case 2:
                PicVerifyG2CV2View picVerifyG2CV2View = new PicVerifyG2CV2View(this.f38535a);
                picVerifyG2CV2View.loadImage(this.f38536b.s());
                picVerifyG2CV2View.setLayoutParams(b(i2));
                baseG2CV2View2 = picVerifyG2CV2View;
                break;
            case 3:
                QuestionDialogG2CV2View questionDialogG2CV2View = new QuestionDialogG2CV2View(this.f38535a);
                questionDialogG2CV2View.setLayoutParams(b(i2));
                if (!TextUtils.isEmpty(this.f38536b.g0())) {
                    strR = this.f38536b.g0();
                } else if (!TextUtils.isEmpty(this.f38536b.r())) {
                    strR = this.f38536b.r();
                } else {
                    strR = "";
                }
                questionDialogG2CV2View.setQuestionAnswer(strR, this.m);
                baseG2CV2View2 = questionDialogG2CV2View;
                break;
            case 4:
                HintTextG2CV2View hintTextG2CV2View = new HintTextG2CV2View(this.f38535a);
                hintTextG2CV2View.setLayoutParams(b(i2));
                baseG2CV2View2 = hintTextG2CV2View;
                break;
            case 5:
                JumpConfirmG2CV2View jumpConfirmG2CV2View = new JumpConfirmG2CV2View(this.f38535a);
                jumpConfirmG2CV2View.setLayoutParams(b(i2));
                baseG2CV2View2 = jumpConfirmG2CV2View;
                break;
            case 6:
                FingerG2CV2View fingerG2CV2View = new FingerG2CV2View(this.f38535a);
                switch (this.f) {
                    case 1:
                    default:
                        i3 = 501;
                        break;
                    case 2:
                        if (this.f38538e == null) {
                            i3 = 503;
                        }
                        break;
                    case 3:
                        i3 = 507;
                        break;
                    case 4:
                        this.d.post(new RunnableC0609b(fingerG2CV2View));
                        i3 = 505;
                        break;
                    case 5:
                    case 6:
                        i3 = 504;
                        break;
                }
                fingerG2CV2View.setFingerViewMode(i3);
                fingerG2CV2View.setLayoutParams(b(i2));
                baseG2CV2View = fingerG2CV2View;
                baseG2CV2View2 = baseG2CV2View;
                break;
            case 7:
                FullOrientationG2CV2View fullOrientationG2CV2View = new FullOrientationG2CV2View(this.f38535a);
                switch (this.f) {
                    case 1:
                    default:
                        i3 = 501;
                        break;
                    case 2:
                        break;
                    case 3:
                        i3 = 507;
                        break;
                    case 4:
                        a(fullOrientationG2CV2View);
                        i3 = 505;
                        break;
                    case 5:
                    case 6:
                        a(fullOrientationG2CV2View);
                        i3 = 504;
                        break;
                }
                fullOrientationG2CV2View.setViewMode(i3);
                fullOrientationG2CV2View.setLayoutParams(b(i2));
                baseG2CV2View = fullOrientationG2CV2View;
                baseG2CV2View2 = baseG2CV2View;
                break;
            case 8:
                LuckyBagG2CV2View luckyBagG2CV2View = new LuckyBagG2CV2View(this.f38535a);
                luckyBagG2CV2View.setLayoutParams(b(i2));
                baseG2CV2View2 = luckyBagG2CV2View;
                break;
            case 9:
                ChopOnceG2CV2View chopOnceG2CV2View = new ChopOnceG2CV2View(this.f38535a);
                chopOnceG2CV2View.setLayoutParams(b(i2));
                baseG2CV2View2 = chopOnceG2CV2View;
                break;
            case 10:
                PuzzleV2G2CV2View puzzleV2G2CV2View = new PuzzleV2G2CV2View(this.f38535a);
                puzzleV2G2CV2View.setLayoutParams(b(i2));
                baseG2CV2View2 = puzzleV2G2CV2View;
                break;
            case 11:
                GestureNewG2CV2View gestureNewG2CV2View = new GestureNewG2CV2View(this.f38535a);
                gestureNewG2CV2View.setLayoutParams(b(i2));
                baseG2CV2View2 = gestureNewG2CV2View;
                break;
            case 12:
                FingerNewG2CV2View fingerNewG2CV2View = new FingerNewG2CV2View(this.f38535a);
                fingerNewG2CV2View.setLayoutParams(b(i2));
                baseG2CV2View2 = fingerNewG2CV2View;
                break;
            case 13:
                fingerSlideUpG2CV2View = new FingerSlideUpG2CV2View(this.f38535a);
                fingerSlideUpG2CV2View.setLayoutParams(b(i2));
                baseG2CV2View2 = fingerSlideUpG2CV2View;
                if (this.f == 2 && !i.a(this.f38536b)) {
                    baseG2CV2View2 = fingerSlideUpG2CV2View;
                    fingerSlideUpG2CV2View.updateIsEmptyHalfInterLayout();
                    baseG2CV2View2 = fingerSlideUpG2CV2View;
                }
                break;
            default:
                baseG2CV2View2 = null;
                break;
        }
        baseG2CV2View2 = fingerSlideUpG2CV2View;
        a(i2, baseG2CV2View2);
        return baseG2CV2View2;
    }

    private void a(FullOrientationG2CV2View fullOrientationG2CV2View) {
        this.d.post(new c(fullOrientationG2CV2View));
    }

    private void a(int i2, View view) {
        int i3 = this.f;
        if (i3 == 5 || i3 == 6) {
            view.setVisibility(4);
            this.d.post(new d(i2, view));
        }
    }
}
