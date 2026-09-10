package com.mbridge.msdk.mbnative.listener;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements NativeListener.NativeAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NativeListener.NativeAdListener f34772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34773b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f34775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f34776e;

    public a() {
    }

    public void a(boolean z10) {
        this.f34776e = z10;
    }

    public void b() {
        this.f34773b = true;
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdClick(Campaign campaign) {
        NativeListener.NativeAdListener nativeAdListener = this.f34772a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdClick(campaign);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdFramesLoaded(List<Frame> list) {
        NativeListener.NativeAdListener nativeAdListener = this.f34772a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdFramesLoaded(list);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoadError(String str) {
        this.f34773b = false;
        NativeListener.NativeAdListener nativeAdListener = this.f34772a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.f34775d == null) {
                this.f34775d = c.n().d();
            }
            if (TextUtils.isEmpty(this.f34774c)) {
                return;
            }
            com.mbridge.msdk.mbnative.report.a.a(this.f34775d, str, this.f34774c, this.f34776e, (CampaignEx) null);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoaded(List<Campaign> list, int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        try {
            this.f34773b = false;
            synchronized (list) {
                copyOnWriteArrayList = new CopyOnWriteArrayList(list);
            }
            if (this.f34772a != null) {
                if (copyOnWriteArrayList.size() > 0) {
                    this.f34772a.onAdLoaded(copyOnWriteArrayList, i10);
                } else {
                    this.f34772a.onAdLoaded(list, i10);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onLoggingImpression(int i10) {
        NativeListener.NativeAdListener nativeAdListener = this.f34772a;
        if (nativeAdListener != null) {
            nativeAdListener.onLoggingImpression(i10);
        }
    }

    public void a(String str) {
        this.f34774c = str;
    }

    public a(NativeListener.NativeAdListener nativeAdListener) {
        this.f34772a = nativeAdListener;
    }

    public boolean a() {
        return this.f34773b;
    }

    public void a(CampaignEx campaignEx, String str) {
        this.f34773b = false;
        NativeListener.NativeAdListener nativeAdListener = this.f34772a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.f34775d == null) {
                this.f34775d = c.n().d();
            }
            if (TextUtils.isEmpty(this.f34774c)) {
                return;
            }
            com.mbridge.msdk.mbnative.report.a.a(this.f34775d, str, this.f34774c, this.f34776e, campaignEx);
        }
    }
}
