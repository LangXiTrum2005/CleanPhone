package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f81 implements ok1, li0, ag0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f14318c;

    public /* synthetic */ f81(int i10, Object obj, Object obj2) {
        this.f14316a = i10;
        this.f14317b = obj;
        this.f14318c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.ok1
    public byte[] a(int i10, byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        switch (this.f14316a) {
            case 4:
                if (i10 > 16) {
                    throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
                }
                Provider provider = (Provider) this.f14318c;
                SecretKeySpec secretKeySpec = (SecretKeySpec) this.f14317b;
                Mac mac = Mac.getInstance("AESCMAC", provider);
                mac.init(secretKeySpec);
                byte[] bArrDoFinal = mac.doFinal(bArr);
                return i10 == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i10);
            default:
                return bArr.length <= 64 ? ((pk1) this.f14317b).a(i10, bArr) : ((f81) this.f14318c).a(i10, bArr);
        }
    }

    public void b(ej1 ej1Var) throws GeneralSecurityException {
        if (ej1Var == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        gj1 gj1Var = new gj1(ej1Var.f13996a, ej1Var.f13997b);
        HashMap map = (HashMap) this.f14317b;
        if (!map.containsKey(gj1Var)) {
            map.put(gj1Var, ej1Var);
            return;
        }
        ej1 ej1Var2 = (ej1) map.get(gj1Var);
        if (!ej1Var2.equals(ej1Var) || !ej1Var.equals(ej1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(gj1Var.toString()));
        }
    }

    public void c(kx1 kx1Var) {
        ((List) this.f14317b).add(kx1Var);
    }

    public void d(kx1 kx1Var) {
        ((List) this.f14318c).add(kx1Var);
    }

    public lx1 e() {
        return new lx1((List) this.f14317b, (List) this.f14318c);
    }

    @Override // com.google.android.gms.internal.ads.li0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo161zza(Object obj) {
        switch (this.f14316a) {
            case 9:
                ((a02) obj).j((zz1) this.f14317b, (o32) this.f14318c);
                break;
            default:
                ((v32) obj).d(0, (r32) ((iw0) this.f14317b).f15864b, (o32) this.f14318c);
                break;
        }
    }

    public /* synthetic */ f81(int i10, boolean z10) {
        this.f14316a = i10;
    }

    public f81(CopyOnWriteArrayList copyOnWriteArrayList, r32 r32Var) {
        this.f14316a = 11;
        this.f14318c = copyOnWriteArrayList;
        this.f14317b = r32Var;
    }

    public f81(int i10, int i11) {
        List arrayList;
        Object arrayList2;
        this.f14316a = 6;
        if (i10 == 0) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(i10);
        }
        this.f14317b = arrayList;
        if (i11 == 0) {
            arrayList2 = Collections.EMPTY_LIST;
        } else {
            arrayList2 = new ArrayList(i11);
        }
        this.f14318c = arrayList2;
    }

    public /* synthetic */ f81(MediaCodec.CryptoInfo cryptoInfo) {
        this.f14316a = 7;
        this.f14317b = cryptoInfo;
        this.f14318c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public f81(byte[] bArr, Provider provider) throws GeneralSecurityException {
        this.f14316a = 4;
        if (jc1.e(1)) {
            this.f14317b = new SecretKeySpec(bArr, "AES");
            this.f14318c = provider;
            return;
        }
        throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
    }

    public f81(int i10) {
        this.f14316a = i10;
        switch (i10) {
            case 3:
                this.f14317b = new HashMap();
                this.f14318c = new HashMap();
                break;
            default:
                f81 f81Var = pi1.O;
                this.f14317b = new ay0((ay0) f81Var.f14317b);
                this.f14318c = Arrays.copyOf((long[]) f81Var.f14318c, 10);
                break;
        }
    }

    public /* synthetic */ f81(hj1 hj1Var) {
        this.f14316a = 3;
        this.f14317b = new HashMap(hj1Var.f15314a);
        this.f14318c = new HashMap(hj1Var.f15315b);
    }
}
