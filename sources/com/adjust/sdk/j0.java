package com.adjust.sdk;

import android.content.Context;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends AsyncTaskExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6865b;

    public /* synthetic */ j0(Object obj, int i10) {
        this.f6864a = i10;
        this.f6865b = obj;
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final Object doInBackground(Object[] objArr) {
        switch (this.f6864a) {
            case 0:
                return Util.getSdkVersion();
            case 1:
                return Boolean.valueOf(Util.isEnabledFromActivityStateFile(((Context[]) objArr)[0]));
            default:
                ILogger logger = AdjustFactory.getLogger();
                String googleAdId = Util.getGoogleAdId(((Context[]) objArr)[0]);
                logger.debug(defpackage.e.n("GoogleAdId read ", googleAdId), new Object[0]);
                return googleAdId;
        }
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final void onPostExecute(Object obj) {
        switch (this.f6864a) {
            case 0:
                ((OnSdkVersionReadListener) this.f6865b).onSdkVersionRead((String) obj);
                break;
            case 1:
                ((OnIsEnabledListener) this.f6865b).onIsEnabledRead(((Boolean) obj).booleanValue());
                break;
            default:
                String str = (String) obj;
                OnGoogleAdIdReadListener onGoogleAdIdReadListener = (OnGoogleAdIdReadListener) this.f6865b;
                if (onGoogleAdIdReadListener != null) {
                    onGoogleAdIdReadListener.onGoogleAdIdRead(str);
                }
                break;
        }
    }
}
