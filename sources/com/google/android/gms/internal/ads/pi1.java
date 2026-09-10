package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzaz;
import com.google.android.gms.ads.internal.zzt;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.math.RoundingMode;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pi1 implements p2 {
    public static final /* synthetic */ int Q = 0;
    public static final /* synthetic */ int R = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f18667b = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f18668c = {44100, 48000, 32000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f18669d = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f18670e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f18671f = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f18672g = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f18673h = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final pb f18674i = new pb(4, "gads:afs:csa:experiment_id", "");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final pb f18675j = new pb(4, "gads:app_index:experiment_id", "");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final pb f18676k = new pb(4, "gads:block_autoclicks_experiment_id", "");
    public static final pb l = new pb(4, "gads:sdk_core_experiment_id", "");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final pb f18677m = new pb(4, "gads:spam_app_context:experiment_id", "");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final pb f18678n = new pb(4, "gads:temporary_experiment_id:1", "");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final pb f18679o = new pb(4, "gads:temporary_experiment_id:10", "");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final pb f18680p = new pb(4, "gads:temporary_experiment_id:11", "");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final pb f18681q = new pb(4, "gads:temporary_experiment_id:12", "");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final pb f18682r = new pb(4, "gads:temporary_experiment_id:13", "");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final pb f18683s = new pb(4, "gads:temporary_experiment_id:14", "");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final pb f18684t = new pb(4, "gads:temporary_experiment_id:15", "");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final pb f18685u = new pb(4, "gads:temporary_experiment_id:2", "");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final pb f18686v = new pb(4, "gads:temporary_experiment_id:3", "");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final pb f18687w = new pb(4, "gads:temporary_experiment_id:4", "");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final pb f18688x = new pb(4, "gads:temporary_experiment_id:5", "");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final pb f18689y = new pb(4, "gads:temporary_experiment_id:6", "");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final pb f18690z = new pb(4, "gads:temporary_experiment_id:7", "");
    public static final pb A = new pb(4, "gads:temporary_experiment_id:8", "");
    public static final pb B = new pb(4, "gads:temporary_experiment_id:9", "");
    public static final pb C = new pb(4, "gads:corewebview:experiment_id", "");
    public static final ei D = new ei(10);
    public static final ei E = new ei(17);
    public static final qd0 F = new qd0(0);
    public static final qd0 G = new qd0(11);
    public static final qd0 H = new qd0(17);
    public static final qd0 I = new qd0(22);
    public static final lr0 J = new lr0(3);
    public static final lr0 K = new lr0(9);
    public static final n6 L = new n6(4);
    public static final lr0 M = new lr0(20);
    public static final vh1 N = new vh1(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final f81 O = new f81(1, new ay0(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 6), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final byte[] P = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public /* synthetic */ pi1(int i10) {
        this.f18691a = i10;
    }

    public static void A(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    public static X509Certificate[] B(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws IOException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferO = O(byteBuffer);
        ByteBuffer byteBufferO2 = O(byteBuffer);
        byte[] bArrQ = Q(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrQ2 = null;
        byte[] bArrQ3 = null;
        int i10 = -1;
        int i11 = 0;
        while (byteBufferO2.hasRemaining()) {
            i11++;
            try {
                ByteBuffer byteBufferO3 = O(byteBufferO2);
                if (byteBufferO3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i12 = byteBufferO3.getInt();
                arrayList.add(Integer.valueOf(i12));
                if (i12 != 513 && i12 != 514 && i12 != 769) {
                    switch (i12) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i10 != -1) {
                    int iG = G(i12);
                    int iG2 = G(i10);
                    if (iG != 1 && iG2 == 1) {
                    }
                }
                bArrQ3 = Q(byteBufferO3);
                i10 = i12;
            } catch (IOException | BufferUnderflowException e10) {
                throw new SecurityException(l1.d.k(new StringBuilder(String.valueOf(i11).length() + 34), "Failed to parse signature record #", i11), e10);
            }
        }
        if (i10 == -1) {
            if (i11 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i10 == 513 || i10 == 514) {
            str = "EC";
        } else if (i10 != 769) {
            switch (i10) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
            }
        } else {
            str = "DSA";
        }
        if (i10 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i10 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i10 != 769) {
            switch (i10) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrQ));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferO);
            if (!signature.verify(bArrQ3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferO.clear();
            ByteBuffer byteBufferO4 = O(byteBufferO);
            ArrayList arrayList2 = new ArrayList();
            int i13 = 0;
            while (byteBufferO4.hasRemaining()) {
                i13++;
                try {
                    ByteBuffer byteBufferO5 = O(byteBufferO4);
                    if (byteBufferO5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i14 = byteBufferO5.getInt();
                    arrayList2.add(Integer.valueOf(i14));
                    if (i14 == i10) {
                        bArrQ2 = Q(byteBufferO5);
                    }
                } catch (IOException | BufferUnderflowException e11) {
                    throw new IOException(l1.d.k(new StringBuilder(String.valueOf(i13).length() + 31), "Failed to parse digest record #", i13), e11);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iG3 = G(i10);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iG3), bArrQ2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrQ2)) {
                throw new SecurityException(H(iG3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferO6 = O(byteBufferO);
            ArrayList arrayList3 = new ArrayList();
            int i15 = 0;
            while (byteBufferO6.hasRemaining()) {
                i15++;
                byte[] bArrQ4 = Q(byteBufferO6);
                try {
                    arrayList3.add(new ua((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrQ4)), bArrQ4));
                } catch (CertificateException e12) {
                    throw new SecurityException(l1.d.k(new StringBuilder(String.valueOf(i15).length() + 30), "Failed to decode certificate #", i15), e12);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrQ, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e13) {
            throw new SecurityException(q4.a.j(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e13);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    public static zze C(int i10, String str, zze zzeVar) {
        String str2;
        int i11 = i10 - 1;
        if (str == null) {
            if (i10 == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i11) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) zzba.zzc().a(am.J9)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i10 == 0) {
            throw null;
        }
        int i12 = 0;
        int i13 = 2;
        switch (i11) {
            case 0:
            case 11:
            case 15:
                i13 = i12;
                return new zze(i13, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i13 = 1;
                return new zze(i13, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 2:
            case 10:
            case 18:
                i13 = 3;
                return new zze(i13, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 3:
                i12 = 8;
                i13 = i12;
                return new zze(i13, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 4:
            case 8:
            case 17:
                return new zze(i13, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 7:
                i12 = 4;
                i13 = i12;
                return new zze(i13, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 12:
                if (((Integer) zzba.zzc().a(am.J9)).intValue() <= 0) {
                    i12 = 9;
                    i13 = i12;
                } else {
                    i13 = 3;
                }
                return new zze(i13, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 13:
                i12 = 10;
                i13 = i12;
                return new zze(i13, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 14:
                i12 = 11;
                i13 = i12;
                return new zze(i13, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            default:
                switch (i10) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }

    public static int D(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iM = dv.m(obj);
        int i11 = iM & i10;
        int iP = p(i11, obj3);
        if (iP != 0) {
            int i12 = ~i10;
            int i13 = iM & i12;
            int i14 = -1;
            while (true) {
                int i15 = iP - 1;
                int i16 = iArr[i15];
                int i17 = i16 & i10;
                if ((i16 & i12) != i13 || !Objects.equals(obj, objArr[i15]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i15]))) {
                    if (i17 == 0) {
                        break;
                    }
                    i14 = i15;
                    iP = i17;
                } else {
                    if (i14 == -1) {
                        A(i11, i17, obj3);
                        return i15;
                    }
                    iArr[i14] = (iArr[i14] & i12) | (i17 & i10);
                    return i15;
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ boolean E(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        ps1.O(jArr2);
        byte[] bArrB0 = ps1.b0(jArr2);
        for (int i10 = 0; i10 < 32; i10++) {
            if (bArrB0[i10] != 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[][] F(int[] iArr, ra[] raVarArr) throws DigestException {
        long j10;
        int i10;
        int length;
        char c4;
        int i11 = 0;
        long jZza = 0;
        while (true) {
            j10 = 1048576;
            if (i11 >= 3) {
                break;
            }
            jZza += (raVarArr[i11].zza() + 1048575) / 1048576;
            i11++;
        }
        if (jZza >= 2097151) {
            throw new DigestException(defpackage.e.s(new StringBuilder(String.valueOf(jZza).length() + 17), "Too many chunks: ", jZza));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i12 = 0;
        while (true) {
            length = iArr.length;
            c4 = 5;
            if (i12 >= length) {
                break;
            }
            int i13 = (int) jZza;
            byte[] bArr2 = new byte[(J(iArr[i12]) * i13) + 5];
            bArr2[0] = 90;
            R(i13, bArr2);
            bArr[i12] = bArr2;
            i12++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            String strH = H(iArr[i14]);
            try {
                messageDigestArr[i14] = MessageDigest.getInstance(strH);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(strH.concat(" digest not supported"), e10);
            }
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (i10 = 3; i15 < i10; i10 = 3) {
            ra raVar = raVarArr[i15];
            int i18 = i15;
            long jZza2 = raVar.zza();
            long j11 = 0;
            while (jZza2 > 0) {
                char c5 = c4;
                int i19 = i16;
                int iMin = (int) Math.min(jZza2, j10);
                R(iMin, bArr3);
                for (int i20 = 0; i20 < length; i20++) {
                    messageDigestArr[i20].update(bArr3);
                }
                try {
                    raVar.b(messageDigestArr, j11, iMin);
                    int i21 = 0;
                    while (i21 < iArr.length) {
                        int i22 = iArr[i21];
                        byte[] bArr4 = bArr[i21];
                        int iJ = J(i22);
                        ra raVar2 = raVar;
                        MessageDigest messageDigest = messageDigestArr[i21];
                        long j12 = jZza2;
                        int iDigest = messageDigest.digest(bArr4, (i19 * iJ) + 5, iJ);
                        if (iDigest != iJ) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 35 + String.valueOf(iDigest).length());
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(iDigest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i21++;
                        raVar = raVar2;
                        jZza2 = j12;
                    }
                    ra raVar3 = raVar;
                    long j13 = iMin;
                    j11 += j13;
                    jZza2 -= j13;
                    i16 = i19 + 1;
                    c4 = c5;
                    raVar = raVar3;
                    j10 = 1048576;
                } catch (IOException e11) {
                    throw new DigestException(l1.d.j(new StringBuilder(String.valueOf(i19).length() + 37 + String.valueOf(i17).length()), i19, "Failed to digest chunk #", i17, " of section #"), e11);
                }
            }
            i17++;
            i15 = i18 + 1;
            j10 = 1048576;
        }
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i23 = 0; i23 < iArr.length; i23++) {
            int i24 = iArr[i23];
            byte[] bArr6 = bArr[i23];
            String strH2 = H(i24);
            try {
                bArr5[i23] = MessageDigest.getInstance(strH2).digest(bArr6);
            } catch (NoSuchAlgorithmException e12) {
                throw new RuntimeException(strH2.concat(" digest not supported"), e12);
            }
        }
        return bArr5;
    }

    public static int G(int i10) {
        if (i10 == 513) {
            return 1;
        }
        if (i10 == 514) {
            return 2;
        }
        if (i10 == 769) {
            return 1;
        }
        switch (i10) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
        }
    }

    public static String H(int i10) {
        if (i10 == 1) {
            return "SHA-256";
        }
        if (i10 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(l1.d.k(new StringBuilder(String.valueOf(i10).length() + 33), "Unknown content digest algorthm: ", i10));
    }

    public static void I(f81 f81Var, iw0 iw0Var, vh1 vh1Var) {
        ay0 ay0Var = (ay0) iw0Var.f15864b;
        ay0 ay0Var2 = (ay0) f81Var.f14317b;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) ay0Var2.f12537b;
        long[] jArr3 = (long[]) ay0Var.f12538c;
        long[] jArr4 = (long[]) ay0Var.f12537b;
        ps1.w(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) ay0Var2.f12538c;
        ps1.E(jArr5, jArr3, jArr4);
        ps1.S(jArr5, jArr5, vh1Var.f21177b);
        long[] jArr6 = vh1Var.f21176a;
        long[] jArr7 = (long[]) ay0Var2.f12539d;
        ps1.S(jArr7, jArr2, jArr6);
        long[] jArr8 = (long[]) f81Var.f14318c;
        ps1.S(jArr8, (long[]) iw0Var.f15865c, vh1Var.f21178c);
        vh1Var.a(jArr2, (long[]) ay0Var.f12539d);
        ps1.w(jArr, jArr2, jArr2);
        ps1.E(jArr2, jArr7, jArr5);
        ps1.w(jArr5, jArr7, jArr5);
        ps1.w(jArr7, jArr, jArr8);
        ps1.E(jArr8, jArr, jArr8);
    }

    public static int J(int i10) {
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(l1.d.k(new StringBuilder(String.valueOf(i10).length() + 33), "Unknown content digest algorthm: ", i10));
    }

    public static void K(f81 f81Var, iw0 iw0Var, vh1 vh1Var) {
        ay0 ay0Var = (ay0) iw0Var.f15864b;
        ay0 ay0Var2 = (ay0) f81Var.f14317b;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) ay0Var2.f12537b;
        long[] jArr3 = (long[]) ay0Var.f12538c;
        long[] jArr4 = (long[]) ay0Var.f12537b;
        ps1.w(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) ay0Var2.f12538c;
        ps1.E(jArr5, jArr3, jArr4);
        ps1.S(jArr5, jArr5, vh1Var.f21176a);
        long[] jArr6 = vh1Var.f21177b;
        long[] jArr7 = (long[]) ay0Var2.f12539d;
        ps1.S(jArr7, jArr2, jArr6);
        long[] jArr8 = (long[]) f81Var.f14318c;
        ps1.S(jArr8, (long[]) iw0Var.f15865c, vh1Var.f21178c);
        vh1Var.a(jArr2, (long[]) ay0Var.f12539d);
        ps1.w(jArr, jArr2, jArr2);
        ps1.E(jArr2, jArr7, jArr5);
        ps1.w(jArr5, jArr7, jArr5);
        ps1.E(jArr7, jArr, jArr8);
        ps1.w(jArr8, jArr, jArr8);
    }

    public static ByteBuffer L(int i10, ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (i11 < iPosition || i11 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i11);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i11);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static void M(ay0 ay0Var, f81 f81Var) {
        ay0 ay0Var2 = (ay0) f81Var.f14317b;
        long[] jArr = (long[]) ay0Var2.f12537b;
        long[] jArr2 = (long[]) ay0Var.f12537b;
        long[] jArr3 = new long[10];
        ps1.W(jArr, jArr2);
        long[] jArr4 = (long[]) ay0Var2.f12539d;
        long[] jArr5 = (long[]) ay0Var.f12538c;
        ps1.W(jArr4, jArr5);
        long[] jArr6 = (long[]) f81Var.f14318c;
        ps1.W(jArr6, (long[]) ay0Var.f12539d);
        ps1.w(jArr6, jArr6, jArr6);
        long[] jArr7 = (long[]) ay0Var2.f12538c;
        ps1.w(jArr7, jArr2, jArr5);
        ps1.W(jArr3, jArr7);
        ps1.w(jArr7, jArr4, jArr);
        ps1.E(jArr4, jArr4, jArr);
        ps1.E(jArr, jArr3, jArr7);
        ps1.E(jArr6, jArr6, jArr4);
    }

    public static int N(int i10, int i11) {
        int i12 = (~(i10 ^ i11)) & 255;
        int i13 = i12 & (i12 << 4);
        int i14 = i13 & (i13 << 2);
        return (i14 & (i14 + i14)) >> 7;
    }

    public static ByteBuffer O(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            int iRemaining = byteBuffer.remaining();
            throw new IOException(l1.d.k(new StringBuilder(String.valueOf(iRemaining).length() + 82), "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", iRemaining));
        }
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            return L(i10, byteBuffer);
        }
        int iRemaining2 = byteBuffer.remaining();
        throw new IOException(l1.d.j(new StringBuilder(String.valueOf(i10).length() + 79 + String.valueOf(iRemaining2).length()), i10, "Length-prefixed field longer than remaining buffer. Field length: ", iRemaining2, ", remaining: "));
    }

    public static void P(vh1 vh1Var, int i10, byte b10) {
        vh1[][] vh1VarArr = xh1.f21901d;
        int i11 = (b10 & 255) >> 7;
        int i12 = (-i11) & b10;
        int i13 = b10 - (i12 + i12);
        vh1Var.b(vh1VarArr[i10][0], N(i13, 1));
        vh1Var.b(vh1VarArr[i10][1], N(i13, 2));
        vh1Var.b(vh1VarArr[i10][2], N(i13, 3));
        vh1Var.b(vh1VarArr[i10][3], N(i13, 4));
        vh1Var.b(vh1VarArr[i10][4], N(i13, 5));
        vh1Var.b(vh1VarArr[i10][5], N(i13, 6));
        vh1Var.b(vh1VarArr[i10][6], N(i13, 7));
        vh1Var.b(vh1VarArr[i10][7], N(i13, 8));
        long[] jArr = vh1Var.f21178c;
        long[] jArr2 = vh1Var.f21176a;
        long[] jArr3 = vh1Var.f21177b;
        long[] jArrCopyOf = Arrays.copyOf(jArr3, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(jArr, 10);
        for (int i14 = 0; i14 < jArrCopyOf3.length; i14++) {
            jArrCopyOf3[i14] = -jArrCopyOf3[i14];
        }
        zw1.f(jArr2, jArrCopyOf, i11);
        zw1.f(jArr3, jArrCopyOf2, i11);
        zw1.f(jArr, jArrCopyOf3, i11);
    }

    public static byte[] Q(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IOException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i10];
            byteBuffer.get(bArr);
            return bArr;
        }
        int iRemaining = byteBuffer.remaining();
        throw new IOException(l1.d.j(new StringBuilder(String.valueOf(i10).length() + 68 + String.valueOf(iRemaining).length()), i10, "Underflow while reading length-prefixed value. Length: ", iRemaining, ", available: "));
    }

    public static void R(int i10, byte[] bArr) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >>> 8) & 255);
        bArr[3] = (byte) ((i10 >>> 16) & 255);
        bArr[4] = (byte) (i10 >> 24);
    }

    public static byte[] S(byte[] bArr) {
        int i10;
        byte[] bArr2 = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
        for (int i11 = 0; i11 < 256; i11++) {
            bArr2[i11] = (byte) (1 & ((bArr[i11 >> 3] & 255) >> (i11 & 7)));
        }
        for (int i12 = 0; i12 < 256; i12++) {
            if (bArr2[i12] != 0) {
                for (int i13 = 1; i13 <= 6 && (i10 = i12 + i13) < 256; i13++) {
                    byte b10 = bArr2[i10];
                    if (b10 != 0) {
                        byte b11 = bArr2[i12];
                        int i14 = b10 << i13;
                        int i15 = b11 + i14;
                        if (i15 > 15) {
                            int i16 = b11 - i14;
                            if (i16 < -15) {
                                break;
                            }
                            bArr2[i12] = (byte) i16;
                            while (i10 < 256) {
                                if (bArr2[i10] == 0) {
                                    bArr2[i10] = 1;
                                    break;
                                }
                                bArr2[i10] = 0;
                                i10++;
                            }
                        } else {
                            bArr2[i12] = (byte) i15;
                            bArr2[i10] = 0;
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static long T(int i10, byte[] bArr) {
        return (((long) (bArr[i10 + 2] & 255)) << 16) | (bArr[i10] & 255) | (((long) (bArr[i10 + 1] & 255)) << 8);
    }

    public static long U(int i10, byte[] bArr) {
        return (((long) (bArr[i10 + 3] & 255)) << 24) | T(i10, bArr);
    }

    public static int a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = i13 - 1;
        int i17 = f18668c[i14];
        if (i11 == 2) {
            i17 /= 2;
        } else if (i11 == 0) {
            i17 /= 4;
        }
        int i18 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f18669d[i16] : f18670e[i16]) * 12) / i17) + i18) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f18671f[i16] : f18672g[i16];
        } else {
            i15 = f18673h[i16];
        }
        if (i11 == 3) {
            return defpackage.e.D(i15, 144, i17, i18);
        }
        return defpackage.e.D(i12 == 1 ? 72 : 144, i15, i17, i18);
    }

    public static long b(long j10, long j11, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j12 = j10 / j11;
        long j13 = j10 - (j11 * j12);
        if (j13 == 0) {
            return j12;
        }
        int i10 = ((int) ((j10 ^ j11) >> 63)) | 1;
        switch (cc1.f13135a[roundingMode.ordinal()]) {
            case 1:
                ps1.D(false);
                return j12;
            case 2:
                return j12;
            case 3:
                if (i10 >= 0) {
                    return j12;
                }
                break;
            case 4:
                break;
            case 5:
                if (i10 <= 0) {
                    return j12;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j13);
                long jAbs2 = jAbs - (Math.abs(j11) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j12) == 0)) {
                        return j12;
                    }
                } else if (jAbs2 <= 0) {
                    return j12;
                }
            default:
                throw new AssertionError();
        }
        return j12 + ((long) i10);
    }

    public static zze c(Throwable th2) {
        if (th2 instanceof rm0) {
            rm0 rm0Var = (rm0) th2;
            return z(rm0Var.f13197a, rm0Var.f19620b);
        }
        if (th2 instanceof ck0) {
            return th2.getMessage() == null ? C(((ck0) th2).f13197a, null, null) : C(((ck0) th2).f13197a, th2.getMessage(), null);
        }
        if (!(th2 instanceof zzaz)) {
            return C(1, null, null);
        }
        zzaz zzazVar = (zzaz) th2;
        int iZza = zzazVar.zza();
        String message = zzazVar.getMessage();
        if (message == null) {
            message = "";
        }
        return new zze(iZza, message, MobileAds.ERROR_DOMAIN, null, null);
    }

    public static n8 d(n8 n8Var, String[] strArr, Map map) {
        int length;
        int i10 = 0;
        if (n8Var == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (n8) map.get(strArr[0]);
            }
            if (length2 > 1) {
                n8 n8Var2 = new n8();
                while (i10 < length2) {
                    n8Var2.c((n8) map.get(strArr[i10]));
                    i10++;
                }
                return n8Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                n8Var.c((n8) map.get(strArr[0]));
                return n8Var;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i10 < length) {
                    n8Var.c((n8) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return n8Var;
    }

    public static Object e(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException(l1.d.k(new StringBuilder(String.valueOf(i10).length() + 41), "must be power of 2 between 2^1 and 2^30: ", i10));
        }
        if (i10 <= 256) {
            return new byte[i10];
        }
        return i10 <= 65536 ? new short[i10] : new int[i10];
    }

    public static String f(View view) {
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
        if (view.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static void i(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(l1.d.k(new StringBuilder(String.valueOf(i10).length() + 4), "csd-", i10), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static void j(gm gmVar, em emVar, String... strArr) {
        if (emVar == null) {
            return;
        }
        ((p9.b) zzt.zzk()).getClass();
        gmVar.a(emVar, SystemClock.elapsedRealtime(), strArr);
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v5 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static boolean k(com.google.android.gms.internal.ads.np0 r27, com.google.android.gms.internal.ads.s2 r28, int r29, com.google.android.gms.internal.ads.q2 r30) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pi1.k(com.google.android.gms.internal.ads.np0, com.google.android.gms.internal.ads.s2, int, com.google.android.gms.internal.ads.q2):boolean");
    }

    public static boolean l(String str) {
        return str == null || str.isEmpty();
    }

    public static byte[] m(byte[] bArr) {
        int i10;
        byte[] bArr2 = new byte[64];
        int i11 = 0;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = i11 + i11;
            bArr2[i12] = (byte) (bArr[i11] & 15);
            bArr2[i12 + 1] = (byte) ((bArr[i11] & 255) >> 4);
            i11++;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < 63) {
            byte b10 = (byte) (bArr2[i13] + i14);
            bArr2[i13] = b10;
            int i15 = (b10 + 8) >> 4;
            bArr2[i13] = (byte) (b10 - (i15 << 4));
            i13++;
            i14 = i15;
        }
        bArr2[63] = (byte) (bArr2[63] + i14);
        f81 f81Var = new f81(1);
        iw0 iw0Var = new iw0(7);
        for (i10 = 1; i10 < 64; i10 += 2) {
            vh1 vh1Var = new vh1();
            P(vh1Var, i10 / 2, bArr2[i10]);
            iw0.k(iw0Var, f81Var);
            I(f81Var, iw0Var, vh1Var);
        }
        ay0 ay0Var = new ay0(6);
        ay0.d(ay0Var, f81Var);
        M(ay0Var, f81Var);
        ay0.d(ay0Var, f81Var);
        M(ay0Var, f81Var);
        ay0.d(ay0Var, f81Var);
        M(ay0Var, f81Var);
        ay0.d(ay0Var, f81Var);
        M(ay0Var, f81Var);
        for (int i16 = 0; i16 < 64; i16 += 2) {
            vh1 vh1Var2 = new vh1();
            P(vh1Var2, i16 / 2, bArr2[i16]);
            iw0.k(iw0Var, f81Var);
            I(f81Var, iw0Var, vh1Var2);
        }
        ay0 ay0Var2 = new ay0(f81Var);
        long[] jArr = new long[10];
        ps1.W(jArr, (long[]) ay0Var2.f12537b);
        long[] jArr2 = new long[10];
        ps1.W(jArr2, (long[]) ay0Var2.f12538c);
        long[] jArr3 = new long[10];
        ps1.W(jArr3, (long[]) ay0Var2.f12539d);
        long[] jArr4 = new long[10];
        ps1.W(jArr4, jArr3);
        long[] jArr5 = new long[10];
        ps1.E(jArr5, jArr2, jArr);
        ps1.S(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        ps1.S(jArr6, jArr, jArr2);
        ps1.S(jArr6, jArr6, xh1.f21898a);
        ps1.w(jArr6, jArr6, jArr4);
        ps1.K(jArr6, jArr6);
        if (MessageDigest.isEqual(ps1.b0(jArr5), ps1.b0(jArr6))) {
            return ay0Var2.g();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static X509Certificate[][] n(String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        Pair pairP;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile2.length() < 22) {
                pairP = null;
            } else {
                pairP = ps1.P(randomAccessFile2, 0);
                if (pairP == null) {
                    pairP = ps1.P(randomAccessFile2, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                }
            }
            try {
                if (pairP == null) {
                    long length = randomAccessFile2.length();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 82);
                    sb2.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                    sb2.append(length);
                    sb2.append(" bytes");
                    throw new ta(sb2.toString());
                }
                ByteBuffer byteBuffer = (ByteBuffer) pairP.first;
                long jLongValue = ((Long) pairP.second).longValue();
                long j10 = (-20) + jLongValue;
                if (j10 >= 0) {
                    randomAccessFile2.seek(j10);
                    if (randomAccessFile2.readInt() == 1347094023) {
                        throw new ta("ZIP64 APK not supported");
                    }
                }
                ps1.U(byteBuffer);
                long j11 = ((long) byteBuffer.getInt(byteBuffer.position() + 16)) & 4294967295L;
                if (j11 >= jLongValue) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(j11).length() + 82 + String.valueOf(jLongValue).length());
                    sb3.append("ZIP Central Directory offset out of range: ");
                    sb3.append(j11);
                    sb3.append(". ZIP End of Central Directory offset: ");
                    sb3.append(jLongValue);
                    throw new ta(sb3.toString());
                }
                ps1.U(byteBuffer);
                if ((((long) byteBuffer.getInt(byteBuffer.position() + 12)) & 4294967295L) + j11 != jLongValue) {
                    throw new ta("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (j11 < 32) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j11).length() + 67);
                    sb4.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb4.append(j11);
                    throw new ta(sb4.toString());
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                randomAccessFile2.seek(j11 - ((long) byteBufferAllocate.capacity()));
                randomAccessFile2.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                    throw new ta("No APK Signing Block before ZIP Central Directory");
                }
                long j12 = byteBufferAllocate.getLong(0);
                if (j12 < byteBufferAllocate.capacity() || j12 > 2147483639) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j12).length() + 37);
                    sb5.append("APK Signing Block size out of range: ");
                    sb5.append(j12);
                    throw new ta(sb5.toString());
                }
                int i10 = (int) (8 + j12);
                long j13 = j11 - ((long) i10);
                if (j13 < 0) {
                    StringBuilder sb6 = new StringBuilder(String.valueOf(j13).length() + 39);
                    sb6.append("APK Signing Block offset out of range: ");
                    sb6.append(j13);
                    throw new ta(sb6.toString());
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i10);
                byteBufferAllocate2.order(byteOrder);
                randomAccessFile2.seek(j13);
                long j14 = j11;
                randomAccessFile2.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                long j15 = byteBufferAllocate2.getLong(0);
                if (j15 != j12) {
                    StringBuilder sb7 = new StringBuilder(String.valueOf(j15).length() + 63 + String.valueOf(j12).length());
                    sb7.append("APK Signing Block sizes in header and footer do not match: ");
                    sb7.append(j15);
                    sb7.append(" vs ");
                    sb7.append(j12);
                    throw new ta(sb7.toString());
                }
                Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j13));
                ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
                long jLongValue2 = ((Long) pairCreate.second).longValue();
                if (byteBuffer2.order() != byteOrder) {
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                int iCapacity = byteBuffer2.capacity() - 24;
                randomAccessFile = randomAccessFile2;
                if (iCapacity < 8) {
                    StringBuilder sb8 = new StringBuilder(String.valueOf(iCapacity).length() + 17);
                    sb8.append("end < start: ");
                    sb8.append(iCapacity);
                    sb8.append(" < 8");
                    throw new IllegalArgumentException(sb8.toString());
                }
                int iCapacity2 = byteBuffer2.capacity();
                if (iCapacity > byteBuffer2.capacity()) {
                    StringBuilder sb9 = new StringBuilder(String.valueOf(iCapacity).length() + 19 + String.valueOf(iCapacity2).length());
                    sb9.append("end > capacity: ");
                    sb9.append(iCapacity);
                    sb9.append(" > ");
                    sb9.append(iCapacity2);
                    throw new IllegalArgumentException(sb9.toString());
                }
                int iLimit = byteBuffer2.limit();
                int iPosition = byteBuffer2.position();
                try {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iCapacity);
                    byteBuffer2.position(8);
                    ByteBuffer byteBufferSlice = byteBuffer2.slice();
                    byteBufferSlice.order(byteBuffer2.order());
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    int i11 = 0;
                    while (byteBufferSlice.hasRemaining()) {
                        i11++;
                        if (byteBufferSlice.remaining() < 8) {
                            StringBuilder sb10 = new StringBuilder(String.valueOf(i11).length() + 59);
                            sb10.append("Insufficient data to read size of APK Signing Block entry #");
                            sb10.append(i11);
                            throw new ta(sb10.toString());
                        }
                        long j16 = byteBufferSlice.getLong();
                        if (j16 < 4 || j16 > 2147483647L) {
                            StringBuilder sb11 = new StringBuilder(String.valueOf(i11).length() + 45 + String.valueOf(j16).length());
                            sb11.append("APK Signing Block entry #");
                            sb11.append(i11);
                            sb11.append(" size out of range: ");
                            sb11.append(j16);
                            throw new ta(sb11.toString());
                        }
                        int i12 = (int) j16;
                        int iPosition2 = byteBufferSlice.position() + i12;
                        if (i12 > byteBufferSlice.remaining()) {
                            int iRemaining = byteBufferSlice.remaining();
                            StringBuilder sb12 = new StringBuilder(String.valueOf(i11).length() + 45 + String.valueOf(i12).length() + 13 + String.valueOf(iRemaining).length());
                            sb12.append("APK Signing Block entry #");
                            sb12.append(i11);
                            sb12.append(" size out of range: ");
                            sb12.append(i12);
                            sb12.append(", available: ");
                            sb12.append(iRemaining);
                            throw new ta(sb12.toString());
                        }
                        if (byteBufferSlice.getInt() == 1896449818) {
                            X509Certificate[][] x509CertificateArrW = w(randomAccessFile.getChannel(), new sa(L(i12 - 4, byteBufferSlice), jLongValue2, j14, jLongValue, byteBuffer));
                            randomAccessFile.close();
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            return x509CertificateArrW;
                        }
                        long j17 = j14;
                        byteBufferSlice.position(iPosition2);
                        j14 = j17;
                    }
                    throw new ta("No APK Signature Scheme v2 block in APK Signing Block");
                } catch (Throwable th2) {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = randomAccessFile2;
        }
    }

    public static int o(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int p(int i10, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i10] : ((int[]) obj)[i10];
    }

    public static long q(long j10, long j11) {
        ps1.t(j10, "a");
        ps1.t(j11, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
        if (j10 == 0) {
            return j11;
        }
        if (j11 == 0) {
            return j10;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
        long jNumberOfTrailingZeros = j10 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j11);
        long j12 = j11 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j12) {
            long j13 = jNumberOfTrailingZeros - j12;
            long j14 = (j13 >> 63) & j13;
            long j15 = (j13 - j14) - j14;
            jNumberOfTrailingZeros = j15 >> Long.numberOfTrailingZeros(j15);
            j12 += j14;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static zze r(Throwable th2, sm0 sm0Var) {
        zze zzeVar;
        zze zzeVarC = c(th2);
        int i10 = zzeVarC.zza;
        if ((i10 == 3 || i10 == 0) && (zzeVar = zzeVarC.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zzeVarC.zzd = null;
        }
        if (sm0Var != null) {
            zzeVarC.zze = new aa0(sm0Var.f20004e, "", sm0Var, sm0Var.f20003d, sm0Var.f20002c);
        }
        return zzeVarC;
    }

    public static HashMap s(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
        } catch (IOException | ClassNotFoundException unused) {
            Log.d("pi1", "decode object failure");
            return null;
        }
    }

    public static void t(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static boolean u(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static byte[] v(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) qq1.f19166e.f19169a.zza("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        int i10 = bArrDigest[31] & 127;
        bArrDigest[31] = (byte) i10;
        bArrDigest[31] = (byte) (i10 | 64);
        return bArrDigest;
    }

    public static X509Certificate[][] w(FileChannel fileChannel, sa saVar) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            try {
                ByteBuffer byteBufferO = O((ByteBuffer) saVar.f19925d);
                int i10 = 0;
                while (byteBufferO.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(B(O(byteBufferO), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e10) {
                        throw new SecurityException(com.applovin.impl.ca.m(new StringBuilder(String.valueOf(i10).length() + 37), "Failed to parse/verify signer #", i10, " block"), e10);
                    }
                }
                if (i10 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j10 = saVar.f19922a;
                long j11 = saVar.f19923b;
                long j12 = saVar.f19924c;
                ByteBuffer byteBuffer = (ByteBuffer) saVar.f19926e;
                if (map.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                a7.l lVar = new a7.l(fileChannel, 0L, j10);
                a7.l lVar2 = new a7.l(fileChannel, j11, j12 - j11);
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                ps1.U(byteBufferDuplicate);
                int iPosition = byteBufferDuplicate.position() + 16;
                if (j10 < 0 || j10 > 4294967295L) {
                    throw new IllegalArgumentException(defpackage.e.s(new StringBuilder(String.valueOf(j10).length() + 27), "uint32 value of out range: ", j10));
                }
                byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j10);
                x11 x11Var = new x11(byteBufferDuplicate);
                int size = map.size();
                int[] iArr = new int[size];
                Iterator it = map.keySet().iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    iArr[i11] = ((Integer) it.next()).intValue();
                    i11++;
                }
                try {
                    byte[][] bArrF = F(iArr, new ra[]{lVar, lVar2, x11Var});
                    for (int i12 = 0; i12 < size; i12++) {
                        int i13 = iArr[i12];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i13)), bArrF[i12])) {
                            throw new SecurityException(H(i13).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e11) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e11);
                }
            } catch (IOException e12) {
                throw new SecurityException("Failed to read list of signers", e12);
            }
        } catch (CertificateException e13) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e13);
        }
    }

    public static int x(int i10, np0 np0Var) {
        switch (i10) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return np0Var.K() + 1;
            case 7:
                return np0Var.L() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return NotificationCompat.FLAG_LOCAL_ONLY << (i10 - 8);
            default:
                return -1;
        }
    }

    public static long y(long j10, long j11) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10);
        if (iNumberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        long j12 = j10 ^ j11;
        long j13 = (j12 >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j11 == Long.MIN_VALUE) & (j10 < 0)))) {
            long j14 = j10 * j11;
            if (j10 == 0 || j14 / j10 == j11) {
                return j14;
            }
        }
        return j13;
    }

    public static zze z(int i10, zze zzeVar) {
        if (i10 == 0) {
            throw null;
        }
        if (i10 == 8) {
            if (((Integer) zzba.zzc().a(am.G9)).intValue() > 0) {
                return zzeVar;
            }
            i10 = 8;
        }
        return C(i10, null, zzeVar);
    }

    public abstract HashMap g();

    public String toString() {
        switch (this.f18691a) {
            case 19:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(g());
                    objectOutputStream.close();
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                } catch (IOException unused) {
                    return null;
                }
            default:
                return super.toString();
        }
    }
}
