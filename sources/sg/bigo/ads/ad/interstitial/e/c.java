package sg.bigo.ads.ad.interstitial.e;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.IconAds;
import sg.bigo.ads.api.IconAdsRequest;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f46192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg.bigo.ads.ad.interstitial.e.a.a f46193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sg.bigo.ads.ad.interstitial.e.a.c f46194c;
    final sg.bigo.ads.ad.interstitial.g.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IconAds f46195e;
    public int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f46196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f46197i;
    public sg.bigo.ads.ad.interstitial.e.a j;
    public sg.bigo.ads.ad.interstitial.e.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n f46198l;
    public n m;
    public final a g = new a(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f46199n = false;
    public String o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f46200p = false;
    public List<NativeAd> q = new ArrayList();
    public List<NativeAd> r = new ArrayList();
    public Map<Integer, Boolean> s = new ConcurrentHashMap();
    public Map<Integer, Boolean> t = new ConcurrentHashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    List<Integer> f46201u = new ArrayList();
    List<Integer> v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final sg.bigo.ads.api.d f46202w = new sg.bigo.ads.api.d() { // from class: sg.bigo.ads.ad.interstitial.e.c.1
        private int a(NativeAd nativeAd, List<NativeAd> list) {
            c cVar = c.this;
            int iA = sg.bigo.ads.ad.interstitial.e.a.b.a(cVar.f46200p ? cVar.f46193b : cVar.f46194c);
            int iIndexOf = list.indexOf(nativeAd);
            if (iA == 0) {
                return 0;
            }
            return iIndexOf / iA;
        }

        @Override // sg.bigo.ads.api.d
        public final void b(NativeAd nativeAd) {
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "ad click.");
            n nVar = c.this.f46198l;
            if (nVar != null) {
                nVar.b();
                c.this.f46198l = null;
            }
            n nVar2 = c.this.m;
            if (nVar2 != null) {
                nVar2.b();
                c.this.m = null;
            }
        }

        @Override // sg.bigo.ads.api.d
        public final void c(NativeAd nativeAd) {
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "ad click.");
        }

        @Override // sg.bigo.ads.api.d
        public final void d(NativeAd nativeAd) {
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "ad click.");
        }

        @Override // sg.bigo.ads.api.d
        public final void a(NativeAd nativeAd) {
            sg.bigo.ads.ad.interstitial.e.a.b bVar;
            List<Integer> list;
            List<NativeAd> list2;
            Map<Integer, Boolean> map;
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "ad impression.");
            c cVar = c.this;
            if (cVar.f46200p) {
                bVar = cVar.f46193b;
                list = cVar.f46201u;
                list2 = cVar.q;
                map = cVar.s;
            } else {
                bVar = cVar.f46194c;
                list = cVar.v;
                list2 = cVar.r;
                map = cVar.t;
            }
            c.a(bVar, list, list2, map, a(nativeAd, list2));
        }

        @Override // sg.bigo.ads.api.d
        public final void a(NativeAd nativeAd, AdError adError) {
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "ad error, code=" + adError.getCode() + ", message=" + adError.getMessage());
        }
    };

    public static class a implements IconAdsRequest.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46213a;

        private a() {
            this.f46213a = 1;
        }

        @Override // sg.bigo.ads.api.IconAdsRequest.b
        public final int a() {
            return this.f46213a;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static abstract class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f46214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f46215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ViewGroup f46216c;
        public final sg.bigo.ads.ad.interstitial.e.a.b d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f46217e;
        private boolean f;

        private b(ViewGroup viewGroup, sg.bigo.ads.ad.interstitial.e.a.b bVar) {
            this.f46216c = viewGroup;
            this.d = bVar;
            this.f46214a = 0L;
            this.f46215b = false;
            this.f46217e = false;
            this.f = false;
        }

        public final ValueAnimator a(Integer num) {
            if (num == null) {
                return null;
            }
            return sg.bigo.ads.common.w.b.a(this.f46216c, num.intValue(), new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.e.c.b.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ long f46218a = 300;

                @Override // sg.bigo.ads.common.w.b.a
                public final long a() {
                    return this.f46218a;
                }
            });
        }

        public abstract boolean a();

        public final void b() {
            this.f46215b = true;
            this.f46217e = false;
            this.f46216c.removeCallbacks(this);
        }

        public final void c() {
            this.f46217e = false;
            this.f = true;
            this.f46216c.removeCallbacks(this);
        }

        public final boolean d() {
            if (this.f46215b || this.f46217e) {
                return false;
            }
            this.f46217e = true;
            this.f = false;
            if (this.f46214a == 0) {
                this.f46214a = SystemClock.elapsedRealtime();
            }
            this.f46216c.postDelayed(this, Math.max(this.d.j() - (SystemClock.elapsedRealtime() - this.f46214a), 0L));
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.f46215b && !this.f && a()) {
                this.f46215b = true;
            }
            this.f46217e = false;
        }

        public /* synthetic */ b(ViewGroup viewGroup, sg.bigo.ads.ad.interstitial.e.a.b bVar, byte b2) {
            this(viewGroup, bVar);
        }

        public final void a(ViewGroup viewGroup, View view, Integer num, final sg.bigo.ads.ad.interstitial.e.a aVar) {
            u.b(view);
            viewGroup.addView(view);
            sg.bigo.ads.common.e.a.a(view, 100.0f);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).addRule(12);
            } else if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 80;
            }
            final ValueAnimator valueAnimatorA = a(num);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.1f, 1, 0.0f);
            translateAnimation.setDuration(300L);
            translateAnimation.setAnimationListener(new sg.bigo.ads.common.utils.b.c() { // from class: sg.bigo.ads.ad.interstitial.e.c.b.2
                @Override // sg.bigo.ads.common.utils.b.c, android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    b.this.a(aVar);
                }

                @Override // sg.bigo.ads.common.utils.b.c, android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                    ValueAnimator valueAnimator = valueAnimatorA;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            });
            view.startAnimation(translateAnimation);
        }

        public void a(final sg.bigo.ads.ad.interstitial.e.a aVar) {
            if (aVar != null && aVar.f46173c > 0) {
                aVar.f46172b.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.e.c.b.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        sg.bigo.ads.ad.interstitial.e.a aVar2 = aVar;
                        aVar2.f46172b.setFlipInterval(aVar2.f46173c);
                        aVar.f46172b.c();
                    }
                });
            }
        }
    }

    public c(t tVar, m mVar, sg.bigo.ads.ad.interstitial.g.a aVar) {
        this.f46192a = tVar;
        this.f46193b = new sg.bigo.ads.ad.interstitial.e.a.a(mVar);
        this.f46194c = new sg.bigo.ads.ad.interstitial.e.a.c(mVar, aVar == null || aVar.g());
        this.d = aVar;
    }

    public static /* synthetic */ List a(IconAds iconAds) {
        if (!(iconAds instanceof sg.bigo.ads.ad.a.a)) {
            if (iconAds != null) {
                return Arrays.asList(iconAds.getNativeAds());
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (sg.bigo.ads.ad.b.a.c cVar : ((sg.bigo.ads.ad.a.a) iconAds).f45387a) {
            if (!cVar.isExpired() && !cVar.f45588i) {
                if (cVar.x) {
                    arrayList.add(cVar);
                } else if (!cVar.y) {
                    arrayList2.add(cVar);
                }
            }
        }
        arrayList.addAll(arrayList2);
        sg.bigo.ads.ad.b.a.c[] cVarArr = new sg.bigo.ads.ad.b.a.c[arrayList.size()];
        sg.bigo.ads.common.utils.k.a(arrayList, cVarArr);
        return Arrays.asList(cVarArr);
    }

    private void d() {
        b();
        sg.bigo.ads.ad.interstitial.e.a aVar = this.j;
        if (aVar != null) {
            aVar.f46172b.d();
            u.b(this.j.f46171a);
        }
        this.j = null;
    }

    public final void b() {
        b bVar = this.f46196h;
        if (bVar != null) {
            bVar.b();
        }
        this.f46196h = null;
    }

    public final void c() {
        b bVar = this.f46197i;
        if (bVar != null) {
            bVar.b();
        }
        this.f46197i = null;
    }

    public static /* synthetic */ n a(c cVar, final sg.bigo.ads.ad.interstitial.e.a.b bVar, final List list) {
        int iO;
        if (bVar == null || !bVar.a() || (iO = bVar.o()) < 0) {
            return null;
        }
        return new n(r.f47535a.a(iO)) { // from class: sg.bigo.ads.ad.interstitial.e.c.5
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                NativeAd nativeAd = (NativeAd) list.get(0);
                if (nativeAd instanceof sg.bigo.ads.ad.b.c) {
                    sg.bigo.ads.ad.b.a.c cVar2 = (sg.bigo.ads.ad.b.a.c) nativeAd;
                    if (cVar2.g) {
                        return;
                    }
                    cVar2.a(bVar.b(), 22);
                }
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j) {
            }
        };
    }

    public static void b(sg.bigo.ads.ad.interstitial.e.a aVar, b bVar) {
        if (aVar == null) {
            if (bVar != null) {
                bVar.d();
            }
        } else {
            int i2 = aVar.f46173c;
            if (i2 > 0) {
                aVar.f46172b.setFlipInterval(i2);
                aVar.f46172b.c();
            }
        }
    }

    public final void a(ViewGroup viewGroup, final int i2) {
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) this.f46192a.f(), i2);
        this.f46200p = true;
        if (viewGroup == null) {
            a(this.f46193b, "endPageView is null", i2);
            return;
        }
        if (sg.bigo.ads.ad.interstitial.e.a.b.b(this.f46193b)) {
            a(this.f46193b, "config is invalid", i2);
            return;
        }
        if (!a(i2)) {
            a(this.f46193b, "icon request hasScene return false", i2);
            return;
        }
        d();
        b bVar = new b(viewGroup, this.f46193b) { // from class: sg.bigo.ads.ad.interstitial.e.c.3
            {
                byte b2 = 0;
            }

            @Override // sg.bigo.ads.ad.interstitial.e.c.b
            public final boolean a() {
                ViewGroup viewGroup2;
                c cVar;
                sg.bigo.ads.ad.interstitial.e.a.a aVar;
                String str;
                sg.bigo.ads.ad.interstitial.e.a.a aVar2;
                String str2;
                c cVar2 = c.this;
                if (cVar2.f46195e == null) {
                    aVar2 = cVar2.f46193b;
                    str2 = "icon ads is null";
                } else {
                    if (!cVar2.f46199n) {
                        if (cVar2.a()) {
                            cVar = c.this;
                            aVar = cVar.f46193b;
                            str = "host ad is destroyed";
                        } else {
                            List listA = c.a(c.this.f46195e);
                            if (!sg.bigo.ads.common.utils.k.a((Collection) listA)) {
                                boolean zA = c.this.f46193b.a();
                                c cVar3 = c.this;
                                int i3 = i2;
                                if (i3 != 1) {
                                    sg.bigo.ads.ad.interstitial.e.a.a aVar3 = cVar3.f46193b;
                                    if (aVar3 != null && zA) {
                                        int iD = aVar3.d();
                                        if ((i3 != 4 || iD != 1) && (i3 != 8 || (iD != 1 && iD != 2))) {
                                        }
                                        c.this.b();
                                        return true;
                                    }
                                    cVar = c.this;
                                    aVar = cVar.f46193b;
                                    str = "icon ads can not show in this scene";
                                }
                                if (u.c(this.f46216c) && u.d(this.f46216c)) {
                                    c.a(c.this, i2);
                                    c cVar4 = c.this;
                                    Context context = this.f46216c.getContext();
                                    c cVar5 = c.this;
                                    cVar4.j = sg.bigo.ads.ad.interstitial.e.a.a(context, cVar5.f46193b, listA, cVar5.q);
                                    c.a(c.this, zA);
                                    ViewGroup viewGroup3 = this.f46216c;
                                    if (zA && (viewGroup2 = (ViewGroup) viewGroup3.findViewById(R.id.word_icon_container)) != null) {
                                        viewGroup3 = viewGroup2;
                                    }
                                    sg.bigo.ads.ad.interstitial.e.a aVar4 = c.this.j;
                                    a(viewGroup3, aVar4.f46171a, null, aVar4);
                                    c cVar6 = c.this;
                                    cVar6.f46198l = c.a(cVar6, cVar6.f46193b, cVar6.q);
                                    n nVar = c.this.f46198l;
                                    if (nVar != null) {
                                        nVar.c();
                                    }
                                    c.a(c.this, this.d, i2, listA);
                                }
                                c.this.b();
                                return true;
                            }
                            cVar = c.this;
                            aVar = cVar.f46193b;
                            str = "icon ads download failed";
                        }
                        cVar.a(aVar, str, i2);
                        c.this.b();
                        return true;
                    }
                    aVar2 = cVar2.f46193b;
                    str2 = "page is Paused";
                }
                cVar2.a(aVar2, str2, i2);
                return false;
            }
        };
        this.f46196h = bVar;
        bVar.d();
    }

    public final void a(sg.bigo.ads.ad.interstitial.e.a.b bVar, String str, int i2) {
        if (bVar != null) {
            sg.bigo.ads.core.d.b.a(this.f46192a.f(), str, i2, bVar.i(), this.o, bVar.f());
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    public static /* synthetic */ void a(sg.bigo.ads.ad.interstitial.e.a.b bVar, List list, List list2, Map map, int i2) {
        int i3;
        if (bVar == null || sg.bigo.ads.common.utils.k.a((Collection) list2) || i2 < 0) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        if (bool.equals(map.get(Integer.valueOf(i2)))) {
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "tryEarlyIconImpTracker, showIconListIndex has handled, return");
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "tryEarlyIconImpTracker, showIconListIndex=".concat(String.valueOf(i2)));
        map.put(Integer.valueOf(i2), bool);
        boolean z2 = i2 == 0;
        int iM = bVar.m();
        if (iM == 0) {
            i3 = 0;
        } else {
            int iA = sg.bigo.ads.ad.interstitial.e.a.b.a(bVar);
            int iN = bVar.n();
            if (iM != 1) {
                if (iM != 2) {
                    if (iM == 3) {
                        i3 = iA + iN;
                    } else if (iM != 4) {
                        i3 = 0;
                    } else {
                        i3 = iA * iN;
                    }
                } else if (z2) {
                    i3 = iA * iN;
                } else {
                    i3 = 0;
                }
            } else if (z2) {
                i3 = iN + iA;
            } else {
                i3 = 0;
            }
        }
        sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "tryEarlyIconImpTracker, earlyImpTrackingNum=".concat(String.valueOf(i3)));
        if (i3 > 0) {
            while (list.size() <= i2) {
                list.add(0);
            }
            list.set(i2, i2 > 0 ? Integer.valueOf(((Integer) list.get(i2 - 1)).intValue() + i3) : Integer.valueOf(i3));
            int iIntValue = i2 > 0 ? ((Integer) list.get(i2 - 1)).intValue() : 0;
            int iMin = Math.min(i3 + iIntValue, list2.size());
            StringBuilder sbU = android.support.v4.media.a.u(iIntValue, "tryEarlyIconImpTracker, handle ads from index ", " to ");
            sbU.append(iMin - 1);
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", sbU.toString());
            while (iIntValue < iMin) {
                NativeAd nativeAd = (NativeAd) list2.get(iIntValue);
                if (nativeAd instanceof sg.bigo.ads.ad.b.a.c) {
                    sg.bigo.ads.ad.b.a.c cVar = (sg.bigo.ads.ad.b.a.c) nativeAd;
                    sg.bigo.ads.core.e.a.b bVar2 = cVar.d;
                    if (!(bVar2 instanceof sg.bigo.ads.core.e.a.a ? ((sg.bigo.ads.core.e.a.a) bVar2).f48388a.get() : false)) {
                        sg.bigo.ads.core.e.a.b bVar3 = cVar.d;
                        if (bVar3 instanceof sg.bigo.ads.core.e.a.a) {
                            sg.bigo.ads.core.e.a.a aVar = (sg.bigo.ads.core.e.a.a) bVar3;
                            if (aVar.f48388a.get()) {
                                sg.bigo.ads.common.t.a.a(0, 3, "IconAds", "tryTrackerImpressionEarly: Impression already tracked.");
                            } else {
                                aVar.a(cVar.f45584b.f47035e, false);
                            }
                        }
                    }
                }
                iIntValue++;
            }
        }
    }

    public static void a(sg.bigo.ads.ad.interstitial.e.a aVar, b bVar) {
        if (aVar != null) {
            aVar.f46172b.d();
        } else if (bVar != null) {
            bVar.c();
        }
    }

    public static /* synthetic */ void a(c cVar, int i2) {
        Ad ad = cVar.f46195e;
        if (ad instanceof sg.bigo.ads.api.b.e) {
            ((sg.bigo.ads.api.b.e) ad).f47003b = i2;
        }
    }

    public static /* synthetic */ void a(c cVar, sg.bigo.ads.ad.interstitial.e.a.b bVar, int i2, List list) {
        if (bVar == null || list == null) {
            return;
        }
        sg.bigo.ads.core.d.b.a(cVar.f46192a.f(), i2, bVar.i(), cVar.o, list.size(), bVar.f(), bVar.a());
    }

    public static /* synthetic */ void a(c cVar, boolean z2) {
        Ad ad = cVar.f46195e;
        if (ad instanceof sg.bigo.ads.api.b.e) {
            ((sg.bigo.ads.api.b.e) ad).f47004c = z2;
        }
    }

    public final boolean a() {
        t tVar = this.f46192a;
        return tVar.f45588i || tVar.f46647z.f45588i;
    }

    public final boolean a(int i2) {
        return (this.f & i2) == i2;
    }
}
