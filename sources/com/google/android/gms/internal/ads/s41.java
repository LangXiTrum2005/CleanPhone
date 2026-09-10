package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s41 extends u41 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19833f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f19834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f19835h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f19836i;

    public s41(xd xdVar, h41 h41Var, p21 p21Var, Context context, Map map, a71 a71Var) {
        super("3At8eFbAjAqsz9p03G/poStdLmldcsHDf7hwtHq+b9glp6N8klzSrT8HZ4GJjVN5", "mjdtNA0QQNNvx7gc0+BIhw0NZpaH3AMuijVtb9zt66I=", xdVar, h41Var, a71Var.a(121));
        this.f19835h = p21Var;
        this.f19836i = context;
        this.f19834g = map;
    }

    @Override // com.google.android.gms.internal.ads.u41
    public final void a(Method method, xd xdVar) {
        Object[] objArr;
        switch (this.f19833f) {
            case 0:
                p21 p21Var = (p21) this.f19835h;
                Integer numValueOf = Integer.valueOf(p21Var.ordinal());
                Context context = (Context) this.f19836i;
                Object obj = this.f19834g.get("up");
                Boolean bool = Boolean.TRUE;
                if (obj == null) {
                    obj = bool;
                }
                Object[] objArr2 = (Object[]) method.invoke("", numValueOf, context, obj);
                objArr2.getClass();
                synchronized (xdVar) {
                    try {
                        if (p21Var == p21.f18448a) {
                            Object obj2 = objArr2[0];
                            Object obj3 = -1L;
                            if (obj2 == null) {
                                obj2 = obj3;
                            }
                            long jLongValue = ((Long) obj2).longValue();
                            xdVar.b();
                            ((je) xdVar.f19193b).A(jLongValue);
                            Object obj4 = objArr2[1];
                            long jLongValue2 = ((Long) (obj4 != null ? obj4 : -1L)).longValue();
                            xdVar.b();
                            ((je) xdVar.f19193b).B(jLongValue2);
                        }
                        long jLongValue3 = ((Long) objArr2[2]).longValue();
                        xdVar.b();
                        ((je) xdVar.f19193b).I0(jLongValue3);
                        long jLongValue4 = ((Long) objArr2[3]).longValue();
                        xdVar.b();
                        ((je) xdVar.f19193b).a0(jLongValue4);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                Map map = this.f19834g;
                MotionEvent motionEvent = (MotionEvent) map.get("nv");
                DisplayMetrics displayMetrics = (DisplayMetrics) this.f19836i;
                Object[] objArr3 = (Object[]) method.invoke("", motionEvent, displayMetrics);
                objArr3.getClass();
                fe feVarZ = ge.z();
                Object obj5 = objArr3[0];
                boolean z10 = true;
                if (obj5 != null && objArr3[1] != null) {
                    long jLongValue5 = ((Long) obj5).longValue();
                    feVarZ.b();
                    ((ge) feVarZ.f19193b).A(jLongValue5);
                    long jLongValue6 = ((Long) objArr3[1]).longValue();
                    feVarZ.b();
                    ((ge) feVarZ.f19193b).B(jLongValue6);
                }
                Object obj6 = objArr3[2];
                if (obj6 != null) {
                    long jLongValue7 = ((Long) obj6).longValue();
                    feVarZ.b();
                    ((ge) feVarZ.f19193b).H(jLongValue7);
                }
                Object obj7 = objArr3[3];
                if (obj7 != null) {
                    long jLongValue8 = ((Long) obj7).longValue();
                    feVarZ.b();
                    ((ge) feVarZ.f19193b).F(jLongValue8);
                }
                Object obj8 = objArr3[4];
                if (obj8 != null) {
                    long jLongValue9 = ((Long) obj8).longValue();
                    feVarZ.b();
                    ((ge) feVarZ.f19193b).C(jLongValue9);
                }
                Object obj9 = objArr3[5];
                if (obj9 != null) {
                    int i10 = ((Long) obj9).longValue() != 0 ? 2 : 1;
                    feVarZ.b();
                    ((ge) feVarZ.f19193b).S(i10);
                }
                Object obj10 = objArr3[6];
                if (obj10 != null) {
                    long jLongValue10 = ((Long) obj10).longValue();
                    feVarZ.b();
                    ((ge) feVarZ.f19193b).J(jLongValue10);
                }
                Object obj11 = objArr3[7];
                if (obj11 != null) {
                    long jLongValue11 = ((Long) obj11).longValue();
                    feVarZ.b();
                    ((ge) feVarZ.f19193b).I(jLongValue11);
                }
                Object obj12 = objArr3[8];
                if (obj12 != null) {
                    int i11 = ((Long) obj12).longValue() != 0 ? 2 : 1;
                    feVarZ.b();
                    ((ge) feVarZ.f19193b).T(i11);
                }
                synchronized (xdVar) {
                    try {
                        Method methodB = ((h41) this.f19835h).b("8cUAbwpt6SKUQHhtSwuMmdGkTrID2QvHq2LA27x2GE3ivBr88edu7HCA+XurISAj", "khOZexiJY4Vla3osCKZbCsXRCvuYnTPcWDFUfUGsZNQ=");
                        if (methodB == null || (objArr = (Object[]) methodB.invoke("", (MotionEvent) map.get("nv"), displayMetrics)) == null) {
                            throw null;
                        }
                        Object obj13 = objArr[0];
                        if (obj13 != null) {
                            long jLongValue12 = ((Long) obj13).longValue();
                            xdVar.b();
                            ((je) xdVar.f19193b).J0(jLongValue12);
                        }
                        Object obj14 = objArr[1];
                        if (obj14 != null) {
                            long jLongValue13 = ((Long) obj14).longValue();
                            xdVar.b();
                            ((je) xdVar.f19193b).K0(jLongValue13);
                        }
                        Object obj15 = objArr[2];
                        if (obj15 != null) {
                            long jLongValue14 = ((Long) obj15).longValue();
                            xdVar.b();
                            ((je) xdVar.f19193b).L0(jLongValue14);
                        }
                        Object obj16 = objArr[3];
                        if (obj16 != null) {
                            long jLongValue15 = ((Long) obj16).longValue();
                            xdVar.b();
                            ((je) xdVar.f19193b).F(jLongValue15);
                        }
                        Object obj17 = objArr[4];
                        if (obj17 != null) {
                            long jLongValue16 = ((Long) obj17).longValue();
                            xdVar.b();
                            ((je) xdVar.f19193b).G(jLongValue16);
                        }
                        s31 s31Var = (s31) map.get("oe");
                        if (s31Var != null) {
                            long j10 = s31Var.f19818a;
                            if (j10 > 0) {
                                xdVar.b();
                                ((je) xdVar.f19193b).J(j10);
                            }
                            long j11 = s31Var.f19819b;
                            if (j11 > 0) {
                                xdVar.b();
                                ((je) xdVar.f19193b).I(j11);
                            }
                            long j12 = s31Var.f19820c;
                            if (j12 > 0) {
                                xdVar.b();
                                ((je) xdVar.f19193b).H(j12);
                            }
                            long j13 = s31Var.f19821d;
                            if (j13 > 0) {
                                xdVar.b();
                                ((je) xdVar.f19193b).K(j13);
                            }
                        }
                        s31 s31Var2 = (s31) map.get("oe");
                        if (s31Var2 != null && s31Var2.f19818a != 0) {
                            if ((displayMetrics == null || displayMetrics.density == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? false : true) {
                                double d10 = s31Var2.f19824g;
                                if (displayMetrics == null) {
                                    throw null;
                                }
                                long jRound = Math.round(d10 / ((double) displayMetrics.density));
                                feVarZ.b();
                                ((ge) feVarZ.f19193b).L(jRound);
                                long jRound2 = Math.round(((double) (s31Var2.f19827j - s31Var2.f19825h)) / ((double) displayMetrics.density));
                                feVarZ.b();
                                ((ge) feVarZ.f19193b).M(jRound2);
                                long jRound3 = Math.round(((double) (s31Var2.f19828k - s31Var2.f19826i)) / ((double) displayMetrics.density));
                                feVarZ.b();
                                ((ge) feVarZ.f19193b).N(jRound3);
                                long jRound4 = Math.round(((double) s31Var2.f19825h) / ((double) displayMetrics.density));
                                feVarZ.b();
                                ((ge) feVarZ.f19193b).Q(jRound4);
                                long jRound5 = Math.round(((double) s31Var2.f19826i) / ((double) displayMetrics.density));
                                feVarZ.b();
                                ((ge) feVarZ.f19193b).R(jRound5);
                                MotionEvent motionEvent2 = (MotionEvent) map.get("nv");
                                if (motionEvent2 != null) {
                                    long jRound6 = Math.round(((double) (((s31Var2.f19825h - s31Var2.f19827j) + motionEvent2.getRawX()) - motionEvent2.getX())) / ((double) displayMetrics.density));
                                    if (jRound6 != 0) {
                                        feVarZ.b();
                                        ((ge) feVarZ.f19193b).O(jRound6);
                                    }
                                    long jRound7 = Math.round(((double) (((s31Var2.f19826i - s31Var2.f19828k) + motionEvent2.getRawY()) - motionEvent2.getY())) / ((double) displayMetrics.density));
                                    if (jRound7 != 0) {
                                        feVarZ.b();
                                        ((ge) feVarZ.f19193b).P(jRound7);
                                    }
                                }
                            }
                        }
                        xdVar.b();
                        ((je) xdVar.f19193b).S((ge) feVarZ.e());
                        t31[] t31VarArr = (t31[]) map.get("ro");
                        if (t31VarArr != null) {
                            if (displayMetrics == null || displayMetrics.density == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                z10 = false;
                            }
                            if (z10) {
                                for (int i12 = 0; i12 <= t31VarArr.length - 2; i12++) {
                                    t31 t31Var = t31VarArr[i12];
                                    fe feVarZ2 = ge.z();
                                    double d11 = t31Var.f20152a;
                                    if (displayMetrics == null) {
                                        throw null;
                                    }
                                    long jRound8 = Math.round(d11 / ((double) displayMetrics.density));
                                    feVarZ2.b();
                                    ((ge) feVarZ2.f19193b).A(jRound8);
                                    long jRound9 = Math.round(((double) t31Var.f20153b) / ((double) displayMetrics.density));
                                    feVarZ2.b();
                                    ((ge) feVarZ2.f19193b).B(jRound9);
                                    ge geVar = (ge) feVarZ2.e();
                                    xdVar.b();
                                    ((je) xdVar.f19193b).T(geVar);
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }

    public s41(xd xdVar, h41 h41Var, Map map, DisplayMetrics displayMetrics, a71 a71Var) {
        super("O/IhSczWkqH+q2aziu5mnePClwI2VInt8+rK2r5DAzxhVznO7DMyVuowa8d0HFxQ", "c/euB7bpmuTDKGTS9kQ/O7Lr64QuDKreUuxk5moaYNc=", xdVar, h41Var, a71Var.a(123));
        this.f19835h = h41Var;
        this.f19834g = map;
        this.f19836i = displayMetrics;
    }
}
