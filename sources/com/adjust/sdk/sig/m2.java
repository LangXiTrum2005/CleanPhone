package com.adjust.sdk.sig;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 implements l2, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2 f6985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f6987c;

    public m2(l2 l2Var) {
        Set setC;
        this.f6985a = l2Var;
        this.f6986b = l2Var.b() + '?';
        if (l2Var instanceof h) {
            setC = ((h) l2Var).c();
        } else {
            HashSet hashSet = new HashSet(l2Var.e());
            int iE = l2Var.e();
            for (int i10 = 0; i10 < iE; i10++) {
                hashSet.add(l2Var.a(i10));
            }
            setC = hashSet;
        }
        this.f6987c = setC;
    }

    @Override // com.adjust.sdk.sig.l2
    public final String a(int i10) {
        return this.f6985a.a(i10);
    }

    @Override // com.adjust.sdk.sig.l2
    public final l2 b(int i10) {
        return this.f6985a.b(i10);
    }

    @Override // com.adjust.sdk.sig.h
    public final Set c() {
        return this.f6987c;
    }

    @Override // com.adjust.sdk.sig.l2
    public final p2 d() {
        return this.f6985a.d();
    }

    @Override // com.adjust.sdk.sig.l2
    public final int e() {
        return this.f6985a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2) && g1.a(this.f6985a, ((m2) obj).f6985a);
    }

    @Override // com.adjust.sdk.sig.l2
    public final List getAnnotations() {
        return this.f6985a.getAnnotations();
    }

    public final int hashCode() {
        return this.f6985a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6985a);
        sb2.append('?');
        return sb2.toString();
    }

    @Override // com.adjust.sdk.sig.l2
    public final boolean a() {
        return this.f6985a.a();
    }

    @Override // com.adjust.sdk.sig.l2
    public final String b() {
        return this.f6986b;
    }
}
