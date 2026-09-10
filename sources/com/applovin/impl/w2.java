package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class w2 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f9935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g3 f9936d;

    public w2(String str, String str2, boolean z10, g3 g3Var) {
        this.f9933a = str;
        this.f9934b = str2;
        this.f9935c = z10;
        this.f9936d = g3Var;
    }

    public String a() {
        return this.f9934b;
    }

    public List b() {
        List listL = this.f9936d.l();
        return (listL == null || listL.isEmpty()) ? Collections.singletonList(this.f9933a) : listL;
    }

    public String c() {
        return this.f9933a;
    }

    public g3 d() {
        return this.f9936d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            w2 w2Var = (w2) obj;
            String str = this.f9933a;
            if (str == null ? w2Var.f9933a != null : !str.equals(w2Var.f9933a)) {
                return false;
            }
            String str2 = this.f9934b;
            if (str2 == null ? w2Var.f9934b != null : !str2.equals(w2Var.f9934b)) {
                return false;
            }
            if (this.f9935c == w2Var.f9935c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f9933a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9934b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f9935c ? 1 : 0);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(w2 w2Var) {
        return this.f9934b.compareToIgnoreCase(w2Var.f9934b);
    }
}
