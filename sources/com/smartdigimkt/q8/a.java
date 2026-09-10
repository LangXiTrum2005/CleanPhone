package com.smartdigimkt.q8;

import com.p004ironsource.sv;
import com.smartdigimkt.sdk.api.AdError;

/* JADX INFO: loaded from: classes6.dex */
public class a implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f37948b = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.smartdigimkt.y4.c f37949a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    public static void a(d dVar, String str, String str2, AdError adError) {
        if (dVar == null) {
            return;
        }
        try {
            switch (str) {
                case "request_result":
                    if ("success".equals(str2)) {
                        dVar.onAdLoaded();
                        break;
                    } else {
                        if ("fail".equals(str2)) {
                            dVar.onAdLoadFail(adError);
                            if (adError instanceof com.smartdigimkt.v7.a) {
                                com.smartdigimkt.n8.n.a(((com.smartdigimkt.v7.a) adError).a(), com.smartdigimkt.m6.a.r.f36790b, "fail", adError.getErrorInfo());
                            }
                        } else if ("timeout".equals(str2)) {
                            dVar.onAdLoadTimeout();
                        }
                        break;
                    }
                    break;
                case "show_failed":
                    dVar.a(adError);
                    break;
                case "click":
                    dVar.onAdClick();
                    break;
                case "close":
                    dVar.onAdClose();
                    break;
                case "rewarded":
                    dVar.onAdReward();
                    break;
                case "impression":
                    dVar.onAdShow();
                    break;
                case "play_start":
                    dVar.onAdPlayStart();
                    break;
                case "play_end":
                    dVar.onAdPlayEnd();
                    break;
                case "play_error":
                    dVar.onAdPlayFailed(adError);
                    break;
                case "deeplink":
                    dVar.onDeeplinkCallback("success".equals(str2));
                    break;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.q8.d
    public void onAdClick() {
        a("onAdClick");
    }

    @Override // com.smartdigimkt.q8.d
    public void onAdClose() {
        a("onAdClose");
    }

    @Override // com.smartdigimkt.q8.d
    public void onAdLoadFail(AdError adError) {
    }

    @Override // com.smartdigimkt.q8.d
    public void onAdLoadTimeout() {
    }

    @Override // com.smartdigimkt.q8.d
    public void onAdLoaded() {
        a(sv.j);
    }

    @Override // com.smartdigimkt.q8.d
    public void onAdPlayEnd() {
        a("onAdPlayEnd");
    }

    @Override // com.smartdigimkt.q8.d
    public void onAdPlayFailed(AdError adError) {
    }

    @Override // com.smartdigimkt.q8.d
    public void onAdPlayStart() {
        a("onAdPlayStart");
    }

    @Override // com.smartdigimkt.q8.d
    public void onAdReward() {
        a("onAdReward");
    }

    @Override // com.smartdigimkt.q8.d
    public void onAdShow() {
        a("onAdShow");
    }

    @Override // com.smartdigimkt.q8.d
    public void onDeeplinkCallback(boolean z2) {
        a("onDeeplinkCallback");
    }

    @Override // com.smartdigimkt.q8.d
    public void a(com.smartdigimkt.y4.c cVar) {
        this.f37949a = cVar;
    }

    @Override // com.smartdigimkt.q8.d
    public void a(AdError adError) {
        com.smartdigimkt.i7.d.a(this.f37949a, adError);
    }

    private void a(String str) {
        com.smartdigimkt.n8.d.a(this.f37949a, str);
    }
}
