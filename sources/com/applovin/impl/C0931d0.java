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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.applovin.impl.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0931d0 extends AbstractCallableC0929c0 {
    private final String f;
    private final com.applovin.impl.sdk.ad.b g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f10664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c f10665i;
    private StringBuffer j;
    private final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ExecutorService f10666l;
    private final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f10667n;
    private List o;

    /* JADX INFO: renamed from: com.applovin.impl.d0$a */
    public class a implements C0933e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10668a;

        public a(String str) {
            this.f10668a = str;
        }

        @Override // com.applovin.impl.C0933e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) C0931d0.this.f10623a.a(x4.T0)).booleanValue()) {
                    synchronized (C0931d0.this.k) {
                        StringUtils.replaceAll(C0931d0.this.j, this.f10668a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(C0931d0.this.j, this.f10668a, uri.toString());
                }
                C0931d0.this.g.a(uri.toString(), this.f10668a);
                return;
            }
            com.applovin.impl.sdk.o oVar = C0931d0.this.f10625c;
            if (com.applovin.impl.sdk.o.a()) {
                C0931d0 c0931d0 = C0931d0.this;
                androidx.media3.extractor.text.ttml.a.B(new StringBuilder("Failed to cache JavaScript resource "), this.f10668a, c0931d0.f10625c, c0931d0.f10624b);
            }
            if (C0931d0.this.f10665i != null) {
                C0931d0.this.f10665i.a(C0931d0.this.f, true);
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.d0$b */
    public class b implements C0933e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f10672c;

        public b(String str, String str2, String str3) {
            this.f10670a = str;
            this.f10671b = str2;
            this.f10672c = str3;
        }

        @Override // com.applovin.impl.C0933e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) C0931d0.this.f10623a.a(x4.T0)).booleanValue()) {
                    synchronized (C0931d0.this.k) {
                        StringUtils.replaceAll(C0931d0.this.j, this.f10670a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(C0931d0.this.j, this.f10670a, uri.toString());
                }
                C0931d0.this.g.a(uri.toString(), this.f10670a);
                return;
            }
            if (!C0931d0.this.g.Q().contains(this.f10671b + this.f10672c) || C0931d0.this.f10665i == null) {
                return;
            }
            C0931d0.this.f10665i.a(C0931d0.this.f, true);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.d0$c */
    public interface c {
        void a(String str, boolean z2);
    }

    public C0931d0(String str, com.applovin.impl.sdk.ad.b bVar, List list, ExecutorService executorService, String str2, com.applovin.impl.sdk.k kVar, c cVar) {
        super("AsyncTaskCacheHTMLResources", kVar);
        this.f = str;
        this.g = bVar;
        this.f10664h = list;
        this.f10666l = executorService;
        this.m = str2;
        this.f10665i = cVar;
        this.j = new StringBuffer(str);
        this.k = new Object();
    }

    private Collection f() {
        HashSet hashSet = new HashSet();
        for (char c2 : ((String) this.f10623a.a(x4.D0)).toCharArray()) {
            hashSet.add(Character.valueOf(c2));
        }
        hashSet.add(Character.valueOf(AbstractJsonLexerKt.STRING));
        return hashSet;
    }

    private void a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f10666l.submit((C0933e0) it.next()));
        }
        this.o = arrayList;
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
        List listH = this.g.H();
        Collection collectionF = f();
        for (String str : this.f10664h) {
            int iIndexOf = 0;
            int i2 = 0;
            while (iIndexOf < this.f.length()) {
                if (this.f10626e.get()) {
                    return null;
                }
                iIndexOf = this.f.indexOf(str, i2);
                if (iIndexOf == -1) {
                    break;
                }
                int length = this.f.length();
                int i3 = iIndexOf;
                while (!collectionF.contains(Character.valueOf(this.f.charAt(i3))) && i3 < length) {
                    i3++;
                }
                if (i3 <= iIndexOf || i3 == length) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f10625c.b(this.f10624b, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return null;
                }
                String strSubstring = this.f.substring(str.length() + iIndexOf, i3);
                String strM = android.support.v4.media.a.m(str, strSubstring);
                if (StringUtils.isValidString(strSubstring) && !listH.contains(strM)) {
                    hashSet.add(new C0933e0(strM, this.g, Arrays.asList(str), true, this.m, this.f10623a, new b(strM, str, strSubstring)));
                } else if (com.applovin.impl.sdk.o.a()) {
                    androidx.media3.extractor.text.ttml.a.y("Skip caching of optional or non-resource ", strSubstring, this.f10625c, this.f10624b);
                }
                i2 = i3;
            }
        }
        return hashSet;
    }

    private HashSet e() {
        HashSet hashSet = new HashSet();
        for (String str : StringUtils.getRegexMatches(StringUtils.match(this.f, (String) this.f10623a.a(x4.h5)), 1)) {
            if (this.f10626e.get()) {
                return null;
            }
            if (StringUtils.isValidString(str)) {
                hashSet.add(new C0933e0(str, this.g, Collections.EMPTY_LIST, false, this.m, this.f10623a, new a(str)));
            } else if (com.applovin.impl.sdk.o.a()) {
                androidx.media3.extractor.text.ttml.a.y("Skip caching of non-resource ", str, this.f10625c, this.f10624b);
            }
        }
        return hashSet;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() throws InterruptedException {
        HashSet hashSetE;
        if (this.f10626e.get()) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.f)) {
            a(this.f);
            return Boolean.FALSE;
        }
        if (!((Boolean) this.f10623a.a(x4.E0)).booleanValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f10625c.a(this.f10624b, "Resource caching is disabled, skipping cache...");
            }
            a(this.f);
            return Boolean.FALSE;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSetD = d();
        if (hashSetD != null) {
            hashSet.addAll(hashSetD);
        }
        if (((Boolean) this.f10623a.a(x4.g5)).booleanValue() && (hashSetE = e()) != null) {
            hashSet.addAll(hashSetE);
        }
        this.f10667n = new ArrayList(hashSet);
        if (this.f10626e.get()) {
            return Boolean.FALSE;
        }
        List list = this.f10667n;
        if (list == null || list.isEmpty()) {
            a(this.f);
            return Boolean.FALSE;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f10625c.a(this.f10624b, "Executing " + this.f10667n.size() + " caching operations...");
        }
        if (this.f10623a.q0().e()) {
            a(this.f10667n);
        } else {
            this.f10666l.invokeAll(this.f10667n);
        }
        if (((Boolean) this.f10623a.a(x4.T0)).booleanValue()) {
            synchronized (this.k) {
                a(this.j.toString());
            }
        } else {
            a(this.j.toString());
        }
        return Boolean.TRUE;
    }

    public void c() {
        List list = this.f10667n;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C0933e0) it.next()).a(true);
            }
        }
        List<Future> list2 = this.o;
        if (list2 != null) {
            for (Future future : list2) {
                if (!future.isDone()) {
                    future.cancel(true);
                }
            }
        }
    }

    private void a(String str) {
        c cVar;
        if (this.f10626e.get() || (cVar = this.f10665i) == null) {
            return;
        }
        cVar.a(str, false);
    }
}
