package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
final class zzamv {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final zzanb zzf;
    public final String zzg;
    public final String zzh;
    public final zzamv zzi;
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private zzamv(String str, String str2, long j, long j2, zzanb zzanbVar, String[] strArr, String str3, String str4, zzamv zzamvVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzanbVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j;
        this.zze = j2;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzamvVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }

    public static zzamv zza(String str) {
        return new zzamv(null, str.replaceAll(IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX).replaceAll(" *\n *", IOUtils.LINE_SEPARATOR_UNIX).replaceAll(IOUtils.LINE_SEPARATOR_UNIX, " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static zzamv zzb(String str, long j, long j2, zzanb zzanbVar, String[] strArr, String str2, String str3, zzamv zzamvVar) {
        return new zzamv(str, null, j, j2, zzanbVar, strArr, str2, str3, zzamvVar);
    }

    private final void zzi(TreeSet treeSet, boolean z2) {
        String str = this.zza;
        boolean zEquals = "p".equals(str);
        if (z2 || zEquals || (TtmlNode.TAG_DIV.equals(str) && this.zzh != null)) {
            long j = this.zzd;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.zze;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.zzm != null) {
            for (int i2 = 0; i2 < this.zzm.size(); i2++) {
                zzamv zzamvVar = (zzamv) this.zzm.get(i2);
                boolean z3 = true;
                if (!z2 && !zEquals) {
                    z3 = false;
                }
                zzamvVar.zzi(treeSet, z3);
            }
        }
    }

    private final void zzj(long j, String str, List list) {
        String str2;
        String str3 = this.zzg;
        boolean zEquals = "".equals(str3);
        boolean zZzc = zzc(j);
        if (true != zEquals) {
            str = str3;
        }
        if (zZzc && TtmlNode.TAG_DIV.equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i2 = 0; i2 < zzf(); i2++) {
            zze(i2).zzj(j, str, list);
        }
    }

    private final void zzk(long j, boolean z2, String str, Map map) {
        HashMap map2 = this.zzk;
        map2.clear();
        HashMap map3 = this.zzl;
        map3.clear();
        String str2 = this.zza;
        if (TtmlNode.TAG_METADATA.equals(str2)) {
            return;
        }
        String str3 = this.zzg;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.zzc && z2) {
            SpannableStringBuilder spannableStringBuilderZzl = zzl(str4, map);
            String str5 = this.zzb;
            str5.getClass();
            spannableStringBuilderZzl.append((CharSequence) str5);
            return;
        }
        if (TtmlNode.TAG_BR.equals(str2) && z2) {
            zzl(str4, map).append('\n');
            return;
        }
        if (zzc(j)) {
            for (Map.Entry entry : map.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequenceZzb = ((zzcw) entry.getValue()).zzb();
                charSequenceZzb.getClass();
                map2.put(str6, Integer.valueOf(charSequenceZzb.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i2 = 0; i2 < zzf(); i2++) {
                zze(i2).zzk(j, z2 || zEquals, str4, map);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderZzl2 = zzl(str4, map);
                int length = spannableStringBuilderZzl2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderZzl2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderZzl2.charAt(length) != '\n') {
                    spannableStringBuilderZzl2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequenceZzb2 = ((zzcw) entry2.getValue()).zzb();
                charSequenceZzb2.getClass();
                map3.put(str7, Integer.valueOf(charSequenceZzb2.length()));
            }
        }
    }

    private static SpannableStringBuilder zzl(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcw zzcwVar = new zzcw();
            zzcwVar.zza(new SpannableStringBuilder());
            map.put(str, zzcwVar);
        }
        CharSequence charSequenceZzb = ((zzcw) map.get(str)).zzb();
        charSequenceZzb.getClass();
        return (SpannableStringBuilder) charSequenceZzb;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:105:0x0200 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0202  */
    /* JADX WARN: Code duplicated, block: B:109:0x0206  */
    /* JADX WARN: Code duplicated, block: B:110:0x0211  */
    /* JADX WARN: Code duplicated, block: B:111:0x0220  */
    /* JADX WARN: Code duplicated, block: B:114:0x023a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0245  */
    /* JADX WARN: Code duplicated, block: B:119:0x0256  */
    /* JADX WARN: Code duplicated, block: B:122:0x0263  */
    private final void zzm(long j, Map map, Map map2, String str, Map map3) {
        zzamv zzamvVar;
        int i2;
        zzanb zzanbVarZza;
        int iZzI;
        int i3;
        Map map4 = map;
        int i4 = -1;
        if (zzc(j)) {
            String str2 = this.zzg;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator it = this.zzl.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str4 = (String) entry.getKey();
                HashMap map5 = this.zzk;
                int iIntValue = map5.containsKey(str4) ? ((Integer) map5.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    zzcw zzcwVar = (zzcw) map3.get(str4);
                    zzcwVar.getClass();
                    zzamz zzamzVar = (zzamz) map2.get(str3);
                    zzamzVar.getClass();
                    int i5 = zzamzVar.zzj;
                    zzanb zzanbVarZza2 = zzana.zza(this.zzf, this.zzj, map4);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzcwVar.zzb();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzcwVar.zza(spannableStringBuilder);
                    }
                    if (zzanbVarZza2 != null) {
                        zzamv zzamvVar2 = this.zzi;
                        if (zzanbVarZza2.zza() != i4) {
                            spannableStringBuilder.setSpan(new StyleSpan(zzanbVarZza2.zza()), iIntValue, iIntValue2, 33);
                        }
                        if (zzanbVarZza2.zzb()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzanbVarZza2.zzd()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzanbVarZza2.zzl()) {
                            zzdd.zza(spannableStringBuilder, new ForegroundColorSpan(zzanbVarZza2.zzj()), iIntValue, iIntValue2, 33);
                        }
                        if (zzanbVarZza2.zzo()) {
                            zzdd.zza(spannableStringBuilder, new BackgroundColorSpan(zzanbVarZza2.zzm()), iIntValue, iIntValue2, 33);
                        }
                        if (zzanbVarZza2.zzh() != null) {
                            zzdd.zza(spannableStringBuilder, new TypefaceSpan(zzanbVarZza2.zzh()), iIntValue, iIntValue2, 33);
                        }
                        if (zzanbVarZza2.zzE() != null) {
                            zzamu zzamuVarZzE = zzanbVarZza2.zzE();
                            zzamuVarZzE.getClass();
                            int i6 = zzamuVarZzE.zza;
                            if (i6 == -1) {
                                i6 = (i5 == 2 || i5 == 1) ? 3 : 1;
                                i3 = 1;
                            } else {
                                i3 = zzamuVarZzE.zzb;
                            }
                            int i7 = zzamuVarZzE.zzc;
                            if (i7 == -2) {
                                i7 = 1;
                            }
                            zzdd.zza(spannableStringBuilder, new zzde(i6, i3, i7), iIntValue, iIntValue2, 33);
                        }
                        int iZzv = zzanbVarZza2.zzv();
                        if (iZzv == 2) {
                            while (true) {
                                if (zzamvVar2 == null) {
                                    zzamvVar2 = null;
                                    break;
                                }
                                zzanb zzanbVarZza3 = zzana.zza(zzamvVar2.zzf, zzamvVar2.zzj, map4);
                                if (zzanbVarZza3 != null && zzanbVarZza3.zzv() == 1) {
                                    break;
                                } else {
                                    zzamvVar2 = zzamvVar2.zzi;
                                }
                            }
                            if (zzamvVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzamvVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzamvVar = null;
                                        break;
                                    }
                                    zzamv zzamvVar3 = (zzamv) arrayDeque.pop();
                                    zzanb zzanbVarZza4 = zzana.zza(zzamvVar3.zzf, zzamvVar3.zzj, map4);
                                    if (zzanbVarZza4 != null && zzanbVarZza4.zzv() == 3) {
                                        zzamvVar = zzamvVar3;
                                        break;
                                    }
                                    for (int iZzf = zzamvVar3.zzf() - 1; iZzf >= 0; iZzf--) {
                                        arrayDeque.push(zzamvVar3.zze(iZzf));
                                    }
                                }
                                if (zzamvVar != null) {
                                    if (zzamvVar.zzf() != 1 || zzamvVar.zze(0).zzb == null) {
                                        i2 = -1;
                                        zzee.zzb("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = zzamvVar.zze(0).zzb;
                                        String str6 = zzfj.zza;
                                        zzanb zzanbVarZza5 = zzana.zza(zzamvVar.zzf, zzamvVar.zzj, map4);
                                        int iZzx = zzanbVarZza5 != null ? zzanbVarZza5.zzx() : -1;
                                        i2 = -1;
                                        if (iZzx == -1 && (zzanbVarZza = zzana.zza(zzamvVar2.zzf, zzamvVar2.zzj, map4)) != null) {
                                            iZzx = zzanbVarZza.zzx();
                                        }
                                        spannableStringBuilder.setSpan(new zzdc(str5, iZzx), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                            if (zzanbVarZza2.zzC()) {
                                zzdd.zza(spannableStringBuilder, new zzdb(), iIntValue, iIntValue2, 33);
                            }
                            iZzI = zzanbVarZza2.zzI();
                            if (iZzI != 1) {
                                zzdd.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzanbVarZza2.zzJ(), true), iIntValue, iIntValue2, 33);
                            } else if (iZzI != 2) {
                                zzdd.zza(spannableStringBuilder, new RelativeSizeSpan(zzanbVarZza2.zzJ()), iIntValue, iIntValue2, 33);
                            } else if (iZzI == 3) {
                                zzdd.zzb(spannableStringBuilder, zzanbVarZza2.zzJ() / 100.0f, iIntValue, iIntValue2, 33);
                            }
                            if ("p".equals(this.zza)) {
                                if (zzanbVarZza2.zzq() != Float.MAX_VALUE) {
                                    zzcwVar.zzp((zzanbVarZza2.zzq() * (-90.0f)) / 100.0f);
                                }
                                if (zzanbVarZza2.zzy() != null) {
                                    zzcwVar.zzd(zzanbVarZza2.zzy());
                                }
                                if (zzanbVarZza2.zzA() != null) {
                                    zzcwVar.zze(zzanbVarZza2.zzA());
                                }
                            }
                            i4 = i2;
                            it = it;
                        } else if (iZzv == 3 || iZzv == 4) {
                            spannableStringBuilder.setSpan(new zzamt(), iIntValue, iIntValue2, 33);
                        }
                        i2 = -1;
                        if (zzanbVarZza2.zzC()) {
                            zzdd.zza(spannableStringBuilder, new zzdb(), iIntValue, iIntValue2, 33);
                        }
                        iZzI = zzanbVarZza2.zzI();
                        if (iZzI != 1) {
                            zzdd.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzanbVarZza2.zzJ(), true), iIntValue, iIntValue2, 33);
                        } else if (iZzI != 2) {
                            zzdd.zza(spannableStringBuilder, new RelativeSizeSpan(zzanbVarZza2.zzJ()), iIntValue, iIntValue2, 33);
                        } else if (iZzI == 3) {
                            zzdd.zzb(spannableStringBuilder, zzanbVarZza2.zzJ() / 100.0f, iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.zza)) {
                            if (zzanbVarZza2.zzq() != Float.MAX_VALUE) {
                                zzcwVar.zzp((zzanbVarZza2.zzq() * (-90.0f)) / 100.0f);
                            }
                            if (zzanbVarZza2.zzy() != null) {
                                zzcwVar.zzd(zzanbVarZza2.zzy());
                            }
                            if (zzanbVarZza2.zzA() != null) {
                                zzcwVar.zze(zzanbVarZza2.zzA());
                            }
                        }
                        i4 = i2;
                        it = it;
                    }
                }
            }
            int i8 = 0;
            while (i8 < zzf()) {
                zze(i8).zzm(j, map4, map2, str3, map3);
                i8++;
                map4 = map;
            }
        }
    }

    public final boolean zzc(long j) {
        long j2 = this.zzd;
        if (j2 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && this.zze == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.zze) {
            return j2 <= j && j < this.zze;
        }
        return true;
    }

    public final void zzd(zzamv zzamvVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzamvVar);
    }

    public final zzamv zze(int i2) {
        List list = this.zzm;
        if (list != null) {
            return (zzamv) list.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int zzf() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final long[] zzg() {
        TreeSet treeSet = new TreeSet();
        int i2 = 0;
        zzi(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = ((Long) it.next()).longValue();
            i2++;
        }
        return jArr;
    }

    public final List zzh(long j, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        String str = this.zzg;
        zzj(j, str, arrayList);
        TreeMap treeMap = new TreeMap();
        zzk(j, false, str, treeMap);
        zzm(j, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) arrayList.get(i2);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                zzamz zzamzVar = (zzamz) map2.get(pair.first);
                zzamzVar.getClass();
                zzcw zzcwVar = new zzcw();
                zzcwVar.zzc(bitmapDecodeByteArray);
                zzcwVar.zzi(zzamzVar.zzb);
                zzcwVar.zzj(0);
                zzcwVar.zzf(zzamzVar.zzc, 0);
                zzcwVar.zzg(zzamzVar.zze);
                zzcwVar.zzm(zzamzVar.zzf);
                zzcwVar.zzn(zzamzVar.zzg);
                zzcwVar.zzo(zzamzVar.zzj);
                arrayList2.add(zzcwVar.zzr());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzamz zzamzVar2 = (zzamz) map2.get(entry.getKey());
            zzamzVar2.getClass();
            zzcw zzcwVar2 = (zzcw) entry.getValue();
            CharSequence charSequenceZzb = zzcwVar2.zzb();
            charSequenceZzb.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceZzb;
            for (zzamt zzamtVar : (zzamt[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzamt.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzamtVar), spannableStringBuilder.getSpanEnd(zzamtVar), (CharSequence) "");
            }
            int i3 = 0;
            while (i3 < spannableStringBuilder.length()) {
                int i4 = i3 + 1;
                if (spannableStringBuilder.charAt(i3) == ' ') {
                    int i5 = i4;
                    while (i5 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i5) == ' ') {
                        i5++;
                    }
                    int i6 = i5 - i4;
                    if (i6 > 0) {
                        spannableStringBuilder.delete(i3, i6 + i3);
                    }
                }
                i3 = i4;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i7 = 0;
            while (i7 < spannableStringBuilder.length() - 1) {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i7) == '\n' && spannableStringBuilder.charAt(i8) == ' ') {
                    spannableStringBuilder.delete(i8, i7 + 2);
                }
                i7 = i8;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i9 = 0;
            while (i9 < spannableStringBuilder.length() - 1) {
                int i10 = i9 + 1;
                if (spannableStringBuilder.charAt(i9) == ' ' && spannableStringBuilder.charAt(i10) == '\n') {
                    spannableStringBuilder.delete(i9, i10);
                }
                i9 = i10;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzcwVar2.zzf(zzamzVar2.zzc, zzamzVar2.zzd);
            zzcwVar2.zzg(zzamzVar2.zze);
            zzcwVar2.zzi(zzamzVar2.zzb);
            zzcwVar2.zzm(zzamzVar2.zzf);
            zzcwVar2.zzl(zzamzVar2.zzi, zzamzVar2.zzh);
            zzcwVar2.zzo(zzamzVar2.zzj);
            arrayList2.add(zzcwVar2.zzr());
        }
        return arrayList2;
    }
}
