package com.facebook.bolts;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/bolts/Continuation;", "TTaskResult", "TContinuationResult", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public interface Continuation<TTaskResult, TContinuationResult> {
    Object a(Task task);
}
