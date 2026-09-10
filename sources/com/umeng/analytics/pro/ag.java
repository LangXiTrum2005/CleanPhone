package com.umeng.analytics.pro;

import com.umeng.commonsdk.debug.UMRTLog;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class ag implements ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<Integer> f2487a;

    public ag(Set<Integer> set) {
        this.f2487a = null;
        this.f2487a = new HashSet(set);
    }

    @Override // com.umeng.analytics.pro.ac
    public boolean a() {
        try {
            int i = Calendar.getInstance().get(11);
            Set<Integer> set = this.f2487a;
            if (set != null && set.contains(Integer.valueOf(i))) {
                return true;
            }
            String str = "";
            Iterator<Integer> it = this.f2487a.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
            UMRTLog.i(UMRTLog.RTLOG_TAG, "HourOn skipped. hour of day: " + i + "; config: " + str);
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.umeng.analytics.pro.ac
    public boolean b() {
        return !a();
    }

    @Override // com.umeng.analytics.pro.ac
    public long c() {
        return 0L;
    }
}
