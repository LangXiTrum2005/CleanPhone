package com.applovin.impl;

import android.content.Context;
import com.amazon.aps.ads.Aps;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.mediation.MaxAdFormat;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0968w implements DTBAdCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxAdFormat f11981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f11982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DTBAdRequest f11983c;

    /* JADX INFO: renamed from: com.applovin.impl.w$a */
    public interface a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public C0968w(C0970x c0970x, MaxAdFormat maxAdFormat, Context context, a aVar) {
        this(Arrays.asList(c0970x.a()), maxAdFormat, context, aVar);
    }

    public void a() {
        DTBAdRequest dTBAdRequest = this.f11983c;
        if (dTBAdRequest == null) {
            this.f11982b.onAdLoadFailed(null, this.f11981a);
        } else {
            dTBAdRequest.loadAd(this);
        }
    }

    public void onFailure(AdError adError) {
        this.f11982b.onAdLoadFailed(adError, this.f11981a);
    }

    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.f11982b.onAdResponseLoaded(dTBAdResponse, this.f11981a);
    }

    public C0968w(List list, MaxAdFormat maxAdFormat, Context context, a aVar) {
        this.f11981a = maxAdFormat;
        this.f11982b = aVar;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                Object obj = list.get(i2);
                if (obj instanceof DTBAdSize) {
                    dTBAdSizeArr[i2] = (DTBAdSize) obj;
                }
            }
            if (n7.a(Aps.getSdkVersion(), "10.0.0") >= 0) {
                Class<?> cls = Class.forName("com.amazon.aps.ads.model.ApsAdNetwork");
                Class<?> cls2 = Class.forName("com.amazon.device.ads.DTBAdNetworkInfo");
                this.f11983c = (DTBAdRequest) DTBAdRequest.class.getConstructor(Context.class, cls2).newInstance(context.getApplicationContext(), cls2.getConstructor(cls).newInstance(cls.getField("MAX").get(null)));
            } else {
                this.f11983c = (DTBAdRequest) DTBAdRequest.class.getConstructor(null).newInstance(null);
            }
            this.f11983c.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }
}
