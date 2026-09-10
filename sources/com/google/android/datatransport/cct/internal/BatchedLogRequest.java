package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.annotations.Encodable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Encodable
public abstract class BatchedLogRequest {
    public static BatchedLogRequest a(ArrayList arrayList) {
        return new AutoValue_BatchedLogRequest(arrayList);
    }

    public abstract List b();
}
