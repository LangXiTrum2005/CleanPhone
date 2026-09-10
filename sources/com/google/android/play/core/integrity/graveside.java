package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class graveside implements adultoid {
    @Override // com.google.android.play.core.integrity.adultoid
    public final ApiException attabal(Bundle bundle) {
        int i = bundle.getInt("error");
        if (i == 0) {
            return null;
        }
        return new IntegrityServiceException(i, null);
    }
}
