package com.bytedance.sdk.openadsdk.lk;

import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.utils.hg;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class nBu {
    private String IeN;
    private String JVA;
    private String NXR;
    private String STP;
    private int VVE;
    private FilterWord brP;
    private int kqm;
    protected IListenerManager lc;
    private String sLN;
    public static FilterWord Lxb = new FilterWord("", "");
    public static int LD = 1;
    public static int lk = 2;
    public static int ZU = 3;
    public static int JXs = 4;
    private final Set<lk> ebl = new HashSet();
    private final Set<LD> OY = new HashSet();
    private final Set<ZU> QAg = new HashSet();
    private final Set<Lxb> nBu = new HashSet();

    public interface LD {
        void Lxb(int i);
    }

    public interface Lxb {
        void Lxb(List<FilterWord> list);
    }

    public interface ZU {
        void Lxb(String str);
    }

    public interface lk {
        void Lxb(FilterWord filterWord);
    }

    private void nBu() {
        Iterator<lk> it = this.ebl.iterator();
        while (it.hasNext()) {
            it.next().Lxb(this.brP);
        }
    }

    public void JXs() {
        Iterator<LD> it = this.OY.iterator();
        while (it.hasNext()) {
            it.next().Lxb(lk);
        }
    }

    public void LD(String str) {
        this.sLN = str;
    }

    public int OY() {
        return this.VVE;
    }

    public boolean QAg() {
        return this.VVE < this.kqm;
    }

    public void ZU() {
        if (!lk() && !TextUtils.isEmpty(this.STP)) {
            this.brP = new FilterWord("0:00", this.STP);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.brP);
        if (!TextUtils.isEmpty(this.JVA)) {
            if (TextUtils.isEmpty(this.STP)) {
                com.bytedance.sdk.openadsdk.lk.LD.Lxb().Lxb(this.JVA, arrayList, this.sLN);
            } else {
                com.bytedance.sdk.openadsdk.lk.LD.Lxb().Lxb(this.JVA, arrayList, this.IeN, this.STP, this.sLN);
            }
        }
        if (!TextUtils.isEmpty(this.NXR)) {
            if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                JXs("onItemClickClosed");
            } else {
                com.bytedance.sdk.openadsdk.core.lk.ZU.Lxb lxbJXs = com.bytedance.sdk.openadsdk.core.QAg.LD().JXs(this.NXR);
                if (lxbJXs != null) {
                    lxbJXs.Lxb();
                    com.bytedance.sdk.openadsdk.core.QAg.LD().lc(this.NXR);
                }
            }
        }
        Iterator<LD> it = this.OY.iterator();
        while (it.hasNext()) {
            it.next().Lxb(LD);
        }
        Lxb(Lxb);
        lk("");
    }

    public String ebl() {
        return this.STP;
    }

    public void lc() {
        Iterator<LD> it = this.OY.iterator();
        while (it.hasNext()) {
            it.next().Lxb(JXs);
        }
    }

    public boolean lk() {
        FilterWord filterWord = this.brP;
        return (filterWord == null || filterWord.equals(Lxb)) ? false : true;
    }

    public FilterWord LD() {
        return this.brP;
    }

    public void Lxb() {
        this.ebl.clear();
        this.OY.clear();
        this.QAg.clear();
        this.nBu.clear();
    }

    public void lk(String str) {
        this.STP = str;
        Iterator<ZU> it = this.QAg.iterator();
        while (it.hasNext()) {
            it.next().Lxb(this.STP);
        }
    }

    private void JXs(final String str) {
        hg.lk(new com.bytedance.sdk.component.OY.OY("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.lk.nBu.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (TextUtils.isEmpty(nBu.this.NXR)) {
                        return;
                    }
                    nBu.this.Lxb(6).executeDisLikeClosedCallback(nBu.this.NXR, str);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("TTDislikeManager", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    public void Lxb(String str) {
        this.JVA = str;
    }

    public void Lxb(FilterWord filterWord) {
        this.brP = filterWord;
        nBu();
    }

    public void Lxb(lk lkVar) {
        this.ebl.add(lkVar);
    }

    public void Lxb(LD ld) {
        this.OY.add(ld);
    }

    public void Lxb(ZU zu) {
        this.QAg.add(zu);
    }

    public void Lxb(Lxb lxb) {
        this.nBu.add(lxb);
    }

    public void Lxb(List<FilterWord> list) {
        Iterator<Lxb> it = this.nBu.iterator();
        while (it.hasNext()) {
            it.next().Lxb(list);
        }
    }

    public IListenerManager Lxb(int i) {
        if (this.lc == null) {
            this.lc = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb().Lxb(i));
        }
        return this.lc;
    }

    public void ZU(String str) {
        this.IeN = str;
    }

    public static void Lxb(final int i, final String str, final com.bytedance.sdk.openadsdk.core.lk.ZU.Lxb lxb) {
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            hg.lk(new com.bytedance.sdk.component.OY.OY("DislikeClosed_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.lk.nBu.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.Lxb Lxb2 = com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb();
                    if (i != 6 || lxb == null) {
                        return;
                    }
                    try {
                        com.bytedance.sdk.openadsdk.multipro.aidl.LD.LD ld = new com.bytedance.sdk.openadsdk.multipro.aidl.LD.LD(str, lxb);
                        IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(Lxb2.Lxb(6));
                        if (iListenerManagerAsInterface != null) {
                            iListenerManagerAsInterface.registerDisLikeClosedListener(str, ld);
                        }
                    } catch (RemoteException e) {
                        com.bytedance.sdk.component.utils.sLN.Lxb("TTDislikeManager", e.getMessage());
                    }
                }
            }, 5);
        }
    }

    public static void Lxb(final int i, final String str) {
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            hg.lk(new com.bytedance.sdk.component.OY.OY("DislikeClosed_unregisterMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.lk.nBu.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.Lxb Lxb2 = com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb();
                    if (i == 6) {
                        try {
                            IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(Lxb2.Lxb(6));
                            if (iListenerManagerAsInterface != null) {
                                iListenerManagerAsInterface.unregisterDisLikeClosedListener(str);
                            }
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }, 5);
        }
    }

    public void Lxb(int i, int i2) {
        this.VVE = i;
        this.kqm = i2;
    }
}
