package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgzw implements zzhaj {
    private static final Charset zza = Charset.forName("UTF-8");
    private final InputStream zzb;

    private zzgzw(InputStream inputStream) {
        this.zzb = inputStream;
    }

    public static zzgzw zza(String str) {
        return new zzgzw(new ByteArrayInputStream(str.getBytes(zza)));
    }

    private static int zzc(zzhxj zzhxjVar) throws IOException {
        if (!(zzhxjVar instanceof zzhxn)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!zzhxjVar.zzg().zzc()) {
            throw new IOException("invalid key id: not a JSON number");
        }
        try {
            long jZzc = zzhhy.zzc(zzhxjVar.zzg().zzh());
            if (jZzc > 4294967295L || jZzc < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) jZzc;
        } catch (NumberFormatException e2) {
            throw new IOException(e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x014f  */
    @Override // com.google.android.gms.internal.ads.zzhaj
    public final zzhpj zzb() throws IOException {
        byte b2;
        int i2;
        byte b3;
        zzhpw zzhpwVar;
        byte b4;
        zzhoz zzhozVar;
        String str = "status";
        String str2 = "keyData";
        try {
            try {
                InputStream inputStream = this.zzb;
                int i3 = zzhau.zza;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i4 = inputStream.read(bArr);
                    InputStream inputStream2 = inputStream;
                    if (i4 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i4);
                    inputStream = inputStream2;
                }
                zzhxl zzhxlVarZze = zzhhy.zzb(new String(byteArrayOutputStream.toByteArray(), zza)).zze();
                if (!zzhxlVarZze.zzc("key")) {
                    throw new zzhxm("invalid keyset: no key");
                }
                zzhxj zzhxjVarZzh = zzhxlVarZze.zzh("key");
                if (!(zzhxjVarZzh instanceof zzhxi)) {
                    throw new zzhxm("invalid keyset: key must be an array");
                }
                zzhxi zzhxiVarZzf = zzhxjVarZzh.zzf();
                if (zzhxiVarZzf.zzb() == 0) {
                    throw new zzhxm("invalid keyset: key is empty");
                }
                zzhpg zzhpgVarZzh = zzhpj.zzh();
                if (zzhxlVarZze.zzc("primaryKeyId")) {
                    zzhpgVarZzh.zza(zzc(zzhxlVarZze.zzh("primaryKeyId")));
                }
                int i5 = 0;
                while (i5 < zzhxiVarZzf.zzb()) {
                    zzhxl zzhxlVarZze2 = zzhxiVarZzf.zzc(i5).zze();
                    if (!zzhxlVarZze2.zzc(str2) || !zzhxlVarZze2.zzc(str) || !zzhxlVarZze2.zzc("keyId") || !zzhxlVarZze2.zzc("outputPrefixType")) {
                        throw new zzhxm("invalid key");
                    }
                    zzhxj zzhxjVarZzh2 = zzhxlVarZze2.zzh(str2);
                    if (!(zzhxjVarZzh2 instanceof zzhxl)) {
                        throw new zzhxm("invalid key: keyData must be an object");
                    }
                    zzhph zzhphVarZze = zzhpi.zze();
                    String strZzd = zzhxlVarZze2.zzh(str).zzd();
                    String str3 = str;
                    int iHashCode = strZzd.hashCode();
                    String str4 = str2;
                    int i6 = i5;
                    if (iHashCode != -891611359) {
                        if (iHashCode != 478389753) {
                            if (iHashCode == 1053567612 && strZzd.equals("DISABLED")) {
                                b2 = 1;
                            } else {
                                b2 = -1;
                            }
                        } else if (strZzd.equals("DESTROYED")) {
                            b2 = 2;
                        } else {
                            b2 = -1;
                        }
                    } else if (strZzd.equals("ENABLED")) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                    if (b2 == 0) {
                        i2 = 3;
                    } else if (b2 == 1) {
                        i2 = 4;
                    } else {
                        if (b2 != 2) {
                            throw new zzhxm("unknown status: ".concat(strZzd));
                        }
                        i2 = 5;
                    }
                    zzhphVarZze.zze(i2);
                    zzhphVarZze.zzc(zzc(zzhxlVarZze2.zzh("keyId")));
                    String strZzd2 = zzhxlVarZze2.zzh("outputPrefixType").zzd();
                    switch (strZzd2) {
                        case "LEGACY":
                            b3 = 2;
                            break;
                        case "RAW":
                            b3 = 1;
                            break;
                        case "TINK":
                            b3 = 0;
                            break;
                        case "CRUNCHY":
                            b3 = 3;
                            break;
                        default:
                            b3 = -1;
                            break;
                    }
                    if (b3 == 0) {
                        zzhpwVar = zzhpw.TINK;
                    } else if (b3 == 1) {
                        zzhpwVar = zzhpw.RAW;
                    } else if (b3 == 2) {
                        zzhpwVar = zzhpw.LEGACY;
                    } else {
                        if (b3 != 3) {
                            throw new zzhxm("unknown output prefix type: ".concat(strZzd2));
                        }
                        zzhpwVar = zzhpw.CRUNCHY;
                    }
                    zzhphVarZze.zzd(zzhpwVar);
                    zzhxl zzhxlVarZze3 = zzhxjVarZzh2.zze();
                    if (!zzhxlVarZze3.zzc("typeUrl") || !zzhxlVarZze3.zzc("value") || !zzhxlVarZze3.zzc("keyMaterialType")) {
                        throw new zzhxm("invalid keyData");
                    }
                    byte[] bArrZza = zzhvo.zza(zzhxlVarZze3.zzh("value").zzd(), 2);
                    zzhoy zzhoyVarZzd = zzhpa.zzd();
                    zzhoyVarZzd.zza(zzhxlVarZze3.zzh("typeUrl").zzd());
                    zzhzl zzhzlVar = zzhzl.zzb;
                    zzhoyVarZzd.zzb(zzhzl.zzs(bArrZza, 0, bArrZza.length));
                    String strZzd3 = zzhxlVarZze3.zzh("keyMaterialType").zzd();
                    switch (strZzd3) {
                        case "REMOTE":
                            b4 = 3;
                            break;
                        case "SYMMETRIC":
                            b4 = 0;
                            break;
                        case "ASYMMETRIC_PRIVATE":
                            b4 = 1;
                            break;
                        case "ASYMMETRIC_PUBLIC":
                            b4 = 2;
                            break;
                        default:
                            b4 = -1;
                            break;
                    }
                    if (b4 == 0) {
                        zzhozVar = zzhoz.SYMMETRIC;
                    } else if (b4 == 1) {
                        zzhozVar = zzhoz.ASYMMETRIC_PRIVATE;
                    } else if (b4 == 2) {
                        zzhozVar = zzhoz.ASYMMETRIC_PUBLIC;
                    } else {
                        if (b4 != 3) {
                            throw new zzhxm("unknown key material type: ".concat(strZzd3));
                        }
                        zzhozVar = zzhoz.REMOTE;
                    }
                    zzhoyVarZzd.zzc(zzhozVar);
                    zzhphVarZze.zza((zzhpa) zzhoyVarZzd.zzbu());
                    zzhpgVarZzh.zzb((zzhpi) zzhphVarZze.zzbu());
                    i5 = i6 + 1;
                    str = str3;
                    str2 = str4;
                }
                zzhpj zzhpjVar = (zzhpj) zzhpgVarZzh.zzbu();
                this.zzb.close();
                return zzhpjVar;
            } catch (zzhxm e2) {
                e = e2;
                throw new IOException(e);
            } catch (IllegalStateException e3) {
                e = e3;
                throw new IOException(e);
            }
        } catch (Throwable th) {
            this.zzb.close();
            throw th;
        }
    }
}
