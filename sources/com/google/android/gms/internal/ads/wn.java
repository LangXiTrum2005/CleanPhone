package com.google.android.gms.internal.ads;

import android.graphics.Color;
import com.ironsource.InterfaceC0435l1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wn extends go {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f21545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f21546j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f21548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f21549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21554h;

    static {
        int iRgb = Color.rgb(12, 174, InterfaceC0435l1.c.b.f29101g);
        f21545i = Color.rgb(204, 204, 204);
        f21546j = iRgb;
    }

    public wn(String str, List list, Integer num, Integer num2, Integer num3, int i10, int i11) {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        this.f21548b = new ArrayList();
        this.f21549c = new ArrayList();
        this.f21547a = str;
        for (int i12 = 0; i12 < list.size(); i12++) {
            yn ynVar = (yn) list.get(i12);
            this.f21548b.add(ynVar);
            this.f21549c.add(ynVar);
        }
        this.f21550d = num != null ? num.intValue() : f21545i;
        this.f21551e = num2 != null ? num2.intValue() : f21546j;
        this.f21552f = num3 != null ? num3.intValue() : 12;
        this.f21553g = i10;
        this.f21554h = i11;
    }

    @Override // com.google.android.gms.internal.ads.ho
    public final String zzb() {
        return this.f21547a;
    }

    @Override // com.google.android.gms.internal.ads.ho
    public final ArrayList zzc() {
        return this.f21549c;
    }
}
