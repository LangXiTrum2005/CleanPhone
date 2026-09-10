package com.thinkup.core.o0.o;

import android.text.TextUtils;
import com.thinkup.core.oo.om;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class n {
    List<o> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Map<Integer, List<o>> f42447n = new ConcurrentHashMap(3);
    om o;

    public final boolean m(om omVar) {
        om omVar2 = this.o;
        return omVar2 != null && omVar2.m() == omVar.m() && this.o.o() == omVar.o() && this.o.n() == omVar.n() && this.o.o0() == omVar.o0();
    }

    public final void n(int i2) {
        List<o> listO = o(i2);
        if (this.o == null || listO == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - (((long) (this.o.m() * 86400)) * 1000);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        Iterator<o> it = listO.iterator();
        while (it.hasNext()) {
            if (it.next().on() < timeInMillis) {
                it.remove();
            }
        }
    }

    public final void o(int i2, List<o> list) {
        if (i2 == -1) {
            this.m = list;
        } else {
            this.f42447n.put(Integer.valueOf(i2), list);
        }
    }

    public final List<o> o(int i2) {
        if (i2 == -1) {
            return this.m;
        }
        return this.f42447n.get(Integer.valueOf(i2));
    }

    public final void o(om omVar) {
        this.o = omVar;
    }

    private om o() {
        return this.o;
    }

    public final o0 m(int i2) {
        List<o> list;
        if (i2 == -1) {
            list = this.m;
        } else {
            list = this.f42447n.get(Integer.valueOf(i2));
        }
        if (list == null || list.size() < this.o.o0()) {
            return null;
        }
        double d = 0.0d;
        String strO0 = "";
        for (o oVar : list) {
            double dOm = oVar.om();
            if (dOm > d) {
                strO0 = oVar.o0();
                d = dOm;
            }
        }
        return new o0(d, strO0);
    }

    public final void o(o oVar) {
        if (this.o == null) {
            return;
        }
        List<o> list = this.m;
        if (list != null) {
            o(list, oVar);
        }
        List<o> list2 = this.f42447n.get(Integer.valueOf(oVar.o()));
        if (list2 != null) {
            o(list2, oVar);
        }
    }

    private void o(List<o> list, o oVar) {
        Iterator<o> it = list.iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                if (TextUtils.equals(it.next().m(), oVar.m())) {
                    list.set(i2, oVar);
                    break;
                }
                i2++;
            } else {
                list.add(0, oVar);
                break;
            }
        }
        while (list.size() > this.o.n()) {
            list.remove(list.size() - 1);
        }
    }
}
