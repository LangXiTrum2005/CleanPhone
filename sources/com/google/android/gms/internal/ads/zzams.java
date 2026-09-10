package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.thinkup.core.common.om.n;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class zzams implements zzaly {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzer zze = new zzer();

    public static float zzb(int i2) {
        if (i2 == 0) {
            return 0.08f;
        }
        if (i2 == 1) {
            return 0.5f;
        }
        if (i2 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long zzc(Matcher matcher, int i2) {
        String strGroup = matcher.group(i2 + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * n.m : 0L;
        String strGroup2 = matcher.group(i2 + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + j;
        String strGroup3 = matcher.group(i2 + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i2 + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:59:0x0134  */
    /* JADX WARN: Code duplicated, block: B:94:0x018e  */
    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(byte[] bArr, int i2, int i3, zzalx zzalxVar, zzdr zzdrVar) {
        zzer zzerVar;
        String str;
        byte b2;
        byte b3;
        int i4;
        zzcx zzcxVarZzr;
        zzams zzamsVar = this;
        zzer zzerVar2 = zzamsVar.zze;
        zzerVar2.zzb(bArr, i2 + i3);
        zzerVar2.zzh(i2);
        Charset charsetZzR = zzerVar2.zzR();
        if (charsetZzR == null) {
            charsetZzR = StandardCharsets.UTF_8;
        }
        while (true) {
            String strZzN = zzerVar2.zzN(charsetZzR);
            if (strZzN == null) {
                return;
            }
            if (strZzN.isEmpty()) {
                zzerVar = zzerVar2;
            } else {
                try {
                    Integer.parseInt(strZzN);
                    zzer zzerVar3 = zzamsVar.zze;
                    String strZzN2 = zzerVar3.zzN(charsetZzR);
                    if (strZzN2 == null) {
                        zzee.zzc("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = zza.matcher(strZzN2);
                    if (matcher.matches()) {
                        long jZzc = zzc(matcher, 1);
                        long jZzc2 = zzc(matcher, 6);
                        StringBuilder sb = zzamsVar.zzc;
                        int i5 = 0;
                        sb.setLength(0);
                        ArrayList arrayList = zzamsVar.zzd;
                        arrayList.clear();
                        String strZzN3 = zzerVar3.zzN(charsetZzR);
                        while (!TextUtils.isEmpty(strZzN3)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strZzN3.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = zzb.matcher(strTrim);
                            int i6 = i5;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList.add(strGroup);
                                int iStart = matcher2.start() - i6;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i6 += length;
                                zzerVar2 = zzerVar2;
                            }
                            sb.append(sb2.toString());
                            strZzN3 = zzerVar3.zzN(charsetZzR);
                            i5 = 0;
                        }
                        zzerVar = zzerVar2;
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        int i7 = 0;
                        while (true) {
                            if (i7 < arrayList.size()) {
                                str = (String) arrayList.get(i7);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i7++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        zzcw zzcwVar = new zzcw();
                        zzcwVar.zza(spannedFromHtml);
                        if (str == null) {
                            zzcxVarZzr = zzcwVar.zzr();
                        } else {
                            switch (str) {
                                case "{\an1}":
                                    b2 = 0;
                                    break;
                                case "{\an3}":
                                    b2 = 3;
                                    break;
                                case "{\an4}":
                                    b2 = 1;
                                    break;
                                case "{\an6}":
                                    b2 = 4;
                                    break;
                                case "{\an7}":
                                    b2 = 2;
                                    break;
                                case "{\an9}":
                                    b2 = 5;
                                    break;
                                default:
                                    b2 = -1;
                                    break;
                            }
                            if (b2 == 0 || b2 == 1 || b2 == 2) {
                                zzcwVar.zzj(0);
                            } else if (b2 == 3 || b2 == 4 || b2 == 5) {
                                zzcwVar.zzj(2);
                            } else {
                                zzcwVar.zzj(1);
                            }
                            switch (str) {
                                case "{\an1}":
                                    b3 = 0;
                                    break;
                                case "{\an2}":
                                    b3 = 1;
                                    break;
                                case "{\an3}":
                                    b3 = 2;
                                    break;
                                case "{\an7}":
                                    b3 = 3;
                                    break;
                                case "{\an8}":
                                    b3 = 4;
                                    break;
                                case "{\an9}":
                                    b3 = 5;
                                    break;
                                default:
                                    b3 = -1;
                                    break;
                            }
                            if (b3 == 0 || b3 == 1) {
                                i4 = 2;
                            } else {
                                if (b3 == 2) {
                                    i4 = 2;
                                } else if (b3 == 3 || b3 == 4 || b3 == 5) {
                                    zzcwVar.zzg(0);
                                } else {
                                    zzcwVar.zzg(1);
                                }
                                zzcwVar.zzi(zzb(zzcwVar.zzk()));
                                zzcwVar.zzf(zzb(zzcwVar.zzh()), 0);
                                zzcxVarZzr = zzcwVar.zzr();
                            }
                            zzcwVar.zzg(i4);
                            zzcwVar.zzi(zzb(zzcwVar.zzk()));
                            zzcwVar.zzf(zzb(zzcwVar.zzh()), 0);
                            zzcxVarZzr = zzcwVar.zzr();
                        }
                        zzdrVar.zza(new zzalq(zzgtd.zzj(zzcxVarZzr), jZzc, jZzc2 - jZzc));
                    } else {
                        zzerVar = zzerVar2;
                        zzee.zzc("SubripParser", "Skipping invalid timing: ".concat(strZzN2));
                    }
                } catch (NumberFormatException unused) {
                    zzerVar = zzerVar2;
                    zzee.zzc("SubripParser", "Skipping invalid index: ".concat(strZzN));
                }
            }
            zzamsVar = this;
            zzerVar2 = zzerVar;
        }
    }
}
