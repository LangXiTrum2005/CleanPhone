package com.adjust.sdk;

import android.content.Context;
import com.adjust.sdk.network.IActivityPackageSender;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface IPackageHandler {
    void addPackage(ActivityPackage activityPackage);

    void flush();

    void init(IActivityHandler iActivityHandler, Context context, boolean z10, IActivityPackageSender iActivityPackageSender);

    void pauseSending();

    void resumeSending();

    void sendFirstPackage();

    void teardown();
}
