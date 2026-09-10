package com.adjust.sdk.network;

import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements UtilNetworking.IConnectionOptions {
    @Override // com.adjust.sdk.network.UtilNetworking.IConnectionOptions
    public final void applyConnectionOptions(HttpsURLConnection httpsURLConnection, String str, int i10) {
        httpsURLConnection.setRequestProperty("Client-SDK", str);
        httpsURLConnection.setConnectTimeout(i10);
        httpsURLConnection.setReadTimeout(i10);
    }
}
