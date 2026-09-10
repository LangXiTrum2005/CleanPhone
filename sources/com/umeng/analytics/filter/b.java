package com.umeng.analytics.filter;

import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;

/* JADX INFO: loaded from: classes3.dex */
public class b extends EventList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f2478a;
    private Object b;

    public b(String str, String str2) {
        super(str, str2);
        this.b = new Object();
    }

    @Override // com.umeng.analytics.filter.EventList
    public void eventListChange() {
        if (TextUtils.isEmpty(this.mEventList)) {
            return;
        }
        synchronized (this.b) {
            this.f2478a = null;
            this.f2478a = new d(true, this.mEventList);
        }
    }

    @Override // com.umeng.analytics.filter.EventList
    public boolean matchHit(String str) {
        boolean zA;
        if (TextUtils.isEmpty(this.mEventList)) {
            return true;
        }
        synchronized (this.b) {
            try {
                if (this.f2478a == null) {
                    this.f2478a = new d(true, this.mEventList);
                }
                zA = this.f2478a.a(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zA;
    }

    @Override // com.umeng.analytics.filter.EventList
    public void setMD5ClearFlag(boolean z) {
        AnalyticsConfig.CLEAR_EKV_WL = z;
    }
}
