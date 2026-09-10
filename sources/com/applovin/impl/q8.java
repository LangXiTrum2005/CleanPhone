package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class q8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q8 f9109f = new q8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q8 f9110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f9112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f9113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final List f9114e;

    public q8(String str, Map map, q8 q8Var) {
        this.f9110a = q8Var;
        this.f9111b = str;
        this.f9112c = Collections.unmodifiableMap(map);
        this.f9114e = new ArrayList();
    }

    public Map a() {
        return this.f9112c;
    }

    public List b() {
        return Collections.unmodifiableList(this.f9114e);
    }

    public String c() {
        return this.f9111b;
    }

    public String d() {
        return this.f9113d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f9111b + "', text='" + this.f9113d + "', attributes=" + this.f9112c + '}';
    }

    public List a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        ArrayList arrayList = new ArrayList(this.f9114e.size());
        for (q8 q8Var : this.f9114e) {
            if (str.equalsIgnoreCase(q8Var.c())) {
                arrayList.add(q8Var);
            }
        }
        return arrayList;
    }

    public q8 b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        if (this.f9114e.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        while (!arrayList.isEmpty()) {
            q8 q8Var = (q8) arrayList.get(0);
            arrayList.remove(0);
            if (str.equalsIgnoreCase(q8Var.c())) {
                return q8Var;
            }
            arrayList.addAll(q8Var.b());
        }
        return null;
    }

    public q8 c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        for (q8 q8Var : this.f9114e) {
            if (str.equalsIgnoreCase(q8Var.c())) {
                return q8Var;
            }
        }
        return null;
    }

    private q8() {
        this.f9110a = null;
        this.f9111b = "";
        this.f9112c = Collections.EMPTY_MAP;
        this.f9113d = "";
        this.f9114e = Collections.EMPTY_LIST;
    }
}
