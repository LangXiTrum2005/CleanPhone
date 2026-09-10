package com.inmobi.media;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.inmobi.media.C2903ff;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import p002kotlin.Unit;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import p002kotlin.text.dovishness;
import patroclinal.formularize;

/* JADX INFO: renamed from: com.inmobi.media.ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2903ff {
    public final Context a;
    public final C3097n9 b;
    public String c;
    public boolean d;
    public final SignalsConfig.NovatiqConfig e;

    public C2903ff(Context context, C3097n9 c3097n9) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = c3097n9;
        this.c = "";
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        this.e = ((SignalsConfig) Y3.a.a(SignalsConfig.class)).getNovatiqConfig();
        b();
    }

    public final C2852df a() {
        if (this.d) {
            return new C2852df(seminary.apical(formularize.attabal("n-h-id", this.c)));
        }
        C3097n9 c3097n9 = this.b;
        if (c3097n9 != null) {
            c3097n9.a("NovatiqDataHandler", "Novatiq disabled. skip");
        }
        return new C2852df(seminary.taiyuan());
    }

    public final void b() {
        String networkOperatorName;
        Context context = this.a;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.e.getIsNovatiqEnabled()) {
            Object systemService = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) {
                networkOperatorName = "";
            }
            List<String> carrierNames = this.e.getCarrierNames();
            if (!(carrierNames instanceof Collection) || !carrierNames.isEmpty()) {
                Iterator<T> it = carrierNames.iterator();
                while (it.hasNext()) {
                    if (StringsKt.mathsort(networkOperatorName, (String) it.next(), true)) {
                        try {
                            String strA = a(this.a);
                            this.d = true;
                            StringBuilder sb = new StringBuilder();
                            Random random = new Random();
                            for (int i = 0; i < 40; i++) {
                                char cCharAt = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxxxxxx".charAt(i);
                                if (cCharAt == 'x') {
                                    sb.append(Character.forDigit(random.nextInt(16), 16));
                                } else {
                                    sb.append(cCharAt);
                                }
                            }
                            String string = sb.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            this.c = string;
                            ((C3271u9) He.c.getValue()).a(new C2929gf(this.e, new C2877ef(string, strA), this.b).a()).restrictive(new Function1() { // from class: adsuki.gondola
                                @Override // p002kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C2903ff.a(this.f3447kowloon, (Throwable) obj);
                                }
                            });
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
            }
        }
        C3097n9 c3097n9 = this.b;
        if (c3097n9 != null) {
            c3097n9.a("NovatiqDataHandler", "Novatiq disabled.. skipping");
        }
    }

    public static final Unit a(C2903ff c2903ff, Throwable th) {
        if (th == null) {
            C3097n9 c3097n9 = c2903ff.b;
            if (c3097n9 != null) {
                c3097n9.a("NovatiqDataHandler", "Novatiq data sync successful");
            }
        } else {
            C3097n9 c3097n10 = c2903ff.b;
            if (c3097n10 != null) {
                c3097n10.a("NovatiqDataHandler", "Error: " + th);
            }
        }
        return Unit.f29295attabal;
    }

    public static String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return dovishness.merc(context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString(), ' ', '_', false, 4, null) + "_app";
    }
}
