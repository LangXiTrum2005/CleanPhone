package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1506Kz {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final InterfaceC1407Hd A07;

    public C1506Kz(InterfaceC1407Hd interfaceC1407Hd) {
        this.A07 = interfaceC1407Hd;
    }

    public final void A00() {
        this.A05 = false;
        this.A04 = false;
        this.A06 = false;
        this.A00 = -1;
    }

    public final void A01(int i2, long j) {
        this.A00 = i2;
        this.A06 = false;
        boolean z2 = true;
        this.A05 = i2 == 182 || i2 == 179;
        if (i2 != 182) {
            z2 = false;
        }
        this.A04 = z2;
        this.A01 = 0;
        this.A03 = j;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void A02(long j, int i2, boolean z2) {
        if (this.A00 == 182 && z2 && this.A05 && this.A03 != -9223372036854775807L) {
            this.A07.AIu(this.A03, this.A06 ? 1 : 0, (int) (j - this.A02), i2, null);
        }
        if (this.A00 != 179) {
            this.A02 = j;
        }
    }

    public final void A03(byte[] bArr, int i2, int i3) {
        if (this.A04) {
            int i4 = (i2 + 1) - this.A01;
            if (i4 < i3) {
                int headerOffset = bArr[i4];
                this.A06 = ((headerOffset & PsExtractor.AUDIO_STREAM) >> 6) == 0;
                this.A04 = false;
                return;
            }
            this.A01 += i3 - i2;
        }
    }
}
