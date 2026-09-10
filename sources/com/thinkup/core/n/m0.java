package com.thinkup.core.n;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.a;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.common.m0.o;
import com.thinkup.core.common.mm;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.mmm;
import com.thinkup.core.common.on.mnn;
import com.thinkup.core.common.on.mo0;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0mn;
import com.thinkup.core.common.on.o0om;
import com.thinkup.core.common.on.on0;
import com.thinkup.core.common.ooo.m0m;
import com.thinkup.core.common.ooo.m0n;
import com.thinkup.core.common.ooo.mn;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.common.ooo.o00;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class m0 extends com.thinkup.core.common.ooo.m implements mm.m {
    public static final String o = "m0";
    private mm.o m0;
    private long mm;
    private boolean mn;
    private String mo;
    private o0om n0;
    private long nm;
    private long nn;
    private Map<Integer, o> no;
    protected com.thinkup.core.common.m0 o0;
    private List<o0mm> o00;
    private com.thinkup.core.common.o0n.m o0m;
    private String on;
    protected long oo;
    Map<String, n0> m = new ConcurrentHashMap(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    com.thinkup.core.common.o0n.m f42403n = new com.thinkup.core.common.o0n.m() { // from class: com.thinkup.core.n.m0.1
        @Override // java.lang.Runnable
        public final void run() {
            com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.n.m0.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    m0.this.n();
                }
            });
        }
    };
    private boolean o0o = false;
    com.thinkup.core.common.m0.m om = new com.thinkup.core.common.m0.m() { // from class: com.thinkup.core.n.m0.3
        @Override // com.thinkup.core.common.m0.m
        public final void o(o oVar, int i2) {
            m0.o(m0.this, oVar, i2);
        }
    };

    /* JADX INFO: renamed from: com.thinkup.core.n.m0$4, reason: invalid class name */
    public class AnonymousClass4 implements com.thinkup.core.n.m.m {
        final /* synthetic */ int o;

        public AnonymousClass4(int i2) {
            this.o = i2;
        }

        @Override // com.thinkup.core.n.m.m
        public final void o(o0mm o0mmVar, TUBaseAdAdapter tUBaseAdAdapter) {
            m0.o(m0.this, o0mmVar, tUBaseAdAdapter);
        }

        @Override // com.thinkup.core.n.m.m
        public final void o(List<o0mm> list, List<o0mm> list2) {
            m0.this.m(Integer.valueOf(this.o), list, list2);
            com.thinkup.core.common.m0 m0Var = m0.this.o0;
            if (m0Var != null) {
                m0Var.m();
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.n.m0$5, reason: invalid class name */
    public class AnonymousClass5 implements com.thinkup.core.common.o0n.m {
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.n.m0.5.1
                @Override // java.lang.Runnable
                public final void run() {
                    m0.this.o0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.n.m0$7, reason: invalid class name */
    public class AnonymousClass7 implements Runnable {
        final /* synthetic */ n0 m;
        final /* synthetic */ o0mm o;

        public AnonymousClass7(o0mm o0mmVar, n0 n0Var) {
            this.o = o0mmVar;
            this.m = n0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.adSourceBidError, "", this.o.mon());
            if (m0.this.n0.f42240n.o0 != null) {
                if (this.m != null) {
                    m0.this.n0.f42240n.o0.onAdSourceBiddingFail(this.m, errorCode);
                }
                m0.this.m.remove(this.o.m0o());
            }
            m0.this.o(this.m, errorCode, com.thinkup.core.common.oom.o.o.m.f42302n, this.o);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.n.m0$8, reason: invalid class name */
    public class AnonymousClass8 implements Runnable {
        final /* synthetic */ o0mm m;
        final /* synthetic */ n0 o;

        public AnonymousClass8(n0 n0Var, o0mm o0mmVar) {
            this.o = n0Var;
            this.m = o0mmVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (m0.this.n0.f42240n.o0 != null) {
                n0 n0Var = this.o;
                if (n0Var != null) {
                    m0m.o(n0Var, this.m, 0, false);
                    m0.this.n0.f42240n.o0.onAdSourceBiddingFilled(this.o);
                }
                m0.this.m.remove(this.m.m0o());
            }
        }
    }

    public m0(o0om o0omVar) {
        this.n0 = o0omVar;
        this.on = o0omVar.oo;
        this.mo = o0omVar.o0;
        this.mm = o0omVar.on;
        this.o0 = o0omVar.m00;
        List<o0mm> list = o0omVar.mm;
        int size = list.size();
        List<o0mm> listO = o0omVar.omo.o();
        if (listO.size() > 0) {
            this.n0.omm = listO.size() + size;
        } else {
            this.n0.omm = size;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<o0mm> arrayList3 = null;
        List<o0mm> arrayList4 = null;
        List<o0mm> arrayList5 = null;
        List<o0mm> arrayList6 = null;
        for (int i2 = 0; i2 < size; i2++) {
            o0mm o0mmVar = list.get(i2);
            if (o0mmVar.om0() == 1 || o0mmVar.om0() == 3) {
                if (this.n0.onn == 1 && o0mmVar.om0() == 3) {
                    arrayList3 = arrayList3 == null ? new ArrayList<>() : arrayList3;
                    arrayList3.add(o0mmVar);
                } else {
                    arrayList.add(o0mmVar);
                }
            } else if (o0mmVar.om0() == 2) {
                arrayList4 = arrayList4 == null ? new ArrayList<>(size) : arrayList4;
                arrayList4.add(o0mmVar);
            } else if (o0mmVar.om0() == 5) {
                arrayList5 = arrayList5 == null ? new ArrayList<>(size) : arrayList5;
                arrayList5.add(o0mmVar);
            } else if (o0mmVar.om0() == 6) {
                arrayList6 = arrayList6 == null ? new ArrayList<>(size) : arrayList6;
                arrayList6.add(o0mmVar);
            } else if (o0mmVar.om0() == 7) {
                arrayList2.add(o0mmVar);
            }
        }
        this.no = new HashMap(5);
        if (arrayList.size() > 0 || arrayList2.size() > 0) {
            this.no.put(1, new mo(o0omVar.o(arrayList, arrayList2), list));
        }
        if (arrayList3 != null && arrayList3.size() > 0) {
            this.no.put(3, new mo(o0omVar.o(arrayList3, null), list));
        }
        if (arrayList4 != null && arrayList4.size() > 0) {
            this.no.put(2, new on(o0omVar.o(arrayList4)));
        }
        if (arrayList5 != null && arrayList5.size() > 0) {
            this.no.put(5, new oo(o0omVar.m(arrayList5)));
        }
        if (arrayList6 == null || arrayList6.size() <= 0) {
            return;
        }
        this.no.put(6, new o0(o0omVar.n(arrayList6)));
    }

    private void oo() {
        boolean z2 = this.n0.onm > 0;
        this.o0o = z2;
        if (z2) {
            this.o00 = a.u();
            this.o0m = new AnonymousClass5();
            com.thinkup.core.common.o0n.o0.o().o(this.o0m, this.n0.onm, false);
        }
    }

    private void m(long j) {
        o0om o0omVar = this.n0;
        this.oo = o0omVar.mo;
        mmm mmmVar = o0omVar.f42240n;
        if (mmmVar.mm) {
            int i2 = mmmVar.m0;
            int iOnmn = o0omVar.nm.o().onmn();
            if (iOnmn > 0 && i2 > iOnmn) {
                this.oo = i2 - iOnmn;
            }
        }
        if (this.oo <= 0) {
            this.oo = 2000L;
        }
        this.oo += j;
        com.thinkup.core.common.o0n.o0.o().o(this.f42403n, this.oo, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void n() {
        try {
            mm.o oVar = this.m0;
            if (oVar != null) {
                oVar.o(this.mo);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o0() {
        try {
            if (this.o0o) {
                this.o0o = false;
                List<o0mm> list = this.o00;
                if (list != null && list.size() != 0) {
                    Objects.toString(this.o00);
                    ArrayList arrayList = new ArrayList(this.o00);
                    this.o00.clear();
                    mm.o oVar = this.m0;
                    if (oVar != null) {
                        oVar.o(this.mo, arrayList, new ArrayList(1), false);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.thinkup.core.common.mm.m
    public final void o(boolean z2) {
        this.mn = z2;
    }

    @Override // com.thinkup.core.common.mm.m
    public final void o(mm.o oVar) {
        this.m0 = oVar;
        com.thinkup.core.common.m0 m0Var = this.o0;
        long jN = m0Var == null ? 0L : m0Var.n();
        o(this.mm + jN);
        o0om o0omVar = this.n0;
        this.oo = o0omVar.mo;
        mmm mmmVar = o0omVar.f42240n;
        if (mmmVar.mm) {
            int i2 = mmmVar.m0;
            int iOnmn = o0omVar.nm.o().onmn();
            if (iOnmn > 0 && i2 > iOnmn) {
                this.oo = i2 - iOnmn;
            }
        }
        if (this.oo <= 0) {
            this.oo = 2000L;
        }
        this.oo += jN;
        com.thinkup.core.common.o0n.o0.o().o(this.f42403n, this.oo, false);
        boolean z2 = this.n0.onm > 0;
        this.o0o = z2;
        if (z2) {
            this.o00 = a.u();
            this.o0m = new AnonymousClass5();
            com.thinkup.core.common.o0n.o0.o().o(this.o0m, this.n0.onm, false);
        }
        this.nm = System.currentTimeMillis();
        this.nn = SystemClock.elapsedRealtime();
        HashMap map = new HashMap(this.no);
        com.thinkup.core.common.m0 m0Var2 = this.o0;
        if (m0Var2 != null) {
            m0Var2.o(this.om);
        }
        for (Map.Entry entry : map.entrySet()) {
            final Integer num = (Integer) entry.getKey();
            final o oVar2 = (o) entry.getValue();
            com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.n.m0.2
                @Override // java.lang.Runnable
                public final void run() {
                    o oVar3 = oVar2;
                    if (oVar3 != null) {
                        oVar3.o(m0.this.oo);
                        oVar2.o(m0.this.mn);
                        m0 m0Var3 = m0.this;
                        com.thinkup.core.common.m0 m0Var4 = m0Var3.o0;
                        if (m0Var4 == null) {
                            m0.o(m0Var3, oVar2, num.intValue());
                            return;
                        }
                        o oVar4 = oVar2;
                        int iIntValue = num.intValue();
                        if (oVar4 != null) {
                            m0Var4.new o(oVar4, iIntValue);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void m(Integer num, List<o0mm> list, List<o0mm> list2) {
        o(num, list, list2);
    }

    @Override // com.thinkup.core.common.ooo.m
    public final void m() {
        HashMap map;
        synchronized (this) {
            map = new HashMap(this.no);
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            o oVar = (o) ((Map.Entry) it.next()).getValue();
            if (oVar != null) {
                oVar.m();
            }
        }
    }

    private void m(o0mm o0mmVar) {
        n0 n0Var = this.m.get(o0mmVar.m0o());
        if (n0Var != null) {
            com.thinkup.core.common.ooo.m.m.o().o(new AnonymousClass8(n0Var, o0mmVar));
        }
        com.thinkup.core.common.ooo.o0.o().o(n0Var, o0mmVar, 2);
    }

    private void o(o oVar, int i2) {
        oVar.o(new AnonymousClass4(i2));
    }

    private boolean o(Integer num) {
        o oVar = this.no.get(num);
        if (oVar != null && oVar.o()) {
            this.no.remove(num);
        }
        boolean z2 = false;
        if (this.no.size() == 0) {
            o();
            com.thinkup.core.common.o0n.o0.o().o(this.f42403n);
            this.o0o = false;
            z2 = true;
            if (this.o0m != null) {
                com.thinkup.core.common.o0n.o0.o().o(this.o0m);
            }
        }
        return z2;
    }

    private void o(String str, o0mm o0mmVar, boolean z2) {
        o0mm o0mmVar2;
        Throwable th;
        String str2;
        if (o0mmVar.omo() == 2) {
            o0mn o0mnVarO = com.thinkup.core.common.o.o().o(str, o0mmVar);
            on0 on0VarN0n = o0mmVar.n0n();
            int iO0 = 0;
            com.thinkup.core.common.on.o oVarM = null;
            if (o0mnVarO != null) {
                com.thinkup.core.common.on.m0 m0VarO = o0mnVarO.o((on0) null);
                oVarM = m0VarO.m();
                iO0 = m0VarO.o0();
            }
            if (oVarM != null) {
                o0mmVar.oo0n();
            }
            o0mmVar.toString();
            if (oVarM == null || iO0 < o0mmVar.oo0n()) {
                return;
            }
            try {
                double dO = nn.o(oVarM.oo().getUnitGroupInfo());
                if (mn.o(o0mmVar, oVarM.oo().getUnitGroupInfo()) < 0) {
                    o0mmVar.o(o0mmVar, 2, o0mmVar.omn(), 1);
                    return;
                }
                try {
                    o0mm unitGroupInfo = oVarM.oo().getUnitGroupInfo();
                    if (unitGroupInfo.n0n() != null) {
                        try {
                            str2 = unitGroupInfo.n0n().token;
                        } catch (Throwable th2) {
                            th = th2;
                            o0mmVar2 = o0mmVar;
                            th.printStackTrace();
                        }
                    } else {
                        str2 = "";
                    }
                    if (on0VarN0n == null || TextUtils.equals(on0VarN0n.token, str2)) {
                        o0mmVar2 = o0mmVar;
                    } else {
                        o0mmVar2 = o0mmVar;
                        try {
                            com.thinkup.core.n.o0.n.o(on0VarN0n, new mnn(2, o0mmVar2, this.n0.o0n, dO), true, 26);
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            th.printStackTrace();
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    o0mmVar2 = o0mmVar;
                }
                o0mmVar2.o(oVarM.oo().getUnitGroupInfo(), 1, o0mmVar2.omn(), z2 ? 1 : 0);
            } catch (Exception unused) {
            }
        }
    }

    private void o(o0mm o0mmVar, TUBaseAdAdapter tUBaseAdAdapter) {
        n0 n0VarNmm;
        try {
            n0VarNmm = this.n0.o0n.nmm();
            try {
                m0m.o(n0VarNmm, o0mmVar, 0, false);
                n0VarNmm.no(m0n.o(o0mmVar, (TUBaseAdAdapter) null));
                String internalNetworkSDKVersion = "";
                if (tUBaseAdAdapter != null) {
                    try {
                        internalNetworkSDKVersion = tUBaseAdAdapter.getInternalNetworkSDKVersion();
                    } catch (Throwable unused) {
                    }
                }
                o0mmVar.omn = internalNetworkSDKVersion;
                this.m.put(o0mmVar.m0o(), n0VarNmm);
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            n0VarNmm = null;
        }
        if (o0mmVar.om0() != 7 && tUBaseAdAdapter != null) {
            try {
                if (this.n0.f42240n.o0 != null) {
                    m0m.o(n0VarNmm);
                    this.n0.f42240n.o0.onAdSourceBiddingAttempt(n0VarNmm);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        o(n0VarNmm, (AdError) null, com.thinkup.core.common.oom.o.o.m.o, o0mmVar);
        com.thinkup.core.common.ooo.o0.o().o(n0VarNmm, o0mmVar, 1);
    }

    private void o(o0mm o0mmVar) {
        n0 n0Var = this.m.get(o0mmVar.m0o());
        if (n0Var != null) {
            com.thinkup.core.common.ooo.m.m.o().o(new AnonymousClass7(o0mmVar, n0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(n0 n0Var, AdError adError, int i2, o0mm o0mmVar) {
        String platformCode;
        String platformMSG;
        if (n0Var == null) {
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
            mo0 mo0VarO = mo0.o(n0Var, platformCode, platformMSG, i2);
            mo0VarO.o(adError != null);
            o0Var.o(mo0VarO);
        }
        o0mmVar.m0o();
        o0om o0omVar = this.n0;
        Context contextOn = o0omVar != null ? o0omVar.m : o0n.m().on();
        com.thinkup.core.m.n.o();
        if (i2 == com.thinkup.core.common.oom.o.o.m.o) {
            com.thinkup.core.m.n.o(contextOn, o0mmVar, n0Var.oomn());
        } else if (i2 == com.thinkup.core.common.oom.o.o.m.f42302n) {
            com.thinkup.core.m.n.m(contextOn, o0mmVar, n0Var.oomn());
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x010a A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:4:0x0009, B:6:0x0013, B:8:0x0019, B:11:0x0022, B:13:0x002c, B:15:0x003e, B:19:0x004c, B:22:0x0054, B:26:0x005e, B:30:0x0072, B:32:0x0091, B:33:0x009d, B:34:0x00a8, B:38:0x00b0, B:51:0x012a, B:42:0x00ed, B:44:0x00fc, B:46:0x0106, B:48:0x010d, B:50:0x011e, B:47:0x010a, B:52:0x012d, B:53:0x0130, B:55:0x014d, B:57:0x0153, B:59:0x0157, B:60:0x015a, B:61:0x0160, B:63:0x0166, B:68:0x0170, B:70:0x0174, B:72:0x017a, B:73:0x0184, B:75:0x0188, B:76:0x018b, B:78:0x0191, B:79:0x0199, B:81:0x019d, B:83:0x01a4), top: B:91:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x011e A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:4:0x0009, B:6:0x0013, B:8:0x0019, B:11:0x0022, B:13:0x002c, B:15:0x003e, B:19:0x004c, B:22:0x0054, B:26:0x005e, B:30:0x0072, B:32:0x0091, B:33:0x009d, B:34:0x00a8, B:38:0x00b0, B:51:0x012a, B:42:0x00ed, B:44:0x00fc, B:46:0x0106, B:48:0x010d, B:50:0x011e, B:47:0x010a, B:52:0x012d, B:53:0x0130, B:55:0x014d, B:57:0x0153, B:59:0x0157, B:60:0x015a, B:61:0x0160, B:63:0x0166, B:68:0x0170, B:70:0x0174, B:72:0x017a, B:73:0x0184, B:75:0x0188, B:76:0x018b, B:78:0x0191, B:79:0x0199, B:81:0x019d, B:83:0x01a4), top: B:91:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x012a A[SYNTHETIC] */
    private synchronized void o(Integer num, List<o0mm> list, List<o0mm> list2) {
        boolean z2;
        n0 n0Var;
        try {
            o oVar = this.no.get(num);
            if (oVar != null && oVar.o()) {
                this.no.remove(num);
            }
            if (this.no.size() == 0) {
                o();
                com.thinkup.core.common.o0n.o0.o().o(this.f42403n);
                this.o0o = false;
                if (this.o0m != null) {
                    com.thinkup.core.common.o0n.o0.o().o(this.o0m);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            int size = list != null ? list.size() : 0;
            int size2 = list2 != null ? list2.size() : 0;
            if (size > 0 || size2 > 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (size > 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        o0mm o0mmVar = list.get(i2);
                        o(this.on, o0mmVar, true);
                        arrayList.add(o0mmVar);
                        arrayList3.add(o0mmVar);
                        n0 n0Var2 = this.m.get(o0mmVar.m0o());
                        if (n0Var2 != null) {
                            com.thinkup.core.common.ooo.m.m.o().o(new AnonymousClass8(n0Var2, o0mmVar));
                        }
                        com.thinkup.core.common.ooo.o0.o().o(n0Var2, o0mmVar, 2);
                    }
                    list.clear();
                }
                if (size2 > 0) {
                    for (int i3 = 0; i3 < size2; i3++) {
                        o0mm o0mmVar2 = list2.get(i3);
                        if (o0mmVar2 == null) {
                            try {
                                com.thinkup.core.common.oo0.oo.m("Bid Fail AdSource Object is null, currentSize:" + list2.size() + IOUtils.LINE_SEPARATOR_UNIX + o00.o(new Throwable().getStackTrace()), "Bidding inner error", o0n.m().o0m());
                            } catch (Throwable unused) {
                                o(this.on, o0mmVar2, false);
                                if (nn.o(o0mmVar2) <= 0.0d) {
                                    arrayList2.add(o0mmVar2);
                                } else {
                                    arrayList2.add(o0mmVar2);
                                }
                                arrayList3.add(o0mmVar2);
                                n0Var = this.m.get(o0mmVar2.m0o());
                                if (n0Var != null) {
                                    com.thinkup.core.common.ooo.m.m.o().o(new AnonymousClass7(o0mmVar2, n0Var));
                                }
                            }
                        } else {
                            o(this.on, o0mmVar2, false);
                            if (nn.o(o0mmVar2) <= 0.0d && !TextUtils.isEmpty(o0mmVar2.mom())) {
                                arrayList.add(o0mmVar2);
                            } else {
                                arrayList2.add(o0mmVar2);
                            }
                            arrayList3.add(o0mmVar2);
                            n0Var = this.m.get(o0mmVar2.m0o());
                            if (n0Var != null) {
                                com.thinkup.core.common.ooo.m.m.o().o(new AnonymousClass7(o0mmVar2, n0Var));
                            }
                        }
                    }
                    list2.clear();
                }
                n0 n0VarNmm = this.n0.o0n.nmm();
                long j = this.nm;
                long j2 = this.nn;
                o0om o0omVar = this.n0;
                com.thinkup.core.n.o0.n.o(n0VarNmm, arrayList3, j, j2, o0omVar.oo0, o0omVar.om);
                if (this.o0o) {
                    if (arrayList.size() > 0) {
                        List<o0mm> list3 = this.o00;
                        if (list3 != null) {
                            list3.addAll(arrayList);
                        }
                        arrayList.toString();
                        arrayList.clear();
                    }
                    if (arrayList.size() == 0 && arrayList2.size() == 0) {
                        return;
                    }
                }
                if (z2) {
                    List<o0mm> list4 = this.o00;
                    if (list4 != null && list4.size() > 0) {
                        arrayList.addAll(0, this.o00);
                        this.o00.clear();
                    }
                    com.thinkup.core.common.m0 m0Var = this.o0;
                    if (m0Var != null) {
                        m0Var.o();
                    }
                }
                if (arrayList.size() > 1) {
                    Collections.sort(arrayList, new Comparator<o0mm>() { // from class: com.thinkup.core.n.m0.6
                        private static int o(o0mm o0mmVar3, o0mm o0mmVar4) {
                            return mn.o(o0mmVar3, o0mmVar4);
                        }

                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(o0mm o0mmVar3, o0mm o0mmVar4) {
                            return mn.o(o0mmVar3, o0mmVar4);
                        }
                    });
                }
                mm.o oVar2 = this.m0;
                if (oVar2 != null) {
                    oVar2.o(this.mo, arrayList, arrayList2, z2);
                }
                if (z2) {
                    this.m0 = null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ void o(m0 m0Var, o oVar, int i2) {
        oVar.o(m0Var.new AnonymousClass4(i2));
    }

    public static /* synthetic */ void o(m0 m0Var, o0mm o0mmVar, TUBaseAdAdapter tUBaseAdAdapter) {
        n0 n0VarNmm;
        try {
            n0VarNmm = m0Var.n0.o0n.nmm();
            try {
                m0m.o(n0VarNmm, o0mmVar, 0, false);
                n0VarNmm.no(m0n.o(o0mmVar, (TUBaseAdAdapter) null));
                String internalNetworkSDKVersion = "";
                if (tUBaseAdAdapter != null) {
                    try {
                        internalNetworkSDKVersion = tUBaseAdAdapter.getInternalNetworkSDKVersion();
                    } catch (Throwable unused) {
                    }
                }
                o0mmVar.omn = internalNetworkSDKVersion;
                m0Var.m.put(o0mmVar.m0o(), n0VarNmm);
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            n0VarNmm = null;
        }
        if (o0mmVar.om0() != 7 && tUBaseAdAdapter != null) {
            try {
                if (m0Var.n0.f42240n.o0 != null) {
                    m0m.o(n0VarNmm);
                    m0Var.n0.f42240n.o0.onAdSourceBiddingAttempt(n0VarNmm);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        m0Var.o(n0VarNmm, (AdError) null, com.thinkup.core.common.oom.o.o.m.o, o0mmVar);
        com.thinkup.core.common.ooo.o0.o().o(n0VarNmm, o0mmVar, 1);
    }
}
