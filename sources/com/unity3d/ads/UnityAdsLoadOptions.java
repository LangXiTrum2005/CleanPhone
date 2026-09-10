package com.unity3d.ads;

import com.unity3d.ads.core.data.model.LoadConfigurationInternal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class UnityAdsLoadOptions extends UnityAdsBaseOptions {
    private String AD_MARKUP = "adMarkup";
    public LoadConfigurationInternal loadConfiguration = null;

    public void setAdMarkup(String str) {
        set(this.AD_MARKUP, str);
    }
}
