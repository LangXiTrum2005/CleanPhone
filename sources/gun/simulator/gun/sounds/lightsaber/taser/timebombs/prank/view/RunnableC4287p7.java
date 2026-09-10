package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import com.google.android.material.internal.ViewUtils;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.p7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4287p7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4822a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC4287p7(int i, Object obj, boolean z) {
        this.f4822a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4822a;
        boolean z = this.b;
        Object obj = this.c;
        final int i2 = 1;
        switch (i) {
            case 0:
                SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os = (SurfaceHolderCallbackC2658Os) ((C3491g4) obj).c;
                int i3 = Ug0.f3833a;
                C2736Rs c2736Rs = surfaceHolderCallbackC2658Os.f3526a;
                if (c2736Rs.a0 != z) {
                    c2736Rs.a0 = z;
                    c2736Rs.l.e(23, new C2425Fs(z, 1));
                    break;
                }
                break;
            case 1:
                ViewUtils.showKeyboard((View) obj, z);
                break;
            default:
                final C4068mg0 c4068mg0 = ((C3980lg0) obj).f;
                WeakReference weakReference = c4068mg0.d;
                final int i4 = 0;
                boolean z2 = (weakReference == null || weakReference.get() == null) ? false : true;
                AtomicBoolean atomicBoolean = c4068mg0.f4706a;
                if (z2 && z) {
                    C4068mg0 c4068mg1 = C4068mg0.h;
                    byte[] bArr = {31, 24, 20, -85, -29, -9, -62, 96, 28, 20, 26, -88, -57, -89, -63, 93, 3, 7, 58, -84, -46, -46, -62, 81, com.umeng.analytics.pro.cw.k, 4, 30, -4, -53, -12, -31, 93, 3, 7, 18, -78, -59, -89, -113, 21};
                    byte[] bArr2 = {108, 112, 123, -36, -94, -121, -78, 53};
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < 40) {
                        if (i6 >= 8) {
                            i6 = 0;
                        }
                        bArr[i5] = (byte) (bArr[i5] ^ bArr2[i6]);
                        i5++;
                        i6++;
                    }
                    new String(bArr, StandardCharsets.UTF_8);
                    atomicBoolean.get();
                    if (!atomicBoolean.get()) {
                        final Activity activity = (Activity) c4068mg0.d.get();
                        byte[] bArr3 = {-72, -12, -9, 124, 46, 108, -33, -46, -21, -23, -24, 111, 111, 121, -54, -126, -68, -11, -20, 99, 46, 126, -53, -55, -21, -8, -15, 106, 98, 98, -56};
                        byte[] bArr4 = {-53, -100, -104, 11, com.umeng.analytics.pro.cw.l, com.umeng.analytics.pro.cw.k, -81, -94};
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < 31) {
                            if (i8 >= 8) {
                                i8 = 0;
                            }
                            bArr3[i7] = (byte) (bArr3[i7] ^ bArr4[i8]);
                            i7++;
                            i8++;
                        }
                        new String(bArr3, StandardCharsets.UTF_8);
                        if (activity == null || activity.isDestroyed() || activity.isFinishing() || activity.isRestricted()) {
                            atomicBoolean.set(false);
                        } else {
                            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                            builder.setCancelable(!c4068mg0.d());
                            C2317Bo c2317BoB = C4332pg0.a().b(activity);
                            builder.setTitle(c2317BoB != null ? c2317BoB.b : "");
                            C2317Bo c2317BoB2 = C4332pg0.a().b(activity);
                            builder.setMessage(c2317BoB2 != null ? c2317BoB2.c : "");
                            C2317Bo c2317BoB3 = C4332pg0.a().b(activity);
                            builder.setPositiveButton(c2317BoB3 != null ? c2317BoB3.d : "", new DialogInterface.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ig0
                                /* JADX WARN: Code duplicated, block: B:52:0x0109  */
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i9) {
                                    byte b;
                                    Uri uri;
                                    int i10 = i4;
                                    Activity activity2 = activity;
                                    C4068mg0 c4068mg2 = c4068mg0;
                                    c4068mg2.getClass();
                                    switch (i10) {
                                        case 0:
                                            byte[] bArr5 = {-58, -100, -117, -24, -119, -79, -67, -24, -58, -104, -101, -26, -109, -12, -2, -26, -38, -113, -124, -88};
                                            byte[] bArr6 = {-77, -20, -17, -119, -3, -44, -99, -118};
                                            int i11 = 0;
                                            int i12 = 0;
                                            while (i11 < 20) {
                                                if (i12 >= 8) {
                                                    i12 = 0;
                                                }
                                                bArr5[i11] = (byte) (bArr5[i11] ^ bArr6[i12]);
                                                i11++;
                                                i12++;
                                            }
                                            new String(bArr5, StandardCharsets.UTF_8);
                                            K5 k5 = c4068mg2.b;
                                            if (k5 != null) {
                                                String str = k5.k;
                                                int iHashCode = str.hashCode();
                                                if (iHashCode == -1965006719) {
                                                    byte[] bArr7 = {-49, 48, 20, 62, 86, 93};
                                                    byte[] bArr8 = {-127, 85, 99, 127, 38, 45, -53, -45};
                                                    int i13 = 0;
                                                    int i14 = 0;
                                                    while (i13 < 6) {
                                                        if (i14 >= 8) {
                                                            i14 = 0;
                                                        }
                                                        bArr7[i13] = (byte) (bArr7[i13] ^ bArr8[i14]);
                                                        i13++;
                                                        i14++;
                                                    }
                                                    if (str.equals(new String(bArr7, StandardCharsets.UTF_8))) {
                                                        b = 1;
                                                    } else {
                                                        b = -1;
                                                    }
                                                } else if (iHashCode == -1754979095) {
                                                    byte[] bArr9 = {-60, -33, 119, -27, 47, 65};
                                                    byte[] bArr10 = {-111, -81, 19, -124, 91, 36, 68, 79};
                                                    int i15 = 0;
                                                    int i16 = 0;
                                                    while (i15 < 6) {
                                                        if (i16 >= 8) {
                                                            i16 = 0;
                                                        }
                                                        bArr9[i15] = (byte) (bArr9[i15] ^ bArr10[i16]);
                                                        i15++;
                                                        i16++;
                                                    }
                                                    if (str.equals(new String(bArr9, StandardCharsets.UTF_8))) {
                                                        b = 0;
                                                    } else {
                                                        b = -1;
                                                    }
                                                } else if (iHashCode != 86836) {
                                                    b = -1;
                                                } else {
                                                    byte[] bArr11 = {-50, -114, 115};
                                                    byte[] bArr12 = {-103, -21, 17, 93, 12, -67, -55, 87};
                                                    int i17 = 0;
                                                    int i18 = 0;
                                                    while (i17 < 3) {
                                                        if (i18 >= 8) {
                                                            i18 = 0;
                                                        }
                                                        bArr11[i17] = (byte) (bArr11[i17] ^ bArr12[i18]);
                                                        i17++;
                                                        i18++;
                                                    }
                                                    if (str.equals(new String(bArr11, StandardCharsets.UTF_8))) {
                                                        b = 2;
                                                    } else {
                                                        b = -1;
                                                    }
                                                }
                                                if (b == 0) {
                                                    WD.F(activity2, k5.j, k5.l);
                                                } else if (b == 1) {
                                                    String str2 = k5.j;
                                                    String str3 = k5.l;
                                                    if (AbstractC2340Cl.F(activity2, str2)) {
                                                        try {
                                                            activity2.startActivity(activity2.getPackageManager().getLaunchIntentForPackage(str2));
                                                        } catch (Exception unused) {
                                                            WD.F(activity2, str2, str3);
                                                        }
                                                    } else {
                                                        WD.F(activity2, str2, str3);
                                                    }
                                                } else if (b == 2) {
                                                    try {
                                                        uri = Uri.parse(k5.e.booleanValue() ? URLDecoder.decode(k5.m) : k5.m);
                                                    } catch (Exception e) {
                                                        e.printStackTrace();
                                                        uri = Uri.parse(k5.m);
                                                    }
                                                    try {
                                                        byte[] bArr13 = {45, 19, 112, -99, -102, 39, 0, -60, 37, 19, 96, -118, -101, 58, 74, -117, 47, 9, 125, -128, -101, 96, 50, -93, 9, 42};
                                                        byte[] bArr14 = {76, 125, 20, -17, -11, 78, 100, -22};
                                                        int i19 = 0;
                                                        int i20 = 0;
                                                        while (i19 < 26) {
                                                            if (i20 >= 8) {
                                                                i20 = 0;
                                                            }
                                                            bArr13[i19] = (byte) (bArr13[i19] ^ bArr14[i20]);
                                                            i19++;
                                                            i20++;
                                                        }
                                                        activity2.startActivity(new Intent(new String(bArr13, StandardCharsets.UTF_8), uri));
                                                    } catch (Exception e2) {
                                                        e2.printStackTrace();
                                                    }
                                                }
                                                if (!k5.f3300a.booleanValue() || !k5.b.booleanValue()) {
                                                    c4068mg2.c(activity2);
                                                }
                                            }
                                            break;
                                        default:
                                            byte[] bArr15 = {-47, -25, -74, -6, 82, -105, 105, 52, -58, -1, -74, -25, 23, -44, 103, 40, -47, -32, -8};
                                            byte[] bArr16 = {-78, -117, -39, -119, 55, -73, 11, 65};
                                            int i21 = 0;
                                            int i22 = 0;
                                            while (i21 < 19) {
                                                if (i22 >= 8) {
                                                    i22 = 0;
                                                }
                                                bArr15[i21] = (byte) (bArr15[i21] ^ bArr16[i22]);
                                                i21++;
                                                i22++;
                                            }
                                            new String(bArr15, StandardCharsets.UTF_8);
                                            if (!c4068mg2.d()) {
                                                c4068mg2.c(activity2);
                                            }
                                            break;
                                    }
                                }
                            });
                            if (!c4068mg0.d()) {
                                C2317Bo c2317BoB4 = C4332pg0.a().b(activity);
                                builder.setNegativeButton(c2317BoB4 != null ? c2317BoB4.e : "", new DialogInterface.OnClickListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ig0
                                    /* JADX WARN: Code duplicated, block: B:52:0x0109  */
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i9) {
                                        byte b;
                                        Uri uri;
                                        int i10 = i2;
                                        Activity activity2 = activity;
                                        C4068mg0 c4068mg2 = c4068mg0;
                                        c4068mg2.getClass();
                                        switch (i10) {
                                            case 0:
                                                byte[] bArr5 = {-58, -100, -117, -24, -119, -79, -67, -24, -58, -104, -101, -26, -109, -12, -2, -26, -38, -113, -124, -88};
                                                byte[] bArr6 = {-77, -20, -17, -119, -3, -44, -99, -118};
                                                int i11 = 0;
                                                int i12 = 0;
                                                while (i11 < 20) {
                                                    if (i12 >= 8) {
                                                        i12 = 0;
                                                    }
                                                    bArr5[i11] = (byte) (bArr5[i11] ^ bArr6[i12]);
                                                    i11++;
                                                    i12++;
                                                }
                                                new String(bArr5, StandardCharsets.UTF_8);
                                                K5 k5 = c4068mg2.b;
                                                if (k5 != null) {
                                                    String str = k5.k;
                                                    int iHashCode = str.hashCode();
                                                    if (iHashCode == -1965006719) {
                                                        byte[] bArr7 = {-49, 48, 20, 62, 86, 93};
                                                        byte[] bArr8 = {-127, 85, 99, 127, 38, 45, -53, -45};
                                                        int i13 = 0;
                                                        int i14 = 0;
                                                        while (i13 < 6) {
                                                            if (i14 >= 8) {
                                                                i14 = 0;
                                                            }
                                                            bArr7[i13] = (byte) (bArr7[i13] ^ bArr8[i14]);
                                                            i13++;
                                                            i14++;
                                                        }
                                                        if (str.equals(new String(bArr7, StandardCharsets.UTF_8))) {
                                                            b = 1;
                                                        } else {
                                                            b = -1;
                                                        }
                                                    } else if (iHashCode == -1754979095) {
                                                        byte[] bArr9 = {-60, -33, 119, -27, 47, 65};
                                                        byte[] bArr10 = {-111, -81, 19, -124, 91, 36, 68, 79};
                                                        int i15 = 0;
                                                        int i16 = 0;
                                                        while (i15 < 6) {
                                                            if (i16 >= 8) {
                                                                i16 = 0;
                                                            }
                                                            bArr9[i15] = (byte) (bArr9[i15] ^ bArr10[i16]);
                                                            i15++;
                                                            i16++;
                                                        }
                                                        if (str.equals(new String(bArr9, StandardCharsets.UTF_8))) {
                                                            b = 0;
                                                        } else {
                                                            b = -1;
                                                        }
                                                    } else if (iHashCode != 86836) {
                                                        b = -1;
                                                    } else {
                                                        byte[] bArr11 = {-50, -114, 115};
                                                        byte[] bArr12 = {-103, -21, 17, 93, 12, -67, -55, 87};
                                                        int i17 = 0;
                                                        int i18 = 0;
                                                        while (i17 < 3) {
                                                            if (i18 >= 8) {
                                                                i18 = 0;
                                                            }
                                                            bArr11[i17] = (byte) (bArr11[i17] ^ bArr12[i18]);
                                                            i17++;
                                                            i18++;
                                                        }
                                                        if (str.equals(new String(bArr11, StandardCharsets.UTF_8))) {
                                                            b = 2;
                                                        } else {
                                                            b = -1;
                                                        }
                                                    }
                                                    if (b == 0) {
                                                        WD.F(activity2, k5.j, k5.l);
                                                    } else if (b == 1) {
                                                        String str2 = k5.j;
                                                        String str3 = k5.l;
                                                        if (AbstractC2340Cl.F(activity2, str2)) {
                                                            try {
                                                                activity2.startActivity(activity2.getPackageManager().getLaunchIntentForPackage(str2));
                                                            } catch (Exception unused) {
                                                                WD.F(activity2, str2, str3);
                                                            }
                                                        } else {
                                                            WD.F(activity2, str2, str3);
                                                        }
                                                    } else if (b == 2) {
                                                        try {
                                                            uri = Uri.parse(k5.e.booleanValue() ? URLDecoder.decode(k5.m) : k5.m);
                                                        } catch (Exception e) {
                                                            e.printStackTrace();
                                                            uri = Uri.parse(k5.m);
                                                        }
                                                        try {
                                                            byte[] bArr13 = {45, 19, 112, -99, -102, 39, 0, -60, 37, 19, 96, -118, -101, 58, 74, -117, 47, 9, 125, -128, -101, 96, 50, -93, 9, 42};
                                                            byte[] bArr14 = {76, 125, 20, -17, -11, 78, 100, -22};
                                                            int i19 = 0;
                                                            int i20 = 0;
                                                            while (i19 < 26) {
                                                                if (i20 >= 8) {
                                                                    i20 = 0;
                                                                }
                                                                bArr13[i19] = (byte) (bArr13[i19] ^ bArr14[i20]);
                                                                i19++;
                                                                i20++;
                                                            }
                                                            activity2.startActivity(new Intent(new String(bArr13, StandardCharsets.UTF_8), uri));
                                                        } catch (Exception e2) {
                                                            e2.printStackTrace();
                                                        }
                                                    }
                                                    if (!k5.f3300a.booleanValue() || !k5.b.booleanValue()) {
                                                        c4068mg2.c(activity2);
                                                    }
                                                }
                                                break;
                                            default:
                                                byte[] bArr15 = {-47, -25, -74, -6, 82, -105, 105, 52, -58, -1, -74, -25, 23, -44, 103, 40, -47, -32, -8};
                                                byte[] bArr16 = {-78, -117, -39, -119, 55, -73, 11, 65};
                                                int i21 = 0;
                                                int i22 = 0;
                                                while (i21 < 19) {
                                                    if (i22 >= 8) {
                                                        i22 = 0;
                                                    }
                                                    bArr15[i21] = (byte) (bArr15[i21] ^ bArr16[i22]);
                                                    i21++;
                                                    i22++;
                                                }
                                                new String(bArr15, StandardCharsets.UTF_8);
                                                if (!c4068mg2.d()) {
                                                    c4068mg2.c(activity2);
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            try {
                                AlertDialog alertDialog = c4068mg0.e;
                                if (alertDialog != null && alertDialog.isShowing()) {
                                    c4068mg0.e.dismiss();
                                    c4068mg0.e = null;
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            AlertDialog alertDialogCreate = builder.create();
                            c4068mg0.e = alertDialogCreate;
                            alertDialogCreate.setOnDismissListener(new DialogInterfaceOnDismissListenerC3706ia0(c4068mg0, 2));
                            c4068mg0.e.setOnShowListener(new DialogInterfaceOnShowListenerC3577h3(c4068mg0, i2));
                            c4068mg0.e.setCancelable(!c4068mg0.d());
                            c4068mg0.e.setCanceledOnTouchOutside(!c4068mg0.d());
                            c4068mg0.e.show();
                            Button button = c4068mg0.e.getButton(-1);
                            if (button != null) {
                                button.setAllCaps(false);
                            }
                            Button button2 = c4068mg0.e.getButton(-2);
                            if (button2 != null) {
                                button2.setAllCaps(false);
                            }
                        }
                        c4068mg0.c++;
                    }
                } else {
                    C4068mg0 c4068mg2 = C4068mg0.h;
                    byte[] bArr5 = {-24, -116, 62, -55, 73, 82, 69, -86, -21, -128, 48, -54, 109, 2, 70, -105, -12, -109, com.umeng.analytics.pro.cw.n, -50, 120, 119, 69, -101, -6, -112, 52, -98, 102, 77, 65, -33, -24, -116, 62, -55, 40};
                    byte[] bArr6 = {-101, -28, 81, -66, 8, 34, 53, -1};
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < 37) {
                        if (i10 >= 8) {
                            i10 = 0;
                        }
                        bArr5[i9] = (byte) (bArr5[i9] ^ bArr6[i10]);
                        i9++;
                        i10++;
                    }
                    new String(bArr5, StandardCharsets.UTF_8);
                    atomicBoolean.set(false);
                }
                break;
        }
    }
}
