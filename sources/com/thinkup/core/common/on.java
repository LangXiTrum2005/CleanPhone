package com.thinkup.core.common;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.ITUAdFilter;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TURequestingInfo;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.on.mmm;
import com.thinkup.core.common.on.mnn;
import com.thinkup.core.common.on.mo0;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0om;
import com.thinkup.core.common.on.on0;
import com.thinkup.core.common.on.oo00;
import com.thinkup.core.common.ooo.m0m;
import com.thinkup.core.common.ooo.m0n;
import com.thinkup.core.common.ooo.omn;
import com.thinkup.core.mg.api.MgComparedResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class on {
    protected WeakReference<Context> m;
    Map<String, Object> m0;
    com.thinkup.core.common.oom.on m0n;
    protected com.thinkup.core.common.o0n.m m0o;
    protected mmm mm;
    double mm0;
    o0mm mmm;
    protected com.thinkup.core.common.n.n mn;
    private m0 mnm;
    com.thinkup.core.common.on.n0 mo;
    com.thinkup.core.common.o.n.o mo0;
    o0mm mon;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f42185n;
    boolean nn;
    boolean o00;
    String o0n;
    protected String om;
    boolean omn;
    protected String on;
    protected oo00 oo;
    int oom;
    int oon;
    long ooo;
    private final String mn0 = getClass().getSimpleName();
    protected String o0 = "";
    boolean n0 = false;
    boolean no = false;
    protected boolean nm = false;
    boolean o0o = false;
    boolean o0m = false;
    Object om0 = new Object();
    o0mm omo = null;
    boolean omm = false;
    o0mm on0 = null;
    o0mm ono = null;
    protected com.thinkup.core.common.o0n.m m00 = null;
    protected com.thinkup.core.common.o0n.m mom = new com.thinkup.core.common.o0n.m() { // from class: com.thinkup.core.common.on.1
        @Override // java.lang.Runnable
        public final void run() {
            com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.on.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    on.this.o();
                }
            });
        }
    };
    boolean mmo = false;
    boolean mmn = false;
    protected Context o = com.thinkup.core.common.n.o0n.m().on();
    AdError oo0 = ErrorCode.getErrorCode(ErrorCode.noADError, "", "");
    protected Map<String, com.thinkup.core.common.oom.oo> onm = new ConcurrentHashMap();
    List<o0mm> onn = Collections.synchronizedList(new ArrayList(3));
    com.thinkup.core.common.oom.mm m0m = new com.thinkup.core.common.oom.mm();
    List<TUBaseAdAdapter> moo = new ArrayList();
    private final com.thinkup.core.mg.o.o mno = new com.thinkup.core.mg.o.o();

    /* JADX INFO: renamed from: com.thinkup.core.common.on$3, reason: invalid class name */
    public class AnonymousClass3 implements com.thinkup.core.common.o0n.m {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            on.this.m00 = null;
            com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.on.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    on.this.mm();
                }
            }, 2);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.on$4, reason: invalid class name */
    public class AnonymousClass4 implements com.thinkup.core.common.o0n.m {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            on.this.o00();
        }
    }

    public static class o {
        public static final int m = 2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f42189n = 3;
        public static final int o = 1;
        public static final int o0 = 4;
        public static final int oo = 5;
    }

    public on(Context context) {
        this.m = new WeakReference<>(context);
    }

    private static boolean m(int i2) {
        return i2 == 3 || i2 == 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void mm() {
        try {
            com.thinkup.core.common.on.o oVarOno = ono();
            this.o0m = true;
            if (this.nm || oVarOno == null) {
                return;
            }
            o0mm unitGroupInfo = oVarOno.oo() != null ? oVarOno.oo().getUnitGroupInfo() : null;
            o(unitGroupInfo, com.thinkup.core.common.ooo.nn.o(unitGroupInfo), true);
            o(9, unitGroupInfo);
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void mn() {
        if (this.nn) {
            this.m0n.m(this.mo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x004a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x0027, B:7:0x0031, B:16:0x004a, B:18:0x0058, B:19:0x0067, B:21:0x006e, B:23:0x0074, B:12:0x003a, B:14:0x0042), top: B:28:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0058 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x0027, B:7:0x0031, B:16:0x004a, B:18:0x0058, B:19:0x0067, B:21:0x006e, B:23:0x0074, B:12:0x003a, B:14:0x0042), top: B:28:0x0001 }] */
    public synchronized void n0() {
        try {
            o0mm o0mmVarO = this.m0n.o(false);
            o0mm o0mmVarO0n = o0n();
            this.m0n.no();
            this.oo.on();
            com.thinkup.core.common.ooo.mn.o(o0mmVarO, o0mmVarO0n);
            this.m0m.n();
            this.m0m.m();
            if (this.n0 && this.oon >= this.oo.on() && com.thinkup.core.common.ooo.mn.o(o0mmVarO, o0mmVarO0n) <= 0) {
                this.nn = true;
                mn();
                if (this.m0n.no() == 0) {
                    com.thinkup.core.common.oom.on.o(this.o, this.on);
                    com.thinkup.core.common.oom.on.o(this.on);
                    o0m();
                }
            } else if (this.m0m.n() || this.m0m.m()) {
                this.nn = true;
                mn();
                if (this.m0n.no() == 0) {
                    com.thinkup.core.common.oom.on.o(this.o, this.on);
                    com.thinkup.core.common.oom.on.o(this.on);
                    o0m();
                }
            }
            o0o();
            if (this.nn || omm()) {
                o0m();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void nm() {
        if (this.oo.mo() >= 0) {
            this.m00 = new AnonymousClass3();
            this.oo.mo();
            com.thinkup.core.common.o0n.o0.o().o(this.m00, this.oo.mo(), false);
        }
    }

    private com.thinkup.core.common.o0n.m nn() {
        return new AnonymousClass4();
    }

    private void no() {
        if (this.mo0 != null) {
            com.thinkup.core.common.on.n0 n0VarNmm = this.mo.nmm();
            m0m.o(n0VarNmm, this.mo0.o0(), 0, true);
            this.mo0.o(this.om, n0VarNmm);
        }
    }

    public static /* synthetic */ boolean o(int i2) {
        return i2 == 3 || i2 == 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o00() {
        if (!this.nm && this.m0n.oo() > 0) {
            this.m0o = null;
            o0mm o0mmVarOm = this.m0n.om();
            o0mmVarOm.toString();
            this.m0n.o(o0mmVarOm);
            this.m0n.oo();
            this.m0n.nn();
            m(o0mmVarOm, 2);
        }
    }

    private synchronized void o0m() {
        if (!this.m0m.oo()) {
            this.m0m.oo();
        } else {
            if (this.m0m.m()) {
                return;
            }
            this.m0n.o(this.mo.nmm());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o0mm o0n() {
        o0mm o0mmVarO;
        if (this.oo.mm() == 2) {
            synchronized (this.onm) {
                o0mmVarO = com.thinkup.core.common.oom.on.o(this.onm);
            }
        } else {
            o0mmVarO = null;
        }
        o0mm o0mmVarOom = this.m0n.oom();
        return com.thinkup.core.common.ooo.mn.o(o0mmVarO, o0mmVarOom) < 0 ? o0mmVarO : o0mmVarOom;
    }

    private synchronized void o0o() {
        final on0 on0VarN0n;
        if (!this.m0m.on() && this.m0m.oo()) {
            if (this.m0m.m()) {
                return;
            }
            if (this.mo.nno()) {
                return;
            }
            final o0mm o0mmVarM = this.m0n.m(this.n0);
            if (o0mmVarM != null && (on0VarN0n = o0mmVarM.n0n()) != null) {
                this.m0m.m0();
                com.thinkup.core.mg.o.o oVar = this.mno;
                if (oVar != null) {
                    MgComparedResult mgComparedResultO = oVar.o();
                    if (mgComparedResultO == null) {
                        this.mno.o(new com.thinkup.core.mg.o.m() { // from class: com.thinkup.core.common.on.7
                            @Override // com.thinkup.core.mg.o.m
                            public final void o(MgComparedResult mgComparedResult) {
                                on.m(on0VarN0n, o0mmVarM, mgComparedResult);
                            }
                        });
                        return;
                    } else {
                        m(on0VarN0n, o0mmVarM, mgComparedResultO);
                        return;
                    }
                }
                m(on0VarN0n, o0mmVarM, null);
            }
            return;
        }
        this.m0m.on();
        this.m0m.oo();
    }

    private void om0() {
        om((o0mm) null);
    }

    private synchronized boolean omm() {
        this.m0n.n();
        this.m0n.o0();
        this.m0n.oo();
        this.m0n.mo();
        Objects.toString(this.omo);
        Objects.toString(this.mmm);
        Objects.toString(this.ono);
        return this.m0n.oo0();
    }

    private synchronized boolean omn() {
        return this.m0n.n() == 0 && this.m0n.o0() == 0;
    }

    private void omo() {
        com.thinkup.core.common.on.o oVarOno = ono();
        if (oVarOno == null) {
            om((o0mm) null);
            return;
        }
        o0mm unitGroupInfo = oVarOno.oo() != null ? oVarOno.oo().getUnitGroupInfo() : null;
        o(unitGroupInfo, com.thinkup.core.common.ooo.nn.o(unitGroupInfo), true);
        o(9, unitGroupInfo);
    }

    private void on0() {
        if (this.mom != null) {
            com.thinkup.core.common.o0n.o0.o().o(this.mom);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onm() {
        if (this.moo.size() == 0) {
            return;
        }
        synchronized (this.moo) {
            try {
                Iterator<TUBaseAdAdapter> it = this.moo.iterator();
                while (it.hasNext()) {
                    it.next().destory();
                }
                this.moo.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void onn() {
        if (this.m0n.ooo()) {
            List<o0mm> listM = this.m0n.m(1);
            if (listM.size() > 0) {
                o(listM, 1);
            }
        }
    }

    private com.thinkup.core.common.on.o ono() {
        com.thinkup.core.common.o.n.o oVar;
        com.thinkup.core.common.on.o oVarO = com.thinkup.core.common.o.o().o(this.o, this.on);
        return (oVarO == null && (oVar = this.mo0) != null) ? oVar.o() : oVarO;
    }

    private synchronized void oo0() {
        this.m0n.m0();
        if (this.m0o != null) {
            com.thinkup.core.common.o0n.o0.o().o(this.m0o);
            this.m0o = null;
        }
    }

    private synchronized void oom() {
        if (this.n0) {
            if (this.m0m.n()) {
                return;
            }
            o0mm o0mmVar = this.omo;
            if (o0mmVar == null || !o0mmVar.m000()) {
                List<o0mm> list = this.onn;
                if (list != null && list.size() != 0) {
                    if (this.o00) {
                        return;
                    }
                    this.o00 = true;
                    o(7, this.onn, new mm.o() { // from class: com.thinkup.core.common.on.10
                        @Override // com.thinkup.core.common.mm.o
                        public final void o(String str) {
                        }

                        @Override // com.thinkup.core.common.mm.o
                        public final void o(String str, List<o0mm> list2, List<o0mm> list3, boolean z2) {
                            if (on.this.m0m.n()) {
                                String unused = on.this.mn0;
                                for (o0mm o0mmVar2 : list2) {
                                    on.this.m0n.oo(o0mmVar2);
                                    com.thinkup.core.common.oom.on.n(o0mmVar2, on.this.mo);
                                }
                                return;
                            }
                            on onVar = on.this;
                            if (onVar.oon < onVar.oo.on()) {
                                String unused2 = on.this.mn0;
                                on.this.o(list2, (List<o0mm>) null, (List<o0mm>) null, list3);
                                on.this.n0();
                                return;
                            }
                            String unused3 = on.this.mn0;
                            o0mm o0mmVarO = on.this.m0n.o(false);
                            int size = list2.size();
                            ArrayList<o0mm> arrayList = new ArrayList(size);
                            ArrayList arrayList2 = new ArrayList(size);
                            for (int i2 = 0; i2 < size; i2++) {
                                o0mm o0mmVar3 = list2.get(i2);
                                on.this.m0n.oo(o0mmVar3);
                                if (com.thinkup.core.common.ooo.mn.o(o0mmVar3, o0mmVarO) < 0) {
                                    arrayList.add(o0mmVar3);
                                } else {
                                    arrayList2.add(o0mmVar3);
                                }
                            }
                            for (o0mm o0mmVar4 : arrayList) {
                                on.this.o0(o0mmVar4);
                                o0mmVar4.m0o(7);
                                on.this.m0n.o(o0mmVar4);
                                on.this.m(o0mmVar4, 5);
                            }
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                com.thinkup.core.common.oom.on.n((o0mm) it.next(), on.this.mo);
                            }
                        }
                    });
                }
            }
        }
    }

    private boolean oon() {
        if (this.m0o == null || !omn()) {
            return false;
        }
        com.thinkup.core.common.o0n.o0.o().o(this.m0o);
        this.m0o.run();
        this.m0o = null;
        return true;
    }

    private synchronized boolean ooo() {
        if (this.m0n.mn()) {
            return false;
        }
        if (this.m0m.n()) {
            return false;
        }
        o0mm o0mmVar = this.omo;
        if (o0mmVar != null && o0mmVar.m000()) {
            return false;
        }
        this.m0m.om();
        this.mmn = true;
        List<o0mm> listN0 = this.m0n.n0();
        this.m0n.m(listN0);
        o(8, listN0, new mm.o() { // from class: com.thinkup.core.common.on.9
            @Override // com.thinkup.core.common.mm.o
            public final void o(String str) {
            }

            @Override // com.thinkup.core.common.mm.o
            public final void o(String str, List<o0mm> list, List<o0mm> list2, boolean z2) {
                for (o0mm o0mmVar2 : list) {
                    on.this.o0(o0mmVar2);
                    o0mmVar2.m0o(8);
                    on.this.m0n.o(o0mmVar2);
                    on.this.m(o0mmVar2, 3);
                }
                if (list2 != null) {
                    Iterator<o0mm> it = list2.iterator();
                    while (it.hasNext()) {
                        on.this.m(it.next());
                    }
                }
                on onVar = on.this;
                onVar.mmn = false;
                onVar.n((com.thinkup.core.common.oom.oo) null);
            }
        });
        return true;
    }

    public final com.thinkup.core.common.o.n.o m0() {
        return this.mo0;
    }

    public final com.thinkup.core.oo.n0 mo() {
        return this.oo.o();
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.on$6, reason: invalid class name */
    public class AnonymousClass6 implements com.thinkup.core.common.oom.n {
        final /* synthetic */ o0mm o;

        public AnonymousClass6(o0mm o0mmVar) {
            this.o = o0mmVar;
        }

        @Override // com.thinkup.core.common.oom.n
        public final void o(com.thinkup.core.common.on.n0 n0Var) {
            com.thinkup.core.common.oo0.n.o(on.this.o).o(1, n0Var);
            omn.o(n0Var, com.thinkup.core.common.n.mo.o0m.o, com.thinkup.core.common.n.mo.o0m.nn, "");
        }

        @Override // com.thinkup.core.common.oom.n
        public final void o(com.thinkup.core.common.on.n0 n0Var, TUBaseAdAdapter tUBaseAdAdapter) {
            on.o(on.this, n0Var, tUBaseAdAdapter);
            if (this.o.oonm() == 1) {
                on.o(on.this, tUBaseAdAdapter);
            }
        }

        @Override // com.thinkup.core.common.oom.n
        public final void o(TUBaseAdAdapter tUBaseAdAdapter, String str) {
            on.this.o(tUBaseAdAdapter, str);
        }

        @Override // com.thinkup.core.common.oom.n
        public final void o(String str, String str2) {
            on.this.o(str);
            if (this.o.oonm() == 1) {
                on.this.onm();
            }
        }

        @Override // com.thinkup.core.common.oom.n
        public final void o(String str, TUBaseAdAdapter tUBaseAdAdapter, o0mm o0mmVar, com.thinkup.core.common.on.o oVar) throws Throwable {
            on.this.o(str, tUBaseAdAdapter, oVar.om(), o0mmVar);
        }

        @Override // com.thinkup.core.common.oom.n
        public final void o(String str, TUBaseAdAdapter tUBaseAdAdapter, BaseAd... baseAdArr) throws Throwable {
            ITUAdFilter iTUAdFilterO0o = com.thinkup.core.common.n.o0n.m().o0o(on.this.on);
            BaseAd baseAd = (baseAdArr == null || baseAdArr.length <= 0) ? null : baseAdArr[0];
            if (iTUAdFilterO0o != null && iTUAdFilterO0o.isAdFilter(com.thinkup.core.common.n.mn.o(tUBaseAdAdapter, 3), baseAd)) {
                com.thinkup.core.common.oom.m mVar = new com.thinkup.core.common.oom.m();
                mVar.f42293n = 8;
                mVar.oo = tUBaseAdAdapter.getTrackingInfo().nom();
                mVar.o0 = ErrorCode.getErrorCode(ErrorCode.adSourceNotFilledError, "", "");
                mVar.om = tUBaseAdAdapter.getTrackingInfo();
                mVar.on = tUBaseAdAdapter.getUnitGroupInfo();
                on.this.o(str, mVar);
            } else {
                on.this.o(str, tUBaseAdAdapter, baseAdArr != null ? Arrays.asList(baseAdArr) : null);
            }
            if (this.o.oonm() == 1) {
                on.m(on.this, tUBaseAdAdapter);
            }
        }

        @Override // com.thinkup.core.common.oom.n
        public final void o(String str, TUBaseAdAdapter tUBaseAdAdapter, com.thinkup.core.common.oom.m mVar) {
            on.this.o(str, mVar);
            if (tUBaseAdAdapter == null || tUBaseAdAdapter.getUnitGroupInfo() == null) {
                return;
            }
            tUBaseAdAdapter.getUnitGroupInfo();
            if (this.o.oonm() == 1) {
                on.m(on.this, tUBaseAdAdapter);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(o0mm o0mmVar) {
        this.m0n.o0(o0mmVar);
        com.thinkup.core.common.oom.on.o(this.o, this.on, this.om, null, o0mmVar);
        this.m0n.oo(o0mmVar);
        this.m0n.n(o0mmVar);
        on(o0mmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void om(o0mm o0mmVar) {
        this.nm = true;
        this.no = false;
        if (this.mom != null) {
            com.thinkup.core.common.o0n.o0.o().o(this.mom);
        }
        com.thinkup.core.common.oo0.oo.o(this.mo.nmm(), this.oo0, o0mmVar);
        if (!this.mmo) {
            o(this.oo0);
        }
        om();
    }

    private synchronized void oo(o0mm o0mmVar) {
        o0mmVar.m0o();
        if (this.m0m.m()) {
            return;
        }
        if (this.mo.nno()) {
            return;
        }
        com.thinkup.core.common.oom.on.mo(o0mmVar);
    }

    public final void on() {
        List<com.thinkup.core.common.oom.om> listMm = this.m0n.mm();
        synchronized (listMm) {
            try {
                if (listMm.size() > 0) {
                    o0mm o0mmVarO = listMm.remove(0).o();
                    if (!this.nm || this.oon < this.oo.on() || com.thinkup.core.common.ooo.mn.o(o0mmVarO, this.omo) < 0) {
                        this.m0n.o(o0mmVarO);
                        m(o0mmVarO, 4);
                    }
                }
                if (listMm.size() > 0) {
                    for (com.thinkup.core.common.oom.om omVar : listMm) {
                        o0mm o0mmVarO2 = omVar.o();
                        if (!this.nm || this.oon < this.oo.on() || com.thinkup.core.common.ooo.mn.o(o0mmVarO2, this.omo) < 0) {
                            int iM = omVar.m();
                            if (iM == 1) {
                                o(o0mmVarO2, 1);
                                n(iM);
                            } else if (iM == 2) {
                                o(o0mmVarO2, 2);
                                n(iM);
                            } else if (iM == 3) {
                                this.m0n.o(o0mmVarO2);
                                m(o0mmVarO2, 3);
                            }
                        }
                    }
                }
                listMm.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        n0();
    }

    private synchronized void n(int i2) {
        int iNn;
        try {
            if (i2 != 2) {
                iNn = this.m0n.nm();
            } else {
                iNn = this.m0n.nn();
            }
            if (iNn == 0) {
                o(this.m0n.m(i2), i2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(o0mm o0mmVar) {
        this.oo0.putNetworkErrorMsg(o0mmVar.m0o(), o0mmVar.nm(), o0mmVar.nn(), ErrorCode.getErrorCode(ErrorCode.noADError, "", o0mmVar.mon()));
        this.m0n.n(o0mmVar);
    }

    private void n(o0mm o0mmVar) {
        if (o0mmVar != null) {
            try {
                if (o0mmVar.nm() == 22) {
                    this.m0n.om(o0mmVar);
                    com.thinkup.core.common.oom.on.o(o0mmVar, this.mo);
                }
            } catch (Exception unused) {
                return;
            }
        }
        if (o0mmVar != null) {
            if (o0mmVar.omn() == -11 || o0mmVar.omn() == -13) {
                this.m0n.om(o0mmVar);
                com.thinkup.core.common.oom.on.m(o0mmVar, this.mo);
            }
        }
    }

    private synchronized void o0(com.thinkup.core.common.oom.oo ooVar) {
        o0mm o0mmVar;
        TURequestingInfo tURequestingInfoOo;
        if (this.mmo) {
            mmm mmmVar = this.mm;
            if (mmmVar != null) {
                mmmVar.om = null;
            }
            return;
        }
        mmm mmmVar2 = this.mm;
        if (mmmVar2 != null && mmmVar2.om != null) {
            boolean z2 = true;
            if (this.on0 == null) {
                o0mmVar = this.omo;
            } else if (ooVar == null || ooVar.om() == null || ooVar.n() == null) {
                z2 = false;
                o0mmVar = null;
            } else {
                o0mm o0mmVarOm = ooVar.om();
                if (com.thinkup.core.common.ooo.mn.o(o0mmVarOm, this.on0) >= 0) {
                    z2 = false;
                } else if (ooVar.n().booleanValue()) {
                    ooVar.om().m0o();
                    com.thinkup.core.common.ooo.nn.o(o0mmVarOm);
                } else {
                    ooVar.om().m0o();
                    com.thinkup.core.common.ooo.nn.o(o0mmVarOm);
                    z2 = false;
                }
                o0mmVar = o0mmVarOm;
            }
            if (z2) {
                this.on0 = o0mmVar;
                tURequestingInfoOo = this.m0n.oo(o0mmVar, this.mo);
                if (tURequestingInfoOo != null) {
                    this.mm.om.onAdMultipleLoaded(tURequestingInfoOo);
                }
            } else {
                tURequestingInfoOo = null;
            }
            if (tURequestingInfoOo == null && this.m0n.o(this.n0, this.on0)) {
                this.mm.om.onAdMultipleLoaded(null);
                this.mm.om = null;
            }
        }
    }

    public final void m() {
        long jO = this.m0n.o(this.n0, this.oo.o().moo());
        if (jO > -1) {
            this.m0o = new AnonymousClass4();
        }
        if (this.m0n.on() && this.n0) {
            ooo();
        }
        o(this.m0n.o0n(), 1);
        if (this.m0o != null) {
            com.thinkup.core.common.o0n.o0.o().o(this.m0o, jO, false);
        }
        if (this.mo0 != null) {
            com.thinkup.core.common.on.n0 n0VarNmm = this.mo.nmm();
            m0m.o(n0VarNmm, this.mo0.o0(), 0, true);
            this.mo0.o(this.om, n0VarNmm);
        }
    }

    public final void oo() {
        synchronized (this.om0) {
            this.n0 = true;
            this.o0o = true;
            n((com.thinkup.core.common.oom.oo) null);
            n0();
        }
    }

    public final synchronized void o() {
        ConcurrentHashMap concurrentHashMap;
        try {
            this.m0m.o();
            synchronized (this.onm) {
                concurrentHashMap = new ConcurrentHashMap(this.onm);
            }
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                com.thinkup.core.common.oom.oo ooVar = (com.thinkup.core.common.oom.oo) ((Map.Entry) it.next()).getValue();
                if (ooVar != null) {
                    ooVar.m();
                }
            }
            if (!this.nm) {
                this.nm = true;
                omo();
            }
            n0();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void om() {
        this.mmo = true;
        ooo oooVarO = ooo.o();
        String str = this.on;
        StringBuilder sb = new StringBuilder();
        sb.append(this.oo.o().o00n());
        om omVarO = oooVarO.o(str, sb.toString());
        if (omVarO != null) {
            omVarO.o(this.om);
            return;
        }
        com.thinkup.core.common.oo0.oo.m("AdManage is null--notifycancel", "Id:" + this.on + "--format:" + this.oo.o().o00n(), com.thinkup.core.common.n.o0n.m().o0m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x001c A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x000d, B:14:0x001c, B:16:0x0020, B:18:0x0024, B:20:0x002e, B:19:0x002b, B:12:0x0014, B:23:0x0033, B:25:0x0037, B:29:0x003d, B:31:0x0041, B:33:0x0047, B:36:0x005a, B:38:0x0060, B:40:0x0064), top: B:45:0x0001 }] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        if (r2.o0m != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void n(com.thinkup.core.common.oom.oo r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.thinkup.core.common.on.o0mm r0 = r2.o0n()     // Catch: java.lang.Throwable -> L12
            boolean r1 = r2.omm     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L33
            boolean r1 = r2.n0     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            boolean r1 = r2.o0o     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L1c
            goto L14
        L12:
            r3 = move-exception
            goto L69
        L14:
            com.thinkup.core.common.on.o0mm r1 = r2.omo     // Catch: java.lang.Throwable -> L12
            int r0 = com.thinkup.core.common.ooo.mn.o(r1, r0)     // Catch: java.lang.Throwable -> L12
            if (r0 <= 0) goto L20
        L1c:
            boolean r0 = r2.o0m     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L67
        L20:
            boolean r0 = r2.nm     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L2b
            com.thinkup.core.common.on.o0mm r3 = r2.omo     // Catch: java.lang.Throwable -> L12
            r0 = -1
            r2.o(r0, r3)     // Catch: java.lang.Throwable -> L12
            goto L2e
        L2b:
            r2.o0(r3)     // Catch: java.lang.Throwable -> L12
        L2e:
            r2.oom()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            return
        L33:
            boolean r3 = r2.n0     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto L67
            boolean r3 = r2.mmn     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto L3d
            monitor-exit(r2)
            return
        L3d:
            com.thinkup.core.common.o0n.m r3 = r2.m0o     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto L5a
            boolean r3 = r2.omn()     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto L5a
            com.thinkup.core.common.o0n.o r3 = com.thinkup.core.common.o0n.o0.o()     // Catch: java.lang.Throwable -> L12
            com.thinkup.core.common.o0n.m r0 = r2.m0o     // Catch: java.lang.Throwable -> L12
            r3.o(r0)     // Catch: java.lang.Throwable -> L12
            com.thinkup.core.common.o0n.m r3 = r2.m0o     // Catch: java.lang.Throwable -> L12
            r3.run()     // Catch: java.lang.Throwable -> L12
            r3 = 0
            r2.m0o = r3     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            return
        L5a:
            boolean r3 = r2.omm()     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto L67
            boolean r3 = r2.nm     // Catch: java.lang.Throwable -> L12
            if (r3 != 0) goto L67
            r2.omo()     // Catch: java.lang.Throwable -> L12
        L67:
            monitor-exit(r2)
            return
        L69:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thinkup.core.common.on.n(com.thinkup.core.common.oom.oo):void");
    }

    private void oo(int i2) {
        com.thinkup.core.oo.n0 n0VarO;
        omn.o("Mediation", "placementId:" + this.on + ";result_callback:success;loadType:" + this.mm.f42198n + ";");
        oom.o(this.o).o(this.on, this.om, true);
        mmm mmmVar = this.mm;
        if (mmmVar != null && mmmVar.oo != null) {
            try {
                oo00 oo00Var = this.oo;
                if (oo00Var != null && (n0VarO = oo00Var.o()) != null) {
                    try {
                        ooo oooVarO = ooo.o();
                        String str = this.on;
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.oo.o().o00n());
                        if (oooVarO.o(str, sb.toString()) != null) {
                            om.o(n0VarO, this.mo);
                            om.m(n0VarO, this.mo);
                        }
                    } catch (com.thinkup.core.common.on.mn e2) {
                        mmm mmmVar2 = this.mm;
                        mmmVar2.oo.o(1, mmmVar2, this.oo, e2.o);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            o0((com.thinkup.core.common.oom.oo) null);
            mmm mmmVar3 = this.mm;
            mmmVar3.oo.o(this.omn ? 1 : 2, mmmVar3, this.oo, i2);
            this.mm.oo = null;
        }
        com.thinkup.core.o0.m.o().o(this.on, this.om, this.oo.o().o0mn(), this.mm, this.m0n.m().o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(final o0mm o0mmVar, final int i2) {
        final com.thinkup.core.common.oom.oo ooVar = new com.thinkup.core.common.oom.oo(o0mmVar, i2);
        final String strO = ooVar.o();
        this.onm.put(strO, ooVar);
        this.m0n.o(1, i2);
        com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.on.5
            @Override // java.lang.Runnable
            public final void run() {
                String string;
                synchronized (on.this) {
                    try {
                        if (on.this.m0m.m()) {
                            on.this.onm.remove(strO);
                            return;
                        }
                        if (m0n.o(o0mmVar) && TextUtils.isEmpty(ooo.o().o(on.this.on, o0mmVar.nm()))) {
                            ooo.o().o(on.this.on, o0mmVar.nm(), o0mmVar.o0m());
                        }
                        boolean zO = on.o(i2);
                        com.thinkup.core.common.on.n0 n0VarNmm = on.this.mo.nmm();
                        if (zO) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(o0mmVar.nm());
                            string = sb.toString();
                        } else {
                            string = on.this.o0n;
                        }
                        n0VarNmm.o0n(string);
                        m0m.o(n0VarNmm, o0mmVar, on.this.oom, true);
                        n0VarNmm.o00(SystemClock.elapsedRealtime() - on.this.ooo);
                        if (on.this.o(n0VarNmm, o0mmVar, i2, strO)) {
                            return;
                        }
                        String unused = on.this.mn0;
                        o0mmVar.toString();
                        boolean zO2 = com.thinkup.core.common.oom.on.o(on.this.on, o0mmVar, n0VarNmm);
                        on.this.oom++;
                        if (zO2) {
                            com.thinkup.core.common.oom.m mVar = new com.thinkup.core.common.oom.m();
                            mVar.f42293n = 6;
                            mVar.o0 = ErrorCode.getErrorCode(ErrorCode.noADError, "", "Bid result has expired.");
                            mVar.oo = 0L;
                            mVar.om = n0VarNmm;
                            mVar.on = o0mmVar;
                            on.this.o(strO, mVar);
                            return;
                        }
                        int iO0mo = o0mmVar.o0mo();
                        if (iO0mo > 0) {
                            n0VarNmm.oo0 = iO0mo;
                        } else {
                            on onVar = on.this;
                            if (onVar.no && onVar.oon < onVar.oo.on()) {
                                n0VarNmm.oo0 = 5;
                            }
                        }
                        on.o(on.this, ooVar, n0VarNmm, o0mmVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    private void o(Map<String, Object> map) {
        this.m0 = map;
    }

    private void o(com.thinkup.core.common.on.n0 n0Var) {
        this.mo = n0Var;
    }

    private void m(com.thinkup.core.common.on.n0 n0Var, TUBaseAdAdapter tUBaseAdAdapter) {
        com.thinkup.core.common.n.n nVar = this.mn;
        if (nVar != null) {
            nVar.onAdSourceLoadFilled(n0Var);
        }
        o(n0Var, (AdError) null, com.thinkup.core.common.oom.o.o.m.m, tUBaseAdAdapter.getUnitGroupInfo());
        com.thinkup.core.common.ooo.o0.o().o(n0Var, tUBaseAdAdapter.getUnitGroupInfo(), 4);
    }

    public final void o(com.thinkup.core.common.n.n nVar) {
        this.mn = nVar;
    }

    public final void o(mmm mmmVar) {
        this.mm = mmmVar;
    }

    private synchronized void o(List<o0mm> list, int i2) {
        if (!this.m0m.m() && !this.m0m.n() && list != null && list.size() != 0) {
            this.m0n.o(list);
            this.m0n.o0();
            Iterator<o0mm> it = list.iterator();
            while (it.hasNext()) {
                m(it.next(), i2);
            }
        }
    }

    private void on(o0mm o0mmVar) {
        if (o0mmVar != null && com.thinkup.core.common.oom.on.mm(o0mmVar) > com.thinkup.core.common.ooo.nn.o(this.mmm)) {
            o0mmVar.toString();
            this.mmm = o0mmVar;
        }
    }

    private void o0(int i2) {
        com.thinkup.core.oo.n0 n0VarO;
        ooo();
        if (this.mmo) {
            return;
        }
        omn.o("Mediation", "placementId:" + this.on + ";result_callback:success;loadType:" + this.mm.f42198n + ";");
        oom.o(this.o).o(this.on, this.om, true);
        mmm mmmVar = this.mm;
        if (mmmVar != null && mmmVar.oo != null) {
            try {
                oo00 oo00Var = this.oo;
                if (oo00Var != null && (n0VarO = oo00Var.o()) != null) {
                    try {
                        ooo oooVarO = ooo.o();
                        String str = this.on;
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.oo.o().o00n());
                        if (oooVarO.o(str, sb.toString()) != null) {
                            om.o(n0VarO, this.mo);
                            om.m(n0VarO, this.mo);
                        }
                    } catch (com.thinkup.core.common.on.mn e2) {
                        mmm mmmVar2 = this.mm;
                        mmmVar2.oo.o(1, mmmVar2, this.oo, e2.o);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            o0((com.thinkup.core.common.oom.oo) null);
            mmm mmmVar3 = this.mm;
            mmmVar3.oo.o(this.omn ? 1 : 2, mmmVar3, this.oo, i2);
            this.mm.oo = null;
        }
        com.thinkup.core.o0.m.o().o(this.on, this.om, this.oo.o().o0mn(), this.mm, this.m0n.m().o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public static void m(on0 on0Var, o0mm o0mmVar, MgComparedResult mgComparedResult) {
        int i2;
        if (mgComparedResult == null) {
            i2 = 2;
        } else if (mgComparedResult.isMgWin()) {
            i2 = 0;
        } else if (mgComparedResult.isCompared()) {
            i2 = 34;
        } else {
            i2 = 2;
        }
        if (i2 > 0) {
            com.thinkup.core.n.o0.n.o(on0Var, o0mmVar, i2);
        }
    }

    private void m(com.thinkup.core.common.oom.oo ooVar) {
        if (ooVar.n() == null || !ooVar.n().booleanValue() || ooVar.oo() == 2 || !ooVar.n().booleanValue()) {
            return;
        }
        this.oon++;
    }

    public final boolean n() {
        if (this.nm) {
            return true;
        }
        return this.n0 && this.m0n.n() == 0 && this.m0n.no() == 0;
    }

    private synchronized void o(o0mm o0mmVar, int i2) {
        this.m0n.m(o0mmVar, i2);
    }

    private void m(long j) {
        com.thinkup.core.common.o0n.o0.o().o(this.mom, j, false);
    }

    private synchronized void o(o0mm o0mmVar) {
        this.m0n.m(o0mmVar);
    }

    private void m(TUBaseAdAdapter tUBaseAdAdapter) {
        if (tUBaseAdAdapter == null) {
            return;
        }
        synchronized (this.moo) {
            this.moo.remove(tUBaseAdAdapter);
        }
    }

    public final void o(List<o0mm> list, List<o0mm> list2, List<o0mm> list3, List<o0mm> list4) {
        boolean zO;
        String str;
        synchronized (this.om0) {
            if (list2 != null) {
                try {
                    Iterator<o0mm> it = list2.iterator();
                    while (it.hasNext()) {
                        m(it.next());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (list4 != null && !list4.isEmpty()) {
                for (o0mm o0mmVar : list4) {
                    if (o0mmVar != null) {
                        try {
                            if (o0mmVar.nm() == 22) {
                                this.m0n.om(o0mmVar);
                                com.thinkup.core.common.oom.on.o(o0mmVar, this.mo);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (o0mmVar != null && (o0mmVar.omn() == -11 || o0mmVar.omn() == -13)) {
                        this.m0n.om(o0mmVar);
                        com.thinkup.core.common.oom.on.m(o0mmVar, this.mo);
                    }
                }
            }
            if (list3 != null) {
                this.onn.addAll(list3);
            }
            if (list != null && list.size() != 0) {
                this.m0m.om();
                m0 m0Var = this.mnm;
                boolean zOo = m0Var == null ? false : m0Var.oo();
                m0 m0Var2 = this.mnm;
                boolean zO0 = m0Var2 == null ? false : m0Var2.o0();
                if (!this.n0 && zO0 && zOo) {
                    o(list);
                    return;
                }
                o0mm o0mmVar2 = list.get(0);
                boolean zO2 = com.thinkup.core.common.oom.on.o(o0mmVar2, this.m0m);
                if (zOo && !zO0) {
                    zO = this.m0n.o(o0mmVar2, false);
                } else {
                    zO = this.m0n.o(o0mmVar2, true);
                }
                if (zO2 || zO) {
                    if (!this.nm) {
                        str = "1";
                    } else {
                        str = this.no ? "2" : "3";
                    }
                    String str2 = str;
                    String str3 = "1";
                    if (zO2) {
                        str3 = "1";
                    } else if (zO) {
                        str3 = "2";
                    }
                    com.thinkup.core.common.oo0.oo.o(this.mo, o0mmVar2.nm(), o0mmVar2.m0o(), com.thinkup.core.common.ooo.nn.o(o0mmVar2), com.thinkup.core.common.ooo.nn.m(o0mmVar2), str2, str3, o0mmVar2.m00m(), o0mmVar2.m00n());
                    if (o0mmVar2.o0m0()) {
                        this.mon = o0mmVar2;
                    }
                    o0(o0mmVar2);
                    list.remove(0);
                    this.m0n.o(o0mmVar2);
                    m(o0mmVar2, 3);
                }
                o(list);
                onn();
            }
        }
    }

    public static /* synthetic */ void m(on onVar, TUBaseAdAdapter tUBaseAdAdapter) {
        if (tUBaseAdAdapter != null) {
            synchronized (onVar.moo) {
                onVar.moo.remove(tUBaseAdAdapter);
            }
        }
    }

    public final void o0() {
        this.o0o = true;
        n((com.thinkup.core.common.oom.oo) null);
    }

    private void o(List<o0mm> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (o0mm o0mmVar : list) {
            o0(o0mmVar);
            o(o0mmVar, 1);
        }
    }

    public final void o(com.thinkup.core.common.oom.m0 m0Var) {
        this.m0n = new com.thinkup.core.common.oom.on(m0Var);
        this.n0 = m0Var.mo;
        this.om = m0Var.m;
        this.on = m0Var.o;
        this.oo = m0Var.f42298n;
        this.f42185n = m0Var.mm;
        this.o0n = com.thinkup.core.common.oom.on.n(m0Var.o0);
    }

    public final void o(m0 m0Var) {
        this.mnm = m0Var;
        this.ooo = SystemClock.elapsedRealtime();
        com.thinkup.core.common.o0n.o0.o().o(this.mom, this.oo.m0(), false);
        if (this.oo.mo() >= 0) {
            this.m00 = new AnonymousClass3();
            this.oo.mo();
            com.thinkup.core.common.o0n.o0.o().o(this.m00, this.oo.mo(), false);
        }
    }

    private void o(long j) {
        if (this.m0o != null) {
            com.thinkup.core.common.o0n.o0.o().o(this.m0o, j, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean o(com.thinkup.core.common.on.n0 n0Var, o0mm o0mmVar, int i2, String str) {
        com.thinkup.core.common.on.on onVarN = ooo.o().n(this.on);
        if (onVarN == null || !onVarN.o(o0mmVar)) {
            return false;
        }
        omn.o(this.on, n0Var, "Can't Load On Showing", o0mmVar, -1, -1);
        com.thinkup.core.common.oo0.oo.o(n0Var, 7, ErrorCode.getErrorCode(ErrorCode.loadInShowingFilter, "", "Can't Load On Showing"));
        ooo.o().o(this.on, onVarN.o(), this.om);
        this.m0n.o(o0mmVar, i2);
        o(o0mmVar);
        this.m0n.o(i2);
        this.onm.remove(str);
        this.m0n.o(-1, i2);
        o(this.m0n.m(i2), i2);
        return true;
    }

    private void o(com.thinkup.core.common.oom.oo ooVar, com.thinkup.core.common.on.n0 n0Var, o0mm o0mmVar) {
        com.thinkup.core.common.oom.o0 o0Var = new com.thinkup.core.common.oom.o0();
        o0Var.o = this.o;
        o0Var.m = this.m;
        o0Var.f42309n = this.om;
        o0Var.o0 = this.on;
        o0Var.oo = this.oo.o();
        o0Var.om = this.m0;
        o0Var.on = this.oom;
        o0Var.m0 = n0Var;
        o0Var.mo = this.m0n.o0m();
        ooVar.o(o0Var);
        ooVar.o(new AnonymousClass6(o0mmVar));
        ooVar.o(this.ono);
    }

    private void o(com.thinkup.core.common.on.n0 n0Var, TUBaseAdAdapter tUBaseAdAdapter) {
        com.thinkup.core.common.n.n nVar = this.mn;
        if (nVar != null) {
            nVar.onAdSourceAttempt(n0Var);
        }
        if (tUBaseAdAdapter != null) {
            o(n0Var, (AdError) null, com.thinkup.core.common.oom.o.o.m.o, tUBaseAdAdapter.getUnitGroupInfo());
        }
        if (tUBaseAdAdapter != null) {
            com.thinkup.core.common.ooo.o0.o().o(n0Var, tUBaseAdAdapter.getUnitGroupInfo(), 3);
        }
    }

    private void o(com.thinkup.core.common.on.n0 n0Var, AdError adError, o0mm o0mmVar) {
        com.thinkup.core.common.n.n nVar = this.mn;
        if (nVar != null) {
            nVar.onAdSourceLoadFail(n0Var, adError);
        }
        o(n0Var, adError, com.thinkup.core.common.oom.o.o.m.f42302n, o0mmVar);
    }

    private void o(com.thinkup.core.common.on.n0 n0Var, AdError adError, int i2, o0mm o0mmVar) {
        String platformCode;
        String platformMSG;
        if (n0Var == null) {
            return;
        }
        if (n0Var.moo() && i2 == com.thinkup.core.common.oom.o.o.m.o) {
            n0Var.mon();
            return;
        }
        com.thinkup.core.common.oom.o.m.o0 o0Var = (com.thinkup.core.common.oom.o.m.o0) com.thinkup.core.common.oom.o.o.o0.o(n0Var.oomn(), com.thinkup.core.common.oom.o.m.o0.class);
        if (o0Var != null) {
            if (adError != null) {
                platformCode = adError.getPlatformCode();
                platformMSG = adError.getPlatformMSG();
            } else {
                platformCode = "";
                platformMSG = "";
            }
            o0Var.o(mo0.o(n0Var, platformCode, platformMSG, i2));
        }
        com.thinkup.core.m.n.o();
        if (i2 == com.thinkup.core.common.oom.o.o.m.o) {
            com.thinkup.core.m.n.o(this.o, o0mmVar, n0Var.oomn());
            return;
        }
        if (i2 == com.thinkup.core.common.oom.o.o.m.f42302n) {
            com.thinkup.core.m.n.m(this.o, o0mmVar, n0Var.oomn());
        } else if (i2 == com.thinkup.core.common.oom.o.o.m.m) {
            Context context = this.o;
            n0Var.oomn();
            com.thinkup.core.m.n.m(context, o0mmVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(String str, TUBaseAdAdapter tUBaseAdAdapter, BaseAd baseAd, o0mm o0mmVar) throws Throwable {
        try {
            try {
                com.thinkup.core.common.oom.oo ooVarRemove = this.onm.remove(str);
                if (ooVarRemove == null) {
                    return;
                }
                o(ooVarRemove, tUBaseAdAdapter, o0mmVar, tUBaseAdAdapter.getTrackingInfo(), true, baseAd);
                o0mmVar.toString();
                o(o0mmVar);
                oo0();
                m(tUBaseAdAdapter.getTrackingInfo(), tUBaseAdAdapter);
                o0mmVar.m0o();
                o(ooVarRemove);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00da A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:20:0x0046, B:22:0x0055, B:24:0x005f, B:27:0x0067, B:29:0x007b, B:31:0x008e, B:33:0x0093, B:35:0x0099, B:37:0x009f, B:39:0x00a7, B:43:0x00b5, B:45:0x00bd, B:48:0x00c9, B:49:0x00d4, B:51:0x00f0, B:50:0x00da, B:30:0x0085, B:56:0x010b), top: B:58:0x0001 }] */
    public final synchronized void o(String str, TUBaseAdAdapter tUBaseAdAdapter, List<? extends BaseAd> list) throws Throwable {
        Throwable th;
        BaseAd[] baseAdArr;
        MgComparedResult mgComparedResultO;
        try {
            if (tUBaseAdAdapter != null) {
                try {
                    tUBaseAdAdapter.getTrackingInfo().mon();
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            try {
                com.thinkup.core.common.oom.oo ooVarRemove = this.onm.remove(str);
                if (ooVarRemove == null) {
                    return;
                }
                com.thinkup.core.common.on.n0 trackingInfo = tUBaseAdAdapter.getTrackingInfo();
                o0mm unitGroupInfo = tUBaseAdAdapter.getUnitGroupInfo();
                unitGroupInfo.toString();
                o(unitGroupInfo);
                oo0();
                if (list == null || list.size() <= 0) {
                    baseAdArr = null;
                } else {
                    baseAdArr = new BaseAd[list.size()];
                    list.toArray(baseAdArr);
                }
                o(ooVarRemove, tUBaseAdAdapter, unitGroupInfo, trackingInfo, false, baseAdArr);
                if (unitGroupInfo.mmo() != -1 && trackingInfo.noo() > 0) {
                    com.thinkup.core.common.oo0.oo.o(trackingInfo);
                }
                oo(unitGroupInfo);
                m(tUBaseAdAdapter.getTrackingInfo(), tUBaseAdAdapter);
                if (com.thinkup.core.common.ooo.nn.oo(unitGroupInfo.mn()) == 0) {
                    this.mo.n(SystemClock.elapsedRealtime());
                } else {
                    this.mo.m(SystemClock.elapsedRealtime());
                }
                com.thinkup.core.mg.o.o oVar = this.mno;
                if (oVar != null && (mgComparedResultO = oVar.o()) != null && mgComparedResultO.isMgWin()) {
                    double uSDEcpm = mgComparedResultO.getMgAdInfo() != null ? mgComparedResultO.getMgAdInfo().getUSDEcpm() : 0.0d;
                    if (uSDEcpm > 0.0d && com.thinkup.core.common.ooo.nn.o(unitGroupInfo) < uSDEcpm) {
                        on0 on0VarN0n = unitGroupInfo.n0n();
                        if (unitGroupInfo.oom() && on0VarN0n != null) {
                            com.thinkup.core.n.o0.n.o(on0VarN0n, new mnn(2, unitGroupInfo, trackingInfo), true, 35);
                        }
                        com.thinkup.core.common.oo0.oo.m(trackingInfo, "1");
                    } else {
                        com.thinkup.core.common.o.o().o(this.on, tUBaseAdAdapter, list, unitGroupInfo.on0(), this.oo.o00());
                    }
                } else {
                    com.thinkup.core.common.o.o().o(this.on, tUBaseAdAdapter, list, unitGroupInfo.on0(), this.oo.o00());
                }
                com.thinkup.core.common.oo0.n.o(this.o).o(2, trackingInfo);
                omn.o(trackingInfo, com.thinkup.core.common.n.mo.o0m.m, com.thinkup.core.common.n.mo.o0m.no, "");
                o(ooVarRemove);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private synchronized void o(o0mm o0mmVar, com.thinkup.core.common.on.n0 n0Var) {
        o0mmVar.m0o();
        com.thinkup.core.common.oom.on.o0(o0mmVar, n0Var);
    }

    private void o(com.thinkup.core.common.oom.oo ooVar, TUBaseAdAdapter tUBaseAdAdapter, o0mm o0mmVar, com.thinkup.core.common.on.n0 n0Var, boolean z2, BaseAd... baseAdArr) {
        n0Var.no(m0n.o(o0mmVar, tUBaseAdAdapter));
        double dO = ooVar.oo() != 2 ? com.thinkup.core.common.ooo.nn.o(o0mmVar) : 0.0d;
        o(o0mmVar, dO, z2);
        com.thinkup.core.n.o0.n.o(tUBaseAdAdapter, o0mmVar, n0Var, baseAdArr);
        this.m0n.m0(o0mmVar);
        double d = this.mm0;
        if (d <= 0.0d) {
            n0Var.oom = 0;
        } else if (d < dO) {
            n0Var.oom = 2;
        } else {
            n0Var.oom = 1;
        }
        com.thinkup.core.common.oom.on.o(this.o, this.on, this.om, o0mmVar, null);
    }

    private void o(com.thinkup.core.common.oom.oo ooVar) {
        boolean zO0 = ooVar.o0();
        if (zO0) {
            this.m0n.o(-1, ooVar.oo());
        }
        m(ooVar);
        n(ooVar);
        if (this.mo0 != null && this.m0n.m().o() != this.mo0.o0() && com.thinkup.core.common.ooo.mn.o(this.omo, this.mo0.o0()) <= 0) {
            com.thinkup.core.common.ooo.nn.o(this.omo);
            com.thinkup.core.common.ooo.nn.o(this.mo0.o0());
            this.mo0.n();
        }
        if (!zO0) {
            n0();
            return;
        }
        ooVar.oo();
        this.m0n.o(ooVar.oo());
        o(this.m0n.m(ooVar.oo()), ooVar.oo());
        n0();
    }

    public final void o(final int i2, o0mm o0mmVar) {
        boolean z2;
        oo0();
        if (this.m00 != null) {
            com.thinkup.core.common.o0n.o0.o().o(this.m00);
            this.m00 = null;
        }
        com.thinkup.core.common.o.n.o oVar = this.mo0;
        if (oVar != null && ((oVar.o0() == this.m0n.m().o() || com.thinkup.core.common.ooo.mn.o(this.mo0.o0(), this.omo) < 0) && this.mo0.m())) {
            o(this.mo0.o0(), com.thinkup.core.common.ooo.nn.o(this.mo0.o0()), true);
            i2 = this.mo0.o0().m000() ? 13 : 11;
        }
        o0mm o0mmVar2 = this.omo;
        if (o0mmVar2 != null && o0mmVar2.m000()) {
            i2 = 13;
        }
        if (i2 != 5 && i2 != 13) {
            switch (i2) {
                case 9:
                case 10:
                case 11:
                    z2 = true;
                    break;
                default:
                    z2 = false;
                    break;
            }
        } else {
            z2 = true;
        }
        this.nm = true;
        this.no = true;
        if (this.mom != null) {
            com.thinkup.core.common.o0n.o0.o().o(this.mom);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.ooo;
        final com.thinkup.core.common.on.n0 n0VarNmm = this.mo.nmm();
        n0VarNmm.m(true);
        n0VarNmm.o0n(j);
        n0VarNmm.no(jElapsedRealtime);
        if (this.omn) {
            n0VarNmm.m(2);
        } else {
            n0VarNmm.m(1);
        }
        if (z2) {
            n0VarNmm.mom(i2);
        }
        if (o0mmVar != null) {
            n0VarNmm.o(o0mmVar);
        }
        com.thinkup.core.common.oom.on.o(this.o, this.on);
        com.thinkup.core.common.oom.on.o(this.on);
        if (this.mno != null) {
            com.thinkup.core.common.ooo.o00.o(Thread.currentThread().getStackTrace());
            omm();
            this.mno.o(new com.thinkup.core.mg.o.m() { // from class: com.thinkup.core.common.on.8
                @Override // com.thinkup.core.mg.o.m
                public final void o(MgComparedResult mgComparedResult) {
                    int i3;
                    if (mgComparedResult != null) {
                        i3 = mgComparedResult.isCpTimeout() ? 3 : 2;
                    } else {
                        i3 = 0;
                    }
                    com.thinkup.core.common.oo0.oo.m(n0VarNmm, i3);
                    if (mgComparedResult == null || !mgComparedResult.isMgWin()) {
                        com.thinkup.core.common.oo0.n.o(on.this.o).o(12, n0VarNmm);
                        on.o(on.this, i2);
                        return;
                    }
                    com.thinkup.core.common.o.o().n(on.this.on);
                    on.this.oo0 = ErrorCode.getErrorCode(ErrorCode.compareFailedError, "", "");
                    o0mm o0mmVarO0n = on.this.o0n();
                    MgComparedResult mgComparedResultO = on.this.mno.o();
                    if (com.thinkup.core.common.ooo.nn.o(o0mmVarO0n) <= ((mgComparedResultO == null || mgComparedResultO.getMgAdInfo() == null) ? 0.0d : mgComparedResultO.getMgAdInfo().getUSDEcpm())) {
                        o0mmVarO0n = null;
                    }
                    on.this.om(o0mmVarO0n);
                }
            });
            this.mno.o(this.mm, this.mmm);
            return;
        }
        this.oo0 = ErrorCode.getErrorCode(ErrorCode.noADError, "", "The MgComparePriceHandler can not be null.");
        om((o0mm) null);
    }

    private void o(int i2, List<o0mm> list, final mm.o oVar) {
        boolean z2 = this.mon != null || m0n.o(this.onn);
        o0om o0omVar = new o0om();
        o0omVar.m = this.o;
        o0omVar.f42240n = this.mm;
        o0omVar.o0 = this.om;
        o0omVar.oo = this.on;
        o0omVar.om = this.oo.o().o00n();
        o0omVar.on = this.oo.mn();
        o0omVar.m0 = this.oo.n0();
        mo.o();
        o0omVar.n0 = mo.o(this.oo.o(), z2);
        mo.o();
        o0omVar.nn = mo.o(this.oo.o());
        mo.o();
        o0omVar.o00 = mo.m(this.oo.o());
        o0omVar.mm = list;
        o0omVar.nm = this.oo;
        o0omVar.o0n = this.mo;
        o0omVar.o0o = this.m0;
        o0omVar.oom = this.m0n.o00();
        o0omVar.oon = this.m0n.o0o();
        o0omVar.om0 = this.m0n.o0m();
        o0omVar.no = z2;
        o0omVar.oo0 = i2;
        o0omVar.ooo = this.m0n.o(list, this.mmm);
        o0omVar.omo = this.m0n.o();
        com.thinkup.core.n.m0 m0Var = new com.thinkup.core.n.m0(o0omVar);
        m0Var.o(TUSDK.isNetworkLogDebug());
        m0Var.o(new mm.o() { // from class: com.thinkup.core.common.on.2
            @Override // com.thinkup.core.common.mm.o
            public final void o(String str, List<o0mm> list2, List<o0mm> list3, boolean z3) {
                mm.o oVar2 = oVar;
                if (oVar2 != null) {
                    oVar2.o(str, list2, list3, z3);
                }
            }

            @Override // com.thinkup.core.common.mm.o
            public final void o(String str) {
                mm.o oVar2 = oVar;
                if (oVar2 != null) {
                    oVar2.o(str);
                }
            }
        });
    }

    public final synchronized void o(String str, com.thinkup.core.common.oom.m mVar) {
        try {
            com.thinkup.core.common.on.n0 n0Var = mVar.om;
            o0mm o0mmVar = mVar.on;
            AdError adError = mVar.o0;
            long j = mVar.oo;
            int i2 = mVar.m0;
            String strMon = n0Var.mon();
            com.thinkup.core.common.oom.oo ooVarRemove = this.onm.remove(str);
            if (ooVarRemove == null) {
                return;
            }
            o0mmVar.toString();
            o(o0mmVar);
            this.oo0.putNetworkErrorMsg(strMon, n0Var.n0n(), n0Var.oom0(), adError);
            if (i2 == 0) {
                com.thinkup.core.common.oo0.oo.o(n0Var, mVar.f42293n, adError, j);
            } else {
                StringBuilder sb = new StringBuilder("requestId=");
                sb.append(this.om);
                sb.append(", networkFirmId=");
                sb.append(n0Var.n0n());
                sb.append(", adSourceId=");
                sb.append(n0Var.mon());
                sb.append(", format=");
                sb.append(n0Var.oono());
                on0 on0VarN0n = o0mmVar.n0n();
                if (on0VarN0n != null) {
                    sb.append(", hasShow=");
                    sb.append(on0VarN0n.nn());
                    sb.append(", bidId=");
                    sb.append(on0VarN0n.token);
                    sb.append(", tpBidId=");
                    sb.append(on0VarN0n.on);
                }
                com.thinkup.core.common.oo0.oo.m("unexpected request failed", sb.toString(), com.thinkup.core.common.n.o0n.m().o0m());
            }
            if (j > 0) {
                com.thinkup.core.common.n.n nVar = this.mn;
                if (nVar != null) {
                    nVar.onAdSourceLoadFail(n0Var, adError);
                }
                o(n0Var, adError, com.thinkup.core.common.oom.o.o.m.f42302n, o0mmVar);
            }
            omn.o(n0Var, com.thinkup.core.common.n.mo.o0m.m, com.thinkup.core.common.n.mo.o0m.nm, adError.printStackTrace());
            o(o0mmVar, this.mo);
            o(ooVarRemove);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(String str) {
        if (this.m0m.m()) {
            return;
        }
        o(this.onm.get(str));
    }

    public final synchronized void o(double d, o0mm o0mmVar) {
        try {
            onm();
            if (!this.m0m.on() && o0mmVar != null && o0mmVar.oom()) {
                this.m0m.m0();
            }
            if (d > this.mm0) {
                this.mm0 = d;
            }
            int iO00n = this.oo.o().o00n();
            if (iO00n == 0 || iO00n == 2) {
                return;
            }
            this.m0m.o0();
            ooo oooVarO = ooo.o();
            String str = this.on;
            StringBuilder sb = new StringBuilder();
            sb.append(this.oo.o().o00n());
            om omVarO = oooVarO.o(str, sb.toString());
            if (omVarO != null) {
                omVarO.o(this.om);
            } else {
                com.thinkup.core.common.oo0.oo.m("AdManage is null--notifyimpression", "Id:" + this.on + "--format:" + this.oo.o().o00n(), com.thinkup.core.common.n.o0n.m().o0m());
            }
            if (!this.nm) {
                o(10, o0mmVar);
            }
            n0();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o(TUBaseAdAdapter tUBaseAdAdapter, String str) {
        if (tUBaseAdAdapter != null) {
            str.getClass();
            switch (str) {
                case "0":
                    tUBaseAdAdapter.setRequestNum(tUBaseAdAdapter.getUnitGroupInfo().onn());
                    break;
                case "4":
                    tUBaseAdAdapter.setFetchAdTimeout(this.mm.m0);
                    break;
                case "50":
                    com.thinkup.core.common.n.n nVar = this.mm.o0;
                    if (nVar instanceof com.thinkup.core.common.n.o0) {
                        ((com.thinkup.core.common.n.o0) nVar).onPrepareAdapterLoad(tUBaseAdAdapter);
                        break;
                    }
                    break;
            }
        }
    }

    private void o(AdError adError) {
        nm nmVar;
        omn.o("Mediation", "placementId:" + this.on + ";result_callback:fail;loadType:" + this.mm.f42198n + ";");
        oom.o(this.o).o(this.on, this.om, false);
        mmm mmmVar = this.mm;
        if (mmmVar == null || (nmVar = mmmVar.oo) == null) {
            return;
        }
        nmVar.o(2, mmmVar, this.oo, adError);
        this.mm.oo = null;
    }

    private void o(o0mm o0mmVar, double d, boolean z2) {
        if (o0mmVar == null) {
            return;
        }
        this.omm = true;
        on(o0mmVar);
        if (d == 0.0d) {
            if (this.omo == null && (!z2 || !this.omn)) {
                this.omn = !z2;
            }
        } else if (com.thinkup.core.common.ooo.mn.o(o0mmVar, this.omo) < 0) {
            this.omo = o0mmVar;
            if (!z2 || !this.omn) {
                this.omn = !z2;
            }
        }
        o0mm o0mmVar2 = this.ono;
        if (o0mmVar2 == null || com.thinkup.core.common.ooo.mn.o(o0mmVar2, o0mmVar) < 0) {
            this.ono = o0mmVar;
        }
        boolean zOn = this.m0n.on(o0mmVar);
        if (this.nm && this.no && zOn) {
            com.thinkup.core.o0.m.o().o(this.on, this.om, this.oo.o().o0mn(), this.mm, this.m0n.m().o());
        }
    }

    private void o(TUBaseAdAdapter tUBaseAdAdapter) {
        if (tUBaseAdAdapter == null) {
            return;
        }
        synchronized (this.moo) {
            this.moo.add(tUBaseAdAdapter);
        }
    }

    private String o(com.thinkup.core.common.on.n0 n0Var, o0mm o0mmVar) {
        StringBuilder sb = new StringBuilder("requestId=");
        sb.append(this.om);
        sb.append(", networkFirmId=");
        sb.append(n0Var.n0n());
        sb.append(", adSourceId=");
        sb.append(n0Var.mon());
        sb.append(", format=");
        sb.append(n0Var.oono());
        on0 on0VarN0n = o0mmVar.n0n();
        if (on0VarN0n != null) {
            sb.append(", hasShow=");
            sb.append(on0VarN0n.nn());
            sb.append(", bidId=");
            sb.append(on0VarN0n.token);
            sb.append(", tpBidId=");
            sb.append(on0VarN0n.on);
        }
        return sb.toString();
    }

    public static /* synthetic */ void o(on onVar, com.thinkup.core.common.oom.oo ooVar, com.thinkup.core.common.on.n0 n0Var, o0mm o0mmVar) {
        com.thinkup.core.common.oom.o0 o0Var = new com.thinkup.core.common.oom.o0();
        o0Var.o = onVar.o;
        o0Var.m = onVar.m;
        o0Var.f42309n = onVar.om;
        o0Var.o0 = onVar.on;
        o0Var.oo = onVar.oo.o();
        o0Var.om = onVar.m0;
        o0Var.on = onVar.oom;
        o0Var.m0 = n0Var;
        o0Var.mo = onVar.m0n.o0m();
        ooVar.o(o0Var);
        ooVar.o(onVar.new AnonymousClass6(o0mmVar));
        ooVar.o(onVar.ono);
    }

    public static /* synthetic */ void o(on onVar, com.thinkup.core.common.on.n0 n0Var, TUBaseAdAdapter tUBaseAdAdapter) {
        com.thinkup.core.common.n.n nVar = onVar.mn;
        if (nVar != null) {
            nVar.onAdSourceAttempt(n0Var);
        }
        if (tUBaseAdAdapter != null) {
            onVar.o(n0Var, (AdError) null, com.thinkup.core.common.oom.o.o.m.o, tUBaseAdAdapter.getUnitGroupInfo());
        }
        if (tUBaseAdAdapter != null) {
            com.thinkup.core.common.ooo.o0.o().o(n0Var, tUBaseAdAdapter.getUnitGroupInfo(), 3);
        }
    }

    public static /* synthetic */ void o(on onVar, TUBaseAdAdapter tUBaseAdAdapter) {
        if (tUBaseAdAdapter != null) {
            synchronized (onVar.moo) {
                onVar.moo.add(tUBaseAdAdapter);
            }
        }
    }

    public static /* synthetic */ void o(on onVar, int i2) {
        com.thinkup.core.oo.n0 n0VarO;
        onVar.ooo();
        if (onVar.mmo) {
            return;
        }
        omn.o("Mediation", "placementId:" + onVar.on + ";result_callback:success;loadType:" + onVar.mm.f42198n + ";");
        oom.o(onVar.o).o(onVar.on, onVar.om, true);
        mmm mmmVar = onVar.mm;
        if (mmmVar != null && mmmVar.oo != null) {
            try {
                oo00 oo00Var = onVar.oo;
                if (oo00Var != null && (n0VarO = oo00Var.o()) != null) {
                    try {
                        ooo oooVarO = ooo.o();
                        String str = onVar.on;
                        StringBuilder sb = new StringBuilder();
                        sb.append(onVar.oo.o().o00n());
                        if (oooVarO.o(str, sb.toString()) != null) {
                            om.o(n0VarO, onVar.mo);
                            om.m(n0VarO, onVar.mo);
                        }
                    } catch (com.thinkup.core.common.on.mn e2) {
                        mmm mmmVar2 = onVar.mm;
                        mmmVar2.oo.o(1, mmmVar2, onVar.oo, e2.o);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            onVar.o0((com.thinkup.core.common.oom.oo) null);
            mmm mmmVar3 = onVar.mm;
            mmmVar3.oo.o(onVar.omn ? 1 : 2, mmmVar3, onVar.oo, i2);
            onVar.mm.oo = null;
        }
        com.thinkup.core.o0.m.o().o(onVar.on, onVar.om, onVar.oo.o().o0mn(), onVar.mm, onVar.m0n.m().o());
    }
}
