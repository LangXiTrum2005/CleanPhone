package saneness;

import ads_mobile_sdk.x23;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.BaseGmsClient;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class lunation extends BaseGmsClient {
    public lunation(x23 x23Var, Context context, Looper looper) {
        super(context, looper, 8, x23Var, x23Var, null);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder binder) {
        Intrinsics.checkNotNullParameter(binder, "binder");
        int i = speck.f37317dern;
        if (binder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof canonical ? (canonical) iInterfaceQueryLocalInterface : new ayutthaya(binder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int getMinApkVersion() {
        return 243300000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }
}
