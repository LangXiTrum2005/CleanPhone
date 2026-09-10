package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.view.InputDeviceCompat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4345pn implements InterfaceC3943lC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f4850a = "Exif\u0000\u0000".getBytes(Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
    public static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int e(InterfaceC4257on interfaceC4257on, C4391qK c4391qK) {
        int iB;
        short sE;
        try {
            int iB2 = interfaceC4257on.b();
            if ((iB2 & 65496) != 65496 && iB2 != 19789 && iB2 != 18761) {
                return -1;
            }
            while (true) {
                if (interfaceC4257on.e() == 255 && (sE = interfaceC4257on.e()) != 218 && sE != 217) {
                    iB = interfaceC4257on.b() - 2;
                    if (sE == 225) {
                        break;
                    }
                    long j = iB;
                    if (interfaceC4257on.skip(j) != j) {
                        iB = -1;
                        break;
                    }
                } else {
                    iB = -1;
                    break;
                }
            }
            if (iB == -1) {
                return -1;
            }
            byte[] bArr = (byte[]) c4391qK.d(iB, byte[].class);
            try {
                return g(interfaceC4257on, bArr, iB);
            } finally {
                c4391qK.h(bArr);
            }
        } catch (C4169nn unused) {
            return -1;
        }
    }

    public static ImageHeaderParser$ImageType f(InterfaceC4257on interfaceC4257on) {
        try {
            int iB = interfaceC4257on.b();
            if (iB == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iE = (iB << 8) | interfaceC4257on.e();
            if (iE == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iE2 = (iE << 8) | interfaceC4257on.e();
            if (iE2 == -1991225785) {
                interfaceC4257on.skip(21L);
                try {
                    return interfaceC4257on.e() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (C4169nn unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iE2 == 1380533830) {
                interfaceC4257on.skip(4L);
                if (((interfaceC4257on.b() << 16) | interfaceC4257on.b()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iB2 = (interfaceC4257on.b() << 16) | interfaceC4257on.b();
                if ((iB2 & InputDeviceCompat.SOURCE_ANY) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iB2 & 255;
                if (i != 88) {
                    if (i != 76) {
                        return ImageHeaderParser$ImageType.WEBP;
                    }
                    interfaceC4257on.skip(4L);
                    return (interfaceC4257on.e() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                interfaceC4257on.skip(4L);
                short sE = interfaceC4257on.e();
                if ((sE & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                return (sE & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((interfaceC4257on.b() << 16) | interfaceC4257on.b()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iB3 = (interfaceC4257on.b() << 16) | interfaceC4257on.b();
            if (iB3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iB3 == 1635150182;
            interfaceC4257on.skip(4L);
            int i3 = iE2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iB4 = (interfaceC4257on.b() << 16) | interfaceC4257on.b();
                    if (iB4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iB4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (C4169nn unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int g(InterfaceC4257on interfaceC4257on, byte[] bArr, int i) {
        short sC;
        int i2;
        int i3;
        if (interfaceC4257on.c(i, bArr) != i) {
            return -1;
        }
        byte[] bArr2 = f4850a;
        boolean z = i > bArr2.length;
        if (z) {
            for (int i4 = 0; i4 < bArr2.length; i4++) {
                if (bArr[i4] != bArr2[i4]) {
                    return -1;
                }
            }
        }
        if (!z) {
            return -1;
        }
        C4081mn c4081mn = new C4081mn(bArr, i);
        short sC2 = c4081mn.c(6);
        ByteOrder byteOrder = sC2 != 18761 ? sC2 != 19789 ? ByteOrder.BIG_ENDIAN : ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN;
        ByteBuffer byteBuffer = c4081mn.f4716a;
        byteBuffer.order(byteOrder);
        int i5 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
        short sC3 = c4081mn.c(i5 + 6);
        for (int i6 = 0; i6 < sC3; i6++) {
            int i7 = (i6 * 12) + i5 + 8;
            if (c4081mn.c(i7) == 274 && (sC = c4081mn.c(i7 + 2)) >= 1 && sC <= 12) {
                int i8 = i7 + 4;
                int i9 = byteBuffer.remaining() - i8 >= 4 ? byteBuffer.getInt(i8) : -1;
                if (i9 >= 0 && (i2 = i9 + b[sC]) <= 4 && (i3 = i7 + 8) >= 0 && i3 <= byteBuffer.remaining() && i2 >= 0 && i2 + i3 <= byteBuffer.remaining()) {
                    return c4081mn.c(i3);
                }
            }
        }
        return -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3943lC
    public final int a(ByteBuffer byteBuffer, C4391qK c4391qK) {
        AbstractC2871Wx.V(byteBuffer, "Argument must not be null");
        C4031mC c4031mC = new C4031mC(byteBuffer);
        AbstractC2871Wx.V(c4391qK, "Argument must not be null");
        return e(c4031mC, c4391qK);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3943lC
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        AbstractC2871Wx.V(byteBuffer, "Argument must not be null");
        return f(new C4031mC(byteBuffer));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3943lC
    public final int c(InputStream inputStream, C4391qK c4391qK) {
        AbstractC2871Wx.V(inputStream, "Argument must not be null");
        NN nn = new NN(inputStream, 10);
        AbstractC2871Wx.V(c4391qK, "Argument must not be null");
        return e(nn, c4391qK);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3943lC
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        AbstractC2871Wx.V(inputStream, "Argument must not be null");
        return f(new NN(inputStream, 10));
    }
}
