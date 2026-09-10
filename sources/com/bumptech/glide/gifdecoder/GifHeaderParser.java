package com.bumptech.glide.gifdecoder;

import android.util.Log;
import androidx.datastore.preferences.protobuf.a;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class GifHeaderParser {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f12339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GifHeader f12340c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f12338a = new byte[256];
    public int d = 0;

    public final boolean a() {
        return this.f12340c.f12333b != 0;
    }

    public final GifHeader b() {
        byte[] bArr;
        if (this.f12339b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f12340c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 6; i2++) {
            sb.append((char) c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f12340c.f = this.f12339b.getShort();
            this.f12340c.g = this.f12339b.getShort();
            int iC = c();
            GifHeader gifHeader = this.f12340c;
            gifHeader.f12336h = (iC & 128) != 0;
            gifHeader.f12337i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.f12340c.j = c();
            GifHeader gifHeader2 = this.f12340c;
            c();
            gifHeader2.getClass();
            if (this.f12340c.f12336h && !a()) {
                GifHeader gifHeader3 = this.f12340c;
                gifHeader3.f12332a = e(gifHeader3.f12337i);
                GifHeader gifHeader4 = this.f12340c;
                gifHeader4.k = gifHeader4.f12332a[gifHeader4.j];
            }
        } else {
            this.f12340c.f12333b = 1;
        }
        if (!a()) {
            boolean z2 = false;
            while (!z2 && !a() && this.f12340c.f12334c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 == 1) {
                        f();
                    } else if (iC3 == 249) {
                        this.f12340c.d = new GifFrame();
                        c();
                        int iC4 = c();
                        GifFrame gifFrame = this.f12340c.d;
                        int i3 = (iC4 & 28) >> 2;
                        gifFrame.g = i3;
                        if (i3 == 0) {
                            gifFrame.g = 1;
                        }
                        gifFrame.f = (iC4 & 1) != 0;
                        short s = this.f12339b.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        GifFrame gifFrame2 = this.f12340c.d;
                        gifFrame2.f12331i = s * 10;
                        gifFrame2.f12330h = c();
                        c();
                    } else if (iC3 == 254) {
                        f();
                    } else if (iC3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb2 = new StringBuilder();
                        int i4 = 0;
                        while (true) {
                            bArr = this.f12338a;
                            if (i4 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i4]);
                            i4++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b2 = bArr[1];
                                    byte b3 = bArr[2];
                                    this.f12340c.getClass();
                                }
                                if (this.d <= 0) {
                                    break;
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (iC2 == 44) {
                    GifHeader gifHeader5 = this.f12340c;
                    if (gifHeader5.d == null) {
                        gifHeader5.d = new GifFrame();
                    }
                    gifHeader5.d.f12326a = this.f12339b.getShort();
                    this.f12340c.d.f12327b = this.f12339b.getShort();
                    this.f12340c.d.f12328c = this.f12339b.getShort();
                    this.f12340c.d.d = this.f12339b.getShort();
                    int iC5 = c();
                    boolean z3 = (iC5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    GifFrame gifFrame3 = this.f12340c.d;
                    gifFrame3.f12329e = (iC5 & 64) != 0;
                    if (z3) {
                        gifFrame3.k = e(iPow);
                    } else {
                        gifFrame3.k = null;
                    }
                    this.f12340c.d.j = this.f12339b.position();
                    c();
                    f();
                    if (!a()) {
                        GifHeader gifHeader6 = this.f12340c;
                        gifHeader6.f12334c++;
                        gifHeader6.f12335e.add(gifHeader6.d);
                    }
                } else if (iC2 != 59) {
                    this.f12340c.f12333b = 1;
                } else {
                    z2 = true;
                }
            }
            GifHeader gifHeader7 = this.f12340c;
            if (gifHeader7.f12334c < 0) {
                gifHeader7.f12333b = 1;
            }
        }
        return this.f12340c;
    }

    public final int c() {
        try {
            return this.f12339b.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        } catch (Exception unused) {
            this.f12340c.f12333b = 1;
            return 0;
        }
    }

    public final void d() {
        int iC = c();
        this.d = iC;
        if (iC <= 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            try {
                int i4 = this.d;
                if (i2 >= i4) {
                    return;
                }
                i3 = i4 - i2;
                this.f12339b.get(this.f12338a, i2, i3);
                i2 += i3;
            } catch (Exception e2) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbP = a.p(i2, i3, "Error Reading Block n: ", " count: ", " blockSize: ");
                    sbP.append(this.d);
                    Log.d("GifHeaderParser", sbP.toString(), e2);
                }
                this.f12340c.f12333b = 1;
                return;
            }
        }
    }

    public final int[] e(int i2) {
        byte[] bArr = new byte[i2 * 3];
        int[] iArr = null;
        try {
            this.f12339b.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i6 = i4 + 2;
                int i7 = bArr[i4 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                i4 += 3;
                int i8 = i3 + 1;
                iArr[i3] = (i7 << 8) | (i5 << 16) | (-16777216) | (bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                i3 = i8;
            }
            return iArr;
        } catch (BufferUnderflowException e2) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e2);
            }
            this.f12340c.f12333b = 1;
            return iArr;
        }
    }

    public final void f() {
        int iC;
        do {
            iC = c();
            this.f12339b.position(Math.min(this.f12339b.position() + iC, this.f12339b.limit()));
        } while (iC > 0);
    }
}
