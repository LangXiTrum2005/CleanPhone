package com.smartdigimkt.e0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f34599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f34601c;
    private List<e> d;

    public void a(a aVar) {
        this.f34599a = aVar;
    }

    public String b() {
        return this.f34600b;
    }

    public e c() {
        return this.f34601c;
    }

    public a d() {
        return this.f34599a;
    }

    public void a(String str) {
        this.f34600b = str;
    }

    public void b(e eVar) {
        this.f34601c = eVar;
    }

    public List<e> a() {
        return this.d;
    }

    public void a(e eVar) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        eVar.b(this);
        this.d.add(eVar);
    }

    public void a(a aVar, String str) {
        e eVar = new e();
        eVar.a(aVar);
        eVar.a(str);
        a(eVar);
    }

    public void a(List<e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }
}
