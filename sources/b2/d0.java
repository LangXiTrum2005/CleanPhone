package b2;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import com.google.android.gms.internal.ads.a02;
import com.google.android.gms.internal.ads.aa1;
import com.google.android.gms.internal.ads.ab0;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.ca1;
import com.google.android.gms.internal.ads.ea0;
import com.google.android.gms.internal.ads.h3;
import com.google.android.gms.internal.ads.h90;
import com.google.android.gms.internal.ads.ib0;
import com.google.android.gms.internal.ads.l80;
import com.google.android.gms.internal.ads.li0;
import com.google.android.gms.internal.ads.m7;
import com.google.android.gms.internal.ads.np0;
import com.google.android.gms.internal.ads.p90;
import com.google.android.gms.internal.ads.ps1;
import com.google.android.gms.internal.ads.r7;
import com.google.android.gms.internal.ads.zz1;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements ag0, li0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5247d;

    public /* synthetic */ d0(int i10) {
        this.f5244a = i10;
    }

    public static byte[] b(byte b10, DataInputStream dataInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {b10, dataInputStream.readByte()};
        byteArrayOutputStream.write(bArr);
        while (true) {
            if (bArr[0] == 13 && bArr[1] == 10) {
                return byteArrayOutputStream.toByteArray();
            }
            bArr[0] = bArr[1];
            byte b11 = dataInputStream.readByte();
            bArr[1] = b11;
            byteArrayOutputStream.write(b11);
        }
    }

    public oa.j0 a(byte[] bArr) throws i1.e0 {
        long j10;
        ArrayList arrayList = (ArrayList) this.f5247d;
        go.k.i(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
        String str = new String(bArr, 0, bArr.length - 2, g0.f5278g);
        arrayList.add(str);
        int i10 = this.f5246c;
        if (i10 == 1) {
            if (!j0.f5303a.matcher(str).matches() && !j0.f5304b.matcher(str).matches()) {
                return null;
            }
            this.f5246c = 2;
            return null;
        }
        if (i10 != 2) {
            throw new IllegalStateException();
        }
        try {
            Matcher matcher = j0.f5305c.matcher(str);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                j10 = Long.parseLong(strGroup);
            } else {
                j10 = -1;
            }
            if (j10 != -1) {
                this.f5245b = j10;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.f5245b > 0) {
                this.f5246c = 3;
                return null;
            }
            oa.j0 j0VarX = oa.j0.x(arrayList);
            arrayList.clear();
            this.f5246c = 1;
            this.f5245b = 0L;
            return j0VarX;
        } catch (NumberFormatException e10) {
            throw i1.e0.b(str, e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x013b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ag0, com.google.android.gms.internal.ads.li0
    /* JADX INFO: renamed from: zza */
    public void mo161zza(Object obj) {
        long j10;
        int i10;
        long j11;
        aa1 aa1Var;
        int i11;
        switch (this.f5244a) {
            case 1:
                r7 r7Var = (r7) this.f5247d;
                long j12 = this.f5245b;
                int i12 = this.f5246c;
                m7 m7Var = (m7) obj;
                r7Var.f19449h.getClass();
                ca1 ca1Var = m7Var.f17315a;
                long j13 = m7Var.f17317c;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(ca1Var.size());
                int i13 = 0;
                aa1 aa1VarListIterator = ca1Var.listIterator(0);
                while (aa1VarListIterator.hasNext()) {
                    l80 l80Var = (l80) aa1VarListIterator.next();
                    l80Var.getClass();
                    Bundle bundle = new Bundle();
                    CharSequence charSequence = l80Var.f16797a;
                    if (charSequence != null) {
                        bundle.putCharSequence(l80.f16787q, charSequence);
                        if (charSequence instanceof Spanned) {
                            Spanned spanned = (Spanned) charSequence;
                            String str = h90.f15224a;
                            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                            ea0[] ea0VarArr = (ea0[]) spanned.getSpans(i13, spanned.length(), ea0.class);
                            int length = ea0VarArr.length;
                            while (i13 < length) {
                                int i14 = i12;
                                ea0 ea0Var = ea0VarArr[i13];
                                ea0Var.getClass();
                                long j14 = j12;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(ea0.f13914c, ea0Var.f13916a);
                                bundle2.putInt(ea0.f13915d, ea0Var.f13917b);
                                arrayList2.add(h90.a(spanned, ea0Var, 1, bundle2));
                                i13++;
                                i12 = i14;
                                j12 = j14;
                                aa1VarListIterator = aa1VarListIterator;
                            }
                            i10 = i12;
                            j11 = j12;
                            aa1Var = aa1VarListIterator;
                            for (ab0 ab0Var : (ab0[]) spanned.getSpans(0, spanned.length(), ab0.class)) {
                                ab0Var.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putInt(ab0.f11968d, ab0Var.f11971a);
                                bundle3.putInt(ab0.f11969e, ab0Var.f11972b);
                                bundle3.putInt(ab0.f11970f, ab0Var.f11973c);
                                arrayList2.add(h90.a(spanned, ab0Var, 2, bundle3));
                            }
                            for (p90 p90Var : (p90[]) spanned.getSpans(0, spanned.length(), p90.class)) {
                                arrayList2.add(h90.a(spanned, p90Var, 3, null));
                            }
                            for (ib0 ib0Var : (ib0[]) spanned.getSpans(0, spanned.length(), ib0.class)) {
                                ib0Var.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putString(ib0.f15705b, ib0Var.f15706a);
                                arrayList2.add(h90.a(spanned, ib0Var, 4, bundle4));
                            }
                            if (!arrayList2.isEmpty()) {
                                bundle.putParcelableArrayList(l80.f16788r, arrayList2);
                            }
                        } else {
                            i10 = i12;
                            j11 = j12;
                            aa1Var = aa1VarListIterator;
                        }
                    } else {
                        i10 = i12;
                        j11 = j12;
                        aa1Var = aa1VarListIterator;
                    }
                    bundle.putSerializable(l80.f16789s, l80Var.f16798b);
                    bundle.putSerializable(l80.f16790t, l80Var.f16799c);
                    bundle.putFloat(l80.f16792v, l80Var.f16801e);
                    bundle.putInt(l80.f16793w, l80Var.f16802f);
                    bundle.putInt(l80.f16794x, l80Var.f16803g);
                    bundle.putFloat(l80.f16795y, l80Var.f16804h);
                    bundle.putInt(l80.f16796z, l80Var.f16805i);
                    bundle.putInt(l80.A, l80Var.l);
                    bundle.putFloat(l80.B, l80Var.f16808m);
                    bundle.putFloat(l80.C, l80Var.f16806j);
                    bundle.putFloat(l80.D, l80Var.f16807k);
                    bundle.putBoolean(l80.F, false);
                    bundle.putInt(l80.E, -16777216);
                    bundle.putInt(l80.G, l80Var.f16809n);
                    bundle.putFloat(l80.H, l80Var.f16810o);
                    bundle.putInt(l80.I, l80Var.f16811p);
                    Bitmap bitmap = l80Var.f16800d;
                    if (bitmap != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        i11 = 0;
                        ps1.c0(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                        bundle.putByteArray(l80.f16791u, byteArrayOutputStream.toByteArray());
                    } else {
                        i11 = 0;
                    }
                    arrayList.add(bundle);
                    i13 = i11;
                    i12 = i10;
                    j12 = j11;
                    aa1VarListIterator = aa1Var;
                }
                int i15 = i12;
                long j15 = j12;
                int i16 = i13;
                Bundle bundle5 = new Bundle();
                bundle5.putParcelableArrayList("c", arrayList);
                bundle5.putLong(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, j13);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeBundle(bundle5);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                np0 np0Var = r7Var.f19444c;
                int length2 = bArrMarshall.length;
                np0Var.z(length2, bArrMarshall);
                h3 h3Var = r7Var.f19442a;
                h3Var.b(length2, np0Var);
                long j16 = m7Var.f17316b;
                if (j16 == C.TIME_UNSET) {
                    ps1.c0(r7Var.f19449h.f14683t == Long.MAX_VALUE ? 1 : i16);
                    j10 = j15;
                } else {
                    long j17 = r7Var.f19449h.f14683t;
                    j10 = j17 == Long.MAX_VALUE ? j15 + j16 : j16 + j17;
                }
                h3Var.c(j10, i15 | 1, length2, 0, null);
                break;
            default:
                ((a02) obj).c((zz1) this.f5247d, this.f5246c, this.f5245b);
                break;
        }
    }

    public /* synthetic */ d0(r7 r7Var, long j10, int i10) {
        this.f5244a = 1;
        this.f5247d = r7Var;
        this.f5245b = j10;
        this.f5246c = i10;
    }

    public /* synthetic */ d0(zz1 zz1Var, int i10, long j10, long j11) {
        this.f5244a = 2;
        this.f5247d = zz1Var;
        this.f5246c = i10;
        this.f5245b = j10;
    }

    public d0() {
        this.f5244a = 0;
        this.f5247d = new ArrayList();
        this.f5246c = 1;
    }

    public d0(int i10, URL url, long j10) {
        this.f5244a = 6;
        this.f5246c = i10;
        this.f5247d = url;
        this.f5245b = j10;
    }

    public d0(int i10, long j10) {
        this.f5244a = 7;
        this.f5246c = i10;
        this.f5245b = j10;
    }
}
