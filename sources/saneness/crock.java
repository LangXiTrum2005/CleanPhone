package saneness;

import ads_mobile_sdk.ik;
import ads_mobile_sdk.ll2;
import ads_mobile_sdk.sj0;
import ads_mobile_sdk.yf;
import android.content.Context;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class crock extends ik {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crock(Context context, sj0 flagDataStore, ll2 sdkCoreDataStore, yf appSettingsDataStore) {
        super(context, flagDataStore, sdkCoreDataStore, appSettingsDataStore);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flagDataStore, "flagDataStore");
        Intrinsics.checkNotNullParameter(sdkCoreDataStore, "sdkCoreDataStore");
        Intrinsics.checkNotNullParameter(appSettingsDataStore, "appSettingsDataStore");
    }
}
