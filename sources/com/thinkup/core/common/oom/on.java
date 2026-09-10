package com.thinkup.core.common.oom;

import android.content.Context;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TURequestingInfo;
import com.thinkup.core.common.om0;
import com.thinkup.core.common.on.mnn;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.on.o00n;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0nm;
import com.thinkup.core.common.on.o0on;
import com.thinkup.core.common.on.omn;
import com.thinkup.core.common.on.on0;
import com.thinkup.core.common.ooo.m0m;
import com.thinkup.core.common.ooo.mn;
import com.thinkup.core.common.ooo.nn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class on {
    public static final String o = "on";
    final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f42310n;
    int o0;
    o00n o0m;
    mo o0n;
    o0nm o0o;
    long oo;
    omn oo0;
    double oom;
    private List<o0mm> oon;
    omn ooo;
    volatile int no = 0;
    volatile int nm = 0;
    volatile int nn = 0;
    volatile int o00 = 0;
    List<o0mm> om = Collections.synchronizedList(new ArrayList(5));
    List<o0mm> on = Collections.synchronizedList(new ArrayList(5));
    List<o0mm> m0 = Collections.synchronizedList(new ArrayList(2));
    List<om> mo = Collections.synchronizedList(new ArrayList(2));
    List<o0mm> n0 = Collections.synchronizedList(new ArrayList(2));
    List<o0mm> mm = Collections.synchronizedList(new ArrayList(2));
    List<o0mm> mn = Collections.synchronizedList(new ArrayList(2));

    public on(m0 m0Var) {
        this.f42310n = 1;
        this.om.addAll(m0Var.o0);
        this.mm.addAll(m0Var.om);
        this.mn.addAll(m0Var.on);
        this.oom = m0Var.m0;
        this.n0.addAll(m0Var.o00);
        this.o0n = m0Var.n0;
        this.oo0 = m0Var.nm;
        this.ooo = m0Var.nn;
        this.m = m0Var.f42298n.on();
        this.f42310n = m0Var.f42298n.oo();
        this.o0 = m0Var.f42298n.om();
        this.oo = m0Var.f42298n.mo();
        List<o0mm> list = m0Var.oo;
        if (list != null) {
            this.m0.addAll(list);
        }
        this.oon = Collections.synchronizedList(new ArrayList(3));
        this.o0o = m0Var.mn;
        this.o0m = m0Var.no;
    }

    private double m00() {
        return Math.max(nn.o(om0()), nn.o(omn()));
    }

    private o0mm om0() {
        if (this.om.size() > 0) {
            return this.om.get(0);
        }
        return null;
    }

    private List<o0mm> omm() {
        return this.m0;
    }

    private o0mm omn() {
        o0mm o0mmVar;
        om omVar;
        synchronized (this.mo) {
            try {
                o0mmVar = (this.mo.size() <= 0 || (omVar = this.mo.get(0)) == null) ? null : omVar.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o0mmVar;
    }

    private List<o0mm> omo() {
        return this.on;
    }

    private double on0() {
        return n(false);
    }

    private double onm() {
        return n(true);
    }

    private o0mm onn() {
        return o(true);
    }

    private o0mm ono() {
        return o(false);
    }

    private List<o0mm> oon() {
        return this.om;
    }

    public final omn m() {
        return this.oo0;
    }

    public final void m0() {
        this.m0.clear();
    }

    public final List<om> mm() {
        return this.mo;
    }

    public final boolean mn() {
        List<o0mm> list = this.mm;
        if (list == null && this.mn == null) {
            return true;
        }
        return list.size() == 0 && this.mn.size() == 0;
    }

    public final int mo() {
        return this.mo.size();
    }

    public final int n() {
        return this.om.size();
    }

    public final List<o0mm> n0() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.addAll(this.mm);
        arrayList.addAll(this.mn);
        this.mm.clear();
        this.mn.clear();
        return arrayList;
    }

    public final int nm() {
        return this.nm;
    }

    public final int nn() {
        return this.nn;
    }

    public final int no() {
        return this.no;
    }

    public final mo o() {
        return this.o0n;
    }

    public final int o0() {
        return this.on.size();
    }

    public final o0nm o00() {
        return this.o0o;
    }

    public final omn o0m() {
        return this.ooo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection, java.util.List, java.util.List<com.thinkup.core.common.on.o0mm>] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    public final List<o0mm> o0n() {
        ?? arrayList;
        int i2 = this.f42310n;
        if (i2 == 1 || i2 == 3) {
            arrayList = new ArrayList();
            int iMin = Math.min(this.o0, this.om.size());
            for (int i3 = 0; i3 < iMin; i3++) {
                arrayList.add(this.om.get(i3));
            }
        } else {
            arrayList = i2 == 2 ? m(1) : 0;
        }
        if (arrayList != 0) {
            arrayList.size();
        }
        if (arrayList != 0 && arrayList.size() > 0) {
            this.om.removeAll((Collection<?>) arrayList);
        }
        return arrayList;
    }

    public final o00n o0o() {
        return this.o0m;
    }

    public final o0mm om() {
        return this.m0.remove(0);
    }

    public final boolean on() {
        return this.m0.size() == 0 && this.om.size() == 0;
    }

    public final int oo() {
        return this.m0.size();
    }

    public final boolean oo0() {
        return this.om.size() == 0 && this.m0.size() == 0 && this.mo.size() == 0 && this.on.size() == 0;
    }

    public final o0mm oom() {
        o0mm o0mmVarOm0 = om0();
        o0mm o0mmVarOmn = omn();
        return mn.o(o0mmVarOm0, o0mmVarOmn) < 0 ? o0mmVarOm0 : o0mmVarOmn;
    }

    public final boolean ooo() {
        return this.nm < this.o0;
    }

    public static double mm(o0mm o0mmVar) {
        on0 on0VarN0n;
        double dO = nn.o(o0mmVar);
        return (o0mmVar.o0m0() && dO == 10000.0d && (on0VarN0n = o0mmVar.n0n()) != null) ? on0VarN0n.nn : dO;
    }

    public static void mo(o0mm o0mmVar) {
        on0 on0VarN0n;
        if (!n0(o0mmVar) || o0mmVar.om0n() == 2 || (on0VarN0n = o0mmVar.n0n()) == null) {
            return;
        }
        o0mmVar.toString();
        com.thinkup.core.n.o0.n.o(on0VarN0n, o0mmVar, 3);
    }

    public final void m(o0mm o0mmVar) {
        this.on.remove(o0mmVar);
    }

    public final void m0(o0mm o0mmVar) {
        synchronized (this.oon) {
            try {
                if (this.oon.size() == 0) {
                    this.oon.add(o0mmVar);
                } else {
                    double dO = nn.o(o0mmVar);
                    for (int i2 = 0; i2 < this.oon.size(); i2++) {
                        if (dO > nn.o(this.oon.get(i2))) {
                            this.oon.add(i2, o0mmVar);
                            break;
                        } else {
                            if (i2 == this.oon.size() - 1) {
                                this.oon.add(o0mmVar);
                                break;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(o0mm o0mmVar) {
        this.n0.remove(o0mmVar);
    }

    public final void o(List<o0mm> list) {
        this.on.addAll(list);
    }

    public final void o0(o0mm o0mmVar) {
        mo moVar = this.o0n;
        if (moVar != null) {
            moVar.o(o0mmVar);
        }
    }

    public final void om(o0mm o0mmVar) {
        on0 on0VarNo0;
        if (o0mmVar == null || !o0mmVar.oom() || (on0VarNo0 = o0mmVar.no0()) == null) {
            return;
        }
        on0VarNo0.o(this.oo0);
    }

    public final boolean on(o0mm o0mmVar) {
        omn omnVar = this.oo0;
        boolean z2 = false;
        if (omnVar != null && o0mmVar != null) {
            o0mm o0mmVarO = omnVar.o();
            if (o0mmVarO == null || mn.o(o0mmVar, o0mmVarO) < 0 || (mn.o(o0mmVar, o0mmVarO) == 0 && o0mmVar.oo0m() < o0mmVarO.oo0m())) {
                z2 = true;
            }
            if (z2) {
                this.oo0.o(o0mmVar);
            }
            if (o0mmVarO == null) {
                return z2;
            }
            if (z2) {
                this.oo0.m(o0mmVarO);
                return z2;
            }
            o0mm o0mmVarM = this.oo0.m();
            if (o0mmVarM == null || mn.o(o0mmVar, o0mmVarM) < 0 || (mn.o(o0mmVar, o0mmVarM) == 0 && o0mmVar.oo0m() < o0mmVarM.oo0m())) {
                this.oo0.m(o0mmVar);
            }
        }
        return z2;
    }

    public final void oo(o0mm o0mmVar) {
        on0 on0VarN0n;
        if (o0mmVar == null || !o0mmVar.oom() || (on0VarN0n = o0mmVar.n0n()) == null) {
            return;
        }
        on0VarN0n.o(this.oo0);
    }

    private boolean mn(o0mm o0mmVar) {
        return o(o0mmVar, true);
    }

    public static String n(List<o0mm> list) {
        String strM = "";
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 > 0) {
                strM = a.m(strM, ",");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(list.get(i2).nm());
            strM = a.m(strM, sb.toString());
        }
        return strM;
    }

    public final void m(List<o0mm> list) {
        this.n0.addAll(list);
    }

    public final void o(o0mm o0mmVar) {
        this.on.add(o0mmVar);
    }

    public static void o0(o0mm o0mmVar, n0 n0Var) throws Throwable {
        if (n0(o0mmVar)) {
            o0mmVar.toString();
            n0 n0VarNmm = n0Var.nmm();
            on0 on0VarN0n = o0mmVar.n0n();
            if (on0VarN0n != null) {
                com.thinkup.core.n.o0.n.o(on0VarN0n, new mnn(5, o0mmVar, n0VarNmm), true, 24);
            }
        }
    }

    public final List<o0mm> m(int i2) {
        List<o0mm> list;
        int iMin;
        if (i2 != 2) {
            list = this.om;
        } else {
            list = this.m0;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0) {
            int i3 = 0;
            o0mm o0mmVar = list.get(0);
            if (i2 == 2) {
                arrayList.add(o0mmVar);
            } else {
                o0mm o0mmVarO = o(true);
                int i4 = this.f42310n;
                if (i4 == 1) {
                    int i5 = this.o0 - this.nm;
                    list.size();
                    int iMin2 = Math.min(i5, list.size());
                    if (iMin2 > 0) {
                        while (i3 < iMin2) {
                            o0mm o0mmVar2 = list.get(i3);
                            if (mn.o(o0mmVar2, o0mmVarO) >= 0) {
                                break;
                            }
                            arrayList.add(o0mmVar2);
                            i3++;
                        }
                    }
                } else if (i4 == 2) {
                    boolean z2 = mn.o(o0mmVar, o0mmVarO) < 0;
                    if (this.o00 == 0 && z2) {
                        double dO = nn.o(o0mmVar);
                        int size = list.size();
                        while (i3 < size) {
                            o0mm o0mmVar3 = list.get(i3);
                            if (nn.o(o0mmVar3) == dO) {
                                arrayList.add(o0mmVar3);
                            }
                            i3++;
                        }
                        this.o00 = arrayList.size();
                    }
                } else if (i4 == 3 && this.nm == 0 && (iMin = Math.min(this.o0, list.size())) > 0) {
                    while (i3 < iMin) {
                        o0mm o0mmVar4 = list.get(i3);
                        if (mn.o(o0mmVar4, o0mmVarO) >= 0) {
                            break;
                        }
                        arrayList.add(o0mmVar4);
                        i3++;
                    }
                    arrayList.size();
                }
            }
            if (arrayList.size() > 0) {
                list.removeAll(arrayList);
            }
        }
        return arrayList;
    }

    public final void o(o0mm o0mmVar, int i2) {
        synchronized (this.mo) {
            try {
                Iterator<om> it = this.mo.iterator();
                int i3 = 0;
                while (it.hasNext() && mn.o(it.next().o, o0mmVar) < 0) {
                    i3++;
                }
                this.mo.add(i3, new om(o0mmVar, i2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final TURequestingInfo oo(o0mm o0mmVar, n0 n0Var) {
        List listSynchronizedList;
        List listSynchronizedList2;
        synchronized (this.on) {
            try {
                listSynchronizedList = null;
                for (o0mm o0mmVar2 : this.on) {
                    if (mn.o(o0mmVar2, o0mmVar) < 0) {
                        Objects.toString(o0mmVar2);
                        n0 n0VarNmm = n0Var.nmm();
                        m0m.o(n0VarNmm, o0mmVar2, 0, false);
                        com.thinkup.core.common.n.mn mnVarO = com.thinkup.core.common.n.mn.o(n0VarNmm, (TUBaseAdAdapter) null, 2);
                        if (mnVarO != null) {
                            if (listSynchronizedList == null) {
                                listSynchronizedList = Collections.synchronizedList(new ArrayList());
                            }
                            listSynchronizedList.add(mnVarO);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (listSynchronizedList != null && listSynchronizedList.size() > 0) {
            Collections.sort(listSynchronizedList, new Comparator<TUAdInfo>() { // from class: com.thinkup.core.common.oom.on.1
                private static int o(TUAdInfo tUAdInfo, TUAdInfo tUAdInfo2) {
                    if (tUAdInfo.getEcpm() > tUAdInfo2.getEcpm()) {
                        return -1;
                    }
                    return tUAdInfo.getEcpm() < tUAdInfo2.getEcpm() ? 1 : 0;
                }

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(TUAdInfo tUAdInfo, TUAdInfo tUAdInfo2) {
                    TUAdInfo tUAdInfo3 = tUAdInfo;
                    TUAdInfo tUAdInfo4 = tUAdInfo2;
                    if (tUAdInfo3.getEcpm() > tUAdInfo4.getEcpm()) {
                        return -1;
                    }
                    return tUAdInfo3.getEcpm() < tUAdInfo4.getEcpm() ? 1 : 0;
                }
            });
        }
        if (this.n0.size() > 0) {
            synchronized (this.n0) {
                try {
                    listSynchronizedList2 = null;
                    for (o0mm o0mmVar3 : this.n0) {
                        Objects.toString(o0mmVar3);
                        n0 n0VarNmm2 = n0Var.nmm();
                        m0m.o(n0VarNmm2, o0mmVar3, 0, false);
                        m0m.o(n0VarNmm2);
                        com.thinkup.core.common.n.mn mnVarO2 = com.thinkup.core.common.n.mn.o(n0VarNmm2, (TUBaseAdAdapter) null);
                        if (mnVarO2 != null) {
                            if (listSynchronizedList2 == null) {
                                listSynchronizedList2 = Collections.synchronizedList(new ArrayList());
                            }
                            listSynchronizedList2.add(mnVarO2);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            listSynchronizedList2 = null;
        }
        if (listSynchronizedList == null && listSynchronizedList2 == null) {
            return null;
        }
        return new o0on(listSynchronizedList, listSynchronizedList2);
    }

    private static boolean n0(o0mm o0mmVar) {
        if (o0mmVar == null) {
            return false;
        }
        int iMn = o0mmVar.mn();
        return iMn == 4 || iMn == 3;
    }

    public final void o(int i2, int i3) {
        this.no += i2;
        if (i3 != 2) {
            this.nm += i2;
        } else {
            this.nn += i2;
        }
    }

    public final void o(int i2) {
        if (this.f42310n == 2 && i2 == 1) {
            this.o00--;
        }
    }

    public static void o(o0mm o0mmVar, n0 n0Var) {
        on0 on0VarNo0;
        if (o0mmVar == null || !o0mmVar.oom() || (on0VarNo0 = o0mmVar.no0()) == null) {
            return;
        }
        String errorMsg = on0VarNo0.getErrorMsg();
        if (TextUtils.isEmpty(errorMsg) || !errorMsg.contains("200000")) {
            return;
        }
        com.thinkup.core.n.o0.n.o(on0VarNo0, new mnn(5, o0mmVar, n0Var), true, 31);
    }

    private double n(boolean z2) {
        synchronized (this.oon) {
            try {
                int size = this.oon.size();
                if (size == 0) {
                    return 0.0d;
                }
                int i2 = this.m - 1;
                int i3 = size - 1;
                if (z2 && i3 < i2) {
                    return 0.0d;
                }
                return nn.o(this.oon.get(Math.min(i2, i3)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void o(on0 on0Var, o0mm o0mmVar, n0 n0Var) throws Throwable {
        mnn mnnVar = new mnn(6, o0mmVar, n0Var, on0Var.getSortPrice());
        o(mnnVar, o0mmVar);
        com.thinkup.core.n.o0.n.o(on0Var, mnnVar, true, 23);
    }

    private static void o(mnn mnnVar, o0mm o0mmVar) {
        if (o0mmVar != null) {
            int iM0oo = o0mmVar.m0oo();
            if (iM0oo == 1) {
                mnnVar.o0(o0mmVar.o0n0());
            } else if (iM0oo == 2) {
                mnnVar.m(o0mmVar.m0on());
                mnnVar.o0(o0mmVar.m0om());
            }
        }
    }

    public static void n(o0mm o0mmVar, n0 n0Var) {
        if (o0mmVar != null && o0mmVar.oom() && o0mmVar.n0o() == 2) {
            o(o0mmVar, n0Var.nmm(), true, 22);
        }
    }

    public final o0mm o(boolean z2) {
        synchronized (this.oon) {
            try {
                int size = this.oon.size();
                if (size == 0) {
                    return null;
                }
                int i2 = this.m - 1;
                int i3 = size - 1;
                if (z2 && i3 < i2) {
                    return null;
                }
                o0mm o0mmVar = this.oon.get(Math.min(i2, i3));
                nn.o(o0mmVar);
                return o0mmVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void m(o0mm o0mmVar, n0 n0Var) {
        on0 on0VarNo0;
        if (o0mmVar != null) {
            try {
                if (!o0mmVar.oom() || (on0VarNo0 = o0mmVar.no0()) == null || n0Var == null) {
                    return;
                }
                if (o0mmVar.omn() == -11) {
                    mnn mnnVar = new mnn(6, o0mmVar, n0Var, on0VarNo0.getSortPrice());
                    o(mnnVar, o0mmVar);
                    com.thinkup.core.n.o0.n.o(on0VarNo0, mnnVar, true, 23);
                } else if (o0mmVar.omn() == -13) {
                    mnn mnnVar2 = new mnn(9, o0mmVar, n0Var, on0VarNo0.getSortPrice());
                    o(mnnVar2, o0mmVar);
                    com.thinkup.core.n.o0.n.o(on0VarNo0, mnnVar2, true, 33);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void o(n0 n0Var) throws Throwable {
        ArrayList arrayList = new ArrayList(5);
        synchronized (this.oon) {
            o(arrayList, this.oon);
        }
        synchronized (this.on) {
            o(arrayList, this.on);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o((o0mm) it.next(), n0Var, false, 21);
        }
    }

    private static void m(on0 on0Var, o0mm o0mmVar, n0 n0Var) throws Throwable {
        mnn mnnVar = new mnn(9, o0mmVar, n0Var, on0Var.getSortPrice());
        o(mnnVar, o0mmVar);
        com.thinkup.core.n.o0.n.o(on0Var, mnnVar, true, 33);
    }

    public final synchronized void m(o0mm o0mmVar, int i2) {
        List<o0mm> list;
        try {
            if (i2 != 2) {
                list = this.om;
            } else {
                list = this.m0;
            }
            synchronized (list) {
                nn.o(list, o0mmVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static void o(o0mm o0mmVar, n0 n0Var, boolean z2, int i2) throws Throwable {
        on0 on0VarN0n = o0mmVar.n0n();
        if (on0VarN0n != null) {
            com.thinkup.core.n.o0.n.o(on0VarN0n, new mnn(2, o0mmVar, n0Var), z2, i2);
        }
    }

    private void o(List<o0mm> list, List<o0mm> list2) {
        int iO0no;
        int size = list2.size();
        int size2 = this.oon.size();
        for (int i2 = 0; i2 < size; i2++) {
            o0mm o0mmVar = list2.get(i2);
            if (o0mmVar.oom() && (iO0no = o0mmVar.o0no()) > 0 && iO0no <= size2 && mn.o(o0mmVar, this.oon.get(iO0no - 1)) > 0) {
                list.add(o0mmVar);
            }
        }
    }

    public final o0mm m(boolean z2) {
        o0mm o0mmVarO;
        if (!z2 || (o0mmVarO = this.oo0.o()) == null) {
            return null;
        }
        if (!o0mmVarO.oom()) {
            o0mmVarO.toString();
            return null;
        }
        if (o0mmVarO.oo00() == 1) {
            return null;
        }
        synchronized (this.on) {
            for (o0mm o0mmVar : this.on) {
                if (mn.o(o0mmVar, o0mmVarO) < 0) {
                    o0mmVar.toString();
                    return null;
                }
            }
            synchronized (this.mo) {
                Iterator<om> it = this.mo.iterator();
                while (it.hasNext()) {
                    o0mm o0mmVar2 = it.next().o;
                    if (mn.o(o0mmVar2, o0mmVarO) < 0) {
                        o0mmVar2.toString();
                        return null;
                    }
                }
                o0mmVarO.toString();
                return o0mmVarO;
            }
        }
    }

    public final boolean o(o0mm o0mmVar, boolean z2) {
        double dO;
        if (o0mmVar.m000()) {
            return true;
        }
        double dO2 = nn.o(o0mmVar);
        double dN = n(true);
        synchronized (this.on) {
            try {
                Iterator<o0mm> it = this.on.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        dO = 0.0d;
                        break;
                    }
                    o0mm next = it.next();
                    dO = nn.o(next);
                    if (z2) {
                        if (next.oom() && dO > nn.o(o0mmVar)) {
                            break;
                        }
                    } else if (dO > nn.o(o0mmVar)) {
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dO2 > Math.max(dN, dO);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0025  */
    /* JADX WARN: Code duplicated, block: B:23:0x0029 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x002a  */
    public static boolean o(o0mm o0mmVar, mm mmVar) {
        boolean z2 = o0mmVar.o000() == 1;
        if (z2) {
            int iOm0 = o0mmVar.om0();
            if (iOm0 == 1 || iOm0 == 3) {
                if (mmVar.om) {
                    return false;
                }
                mmVar.om = true;
            } else {
                if (iOm0 == 6) {
                    if (mmVar.on) {
                        return false;
                    }
                    mmVar.on = true;
                    return z2;
                }
                if (iOm0 == 7) {
                    if (mmVar.om) {
                        return false;
                    }
                    mmVar.om = true;
                }
            }
        }
        return z2;
    }

    public final void m(n0 n0Var) {
        o0mm o0mmVar;
        synchronized (this.om) {
            try {
                for (o0mm o0mmVar2 : this.om) {
                    if (o0mmVar2 != null && o0mmVar2.oom()) {
                        n(o0mmVar2, n0Var);
                    }
                }
                this.om.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.mo) {
            try {
                for (om omVar : this.mo) {
                    if (omVar != null && (o0mmVar = omVar.o) != null && o0mmVar.oom()) {
                        n(omVar.o, n0Var);
                    }
                }
                this.mo.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.m0) {
            this.m0.clear();
        }
    }

    public static void o(Context context, String str, String str2, o0mm o0mmVar, o0mm o0mmVar2) {
        o0nm.o oVar;
        o0nm.o oVar2 = null;
        if (o0mmVar != null) {
            o0nm.o oVar3 = new o0nm.o(o0mmVar, o0mmVar.n0n());
            oVar = null;
            oVar2 = oVar3;
        } else {
            oVar = o0mmVar2 != null ? new o0nm.o(o0mmVar2, o0mmVar2.n0n()) : null;
        }
        om0.o(context).o(str, str2, oVar2, oVar);
    }

    public static void o(Context context, String str) {
        om0.o(context).o(str);
    }

    public static void o(String str) {
        com.thinkup.core.common.o0.o().m(str);
    }

    public static boolean o(String str, o0mm o0mmVar, n0 n0Var) {
        boolean z2 = false;
        try {
            if (o0mmVar.oom()) {
                on0 on0VarN0n = o0mmVar.n0n();
                com.thinkup.core.n.n.o().o(str, on0VarN0n);
                if (on0VarN0n != null && on0VarN0n.o()) {
                    z2 = true;
                }
                if (z2 && on0VarN0n != null) {
                    com.thinkup.core.n.o0.n.o(on0VarN0n, new mnn(1, o0mmVar, n0Var), true, 25);
                }
            }
        } catch (Throwable unused) {
        }
        return z2;
    }

    public final long o(boolean z2, long j) {
        if (this.m0.size() <= 0) {
            return -1L;
        }
        if (this.om.size() == 0 && z2) {
            return 0L;
        }
        return j;
    }

    public static o0mm o(Map<String, oo> map) {
        o0mm o0mmVar;
        Iterator<Map.Entry<String, oo>> it = map.entrySet().iterator();
        o0mm o0mmVar2 = null;
        if (it != null) {
            while (it.hasNext()) {
                oo value = it.next().getValue();
                if (value != null && !value.mo && (o0mmVar = value.f42311n) != null && (o0mmVar2 == null || mn.o(o0mmVar, o0mmVar2) < 0)) {
                    o0mmVar2 = o0mmVar;
                }
            }
        }
        return o0mmVar2;
    }

    public final boolean o(boolean z2, o0mm o0mmVar) {
        o0mm o0mmVar2;
        if (!z2) {
            return false;
        }
        synchronized (this.on) {
            try {
                o0mmVar2 = null;
                for (o0mm o0mmVar3 : this.on) {
                    if (mn.o(o0mmVar3, o0mmVar2) < 0) {
                        o0mmVar2 = o0mmVar3;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        o0mm o0mmVarOom = oom();
        if (mn.o(o0mmVar2, o0mmVarOom) >= 0) {
            o0mmVar2 = o0mmVarOom;
        }
        return mn.o(o0mmVar, o0mmVar2) <= 0;
    }

    public final Map<String, Double> o(List<o0mm> list, o0mm o0mmVar) {
        HashMap map = new HashMap();
        double d = this.oom;
        double dO = nn.o(o0mmVar);
        if (dO > d) {
            d = dO;
        }
        if (list != null) {
            for (o0mm o0mmVar2 : list) {
                double dO0n0 = o0mmVar2.o0n0();
                String strM0o = o0mmVar2.m0o();
                if (dO0n0 <= d) {
                    dO0n0 = d;
                }
                map.put(strM0o, Double.valueOf(dO0n0));
            }
        }
        return map;
    }
}
