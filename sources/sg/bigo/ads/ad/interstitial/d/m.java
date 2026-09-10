package sg.bigo.ads.ad.interstitial.d;

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
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes7.dex */
public class m extends a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected LinearLayout f46047A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected sg.bigo.ads.ad.interstitial.multi_img.view.c f46048B;
    protected sg.bigo.ads.ad.interstitial.multi_img.view.c C;
    protected sg.bigo.ads.ad.interstitial.multi_img.a D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected sg.bigo.ads.ad.interstitial.multi_img.view.b f46049E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected sg.bigo.ads.ad.interstitial.multi_img.b f46050F;
    private final Set<sg.bigo.ads.ad.interstitial.multi_img.view.d> G;
    private final sg.bigo.ads.ad.b.a.InterfaceC0783a H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final AtomicBoolean f46051I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final List<Runnable> f46052J;
    protected ViewFlow x;
    protected Indicator y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected RoundedFrameLayout f46053z;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.d.m$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46077a;

        static {
            int[] iArr = new int[sg.bigo.ads.ad.interstitial.multi_img.d.values().length];
            f46077a = iArr;
            try {
                iArr[sg.bigo.ads.ad.interstitial.multi_img.d.LTR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46077a[sg.bigo.ads.ad.interstitial.multi_img.d.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46077a[sg.bigo.ads.ad.interstitial.multi_img.d.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46077a[sg.bigo.ads.ad.interstitial.multi_img.d.TILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public m(sg.bigo.ads.ad.b.c cVar) {
        super(cVar);
        this.G = new HashSet();
        this.H = new sg.bigo.ads.ad.b.a.InterfaceC0783a() { // from class: sg.bigo.ads.ad.interstitial.d.m.1
            @Override // sg.bigo.ads.ad.b.a.InterfaceC0783a
            public final boolean a() {
                ViewFlow viewFlow = m.this.x;
                if (viewFlow != null) {
                    return viewFlow.f47628h;
                }
                return false;
            }
        };
        this.f46051I = new AtomicBoolean(false);
        this.f46052J = new ArrayList();
    }

    public final void A() {
        int iA = this.x.a(this.f46049E.j);
        if (iA < 0 || iA == this.x.getCurrentItem()) {
            return;
        }
        this.x.b(iA);
    }

    public final sg.bigo.ads.api.a.m B() {
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.f46050F;
        if (bVar != null) {
            return bVar.f46369a;
        }
        return null;
    }

    public boolean C() {
        return E() == sg.bigo.ads.ad.interstitial.multi_img.d.NONE;
    }

    public int D() {
        return w();
    }

    public sg.bigo.ads.ad.interstitial.multi_img.d E() {
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.f46050F;
        return bVar != null ? bVar.f46370b : sg.bigo.ads.ad.interstitial.multi_img.d.NONE;
    }

    public sg.bigo.ads.ad.interstitial.multi_img.c F() {
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.f46050F;
        return bVar != null ? bVar.d : sg.bigo.ads.ad.interstitial.multi_img.c.FILL_MATCH_SELF;
    }

    public final void G() {
        this.f46051I.set(true);
    }

    public final void H() {
        this.f46051I.set(false);
        if (sg.bigo.ads.ad.interstitial.multi_img.f.a(this.x)) {
            sg.bigo.ads.ad.interstitial.multi_img.f.a(this.x, new ValueCallback<Integer>() { // from class: sg.bigo.ads.ad.interstitial.d.m.14
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Integer num) {
                    Iterator it = m.this.f46052J.iterator();
                    while (it.hasNext()) {
                        m.this.x.post((Runnable) it.next());
                    }
                    m.this.f46052J.clear();
                    sg.bigo.ads.ad.interstitial.multi_img.f.a(m.this.x, (ValueCallback<Integer>) null);
                }
            });
            return;
        }
        Iterator<Runnable> it = this.f46052J.iterator();
        while (it.hasNext()) {
            this.x.post(it.next());
        }
        this.f46052J.clear();
    }

    public void I() {
        if (C()) {
            return;
        }
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.f46050F;
        int iA = bVar != null ? bVar.f46369a.a("video_play_page.multi_guide") : 0;
        switch (iA) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                a(iA, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.m.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.this.x.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.m.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                m mVar = m.this;
                                if (mVar.x.g) {
                                    return;
                                }
                                m.a(mVar, 3L, 0L, 300L);
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
                this.x.setFlipInterval((iA - 5) * 1000);
                this.x.c();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    public void J() {
        T t;
        int i2;
        boolean z2;
        T t2;
        sg.bigo.ads.ad.interstitial.x xVar = this.s;
        int i3 = xVar != null ? xVar.f46717i : 0;
        View viewFindViewById = this.q.findViewById(R.id.inter_media_container);
        sg.bigo.ads.ad.b.a.a(viewFindViewById, 9);
        sg.bigo.ads.ad.b.a.a(this.x, 9);
        sg.bigo.ads.ad.interstitial.x xVar2 = this.s;
        if (xVar2 == null || !xVar2.g) {
            sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.f46049E;
            if (bVar != null && (t = bVar.f46427l) != 0) {
                ((MediaView) t).setOtherClickAreaClick(false);
            }
            ViewGroup viewGroup = this.q;
            sg.bigo.ads.core.adview.h hVar = sg.bigo.ads.ad.interstitial.r.f46631F;
            sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById, 8, hVar, 0);
            sg.bigo.ads.ad.b.a.a(this.q, this.x, 8, hVar, 0);
        } else {
            sg.bigo.ads.ad.interstitial.multi_img.view.b bVar2 = this.f46049E;
            if (bVar2 != null && (t2 = bVar2.f46427l) != 0) {
                ((MediaView) t2).setOtherClickAreaClick(true);
            }
            sg.bigo.ads.ad.b.a.a(this.q, viewFindViewById, 8, ((sg.bigo.ads.ad.interstitial.u) this).f46656c, i3);
            sg.bigo.ads.ad.b.a.a(this.q, this.x, 8, ((sg.bigo.ads.ad.interstitial.u) this).f46656c, i3);
        }
        if (C()) {
            i2 = i3;
            z2 = false;
        } else {
            sg.bigo.ads.ad.interstitial.multi_img.b bVar3 = this.f46050F;
            int iA = bVar3 != null ? bVar3.f46369a.a("video_play_page.multi_click_type") : 1;
            i2 = 3;
            if (iA == 2) {
                z2 = false;
            } else {
                if (iA != 3) {
                    i2 = i3;
                } else if (i3 == 1 || i3 == 2) {
                    z2 = true;
                }
                z2 = false;
            }
        }
        sg.bigo.ads.ad.interstitial.x xVar3 = this.s;
        boolean z3 = xVar3 != null && xVar3.f;
        a(i3, z3, i2, z2);
        Iterator<View> it = this.x.getItems().iterator();
        while (it.hasNext()) {
            Object tag = it.next().getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f46423e);
            if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                sg.bigo.ads.ad.interstitial.multi_img.view.d dVar = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
                sg.bigo.ads.ad.b.a.a(dVar.j, 5);
                ViewGroup viewGroup2 = this.q;
                RoundedFrameLayout roundedFrameLayout = dVar.j;
                if (z3) {
                    sg.bigo.ads.ad.b.c cVar = ((sg.bigo.ads.ad.interstitial.u) this).f46656c;
                    if (z2) {
                        sg.bigo.ads.ad.b.a.a(viewGroup2, roundedFrameLayout, 8, cVar, this.H);
                    } else {
                        sg.bigo.ads.ad.b.a.a(viewGroup2, roundedFrameLayout, 8, cVar, i2);
                    }
                } else {
                    sg.bigo.ads.ad.b.a.a(viewGroup2, roundedFrameLayout, 8, sg.bigo.ads.ad.interstitial.r.f46631F, 0);
                }
            }
        }
    }

    public final boolean K() {
        View viewA;
        ViewFlow viewFlow = this.x;
        if (viewFlow == null) {
            return false;
        }
        List<View> items = viewFlow.getItems();
        if (sg.bigo.ads.common.utils.k.a((Collection) items) || items.size() != 1 || (viewA = this.x.a(0)) == null) {
            return false;
        }
        Object tag = viewA.getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f46423e);
        if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
            sg.bigo.ads.ad.interstitial.multi_img.view.d dVar = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
            sg.bigo.ads.ad.interstitial.multi_img.c cVar = sg.bigo.ads.ad.interstitial.multi_img.c.FILL_MATCH_PARENT;
            dVar.a(cVar);
            dVar.a(4);
            this.x.setViewStyle(3);
            ((ViewFlow.b) viewA.getLayoutParams()).d = cVar.d;
            return true;
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a, sg.bigo.ads.ad.interstitial.u
    public final void f() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.f46049E;
        if (bVar != null) {
            ((MediaView) bVar.f46427l).c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final ViewGroup k() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.f46049E;
        if (bVar != null) {
            return bVar.k;
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final MediaView l() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.f46049E;
        if (bVar != null) {
            return (MediaView) bVar.f46427l;
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final Button m() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.f46049E;
        if (bVar != null) {
            return bVar.f46415a;
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void p() {
        super.p();
        synchronized (this.G) {
            try {
                if (!this.G.isEmpty()) {
                    final HashSet hashSet = new HashSet(this.G);
                    this.G.clear();
                    a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.m.11
                        @Override // android.webkit.ValueCallback
                        public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                            Bitmap bitmap2 = bitmap;
                            if (bitmap2 == null) {
                                synchronized (m.this.G) {
                                    m.this.G.addAll(hashSet);
                                }
                                return;
                            }
                            for (sg.bigo.ads.ad.interstitial.multi_img.view.d dVar : hashSet) {
                                if (dVar instanceof sg.bigo.ads.ad.interstitial.multi_img.view.b) {
                                    ((sg.bigo.ads.ad.interstitial.multi_img.view.b) dVar).a(bitmap2);
                                } else if (dVar instanceof sg.bigo.ads.ad.interstitial.multi_img.view.a) {
                                    ((sg.bigo.ads.ad.interstitial.multi_img.view.a) dVar).a(bitmap2);
                                }
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void r() {
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void s() {
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public void t() {
        m mVar = this;
        super.t();
        Context context = mVar.q.getContext();
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = mVar.f46050F;
        List<String> listA = bVar != null ? bVar.a() : null;
        sg.bigo.ads.ad.interstitial.multi_img.b bVar2 = mVar.f46050F;
        boolean z2 = bVar2 != null && bVar2.f46372e;
        sg.bigo.ads.ad.interstitial.multi_img.d dVarE = mVar.E();
        sg.bigo.ads.ad.interstitial.multi_img.c cVarF = mVar.F();
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.ad.interstitial.s.a(((sg.bigo.ads.ad.interstitial.u) mVar).f46656c);
        mVar.x = (ViewFlow) mVar.q.findViewById(R.id.inter_media_ad_view_flow);
        mVar.y = (Indicator) mVar.q.findViewById(R.id.inter_vf_indicator);
        int iX = mVar.x();
        if (iX == 3 || iX == 4) {
            mVar.D = new sg.bigo.ads.ad.interstitial.multi_img.a(mVar.q, mVar.x, mVar.o, iX);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar3 = new sg.bigo.ads.ad.interstitial.multi_img.view.b(context, cVarF, mVar.z(), mVar.w(), iX);
        mVar.f46049E = bVar3;
        mVar.f46053z = bVar3.j;
        ((MediaView) bVar3.f46427l).setImageBlurBorder(false);
        mVar.f46049E.a(pVarA.f47362b, pVarA.f47363c);
        if (mVar.f46049E.b()) {
            final boolean zAR = ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.u) mVar).f46656c.f()).aR();
            if (zAR) {
                synchronized (mVar.G) {
                    mVar.G.add(mVar.f46049E);
                }
            }
            if (mVar.D != null) {
                mVar.f46049E.r = new sg.bigo.ads.ad.interstitial.multi_img.view.d.a() { // from class: sg.bigo.ads.ad.interstitial.d.m.8
                    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                    public final void a() {
                        m mVar2 = m.this;
                        m.this.D.a(mVar2.x.a(mVar2.f46049E.j));
                    }

                    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                    public final void b() {
                        m.this.f46049E.r = null;
                        a();
                    }
                };
            }
            mVar.a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.m.9
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 != null) {
                        if (zAR) {
                            synchronized (m.this.G) {
                                m.this.G.remove(m.this.f46049E);
                            }
                        }
                        m.this.f46049E.a(bitmap2);
                    }
                }
            });
        }
        mVar.f46047A = (LinearLayout) mVar.q.findViewById(R.id.inter_media_bottom_layout);
        if (sg.bigo.ads.common.utils.q.a((CharSequence) ((sg.bigo.ads.ad.interstitial.u) mVar).f46656c.getWarning())) {
            ((ViewGroup.MarginLayoutParams) mVar.f46047A.getLayoutParams()).topMargin = sg.bigo.ads.common.utils.e.a(context, 8);
        }
        mVar.a(mVar.f45984p);
        if (mVar.f46050F != null) {
            mVar.x.setDividerWidth(sg.bigo.ads.common.utils.e.a(context, dVarE.f));
            mVar.x.setContentMaxWidthSpace(sg.bigo.ads.common.utils.e.a(context, dVarE.f46392i));
            mVar.x.setViewStyle(dVarE.j);
            mVar.x.setOnItemChangeListener(new sg.bigo.ads.ad.interstitial.multi_img.f(dVarE, mVar.y, mVar.D));
            int i2 = 0;
            int i3 = 0;
            while (listA != null && i3 < listA.size()) {
                String str = listA.get(i3);
                if (!TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str)) {
                    mVar.a(context, cVarF, iX, str, ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.u) mVar).f46656c.f()).al());
                    i2++;
                }
                i3++;
                mVar = this;
            }
            int iMax = Math.max(dVarE == sg.bigo.ads.ad.interstitial.multi_img.d.CENTER ? 2 - i2 : 0, 0);
            if (z2) {
                iMax = Math.max(iMax, 1);
            }
            int i4 = 0;
            while (i4 < iMax) {
                int i5 = i2 + 1;
                final sg.bigo.ads.ad.interstitial.multi_img.view.a aVarA = a(context, cVarF, iX, (String) null, false);
                final boolean zAR2 = ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.u) this).f46656c.f()).aR();
                if (zAR2) {
                    synchronized (this.G) {
                        this.G.add(aVarA);
                    }
                }
                a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.m.10
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        Bitmap bitmap2 = bitmap;
                        if (bitmap2 != null) {
                            if (zAR2) {
                                synchronized (m.this.G) {
                                    m.this.G.remove(aVarA);
                                }
                            }
                            aVarA.a(bitmap2);
                        }
                    }
                });
                i4++;
                i2 = i5;
            }
            mVar = this;
            sg.bigo.ads.ad.interstitial.multi_img.d dVar = sg.bigo.ads.ad.interstitial.multi_img.d.CENTER;
            int i6 = dVarE == dVar ? i2 >> 1 : 0;
            ViewFlow.b bVar4 = new ViewFlow.b();
            bVar4.f47653a = pVarA.f47362b;
            bVar4.f47654b = pVarA.f47363c;
            bVar4.f47655c = true;
            bVar4.d = cVarF.d;
            mVar.x.addView(mVar.f46053z, Math.max(0, i6), bVar4);
            int i7 = AnonymousClass6.f46077a[dVarE.ordinal()];
            if (i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4) {
                ViewFlow.d dVar2 = new ViewFlow.d() { // from class: sg.bigo.ads.ad.interstitial.d.m.3
                    @Override // sg.bigo.ads.common.view.ViewFlow.d
                    public final void a() {
                        ((sg.bigo.ads.ad.interstitial.u) m.this).f46656c.a(8, 29);
                    }
                };
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context, true);
                mVar.f46048B = cVar;
                mVar.x.setStartView(cVar.f46418a);
                mVar.x.setOnStartViewShowListener(dVar2);
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context, false);
                mVar.C = cVar2;
                mVar.x.setEndView(cVar2.f46418a);
                mVar.x.setOnEndViewShowListener(dVar2);
            }
            int iA = dVarE == dVar ? mVar.x.a(mVar.f46053z) : 0;
            mVar.x.b(iA);
            sg.bigo.ads.ad.interstitial.multi_img.a aVar = mVar.D;
            if (aVar != null) {
                aVar.b(iA);
            }
        }
        mVar.b(mVar.y());
        mVar.I();
    }

    public boolean z() {
        return false;
    }

    private sg.bigo.ads.ad.interstitial.multi_img.view.a a(Context context, sg.bigo.ads.ad.interstitial.multi_img.c cVar, int i2, String str, boolean z2) {
        final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar = new sg.bigo.ads.ad.interstitial.multi_img.view.a(context, this.f46050F, cVar, D(), i2, str, z2, new ValueCallback<sg.bigo.ads.ad.interstitial.multi_img.view.a>() { // from class: sg.bigo.ads.ad.interstitial.d.m.4
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(sg.bigo.ads.ad.interstitial.multi_img.view.a aVar2) {
                final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar3 = aVar2;
                m.this.a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.m.4.1
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        Bitmap bitmap2 = bitmap;
                        if (bitmap2 != null) {
                            synchronized (m.this.G) {
                                m.this.G.remove(aVar3);
                            }
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
        this.x.addView(aVar.j, bVar);
        if (this.D != null) {
            aVar.r = new sg.bigo.ads.ad.interstitial.multi_img.view.d.a() { // from class: sg.bigo.ads.ad.interstitial.d.m.5
                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void a() {
                    m.this.D.a(m.this.x.a(aVar.j));
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

    public void b(int i2) {
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public void a(double d) {
        if (d <= 3.0d) {
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar = this.f46048B;
            if (cVar != null) {
                cVar.a(false);
            }
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = this.C;
            if (cVar2 != null) {
                cVar2.a(false);
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar3 = this.f46048B;
        if (cVar3 != null) {
            cVar3.a(true);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar4 = this.C;
        if (cVar4 != null) {
            cVar4.a(true);
        }
    }

    public void a(int i2, boolean z2, int i3, boolean z3) {
        T t;
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = this.f46049E;
        if (bVar == null || (t = bVar.f46427l) == 0) {
            return;
        }
        if (z3) {
            sg.bigo.ads.ad.b.a.a(this.q, t, 8, ((sg.bigo.ads.ad.interstitial.u) this).f46656c, this.H);
        } else {
            sg.bigo.ads.ad.b.a.a(this.q, t, 8, ((sg.bigo.ads.ad.interstitial.u) this).f46656c, i3);
        }
        if (z2) {
            ((MediaView) this.f46049E.f46427l).setMediaAreaClickable(true);
            ((MediaView) this.f46049E.f46427l).b().a(false);
        } else {
            ((MediaView) this.f46049E.f46427l).setMediaAreaClickable(false);
            ((MediaView) this.f46049E.f46427l).b().a(true);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final void a(ViewGroup viewGroup, View view, final sg.bigo.ads.ad.interstitial.u.a aVar, int i2, int i3, int i4, View... viewArr) {
        super.a(viewGroup, view, new sg.bigo.ads.ad.interstitial.u.a() { // from class: sg.bigo.ads.ad.interstitial.d.m.7
            @Override // sg.bigo.ads.ad.interstitial.u.a
            public final Pair<String, String> a(TextView textView, String str, String str2) {
                if (textView != null && textView.getTag() == 2 && sg.bigo.ads.common.utils.q.a((CharSequence) str2)) {
                    str2 = ((sg.bigo.ads.ad.interstitial.u) m.this).f46656c.getDescription();
                }
                sg.bigo.ads.ad.interstitial.u.a aVar2 = aVar;
                return aVar2 != null ? aVar2.a(textView, str, str2) : Pair.create(str, str2);
            }
        }, i2, i3, i4, viewArr);
        J();
    }

    public final void a(sg.bigo.ads.ad.interstitial.a aVar, ViewGroup viewGroup, sg.bigo.ads.ad.interstitial.x xVar, sg.bigo.ads.ad.interstitial.multi_img.b bVar, sg.bigo.ads.ad.interstitial.f fVar) {
        this.f46050F = bVar;
        a(aVar, viewGroup, xVar, bVar.f46369a, fVar);
    }

    public static /* synthetic */ void a(m mVar, final long j, long j2, final long j3) {
        if (j > 0) {
            ViewFlow viewFlow = mVar.x;
            if (!viewFlow.g && !viewFlow.e()) {
                mVar.x.setScrollEnabled(false);
                int iA = sg.bigo.ads.common.utils.e.a(mVar.q.getContext(), 40);
                final int scrollX = mVar.x.getScrollX();
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iA, 0);
                valueAnimatorOfInt.setDuration(2 * j3);
                valueAnimatorOfInt.setStartDelay(j2);
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                final AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.interstitial.d.m.12
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        m.a(m.this, j - 1, 300L, j3);
                    }
                };
                valueAnimatorOfInt.addListener(animatorListenerAdapter);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.ad.interstitial.d.m.13
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (atomicBoolean.get()) {
                            return;
                        }
                        if (m.this.f46051I.get()) {
                            atomicBoolean.set(true);
                            valueAnimator.removeListener(animatorListenerAdapter);
                            valueAnimator.cancel();
                            m.this.f46052J.add(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.m.13.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnonymousClass13 anonymousClass13 = AnonymousClass13.this;
                                    m.a(m.this, j, 300L, j3);
                                }
                            });
                            return;
                        }
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue instanceof Integer) {
                            m.this.x.scrollTo(((Integer) animatedValue).intValue() + scrollX, m.this.x.getScrollY());
                        }
                    }
                });
                valueAnimatorOfInt.start();
                return;
            }
        }
        mVar.x.setScrollEnabled(true);
    }

    public void a(sg.bigo.ads.ad.interstitial.r rVar) {
    }
}
