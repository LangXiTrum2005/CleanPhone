package com.inmobi.media;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class Z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3333z5 f23408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23409c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SignalsConfig.NovatiqConfig f23410e;

    public Z9(Context context, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(context, "context");
        this.f23407a = context;
        this.f23408b = interfaceC3333z5;
        this.f23409c = "";
        LinkedHashMap linkedHashMap = O2.f23027a;
        SignalsConfig.NovatiqConfig novatiqConfig = ((SignalsConfig) AbstractC3174p5.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getNovatiqConfig();
        this.f23410e = novatiqConfig;
        if (novatiqConfig.getIsNovatiqEnabled()) {
            Object systemService = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
            String str = networkOperatorName != null ? networkOperatorName : "";
            List<String> carrierNames = novatiqConfig.getCarrierNames();
            if (!(carrierNames instanceof Collection) || !carrierNames.isEmpty()) {
                Iterator<T> it = carrierNames.iterator();
                while (it.hasNext()) {
                    if (StringsKt.l(str, (String) it.next(), true)) {
                        try {
                            Context context2 = this.f23407a;
                            Intrinsics.f(context2, "context");
                            String str2 = StringsKt.H(context2.getPackageManager().getApplicationLabel(context2.getApplicationInfo()).toString(), ' ', '_') + "_app";
                            this.d = true;
                            StringBuilder sb = new StringBuilder();
                            Random random = new Random();
                            for (int i2 = 0; i2 < 40; i2++) {
                                char cCharAt = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxxxxxx".charAt(i2);
                                if (cCharAt == 'x') {
                                    sb.append(Character.forDigit(random.nextInt(16), 16));
                                } else {
                                    sb.append(cCharAt);
                                }
                            }
                            String string = sb.toString();
                            Intrinsics.e(string, "toString(...)");
                            this.f23409c = string;
                            new C2952ba(new C2935aa(string, str2, this.f23410e), this.f23408b).a(new Y9(this));
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
            }
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23408b;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a("NovatiqDataHandler", "Novatiq disabled.. skipping");
        }
    }
}
