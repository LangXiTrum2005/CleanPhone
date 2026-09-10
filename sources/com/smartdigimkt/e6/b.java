package com.smartdigimkt.e6;

import android.text.TextUtils;
import android.util.Xml;
import com.smartdigimkt.c6.e;
import com.smartdigimkt.c6.f;
import com.smartdigimkt.f6.h0;
import com.smartdigimkt.f6.i0;
import com.smartdigimkt.f6.k;
import com.smartdigimkt.f6.k0;
import com.smartdigimkt.f6.l;
import com.smartdigimkt.f6.p;
import com.smartdigimkt.f6.t0;
import com.smartdigimkt.f6.v0;
import com.smartdigimkt.f6.x;
import com.vungle.ads.internal.Constants;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class b extends com.smartdigimkt.e6.a {
    private static final String[] g = {"video/mp4", "video/3gpp", "video/webm", "video/mkv"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f34617h = "b";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f34618i = 1;
    public static final int j = 3;
    public static final int k = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f34619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile b f34620b;
    private v0 f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<t0> f34621c = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<h0> f34622e = new ArrayList<>();
    private ArrayList<k> d = new ArrayList<>();

    public b(String str) throws com.smartdigimkt.c6.b {
        this.f34619a = false;
        try {
            b(str);
            this.f34619a = true;
        } catch (Throwable th) {
            throw new com.smartdigimkt.c6.b("-3", th.getLocalizedMessage());
        }
    }

    private String a(String str) {
        int iIndexOf;
        if (str == null || str.isEmpty() || (iIndexOf = str.indexOf("<")) <= 0) {
            return null;
        }
        return str.substring(iIndexOf);
    }

    public static boolean c(String str) {
        if (!TextUtils.isEmpty(str)) {
            int i2 = 0;
            while (true) {
                String[] strArr = g;
                if (i2 >= strArr.length) {
                    break;
                }
                if (str.equalsIgnoreCase(strArr[i2])) {
                    return true;
                }
                i2++;
            }
        }
        return false;
    }

    public ArrayList<k> b() {
        return this.d;
    }

    public List<String> d() {
        ArrayList arrayList = new ArrayList();
        if (this.f34620b != null && this.f34620b.d() != null) {
            arrayList.addAll(this.f34620b.d());
        }
        return arrayList;
    }

    public ArrayList<h0> e() {
        return this.f34622e;
    }

    public ArrayList<t0> f() {
        return this.f34621c;
    }

    public v0 g() {
        return this.f;
    }

    public String h() {
        if (this.f.a() == null) {
            return null;
        }
        for (com.smartdigimkt.f6.a aVar : this.f.a()) {
            if (aVar.d() != null && aVar.d().h() != null) {
                return aVar.d().h().a();
            }
        }
        return null;
    }

    public String i(b bVar, int i2) {
        if (this.f34620b != null) {
            return this.f34620b.i(bVar, i2);
        }
        com.smartdigimkt.f6.a aVar = bVar.f.a().get(i2);
        if (aVar == null || aVar.b() == null || aVar.b().e() == null) {
            return null;
        }
        for (p pVar : aVar.b().e()) {
            if (pVar.e() != null) {
                return pVar.e().e();
            }
        }
        return null;
    }

    public String j(b bVar, int i2) {
        if (this.f34620b != null) {
            return this.f34620b.j(bVar, i2);
        }
        com.smartdigimkt.f6.a aVar = bVar.f.a().get(i2);
        if (aVar == null || aVar.b() == null || aVar.b().e() == null) {
            return null;
        }
        for (p pVar : aVar.b().e()) {
            if (pVar.e() != null) {
                return pVar.e().b().a();
            }
        }
        return null;
    }

    public synchronized boolean k() {
        return this.f34619a && (this.f34620b == null || this.f34620b.k());
    }

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f34623c = 0;
        public static final int d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f34624e = 2;
        public static final int f = 3;
        public static final int g = 4;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f34625h = 5;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f34626i = 6;
        public static final int j = 7;
        public static final int k = 8;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f34627l = 9;
        public static final int m = 10;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f34628n = 11;
        public static final int o = 12;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f34629p = 13;
        public static final int q = 14;
        public static final int r = 15;
        public static final int s = 16;
        public static final int t = 17;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f34630u = 18;
        public static final int v = 19;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f34631w = 20;
        public static final int x = 21;
        public static final String[] y = {"creativeView", "start", "firstQuartile", "midpoint", "thirdQuartile", "complete", "mute", "unmute", "pause", "rewind", "resume", Constants.TEMPLATE_TYPE_FULLSCREEN, "exitFullscreen", "expand", "collapse", "acceptInvitation", "acceptInvitationLinear", "closeLinear", "close", "skip", "error", "impression", "click"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f34632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f34633b;

        public a(String str, String str2) {
            this.f34632a = a(str);
            this.f34633b = str2;
        }

        private int a(String str) {
            int i2 = 0;
            while (true) {
                String[] strArr = y;
                if (i2 >= strArr.length) {
                    return -1;
                }
                if (strArr[i2].equals(str)) {
                    return i2;
                }
                i2++;
            }
        }

        public String b() {
            return this.f34633b;
        }

        public int a() {
            return this.f34632a;
        }
    }

    private void b(String str) throws XmlPullParserException, IOException {
        String strA = a(str);
        if (strA != null) {
            str = strA;
        }
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.nextTag();
        this.f = new v0(xmlPullParserNewPullParser);
    }

    public ArrayList<k> e(b bVar, int i2) {
        ArrayList<k> arrayListA = a(bVar.f, i2);
        if (arrayListA != null) {
            this.d.addAll(arrayListA);
        }
        if (bVar.f34620b != null) {
            e(bVar.f34620b, i2);
        }
        return this.d;
    }

    public String f(b bVar, int i2) {
        com.smartdigimkt.f6.a aVar = bVar.f.a().get(i2);
        if (aVar == null || aVar.b() == null || aVar.b().f() == null) {
            return null;
        }
        return aVar.b().f().a();
    }

    public String g(b bVar, int i2) {
        com.smartdigimkt.f6.a aVar = bVar.f.a().get(i2);
        if (aVar == null || aVar.b() == null || aVar.b().g() == null) {
            return null;
        }
        return aVar.b().g().a();
    }

    public String a(b bVar, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        if (this.f34620b != null) {
            this.f34620b.a(this.f34620b, i2, i3);
            return null;
        }
        for (p pVar : bVar.f.a().get(i2).b().e()) {
            if (pVar.e() != null && pVar.e().d() != null) {
                for (k0 k0Var : pVar.e().d()) {
                    if (c(k0Var.j())) {
                        arrayList.add(k0Var);
                    }
                }
                if (arrayList.size() == 0) {
                    break;
                }
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (i4 < arrayList.size()) {
                    k0 k0Var2 = (k0) arrayList.get(i4);
                    int i7 = e.a((CharSequence) k0Var2.l()) ? 0 : Integer.parseInt(k0Var2.l());
                    if (i7 != i3) {
                        int iAbs = Math.abs(i3 - i7);
                        if (i5 == 0 || iAbs < i5) {
                            i6 = i4;
                            i5 = iAbs;
                        }
                        i4++;
                    } else {
                        return ((k0) arrayList.get(i4)).k();
                    }
                }
                i4 = i6;
                return ((k0) arrayList.get(i4)).k();
            }
        }
        return null;
    }

    public ArrayList<t0> c(v0 v0Var, int i2) {
        com.smartdigimkt.f6.a aVar = v0Var.a().get(i2);
        if (aVar.b() != null) {
            if (aVar.b().e() == null) {
                return null;
            }
            for (p pVar : aVar.b().e()) {
                if (pVar.e() != null) {
                    return pVar.e().f();
                }
            }
            return null;
        }
        if (aVar.d() == null || aVar.d().c() == null || aVar.d().c() == null) {
            return null;
        }
        for (p pVar2 : aVar.d().c()) {
            if (pVar2.e() != null) {
                return pVar2.e().f();
            }
            if (pVar2.f() != null) {
                return pVar2.f().b();
            }
        }
        return null;
    }

    public String d(b bVar, int i2) {
        if (this.f34620b != null) {
            return this.f34620b.d(this.f34620b, i2);
        }
        com.smartdigimkt.f6.a aVar = bVar.f.a().get(i2);
        if (aVar.b().e() == null) {
            return null;
        }
        for (p pVar : aVar.b().e()) {
            if (pVar.e() != null && pVar.e().g() != null && pVar.e().g().a() != null) {
                return pVar.e().g().a().b();
            }
        }
        return null;
    }

    public ArrayList<h0> h(b bVar, int i2) {
        if (b(bVar.f, i2) != null) {
            this.f34622e.addAll(b(bVar.f, i2));
        }
        if (bVar.f34620b != null) {
            h(bVar.f34620b, i2);
        }
        return this.f34622e;
    }

    public ArrayList<h0> b(v0 v0Var, int i2) {
        com.smartdigimkt.f6.a aVar = v0Var.a().get(i2);
        if (aVar.b() != null) {
            return aVar.b().i();
        }
        if (aVar.d() != null) {
            return aVar.d().g();
        }
        return null;
    }

    public int i() {
        try {
            return Integer.parseInt(this.f.a().get(0).b().e().get(0).e().d().get(0).l());
        } catch (Exception unused) {
            return 0;
        }
    }

    public b j() {
        return this.f34620b;
    }

    public com.smartdigimkt.f6.e b(b bVar, int i2) {
        ArrayList<x> arrayListA;
        com.smartdigimkt.f6.a aVar = bVar.f.a().get(i2);
        if (aVar != null && aVar.b() != null) {
            if (aVar.b().c() != null) {
                return aVar.b().c();
            }
            if (aVar.b().h() != null && (arrayListA = aVar.b().h().a()) != null) {
                for (x xVar : arrayListA) {
                    if (xVar.a() != null) {
                        return xVar.a();
                    }
                }
            }
        }
        return null;
    }

    public ArrayList<t0> c(b bVar, int i2) {
        if (c(bVar.f, i2) != null) {
            this.f34621c.addAll(c(bVar.f, i2));
        }
        if (bVar.f34620b != null) {
            c(bVar.f34620b, i2);
        }
        return this.f34621c;
    }

    public ArrayList<String> a(f.a aVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (t0 t0Var : this.f34621c) {
            if (t0Var.a().equals(a.y[aVar.ordinal()])) {
                arrayList.add(t0Var.b());
            }
        }
        return arrayList;
    }

    public int c() {
        try {
            return Integer.parseInt(this.f.a().get(0).b().e().get(0).e().d().get(0).e());
        } catch (Exception unused) {
            return 0;
        }
    }

    public String a(b bVar, int i2) {
        com.smartdigimkt.f6.a aVar = bVar.f.a().get(i2);
        if (aVar == null || aVar.b() == null || aVar.b().b() == null) {
            return null;
        }
        return aVar.b().b().a();
    }

    private ArrayList<k> a(v0 v0Var, int i2) {
        com.smartdigimkt.f6.a aVar = v0Var.a().get(i2);
        if (aVar.b() != null) {
            if (aVar.b().e() == null) {
                return null;
            }
            for (p pVar : aVar.b().e()) {
                if (pVar.e() != null && pVar.e().g() != null && pVar.e().g().b() != null) {
                    return pVar.e().g().b();
                }
            }
            return null;
        }
        if (aVar.d() == null || aVar.d().c() == null || aVar.d().c() == null) {
            return null;
        }
        for (p pVar2 : aVar.d().c()) {
            if (pVar2.e() != null && pVar2.e().g() != null && pVar2.e().g().b() != null) {
                return pVar2.e().g().b();
            }
        }
        return null;
    }

    public List<String> a() {
        ArrayList arrayList = new ArrayList();
        if (this.f34620b != null && this.f34620b.a() != null) {
            arrayList.addAll(this.f34620b.a());
        }
        return arrayList;
    }

    public static l a(i0 i0Var) {
        l lVar = null;
        if (i0Var.e() == null) {
            return null;
        }
        Iterator<p> it = i0Var.e().iterator();
        while (it.hasNext()) {
            ArrayList<l> arrayListC = it.next().c();
            if (arrayListC != null && arrayListC.size() != 0) {
                for (int i2 = 0; i2 < arrayListC.size(); i2++) {
                    try {
                        l lVar2 = arrayListC.get(i2);
                        if (a(lVar2, lVar) == 1) {
                            lVar = lVar2;
                        }
                    } catch (IllegalArgumentException e2) {
                        e2.getMessage();
                    }
                }
            }
        }
        return lVar;
    }

    private static int a(l lVar, l lVar2) throws IllegalArgumentException {
        int iA;
        int iA2;
        if (lVar == null && lVar2 == null) {
            throw new IllegalArgumentException("No companions to compare");
        }
        if (lVar == null) {
            return 2;
        }
        if (lVar2 == null) {
            return 1;
        }
        Integer numA = a(lVar);
        Integer numA2 = a(lVar2);
        if (numA == null && numA2 == null) {
            throw new IllegalArgumentException("No companion resources to compare");
        }
        if (numA == null) {
            return 2;
        }
        if (numA2 == null || numA.intValue() < numA2.intValue()) {
            return 1;
        }
        if (numA.intValue() <= numA2.intValue() && (iA = a(lVar.q(), lVar.k())) >= (iA2 = a(lVar2.q(), lVar2.k()))) {
            return iA > iA2 ? 1 : 0;
        }
        return 2;
    }

    private static int a(String str, String str2) {
        return (e.a((CharSequence) str) ? 0 : Integer.parseInt(str)) * (e.a((CharSequence) str2) ? 0 : Integer.parseInt(str2));
    }

    public static Integer a(l lVar) {
        if (lVar == null) {
            return null;
        }
        if (lVar.l() != null) {
            return 1;
        }
        if (lVar.o() != null) {
            return 2;
        }
        return lVar.m() != null ? 3 : null;
    }

    public static t0 a(ArrayList<t0> arrayList) {
        if (arrayList == null) {
            return null;
        }
        for (t0 t0Var : arrayList) {
            if (t0Var.a().equals("creativeView")) {
                return t0Var;
            }
        }
        return null;
    }

    public void a(b bVar) {
        this.f34620b = bVar;
    }
}
