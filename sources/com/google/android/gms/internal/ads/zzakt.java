package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
final class zzakt {
    private static final zzgqp zza = zzgqp.zza(zzgpo.zzc(AbstractJsonLexerKt.COLON));
    private static final zzgqp zzb = zzgqp.zza(zzgpo.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zza() {
        this.zzc.clear();
        this.zzd = 0;
    }

    public final int zzb(zzaep zzaepVar, zzafo zzafoVar, List list) throws IOException {
        byte b2;
        char c2;
        int i2 = this.zzd;
        if (i2 == 0) {
            long jZzo = zzaepVar.zzo();
            zzafoVar.zza = (jZzo == -1 || jZzo < 8) ? 0L : jZzo - 8;
            this.zzd = 1;
            return 1;
        }
        int i3 = 2;
        if (i2 != 1) {
            short s = 2817;
            short s2 = 2816;
            short s3 = 2192;
            if (i2 != 2) {
                long jZzn = zzaepVar.zzn();
                int iZzo = (int) ((zzaepVar.zzo() - zzaepVar.zzn()) - ((long) this.zze));
                zzer zzerVar = new zzer(iZzo);
                zzaepVar.zzc(zzerVar.zzi(), 0, iZzo);
                int i4 = 0;
                while (true) {
                    List list2 = this.zzc;
                    if (i4 >= list2.size()) {
                        zzafoVar.zza = 0L;
                        return 1;
                    }
                    zzaks zzaksVar = (zzaks) list2.get(i4);
                    zzerVar.zzh((int) (zzaksVar.zza - jZzn));
                    zzerVar.zzk(4);
                    int iZzC = zzerVar.zzC();
                    Charset charset = StandardCharsets.UTF_8;
                    switch (zzerVar.zzK(iZzC, charset)) {
                        case "SlowMotion_Data":
                            b2 = 0;
                            break;
                        case "Super_SlowMotion_Edit_Data":
                            b2 = 3;
                            break;
                        case "Super_SlowMotion_Data":
                            b2 = 1;
                            break;
                        case "Super_SlowMotion_Deflickering_On":
                            b2 = 4;
                            break;
                        case "Super_SlowMotion_BGM":
                            b2 = 2;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 == 0) {
                        c2 = 2192;
                    } else if (b2 == 1) {
                        c2 = 2816;
                    } else if (b2 == 2) {
                        c2 = 2817;
                    } else if (b2 == 3) {
                        c2 = 2819;
                    } else {
                        if (b2 != 4) {
                            throw zzat.zzb("Invalid SEF name", null);
                        }
                        c2 = 2820;
                    }
                    int i5 = zzaksVar.zzb - (iZzC + 8);
                    if (c2 == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List listZze = zzb.zze(zzerVar.zzK(i5, charset));
                        for (int i6 = 0; i6 < listZze.size(); i6++) {
                            List listZze2 = zza.zze((CharSequence) listZze.get(i6));
                            if (listZze2.size() != 3) {
                                throw zzat.zzb(null, null);
                            }
                            try {
                                arrayList.add(new zzaio(Long.parseLong((String) listZze2.get(0)), Long.parseLong((String) listZze2.get(1)), 1 << (Integer.parseInt((String) listZze2.get(2)) - 1)));
                            } catch (NumberFormatException e2) {
                                throw zzat.zzb(null, e2);
                            }
                        }
                        list.add(new zzaip(arrayList));
                    } else if (c2 != 2816 && c2 != 2817 && c2 != 2819 && c2 != 2820) {
                        throw new IllegalStateException();
                    }
                    i4++;
                }
            } else {
                long jZzo2 = zzaepVar.zzo();
                int i7 = this.zze - 20;
                zzer zzerVar2 = new zzer(i7);
                zzaepVar.zzc(zzerVar2.zzi(), 0, i7);
                int i8 = 0;
                while (i8 < i7 / 12) {
                    zzerVar2.zzk(i3);
                    short sZzw = zzerVar2.zzw();
                    if (sZzw == s3 || sZzw == s2 || sZzw == s || sZzw == 2819 || sZzw == 2820) {
                        this.zzc.add(new zzaks(sZzw, (jZzo2 - ((long) this.zze)) - ((long) zzerVar2.zzC()), zzerVar2.zzC()));
                    } else {
                        zzerVar2.zzk(8);
                    }
                    i8++;
                    i7 = i7;
                    i3 = 2;
                    s = 2817;
                    s2 = 2816;
                    s3 = 2192;
                }
                List list3 = this.zzc;
                if (list3.isEmpty()) {
                    zzafoVar.zza = 0L;
                } else {
                    this.zzd = 3;
                    zzafoVar.zza = ((zzaks) list3.get(0)).zza;
                }
            }
        } else {
            zzer zzerVar3 = new zzer(8);
            zzaepVar.zzc(zzerVar3.zzi(), 0, 8);
            this.zze = zzerVar3.zzC() + 8;
            if (zzerVar3.zzB() != 1397048916) {
                zzafoVar.zza = 0L;
            } else {
                zzafoVar.zza = zzaepVar.zzn() - ((long) (this.zze - 12));
                this.zzd = 2;
            }
        }
        return 1;
    }
}
