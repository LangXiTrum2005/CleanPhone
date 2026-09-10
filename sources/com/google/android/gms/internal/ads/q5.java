package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q5 implements e6, jk1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f18929d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f18930e = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f18931f = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f18934c;

    public q5(int i10) {
        switch (i10) {
            case 5:
                this.f18934c = new iw0(10);
                this.f18932a = 8000;
                this.f18933b = 8000;
                break;
            default:
                this.f18934c = new byte[8];
                break;
        }
    }

    public static final void d(ByteBuffer byteBuffer, long j10, int i10, int i11, boolean z10) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z10 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        byteBuffer.put(jc1.a(i11));
    }

    public static long e(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f18929d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public String a(ArrayList arrayList, ArrayList arrayList2) {
        boolean z10;
        int i10 = this.f18932a;
        Collections.sort(arrayList2, new b(16));
        HashSet hashSet = new HashSet();
        loop0: for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            String[] strArrSplit = Normalizer.normalize((CharSequence) arrayList.get(((mi) arrayList2.get(i11)).f17451e), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (strArrSplit.length != 0) {
                for (int i12 = 0; i12 < strArrSplit.length; i12++) {
                    String str = strArrSplit[i12];
                    if (str.contains("'")) {
                        StringBuilder sb2 = new StringBuilder(str);
                        int i13 = 1;
                        boolean z11 = false;
                        while (true) {
                            int i14 = i13 + 2;
                            if (i14 > sb2.length()) {
                                break;
                            }
                            if (sb2.charAt(i13) == '\'') {
                                char c4 = ' ';
                                if (sb2.charAt(i13 - 1) != ' ') {
                                    int i15 = i13 + 1;
                                    if (sb2.charAt(i15) == 's' || sb2.charAt(i15) == 'S') {
                                        if (i14 != sb2.length()) {
                                            c4 = ' ';
                                            if (sb2.charAt(i14) == ' ') {
                                            }
                                        } else {
                                            c4 = ' ';
                                        }
                                        sb2.insert(i13, c4);
                                        i13 = i14;
                                    } else {
                                        c4 = ' ';
                                    }
                                    sb2.setCharAt(i13, c4);
                                } else {
                                    sb2.setCharAt(i13, c4);
                                }
                                z11 = true;
                            }
                            i13++;
                        }
                        z10 = true;
                        String string = z11 ? sb2.toString() : null;
                        if (string != null) {
                            str = string;
                        }
                    } else {
                        z10 = true;
                    }
                    String[] strArrG = ps1.G(str, z10);
                    int length = strArrG.length;
                    int i16 = this.f18933b;
                    if (length >= i16) {
                        for (int i17 = 0; i17 < strArrG.length; i17++) {
                            String strConcat = "";
                            for (int i18 = 0; i18 < i16; i18++) {
                                int i19 = i17 + i18;
                                if (i19 >= strArrG.length) {
                                    break;
                                }
                                if (i18 > 0) {
                                    strConcat = strConcat.concat(" ");
                                }
                                strConcat = strConcat.concat(String.valueOf(strArrG[i19]));
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= i10) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= i10) {
                            break loop0;
                        }
                    }
                }
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((qi) this.f18934c).X0((String) it.next()));
            } catch (IOException e10) {
                int i20 = zze.zza;
                zzo.zzg("Error while writing hash to byteStream", e10);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e11) {
            int i21 = zze.zza;
            zzo.zzg("HashManager: Unable to convert to Base64.", e11);
        }
        try {
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toString();
        } catch (IOException e12) {
            int i22 = zze.zza;
            zzo.zzg("HashManager: Unable to convert to Base64.", e12);
            return "";
        }
    }

    public void b(tx1 tx1Var, List list) {
        int length;
        ByteBuffer byteBuffer;
        int i10;
        ByteBuffer byteBuffer2 = tx1Var.f20523e;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - tx1Var.f20523e.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f18932a == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = tx1Var.f20523e;
        int iPosition = byteBuffer3.position();
        int iLimit = byteBuffer3.limit();
        int i11 = iLimit - iPosition;
        int i12 = (i11 + 255) / 255;
        int i13 = i12 + 27 + i11;
        if (this.f18932a == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i13 += length + 44;
        } else {
            length = 0;
        }
        if (((ByteBuffer) this.f18934c).capacity() < i13) {
            this.f18934c = ByteBuffer.allocate(i13).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            ((ByteBuffer) this.f18934c).clear();
        }
        ByteBuffer byteBuffer4 = (ByteBuffer) this.f18934c;
        if (this.f18932a == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i10 = 22;
                d(byteBuffer, 0L, 0, 1, true);
                int length2 = bArr.length;
                byteBuffer.put(jc1.a(length2));
                byteBuffer.put(bArr);
                int i14 = length2 + 28;
                byteBuffer.putInt(22, uu0.h(byteBuffer.arrayOffset(), i14, 0, byteBuffer.array()));
                byteBuffer.position(i14);
            } else {
                byteBuffer = byteBuffer4;
                i10 = 22;
                byteBuffer.put(f18930e);
            }
            byteBuffer.put(f18931f);
        } else {
            byteBuffer = byteBuffer4;
            i10 = 22;
        }
        int iD = this.f18933b + ((int) ((x10.D(byteBuffer3.get(0), byteBuffer3.limit() > 1 ? byteBuffer3.get(1) : (byte) 0) * 48000) / 1000000));
        this.f18933b = iD;
        int i15 = i10;
        ByteBuffer byteBuffer5 = byteBuffer;
        d(byteBuffer5, iD, this.f18932a, i12, false);
        for (int i16 = 0; i16 < i12; i16++) {
            if (i11 >= 255) {
                byteBuffer5.put((byte) -1);
                i11 -= 255;
            } else {
                byteBuffer5.put((byte) i11);
                i11 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer5.put(byteBuffer3.get(iPosition));
            iPosition++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.f18932a == 2) {
            byteBuffer5.putInt(length + 66, uu0.h(byteBuffer5.arrayOffset() + length + 44, byteBuffer5.limit() - byteBuffer5.position(), 0, byteBuffer5.array()));
        } else {
            byteBuffer5.putInt(i15, uu0.h(byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0, byteBuffer5.array()));
        }
        this.f18932a++;
        this.f18934c = byteBuffer5;
        tx1Var.g();
        tx1Var.h(((ByteBuffer) this.f18934c).remaining());
        tx1Var.f20523e.put((ByteBuffer) this.f18934c);
        tx1Var.j();
    }

    public long c(n2 n2Var, boolean z10, boolean z11, int i10) {
        int i11;
        byte[] bArr = (byte[]) this.f18934c;
        if (this.f18932a == 0) {
            if (!n2Var.x(bArr, 0, 1, z10)) {
                return -1L;
            }
            int i12 = bArr[0] & 255;
            int i13 = 0;
            while (true) {
                if (i13 >= 8) {
                    i11 = -1;
                    break;
                }
                i11 = i13 + 1;
                if ((f18929d[i13] & ((long) i12)) != 0) {
                    break;
                }
                i13 = i11;
            }
            this.f18933b = i11;
            if (i11 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f18932a = 1;
        }
        int i14 = this.f18933b;
        if (i14 > i10) {
            this.f18932a = 0;
            return -2L;
        }
        if (i14 != 1) {
            n2Var.p(bArr, 1, i14 - 1);
        }
        this.f18932a = 0;
        return e(bArr, this.f18933b, z11);
    }

    @Override // com.google.android.gms.internal.ads.e6
    public int zza() {
        return this.f18933b;
    }

    @Override // com.google.android.gms.internal.ads.e6
    public int zzb() {
        return this.f18932a;
    }

    @Override // com.google.android.gms.internal.ads.e6
    public int zzc() {
        int i10 = this.f18932a;
        return i10 == -1 ? ((np0) this.f18934c).h() : i10;
    }

    @Override // com.google.android.gms.internal.ads.jk1, com.google.android.gms.internal.ads.hm0
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public wk1 mo166zza() {
        return new jr1(null, this.f18932a, this.f18933b, false, (iw0) this.f18934c);
    }
}
