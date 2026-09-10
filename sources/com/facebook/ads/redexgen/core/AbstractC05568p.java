package com.facebook.ads.redexgen.core;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC05568p implements TQ {
    public static String[] A06 = {"O9skNSOHEC40B18XQhFWmYKa8fHVEuu8", "gWuE6VPJCQRLTUMtNAJcZ9htJhL8bA54", "33l3nlYuKi5y86D9zQtS5CSP5FzyEojC", "vYqH7SEoYM2wK2NFKLoHB", "8wZCLQdmnIaH8VYCF95mn1xZfhOb8KNs", "OKenIfnacRI0WQQ1cWQBOjQhx3Pa330A", "8E99ftLWZPwlOIXyGHmwgRo7TiqRoKoC", "VtexS4WWaGrXQLEgftjVWO6TTwVMVCJw"};
    public long A00;
    public long A01;
    public C1A A02;
    public final ArrayDeque<C1A> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC05578q> A04;
    public final PriorityQueue<C1A> A05;

    public abstract TI A0Z();

    public abstract void A0b(C05598s c05598s);

    public abstract boolean A0d();

    public AbstractC05568p() {
        for (int i = 0; i < 10; i++) {
            this.A03.add(new C1A());
        }
        this.A04 = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque<AbstractC05578q> arrayDeque = this.A04;
            final InterfaceC1041Sp interfaceC1041Sp = new InterfaceC1041Sp() { // from class: com.facebook.ads.redexgen.X.TM
                @Override // com.facebook.ads.redexgen.core.InterfaceC1041Sp
                public final void AGr(AbstractC1141Wu abstractC1141Wu) {
                    this.A00.A0c((AnonymousClass19) abstractC1141Wu);
                }
            };
            arrayDeque.add(new AbstractC05578q(interfaceC1041Sp) { // from class: com.facebook.ads.redexgen.X.19
                public InterfaceC1041Sp<AnonymousClass19> A00;

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Sp != com.google.android.exoplayer2.decoder.DecoderOutputBuffer$Owner<com.google.android.exoplayer2.extractor.text.cea.CeaDecoder$CeaOutputBuffer> */
                {
                    this.A00 = interfaceC1041Sp;
                }

                @Override // com.facebook.ads.redexgen.core.AbstractC05578q, com.facebook.ads.redexgen.core.AbstractC1141Wu
                public final void A0B() {
                    this.A00.AGr(this);
                }
            });
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0U(C1A c1a) {
        c1a.A0A();
        this.A03.add(c1a);
    }

    public final long A0V() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1037Sl
    /* JADX INFO: renamed from: A0W, reason: merged with bridge method [inline-methods] */
    public C05598s A5h() throws TP {
        AbstractC1517es.A08(this.A02 == null);
        if (this.A03.isEmpty()) {
            return null;
        }
        this.A02 = this.A03.pollFirst();
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1037Sl
    /* JADX INFO: renamed from: A0X */
    public AbstractC05578q A5j() throws TP {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (!this.A05.isEmpty() && ((C1A) AbstractC1600gE.A0f(this.A05.peek())).A01 <= this.A00) {
            C1A c1a = (C1A) AbstractC1600gE.A0f(this.A05.poll());
            if (c1a.A05()) {
                AbstractC05578q outputBuffer = (AbstractC05578q) AbstractC1600gE.A0f(this.A04.pollFirst());
                outputBuffer.A00(4);
                A0U(c1a);
                return outputBuffer;
            }
            A0b(c1a);
            if (A0d()) {
                TI tiA0Z = A0Z();
                AbstractC05578q abstractC05578q = (AbstractC05578q) AbstractC1600gE.A0f(this.A04.pollFirst());
                abstractC05578q.A0C(c1a.A01, tiA0Z, Long.MAX_VALUE);
                A0U(c1a);
                return abstractC05578q;
            }
            A0U(c1a);
        }
        return null;
    }

    public final AbstractC05578q A0Y() {
        return this.A04.pollFirst();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1037Sl
    /* JADX INFO: renamed from: A0a, reason: merged with bridge method [inline-methods] */
    public void AGR(C05598s c05598s) throws TP {
        AbstractC1517es.A07(c05598s == this.A02);
        C1A c1a = (C1A) c05598s;
        if (c1a.A04()) {
            A0U(c1a);
        } else {
            long j = this.A01;
            this.A01 = 1 + j;
            c1a.A00 = j;
            this.A05.add(c1a);
        }
        this.A02 = null;
    }

    public final void A0c(AbstractC05578q abstractC05578q) {
        abstractC05578q.A0A();
        this.A04.add(abstractC05578q);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1037Sl
    public void AGj() {
    }

    @Override // com.facebook.ads.redexgen.core.TQ
    public void AIn(long j) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1037Sl
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0U((C1A) AbstractC1600gE.A0f(this.A05.poll()));
        }
        if (this.A02 != null) {
            A0U(this.A02);
            if (A06[3].length() != 21) {
                throw new RuntimeException();
            }
            A06[5] = "iTBT7p9I8yIjGBBhrfrQicNBaJh4TF2s";
            this.A02 = null;
        }
    }
}
