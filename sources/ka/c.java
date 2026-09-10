package ka;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.InAppMessageResponseListener;
import com.android.billingclient.api.InAppMessageResult;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44535a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44536b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f44536b = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        int i11 = this.f44535a;
        Object obj = this.f44536b;
        switch (i11) {
            case 0:
                ((TaskCompletionSource) obj).trySetResult(null);
                break;
            default:
                InAppMessageResponseListener inAppMessageResponseListener = (InAppMessageResponseListener) obj;
                int i12 = u.f24478a;
                inAppMessageResponseListener.onInAppMessageResponse(bundle == null ? new InAppMessageResult(0, null) : new InAppMessageResult(bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN")));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.android.billingclient.api.a aVar, Handler handler, InAppMessageResponseListener inAppMessageResponseListener) {
        super(handler);
        this.f44536b = inAppMessageResponseListener;
    }
}
