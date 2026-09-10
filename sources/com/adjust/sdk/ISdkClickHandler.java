package com.adjust.sdk;

import com.adjust.sdk.network.IActivityPackageSender;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface ISdkClickHandler {
    void init(IActivityHandler iActivityHandler, boolean z10, IActivityPackageSender iActivityPackageSender);

    void pauseSending();

    void resumeSending();

    void sendPreinstallPayload(String str, String str2);

    void sendReftagReferrers();

    void sendSdkClick(ActivityPackage activityPackage);

    void teardown();
}
