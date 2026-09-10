package sg.bigo.ads.controller.loader;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.api.a.h;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.b;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.api.core.c;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.api.core.p;
import sg.bigo.ads.api.core.q;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractAdLoader<U extends Ad, T extends sg.bigo.ads.api.b> implements AdLoader<T>, d.a<U> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Long> f48221a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, List<a>> f48222b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f<U> f48223c;
    private final String d;

    public abstract class a implements sg.bigo.ads.controller.d<U> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        c[] f48257e;
        c[] f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f48258h;
        sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> j;
        sg.bigo.ads.api.b k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final AbstractAdLoader f48260l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f48256c = false;
        boolean d = false;
        boolean g = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f48255a = false;
        final Runnable m = new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.a.1
            @Override // java.lang.Runnable
            public final void run() {
                int i2;
                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The request is timeout.");
                a aVar = a.this;
                sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> c0859a = aVar.j;
                if (c0859a == null || aVar.g) {
                    return;
                }
                aVar.f48256c = true;
                c0859a.f48083c = true;
                if (c0859a.f == 0) {
                    c0859a.f = c0859a.f48084e;
                }
                if (k.a(aVar.f48257e)) {
                    a aVar2 = a.this;
                    sg.bigo.ads.controller.loader.a.a(aVar2.f48257e, aVar2.j.f);
                    a aVar3 = a.this;
                    if (aVar3.f48256c) {
                        i2 = 2;
                    } else {
                        i2 = aVar3.d ? 4 : 1;
                    }
                    sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> c0859a2 = aVar3.j;
                    sg.bigo.ads.controller.loader.a.a(aVar3.f48257e, i2, c0859a2 == null ? 1 : c0859a2.f, true);
                }
                AbstractAdLoader<U, T>.a aVar4 = a.this;
                AbstractAdLoader.this.a(aVar4, 1011, 10206, "Ad request is timeout due to bad network.", new Pair<>(aVar4.j.f48081a, null));
            }
        };

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final long f48259i = SystemClock.elapsedRealtime();

        public a(AbstractAdLoader abstractAdLoader, sg.bigo.ads.api.b bVar, String str) {
            this.f48258h = str;
            this.f48260l = abstractAdLoader;
            this.k = bVar;
        }

        public final void a() {
            sg.bigo.ads.common.n.d.a(this.m);
            if (this.f48255a) {
                return;
            }
            this.f48255a = true;
            StringBuilder sb = new StringBuilder("Remove timeout task for session id: ");
            sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> c0859a = this.j;
            p005e.a.f(sb, 0, c0859a == null ? "unknown" : c0859a.f48081a.g.f46992b, 3, "AbstractAdLoader");
        }

        public final String b() {
            sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> c0859a = this.j;
            String str = c0859a == null ? null : c0859a.f48081a.f46987a;
            return TextUtils.isEmpty(str) ? this.f48258h : str;
        }
    }

    public interface b<U extends Ad, T extends sg.bigo.ads.api.b> extends d.a<U> {
        AbstractAdLoader<U, T> a();
    }

    public AbstractAdLoader(AdLoadListener<U> adLoadListener, String str) {
        if (adLoadListener == null) {
            this.f48223c = new f<>();
        } else {
            this.f48223c = new f<>(adLoadListener);
        }
        this.d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, AbstractAdLoader<U, T>.a aVar) {
        List<a> list;
        if (TextUtils.isEmpty(str) || (list = f48222b.get(str)) == null || list.size() <= 0) {
            return;
        }
        list.remove(aVar);
    }

    private boolean b(final T t) {
        String[] strArrSplit;
        String str;
        boolean zIsInitialized = BigoAdSdk.isInitialized();
        boolean z2 = !zIsInitialized;
        Context applicationContext = null;
        if (!zIsInitialized) {
            Activity activityB = sg.bigo.ads.common.f.b.b();
            applicationContext = activityB != null ? activityB.getApplicationContext() : null;
            if (applicationContext == null) {
                applicationContext = sg.bigo.ads.common.f.b.a();
            }
            z2 = applicationContext != null;
        }
        String str2 = "";
        if (z2) {
            String str3 = t.f46987a;
            if (str3 != null && !str3.isEmpty() && (strArrSplit = str3.split(TokenBuilder.TOKEN_DELIMITER)) != null && strArrSplit.length >= 2 && (str = strArrSplit[0]) != null && !str.isEmpty()) {
                str2 = strArrSplit[0];
            }
            z2 = (str2 == null || str2.isEmpty()) ? false : true;
        }
        if (z2) {
            sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "Initialize bigo sdk before requesting ad.");
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        AbstractAdLoader.this.a(t);
                    }
                }
            }, 1000L);
            try {
                AdConfig.Builder builder = new AdConfig.Builder();
                builder.setAppId(str2);
                BigoAdSdk.initialize(applicationContext.getApplicationContext(), builder.build(), new BigoAdSdk.InitListener() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.3
                    @Override // sg.bigo.ads.BigoAdSdk.InitListener
                    public final void onInitialized() {
                        sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "Bigo ads sdk initialized before ad load.");
                        if (atomicBoolean.compareAndSet(false, true)) {
                            AbstractAdLoader.this.a(t);
                        }
                    }
                });
                return z2;
            } catch (Exception unused) {
                if (atomicBoolean.compareAndSet(false, true)) {
                    a(t);
                }
            }
        }
        return z2;
    }

    public U a(sg.bigo.ads.api.b bVar, g... gVarArr) {
        return null;
    }

    public void loadAd(T t) {
        if (b(t)) {
            return;
        }
        a(t);
    }

    public U a(g gVar) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, AbstractAdLoader<U, T>.a aVar, U u2, int i2, int i3, String str2) {
        if (!TextUtils.isEmpty(str)) {
            f48221a.remove(str);
        }
        aVar.a();
        aVar.g = true;
        b(aVar.b(), aVar);
        if (aVar.f48256c || aVar.d) {
            sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The error ad has been timeout or assign");
        } else {
            a(str, aVar, sg.bigo.ads.controller.loader.a.a(u2), 0, i2, i3, str2, false, u2);
            a(u2, i2, i3, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, final AbstractAdLoader<U, T>.a aVar, final c[] cVarArr, final int i2, final int i3, final int i4, final String str2, final boolean z2, final Ad ad) {
        boolean zC;
        String strD;
        h hVar;
        if (TextUtils.isEmpty(str)) {
            str = aVar.b();
        }
        final String str3 = str;
        if (TextUtils.isEmpty(str3) || (hVar = i.f46986a) == null) {
            zC = false;
            strD = null;
        } else {
            sg.bigo.ads.api.a.b bVarQ = hVar.q();
            zC = bVarQ.c(str3);
            strD = bVarQ.d(str3);
        }
        final String str4 = strD;
        final boolean z3 = zC;
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.7
            /* JADX WARN: Code duplicated, block: B:102:0x0148  */
            /* JADX WARN: Code duplicated, block: B:104:0x014b  */
            /* JADX WARN: Code duplicated, block: B:111:0x016c  */
            /* JADX WARN: Code duplicated, block: B:116:0x0178  */
            /* JADX WARN: Code duplicated, block: B:118:0x017c  */
            /* JADX WARN: Code duplicated, block: B:121:0x0182  */
            /* JADX WARN: Code duplicated, block: B:123:0x018e  */
            /* JADX WARN: Code duplicated, block: B:65:0x00cc  */
            /* JADX WARN: Code duplicated, block: B:66:0x00d1  */
            /* JADX WARN: Code duplicated, block: B:68:0x00d4  */
            /* JADX WARN: Code duplicated, block: B:70:0x00de  */
            /* JADX WARN: Code duplicated, block: B:71:0x00e0  */
            /* JADX WARN: Code duplicated, block: B:74:0x00ee  */
            /* JADX WARN: Code duplicated, block: B:75:0x00f0  */
            /* JADX WARN: Code duplicated, block: B:77:0x00f6  */
            /* JADX WARN: Code duplicated, block: B:79:0x00fa  */
            /* JADX WARN: Code duplicated, block: B:81:0x0101  */
            /* JADX WARN: Code duplicated, block: B:85:0x0111  */
            /* JADX WARN: Code duplicated, block: B:86:0x0113  */
            /* JADX WARN: Code duplicated, block: B:88:0x0119  */
            /* JADX WARN: Code duplicated, block: B:90:0x011f  */
            /* JADX WARN: Code duplicated, block: B:91:0x0121  */
            /* JADX WARN: Code duplicated, block: B:94:0x0129  */
            /* JADX WARN: Code duplicated, block: B:96:0x0133  */
            /* JADX WARN: Code duplicated, block: B:99:0x013a  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                int i5;
                boolean zU;
                int i6;
                int i7;
                String str5;
                int i8;
                int iA;
                c cVar;
                sg.bigo.ads.api.core.h hVarAa;
                a aVar2;
                sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> c0859a;
                sg.bigo.ads.api.b bVar;
                String strC;
                String str6;
                c cVar2;
                q qVarY;
                Ad ad2;
                p pVarC_;
                String str7;
                boolean z4;
                boolean z5;
                String str8;
                sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> c0859a2;
                sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> c0859a3;
                byte b2 = !z2 && i4 == 10206;
                if (i4 == 10213) {
                    i5 = 3;
                } else {
                    a aVar3 = aVar;
                    if (aVar3.f48256c) {
                        i5 = 2;
                    } else {
                        i5 = aVar3.d ? 4 : 1;
                    }
                }
                a aVar4 = aVar;
                sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> c0859a4 = aVar4.j;
                int i9 = c0859a4 == null ? 0 : c0859a4.f;
                c[] cVarArr2 = cVarArr;
                if (cVarArr2 == null) {
                    cVarArr2 = aVar4.f48257e;
                }
                if (cVarArr2 != null) {
                    sg.bigo.ads.controller.loader.a.a(cVarArr2, i5, i9, false);
                    c cVar3 = (c) k.b(cVarArr2);
                    zU = cVar3 != null ? cVar3.U() : false;
                    c cVar4 = (c) k.b(cVarArr2);
                    int iR = cVar4 != null ? cVar4.R() : 0;
                    c cVar5 = (c) k.b(cVarArr2);
                    String strValueOf = String.valueOf(cVar5 != null ? cVar5.V() : 0);
                    if (zU && i5 == 1) {
                        i7 = 4;
                    } else if (zU && iR == 0) {
                        i6 = 1;
                        i7 = i5;
                        str5 = strValueOf;
                    } else {
                        i7 = i5;
                    }
                    str5 = strValueOf;
                    i6 = iR;
                } else {
                    zU = false;
                    i6 = 0;
                    i7 = i5;
                    str5 = "0";
                }
                if (k.a(aVar.f)) {
                    if (k.a(aVar.f48257e)) {
                        i8 = 0;
                    } else {
                        iA = sg.bigo.ads.controller.loader.a.a(aVar.f48257e);
                    }
                    if (!z3 || zU || b2 == true) {
                        cVar = (c) k.b(cVarArr);
                        if (cVar != null) {
                            hVarAa = cVar.aa();
                        } else {
                            hVarAa = null;
                        }
                        if (hVarAa != null) {
                            strC = hVarAa.c();
                            c0859a3 = aVar.j;
                            if (c0859a3 == null) {
                                str6 = "0";
                            } else {
                                str6 = c0859a3.f48081a.g.f46992b;
                            }
                            if (TextUtils.equals(strC, str6)) {
                                str6 = "0";
                            }
                        } else {
                            aVar2 = aVar;
                            c0859a = aVar2.j;
                            if (c0859a == null) {
                                bVar = aVar2.k;
                                if (bVar == null) {
                                    strC = "0";
                                }
                                str6 = null;
                            } else {
                                bVar = c0859a.f48081a;
                            }
                            strC = bVar.g.f46992b;
                            str6 = null;
                        }
                        cVar2 = (c) k.b(cVarArr);
                        if (cVar2 == null) {
                            qVarY = null;
                        } else {
                            qVarY = cVar2.Y();
                        }
                        if (qVarY == null) {
                            c0859a2 = aVar.j;
                            if (c0859a2 == null) {
                                qVarY = null;
                            } else {
                                qVarY = c0859a2.g;
                            }
                        }
                        ad2 = ad;
                        if (ad2 instanceof sg.bigo.ads.api.b.a) {
                            pVarC_ = ((sg.bigo.ads.api.b.a) ad2).c_();
                        } else {
                            pVarC_ = null;
                        }
                        str7 = str6;
                        String str9 = str3;
                        if (cVar2 == null) {
                            cVar2 = (c) k.b(aVar.f48257e);
                        }
                        String str10 = str4;
                        if (strC == null) {
                            strC = "0";
                        }
                        if (str7 == null) {
                            str7 = "0";
                        }
                        boolean z6 = zU;
                        c cVar6 = cVar2;
                        int i10 = i2;
                        int i11 = i3;
                        int i12 = i4;
                        String str11 = str2;
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - aVar.f48259i;
                        if (qVarY == null && qVarY.f47059a) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (qVarY == null && qVarY.f47060b) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int i13 = qVarY != null ? qVarY.f47061c : 4;
                        if (qVarY != null) {
                            str8 = qVarY.d;
                        } else {
                            str8 = null;
                        }
                        sg.bigo.ads.core.d.b.a(str9, cVar6, str10, strC, str7, i10, i11, i12, str11, jElapsedRealtime, z6 ? 1 : 0, str5, i6, i7, i9, i8, z4, z5, i13, str8, pVarC_);
                    }
                    return;
                }
                iA = sg.bigo.ads.controller.loader.a.a(aVar.f);
                i8 = iA;
                if (z3) {
                }
                cVar = (c) k.b(cVarArr);
                if (cVar != null) {
                    hVarAa = cVar.aa();
                } else {
                    hVarAa = null;
                }
                if (hVarAa != null) {
                    strC = hVarAa.c();
                    c0859a3 = aVar.j;
                    if (c0859a3 == null) {
                        str6 = "0";
                    } else {
                        str6 = c0859a3.f48081a.g.f46992b;
                    }
                    if (TextUtils.equals(strC, str6)) {
                        str6 = "0";
                    }
                } else {
                    aVar2 = aVar;
                    c0859a = aVar2.j;
                    if (c0859a == null) {
                        bVar = aVar2.k;
                        if (bVar == null) {
                            strC = "0";
                        }
                        str6 = null;
                    } else {
                        bVar = c0859a.f48081a;
                    }
                    strC = bVar.g.f46992b;
                    str6 = null;
                }
                cVar2 = (c) k.b(cVarArr);
                if (cVar2 == null) {
                    qVarY = null;
                } else {
                    qVarY = cVar2.Y();
                }
                if (qVarY == null) {
                    c0859a2 = aVar.j;
                    if (c0859a2 == null) {
                        qVarY = null;
                    } else {
                        qVarY = c0859a2.g;
                    }
                }
                ad2 = ad;
                if (ad2 instanceof sg.bigo.ads.api.b.a) {
                    pVarC_ = ((sg.bigo.ads.api.b.a) ad2).c_();
                } else {
                    pVarC_ = null;
                }
                str7 = str6;
                String str12 = str3;
                if (cVar2 == null) {
                    cVar2 = (c) k.b(aVar.f48257e);
                }
                String str13 = str4;
                if (strC == null) {
                    strC = "0";
                }
                if (str7 == null) {
                    str7 = "0";
                }
                boolean z7 = zU;
                c cVar7 = cVar2;
                int i14 = i2;
                int i15 = i3;
                int i16 = i4;
                String str14 = str2;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - aVar.f48259i;
                if (qVarY == null) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (qVarY == null) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                int i17 = qVarY != null ? qVarY.f47061c : 4;
                if (qVarY != null) {
                    str8 = qVarY.d;
                } else {
                    str8 = null;
                }
                sg.bigo.ads.core.d.b.a(str12, cVar7, str13, strC, str7, i14, i15, i16, str14, jElapsedRealtime2, z7 ? 1 : 0, str5, i6, i7, i9, i8, z4, z5, i17, str8, pVarC_);
            }
        });
    }

    @Override // sg.bigo.ads.api.b.d.a
    public final void a(U u2) {
        a((Ad) u2, true);
    }

    @Override // sg.bigo.ads.api.b.d.a
    public final void a(U u2, int i2, int i3, String str) {
        if (u2 instanceof sg.bigo.ads.api.b.a) {
            ((sg.bigo.ads.api.b.a) u2).a(i2, i3, str);
        }
        sg.bigo.ads.common.t.a.a(2, 5, "", "Failed to load ads: (" + i2 + ") " + str);
        this.f48223c.onError(new AdError(i2, str));
    }

    public final void a(Ad ad, boolean z2) {
        boolean z3 = ad instanceof sg.bigo.ads.api.b.a;
        if (z3) {
            ((sg.bigo.ads.api.b.a) ad).b();
        }
        if (z2) {
            if (z3) {
                ((sg.bigo.ads.api.b.a) ad).c();
            }
            this.f48223c.onAdLoaded(ad);
        }
    }

    @Override // sg.bigo.ads.api.b.d.a
    public final void a(U u2, boolean z2, int i2, int i3, String str, boolean z3) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final l lVar, final String str, final AbstractAdLoader<U, T>.a aVar, final Ad ad) {
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.4
            @Override // java.lang.Runnable
            public final void run() {
                if (aVar.f48256c) {
                    sg.bigo.ads.ad.b.a.f45406a.a(lVar, ad);
                    sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> c0859a = aVar.j;
                    StringBuilder sbY = android.support.v4.media.a.y("The request has been timeout before get ad from cache for session id: ", c0859a == null ? "unknown" : c0859a.f48081a.g.f46992b, ", ad: ");
                    sbY.append(String.valueOf(ad));
                    sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", sbY.toString());
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    AbstractAdLoader.f48221a.remove(str);
                }
                sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> c0859a2 = aVar.j;
                sg.bigo.ads.controller.loader.a.a(ad, c0859a2 == null ? "0" : c0859a2.f48081a.g.f46992b);
                a aVar2 = aVar;
                sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> c0859a3 = aVar2.j;
                if (c0859a3 != null) {
                    c0859a3.d = true;
                    if (c0859a3.f == 0) {
                        c0859a3.f = c0859a3.f48084e;
                    }
                }
                aVar2.g = true;
                AbstractAdLoader.b(str, aVar2);
                aVar.a();
                aVar.d = true;
                c[] cVarArrA = sg.bigo.ads.controller.loader.a.a(ad);
                a aVar3 = aVar;
                aVar3.f = cVarArrA;
                sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> c0859a4 = aVar3.j;
                sg.bigo.ads.controller.loader.a.a(cVarArrA, 4, c0859a4 == null ? 1 : c0859a4.f, true);
                AbstractAdLoader.this.a(str, aVar, cVarArrA, 1, 0, 0, null, true, ad);
                sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        aVar.f48260l.a(ad, true);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0076  */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(T t) {
        long jE;
        h hVar;
        t.f46989c = 0;
        t.a(this.d);
        final String str = t.f46987a;
        AbstractAdLoader<U, T>.a aVar = new AbstractAdLoader<U, T>.a(this, t, str) { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.1
            @Override // sg.bigo.ads.controller.e
            public final /* synthetic */ void a(final int i2, final int i3, final int i4, final String str2, Pair<sg.bigo.ads.api.b, l> pair) {
                final Pair<sg.bigo.ads.api.b, l> pair2 = pair;
                sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h hVar2;
                        h hVar3;
                        int i5 = i4;
                        if (AnonymousClass1.this.f48256c && (hVar3 = i.f46986a) != null) {
                            boolean zB = hVar3.q().b(str);
                            int iF = hVar3.q().f(str);
                            if (!zB || iF > 2) {
                                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "Ad data request stop due to tmax strategy.");
                                if (i5 != 10207 && i5 != 10208) {
                                    i5 = 10211;
                                }
                                int i6 = i5;
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                AbstractAdLoader.this.a(this, 1011, i6, str2, anonymousClass1.j == null ? null : new Pair<>(AnonymousClass1.this.j.f48081a, null));
                                return;
                            }
                        }
                        if (AnonymousClass1.this.d && (hVar2 = i.f46986a) != null) {
                            boolean zB2 = hVar2.q().b(str);
                            int iG = hVar2.q().g(str);
                            if (!zB2 || iG > 2) {
                                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "Ad data request stop due to assign strategy.");
                                if (i5 != 10207 && i5 != 10208) {
                                    i5 = 10212;
                                }
                                int i7 = i5;
                                AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                                AbstractAdLoader.this.a(this, 1011, i7, str2, anonymousClass2.j == null ? null : new Pair<>(AnonymousClass1.this.j.f48081a, null));
                                return;
                            }
                        }
                        AbstractAdLoader.this.a(this, i3, i5, str2, pair2);
                    }
                });
            }

            @Override // sg.bigo.ads.controller.e
            public final /* synthetic */ void a(int i2, sg.bigo.ads.api.b bVar, g[] gVarArr) {
                q qVar;
                q qVar2;
                q qVar3;
                q qVar4;
                g gVar;
                h hVar2;
                h hVar3;
                sg.bigo.ads.api.b bVar2 = bVar;
                g[] gVarArr2 = gVarArr;
                c[] cVarArrA = sg.bigo.ads.controller.loader.a.a(gVarArr2);
                this.f48257e = cVarArrA;
                sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> c0859a = this.j;
                boolean z2 = false;
                if (c0859a != null) {
                    sg.bigo.ads.controller.loader.a.a(cVarArrA, c0859a.f);
                    c[] cVarArr = this.f48257e;
                    q qVar5 = this.j.g;
                    if (!k.a(cVarArr)) {
                        for (c cVar : cVarArr) {
                            if (cVar != null) {
                                cVar.a(qVar5);
                            }
                        }
                    }
                }
                bVar2.g.a();
                int i3 = 3;
                String str2 = null;
                if (this.f48256c && (hVar3 = i.f46986a) != null) {
                    boolean zB = hVar3.q().b(str);
                    int iF = hVar3.q().f(str);
                    if (!zB || iF > 2) {
                        sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "Ad data request stop due to tmax strategy.");
                        AbstractAdLoader.this.a(this, 1011, 10209, "no fill", this.j == null ? null : new Pair<>(this.j.f48081a, null));
                        return;
                    }
                }
                if (this.d && (hVar2 = i.f46986a) != null) {
                    boolean zB2 = hVar2.q().b(str);
                    int iG = hVar2.q().g(str);
                    if (!zB2 || iG > 2) {
                        sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "Ad data request stop due to assign strateg   y.");
                        AbstractAdLoader.this.a(this, 1011, 10210, "no fill", this.j == null ? null : new Pair<>(this.j.f48081a, null));
                        return;
                    }
                }
                l lVarH = bVar2.h();
                if (lVarH == null && (gVar = (g) k.b(gVarArr2)) != null) {
                    lVarH = gVar.f47033b;
                }
                l lVar = lVarH;
                c[] cVarArrA2 = sg.bigo.ads.controller.loader.a.a(gVarArr2);
                c cVar2 = (c) k.b(cVarArrA2);
                if (lVar != null && cVar2 != null) {
                    boolean z3 = lVar.s() && cVar2.ac();
                    int i4 = 4;
                    int i5 = this.f48256c ? 2 : this.d ? 4 : 1;
                    sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> c0859a2 = this.j;
                    int i6 = c0859a2 != null ? c0859a2.f : 0;
                    if (c0859a2 != null && (qVar4 = c0859a2.g) != null) {
                        i3 = qVar4.f47059a ? 1 : 0;
                    }
                    if (c0859a2 != null && (qVar3 = c0859a2.g) != null && qVar3.f47060b) {
                        z2 = true;
                    }
                    if (c0859a2 != null && (qVar2 = c0859a2.g) != null) {
                        i4 = qVar2.f47061c;
                    }
                    if (c0859a2 != null && (qVar = c0859a2.g) != null) {
                        str2 = qVar.d;
                    }
                    sg.bigo.ads.core.d.b.a(cVarArrA2, bVar2, z3, i5, i6, i3, z2, i4, str2);
                }
                AbstractAdLoader.this.a(this, i2, lVar, bVar2, gVarArr2);
            }

            @Override // sg.bigo.ads.controller.d
            public final void a(l lVar, U u2) {
                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "Get ad from cache.");
                AbstractAdLoader.this.a(lVar, str, this, u2);
            }
        };
        if (a(str)) {
            a((AbstractAdLoader<U, T>.a) aVar, TTAdConstant.IMAGE_MODE_1012, 10213, "The ad is loading", (Pair<sg.bigo.ads.api.b, l>) new Pair(t, null));
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            f48221a.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        }
        if (TextUtils.isEmpty(str) || (hVar = i.f46986a) == null) {
            jE = -1;
        } else {
            sg.bigo.ads.api.a.b bVarQ = hVar.q();
            if (bVarQ.b(str)) {
                ConcurrentHashMap<String, List<a>> concurrentHashMap = f48222b;
                List<a> copyOnWriteArrayList = concurrentHashMap.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                    concurrentHashMap.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(0, aVar);
                jE = bVarQ.e(str);
                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "Prepare for ad load, the tmax switch is on.");
            } else {
                jE = -1;
            }
        }
        sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> c0859aA = BigoAdSdk.a(t, aVar);
        if (c0859aA != null) {
            aVar.j = c0859aA;
            if (jE > -1) {
                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", androidx.media3.extractor.text.ttml.a.j(jE, "Start timeout task for ", "s"));
                a(aVar, jE);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(AbstractAdLoader<U, T>.a aVar, int i2, int i3, String str, Pair<sg.bigo.ads.api.b, l> pair) {
        l lVar;
        sg.bigo.ads.api.b bVar;
        int i4;
        char c2;
        q qVar;
        q qVar2;
        q qVar3;
        q qVar4;
        if (pair != null) {
            bVar = (sg.bigo.ads.api.b) pair.first;
            lVar = (l) pair.second;
        } else {
            lVar = null;
            bVar = null;
        }
        if (bVar != null) {
            bVar.g.a();
        }
        String strL = lVar != null ? lVar.l() : null;
        if (TextUtils.isEmpty(strL) && bVar != null) {
            strL = bVar.f46987a;
        }
        if (TextUtils.isEmpty(strL)) {
            strL = aVar.f48258h;
        }
        boolean z2 = i3 == 10213;
        if (!z2 && !TextUtils.isEmpty(strL)) {
            f48221a.remove(strL);
        }
        boolean z3 = i2 == 1011;
        boolean z4 = i3 == 10206;
        if (!z4) {
            int i5 = 4;
            if (z2) {
                i4 = 3;
            } else if (aVar.f48256c) {
                i4 = 2;
            } else {
                i4 = aVar.d ? 4 : 1;
            }
            sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> c0859a = aVar.j;
            int i6 = c0859a != null ? c0859a.f : 0;
            if (c0859a == null || (qVar4 = c0859a.g) == null) {
                c2 = 3;
            } else {
                c2 = qVar4.f47059a ? (char) 1 : (char) 0;
            }
            boolean z5 = (c0859a == null || (qVar3 = c0859a.g) == null || !qVar3.f47060b) ? false : true;
            if (c0859a != null && (qVar2 = c0859a.g) != null) {
                i5 = qVar2.f47061c;
            }
            sg.bigo.ads.core.d.b.a(lVar, bVar, i2, i3, str, i4, i6, c2, z5, i5, (c0859a == null || (qVar = c0859a.g) == null) ? null : qVar.d);
        }
        aVar.a();
        aVar.g = true;
        b(aVar.b(), aVar);
        if (!z4 && (aVar.f48256c || aVar.d || z3)) {
            sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The error ad has been timeout or assign");
        } else {
            a(strL, aVar, null, 0, i2, i3, str, false, null);
            this.f48223c.onError(new AdError(i2, str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final AbstractAdLoader<U, T>.a aVar, final int i2, final l lVar, sg.bigo.ads.api.b bVar, g... gVarArr) {
        int i3;
        Ad adA = bVar.e() ? a(bVar, gVarArr) : a((g) k.b(gVarArr));
        if (adA == null) {
            a(aVar.b(), (AbstractAdLoader<U, T>.a) aVar, (Ad) null, 1005, 1009, "Unmatched ad type.");
            return;
        }
        if (!(adA instanceof d)) {
            a(lVar == null ? null : lVar.l(), (AbstractAdLoader<U, T>.a) aVar, adA, 1024, 1010, "Unknown ad.");
            return;
        }
        sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> c0859a = aVar.j;
        if (c0859a != null) {
            c0859a.f48084e = 3;
        }
        c[] cVarArrA = sg.bigo.ads.controller.loader.a.a(adA);
        if (aVar.f48256c) {
            i3 = 2;
        } else {
            i3 = aVar.d ? 4 : 1;
        }
        sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> c0859a2 = aVar.j;
        sg.bigo.ads.controller.loader.a.a(cVarArrA, i3, c0859a2 == null ? 0 : c0859a2.f, false);
        ((d) adA).a(new b<U, T>() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.5
            @Override // sg.bigo.ads.controller.loader.AbstractAdLoader.b
            public final AbstractAdLoader<U, T> a() {
                return AbstractAdLoader.this;
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final void a(final U u2) {
                final AbstractAdLoader abstractAdLoader = AbstractAdLoader.this;
                final a aVar2 = aVar;
                final int i4 = i2;
                final l lVar2 = lVar;
                sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        l lVar3 = lVar2;
                        String strL = lVar3 == null ? null : lVar3.l();
                        if (!TextUtils.isEmpty(strL)) {
                            AbstractAdLoader.f48221a.remove(strL);
                        }
                        a aVar3 = aVar2;
                        aVar3.g = true;
                        AbstractAdLoader.b(strL, aVar3);
                        aVar2.a();
                        AbstractAdLoader<U, T>.a aVar4 = aVar2;
                        if (aVar4.f48256c) {
                            AbstractAdLoader.this.a(aVar4, lVar2, u2, 1);
                        } else if (aVar4.d) {
                            AbstractAdLoader.this.a(aVar4, lVar2, u2, 2);
                        } else {
                            AbstractAdLoader.this.a(strL, aVar4, sg.bigo.ads.controller.loader.a.a(u2), 1, 0, 0, null, true, u2);
                            AbstractAdLoader.this.a(u2, true);
                        }
                    }
                });
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final void a(U u2, int i4, int i5, String str) {
                AbstractAdLoader abstractAdLoader = AbstractAdLoader.this;
                l lVar2 = lVar;
                abstractAdLoader.a(lVar2 == null ? null : lVar2.l(), aVar, u2, i4, i5, str);
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final void a(U u2, boolean z2, int i4, int i5, String str, boolean z3) {
            }
        });
    }

    private static void a(AbstractAdLoader<U, T>.a aVar, long j) {
        sg.bigo.ads.common.n.d.a(3, aVar.m, j * 1000);
    }

    public final void a(AbstractAdLoader<U, T>.a aVar, l lVar, Ad ad, int i2) {
        List<a> list;
        sg.bigo.ads.controller.e.a.C0859a<sg.bigo.ads.api.b> c0859a = aVar.j;
        String str = c0859a == null ? "unknown" : c0859a.f48081a.g.f46992b;
        p005e.a.d(0, 3, str, "The ad timeout for session id: ", "AbstractAdLoader");
        if (lVar != null) {
            String strL = lVar.l();
            if (TextUtils.isEmpty(strL)) {
                strL = aVar.b();
            }
            if (TextUtils.isEmpty(strL)) {
                return;
            }
            c[] cVarArrA = sg.bigo.ads.controller.loader.a.a(ad);
            for (int i3 = 0; cVarArrA != null && i3 < cVarArrA.length; i3++) {
                c cVar = cVarArrA[i3];
                cVar.T();
                cVar.c(i2);
                cVar.S();
            }
            a aVarRemove = (TextUtils.isEmpty(strL) || (list = f48222b.get(strL)) == null || list.size() <= 0) ? null : list.remove(0);
            if (aVarRemove != null) {
                a(lVar, strL, aVarRemove, ad);
                p005e.a.d(0, 3, str, "The timeout ad fill to another request for session id: ", "AbstractAdLoader");
                return;
            }
            StringBuilder sbY = android.support.v4.media.a.y("The timeout ad put in cache for session id: ", str, ", ad: ");
            sbY.append(String.valueOf(ad));
            sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", sbY.toString());
            a(ad, false);
            sg.bigo.ads.ad.b.a.f45406a.a(lVar, ad);
        }
    }

    private static boolean a(String str) {
        h hVar;
        if (!TextUtils.isEmpty(str) && (hVar = i.f46986a) != null && hVar.q().i(str)) {
            long j = i.f46986a.q().j(str);
            if (j < 0) {
                return false;
            }
            if (j == 0 && f48221a.containsKey(str)) {
                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The slot request stop due to single ad mode.");
                return true;
            }
            long j2 = j * 1000;
            Long l2 = f48221a.get(str);
            if (l2 != null && SystemClock.elapsedRealtime() - l2.longValue() < j2) {
                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The slot request stop due to single ad mode.");
                return true;
            }
        }
        return false;
    }
}
