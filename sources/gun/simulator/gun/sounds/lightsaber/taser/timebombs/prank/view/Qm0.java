package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class Qm0 implements InterfaceC4906w9, InterfaceC3392ey, ModelLoaderFactory, InterfaceC2867Wt, InterfaceC2603Mp, InterfaceC4158nh0, InterfaceC4230oZ, InterfaceC4651tH, InterfaceC2481Hw, InterfaceC4968wt, InterfaceC4934wa, InterfaceC4218oN, InterfaceC3954lN, InterfaceC2951Zz, InterfaceC3368eh0 {
    public static Qm0 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3624a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Qm0() {
        this(1);
        this.f3624a = 1;
    }

    public static synchronized Qm0 A() {
        Qm0 qm0;
        synchronized (Qm0.class) {
            try {
                if (b == null) {
                    b = new Qm0(0);
                }
                qm0 = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qm0;
        return qm0;
    }

    public static void B(Context context, String str, HashMap map) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Byte) {
                    bundle.putByte(str2, ((Byte) value).byteValue());
                } else if (value instanceof String) {
                    bundle.putString(str2, (String) value);
                } else if (value instanceof Character) {
                    bundle.putChar(str2, ((Character) value).charValue());
                } else if (value instanceof Short) {
                    bundle.putShort(str2, ((Short) value).shortValue());
                } else if (value instanceof Float) {
                    bundle.putFloat(str2, ((Float) value).floatValue());
                } else if (value instanceof CharSequence) {
                    bundle.putCharSequence(str2, (CharSequence) value);
                } else if (value instanceof Parcelable) {
                    bundle.putParcelable(str2, (Parcelable) value);
                } else if (value instanceof Parcelable[]) {
                    bundle.putParcelableArray(str2, (Parcelable[]) value);
                } else if (value instanceof ArrayList) {
                    bundle.putParcelableArrayList(str2, (ArrayList) value);
                } else if (value instanceof SparseArray) {
                    bundle.putSparseParcelableArray(str2, (SparseArray) value);
                } else if (value instanceof Serializable) {
                    bundle.putSerializable(str2, (Serializable) value);
                }
            }
            AbstractC3375el.M(context, str, bundle);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static MediaCodec C(C4130nN c4130nN) throws IOException {
        c4130nN.f4740a.getClass();
        String str = c4130nN.f4740a.f5075a;
        FW.c("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        FW.A();
        return mediaCodecCreateByCodecName;
    }

    public static String D(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2867Wt
    public Class a() {
        return InputStream.class;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2867Wt
    public void b(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4906w9
    public boolean d(float f) {
        throw new IllegalStateException("not implemented");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4906w9
    public C5090yG f() {
        throw new IllegalStateException("not implemented");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3954lN
    public long g() {
        throw new NoSuchElementException();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5194zW
    public Object get() {
        switch (this.f3624a) {
            case 23:
                return new N20(Executors.newSingleThreadExecutor(), 0);
            case 24:
                return Integer.valueOf(C3928l30.d);
            default:
                return new C5211zg0(1);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4906w9
    public boolean h(float f) {
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3954lN
    public long i() {
        throw new NoSuchElementException();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4906w9
    public boolean isEmpty() {
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4906w9
    public float j() {
        return 0.0f;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2951Zz
    public LT k() {
        return new C2925Yz(C2847Vz.n, null);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d2  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3368eh0
    public Object m(MF mf, float f) {
        int i;
        int i2;
        float f2;
        int iArgb;
        int iArgb2;
        float f3;
        float fE;
        ArrayList arrayList = new ArrayList();
        int i3 = 1;
        boolean z = mf.t() == 1;
        if (z) {
            mf.h();
        }
        while (mf.o()) {
            arrayList.add(Float.valueOf((float) mf.q()));
        }
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f3624a = 2;
        }
        if (z) {
            mf.m();
        }
        if (this.f3624a == -1) {
            this.f3624a = arrayList.size() / 4;
        }
        int i4 = this.f3624a;
        float[] fArr = new float[i4];
        int[] iArr = new int[i4];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = this.f3624a * 4;
            if (i5 >= i) {
                break;
            }
            int i8 = i5 / 4;
            double dFloatValue = ((Float) arrayList.get(i5)).floatValue();
            int i9 = i5 % 4;
            if (i9 != 0) {
                if (i9 == i3) {
                    i6 = (int) (dFloatValue * 255.0d);
                } else if (i9 == 2) {
                    i7 = (int) (dFloatValue * 255.0d);
                } else if (i9 == 3) {
                    iArr[i8] = Color.argb(255, i6, i7, (int) (dFloatValue * 255.0d));
                }
            } else if (i8 > 0) {
                float f4 = (float) dFloatValue;
                if (fArr[i8 - 1] >= f4) {
                    fArr[i8] = f4 + 0.01f;
                } else {
                    fArr[i8] = (float) dFloatValue;
                }
            } else {
                fArr[i8] = (float) dFloatValue;
            }
            i5++;
            i3 = 1;
        }
        C4182ny c4182ny = new C4182ny(fArr, iArr);
        if (arrayList.size() <= i) {
            return c4182ny;
        }
        int size = (arrayList.size() - i) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i10 = 0;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr2[i10] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr3[i10] = ((Float) arrayList.get(i)).floatValue();
                i10++;
            }
            i++;
        }
        float[] fArrCopyOf = c4182ny.f4768a;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size != 0) {
            int length = fArrCopyOf.length + size;
            float[] fArr4 = new float[length];
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < length; i14++) {
                float f5 = i12 < fArrCopyOf.length ? fArrCopyOf[i12] : Float.NaN;
                float f6 = i13 < size ? fArr2[i13] : Float.NaN;
                if (Float.isNaN(f6) || f5 < f6) {
                    fArr4[i14] = f5;
                    i12++;
                } else if (Float.isNaN(f5) || f6 < f5) {
                    fArr4[i14] = f6;
                    i13++;
                } else {
                    fArr4[i14] = f5;
                    i12++;
                    i13++;
                    i11++;
                }
            }
            fArrCopyOf = i11 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i11);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        for (int i15 = 0; i15 < length2; i15++) {
            float f7 = fArrCopyOf[i15];
            int iBinarySearch = Arrays.binarySearch(fArr, f7);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f7);
            int[] iArr3 = c4182ny.b;
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f8 = fArr3[iBinarySearch2];
                if (iArr3.length < 2 || f7 == fArr[0]) {
                    i2 = iArr3[0];
                } else {
                    int i16 = 1;
                    while (true) {
                        if (i16 >= i4) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f2 = fArr[i16];
                        if (f2 >= f7 || i16 == i4 - 1) {
                            break;
                        }
                        i16++;
                    }
                    if (i16 != i4 - 1 || f7 < f2) {
                        int i17 = i16 - 1;
                        float f9 = fArr[i17];
                        int iU = AbstractC2340Cl.u((f7 - f9) / (f2 - f9), iArr3[i17], iArr3[i16]);
                        iArgb = Color.argb((int) (f8 * 255.0f), Color.red(iU), Color.green(iU), Color.blue(iU));
                    } else {
                        iArgb = Color.argb((int) (f8 * 255.0f), Color.red(iArr3[i16]), Color.green(iArr3[i16]), Color.blue(iArr3[i16]));
                    }
                    i2 = iArgb;
                }
                iArr2[i15] = i2;
            } else {
                int i18 = iArr3[iBinarySearch];
                if (size < 2 || f7 <= fArr2[0]) {
                    iArgb2 = Color.argb((int) (fArr3[0] * 255.0f), Color.red(i18), Color.green(i18), Color.blue(i18));
                } else {
                    int i19 = 1;
                    while (true) {
                        if (i19 >= size) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f3 = fArr2[i19];
                        if (f3 >= f7 || i19 == size - 1) {
                            break;
                        }
                        i19++;
                    }
                    if (f3 <= f7) {
                        fE = fArr3[i19];
                    } else {
                        int i20 = i19 - 1;
                        float f10 = fArr2[i20];
                        fE = AbstractC5187zP.e(fArr3[i20], fArr3[i19], (f7 - f10) / (f3 - f10));
                    }
                    iArgb2 = Color.argb((int) (fE * 255.0f), Color.red(i18), Color.green(i18), Color.blue(i18));
                }
                iArr2[i15] = iArgb2;
            }
        }
        return new C4182ny(fArrCopyOf, iArr2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4230oZ
    public int n(YS ys) {
        return 1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3954lN
    public boolean next() {
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2951Zz
    public LT p(C2847Vz c2847Vz, C2743Rz c2743Rz) {
        return new C2925Yz(c2847Vz, c2743Rz);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2867Wt
    public Object q(File file) {
        return new FileInputStream(file);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4158nh0
    public void r(MediaExtractor mediaExtractor, Object obj) throws IOException {
        switch (this.f3624a) {
            case 14:
                mediaExtractor.setDataSource(new C4070mh0((ByteBuffer) obj));
                break;
            default:
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4651tH
    public void s(InterfaceC4827vH interfaceC4827vH) {
        interfaceC4827vH.onStart();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4906w9
    public float u() {
        return 1.0f;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4218oN
    public InterfaceC4306pN v(C4130nN c4130nN) {
        MediaCodec mediaCodecC = null;
        try {
            mediaCodecC = C(c4130nN);
            FW.c("configureCodec");
            mediaCodecC.configure(c4130nN.b, c4130nN.d, c4130nN.e, 0);
            FW.A();
            FW.c("startCodec");
            mediaCodecC.start();
            FW.A();
            return new Na0(mediaCodecC);
        } catch (IOException | RuntimeException e) {
            if (mediaCodecC != null) {
                mediaCodecC.release();
            }
            throw e;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3473fr
    public boolean w(Object obj, File file, YS ys) throws Throwable {
        try {
            AbstractC3092bc.d(((C3940l90) ((GifDrawable) ((InterfaceC3616hZ) obj).get()).f218a.f3291a.f3580a).d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3392ey
    public void x(Throwable th) {
        switch (this.f3624a) {
            case 6:
                return;
            default:
                throw new RuntimeException("Request threw uncaught throwable", th);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4158nh0
    public void y(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f3624a) {
            case 14:
                mediaMetadataRetriever.setDataSource(new C4070mh0((ByteBuffer) obj));
                break;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public FP z(C3166cQ c3166cQ) {
        int i = 0;
        switch (this.f3624a) {
            case 8:
                return new C2745Sb(new Wm0(this, 7), i);
            case 9:
                return new C2875Xb(i);
            case 10:
            default:
                return new Dg0(c3166cQ.c(C3742iy.class, InputStream.class));
            case 11:
                return new U90(c3166cQ.c(Uri.class, ParcelFileDescriptor.class), i);
        }
    }

    public /* synthetic */ Qm0(int i) {
        this.f3624a = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2603Mp
    public void t() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4934wa
    public long c(long j) {
        return j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2481Hw
    public void e(Activity activity) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4651tH
    public void l(InterfaceC4827vH interfaceC4827vH) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2603Mp
    public void o(Bitmap bitmap, InterfaceC2459Ha interfaceC2459Ha) {
    }
}
