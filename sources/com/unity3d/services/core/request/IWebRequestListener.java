package com.unity3d.services.core.request;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public interface IWebRequestListener {
    void onComplete(String str, String str2, int i10, Map<String, List<String>> map);

    void onFailed(String str, String str2);
}
