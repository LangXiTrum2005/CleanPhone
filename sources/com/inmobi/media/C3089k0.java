package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3089k0 implements Va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3153o0 f23734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Dd f23736c;
    public final /* synthetic */ String d;

    public C3089k0(C3153o0 c3153o0, boolean z2, Dd dd, String str) {
        this.f23734a = c3153o0;
        this.f23735b = z2;
        this.f23736c = dd;
        this.d = str;
    }

    @Override // com.inmobi.media.Va
    public final void a(Object obj) {
        String result = (String) obj;
        Intrinsics.f(result, "result");
        C3153o0 c3153o0 = this.f23734a;
        StringBuilder sbY = android.support.v4.media.a.y("file saved - ", result, " , isReporting - ");
        sbY.append(this.f23735b);
        c3153o0.a(sbY.toString());
        C3153o0 c3153o1 = this.f23734a;
        Dd process = this.f23736c;
        String beacon = this.d;
        boolean z2 = this.f23735b;
        c3153o1.getClass();
        Intrinsics.f(process, "process");
        Intrinsics.f(beacon, "beacon");
        Unit unit = null;
        if (z2) {
            c3153o1.a(new AdQualityResult(result, null, beacon, c3153o1.k.toString()), false);
            return;
        }
        c3153o1.f.remove(process);
        AdQualityResult adQualityResult = c3153o1.f23847i;
        if (adQualityResult != null) {
            adQualityResult.setImageLocation(result);
            unit = Unit.f43263a;
        }
        if (unit == null) {
            c3153o1.f23847i = new AdQualityResult(result, null, beacon, null, 8, null);
        }
        c3153o1.a("file is saved. result - " + c3153o1.f23847i);
        c3153o1.a(true);
    }

    @Override // com.inmobi.media.Va
    public final void onError(Exception exc) {
        C3153o0 c3153o0 = this.f23734a;
        Dd process = this.f23736c;
        c3153o0.getClass();
        Intrinsics.f(process, "process");
        c3153o0.a(exc, "error in running process - ".concat("Dd"));
        c3153o0.f.remove(process);
        c3153o0.a(true);
    }
}
