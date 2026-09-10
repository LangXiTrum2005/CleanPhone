package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class da implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7764a;

    public /* synthetic */ da(int i10) {
        this.f7764a = i10;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f7764a) {
            case 0:
                AppLovinSdkUtils.runOnUiThread(runnable);
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                break;
            default:
                q.a.L().f48509b.f48511c.execute(runnable);
                break;
        }
    }

    private final void a(Runnable runnable) {
    }
}
