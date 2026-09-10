package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import com.ironsource.InterfaceC0435l1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j41 extends u41 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15969f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f15970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f15971h;

    public j41(xd xdVar, h41 h41Var, DisplayMetrics displayMetrics, View view, a71 a71Var) {
        super("jfdrT3YDVcDOM9UB5LzDpqcbuDp5keVZHqGcg+MV5UCB23uYRRp2NQL5QwO7s7yD", "z81VgQq8DV/RpboX+za4HXvceA1wD9mZ3Lv8nuAqQVE=", xdVar, h41Var, a71Var.a(124));
        this.f15970g = displayMetrics;
        this.f15971h = view;
    }

    @Override // com.google.android.gms.internal.ads.u41
    public final void a(Method method, xd xdVar) throws IllegalAccessException, InvocationTargetException {
        switch (this.f15969f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", (View) this.f15971h, (Activity) this.f15970g);
                objArr.getClass();
                synchronized (xdVar) {
                    long jLongValue = ((Long) objArr[0]).longValue();
                    xdVar.b();
                    ((je) xdVar.f19193b).c0(jLongValue);
                    long jLongValue2 = ((Long) objArr[1]).longValue();
                    xdVar.b();
                    ((je) xdVar.f19193b).d0(jLongValue2);
                    String str = (String) objArr[2];
                    xdVar.b();
                    ((je) xdVar.f19193b).e0(str);
                    break;
                }
                return;
            case 1:
                Long[] lArr = new Long[9];
                Arrays.fill((Object[]) lArr, (Object) (-1L));
                Map map = (Map) this.f15970g;
                Long l = (Long) map.get("tcq");
                if (l == null) {
                    l = -1L;
                }
                lArr[0] = l;
                Long l10 = (Long) map.get("tpq");
                if (l10 == null) {
                    l10 = -1L;
                }
                lArr[1] = l10;
                Long l11 = (Long) map.get("tcv");
                if (l11 == null) {
                    l11 = -1L;
                }
                lArr[2] = l11;
                Long l12 = (Long) map.get("tpv");
                if (l12 == null) {
                    l12 = -1L;
                }
                lArr[3] = l12;
                Long l13 = (Long) map.get("tchv");
                if (l13 == null) {
                    l13 = -1L;
                }
                lArr[4] = l13;
                Long l14 = (Long) map.get("tphv");
                if (l14 == null) {
                    l14 = -1L;
                }
                lArr[5] = l14;
                Long l15 = (Long) map.get("tcc");
                if (l15 == null) {
                    l15 = -1L;
                }
                lArr[6] = l15;
                Long l16 = (Long) map.get("tpc");
                if (l16 == null) {
                    l16 = -1L;
                }
                lArr[7] = l16;
                Long l17 = (Long) map.get("tst");
                if (l17 == null) {
                    l17 = -1L;
                }
                lArr[8] = l17;
                for (int i10 = 0; i10 < 9; i10++) {
                    if (lArr[i10] == null) {
                        lArr[i10] = -1L;
                    }
                }
                Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(((p21) this.f15971h).ordinal()));
                lArr2.getClass();
                synchronized (xdVar) {
                    long jLongValue3 = lArr2[0].longValue();
                    xdVar.b();
                    ((je) xdVar.f19193b).m0(jLongValue3);
                    long jLongValue4 = lArr2[1].longValue();
                    xdVar.b();
                    ((je) xdVar.f19193b).C(jLongValue4);
                    long jLongValue5 = lArr2[2].longValue();
                    xdVar.b();
                    ((je) xdVar.f19193b).P0(jLongValue5);
                    long jLongValue6 = lArr2[3].longValue();
                    xdVar.b();
                    ((je) xdVar.f19193b).M0(jLongValue6);
                    long jLongValue7 = lArr2[4].longValue();
                    xdVar.b();
                    ((je) xdVar.f19193b).i0(jLongValue7);
                    long jLongValue8 = lArr2[5].longValue();
                    xdVar.b();
                    ((je) xdVar.f19193b).j0(jLongValue8);
                    long jLongValue9 = lArr2[6].longValue();
                    xdVar.b();
                    ((je) xdVar.f19193b).P(jLongValue9);
                    long jLongValue10 = lArr2[7].longValue();
                    xdVar.b();
                    ((je) xdVar.f19193b).Q(jLongValue10);
                    break;
                }
                return;
            default:
                View view = (View) this.f15971h;
                if (view == null) {
                    return;
                }
                Object objInvoke = method.invoke("", (DisplayMetrics) this.f15970g, view);
                objInvoke.getClass();
                Long[] lArr3 = (Long[]) objInvoke;
                he heVarZ = ie.z();
                long jLongValue11 = lArr3[2].longValue();
                heVarZ.b();
                ((ie) heVarZ.f19193b).B(jLongValue11);
                long jLongValue12 = lArr3[1].longValue();
                heVarZ.b();
                ((ie) heVarZ.f19193b).C(jLongValue12);
                long jLongValue13 = lArr3[0].longValue();
                heVarZ.b();
                ((ie) heVarZ.f19193b).D(jLongValue13);
                long jLongValue14 = lArr3[3].longValue();
                heVarZ.b();
                ((ie) heVarZ.f19193b).A(jLongValue14);
                long jLongValue15 = lArr3[4].longValue();
                heVarZ.b();
                ((ie) heVarZ.f19193b).E(jLongValue15);
                ie ieVar = (ie) heVarZ.e();
                xdVar.b();
                ((je) xdVar.f19193b).V(ieVar);
                return;
        }
    }

    public j41(xd xdVar, h41 h41Var, View view, Activity activity, a71 a71Var) {
        super("MB4NRPoKbszEsZs50F7mJwzu+33Ub7A+OagrfmieGdBjZs38LvzcQgcwQTLr3PB3", "U7Z7WtTc2NEgeomO+YkeOiOPYLQ8ra19osxSo/kBqLE=", xdVar, h41Var, a71Var.a(InterfaceC0435l1.d.b.f29112i));
        this.f15971h = view;
        this.f15970g = activity;
    }

    public j41(xd xdVar, h41 h41Var, p21 p21Var, Map map, a71 a71Var) {
        super("0llJphW+1AJxnxbH/gLXWqExBUUJf0DQ3WuxUSKByDNRS1LORshIg0jq004o4mzE", "HgFzVQOFBY50xlS1g5v9F7L61Tt5netYE+jncsHeWeQ=", xdVar, h41Var, a71Var.a(122));
        this.f15970g = map;
        this.f15971h = p21Var;
    }
}
