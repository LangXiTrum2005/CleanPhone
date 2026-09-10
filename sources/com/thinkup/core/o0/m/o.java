package com.thinkup.core.o0.m;

import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    oo m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f42438n = "o";
    Map<String, com.thinkup.core.o0.o.n> o = new ConcurrentHashMap();

    public o(oo ooVar) {
        this.m = ooVar;
    }

    private com.thinkup.core.o0.o.o0 o(String str, int i2, com.thinkup.core.oo.om omVar) {
        com.thinkup.core.o0.o.n nVar = this.o.get(str);
        int i3 = omVar.o() == 1 ? i2 : -1;
        if (nVar == null || !nVar.m(omVar) || nVar.o(i3) == null) {
            nVar = new com.thinkup.core.o0.o.n();
            nVar.o(omVar);
            int iN = omVar.n();
            long jCurrentTimeMillis = System.currentTimeMillis() - (((long) (omVar.m() * 86400)) * 1000);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jCurrentTimeMillis);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            nVar.o(i3, this.m.o(str, i3, calendar.getTimeInMillis(), iN));
            this.o.put(str, nVar);
        } else {
            nVar.n(i2);
        }
        return nVar.m(i3);
    }

    private void o(String str, com.thinkup.core.o0.o.o oVar) {
        com.thinkup.core.o0.o.n nVar = this.o.get(str);
        oVar.o();
        oVar.toString();
        if (nVar != null) {
            nVar.o(oVar);
        }
    }

    private List<com.thinkup.core.o0.o.o> o(String str, int i2, com.thinkup.core.oo.om omVar, int i3) {
        long jCurrentTimeMillis = System.currentTimeMillis() - (((long) (omVar.m() * 86400)) * 1000);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return this.m.o(str, i2, calendar.getTimeInMillis(), i3);
    }
}
