package sg.bigo.ads.ad.interstitial.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b extends a {
    protected final sg.bigo.ads.ad.interstitial.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected final sg.bigo.ads.ad.interstitial.multi_img.b f45881p;
    protected ViewFlow q;
    protected Indicator r;
    protected LinearLayout s;
    protected sg.bigo.ads.ad.interstitial.multi_img.view.c t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected sg.bigo.ads.ad.interstitial.multi_img.view.c f45882u;
    protected sg.bigo.ads.ad.interstitial.multi_img.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ValueCallback<Double> f45883w;
    private final AtomicBoolean x;
    private final List<Runnable> y;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.c.b$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45895a;

        static {
            int[] iArr = new int[sg.bigo.ads.ad.interstitial.multi_img.d.values().length];
            f45895a = iArr;
            try {
                iArr[sg.bigo.ads.ad.interstitial.multi_img.d.LTR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45895a[sg.bigo.ads.ad.interstitial.multi_img.d.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45895a[sg.bigo.ads.ad.interstitial.multi_img.d.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45895a[sg.bigo.ads.ad.interstitial.multi_img.d.TILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public b(sg.bigo.ads.ad.b.c cVar, int i2, sg.bigo.ads.api.a.m mVar, sg.bigo.ads.ad.interstitial.multi_img.b bVar, sg.bigo.ads.ad.interstitial.e.c cVar2) {
        super(cVar, i2, mVar, cVar2);
        this.f45883w = new ValueCallback<Double>() { // from class: sg.bigo.ads.ad.interstitial.c.b.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Double d) {
                Double d2 = d;
                if (d2 != null) {
                    b.this.b(d2.doubleValue());
                }
            }
        };
        this.x = new AtomicBoolean(false);
        this.y = new ArrayList();
        this.f45881p = bVar;
        this.o = new sg.bigo.ads.ad.interstitial.d();
    }

    public void g(sg.bigo.ads.ad.interstitial.r rVar) {
    }

    public final boolean l() {
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.f45881p;
        return bVar == null || bVar.f46370b == sg.bigo.ads.ad.interstitial.multi_img.d.NONE;
    }

    public final void m() {
        this.x.set(true);
    }

    public final void n() {
        this.x.set(false);
        if (sg.bigo.ads.ad.interstitial.multi_img.f.a(this.q)) {
            sg.bigo.ads.ad.interstitial.multi_img.f.a(this.q, new ValueCallback<Integer>() { // from class: sg.bigo.ads.ad.interstitial.c.b.9
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Integer num) {
                    Iterator it = b.this.y.iterator();
                    while (it.hasNext()) {
                        b.this.q.post((Runnable) it.next());
                    }
                    b.this.y.clear();
                    sg.bigo.ads.ad.interstitial.multi_img.f.a(b.this.q, (ValueCallback<Integer>) null);
                }
            });
            return;
        }
        Iterator<Runnable> it = this.y.iterator();
        while (it.hasNext()) {
            this.q.post(it.next());
        }
        this.y.clear();
    }

    private sg.bigo.ads.ad.interstitial.multi_img.view.a a(final sg.bigo.ads.ad.interstitial.r rVar, sg.bigo.ads.ad.interstitial.multi_img.c cVar, int i2, String str, boolean z2) {
        final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar = new sg.bigo.ads.ad.interstitial.multi_img.view.a(this.j.getContext(), this.f45881p, cVar, e(), i2, str, z2, new ValueCallback<sg.bigo.ads.ad.interstitial.multi_img.view.a>() { // from class: sg.bigo.ads.ad.interstitial.c.b.12
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(sg.bigo.ads.ad.interstitial.multi_img.view.a aVar2) {
                final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar3 = aVar2;
                sg.bigo.ads.ad.interstitial.v.a(rVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.c.b.12.1
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        Bitmap bitmap2 = bitmap;
                        if (bitmap2 != null) {
                            aVar3.a(bitmap2);
                        }
                    }
                });
            }
        });
        ViewFlow.b bVar = new ViewFlow.b();
        bVar.f47653a = -1;
        bVar.f47654b = -1;
        bVar.f47655c = false;
        bVar.d = cVar.d;
        this.q.addView(aVar.j, bVar);
        if (this.v != null) {
            aVar.r = new sg.bigo.ads.ad.interstitial.multi_img.view.d.a() { // from class: sg.bigo.ads.ad.interstitial.c.b.2
                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void a() {
                    b.this.v.a(b.this.q.a(aVar.j));
                }

                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void b() {
                    aVar.r = null;
                    a();
                }
            };
        }
        return aVar;
    }

    public void b(double d) {
        if (d <= 3.0d) {
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar = this.t;
            if (cVar != null) {
                cVar.a(false);
            }
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = this.f45882u;
            if (cVar2 != null) {
                cVar2.a(false);
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar3 = this.t;
        if (cVar3 != null) {
            cVar3.a(true);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar4 = this.f45882u;
        if (cVar4 != null) {
            cVar4.a(true);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void d(sg.bigo.ads.ad.interstitial.r rVar) {
        b bVar = this;
        Context context = bVar.j.getContext();
        sg.bigo.ads.ad.interstitial.multi_img.b bVar2 = bVar.f45881p;
        List<String> listA = bVar2 != null ? bVar2.a() : null;
        sg.bigo.ads.ad.interstitial.multi_img.b bVar3 = bVar.f45881p;
        boolean z2 = bVar3 != null && bVar3.f46372e;
        sg.bigo.ads.ad.interstitial.multi_img.d dVar = bVar3 != null ? bVar3.f46370b : sg.bigo.ads.ad.interstitial.multi_img.d.NONE;
        sg.bigo.ads.ad.interstitial.multi_img.c cVar = bVar3 != null ? bVar3.d : sg.bigo.ads.ad.interstitial.multi_img.c.FILL_MATCH_SELF;
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.ad.interstitial.s.a(bVar.f);
        bVar.q = (ViewFlow) bVar.k.findViewById(R.id.inter_media_ad_view_flow);
        bVar.r = (Indicator) bVar.k.findViewById(R.id.inter_vf_indicator);
        int iK = bVar.k();
        if (iK == 2) {
            bVar.k.setBackgroundColor(bVar.o.a(-16777216));
        } else if (iK == 3 || iK == 4) {
            bVar.k.setBackgroundColor(bVar.o.a(-16777216));
            bVar.v = new sg.bigo.ads.ad.interstitial.multi_img.a(bVar.k, bVar.q, bVar.o, iK);
        } else {
            bVar.k.setBackgroundColor(bVar.o.a(-1));
        }
        bVar.s = (LinearLayout) bVar.k.findViewById(R.id.inter_media_bottom_layout);
        if (sg.bigo.ads.common.utils.q.a((CharSequence) bVar.f.getWarning())) {
            ((ViewGroup.MarginLayoutParams) bVar.s.getLayoutParams()).topMargin = sg.bigo.ads.common.utils.e.a(context, 8);
        }
        g(rVar);
        bVar.o.a(bVar.f45883w);
        if (bVar.f45881p != null) {
            Context context2 = bVar.j.getContext();
            bVar.q.setDividerWidth(sg.bigo.ads.common.utils.e.a(context2, dVar.f));
            bVar.q.setContentMaxWidthSpace(sg.bigo.ads.common.utils.e.a(context2, dVar.f46392i));
            bVar.q.setViewStyle(dVar.j);
            bVar.q.setOnItemChangeListener(new sg.bigo.ads.ad.interstitial.multi_img.f(dVar, bVar.r, bVar.v));
            int i2 = 0;
            int i3 = 0;
            while (listA != null && i3 < listA.size()) {
                String str = listA.get(i3);
                if (!TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str)) {
                    bVar.a(rVar, cVar, iK, str, ((sg.bigo.ads.core.a.a) bVar.f.f()).al());
                    i2++;
                }
                i3++;
                bVar = this;
            }
            int iMax = Math.max(dVar == sg.bigo.ads.ad.interstitial.multi_img.d.CENTER ? 3 - i2 : 0, 0);
            if (z2) {
                iMax = Math.max(iMax, 1);
            }
            int i4 = iMax;
            for (int i5 = 0; i5 < i4; i5++) {
                final sg.bigo.ads.ad.interstitial.multi_img.view.a aVarA = a(rVar, cVar, iK, (String) null, false);
                sg.bigo.ads.ad.interstitial.v.a(rVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.c.b.6
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        aVarA.a(bitmap);
                    }
                });
            }
            bVar = this;
            bVar.q.setMainChildSize(pVarA);
            int i6 = AnonymousClass4.f45895a[dVar.ordinal()];
            if (i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4) {
                ViewFlow.d dVar2 = new ViewFlow.d() { // from class: sg.bigo.ads.ad.interstitial.c.b.11
                    @Override // sg.bigo.ads.common.view.ViewFlow.d
                    public final void a() {
                        b.this.f.a(4, 29);
                    }
                };
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context2, true);
                bVar.t = cVar2;
                bVar.q.setStartView(cVar2.f46418a);
                bVar.q.setOnStartViewShowListener(dVar2);
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar3 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context2, false);
                bVar.f45882u = cVar3;
                bVar.q.setEndView(cVar3.f46418a);
                bVar.q.setOnEndViewShowListener(dVar2);
            }
            int itemCount = dVar == sg.bigo.ads.ad.interstitial.multi_img.d.CENTER ? bVar.q.getItemCount() >> 1 : 0;
            bVar.q.b(itemCount);
            sg.bigo.ads.ad.interstitial.multi_img.a aVar = bVar.v;
            if (aVar != null) {
                aVar.b(itemCount);
            }
        }
        if (bVar.l()) {
            return;
        }
        sg.bigo.ads.ad.interstitial.multi_img.b bVar4 = bVar.f45881p;
        int iA = bVar4 != null ? bVar4.f46369a.a("endpage.multi_guide") : 0;
        switch (iA) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                bVar.a(iA, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.b.10
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.q.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.b.10.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                b bVar5 = b.this;
                                if (bVar5.q.g) {
                                    return;
                                }
                                b.a(bVar5, 3L, 0L, 300L);
                            }
                        });
                    }
                });
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                bVar.q.setFlipInterval((iA - 5) * 1000);
                bVar.q.c();
                break;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void a(double d) {
    }

    @Override // sg.bigo.ads.ad.interstitial.v
    public final boolean d() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    @Override // sg.bigo.ads.ad.interstitial.c.a
    public void a(int i2, boolean z2, boolean z3) {
        boolean z4;
        List<View> items = this.q.getItems();
        sg.bigo.ads.ad.b.a.a(this.k, 9);
        sg.bigo.ads.ad.b.a.a(this.q, 9);
        if (z3) {
            sg.bigo.ads.ad.b.a.a(this.j, this.k, 4, this.f, i2);
            sg.bigo.ads.ad.b.a.a(this.j, this.q, 4, this.f, i2);
        } else {
            ViewGroup viewGroup = this.j;
            ViewGroup viewGroup2 = this.k;
            sg.bigo.ads.core.adview.h hVar = sg.bigo.ads.ad.interstitial.r.f46631F;
            sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup2, 4, hVar, 0);
            sg.bigo.ads.ad.b.a.a(this.j, this.q, 4, hVar, 0);
        }
        if (l()) {
            z4 = false;
        } else {
            sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.f45881p;
            z4 = true;
            int iA = bVar != null ? bVar.f46369a.a("endpage.multi_click_type") : 1;
            if (iA == 2) {
                z4 = false;
            } else if (iA != 3) {
                z4 = false;
            } else if (i2 != 1 && i2 != 2) {
                z4 = false;
            }
            i2 = 3;
        }
        Iterator<View> it = items.iterator();
        while (it.hasNext()) {
            Object tag = it.next().getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f46423e);
            if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                sg.bigo.ads.ad.interstitial.multi_img.view.d dVar = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
                sg.bigo.ads.ad.b.a.a(dVar.j, 5);
                ViewGroup viewGroup3 = this.j;
                RoundedFrameLayout roundedFrameLayout = dVar.j;
                if (z2) {
                    sg.bigo.ads.ad.b.c cVar = this.f;
                    if (z4) {
                        sg.bigo.ads.ad.b.a.a(viewGroup3, roundedFrameLayout, 4, cVar, new sg.bigo.ads.ad.b.a.InterfaceC0783a() { // from class: sg.bigo.ads.ad.interstitial.c.b.3
                            @Override // sg.bigo.ads.ad.b.a.InterfaceC0783a
                            public final boolean a() {
                                return b.this.q.f47628h;
                            }
                        });
                    } else {
                        sg.bigo.ads.ad.b.a.a(viewGroup3, roundedFrameLayout, 4, cVar, i2);
                    }
                } else {
                    sg.bigo.ads.ad.b.a.a(viewGroup3, roundedFrameLayout, 4, sg.bigo.ads.ad.interstitial.r.f46631F, 0);
                }
            }
        }
    }

    public static /* synthetic */ void a(b bVar, final long j, long j2, final long j3) {
        if (j > 0) {
            ViewFlow viewFlow = bVar.q;
            if (!viewFlow.g && !viewFlow.e()) {
                bVar.q.setScrollEnabled(false);
                int iA = sg.bigo.ads.common.utils.e.a(bVar.j.getContext(), 40);
                final int scrollX = bVar.q.getScrollX();
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iA, 0);
                valueAnimatorOfInt.setDuration(2 * j3);
                valueAnimatorOfInt.setStartDelay(j2);
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                final AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.interstitial.c.b.7
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        b.a(b.this, j - 1, 300L, j3);
                    }
                };
                valueAnimatorOfInt.addListener(animatorListenerAdapter);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.ad.interstitial.c.b.8
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (atomicBoolean.get()) {
                            return;
                        }
                        if (b.this.x.get()) {
                            atomicBoolean.set(true);
                            valueAnimator.removeListener(animatorListenerAdapter);
                            valueAnimator.cancel();
                            b.this.y.add(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.b.8.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnonymousClass8 anonymousClass8 = AnonymousClass8.this;
                                    b.a(b.this, j, 300L, j3);
                                }
                            });
                            return;
                        }
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue instanceof Integer) {
                            b.this.q.scrollTo(((Integer) animatedValue).intValue() + scrollX, b.this.q.getScrollY());
                        }
                    }
                });
                valueAnimatorOfInt.start();
                return;
            }
        }
        bVar.q.setScrollEnabled(true);
    }

    @Override // sg.bigo.ads.ad.interstitial.v
    public final void a(sg.bigo.ads.ad.interstitial.r rVar, View view) {
    }

    @Override // sg.bigo.ads.ad.interstitial.v
    public final boolean a(sg.bigo.ads.ad.interstitial.r rVar, ViewGroup viewGroup, View view, final sg.bigo.ads.ad.interstitial.u.a aVar, int i2, int i3, int i4, View... viewArr) {
        return super.a(rVar, viewGroup, view, new sg.bigo.ads.ad.interstitial.u.a() { // from class: sg.bigo.ads.ad.interstitial.c.b.5
            @Override // sg.bigo.ads.ad.interstitial.u.a
            public final Pair<String, String> a(TextView textView, String str, String str2) {
                if (textView.getTag() == 2 && sg.bigo.ads.common.utils.q.a((CharSequence) str2)) {
                    str2 = b.this.f.getDescription();
                }
                sg.bigo.ads.ad.interstitial.u.a aVar2 = aVar;
                return aVar2 != null ? aVar2.a(textView, str, str2) : Pair.create(str, str2);
            }
        }, i2, i3, i4, viewArr);
    }
}
