package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class d0 extends c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f7680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f7681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f7682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d f7683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private StringBuffer f7684j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f7685k;
    private final ExecutorService l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f7686m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f7687n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f7688o;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7689a;

        public a(String str) {
            this.f7689a = str;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) d0.this.f7611a.a(z4.U0)).booleanValue()) {
                    synchronized (d0.this.f7685k) {
                        StringUtils.replaceAll(d0.this.f7684j, this.f7689a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.f7684j, this.f7689a, uri.toString());
                }
                d0.this.f7681g.a(uri.toString(), this.f7689a);
                return;
            }
            com.applovin.impl.sdk.p pVar = d0.this.f7613c;
            if (com.applovin.impl.sdk.p.a()) {
                d0 d0Var = d0.this;
                defpackage.e.C(new StringBuilder("Failed to cache JavaScript resource "), this.f7689a, d0Var.f7613c, d0Var.f7612b);
            }
            if (d0.this.f7683i != null) {
                d0.this.f7683i.a(d0.this.f7680f, true);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f7692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f7693c;

        public b(String str, String str2, String str3) {
            this.f7691a = str;
            this.f7692b = str2;
            this.f7693c = str3;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) d0.this.f7611a.a(z4.U0)).booleanValue()) {
                    synchronized (d0.this.f7685k) {
                        StringUtils.replaceAll(d0.this.f7684j, this.f7691a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.f7684j, this.f7691a, uri.toString());
                }
                d0.this.f7681g.a(uri.toString(), this.f7691a);
                return;
            }
            if (!d0.this.f7681g.Q().contains(this.f7692b + this.f7693c) || d0.this.f7683i == null) {
                return;
            }
            d0.this.f7683i.a(d0.this.f7680f, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7695a;

        public c(String str) {
            this.f7695a = str;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri == null) {
                if (d0.this.f7683i != null) {
                    d0.this.f7683i.a(d0.this.f7680f, true);
                }
            } else {
                if (((Boolean) d0.this.f7611a.a(z4.U0)).booleanValue()) {
                    synchronized (d0.this.f7685k) {
                        StringUtils.replaceAll(d0.this.f7684j, this.f7695a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.f7684j, this.f7695a, uri.toString());
                }
                d0.this.f7681g.a(uri.toString(), this.f7695a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface d {
        void a(String str, boolean z10);
    }

    public d0(String str, com.applovin.impl.sdk.ad.b bVar, List list, ExecutorService executorService, String str2, com.applovin.impl.sdk.l lVar, d dVar) {
        super("AsyncTaskCacheHTMLResources", lVar);
        this.f7680f = str;
        this.f7681g = bVar;
        this.f7682h = list;
        this.l = executorService;
        this.f7686m = str2;
        this.f7683i = dVar;
        this.f7684j = new StringBuffer(str);
        this.f7685k = new Object();
    }

    private HashSet f() {
        HashSet hashSet = new HashSet();
        for (String str : StringUtils.getRegexMatches(StringUtils.match(this.f7680f, (String) this.f7611a.a(z4.f10204m5)), 1)) {
            if (this.f7615e.get()) {
                return null;
            }
            if (StringUtils.isValidString(str)) {
                hashSet.add(new e0(str, this.f7681g, Collections.EMPTY_LIST, false, this.f7686m, this.f7611a, new a(str)));
            } else if (com.applovin.impl.sdk.p.a()) {
                defpackage.e.A("Skip caching of non-resource ", str, this.f7613c, this.f7612b);
            }
        }
        return hashSet;
    }

    private Collection g() {
        HashSet hashSet = new HashSet();
        for (char c4 : ((String) this.f7611a.a(z4.E0)).toCharArray()) {
            hashSet.add(Character.valueOf(c4));
        }
        hashSet.add('\"');
        return hashSet;
    }

    private void a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.l.submit((e0) it.next()));
        }
        this.f7688o = arrayList;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((Future) it2.next()).get();
            } catch (Throwable unused) {
            }
        }
    }

    private HashSet d() {
        HashSet hashSet = new HashSet();
        List listH = this.f7681g.H();
        Collection collectionG = g();
        for (String str : this.f7682h) {
            int iIndexOf = 0;
            int i10 = 0;
            while (iIndexOf < this.f7680f.length()) {
                if (this.f7615e.get()) {
                    return null;
                }
                iIndexOf = this.f7680f.indexOf(str, i10);
                if (iIndexOf == -1) {
                    break;
                }
                int length = this.f7680f.length();
                int i11 = iIndexOf;
                while (!collectionG.contains(Character.valueOf(this.f7680f.charAt(i11))) && i11 < length) {
                    i11++;
                }
                if (i11 <= iIndexOf || i11 == length) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f7613c.b(this.f7612b, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return null;
                }
                String strSubstring = this.f7680f.substring(str.length() + iIndexOf, i11);
                String strH = wi.d.h(str, strSubstring);
                if (StringUtils.isValidString(strSubstring) && !listH.contains(strH)) {
                    hashSet.add(new e0(strH, this.f7681g, Arrays.asList(str), true, this.f7686m, this.f7611a, new b(strH, str, strSubstring)));
                } else if (com.applovin.impl.sdk.p.a()) {
                    defpackage.e.A("Skip caching of optional or non-resource ", strSubstring, this.f7613c, this.f7612b);
                }
                i10 = i11;
            }
        }
        return hashSet;
    }

    private HashSet e() {
        List list;
        HashSet hashSet = new HashSet();
        List listQ = this.f7681g.Q();
        List listH = this.f7681g.H();
        ArrayList arrayList = new ArrayList();
        Collection collectionG = g();
        for (String str : this.f7682h) {
            int iIndexOf = 0;
            int i10 = 0;
            while (iIndexOf < this.f7680f.length()) {
                if (this.f7615e.get()) {
                    return null;
                }
                iIndexOf = this.f7680f.indexOf(str, i10);
                if (iIndexOf == -1) {
                    break;
                }
                int length = this.f7680f.length();
                int i11 = iIndexOf;
                while (!collectionG.contains(Character.valueOf(this.f7680f.charAt(i11))) && i11 < length) {
                    i11++;
                }
                if (i11 <= iIndexOf || i11 == length) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f7613c.b(this.f7612b, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return null;
                }
                String strSubstring = this.f7680f.substring(str.length() + iIndexOf, i11);
                String strH = wi.d.h(str, strSubstring);
                if (!StringUtils.isValidString(strSubstring) || listH.contains(strH)) {
                    list = listQ;
                    if (com.applovin.impl.sdk.p.a()) {
                        defpackage.e.A("Skip caching of optional or non-resource ", strSubstring, this.f7613c, this.f7612b);
                    }
                } else if (listQ.contains(strH)) {
                    list = listQ;
                    hashSet.add(new e0(strH, this.f7681g, Arrays.asList(str), true, this.f7686m, this.f7611a, new c(strH)));
                } else {
                    list = listQ;
                    if (com.applovin.impl.sdk.p.a()) {
                        defpackage.e.A("Skip caching of uncategorized resource: ", strSubstring, this.f7613c, this.f7612b);
                    }
                    arrayList.add(strH);
                }
                i10 = i11;
                listQ = list;
            }
        }
        this.f7681g.a(arrayList);
        return hashSet;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() throws InterruptedException {
        HashSet hashSetF;
        if (this.f7615e.get()) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.f7680f)) {
            a(this.f7680f);
            return Boolean.FALSE;
        }
        if (!((Boolean) this.f7611a.a(z4.F0)).booleanValue()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f7613c.a(this.f7612b, "Resource caching is disabled, skipping cache...");
            }
            a(this.f7680f);
            return Boolean.FALSE;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSetE = ((Boolean) this.f7611a.a(z4.Z0)).booleanValue() ? e() : d();
        if (hashSetE != null) {
            hashSet.addAll(hashSetE);
        }
        if (((Boolean) this.f7611a.a(z4.f10195l5)).booleanValue() && (hashSetF = f()) != null) {
            hashSet.addAll(hashSetF);
        }
        this.f7687n = new ArrayList(hashSet);
        if (this.f7615e.get()) {
            return Boolean.FALSE;
        }
        List list = this.f7687n;
        if (list == null || list.isEmpty()) {
            a(this.f7680f);
            return Boolean.FALSE;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f7613c.a(this.f7612b, "Executing " + this.f7687n.size() + " caching operations...");
        }
        if (this.f7611a.s0().e()) {
            a(this.f7687n);
        } else {
            this.l.invokeAll(this.f7687n);
        }
        if (((Boolean) this.f7611a.a(z4.U0)).booleanValue()) {
            synchronized (this.f7685k) {
                a(this.f7684j.toString());
            }
        } else {
            a(this.f7684j.toString());
        }
        return Boolean.TRUE;
    }

    public void c() {
        List list = this.f7687n;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e0) it.next()).a(true);
            }
        }
        List<Future> list2 = this.f7688o;
        if (list2 != null) {
            for (Future future : list2) {
                if (!future.isDone()) {
                    future.cancel(true);
                }
            }
        }
    }

    private void a(String str) {
        d dVar;
        if (this.f7615e.get() || (dVar = this.f7683i) == null) {
            return;
        }
        dVar.a(str, false);
    }
}
