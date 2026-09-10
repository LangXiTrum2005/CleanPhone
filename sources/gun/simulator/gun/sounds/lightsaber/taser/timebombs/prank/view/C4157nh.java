package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C4157nh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NF f4754a;
    public boolean b;

    public C4157nh(NF nf) {
        AbstractC2995aW.q(nf, "writer");
        this.f4754a = nf;
        this.b = true;
    }

    public void a() {
        this.b = true;
    }

    public void b() {
        this.b = false;
    }

    public void c(byte b) {
        long j = b;
        NF nf = this.f4754a;
        nf.getClass();
        nf.c(String.valueOf(j));
    }

    public final void d(char c) {
        NF nf = this.f4754a;
        nf.a(nf.b, 1);
        char[] cArr = nf.f3448a;
        int i = nf.b;
        nf.b = i + 1;
        cArr[i] = c;
    }

    public void e(int i) {
        long j = i;
        NF nf = this.f4754a;
        nf.getClass();
        nf.c(String.valueOf(j));
    }

    public void f(long j) {
        NF nf = this.f4754a;
        nf.getClass();
        nf.c(String.valueOf(j));
    }

    public final void g(String str) {
        AbstractC2995aW.q(str, com.umeng.analytics.pro.bc.aK);
        this.f4754a.c(str);
    }

    public void h(short s) {
        long j = s;
        NF nf = this.f4754a;
        nf.getClass();
        nf.c(String.valueOf(j));
    }

    public final void i(String str) {
        byte b;
        AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        NF nf = this.f4754a;
        nf.getClass();
        nf.a(nf.b, str.length() + 2);
        char[] cArr = nf.f3448a;
        int i = nf.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = V90.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    nf.a(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = V90.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        nf.f3448a[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = V90.f3862a[cCharAt];
                        AbstractC2995aW.n(str2);
                        nf.a(i4, str2.length());
                        str2.getChars(0, str2.length(), nf.f3448a, i4);
                        int length3 = str2.length() + i4;
                        nf.b = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = nf.f3448a;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        nf.b = i4;
                    }
                }
                nf.a(i4, 1);
                nf.f3448a[i4] = '\"';
                nf.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        nf.b = i3 + 1;
    }

    public void j() {
    }

    public void k() {
    }
}
