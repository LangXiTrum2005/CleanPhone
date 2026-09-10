package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaek implements zzaeu {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzaej zzc = new zzaej(zzaeh.zza);
    private static final zzaej zzd = new zzaej(zzaeg.zza);
    private zzgtd zze;
    private final zzalw zzf = new zzalr();

    private final void zzc(int i2, List list) {
        switch (i2) {
            case 0:
                list.add(new zzanv());
                break;
            case 1:
                list.add(new zzany());
                break;
            case 2:
                list.add(new zzaob(0));
                break;
            case 3:
                list.add(new zzagi(0));
                break;
            case 4:
                zzaeo zzaeoVarZza = zzc.zza(0);
                if (zzaeoVarZza == null) {
                    list.add(new zzagz(0));
                } else {
                    list.add(zzaeoVarZza);
                }
                break;
            case 5:
                list.add(new zzahc());
                break;
            case 6:
                list.add(new zzaja(this.zzf, 0));
                break;
            case 7:
                list.add(new zzaji(0));
                break;
            case 8:
                zzalw zzalwVar = this.zzf;
                list.add(new zzakh(zzalwVar, 0, null, null, zzgtd.zzi(), null));
                list.add(new zzakp(zzalwVar, 0));
                break;
            case 9:
                list.add(new zzalf());
                break;
            case 10:
                list.add(new zzapf());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzgtd.zzi();
                }
                list.add(new zzapq(1, 0, this.zzf, new zzfg(0L), new zzaod(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzaqd());
                break;
            case 14:
                list.add(new zzahj(0));
                break;
            case 15:
                zzaeo zzaeoVarZza2 = zzd.zza(new Object[0]);
                if (zzaeoVarZza2 != null) {
                    list.add(zzaeoVarZza2);
                }
                break;
            case 16:
                list.add(new zzagm(0, this.zzf));
                break;
            case 17:
                list.add(new zzalp());
                break;
            case 18:
                list.add(new zzaqi());
                break;
            case 19:
                list.add(new zzagu());
                break;
            case 20:
                list.add(new zzahi(0));
                break;
            case 21:
                list.add(new zzagt());
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final synchronized zzaeo[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:142:0x0204  */
    @Override // com.google.android.gms.internal.ads.zzaeu
    public final synchronized zzaeo[] zzb(Uri uri, Map map) {
        ArrayList arrayList;
        int i2;
        int i3;
        try {
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
            if (str != null) {
                switch (zzas.zzh(str)) {
                    case "audio/ac3":
                    case "audio/eac3":
                    case "audio/eac3-joc":
                        i2 = 0;
                        break;
                    case "audio/ac4":
                        i2 = 1;
                        break;
                    case "audio/amr":
                    case "audio/3gpp":
                    case "audio/amr-wb":
                        i2 = 3;
                        break;
                    case "audio/flac":
                        i2 = 4;
                        break;
                    case "video/x-flv":
                        i2 = 5;
                        break;
                    case "audio/midi":
                        i2 = 15;
                        break;
                    case "video/x-matroska":
                    case "audio/x-matroska":
                    case "video/webm":
                    case "audio/webm":
                    case "application/webm":
                        i2 = 6;
                        break;
                    case "audio/mpeg":
                        i2 = 7;
                        break;
                    case "video/mp4":
                    case "audio/mp4":
                    case "application/mp4":
                        i2 = 8;
                        break;
                    case "audio/ogg":
                        i2 = 9;
                        break;
                    case "video/mp2p":
                        i2 = 10;
                        break;
                    case "video/mp2t":
                        i2 = 11;
                        break;
                    case "audio/wav":
                        i2 = 12;
                        break;
                    case "text/vtt":
                        i2 = 13;
                        break;
                    case "image/jpeg":
                        i2 = 14;
                        break;
                    case "video/x-msvideo":
                        i2 = 16;
                        break;
                    case "image/png":
                        i2 = 17;
                        break;
                    case "image/webp":
                        i2 = 18;
                        break;
                    case "image/bmp":
                        i2 = 19;
                        break;
                    case "image/heif":
                    case "image/heic":
                        i2 = 20;
                        break;
                    case "image/avif":
                        i2 = 21;
                        break;
                    default:
                        i2 = -1;
                        break;
                }
            } else {
                i2 = -1;
            }
            if (i2 != -1) {
                zzc(i2, arrayList);
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                i3 = -1;
            } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                i3 = 0;
            } else if (lastPathSegment.endsWith(".ac4")) {
                i3 = 1;
            } else if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                i3 = 2;
            } else if (lastPathSegment.endsWith(".amr")) {
                i3 = 3;
            } else if (lastPathSegment.endsWith(".flac")) {
                i3 = 4;
            } else if (lastPathSegment.endsWith(".flv")) {
                i3 = 5;
            } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                i3 = 15;
            } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
                i3 = 6;
            } else if (lastPathSegment.endsWith(".mp3")) {
                i3 = 7;
            } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                i3 = 8;
            } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                i3 = 9;
            } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                i3 = 10;
            } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                i3 = 11;
            } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                i3 = 12;
            } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                i3 = 13;
            } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                i3 = 14;
            } else if (lastPathSegment.endsWith(".avi")) {
                i3 = 16;
            } else if (lastPathSegment.endsWith(".png")) {
                i3 = 17;
            } else if (lastPathSegment.endsWith(".webp")) {
                i3 = 18;
            } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
                i3 = 19;
            } else if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
                i3 = 20;
            } else if (lastPathSegment.endsWith(".avif")) {
                i3 = 21;
            } else {
                i3 = -1;
            }
            if (i3 != -1 && i3 != i2) {
                zzc(i3, arrayList);
            }
            int[] iArr = zzb;
            for (int i4 = 0; i4 < 21; i4++) {
                int i5 = iArr[i4];
                if (i5 != i2 && i5 != i3) {
                    zzc(i5, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (zzaeo[]) arrayList.toArray(new zzaeo[0]);
    }
}
