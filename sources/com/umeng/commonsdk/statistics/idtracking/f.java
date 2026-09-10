package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: loaded from: classes3.dex */
public class f extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f2676a = "imei";
    private Context b;

    public f(Context context) {
        super(f2676a);
        this.b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getImeiNew(this.b);
    }
}
