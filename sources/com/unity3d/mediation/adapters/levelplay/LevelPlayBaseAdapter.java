package com.unity3d.mediation.adapters.levelplay;

import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdaptiveInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterTestModeInterface;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class LevelPlayBaseAdapter extends BaseAdapter implements AdapterMetaDataInterface, AdapterAdaptiveInterface, AdapterTestModeInterface {
    private boolean mAdapterDebug;

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdaptiveInterface
    public int getAdaptiveHeight(int i10) {
        return -1;
    }

    public boolean isAdaptersDebugEnabled() {
        return this.mAdapterDebug;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.BaseAdapter, com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface
    public void setAdapterDebug(boolean z10) {
        this.mAdapterDebug = z10;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterTestModeInterface
    public void setTestMode(boolean z10) {
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface
    public void setMetaData(String str, List<String> list) {
    }
}
