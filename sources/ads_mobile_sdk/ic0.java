package ads_mobile_sdk;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.media3.common.PlaybackException;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ic0 extends Lambda implements Function0 {
    public final /* synthetic */ qc0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic0(qc0 qc0Var) {
        super(0);
        this.a = qc0Var;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33 && SdkExtensions.getExtensionVersion(33) >= 5) {
                return Integer.valueOf(SdkExtensions.getExtensionVersion(PlaybackException.CUSTOM_ERROR_CODE_BASE));
            }
            if (i >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                return Integer.valueOf(SdkExtensions.getExtensionVersion(31));
            }
            return 0;
        } catch (Exception e) {
            ((d13) this.a.d).a("DeviceProperties.adServicesExtensionVersion", e);
        }
    }
}
