package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2871Wx implements InterfaceC3385er, InterfaceC4596sh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f3947a = null;
    public static final InterfaceC2857Wj[] b = new InterfaceC2857Wj[0];
    public static final Qm0 c = new Qm0(24);
    public static final D40[] d = new D40[0];
    public static float e = 0.0f;
    public static float f = 0.0f;
    public static float g = 0.0f;
    public static float h = 0.0f;
    public static String i = "Standard";
    public static String j = "jichu";
    public static UiModeManager k;

    public static final C4034mF G(Number number, String str) {
        return new C4034mF("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) k0(str, -1)), 1);
    }

    public static final C4034mF H(D40 d40) {
        AbstractC2995aW.q(d40, "keyDescriptor");
        return new C4034mF("Value of type '" + d40.h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + d40.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.", 1);
    }

    public static final C4034mF I(int i2, String str) {
        AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
        if (i2 >= 0) {
            str = "Unexpected JSON token at offset " + i2 + ": " + str;
        }
        return new C4034mF(str, 0);
    }

    public static final C4034mF J(int i2, String str, String str2) {
        AbstractC2995aW.q(str2, PglCryptUtils.KEY_MESSAGE);
        AbstractC2995aW.q(str, "input");
        return I(i2, str2 + "\nJSON input: " + ((Object) k0(str, i2)));
    }

    public static Object K(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void L(Parcel parcel, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i2);
        }
    }

    public static final void M(AbstractC3882kb0 abstractC3882kb0, C4234ob0 c4234ob0, String str) {
        C4497rb0.i.fine(c4234ob0.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + abstractC3882kb0.f4603a);
    }

    public static final InterfaceC3858kF N(InterfaceC2548Kl interfaceC2548Kl) {
        AbstractC2995aW.q(interfaceC2548Kl, "<this>");
        InterfaceC3858kF interfaceC3858kF = interfaceC2548Kl instanceof InterfaceC3858kF ? (InterfaceC3858kF) interfaceC2548Kl : null;
        if (interfaceC3858kF != null) {
            return interfaceC3858kF;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + AbstractC3263dY.a(interfaceC2548Kl.getClass()));
    }

    public static final InterfaceC4825vF O(InterfaceC3385er interfaceC3385er) {
        AbstractC2995aW.q(interfaceC3385er, "<this>");
        InterfaceC4825vF interfaceC4825vF = interfaceC3385er instanceof InterfaceC4825vF ? (InterfaceC4825vF) interfaceC3385er : null;
        if (interfaceC4825vF != null) {
            return interfaceC4825vF;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + AbstractC3263dY.a(interfaceC3385er.getClass()));
    }

    public static C4868vl P(FY fy, String str, C3614hX c3614hX, int i2) {
        C4780ul c4780ul = new C4780ul();
        c4780ul.f5098a = FW.X(str, c3614hX.c);
        c4780ul.f = c3614hX.f4456a;
        c4780ul.g = c3614hX.b;
        String strA = fy.a();
        if (strA == null) {
            strA = c3614hX.b(((U9) fy.b.get(0)).f3813a).toString();
        }
        c4780ul.c(strA);
        c4780ul.b(i2);
        return c4780ul.a();
    }

    public static final Set Q(D40 d40) {
        AbstractC2995aW.q(d40, "<this>");
        if (d40 instanceof InterfaceC2331Cc) {
            return ((InterfaceC2331Cc) d40).a();
        }
        HashSet hashSet = new HashSet(d40.d());
        int iD = d40.d();
        for (int i2 = 0; i2 < iD; i2++) {
            hashSet.add(d40.e(i2));
        }
        return hashSet;
    }

    public static final byte R(char c2) {
        if (c2 < '~') {
            return C4590se.b[c2];
        }
        return (byte) 0;
    }

    public static void S(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void T(String str, boolean z) throws KT {
        if (!z) {
            throw KT.a(str, null);
        }
    }

    public static void U(Object obj) {
        V(obj, "Argument must not be null");
    }

    public static void V(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final D40[] W(List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        if (list == null) {
            return d;
        }
        Object[] array = list.toArray(new D40[0]);
        AbstractC2995aW.o(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (D40[]) array;
    }

    public static void X(String str, String str2, Object obj) {
        if (Log.isLoggable(f0(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static final String a0(long j2) {
        String strS;
        if (j2 <= -999500000) {
            strS = AbstractC3950lJ.s(new StringBuilder(), (j2 - ((long) 500000000)) / ((long) 1000000000), " s ");
        } else if (j2 <= -999500) {
            strS = AbstractC3950lJ.s(new StringBuilder(), (j2 - ((long) 500000)) / ((long) 1000000), " ms");
        } else if (j2 <= 0) {
            strS = AbstractC3950lJ.s(new StringBuilder(), (j2 - ((long) 500)) / ((long) 1000), " µs");
        } else if (j2 < 999500) {
            strS = AbstractC3950lJ.s(new StringBuilder(), (j2 + ((long) 500)) / ((long) 1000), " µs");
        } else {
            strS = j2 < 999500000 ? AbstractC3950lJ.s(new StringBuilder(), (j2 + ((long) 500000)) / ((long) 1000000), " ms") : AbstractC3950lJ.s(new StringBuilder(), (j2 + ((long) 500000000)) / ((long) 1000000000), " s ");
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strS}, 1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String b0(String str) {
        AbstractC2995aW.q(str, "weaponName");
        switch (str.hashCode()) {
            case -2054746672:
                if (str.equals("Kar98K")) {
                    return (String) ((C2856Wi) AbstractC3371ej.t.getValue()).a();
                }
                return "Standard";
            case -2040511715:
                if (str.equals("M4A4-P")) {
                    return (String) ((C2856Wi) AbstractC3371ej.q.getValue()).a();
                }
                return "Standard";
            case -1853321774:
                if (str.equals("D.E-GOLD")) {
                    return (String) ((C2856Wi) AbstractC3371ej.e.getValue()).a();
                }
                return "Standard";
            case -1787950154:
                if (str.equals("UMP-45")) {
                    return (String) ((C2856Wi) AbstractC3371ej.d.getValue()).a();
                }
                return "Standard";
            case -1362852984:
                if (str.equals("Colt Python")) {
                    return (String) ((C2856Wi) AbstractC3371ej.j.getValue()).a();
                }
                return "Standard";
            case -104799306:
                if (str.equals("SCAR 20S")) {
                    return (String) ((C2856Wi) AbstractC3371ej.l.getValue()).a();
                }
                return "Standard";
            case 65239:
                if (str.equals("AWM")) {
                    return (String) ((C2856Wi) AbstractC3371ej.m.getValue()).a();
                }
                return "Standard";
            case 65242:
                if (str.equals("AWP")) {
                    return (String) ((C2856Wi) AbstractC3371ej.c.getValue()).a();
                }
                return "Standard";
            case 76530:
                if (str.equals("MP5")) {
                    return (String) ((C2856Wi) AbstractC3371ej.k.getValue()).a();
                }
                return "Standard";
            case 78695:
                if (str.equals("P90")) {
                    return (String) ((C2856Wi) AbstractC3371ej.b.getValue()).a();
                }
                return "Standard";
            case 84338:
                if (str.equals("USP")) {
                    return (String) ((C2856Wi) AbstractC3371ej.n.getValue()).a();
                }
                return "Standard";
            case 2345946:
                if (str.equals("M4A4")) {
                    return (String) ((C2856Wi) AbstractC3371ej.g.getValue()).a();
                }
                return "Standard";
            case 2348486:
                if (str.equals("M762")) {
                    return (String) ((C2856Wi) AbstractC3371ej.u.getValue()).a();
                }
                return "Standard";
            case 62308102:
                if (str.equals("AK-47")) {
                    return (String) ((C2856Wi) AbstractC3371ej.s.getValue()).a();
                }
                return "Standard";
            case 64737569:
                if (str.equals("Russian Roulette")) {
                    return (String) ((C2856Wi) AbstractC2934Zi.f4086a.getValue()).a();
                }
                return "Standard";
            case 68779382:
                if (str.equals("HK416")) {
                    return (String) ((C2856Wi) AbstractC3371ej.o.getValue()).a();
                }
                return "Standard";
            case 72618575:
                if (str.equals("M1014")) {
                    return (String) ((C2856Wi) AbstractC3371ej.i.getValue()).a();
                }
                return "Standard";
            case 75145761:
                if (str.equals("Negev")) {
                    return (String) ((C2856Wi) AbstractC3371ej.f4332a.getValue()).a();
                }
                return "Standard";
            case 1475729840:
                if (str.equals("Gatling")) {
                    return (String) ((C2856Wi) AbstractC3371ej.f.getValue()).a();
                }
                return "Standard";
            case 1931762354:
                if (str.equals("AK47-R")) {
                    return (String) ((C2856Wi) AbstractC3371ej.p.getValue()).a();
                }
                return "Standard";
            case 1931762361:
                if (str.equals("AK47-Y")) {
                    return (String) ((C2856Wi) AbstractC3371ej.h.getValue()).a();
                }
                return "Standard";
            case 2056648249:
                if (str.equals("Desert Eagle")) {
                    return (String) ((C2856Wi) AbstractC3371ej.r.getValue()).a();
                }
                return "Standard";
            default:
                return "Standard";
        }
    }

    public static int c0(C4391qK c4391qK, InputStream inputStream, List list) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new VX(inputStream, c4391qK);
        }
        inputStream.mark(5242880);
        return d0(list, new C3692iN(4, inputStream, c4391qK));
    }

    public static int d0(List list, InterfaceC4207oC interfaceC4207oC) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iG = interfaceC4207oC.g((InterfaceC3943lC) list.get(i2));
            if (iG != -1) {
                return iG;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0ba9, code lost:
    
        if (r1.equals("LightSaber-K") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0bb3, code lost:
    
        if (r1.equals("LightSaber-I") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0bbd, code lost:
    
        if (r1.equals("LightSaber-G") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0bc7, code lost:
    
        if (r1.equals("LightSaber-D") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0bcb, code lost:
    
        r27 = true;
        r28 = null;
        r22 = 0.0f;
        r23 = 0.0f;
        r24 = 1.0f;
        r29 = 128;
        r30 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0c9d, code lost:
    
        if (r1.equals("LightSaber-B") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0d21, code lost:
    
        r29 = 128;
        r30 = null;
        r22 = 0.0f;
        r23 = 0.0f;
        r24 = 1.0f;
        r27 = true;
        r28 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5.t0(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.y0("LIGHT_SABER_DISMISS", new com.badlogic.gdx.backends.android.SpineData(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl.f("toString(...)"), r22, r23, r24, "spine/lightsaber/xiaoshi.atlas", "spine/lightsaber/xiaoshi.json", r27, r28, r29, r30)), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.y0("LIGHT_SABER_DISMISS1", new com.badlogic.gdx.backends.android.SpineData(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl.f("toString(...)"), r22, r23, r24, "spine/lightsaber/xiaoshi.atlas", "spine/lightsaber/xiaoshi.json", r27, r28, r29, r30)), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.y0("LIGHT_SABER_EFFECT", new com.badlogic.gdx.backends.android.SpineData(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl.f("toString(...)"), r22, r23, r24, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM.B("spine/lightsaber/", gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx.j, ".atlas"), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM.B("spine/lightsaber/", gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx.j, ".json"), r27, r28, r29, r30)), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.y0("LIGHT_SABER_EFFECT1", new com.badlogic.gdx.backends.android.SpineData(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl.f("toString(...)"), r22, r23, r24, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM.B("spine/lightsaber/", gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx.j, ".atlas"), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM.B("spine/lightsaber/", gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx.j, ".json"), r27, r28, r29, r30)), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.y0("LIGHT_RECTANGLE", new com.badlogic.gdx.backends.android.SpineData(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl.f("toString(...)"), r22, r23, r24, "spine/lightsaber/guangzhu_guangyun.atlas", "spine/lightsaber/guangzhu_guangyun.json", r27, r28, r29, r30)), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.y0("LIGHT_RECTANGLE1", new com.badlogic.gdx.backends.android.SpineData(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl.f("toString(...)"), r22, r23, r24, "spine/lightsaber/guangzhu_guangyun.atlas", "spine/lightsaber/guangzhu_guangyun.json", r27, r28, r29, r30)), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.y0("LIGHT_SABER", new com.badlogic.gdx.backends.android.SpineData(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl.f("toString(...)"), r22, r23, r24, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM.B("spine/lightsaber/", r67.getName(), ".atlas"), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM.B("spine/lightsaber/", r67.getName(), ".json"), r27, r28, r29, r30)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5.t0(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.y0("LIGHT_SABER_DISMISS", new com.badlogic.gdx.backends.android.SpineData(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl.f("toString(...)"), r22, r23, r24, "spine/lightsaber/xiaoshi.atlas", "spine/lightsaber/xiaoshi.json", r27, r28, r29, r30)), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.y0("LIGHT_SABER_DISMISS1", new com.badlogic.gdx.backends.android.SpineData(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl.f("toString(...)"), r22, r23, r24, "spine/lightsaber/xiaoshi.atlas", "spine/lightsaber/xiaoshi.json", r27, r28, r29, r30)), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.y0("LIGHT_SABER_DISMISS2", new com.badlogic.gdx.backends.android.SpineData(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl.f("toString(...)"), r22, r23, r24, "spine/lightsaber/xiaoshi.atlas", "spine/lightsaber/xiaoshi.json", r27, r28, r29, r30)), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.y0("LIGHT_SABER_EFFECT", new com.badlogic.gdx.backends.android.SpineData(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl.f("toString(...)"), r22, r23, r24, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM.B("spine/lightsaber/", gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx.j, ".atlas"), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM.B("spine/lightsaber/", gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx.j, ".json"), r27, r28, r29, r30)), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.y0("LIGHT_SABER_EFFECT1", new com.badlogic.gdx.backends.android.SpineData(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl.f("toString(...)"), r22, r23, r24, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM.B("spine/lightsaber/", gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx.j, ".atlas"), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM.B("spine/lightsaber/", gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx.j, ".json"), r27, r28, r29, r30)), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.y0("LIGHT_SABER_EFFECT2", new com.badlogic.gdx.backends.android.SpineData(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl.f("toString(...)"), r22, r23, r24, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM.B("spine/lightsaber/", gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx.j, ".atlas"), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM.B("spine/lightsaber/", gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx.j, ".json"), r27, r28, r29, r30)), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.y0("LIGHT_RECTANGLE", new com.badlogic.gdx.backends.android.SpineData(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl.f("toString(...)"), r22, r23, r24, "spine/lightsaber/guangzhu_guangyun.atlas", "spine/lightsaber/guangzhu_guangyun.json", r27, r28, r29, r30)), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.y0("LIGHT_RECTANGLE1", new com.badlogic.gdx.backends.android.SpineData(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl.f("toString(...)"), r22, r23, r24, "spine/lightsaber/guangzhu_guangyun.atlas", "spine/lightsaber/guangzhu_guangyun.json", r27, r28, r29, r30)), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.y0("LIGHT_RECTANGLE2", new com.badlogic.gdx.backends.android.SpineData(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl.f("toString(...)"), r22, r23, r24, "spine/lightsaber/guangzhu_guangyun.atlas", "spine/lightsaber/guangzhu_guangyun.json", r27, r28, r29, r30)), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.y0("LIGHT_SABER", new com.badlogic.gdx.backends.android.SpineData(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl.f("toString(...)"), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el.F() / 2.0f, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el.E() / 2.0f, r24, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM.B("spine/lightsaber/", r67.getName(), ".atlas"), gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM.B("spine/lightsaber/", r67.getName(), ".json"), r27, r28, r29, r30)));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.LinkedHashMap e0(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon r67) {
        /*
            Method dump skipped, instruction units count: 3770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx.e0(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon):java.util.LinkedHashMap");
    }

    public static String f0(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static ImageHeaderParser$ImageType g0(C4391qK c4391qK, InputStream inputStream, List list) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new VX(inputStream, c4391qK);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeD = ((InterfaceC3943lC) list.get(i2)).d(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeD != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeD;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType h0(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeB = ((InterfaceC3943lC) list.get(i2)).b(byteBuffer);
                AbstractC3092bc.c(byteBuffer);
                if (imageHeaderParser$ImageTypeB != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeB;
                }
            } catch (Throwable th) {
                AbstractC3092bc.c(byteBuffer);
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static final int i0(D40 d40, D40[] d40Arr) {
        AbstractC2995aW.q(d40, "<this>");
        AbstractC2995aW.q(d40Arr, "typeParams");
        int iHashCode = (d40.h().hashCode() * 31) + Arrays.hashCode(d40Arr);
        G40 g40 = new G40(d40, 0);
        int iHashCode2 = 1;
        int iHashCode3 = 1;
        while (g40.hasNext()) {
            int i2 = iHashCode3 * 31;
            String strH = ((D40) g40.next()).h();
            iHashCode3 = i2 + (strH != null ? strH.hashCode() : 0);
        }
        G40 g41 = new G40(d40, 0);
        while (g41.hasNext()) {
            int i3 = iHashCode2 * 31;
            L40 kind = ((D40) g41.next()).getKind();
            iHashCode2 = i3 + (kind != null ? kind.hashCode() : 0);
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    public static final InterfaceC3156cG j0(InterfaceC4211oG interfaceC4211oG) {
        AbstractC2995aW.q(interfaceC4211oG, "<this>");
        InterfaceC3245dG interfaceC3245dG = ((Be0) interfaceC4211oG).f2882a;
        if (interfaceC3245dG instanceof InterfaceC3156cG) {
            return (InterfaceC3156cG) interfaceC3245dG;
        }
        throw new IllegalStateException(("Only KClass supported as classifier, got " + interfaceC3245dG).toString());
    }

    public static final CharSequence k0(CharSequence charSequence, int i2) {
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i2 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i3 = i2 - 30;
        int i4 = i2 + 30;
        String str = i3 <= 0 ? "" : ".....";
        String str2 = i4 >= charSequence.length() ? "" : ".....";
        StringBuilder sbO = DM.o(str);
        if (i3 < 0) {
            i3 = 0;
        }
        int length2 = charSequence.length();
        if (i4 > length2) {
            i4 = length2;
        }
        sbO.append(charSequence.subSequence(i3, i4).toString());
        sbO.append(str2);
        return sbO.toString();
    }

    public static F4 l0(WF wf, MJ mj) {
        return new F4(BG.a(wf, mj, 1.0f, G7.c, false), 0);
    }

    public static G4 m0(MF mf, MJ mj, boolean z) {
        return new G4(BG.a(mf, mj, z ? AbstractC3014ah0.c() : 1.0f, C4003lv.f4674a, false), 0);
    }

    public static F4 n0(MF mf, MJ mj) {
        return new F4(BG.a(mf, mj, 1.0f, CD.f2914a, false), 2);
    }

    public static F4 o0(WF wf, MJ mj) {
        return new F4(BG.a(wf, mj, AbstractC3014ah0.c(), C3524gV.f4417a, true), 3);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public static final int p0(C3316e40 c3316e40, int i2) {
        int i3;
        AbstractC2995aW.q(c3316e40, "<this>");
        int i4 = i2 + 1;
        int length = c3316e40.e.length;
        int[] iArr = c3316e40.f;
        AbstractC2995aW.q(iArr, "<this>");
        int i5 = length - 1;
        int i6 = 0;
        while (i6 <= i5) {
            i3 = (i6 + i5) >>> 1;
            int i7 = iArr[i3];
            if (i7 < i4) {
                i6 = i3 + 1;
            } else {
                if (i7 <= i4) {
                    if (i3 >= 0) {
                        return i3;
                    }
                    return ~i3;
                }
                i5 = i3 - 1;
            }
        }
        i3 = (-i6) - 1;
        if (i3 >= 0) {
            return i3;
        }
        return ~i3;
    }

    public static final void q0(InterfaceC3156cG interfaceC3156cG) {
        AbstractC2995aW.q(interfaceC3156cG, "<this>");
        throw new P40("Serializer for class '" + ((C3186cf) interfaceC3156cG).b() + "' is not found.\nMark the class as @Serializable or provide the serializer explicitly.");
    }

    public static void r0(String str) {
        AbstractC2995aW.q(str, "weaponName");
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_ak47))) {
            g = 424.0f;
            h = 720.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_desert_eagle))) {
            g = 468.0f;
            h = 747.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_colt_python))) {
            g = 456.0f;
            h = 708.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_de_gold))) {
            g = 444.0f;
            h = 699.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_usp))) {
            g = 453.0f;
            h = 762.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_ump45))) {
            g = 474.0f;
            h = 732.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_m762))) {
            g = 471.0f;
            h = 735.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_m4a4))) {
            g = 480.0f;
            h = 747.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_m4a4_p))) {
            g = 486.0f;
            h = 714.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_p90))) {
            g = 516.0f;
            h = 741.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_ak47_r))) {
            g = 456.0f;
            h = 762.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_ak47_y))) {
            g = 468.0f;
            h = 744.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_hk416))) {
            g = 444.0f;
            h = 762.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_awp))) {
            g = 519.0f;
            h = 768.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_negev))) {
            g = 447.0f;
            h = 762.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_awm))) {
            g = 519.0f;
            h = 759.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_gatling))) {
            g = 519.0f;
            h = 756.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_mp5))) {
            g = 430.0f;
            h = 768.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_scar_20s))) {
            g = 514.0f;
            h = 765.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_kar98k))) {
            g = 490.0f;
            h = 771.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_m1014))) {
            g = 505.0f;
            h = 753.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.taser_one))) {
            g = 659.0f;
            h = 744.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.taser_two))) {
            g = 533.0f;
            h = 712.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.taser_three))) {
            g = 463.0f;
            h = 712.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.taser_four))) {
            g = 533.0f;
            h = 730.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.taser_five))) {
            g = 534.0f;
            h = 743.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.taser_six))) {
            g = 450.0f;
            h = 717.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.taser_seven))) {
            g = 503.0f;
            h = 745.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.taser_eight))) {
            g = 534.0f;
            h = 774.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.lightsaber_one))) {
            g = 534.0f;
            h = 297.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.lightsaber_two))) {
            g = 534.0f;
            h = 298.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.lightsaber_three))) {
            g = 534.0f;
            h = 303.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.lightsaber_four))) {
            g = 534.0f;
            h = 784.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.lightsaber_five))) {
            g = 534.0f;
            h = 303.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.lightsaber_six))) {
            g = 534.0f;
            h = 368.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.lightsaber_seven))) {
            g = 534.0f;
            h = 278.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.lightsaber_eight))) {
            g = 539.0f;
            h = 318.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.lightsaber_nine))) {
            g = 534.0f;
            h = 785.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.lightsaber_ten))) {
            g = 534.0f;
            h = 278.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.lightsaber_eleven))) {
            g = 534.0f;
            h = 780.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.lightsaber_twelve))) {
            g = 534.0f;
            h = 299.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_science_arc))) {
            g = 456.0f;
            h = 720.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_science_arc2))) {
            g = 519.0f;
            h = 765.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_science_arc3))) {
            g = 537.0f;
            h = 690.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_science_energy_cannon))) {
            g = 462.0f;
            h = 735.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_science_energy_cannon2))) {
            g = 435.0f;
            h = 732.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_laser_gun))) {
            g = 462.0f;
            h = 732.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_science_laser_gun2))) {
            g = 519.0f;
            h = 729.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_science_energy_cannon3))) {
            g = 519.0f;
            h = 693.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_science_energy_cannon4))) {
            g = 468.0f;
            h = 717.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_science_laser_gun5))) {
            g = 462.0f;
            h = 717.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_russian_roulette))) {
            g = 0.0f;
            h = 0.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_aug))) {
            g = 474.0f;
            h = 735.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_mp7))) {
            g = 453.0f;
            h = 738.0f;
            return;
        }
        if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_f2000))) {
            g = 516.0f;
            h = 726.0f;
        } else if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_svd))) {
            g = 519.0f;
            h = 735.0f;
        } else if (AbstractC2995aW.i(str, AbstractApplicationC2673Ph.m.getString(R.string.weapon_name_glock_17))) {
            g = 435.0f;
            h = 771.0f;
        }
    }

    public static final void s0(T90 t90, Number number) {
        AbstractC2995aW.q(t90, "<this>");
        T90.p(t90, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final void t0(String str, InterfaceC3156cG interfaceC3156cG) {
        AbstractC2995aW.q(interfaceC3156cG, "baseClass");
        String str2 = "in the scope of '" + ((C3186cf) interfaceC3156cG).b() + '\'';
        throw new P40(str == null ? AbstractC3888ke0.i("Class discriminator was missing and no default polymorphic serializers were registered ", str2) : AbstractC5044xl.n("Class '", str, "' is not registered for polymorphic serialization ", str2, ".\nMark the base class as 'sealed' or register the serializer explicitly."));
    }

    public static final String u0(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) k0(str2, -1));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public void A(char c2) {
        Z(Character.valueOf(c2));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public void B(D40 d40, int i2, InterfaceC4123nG interfaceC4123nG, Object obj) {
        AbstractC2995aW.q(d40, "descriptor");
        AbstractC2995aW.q(interfaceC4123nG, "serializer");
        Y(d40, i2);
        x(interfaceC4123nG, obj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public void C(D40 d40, int i2, boolean z) {
        AbstractC2995aW.q(d40, "descriptor");
        Y(d40, i2);
        w(z);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public abstract void D(int i2);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public void E(AV av, int i2, byte b2) {
        AbstractC2995aW.q(av, "descriptor");
        Y(av, i2);
        f(b2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public void F(String str) {
        AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Z(str);
    }

    public void Y(D40 d40, int i2) {
        AbstractC2995aW.q(d40, "descriptor");
    }

    public void Z(Object obj) {
        AbstractC2995aW.q(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        throw new P40("Non-serializable " + AbstractC3263dY.a(obj.getClass()) + " is not supported by " + AbstractC3263dY.a(getClass()) + " encoder");
    }

    public void b(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public InterfaceC4596sh c(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public void e(double d2) {
        Z(Double.valueOf(d2));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public abstract void f(byte b2);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public void g(int i2, int i3, D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        Y(d40, i2);
        D(i3);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public void h(AV av, int i2, char c2) {
        AbstractC2995aW.q(av, "descriptor");
        Y(av, i2);
        A(c2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public InterfaceC3385er i(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        return this;
    }

    public boolean j(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public void k(D40 d40, int i2, float f2) {
        AbstractC2995aW.q(d40, "descriptor");
        Y(d40, i2);
        y(f2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public void l(D40 d40, int i2, long j2) {
        AbstractC2995aW.q(d40, "descriptor");
        Y(d40, i2);
        s(j2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public void m(D40 d40, int i2) {
        AbstractC2995aW.q(d40, "enumDescriptor");
        Z(Integer.valueOf(i2));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public void n(AV av, int i2, short s) {
        AbstractC2995aW.q(av, "descriptor");
        Y(av, i2);
        v(s);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public void o(int i2, String str, D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Y(d40, i2);
        F(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public InterfaceC3385er q(AV av, int i2) {
        AbstractC2995aW.q(av, "descriptor");
        Y(av, i2);
        return i(av.g(i2));
    }

    public void r(D40 d40, int i2, InterfaceC4123nG interfaceC4123nG, Object obj) {
        AbstractC2995aW.q(d40, "descriptor");
        AbstractC2995aW.q(interfaceC4123nG, "serializer");
        Y(d40, i2);
        AbstractC4496rb.n(this, interfaceC4123nG, obj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public abstract void s(long j2);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public void t() {
        throw new P40("'null' is not supported by default");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4596sh
    public void u(AV av, int i2, double d2) {
        AbstractC2995aW.q(av, "descriptor");
        Y(av, i2);
        e(d2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public abstract void v(short s);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public void w(boolean z) {
        Z(Boolean.valueOf(z));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public void x(InterfaceC4123nG interfaceC4123nG, Object obj) {
        AbstractC2995aW.q(interfaceC4123nG, "serializer");
        interfaceC4123nG.serialize(this, obj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public void y(float f2) {
        Z(Float.valueOf(f2));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3385er
    public InterfaceC4596sh z(D40 d40, int i2) {
        AbstractC2995aW.q(d40, "descriptor");
        return c(d40);
    }
}
