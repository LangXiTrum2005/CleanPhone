package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sg extends yg {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f19967h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f19968i;

    public sg(fg fgVar, xd xdVar, int i10, View view) {
        super(fgVar, "K/Oo81d3D7QQWAvkxOkmH49qSlOsGQFHscMya6S21HBqr+GdnpBDhLtEJWB1CCZB", "Ge8je/arysmNa4UdtKuRe+4JSpIyhDOrTZ5OtsYb5ag=", xdVar, i10, 57);
        this.f19968i = view;
    }

    @Override // com.google.android.gms.internal.ads.yg
    public final void a() {
        switch (this.f19967h) {
            case 0:
                Method method = this.f22235e;
                b2 b2Var = (b2) this.f19968i;
                long[] jArr = (long[]) method.invoke(null, Long.valueOf(b2Var.f12598c), Long.valueOf(b2Var.f12599d), Long.valueOf(b2Var.f12600e), Long.valueOf(b2Var.f12601f));
                xd xdVar = this.f22234d;
                synchronized (xdVar) {
                    long j10 = jArr[0];
                    xdVar.b();
                    ((je) xdVar.f19193b).i0(j10);
                    long j11 = jArr[1];
                    xdVar.b();
                    ((je) xdVar.f19193b).j0(j11);
                    break;
                }
                return;
            case 1:
                Method method2 = this.f22235e;
                g9 g9Var = (g9) this.f19968i;
                List list = g9Var.f14798a;
                g9Var.f14798a = Collections.EMPTY_LIST;
                int iIntValue = ((Integer) method2.invoke(null, list)).intValue();
                xd xdVar2 = this.f22234d;
                synchronized (xdVar2) {
                    int iN = v71.n(iIntValue);
                    xdVar2.b();
                    ((je) xdVar2.f19193b).t0(iN);
                    break;
                }
                return;
            case 2:
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) this.f19968i;
                if (stackTraceElementArr != null) {
                    tf tfVar = new tf((String) this.f22235e.invoke(null, stackTraceElementArr));
                    xd xdVar3 = this.f22234d;
                    synchronized (xdVar3) {
                        try {
                            long jLongValue = tfVar.T.longValue();
                            xdVar3.b();
                            ((je) xdVar3.f19193b).M(jLongValue);
                            if (((Boolean) tfVar.U).booleanValue()) {
                                int i10 = true != ((Boolean) tfVar.V).booleanValue() ? 2 : 1;
                                xdVar3.b();
                                ((je) xdVar3.f19193b).q0(i10);
                            } else {
                                xdVar3.b();
                                ((je) xdVar3.f19193b).q0(3);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return;
                }
                return;
            default:
                View view = (View) this.f19968i;
                if (view != null) {
                    Boolean bool = (Boolean) zzba.zzc().a(am.f12373u4);
                    Boolean bool2 = (Boolean) zzba.zzc().a(am.Dc);
                    String str = (String) this.f22235e.invoke(null, view, this.f22231a.f14387a.getResources().getDisplayMetrics(), bool, bool2);
                    jg jgVar = new jg(19);
                    HashMap mapS = pi1.s(str);
                    if (mapS != null) {
                        jgVar.S = (Long) mapS.get(0);
                        jgVar.T = (Long) mapS.get(1);
                        jgVar.U = (Long) mapS.get(2);
                        jgVar.V = (Long) mapS.get(3);
                        jgVar.W = (Long) mapS.get(4);
                    }
                    he heVarZ = ie.z();
                    long jLongValue2 = jgVar.S.longValue();
                    heVarZ.b();
                    ((ie) heVarZ.f19193b).B(jLongValue2);
                    long jLongValue3 = jgVar.T.longValue();
                    heVarZ.b();
                    ((ie) heVarZ.f19193b).C(jLongValue3);
                    long jLongValue4 = jgVar.U.longValue();
                    heVarZ.b();
                    ((ie) heVarZ.f19193b).D(jLongValue4);
                    if (bool2.booleanValue()) {
                        long jLongValue5 = jgVar.W.longValue();
                        heVarZ.b();
                        ((ie) heVarZ.f19193b).A(jLongValue5);
                    }
                    if (bool.booleanValue()) {
                        long jLongValue6 = jgVar.V.longValue();
                        heVarZ.b();
                        ((ie) heVarZ.f19193b).E(jLongValue6);
                    }
                    xd xdVar4 = this.f22234d;
                    ie ieVar = (ie) heVarZ.e();
                    xdVar4.b();
                    ((je) xdVar4.f19193b).V(ieVar);
                    return;
                }
                return;
        }
    }

    public sg(fg fgVar, xd xdVar, int i10, b2 b2Var) {
        super(fgVar, "4UiqdD16WGcqj9vsERkA6tbA4c/2yE/sXnYMi3TR5nPXoyMXncc0iB8g5zhndeqU", "5yR6P4d4j2VnbvLNLQtiv9yBd7AWiKZJ6Mp0Kq9QPto=", xdVar, i10, 85);
        this.f19968i = b2Var;
    }

    public sg(fg fgVar, xd xdVar, int i10, g9 g9Var) {
        super(fgVar, "/BhgxpXYgahRBmZkS3xjCzPdid3mZtzdZmJFkhACyEa2oS6asfWgI5KysEGcSPE9", "ngST2QkCVNtF272EQbVjeXMfCtACYPfIcakPMgsny7g=", xdVar, i10, 94);
        this.f19968i = g9Var;
    }

    public sg(fg fgVar, xd xdVar, int i10, StackTraceElement[] stackTraceElementArr) {
        super(fgVar, "X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=", xdVar, i10, 45);
        this.f19968i = stackTraceElementArr;
    }
}
