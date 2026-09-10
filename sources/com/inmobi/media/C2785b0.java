package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;

/* JADX INFO: renamed from: com.inmobi.media.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2785b0 {
    public final WeakReference a;
    public final String b;
    public final boolean c;
    public final AtomicBoolean d;
    public final String e;
    public C3097n9 f;

    public C2785b0(WeakReference adUnitEventListener, String adtype, boolean z) {
        Intrinsics.checkNotNullParameter(adUnitEventListener, "adUnitEventListener");
        Intrinsics.checkNotNullParameter(adtype, "adtype");
        this.a = adUnitEventListener;
        this.b = adtype;
        this.c = z;
        this.d = new AtomicBoolean(false);
        this.e = String.valueOf(polloi.saneness(C2785b0.class).taiyuan());
    }

    public final void a(C2934gk c2934gk) {
        Gh gh;
        C2959hk c2959hk;
        AtomicBoolean atomicBoolean;
        if (!this.d.getAndSet(true)) {
            Qi qi = Qi.a;
            String str = this.b;
            Boolean boolValueOf = Boolean.valueOf(this.c);
            qi.getClass();
            Qi.a(str, boolValueOf);
            AbstractC2915g1 abstractC2915g1 = (AbstractC2915g1) this.a.get();
            if (abstractC2915g1 != null) {
                abstractC2915g1.a(c2934gk);
            } else if (c2934gk != null) {
                c2934gk.b();
            }
            C3097n9 c3097n9 = this.f;
            if (c3097n9 != null) {
                c3097n9.a(this.e, "==== CHECKPOINT REACHED - IMPRESSION FIRED ====");
            }
            C3097n9 c3097n10 = this.f;
            if (c3097n10 == null || (gh = c3097n10.a) == null) {
                return;
            }
            gh.a();
            return;
        }
        C3097n9 c3097n11 = this.f;
        if (c3097n11 != null) {
            c3097n11.c(this.e, "skipping as Impression is already Called");
        }
        if (c2934gk != null) {
            C3188r1 c3188r1 = c2934gk.a;
            if (c3188r1 == null || (c2959hk = c3188r1.b) == null || (atomicBoolean = c2959hk.a) == null || !atomicBoolean.getAndSet(true)) {
                LinkedHashMap linkedHashMapA = c2934gk.a();
                linkedHashMapA.put("networkType", C3342x5.m());
                linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2179);
                String str2 = c2934gk.d;
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMapA.put("impressionId", str2);
                Wj wj = Wj.a;
                Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC2779ak.SDK);
            }
        }
    }
}
