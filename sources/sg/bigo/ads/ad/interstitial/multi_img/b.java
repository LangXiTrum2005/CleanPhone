package sg.bigo.ads.ad.interstitial.multi_img;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.p.h;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f46369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f46370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f46371c;
    public final c d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f46372e;
    List<a> f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final sg.bigo.ads.ad.b.c f46373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HashSet<String> f46374i = new HashSet<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f46381b;

        private a(String str) {
            this.f46380a = str;
            this.f46381b = 0;
        }

        public /* synthetic */ a(String str, byte b2) {
            this(str);
        }
    }

    private b(sg.bigo.ads.ad.b.c cVar, m mVar, d dVar, int i2, c cVar2, boolean z2, boolean z3, List<a> list) {
        this.f46373h = cVar;
        this.f46369a = mVar;
        this.f46370b = dVar;
        this.d = cVar2;
        this.f46371c = z2;
        this.f46372e = z3;
        this.f = list;
        this.g = i2;
    }

    public static b b(sg.bigo.ads.ad.b.c cVar, m mVar) {
        d dVarA;
        c cVarA;
        int iA;
        if (cVar == null || mVar == null) {
            return null;
        }
        int iA2 = mVar.a("video_play_page.multi_img_load");
        switch (mVar.a("video_play_page.ad_component_layout")) {
            case 13:
            case 18:
                dVarA = d.TILE;
                cVarA = c.FILL_MATCH_SELF;
                iA = 1;
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                dVarA = d.a(mVar.a("video_play_page.multi_img"));
                cVarA = c.a(mVar.a("video_play_page.multi_render_way"));
                iA = mVar.a("video_play_page.multi_method");
                break;
            default:
                return null;
        }
        return a(cVar, mVar, iA2, dVarA, cVarA, iA == 1, false);
    }

    public static b c(sg.bigo.ads.ad.b.c cVar, m mVar) {
        return a(cVar, mVar, mVar.a("video_play_page.multi_img_load", 1), d.a(mVar.a("video_play_page.multi_img")), c.FILL_MATCH_SELF, true, false);
    }

    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        if (!k.a((Collection) this.f)) {
            Iterator<a> it = this.f.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f46380a);
            }
        }
        return arrayList;
    }

    public static b a(sg.bigo.ads.ad.b.c cVar, m mVar) {
        if (cVar == null || mVar == null) {
            return null;
        }
        switch (mVar.a("endpage.ad_component_layout")) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return a(cVar, mVar, mVar.a("endpage.multi_img_load"), d.a(mVar.a("endpage.multi_img")), c.a(mVar.a("endpage.multi_render_way")), true, true);
            default:
                return null;
        }
    }

    public final void b() {
        if (k.a((Collection) this.f)) {
            return;
        }
        for (final a aVar : this.f) {
            String str = aVar.f46380a;
            if (!sg.bigo.ads.common.p.e.a(this.f46373h.f45584b.f47035e, str)) {
                if (h.a.f47427a.a(str)) {
                    return;
                }
                sg.bigo.ads.ad.b.c cVar = this.f46373h;
                sg.bigo.ads.common.p.e.a(cVar.f45584b.f47035e, str, ((sg.bigo.ads.core.a.a) cVar.f()).al(), new g() { // from class: sg.bigo.ads.ad.interstitial.multi_img.b.2
                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i2, String str2, String str3) {
                        aVar.f46381b = 2;
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(Bitmap bitmap, sg.bigo.ads.common.p.f fVar) {
                        aVar.f46381b = 1;
                    }
                });
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c A[PHI: r3
  0x000c: PHI (r3v11 java.util.ArrayList) = (r3v3 java.util.ArrayList), (r3v3 java.util.ArrayList), (r3v0 java.util.ArrayList) binds: [B:40:0x00af, B:42:0x00b3, B:4:0x0009] A[DONT_GENERATE, DONT_INLINE]] */
    private static b a(sg.bigo.ads.ad.b.c cVar, m mVar, int i2, d dVar, c cVar2, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        byte b2 = 0;
        if (dVar != d.NONE || z3) {
            sg.bigo.ads.api.core.c.d popPage = cVar.getPopPage();
            if (popPage != null) {
                String[] strArrE = popPage.e();
                if (!k.a(strArrE)) {
                    arrayList2 = new ArrayList();
                    for (String str : strArrE) {
                        arrayList2.add(new a(str, b2));
                    }
                }
            }
            if (k.a((Collection) arrayList2) && (z2 || z3)) {
                arrayList2 = new ArrayList();
                o.a[] aVarArrAx = ((sg.bigo.ads.core.a.a) cVar.f()).ax();
                for (int i3 = 0; !k.a(aVarArrAx) && i3 < aVarArrAx.length; i3++) {
                    o.a aVar = aVarArrAx[i3];
                    if (aVar != null && !q.a((CharSequence) aVar.c())) {
                        arrayList2.add(new a(aVarArrAx[i3].c(), b2));
                    }
                }
            }
            if (k.a((Collection) arrayList2) && ((z2 || z3) && ((sg.bigo.ads.core.a.a) cVar.f()).aR())) {
                ArrayList arrayList3 = new ArrayList();
                String strAz = ((sg.bigo.ads.core.a.a) cVar.f()).az();
                if (!q.a((CharSequence) strAz)) {
                    arrayList3.add(new a(strAz, b2));
                }
                arrayList2 = arrayList3;
            }
            if (k.a((Collection) arrayList2) && (z2 || z3)) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        d dVar2 = (!k.a((Collection) arrayList2) || z4) ? dVar : d.NONE;
        if (dVar == d.NONE && z3) {
            if (k.a((Collection) arrayList2)) {
                z5 = true;
            } else {
                arrayList = new ArrayList(arrayList2.subList(0, 1));
                z5 = z4;
            }
            return new b(cVar, mVar, dVar2, i2, cVar2, z2, z5, arrayList);
        }
        z5 = z4;
        arrayList = arrayList2;
        return new b(cVar, mVar, dVar2, i2, cVar2, z2, z5, arrayList);
    }

    public final void a(final int i2, final int i3) {
        String str = i2 + "_" + i3;
        if (this.f46374i.contains(str)) {
            return;
        }
        this.f46374i.add(str);
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.b.1
            /* JADX WARN: Type inference failed for: r5v0, types: [sg.bigo.ads.api.core.c] */
            @Override // java.lang.Runnable
            public final void run() {
                int i4;
                int i5;
                int i6;
                String[] strArrE;
                int length = 0;
                if (k.a((Collection) b.this.f)) {
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                } else {
                    int i7 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    for (a aVar : b.this.f) {
                        String str2 = aVar.f46380a;
                        if (!sg.bigo.ads.common.p.e.a(b.this.f46373h.f45584b.f47035e, str2)) {
                            if (!h.a.f47427a.a(str2)) {
                                int i10 = aVar.f46381b;
                                if (i10 != 1) {
                                    if (i10 == 2) {
                                        i9++;
                                    }
                                }
                            }
                            i7++;
                        }
                        i8++;
                    }
                    i4 = i7;
                    i5 = i8;
                    i6 = i9;
                }
                ?? F2 = b.this.f46373h.f();
                int i11 = i2;
                int i12 = i3;
                sg.bigo.ads.api.core.c.d popPage = b.this.f46373h.getPopPage();
                if (popPage != null && (strArrE = popPage.e()) != null) {
                    length = strArrE.length;
                }
                sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) F2, i11, i12, length, i4, i5, i6);
            }
        });
    }

    public final void a(String str, int i2) {
        if (k.a((Collection) this.f) || q.a((CharSequence) str)) {
            return;
        }
        for (a aVar : this.f) {
            if (str.equalsIgnoreCase(aVar.f46380a)) {
                aVar.f46381b = i2;
                return;
            }
        }
    }
}
