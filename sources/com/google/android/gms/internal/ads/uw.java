package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonReader;
import com.adjust.sdk.Constants;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.zip.Inflater;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class uw implements j, q7, p00, yd1, tv0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static tz f20916f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f20918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f20919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f20920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f20921e;

    public /* synthetic */ uw(h hVar, String str, int[] iArr, Point point) {
        this.f20917a = 1;
        this.f20919c = hVar;
        this.f20918b = str;
        this.f20920d = iArr;
        this.f20921e = point;
    }

    public static uw a(Reader reader, Bundle bundle) {
        try {
            try {
                uw uwVar = new uw(new JsonReader(reader), bundle);
                p9.c.d(reader);
                return uwVar;
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e10) {
                throw new gu0("unable to parse ServerResponse", e10);
            }
        } catch (Throwable th2) {
            p9.c.d(reader);
            throw th2;
        }
    }

    public static tz c(Context context) {
        tz tzVar;
        synchronized (uw.class) {
            try {
                if (f20916f == null) {
                    f20916f = zzay.zzb().zzi(context, new qt());
                }
                tzVar = f20916f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tzVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.q7
    public void b(int i10, int i11, b2.d0 d0Var, byte[] bArr) {
        np0 np0Var;
        l80 l80Var;
        int i12;
        np0 np0Var2;
        int i13;
        int i14;
        int iO;
        np0 np0Var3 = (np0) this.f20919c;
        np0Var3.z(i10 + i11, bArr);
        np0Var3.E(i10);
        if (((Inflater) this.f20918b) == null) {
            this.f20918b = new Inflater();
        }
        np0 np0Var4 = (np0) this.f20920d;
        if (uu0.i(np0Var3, np0Var4, (Inflater) this.f20918b)) {
            np0Var3.z(np0Var4.f17882c, np0Var4.f17880a);
        }
        b8 b8Var = (b8) this.f20921e;
        int i15 = 0;
        b8Var.f12677c = 0;
        np0 np0Var5 = (np0) b8Var.f12683i;
        b8Var.f12678d = 0;
        b8Var.f12679e = 0;
        b8Var.f12680f = 0;
        b8Var.f12681g = 0;
        b8Var.f12682h = 0;
        np0Var5.y(0);
        b8Var.f12676b = false;
        int[] iArr = b8Var.f12675a;
        ArrayList arrayList = new ArrayList();
        while (np0Var3.B() >= 3) {
            int i16 = np0Var3.f17882c;
            int iK = np0Var3.K();
            int iL = np0Var3.L();
            int i17 = np0Var3.f17881b + iL;
            if (i17 > i16) {
                np0Var3.E(i16);
                np0Var = np0Var3;
                l80Var = null;
                i12 = i15;
            } else {
                if (iK != 128) {
                    switch (iK) {
                        case 20:
                            if (iL % 5 != 2) {
                                np0Var2 = np0Var5;
                                np0Var = np0Var3;
                            } else {
                                np0Var3.G(2);
                                Arrays.fill(iArr, i15);
                                int i18 = iL / 5;
                                int i19 = i15;
                                while (i19 < i18) {
                                    int iK2 = np0Var3.K();
                                    int iK3 = np0Var3.K();
                                    int iK4 = np0Var3.K();
                                    int iK5 = np0Var3.K();
                                    double d10 = iK3;
                                    int iK6 = np0Var3.K() << 24;
                                    String str = uu0.f20901a;
                                    np0 np0Var6 = np0Var5;
                                    double d11 = iK4 - 128;
                                    double d12 = iK5 - 128;
                                    iArr[iK2] = (Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)) << 8) | iK6 | (Math.max(0, Math.min((int) ((1.402d * d11) + d10), 255)) << 16) | Math.max(0, Math.min((int) (d10 + (1.772d * d12)), 255));
                                    i19++;
                                    np0Var5 = np0Var6;
                                    np0Var3 = np0Var3;
                                }
                                np0Var2 = np0Var5;
                                np0Var = np0Var3;
                                b8Var.f12676b = true;
                            }
                            np0Var5 = np0Var2;
                            i12 = 0;
                            l80Var = null;
                            break;
                        case 21:
                            if (iL >= 4) {
                                np0Var3.G(3);
                                int i20 = iL - 4;
                                if ((128 & np0Var3.K()) == 0) {
                                    i13 = np0Var5.f17881b;
                                    i14 = np0Var5.f17882c;
                                    if (i13 < i14 && i20 > 0) {
                                        int iMin = Math.min(i20, i14 - i13);
                                        np0Var3.H(np0Var5.f17880a, i13, iMin);
                                        np0Var5.E(i13 + iMin);
                                    }
                                } else if (i20 >= 7 && (iO = np0Var3.O()) >= 4) {
                                    b8Var.f12681g = np0Var3.L();
                                    b8Var.f12682h = np0Var3.L();
                                    np0Var5.y(iO - 4);
                                    i20 = iL - 11;
                                    i13 = np0Var5.f17881b;
                                    i14 = np0Var5.f17882c;
                                    if (i13 < i14) {
                                        int iMin2 = Math.min(i20, i14 - i13);
                                        np0Var3.H(np0Var5.f17880a, i13, iMin2);
                                        np0Var5.E(i13 + iMin2);
                                    }
                                }
                            }
                            np0Var = np0Var3;
                            l80Var = null;
                            i12 = i15;
                            break;
                        case 22:
                            if (iL >= 19) {
                                b8Var.f12677c = np0Var3.L();
                                b8Var.f12678d = np0Var3.L();
                                np0Var3.G(11);
                                b8Var.f12679e = np0Var3.L();
                                b8Var.f12680f = np0Var3.L();
                            }
                            np0Var = np0Var3;
                            l80Var = null;
                            i12 = i15;
                            break;
                        default:
                            np0Var = np0Var3;
                            l80Var = null;
                            i12 = i15;
                            break;
                    }
                } else {
                    np0 np0Var7 = np0Var5;
                    np0Var = np0Var3;
                    if (b8Var.f12677c == 0 || b8Var.f12678d == 0 || b8Var.f12681g == 0 || b8Var.f12682h == 0) {
                        np0Var5 = np0Var7;
                    } else {
                        np0Var5 = np0Var7;
                        int i21 = np0Var5.f17882c;
                        if (i21 != 0 && np0Var5.f17881b == i21 && b8Var.f12676b) {
                            np0Var5.E(0);
                            int i22 = b8Var.f12681g * b8Var.f12682h;
                            int[] iArr2 = new int[i22];
                            int i23 = 0;
                            while (i23 < i22) {
                                int iK7 = np0Var5.K();
                                if (iK7 != 0) {
                                    iArr2[i23] = iArr[iK7];
                                    i23++;
                                } else {
                                    int iK8 = np0Var5.K();
                                    if (iK8 != 0) {
                                        int iK9 = iK8 & 63;
                                        if ((iK8 & 64) != 0) {
                                            iK9 = (iK9 << 8) | np0Var5.K();
                                        }
                                        int i24 = (iK8 & 128) == 0 ? iArr[0] : iArr[np0Var5.K()];
                                        int i25 = i23 + iK9;
                                        Arrays.fill(iArr2, i23, i25, i24);
                                        i23 = i25;
                                    }
                                }
                            }
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, b8Var.f12681g, b8Var.f12682h, Bitmap.Config.ARGB_8888);
                            float f10 = b8Var.f12679e;
                            float f11 = b8Var.f12677c;
                            float f12 = f10 / f11;
                            float f13 = b8Var.f12680f;
                            float f14 = b8Var.f12678d;
                            l80Var = new l80(null, null, null, bitmapCreateBitmap, f13 / f14, 0, 0, f12, 0, Integer.MIN_VALUE, -3.4028235E38f, b8Var.f12681g / f11, b8Var.f12682h / f14, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                        }
                        i12 = 0;
                        b8Var.f12677c = 0;
                        b8Var.f12678d = 0;
                        b8Var.f12679e = 0;
                        b8Var.f12680f = 0;
                        b8Var.f12681g = 0;
                        b8Var.f12682h = 0;
                        np0Var5.y(0);
                        b8Var.f12676b = false;
                    }
                    l80Var = null;
                    i12 = 0;
                    b8Var.f12677c = 0;
                    b8Var.f12678d = 0;
                    b8Var.f12679e = 0;
                    b8Var.f12680f = 0;
                    b8Var.f12681g = 0;
                    b8Var.f12682h = 0;
                    np0Var5.y(0);
                    b8Var.f12676b = false;
                }
                np0Var.E(i17);
            }
            if (l80Var != null) {
                arrayList.add(l80Var);
            }
            i15 = i12;
            np0Var3 = np0Var;
        }
        d0Var.mo161zza(new m7(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }

    public void d(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.f20919c = Integer.valueOf(i10);
    }

    public void e(hi1 hi1Var) throws GeneralSecurityException {
        pj1 pj1Var = new pj1(hi1Var.f15307a, kj1.class);
        HashMap map = (HashMap) this.f20919c;
        if (!map.containsKey(pj1Var)) {
            map.put(pj1Var, hi1Var);
            return;
        }
        hi1 hi1Var2 = (hi1) map.get(pj1Var);
        if (!hi1Var2.equals(hi1Var) || !hi1Var.equals(hi1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(pj1Var.toString()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    @Override // com.google.android.gms.internal.ads.j
    public ya1 f(int i10, ni niVar, int[] iArr) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Point point;
        ni niVar2 = niVar;
        Point point2 = (Point) this.f20921e;
        int i16 = ((int[]) this.f20920d)[i10];
        h hVar = (h) this.f20919c;
        int i17 = point2 != null ? point2.x : hVar.f15786e;
        int i18 = point2 != null ? point2.y : hVar.f15787f;
        boolean z10 = hVar.f15789h;
        if (i17 == Integer.MAX_VALUE || i18 == Integer.MAX_VALUE) {
            i11 = Integer.MAX_VALUE;
        } else {
            int i19 = Integer.MAX_VALUE;
            for (int i20 = 0; i20 < niVar2.f17829a; i20++) {
                g22 g22Var = niVar2.f17832d[i20];
                int i21 = g22Var.f14685v;
                if (i21 > 0 && (i13 = g22Var.f14686w) > 0) {
                    if (!z10) {
                        i14 = i18;
                        i15 = i17;
                    } else if ((i21 > i13) != (i17 > i18)) {
                        i15 = i18;
                        i14 = i17;
                    } else {
                        i14 = i18;
                        i15 = i17;
                    }
                    int i22 = i21 * i14;
                    int i23 = i13 * i15;
                    if (i22 >= i23) {
                        String str = uu0.f20901a;
                        point = new Point(i15, ((i23 + i21) - 1) / i21);
                    } else {
                        String str2 = uu0.f20901a;
                        point = new Point(((i22 + i13) - 1) / i13, i14);
                    }
                    int i24 = i21 * i13;
                    if (i21 >= ((int) (point.x * 0.98f)) && i13 >= ((int) (point.y * 0.98f)) && i24 < i19) {
                        i19 = i24;
                    }
                }
            }
            i11 = i19;
        }
        aa1 aa1Var = ca1.f13122b;
        rb0.p(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i25 = 0;
        int i26 = 0;
        while (i25 < niVar2.f17829a) {
            g22 g22Var2 = niVar2.f17832d[i25];
            int i27 = g22Var2.f14685v;
            int i28 = (i27 == -1 || (i12 = g22Var2.f14686w) == -1) ? -1 : i27 * i12;
            l lVar = new l(i10, niVar2, i25, hVar, iArr[i25], (String) this.f20918b, i11 == Integer.MAX_VALUE || (i28 != -1 && i28 <= i11));
            int length = objArrCopyOf.length;
            int i29 = i26 + 1;
            int iD = x91.d(length, i29);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i26] = lVar;
            i25++;
            i26 = i29;
            niVar2 = niVar;
        }
        return ca1.A(i26, objArrCopyOf);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r10 == false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(com.google.android.gms.internal.ads.jh r9, com.google.android.gms.internal.ads.s6 r10) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uw.g(com.google.android.gms.internal.ads.jh, com.google.android.gms.internal.ads.s6):boolean");
    }

    public void i(int i10) throws GeneralSecurityException {
        if (i10 != 12 && i10 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
        }
        this.f20920d = Integer.valueOf(i10);
    }

    public void j(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzm zzmVarZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = (Context) this.f20919c;
        tz tzVarC = c(context);
        if (tzVarC == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        s9.b bVar = new s9.b(context);
        zzeh zzehVar = (zzeh) this.f20921e;
        if (zzehVar == null) {
            zzn zznVar = new zzn();
            zznVar.zzi(jCurrentTimeMillis);
            zzmVarZza = zznVar.zza();
        } else {
            zzehVar.zzp(jCurrentTimeMillis);
            zzmVarZza = zzq.zza.zza(context, zzehVar);
        }
        try {
            tzVarC.zze(bVar, new xz((String) this.f20918b, ((AdFormat) this.f20920d).name(), null, zzmVarZza), new tw(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }

    public void k(fi1 fi1Var) throws GeneralSecurityException {
        fi1Var.getClass();
        oj1 oj1Var = new oj1(kj1.class, fi1Var.f14442a);
        HashMap map = (HashMap) this.f20920d;
        if (!map.containsKey(oj1Var)) {
            map.put(oj1Var, fi1Var);
            return;
        }
        fi1 fi1Var2 = (fi1) map.get(oj1Var);
        if (!fi1Var2.equals(fi1Var) || !fi1Var.equals(fi1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(oj1Var.toString()));
        }
    }

    public nh l(int i10) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f20921e;
        String string = i10 == 1 ? sharedPreferences.getString(t(), null) : sharedPreferences.getString(s(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] bArrJ = p9.c.j(string);
                nh nhVarE = nh.E(cs1.D(bArrJ, 0, bArrJ.length));
                String strZ = nhVarE.z();
                File fileD = rb0.d(strZ, "pcam.jar", o());
                if (!fileD.exists()) {
                    fileD = rb0.d(strZ, "pcam", o());
                }
                File fileD2 = rb0.d(strZ, "pcbc", o());
                if (fileD.exists() && fileD2.exists()) {
                    return nhVarE;
                }
            } catch (et1 unused) {
            }
        }
        return null;
    }

    public void m() {
        this.f20921e = 16;
    }

    public void n(zi1 zi1Var) throws GeneralSecurityException {
        pj1 pj1Var = new pj1(zi1Var.f22629a, lj1.class);
        HashMap map = (HashMap) this.f20921e;
        if (!map.containsKey(pj1Var)) {
            map.put(pj1Var, zi1Var);
            return;
        }
        zi1 zi1Var2 = (zi1) map.get(pj1Var);
        if (!zi1Var2.equals(zi1Var) || !zi1Var.equals(zi1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(pj1Var.toString()));
        }
    }

    public File o() {
        File file = new File((File) this.f20919c, Integer.toString(((hh) this.f20918b).f15291a));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public void p(xi1 xi1Var) throws GeneralSecurityException {
        xi1Var.getClass();
        oj1 oj1Var = new oj1(lj1.class, xi1Var.f21906a);
        HashMap map = (HashMap) this.f20918b;
        if (!map.containsKey(oj1Var)) {
            map.put(oj1Var, xi1Var);
            return;
        }
        xi1 xi1Var2 = (xi1) map.get(oj1Var);
        if (!xi1Var2.equals(xi1Var) || !xi1Var.equals(xi1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(oj1Var.toString()));
        }
    }

    public yf1 q() throws GeneralSecurityException {
        Integer num = (Integer) this.f20919c;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f20920d) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f20921e) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = ((Integer) this.f20920d).intValue();
        ((Integer) this.f20921e).getClass();
        return new yf1(iIntValue, iIntValue2, (xf1) this.f20918b);
    }

    public ro1 r() throws GeneralSecurityException {
        sf1 sf1Var = sf1.f19964o;
        tf1 tf1Var = (tf1) this.f20919c;
        if (tf1Var == null) {
            throw new GeneralSecurityException("signature encoding is not set");
        }
        qo1 qo1Var = (qo1) this.f20920d;
        if (qo1Var == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        sf1 sf1Var2 = (sf1) this.f20921e;
        if (sf1Var2 == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        xf1 xf1Var = (xf1) this.f20918b;
        if (qo1Var == qo1.f19148c && sf1Var2 != sf1.f19962m) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        if (qo1Var == qo1.f19149d && sf1Var2 != sf1.f19963n && sf1Var2 != sf1Var) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (qo1Var != qo1.f19150e || sf1Var2 == sf1Var) {
            return new ro1(tf1Var, qo1Var, sf1Var2, xf1Var);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }

    public String s() {
        int i10 = ((hh) this.f20918b).f15291a;
        return l1.d.k(new StringBuilder(String.valueOf(i10).length() + 6), "FBAMTD", i10);
    }

    public String t() {
        int i10 = ((hh) this.f20918b).f15291a;
        return l1.d.k(new StringBuilder(String.valueOf(i10).length() + 6), "LATMTD", i10);
    }

    @Override // com.google.android.gms.internal.ads.tv0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo165zza() {
        po0 po0Var = (po0) this.f20919c;
        ((tm0) po0Var.f18748e).b((ju0) this.f20920d, (du0) this.f20921e, (qm0) this.f20918b);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public void mo164zzb(Object obj) {
        jw0 jw0Var;
        int i10;
        int i11 = 1;
        switch (this.f20917a) {
            case 5:
                ((k00) ((m60) this.f20921e).f17309e).a(new o1((mx0) this.f20919c, (String) obj, (zzv) this.f20920d, 7));
                return;
            case 7:
                b30 b30Var = (b30) obj;
                du0 du0Var = (du0) this.f20919c;
                b30Var.E(du0Var, (fu0) this.f20920d);
                g30 g30VarZzP = b30Var.zzP();
                if (((Boolean) zzba.zzc().a(am.Lb)).booleanValue() && g30VarZzP != null) {
                    m60 m60Var = (m60) this.f20921e;
                    ng0 ng0Var = (ng0) this.f20918b;
                    g30VarZzP.q0(m60Var, ng0Var.f17819i, ng0Var.f17820j);
                    g30VarZzP.u0(m60Var, ng0Var.f17819i, ng0Var.f17814d);
                }
                if (!((Boolean) zzba.zzc().a(am.Ke)).booleanValue() || g30VarZzP == null) {
                    return;
                }
                b30 b30Var2 = g30VarZzP.f14694a;
                if (zzt.zzD().a(b30Var2.getContext())) {
                    g30VarZzP.e("/logScionEvent");
                    new HashMap();
                    g30VarZzP.b("/logScionEvent", new lq(i11, b30Var2.getContext(), du0Var.f13716w0));
                    return;
                }
                return;
            case 11:
                zs0 zs0Var = (zs0) this.f20918b;
                p70 p70Var = (p70) obj;
                synchronized (zs0Var) {
                    if (p70Var != null) {
                        try {
                            p70Var.b();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (zs0Var.f22714m) {
                        zs0Var.c();
                    }
                    if (!((Boolean) an.f12466c.o()).booleanValue() || (jw0Var = (jw0) this.f20919c) == null) {
                        kw0 kw0Var = zs0Var.f22711i;
                        fw0 fw0Var = (fw0) this.f20920d;
                        fw0Var.b(p70Var.f17334a.f16196b);
                        fw0Var.zzi(p70Var.f17339f.f11954a);
                        fw0Var.zzd(true);
                        kw0Var.b(fw0Var.zzm());
                    } else {
                        jw0Var.e(p70Var.f17334a.f16196b);
                        jw0Var.g(p70Var.f17339f.f11954a);
                        fw0 fw0Var2 = (fw0) this.f20920d;
                        fw0Var2.zzd(true);
                        jw0Var.a(fw0Var2);
                        jw0Var.h();
                    }
                    break;
                }
                return;
            default:
                mx0 mx0Var = (mx0) this.f20918b;
                fw0 fw0Var3 = (fw0) this.f20919c;
                com.google.android.gms.ads.internal.util.client.zzt zztVar = (com.google.android.gms.ads.internal.util.client.zzt) obj;
                if (fw0Var3 != null) {
                    fw0Var3.zzd(zztVar == com.google.android.gms.ads.internal.util.client.zzt.zza);
                    jw0 jw0Var2 = (jw0) this.f20920d;
                    if (jw0Var2 == null) {
                        mx0Var.f17583f.b(fw0Var3.zzm());
                    } else {
                        jw0Var2.a(fw0Var3);
                        jw0Var2.h();
                    }
                }
                cb0 cb0Var = (cb0) this.f20921e;
                if (cb0Var != null) {
                    String strZzb = mx0Var.f17581d.zzb();
                    if (TextUtils.isEmpty(strZzb)) {
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(strZzb);
                        Parcelable.Creator<com.google.android.gms.ads.internal.client.zzt> creator = com.google.android.gms.ads.internal.client.zzt.CREATOR;
                        String strOptString = jSONObject.optString("type");
                        String strOptString2 = jSONObject.optString("precision");
                        String strOptString3 = jSONObject.optString("currency");
                        long jOptLong = jSONObject.optLong(X3.i.X, 0L);
                        int iHashCode = strOptString.hashCode();
                        int i12 = 3;
                        if (iHashCode != 66934) {
                            if (iHashCode != 66944) {
                                if (iHashCode == 1349395245 && strOptString.equals("ONE_PIXEL")) {
                                    jOptLong /= 1000;
                                    i10 = 3;
                                } else {
                                    i10 = 0;
                                }
                            } else if (strOptString.equals("CPM")) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                        } else if (strOptString.equals("CPC")) {
                            i10 = 2;
                        } else {
                            i10 = 0;
                        }
                        int iHashCode2 = strOptString2.hashCode();
                        if (iHashCode2 != -2131980260) {
                            if (iHashCode2 != 399232571) {
                                if (iHashCode2 == 1271254246 && strOptString2.equals("PUBLISHER_PROVIDED")) {
                                    i12 = 2;
                                } else {
                                    i12 = 0;
                                }
                            } else if (!strOptString2.equals("PRECISE")) {
                                i12 = 0;
                            }
                        } else if (strOptString2.equals("ESTIMATED")) {
                            i12 = 1;
                        } else {
                            i12 = 0;
                        }
                        com.google.android.gms.ads.internal.client.zzt zztVar2 = new com.google.android.gms.ads.internal.client.zzt(i10, i12, strOptString3, jOptLong);
                        if (com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(cb0Var.f13125e) && cb0Var.f13123c.B0 && cb0Var.f13124d.compareAndSet(false, true)) {
                            cb0Var.S0(new x11(zztVar2, 13));
                            return;
                        }
                        return;
                    } catch (JSONException e10) {
                        zzt.zzh().d("UrlPinger.pingUrl", e10);
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ uw(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f20917a = i10;
        this.f20919c = obj;
        this.f20920d = obj2;
        this.f20921e = obj3;
        this.f20918b = obj4;
    }

    public /* synthetic */ uw(Object obj, Object obj2, Object obj3, Object obj4, int i10, boolean z10) {
        this.f20917a = i10;
        this.f20919c = obj2;
        this.f20920d = obj3;
        this.f20921e = obj4;
        this.f20918b = obj;
    }

    @Override // com.google.android.gms.internal.ads.p00, com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza */
    public void mo160zza(Object obj) {
        xs xsVar = (xs) obj;
        zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.f20920d;
        m00 m00Var = (m00) this.f20921e;
        ft ftVar = (ft) this.f20918b;
        us usVar = (us) this.f20919c;
        ftVar.getClass();
        try {
            zzt.zzc();
            String string = UUID.randomUUID().toString();
            nq.f17899j.a(string, new et(ftVar, usVar, m00Var));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", ((ct) ftVar.f14529d).zzb(obj2));
            String str = (String) ftVar.f14527b;
            js jsVar = (js) xsVar;
            jsVar.getClass();
            jsVar.a(str, jSONObject.toString());
        } catch (Exception e10) {
            try {
                m00Var.zzd(e10);
                int i10 = zze.zza;
                zzo.zzg("Unable to invokeJavascript", e10);
            } finally {
                usVar.t();
            }
        }
    }

    public uw(int i10) {
        this.f20917a = i10;
        switch (i10) {
            case 16:
                this.f20919c = null;
                this.f20920d = null;
                this.f20921e = null;
                this.f20918b = xf1.f21854e;
                break;
            case 17:
                this.f20919c = new HashMap();
                this.f20920d = new HashMap();
                this.f20921e = new HashMap();
                this.f20918b = new HashMap();
                break;
            case 18:
                this.f20919c = null;
                this.f20920d = null;
                this.f20921e = null;
                this.f20918b = xf1.f21862n;
                break;
            default:
                this.f20919c = new np0();
                this.f20920d = new np0();
                this.f20921e = new b8(0);
                break;
        }
    }

    public uw(Context context, hh hhVar) {
        this.f20917a = 14;
        this.f20921e = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        rb0.C(dir, false);
        this.f20919c = dir;
        File dir2 = context.getDir("tmppccache", 0);
        rb0.C(dir2, true);
        this.f20920d = dir2;
        this.f20918b = hhVar;
    }

    public uw(Context context, String str) {
        String packageName;
        this.f20917a = 3;
        this.f20919c = context;
        this.f20921e = str;
        this.f20918b = (String) v71.f21087j.o();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f20920d = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put(O6.F, Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        zzt.zzc();
        linkedHashMap.put(X3.i.G, zzs.zzt());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, packageName);
        zzt.zzc();
        linkedHashMap.put("is_lite_sdk", true != zzs.zzH(context) ? "0" : "1");
        rx rxVarZzp = zzt.zzp();
        rxVarZzp.getClass();
        ListenableFuture listenableFutureB = l00.f16608a.b(new ze(2, rxVarZzp, context));
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((px) listenableFutureB.get()).f18828j));
            linkedHashMap.put("network_fine", Integer.toString(((px) listenableFutureB.get()).f18829k));
        } catch (Exception e10) {
            zzt.zzh().d("CsiConfiguration.CsiConfiguration", e10);
        }
        if (((Boolean) zzba.zzc().a(am.Wc)).booleanValue()) {
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f20920d;
            zzt.zzc();
            linkedHashMap2.put("is_bstar", true != zzs.zzE(context) ? "0" : "1");
        }
        if (((Boolean) zzba.zzc().a(am.Wa)).booleanValue()) {
            if (!((Boolean) zzba.zzc().a(am.f12236l3)).booleanValue() || pi1.l(zzt.zzh().f14135g)) {
                return;
            }
            ((LinkedHashMap) this.f20920d).put(O6.L, zzt.zzh().f14135g);
        }
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
        jw0 jw0Var;
        int i10;
        switch (this.f20917a) {
            case 5:
                ((k00) ((m60) this.f20921e).f17309e).a(new d20(this, th2, (mx0) this.f20919c, (String) this.f20918b, (zzv) this.f20920d));
                return;
            case 7:
                return;
            case 11:
                if (((Boolean) zzba.zzc().a(am.R6)).booleanValue()) {
                    zze.zzb("Banner ad failed to load", th2);
                }
                zs0 zs0Var = (zs0) this.f20918b;
                synchronized (zs0Var) {
                    f50 f50Var = (f50) this.f20921e;
                    com.google.android.gms.ads.internal.client.zze zzeVarR = pi1.r(th2, ((v80) f50Var.f14244t.zzb()).l);
                    zs0Var.f22715n = zzeVarR;
                    ((ga0) f50Var.f14237m.zzb()).j0(zzeVarR);
                    v71.g(zzeVarR.zza, "BannerAdLoader.onFailure", th2);
                    if (zs0Var.f22714m) {
                        zs0Var.d();
                        jb0 jb0Var = zs0Var.f22710h;
                        ub0 ub0Var = zs0Var.f22712j;
                        synchronized (ub0Var) {
                            i10 = ub0Var.f20717a;
                        }
                        jb0Var.X0(i10);
                    }
                    if (((Boolean) an.f12466c.o()).booleanValue() && (jw0Var = (jw0) this.f20919c) != null) {
                        jw0Var.f(zzeVarR);
                        fw0 fw0Var = (fw0) this.f20920d;
                        fw0Var.a(th2);
                        fw0Var.zzd(false);
                        jw0Var.a(fw0Var);
                        jw0Var.h();
                    } else {
                        kw0 kw0Var = zs0Var.f22711i;
                        fw0 fw0Var2 = (fw0) this.f20920d;
                        fw0Var2.c(zzeVarR);
                        fw0Var2.a(th2);
                        fw0Var2.zzd(false);
                        kw0Var.b(fw0Var2.zzm());
                    }
                }
                return;
            default:
                fw0 fw0Var3 = (fw0) this.f20919c;
                if (fw0Var3 == null) {
                    return;
                }
                fw0Var3.zzd(false);
                jw0 jw0Var2 = (jw0) this.f20920d;
                if (jw0Var2 == null) {
                    ((mx0) this.f20918b).f17583f.b(fw0Var3.zzm());
                    return;
                } else {
                    jw0Var2.a(fw0Var3);
                    jw0Var2.h();
                    return;
                }
        }
    }

    private final void h(Throwable th2) {
    }

    public /* synthetic */ uw(AudioTrack audioTrack, wv0 wv0Var) {
        this.f20917a = 19;
        this.f20919c = audioTrack;
        this.f20920d = wv0Var;
        Handler handlerO = uu0.o();
        this.f20921e = handlerO;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.g12
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
                uw uwVar = this.f14658a;
                if (((g12) uwVar.f20918b) == null) {
                    return;
                }
                rb0.g().execute(new gm0(29, uwVar, audioRouting));
            }
        };
        this.f20918b = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    public uw(JsonReader jsonReader, Bundle bundle) throws JSONException, IOException {
        this.f20917a = 12;
        this.f20918b = bundle;
        if (((Boolean) zzba.zzc().a(am.S2)).booleanValue() && bundle != null) {
            ((p9.b) zzt.zzk()).getClass();
            bundle.putLong("server-response-parse-start", System.currentTimeMillis());
        }
        ?? arrayList = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        fu0 fu0Var = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        arrayList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(new du0(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        fu0Var = new fu0(jsonReader);
                        if (((Boolean) zzba.zzc().a(am.T2)).booleanValue() && bundle != null) {
                            bundle.putLong("normalize-ad-response-start", fu0Var.f14562s);
                            bundle.putLong("normalize-ad-response-end", fu0Var.f14563t);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectZzd = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if (Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH.equals(strNextName3)) {
                            jSONObjectZzd = zzbp.zzd(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList2.add(new iu0(strNextString, jSONObjectZzd));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f20921e = arrayList2;
        this.f20919c = arrayList;
        this.f20920d = fu0Var == null ? new fu0(new JsonReader(new StringReader(JsonUtils.EMPTY_JSON))) : fu0Var;
    }

    public uw(m60 m60Var, mx0 mx0Var, String str, zzv zzvVar) {
        this.f20917a = 5;
        this.f20919c = mx0Var;
        this.f20918b = str;
        this.f20920d = zzvVar;
        Objects.requireNonNull(m60Var);
        this.f20921e = m60Var;
    }

    public uw(ya1 ya1Var, u31 u31Var, iw0 iw0Var, u31 u31Var2) {
        Object objY;
        this.f20917a = 15;
        if (ya1Var != null) {
            objY = ca1.y(ya1Var);
        } else {
            aa1 aa1Var = ca1.f13122b;
            objY = ya1.f22208e;
        }
        this.f20919c = objY;
        this.f20920d = u31Var;
        this.f20921e = iw0Var;
        this.f20918b = u31Var2;
    }

    public uw(qj1 qj1Var) {
        this.f20917a = 17;
        this.f20919c = new HashMap(qj1Var.f19110a);
        this.f20920d = new HashMap(qj1Var.f19111b);
        this.f20921e = new HashMap(qj1Var.f19112c);
        this.f20918b = new HashMap(qj1Var.f19113d);
    }
}
