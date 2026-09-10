package com.bytedance.sdk.component.lc.Lxb.Lxb;

import android.text.TextUtils;
import com.bytedance.sdk.component.lc.Lxb.OY;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends Lxb {
    private final lk LD;
    private final ZU Lxb;
    private final Queue<String> lk;

    public LD() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.lk = concurrentLinkedQueue;
        this.Lxb = new lc(concurrentLinkedQueue);
        this.LD = new lk();
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.ZU
    public synchronized void Lxb(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb, int i) {
        ZU zu;
        if (i != 5) {
            try {
                if (OY.ebl().VVE().Lxb(OY.ebl().lc()) && (zu = this.Lxb) != null && lxb != null) {
                    zu.Lxb(lxb, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        lk lkVar = this.LD;
        if (lkVar != null && lxb != null) {
            lkVar.Lxb(lxb, i);
        }
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.ZU
    public synchronized void Lxb(int i, List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list) {
        try {
            Iterator<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> it = list.iterator();
            while (it.hasNext()) {
                this.lk.remove(it.next().lk());
            }
            ZU zu = this.Lxb;
            if (zu != null) {
                zu.Lxb(i, list);
            }
            lk lkVar = this.LD;
            if (lkVar != null) {
                lkVar.Lxb(i, list);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.ZU
    public synchronized List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> Lxb(int i, int i2, List<String> list) {
        List list2;
        try {
            List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> listLxb = this.Lxb.Lxb(i, i2, list);
            if (listLxb != null && listLxb.size() != 0) {
                listLxb.size();
                if (i == 1 || i == 2) {
                    list2 = listLxb;
                    List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> listLD = this.LD.LD((com.bytedance.sdk.component.lc.Lxb.ZU.Lxb) listLxb.get(0), listLxb.size());
                    list2 = listLxb;
                    if (listLD != null && listLD.size() != 0) {
                        list2 = listLxb;
                        listLD.size();
                        HashMap map = new HashMap();
                        for (com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb : listLD) {
                            map.put(lxb.lk(), lxb);
                        }
                        ArrayList arrayList = new ArrayList(this.lk);
                        for (com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb2 : listLD) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (TextUtils.equals(lxb2.lk(), (String) it.next())) {
                                    map.remove(lxb2.lk());
                                    break;
                                }
                            }
                        }
                        for (com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb3 : listLxb) {
                            map.put(lxb3.lk(), lxb3);
                        }
                        listLxb.clear();
                        Iterator it2 = map.keySet().iterator();
                        while (it2.hasNext()) {
                            listLxb.add(map.get((String) it2.next()));
                        }
                        listLD.clear();
                        list2 = listLxb;
                    }
                }
            } else {
                ArrayList<String> arrayList2 = new ArrayList(this.lk);
                if (list != null && !list.isEmpty()) {
                    arrayList2.addAll(list);
                }
                List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> listLxb2 = this.LD.Lxb(i, i2, arrayList2);
                if (listLxb2 != null && listLxb2.size() != 0) {
                    HashMap map2 = new HashMap();
                    for (com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb4 : listLxb2) {
                        map2.put(lxb4.lk(), lxb4);
                    }
                    arrayList2.size();
                    if (arrayList2.size() != 0) {
                        for (String str : arrayList2) {
                            if (map2.get(str) != null) {
                                map2.remove(str);
                            }
                        }
                    }
                    listLxb2.clear();
                    Iterator it3 = map2.keySet().iterator();
                    while (it3.hasNext()) {
                        listLxb2.add(map2.get((String) it3.next()));
                    }
                }
                list2 = listLxb2;
            }
            if (list2 != null && !list2.isEmpty()) {
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    this.lk.offer(((com.bytedance.sdk.component.lc.Lxb.ZU.Lxb) it4.next()).lk());
                }
                return list2;
            }
            return new ArrayList();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.ZU
    public synchronized boolean Lxb(int i, boolean z) {
        if (this.Lxb.Lxb(i, z)) {
            com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.xan(), 1);
            return true;
        }
        if ((i != 1 && i != 2) || !this.LD.Lxb(i, z)) {
            return false;
        }
        com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.hg(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.ZU
    public void Lxb(int i, long j) {
        this.LD.Lxb(i, j);
        this.Lxb.Lxb(i, j);
    }
}
