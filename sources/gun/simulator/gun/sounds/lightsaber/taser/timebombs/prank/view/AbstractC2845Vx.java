package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.R;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.TypedValue;
import androidx.fragment.app.FragmentActivity;
import com.badlogic.gdx.graphics.GL20;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Vx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2845Vx implements InterfaceC2548Kl, InterfaceC4421qh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f3900a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final C4710tz c = new C4710tz(24);
    public static final C5049xn0 d = new C5049xn0(0);

    public static File F(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, DM.h(str2, ".temp"));
    }

    public static Object G(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void H(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i);
        }
    }

    public static int I(float f, int i) {
        return Color.argb(Math.round(Color.alpha(i) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static final boolean J(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        AbstractC2995aW.q(bArr, "a");
        AbstractC2995aW.q(bArr2, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
        if (i3 <= 0) {
            return true;
        }
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
            if (i5 >= i3) {
                return true;
            }
            i4 = i5;
        }
    }

    public static void K(int i, int i2) throws C2819Ux {
        GLES20.glBindTexture(i, i2);
        N();
        GLES20.glTexParameteri(i, 10240, GL20.GL_LINEAR);
        N();
        GLES20.glTexParameteri(i, GL20.GL_TEXTURE_MIN_FILTER, GL20.GL_LINEAR);
        N();
        GLES20.glTexParameteri(i, GL20.GL_TEXTURE_WRAP_S, GL20.GL_CLAMP_TO_EDGE);
        N();
        GLES20.glTexParameteri(i, GL20.GL_TEXTURE_WRAP_T, GL20.GL_CLAMP_TO_EDGE);
        N();
    }

    public static byte[] L(int i, int i2) {
        int i3 = -1;
        for (int i4 = 0; i4 < 13; i4++) {
            if (i == f3900a[i4]) {
                i3 = i4;
            }
        }
        int i5 = -1;
        for (int i6 = 0; i6 < 16; i6++) {
            if (i2 == b[i6]) {
                i5 = i6;
            }
        }
        if (i == -1 || i5 == -1) {
            throw new IllegalArgumentException(AbstractC3888ke0.h("Invalid sample rate or number of channels: ", i, ", ", i2));
        }
        return M(2, i3, i5);
    }

    public static byte[] M(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    public static void N() throws C2819Ux {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(iGlGetError));
            z = true;
        }
        if (z) {
            throw new C2819Ux(sb.toString());
        }
    }

    public static void O(String str, boolean z) throws C2819Ux {
        if (!z) {
            throw new C2819Ux(str);
        }
    }

    public static final void P(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbP = DM.p("size=", j, " offset=");
            sbP.append(j2);
            sbP.append(" byteCount=");
            sbP.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbP.toString());
        }
    }

    public static void Q(long j, JT jt, InterfaceC4326pd0[] interfaceC4326pd0Arr) {
        int i;
        int iT;
        while (true) {
            if (jt.a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (jt.a() == 0) {
                    i = -1;
                    break;
                }
                int iT2 = jt.t();
                i2 += iT2;
                if (iT2 != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            do {
                if (jt.a() == 0) {
                    i3 = -1;
                    break;
                } else {
                    iT = jt.t();
                    i3 += iT;
                }
            } while (iT == 255);
            int i4 = jt.b + i3;
            if (i3 == -1 || i3 > jt.a()) {
                AbstractC4038mJ.f();
                i4 = jt.c;
            } else if (i == 4 && i3 >= 8) {
                int iT3 = jt.t();
                int iY = jt.y();
                int iF = iY == 49 ? jt.f() : 0;
                int iT4 = jt.t();
                if (iY == 47) {
                    jt.F(1);
                }
                boolean z = iT3 == 181 && (iY == 49 || iY == 47) && iT4 == 3;
                if (iY == 49) {
                    z &= iF == 1195456820;
                }
                if (z) {
                    R(j, jt, interfaceC4326pd0Arr);
                }
            }
            jt.E(i4);
        }
    }

    public static void R(long j, JT jt, InterfaceC4326pd0[] interfaceC4326pd0Arr) {
        int iT = jt.t();
        if ((iT & 64) != 0) {
            jt.F(1);
            int i = (iT & 31) * 3;
            int i2 = jt.b;
            for (InterfaceC4326pd0 interfaceC4326pd0 : interfaceC4326pd0Arr) {
                jt.E(i2);
                interfaceC4326pd0.d(i, jt);
                if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    interfaceC4326pd0.a(j, 1, i, 0, null);
                }
            }
        }
    }

    public static C3789jY S(com.bumptech.glide.a aVar, List list) {
        InterfaceC3966lZ c2797Ub;
        InterfaceC3966lZ c2355Da;
        int i;
        int i2;
        InterfaceC2459Ha interfaceC2459Ha = aVar.f214a;
        C2923Yx c2923Yx = aVar.c;
        Context applicationContext = c2923Yx.getApplicationContext();
        C3568gy c3568gy = c2923Yx.h;
        C3789jY c3789jY = new C3789jY();
        C4345pn c4345pn = new C4345pn();
        H4 h4 = c3789jY.g;
        synchronized (h4) {
            h4.f3152a.add(c4345pn);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 27) {
            c3789jY.j(new C4703ts());
        }
        Resources resources = applicationContext.getResources();
        List listF = c3789jY.f();
        C4391qK c4391qK = aVar.d;
        C2901Yb c2901Yb = new C2901Yb(applicationContext, listF, interfaceC2459Ha, c4391qK);
        C4246oh0 c4246oh0 = new C4246oh0(interfaceC2459Ha, new Qm0(15));
        C2629Np c2629Np = new C2629Np(c3789jY.f(), resources.getDisplayMetrics(), interfaceC2459Ha, c4391qK);
        int i4 = 2;
        int i5 = 0;
        if (i3 < 28 || !c3568gy.f4439a.containsKey(AbstractC2845Vx.class)) {
            c2797Ub = new C2797Ub(c2629Np, i5);
            c2355Da = new C2355Da(i4, c2629Np, c4391qK);
        } else {
            c2355Da = new C2823Vb(1);
            c2797Ub = new C2823Vb(0);
        }
        int i6 = 13;
        if (i3 >= 28) {
            c3789jY.a(new P4(new C3692iN(i6, listF, c4391qK), 1), InputStream.class, Drawable.class, "Animation");
            i = 0;
            c3789jY.a(new P4(new C3692iN(13, listF, c4391qK), i), ByteBuffer.class, Drawable.class, "Animation");
        } else {
            i = 0;
        }
        C4142nZ c4142nZ = new C4142nZ(applicationContext);
        C2381Ea c2381Ea = new C2381Ea(c4391qK);
        C2329Ca c2329Ca = new C2329Ca(i);
        C4710tz c4710tz = new C4710tz(17);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        int i7 = 9;
        c3789jY.b(ByteBuffer.class, new C4710tz(i7));
        c3789jY.b(InputStream.class, new Wm0(c4391qK, i7));
        c3789jY.a(c2797Ub, ByteBuffer.class, Bitmap.class, "Bitmap");
        c3789jY.a(c2355Da, InputStream.class, Bitmap.class, "Bitmap");
        String str = Build.FINGERPRINT;
        if (!"robolectric".equals(str)) {
            c3789jY.a(new C2797Ub(c2629Np, 1), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        }
        c3789jY.a(new C4246oh0(interfaceC2459Ha, new C4710tz()), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        c3789jY.a(c4246oh0, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        G7 g7 = G7.k;
        c3789jY.d(Bitmap.class, Bitmap.class, g7);
        c3789jY.a(new C5209zf0(0), Bitmap.class, Bitmap.class, "Bitmap");
        c3789jY.c(Bitmap.class, c2381Ea);
        c3789jY.a(new C2355Da(resources, c2797Ub), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        c3789jY.a(new C2355Da(resources, c2355Da), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        c3789jY.a(new C2355Da(resources, c4246oh0), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        c3789jY.c(BitmapDrawable.class, new C3692iN(11, interfaceC2459Ha, c2381Ea));
        c3789jY.a(new H90(listF, c2901Yb, c4391qK), InputStream.class, GifDrawable.class, "Animation");
        c3789jY.a(c2901Yb, ByteBuffer.class, GifDrawable.class, "Animation");
        c3789jY.c(GifDrawable.class, new Qm0(16));
        c3789jY.d(InterfaceC2508Ix.class, InterfaceC2508Ix.class, g7);
        c3789jY.a(new C2407Fa(interfaceC2459Ha), InterfaceC2508Ix.class, Bitmap.class, "Bitmap");
        c3789jY.a(c4142nZ, Uri.class, Drawable.class, "legacy_append");
        c3789jY.a(new C2355Da(1, c4142nZ, interfaceC2459Ha), Uri.class, Bitmap.class, "legacy_append");
        c3789jY.i(new C4077ml(2));
        c3789jY.d(File.class, ByteBuffer.class, new Qm0(9));
        c3789jY.d(File.class, InputStream.class, new C2841Vt(1));
        c3789jY.a(new C5209zf0(2), File.class, File.class, "legacy_append");
        c3789jY.d(File.class, ParcelFileDescriptor.class, new C2841Vt(0));
        c3789jY.d(File.class, File.class, g7);
        c3789jY.i(new C4384qD(c4391qK));
        int i8 = 1;
        if (!"robolectric".equals(str)) {
            c3789jY.i(new C4077ml(i8));
        }
        C2758So c2758So = new C2758So(applicationContext, i8);
        int i9 = 0;
        C2758So c2758So2 = new C2758So(applicationContext, i9);
        C2784To c2784To = new C2784To(applicationContext, i9);
        Class cls = Integer.TYPE;
        c3789jY.d(cls, InputStream.class, c2758So);
        c3789jY.d(Integer.class, InputStream.class, c2758So);
        c3789jY.d(cls, AssetFileDescriptor.class, c2758So2);
        c3789jY.d(Integer.class, AssetFileDescriptor.class, c2758So2);
        c3789jY.d(cls, Drawable.class, c2784To);
        c3789jY.d(Integer.class, Drawable.class, c2784To);
        int i10 = 2;
        c3789jY.d(Uri.class, InputStream.class, new C2758So(applicationContext, i10));
        c3789jY.d(Uri.class, AssetFileDescriptor.class, new C2784To(applicationContext, i10));
        C4406qZ c4406qZ = new C4406qZ(resources, 1);
        C4406qZ c4406qZ2 = new C4406qZ(resources, 0);
        C2783Tn c2783Tn = new C2783Tn(resources, 0);
        c3789jY.d(Integer.class, Uri.class, c4406qZ);
        c3789jY.d(cls, Uri.class, c4406qZ);
        c3789jY.d(Integer.class, AssetFileDescriptor.class, c4406qZ2);
        c3789jY.d(cls, AssetFileDescriptor.class, c4406qZ2);
        c3789jY.d(Integer.class, InputStream.class, c2783Tn);
        c3789jY.d(cls, InputStream.class, c2783Tn);
        int i11 = 8;
        c3789jY.d(String.class, InputStream.class, new Wm0(8));
        c3789jY.d(Uri.class, InputStream.class, new Wm0(8));
        int i12 = 12;
        c3789jY.d(String.class, InputStream.class, new C4710tz(i12));
        int i13 = 11;
        c3789jY.d(String.class, ParcelFileDescriptor.class, new Qm0(i13));
        c3789jY.d(String.class, AssetFileDescriptor.class, new C4710tz(i13));
        int i14 = 6;
        c3789jY.d(Uri.class, InputStream.class, new Wm0(applicationContext.getAssets(), i14));
        c3789jY.d(Uri.class, AssetFileDescriptor.class, new NN(applicationContext.getAssets(), i14));
        int i15 = 3;
        c3789jY.d(Uri.class, InputStream.class, new C2758So(applicationContext, i15));
        c3789jY.d(Uri.class, InputStream.class, new C2784To(applicationContext, i15));
        if (i3 >= 29) {
            i2 = 1;
            c3789jY.d(Uri.class, InputStream.class, new MW(applicationContext, 1));
            c3789jY.d(Uri.class, ParcelFileDescriptor.class, new MW(applicationContext, 0));
        } else {
            i2 = 1;
        }
        c3789jY.d(Uri.class, InputStream.class, new Ag0(contentResolver, i2));
        c3789jY.d(Uri.class, ParcelFileDescriptor.class, new Wm0(contentResolver, 10));
        c3789jY.d(Uri.class, AssetFileDescriptor.class, new Ag0(contentResolver, 0));
        c3789jY.d(Uri.class, InputStream.class, new Qm0(i12));
        c3789jY.d(URL.class, InputStream.class, new C4710tz(13));
        c3789jY.d(Uri.class, File.class, new C2784To(applicationContext, 1));
        c3789jY.d(C3742iy.class, InputStream.class, new Wm0(11));
        c3789jY.d(byte[].class, ByteBuffer.class, new C4710tz(i11));
        c3789jY.d(byte[].class, InputStream.class, new Qm0(i11));
        c3789jY.d(Uri.class, Uri.class, g7);
        c3789jY.d(Drawable.class, Drawable.class, g7);
        c3789jY.a(new C5209zf0(1), Drawable.class, Drawable.class, "legacy_append");
        c3789jY.k(Bitmap.class, BitmapDrawable.class, new C2783Tn(resources, 1));
        c3789jY.k(Bitmap.class, byte[].class, c2329Ca);
        c3789jY.k(Drawable.class, byte[].class, new C4568sM(interfaceC2459Ha, c2329Ca, c4710tz, 4));
        c3789jY.k(GifDrawable.class, byte[].class, c4710tz);
        if (i3 >= 23) {
            C4246oh0 c4246oh1 = new C4246oh0(interfaceC2459Ha, new Qm0(14));
            c3789jY.a(c4246oh1, ByteBuffer.class, Bitmap.class, "legacy_append");
            c3789jY.a(new C2355Da(resources, c4246oh1), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return c3789jY;
        }
        AbstractC3950lJ.z(it.next());
        throw null;
    }

    public static FloatBuffer T(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static ColorStateList V(Context context, int i) {
        int iE0 = e0(context, R.attr.textColorPrimary, 0);
        if (i == 0) {
            i = iE0;
        }
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{I(0.4f, i), i});
    }

    public static int W(Uh0 uh0) throws KT {
        int i = uh0.i(4);
        if (i == 15) {
            if (uh0.b() >= 24) {
                return uh0.i(24);
            }
            throw KT.a("AAC header insufficient data", null);
        }
        if (i < 13) {
            return f3900a[i];
        }
        throw KT.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static boolean X(int i) {
        return 1.0d - (((((double) Color.blue(i)) * 0.114d) + ((((double) Color.green(i)) * 0.587d) + (((double) Color.red(i)) * 0.299d))) / 255.0d) >= 0.5d;
    }

    public static File Y(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static String Z(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static C3129c a0(Uh0 uh0, boolean z) throws KT {
        int i = uh0.i(5);
        if (i == 31) {
            i = uh0.i(6) + 32;
        }
        int iW = W(uh0);
        int i2 = uh0.i(4);
        String strP = AbstractC3950lJ.p("mp4a.40.", i);
        if (i == 5 || i == 29) {
            iW = W(uh0);
            int i3 = uh0.i(5);
            if (i3 == 31) {
                i3 = uh0.i(6) + 32;
            }
            i = i3;
            if (i == 22) {
                i2 = uh0.i(4);
            }
        }
        if (z) {
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 6 && i != 7 && i != 17) {
                switch (i) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw KT.c("Unsupported audio object type: " + i);
                }
            }
            if (uh0.h()) {
                AbstractC4038mJ.f();
            }
            if (uh0.h()) {
                uh0.s(14);
            }
            boolean zH = uh0.h();
            if (i2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i == 6 || i == 20) {
                uh0.s(3);
            }
            if (zH) {
                if (i == 22) {
                    uh0.s(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    uh0.s(3);
                }
                uh0.s(1);
            }
            switch (i) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i4 = uh0.i(2);
                    if (i4 == 2 || i4 == 3) {
                        throw KT.c("Unsupported epConfig: " + i4);
                    }
                    break;
            }
        }
        int i5 = b[i2];
        if (i5 != -1) {
            return new C3129c(iW, i5, strP);
        }
        throw KT.a(null, null);
    }

    public static C3491g4 b0(JT jt) {
        jt.F(1);
        int iV = jt.v();
        long j = ((long) jt.b) + ((long) iV);
        int i = iV / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jN = jt.n();
            if (jN == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jN;
            jArrCopyOf2[i2] = jt.n();
            jt.F(2);
        }
        jt.F((int) (j - ((long) jt.b)));
        return new C3491g4(3, jArrCopyOf, jArrCopyOf2);
    }

    public static ColorStateList c0(Context context, int i, ColorStateList colorStateList) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(0);
            if (typedValuePeekValue == null) {
                typedArrayObtainStyledAttributes.recycle();
                return colorStateList;
            }
            int i2 = typedValuePeekValue.type;
            if (i2 >= 28 && i2 <= 31) {
                ColorStateList colorStateListV = V(context, typedValuePeekValue.data);
                typedArrayObtainStyledAttributes.recycle();
                return colorStateListV;
            }
            ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(0);
            if (colorStateList2 != null) {
                typedArrayObtainStyledAttributes.recycle();
                return colorStateList2;
            }
            typedArrayObtainStyledAttributes.recycle();
            return colorStateList;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean d0(Context context, int i, boolean z) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getBoolean(0, z);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int e0(Context context, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i2);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static Drawable f0(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getDrawable(0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static EnumC4885vy g0(FragmentActivity fragmentActivity, int i, EnumC4885vy enumC4885vy) {
        int i2;
        TypedArray typedArrayObtainStyledAttributes = fragmentActivity.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            int iOrdinal = enumC4885vy.ordinal();
            if (iOrdinal != 1) {
                i2 = iOrdinal != 2 ? 0 : 2;
            } else {
                i2 = 1;
            }
            int i3 = typedArrayObtainStyledAttributes.getInt(0, i2);
            if (i3 != 1) {
                return i3 != 2 ? EnumC4885vy.f5163a : EnumC4885vy.c;
            }
            return EnumC4885vy.b;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static final int h0(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public boolean A(D40 d40, int i) {
        AbstractC2995aW.q(d40, "descriptor");
        return r();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public int B(D40 d40) {
        AbstractC2995aW.q(d40, "enumDescriptor");
        U();
        throw null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public boolean C() {
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public int D(D40 d40, int i) {
        AbstractC2995aW.q(d40, "descriptor");
        return h();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public abstract byte E();

    public void U() {
        throw new P40(AbstractC3263dY.a(getClass()) + " can't retrieve untyped values");
    }

    public void b(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public InterfaceC4421qh c(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public short e(AV av, int i) {
        AbstractC2995aW.q(av, "descriptor");
        return o();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public InterfaceC2548Kl f(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public abstract int h();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public abstract long i();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public Object j(InterfaceC2369Do interfaceC2369Do) {
        AbstractC2995aW.q(interfaceC2369Do, "deserializer");
        return interfaceC2369Do.deserialize(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public String l(D40 d40, int i) {
        AbstractC2995aW.q(d40, "descriptor");
        return y();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public float m(D40 d40, int i) {
        AbstractC2995aW.q(d40, "descriptor");
        return p();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public double n(AV av, int i) {
        AbstractC2995aW.q(av, "descriptor");
        return q();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public abstract short o();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public float p() {
        U();
        throw null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public double q() {
        U();
        throw null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public boolean r() {
        U();
        throw null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public Object s(D40 d40, int i, InterfaceC4123nG interfaceC4123nG, Object obj) {
        AbstractC2995aW.q(d40, "descriptor");
        AbstractC2995aW.q(interfaceC4123nG, "deserializer");
        if (interfaceC4123nG.getDescriptor().b() || C()) {
            return j(interfaceC4123nG);
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public char t(AV av, int i) {
        AbstractC2995aW.q(av, "descriptor");
        return u();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public char u() {
        U();
        throw null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public InterfaceC2548Kl v(AV av, int i) {
        AbstractC2995aW.q(av, "descriptor");
        return f(av.g(i));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public long w(D40 d40, int i) {
        AbstractC2995aW.q(d40, "descriptor");
        return i();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public byte x(AV av, int i) {
        AbstractC2995aW.q(av, "descriptor");
        return E();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public String y() {
        U();
        throw null;
    }

    public Object z(D40 d40, int i, InterfaceC2369Do interfaceC2369Do, Object obj) {
        AbstractC2995aW.q(d40, "descriptor");
        AbstractC2995aW.q(interfaceC2369Do, "deserializer");
        return j(interfaceC2369Do);
    }
}
