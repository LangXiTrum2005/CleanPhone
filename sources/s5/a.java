package s5;

import com.facebook.appevents.integrity.IntegrityManager;
import d5.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xj.b0;
import xj.p;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f50130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f50131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f50132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t5.f f50133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f50134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f50135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f50136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f50137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f50138k;
    public List l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f50139m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f50140n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f50141o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f50142p;

    public a(String str, String str2, byte[] bArr, byte[] bArr2, boolean z10, t5.f fVar, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10) {
        this.f50128a = str;
        this.f50129b = str2;
        this.f50130c = bArr;
        this.f50131d = bArr2;
        this.f50132e = z10;
        this.f50133f = fVar;
        this.f50134g = list;
        this.f50135h = list2;
        this.f50136i = list3;
        this.f50137j = list4;
        this.f50138k = list5;
        this.l = list6;
        this.f50139m = list7;
        this.f50140n = list8;
        this.f50141o = list9;
        this.f50142p = list10;
    }

    public final Map a() {
        wj.f fVar = new wj.f("id", this.f50128a);
        wj.f fVar2 = new wj.f("displayName", this.f50129b);
        wj.f fVar3 = new wj.f("thumbnail", this.f50130c);
        wj.f fVar4 = new wj.f("photo", this.f50131d);
        wj.f fVar5 = fVar2;
        wj.f fVar6 = new wj.f("isStarred", Boolean.valueOf(this.f50132e));
        t5.f fVar7 = this.f50133f;
        Map mapQ = b0.Q(new wj.f("first", fVar7.f50508a), new wj.f("last", fVar7.f50509b), new wj.f("middle", fVar7.f50510c), new wj.f("prefix", fVar7.f50511d), new wj.f("suffix", fVar7.f50512e), new wj.f("nickname", fVar7.f50513f), new wj.f("firstPhonetic", fVar7.f50514g), new wj.f("lastPhonetic", fVar7.f50515h), new wj.f("middlePhonetic", fVar7.f50516i));
        wj.f fVar8 = fVar4;
        wj.f fVar9 = new wj.f("name", mapQ);
        List list = this.f50134g;
        ArrayList arrayList = new ArrayList(p.W(list, 10));
        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
            t5.i iVar = (t5.i) it.next();
            arrayList.add(b0.Q(new wj.f("number", iVar.f50525a), new wj.f("normalizedNumber", iVar.f50526b), new wj.f("label", iVar.f50527c), new wj.f("customLabel", iVar.f50528d), new wj.f("isPrimary", Boolean.valueOf(iVar.f50529e))));
        }
        wj.f fVar10 = new wj.f("phones", arrayList);
        List<t5.c> list2 = this.f50135h;
        ArrayList arrayList2 = new ArrayList(p.W(list2, 10));
        for (t5.c cVar : list2) {
            arrayList2.add(b0.Q(new wj.f(IntegrityManager.INTEGRITY_TYPE_ADDRESS, cVar.f50497a), new wj.f("label", cVar.f50498b), new wj.f("customLabel", cVar.f50499c), new wj.f("isPrimary", Boolean.valueOf(cVar.f50500d))));
            fVar10 = fVar10;
            fVar8 = fVar8;
        }
        wj.f fVar11 = fVar10;
        wj.f fVar12 = fVar8;
        wj.f fVar13 = new wj.f("emails", arrayList2);
        List list3 = this.f50136i;
        ArrayList arrayList3 = new ArrayList(p.W(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            t5.b bVar = (t5.b) it2.next();
            arrayList3.add(b0.Q(new wj.f(IntegrityManager.INTEGRITY_TYPE_ADDRESS, bVar.f50485a), new wj.f("label", bVar.f50486b), new wj.f("customLabel", bVar.f50487c), new wj.f("street", bVar.f50488d), new wj.f("pobox", bVar.f50489e), new wj.f("neighborhood", bVar.f50490f), new wj.f("city", bVar.f50491g), new wj.f("state", bVar.f50492h), new wj.f("postalCode", bVar.f50493i), new wj.f("country", bVar.f50494j), new wj.f("isoCountry", bVar.f50495k), new wj.f("subAdminArea", bVar.l), new wj.f("subLocality", bVar.f50496m)));
            it2 = it2;
            fVar6 = fVar6;
            fVar9 = fVar9;
        }
        wj.f fVar14 = fVar6;
        wj.f fVar15 = fVar9;
        wj.f fVar16 = new wj.f("addresses", arrayList3);
        List list4 = this.f50137j;
        ArrayList arrayList4 = new ArrayList(p.W(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            t5.h hVar = (t5.h) it3.next();
            arrayList4.add(b0.Q(new wj.f("company", hVar.f50518a), new wj.f("title", hVar.f50519b), new wj.f("department", hVar.f50520c), new wj.f("jobDescription", hVar.f50521d), new wj.f("symbol", hVar.f50522e), new wj.f("phoneticName", hVar.f50523f), new wj.f("officeLocation", hVar.f50524g)));
            it3 = it3;
            fVar5 = fVar5;
        }
        wj.f fVar17 = fVar5;
        wj.f fVar18 = new wj.f("organizations", arrayList4);
        List<t5.k> list5 = this.f50138k;
        ArrayList arrayList5 = new ArrayList(p.W(list5, 10));
        for (t5.k kVar : list5) {
            arrayList5.add(b0.Q(new wj.f("url", kVar.f50533a), new wj.f("label", kVar.f50534b), new wj.f("customLabel", kVar.f50535c)));
        }
        wj.f fVar19 = new wj.f("websites", arrayList5);
        List<t5.j> list6 = this.l;
        ArrayList arrayList6 = new ArrayList(p.W(list6, 10));
        for (t5.j jVar : list6) {
            arrayList6.add(b0.Q(new wj.f("userName", jVar.f50530a), new wj.f("label", jVar.f50531b), new wj.f("customLabel", jVar.f50532c)));
        }
        wj.f fVar20 = new wj.f("socialMedias", arrayList6);
        List list7 = this.f50139m;
        ArrayList arrayList7 = new ArrayList(p.W(list7, 10));
        for (Iterator it4 = list7.iterator(); it4.hasNext(); it4 = it4) {
            t5.d dVar = (t5.d) it4.next();
            arrayList7.add(b0.Q(new wj.f("year", dVar.f50501a), new wj.f("month", Integer.valueOf(dVar.f50502b)), new wj.f("day", Integer.valueOf(dVar.f50503c)), new wj.f("label", dVar.f50504d), new wj.f("customLabel", dVar.f50505e)));
            fVar20 = fVar20;
        }
        wj.f fVar21 = fVar20;
        wj.f fVar22 = new wj.f("events", arrayList7);
        List list8 = this.f50140n;
        ArrayList arrayList8 = new ArrayList(p.W(list8, 10));
        Iterator it5 = list8.iterator();
        while (it5.hasNext()) {
            arrayList8.add(b0.P(new wj.f("note", ((t5.g) it5.next()).f50517a)));
        }
        wj.f fVar23 = new wj.f("notes", arrayList8);
        List list9 = this.f50141o;
        ArrayList arrayList9 = new ArrayList(p.W(list9, 10));
        for (Iterator it6 = list9.iterator(); it6.hasNext(); it6 = it6) {
            t5.a aVar = (t5.a) it6.next();
            arrayList9.add(b0.Q(new wj.f("rawId", aVar.f50481a), new wj.f("type", aVar.f50482b), new wj.f("name", aVar.f50483c), new wj.f("mimetypes", aVar.f50484d)));
        }
        wj.f fVar24 = new wj.f("accounts", arrayList9);
        List<t5.e> list10 = this.f50142p;
        ArrayList arrayList10 = new ArrayList(p.W(list10, 10));
        for (t5.e eVar : list10) {
            arrayList10.add(b0.Q(new wj.f("id", eVar.f50506a), new wj.f("name", eVar.f50507b)));
        }
        return b0.Q(fVar, fVar17, fVar3, fVar12, fVar14, fVar15, fVar11, fVar13, fVar16, fVar18, fVar19, fVar21, fVar22, fVar23, fVar24, new wj.f("groups", arrayList10));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.n.a(this.f50128a, aVar.f50128a) && kotlin.jvm.internal.n.a(this.f50129b, aVar.f50129b) && kotlin.jvm.internal.n.a(this.f50130c, aVar.f50130c) && kotlin.jvm.internal.n.a(this.f50131d, aVar.f50131d) && this.f50132e == aVar.f50132e && kotlin.jvm.internal.n.a(this.f50133f, aVar.f50133f) && kotlin.jvm.internal.n.a(this.f50134g, aVar.f50134g) && kotlin.jvm.internal.n.a(this.f50135h, aVar.f50135h) && kotlin.jvm.internal.n.a(this.f50136i, aVar.f50136i) && kotlin.jvm.internal.n.a(this.f50137j, aVar.f50137j) && kotlin.jvm.internal.n.a(this.f50138k, aVar.f50138k) && kotlin.jvm.internal.n.a(this.l, aVar.l) && kotlin.jvm.internal.n.a(this.f50139m, aVar.f50139m) && kotlin.jvm.internal.n.a(this.f50140n, aVar.f50140n) && kotlin.jvm.internal.n.a(this.f50141o, aVar.f50141o) && kotlin.jvm.internal.n.a(this.f50142p, aVar.f50142p);
    }

    public final int hashCode() {
        int iE = u.e(this.f50128a.hashCode() * 31, 31, this.f50129b);
        byte[] bArr = this.f50130c;
        int iHashCode = (iE + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        byte[] bArr2 = this.f50131d;
        return this.f50142p.hashCode() + q4.a.g(q4.a.g(q4.a.g(q4.a.g(q4.a.g(q4.a.g(q4.a.g(q4.a.g(q4.a.g((this.f50133f.hashCode() + ((Boolean.hashCode(this.f50132e) + ((iHashCode + (bArr2 != null ? Arrays.hashCode(bArr2) : 0)) * 31)) * 31)) * 31, 31, this.f50134g), 31, this.f50135h), 31, this.f50136i), 31, this.f50137j), 31, this.f50138k), 31, this.l), 31, this.f50139m), 31, this.f50140n), 31, this.f50141o);
    }

    public final String toString() {
        String string = Arrays.toString(this.f50130c);
        String string2 = Arrays.toString(this.f50131d);
        t5.f fVar = this.f50133f;
        List list = this.f50134g;
        List list2 = this.f50135h;
        List list3 = this.f50136i;
        List list4 = this.f50137j;
        List list5 = this.f50138k;
        List list6 = this.l;
        List list7 = this.f50139m;
        List list8 = this.f50140n;
        List list9 = this.f50141o;
        List list10 = this.f50142p;
        StringBuilder sbV = defpackage.e.v("Contact(id=", this.f50128a, ", displayName=", this.f50129b, ", thumbnail=");
        u.r(sbV, string, ", photo=", string2, ", isStarred=");
        sbV.append(this.f50132e);
        sbV.append(", name=");
        sbV.append(fVar);
        sbV.append(", phones=");
        sbV.append(list);
        sbV.append(", emails=");
        sbV.append(list2);
        sbV.append(", addresses=");
        sbV.append(list3);
        sbV.append(", organizations=");
        sbV.append(list4);
        sbV.append(", websites=");
        sbV.append(list5);
        sbV.append(", socialMedias=");
        sbV.append(list6);
        sbV.append(", events=");
        sbV.append(list7);
        sbV.append(", notes=");
        sbV.append(list8);
        sbV.append(", accounts=");
        sbV.append(list9);
        sbV.append(", groups=");
        sbV.append(list10);
        sbV.append(")");
        return sbV.toString();
    }

    public /* synthetic */ a(String str, String str2, boolean z10) {
        t5.f fVar = new t5.f("", "", "", "", "", "", "", "", "");
        v vVar = v.f53866a;
        this(str, str2, null, null, z10, fVar, vVar, vVar, vVar, vVar, vVar, vVar, vVar, vVar, vVar, vVar);
    }
}
