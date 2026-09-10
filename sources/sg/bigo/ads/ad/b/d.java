package sg.bigo.ads.ad.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.iab.omid.library.bigosg.adsession.media.MediaEvents;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.a.h;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.o;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.f.a.j;
import sg.bigo.ads.core.f.a.k;
import sg.bigo.ads.core.f.a.l;
import sg.bigo.ads.core.f.a.n;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes7.dex */
public class d extends c {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public sg.bigo.ads.core.player.c f45479J;
    public p K;
    public boolean L;
    private final a X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private g f45480Y;
    private final sg.bigo.ads.core.g.c Z;
    private sg.bigo.ads.core.player.b.a x;
    private Pair<Boolean, Boolean> y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private AtomicBoolean f45481z;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.b.d$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f45489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ sg.bigo.ads.api.b.d.a f45490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ sg.bigo.ads.core.a.a f45491c;
        final /* synthetic */ sg.bigo.ads.api.core.c d;

        public AnonymousClass4(int i2, sg.bigo.ads.api.b.d.a aVar, sg.bigo.ads.core.a.a aVar2, sg.bigo.ads.api.core.c cVar) {
            this.f45489a = i2;
            this.f45490b = aVar;
            this.f45491c = aVar2;
            this.d = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f45489a != 0) {
                d.this.z();
                this.f45490b.a(d.this, 1006, this.f45489a, "Invalid media video.");
                return;
            }
            d.this.y();
            d dVar = d.this;
            p pVar = dVar.K;
            if (!d.a(dVar, (int) ((pVar != null ? pVar.s : 0L) / 1000))) {
                this.f45490b.a(d.this, IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, com.smartdigimkt.d2.a.m0, "Invalid video duration.");
                return;
            }
            d.this.x = new sg.bigo.ads.core.player.b.a() { // from class: sg.bigo.ads.ad.b.d.4.1
                @Override // sg.bigo.ads.core.player.b.a
                public final void a() {
                    if (d.this.f45481z.get() || AnonymousClass4.this.f45491c.bg() == 3 || AnonymousClass4.this.f45491c.bh() != null) {
                        sg.bigo.ads.common.t.a.a(0, 3, "onResourceDownloadBackup", "downloading or backup img is ready, stop to download img");
                        return;
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "onResourceDownloadBackup", "begin to download backup img");
                    d.this.f45481z.set(true);
                    final Pair<Boolean, Boolean> pairD = d.this.D();
                    ArrayList arrayList = new ArrayList();
                    if (((Boolean) pairD.first).booleanValue()) {
                        arrayList.add(AnonymousClass4.this.f45491c.bm().f48474b);
                    }
                    String strAT = ((sg.bigo.ads.core.a.a) d.this.f()).aT();
                    if (!TextUtils.isEmpty(strAT) && URLUtil.isNetworkUrl(strAT)) {
                        arrayList.add(AnonymousClass4.this.f45491c.aT());
                    }
                    if (arrayList.size() == 0 && !((Boolean) pairD.second).booleanValue()) {
                        AnonymousClass4.this.f45491c.k(0);
                        return;
                    }
                    AnonymousClass4.this.f45491c.k(3);
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    sg.bigo.ads.common.p.e.a(d.this.f45584b.f47035e, arrayList, anonymousClass4.f45491c.al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.b.d.4.1.1
                        @Override // sg.bigo.ads.common.p.g
                        public final void a(int i2, String str, String str2) {
                            AnonymousClass4.this.f45491c.k(1);
                            if (((Boolean) pairD.second).booleanValue()) {
                                VideoController videoController = d.this.getVideoController();
                                if (videoController == null || videoController.getLoadHTMLCallback() == null) {
                                    AnonymousClass4.this.f45491c.bj();
                                } else {
                                    videoController.getLoadHTMLCallback().a();
                                }
                            }
                        }

                        @Override // sg.bigo.ads.common.p.g
                        public final void a(Bitmap bitmap, sg.bigo.ads.common.p.f fVar) {
                            AnonymousClass4.this.f45491c.k(2);
                            AnonymousClass4.this.f45491c.a(new Pair<>(bitmap, fVar.f47426e));
                            VideoController videoController = d.this.getVideoController();
                            if (videoController != null) {
                                videoController.notifyBackupResourceReady();
                            }
                        }
                    });
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void b(int i2) {
                    sg.bigo.ads.core.a.a aVar;
                    int i3;
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    d dVar2 = d.this;
                    if (dVar2.f45586e || dVar2.f) {
                        return;
                    }
                    if (anonymousClass4.f45491c.aO()) {
                        aVar = AnonymousClass4.this.f45491c;
                        i3 = 3;
                    } else {
                        aVar = AnonymousClass4.this.f45491c;
                        i3 = 4;
                    }
                    aVar.h(i3);
                    AnonymousClass4 anonymousClass5 = AnonymousClass4.this;
                    anonymousClass5.f45490b.a(d.this, IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, i2, "Failed to download media video.");
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void a(int i2) {
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    final d dVar2 = d.this;
                    final sg.bigo.ads.core.a.a aVar = anonymousClass4.f45491c;
                    if (!dVar2.G() && !dVar2.M && aVar != null && aVar.aR()) {
                        dVar2.M = true;
                        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.b.e.1

                            /* JADX INFO: renamed from: a */
                            final /* synthetic */ sg.bigo.ads.core.a.a f45499a;

                            public AnonymousClass1() {
                                aVar = aVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    String strB = o.b(e.this.f45584b.f47035e, aVar.aN());
                                    if (TextUtils.isEmpty(strB)) {
                                        return;
                                    }
                                    File file = new File(URI.create(strB));
                                    if (!file.exists() || file.length() <= 0) {
                                        return;
                                    }
                                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                                    e.this.y = sg.bigo.ads.common.w.b.a(bitmapDecodeFile);
                                } catch (Throwable unused) {
                                }
                            }
                        });
                    }
                    d.this.a("is_cache", Boolean.valueOf(i2 == 0));
                    AnonymousClass4.this.f45491c.ba();
                    d.a(d.this);
                    d dVar3 = d.this;
                    if (dVar3.f45586e || dVar3.f) {
                        return;
                    }
                    d.b(dVar3, i2);
                    AnonymousClass4 anonymousClass5 = AnonymousClass4.this;
                    anonymousClass5.f45490b.a(d.this);
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void a(String str, sg.bigo.ads.common.h.a aVar) {
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    d dVar2 = d.this;
                    if (dVar2.f45586e || dVar2.f) {
                        return;
                    }
                    anonymousClass4.f45491c.h(2);
                    if (AnonymousClass4.this.d.x() != 1) {
                        AnonymousClass4 anonymousClass5 = AnonymousClass4.this;
                        anonymousClass5.f45490b.a(d.this, aVar.d(), IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, 10202, "video download failed and no backup creative resource.", true);
                    } else if (AnonymousClass4.this.f45491c.bh() != null || aVar.d()) {
                        AnonymousClass4 anonymousClass6 = AnonymousClass4.this;
                        anonymousClass6.f45490b.a(d.this);
                    } else {
                        sg.bigo.ads.core.d.b.a(AnonymousClass4.this.f45491c, aVar.f47252b, str, 0L, aVar.g / 1024, 2, "video", aVar.o);
                        AnonymousClass4 anonymousClass7 = AnonymousClass4.this;
                        anonymousClass7.f45490b.a(d.this, IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, 10202, "video download failed and no backup creative resource.");
                    }
                }
            };
            sg.bigo.ads.core.player.b bVarA = sg.bigo.ads.core.player.b.a();
            d dVar2 = d.this;
            bVarA.a(dVar2.f45584b.f47035e, this.f45491c, dVar2.x);
        }
    }

    public class a implements AdInteractionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        AdInteractionListener f45496a;

        public a() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClicked() {
            AdInteractionListener adInteractionListener = this.f45496a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClicked();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClosed() {
            AdInteractionListener adInteractionListener = this.f45496a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClosed();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdError(AdError adError) {
            if (this.f45496a != null) {
                if (adError.getCode() == 2002 && d.this.n()) {
                    sg.bigo.ads.common.t.a.a(0, 3, "NativeVideoAdImpl", "don't call onAdError when video has impressed");
                } else {
                    this.f45496a.onAdError(adError);
                }
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdImpression() {
            AdInteractionListener adInteractionListener = this.f45496a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdImpression();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdOpened() {
            AdInteractionListener adInteractionListener = this.f45496a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdOpened();
            }
        }
    }

    public d(sg.bigo.ads.api.core.g gVar) {
        super(gVar);
        this.f45481z = new AtomicBoolean(false);
        this.X = new a();
        this.Z = new sg.bigo.ads.core.g.c() { // from class: sg.bigo.ads.ad.b.d.1
            @Override // sg.bigo.ads.core.g.c
            public final void a(String str, Object obj, int[] iArr) {
                d.a(d.this, str, obj, iArr);
            }

            @Override // sg.bigo.ads.core.g.c
            public final void a(String str, int[] iArr) {
                d.a(d.this, str, iArr);
            }
        };
    }

    public static /* synthetic */ int a(d dVar, String str) {
        if (q.a((CharSequence) str)) {
            return 10074;
        }
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) dVar.f();
        k kVarE = dVar.E();
        p pVarA = kVarE.a(dVar.f45584b.f47035e, str);
        int i2 = kVarE.f48511a;
        String str2 = kVarE.f48513c;
        long j = kVarE.f48512b;
        if (i.f46986a.n().a(9) && URLUtil.isHttpUrl(str2)) {
            sg.bigo.ads.core.d.b.a(aVar, i2, str2, j, 10076, "Invalid http url");
            return 10076;
        }
        if (pVarA != null && pVarA.f48535n != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(pVarA.f48535n.f48495c.hashCode());
            pVarA.o = sb.toString();
            dVar.f45479J = new sg.bigo.ads.core.player.c(dVar.f45584b.f47035e, pVarA, dVar.d);
            aVar.a(pVarA);
            dVar.K = pVarA;
            dVar.D();
            sg.bigo.ads.core.d.b.a(aVar, i2, j);
            return 0;
        }
        sg.bigo.ads.core.f.a.e eVar = kVarE.d;
        List<n> list = kVarE.f48514e;
        if (eVar == null) {
            return 10075;
        }
        int i3 = eVar.f48499a;
        if (i3 != 10062) {
        }
        Context context = dVar.f45584b.f47035e;
        sg.bigo.ads.core.f.a.f fVar = sg.bigo.ads.core.f.a.f.XML_PARSING_ERROR;
        sg.bigo.ads.core.player.c.a(context, list);
        sg.bigo.ads.core.d.b.a(aVar, i2, str2, j, i3, eVar.f48500b);
        return i3;
    }

    @Override // sg.bigo.ads.ad.b.c
    public final List<sg.bigo.ads.core.c.a> A() {
        List<sg.bigo.ads.core.c.a> list;
        p pVar = this.K;
        return (pVar == null || (list = pVar.C) == null || list.size() <= 0) ? super.A() : list;
    }

    @Override // sg.bigo.ads.ad.b.c
    public final boolean C() {
        return ((sg.bigo.ads.core.a.a) f()).aR();
    }

    public final Pair<Boolean, Boolean> D() {
        boolean z2;
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        Pair<Boolean, Boolean> pair = this.y;
        if (pair != null) {
            return pair;
        }
        p pVar = this.K;
        boolean z3 = false;
        if (pVar != null) {
            z2 = false;
            for (sg.bigo.ads.core.f.a.a aVar2 : pVar.f48526A) {
                if (aVar2 != null) {
                    sg.bigo.ads.core.f.a.a.C0869a c0869aA = sg.bigo.ads.core.f.a.a.a(aVar2.f48472b);
                    if (!z3 && c0869aA != null && c0869aA.a()) {
                        aVar.a(c0869aA);
                        z3 = true;
                    }
                    sg.bigo.ads.core.f.a.a.C0869a c0869aA2 = sg.bigo.ads.core.f.a.a.a(aVar2.f48471a);
                    if (!z2 && c0869aA2 != null && c0869aA2.a()) {
                        aVar.b(c0869aA2);
                        z2 = true;
                    }
                }
            }
        } else {
            z2 = false;
        }
        Pair<Boolean, Boolean> pair2 = new Pair<>(Boolean.valueOf(z3), Boolean.valueOf(z2));
        this.y = pair2;
        return pair2;
    }

    public k E() {
        int iG = this.f45584b.f47033b.g();
        h hVar = i.f46986a;
        return new k(iG, (hVar == null || hVar.r() == null) ? 0 : hVar.r().a());
    }

    @Override // sg.bigo.ads.ad.c
    public final void a_() {
        g gVar = this.f45480Y;
        if (gVar == null || !gVar.a()) {
            super.a_();
            sg.bigo.ads.common.t.a.a(0, 3, "NativeVideoAdImpl", "BIGOAds impression method");
        }
    }

    @Override // sg.bigo.ads.ad.b.c, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public void destroyInMainThread() {
        VideoController videoController = getVideoController();
        if (videoController != null) {
            videoController.setVideoLifeCallback(null);
        }
        super.destroyInMainThread();
        sg.bigo.ads.core.player.c cVar = this.f45479J;
        if (cVar != null) {
            if (cVar.f48842c && !cVar.f48841b) {
                cVar.f48841b = true;
            }
            p pVar = cVar.f48840a;
            if (pVar != null) {
                Iterator<n> it = pVar.f48534l.iterator();
                while (it.hasNext()) {
                    cVar.a(it.next(), "va_des");
                }
            }
            sg.bigo.ads.common.t.a.a(0, 3, "AdTracker", "destroy");
            cVar.f = null;
        }
        g gVar = this.f45480Y;
        if (gVar != null) {
            sg.bigo.ads.core.player.b.d dVar = gVar.f45508h;
            if (dVar != null) {
                u.b(dVar);
                gVar.f45508h.d();
                gVar.f45508h = null;
            }
            gVar.f45504a = null;
            gVar.f45506c = null;
            gVar.g = null;
            gVar.d = null;
            this.f45480Y = null;
        }
        this.x = null;
    }

    @Override // sg.bigo.ads.ad.b.c, sg.bigo.ads.api.NativeAd
    public NativeAd.CreativeType getCreativeType() {
        return NativeAd.CreativeType.VIDEO;
    }

    @Override // sg.bigo.ads.ad.b.c, sg.bigo.ads.api.NativeAd
    public VideoController getVideoController() {
        MediaView mediaView = this.f45464F;
        if (mediaView != null) {
            return mediaView.getVideoController();
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.b.c, sg.bigo.ads.ad.c
    public void h() {
        super.h();
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        sg.bigo.ads.core.player.c cVar = this.f45479J;
        if (cVar != null) {
            if (!cVar.f48841b) {
                cVar.f48841b = true;
            }
            sg.bigo.ads.core.player.c.a(aVar, 1);
            Iterator<n> it = cVar.f48840a.f48528a.iterator();
            while (it.hasNext()) {
                cVar.a(it.next(), "va_show");
            }
        }
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    public void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        super.setAdInteractionListener(this.X);
        this.X.f45496a = adInteractionListener;
    }

    public static /* synthetic */ void b(d dVar, int i2) {
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) dVar.f();
        int i3 = 1;
        if (i2 != 0) {
            if (i2 != 1) {
                i3 = i2 != 2 ? 0 : 3;
            } else {
                i3 = 4;
            }
        }
        aVar.h(i3);
    }

    @Override // sg.bigo.ads.ad.b.c, sg.bigo.ads.ad.c
    public final void a(Point point, int i2, int i3, sg.bigo.ads.api.core.e eVar) {
        super.a(point, i2, i3, eVar);
        sg.bigo.ads.core.player.c cVar = this.f45479J;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // sg.bigo.ads.ad.b.c
    public final void a(ViewGroup viewGroup, MediaView mediaView, ImageView imageView, AdOptionsView adOptionsView, List<View> list, int i2, View... viewArr) {
        super.a(viewGroup, mediaView, imageView, adOptionsView, list, i2, viewArr);
        sg.bigo.ads.core.player.c cVar = this.f45479J;
        if (cVar != null) {
            cVar.f = ((c) this).D;
        }
    }

    public static /* synthetic */ void a(d dVar) {
        VideoController videoController = dVar.getVideoController();
        if (videoController != null) {
            videoController.notifyResourceReady();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static /* synthetic */ void a(d dVar, String str, Object obj, int[] iArr) {
        sg.bigo.ads.api.b.d.a<T> aVar;
        sg.bigo.ads.core.a.a aVar2 = (sg.bigo.ads.core.a.a) dVar.f();
        str.getClass();
        switch (str) {
            case "AdLoaded":
                g gVar = dVar.f45480Y;
                if (gVar != null && (aVar = gVar.f45507e) != 0) {
                    aVar.a(gVar.f45504a);
                    break;
                }
                break;
            case "AdVideoThirdQuartile":
                sg.bigo.ads.core.player.c cVar = dVar.f45479J;
                if (cVar != null) {
                    Iterator<Integer> it = cVar.j.iterator();
                    while (it.hasNext()) {
                        int iIntValue = it.next().intValue();
                        if (75 >= iIntValue) {
                            if (iIntValue == 75) {
                                sg.bigo.ads.core.c.b bVar = cVar.f;
                                if (bVar != null) {
                                    bVar.a(sg.bigo.ads.core.c.b.EnumC0866b.f48338c);
                                }
                                iIntValue = 5;
                            }
                            sg.bigo.ads.core.player.c.a(aVar2, iIntValue);
                            it.remove();
                        }
                    }
                    break;
                }
                break;
            case "AdVideoMidpoint":
                sg.bigo.ads.core.player.c cVar2 = dVar.f45479J;
                if (cVar2 != null) {
                    Iterator<Integer> it2 = cVar2.j.iterator();
                    while (it2.hasNext()) {
                        int iIntValue2 = it2.next().intValue();
                        if (50 >= iIntValue2) {
                            if (iIntValue2 == 50) {
                                sg.bigo.ads.core.c.b bVar2 = cVar2.f;
                                if (bVar2 != null) {
                                    bVar2.a(sg.bigo.ads.core.c.b.EnumC0866b.f48337b);
                                }
                                iIntValue2 = 4;
                            }
                            sg.bigo.ads.core.player.c.a(aVar2, iIntValue2);
                            it2.remove();
                        }
                    }
                    break;
                }
                break;
            case "AdVideoFirstQuartile":
                sg.bigo.ads.core.player.c cVar3 = dVar.f45479J;
                if (cVar3 != null) {
                    Iterator<Integer> it3 = cVar3.j.iterator();
                    while (it3.hasNext()) {
                        int iIntValue3 = it3.next().intValue();
                        if (25 >= iIntValue3) {
                            if (iIntValue3 == 25) {
                                sg.bigo.ads.core.c.b bVar3 = cVar3.f;
                                if (bVar3 != null) {
                                    bVar3.a(sg.bigo.ads.core.c.b.EnumC0866b.f48336a);
                                }
                                iIntValue3 = 3;
                            }
                            sg.bigo.ads.core.player.c.a(aVar2, iIntValue3);
                            it3.remove();
                        }
                    }
                    break;
                }
                break;
            case "AdVPAIDClickThru":
                if (iArr != null && iArr.length > 0) {
                    dVar.a(obj instanceof sg.bigo.ads.common.i ? (sg.bigo.ads.common.i) obj : null, 12, 5);
                    break;
                }
                break;
            case "AdError":
                g gVar2 = dVar.f45480Y;
                if (gVar2 != null) {
                    String str2 = obj instanceof String ? (String) obj : "VPAID error";
                    sg.bigo.ads.api.b.d.a<T> aVar3 = gVar2.f45507e;
                    if (aVar3 != 0) {
                        aVar3.a(gVar2.f45504a, 1006, 10222, str2);
                    }
                    break;
                }
                break;
            case "AdVPAIDImpression":
                g gVar3 = dVar.f45480Y;
                if (gVar3 != null && gVar3.a()) {
                    sg.bigo.ads.common.t.a.a(0, 3, "NativeVideoAdImpl", "vpaid impression method");
                    super.a_();
                    break;
                }
                break;
            case "AdVideoStart":
                sg.bigo.ads.core.player.c cVar4 = dVar.f45479J;
                if (cVar4 != null) {
                    Iterator<Integer> it4 = cVar4.j.iterator();
                    while (it4.hasNext()) {
                        int iIntValue4 = it4.next().intValue();
                        if (iIntValue4 <= 0) {
                            if (iIntValue4 == 0) {
                                sg.bigo.ads.core.c.b bVar4 = cVar4.f;
                                if (bVar4 != null) {
                                    bVar4.a(cVar4.f48840a.s, cVar4.g ? 0.0f : 1.0f);
                                }
                                iIntValue4 = 2;
                            }
                            sg.bigo.ads.core.player.c.a(aVar2, iIntValue4);
                            it4.remove();
                        }
                    }
                    break;
                }
                break;
        }
    }

    public static /* synthetic */ void a(d dVar, String str, int[] iArr) {
        VideoController.VideoLifeCallback videoLifeCallback;
        VideoController.d progressChangeListener;
        VideoController.a backupLoadCallback;
        boolean z2 = false;
        VideoController videoController = dVar.getVideoController();
        if (videoController != null) {
            videoLifeCallback = videoController.getVideoLifeCallback();
            progressChangeListener = videoController.getProgressChangeListener();
            backupLoadCallback = videoController.getBackupLoadCallback();
        } else {
            videoLifeCallback = null;
            progressChangeListener = null;
            backupLoadCallback = null;
        }
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) dVar.f();
        str.getClass();
        switch (str) {
            case "AdClosed":
                sg.bigo.ads.core.player.c cVar = dVar.f45479J;
                if (cVar != null) {
                    cVar.a(cVar.f48840a.f48531e, "va_close");
                    break;
                }
                break;
            case "AdBackupImgReady":
                if (backupLoadCallback != null) {
                    backupLoadCallback.i(((iArr == null || iArr.length <= 0) ? 0 : iArr[0]) != 0);
                    break;
                }
                break;
            case "AdLoaded":
                sg.bigo.ads.core.player.c cVar2 = dVar.f45479J;
                if (cVar2 != null) {
                    cVar2.f48842c = true;
                    break;
                }
                break;
            case "AdVideoBuffered":
                if (videoLifeCallback instanceof VideoController.b) {
                    ((VideoController.b) videoLifeCallback).b();
                    break;
                }
                break;
            case "AdVideoComplete":
                if (videoLifeCallback != null) {
                    videoLifeCallback.onVideoEnd();
                }
                sg.bigo.ads.core.player.c cVar3 = dVar.f45479J;
                if (cVar3 != null) {
                    cVar3.a(cVar3.f48840a.d, "va_comp");
                    cVar3.a(cVar3.f48840a.f48529b, "va_prog1");
                    cVar3.a(cVar3.f48840a.f48530c, "va_prog2");
                    if (!cVar3.f48845i) {
                        cVar3.f48845i = true;
                        sg.bigo.ads.core.player.c.a(aVar, 6);
                        sg.bigo.ads.core.c.b bVar = cVar3.f;
                        if (bVar != null) {
                            bVar.a(sg.bigo.ads.core.c.b.EnumC0866b.d);
                        }
                    }
                }
                if (sg.bigo.ads.api.core.b.e(aVar.x()) && dVar.f45584b.f47033b.h()) {
                    z2 = true;
                }
                boolean z3 = dVar instanceof sg.bigo.ads.ad.b.a.b;
                if ((z2 || z3 || dVar.L) && videoController != null) {
                    videoController.play();
                    break;
                }
                break;
            case "AdVolumeChange":
                if (iArr != null && iArr.length > 0) {
                    int i2 = iArr[0];
                    if (videoLifeCallback != null) {
                        videoLifeCallback.onMuteChange(i2 == 0);
                    }
                    sg.bigo.ads.core.player.c cVar4 = dVar.f45479J;
                    if (cVar4 != null) {
                        sg.bigo.ads.core.player.c.a(aVar, i2 == 0 ? 7 : 17);
                        p pVar = cVar4.f48840a;
                        if (pVar != null) {
                            Iterator<j> it = pVar.g.iterator();
                            while (it.hasNext()) {
                                j next = it.next();
                                if ((i2 == 0 && next.f48510a) || (i2 == 100 && !next.f48510a)) {
                                    cVar4.a(next, "va_mst");
                                    it.remove();
                                }
                            }
                        }
                        cVar4.g = i2 / 100 == 0;
                        sg.bigo.ads.core.c.b bVar2 = cVar4.f;
                        if (bVar2 != null) {
                            float f = i2 / 100.0f;
                            MediaEvents mediaEvents = bVar2.f48326a;
                            if (mediaEvents != null && bVar2.f48327b) {
                                mediaEvents.volumeChange(f);
                                bVar2.a("video volume change: ".concat(String.valueOf(f)));
                                break;
                            }
                        }
                    }
                }
                break;
            case "AdSkipped":
                sg.bigo.ads.core.player.c cVar5 = dVar.f45479J;
                if (cVar5 != null) {
                    cVar5.a(cVar5.f48840a.f, "va_skip");
                    sg.bigo.ads.core.c.b bVar3 = cVar5.f;
                    if (bVar3 != null) {
                        bVar3.b(sg.bigo.ads.core.c.b.a.f48335e);
                    }
                    break;
                }
                break;
            case "AdError":
            case "AdVideoTooLate":
                sg.bigo.ads.core.player.c cVar6 = dVar.f45479J;
                if (cVar6 != null) {
                    String str2 = sg.bigo.ads.core.f.a.f.GENERAL_LINEAR_AD_ERROR.g;
                    ArrayList<n> arrayList = cVar6.f48840a.k;
                    if (arrayList != null) {
                        Iterator<n> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            n next2 = it2.next();
                            String str3 = next2.f48522b;
                            if (q.a((CharSequence) str3) || (next2.f48523c && !next2.d)) {
                                sg.bigo.ads.common.t.a.a(0, "VASTController", "invalidate tracking url or is tracked");
                            } else {
                                String strA = sg.bigo.ads.core.player.c.a(str3);
                                String strA2 = q.a((CharSequence) strA) ? "" : q.a(strA, "[ERRORCODE]", str2, false);
                                next2.f48523c = true;
                                if (!q.a((CharSequence) strA2)) {
                                    cVar6.f48843e.a(cVar6.f48844h, "va_err", strA2, "bigoad");
                                    p005e.a.d(0, 3, strA2, "Send track info, action: va_err, url: ", "VASTController");
                                }
                            }
                            it2.remove();
                        }
                    }
                    sg.bigo.ads.core.player.c.a(aVar, 16);
                    if (iArr != null) {
                        dVar.a(2002, "Video error: " + iArr[0]);
                    }
                    break;
                }
                break;
            case "AdVideoPaused":
                if (videoLifeCallback != null) {
                    videoLifeCallback.onVideoPause();
                }
                sg.bigo.ads.core.player.c cVar7 = dVar.f45479J;
                if (cVar7 != null) {
                    cVar7.d = true;
                    Iterator<n> it3 = cVar7.f48840a.f48532h.iterator();
                    while (it3.hasNext()) {
                        cVar7.a(it3.next(), "va_pau");
                    }
                    sg.bigo.ads.core.c.b bVar4 = cVar7.f;
                    if (bVar4 != null) {
                        bVar4.b(sg.bigo.ads.core.c.b.a.f48332a);
                    }
                    break;
                }
                break;
            case "AdVideoStart":
                if (videoLifeCallback != null) {
                    videoLifeCallback.onVideoStart();
                    break;
                }
                break;
            case "AdVideoBuffering":
                if (videoLifeCallback instanceof VideoController.b) {
                    ((VideoController.b) videoLifeCallback).a();
                    break;
                }
                break;
            case "AdVideoPlaying":
                if (videoLifeCallback != null) {
                    videoLifeCallback.onVideoPlay();
                }
                sg.bigo.ads.core.player.c cVar8 = dVar.f45479J;
                if (cVar8 != null && cVar8.d) {
                    cVar8.d = false;
                    Iterator<n> it4 = cVar8.f48840a.f48533i.iterator();
                    while (it4.hasNext()) {
                        cVar8.a(it4.next(), "va_res");
                    }
                    sg.bigo.ads.core.c.b bVar5 = cVar8.f;
                    if (bVar5 != null) {
                        bVar5.b(sg.bigo.ads.core.c.b.a.f48333b);
                    }
                    break;
                }
                break;
            case "AdRemainingTimeChange":
                if (iArr != null && iArr.length > 2) {
                    sg.bigo.ads.core.player.c cVar9 = dVar.f45479J;
                    if (cVar9 != null && iArr.length > 2) {
                        int i3 = iArr[0];
                        int i4 = iArr[2];
                        Iterator<l> it5 = cVar9.f48840a.f48529b.iterator();
                        while (it5.hasNext()) {
                            l next3 = it5.next();
                            if (i4 >= next3.f48519a) {
                                cVar9.a(next3, "va_prog1");
                                it5.remove();
                            }
                        }
                        Iterator<sg.bigo.ads.core.f.a.c> it6 = cVar9.f48840a.f48530c.iterator();
                        while (it6.hasNext()) {
                            sg.bigo.ads.core.f.a.c next4 = it6.next();
                            if (i3 >= next4.f48497a) {
                                cVar9.a(next4, "va_prog2");
                                it6.remove();
                            }
                        }
                        Iterator<Integer> it7 = cVar9.k.iterator();
                        while (it7.hasNext()) {
                            int iIntValue = it7.next().intValue();
                            if (i3 >= iIntValue) {
                                if (iIntValue == 2000) {
                                    iIntValue = 11;
                                } else if (iIntValue == 3000) {
                                    iIntValue = 12;
                                } else if (iIntValue == 5000) {
                                    iIntValue = 13;
                                } else if (iIntValue == 8000) {
                                    iIntValue = 14;
                                } else if (iIntValue == 10000) {
                                    iIntValue = 15;
                                }
                                sg.bigo.ads.core.player.c.a(aVar, iIntValue);
                                it7.remove();
                            }
                        }
                        Iterator<Integer> it8 = cVar9.j.iterator();
                        while (it8.hasNext()) {
                            int iIntValue2 = it8.next().intValue();
                            if (i4 >= iIntValue2) {
                                if (iIntValue2 == 0) {
                                    sg.bigo.ads.core.c.b bVar6 = cVar9.f;
                                    if (bVar6 != null) {
                                        bVar6.a(cVar9.f48840a.s, cVar9.g ? 0.0f : 1.0f);
                                    }
                                    iIntValue2 = 2;
                                } else if (iIntValue2 == 25) {
                                    sg.bigo.ads.core.c.b bVar7 = cVar9.f;
                                    if (bVar7 != null) {
                                        bVar7.a(sg.bigo.ads.core.c.b.EnumC0866b.f48336a);
                                    }
                                    iIntValue2 = 3;
                                } else if (iIntValue2 == 50) {
                                    sg.bigo.ads.core.c.b bVar8 = cVar9.f;
                                    if (bVar8 != null) {
                                        bVar8.a(sg.bigo.ads.core.c.b.EnumC0866b.f48337b);
                                    }
                                    iIntValue2 = 4;
                                } else if (iIntValue2 == 75) {
                                    sg.bigo.ads.core.c.b bVar9 = cVar9.f;
                                    if (bVar9 != null) {
                                        bVar9.a(sg.bigo.ads.core.c.b.EnumC0866b.f48338c);
                                    }
                                    iIntValue2 = 5;
                                }
                                sg.bigo.ads.core.player.c.a(aVar, iIntValue2);
                                it8.remove();
                            }
                        }
                    }
                    if (progressChangeListener != null) {
                        progressChangeListener.a(iArr[0], iArr[1]);
                    }
                    break;
                }
                break;
        }
    }

    @Override // sg.bigo.ads.ad.b.c
    public void a(MediaView mediaView) {
        g gVar;
        if (this.K == null || mediaView == null) {
            return;
        }
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        if (!aVar.aS() || (gVar = this.f45480Y) == null) {
            mediaView.a(aVar, this.K, this.Z);
            VideoController videoController = mediaView.getVideoController();
            if (videoController != null) {
                videoController.mute(this.f45584b.f47033b.i());
                return;
            }
            return;
        }
        boolean zI = this.f45584b.f47033b.i();
        if (gVar.d != null) {
            mediaView.a(gVar.f45508h);
            VideoController videoController2 = mediaView.getVideoController();
            if (videoController2 != null) {
                videoController2.mute(zI);
            }
        }
    }

    @Override // sg.bigo.ads.ad.b.c
    public void a(final sg.bigo.ads.api.b.d.a<NativeAd> aVar, int i2) {
        sg.bigo.ads.api.a.j jVarN;
        final sg.bigo.ads.api.core.c cVar = this.f45584b.f47032a;
        if (!(cVar instanceof sg.bigo.ads.core.a.a)) {
            aVar.a(this, IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, 1400, "NativeVideo with invalid AdData class type.");
            return;
        }
        sg.bigo.ads.api.core.o.c cVarAy = ((sg.bigo.ads.core.a.a) cVar).ay();
        if (cVarAy == null) {
            aVar.a(this, IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, 1401, "Missing media video.");
            return;
        }
        final String strC = cVarAy.c();
        h hVar = i.f46986a;
        if (hVar == null || (jVarN = hVar.n()) == null || !jVarN.a(14)) {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.b.d.3
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.a(aVar, cVar, d.a(d.this, strC), false);
                }
            });
        } else {
            sg.bigo.ads.common.u.a.e.f().execute(new Runnable() { // from class: sg.bigo.ads.ad.b.d.2
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.a(aVar, cVar, d.a(d.this, strC), true);
                }
            });
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void a(sg.bigo.ads.api.b.d.a<NativeAd> aVar, sg.bigo.ads.api.core.c cVar, int i2, boolean z2) {
        m mVarE;
        sg.bigo.ads.core.a.a aVar2 = (sg.bigo.ads.core.a.a) f();
        if (!aVar2.aS()) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(i2, aVar, aVar2, cVar);
            if (z2) {
                sg.bigo.ads.common.n.d.a(1, anonymousClass4);
                return;
            } else {
                anonymousClass4.run();
                return;
            }
        }
        this.W.f47058a = aVar2.bo();
        g gVar = new g(this.f45584b.f47035e, this.Z, aVar2, this.K, aVar, this);
        this.f45480Y = gVar;
        int iX = gVar.f45506c.x();
        if (iX == 1 || iX == 2 || !(iX == 3 || iX == 4 || (iX == 12 ? !((mVarE = gVar.f45506c.e()) == null || 6 != mVarE.a("video_play_page.ad_component_layout", 1)) : iX == 20))) {
            gVar.f45507e.a(gVar.f45504a, 1006, 10066, "Failed to support VPAID.");
            return;
        }
        g.AnonymousClass1 anonymousClass1 = new g.AnonymousClass1(i2);
        if (z2) {
            sg.bigo.ads.common.n.d.a(1, anonymousClass1);
        } else {
            anonymousClass1.run();
        }
    }

    public static /* synthetic */ boolean a(d dVar, int i2) {
        return ((sg.bigo.ads.core.a.a) dVar.f()).x() != 4 || i2 >= 5;
    }
}
