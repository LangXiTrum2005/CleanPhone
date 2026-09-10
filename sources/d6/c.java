package d6;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f38734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f38735c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f38733a = new byte[NotificationCompat.FLAG_LOCAL_ONLY];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38736d = 0;

    public final boolean a() {
        return this.f38735c.f38723b != 0;
    }

    public final b b() {
        byte[] bArr;
        if (this.f38734b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f38735c;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) c());
        }
        if (sb2.toString().startsWith("GIF")) {
            this.f38735c.f38727f = this.f38734b.getShort();
            this.f38735c.f38728g = this.f38734b.getShort();
            int iC = c();
            b bVar = this.f38735c;
            bVar.f38729h = (iC & 128) != 0;
            bVar.f38730i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.f38735c.f38731j = c();
            b bVar2 = this.f38735c;
            c();
            bVar2.getClass();
            if (this.f38735c.f38729h && !a()) {
                b bVar3 = this.f38735c;
                bVar3.f38722a = e(bVar3.f38730i);
                b bVar4 = this.f38735c;
                bVar4.f38732k = bVar4.f38722a[bVar4.f38731j];
            }
        } else {
            this.f38735c.f38723b = 1;
        }
        if (!a()) {
            boolean z10 = false;
            while (!z10 && !a() && this.f38735c.f38724c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 == 1) {
                        f();
                    } else if (iC3 == 249) {
                        this.f38735c.f38725d = new a();
                        c();
                        int iC4 = c();
                        a aVar = this.f38735c.f38725d;
                        int i11 = (iC4 & 28) >> 2;
                        aVar.f38717g = i11;
                        if (i11 == 0) {
                            aVar.f38717g = 1;
                        }
                        aVar.f38716f = (iC4 & 1) != 0;
                        short s10 = this.f38734b.getShort();
                        if (s10 < 2) {
                            s10 = 10;
                        }
                        a aVar2 = this.f38735c.f38725d;
                        aVar2.f38719i = s10 * 10;
                        aVar2.f38718h = c();
                        c();
                    } else if (iC3 == 254) {
                        f();
                    } else if (iC3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb3 = new StringBuilder();
                        int i12 = 0;
                        while (true) {
                            bArr = this.f38733a;
                            if (i12 >= 11) {
                                break;
                            }
                            sb3.append((char) bArr[i12]);
                            i12++;
                        }
                        if (sb3.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b10 = bArr[1];
                                    byte b11 = bArr[2];
                                    this.f38735c.getClass();
                                }
                                if (this.f38736d <= 0) {
                                    break;
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (iC2 == 44) {
                    b bVar5 = this.f38735c;
                    if (bVar5.f38725d == null) {
                        bVar5.f38725d = new a();
                    }
                    bVar5.f38725d.f38711a = this.f38734b.getShort();
                    this.f38735c.f38725d.f38712b = this.f38734b.getShort();
                    this.f38735c.f38725d.f38713c = this.f38734b.getShort();
                    this.f38735c.f38725d.f38714d = this.f38734b.getShort();
                    int iC5 = c();
                    boolean z11 = (iC5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    a aVar3 = this.f38735c.f38725d;
                    aVar3.f38715e = (iC5 & 64) != 0;
                    if (z11) {
                        aVar3.f38721k = e(iPow);
                    } else {
                        aVar3.f38721k = null;
                    }
                    this.f38735c.f38725d.f38720j = this.f38734b.position();
                    c();
                    f();
                    if (!a()) {
                        b bVar6 = this.f38735c;
                        bVar6.f38724c++;
                        bVar6.f38726e.add(bVar6.f38725d);
                    }
                } else if (iC2 != 59) {
                    this.f38735c.f38723b = 1;
                } else {
                    z10 = true;
                }
            }
            b bVar7 = this.f38735c;
            if (bVar7.f38724c < 0) {
                bVar7.f38723b = 1;
            }
        }
        return this.f38735c;
    }

    public final int c() {
        try {
            return this.f38734b.get() & 255;
        } catch (Exception unused) {
            this.f38735c.f38723b = 1;
            return 0;
        }
    }

    public final void d() {
        int iC = c();
        this.f38736d = iC;
        if (iC <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                int i12 = this.f38736d;
                if (i10 >= i12) {
                    return;
                }
                i11 = i12 - i10;
                this.f38734b.get(this.f38733a, i10, i11);
                i10 += i11;
            } catch (Exception e10) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbL = l1.d.l("Error Reading Block n: ", i10, " count: ", i11, " blockSize: ");
                    sbL.append(this.f38736d);
                    Log.d("GifHeaderParser", sbL.toString(), e10);
                }
                this.f38735c.f38723b = 1;
                return;
            }
        }
    }

    public final int[] e(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f38734b.get(bArr);
            iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & 255;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & 255;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | (-16777216) | (bArr[i14] & 255);
                i11 = i16;
            }
            return iArr;
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f38735c.f38723b = 1;
            return iArr;
        }
    }

    public final void f() {
        int iC;
        do {
            iC = c();
            this.f38734b.position(Math.min(this.f38734b.position() + iC, this.f38734b.limit()));
        } while (iC > 0);
    }
}
