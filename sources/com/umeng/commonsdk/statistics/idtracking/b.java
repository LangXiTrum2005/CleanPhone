package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: loaded from: classes3.dex */
public class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f2671a = "android_id";
    private Context b;

    public b(Context context) {
        super(f2671a);
        this.b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getAndroidId(this.b);
    }
}
