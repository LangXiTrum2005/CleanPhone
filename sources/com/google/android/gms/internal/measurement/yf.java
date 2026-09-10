package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.u22;
import com.ironsource.InterfaceC0435l1;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yf implements sg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yf f24177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f24178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Thread f24181e;

    public yf(String str, yf yfVar, rg rgVar) {
        str.getClass();
        this.f24180d = str;
        this.f24177a = yfVar;
        this.f24178b = yfVar.f24178b;
        this.f24179c = yfVar.f24179c;
        this.f24181e = Thread.currentThread();
    }

    public static String a(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        rg rgVarC = dg.c();
        sg sgVar = rgVarC.f23944b;
        String str = this.f24180d;
        if (sgVar == null) {
            throw new u22(q4.a.j(new StringBuilder(String.valueOf(str).length() + InterfaceC0435l1.d.b.f29105b), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
        }
        if (this == sgVar) {
            dg.b(rgVarC, ((yf) sgVar).f24177a);
            this.f24181e = null;
            return;
        }
        String str2 = ((yf) sgVar).f24180d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length() + 1);
        d5.u.r(sb2, "Tried to end span ", str, ", but that span is not the current span. The current span is ", str2);
        sb2.append(".");
        throw new u22(sb2.toString());
    }

    /* JADX WARN: Code duplicated, block: B:134:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fb  */
    public final String toString() {
        int i10;
        int i11;
        com.google.android.gms.internal.ads.t0 t0Var;
        Iterator it;
        og ogVar;
        int i12;
        AtomicReference atomicReference = dg.f23392a;
        int i13 = 0;
        int length = 0;
        yf yfVar = this;
        while (yfVar != null) {
            i13++;
            length += yfVar.f24180d.length();
            yfVar = yfVar.f24177a;
            if (yfVar != null) {
                length += 4;
            }
        }
        if (i13 > 250) {
            String[] strArr = new String[i13];
            yf yfVar2 = this;
            for (int i14 = i13 - 1; i14 >= 0; i14--) {
                strArr[i14] = yfVar2.f24180d;
                yfVar2 = yfVar2.f24177a;
            }
            b2.p pVarD = oa.o0.d();
            oa.e2 it2 = oa.u0.w(strArr).iterator();
            int i15 = 0;
            while (it2.hasNext()) {
                pVarD.l(it2.next(), Integer.valueOf(i15));
                i15++;
            }
            int i16 = 1;
            oa.s1 s1VarC = pVarD.c(true);
            int i17 = s1VarC.f47310f;
            int i18 = i13 >> 2;
            if (i17 > i18) {
                t0Var = null;
            } else {
                int i19 = i13 + 1;
                int[] iArr = new int[i19];
                for (int i20 = 0; i20 < i13; i20++) {
                    iArr[i20] = ((Integer) s1VarC.get(strArr[i20])).intValue();
                }
                iArr[i13] = i17;
                qg qgVar = new qg(iArr);
                int i21 = 0;
                while (true) {
                    int i22 = -1;
                    if (i21 >= i19) {
                        break;
                    }
                    qgVar.f23906d += i16;
                    int i23 = iArr[i21];
                    while (true) {
                        pg pgVar = null;
                        while (true) {
                            if (qgVar.f23906d <= 0) {
                                i12 = i16;
                                break;
                            }
                            if (qgVar.f23905c == 0) {
                                break;
                            }
                            i12 = i16;
                            int i24 = ((pg) ((pg) qgVar.f23909g).f23866d.get(Integer.valueOf(iArr[qgVar.f23904b]))).f23863a;
                            int i25 = qgVar.f23905c;
                            if (iArr[i24 + i25] == i23) {
                                if (pgVar != null) {
                                    pgVar.f23865c = (pg) qgVar.f23909g;
                                }
                                qgVar.f23905c = i25 + 1;
                                qgVar.c();
                                break;
                            }
                            pg pgVar2 = (pg) ((pg) qgVar.f23909g).f23866d.get(Integer.valueOf(iArr[qgVar.f23904b]));
                            int i26 = pgVar2.f23863a;
                            int i27 = i22;
                            pg pgVar3 = new pg(i26, (qgVar.f23905c + i26) - 1);
                            ((pg) qgVar.f23909g).f23866d.put(Integer.valueOf(iArr[qgVar.f23904b]), pgVar3);
                            int i28 = pgVar3.f23864b + 1;
                            Integer numValueOf = Integer.valueOf(iArr[i28]);
                            HashMap map = pgVar3.f23866d;
                            map.put(numValueOf, pgVar2);
                            pgVar2.f23863a = i28;
                            if (pgVar != null) {
                                pgVar.f23865c = pgVar3;
                            }
                            map.put(Integer.valueOf(i23), new pg(i21, 1073741824));
                            qgVar.f23906d--;
                            qgVar.d();
                            pgVar = pgVar3;
                            i16 = i12;
                            i22 = i27;
                        }
                        HashMap map2 = ((pg) qgVar.f23909g).f23866d;
                        i12 = i16;
                        Integer numValueOf2 = Integer.valueOf(i23);
                        if (map2.containsKey(numValueOf2)) {
                            if (pgVar != null) {
                                pgVar.f23865c = (pg) qgVar.f23909g;
                            }
                            qgVar.f23904b = i21;
                            qgVar.f23905c++;
                            qgVar.c();
                            break;
                        }
                        ((pg) qgVar.f23909g).f23866d.put(numValueOf2, new pg(i21, 1073741824));
                        if (pgVar != null) {
                            pgVar.f23865c = (pg) qgVar.f23909g;
                        }
                        qgVar.f23906d += i22;
                        qgVar.d();
                        i16 = i12;
                    }
                    i21++;
                    i16 = i12;
                }
                int i29 = i16;
                ArrayDeque arrayDeque = new ArrayDeque();
                pg pgVar4 = (pg) qgVar.f23908f;
                og ogVar2 = new og(pgVar4, 0, -1, -1);
                arrayDeque.push(ogVar2);
                while (!arrayDeque.isEmpty()) {
                    og ogVar3 = (og) arrayDeque.pop();
                    Iterator it3 = ogVar3.f23822d.f23866d.values().iterator();
                    while (it3.hasNext()) {
                        pg pgVar5 = (pg) it3.next();
                        int i30 = ogVar3.f23820b;
                        int i31 = ogVar3.f23821c;
                        int i32 = pgVar5.f23863a;
                        pg pgVar6 = pgVar4;
                        int i33 = pgVar5.f23864b;
                        if (qgVar.g(i30, i31, i32, i33)) {
                            it = it3;
                        } else {
                            if (pgVar5.f23866d.isEmpty()) {
                                int i34 = pgVar5.f23863a;
                                it = it3;
                                if (qgVar.g(i30, i31, i34, (i34 + i31) - i30)) {
                                }
                                if (ogVar2.f23819a < ogVar.f23819a) {
                                    ogVar2 = ogVar;
                                }
                                arrayDeque.push(ogVar);
                                pgVar4 = pgVar6;
                                it3 = it;
                                i29 = 1;
                            } else {
                                it = it3;
                            }
                            ogVar = new og(pgVar5, i29, pgVar5.f23863a, i33);
                            if (ogVar2.f23819a < ogVar.f23819a) {
                                ogVar2 = ogVar;
                            }
                            arrayDeque.push(ogVar);
                            pgVar4 = pgVar6;
                            it3 = it;
                            i29 = 1;
                        }
                        ogVar = new og(pgVar5, ogVar3.f23819a + i29, i30, i31);
                        if (ogVar2.f23819a < ogVar.f23819a) {
                            ogVar2 = ogVar;
                        }
                        arrayDeque.push(ogVar);
                        pgVar4 = pgVar6;
                        it3 = it;
                        i29 = 1;
                    }
                    i29 = 1;
                }
                int iMin = Math.min(iArr.length, ogVar2.f23821c + 1);
                int i35 = 0;
                loop9: while (true) {
                    i10 = ogVar2.f23820b;
                    i11 = iMin - i10;
                    pgVar4 = (pg) pgVar4.f23866d.get(Integer.valueOf(iArr[(i35 % i11) + i10]));
                    if (pgVar4 == null) {
                        break;
                    }
                    for (int i36 = pgVar4.f23863a; i36 < pgVar4.f23864b + 1 && i36 < iArr.length; i36++) {
                        if (iArr[(i35 % i11) + i10] != iArr[i36]) {
                            break loop9;
                        }
                        i35++;
                    }
                }
                int i37 = i35 / i11;
                com.google.android.gms.internal.ads.t0 t0Var2 = new com.google.android.gms.internal.ads.t0(i10, iMin, i37, false);
                if (i11 * i37 < i18) {
                    t0Var = null;
                } else {
                    t0Var = t0Var2;
                }
            }
            String strConcat = "";
            if (t0Var != null) {
                int i38 = t0Var.f20103a;
                String strConcat2 = i38 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i38))).concat(" -> ") : "";
                int i39 = t0Var.f20104b;
                int i40 = t0Var.f20105c;
                int i41 = ((i39 - i38) * i40) + i38;
                strConcat = i41 < i13 ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i41, i13)))) : "";
                String strJoin = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i38, i39));
                Locale locale = Locale.US;
                strConcat = strConcat2 + "{" + strJoin + "}x" + i40 + strConcat;
            }
            if (!strConcat.isEmpty()) {
                return strConcat;
            }
        }
        char[] cArr = new char[length];
        yf yfVar3 = this;
        while (yfVar3 != null) {
            String str = yfVar3.f24180d;
            length -= str.length();
            str.getChars(0, str.length(), cArr, length);
            yfVar3 = yfVar3.f24177a;
            if (yfVar3 != null) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new String(cArr);
    }

    public yf(String str, UUID uuid, String str2, rg rgVar) {
        str.getClass();
        this.f24180d = str;
        this.f24177a = null;
        this.f24178b = uuid;
        this.f24179c = str2;
        rgVar.getClass();
        this.f24181e = Thread.currentThread();
    }
}
