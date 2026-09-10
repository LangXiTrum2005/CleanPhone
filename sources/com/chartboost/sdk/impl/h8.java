package com.chartboost.sdk.impl;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h8 extends e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f14099b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(Context context) {
        super(context);
        Intrinsics.f(context, "context");
        this.f14099b = context;
    }

    public d1 b() {
        String str = null;
        if (a()) {
            return new d1(kh.TRACKING_LIMITED, null);
        }
        kh khVar = kh.TRACKING_UNKNOWN;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f14099b);
            if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                khVar = kh.TRACKING_LIMITED;
            } else {
                khVar = kh.TRACKING_ENABLED;
                String id = advertisingIdInfo.getId();
                try {
                    if ("00000000-0000-0000-0000-000000000000".equals(id)) {
                        khVar = kh.TRACKING_LIMITED;
                    } else {
                        str = id;
                    }
                } catch (GooglePlayServicesNotAvailableException e2) {
                    e = e2;
                    str = id;
                    za.b("Google play service is not available.", e);
                } catch (GooglePlayServicesRepairableException e3) {
                    e = e3;
                    str = id;
                    za.b("There was a recoverable error connecting to Google Play Services.", e);
                } catch (IOException e4) {
                    e = e4;
                    str = id;
                    za.b("The connection to Google Play Services failed.", e);
                } catch (IllegalStateException e5) {
                    e = e5;
                    str = id;
                    za.b("This should have been called off the main thread.", e);
                }
            }
        } catch (GooglePlayServicesNotAvailableException e6) {
            e = e6;
        } catch (GooglePlayServicesRepairableException e7) {
            e = e7;
        } catch (IOException e8) {
            e = e8;
        } catch (IllegalStateException e9) {
            e = e9;
        }
        return new d1(khVar, str);
    }
}
