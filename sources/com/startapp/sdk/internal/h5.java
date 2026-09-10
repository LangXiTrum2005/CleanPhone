package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class h5 implements j7 {
    @Override // com.startapp.sdk.internal.j7
    public final Object a(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        List list = (List) obj2;
        TrackingParams trackingParams = (TrackingParams) obj3;
        if (context == null || list == null) {
            return null;
        }
        return new e9(context, list, trackingParams, new g5());
    }
}
