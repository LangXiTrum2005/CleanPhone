package com.mbridge.msdk.scheme.applet;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface IAppletSchemeCallBack extends Serializable {
    void onAppletSchemeRequestFailed(int i10, String str, String str2);

    void onAppletSchemeRequestStart();

    void onAppletSchemeRequestSuccess(String str);

    void onNetworkError(int i10, String str, String str2);
}
