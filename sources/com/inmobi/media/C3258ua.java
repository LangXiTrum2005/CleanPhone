package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3258ua extends AbstractC3230se {
    public final C3040h d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3312y0 f24025e;
    public InMobiAdRequestStatus f;
    public final InterfaceC3333z5 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WeakReference f24026h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3258ua(S0 adUnit, C3040h ad, C3312y0 adSet, InMobiAdRequestStatus status, InterfaceC3333z5 interfaceC3333z5) {
        super(adUnit, (byte) 1);
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(ad, "ad");
        Intrinsics.f(adSet, "adSet");
        Intrinsics.f(status, "status");
        this.d = ad;
        this.f24025e = adSet;
        this.f = status;
        this.g = interfaceC3333z5;
        this.f24026h = new WeakReference(adUnit);
    }

    @Override // com.inmobi.media.AbstractC3230se
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        a(((Boolean) obj).booleanValue());
    }

    @Override // com.inmobi.media.G1
    public final void c() {
        super.c();
        this.f = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY);
        a(false);
    }

    public final void a(boolean z2) {
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("ParseAdResponseWorker", "onComplete result - " + z2);
        }
        S0 s0 = (S0) this.f24026h.get();
        if (s0 != null) {
            InterfaceC3333z5 interfaceC3333z6 = this.g;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).c("ParseAdResponseWorker", "updating vitals in logger");
            }
            s0.a(z2, this.f);
            return;
        }
        InterfaceC3333z5 interfaceC3333z7 = this.g;
        if (interfaceC3333z7 != null) {
            ((A5) interfaceC3333z7).b("ParseAdResponseWorker", "onComplete - adunit is null");
        }
    }

    @Override // com.inmobi.media.G1
    public final void a() {
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("ParseAdResponseWorker", "execute task");
        }
        S0 s0 = (S0) this.f24026h.get();
        if (s0 == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.g;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).b("ParseAdResponseWorker", "adUnit is null. fail.");
            }
            b(Boolean.FALSE);
            return;
        }
        if (this.f24025e.n()) {
            InterfaceC3333z5 interfaceC3333z7 = this.g;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).c("ParseAdResponseWorker", "parsing for ad pods");
            }
            LinkedList<C3040h> linkedListF = this.f24025e.f();
            C3040h first = linkedListF.getFirst();
            Intrinsics.c(first);
            if (s0.a(first, 0, true)) {
                InterfaceC3333z5 interfaceC3333z8 = this.g;
                if (interfaceC3333z8 != null) {
                    ((A5) interfaceC3333z8).c("ParseAdResponseWorker", "parse success for ad index 0");
                }
                ListIterator<C3040h> listIterator = linkedListF.listIterator(1);
                Intrinsics.e(listIterator, "listIterator(...)");
                while (listIterator.hasNext()) {
                    C3040h next = listIterator.next();
                    if (!s0.a(next, linkedListF.indexOf(next), false)) {
                        InterfaceC3333z5 interfaceC3333z9 = this.g;
                        if (interfaceC3333z9 != null) {
                            ((A5) interfaceC3333z9).b("ParseAdResponseWorker", "parseAdResponse fail for index - " + linkedListF.indexOf(next));
                        }
                        listIterator.remove();
                    } else {
                        InterfaceC3333z5 interfaceC3333z10 = this.g;
                        if (interfaceC3333z10 != null) {
                            ((A5) interfaceC3333z10).c("ParseAdResponseWorker", "parseAdResponse success for index - " + linkedListF.indexOf(next));
                        }
                    }
                }
                b(Boolean.TRUE);
                return;
            }
            InterfaceC3333z5 interfaceC3333z11 = this.g;
            if (interfaceC3333z11 != null) {
                ((A5) interfaceC3333z11).b("ParseAdResponseWorker", "didParseAdResponseAndExtractData failed");
            }
            b(Boolean.FALSE);
            return;
        }
        InterfaceC3333z5 interfaceC3333z12 = this.g;
        if (interfaceC3333z12 != null) {
            ((A5) interfaceC3333z12).c("ParseAdResponseWorker", "parsing for single ad");
        }
        b(Boolean.valueOf(s0.a(this.d, 0, true)));
    }
}
