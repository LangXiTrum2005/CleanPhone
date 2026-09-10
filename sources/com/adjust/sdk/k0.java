package com.adjust.sdk;

import android.content.Context;
import android.net.Uri;
import com.adjust.sdk.meta.MetaInstallReferrerDetails;
import com.adjust.sdk.meta.MetaInstallReferrerResult;
import com.adjust.sdk.meta.MetaReferrerClient;
import com.adjust.sdk.meta.OnMetaInstallReferrerReadListener;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends AsyncTaskExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6869a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6872d;

    public k0(AdjustInstance adjustInstance, Context context, OnLastDeeplinkReadListener onLastDeeplinkReadListener) {
        this.f6872d = adjustInstance;
        this.f6870b = context;
        this.f6871c = onLastDeeplinkReadListener;
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final Object doInBackground(Object[] objArr) {
        switch (this.f6869a) {
            case 0:
                try {
                    return Uri.parse(((AdjustInstance) this.f6872d).getCachedDeeplink(this.f6870b));
                } catch (Exception unused) {
                    return null;
                }
            default:
                try {
                    return MetaReferrerClient.getMetaInstallReferrer(this.f6870b, (String) this.f6871c, AdjustFactory.getLogger(), false);
                } catch (Exception e10) {
                    return new MetaInstallReferrerResult(e10.getMessage());
                }
        }
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final void onPostExecute(Object obj) {
        switch (this.f6869a) {
            case 0:
                ((OnLastDeeplinkReadListener) this.f6871c).onLastDeeplinkRead((Uri) obj);
                break;
            default:
                MetaInstallReferrerResult metaInstallReferrerResult = (MetaInstallReferrerResult) obj;
                OnMetaInstallReferrerReadListener onMetaInstallReferrerReadListener = (OnMetaInstallReferrerReadListener) this.f6872d;
                if (metaInstallReferrerResult == null) {
                    onMetaInstallReferrerReadListener.onFail("Meta Install Referrer result null");
                } else {
                    MetaInstallReferrerDetails metaInstallReferrerDetails = metaInstallReferrerResult.metaInstallReferrerDetails;
                    if (metaInstallReferrerDetails == null) {
                        String str = metaInstallReferrerResult.error;
                        if (str == null) {
                            onMetaInstallReferrerReadListener.onFail("Meta Install Referrer details null");
                        } else {
                            onMetaInstallReferrerReadListener.onFail(str);
                        }
                    } else {
                        onMetaInstallReferrerReadListener.onInstallReferrerDetailsRead(metaInstallReferrerDetails);
                    }
                }
                break;
        }
    }

    public k0(Context context, String str, OnMetaInstallReferrerReadListener onMetaInstallReferrerReadListener) {
        this.f6870b = context;
        this.f6871c = str;
        this.f6872d = onMetaInstallReferrerReadListener;
    }
}
