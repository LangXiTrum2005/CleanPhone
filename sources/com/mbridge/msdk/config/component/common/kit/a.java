package com.mbridge.msdk.config.component.common.kit;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.omsdk.b;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AdSession f31945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdEvents f31946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaEvents f31947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a f31948d;

    private void b() {
        if (this.f31947c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSDKResume");
            this.f31947c.resume();
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void c() {
        if (this.f31947c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkBuffEnd");
            this.f31947c.bufferFinish();
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void d() {
        if (this.f31947c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkBuffStart");
            this.f31947c.bufferStart();
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void f() {
        if (this.f31947c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkClick");
            this.f31947c.adUserInteraction(InteractionType.CLICK);
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void g() {
        if (this.f31945a != null) {
            try {
                q0.b("OMSDK_TAG", "onOMSdkDestory");
                this.f31945a.removeAllFriendlyObstructions();
                this.f31945a.finish();
                this.f31945a = null;
            } catch (Exception e10) {
                q0.b("OmSdkKit", e10.getMessage(), e10);
            }
        }
    }

    private void h() {
        if (this.f31947c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkPause");
            this.f31947c.pause();
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void j() {
        if (this.f31947c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkSkipped");
            this.f31947c.skipped();
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void k() {
        if (this.f31945a != null) {
            try {
                q0.b("OMSDK_TAG", "onOMSdkStart");
                this.f31945a.start();
                if (this.f31946b != null) {
                    this.f31946b.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
                    this.f31946b.impressionOccurred();
                }
                com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f31948d;
                if (aVar != null && !aVar.d()) {
                    Object objB = this.f31948d.b((Object) "viewTag");
                    Object objB2 = this.f31948d.b((Object) "rootView");
                    if ((objB instanceof String) && (objB2 instanceof ViewGroup)) {
                        String strValueOf = String.valueOf(objB);
                        ViewGroup viewGroup = (ViewGroup) objB2;
                        this.f31945a.registerAdView(viewGroup.findViewWithTag(strValueOf));
                        Iterator<View> it = c.a(viewGroup, strValueOf).iterator();
                        while (it.hasNext()) {
                            this.f31945a.addFriendlyObstruction(it.next(), FriendlyObstructionPurpose.OTHER, null);
                        }
                    }
                }
            } catch (Exception e10) {
                q0.b("OmSdkKit", e10.getMessage(), e10);
            }
        }
    }

    public void a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        this.f31948d = aVar;
        a(str);
    }

    private void a(String str) {
        if (this.f31948d == null) {
            return;
        }
        str.getClass();
        switch (str) {
            case "onDestroy":
                g();
                break;
            case "PlayerPlayPlaying":
                b();
                break;
            case "PlayerPlayPause":
                h();
                break;
            case "PlayerPlayStart":
                k();
                break;
            case "onAdClick":
                f();
                break;
            case "onBufferingEnd":
                c();
                break;
            case "onCreate":
                a();
                break;
            case "PlayerPlayMuteChanged":
                e();
                break;
            case "PlayerProgressChanged":
                i();
                break;
            case "onBufferingStart":
                d();
                break;
            case "skipped":
                j();
                break;
        }
    }

    private void a() {
        try {
            if (this.f31948d.a((Object) "g0")) {
                Object objB = this.f31948d.b((Object) "g0");
                if (objB instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objB;
                    AdSession adSessionA = b.a(com.mbridge.msdk.foundation.controller.c.n().d(), false, String.valueOf(aVar.b((Object) CampaignEx.KEY_OMID)), String.valueOf(aVar.b((Object) "requestId")), String.valueOf(aVar.b((Object) "id")), String.valueOf(aVar.b((Object) "campaignUnitId")), String.valueOf(aVar.b((Object) "videoURL")), String.valueOf(aVar.b((Object) "requestNoticeId")));
                    this.f31945a = adSessionA;
                    if (adSessionA != null) {
                        this.f31946b = AdEvents.createAdEvents(adSessionA);
                        this.f31947c = MediaEvents.createMediaEvents(this.f31945a);
                    }
                }
            }
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void e() {
    }

    private void i() {
    }
}
