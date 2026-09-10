package com.adjust.sdk.sig;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f7015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f7016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3 f7017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v2[] f7018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l1 f7019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f7020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f7021g;

    public v2(x xVar, i1 i1Var, p3 p3Var, v2[] v2VarArr) {
        this.f7015a = xVar;
        this.f7016b = i1Var;
        this.f7017c = p3Var;
        this.f7018d = v2VarArr;
        this.f7019e = i1Var.f6967a;
        int iOrdinal = p3Var.ordinal();
        v2 v2Var = v2VarArr[iOrdinal];
        if (v2Var == null && v2Var == this) {
            return;
        }
        v2VarArr[iOrdinal] = this;
    }

    public final void a(r1 r1Var, Object obj) {
        String strDiscriminator;
        Set setC;
        int iA = w1.a(this.f7016b.f6967a.f6981c);
        if (iA == 0) {
            strDiscriminator = null;
        } else {
            if (iA == 1) {
                p2 p2VarD = r1Var.a().d();
                if (g1.a(p2VarD, e3.f6950a) || g1.a(p2VarD, h3.f6962a)) {
                    Iterator it = r1Var.a().getAnnotations().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            strDiscriminator = "type";
                            break;
                        }
                        Annotation annotation = (Annotation) it.next();
                        if (annotation instanceof k1) {
                            strDiscriminator = ((k1) annotation).discriminator();
                            break;
                        }
                    }
                }
            } else if (iA != 2) {
                throw new y1();
            }
            strDiscriminator = null;
        }
        if (strDiscriminator != null) {
            i1 i1Var = this.f7016b;
            l2 l2VarA = r1Var.a();
            g1.a(l2VarA.d(), e3.f6950a);
            if (l2VarA instanceof h) {
                setC = ((h) l2VarA).c();
            } else {
                HashSet hashSet = new HashSet(l2VarA.e());
                int iE = l2VarA.e();
                for (int i10 = 0; i10 < iE; i10++) {
                    hashSet.add(l2VarA.a(i10));
                }
                setC = hashSet;
            }
            if (setC.contains(strDiscriminator)) {
                String strB = r1Var.a().b();
                String strB2 = r1Var.a().b();
                throw new m1(defpackage.e.q(strDiscriminator, "'.", defpackage.e.v("Class '", strB2, "' cannot be serialized ", (i1Var.f6967a.f6981c == 2 && g1.a(strB, strB2)) ? "in ALL_JSON_OBJECTS class discriminator mode" : defpackage.e.f('\'', "as base class '", strB), " because it has property name that conflicts with JSON class discriminator '")), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
            }
            p2 p2VarD2 = r1Var.a().d();
            if (p2VarD2 instanceof o2) {
                throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            if (p2VarD2 instanceof f2) {
                throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            String strB3 = r1Var.a().b();
            this.f7020f = strDiscriminator;
            this.f7021g = strB3;
        }
        r1Var.a(this, obj);
    }

    public final void a(String str) {
        byte b10;
        o1 o1Var = this.f7015a.f7024a;
        o1Var.a(o1Var.f6994b, str.length() + 2);
        char[] cArr = o1Var.f6993a;
        int i10 = o1Var.f6994b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c4 = cArr[i13];
            byte[] bArr = w2.f7023b;
            if (c4 < bArr.length && bArr[c4] != 0) {
                int length2 = str.length();
                for (int i14 = i13 - i11; i14 < length2; i14++) {
                    int iA = o1Var.a(i13, 2);
                    char cCharAt = str.charAt(i14);
                    byte[] bArr2 = w2.f7023b;
                    if (cCharAt >= bArr2.length || (b10 = bArr2[cCharAt]) == 0) {
                        int i15 = iA + 1;
                        o1Var.f6993a[iA] = cCharAt;
                        i13 = i15;
                    } else if (b10 == 1) {
                        String str2 = w2.f7022a[cCharAt];
                        int iA2 = o1Var.a(iA, str2.length());
                        str2.getChars(0, str2.length(), o1Var.f6993a, iA2);
                        int length3 = str2.length() + iA2;
                        o1Var.f6994b = length3;
                        i13 = length3;
                    } else {
                        char[] cArr2 = o1Var.f6993a;
                        cArr2[iA] = '\\';
                        cArr2[iA + 1] = (char) b10;
                        i13 = iA + 2;
                        o1Var.f6994b = i13;
                    }
                }
                int iA3 = o1Var.a(i13, 1);
                o1Var.f6993a[iA3] = '\"';
                o1Var.f6994b = iA3 + 1;
                return;
            }
            i13++;
        }
        cArr[i12] = '\"';
        o1Var.f6994b = i12 + 1;
    }
}
