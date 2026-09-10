package sg.bigo.ads.core.f.a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public final class k {
    private static final String[] f = {"video/mp4", "video/3gp", "video/3gpp"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48511a;
    public e d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<n> f48514e;
    private float g;
    private final int j;
    private int k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f48512b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f48513c = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<sg.bigo.ads.core.f.a.a.b> f48515h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f48516i = new a() { // from class: sg.bigo.ads.core.f.a.k.1
        @Override // sg.bigo.ads.core.f.a.k.a
        public final String a(Context context, q qVar, List<n> list) {
            return k.a(k.this, context, qVar, list);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f48517l = "";
    private final List<sg.bigo.ads.core.c.a> m = new ArrayList();

    public interface a {
        String a(Context context, q qVar, List<n> list);
    }

    public k(int i2, int i3) {
        this.g = 0.1f;
        this.k = 0;
        this.g = 30.0f;
        this.j = i2;
        this.k = i3;
    }

    public static /* synthetic */ String a(k kVar, Context context, q qVar, List list) {
        String str;
        kVar.f48514e = list;
        String strK = qVar.k();
        if (sg.bigo.ads.common.utils.q.a((CharSequence) strK)) {
            sg.bigo.ads.common.t.a.a(1, "VASTParser", "The redirect url from wrapper is invalid.");
            kVar.d = new e(10070, "The redirect url from wrapper is invalid.");
            return null;
        }
        int i2 = kVar.f48511a;
        if (i2 >= 6) {
            sg.bigo.ads.common.t.a.a(1, "VASTParser", "The wrapper redirects too much times.");
            kVar.d = new e(10071, "The wrapper redirects too much times");
            return null;
        }
        kVar.f48511a = i2 + 1;
        kVar.f48513c = strK;
        sg.bigo.ads.common.u.b.a aVar = new sg.bigo.ads.common.u.b.a(new sg.bigo.ads.common.u.b.d(strK), context);
        aVar.k = sg.bigo.ads.common.u.a.e.f();
        sg.bigo.ads.common.u.c<sg.bigo.ads.common.u.c.a> cVarA = sg.bigo.ads.common.u.g.a(aVar);
        T t = cVarA.f47475a;
        if (t != 0) {
            return new sg.bigo.ads.common.u.c.d((sg.bigo.ads.common.u.c.a) t).a();
        }
        sg.bigo.ads.common.t.a.a(1, "VASTParser", "The wrapper failed to redirect http request.");
        if (cVarA.f47476b != null) {
            str = "The wrapper failed to redirect http request., code: " + cVarA.f47476b.f47491a + ", msg: " + cVarA.f47476b.getMessage();
        } else {
            str = "The wrapper failed to redirect http request., response to string failed";
        }
        kVar.d = new e(10072, str);
        return null;
    }

    private b a(Context context, List<i> list) {
        i iVar;
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            sg.bigo.ads.common.t.a.a(1, 4, "VASTParser", "Failed to parse vast data: Media file node can not found.");
            this.d = new e(10065, " media file node can not found");
            return null;
        }
        Iterator<i> it = list.iterator();
        StringBuilder sb = null;
        while (it.hasNext()) {
            String strA = it.next().a();
            if (!sg.bigo.ads.common.utils.q.a((CharSequence) strA)) {
                ArrayList arrayList2 = new ArrayList(Arrays.asList(f));
                sg.bigo.ads.api.a.h hVar = sg.bigo.ads.api.a.i.f46986a;
                if (hVar != null && hVar.h()) {
                    arrayList2.add("application/javascript");
                }
                if (!arrayList2.contains(strA.toLowerCase())) {
                }
            }
            it.remove();
            if (sb == null) {
                sb = new StringBuilder(" media file all mimetype unsupport, types are ");
            }
            sb.append(strA);
            sb.append(",");
            sg.bigo.ads.common.t.a.a(1, 4, "VASTParser", "Failed to parse vast data: mime type is unsupported, ignore. mediaType = ".concat(String.valueOf(strA)));
        }
        if (list.isEmpty()) {
            this.d = new e(10066, sb == null ? " media file all mimetype unsupport" : sb.toString());
            return null;
        }
        Iterator<i> it2 = list.iterator();
        while (it2.hasNext()) {
            if (sg.bigo.ads.common.utils.q.a((CharSequence) it2.next().b())) {
                it2.remove();
                sg.bigo.ads.common.t.a.a(1, 4, "VASTParser", "Failed to parse vast data: Video url is empty.");
            }
        }
        if (list.isEmpty()) {
            this.d = new e(10067, " though mimetype support but url is empty");
            return null;
        }
        Iterator<i> it3 = list.iterator();
        ArrayList arrayList3 = null;
        while (it3.hasNext()) {
            i next = it3.next();
            String strA2 = next.a();
            String strB = next.b();
            if (!sg.bigo.ads.common.utils.q.a((CharSequence) strB)) {
                int iIntValue = sg.bigo.ads.core.f.a.d(next.f48509a, "width").intValue();
                int iIntValue2 = sg.bigo.ads.core.f.a.d(next.f48509a, "height").intValue();
                if (iIntValue <= 0 || iIntValue2 <= 0) {
                    it3.remove();
                    sg.bigo.ads.common.t.a.a(1, 4, "VASTParser", "Failed to parse vast data: Video width or height is invalidate, ignore and stash.");
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(next);
                } else {
                    int iC = next.c();
                    int iD = next.d();
                    String strE = next.e();
                    int i2 = this.j;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            if (iIntValue <= iIntValue2) {
                            }
                        } else if (i2 != 2 || iIntValue < iIntValue2) {
                        }
                    }
                    arrayList.add(new b(iIntValue, iIntValue2, iC, iD, strB, strA2, strE));
                }
            }
        }
        int iB = 0;
        if (arrayList.isEmpty() && arrayList3 != null && !arrayList3.isEmpty() && (iVar = (i) arrayList3.get(0)) != null) {
            arrayList.add(new b(0, 0, iVar.c(), iVar.d(), iVar.b(), iVar.a(), iVar.e()));
        }
        if (arrayList.isEmpty()) {
            sg.bigo.ads.common.t.a.a(1, "VASTParser", "Cannot find the best network media config.");
            this.d = new e(10068, "video width to height ratio is not suitable for its direction");
            return null;
        }
        if (arrayList.size() == 1) {
            sg.bigo.ads.common.t.a.a(0, 3, "VASTParser", "find best network media config, bestNetWorkMediaConfigList size  = " + arrayList.size());
            return (b) arrayList.get(0);
        }
        b bVar = (b) arrayList.get(0);
        ArrayList arrayList4 = new ArrayList(arrayList);
        if (arrayList4.size() <= 1) {
            return bVar;
        }
        int i3 = this.k;
        if (i3 == 0) {
            iB = sg.bigo.ads.common.utils.e.b(context);
        } else if (i3 != 1) {
            if (i3 == 2) {
                iB = 720;
            } else if (i3 == 3) {
                iB = 1080;
            }
        }
        return a(arrayList4, Math.min(iB, sg.bigo.ads.common.utils.e.b(context)));
    }

    private static b a(List<b> list, int i2) {
        b bVar = null;
        int i3 = Integer.MAX_VALUE;
        for (b bVar2 : list) {
            int iAbs = Math.abs(Math.min(bVar2.f48493a, bVar2.f48494b) - i2);
            if (iAbs < i3) {
                bVar = bVar2;
                i3 = iAbs;
            }
        }
        return bVar;
    }

    public final p a(Context context, String str) {
        p pVarA = null;
        this.d = null;
        this.f48511a = 0;
        if (sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            this.d = new e(10060, "invalidate delivery params");
            return null;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            pVarA = a(context, str, this.f48516i, new ArrayList());
            if (pVarA != null) {
                a(pVarA);
            }
            this.f48512b = SystemClock.elapsedRealtime() - jElapsedRealtime;
            sg.bigo.ads.common.t.a.a(0, 3, "VASTParser", "end cost = ".concat(String.valueOf(jElapsedRealtime)));
            return pVarA;
        } catch (Throwable th) {
            sg.bigo.ads.common.t.a.a(1, "VASTParser", "Parse vast xml failed: " + th.getCause());
            this.d = new e(10061, th.getMessage());
            return pVarA;
        }
    }

    private p a(Context context, String str, a aVar, List<n> list) {
        e eVar;
        this.f48514e = list;
        m mVar = new m();
        mVar.f48520a = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(str.replaceFirst("<\\?.*\\?>", ""))));
        List<d> listA = mVar.a();
        if (listA.isEmpty()) {
            eVar = new e(10062, "not found ad node");
        } else {
            d dVar = listA.get(0);
            Node nodeA = sg.bigo.ads.core.f.a.a(dVar.f48498a, "InLine");
            g gVar = nodeA != null ? new g(nodeA) : null;
            if (gVar != null) {
                p pVarA = a(context, gVar, list);
                this.f48515h.addAll(gVar.f48506a);
                if (pVarA != null) {
                    return pVarA;
                }
                if (this.d == null) {
                    this.d = new e(10063, "not match media file found other reason");
                }
                return null;
            }
            Node nodeA2 = sg.bigo.ads.core.f.a.a(dVar.f48498a, "Wrapper");
            q qVar = nodeA2 != null ? new q(nodeA2) : null;
            if (qVar != null) {
                String strH = qVar.h();
                if (sg.bigo.ads.common.utils.q.b((CharSequence) strH)) {
                    this.f48517l = strH;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(qVar.a());
                String strA = aVar.a(context, qVar, arrayList);
                if (strA == null) {
                    return null;
                }
                List<sg.bigo.ads.core.c.a> listJ = qVar.j();
                if (listJ != null && listJ.size() > 0) {
                    this.m.addAll(listJ);
                }
                p pVarA2 = a(context, strA, aVar, arrayList);
                if (pVarA2 == null) {
                    return null;
                }
                pVarA2.a(qVar.b());
                List<h> listA2 = qVar.a("CompanionAds");
                this.f48515h.addAll(qVar.f48506a);
                Iterator<h> it = listA2.iterator();
                while (it.hasNext()) {
                    a(it.next(), pVarA2);
                }
                a(qVar, pVarA2);
                int i2 = qVar.i();
                if (pVarA2.v == -1) {
                    pVarA2.v = i2;
                }
                if (this.m.size() > 0) {
                    pVarA2.C = this.m;
                }
                return pVarA2;
            }
            eVar = new e(10064, "not found wrapper node");
        }
        this.d = eVar;
        return null;
    }

    private p a(Context context, g gVar, List<n> list) {
        h next;
        b bVarA;
        List<Node> listC;
        List<h> listA = gVar.a("CompanionAds");
        String strH = gVar.h();
        if (sg.bigo.ads.common.utils.q.b((CharSequence) strH)) {
            this.f48517l = strH;
        }
        Iterator<h> it = listA.iterator();
        do {
            if (!it.hasNext()) {
                return null;
            }
            next = it.next();
            ArrayList arrayList = new ArrayList();
            Node nodeA = sg.bigo.ads.core.f.a.a(next.f48508a, "MediaFiles");
            if (nodeA != null && (listC = sg.bigo.ads.core.f.a.c(nodeA, "MediaFile")) != null) {
                Iterator<Node> it2 = listC.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new i(it2.next()));
                }
            }
            bVarA = a(context, arrayList);
        } while (bVarA == null);
        p pVar = new p();
        pVar.a(gVar.b());
        a(next, pVar);
        pVar.m = next.a();
        long jI = next.i();
        if (jI > 0) {
            pVar.s = jI;
        }
        Node nodeA2 = sg.bigo.ads.core.f.a.a(next.f48508a, "AdParameters");
        pVar.f48527B = nodeA2 != null ? new sg.bigo.ads.core.f.a.a.a.a(TextUtils.equals(sg.bigo.ads.core.f.a.e(nodeA2, "xmlEncoded"), com.p004ironsource.mediationsdk.metadata.a.g), sg.bigo.ads.core.f.a.b(nodeA2)) : null;
        pVar.f48535n = bVarA;
        int i2 = bVarA.f48493a;
        int i3 = bVarA.f48494b;
        pVar.x = i2;
        pVar.f48538w = i3;
        pVar.f48536p = gVar.f();
        pVar.q = gVar.g();
        pVar.r = this.f48517l;
        pVar.v = gVar.i();
        long jA = r.a();
        if (jA > 0) {
            pVar.f48537u = jA;
        }
        pVar.t = ((long) gVar.e()) * 1000;
        list.addAll(gVar.a());
        pVar.k.addAll(list);
        a(gVar, pVar);
        List<sg.bigo.ads.core.c.a> listJ = gVar.j();
        if (listJ != null && listJ.size() > 0) {
            this.m.addAll(listJ);
        }
        if (this.m.size() > 0) {
            pVar.C = this.m;
        }
        return pVar;
    }

    private static void a(g gVar, p pVar) {
        pVar.b(gVar.c());
        pVar.c(gVar.d());
    }

    private static void a(h hVar, p pVar) {
        pVar.l(hVar.h());
        pVar.k(hVar.g());
        pVar.d(hVar.a("complete"));
        pVar.e(hVar.a("skip"));
        pVar.f(hVar.d());
        pVar.g(hVar.c());
        pVar.h(hVar.f());
        pVar.i(hVar.e());
        pVar.j(hVar.b());
    }

    private void a(p pVar) {
        sg.bigo.ads.core.f.a.a.C0869a c0869a;
        List<sg.bigo.ads.core.f.a.a.C0869a> list;
        List<sg.bigo.ads.core.f.a.a.b> list2 = this.f48515h;
        if (sg.bigo.ads.common.utils.k.a((Collection) list2)) {
            return;
        }
        Iterator<sg.bigo.ads.core.f.a.a.b> it = list2.iterator();
        while (it.hasNext()) {
            List<sg.bigo.ads.core.f.a.a.d> listA = it.next().a();
            if (!sg.bigo.ads.common.utils.k.a((Collection) listA)) {
                sg.bigo.ads.core.f.a.a aVar = new sg.bigo.ads.core.f.a.a();
                for (sg.bigo.ads.core.f.a.a.d dVar : listA) {
                    if (dVar != null) {
                        List<sg.bigo.ads.core.f.a.a.g> listC = dVar.c();
                        if (!sg.bigo.ads.common.utils.k.a((Collection) listC)) {
                            for (sg.bigo.ads.core.f.a.a.g gVar : listC) {
                                if (gVar instanceof sg.bigo.ads.core.f.a.a.h) {
                                    sg.bigo.ads.core.f.a.a.h hVar = (sg.bigo.ads.core.f.a.a.h) gVar;
                                    String strA = hVar.a();
                                    if (strA != null && strA.contains("image/")) {
                                        c0869a = new sg.bigo.ads.core.f.a.a.C0869a(hVar.b(), dVar.a(), dVar.b(), strA, dVar.d());
                                        list = aVar.f48472b;
                                        list.add(c0869a);
                                    }
                                } else if (gVar instanceof sg.bigo.ads.core.f.a.a.e) {
                                    c0869a = new sg.bigo.ads.core.f.a.a.C0869a(((sg.bigo.ads.core.f.a.a.e) gVar).a(), dVar.a(), dVar.b(), null, dVar.d());
                                    list = aVar.f48471a;
                                    list.add(c0869a);
                                }
                            }
                            List<sg.bigo.ads.core.f.a.a.c> listE = dVar.e();
                            if (!sg.bigo.ads.common.utils.k.a((Collection) listE)) {
                                Iterator<sg.bigo.ads.core.f.a.a.c> it2 = listE.iterator();
                                while (it2.hasNext()) {
                                    pVar.f48539z.add(new n(it2.next().a()));
                                }
                            }
                            List<String> listF = dVar.f();
                            if (!sg.bigo.ads.common.utils.k.a((Collection) listF)) {
                                Iterator<String> it3 = listF.iterator();
                                while (it3.hasNext()) {
                                    pVar.y.add(new n(it3.next()));
                                }
                            }
                        }
                    }
                }
                pVar.f48526A.add(aVar);
            }
        }
    }
}
