package com.appsflyer.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class AFh1eSDK extends AFh1mSDK {
    @Override // com.appsflyer.internal.AFh1mSDK
    public final AFe1pSDK AFAdRevenueData() {
        return this.component4 == 1 ? AFe1pSDK.CONVERSION : AFe1pSDK.LAUNCH;
    }

    @Override // com.appsflyer.internal.AFh1mSDK
    public final boolean areAllFieldsValid() {
        return true;
    }
}
