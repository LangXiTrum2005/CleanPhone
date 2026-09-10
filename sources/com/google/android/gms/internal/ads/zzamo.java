package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.applovin.impl.Z;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class zzamo implements zzaly {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;
    private final zzamn zzc;
    private final zzer zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzamo() {
        this(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void zzb(zzer zzerVar, Charset charset) {
        while (true) {
            String strZzN = zzerVar.zzN(charset);
            if (strZzN == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strZzN)) {
                while (true) {
                    String strZzN2 = zzerVar.zzN(charset);
                    if (strZzN2 == null || (zzerVar.zzd() != 0 && zzerVar.zzp(charset) == 91)) {
                        break;
                    }
                    String[] strArrSplit = strZzN2.split(":");
                    if (strArrSplit.length == 2) {
                        byte b2 = 0;
                        String strZza = zzgpj.zza(strArrSplit[0].trim());
                        switch (strZza.hashCode()) {
                            case 1879649548:
                                if (!strZza.equals("playresx")) {
                                    b2 = -1;
                                }
                                break;
                            case 1879649549:
                                if (!strZza.equals("playresy")) {
                                    b2 = -1;
                                } else {
                                    b2 = 1;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        if (b2 == 0) {
                            this.zzf = Float.parseFloat(strArrSplit[1].trim());
                        } else if (b2 == 1) {
                            try {
                                this.zzg = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strZzN)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                zzamp zzampVarZza = null;
                while (true) {
                    String strZzN3 = zzerVar.zzN(charset);
                    if (strZzN3 != null && (zzerVar.zzd() == 0 || zzerVar.zzp(charset) != 91)) {
                        if (strZzN3.startsWith("Format:")) {
                            zzampVarZza = zzamp.zza(strZzN3);
                        } else if (strZzN3.startsWith("Style:")) {
                            if (zzampVarZza == null) {
                                zzee.zzc("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strZzN3));
                            } else {
                                zzamr zzamrVarZza = zzamr.zza(strZzN3, zzampVarZza);
                                if (zzamrVarZza != null) {
                                    linkedHashMap.put(zzamrVarZza.zza, zzamrVarZza);
                                }
                            }
                        }
                    }
                }
                this.zze = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strZzN)) {
                zzee.zzb("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strZzN)) {
                return;
            }
        }
    }

    private static long zzc(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = zzfj.zza;
        long j = Long.parseLong(strGroup) * 3600000000L;
        long j2 = Long.parseLong(matcher.group(2)) * 60000000;
        return j + j2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    private static float zzd(int i2) {
        if (i2 == 0) {
            return 0.05f;
        }
        if (i2 != 1) {
            return i2 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zze(long j, List list, List list2) {
        int i2;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i2 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i2 = size + 1;
                break;
            }
        }
        list.add(i2, Long.valueOf(j));
        list2.add(i2, i2 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i2 - 1)));
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(byte[] bArr, int i2, int i3, zzalx zzalxVar, zzdr zzdrVar) {
        zzamn zzamnVarZza;
        zzamn zzamnVar;
        int i4;
        Layout.Alignment alignment;
        int i5;
        int i6;
        int i7;
        Integer num;
        int i8;
        zzamo zzamoVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        zzer zzerVar = zzamoVar.zzd;
        zzerVar.zzb(bArr, i2 + i3);
        zzerVar.zzh(i2);
        Charset charsetZzR = zzerVar.zzR();
        if (charsetZzR == null) {
            charsetZzR = StandardCharsets.UTF_8;
        }
        if (zzamoVar.zzb) {
            zzamnVarZza = zzamoVar.zzc;
        } else {
            zzamoVar.zzb(zzerVar, charsetZzR);
            zzamnVarZza = null;
        }
        while (true) {
            String strZzN = zzerVar.zzN(charsetZzR);
            if (strZzN == null) {
                int i9 = 0;
                while (i9 < arrayList.size()) {
                    List list = (List) arrayList.get(i9);
                    if (!list.isEmpty()) {
                        if (i9 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i9)).longValue();
                        zzdrVar.zza(new zzalq(list, jLongValue, ((Long) arrayList2.get(i9 + 1)).longValue() - jLongValue));
                    } else if (i9 == 0) {
                        i9 = 0;
                        if (i9 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue2 = ((Long) arrayList2.get(i9)).longValue();
                        zzdrVar.zza(new zzalq(list, jLongValue2, ((Long) arrayList2.get(i9 + 1)).longValue() - jLongValue2));
                    }
                    i9++;
                }
                return;
            }
            if (strZzN.startsWith("Format:")) {
                zzamnVarZza = zzamn.zza(strZzN);
            } else {
                if (strZzN.startsWith("Dialogue:")) {
                    if (zzamnVarZza == null) {
                        zzee.zzc("SsaParser", "Skipping dialogue line before complete format: ".concat(strZzN));
                    } else {
                        zzgqa.zza(strZzN.startsWith("Dialogue:"));
                        String strSubstring = strZzN.substring(9);
                        int i10 = zzamnVarZza.zzf;
                        String[] strArrSplit = strSubstring.split(",", i10);
                        if (strArrSplit.length != i10) {
                            zzee.zzc("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strZzN));
                        } else {
                            int i11 = zzamnVarZza.zza;
                            if (i11 != -1) {
                                try {
                                    i4 = Integer.parseInt(strArrSplit[i11].trim());
                                } catch (RuntimeException unused) {
                                    Z.D(strArrSplit[zzamnVarZza.zza], "Fail to parse layer: ", "SsaParser");
                                    i4 = 0;
                                }
                            } else {
                                i4 = 0;
                            }
                            long jZzc = zzc(strArrSplit[zzamnVarZza.zzb]);
                            if (jZzc == -9223372036854775807L) {
                                zzee.zzc("SsaParser", "Skipping invalid timing: ".concat(strZzN));
                            } else {
                                long jZzc2 = zzc(strArrSplit[zzamnVarZza.zzc]);
                                if (jZzc2 == -9223372036854775807L || jZzc2 <= jZzc) {
                                    zzamnVar = zzamnVarZza;
                                    zzerVar = zzerVar;
                                    zzee.zzc("SsaParser", "Skipping invalid timing: ".concat(strZzN));
                                } else {
                                    Map map = zzamoVar.zze;
                                    zzamr zzamrVar = (map == null || (i8 = zzamnVarZza.zzd) == -1) ? null : (zzamr) map.get(strArrSplit[i8].trim());
                                    String str = strArrSplit[zzamnVarZza.zze];
                                    zzamq zzamqVarZza = zzamq.zza(str);
                                    String strReplace = zzamq.zzb(str).replace("\\N", IOUtils.LINE_SEPARATOR_UNIX).replace("\\n", IOUtils.LINE_SEPARATOR_UNIX).replace("\\h", " ");
                                    float f = zzamoVar.zzf;
                                    float f2 = zzamoVar.zzg;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    zzcw zzcwVar = new zzcw();
                                    zzcwVar.zza(spannableString);
                                    zzcwVar.zzq(i4);
                                    if (zzamrVar != null) {
                                        Integer num2 = zzamrVar.zzc;
                                        zzamnVar = zzamnVarZza;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (zzamrVar.zzj == 3 && (num = zzamrVar.zzd) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f3 = zzamrVar.zze;
                                        if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                                            zzcwVar.zzl(f3 / f2, 1);
                                        }
                                        if (!zzamrVar.zzf) {
                                            i6 = 33;
                                            i7 = 0;
                                            if (zzamrVar.zzg) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        } else if (zzamrVar.zzg) {
                                            i6 = 33;
                                            i7 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i6 = 33;
                                            i7 = 0;
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        }
                                        if (zzamrVar.zzh) {
                                            spannableString.setSpan(new UnderlineSpan(), i7, spannableString.length(), i6);
                                        }
                                        if (zzamrVar.zzi) {
                                            spannableString.setSpan(new StrikethroughSpan(), i7, spannableString.length(), i6);
                                        }
                                    } else {
                                        zzamnVar = zzamnVarZza;
                                        zzerVar = zzerVar;
                                        f = f;
                                    }
                                    int i12 = zzamqVarZza.zza;
                                    if (i12 == -1) {
                                        i12 = zzamrVar != null ? zzamrVar.zzb : -1;
                                    }
                                    switch (i12) {
                                        case 0:
                                        default:
                                            StringBuilder sb = new StringBuilder(Z.a(i12, 19));
                                            sb.append("Unknown alignment: ");
                                            sb.append(i12);
                                            zzee.zzc("SsaParser", sb.toString());
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    zzcwVar.zzd(alignment);
                                    int i13 = Integer.MIN_VALUE;
                                    switch (i12) {
                                        case 0:
                                        default:
                                            StringBuilder sb2 = new StringBuilder(Z.a(i12, 19));
                                            sb2.append("Unknown alignment: ");
                                            sb2.append(i12);
                                            zzee.zzc("SsaParser", sb2.toString());
                                        case -1:
                                            i5 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i5 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i5 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i5 = 2;
                                            break;
                                    }
                                    zzcwVar.zzj(i5);
                                    switch (i12) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            StringBuilder sb3 = new StringBuilder(Z.a(i12, 19));
                                            sb3.append("Unknown alignment: ");
                                            sb3.append(i12);
                                            zzee.zzc("SsaParser", sb3.toString());
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i13 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i13 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i13 = 0;
                                            break;
                                    }
                                    zzcwVar.zzg(i13);
                                    PointF pointF = zzamqVarZza.zzb;
                                    if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
                                        zzcwVar.zzi(zzd(zzcwVar.zzk()));
                                        zzcwVar.zzf(zzd(zzcwVar.zzh()), 0);
                                    } else {
                                        zzcwVar.zzi(pointF.x / f);
                                        zzcwVar.zzf(pointF.y / f2, 0);
                                    }
                                    zzcx zzcxVarZzr = zzcwVar.zzr();
                                    int iZze = zze(jZzc2, arrayList2, arrayList);
                                    for (int iZze2 = zze(jZzc, arrayList2, arrayList); iZze2 < iZze; iZze2++) {
                                        ((List) arrayList.get(iZze2)).add(zzcxVarZzr);
                                    }
                                }
                            }
                        }
                    }
                    zzamnVar = zzamnVarZza;
                    zzerVar = zzerVar;
                } else {
                    zzamnVar = zzamnVarZza;
                    zzerVar = zzerVar;
                }
                zzamoVar = this;
                charsetZzR = charsetZzR;
                zzamnVarZza = zzamnVar;
                zzerVar = zzerVar;
            }
        }
    }

    public zzamo(List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzer();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String strZzi = zzfj.zzi((byte[]) list.get(0));
        zzgqa.zza(strZzi.startsWith("Format:"));
        zzamn zzamnVarZza = zzamn.zza(strZzi);
        zzamnVarZza.getClass();
        this.zzc = zzamnVarZza;
        zzb(new zzer((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }
}
