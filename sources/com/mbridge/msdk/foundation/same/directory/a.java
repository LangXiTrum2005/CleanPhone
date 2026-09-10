package com.mbridge.msdk.foundation.same.directory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<a> f33759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f33761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f33762d;

    public void a(c cVar, String str) {
        a aVar = new a();
        aVar.a(cVar);
        aVar.a(str);
        a(aVar);
    }

    public String b() {
        return this.f33760b;
    }

    public a c() {
        return this.f33761c;
    }

    public c d() {
        return this.f33762d;
    }

    public void b(a aVar) {
        this.f33761c = aVar;
    }

    public void a(a aVar) {
        if (this.f33759a == null) {
            this.f33759a = new ArrayList();
        }
        aVar.b(this);
        this.f33759a.add(aVar);
    }

    public void a(List<a> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<a> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public List<a> a() {
        return this.f33759a;
    }

    public void a(String str) {
        this.f33760b = str;
    }

    public void a(c cVar) {
        this.f33762d = cVar;
    }
}
