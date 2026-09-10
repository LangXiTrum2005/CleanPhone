package com.startapp.sdk.adsbase;

import A.K;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.b2;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.pc;
import com.startapp.sdk.internal.vf;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ad f40632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdPreferences f40633c;
    public AdEventListener d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AdPreferences.Placement f40634e;
    public String f;
    public final lb g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lb f40635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lb f40636i;
    public final lb j;

    public c(Context context, Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4) {
        this.f40631a = context;
        this.f40632b = ad;
        this.f40633c = adPreferences == null ? new AdPreferences() : adPreferences;
        this.d = adEventListener;
        this.f40634e = placement;
        this.g = lbVar;
        this.f40635h = lbVar2;
        this.f40636i = lbVar3;
        this.j = lbVar4;
    }

    @Override // com.startapp.sdk.internal.b2
    public final void a() {
        try {
            ((Executor) this.f40635h.a()).execute(new c0.a(this, 28));
        } catch (Throwable th) {
            a(false);
            g9.a(th);
        }
    }

    public abstract boolean a(Object obj);

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(boolean z2) {
        d(z2);
        if (z2) {
            return;
        }
        Ad ad = this.f40632b;
        if (ad != null) {
            ad.setErrorMessage(this.f);
        }
        Context context = this.f40631a;
        AdEventListener adEventListener = this.d;
        this.d = null;
        a0.a(context, adEventListener, this.f40632b, false);
    }

    public final /* synthetic */ void d() {
        a(b());
    }

    public abstract Object e();

    public final boolean b() {
        try {
            return a(e());
        } catch (Throwable th) {
            g9.a(th);
            return false;
        }
    }

    public void d(boolean z2) {
        Ad ad = this.f40632b;
        if (ad != null) {
            ad.setState(z2 ? Ad.AdState.READY : Ad.AdState.UN_INITIALIZED);
        }
    }

    public final void a(boolean z2) {
        try {
            new Handler(Looper.getMainLooper()).post(new K(6, this, z2));
        } catch (Throwable th) {
            g9.a(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.startapp.sdk.adsbase.model.a a(com.startapp.sdk.adsbase.model.a aVar) {
        Pair pairA;
        String string;
        Pair pair;
        Context context = this.f40631a;
        boolean zA = MetaData.E().W().a(context);
        boolean zG0 = MetaData.E().g0();
        boolean zP0 = MetaData.E().p0();
        synchronized (g.class) {
            try {
                SimpleTokenUtils$TokenType simpleTokenUtils$TokenType = SimpleTokenUtils$TokenType.T1;
                Pair pair2 = new Pair(simpleTokenUtils$TokenType, "");
                if (zA) {
                    try {
                        SimpleTokenUtils$TokenType simpleTokenUtils$TokenType2 = g.f40663h;
                        if (simpleTokenUtils$TokenType2 == SimpleTokenUtils$TokenType.UNDEFINED) {
                            boolean z2 = g.f;
                            if (g.g && !z2) {
                                pairA = g.b(context);
                            } else {
                                pairA = g.a(context);
                            }
                            if (!zP0) {
                                z2 = !g.g;
                            }
                            g.g = z2;
                            if (zG0 || ((string = ((vf) com.startapp.sdk.components.a.a(context).G.a()).getString("shared_prefs_simple_token", "")) != null && !string.equals(pairA.second))) {
                                pair2 = pairA;
                            }
                        } else {
                            pair2 = simpleTokenUtils$TokenType2 == simpleTokenUtils$TokenType ? g.a(context) : g.b(context);
                        }
                    } catch (Throwable th) {
                        g9.a(th);
                    }
                }
                pair = new Pair(((SimpleTokenUtils$TokenType) pair2.first).toString(), (String) pair2.second);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            aVar.a(this.f40631a, this.f40633c, this.f40634e, pair);
            aVar.g(this.f40631a);
            if (!AdsCommonMetaData.k().J() && h0.a(this.f40631a)) {
                aVar.w0 = true;
            }
            try {
                aVar.a(this.f40631a, this.f40633c);
            } catch (Throwable th3) {
                g9.a(th3);
            }
            try {
                double dA = ((pc) this.j.a()).a();
                if (dA >= 0.0d) {
                    Locale locale = Locale.ENGLISH;
                    long jRound = Math.round(dA * 100.0d);
                    StringBuilder sb = new StringBuilder();
                    sb.append(jRound);
                    aVar.T0 = sb.toString();
                }
            } catch (Throwable th4) {
                g9.a(th4);
            }
            return aVar;
        } catch (Throwable th5) {
            g9.a(th5);
            g.f40663h = SimpleTokenUtils$TokenType.a((String) pair.first);
            return null;
        }
    }

    public com.startapp.sdk.adsbase.model.a c() {
        com.startapp.sdk.adsbase.model.a aVarA = a(new com.startapp.sdk.adsbase.model.a());
        if (aVarA != null) {
            aVarA.f(this.f40631a);
        }
        return aVarA;
    }
}
