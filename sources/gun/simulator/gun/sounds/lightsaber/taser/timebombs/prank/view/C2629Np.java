package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Np, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2629Np {
    public static final VS f = VS.a(EnumC2366Dl.c, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final VS g = new VS("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, VS.e);
    public static final VS h;
    public static final VS i;
    public static final Set j;
    public static final Qm0 k;
    public static final ArrayDeque l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2459Ha f3479a;
    public final DisplayMetrics b;
    public final C4391qK c;
    public final List d;
    public final C3743iz e = C3743iz.a();

    static {
        C2552Kp c2552Kp = AbstractC2578Lp.f3375a;
        Boolean bool = Boolean.FALSE;
        h = VS.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = VS.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        k = new Qm0(13);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = Tg0.f3783a;
        l = new ArrayDeque(0);
    }

    public C2629Np(List list, DisplayMetrics displayMetrics, InterfaceC2459Ha interfaceC2459Ha, C4391qK c4391qK) {
        this.d = list;
        AbstractC2871Wx.V(displayMetrics, "Argument must not be null");
        this.b = displayMetrics;
        AbstractC2871Wx.V(interfaceC2459Ha, "Argument must not be null");
        this.f3479a = interfaceC2459Ha;
        AbstractC2871Wx.V(c4391qK, "Argument must not be null");
        this.c = c4391qK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4568sM r4, android.graphics.BitmapFactory.Options r5, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2603Mp r6, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2459Ha r7) {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto L20
            r6.t()
            int r0 = r4.f4975a
            switch(r0) {
                case 2: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L20
        Ld:
            java.lang.Object r0 = r4.c
            com.bumptech.glide.load.data.a r0 = (com.bumptech.glide.load.data.a) r0
            java.lang.Object r0 = r0.b
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.VX r0 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.VX) r0
            monitor-enter(r0)
            byte[] r1 = r0.f3874a     // Catch: java.lang.Throwable -> L1d
            int r1 = r1.length     // Catch: java.lang.Throwable -> L1d
            r0.c = r1     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            goto L20
        L1d:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L20:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Id0.b
            r3.lock()
            android.graphics.Bitmap r4 = r4.j(r5)     // Catch: java.lang.IllegalArgumentException -> L33 java.lang.Throwable -> L4c
            r3.unlock()
            return r4
        L33:
            r3 = move-exception
            java.io.IOException r0 = e(r3, r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L4c
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L4f
            r7.a(r1)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r1 = 0
            r5.inBitmap = r1     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            android.graphics.Bitmap r4 = c(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            java.util.concurrent.locks.Lock r5 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Id0.b
            r5.unlock()
            return r4
        L4c:
            r4 = move-exception
            goto L50
        L4e:
            throw r0     // Catch: java.lang.Throwable -> L4c
        L4f:
            throw r0     // Catch: java.lang.Throwable -> L4c
        L50:
            java.util.concurrent.locks.Lock r5 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Id0.b
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2629Np.c(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sM, android.graphics.BitmapFactory$Options, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mp, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ha):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        StringBuilder sbT = AbstractC3950lJ.t("Exception decoding bitmap, outWidth: ", i2, ", outHeight: ", i3, ", outMimeType: ");
        sbT.append(str);
        sbT.append(", inBitmap: ");
        sbT.append(d(options.inBitmap));
        return new IOException(sbT.toString(), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        g(options);
        ArrayDeque arrayDeque = l;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
        }
    }

    public static void g(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final C2485Ia a(C4568sM c4568sM, int i2, int i3, YS ys, InterfaceC2603Mp interfaceC2603Mp) {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.c.d(65536, byte[].class);
        synchronized (C2629Np.class) {
            ArrayDeque arrayDeque = l;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                g(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        EnumC2366Dl enumC2366Dl = (EnumC2366Dl) ys.c(f);
        EnumC4929wV enumC4929wV = (EnumC4929wV) ys.c(g);
        AbstractC2578Lp abstractC2578Lp = (AbstractC2578Lp) ys.c(AbstractC2578Lp.f);
        boolean zBooleanValue = ((Boolean) ys.c(h)).booleanValue();
        VS vs = i;
        try {
            return C2485Ia.c(b(c4568sM, options2, abstractC2578Lp, enumC2366Dl, enumC4929wV, ys.c(vs) != null && ((Boolean) ys.c(vs)).booleanValue(), i2, i3, zBooleanValue, interfaceC2603Mp), this.f3479a);
        } finally {
            f(options2);
            this.c.h(bArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0207  */
    /* JADX WARN: Code duplicated, block: B:109:0x0220  */
    /* JADX WARN: Code duplicated, block: B:122:0x0297  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:129:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:136:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:137:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:143:0x02db  */
    /* JADX WARN: Code duplicated, block: B:145:0x02df  */
    /* JADX WARN: Code duplicated, block: B:149:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:155:0x0317  */
    /* JADX WARN: Code duplicated, block: B:158:0x0320  */
    /* JADX WARN: Code duplicated, block: B:159:0x0325  */
    /* JADX WARN: Code duplicated, block: B:161:0x0328  */
    /* JADX WARN: Code duplicated, block: B:165:0x0334  */
    /* JADX WARN: Code duplicated, block: B:167:0x0338  */
    /* JADX WARN: Code duplicated, block: B:174:0x0351  */
    /* JADX WARN: Code duplicated, block: B:176:0x035d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x035f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0378  */
    /* JADX WARN: Code duplicated, block: B:182:0x038c  */
    /* JADX WARN: Code duplicated, block: B:184:0x0396  */
    /* JADX WARN: Code duplicated, block: B:185:0x0399  */
    /* JADX WARN: Code duplicated, block: B:188:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:191:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:192:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:193:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:194:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:197:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:198:0x0404  */
    /* JADX WARN: Code duplicated, block: B:202:0x0424  */
    /* JADX WARN: Code duplicated, block: B:204:0x02a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.graphics.Bitmap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mp] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ha] */
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
    public final Bitmap b(C4568sM c4568sM, BitmapFactory.Options options, AbstractC2578Lp abstractC2578Lp, EnumC2366Dl enumC2366Dl, EnumC4929wV enumC4929wV, boolean z, int i2, int i3, boolean z2, InterfaceC2603Mp interfaceC2603Mp) throws Throwable {
        int iD0;
        char c;
        boolean z3;
        int i4;
        int i5;
        ?? r4;
        boolean zC;
        int i6;
        int i7;
        float f2;
        int i8;
        int i9;
        ?? r5;
        ?? C;
        Matrix matrix;
        Bitmap.Config config;
        ColorSpace.Named named;
        Bitmap.Config config2;
        Bitmap.Config config3;
        int i10;
        int i11;
        int iMax;
        InterfaceC2603Mp interfaceC2603Mp2;
        int iFloor;
        int iFloor2;
        double dB;
        double d;
        int i12;
        InterfaceC2603Mp interfaceC2603Mp3 = interfaceC2603Mp;
        int i13 = AbstractC4653tJ.f5029a;
        SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        ?? r7 = this.f3479a;
        c(c4568sM, options, interfaceC2603Mp3, r7);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i14 = iArr[0];
        int i15 = iArr[1];
        boolean z4 = (i14 == -1 || i15 == -1) ? false : z;
        int i16 = 3;
        switch (c4568sM.f4975a) {
            case 1:
                List list = (List) c4568sM.b;
                ByteBuffer byteBufferC = AbstractC3092bc.c((ByteBuffer) c4568sM.c);
                iD0 = byteBufferC != null ? AbstractC2871Wx.d0(list, new C3692iN(i16, byteBufferC, (C4391qK) c4568sM.d)) : -1;
                break;
            case 2:
                List list2 = (List) c4568sM.b;
                VX vx = (VX) ((com.bumptech.glide.load.data.a) c4568sM.c).b;
                vx.reset();
                iD0 = AbstractC2871Wx.c0((C4391qK) c4568sM.d, vx, list2);
                break;
            default:
                iD0 = AbstractC2871Wx.d0((List) c4568sM.b, new C4119nC((com.bumptech.glide.load.data.a) c4568sM.d, (C4391qK) c4568sM.c));
                break;
        }
        switch (iD0) {
            case 3:
            case 4:
                c = 180;
                break;
            case 5:
            case 6:
                c = 'Z';
                break;
            case 7:
            case 8:
                c = 270;
                break;
            default:
                c = 0;
                break;
        }
        switch (iD0) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z3 = true;
                break;
            default:
                z3 = false;
                break;
        }
        int i17 = i2;
        if (i17 == Integer.MIN_VALUE) {
            i17 = (c == 'Z' || c == 270) ? i15 : i14;
        }
        if (i3 == -2147483648) {
            i3 = (c == 'Z' || c == 270) ? i14 : i15;
        }
        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeN = c4568sM.n();
        String str = "Downsampler";
        int i18 = iD0;
        if (i14 > 0) {
            if (i15 <= 0) {
                i5 = 3;
                i4 = i15;
            } else {
                if (c == 'Z' || c == 270) {
                    i10 = i15;
                    i11 = i14;
                } else {
                    i11 = i15;
                    i10 = i14;
                }
                float fB = abstractC2578Lp.b(i10, i11, i17, i3);
                if (fB <= 0.0f) {
                    StringBuilder sb = new StringBuilder("Cannot scale with factor: ");
                    sb.append(fB);
                    sb.append(" from: ");
                    sb.append(abstractC2578Lp);
                    sb.append(", source: [");
                    AbstractC3888ke0.t(sb, i14, "x", i15, "], target: [");
                    sb.append(i17);
                    sb.append("x");
                    sb.append(i3);
                    sb.append("]");
                    throw new IllegalArgumentException(sb.toString());
                }
                z4 = z4;
                int iA = abstractC2578Lp.a(i10, i11, i17, i3);
                if (iA == 0) {
                    throw new IllegalArgumentException("Cannot round with null rounding");
                }
                float f3 = i10;
                float f4 = i11;
                int i19 = i17;
                int i20 = i10 / ((int) (((double) (fB * f3)) + 0.5d));
                int i21 = i11 / ((int) (((double) (fB * f4)) + 0.5d));
                int iMax2 = iA == 1 ? Math.max(i20, i21) : Math.min(i20, i21);
                int i22 = Build.VERSION.SDK_INT;
                if (i22 > 23 || !j.contains(options.outMimeType)) {
                    iMax = Math.max(1, Integer.highestOneBit(iMax2));
                    if (iA == 1 && iMax < 1.0f / fB) {
                        iMax <<= 1;
                    }
                } else {
                    iMax = 1;
                }
                options.inSampleSize = iMax;
                if (imageHeaderParser$ImageTypeN == ImageHeaderParser$ImageType.JPEG) {
                    float fMin = Math.min(iMax, 8);
                    iFloor = (int) Math.ceil(f3 / fMin);
                    iFloor2 = (int) Math.ceil(f4 / fMin);
                    int i23 = iMax / 8;
                    if (i23 > 0) {
                        iFloor /= i23;
                        iFloor2 /= i23;
                    }
                } else {
                    if (imageHeaderParser$ImageTypeN == ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeN == ImageHeaderParser$ImageType.PNG_A) {
                        interfaceC2603Mp2 = interfaceC2603Mp;
                        float f5 = iMax;
                        iFloor = (int) Math.floor(f3 / f5);
                        iFloor2 = (int) Math.floor(f4 / f5);
                    } else if (imageHeaderParser$ImageTypeN.isWebp()) {
                        if (i22 >= 24) {
                            float f6 = iMax;
                            iFloor = Math.round(f3 / f6);
                            iFloor2 = Math.round(f4 / f6);
                        } else {
                            float f7 = iMax;
                            iFloor = (int) Math.floor(f3 / f7);
                            iFloor2 = (int) Math.floor(f4 / f7);
                        }
                    } else if (i10 % iMax == 0 && i11 % iMax == 0) {
                        iFloor = i10 / iMax;
                        iFloor2 = i11 / iMax;
                    } else {
                        options.inJustDecodeBounds = true;
                        InterfaceC2603Mp interfaceC2603Mp4 = interfaceC2603Mp;
                        c(c4568sM, options, interfaceC2603Mp4, r7);
                        options.inJustDecodeBounds = false;
                        int[] iArr2 = {options.outWidth, options.outHeight};
                        int i24 = iArr2[0];
                        iFloor2 = iArr2[1];
                        iFloor = i24;
                        interfaceC2603Mp2 = interfaceC2603Mp4;
                    }
                    i17 = i19;
                    dB = abstractC2578Lp.b(iFloor, iFloor2, i17, i3);
                    if (dB <= 1.0d) {
                        d = dB;
                    } else {
                        d = 1.0d / dB;
                    }
                    int iRound = (int) Math.round(d * 2.147483647E9d);
                    int i25 = (int) ((((double) iRound) * dB) + 0.5d);
                    options.inTargetDensity = (int) (((dB / ((double) (i25 / iRound))) * ((double) i25)) + 0.5d);
                    if (dB > 1.0d) {
                        dB = 1.0d / dB;
                    }
                    int iRound2 = (int) Math.round(dB * 2.147483647E9d);
                    options.inDensity = iRound2;
                    i12 = options.inTargetDensity;
                    if (i12 > 0 || iRound2 <= 0 || i12 == iRound2) {
                        options.inTargetDensity = 0;
                        options.inDensity = 0;
                    } else {
                        options.inScaled = true;
                    }
                    str = "Downsampler";
                    i14 = i14;
                    i4 = i15;
                    r4 = interfaceC2603Mp2;
                }
                interfaceC2603Mp2 = interfaceC2603Mp;
                i17 = i19;
                dB = abstractC2578Lp.b(iFloor, iFloor2, i17, i3);
                if (dB <= 1.0d) {
                    d = dB;
                } else {
                    d = 1.0d / dB;
                }
                int iRound3 = (int) Math.round(d * 2.147483647E9d);
                int i26 = (int) ((((double) iRound3) * dB) + 0.5d);
                options.inTargetDensity = (int) (((dB / ((double) (i26 / iRound3))) * ((double) i26)) + 0.5d);
                if (dB > 1.0d) {
                    dB = 1.0d / dB;
                }
                int iRound4 = (int) Math.round(dB * 2.147483647E9d);
                options.inDensity = iRound4;
                i12 = options.inTargetDensity;
                if (i12 > 0) {
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                } else {
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                }
                str = "Downsampler";
                i14 = i14;
                i4 = i15;
                r4 = interfaceC2603Mp2;
            }
            zC = this.e.c(i17, i3, z4, z3);
            if (zC) {
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                options.inMutable = false;
            }
            if (!zC) {
                if (enumC2366Dl != EnumC2366Dl.f2987a) {
                    try {
                        if (c4568sM.n().hasAlpha()) {
                            config3 = Bitmap.Config.ARGB_8888;
                        } else {
                            config3 = Bitmap.Config.RGB_565;
                        }
                    } catch (IOException unused) {
                        if (Log.isLoggable(str, 3)) {
                            Objects.toString(enumC2366Dl);
                        }
                    }
                    options.inPreferredConfig = config3;
                    if (config3 == Bitmap.Config.RGB_565) {
                        options.inDither = true;
                    }
                } else {
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                }
            }
            i6 = Build.VERSION.SDK_INT;
            if (i14 >= 0 || i4 < 0 || !z2) {
                i7 = options.inTargetDensity;
                if (i7 > 0 || (i9 = options.inDensity) <= 0 || i7 == i9) {
                    f2 = 1.0f;
                } else {
                    f2 = i7 / i9;
                }
                float f8 = options.inSampleSize;
                int iCeil = (int) Math.ceil(i14 / f8);
                int iCeil2 = (int) Math.ceil(i4 / f8);
                int iRound5 = Math.round(iCeil * f2);
                i3 = Math.round(iCeil2 * f2);
                i8 = iRound5;
            } else {
                i8 = i17;
            }
            r5 = 0;
            if (i8 > 0 && i3 > 0) {
                if (i6 >= 26) {
                    config2 = null;
                } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
                    config2 = options.outConfig;
                }
                if (config2 == null) {
                    config2 = options.inPreferredConfig;
                }
                options.inBitmap = r7.e(i8, i3, config2);
            }
            if (enumC4929wV != null) {
                if (i6 >= 28) {
                    if (enumC4929wV == EnumC4929wV.f5182a || options.outColorSpace == null || !options.outColorSpace.isWideGamut()) {
                        named = ColorSpace.Named.SRGB;
                    } else {
                        named = ColorSpace.Named.DISPLAY_P3;
                    }
                    options.inPreferredColorSpace = ColorSpace.get(named);
                } else if (i6 >= 26) {
                    options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                }
            }
            C = c(c4568sM, options, r4, r7);
            r4.o(C, r7);
            if (Log.isLoggable(str, 2)) {
                d(C);
                d(options.inBitmap);
                Thread.currentThread().getName();
                SystemClock.elapsedRealtimeNanos();
            }
            if (C != 0) {
                C.setDensity(this.b.densityDpi);
                switch (i18) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        matrix = new Matrix();
                        switch (i18) {
                            case 2:
                                matrix.setScale(-1.0f, 1.0f);
                                break;
                            case 3:
                                matrix.setRotate(180.0f);
                                break;
                            case 4:
                                matrix.setRotate(180.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 5:
                                matrix.setRotate(90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 6:
                                matrix.setRotate(90.0f);
                                break;
                            case 7:
                                matrix.setRotate(-90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 8:
                                matrix.setRotate(-90.0f);
                                break;
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, C.getWidth(), C.getHeight());
                        matrix.mapRect(rectF);
                        int iRound6 = Math.round(rectF.width());
                        int iRound7 = Math.round(rectF.height());
                        if (C.getConfig() != null) {
                            config = C.getConfig();
                        } else {
                            config = Bitmap.Config.ARGB_8888;
                        }
                        Bitmap bitmapB = r7.b(iRound6, iRound7, config);
                        matrix.postTranslate(-rectF.left, -rectF.top);
                        bitmapB.setHasAlpha(C.hasAlpha());
                        Id0.a(C, bitmapB, matrix);
                        r5 = bitmapB;
                        break;
                    default:
                        r5 = C;
                        break;
                }
                if (!C.equals(r5)) {
                    r7.a(C);
                }
            }
            return r5;
        }
        i4 = i15;
        i5 = 3;
        if (Log.isLoggable(str, i5)) {
            Objects.toString(imageHeaderParser$ImageTypeN);
        }
        r4 = interfaceC2603Mp3;
        zC = this.e.c(i17, i3, z4, z3);
        if (zC) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        if (!zC) {
            if (enumC2366Dl != EnumC2366Dl.f2987a) {
                if (c4568sM.n().hasAlpha()) {
                    config3 = Bitmap.Config.ARGB_8888;
                } else {
                    config3 = Bitmap.Config.RGB_565;
                }
                options.inPreferredConfig = config3;
                if (config3 == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                }
            } else {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
        }
        i6 = Build.VERSION.SDK_INT;
        if (i14 >= 0) {
            i7 = options.inTargetDensity;
            if (i7 > 0) {
                f2 = 1.0f;
            } else {
                f2 = 1.0f;
            }
            float f9 = options.inSampleSize;
            int iCeil3 = (int) Math.ceil(i14 / f9);
            int iCeil4 = (int) Math.ceil(i4 / f9);
            int iRound8 = Math.round(iCeil3 * f2);
            i3 = Math.round(iCeil4 * f2);
            i8 = iRound8;
        } else {
            i7 = options.inTargetDensity;
            if (i7 > 0) {
                f2 = 1.0f;
            } else {
                f2 = 1.0f;
            }
            float f10 = options.inSampleSize;
            int iCeil5 = (int) Math.ceil(i14 / f10);
            int iCeil6 = (int) Math.ceil(i4 / f10);
            int iRound9 = Math.round(iCeil5 * f2);
            i3 = Math.round(iCeil6 * f2);
            i8 = iRound9;
        }
        r5 = 0;
        if (i8 > 0) {
            if (i6 >= 26) {
                config2 = null;
            } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
                config2 = options.outConfig;
            }
            if (config2 == null) {
                config2 = options.inPreferredConfig;
            }
            options.inBitmap = r7.e(i8, i3, config2);
        }
        if (enumC4929wV != null) {
            if (i6 >= 28) {
                if (enumC4929wV == EnumC4929wV.f5182a) {
                    named = ColorSpace.Named.SRGB;
                } else {
                    named = ColorSpace.Named.SRGB;
                }
                options.inPreferredColorSpace = ColorSpace.get(named);
            } else if (i6 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        C = c(c4568sM, options, r4, r7);
        r4.o(C, r7);
        if (Log.isLoggable(str, 2)) {
            d(C);
            d(options.inBitmap);
            Thread.currentThread().getName();
            SystemClock.elapsedRealtimeNanos();
        }
        if (C != 0) {
            C.setDensity(this.b.densityDpi);
            switch (i18) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    matrix = new Matrix();
                    switch (i18) {
                        case 2:
                            matrix.setScale(-1.0f, 1.0f);
                            break;
                        case 3:
                            matrix.setRotate(180.0f);
                            break;
                        case 4:
                            matrix.setRotate(180.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 5:
                            matrix.setRotate(90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 6:
                            matrix.setRotate(90.0f);
                            break;
                        case 7:
                            matrix.setRotate(-90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 8:
                            matrix.setRotate(-90.0f);
                            break;
                    }
                    RectF rectF2 = new RectF(0.0f, 0.0f, C.getWidth(), C.getHeight());
                    matrix.mapRect(rectF2);
                    int iRound10 = Math.round(rectF2.width());
                    int iRound11 = Math.round(rectF2.height());
                    if (C.getConfig() != null) {
                        config = C.getConfig();
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    Bitmap bitmapB2 = r7.b(iRound10, iRound11, config);
                    matrix.postTranslate(-rectF2.left, -rectF2.top);
                    bitmapB2.setHasAlpha(C.hasAlpha());
                    Id0.a(C, bitmapB2, matrix);
                    r5 = bitmapB2;
                    break;
                default:
                    r5 = C;
                    break;
            }
            if (!C.equals(r5)) {
                r7.a(C);
            }
        }
        return r5;
    }
}
