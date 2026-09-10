package com.unity3d.ads.metadata;

import android.content.Context;
import com.unity3d.services.core.device.StorageManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class MediationMetaData extends MetaData {
    public static final String KEY_MISSED_IMPRESSION_ORDINAL = "missedImpressionOrdinal";
    public static final String KEY_NAME = "name";
    public static final String KEY_ORDINAL = "ordinal";
    public static final String KEY_VERSION = "version";

    public MediationMetaData(Context context) {
        super(context);
        setCategory("mediation");
    }

    @Override // com.unity3d.ads.metadata.MetaData
    public StorageManager.StorageType getStorageType() {
        return StorageManager.StorageType.MEMORY;
    }

    public void setMissedImpressionOrdinal(int i10) {
        set(KEY_MISSED_IMPRESSION_ORDINAL, Integer.valueOf(i10));
    }

    public void setName(String str) {
        set("name", str);
    }

    public void setOrdinal(int i10) {
        set(KEY_ORDINAL, Integer.valueOf(i10));
    }

    public void setVersion(String str) {
        set("version", str);
    }
}
