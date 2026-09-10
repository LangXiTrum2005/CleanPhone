package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaus {
    public int zza = 1;
    private Object zzb;
    private long zzc;
    private double zzd;
    private zzatw zze;
    private List zzf;
    private zzauk zzg;

    private zzaus() {
    }

    public static zzaus zza(Object obj) {
        zzaus zzausVar = new zzaus();
        int[] iArr = {572660336, 1963204074, 810270723, 1168973800, 12304897, -1027511958, 1433925857, 2084420925, 1937477084};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        zzausVar.zzr();
        zzausVar.zza = Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8) ^ (i9 % 1937477084);
        zzausVar.zzb = obj;
        return zzausVar;
    }

    public static zzaus zzb(long j) {
        zzaus zzausVar = new zzaus();
        int[] iArr = {269455306, 1628467785, 508432336, 1769894153, 149815616, -1737813993, 468055906, 524872353, 327254586};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        zzausVar.zzr();
        zzausVar.zza = Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8) ^ (i9 % 327254586);
        zzausVar.zzc = j;
        return zzausVar;
    }

    public static zzaus zzc(double d) {
        zzaus zzausVar = new zzaus();
        int[] iArr = {76065818, 1629326670, 912768099, 1092092300, 784816880, -1349977414, 434065736, 1884661237, 1605908235};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        zzausVar.zzr();
        zzausVar.zza = Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8) ^ (i9 % 1605908235);
        zzausVar.zzd = d;
        return zzausVar;
    }

    public static zzaus zzd(zzatw zzatwVar) {
        zzaus zzausVar = new zzaus();
        int[] iArr = {1143408282, 544368152, 1884037077, 79323401, 1472762119, -801477845, 201305624, 1470503465, 1402586708};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        zzausVar.zzr();
        zzausVar.zza = Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8) ^ (i9 % 1402586708);
        zzausVar.zze = zzatwVar;
        return zzausVar;
    }

    public static zzaus zze(List list) {
        zzaus zzausVar = new zzaus();
        int[] iArr = {231602422, 370241669, 619070592, 319896591, 694865338, 1425770340, 39950860, 555996658, 324763920};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        zzausVar.zzr();
        zzausVar.zza = Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8) ^ (i9 % 324763920);
        zzausVar.zzf = list;
        return zzausVar;
    }

    public static zzaus zzf(zzauk zzaukVar) {
        zzaus zzausVar = new zzaus();
        int[] iArr = {1315209188, 67133601, 1612794668, 612376713, 2023183116, -774012042, 5007439, 661761152, 474613996};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        zzausVar.zzr();
        zzausVar.zza = Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8) ^ (i9 % 474613996);
        zzausVar.zzg = zzaukVar;
        return zzausVar;
    }

    public static zzaus zzg(Object obj) {
        if (obj instanceof Long) {
            return zzb(((Long) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return zzb(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Integer) {
            return zzb(((Integer) obj).intValue());
        }
        if (obj instanceof Double) {
            return zzc(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return zzc(((Float) obj).floatValue());
        }
        if (obj instanceof Short) {
            return zzb(((Short) obj).shortValue());
        }
        if (obj instanceof Byte) {
            return zzb(((Byte) obj).byteValue());
        }
        if (obj instanceof zzatw) {
            return zzd((zzatw) obj);
        }
        if (obj instanceof String) {
            return zzd(zzatw.zzf((String) obj));
        }
        if (!(obj instanceof ArrayList)) {
            return zza(obj);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(zzg(arrayList2.get(i2)));
        }
        return zze(arrayList);
    }

    public static zzaus zzj(zzaus zzausVar) {
        int[] iArr = {1154349542, 1365661854, 772762753, -35647458, -1399059520, 905919471, 65677639, 1759726503, 552812661};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int iC = Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
        int i10 = i9 % 552812661;
        try {
            int i11 = zzausVar.zza;
            int i12 = (i10 ^ iC) + i11;
            if (i11 == 0) {
                throw null;
            }
            switch (i12) {
                case 0:
                    return new zzaus();
                case 1:
                    return zza(zzausVar.zzl());
                case 2:
                    return zzb(zzausVar.zzm());
                case 3:
                    return zzd(zzausVar.zzn());
                case 4:
                    ArrayList arrayList = new ArrayList();
                    Iterator it = zzausVar.zzo().iterator();
                    while (it.hasNext()) {
                        arrayList.add(zzj((zzaus) it.next()));
                    }
                    return zze(arrayList);
                case 5:
                    return zzf(zzausVar.zzp());
                case 6:
                    return zzc(zzausVar.zzq());
                default:
                    throw new AssertionError(zzatu.zza("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
            }
        } catch (zzaup e2) {
            throw new AssertionError(zzatu.zza("CEiv6BFfPnitUE+D"), e2);
        }
    }

    private final void zzr() {
        this.zza = 1;
        this.zzc = 0L;
        this.zzb = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
    }

    private final void zzs(int i2) throws zzaup {
        if (i2 != this.zza) {
            throw new zzaup();
        }
    }

    public final Object zzh() throws zzaup {
        int[] iArr = {172154289, 1050326876, 843682288, -858640882, -228026365, 881347074, 13857144, 514820752, 473891334};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int iC = Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
        int i10 = this.zza;
        int i11 = ((i9 % 473891334) ^ iC) + i10;
        if (i10 == 0) {
            throw null;
        }
        switch (i11) {
            case 0:
            case 5:
                throw new zzaup();
            case 1:
                return zzl();
            case 2:
                return Long.valueOf(zzm());
            case 3:
                return zzn().zza();
            case 4:
                ArrayList arrayList = new ArrayList();
                Iterator it = zzo().iterator();
                while (it.hasNext()) {
                    arrayList.add(((zzaus) it.next()).zzh());
                }
                return arrayList;
            case 6:
                return Double.valueOf(zzq());
            default:
                throw new AssertionError(zzatu.zza("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0252, code lost:
    
        if (r19.equals(java.lang.Object.class) != false) goto L150;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzi(java.lang.Class r19) throws com.google.android.gms.internal.ads.zzaup {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaus.zzi(java.lang.Class):java.lang.Object");
    }

    public final void zzk(OutputStream outputStream) throws IOException, zzaup {
        long[] jArr = {1269833163, 1628598594, 308676977, 1629286434, 15633520, 3337700125L, 1402923307, 613197917, 297598514};
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = (((((~j) & j2) | j3) + ((j & j4) | j5)) - j6) + j7;
        long j10 = j8 % 297598514;
        int i2 = ((((~136416008) & 1315652152) | 568681609) + ((136416008 & 1310591536) | 838183178)) - (-1654427070);
        int i3 = 1414460396 % 78756298;
        int i4 = ((((~1202640845) & 472047875) | 1135942642) + ((1202640845 & 1006822481) | 585369424)) - 1952913860;
        int i5 = 1225708428 % 987359759;
        int i6 = this.zza;
        int i7 = ((((((~1959970879) & 1489831444) | 1998984087) + ((1959970879 & (-1446423480)) | (-182037905))) - (-2117037800)) ^ (1544048623 % 665228399)) + i6;
        if (i6 == 0) {
            throw null;
        }
        switch (i7) {
            case 0:
            case 1:
            case 5:
                throw new zzaup();
            case 2:
                zzats.zzb(zzm(), new zzaur(outputStream, 1), true);
                return;
            case 3:
                byte[] bArr = zzn().zza;
                zzats.zzb(((long) bArr.length) * (j9 ^ j10), new zzaur(outputStream, 0), true);
                outputStream.write(bArr);
                return;
            case 4:
                List listZzo = zzo();
                zzats.zzb(listZzo.size(), new zzaur(outputStream, i4 ^ i5), true);
                Iterator it = listZzo.iterator();
                while (it.hasNext()) {
                    ((zzaus) it.next()).zzk(outputStream);
                }
                return;
            case 6:
                double dZzq = zzq();
                zzaur zzaurVar = new zzaur(outputStream, i2 ^ i3);
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(dZzq);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate((((((~1470558289) & 1721781326) | 2037102441) + ((1470558289 & 109139991) | 560281113)) - (-1975232131)) ^ (1043353969 % 656635246));
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate.putLong(jDoubleToRawLongBits);
                for (byte b2 : byteBufferAllocate.array()) {
                    zzaurVar.zza(b2);
                }
                int length = byteBufferAllocate.array().length;
                return;
            default:
                return;
        }
    }

    public final Object zzl() throws zzaup {
        int[] iArr = {427355115, 404248040, 1318670750, 874677346, 1819730563, -970011213, 126401947, 1858504292, 235745791};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        zzs(Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, iArr[5], iArr[6]) ^ (iArr[7] % 235745791));
        return this.zzb;
    }

    public final long zzm() throws zzaup {
        int[] iArr = {1646478179, 763209928, 1529626135, 609321208, 1403807536, -1382063087, 25624641, 1388803074, 733327814};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        zzs(Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, iArr[5], iArr[6]) ^ (iArr[7] % 733327814));
        return this.zzc;
    }

    public final zzatw zzn() throws zzaup {
        int[] iArr = {2059344234, 1917530355, 739411611, 1399403104, 95815174, 2094390031, 51245830, 1312994984, 1140384172};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        zzs(Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, iArr[5], iArr[6]) ^ (iArr[7] % 1140384172));
        return this.zze;
    }

    public final List zzo() throws zzaup {
        int[] iArr = {1435218189, 1093276829, 949583962, 1092752517, 575966040, -2054938211, 262178224, 1891252715, 1250801052};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        zzs(Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, iArr[5], iArr[6]) ^ (iArr[7] % 1250801052));
        return this.zzf;
    }

    public final zzauk zzp() throws zzaup {
        int[] iArr = {672139932, 1821026951, 1629321417, 214090246, 828986457, -1439766056, 580508860, 1579068977, 395191309};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        zzs(Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, iArr[5], iArr[6]) ^ (iArr[7] % 395191309));
        return this.zzg;
    }

    public final double zzq() throws zzaup {
        int[] iArr = {1714636915, 1758565445, 174653454, 1653642817, 38095532, -1976041400, 596516649, 1804289383, 846930886};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        zzs(Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, iArr[5], iArr[6]) ^ (iArr[7] % 846930886));
        return this.zzd;
    }
}
