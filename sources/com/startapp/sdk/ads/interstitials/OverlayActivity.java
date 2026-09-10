package com.startapp.sdk.ads.interstitials;

import A.RunnableC0883c;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import com.startapp.sdk.ads.video.c;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.a;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.i0;
import com.startapp.sdk.internal.kh;
import com.startapp.sdk.internal.p;
import com.startapp.sdk.internal.q0;
import com.startapp.sdk.internal.rg;
import com.startapp.sdk.internal.sg;
import com.startapp.sdk.internal.v7;
import com.startapp.sdk.internal.vi;
import com.startapp.sdk.internal.w7;
import com.startapp.sdk.internal.w8;
import com.startapp.sdk.internal.yd;
import com.startapp.sdk.internal.za;
import com.vungle.ads.internal.Constants;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class OverlayActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private w7 f40479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f40480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40481c;
    private boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Bundle f40482e;
    private int f = -1;
    private Ad g;

    private boolean b() {
        return this.f40480b && Build.VERSION.SDK_INT != 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.d) {
            this.d = false;
            this.f = vi.a((Activity) this, this.f40481c, false);
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        w7 w7Var = this.f40479a;
        if (w7Var != null) {
            w7Var.h();
        }
        super.finish();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        w7 w7Var = this.f40479a;
        if (w7Var == null || !w7Var.c()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (b()) {
            a();
            w7 w7Var = this.f40479a;
            if (w7Var != null) {
                w7Var.a(this.f40482e);
                this.f40479a.g();
            }
            this.f40480b = false;
        }
        w7 w7Var2 = this.f40479a;
        if (w7Var2 != null) {
            w7Var2.d();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("placement", -1);
        int intExtra2 = getIntent().getIntExtra("ad", -1);
        if (intExtra2 <= 0) {
            finish();
            return;
        }
        Ad ad = (Ad) kh.a(intExtra2, Ad.class);
        this.g = ad;
        if (ad == null) {
            finish();
            return;
        }
        if (intExtra >= 0) {
            sg sgVar = (sg) a.a(getApplicationContext()).f40740l.a();
            AdPreferences.Placement byIndex = AdPreferences.Placement.getByIndex(intExtra);
            String adId = this.g.getAdId();
            if (adId != null) {
                sgVar.f41489a.put(new rg(byIndex), adId);
            }
        }
        boolean booleanExtra = getIntent().getBooleanExtra("videoAd", false);
        requestWindowFeature(1);
        if (getIntent().getBooleanExtra(Constants.TEMPLATE_TYPE_FULLSCREEN, false) || booleanExtra) {
            getWindow().setFlags(1024, 1024);
        }
        this.d = getIntent().getBooleanExtra("activityShouldLockOrientation", true);
        if (bundle != null) {
            this.f = bundle.getInt("activityLockedOrientation", -1);
            this.d = bundle.getBoolean("activityShouldLockOrientation", true);
        }
        this.f40481c = getIntent().getIntExtra("orientation", getResources().getConfiguration().orientation);
        this.f40480b = getResources().getConfiguration().orientation != this.f40481c;
        if (b()) {
            this.f40482e = bundle;
            return;
        }
        a();
        w7 w7Var = this.f40479a;
        if (w7Var != null) {
            w7Var.a(bundle);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (!b()) {
            w7 w7Var = this.f40479a;
            if (w7Var != null) {
                w7Var.e();
                this.f40479a = null;
            }
            WeakHashMap weakHashMap = vi.f41589a;
            vi.a((Activity) this, getResources().getConfiguration().orientation, false);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        w7 w7Var = this.f40479a;
        if (w7Var == null || w7Var.a(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (!b()) {
            w7 w7Var = this.f40479a;
            if (w7Var != null) {
                w7Var.f();
            }
            h0.d(this);
        }
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onResume() {
        w7 w7Var;
        super.onResume();
        int i2 = this.f;
        if (i2 == -1) {
            this.f = vi.a(this, this.f40481c, this.d);
        } else {
            int i3 = q0.f41381a;
            try {
                setRequestedOrientation(i2);
            } catch (Throwable unused) {
            }
        }
        if (b() || (w7Var = this.f40479a) == null) {
            return;
        }
        w7Var.g();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (b()) {
            return;
        }
        w7 w7Var = this.f40479a;
        if (w7Var != null) {
            w7Var.b(bundle);
        }
        bundle.putInt("activityLockedOrientation", this.f);
        bundle.putBoolean("activityShouldLockOrientation", this.d);
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        b();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:27:0x0106  */
    /* JADX WARN: Code duplicated, block: B:30:0x0110  */
    /* JADX WARN: Code duplicated, block: B:33:0x0124  */
    /* JADX WARN: Code duplicated, block: B:36:0x0134  */
    private void a() {
        w7 w7Var;
        w7 ydVar;
        String stringExtra;
        long longExtra;
        long longExtra2;
        p pVar;
        if (this.g == null) {
            finish();
            return;
        }
        int intExtra = getIntent().getIntExtra("placement", 0);
        Intent intent = getIntent();
        AdPreferences.Placement byIndex = AdPreferences.Placement.getByIndex(intExtra);
        RunnableC0883c runnableC0883c = new RunnableC0883c(this, 27);
        Ad ad = this.g;
        switch (v7.f41568a[byIndex.ordinal()]) {
            case 1:
                WeakHashMap weakHashMap = vi.f41589a;
                ydVar = new yd();
                ydVar.f41606a = this;
                ydVar.g = intent.getStringExtra("position");
                ydVar.f41610h = intent.getStringArrayExtra("tracking");
                ydVar.f41611i = intent.getStringArrayExtra("trackingClickUrl");
                ydVar.j = intent.getStringArrayExtra("packageNames");
                ydVar.d = intent.getStringArrayExtra("closingUrl");
                ydVar.f41609e = intent.getBooleanArrayExtra("smartRedirect");
                ydVar.f = intent.getBooleanArrayExtra("browserEnabled");
                ydVar.o = intent.getStringExtra("adTag");
                stringExtra = intent.getStringExtra("htmlUuid");
                if (stringExtra != null) {
                    pVar = (p) a.a(this).M.a();
                    if (i0.f.booleanValue()) {
                        ydVar.a((String) pVar.f41334b.get(stringExtra));
                    } else {
                        ydVar.a((String) pVar.f41334b.remove(stringExtra));
                    }
                }
                ydVar.f41613n = (AdInformationOverrides) intent.getSerializableExtra("adInfoOverride");
                ydVar.m = byIndex;
                ydVar.d = intent.getStringArrayExtra("closingUrl");
                ydVar.r = intent.getIntExtra("rewardDuration", 0);
                ydVar.s = intent.getBooleanExtra("rewardedHideTimer", false);
                if (ydVar.f41609e == null) {
                    ydVar.f41609e = new boolean[]{true};
                }
                if (ydVar.f == null) {
                    ydVar.f = new boolean[]{true};
                }
                ydVar.k = ad;
                longExtra = intent.getLongExtra("delayCloseInterval", -1L);
                if (longExtra != -1) {
                    ydVar.t = Long.valueOf(longExtra);
                }
                longExtra2 = intent.getLongExtra("delayImpressionSeconds", -1L);
                if (longExtra2 != -1) {
                    ydVar.f41614p = Long.valueOf(longExtra2);
                }
                ydVar.q = (Boolean[]) intent.getSerializableExtra("sendRedirectHops");
                w7Var = ydVar;
                break;
            case 2:
                if (intent.getBooleanExtra("videoAd", false)) {
                    ydVar = new c();
                } else {
                    za zaVar = new za();
                    zaVar.f41772J = runnableC0883c;
                    ydVar = zaVar;
                }
                ydVar.f41606a = this;
                ydVar.g = intent.getStringExtra("position");
                ydVar.f41610h = intent.getStringArrayExtra("tracking");
                ydVar.f41611i = intent.getStringArrayExtra("trackingClickUrl");
                ydVar.j = intent.getStringArrayExtra("packageNames");
                ydVar.d = intent.getStringArrayExtra("closingUrl");
                ydVar.f41609e = intent.getBooleanArrayExtra("smartRedirect");
                ydVar.f = intent.getBooleanArrayExtra("browserEnabled");
                ydVar.o = intent.getStringExtra("adTag");
                stringExtra = intent.getStringExtra("htmlUuid");
                if (stringExtra != null) {
                    pVar = (p) a.a(this).M.a();
                    if (i0.f.booleanValue()) {
                        ydVar.a((String) pVar.f41334b.get(stringExtra));
                    } else {
                        ydVar.a((String) pVar.f41334b.remove(stringExtra));
                    }
                }
                ydVar.f41613n = (AdInformationOverrides) intent.getSerializableExtra("adInfoOverride");
                ydVar.m = byIndex;
                ydVar.d = intent.getStringArrayExtra("closingUrl");
                ydVar.r = intent.getIntExtra("rewardDuration", 0);
                ydVar.s = intent.getBooleanExtra("rewardedHideTimer", false);
                if (ydVar.f41609e == null) {
                    ydVar.f41609e = new boolean[]{true};
                }
                if (ydVar.f == null) {
                    ydVar.f = new boolean[]{true};
                }
                ydVar.k = ad;
                longExtra = intent.getLongExtra("delayCloseInterval", -1L);
                if (longExtra != -1) {
                    ydVar.t = Long.valueOf(longExtra);
                }
                longExtra2 = intent.getLongExtra("delayImpressionSeconds", -1L);
                if (longExtra2 != -1) {
                    ydVar.f41614p = Long.valueOf(longExtra2);
                }
                ydVar.q = (Boolean[]) intent.getSerializableExtra("sendRedirectHops");
                w7Var = ydVar;
                break;
            case 5:
            case 6:
                WeakHashMap weakHashMap2 = vi.f41589a;
                Uri data = intent.getData();
                if (data != null) {
                    ydVar = new w8(data.toString());
                    ydVar.f41606a = this;
                    ydVar.g = intent.getStringExtra("position");
                    ydVar.f41610h = intent.getStringArrayExtra("tracking");
                    ydVar.f41611i = intent.getStringArrayExtra("trackingClickUrl");
                    ydVar.j = intent.getStringArrayExtra("packageNames");
                    ydVar.d = intent.getStringArrayExtra("closingUrl");
                    ydVar.f41609e = intent.getBooleanArrayExtra("smartRedirect");
                    ydVar.f = intent.getBooleanArrayExtra("browserEnabled");
                    ydVar.o = intent.getStringExtra("adTag");
                    stringExtra = intent.getStringExtra("htmlUuid");
                    if (stringExtra != null) {
                        pVar = (p) a.a(this).M.a();
                        if (i0.f.booleanValue()) {
                            ydVar.a((String) pVar.f41334b.get(stringExtra));
                        } else {
                            ydVar.a((String) pVar.f41334b.remove(stringExtra));
                        }
                    }
                    ydVar.f41613n = (AdInformationOverrides) intent.getSerializableExtra("adInfoOverride");
                    ydVar.m = byIndex;
                    ydVar.d = intent.getStringArrayExtra("closingUrl");
                    ydVar.r = intent.getIntExtra("rewardDuration", 0);
                    ydVar.s = intent.getBooleanExtra("rewardedHideTimer", false);
                    if (ydVar.f41609e == null) {
                        ydVar.f41609e = new boolean[]{true};
                    }
                    if (ydVar.f == null) {
                        ydVar.f = new boolean[]{true};
                    }
                    ydVar.k = ad;
                    longExtra = intent.getLongExtra("delayCloseInterval", -1L);
                    if (longExtra != -1) {
                        ydVar.t = Long.valueOf(longExtra);
                    }
                    longExtra2 = intent.getLongExtra("delayImpressionSeconds", -1L);
                    if (longExtra2 != -1) {
                        ydVar.f41614p = Long.valueOf(longExtra2);
                    }
                    ydVar.q = (Boolean[]) intent.getSerializableExtra("sendRedirectHops");
                    w7Var = ydVar;
                    break;
                }
            case 3:
            case 4:
                w7Var = null;
                break;
            default:
                za zaVar2 = new za();
                zaVar2.f41772J = runnableC0883c;
                ydVar = zaVar2;
                ydVar.f41606a = this;
                ydVar.g = intent.getStringExtra("position");
                ydVar.f41610h = intent.getStringArrayExtra("tracking");
                ydVar.f41611i = intent.getStringArrayExtra("trackingClickUrl");
                ydVar.j = intent.getStringArrayExtra("packageNames");
                ydVar.d = intent.getStringArrayExtra("closingUrl");
                ydVar.f41609e = intent.getBooleanArrayExtra("smartRedirect");
                ydVar.f = intent.getBooleanArrayExtra("browserEnabled");
                ydVar.o = intent.getStringExtra("adTag");
                stringExtra = intent.getStringExtra("htmlUuid");
                if (stringExtra != null) {
                    pVar = (p) a.a(this).M.a();
                    if (i0.f.booleanValue()) {
                        ydVar.a((String) pVar.f41334b.get(stringExtra));
                    } else {
                        ydVar.a((String) pVar.f41334b.remove(stringExtra));
                    }
                }
                ydVar.f41613n = (AdInformationOverrides) intent.getSerializableExtra("adInfoOverride");
                ydVar.m = byIndex;
                ydVar.d = intent.getStringArrayExtra("closingUrl");
                ydVar.r = intent.getIntExtra("rewardDuration", 0);
                ydVar.s = intent.getBooleanExtra("rewardedHideTimer", false);
                if (ydVar.f41609e == null) {
                    ydVar.f41609e = new boolean[]{true};
                }
                if (ydVar.f == null) {
                    ydVar.f = new boolean[]{true};
                }
                ydVar.k = ad;
                longExtra = intent.getLongExtra("delayCloseInterval", -1L);
                if (longExtra != -1) {
                    ydVar.t = Long.valueOf(longExtra);
                }
                longExtra2 = intent.getLongExtra("delayImpressionSeconds", -1L);
                if (longExtra2 != -1) {
                    ydVar.f41614p = Long.valueOf(longExtra2);
                }
                ydVar.q = (Boolean[]) intent.getSerializableExtra("sendRedirectHops");
                w7Var = ydVar;
                break;
        }
        this.f40479a = w7Var;
        if (w7Var == null) {
            finish();
        }
    }
}
