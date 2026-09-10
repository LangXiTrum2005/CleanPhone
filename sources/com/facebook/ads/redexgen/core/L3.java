package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class L3 {
    public static String[] A0D = {"ITeGogKqorZ7bSCIE87s8DTmQOo7Fv11", "MgkbApIEYzpKXgGasWREFXTi3GTadnaL", "OAixFelLhBe3iSBS2M", "ijopPBuuJeE4Ltql3uBrQuSo8nqq7R3R", "1SB5ttJ09JcNeK6D9rJTpC1clnicerw7", "nbktskyiJneEJjHZifeKEa33HsJGsJ62", "ZYvdfmJVTREWWhesr4Tm9ps4syTvrO", "VkO2l5JSpUAFzoG39IjRbEodOO78G96O"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC1407Hd A0C;

    public L3(InterfaceC1407Hd interfaceC1407Hd) {
        this.A0C = interfaceC1407Hd;
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
    private void A00(int i2) {
        if (this.A04 == -9223372036854775807L) {
            return;
        }
        boolean z2 = this.A0B;
        this.A0C.AIu(this.A04, z2 ? 1 : 0, (int) (this.A01 - this.A03), i2, null);
    }

    public static boolean A01(int i2) {
        return (32 <= i2 && i2 <= 35) || i2 == 39;
    }

    public static boolean A02(int i2) {
        return i2 < 32 || i2 == 40;
    }

    public final void A03() {
        this.A07 = false;
        this.A06 = false;
        this.A05 = false;
        this.A0A = false;
        this.A09 = false;
    }

    public final void A04(long j, int i2, int i3, long j2, boolean z2) {
        this.A06 = false;
        this.A05 = false;
        this.A02 = j2;
        this.A00 = 0;
        this.A01 = j;
        if (!A02(i3)) {
            if (this.A0A && !this.A09) {
                if (z2) {
                    A00(i2);
                }
                this.A0A = false;
            }
            if (A01(i3)) {
                this.A05 = !this.A09;
                this.A09 = true;
            }
        }
        this.A08 = i3 >= 16 && i3 <= 21;
        this.A07 = this.A08 || i3 <= 9;
        if (A0D[6].length() != 30) {
            throw new RuntimeException();
        }
        A0D[6] = "HIa27EP0rmwgvhPEN5RK7GL0DsepbL";
    }

    public final void A05(long j, int i2, boolean z2) {
        if (this.A09 && this.A06) {
            this.A0B = this.A08;
            this.A09 = false;
        } else {
            if (!this.A05 && !this.A06) {
                return;
            }
            if (z2 && this.A0A) {
                A00(i2 + ((int) (j - this.A01)));
            }
            this.A03 = this.A01;
            this.A04 = this.A02;
            this.A0B = this.A08;
            this.A0A = true;
        }
    }

    public final void A06(byte[] bArr, int i2, int i3) {
        if (this.A07) {
            int i4 = (i2 + 2) - this.A00;
            if (i4 < i3) {
                int headerOffset = bArr[i4];
                this.A06 = (headerOffset & 128) != 0;
                this.A07 = false;
                return;
            }
            this.A00 += i3 - i2;
        }
    }
}
