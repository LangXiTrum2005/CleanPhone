package com.unity3d.services.core.request;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public interface IWebRequestProgressListener {
    void onRequestProgress(String str, long j10, long j11);

    void onRequestStart(String str, long j10, int i10, Map<String, List<String>> map);
}
