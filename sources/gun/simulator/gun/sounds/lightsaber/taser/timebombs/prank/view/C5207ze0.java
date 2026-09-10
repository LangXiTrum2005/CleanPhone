package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.core.view.ViewCompat;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ze0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5207ze0 extends R60 {
    public final JT m = new JT();
    public final boolean n;
    public final int o;
    public final int p;
    public final String q;
    public final float r;
    public final int s;

    public C5207ze0(List list) {
        int size = list.size();
        String str = com.mbridge.msdk.playercommon.exoplayer2.C.SANS_SERIF_NAME;
        if (size != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.o = 0;
            this.p = -1;
            this.q = com.mbridge.msdk.playercommon.exoplayer2.C.SANS_SERIF_NAME;
            this.n = false;
            this.r = 0.85f;
            this.s = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.o = bArr[24];
        this.p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.q = "Serif".equals(new String(bArr, 43, bArr.length - 43, AbstractC2333Ce.c)) ? com.mbridge.msdk.playercommon.exoplayer2.C.SERIF_NAME : str;
        int i = bArr[25] * 20;
        this.s = i;
        boolean z = (bArr[0] & 32) != 0;
        this.n = z;
        if (z) {
            this.r = Ug0.i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.r = 0.85f;
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    DM.v(3, spannableStringBuilder, i3, i4, i6);
                } else {
                    DM.v(1, spannableStringBuilder, i3, i4, i6);
                }
            } else if (z2) {
                DM.v(2, spannableStringBuilder, i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            DM.v(0, spannableStringBuilder, i3, i4, i6);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.R60
    public final InterfaceC4495ra0 b(byte[] bArr, int i, boolean z) throws C4671ta0 {
        String strR;
        JT jt = this.m;
        jt.C(bArr, i);
        if (jt.a() < 2) {
            throw new C4671ta0("Unexpected subtitle format.", 0);
        }
        int iY = jt.y();
        if (iY == 0) {
            strR = "";
        } else {
            int i2 = jt.b;
            Charset charsetA = jt.A();
            int i3 = iY - (jt.b - i2);
            if (charsetA == null) {
                charsetA = AbstractC2333Ce.c;
            }
            strR = jt.r(i3, charsetA);
        }
        if (strR.isEmpty()) {
            return Ae0.b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strR);
        f(spannableStringBuilder, this.o, 0, 0, spannableStringBuilder.length(), 16711680);
        e(spannableStringBuilder, this.p, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.q;
        if (str != com.mbridge.msdk.playercommon.exoplayer2.C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fI = this.r;
        while (jt.a() >= 8) {
            int i4 = jt.b;
            int iF = jt.f();
            int iF2 = jt.f();
            if (iF2 == 1937013100) {
                if (jt.a() < 2) {
                    throw new C4671ta0("Unexpected subtitle format.", 0);
                }
                int iY2 = jt.y();
                for (int i5 = 0; i5 < iY2; i5++) {
                    if (jt.a() < 12) {
                        throw new C4671ta0("Unexpected subtitle format.", 0);
                    }
                    int iY3 = jt.y();
                    int iY4 = jt.y();
                    jt.F(2);
                    int iT = jt.t();
                    jt.F(1);
                    int iF3 = jt.f();
                    if (iY4 > spannableStringBuilder.length()) {
                        spannableStringBuilder.length();
                        AbstractC4038mJ.f();
                        iY4 = spannableStringBuilder.length();
                    }
                    int i6 = iY4;
                    if (iY3 >= i6) {
                        AbstractC4038mJ.f();
                    } else {
                        f(spannableStringBuilder, iT, this.o, iY3, i6, 0);
                        e(spannableStringBuilder, iF3, this.p, iY3, i6, 0);
                    }
                }
            } else if (iF2 == 1952608120 && this.n) {
                if (jt.a() < 2) {
                    throw new C4671ta0("Unexpected subtitle format.", 0);
                }
                fI = Ug0.i(jt.y() / this.s, 0.0f, 0.95f);
            }
            jt.E(i4 + iF);
        }
        return new Ae0(new C2417Fk(spannableStringBuilder, null, null, null, fI, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f));
    }
}
