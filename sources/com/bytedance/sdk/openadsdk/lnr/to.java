package com.bytedance.sdk.openadsdk.lnr;

import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.fco;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class to {
    private FilterWord aaj;
    private JSONObject bjy;
    private int exc;
    private String exu;
    private String fs;
    private int jl;
    private String jtx;
    protected IListenerManager mo;
    private String rdp;
    private String rq;
    private ljh yt;
    public static FilterWord qdl = new FilterWord("", "");
    public static int ud = 1;
    public static int lnr = 2;
    public static int mml = 3;
    public static int mzz = 4;
    private final Set<lnr> wd = new HashSet();
    private final Set<ud> jpc = new HashSet();
    private final Set<mml> tvp = new HashSet();
    private final Set<qdl> to = new HashSet();

    public interface lnr {
        void qdl(FilterWord filterWord);
    }

    public interface mml {
        void qdl(String str);
    }

    public interface qdl {
        void qdl(List<FilterWord> list);
    }

    public interface ud {
        void qdl(int i2);
    }

    private void to() {
        Iterator<lnr> it = this.wd.iterator();
        while (it.hasNext()) {
            it.next().qdl(this.aaj);
        }
    }

    public int jpc() {
        return this.jl;
    }

    public boolean lnr() {
        FilterWord filterWord = this.aaj;
        return (filterWord == null || filterWord.equals(qdl)) ? false : true;
    }

    public void mml() {
        if (!lnr() && !TextUtils.isEmpty(this.rdp)) {
            this.aaj = new FilterWord("0:00", this.rdp);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.aaj);
        if (!TextUtils.isEmpty(this.rq)) {
            if (TextUtils.isEmpty(this.rdp)) {
                com.bytedance.sdk.openadsdk.lnr.ud.qdl().qdl(this.rq, arrayList, this.fs);
            } else {
                if (this.bjy == null) {
                    ljh ljhVar = this.yt;
                    if (ljhVar != null) {
                        this.bjy = ljhVar.rdz();
                    } else {
                        try {
                            this.bjy = new JSONObject(this.jtx);
                        } catch (Throwable th) {
                            aaj.qdl("TTDislikeManager", "creative info to json exception", th);
                        }
                    }
                }
                com.bytedance.sdk.openadsdk.lnr.ud.qdl().qdl(this.rq, arrayList, this.bjy, this.rdp, this.fs);
            }
        }
        if (!TextUtils.isEmpty(this.exu)) {
            if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                mml("onItemClickClosed");
            } else {
                com.bytedance.sdk.openadsdk.core.mml.wd.qdl qdlVarMzz = com.bytedance.sdk.openadsdk.core.tvp.ud().mzz(this.exu);
                if (qdlVarMzz != null) {
                    qdlVarMzz.qdl();
                    com.bytedance.sdk.openadsdk.core.tvp.ud().mo(this.exu);
                }
            }
        }
        Iterator<ud> it = this.jpc.iterator();
        while (it.hasNext()) {
            it.next().qdl(ud);
        }
        qdl(qdl);
        lnr("");
    }

    public void mo() {
        Iterator<ud> it = this.jpc.iterator();
        while (it.hasNext()) {
            it.next().qdl(mzz);
        }
    }

    public void mzz() {
        Iterator<ud> it = this.jpc.iterator();
        while (it.hasNext()) {
            it.next().qdl(lnr);
        }
    }

    public boolean tvp() {
        return this.jl < this.exc;
    }

    public void ud(String str) {
        this.fs = str;
    }

    public String wd() {
        return this.rdp;
    }

    public void lnr(String str) {
        this.rdp = str;
        Iterator<mml> it = this.tvp.iterator();
        while (it.hasNext()) {
            it.next().qdl(this.rdp);
        }
    }

    public void qdl() {
        this.wd.clear();
        this.jpc.clear();
        this.tvp.clear();
        this.to.clear();
    }

    public FilterWord ud() {
        return this.aaj;
    }

    public void qdl(String str) {
        this.rq = str;
    }

    public void qdl(FilterWord filterWord) {
        this.aaj = filterWord;
        to();
    }

    public void qdl(lnr lnrVar) {
        this.wd.add(lnrVar);
    }

    public void qdl(ud udVar) {
        this.jpc.add(udVar);
    }

    public void qdl(mml mmlVar) {
        this.tvp.add(mmlVar);
    }

    public void qdl(qdl qdlVar) {
        this.to.add(qdlVar);
    }

    public void qdl(List<FilterWord> list) {
        Iterator<qdl> it = this.to.iterator();
        while (it.hasNext()) {
            it.next().qdl(list);
        }
    }

    public IListenerManager qdl(int i2) {
        if (this.mo == null) {
            this.mo = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl().qdl(i2));
        }
        return this.mo;
    }

    public static void qdl(final int i2, final String str, final com.bytedance.sdk.openadsdk.core.mml.wd.qdl qdlVar) {
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            fco.lnr(new com.bytedance.sdk.component.jpc.jpc("DislikeClosed_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.lnr.to.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.qdl qdlVarQdl = com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl();
                    if (i2 != 6 || qdlVar == null) {
                        return;
                    }
                    try {
                        com.bytedance.sdk.openadsdk.multipro.aidl.ud.ud udVar = new com.bytedance.sdk.openadsdk.multipro.aidl.ud.ud(str, qdlVar);
                        IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(qdlVarQdl.qdl(6));
                        if (iListenerManagerAsInterface != null) {
                            iListenerManagerAsInterface.registerDisLikeClosedListener(str, udVar);
                        }
                    } catch (RemoteException e2) {
                        aaj.lnr("TTDislikeManager", e2.getMessage());
                    }
                }
            }, 5);
        }
    }

    public static void qdl(final int i2, final String str) {
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            fco.lnr(new com.bytedance.sdk.component.jpc.jpc("DislikeClosed_unregisterMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.lnr.to.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.qdl qdlVarQdl = com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl();
                    if (i2 == 6) {
                        try {
                            IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(qdlVarQdl.qdl(6));
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

    private void mml(final String str) {
        fco.lnr(new com.bytedance.sdk.component.jpc.jpc("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.lnr.to.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (TextUtils.isEmpty(to.this.exu)) {
                        return;
                    }
                    to.this.qdl(6).executeDisLikeClosedCallback(to.this.exu, str);
                } catch (Throwable th) {
                    aaj.qdl("TTDislikeManager", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    public void qdl(String str, ljh ljhVar) {
        this.jtx = str;
        this.yt = ljhVar;
    }

    public void qdl(int i2, int i3) {
        this.jl = i2;
        this.exc = i3;
    }
}
