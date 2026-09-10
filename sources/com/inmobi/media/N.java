package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes5.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f22991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22993c;
    public final AtomicBoolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22994e;
    public InterfaceC3333z5 f;

    public N(WeakReference adUnitEventListener, String adtype, boolean z2) {
        Intrinsics.f(adUnitEventListener, "adUnitEventListener");
        Intrinsics.f(adtype, "adtype");
        this.f22991a = adUnitEventListener;
        this.f22992b = adtype;
        this.f22993c = z2;
        this.d = new AtomicBoolean(false);
        this.f22994e = String.valueOf(Reflection.f43333a.b(N.class).l());
    }

    public final void a(Yd yd) {
        Zd zd;
        AtomicBoolean atomicBoolean;
        if (this.d.getAndSet(true)) {
            InterfaceC3333z5 interfaceC3333z5 = this.f;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).c(this.f22994e, "skipping as Impression is already Called");
            }
            if (yd != null) {
                U0 u0 = yd.f23379a;
                if (u0 == null || (zd = u0.f23242b) == null || (atomicBoolean = zd.f23418a) == null || !atomicBoolean.getAndSet(true)) {
                    yd.a().put("networkType", L3.q());
                    yd.a().put("errorCode", (short) 2179);
                    LinkedHashMap linkedHashMapA = yd.a();
                    Pd pd = Pd.f23077a;
                    Pd.b("AdImpressionSuccessful", linkedHashMapA, Td.SDK);
                    return;
                }
                return;
            }
            return;
        }
        Zc zc = Zc.f23411a;
        String str = this.f22992b;
        Boolean boolValueOf = Boolean.valueOf(this.f22993c);
        zc.getClass();
        Zc.a(str, boolValueOf);
        F0 f0 = (F0) this.f22991a.get();
        if (f0 != null) {
            f0.a(yd);
        } else if (yd != null) {
            yd.c();
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a(this.f22994e, "==== CHECKPOINT REACHED - IMPRESSION FIRED ====");
        }
        InterfaceC3333z5 interfaceC3333z7 = this.f;
        if (interfaceC3333z7 != null) {
            ((A5) interfaceC3333z7).b();
        }
    }
}
