package com.bytedance.sdk.component.di.ri.ri;

import android.text.TextUtils;
import com.bytedance.sdk.component.di.ri.xha;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ri {
    private final Queue<String> ik;
    private final ik lr;
    private final ka ri;

    public lr() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.ik = concurrentLinkedQueue;
        this.ri = new di(concurrentLinkedQueue);
        this.lr = new ik();
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ka
    public synchronized void ri(com.bytedance.sdk.component.di.ri.ka.ri riVar, int i) {
        ka kaVar;
        if (i != 5) {
            try {
                if (xha.di().vr().ri(xha.di().fi()) && (kaVar = this.ri) != null && riVar != null) {
                    kaVar.ri(riVar, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ik ikVar = this.lr;
        if (ikVar != null && riVar != null) {
            ikVar.ri(riVar, i);
        }
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ka
    public synchronized void ri(int i, List<com.bytedance.sdk.component.di.ri.ka.ri> list) {
        try {
            Iterator<com.bytedance.sdk.component.di.ri.ka.ri> it = list.iterator();
            while (it.hasNext()) {
                this.ik.remove(it.next().ik());
            }
            ka kaVar = this.ri;
            if (kaVar != null) {
                kaVar.ri(i, list);
            }
            ik ikVar = this.lr;
            if (ikVar != null) {
                ikVar.ri(i, list);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.di.ri.ri.ka
    public synchronized List<com.bytedance.sdk.component.di.ri.ka.ri> ri(int i, int i2, List<String> list) {
        List list2;
        try {
            List<com.bytedance.sdk.component.di.ri.ka.ri> listRi = this.ri.ri(i, i2, list);
            if (listRi != null && listRi.size() != 0) {
                listRi.size();
                if (i == 1 || i == 2) {
                    list2 = listRi;
                    List<com.bytedance.sdk.component.di.ri.ka.ri> listLr = this.lr.lr((com.bytedance.sdk.component.di.ri.ka.ri) listRi.get(0), listRi.size());
                    list2 = listRi;
                    if (listLr != null && listLr.size() != 0) {
                        list2 = listRi;
                        listLr.size();
                        HashMap map = new HashMap();
                        for (com.bytedance.sdk.component.di.ri.ka.ri riVar : listLr) {
                            map.put(riVar.ik(), riVar);
                        }
                        ArrayList arrayList = new ArrayList(this.ik);
                        for (com.bytedance.sdk.component.di.ri.ka.ri riVar2 : listLr) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (TextUtils.equals(riVar2.ik(), (String) it.next())) {
                                    map.remove(riVar2.ik());
                                    break;
                                }
                            }
                        }
                        for (com.bytedance.sdk.component.di.ri.ka.ri riVar3 : listRi) {
                            map.put(riVar3.ik(), riVar3);
                        }
                        listRi.clear();
                        Iterator it2 = map.keySet().iterator();
                        while (it2.hasNext()) {
                            listRi.add(map.get((String) it2.next()));
                        }
                        listLr.clear();
                        list2 = listRi;
                    }
                }
            } else {
                ArrayList<String> arrayList2 = new ArrayList(this.ik);
                if (list != null && !list.isEmpty()) {
                    arrayList2.addAll(list);
                }
                List<com.bytedance.sdk.component.di.ri.ka.ri> listRi2 = this.lr.ri(i, i2, arrayList2);
                if (listRi2 != null && listRi2.size() != 0) {
                    HashMap map2 = new HashMap();
                    for (com.bytedance.sdk.component.di.ri.ka.ri riVar4 : listRi2) {
                        map2.put(riVar4.ik(), riVar4);
                    }
                    arrayList2.size();
                    if (arrayList2.size() != 0) {
                        for (String str : arrayList2) {
                            if (map2.get(str) != null) {
                                map2.remove(str);
                            }
                        }
                    }
                    listRi2.clear();
                    Iterator it3 = map2.keySet().iterator();
                    while (it3.hasNext()) {
                        listRi2.add(map2.get((String) it3.next()));
                    }
                }
                list2 = listRi2;
            }
            if (list2 != null && !list2.isEmpty()) {
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    this.ik.offer(((com.bytedance.sdk.component.di.ri.ka.ri) it4.next()).ik());
                }
                return list2;
            }
            return new ArrayList();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ka
    public synchronized boolean ri(int i, boolean z) {
        if (this.ri.ri(i, z)) {
            com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.hcw(), 1);
            return true;
        }
        if ((i != 1 && i != 2) || !this.lr.ri(i, z)) {
            return false;
        }
        com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.oh(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ka
    public void ri(int i, long j) {
        this.lr.ri(i, j);
        this.ri.ri(i, j);
    }
}
