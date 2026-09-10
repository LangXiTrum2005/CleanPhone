package com.p004ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.mediationsdk.impressionData.ImpressionData;
import com.p004ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/ironsource/jm;", "Lcom/ironsource/mediationsdk/impressionData/ImpressionDataListener;", "Lcom/ironsource/mediationsdk/impressionData/ImpressionData;", "impressionData", "", "onImpressionSuccess", "", "hashCode", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Lcom/unity3d/mediation/impression/LevelPlayImpressionDataListener;", "a", "Lcom/unity3d/mediation/impression/LevelPlayImpressionDataListener;", "()Lcom/unity3d/mediation/impression/LevelPlayImpressionDataListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/unity3d/mediation/impression/LevelPlayImpressionDataListener;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class jm implements ImpressionDataListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LevelPlayImpressionDataListener listener;

    public jm(LevelPlayImpressionDataListener listener) {
        Intrinsics.f(listener, "listener");
        this.listener = listener;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LevelPlayImpressionDataListener getListener() {
        return this.listener;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof jm) {
            return Intrinsics.a(this.listener, ((jm) other).listener);
        }
        return false;
    }

    public int hashCode() {
        return this.listener.hashCode();
    }

    @Override // com.p004ironsource.mediationsdk.impressionData.ImpressionDataListener
    public void onImpressionSuccess(ImpressionData impressionData) {
        Intrinsics.f(impressionData, "impressionData");
        if (impressionData.getAllData() != null) {
            JSONObject allData = impressionData.getAllData();
            Intrinsics.e(allData, "impressionData.allData");
            this.listener.onImpressionSuccess(new LevelPlayImpressionData(allData));
        }
    }
}
