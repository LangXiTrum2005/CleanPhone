package com.efs.sdk.pa;

/* JADX INFO: loaded from: classes2.dex */
public interface PATraceListener {
    void onAnrTrace();

    void onCheck(boolean z);

    void onUnexcept(Object obj);
}
