package com.inmobi.media;

import A.RunnableC0887e;
import A.RunnableC0905n;
import android.os.Handler;
import android.os.Looper;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.we, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3294we extends F0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C3278ve f24077h = new C3278ve();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f24078i = "we";
    public static final String j = "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: ";
    public static final String k = "Ad show is already called. Please wait for the the ad to be shown.";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f24079l = "preload() and load() cannot be called on the same instance, please use a different instance.";
    public static final String m = "Please make an ad request first in order to start loading the ad.";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f24080n = "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: ";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f24081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f24082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PublisherCallbacks f24083c;
    private final Handler d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdMetaInfo f24084e;
    private InterfaceC3333z5 f;
    private WatermarkData g;

    public static /* synthetic */ void r() {
    }

    public final void a(byte b2) {
        this.f24081a = b2;
    }

    public final void b(PublisherCallbacks publisherCallbacks) {
        this.f24083c = publisherCallbacks;
    }

    @Override // com.inmobi.media.F0
    public void c(AdMetaInfo info) {
        Intrinsics.f(info, "info");
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onAdLoadSucceeded " + this);
        }
        this.f24084e = info;
        S0 s0J = j();
        if (s0J != null) {
            s0J.b((byte) 1);
        }
    }

    public final void d(AdMetaInfo adMetaInfo) {
        this.f24084e = adMetaInfo;
    }

    @Override // com.inmobi.media.F0
    public void e() {
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onAdWillShow " + this);
        }
        byte b2 = this.f24081a;
        if (b2 == 4 || b2 == 5) {
            return;
        }
        this.d.post(new A.F0(this, 2));
        InterfaceC3333z5 interfaceC3333z6 = this.f;
        if (interfaceC3333z6 != null) {
            String TAG2 = f24078i;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z6).d(TAG2, "AdManager state - WILL_DISPLAY");
        }
        this.f24081a = (byte) 4;
    }

    @Override // com.inmobi.media.F0
    public void h() {
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onUserLeftApplication " + this);
        }
        this.d.post(new A.F0(this, 0));
    }

    public abstract S0 j();

    public final JSONObject k() {
        JSONObject bidInfo;
        AdMetaInfo adMetaInfo = this.f24084e;
        return (adMetaInfo == null || (bidInfo = adMetaInfo.getBidInfo()) == null) ? new JSONObject() : bidInfo;
    }

    public final PublisherCallbacks l() {
        return this.f24083c;
    }

    public final String m() {
        String creativeID;
        AdMetaInfo adMetaInfo = this.f24084e;
        return (adMetaInfo == null || (creativeID = adMetaInfo.getCreativeID()) == null) ? "" : creativeID;
    }

    public final AdMetaInfo n() {
        return this.f24084e;
    }

    public final byte o() {
        return v() ? (byte) 2 : (byte) 1;
    }

    public final InterfaceC3333z5 p() {
        return this.f;
    }

    public final byte q() {
        return this.f24081a;
    }

    public final Handler s() {
        return this.d;
    }

    public final WatermarkData t() {
        return this.g;
    }

    public final Boolean u() {
        return this.f24082b;
    }

    public final boolean v() {
        PublisherCallbacks publisherCallbacks = this.f24083c;
        return publisherCallbacks != null && publisherCallbacks.getType() == 1;
    }

    public void w() {
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "submitAdLoadCalled " + this);
        }
        S0 s0J = j();
        if (s0J != null) {
            s0J.t0();
        }
    }

    public final void a(Boolean bool) {
        this.f24082b = bool;
    }

    public final void b(WatermarkData watermarkData) {
        this.g = watermarkData;
    }

    public final void a(InterfaceC3333z5 interfaceC3333z5) {
        this.f = interfaceC3333z5;
    }

    public final void b(S0 s0, InMobiAdRequestStatus status) {
        Intrinsics.f(status, "status");
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onLoadFailure " + this);
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f;
        if (interfaceC3333z6 != null) {
            String TAG2 = f24078i;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z6).d(TAG2, "AdManager state - LOAD_FAILED");
        }
        this.f24081a = (byte) 3;
        this.d.post(new RunnableC0887e(s0, this, status, 10));
    }

    public static final void a(S0 s0, AbstractC3294we this$0, InMobiAdRequestStatus status) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(status, "$status");
        if (s0 != null) {
            s0.b((byte) 1);
        }
        InterfaceC3333z5 interfaceC3333z5 = this$0.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "callback - onAdLoadFailed");
        }
        PublisherCallbacks publisherCallbacks = this$0.f24083c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadFailed(status);
        }
        InterfaceC3333z5 interfaceC3333z6 = this$0.f;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a();
        }
    }

    public static final void c(AbstractC3294we this$0) {
        Intrinsics.f(this$0, "this$0");
        InterfaceC3333z5 interfaceC3333z5 = this$0.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "callback - onUserLeftApplication");
        }
        PublisherCallbacks publisherCallbacks = this$0.f24083c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onUserLeftApplication();
        }
    }

    @Override // com.inmobi.media.F0
    public void b(AdMetaInfo info) {
        S0 s0J;
        Intrinsics.f(info, "info");
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onAdFetchSuccess " + this);
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f;
        if (interfaceC3333z6 != null) {
            String TAG2 = f24078i;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z6).d(TAG2, "AdManager state - FETCHED");
        }
        this.f24081a = (byte) 7;
        if (!v() || (s0J = j()) == null) {
            return;
        }
        s0J.b((byte) 2);
    }

    @Override // com.inmobi.media.F0
    public void a(InMobiAdRequestStatus status) {
        Intrinsics.f(status, "status");
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onAdFetchFailed " + this);
        }
        this.f24081a = (byte) 3;
        this.d.post(new A.H0(this, status, 0));
    }

    public static final void a(AbstractC3294we this$0, InMobiAdRequestStatus status) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(status, "$status");
        InterfaceC3333z5 interfaceC3333z5 = this$0.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "callback - onAdFetchFailed");
        }
        PublisherCallbacks publisherCallbacks = this$0.f24083c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchFailed(status);
        }
        InterfaceC3333z5 interfaceC3333z6 = this$0.f;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a();
        }
    }

    public static final void b(AbstractC3294we this$0) {
        Intrinsics.f(this$0, "this$0");
        InterfaceC3333z5 interfaceC3333z5 = this$0.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "callback - onAdWillShow");
        }
        PublisherCallbacks publisherCallbacks = this$0.f24083c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdWillDisplay();
        }
    }

    @Override // com.inmobi.media.F0
    public void a(AdMetaInfo info) {
        Intrinsics.f(info, "info");
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onAdDisplayed " + this);
        }
        if (this.f24081a != 5) {
            this.f24084e = info;
            this.d.post(new RunnableC0905n(27, this, info));
            InterfaceC3333z5 interfaceC3333z6 = this.f;
            if (interfaceC3333z6 != null) {
                String TAG2 = f24078i;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z6).d(TAG2, "AdManager state - DISPLAYED");
            }
            this.f24081a = (byte) 5;
        }
    }

    @Override // com.inmobi.media.F0
    public void b(Map<Object, ? extends Object> rewards) {
        Intrinsics.f(rewards, "rewards");
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onAdRewardActionCompleted " + this);
        }
        this.d.post(new A.G0(this, rewards, 0));
    }

    public static final void b(AbstractC3294we this$0, Map rewards) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(rewards, "$rewards");
        InterfaceC3333z5 interfaceC3333z5 = this$0.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "callback - onRewardsUnlocked");
        }
        PublisherCallbacks publisherCallbacks = this$0.f24083c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onRewardsUnlocked(rewards);
        }
    }

    @Override // com.inmobi.media.F0
    public void b(InMobiAdRequestStatus reason) {
        Intrinsics.f(reason, "reason");
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onRequestCreationFailed " + this);
        }
        this.d.post(new A.H0(this, reason, 1));
    }

    public static final void a(AbstractC3294we this$0, AdMetaInfo info) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(info, "$info");
        InterfaceC3333z5 interfaceC3333z5 = this$0.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "callback - onAdDisplayed");
        }
        PublisherCallbacks publisherCallbacks = this$0.f24083c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayed(info);
        }
    }

    public static final void b(AbstractC3294we this$0, InMobiAdRequestStatus reason) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(reason, "$reason");
        InterfaceC3333z5 interfaceC3333z5 = this$0.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "callback - onRequestPayloadCreationFailed");
        }
        PublisherCallbacks publisherCallbacks = this$0.f24083c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onRequestPayloadCreationFailed(reason);
        }
        InterfaceC3333z5 interfaceC3333z6 = this$0.f;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a();
        }
    }

    @Override // com.inmobi.media.F0
    public void a(S0 s0, InMobiAdRequestStatus status) {
        Intrinsics.f(status, "status");
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onAdLoadFailed " + this);
        }
        b(s0, status);
    }

    @Override // com.inmobi.media.F0
    public void b() {
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onAdDismissed " + this);
        }
        this.d.post(new A.F0(this, 1));
        InterfaceC3333z5 interfaceC3333z6 = this.f;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a();
        }
    }

    @Override // com.inmobi.media.F0
    public void a(Map<Object, ? extends Object> params) {
        Intrinsics.f(params, "params");
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onAdInteraction " + this);
        }
        this.d.post(new A.G0(this, params, 1));
    }

    public static final void a(AbstractC3294we this$0, Map params) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(params, "$params");
        InterfaceC3333z5 interfaceC3333z5 = this$0.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "callback - onAdClicked");
        }
        PublisherCallbacks publisherCallbacks = this$0.f24083c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdClicked(params);
        }
    }

    public final void a(PublisherCallbacks callbacks) {
        Intrinsics.f(callbacks, "callbacks");
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "getSignals " + this);
        }
        if (j() != null) {
            S0 s0J = j();
            if (s0J != null) {
                s0J.y0();
            }
            this.f24083c = callbacks;
            S0 s0J2 = j();
            if (s0J2 != null) {
                s0J2.P();
            }
        }
    }

    public void a(byte[] bArr, PublisherCallbacks callbacks) {
        S0 s0J;
        S0 s0J2;
        Intrinsics.f(callbacks, "callbacks");
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "load " + this);
        }
        if (Intrinsics.a(this.f24082b, Boolean.TRUE)) {
            AbstractC3048h7.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            InterfaceC3333z5 interfaceC3333z6 = this.f;
            if (interfaceC3333z6 != null) {
                String TAG2 = f24078i;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z6).a(TAG2, "Cannot call load(byte[]) API after load() API is called");
            }
            b(j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            S0 s0J3 = j();
            if (s0J3 != null) {
                s0J3.a((short) 2140);
                return;
            }
            return;
        }
        this.f24082b = Boolean.FALSE;
        this.f24081a = (byte) 1;
        InterfaceC3333z5 interfaceC3333z7 = this.f;
        if (interfaceC3333z7 != null && (s0J2 = j()) != null) {
            s0J2.a(interfaceC3333z7);
        }
        if (j() == null || (s0J = j()) == null || !s0J.e((byte) 1)) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z8 = this.f;
        if (interfaceC3333z8 != null) {
            String TAG3 = f24078i;
            Intrinsics.e(TAG3, "TAG");
            ((A5) interfaceC3333z8).a(TAG3, "load starting. Started INTERNAL_LOAD_TIMER");
        }
        this.f24083c = callbacks;
        S0 s0J4 = j();
        if (s0J4 != null) {
            s0J4.a(bArr);
        }
    }

    @Override // com.inmobi.media.F0
    public void a(byte[] request) {
        Intrinsics.f(request, "request");
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onRequestCreated " + this);
        }
        this.d.post(new RunnableC0905n(29, this, request));
    }

    public static final void a(AbstractC3294we this$0, byte[] request) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(request, "$request");
        InterfaceC3333z5 interfaceC3333z5 = this$0.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "callback - onRequestPayloadCreated");
        }
        PublisherCallbacks publisherCallbacks = this$0.f24083c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onRequestPayloadCreated(request);
        }
        InterfaceC3333z5 interfaceC3333z6 = this$0.f;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a();
        }
    }

    public void a(WatermarkData watermarkData) {
        Intrinsics.f(watermarkData, "watermarkData");
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            String str = f24078i;
            StringBuilder sbA = H6.a(str, "TAG", "setWatermark - ");
            sbA.append(watermarkData.getWatermarkBase64EncodedString());
            ((A5) interfaceC3333z5).c(str, sbA.toString());
        }
        this.g = watermarkData;
    }

    public final boolean a(String tag, String placementString, PublisherCallbacks publisherCallbacks) {
        Intrinsics.f(tag, "tag");
        Intrinsics.f(placementString, "placementString");
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c(tag, "canProceedToLoad " + this);
        }
        PublisherCallbacks publisherCallbacks2 = this.f24083c;
        if (publisherCallbacks2 != null && publisherCallbacks != null && publisherCallbacks2.getType() != publisherCallbacks.getType()) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            AbstractC3048h7.a((byte) 1, TAG, f24079l);
            InterfaceC3333z5 interfaceC3333z6 = this.f;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).b(tag, f24079l);
            }
            S0 s0J = j();
            if (s0J != null) {
                s0J.a((short) 2005);
            }
            b(j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            return false;
        }
        byte b2 = this.f24081a;
        if (b2 == 8) {
            AbstractC3048h7.a((byte) 1, tag, f24080n.concat(placementString));
            InterfaceC3333z5 interfaceC3333z7 = this.f;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).b(tag, AbstractC3041h0.a(f24080n, placementString));
            }
            S0 s0J2 = j();
            if (s0J2 != null) {
                s0J2.a((short) 2002);
            }
        } else if (b2 == 1) {
            AbstractC3048h7.a((byte) 1, tag, f24080n.concat(placementString));
            InterfaceC3333z5 interfaceC3333z8 = this.f;
            if (interfaceC3333z8 != null) {
                ((A5) interfaceC3333z8).b(tag, AbstractC3041h0.a(f24080n, placementString));
            }
            S0 s0J3 = j();
            if (s0J3 != null) {
                s0J3.a((short) 2001);
            }
        } else {
            if (b2 != 5) {
                return true;
            }
            AbstractC3048h7.a((byte) 1, tag, j.concat(placementString));
            InterfaceC3333z5 interfaceC3333z9 = this.f;
            if (interfaceC3333z9 != null) {
                ((A5) interfaceC3333z9).b(tag, AbstractC3041h0.a(j, placementString));
            }
            b(j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
            S0 s0J4 = j();
            if (s0J4 != null) {
                s0J4.b((short) 2003);
            }
        }
        return false;
    }

    public final boolean a(String tag, String placementString) throws IllegalStateException {
        Intrinsics.f(tag, "tag");
        Intrinsics.f(placementString, "placementString");
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "canRender " + this);
        }
        byte b2 = this.f24081a;
        if (b2 == 1) {
            AbstractC3048h7.a((byte) 1, tag, f24080n.concat(placementString));
            InterfaceC3333z5 interfaceC3333z6 = this.f;
            if (interfaceC3333z6 != null) {
                String TAG2 = f24078i;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z6).b(TAG2, "adload in progress");
            }
            S0 s0J = j();
            if (s0J != null) {
                s0J.b((short) 2129);
            }
        } else {
            if (b2 != 8) {
                if (b2 == 5) {
                    AbstractC3048h7.a((byte) 1, tag, j.concat(placementString));
                    InterfaceC3333z5 interfaceC3333z7 = this.f;
                    if (interfaceC3333z7 != null) {
                        String TAG3 = f24078i;
                        Intrinsics.e(TAG3, "TAG");
                        ((A5) interfaceC3333z7).b(TAG3, "ad active before renderAd");
                    }
                    S0 s0J2 = j();
                    if (s0J2 != null) {
                        s0J2.b((short) 2130);
                    }
                    S0 s0J3 = j();
                    if (s0J3 != null) {
                        s0J3.m0();
                    }
                    b(j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                    return false;
                }
                if (b2 == 7) {
                    return true;
                }
                InterfaceC3333z5 interfaceC3333z8 = this.f;
                if (interfaceC3333z8 != null) {
                    String TAG4 = f24078i;
                    Intrinsics.e(TAG4, "TAG");
                    ((A5) interfaceC3333z8).b(TAG4, "ad in illegal state");
                }
                S0 s0J4 = j();
                if (s0J4 != null) {
                    s0J4.b((short) 2165);
                }
                S0 s0J5 = j();
                if (s0J5 != null) {
                    s0J5.m0();
                }
                b(j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                throw new IllegalStateException(m);
            }
            AbstractC3048h7.a((byte) 1, tag, f24080n.concat(placementString));
            InterfaceC3333z5 interfaceC3333z9 = this.f;
            if (interfaceC3333z9 != null) {
                String TAG5 = f24078i;
                Intrinsics.e(TAG5, "TAG");
                ((A5) interfaceC3333z9).b(TAG5, "ad loading into view is in progress");
            }
            S0 s0J6 = j();
            if (s0J6 != null) {
                s0J6.b((short) 2164);
            }
        }
        return false;
    }

    public static final void a(AbstractC3294we this$0) {
        Intrinsics.f(this$0, "this$0");
        InterfaceC3333z5 interfaceC3333z5 = this$0.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacks = this$0.f24083c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDismissed();
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this$0.f;
        if (interfaceC3333z6 != null) {
            String TAG2 = f24078i;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z6).b(TAG2, "callback is null");
        }
    }

    @Override // com.inmobi.media.F0
    public void a(Yd yd) {
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onAdImpression " + this);
        }
        this.d.post(new RunnableC0905n(26, this, yd));
    }

    public static final void a(AbstractC3294we this$0, Yd yd) {
        Intrinsics.f(this$0, "this$0");
        if (this$0.f24083c == null) {
            InterfaceC3333z5 interfaceC3333z5 = this$0.f;
            if (interfaceC3333z5 != null) {
                String TAG = f24078i;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).b(TAG, "callback is null");
            }
            if (yd != null) {
                yd.c();
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this$0.f;
        if (interfaceC3333z6 != null) {
            String TAG2 = f24078i;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z6).a(TAG2, "callback - onAdImpression");
        }
        PublisherCallbacks publisherCallbacks = this$0.f24083c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdImpression(yd);
        }
    }

    @Override // com.inmobi.media.F0
    public void a(D1 audioStatusInternal) {
        Intrinsics.f(audioStatusInternal, "audioStatusInternal");
        this.d.post(new RunnableC0905n(28, this, audioStatusInternal));
    }

    public static final void a(AbstractC3294we this$0, D1 audioStatusInternal) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(audioStatusInternal, "$audioStatusInternal");
        InterfaceC3333z5 interfaceC3333z5 = this$0.f;
        if (interfaceC3333z5 != null) {
            String str = f24078i;
            StringBuilder sbA = H6.a(str, "TAG", "callback - onAudioStatusChanged - ");
            sbA.append(audioStatusInternal.f22757a);
            ((A5) interfaceC3333z5).a(str, sbA.toString());
        }
        PublisherCallbacks publisherCallbacks = this$0.f24083c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAudioStatusChanged(audioStatusInternal);
        }
    }

    @Override // com.inmobi.media.F0
    public void a(String log) {
        Intrinsics.f(log, "log");
        this.d.post(new A.I0(0, this, log));
    }

    public static final void a(AbstractC3294we this$0, String log) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(log, "$log");
        InterfaceC3333z5 interfaceC3333z5 = this$0.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "callback - onImraidLog");
        }
        PublisherCallbacks publisherCallbacks = this$0.f24083c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onImraidLog(log);
        }
    }

    public void a(short s) {
        InterfaceC3333z5 interfaceC3333z5 = this.f;
        if (interfaceC3333z5 != null) {
            String TAG = f24078i;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "submitAdLoadDroppedAtSDK " + this);
        }
        S0 s0J = j();
        if (s0J != null) {
            s0J.a(s);
        }
    }
}
