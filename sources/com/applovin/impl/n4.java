package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class n4 extends h4 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final /* synthetic */ boolean f8826p = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final r7 f8827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f8828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MediaEvents f8829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final VastProperties f8830k;
    private final AtomicBoolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f8831m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f8832n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f8833o;

    public n4(r7 r7Var) {
        super(r7Var);
        this.f8828i = new AtomicBoolean();
        this.l = new AtomicBoolean();
        this.f8831m = new AtomicBoolean();
        this.f8832n = new AtomicBoolean();
        this.f8833o = new AtomicBoolean();
        this.f8827h = r7Var;
        float fI1 = r7Var.i1();
        if (r7Var.i1() == -1) {
            this.f8830k = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        } else {
            this.f8830k = VastProperties.createVastPropertiesForSkippableMedia(fI1, true, Position.STANDALONE);
        }
    }

    public void A() {
        b("track resumed", new r9(this, 7));
    }

    public void B() {
        b("track skipped", new r9(this, 2));
    }

    public void C() {
        if (this.f8833o.compareAndSet(false, true)) {
            b("track third quartile", new r9(this, 1));
        }
    }

    @Override // com.applovin.impl.h4
    public AdSessionContext a(WebView webView) {
        if (!f8826p && this.f8827h.a1() == null) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        for (s7 s7Var : this.f8827h.a1().b()) {
            List<y7> listC = s7Var.c();
            if (listC.isEmpty()) {
                d8.a(s7Var.b(), w7.FAILED_TO_LOAD_RESOURCE, this.f8065b);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (y7 y7Var : listC) {
                    if (CampaignEx.KEY_OMID.equalsIgnoreCase(y7Var.b())) {
                        arrayList2.add(y7Var);
                    }
                }
                if (arrayList2.isEmpty()) {
                    d8.a(s7Var.b(), w7.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED, this.f8065b);
                } else {
                    ArrayList<URL> arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList3.add(new URL(((y7) it.next()).c()));
                        } catch (Throwable th2) {
                            if (com.applovin.impl.sdk.p.a()) {
                                this.f8066c.a(this.f8067d, "Failed to parse JavaScript resource url", th2);
                            }
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        d8.a(s7Var.b(), w7.FAILED_TO_LOAD_RESOURCE, this.f8065b);
                    } else {
                        String strE = s7Var.e();
                        String strD = s7Var.d();
                        if (!StringUtils.isValidString(strE) || StringUtils.isValidString(strD)) {
                            for (URL url : arrayList3) {
                                arrayList.add(StringUtils.isValidString(strE) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(strD, url, strE) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                            }
                        } else {
                            d8.a(s7Var.b(), w7.FAILED_TO_LOAD_RESOURCE, this.f8065b);
                        }
                    }
                }
            }
        }
        String strA = this.f8065b.g0().a();
        if (TextUtils.isEmpty(strA)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8066c.b(this.f8067d, "JavaScript SDK content not loaded successfully");
            }
            return null;
        }
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f8065b.g0().b(), strA, arrayList, this.f8827h.getOpenMeasurementContentUrl(), this.f8827h.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th3) {
            if (!com.applovin.impl.sdk.p.a()) {
                return null;
            }
            this.f8066c.a(this.f8067d, "Failed to create ad session context", th3);
            return null;
        }
    }

    public void b(final float f10, final boolean z10) {
        if (this.l.compareAndSet(false, true)) {
            b("track started", new Runnable() { // from class: com.applovin.impl.s9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9256a.a(f10, z10);
                }
            });
        }
    }

    @Override // com.applovin.impl.h4
    public void h() {
        b("track loaded", new r9(this, 6));
    }

    public void v() {
        b("track clicked", new r9(this, 8));
    }

    public void w() {
        b("track completed", new r9(this, 3));
    }

    public void x() {
        if (this.f8831m.compareAndSet(false, true)) {
            b("track first quartile", new r9(this, 4));
        }
    }

    public void y() {
        if (this.f8832n.compareAndSet(false, true)) {
            b("track midpoint", new r9(this, 0));
        }
    }

    public void z() {
        b("track paused", new r9(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.f8829j.bufferFinish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.f8829j.bufferStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.f8829j.adUserInteraction(InteractionType.CLICK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.f8829j.complete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f8829j.firstQuartile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        this.f8070g.loaded(this.f8830k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.f8829j.midpoint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.f8829j.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        this.f8829j.resume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.f8829j.skipped();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.f8829j.thirdQuartile();
    }

    public void i() {
        if (this.f8828i.compareAndSet(true, false)) {
            b("buffer finished", new r9(this, 9));
        }
    }

    public void j() {
        if (this.f8828i.compareAndSet(false, true)) {
            b("buffer started", new r9(this, 5));
        }
    }

    public void b(boolean z10) {
        b("track volume changed", new q9(0, this, z10));
    }

    @Override // com.applovin.impl.h4
    public AdSessionConfiguration a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.p.a()) {
                return null;
            }
            this.f8066c.a(this.f8067d, "Failed to create ad session configuration", th2);
            return null;
        }
    }

    @Override // com.applovin.impl.h4
    public void a(AdSession adSession) {
        try {
            this.f8829j = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8066c.a(this.f8067d, "Failed to create media events", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(float f10, boolean z10) {
        this.f8829j.start(f10, z10 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10) {
        this.f8829j.volumeChange(z10 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
    }
}
