package com.smartdigimkt.k3;

import android.content.Context;
import com.smartdigimkt.sdk.api.IExHandlerBaseAd;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes.dex */
public class b implements IExHandlerBaseAd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f36167b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IExHandlerBaseAd f36168a;

    public static abstract class a implements IExHandlerBaseAd.DataFetchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f f36169a;

        public a(f fVar) {
            this.f36169a = fVar;
        }

        @Override // com.smartdigimkt.sdk.api.IExHandlerBaseAd.DataFetchListener
        public f getBaseAdContent() {
            return this.f36169a;
        }
    }

    private b() {
        com.smartdigimkt.s6.c cVarB = com.smartdigimkt.m6.b.p().b();
        if (cVarB != null) {
            this.f36168a = cVarB.getBaseAdHandler();
        }
    }

    public static b a() {
        if (f36167b == null) {
            synchronized (b.class) {
                try {
                    if (f36167b == null) {
                        f36167b = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f36167b;
    }

    @Override // com.smartdigimkt.sdk.api.IExHandlerBaseAd
    public void addDataFetchListener(IExHandlerBaseAd.DataFetchListener dataFetchListener) {
        IExHandlerBaseAd iExHandlerBaseAd = this.f36168a;
        if (iExHandlerBaseAd == null || dataFetchListener == null) {
            return;
        }
        iExHandlerBaseAd.addDataFetchListener(dataFetchListener);
    }

    @Override // com.smartdigimkt.sdk.api.IExHandlerBaseAd
    public void onAdxAdDestroy(Context context) {
        IExHandlerBaseAd iExHandlerBaseAd = this.f36168a;
        if (iExHandlerBaseAd != null) {
            iExHandlerBaseAd.onAdxAdDestroy(context);
        }
    }

    @Override // com.smartdigimkt.sdk.api.IExHandlerBaseAd
    public void pause(f fVar) {
        IExHandlerBaseAd iExHandlerBaseAd = this.f36168a;
        if (iExHandlerBaseAd == null || fVar == null) {
            return;
        }
        iExHandlerBaseAd.pause(fVar);
    }

    @Override // com.smartdigimkt.sdk.api.IExHandlerBaseAd
    public void removeDataFetchListener(IExHandlerBaseAd.DataFetchListener dataFetchListener) {
        IExHandlerBaseAd iExHandlerBaseAd = this.f36168a;
        if (iExHandlerBaseAd == null || dataFetchListener == null) {
            return;
        }
        iExHandlerBaseAd.removeDataFetchListener(dataFetchListener);
    }

    @Override // com.smartdigimkt.sdk.api.IExHandlerBaseAd
    public void updateOfferInfoWithDataInfo(f fVar) {
        IExHandlerBaseAd iExHandlerBaseAd = this.f36168a;
        if (iExHandlerBaseAd == null || fVar == null) {
            return;
        }
        iExHandlerBaseAd.updateOfferInfoWithDataInfo(fVar);
    }
}
