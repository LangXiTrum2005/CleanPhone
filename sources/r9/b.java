package r9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.webkit.WebView;
import android.widget.EdgeEffect;
import cl.x0;
import cl.z;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C0526q2;
import com.unity3d.services.UnityAdsConstants;
import en.e;
import en.h;
import en.i;
import il.o;
import il.p;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationHandler;
import java.math.RoundingMode;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.n;
import l1.q;
import l1.y;
import n6.e0;
import pm.c0;
import pm.i0;
import qk.d;
import wj.j;
import wj.s;
import xj.b0;
import xj.m;
import xj.v;
import xk.g;
import yl.f;
import zk.j0;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f49511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f49512b;

    public static final o A(n.a aVar) {
        n.f(aVar, "<this>");
        o oVar = (o) p.f43100d.get(aVar);
        return oVar == null ? zk.n.f(aVar) : oVar;
    }

    public static long B(int i10, long j10, long j11, long j12) {
        long j13 = i10;
        String str = y.f44830a;
        return j10 + y.U((j11 - j12) & 4294967295L, 1000000L, j13, RoundingMode.DOWN);
    }

    public static void C(Parcel parcel, int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iR = R(parcel, i10);
        parcel.writeBundle(bundle);
        S(parcel, iR);
    }

    public static void D(Parcel parcel, int i10, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iR = R(parcel, i10);
        parcel.writeByteArray(bArr);
        S(parcel, iR);
    }

    public static void E(Parcel parcel, int i10, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iR = R(parcel, i10);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        S(parcel, iR);
    }

    public static void F(Parcel parcel, int i10, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iR = R(parcel, i10);
        parcel.writeStrongBinder(iBinder);
        S(parcel, iR);
    }

    public static void G(Parcel parcel, int i10, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iR = R(parcel, i10);
        parcel.writeIntArray(iArr);
        S(parcel, iR);
    }

    public static void H(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int iR = R(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(((Integer) list.get(i11)).intValue());
        }
        S(parcel, iR);
    }

    public static void I(Parcel parcel, int i10, Parcelable parcelable, int i11) {
        if (parcelable == null) {
            return;
        }
        int iR = R(parcel, i10);
        parcelable.writeToParcel(parcel, i11);
        S(parcel, iR);
    }

    public static void J(Parcel parcel, int i10, String str) {
        if (str == null) {
            return;
        }
        int iR = R(parcel, i10);
        parcel.writeString(str);
        S(parcel, iR);
    }

    public static void K(Parcel parcel, int i10, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iR = R(parcel, i10);
        parcel.writeStringArray(strArr);
        S(parcel, iR);
    }

    public static void L(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int iR = R(parcel, i10);
        parcel.writeStringList(list);
        S(parcel, iR);
    }

    public static void M(og.c cVar, dh.b asset) {
        n.f(asset, "asset");
        Size size = asset.f38880e;
        cVar.n();
        cVar.q("id");
        cVar.w(asset.f38876a);
        cVar.q("type");
        cVar.w(asset.f38877b.f3605a);
        cVar.q("isFavorite");
        cVar.x(asset.f38878c);
        cVar.q("isLive");
        cVar.x(asset.f38879d);
        cVar.q("isEdited");
        cVar.x(asset.f38884i);
        cVar.q("potentiallySimilarIdentifier");
        cVar.w(asset.f38885j);
        cVar.q("folderId");
        String str = asset.f38886k;
        if (str == null) {
            cVar.r();
        } else {
            cVar.w(str);
        }
        cVar.q("chatSource");
        ah.a aVar = asset.l;
        if (aVar == null) {
            cVar.r();
        } else {
            cVar.w(aVar.name());
        }
        cVar.q("originalSize");
        cVar.n();
        cVar.q("width");
        cVar.v(Integer.valueOf(size.getWidth()));
        cVar.q("height");
        cVar.v(Integer.valueOf(size.getHeight()));
        cVar.p();
        cVar.q("createAt");
        cVar.u(asset.f38882g.getTime());
        cVar.q("updatedAt");
        Date date = asset.f38883h;
        if (date == null) {
            cVar.r();
        } else {
            cVar.u(date.getTime());
        }
        cVar.q("sizeOnDisk");
        Long l = asset.f38881f;
        if (l == null) {
            cVar.r();
        } else {
            cVar.u(l.longValue());
        }
        cVar.p();
    }

    public static void N(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr == null) {
            return;
        }
        int iR = R(parcel, i10);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i11);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        S(parcel, iR);
    }

    public static void O(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int iR = R(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        S(parcel, iR);
    }

    public static void Q(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    public static int R(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void S(Parcel parcel, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(iDataPosition - i10);
        parcel.setDataPosition(iDataPosition);
    }

    public static e a(int i10, int i11, en.a aVar) {
        int i12 = i11 & 2;
        en.a aVar2 = en.a.f40122a;
        if (i12 != 0) {
            aVar = aVar2;
        }
        if (i10 == -2) {
            if (aVar != aVar2) {
                return new en.o(1, aVar);
            }
            i.f40166g9.getClass();
            return new e(h.f40165b);
        }
        if (i10 == -1) {
            if (aVar == aVar2) {
                return new en.o(1, en.a.f40123b);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == 0) {
            return aVar == aVar2 ? new e(0) : new en.o(1, aVar);
        }
        if (i10 != Integer.MAX_VALUE) {
            return aVar == aVar2 ? new e(i10) : new en.o(i10, aVar);
        }
        return new e(Integer.MAX_VALUE);
    }

    public static final void b(d dVar, Object obj) {
        n.f(dVar, "<this>");
        if (dVar.b(obj)) {
            n.d(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
        } else {
            throw new ClassCastException("Value cannot be cast to " + dVar.d());
        }
    }

    public static g d(xk.c functionClass, boolean z10) {
        String lowerCase;
        n.f(functionClass, "functionClass");
        List list = functionClass.f53884k;
        g gVar = new g(functionClass, null, 1, z10);
        z zVarY0 = functionClass.y0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((m0) obj).v() != 2) {
                break;
            }
            arrayList.add(obj);
        }
        m mVarT0 = xj.n.T0(arrayList);
        ArrayList arrayList2 = new ArrayList(xj.p.W(mVarT0, 10));
        Iterator it = mVarT0.iterator();
        while (true) {
            xj.z zVar = (xj.z) it;
            if (!zVar.f53872b.hasNext()) {
                c0 c0VarG = ((m0) xj.n.w0(list)).g();
                o oVar = zk.n.f54978e;
                v vVar = v.f53866a;
                gVar.O0(null, zVarY0, vVar, vVar, arrayList2, c0VarG, 4, oVar);
                g gVar2 = gVar;
                gVar2.f6654w = true;
                return gVar2;
            }
            xj.y yVar = (xj.y) zVar.next();
            int i10 = yVar.f53869a;
            m0 m0Var = (m0) yVar.f53870b;
            String strB = m0Var.getName().b();
            n.e(strB, "typeParameter.name.asString()");
            if (strB.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_T)) {
                lowerCase = C0526q2.f30050p;
            } else if (strB.equals("E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                n.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            g gVar3 = gVar;
            f fVarE = f.e(lowerCase);
            c0 c0VarG2 = m0Var.g();
            n.e(c0VarG2, "typeParameter.defaultType");
            arrayList2.add(new x0(gVar3, null, i10, al.i.f3645a, fVarE, c0VarG2, false, false, false, null, j0.C9));
            gVar = gVar3;
        }
    }

    public static final i0 e(zk.e from, zk.e to) {
        n.f(from, "from");
        n.f(to, "to");
        from.i().size();
        to.i().size();
        List listI = from.i();
        n.e(listI, "from.declaredTypeParameters");
        List list = listI;
        ArrayList arrayList = new ArrayList(xj.p.W(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((m0) it.next()).n());
        }
        List listI2 = to.i();
        n.e(listI2, "to.declaredTypeParameters");
        List list2 = listI2;
        ArrayList arrayList2 = new ArrayList(xj.p.W(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            c0 c0VarG = ((m0) it2.next()).g();
            n.e(c0VarG, "it.defaultType");
            arrayList2.add(qk.i0.d(c0VarG));
        }
        return new i0(b0.W(xj.n.U0(arrayList, arrayList2)), 1);
    }

    public static InvocationHandler i() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, WebView.getWebViewClassLoader()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static int j(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < 6; i11++) {
            int iCeil = (int) Math.ceil(fArr[i11]);
            iArr[i11] = iCeil;
            if (i10 > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i10 = iCeil;
            }
            if (i10 == iCeil) {
                bArr[i11] = (byte) (bArr[i11] + 1);
            }
        }
        return i10;
    }

    public static va.c k(String str) {
        va.i iVar;
        eb.m mVar = eb.m.f40000b;
        synchronized (mVar) {
            if (!mVar.f40001a.containsKey(str)) {
                throw new GeneralSecurityException("Name " + str + " does not exist");
            }
            iVar = (va.i) mVar.f40001a.get(str);
        }
        return new va.c(iVar, 2);
    }

    public static float l(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? p0.b.b(edgeEffect) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static void m(Context context, e8.a aVar, int i10, int i11, Bitmap.CompressFormat format, int i12, long j10, l8.b bVar) {
        n.f(context, "context");
        n.f(format, "format");
        try {
            com.bumptech.glide.i iVar = (com.bumptech.glide.i) com.bumptech.glide.b.c(context).h().a(((w6.f) new w6.f().k(e0.f46578d, Long.valueOf(j10))).h(com.bumptech.glide.f.f10475a)).w(aVar.a()).l(new z6.d(Long.valueOf(aVar.f39159i)));
            iVar.getClass();
            w6.e eVar = new w6.e(i10, i11);
            iVar.v(eVar, eVar, a7.h.f3430b);
            Bitmap bitmap = (Bitmap) eVar.get();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(format, i12, byteArrayOutputStream);
            bVar.b(byteArrayOutputStream.toByteArray());
        } catch (Exception e10) {
            String string = e10.toString();
            Handler handler = l8.b.f45242d;
            bVar.c("Thumbnail request error", string, null);
        }
    }

    public static void n(char c4) {
        String hexString = Integer.toHexString(c4);
        throw new IllegalArgumentException("Illegal character: " + c4 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    public static boolean o(char c4) {
        return c4 >= '0' && c4 <= '9';
    }

    public static boolean p(Context context) {
        Bundle bundle;
        Context applicationContext = context.getApplicationContext();
        try {
            bundle = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("ContentSizingFlag", "Could not get metadata");
            bundle = null;
        }
        if (bundle != null) {
            return bundle.getBoolean("io.flutter.embedding.android.EnableContentSizing", false);
        }
        return false;
    }

    public static boolean q(char c4) {
        return c4 >= 128 && c4 <= 255;
    }

    public static synchronized boolean r(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f49511a;
        if (context2 != null && (bool = f49512b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f49512b = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f49512b = boolValueOf;
        f49511a = applicationContext;
        return boolValueOf.booleanValue();
    }

    public static boolean s(char c4) {
        if (c4 == '\r' || c4 == '*' || c4 == '>' || c4 == ' ') {
            return true;
        }
        if (c4 < '0' || c4 > '9') {
            return c4 >= 'A' && c4 <= 'Z';
        }
        return true;
    }

    public static wj.d t(wj.e eVar, jk.a aVar) {
        wj.o oVar = wj.o.f53296a;
        int iOrdinal = eVar.ordinal();
        if (iOrdinal == 0) {
            return new j(aVar);
        }
        if (iOrdinal == 1) {
            wj.i iVar = new wj.i();
            iVar.f53288a = aVar;
            iVar.f53289b = oVar;
            return iVar;
        }
        if (iOrdinal != 2) {
            throw new aa.b((byte) 0, 20);
        }
        s sVar = new s();
        sVar.f53298a = aVar;
        sVar.f53299b = oVar;
        return sVar;
    }

    public static j u(jk.a initializer) {
        n.f(initializer, "initializer");
        return new j(initializer);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0196  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0117  */
    /* JADX WARN: Code duplicated, block: B:72:0x0123  */
    /* JADX WARN: Code duplicated, block: B:73:0x012a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0130  */
    /* JADX WARN: Code duplicated, block: B:76:0x0139  */
    /* JADX WARN: Code duplicated, block: B:81:0x014f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0155  */
    /* JADX WARN: Code duplicated, block: B:84:0x015d  */
    /* JADX WARN: Code duplicated, block: B:87:0x016c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0177 A[LOOP:1: B:88:0x0175->B:89:0x0177, LOOP_END] */
    public static int v(CharSequence charSequence, int i10, int i11) {
        float[] fArr;
        int i12;
        int[] iArr;
        byte[] bArr;
        int i13;
        int i14;
        int i15;
        int i16;
        byte b10;
        byte b11;
        byte b12;
        byte b13;
        int i17;
        if (i10 >= charSequence.length()) {
            return i11;
        }
        float f10 = 2.0f;
        int i18 = 5;
        float f11 = 1.0f;
        int i19 = 2;
        if (i11 == 0) {
            fArr = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[6];
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i11] = 0.0f;
        }
        int i20 = 0;
        while (true) {
            int i21 = i10 + i20;
            if (i21 == charSequence.length()) {
                byte[] bArr2 = new byte[6];
                int[] iArr2 = new int[6];
                int iJ = j(fArr, iArr2, bArr2);
                int i22 = 0;
                for (int i23 = 0; i23 < 6; i23++) {
                    i22 += bArr2[i23];
                }
                if (iArr2[0] == iJ) {
                    break;
                }
                if (i22 == 1 && bArr2[i18] > 0) {
                    return i18;
                }
                if (i22 != 1 || bArr2[4] <= 0) {
                    if (i22 != 1 || bArr2[i19] <= 0) {
                        return (i22 != 1 || bArr2[3] <= 0) ? 1 : 3;
                    }
                    return i19;
                }
                return 4;
            }
            char cCharAt = charSequence.charAt(i21);
            i20++;
            if (o(cCharAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (q(cCharAt)) {
                float fCeil = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil;
                fArr[0] = fCeil + f10;
            } else {
                float fCeil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil2;
                fArr[0] = fCeil2 + f11;
            }
            int i24 = i18;
            float f12 = f11;
            if (cCharAt == ' ' || (cCharAt >= '0' && cCharAt <= '9')) {
                i12 = i19;
            } else {
                i12 = i19;
                if (cCharAt < 'A' || cCharAt > 'Z') {
                    if (q(cCharAt)) {
                        fArr[1] = fArr[1] + 2.6666667f;
                    } else {
                        fArr[1] = fArr[1] + 1.3333334f;
                    }
                }
                if (cCharAt != ' ' || ((cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'z'))) {
                    fArr[i12] = fArr[i12] + 0.6666667f;
                } else if (q(cCharAt)) {
                    fArr[i12] = fArr[i12] + 2.6666667f;
                } else {
                    fArr[i12] = fArr[i12] + 1.3333334f;
                }
                if (s(cCharAt)) {
                    fArr[3] = fArr[3] + 0.6666667f;
                } else if (q(cCharAt)) {
                    fArr[3] = fArr[3] + 4.3333335f;
                } else {
                    fArr[3] = fArr[3] + 3.3333333f;
                }
                if (cCharAt < ' ' && cCharAt <= '^') {
                    fArr[4] = fArr[4] + 0.75f;
                } else if (q(cCharAt)) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
                fArr[i24] = fArr[i24] + f12;
                if (i20 >= 4) {
                    iArr = new int[6];
                    bArr = new byte[6];
                    j(fArr, iArr, bArr);
                    i14 = 0;
                    for (i13 = 0; i13 < 6; i13++) {
                        i14 += bArr[i13];
                    }
                    i15 = iArr[0];
                    i16 = iArr[i24];
                    if (i15 >= i16 && i15 < iArr[1] && i15 < iArr[i12] && i15 < iArr[3] && i15 < iArr[4]) {
                        break;
                    }
                    if (i16 >= i15) {
                        return i24;
                    }
                    b10 = bArr[1];
                    b11 = bArr[i12];
                    b12 = bArr[3];
                    b13 = bArr[4];
                    if (b10 + b11 + b12 + b13 == 0) {
                        return i24;
                    }
                    if (i14 != 1 && b13 > 0) {
                        return 4;
                    }
                    if (i14 != 1 && b11 > 0) {
                        return i12;
                    }
                    if (i14 == 1 || b12 <= 0) {
                        int i25 = iArr[1];
                        i17 = i25 + 1;
                        if (i17 < i15 && i17 < i16 && i17 < iArr[4] && i17 < iArr[i12]) {
                            int i26 = iArr[3];
                            if (i25 >= i26) {
                                if (i25 == i26) {
                                    for (int i27 = i10 + i20 + 1; i27 < charSequence.length(); i27++) {
                                        char cCharAt2 = charSequence.charAt(i27);
                                        if (cCharAt2 == '\r' || cCharAt2 == '*' || cCharAt2 == '>') {
                                            return 3;
                                        }
                                        if (!s(cCharAt2)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i18 = i24;
                f11 = f12;
                i19 = i12;
                f10 = 2.0f;
            }
            fArr[1] = fArr[1] + 0.6666667f;
            if (cCharAt != ' ') {
                fArr[i12] = fArr[i12] + 0.6666667f;
            } else {
                fArr[i12] = fArr[i12] + 0.6666667f;
            }
            if (s(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (q(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (cCharAt < ' ') {
                if (q(cCharAt)) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
            } else if (q(cCharAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            fArr[i24] = fArr[i24] + f12;
            if (i20 >= 4) {
                iArr = new int[6];
                bArr = new byte[6];
                j(fArr, iArr, bArr);
                i14 = 0;
                while (i13 < 6) {
                    i14 += bArr[i13];
                }
                i15 = iArr[0];
                i16 = iArr[i24];
                if (i15 >= i16) {
                }
                if (i16 >= i15) {
                    return i24;
                }
                b10 = bArr[1];
                b11 = bArr[i12];
                b12 = bArr[3];
                b13 = bArr[4];
                if (b10 + b11 + b12 + b13 == 0) {
                    return i24;
                }
                if (i14 != 1) {
                }
                if (i14 != 1) {
                }
                if (i14 == 1) {
                }
                int i28 = iArr[1];
                i17 = i28 + 1;
                if (i17 < i15) {
                    continue;
                }
            }
            i18 = i24;
            f11 = f12;
            i19 = i12;
            f10 = 2.0f;
        }
        return 0;
    }

    public static float w(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return p0.b.c(edgeEffect, f10, f11);
        }
        edgeEffect.onPull(f10, f11);
        return f10;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x002a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x005d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:6:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0154  */
    /* JADX WARN: Code duplicated, block: B:83:0x0164  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0025. Please report as an issue. */
    /* JADX WARN: Switch 'out' block B:4:0x0011 for B:9:0x0025 already processed. Defaulting to fallback option. */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:80:0x0154
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static dh.b x(og.b r16) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.b.x(og.b):dh.b");
    }

    public static void y(Runnable runnable) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, 0L);
    }

    public static boolean z(n2.h hVar, boolean z10) {
        int i10;
        q qVar = new q(16);
        boolean z11 = true;
        while (true) {
            qVar.J(8);
            if (!hVar.peekFully(qVar.f44813a, 0, 8, true)) {
                break;
            }
            long jB = qVar.B();
            int iM = qVar.m();
            if (jB != 1) {
                i10 = 8;
            } else {
                if (!hVar.peekFully(qVar.f44813a, 8, 8, true)) {
                    break;
                }
                jB = qVar.F();
                i10 = 16;
            }
            long j10 = i10;
            if (jB < j10) {
                break;
            }
            int i11 = (int) (jB - j10);
            if (z11) {
                if (iM != 1718909296 || i11 < 8) {
                    break;
                }
                qVar.J(4);
                hVar.peekFully(qVar.f44813a, 0, 4, false);
                if (qVar.m() != 1751476579) {
                    break;
                }
                if (!z10) {
                    return true;
                }
                hVar.b(i11 - 4, false);
                z11 = false;
            } else {
                if (iM == 1836086884) {
                    return true;
                }
                if (i11 != 0) {
                    hVar.b(i11, false);
                }
            }
        }
        return false;
    }

    public abstract long P();

    public abstract void c(ta.b0 b0Var, Set set);

    public abstract String f(byte[] bArr, int i10, int i11);

    public abstract int g(ta.b0 b0Var);

    public abstract int h(byte[] bArr, int i10, int i11, String str);
}
