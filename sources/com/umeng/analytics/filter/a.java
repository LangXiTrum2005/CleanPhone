package com.umeng.analytics.filter;

import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;

/* JADX INFO: loaded from: classes3.dex */
public class a extends EventList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f2477a;
    private Object b;

    public a(String str, String str2) {
        super(str, str2);
        this.b = new Object();
    }

    @Override // com.umeng.analytics.filter.EventList
    public void eventListChange() {
        if (TextUtils.isEmpty(this.mEventList)) {
            return;
        }
        synchronized (this.b) {
            this.f2477a = null;
            this.f2477a = new d(false, this.mEventList);
        }
    }

    @Override // com.umeng.analytics.filter.EventList
    public boolean matchHit(String str) {
        boolean zA;
        if (TextUtils.isEmpty(this.mEventList)) {
            return false;
        }
        synchronized (this.b) {
            try {
                if (this.f2477a == null) {
                    this.f2477a = new d(false, this.mEventList);
                }
                zA = this.f2477a.a(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zA;
    }

    @Override // com.umeng.analytics.filter.EventList
    public void setMD5ClearFlag(boolean z) {
        AnalyticsConfig.CLEAR_EKV_BL = z;
    }
}
