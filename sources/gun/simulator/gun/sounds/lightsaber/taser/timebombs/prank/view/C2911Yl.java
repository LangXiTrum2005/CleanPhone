package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import androidx.core.view.ViewCompat;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.textfield.TextInputLayout;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Yl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2911Yl implements BI, InterfaceC4441qt, FN, InterfaceC3064bC, InterfaceC2494Ij, InterfaceC2512Jb, ShapeAppearanceModel.CornerSizeUnaryOperator, TextInputLayout.LengthCounter, InterfaceC4563sH {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4039a;

    public /* synthetic */ C2911Yl(int i) {
        this.f4039a = i;
    }

    public static C2589Mb c(int i, C4619sw c4619sw, boolean z, ArrayList arrayList, InterfaceC4326pd0 interfaceC4326pd0) {
        InterfaceC4177nt c2455Gw;
        String str = c4619sw.k;
        if (AbstractC5011xP.l(str)) {
            return null;
        }
        if (str != null && (str.startsWith("video/webm") || str.startsWith(MimeTypes.AUDIO_WEBM) || str.startsWith(MimeTypes.APPLICATION_WEBM) || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
            c2455Gw = new PM(1);
        } else {
            c2455Gw = new C2455Gw(z ? 4 : 0, null, null, arrayList, interfaceC4326pd0);
        }
        return new C2589Mb(c2455Gw, i, c4619sw);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FN
    public int a(Object obj) {
        C4745uN c4745uN = (C4745uN) obj;
        switch (this.f4039a) {
            case 7:
                Pattern pattern = GN.f3119a;
                String str = c4745uN.f5075a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (Ug0.f3833a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                Pattern pattern2 = GN.f3119a;
                return c4745uN.f5075a.startsWith("OMX.google") ? 1 : 0;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2494Ij
    public void accept(Object obj) {
        ((T20) obj).b.e();
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public CornerSize apply(CornerSize cornerSize) {
        return MaskableFrameLayout.lambda$setShapeAppearanceModel$0(cornerSize);
    }

    public InterfaceC4177nt[] b() {
        return new InterfaceC4177nt[]{new Gj0()};
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public int countLength(Editable editable) {
        return TextInputLayout.lambda$new$0(editable);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4441qt
    public InterfaceC4177nt[] d(Uri uri, Map map) {
        return b();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3064bC
    public boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4563sH
    public String f(Context context) {
        switch (this.f4039a) {
            case 27:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            case 28:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                return (applicationInfo2 == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo2.minSdkVersion);
            default:
                int i = Build.VERSION.SDK_INT;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return "tv";
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    return "watch";
                }
                if (i < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    return (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
                }
                return "auto";
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:60:0x0140  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2512Jb
    public InterfaceC2538Kb g(Bundle bundle) {
        C3965lY c3965lYE;
        B2[] b2Arr;
        float f;
        int i;
        int i2;
        float f2;
        boolean z;
        int i3;
        switch (this.f4039a) {
            case 11:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(C3974ld0.f);
                if (parcelableArrayList == null) {
                    C5086yC c5086yC = AC.b;
                    c3965lYE = C3965lY.e;
                } else {
                    c3965lYE = FW.E(C4619sw.p0, parcelableArrayList);
                }
                return new C3974ld0(bundle.getString(C3974ld0.g, ""), (C4619sw[]) c3965lYE.toArray(new C4619sw[0]));
            case 12:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(C4062md0.e);
                return parcelableArrayList2 == null ? new C4062md0(new C3974ld0[0]) : new C4062md0((C3974ld0[]) FW.E(C3974ld0.h, parcelableArrayList2).toArray(new C3974ld0[0]));
            case 13:
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(C2.i);
                if (parcelableArrayList3 == null) {
                    b2Arr = new B2[0];
                } else {
                    B2[] b2Arr2 = new B2[parcelableArrayList3.size()];
                    for (int i4 = 0; i4 < parcelableArrayList3.size(); i4++) {
                        b2Arr2[i4] = (B2) B2.q.g((Bundle) parcelableArrayList3.get(i4));
                    }
                    b2Arr = b2Arr2;
                }
                return new C2(null, b2Arr, bundle.getLong(C2.j, 0L), bundle.getLong(C2.k, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET), bundle.getInt(C2.l, 0));
            case 14:
                long j = bundle.getLong(B2.i);
                int i5 = bundle.getInt(B2.j);
                int i6 = bundle.getInt(B2.p);
                ArrayList parcelableArrayList4 = bundle.getParcelableArrayList(B2.k);
                int[] intArray = bundle.getIntArray(B2.l);
                long[] longArray = bundle.getLongArray(B2.m);
                long j2 = bundle.getLong(B2.n);
                boolean z2 = bundle.getBoolean(B2.o);
                if (intArray == null) {
                    intArray = new int[0];
                }
                return new B2(j, i5, i6, intArray, parcelableArrayList4 == null ? new Uri[0] : (Uri[]) parcelableArrayList4.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j2, z2);
            case 15:
            case 16:
            case 18:
            case 19:
            case 22:
            default:
                return new Ih0(bundle.getInt(Ih0.f, 0), bundle.getFloat(Ih0.i, 1.0f), bundle.getInt(Ih0.g, 0), bundle.getInt(Ih0.h, 0));
            case 17:
                CharSequence charSequence = bundle.getCharSequence(C2417Fk.s);
                CharSequence charSequence2 = charSequence != null ? charSequence : null;
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(C2417Fk.t);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(C2417Fk.u);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap = (Bitmap) bundle.getParcelable(C2417Fk.v);
                Bitmap bitmap2 = bitmap != null ? bitmap : null;
                String str = C2417Fk.w;
                if (bundle.containsKey(str)) {
                    String str2 = C2417Fk.x;
                    if (bundle.containsKey(str2)) {
                        f = bundle.getFloat(str);
                        i = bundle.getInt(str2);
                    } else {
                        f = -3.4028235E38f;
                        i = Integer.MIN_VALUE;
                    }
                } else {
                    f = -3.4028235E38f;
                    i = Integer.MIN_VALUE;
                }
                String str3 = C2417Fk.y;
                int i7 = bundle.containsKey(str3) ? bundle.getInt(str3) : Integer.MIN_VALUE;
                String str4 = C2417Fk.z;
                float f3 = bundle.containsKey(str4) ? bundle.getFloat(str4) : -3.4028235E38f;
                String str5 = C2417Fk.A;
                int i8 = bundle.containsKey(str5) ? bundle.getInt(str5) : Integer.MIN_VALUE;
                String str6 = C2417Fk.C;
                if (bundle.containsKey(str6)) {
                    String str7 = C2417Fk.B;
                    if (bundle.containsKey(str7)) {
                        float f4 = bundle.getFloat(str6);
                        i2 = bundle.getInt(str7);
                        f2 = f4;
                    } else {
                        i2 = Integer.MIN_VALUE;
                        f2 = -3.4028235E38f;
                    }
                } else {
                    i2 = Integer.MIN_VALUE;
                    f2 = -3.4028235E38f;
                }
                String str8 = C2417Fk.D;
                float f5 = bundle.containsKey(str8) ? bundle.getFloat(str8) : -3.4028235E38f;
                String str9 = C2417Fk.E;
                float f6 = bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
                String str10 = C2417Fk.F;
                if (bundle.containsKey(str10)) {
                    i3 = bundle.getInt(str10);
                    z = true;
                } else {
                    z = false;
                    i3 = ViewCompat.MEASURED_STATE_MASK;
                }
                boolean z3 = !bundle.getBoolean(C2417Fk.G, false) ? false : z;
                String str11 = C2417Fk.H;
                int i9 = bundle.containsKey(str11) ? bundle.getInt(str11) : Integer.MIN_VALUE;
                String str12 = C2417Fk.I;
                return new C2417Fk(charSequence2, alignment2, alignment4, bitmap2, f, i, i7, f3, i8, i2, f2, f5, f6, z3, i3, i9, bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f);
            case 20:
                int i10 = bundle.getInt(C3027ao.d, -1);
                int[] intArray2 = bundle.getIntArray(C3027ao.e);
                int i11 = bundle.getInt(C3027ao.f, -1);
                FW.h(i10 >= 0 && i11 >= 0);
                intArray2.getClass();
                return new C3027ao(i10, i11, intArray2);
            case 21:
                Bundle bundle2 = bundle.getBundle(C4501rd0.c);
                bundle2.getClass();
                C3974ld0 c3974ld0 = (C3974ld0) C3974ld0.h.g(bundle2);
                int[] intArray3 = bundle.getIntArray(C4501rd0.d);
                intArray3.getClass();
                return new C4501rd0(c3974ld0, intArray3.length == 0 ? Collections.emptyList() : new XD(intArray3, 0, intArray3.length));
            case 23:
                return new C2879Xf(bundle.getInt(C2879Xf.f, -1), bundle.getInt(C2879Xf.g, -1), bundle.getInt(C2879Xf.h, -1), bundle.getByteArray(C2879Xf.i));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
    public void invoke(Object obj) {
        InterfaceC3579h4 interfaceC3579h4 = (InterfaceC3579h4) obj;
        switch (this.f4039a) {
            case 0:
                interfaceC3579h4.getClass();
                break;
            case 1:
                interfaceC3579h4.getClass();
                break;
            case 2:
                interfaceC3579h4.getClass();
                break;
            case 3:
                interfaceC3579h4.getClass();
                break;
            default:
                interfaceC3579h4.getClass();
                break;
        }
    }

    public /* synthetic */ C2911Yl(C3403f4 c3403f4, int i, int i2) {
        this.f4039a = i2;
    }
}
