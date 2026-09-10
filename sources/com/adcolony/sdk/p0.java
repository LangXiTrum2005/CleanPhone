package com.adcolony.sdk;

import android.util.Log;
import android.webkit.WebView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.iab.omid.library.adcolony.adsession.AdEvents;
import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.AdSessionConfiguration;
import com.iab.omid.library.adcolony.adsession.AdSessionContext;
import com.iab.omid.library.adcolony.adsession.CreativeType;
import com.iab.omid.library.adcolony.adsession.ErrorType;
import com.iab.omid.library.adcolony.adsession.ImpressionType;
import com.iab.omid.library.adcolony.adsession.Owner;
import com.iab.omid.library.adcolony.adsession.VerificationScriptResource;
import com.iab.omid.library.adcolony.adsession.media.InteractionType;
import com.iab.omid.library.adcolony.adsession.media.MediaEvents;
import com.iab.omid.library.adcolony.adsession.media.Position;
import com.iab.omid.library.adcolony.adsession.media.VastProperties;
import com.p004ironsource.d9;
import com.thinkup.core.common.n.mo;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AdSession f9305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdEvents f9306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaEvents f9307c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9308e;
    private boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9309h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f9310i;
    private boolean j;
    private boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f9311l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f9312n;
    private String o;
    private List<VerificationScriptResource> d = new ArrayList();
    private String f = "";

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9313a;

        public a(String str) {
            this.f9313a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            f1 f1VarB = c0.b();
            f1 f1VarB2 = c0.b();
            c0.b(f1VarB2, "session_type", p0.this.f9308e);
            c0.a(f1VarB2, "session_id", p0.this.f);
            c0.a(f1VarB2, "event", this.f9313a);
            c0.a(f1VarB, "type", "iab_hook");
            c0.a(f1VarB, PglCryptUtils.KEY_MESSAGE, f1VarB2.toString());
            new h0("CustomMessage.controller_send", 0, f1VarB).c();
        }
    }

    public class b implements AdColonyCustomMessageListener {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f9316a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f9317b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f9318c;

            public a(String str, String str2, float f) {
                this.f9316a = str;
                this.f9317b = str2;
                this.f9318c = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f9316a.equals(p0.this.o)) {
                    p0.this.a(this.f9317b, this.f9318c);
                    return;
                }
                AdColonyAdView adColonyAdView = com.adcolony.sdk.a.b().c().d().get(this.f9316a);
                p0 omidManager = adColonyAdView != null ? adColonyAdView.getOmidManager() : null;
                if (omidManager != null) {
                    omidManager.a(this.f9317b, this.f9318c);
                }
            }
        }

        public b() {
        }

        @Override // com.adcolony.sdk.AdColonyCustomMessageListener
        public void onAdColonyCustomMessage(AdColonyCustomMessage adColonyCustomMessage) {
            f1 f1VarB = c0.b(adColonyCustomMessage.getMessage());
            String strH = c0.h(f1VarB, com.thinkup.core.common.oo.o.C0684o.m);
            float fFloatValue = BigDecimal.valueOf(c0.c(f1VarB, "duration")).floatValue();
            boolean zB = c0.b(f1VarB, "replay");
            boolean zEquals = c0.h(f1VarB, "skip_type").equals("dec");
            String strH2 = c0.h(f1VarB, "asi");
            if (strH.equals("skip") && zEquals) {
                p0.this.k = true;
                return;
            }
            if (zB && (strH.equals("start") || strH.equals("first_quartile") || strH.equals("midpoint") || strH.equals("third_quartile") || strH.equals("complete"))) {
                return;
            }
            z0.b(new a(strH2, strH, fFloatValue));
        }
    }

    public p0(f1 f1Var, String str) {
        this.f9308e = -1;
        this.f9312n = "";
        this.o = "";
        this.f9308e = a(f1Var);
        this.j = c0.b(f1Var, "skippable");
        this.f9311l = c0.d(f1Var, "skip_offset");
        this.m = c0.d(f1Var, "video_duration");
        e1 e1VarA = c0.a(f1Var, "js_resources");
        e1 e1VarA2 = c0.a(f1Var, "verification_params");
        e1 e1VarA3 = c0.a(f1Var, "vendor_keys");
        this.o = str;
        for (int i2 = 0; i2 < e1VarA.b(); i2++) {
            try {
                String strB = c0.b(e1VarA2, i2);
                String strB2 = c0.b(e1VarA3, i2);
                URL url = new URL(c0.b(e1VarA, i2));
                this.d.add((strB.equals("") || strB2.equals("")) ? VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url) : VerificationScriptResource.createVerificationScriptResourceWithParameters(strB2, url, strB));
            } catch (MalformedURLException unused) {
                new e0.a().a("Invalid js resource url passed to Omid").a(e0.f9132i);
            }
        }
        try {
            this.f9312n = com.adcolony.sdk.a.b().p().a(c0.h(f1Var, "filepath"), true).toString();
        } catch (IOException unused2) {
            new e0.a().a("Error loading IAB JS Client").a(e0.f9132i);
        }
    }

    private void e() {
        AdColony.addCustomMessageListener(new b(), "viewability_ad_event");
    }

    public int d() {
        return this.f9308e;
    }

    public void f() {
        this.f9309h = true;
    }

    public void b() {
        AdColony.removeCustomMessageListener("viewability_ad_event");
        this.f9305a.finish();
        b("end_session");
        this.f9305a = null;
    }

    public AdSession c() {
        return this.f9305a;
    }

    private int a(f1 f1Var) {
        if (this.f9308e == -1) {
            int iD = c0.d(f1Var, "ad_unit_type");
            String strH = c0.h(f1Var, "ad_type");
            if (iD == 0) {
                return 0;
            }
            if (iD == 1) {
                if (strH.equals("video")) {
                    return 0;
                }
                if (strH.equals(d9.h.d)) {
                    return 1;
                }
                if (strH.equals("banner_display") || strH.equals("interstitial_display")) {
                    return 2;
                }
            }
        }
        return this.f9308e;
    }

    private void b(String str) {
        if (z0.a(new a(str))) {
            return;
        }
        new e0.a().a("Executing ADCOmidManager.sendIabCustomMessage failed").a(e0.f9132i);
    }

    private void b(c cVar) {
        b("register_ad_view");
        b1 value = com.adcolony.sdk.a.b().B().get(Integer.valueOf(cVar.k()));
        if (value == null && !cVar.n().isEmpty()) {
            value = cVar.n().entrySet().iterator().next().getValue();
        }
        AdSession adSession = this.f9305a;
        if (adSession != null && value != null) {
            adSession.registerAdView(value);
            if (value instanceof l0) {
                ((l0) value).p();
                return;
            }
            return;
        }
        if (adSession != null) {
            adSession.registerAdView(cVar);
            cVar.a(this.f9305a);
            b("register_obstructions");
        }
    }

    public void a(c cVar) {
        VastProperties vastPropertiesCreateVastPropertiesForNonSkippableMedia;
        if (this.f9310i || this.f9308e < 0 || this.f9305a == null) {
            return;
        }
        b(cVar);
        e();
        this.f9307c = this.f9308e != 0 ? null : MediaEvents.createMediaEvents(this.f9305a);
        try {
            this.f9305a.start();
            this.f9306b = AdEvents.createAdEvents(this.f9305a);
            b("start_session");
            if (this.f9307c != null) {
                Position position = Position.PREROLL;
                if (this.j) {
                    vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForSkippableMedia(this.f9311l, true, position);
                } else {
                    vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(true, position);
                }
                this.f9306b.loaded(vastPropertiesCreateVastPropertiesForNonSkippableMedia);
            } else {
                this.f9306b.loaded();
            }
            this.f9310i = true;
        } catch (NullPointerException e2) {
            this.f9305a.error(ErrorType.GENERIC, "Exception occurred on AdSession.start: " + Log.getStackTraceString(e2));
            b();
            new e0.a().a("Exception in ADCOmidManager on AdSession.start: ").a(Log.getStackTraceString(e2)).a(android.support.v4.media.a.r(new StringBuilder(" Ad with adSessionId: "), this.o, mo.ono)).a(e0.f9132i);
        }
    }

    public void a() throws IllegalArgumentException {
        a((WebView) null);
    }

    public void a(WebView webView) throws IllegalArgumentException {
        String str;
        List<VerificationScriptResource> list;
        if (this.f9308e < 0 || (str = this.f9312n) == null || str.equals("") || (list = this.d) == null) {
            return;
        }
        if (!list.isEmpty() || d() == 2) {
            k kVarB = com.adcolony.sdk.a.b();
            Owner owner = Owner.NATIVE;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            int iD = d();
            if (iD == 0) {
                AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.VIDEO, impressionType, owner, owner, false), AdSessionContext.createNativeAdSessionContext(kVarB.t(), this.f9312n, this.d, null, null));
                this.f9305a = adSessionCreateAdSession;
                this.f = adSessionCreateAdSession.getAdSessionId();
                b("inject_javascript");
                return;
            }
            if (iD == 1) {
                AdSession adSessionCreateAdSession2 = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, impressionType, owner, null, false), AdSessionContext.createNativeAdSessionContext(kVarB.t(), this.f9312n, this.d, null, null));
                this.f9305a = adSessionCreateAdSession2;
                this.f = adSessionCreateAdSession2.getAdSessionId();
                b("inject_javascript");
                return;
            }
            if (iD != 2) {
                return;
            }
            AdSession adSessionCreateAdSession3 = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, impressionType, owner, null, false), AdSessionContext.createHtmlAdSessionContext(kVarB.t(), webView, "", null));
            this.f9305a = adSessionCreateAdSession3;
            this.f = adSessionCreateAdSession3.getAdSessionId();
        }
    }

    public void a(String str) {
        a(str, 0.0f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:74:0x00e9  */
    public void a(String str, float f) {
        if (!com.adcolony.sdk.a.c() || this.f9305a == null) {
            return;
        }
        if (this.f9307c != null || str.equals("start") || str.equals("skip") || str.equals("continue") || str.equals(com.smartdigimkt.o1.b.P3)) {
            try {
                switch (str) {
                    case "start":
                        this.f9306b.impressionOccurred();
                        MediaEvents mediaEvents = this.f9307c;
                        if (mediaEvents != null) {
                            if (f <= 0.0f) {
                                f = this.m;
                            }
                            mediaEvents.start(f, 1.0f);
                        }
                        b(str);
                        break;
                    case "first_quartile":
                        this.f9307c.firstQuartile();
                        b(str);
                        break;
                    case "midpoint":
                        this.f9307c.midpoint();
                        b(str);
                        break;
                    case "third_quartile":
                        this.f9307c.thirdQuartile();
                        b(str);
                        break;
                    case "complete":
                        this.k = true;
                        this.f9307c.complete();
                        b(str);
                        break;
                    case "continue":
                        b(str);
                        b();
                        break;
                    case "skip":
                    case "cancel":
                        MediaEvents mediaEvents2 = this.f9307c;
                        if (mediaEvents2 != null) {
                            mediaEvents2.skipped();
                        }
                        b(str);
                        b();
                        break;
                    case "sound_mute":
                        this.f9307c.volumeChange(0.0f);
                        b(str);
                        break;
                    case "sound_unmute":
                        this.f9307c.volumeChange(1.0f);
                        b(str);
                        break;
                    case "pause":
                        if (!this.g && !this.f9309h && !this.k) {
                            this.f9307c.pause();
                            b(str);
                            this.g = true;
                            this.f9309h = false;
                            break;
                        }
                        break;
                    case "resume":
                        if (this.g && !this.k) {
                            this.f9307c.resume();
                            b(str);
                            this.g = false;
                            break;
                        }
                        break;
                    case "buffer_start":
                        this.f9307c.bufferStart();
                        b(str);
                        break;
                    case "buffer_end":
                        this.f9307c.bufferFinish();
                        b(str);
                        break;
                    case "in_video_engagement":
                    case "html5_interaction":
                        this.f9307c.adUserInteraction(InteractionType.CLICK);
                        b(str);
                        if (this.f9309h && !this.g && !this.k) {
                            this.f9307c.pause();
                            b("pause");
                            this.g = true;
                            this.f9309h = false;
                            break;
                        }
                        break;
                    default:
                        break;
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                new e0.a().a("Recording IAB event for ").a(str).a(" caused " + e.getClass()).a(e0.g);
            } catch (IllegalStateException e3) {
                e = e3;
                new e0.a().a("Recording IAB event for ").a(str).a(" caused " + e.getClass()).a(e0.g);
            }
        }
    }
}
