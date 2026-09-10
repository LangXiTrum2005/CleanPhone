package sg.bigo.ads.ad.interstitial.d;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes7.dex */
public class b extends sg.bigo.ads.ad.interstitial.d.a implements sg.bigo.ads.ad.interstitial.f.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected ViewGroup f46009A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected Button f46010B;
    protected RoundedFrameLayout C;
    protected MediaView D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected TextView f46011E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected TextView f46012F;
    protected Button G;
    protected Button H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    protected RoundedImageView f46013I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected int f46014J;
    protected int K;
    protected boolean L;
    private int M;
    protected RelativeLayout x;
    protected RealtimeBlurLinearLayout y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected ViewGroup f46015z;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.d.b$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46025a;

        static {
            int[] iArr = new int[sg.bigo.ads.ad.interstitial.b.values().length];
            f46025a = iArr;
            try {
                iArr[sg.bigo.ads.ad.interstitial.b.f45825a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46025a[sg.bigo.ads.ad.interstitial.b.f45827c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46025a[sg.bigo.ads.ad.interstitial.b.f45826b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46025a[sg.bigo.ads.ad.interstitial.b.f45828e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46025a[sg.bigo.ads.ad.interstitial.b.d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public class a extends sg.bigo.ads.common.utils.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RectF f46027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private RectF f46028c;
        private RectF d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f46029e = Float.NaN;
        private RectF f;

        public a() {
        }

        @Override // sg.bigo.ads.common.utils.b.a
        public final void a(TransitionValues transitionValues, TransitionValues transitionValues2) {
            if (transitionValues.view == b.this.y) {
                Rect rect = (Rect) transitionValues.values.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) transitionValues2.values.get("android:changeBounds:bounds");
                b bVar = b.this;
                Rect rect3 = new Rect(sg.bigo.ads.common.utils.u.a(bVar.f46010B, bVar.f46014J));
                this.f46027b = new RectF(rect3);
                if (rect3.intersect(rect2)) {
                    this.f46028c = new RectF(rect);
                    this.d = new RectF(rect2);
                    this.f46029e = b.this.f46010B.getTranslationY();
                    this.f = new RectF(rect2);
                }
            }
        }

        @Override // sg.bigo.ads.common.utils.b.a
        public final void a(Object obj, Object obj2) {
            if (obj != b.this.y || this.f46028c == null || this.d == null || this.f == null || this.f46027b == null || !(obj2 instanceof PointF) || Float.isNaN(this.f46029e)) {
                return;
            }
            PointF pointF = (PointF) obj2;
            if (this.f46028c.centerX() != this.d.centerX()) {
                b.this.f46010B.setTranslationY(this.f46029e - (Math.abs(this.f.top - this.f46027b.bottom) * (Math.abs(pointF.x - this.f46028c.left) / Math.abs(this.d.left - this.f46028c.left))));
            } else {
                this.f.offsetTo(pointF.x, pointF.y);
                if (new RectF(this.f46027b).intersect(this.f)) {
                    b.this.f46010B.setTranslationY((this.f46029e + this.f.top) - this.f46027b.bottom);
                }
            }
        }
    }

    public b(sg.bigo.ads.ad.b.c cVar) {
        super(cVar);
        this.K = -1;
        this.L = false;
    }

    private boolean L() {
        return ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.u) this).f46656c.f()).aR();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public sg.bigo.ads.common.p b(int i2, int i3, int i4, int i5) {
        sg.bigo.ads.common.p pVar;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.C.getLayoutParams();
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.ad.interstitial.s.a(((sg.bigo.ads.ad.interstitial.u) this).f46656c);
        if (pVarA.a(i2, i3)) {
            this.C.setCornerRadius(0.0f);
            marginLayoutParams.setMargins(0, 0, 0, 0);
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            pVar = new sg.bigo.ads.common.p(i2, i3);
        } else {
            RoundedFrameLayout roundedFrameLayout = this.C;
            roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.e.a(roundedFrameLayout.getContext(), 8));
            marginLayoutParams.setMargins(i4, i5, i4, i5);
            sg.bigo.ads.common.p pVarA2 = sg.bigo.ads.common.p.a(pVarA.f47362b, pVarA.f47363c, i2 - (i4 * 2), i3 - (i5 * 2));
            int i6 = pVarA2.f47362b;
            marginLayoutParams.width = i6;
            int i7 = pVarA2.f47363c;
            marginLayoutParams.height = i7;
            pVar = new sg.bigo.ads.common.p(i6, i7);
        }
        sg.bigo.ads.common.utils.u.c(this.D, -1, -1);
        this.C.setLayoutParams(marginLayoutParams);
        return pVar;
    }

    public void A() {
        if (v()) {
            Button button = this.G;
            if (button != null) {
                sg.bigo.ads.ad.interstitial.c.e(button);
            }
            Button button2 = this.H;
            if (button2 != null) {
                sg.bigo.ads.ad.interstitial.c.e(button2);
            }
        }
    }

    public final void B() {
        Button button;
        if (this.q == null || (button = this.f46010B) == null || button.getVisibility() != 0) {
            return;
        }
        float translationY = this.f46010B.getTranslationY();
        RectF rectF = new RectF(sg.bigo.ads.common.utils.u.a(this.f46010B, this.f46014J));
        rectF.offset(0.0f, -translationY);
        float f = rectF.top;
        RectF rectF2 = new RectF(sg.bigo.ads.common.utils.u.a(this.v, 0));
        float f2 = rectF2.top;
        if (rectF2.intersect(rectF)) {
            rectF.offset(0.0f, f2 - rectF.bottom);
        }
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.y;
        if (realtimeBlurLinearLayout != null && realtimeBlurLinearLayout.getVisibility() == 0) {
            RectF rectF3 = new RectF(sg.bigo.ads.common.utils.u.a(this.y, 0));
            float f3 = rectF3.top;
            if (rectF3.intersect(rectF)) {
                rectF.offset(0.0f, f3 - rectF.bottom);
            }
        }
        float f4 = rectF.top;
        if (f4 != f) {
            this.f46010B.setTranslationY(f4 - f);
        } else {
            this.f46010B.setTranslationY(0.0f);
        }
    }

    public final void C() {
        sg.bigo.ads.common.utils.u.a(this.C, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.d.b.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                b.this.B();
            }
        });
    }

    public void D() {
        if (this.y == null) {
            return;
        }
        final int iY = y();
        Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.b.4
            @Override // java.lang.Runnable
            public final void run() {
                b.this.y.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.b.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        b.this.a(iY > 0);
                    }
                });
            }
        };
        if (iY == 0) {
            runnable.run();
        } else {
            a(iY, runnable);
        }
    }

    public void E() {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.y;
        if (realtimeBlurLinearLayout == null || this.q == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -(this.q.getMeasuredHeight() - sg.bigo.ads.common.utils.u.a(this.q, this.y).y);
            this.y.requestLayout();
        }
    }

    public void F() {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.y;
        if (realtimeBlurLinearLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.M;
            this.y.requestLayout();
        }
    }

    public void G() {
        sg.bigo.ads.ad.interstitial.x xVar = this.s;
        int i2 = xVar != null ? xVar.f46717i : 0;
        View viewFindViewById = this.q.findViewById(R.id.inter_media_container);
        sg.bigo.ads.ad.b.a.a(viewFindViewById, 9);
        sg.bigo.ads.ad.interstitial.x xVar2 = this.s;
        if (xVar2 == null || !xVar2.g) {
            MediaView mediaView = this.D;
            if (mediaView != null) {
                mediaView.setOtherClickAreaClick(false);
            }
            if (viewFindViewById != null) {
                sg.bigo.ads.ad.b.a.a(this.q, viewFindViewById, 8, sg.bigo.ads.ad.interstitial.r.f46631F, 0);
            }
        } else {
            MediaView mediaView2 = this.D;
            if (mediaView2 != null) {
                mediaView2.setOtherClickAreaClick(true);
            }
            if (viewFindViewById != null) {
                sg.bigo.ads.ad.b.a.a(this.q, viewFindViewById, 8, ((sg.bigo.ads.ad.interstitial.u) this).f46656c, i2);
            }
        }
        sg.bigo.ads.ad.interstitial.x xVar3 = this.s;
        boolean z2 = xVar3 != null && xVar3.f;
        MediaView mediaView3 = this.D;
        if (mediaView3 != null) {
            sg.bigo.ads.ad.b.a.a(this.q, mediaView3, 8, ((sg.bigo.ads.ad.interstitial.u) this).f46656c, i2);
            this.D.setMediaAreaClickable(z2);
            this.D.b().a(!z2);
        }
        sg.bigo.ads.ad.interstitial.x xVar4 = this.s;
        boolean z3 = xVar4 != null && xVar4.f46716h;
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.y;
        if (realtimeBlurLinearLayout != null) {
            sg.bigo.ads.ad.b.a.a(realtimeBlurLinearLayout, 18);
            ViewGroup viewGroup = this.q;
            if (z3) {
                sg.bigo.ads.ad.b.a.a(viewGroup, this.y, 8, ((sg.bigo.ads.ad.interstitial.u) this).f46656c, this.s.f46717i);
            } else {
                sg.bigo.ads.ad.b.a.a(viewGroup, this.y, 8, sg.bigo.ads.ad.interstitial.r.f46631F, 0);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.c
    public final int H() {
        if (this.K == -1) {
            sg.bigo.ads.api.a.m mVar = this.t;
            this.K = mVar != null ? mVar.a("video_play_page.webview_layout") : 0;
        }
        int i2 = this.K;
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return i2;
            default:
                return 0;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.c
    public final int I() {
        return sg.bigo.ads.ad.interstitial.d.a.b(this.t, "video_play_page.webview_force_time");
    }

    @Override // sg.bigo.ads.ad.interstitial.f.c
    public final boolean J() {
        int iH = H();
        return iH == 5 || iH == 6;
    }

    @Override // sg.bigo.ads.ad.interstitial.f.c
    public final boolean K() {
        return this.L;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final ViewGroup k() {
        return this.C;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final MediaView l() {
        return this.D;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final Button m() {
        return this.f46010B;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final boolean n() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void q() {
        String strI = ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.u) this).f46656c.f()).i();
        TextView textView = (TextView) this.q.findViewById(R.id.inter_advertiser);
        if (TextUtils.isEmpty(strI)) {
            textView.setVisibility(8);
        } else {
            textView.setText(strI);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d5  */
    @Override // sg.bigo.ads.ad.interstitial.d.a
    public void t() {
        sg.bigo.ads.ad.interstitial.b bVar;
        Integer numA;
        Integer numA2;
        super.t();
        this.x = (RelativeLayout) this.q.findViewById(R.id.inter_media_component);
        this.f46009A = (ViewGroup) this.q.findViewById(R.id.inter_warning_layout);
        this.f46010B = (Button) this.q.findViewById(R.id.inter_btn_mute);
        this.C = (RoundedFrameLayout) this.q.findViewById(R.id.inter_media_layout);
        this.D = (MediaView) this.q.findViewById(R.id.inter_media);
        this.f46014J = sg.bigo.ads.common.utils.e.a(this.f46010B.getContext(), 12);
        this.D.setImageBlurBorder(false);
        sg.bigo.ads.common.utils.u.a(this.C, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.d.b.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int iA = sg.bigo.ads.common.utils.e.a(b.this.C.getContext(), 12);
                b bVar2 = b.this;
                bVar2.b(bVar2.C.getMeasuredWidth(), b.this.C.getMeasuredHeight(), iA, iA);
                b.this.C();
            }
        });
        sg.bigo.ads.api.a.m mVar = this.t;
        int iA = mVar != null ? mVar.a("video_play_page.ad_component_colour", 2) : 2;
        if (iA == 1) {
            bVar = sg.bigo.ads.ad.interstitial.b.f45825a;
        } else if (iA != 3) {
            bVar = L() ? sg.bigo.ads.ad.interstitial.b.f45826b : sg.bigo.ads.ad.interstitial.b.d;
        } else {
            bVar = L() ? sg.bigo.ads.ad.interstitial.b.f45827c : sg.bigo.ads.ad.interstitial.b.f45828e;
        }
        a(bVar);
        b(bVar);
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.y;
        if (realtimeBlurLinearLayout != null) {
            int iA2 = sg.bigo.ads.common.utils.e.a(realtimeBlurLinearLayout.getContext(), 12);
            if (L()) {
                if (this.y != null) {
                    int i2 = AnonymousClass6.f46025a[bVar.ordinal()];
                    if (i2 != 1) {
                        a(sg.bigo.ads.common.w.b.a((i2 == 2 && (numA2 = sg.bigo.ads.ad.interstitial.s.a((NativeAd) ((sg.bigo.ads.ad.interstitial.u) this).f46656c)) != null) ? numA2.intValue() : -12303292, 0.5f), sg.bigo.ads.common.w.b.a(-1, 0.1f), iA2);
                    } else {
                        a(-1, -1, iA2);
                    }
                }
            } else if (this.y != null) {
                int i3 = AnonymousClass6.f46025a[bVar.ordinal()];
                if (i3 == 1) {
                    a(-1, -1, iA2);
                } else if (i3 == 4 && (numA = sg.bigo.ads.ad.interstitial.s.a((NativeAd) ((sg.bigo.ads.ad.interstitial.u) this).f46656c)) != null) {
                    b(sg.bigo.ads.common.w.b.a(numA.intValue(), 0.35f), sg.bigo.ads.common.w.b.a(numA.intValue(), 0.1f), iA2);
                } else {
                    b(sg.bigo.ads.common.w.b.a(-3355444, 0.35f), sg.bigo.ads.common.w.b.a(-1, 0.1f), iA2);
                }
            }
            bVar.b(this.y);
            bVar.a(this.f46011E, this.f46012F);
        }
    }

    public int z() {
        return R.id.inter_component_19;
    }

    private void b(int i2, int i3, int i4) {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.y;
        if (realtimeBlurLinearLayout != null) {
            float f = i4;
            this.y.setBlurStyle(new sg.bigo.ads.common.view.a.b(f, f, f, f, i2, i3, sg.bigo.ads.common.utils.e.a(realtimeBlurLinearLayout.getContext(), 1)));
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void a(double d) {
        TextView textView;
        int i2;
        if (d <= 3.0d) {
            textView = this.v;
            if (textView == null) {
                return;
            } else {
                i2 = sg.bigo.ads.ad.interstitial.d.f45977b;
            }
        } else {
            textView = this.v;
            if (textView == null) {
                return;
            } else {
                i2 = sg.bigo.ads.ad.interstitial.d.f45976a;
            }
        }
        textView.setTextColor(sg.bigo.ads.common.w.b.a(i2, 0.6f));
    }

    private void a(int i2, int i3, int i4) {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.y;
        if (realtimeBlurLinearLayout != null) {
            float f = i4;
            this.y.setBackground(sg.bigo.ads.common.utils.d.a(f, f, f, f, i2, i3, sg.bigo.ads.common.utils.e.a(realtimeBlurLinearLayout.getContext(), 1)));
        }
    }

    public void b(sg.bigo.ads.ad.interstitial.b bVar) {
        float fA = sg.bigo.ads.common.utils.e.a(this.y.getContext(), 8);
        Button button = (Button) this.y.findViewById(R.id.inter_btn_cta_main);
        this.H = button;
        if (button != null) {
            button.setBackground(sg.bigo.ads.common.utils.d.a(fA, fA, fA, fA, (Rect) null, -16724924));
            bVar.a(this.H);
        }
        Button button2 = (Button) this.y.findViewById(R.id.inter_btn_cta);
        this.G = button2;
        if (button2 != null) {
            button2.setBackground(sg.bigo.ads.common.utils.d.a(fA, fA, fA, fA, (Rect) null, 0));
            bVar.a(this.G);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.c
    public final void a(int i2, int i3, int i4, int i5) {
        if (J()) {
            if (i2 >= i4) {
                this.L = true;
                return;
            }
            this.L = false;
            if (this.x != null) {
                int iMin = (i4 - Math.min(i2, i3)) + i5;
                ViewGroup.LayoutParams layoutParams = this.x.getLayoutParams();
                if (iMin != layoutParams.height) {
                    layoutParams.height = iMin;
                    this.x.requestLayout();
                    b(this.x.getMeasuredWidth(), layoutParams.height, sg.bigo.ads.common.utils.e.a(this.C.getContext(), 12), sg.bigo.ads.common.utils.e.a(this.C.getContext(), 12));
                    B();
                }
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final void a(ViewGroup viewGroup, View view, int i2, int i3, int i4, View... viewArr) {
        super.a(viewGroup, view, i2, i3, i4, viewArr);
        G();
        sg.bigo.ads.ad.interstitial.u.a((View) this.q);
    }

    public final void a(boolean z2) {
        if (this.y == null || this.f45986w) {
            return;
        }
        final sg.bigo.ads.ad.interstitial.d.a.C0812a c0812aU = u();
        Button button = this.G;
        if (button != null) {
            sg.bigo.ads.ad.interstitial.d.b(button, c0812aU.f46007a);
        }
        if (z2) {
            E();
            this.y.setVisibility(0);
            this.y.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.b.5
                @Override // java.lang.Runnable
                public final void run() {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(b.this.new a());
                    transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.common.h() { // from class: sg.bigo.ads.ad.interstitial.d.b.5.1
                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                        public final void onTransitionEnd(Transition transition) {
                            b.this.A();
                            AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                            if (c0812aU.f46008b) {
                                b bVar = b.this;
                                bVar.a(bVar.G, new sg.bigo.ads.common.w.b.a());
                            }
                        }

                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                        public final void onTransitionStart(Transition transition) {
                        }
                    });
                    transitionSet.setDuration(300L);
                    TransitionManager.beginDelayedTransition(b.this.r, transitionSet);
                    b.this.F();
                }
            });
        } else {
            this.y.setVisibility(0);
            B();
            A();
            if (c0812aU.f46008b) {
                a(this.G, new sg.bigo.ads.common.w.b.a());
            }
        }
    }

    public boolean a(sg.bigo.ads.ad.interstitial.b bVar) {
        if (y() < 0) {
            return false;
        }
        ViewStub viewStub = (ViewStub) this.q.findViewById(z());
        if (viewStub != null) {
            this.f46015z = (ViewGroup) viewStub.inflate();
        }
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = (RealtimeBlurLinearLayout) this.q.findViewById(R.id.inter_component_layout);
        this.y = realtimeBlurLinearLayout;
        if (realtimeBlurLinearLayout == null) {
            return false;
        }
        this.f46013I = (RoundedImageView) realtimeBlurLinearLayout.findViewById(R.id.inter_icon);
        this.f46011E = (TextView) this.y.findViewById(R.id.inter_title);
        TextView textView = (TextView) this.y.findViewById(R.id.inter_description);
        this.f46012F = textView;
        bVar.a(this.f46011E, textView);
        bVar.a(this.f46013I);
        sg.bigo.ads.common.utils.u.a(this.y, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.d.b.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                b.this.D();
            }
        });
        ViewGroup.LayoutParams layoutParams = this.y.getLayoutParams();
        layoutParams.width = -1;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.M = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        this.y.setVisibility(4);
        this.y.requestLayout();
        return true;
    }
}
