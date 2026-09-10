package com.bytedance.sdk.component.mzz.mml.lnr;

import com.bytedance.sdk.component.mzz.exc;
import com.bytedance.sdk.component.mzz.jtx;
import com.bytedance.sdk.component.mzz.rq;
import com.p004ironsource.d9;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class qdl<T> {
    private lnr qdl;
    private exc ud;

    public qdl(lnr lnrVar, exc excVar) {
        this.qdl = lnrVar;
        this.ud = excVar;
    }

    public void qdl(rq<T> rqVar) {
        try {
            exc excVar = this.ud;
            if (excVar != null) {
                excVar.qdl("success", this.qdl);
            }
            String strAaj = this.qdl.aaj();
            Map<String, List<lnr>> mapTvp = this.qdl.yt().tvp();
            List<lnr> list = mapTvp.get(strAaj);
            if (list == null) {
                jtx jtxVarJpc = this.qdl.jpc();
                if (jtxVarJpc != null) {
                    jtxVarJpc.toString();
                    this.qdl.to();
                    jtxVarJpc.qdl(rqVar);
                }
            } else {
                synchronized (list) {
                    try {
                        list.size();
                        for (lnr lnrVar : list) {
                            jtx jtxVarJpc2 = lnrVar.jpc();
                            if (jtxVarJpc2 != null) {
                                jtxVarJpc2.toString();
                                lnrVar.to();
                                jtxVarJpc2.qdl(rqVar);
                            }
                        }
                        list.clear();
                        mapTvp.remove(strAaj);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            exc excVar2 = this.ud;
            if (excVar2 != null) {
                excVar2.ud("success", this.qdl);
            }
        } catch (Throwable unused) {
        }
    }

    public void qdl(int i2, String str, Throwable th) {
        try {
            exc excVar = this.ud;
            if (excVar != null) {
                excVar.qdl(d9.h.t, this.qdl);
            }
            String strAaj = this.qdl.aaj();
            Map<String, List<lnr>> mapTvp = this.qdl.yt().tvp();
            List<lnr> list = mapTvp.get(strAaj);
            if (list == null) {
                jtx jtxVarJpc = this.qdl.jpc();
                if (jtxVarJpc != null) {
                    jtxVarJpc.qdl(i2, str, th);
                }
            } else {
                synchronized (list) {
                    try {
                        Iterator<lnr> it = list.iterator();
                        while (it.hasNext()) {
                            jtx jtxVarJpc2 = it.next().jpc();
                            if (jtxVarJpc2 != null) {
                                jtxVarJpc2.toString();
                                jtxVarJpc2.qdl(i2, str, th);
                            }
                        }
                        list.clear();
                        mapTvp.remove(strAaj);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            exc excVar2 = this.ud;
            if (excVar2 != null) {
                excVar2.ud(d9.h.t, this.qdl);
            }
        } catch (Throwable unused) {
        }
    }
}
