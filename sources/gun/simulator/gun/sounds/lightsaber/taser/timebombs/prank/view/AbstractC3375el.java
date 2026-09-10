package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.Lock;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.el, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3375el {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5 f4334a = new C5("com.hairclipper.liedetector.brokenscreen.prankguys", Integer.valueOf(R.drawable.ad_prankguys), Integer.valueOf(R.drawable.ad_prank_home), Integer.valueOf(R.string.PrankGuys), Integer.valueOf(R.string.Funny_all_in));
    public static final C2785Tp b = new C2785Tp();
    public static final C5049xn0 c = new C5049xn0(1);
    public static final String[] d = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] e = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] f = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static C3190ch A(String str, InterfaceC4563sH interfaceC4563sH) {
        C3605hO c3605hOA = C3190ch.a(C3235d8.class);
        c3605hOA.c = 1;
        c3605hOA.b(C5226zo.a(Context.class));
        c3605hOA.f = new C4475rH(str, interfaceC4563sH, 0);
        return c3605hOA.c();
    }

    public static Point B(Context context) {
        Display defaultDisplay = ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public static final InterfaceC3156cG C(D40 d40) {
        AbstractC2995aW.q(d40, "<this>");
        if (d40 instanceof C2779Tj) {
            return ((C2779Tj) d40).b;
        }
        if (d40 instanceof E40) {
            return C(((E40) d40).f3005a);
        }
        return null;
    }

    public static Point D(Activity activity) {
        Display defaultDisplay = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point;
    }

    public static int E() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int F() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static int G(Context context) {
        return context.getResources().getDimensionPixelOffset(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    public static final void H(InterfaceC3549gk interfaceC3549gk, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC4163nk.f4756a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC4075mk) it.next()).handleException(interfaceC3549gk, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC2995aW.h(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            AbstractC2995aW.h(th, new C2654Oo(interfaceC3549gk));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static boolean I(String str) {
        C2329Ca c2329Ca;
        C2907Yh c2907Yh = C2375Du.a().g;
        c2907Yh.getClass();
        HashSet<String> hashSet = new HashSet();
        C2777Th c2777Th = c2907Yh.c;
        hashSet.addAll(C2907Yh.d(c2777Th));
        C2777Th c2777Th2 = c2907Yh.d;
        hashSet.addAll(C2907Yh.d(c2777Th2));
        HashMap map = new HashMap();
        for (String str2 : hashSet) {
            String strE = C2907Yh.e(c2777Th, str2);
            if (strE != null) {
                c2907Yh.b(C2907Yh.c(c2777Th), str2);
                c2329Ca = new C2329Ca(strE, 2);
            } else {
                String strE2 = C2907Yh.e(c2777Th2, str2);
                c2329Ca = strE2 != null ? new C2329Ca(strE2, 1) : new C2329Ca("", 0);
            }
            map.put(str2, c2329Ca);
        }
        return map.containsKey(str);
    }

    public static /* synthetic */ InterfaceC4612sp J(InterfaceC5000xE interfaceC5000xE, boolean z, GE ge, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        return interfaceC5000xE.m(z, (i & 2) != 0, ge);
    }

    public static final void K(InterfaceC4443qv interfaceC4443qv, InterfaceC4514rk interfaceC4514rk) {
        WD.D(interfaceC4514rk, null, 0, new C4882vv(interfaceC4443qv, null), 3);
    }

    public static final InterfaceC3069bH L(InterfaceC2714Qw interfaceC2714Qw) {
        return AbstractC2340Cl.H(EnumC4124nH.c, interfaceC2714Qw);
    }

    public static void M(Context context, String str, Bundle bundle) {
        if (I(Qm0.D(new byte[]{-16, 107, -118, -93, -55, 24, -117, 96, -8, 116, -84, -74, -50, 24, -114, 103, -22, 121, -73, -87, -50, 24, -104, 107, -23, 119, -89, -79, -12, 44, -113, 119}, new byte[]{-103, 24, -43, -59, -85, 71, -22, com.umeng.analytics.pro.cw.l}))) {
            String strD = Qm0.D(new byte[]{com.umeng.analytics.pro.cw.n, -87, 91, -115, -117, 92, 47, -44, 24, -74, 125, -104, -116, 92, 42, -45, 10, -69, 102, -121, -116, 92, 60, -33, 9, -75, 118, -97, -74, 104, 43, -61}, new byte[]{121, -38, 4, -21, -23, 3, 78, -70});
            String str2 = AbstractC4969wu.f5203a;
            String strC = C2375Du.a().c(strD);
            if (!TextUtils.isEmpty(strC) && strC.equals(Qm0.D(new byte[]{-34, -98, 95, 71}, new byte[]{-86, -20, 42, 34, 103, -2, -89, -54}))) {
                return;
            }
        }
        FirebaseAnalytics.getInstance(context).f842a.zzy(str, bundle);
    }

    public static int N(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map O(C4839vT c4839vT) {
        AbstractC2995aW.q(c4839vT, "pair");
        Map mapSingletonMap = Collections.singletonMap(c4839vT.f5132a, c4839vT.b);
        AbstractC2995aW.p(mapSingletonMap, "singletonMap(pair.first, pair.second)");
        return mapSingletonMap;
    }

    public static String P(String str) {
        try {
            byte[] bArr = {-51, -42, -110};
            byte[] bArr2 = {-128, -110, -89, -107, -108, 49, 58, -97};
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
            MessageDigest messageDigest = MessageDigest.getInstance(new String(bArr, StandardCharsets.UTF_8));
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    byte[] bArr3 = new byte[1];
                    bArr3[0] = -105;
                    byte[] bArr4 = {-89, 49, -108, -56, 115, -110, -35, 82};
                    int length3 = bArr3.length;
                    int length4 = bArr4.length;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < length3) {
                        if (i4 >= length4) {
                            i4 = 0;
                        }
                        bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i4]);
                        i3++;
                        i4++;
                    }
                    sb.append(new String(bArr3, StandardCharsets.UTF_8));
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static final C2506Iv Q(InterfaceC3567gx interfaceC3567gx, InterfaceC4443qv interfaceC4443qv) {
        return new C2506Iv(interfaceC4443qv, interfaceC3567gx, 1);
    }

    public static final InterfaceC4123nG R(InterfaceC3156cG interfaceC3156cG, List list, ArrayList arrayList) {
        InterfaceC4123nG t5;
        InterfaceC4123nG c3174cY;
        InterfaceC4123nG c2831Vj;
        AbstractC2995aW.q(interfaceC3156cG, "<this>");
        AbstractC2995aW.q(list, "types");
        if (AbstractC2995aW.i(interfaceC3156cG, AbstractC3263dY.a(Collection.class)) || AbstractC2995aW.i(interfaceC3156cG, AbstractC3263dY.a(List.class)) || AbstractC2995aW.i(interfaceC3156cG, AbstractC3263dY.a(List.class)) || AbstractC2995aW.i(interfaceC3156cG, AbstractC3263dY.a(ArrayList.class))) {
            t5 = new T5((InterfaceC4123nG) arrayList.get(0), 0);
        } else if (AbstractC2995aW.i(interfaceC3156cG, AbstractC3263dY.a(HashSet.class))) {
            t5 = new T5((InterfaceC4123nG) arrayList.get(0), 1);
        } else if (AbstractC2995aW.i(interfaceC3156cG, AbstractC3263dY.a(Set.class)) || AbstractC2995aW.i(interfaceC3156cG, AbstractC3263dY.a(Set.class)) || AbstractC2995aW.i(interfaceC3156cG, AbstractC3263dY.a(LinkedHashSet.class))) {
            t5 = new T5((InterfaceC4123nG) arrayList.get(0), 2);
        } else if (AbstractC2995aW.i(interfaceC3156cG, AbstractC3263dY.a(HashMap.class))) {
            t5 = new C4095mz((InterfaceC4123nG) arrayList.get(0), (InterfaceC4123nG) arrayList.get(1), 0);
        } else if (AbstractC2995aW.i(interfaceC3156cG, AbstractC3263dY.a(Map.class)) || AbstractC2995aW.i(interfaceC3156cG, AbstractC3263dY.a(Map.class)) || AbstractC2995aW.i(interfaceC3156cG, AbstractC3263dY.a(LinkedHashMap.class))) {
            t5 = new C4095mz((InterfaceC4123nG) arrayList.get(0), (InterfaceC4123nG) arrayList.get(1), 1);
        } else {
            if (AbstractC2995aW.i(interfaceC3156cG, AbstractC3263dY.a(Map.Entry.class))) {
                InterfaceC4123nG interfaceC4123nG = (InterfaceC4123nG) arrayList.get(0);
                InterfaceC4123nG interfaceC4123nG2 = (InterfaceC4123nG) arrayList.get(1);
                AbstractC2995aW.q(interfaceC4123nG, "keySerializer");
                AbstractC2995aW.q(interfaceC4123nG2, "valueSerializer");
                c3174cY = new C3427fM(interfaceC4123nG, interfaceC4123nG2, 0);
            } else {
                if (AbstractC2995aW.i(interfaceC3156cG, AbstractC3263dY.a(C4839vT.class))) {
                    InterfaceC4123nG interfaceC4123nG3 = (InterfaceC4123nG) arrayList.get(0);
                    InterfaceC4123nG interfaceC4123nG4 = (InterfaceC4123nG) arrayList.get(1);
                    AbstractC2995aW.q(interfaceC4123nG3, "keySerializer");
                    AbstractC2995aW.q(interfaceC4123nG4, "valueSerializer");
                    c2831Vj = new C3427fM(interfaceC4123nG3, interfaceC4123nG4, 1);
                } else if (AbstractC2995aW.i(interfaceC3156cG, AbstractC3263dY.a(C3538ge0.class))) {
                    InterfaceC4123nG interfaceC4123nG5 = (InterfaceC4123nG) arrayList.get(0);
                    InterfaceC4123nG interfaceC4123nG6 = (InterfaceC4123nG) arrayList.get(1);
                    InterfaceC4123nG interfaceC4123nG7 = (InterfaceC4123nG) arrayList.get(2);
                    AbstractC2995aW.q(interfaceC4123nG5, "aSerializer");
                    AbstractC2995aW.q(interfaceC4123nG6, "bSerializer");
                    AbstractC2995aW.q(interfaceC4123nG7, "cSerializer");
                    c2831Vj = new C2831Vj(interfaceC4123nG5, interfaceC4123nG6, interfaceC4123nG7);
                } else if (AbstractC2995aW.K(interfaceC3156cG).isArray()) {
                    InterfaceC3245dG interfaceC3245dG = ((Be0) ((InterfaceC4211oG) list.get(0))).f2882a;
                    AbstractC2995aW.o(interfaceC3245dG, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    InterfaceC4123nG interfaceC4123nG8 = (InterfaceC4123nG) arrayList.get(0);
                    AbstractC2995aW.q(interfaceC4123nG8, "elementSerializer");
                    c3174cY = new C3174cY((InterfaceC3156cG) interfaceC3245dG, interfaceC4123nG8);
                } else {
                    t5 = null;
                }
                t5 = c2831Vj;
            }
            t5 = c3174cY;
        }
        if (t5 != null) {
            return t5;
        }
        Object[] array = arrayList.toArray(new InterfaceC4123nG[0]);
        AbstractC2995aW.o(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        InterfaceC4123nG[] interfaceC4123nGArr = (InterfaceC4123nG[]) array;
        return WD.l(interfaceC3156cG, (InterfaceC4123nG[]) Arrays.copyOf(interfaceC4123nGArr, interfaceC4123nGArr.length));
    }

    public static FG S(String str) throws XmlPullParserException, IOException {
        long j;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!AbstractC2995aW.Z(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw KT.a("Couldn't find xmp metadata", null);
        }
        C5086yC c5086yC = AC.b;
        C3965lY c3965lYT = C3965lY.e;
        long j2 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (AbstractC2995aW.Z(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = d;
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    String strF = AbstractC2995aW.F(xmlPullParserNewPullParser, strArr[i2]);
                    if (strF != null) {
                        if (Integer.parseInt(strF) != 1) {
                            break loop0;
                        }
                        String[] strArr2 = e;
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                String strF2 = AbstractC2995aW.F(xmlPullParserNewPullParser, strArr2[i3]);
                                if (strF2 != null) {
                                    j = Long.parseLong(strF2);
                                    if (j != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i3++;
                            }
                            j = -9223372036854775807L;
                            break;
                        }
                        String[] strArr3 = f;
                        while (true) {
                            if (i >= 2) {
                                C5086yC c5086yC2 = AC.b;
                                c3965lYT = C3965lY.e;
                                break;
                            }
                            String strF3 = AbstractC2995aW.F(xmlPullParserNewPullParser, strArr3[i]);
                            if (strF3 != null) {
                                c3965lYT = AC.q(new LP("image/jpeg", 0L, 0L), new LP(MimeTypes.VIDEO_MP4, Long.parseLong(strF3), 0L));
                                break;
                            }
                            i++;
                        }
                        j2 = j;
                    }
                }
                return null;
            }
            if (AbstractC2995aW.Z(xmlPullParserNewPullParser, "Container:Directory")) {
                c3965lYT = T(xmlPullParserNewPullParser, "Container", "Item");
            } else if (AbstractC2995aW.Z(xmlPullParserNewPullParser, "GContainer:Directory")) {
                c3965lYT = T(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!AbstractC2995aW.W(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (c3965lYT.isEmpty()) {
            return null;
        }
        FG fg = new FG();
        fg.f3061a = j2;
        fg.b = c3965lYT;
        return fg;
    }

    public static C3965lY T(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        C5086yC c5086yC = AC.b;
        FW.n(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        int i = 0;
        do {
            xmlPullParser.next();
            if (AbstractC2995aW.Z(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strF = AbstractC2995aW.F(xmlPullParser, strConcat3);
                String strF2 = AbstractC2995aW.F(xmlPullParser, strConcat4);
                String strF3 = AbstractC2995aW.F(xmlPullParser, strConcat5);
                String strF4 = AbstractC2995aW.F(xmlPullParser, strConcat6);
                if (strF == null || strF2 == null) {
                    return C3965lY.e;
                }
                LP lp = new LP(strF, strF3 != null ? Long.parseLong(strF3) : 0L, strF4 != null ? Long.parseLong(strF4) : 0L);
                int i2 = i + 1;
                if (objArrCopyOf.length < i2) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC2995aW.y(objArrCopyOf.length, i2));
                }
                objArrCopyOf[i] = lp;
                i = i2;
            }
        } while (!AbstractC2995aW.W(xmlPullParser, strConcat2));
        return AC.h(i, objArrCopyOf);
    }

    public static int U(float f2) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f2);
    }

    public static final InterfaceC4123nG V(M40 m40, InterfaceC4211oG interfaceC4211oG) {
        AbstractC2995aW.q(m40, "<this>");
        AbstractC2995aW.q(interfaceC4211oG, "type");
        InterfaceC4123nG interfaceC4123nGO0 = AbstractC2995aW.o0(m40, interfaceC4211oG, true);
        if (interfaceC4123nGO0 != null) {
            return interfaceC4123nGO0;
        }
        InterfaceC3156cG interfaceC3156cGJ0 = AbstractC2871Wx.j0(interfaceC4211oG);
        AbstractC2995aW.q(interfaceC3156cGJ0, "<this>");
        AbstractC2871Wx.q0(interfaceC3156cGJ0);
        throw null;
    }

    public static final ArrayList W(M40 m40, List list, boolean z) {
        ArrayList arrayList;
        AbstractC2995aW.q(m40, "<this>");
        AbstractC2995aW.q(list, "typeArguments");
        if (z) {
            List list2 = list;
            arrayList = new ArrayList(AbstractC2749Sf.Y(10, list2));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(V(m40, (InterfaceC4211oG) it.next()));
            }
        } else {
            List<InterfaceC4211oG> list3 = list;
            arrayList = new ArrayList(AbstractC2749Sf.Y(10, list3));
            for (InterfaceC4211oG interfaceC4211oG : list3) {
                AbstractC2995aW.q(interfaceC4211oG, "type");
                InterfaceC4123nG interfaceC4123nGO0 = AbstractC2995aW.o0(m40, interfaceC4211oG, false);
                if (interfaceC4123nGO0 == null) {
                    return null;
                }
                arrayList.add(interfaceC4123nGO0);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    public static final BX X(InterfaceC4443qv interfaceC4443qv, InterfaceC4514rk interfaceC4514rk, int i) {
        BR br;
        AbstractC2929Zd abstractC2929Zd;
        InterfaceC4443qv interfaceC4443qvE;
        C4467r90 c4467r90 = G7.h;
        InterfaceC2851Wd.Z0.getClass();
        int i2 = C2825Vd.b;
        if (i >= i2) {
            i2 = i;
        }
        int i3 = i2 - i;
        boolean z = interfaceC4443qv instanceof AbstractC2929Zd;
        EnumC5024xb enumC5024xb = EnumC5024xb.f5229a;
        if (!z || (interfaceC4443qvE = (abstractC2929Zd = (AbstractC2929Zd) interfaceC4443qv).e()) == null) {
            br = new BR(i3, C2734Rq.f3684a, enumC5024xb, interfaceC4443qv);
        } else {
            EnumC5024xb enumC5024xb2 = abstractC2929Zd.c;
            int i4 = abstractC2929Zd.b;
            if (i4 != -3 && i4 != -2 && i4 != 0) {
                i3 = i4;
            } else if (enumC5024xb2 == enumC5024xb) {
                if (i4 == 0) {
                    i3 = 0;
                }
            } else if (i == 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            br = new BR(i3, abstractC2929Zd.f4081a, enumC5024xb2, interfaceC4443qvE);
        }
        C4549s60 c4549s60A = AbstractC4637t60.a(i, br.f2872a, (EnumC5024xb) br.c);
        WD.C(interfaceC4514rk, (InterfaceC3549gk) br.d, AbstractC2995aW.i(c4467r90, c4467r90) ? 1 : 4, new C3390ew(c4467r90, (InterfaceC4443qv) br.b, c4549s60A, AbstractC4637t60.f5016a, null));
        return new BX(c4549s60A);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object Y(InterfaceC4443qv interfaceC4443qv, InterfaceC2857Wj interfaceC2857Wj) {
        C3037aw c3037aw;
        C3086bY c3086bY;
        if (interfaceC2857Wj instanceof C3037aw) {
            c3037aw = (C3037aw) interfaceC2857Wj;
            int i = c3037aw.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3037aw.c = i - Integer.MIN_VALUE;
            } else {
                c3037aw = new C3037aw(interfaceC2857Wj);
            }
        } else {
            c3037aw = new C3037aw(interfaceC2857Wj);
        }
        Object obj = c3037aw.b;
        Object obj2 = EnumC4602sk.f4993a;
        int i2 = c3037aw.c;
        if (i2 == 0) {
            b0(obj);
            C3086bY c3086bY2 = new C3086bY();
            c3086bY2.f4172a = YR.f4019a;
            InterfaceC4530rv c3126bw = new C3126bw(c3086bY2);
            c3037aw.f4148a = c3086bY2;
            c3037aw.c = 1;
            if (interfaceC4443qv.collect(c3126bw, c3037aw) != obj2) {
                c3086bY = c3086bY2;
            }
            return obj2;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c3086bY = c3037aw.f4148a;
        b0(obj);
        obj2 = c3086bY.f4172a;
        if (obj2 == YR.f4019a) {
            throw new NoSuchElementException("Flow is empty");
        }
        return obj2;
    }

    public static final Object Z(C4016m30 c4016m30, C4016m30 c4016m31, InterfaceC3567gx interfaceC3567gx) throws Throwable {
        Object c3013ah;
        Object objT;
        try {
            WD.h(2, interfaceC3567gx);
            c3013ah = interfaceC3567gx.invoke(c4016m31, c4016m30);
        } catch (Throwable th) {
            c3013ah = new C3013ah(false, th);
        }
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        if (c3013ah == enumC4602sk || (objT = c4016m30.T(c3013ah)) == QE.b) {
            return enumC4602sk;
        }
        if (objT instanceof C3013ah) {
            throw ((C3013ah) objT).f4134a;
        }
        return QE.a(objT);
    }

    public static C2330Cb a(int i, EnumC5024xb enumC5024xb, int i2) {
        C2330Cb c3547gj;
        int i3 = i2 & 2;
        EnumC5024xb enumC5024xb2 = EnumC5024xb.f5229a;
        if (i3 != 0) {
            enumC5024xb = enumC5024xb2;
        }
        if (i != -2) {
            if (i == -1) {
                if (enumC5024xb == enumC5024xb2) {
                    return new C3547gj(1, EnumC5024xb.b, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i != 0) {
                if (i != Integer.MAX_VALUE) {
                    return enumC5024xb == enumC5024xb2 ? new C2330Cb(i, null) : new C3547gj(i, enumC5024xb, null);
                }
                return new C2330Cb(Integer.MAX_VALUE, null);
            }
            c3547gj = enumC5024xb == enumC5024xb2 ? new C2330Cb(0, null) : new C3547gj(1, enumC5024xb, null);
        } else if (enumC5024xb == enumC5024xb2) {
            InterfaceC2851Wd.Z0.getClass();
            c3547gj = new C2330Cb(C2825Vd.b, null);
        } else {
            c3547gj = new C3547gj(1, enumC5024xb, null);
        }
        return c3547gj;
    }

    public static C4999xD a0(C5175zD c5175zD, int i) {
        AbstractC2995aW.q(c5175zD, "<this>");
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (z) {
            if (c5175zD.c <= 0) {
                i = -i;
            }
            return new C4999xD(c5175zD.f5212a, c5175zD.b, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    public static C2854Wg b() {
        C2854Wg c2854Wg = new C2854Wg(true);
        c2854Wg.Q(null);
        return c2854Wg;
    }

    public static final void b0(Object obj) {
        if (obj instanceof HZ) {
            throw ((HZ) obj).f3176a;
        }
    }

    public static Ba0 c() {
        return new Ba0(null);
    }

    public static final Map c0(Map map) {
        AbstractC2995aW.q(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC2995aW.p(mapSingletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return mapSingletonMap;
    }

    public static String d(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static String d0(String str) {
        int length;
        Comparable comparable;
        AbstractC2995aW.q(str, "<this>");
        List listP0 = AbstractC5073y40.P0(AbstractC3089ba0.y0(str));
        List list = listP0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!AbstractC3089ba0.v0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2749Sf.Y(10, arrayList));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!WD.A(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listP0.size();
        int iY = AbstractC2340Cl.y(listP0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i = length + 1;
            if (length < 0) {
                AbstractC2340Cl.S();
                throw null;
            }
            String str3 = (String) obj2;
            String strX0 = ((length == 0 || length == iY) && AbstractC3089ba0.v0(str3)) ? null : AbstractC3177ca0.X0(iIntValue, str3);
            if (strX0 != null) {
                arrayList3.add(strX0);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        AbstractC2853Wf.j0(arrayList3, sb, "\n", "", "", -1, "...", null);
        String string = sb.toString();
        AbstractC2995aW.p(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static String e0(String str) {
        AbstractC2995aW.q(str, "<this>");
        if (!(!AbstractC3089ba0.v0("|"))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List listP0 = AbstractC5073y40.P0(AbstractC3089ba0.y0(str));
        int length = str.length();
        listP0.size();
        int iY = AbstractC2340Cl.y(listP0);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listP0) {
            int i2 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                AbstractC2340Cl.S();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iY) || !AbstractC3089ba0.v0(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!WD.A(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && AbstractC3089ba0.M0(str2, "|", i3, false)) {
                    strSubstring = str2.substring(i3 + 1);
                    AbstractC2995aW.p(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        AbstractC2853Wf.j0(arrayList, sb, "\n", "", "", -1, "...", null);
        String string = sb.toString();
        AbstractC2995aW.p(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    public static void f(StringBuilder sb, Object obj, InterfaceC2766Sw interfaceC2766Sw) {
        if (interfaceC2766Sw != null) {
            sb.append((CharSequence) interfaceC2766Sw.invoke(obj));
            return;
        }
        if (obj == null || (obj instanceof CharSequence)) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static C5175zD f0(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C5175zD(i, i2 - 1, 1);
        }
        C5175zD c5175zD = C5175zD.d;
        return C5175zD.d;
    }

    public static C2985aM g(Map map) {
        AbstractC2995aW.q(map, "builder");
        C2985aM c2985aM = (C2985aM) map;
        c2985aM.b();
        c2985aM.l = true;
        if (c2985aM.h > 0) {
            return c2985aM;
        }
        C2985aM c2985aM2 = C2985aM.m;
        AbstractC2995aW.o(c2985aM2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c2985aM2;
    }

    public static final Object g0(InterfaceC3549gk interfaceC3549gk, Object obj, Object obj2, InterfaceC3567gx interfaceC3567gx, InterfaceC2857Wj interfaceC2857Wj) {
        Object objC = AbstractC3181cc0.c(interfaceC3549gk, obj2);
        try {
            C3414f90 c3414f90 = new C3414f90(interfaceC2857Wj, interfaceC3549gk);
            WD.h(2, interfaceC3567gx);
            Object objInvoke = interfaceC3567gx.invoke(obj, c3414f90);
            AbstractC3181cc0.a(interfaceC3549gk, objC);
            if (objInvoke == EnumC4602sk.f4993a) {
                AbstractC2995aW.q(interfaceC2857Wj, TypedValues.AttributesType.S_FRAME);
            }
            return objInvoke;
        } catch (Throwable th) {
            AbstractC3181cc0.a(interfaceC3549gk, objC);
            throw th;
        }
    }

    public static final F40 h(String str, D40[] d40Arr, InterfaceC2766Sw interfaceC2766Sw) {
        if (!(!AbstractC3089ba0.v0(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        C3275df c3275df = new C3275df(str);
        interfaceC2766Sw.invoke(c3275df);
        return new F40(str, C3442fa0.f4370a, c3275df.b.size(), U5.z0(d40Arr), c3275df);
    }

    public static final F40 i(String str, L40 l40, D40[] d40Arr, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(str, "serialName");
        AbstractC2995aW.q(interfaceC2766Sw, "builder");
        if (!(!AbstractC3089ba0.v0(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (!(!AbstractC2995aW.i(l40, C3442fa0.f4370a))) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        C3275df c3275df = new C3275df(str);
        interfaceC2766Sw.invoke(c3275df);
        return new F40(str, l40, c3275df.b.size(), U5.z0(d40Arr), c3275df);
    }

    public static final C3770jF j(InterfaceC2766Sw interfaceC2766Sw, Object obj, C3770jF c3770jF) throws IllegalAccessException, InvocationTargetException {
        try {
            interfaceC2766Sw.invoke(obj);
        } catch (Throwable th) {
            if (c3770jF == null || c3770jF.getCause() == th) {
                return new C3770jF("Exception in undelivered element handler for " + obj, th, 9);
            }
            AbstractC2995aW.h(c3770jF, th);
        }
        return c3770jF;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable k(InterfaceC2857Wj interfaceC2857Wj, InterfaceC4443qv interfaceC4443qv, InterfaceC4530rv interfaceC4530rv) throws Throwable {
        C2428Fv c2428Fv;
        Throwable th;
        C3086bY c3086bY;
        Throwable th2;
        InterfaceC5000xE interfaceC5000xE;
        CancellationException cancellationExceptionK;
        if (interfaceC2857Wj instanceof C2428Fv) {
            c2428Fv = (C2428Fv) interfaceC2857Wj;
            int i = c2428Fv.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2428Fv.c = i - Integer.MIN_VALUE;
            } else {
                c2428Fv = new C2428Fv(interfaceC2857Wj);
            }
        } else {
            c2428Fv = new C2428Fv(interfaceC2857Wj);
        }
        Object obj = c2428Fv.b;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c2428Fv.c;
        if (i2 == 0) {
            b0(obj);
            C3086bY c3086bY2 = new C3086bY();
            try {
                InterfaceC4530rv c2480Hv = new C2480Hv(interfaceC4530rv, c3086bY2);
                c2428Fv.f3093a = c3086bY2;
                c2428Fv.c = 1;
                if (interfaceC4443qv.collect(c2480Hv, c2428Fv) == enumC4602sk) {
                    return enumC4602sk;
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                c3086bY = c3086bY2;
                th2 = (Throwable) c3086bY.f4172a;
                if (th2 == null) {
                }
                interfaceC5000xE = (InterfaceC5000xE) c2428Fv.getContext().get(G7.e);
                if (interfaceC5000xE == null) {
                }
                if (th2 == null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    AbstractC2995aW.h(th2, th);
                    throw th2;
                }
                AbstractC2995aW.h(th, th2);
                throw th;
            }
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c3086bY = c2428Fv.f3093a;
        try {
            b0(obj);
            return null;
        } catch (Throwable th4) {
            th = th4;
            th2 = (Throwable) c3086bY.f4172a;
            if (th2 == null && AbstractC2995aW.i(th2, th)) {
                throw th;
            }
            interfaceC5000xE = (InterfaceC5000xE) c2428Fv.getContext().get(G7.e);
            if (interfaceC5000xE == null && interfaceC5000xE.isCancelled() && (cancellationExceptionK = interfaceC5000xE.k()) != null && AbstractC2995aW.i(cancellationExceptionK, th)) {
                throw th;
            }
            if (th2 == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                AbstractC2995aW.h(th2, th);
                throw th2;
            }
            AbstractC2995aW.h(th, th2);
            throw th;
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void n(Closeable closeable, Throwable th) throws IllegalAccessException, IOException, InvocationTargetException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC2995aW.h(th, th2);
            }
        }
    }

    public static float o(float f2, float f3) {
        if (0.0f <= f3) {
            if (f2 < 0.0f) {
                return 0.0f;
            }
            return f2 > f3 ? f3 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum 0.0.");
    }

    public static int p(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC5044xl.g("Cannot coerce value to an empty range: maximum ", i2, " is less than minimum 0."));
        }
        if (i < 0) {
            return 0;
        }
        return i > i2 ? i2 : i;
    }

    public static long q(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    public static int r(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static C2485Ia s(InterfaceC2459Ha interfaceC2459Ha, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i2 = current.getIntrinsicHeight();
                    }
                    Lock lock = Id0.b;
                    lock.lock();
                    Bitmap bitmapB = interfaceC2459Ha.b(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapB);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapB;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    current.toString();
                }
                z = true;
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                current.toString();
            }
            bitmap = null;
            z = true;
        }
        if (!z) {
            interfaceC2459Ha = b;
        }
        return C2485Ia.c(bitmap, interfaceC2459Ha);
    }

    public static final void t(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException(AbstractC3950lJ.q("toIndex (", i, ") is greater than size (", i2, ")."));
        }
    }

    public static C3190ch u(String str, String str2) {
        C3235d8 c3235d8 = new C3235d8(str, str2);
        C3605hO c3605hOA = C3190ch.a(C3235d8.class);
        c3605hOA.c = 1;
        c3605hOA.f = new C4808v4(c3235d8, 0);
        return c3605hOA.c();
    }

    public static final HZ v(Throwable th) {
        AbstractC2995aW.q(th, "exception");
        return new HZ(th);
    }

    public static C2985aM w() {
        return new C2985aM(8);
    }

    public static int x(float f2) {
        return (int) ((f2 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object y(InterfaceC4443qv interfaceC4443qv, InterfaceC2857Wj interfaceC2857Wj) {
        C2921Yv c2921Yv;
        C3086bY c3086bY;
        C3218d e2;
        C2843Vv c2843Vv;
        if (interfaceC2857Wj instanceof C2921Yv) {
            c2921Yv = (C2921Yv) interfaceC2857Wj;
            int i = c2921Yv.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2921Yv.d = i - Integer.MIN_VALUE;
            } else {
                c2921Yv = new C2921Yv(interfaceC2857Wj);
            }
        } else {
            c2921Yv = new C2921Yv(interfaceC2857Wj);
        }
        Object obj = c2921Yv.c;
        Object obj2 = EnumC4602sk.f4993a;
        int i2 = c2921Yv.d;
        if (i2 == 0) {
            b0(obj);
            C3086bY c3086bY2 = new C3086bY();
            c3086bY2.f4172a = YR.f4019a;
            C2843Vv c2843Vv2 = new C2843Vv(c3086bY2);
            try {
                c2921Yv.f4047a = c3086bY2;
                c2921Yv.b = c2843Vv2;
                c2921Yv.d = 1;
                if (interfaceC4443qv.collect(c2843Vv2, c2921Yv) != obj2) {
                    c3086bY = c3086bY2;
                    obj2 = c3086bY.f4172a;
                    if (obj2 == YR.f4019a) {
                        throw new NoSuchElementException("Expected at least one element");
                    }
                }
            } catch (C3218d e3) {
                c3086bY = c3086bY2;
                e2 = e3;
                c2843Vv = c2843Vv2;
                if (e2.f4252a != c2843Vv) {
                    throw e2;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2843Vv = c2921Yv.b;
            c3086bY = c2921Yv.f4047a;
            try {
                b0(obj);
            } catch (C3218d e4) {
                e2 = e4;
                if (e2.f4252a != c2843Vv) {
                    throw e2;
                }
            }
            obj2 = c3086bY.f4172a;
            if (obj2 == YR.f4019a) {
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x006a, please report this as an issue */
    public static final Object z(InterfaceC4443qv interfaceC4443qv, InterfaceC3567gx interfaceC3567gx, InterfaceC2857Wj interfaceC2857Wj) {
        C2947Zv c2947Zv;
        InterfaceC3567gx interfaceC3567gx2;
        C3086bY c3086bY;
        C3218d e2;
        C2895Xv c2895Xv;
        if (interfaceC2857Wj instanceof C2947Zv) {
            c2947Zv = (C2947Zv) interfaceC2857Wj;
            int i = c2947Zv.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2947Zv.e = i - Integer.MIN_VALUE;
            } else {
                c2947Zv = new C2947Zv(interfaceC2857Wj);
            }
        } else {
            c2947Zv = new C2947Zv(interfaceC2857Wj);
        }
        Object obj = c2947Zv.d;
        Object obj2 = EnumC4602sk.f4993a;
        int i2 = c2947Zv.e;
        if (i2 == 0) {
            b0(obj);
            C3086bY c3086bY2 = new C3086bY();
            c3086bY2.f4172a = YR.f4019a;
            C2895Xv c2895Xv2 = new C2895Xv(interfaceC3567gx, c3086bY2);
            try {
                c2947Zv.f4099a = interfaceC3567gx;
                c2947Zv.b = c3086bY2;
                c2947Zv.c = c2895Xv2;
                c2947Zv.e = 1;
                if (interfaceC4443qv.collect(c2895Xv2, c2947Zv) != obj2) {
                    interfaceC3567gx2 = interfaceC3567gx;
                    c3086bY = c3086bY2;
                    obj2 = c3086bY.f4172a;
                    if (obj2 == YR.f4019a) {
                        throw new NoSuchElementException("Expected at least one element matching the predicate " + interfaceC3567gx2);
                    }
                }
            } catch (C3218d e3) {
                interfaceC3567gx2 = interfaceC3567gx;
                c3086bY = c3086bY2;
                e2 = e3;
                c2895Xv = c2895Xv2;
                if (e2.f4252a != c2895Xv) {
                    throw e2;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2895Xv = c2947Zv.c;
            c3086bY = c2947Zv.b;
            interfaceC3567gx2 = c2947Zv.f4099a;
            try {
                b0(obj);
            } catch (C3218d e4) {
                e2 = e4;
                if (e2.f4252a != c2895Xv) {
                    throw e2;
                }
            }
            obj2 = c3086bY.f4172a;
            if (obj2 == YR.f4019a) {
                throw new NoSuchElementException("Expected at least one element matching the predicate " + interfaceC3567gx2);
            }
        }
        return obj2;
    }

    public abstract List m(String str, List list);
}
