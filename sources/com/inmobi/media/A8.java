package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class A8 implements InterfaceC3034g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D8 f22688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2968c9 f22689b;

    public A8(D8 d8, C2968c9 c2968c9) {
        this.f22688a = d8;
        this.f22689b = c2968c9;
    }

    public final void a(byte b2) {
        T7 t7 = this.f22688a.f22767b;
        if (t7.t || !(t7 instanceof C2934a9) || b2 == 4) {
            return;
        }
        try {
            if (b2 == 0) {
                We we = ((C2934a9) t7).f23219p;
                if (we != null) {
                    we.a((byte) 5);
                    return;
                }
                return;
            }
            if (b2 == 1) {
                ((C2934a9) t7).g(this.f22689b);
                return;
            }
            if (b2 == 2) {
                ((C2934a9) t7).f(this.f22689b);
            } else if (b2 == 3) {
                ((C2934a9) t7).h(this.f22689b);
            } else if (b2 == 5) {
                ((C2934a9) t7).d(this.f22689b);
            }
        } catch (Exception e2) {
            D8 d8 = this.f22688a;
            InterfaceC3333z5 interfaceC3333z5 = d8.f;
            if (interfaceC3333z5 != null) {
                String str = d8.g;
                Intrinsics.e(str, "access$getTAG$p(...)");
                StringBuilder sb = new StringBuilder("SDK encountered unexpected error in handling (");
                sb.append((int) b2);
                sb.append(") event; ");
                ((A5) interfaceC3333z5).b(str, rf.a(e2, sb));
            }
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }
}
