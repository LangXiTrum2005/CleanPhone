package com.google.android.gms.internal.ads;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzail extends zzaig {
    public final String zza;
    public final zzgtd zzb;

    public zzail(String str, String str2, List list) {
        super(str);
        zzgqa.zza(!list.isEmpty());
        this.zza = str2;
        zzgtd zzgtdVarZzq = zzgtd.zzq(list);
        this.zzb = zzgtdVarZzq;
    }

    private static List zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzail.class == obj.getClass()) {
            zzail zzailVar = (zzail) obj;
            if (Objects.equals(this.zzf, zzailVar.zzf) && Objects.equals(this.zza, zzailVar.zza) && this.zzb.equals(zzailVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.zza;
        return this.zzb.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzaig
    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 14 + String.valueOf(str2).length() + 9 + strValueOf.length());
        androidx.media3.extractor.text.ttml.a.C(sb, str, ": description=", str2, ": values=");
        sb.append(strValueOf);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        byte b2;
        switch (this.zzf) {
            case "TAL":
                b2 = 6;
                break;
            case "TCM":
                b2 = 16;
                break;
            case "TDA":
                b2 = 12;
                break;
            case "TP1":
                b2 = 2;
                break;
            case "TP2":
                b2 = 4;
                break;
            case "TP3":
                b2 = 18;
                break;
            case "TRK":
                b2 = 8;
                break;
            case "TT2":
                b2 = 0;
                break;
            case "TXT":
                b2 = 20;
                break;
            case "TYE":
                b2 = 10;
                break;
            case "TALB":
                b2 = 7;
                break;
            case "TCOM":
                b2 = 17;
                break;
            case "TCON":
                b2 = 22;
                break;
            case "TDAT":
                b2 = 13;
                break;
            case "TDRC":
                b2 = 14;
                break;
            case "TDRL":
                b2 = 15;
                break;
            case "TEXT":
                b2 = 21;
                break;
            case "TIT2":
                b2 = 1;
                break;
            case "TPE1":
                b2 = 3;
                break;
            case "TPE2":
                b2 = 5;
                break;
            case "TPE3":
                b2 = 19;
                break;
            case "TRCK":
                b2 = 9;
                break;
            case "TYER":
                b2 = 11;
                break;
            default:
                b2 = -1;
                break;
        }
        try {
            switch (b2) {
                case 0:
                case 1:
                    zzamVar.zza((CharSequence) this.zzb.get(0));
                    break;
                case 2:
                case 3:
                    zzamVar.zzb((CharSequence) this.zzb.get(0));
                    break;
                case 4:
                case 5:
                    zzamVar.zzd((CharSequence) this.zzb.get(0));
                    break;
                case 6:
                case 7:
                    zzamVar.zzc((CharSequence) this.zzb.get(0));
                    break;
                case 8:
                case 9:
                    String str = (String) this.zzb.get(0);
                    String str2 = zzfj.zza;
                    String[] strArrSplit = str.split("/", -1);
                    int i2 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    zzamVar.zzg(Integer.valueOf(i2));
                    zzamVar.zzh(numValueOf);
                    break;
                case 10:
                case 11:
                    zzamVar.zzi(Integer.valueOf(Integer.parseInt((String) this.zzb.get(0))));
                    break;
                case 12:
                case 13:
                    String str3 = (String) this.zzb.get(0);
                    int i3 = Integer.parseInt(str3.substring(2, 4));
                    int i4 = Integer.parseInt(str3.substring(0, 2));
                    zzamVar.zzj(Integer.valueOf(i3));
                    zzamVar.zzk(Integer.valueOf(i4));
                    break;
                case 14:
                    List listZzb = zzb((String) this.zzb.get(0));
                    int size = listZzb.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                zzamVar.zzk((Integer) listZzb.get(2));
                            }
                        }
                        zzamVar.zzj((Integer) listZzb.get(1));
                    }
                    zzamVar.zzi((Integer) listZzb.get(0));
                    break;
                case 15:
                    List listZzb2 = zzb((String) this.zzb.get(0));
                    int size2 = listZzb2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                zzamVar.zzn((Integer) listZzb2.get(2));
                            }
                        }
                        zzamVar.zzm((Integer) listZzb2.get(1));
                    }
                    zzamVar.zzl((Integer) listZzb2.get(0));
                    break;
                case 16:
                case 17:
                    zzamVar.zzp((CharSequence) this.zzb.get(0));
                    break;
                case 18:
                case 19:
                    zzamVar.zzq((CharSequence) this.zzb.get(0));
                    break;
                case 20:
                case 21:
                    zzamVar.zzo((CharSequence) this.zzb.get(0));
                    break;
                case 22:
                    zzgtd zzgtdVar = this.zzb;
                    Integer numZzh = zzgwx.zzh((String) zzgtdVar.get(0), 10);
                    if (numZzh != null) {
                        String strZza = zzaih.zza(numZzh.intValue());
                        if (strZza != null) {
                            zzamVar.zzt(strZza);
                        }
                    } else {
                        zzamVar.zzt((CharSequence) zzgtdVar.get(0));
                    }
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}
