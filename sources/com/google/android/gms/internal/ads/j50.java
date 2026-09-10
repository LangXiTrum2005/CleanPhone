package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fx1 f15984a;

    public j50(a50 a50Var, Context context, String str, zzr zzrVar) {
        hx1 hx1VarA = hx1.a(context);
        hx1 hx1VarA2 = hx1.a(zzrVar);
        hx1 hx1VarA3 = hx1.a(str);
        fx1 fx1Var = a50Var.f11874m;
        fx1 fx1VarA = fx1.a(new v50(fx1Var, 27));
        fx1 fx1VarA2 = fx1.a(new er0(a50Var.J0, 11));
        this.f15984a = fx1.a(new og0(hx1VarA, hx1VarA2, hx1VarA3, fx1.a(new d80(hx1VarA, a50Var.f11856c, a50Var.I, fx1VarA, fx1VarA2)), fx1VarA, fx1VarA2, a50Var.f11865h, a50Var.J, fx1Var));
    }

    public j50(ac0 ac0Var, hz hzVar, Context context, View view, Activity activity, String str, HashMap map, xd xdVar, p21 p21Var) {
        hx1 hx1VarA = hx1.a(p21Var);
        hx1 hx1VarB = hx1.b(str);
        hx1 hx1VarA2 = hx1.a(xdVar);
        fx1 fx1Var = (fx1) hzVar.f15434c;
        hx1 hx1Var = (hx1) ac0Var.f11978b;
        fx1 fx1Var2 = (fx1) ac0Var.f11985i;
        p41 p41Var = new p41(0, fx1Var, fx1Var2, hx1VarA2, hx1Var);
        mt0 mt0Var = new mt0(hx1VarA2, fx1Var, fx1Var2, 2);
        hx1 hx1VarA3 = hx1.a(map);
        fx1 fx1Var3 = (fx1) hzVar.f15434c;
        fx1 fx1Var4 = (fx1) ac0Var.f11985i;
        m41 m41Var = new m41(hx1VarA2, fx1Var3, hx1VarA3, fx1Var4);
        p41 p41Var2 = new p41(1, fx1Var3, fx1Var4, hx1VarA2, (hx1) ac0Var.f11981e);
        k41 k41Var = new k41(hx1VarA2, fx1Var3, hx1VarA, hx1VarA3, fx1Var4, 1);
        mt0 mt0Var2 = new mt0(hx1VarA2, fx1Var3, fx1Var4, 3);
        hx1 hx1VarA4 = hx1.a(context);
        fx1 fx1Var5 = (fx1) hzVar.f15434c;
        fx1 fx1Var6 = (fx1) ac0Var.f11985i;
        n60 n60Var = new n60(hx1VarA2, fx1Var5, hx1VarA, hx1VarA4, hx1VarA3, fx1Var6);
        hx1 hx1Var2 = (hx1) ac0Var.f11978b;
        hx1 hx1Var3 = (hx1) ac0Var.f11981e;
        j90 j90Var = new j90(hx1VarA2, fx1Var5, hx1VarA3, hx1Var2, hx1VarA, hx1Var3, fx1Var6);
        p41 p41Var3 = new p41(2, fx1Var5, fx1Var6, hx1VarA2, hx1Var2);
        d80 d80Var = new d80(hx1VarA2, fx1Var5, hx1VarA3, hx1Var2, fx1Var6);
        m41 m41Var2 = new m41(hx1VarA2, hx1VarA3, hx1Var3, fx1Var6);
        int i10 = lx1.f17149c;
        ArrayList arrayList = new ArrayList(11);
        List list = Collections.EMPTY_LIST;
        arrayList.add(p41Var);
        arrayList.add(mt0Var);
        arrayList.add(m41Var);
        arrayList.add(p41Var2);
        arrayList.add(k41Var);
        arrayList.add(mt0Var2);
        arrayList.add(n60Var);
        arrayList.add(j90Var);
        arrayList.add(p41Var3);
        arrayList.add(d80Var);
        arrayList.add(m41Var2);
        lx1 lx1Var = new lx1(arrayList, list);
        hx1 hx1VarB2 = hx1.b(view);
        hx1 hx1VarB3 = hx1.b(activity);
        fx1 fx1Var7 = (fx1) hzVar.f15434c;
        fx1 fx1Var8 = (fx1) ac0Var.f11985i;
        k41 k41Var2 = new k41(hx1VarA2, fx1Var7, hx1VarB2, hx1VarB3, fx1Var8, 0);
        fx1 fx1VarA = fx1.a(new ni0(hx1VarA4, 7));
        v41 v41Var = new v41(hx1VarA2, fx1Var7, fx1VarA, hx1VarB2, fx1Var8);
        ArrayList arrayList2 = new ArrayList(11);
        List list2 = Collections.EMPTY_LIST;
        arrayList2.add(p41Var);
        arrayList2.add(mt0Var);
        arrayList2.add(p41Var2);
        arrayList2.add(k41Var2);
        arrayList2.add(v41Var);
        arrayList2.add(k41Var);
        arrayList2.add(mt0Var2);
        arrayList2.add(n60Var);
        arrayList2.add(j90Var);
        arrayList2.add(p41Var3);
        arrayList2.add(d80Var);
        lx1 lx1Var2 = new lx1(arrayList2, list2);
        v41 v41Var2 = new v41(hx1VarA2, (fx1) hzVar.f15434c, hx1VarA3, fx1VarA, (fx1) ac0Var.f11985i);
        ArrayList arrayList3 = new ArrayList(12);
        List list3 = Collections.EMPTY_LIST;
        arrayList3.add(p41Var);
        arrayList3.add(mt0Var);
        arrayList3.add(p41Var2);
        arrayList3.add(k41Var2);
        arrayList3.add(v41Var);
        arrayList3.add(k41Var);
        arrayList3.add(mt0Var2);
        arrayList3.add(n60Var);
        arrayList3.add(j90Var);
        arrayList3.add(p41Var3);
        arrayList3.add(d80Var);
        arrayList3.add(v41Var2);
        this.f15984a = fx1.a(new q70((fx1) ac0Var.f11986j, (fx1) ac0Var.l, (fx1) hzVar.f15434c, hx1VarA, hx1VarB, hx1VarA2, lx1Var, lx1Var2, new lx1(arrayList3, list3), (fx1) ac0Var.f11985i));
    }
}
