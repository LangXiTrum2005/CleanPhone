package com.bytedance.sdk.component.mo.qdl.qdl;

import android.text.TextUtils;
import com.bytedance.sdk.component.mo.qdl.jpc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public class ud extends qdl {
    private final Queue<String> lnr;
    private final mml qdl;
    private final lnr ud;

    public ud() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.lnr = concurrentLinkedQueue;
        this.qdl = new mo(concurrentLinkedQueue);
        this.ud = new lnr();
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mml
    public synchronized void qdl(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar, int i2) {
        mml mmlVar;
        if (i2 != 5) {
            try {
                if (jpc.wd().jtx().qdl(jpc.wd().mo()) && (mmlVar = this.qdl) != null && qdlVar != null) {
                    mmlVar.qdl(qdlVar, i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        lnr lnrVar = this.ud;
        if (lnrVar != null && qdlVar != null) {
            lnrVar.qdl(qdlVar, i2);
        }
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mml
    public synchronized void qdl(int i2, List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list) {
        try {
            Iterator<com.bytedance.sdk.component.mo.qdl.mml.qdl> it = list.iterator();
            while (it.hasNext()) {
                this.lnr.remove(it.next().lnr());
            }
            mml mmlVar = this.qdl;
            if (mmlVar != null) {
                mmlVar.qdl(i2, list);
            }
            lnr lnrVar = this.ud;
            if (lnrVar != null) {
                lnrVar.qdl(i2, list);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mml
    public synchronized List<com.bytedance.sdk.component.mo.qdl.mml.qdl> qdl(int i2, int i3, List<String> list) {
        List list2;
        try {
            List<com.bytedance.sdk.component.mo.qdl.mml.qdl> listQdl = this.qdl.qdl(i2, i3, list);
            if (listQdl != null && listQdl.size() != 0) {
                listQdl.size();
                if (i2 == 1 || i2 == 2) {
                    list2 = listQdl;
                    List<com.bytedance.sdk.component.mo.qdl.mml.qdl> listUd = this.ud.ud((com.bytedance.sdk.component.mo.qdl.mml.qdl) listQdl.get(0), listQdl.size());
                    list2 = listQdl;
                    if (listUd != null && listUd.size() != 0) {
                        list2 = listQdl;
                        listUd.size();
                        HashMap map = new HashMap();
                        for (com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar : listUd) {
                            map.put(qdlVar.lnr(), qdlVar);
                        }
                        ArrayList arrayList = new ArrayList(this.lnr);
                        for (com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar2 : listUd) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (TextUtils.equals(qdlVar2.lnr(), (String) it.next())) {
                                    map.remove(qdlVar2.lnr());
                                    break;
                                }
                            }
                        }
                        for (com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar3 : listQdl) {
                            map.put(qdlVar3.lnr(), qdlVar3);
                        }
                        listQdl.clear();
                        Iterator it2 = map.keySet().iterator();
                        while (it2.hasNext()) {
                            listQdl.add(map.get((String) it2.next()));
                        }
                        listUd.clear();
                        list2 = listQdl;
                    }
                }
            } else {
                ArrayList<String> arrayList2 = new ArrayList(this.lnr);
                if (list != null && !list.isEmpty()) {
                    arrayList2.addAll(list);
                }
                List<com.bytedance.sdk.component.mo.qdl.mml.qdl> listQdl2 = this.ud.qdl(i2, i3, arrayList2);
                if (listQdl2 != null && listQdl2.size() != 0) {
                    HashMap map2 = new HashMap();
                    for (com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar4 : listQdl2) {
                        map2.put(qdlVar4.lnr(), qdlVar4);
                    }
                    arrayList2.size();
                    if (arrayList2.size() != 0) {
                        for (String str : arrayList2) {
                            if (map2.get(str) != null) {
                                map2.remove(str);
                            }
                        }
                    }
                    listQdl2.clear();
                    Iterator it3 = map2.keySet().iterator();
                    while (it3.hasNext()) {
                        listQdl2.add(map2.get((String) it3.next()));
                    }
                }
                list2 = listQdl2;
            }
            if (list2 != null && !list2.isEmpty()) {
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    this.lnr.offer(((com.bytedance.sdk.component.mo.qdl.mml.qdl) it4.next()).lnr());
                }
                return list2;
            }
            return new ArrayList();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mml
    public synchronized boolean qdl(int i2, boolean z2) {
        if (this.qdl.qdl(i2, z2)) {
            com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.kdv(), 1);
            return true;
        }
        if ((i2 != 1 && i2 != 2) || !this.ud.qdl(i2, z2)) {
            return false;
        }
        com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.ekw(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mml
    public void qdl(int i2, long j) {
        this.ud.qdl(i2, j);
        this.qdl.qdl(i2, j);
    }
}
