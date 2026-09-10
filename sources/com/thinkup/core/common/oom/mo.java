package com.thinkup.core.common.oom;

import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.on0;
import com.thinkup.core.common.ooo.mn;
import com.thinkup.core.common.ooo.nn;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class mo {
    private List<o0mm> o;

    public mo(List<o0mm> list) {
        ArrayList arrayList = new ArrayList();
        this.o = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    private static double m(o0mm o0mmVar) {
        if (o0mmVar.omnm() == 2) {
            return 0.0d;
        }
        return nn.o(o0mmVar);
    }

    public final synchronized List<o0mm> o() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.o);
        return arrayList;
    }

    public final synchronized void o(o0mm o0mmVar) {
        List<o0mm> list = this.o;
        if (list != null) {
            if (list.size() == 0) {
                o0mmVar.mom(0);
                this.o.add(o0mmVar);
                o(o0mmVar, 0, null);
                return;
            }
            for (int i2 = 0; i2 < this.o.size(); i2++) {
                o0mm o0mmVar2 = this.o.get(i2);
                if (mn.o(o0mmVar, o0mmVar2) < 0) {
                    o0mmVar.mom(i2);
                    this.o.add(i2, o0mmVar);
                    o(o0mmVar, i2, o0mmVar2);
                    int i3 = i2 + 1;
                    List<o0mm> list2 = this.o;
                    if (list2 != null && i3 < list2.size()) {
                        while (i3 < list2.size()) {
                            o0mm o0mmVar3 = list2.get(i3);
                            if (o0mmVar3 != null) {
                                o0mmVar3.mom(i3);
                            }
                            i3++;
                        }
                    }
                    return;
                }
            }
            o0mmVar.mom(this.o.size());
            this.o.add(o0mmVar);
            o(o0mmVar, this.o.size() - 1, null);
        }
    }

    private static void o(int i2, List<o0mm> list) {
        if (list != null && i2 < list.size()) {
            while (i2 < list.size()) {
                o0mm o0mmVar = list.get(i2);
                if (o0mmVar != null) {
                    o0mmVar.mom(i2);
                }
                i2++;
            }
        }
    }

    private void o(o0mm o0mmVar, int i2, o0mm o0mmVar2) {
        on0 on0VarN0n;
        on0 on0VarN0n2;
        if (o0mmVar.oom() && (on0VarN0n2 = o0mmVar.n0n()) != null) {
            if (o0mmVar2 != null) {
                on0VarN0n2.o(o0mmVar2, nn.o(o0mmVar2));
            } else {
                on0VarN0n2.o(o0mmVar, m(o0mmVar));
            }
        }
        if (i2 > 0) {
            o0mm o0mmVar3 = this.o.get(i2 - 1);
            if (!o0mmVar3.oom() || (on0VarN0n = o0mmVar3.n0n()) == null) {
                return;
            }
            on0VarN0n.o(o0mmVar, nn.o(o0mmVar));
        }
    }
}
