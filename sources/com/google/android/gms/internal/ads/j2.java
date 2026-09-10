package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 implements p2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f15930c = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final lj1 f15931d = new lj1(s6.f19869n);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final lj1 f15932e = new lj1(s6.f19868m);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ya1 f15933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s6 f15934b = new s6(18);

    public final void a(ArrayList arrayList, int i10) {
        s6 s6Var = this.f15934b;
        switch (i10) {
            case 0:
                arrayList.add(new b9());
                break;
            case 1:
                arrayList.add(new d9());
                break;
            case 2:
                arrayList.add(new e9());
                break;
            case 3:
                arrayList.add(new l3());
                break;
            case 4:
                m2 m2VarE = f15931d.e(0);
                if (m2VarE == null) {
                    arrayList.add(new a4());
                } else {
                    arrayList.add(m2VarE);
                }
                break;
            case 5:
                arrayList.add(new c4());
                break;
            case 6:
                arrayList.add(new p5(new k5(0), 0, s6Var));
                break;
            case 7:
                arrayList.add(new t5());
                break;
            case 8:
                arrayList.add(new m6(s6Var, IronSourceError.ERROR_NT_LOAD_PLACEMENT_CAPPED, ya1.f22208e));
                arrayList.add(new r6(s6Var, 160));
                break;
            case 9:
                arrayList.add(new e7());
                break;
            case 10:
                arrayList.add(new aa());
                break;
            case 11:
                if (this.f15933a == null) {
                    aa1 aa1Var = ca1.f13122b;
                    this.f15933a = ya1.f22208e;
                }
                st0 st0Var = new st0();
                ya1 ya1Var = this.f15933a;
                g9 g9Var = new g9();
                g9Var.f14798a = ya1Var;
                arrayList.add(new ea(s6Var, st0Var, g9Var));
                break;
            case 12:
                la laVar = new la();
                laVar.f16837c = 0;
                laVar.f16838d = -1L;
                laVar.f16840f = -1;
                laVar.f16841g = -1L;
                arrayList.add(laVar);
                break;
            case 14:
                arrayList.add(new h4(1));
                break;
            case 15:
                m2 m2VarE2 = f15932e.e(new Object[0]);
                if (m2VarE2 != null) {
                    arrayList.add(m2VarE2);
                }
                break;
            case 16:
                arrayList.add(new o3(s6Var));
                break;
            case 17:
                arrayList.add(new x3(1));
                break;
            case 18:
                arrayList.add(new w3(1));
                break;
            case 19:
                arrayList.add(new x3(0));
                break;
            case 20:
                arrayList.add(new h4(0));
                break;
            case 21:
                arrayList.add(new w3(0));
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d6 A[PHI: r18
  0x01d6: PHI (r18v2 int) = (r18v0 int), (r18v1 int), (r18v1 int) binds: [B:125:0x01d4, B:128:0x01e2, B:131:0x01ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.p2
    public final synchronized m2[] h(Uri uri, Map map) {
        ArrayList arrayList;
        int i10;
        try {
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            String str = null;
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
            }
            int i11 = 6;
            int i12 = 1;
            if (str != null) {
                String strG = na.g(str);
                switch (strG.hashCode()) {
                    case -2123537834:
                        if (strG.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                            i10 = 0;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1662384011:
                        if (strG.equals("video/mp2p")) {
                            i10 = 10;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1662384007:
                        if (strG.equals("video/mp2t")) {
                            i10 = 11;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1662095187:
                        if (strG.equals("video/webm")) {
                            i10 = 6;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1606874997:
                        if (strG.equals(MimeTypes.AUDIO_AMR_WB)) {
                            i10 = 3;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1487656890:
                        if (strG.equals("image/avif")) {
                            i10 = 21;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1487464693:
                        if (strG.equals("image/heic")) {
                            i10 = 20;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1487464690:
                        if (strG.equals("image/heif")) {
                            i10 = 20;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1487394660:
                        if (strG.equals("image/jpeg")) {
                            i10 = 14;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1487018032:
                        if (strG.equals("image/webp")) {
                            i10 = 18;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1248337486:
                        if (strG.equals(MimeTypes.APPLICATION_MP4)) {
                            i10 = 8;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1079884372:
                        if (strG.equals("video/x-msvideo")) {
                            i10 = 16;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -1004728940:
                        if (strG.equals(MimeTypes.TEXT_VTT)) {
                            i10 = 13;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -879272239:
                        if (strG.equals("image/bmp")) {
                            i10 = 19;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -879258763:
                        if (strG.equals("image/png")) {
                            i10 = 17;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -387023398:
                        if (strG.equals("audio/x-matroska")) {
                            i10 = 6;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case -43467528:
                        if (strG.equals(MimeTypes.APPLICATION_WEBM)) {
                            i10 = 6;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 13915911:
                        if (strG.equals("video/x-flv")) {
                            i10 = 5;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 187078296:
                        if (strG.equals(MimeTypes.AUDIO_AC3)) {
                            i10 = 0;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 187078297:
                        if (strG.equals("audio/ac4")) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 187078669:
                        if (strG.equals("audio/amr")) {
                            i10 = 3;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 187090232:
                        if (strG.equals(MimeTypes.AUDIO_MP4)) {
                            i10 = 8;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 187091926:
                        if (strG.equals("audio/ogg")) {
                            i10 = 9;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 187099443:
                        if (strG.equals("audio/wav")) {
                            i10 = 12;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 1331848029:
                        if (strG.equals(MimeTypes.VIDEO_MP4)) {
                            i10 = 8;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 1503095341:
                        if (strG.equals(MimeTypes.AUDIO_AMR_NB)) {
                            i10 = 3;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 1504578661:
                        if (strG.equals(MimeTypes.AUDIO_E_AC3)) {
                            i10 = 0;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 1504619009:
                        if (strG.equals(MimeTypes.AUDIO_FLAC)) {
                            i10 = 4;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 1504824762:
                        if (strG.equals("audio/midi")) {
                            i10 = 15;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 1504831518:
                        if (strG.equals(MimeTypes.AUDIO_MPEG)) {
                            i10 = 7;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 1505118770:
                        if (strG.equals(MimeTypes.AUDIO_WEBM)) {
                            i10 = 6;
                        } else {
                            i10 = -1;
                        }
                        break;
                    case 2039520277:
                        if (strG.equals("video/x-matroska")) {
                            i10 = 6;
                        } else {
                            i10 = -1;
                        }
                        break;
                    default:
                        i10 = -1;
                        break;
                }
            } else {
                i10 = -1;
            }
            if (i10 != -1) {
                a(arrayList, i10);
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                i11 = -1;
            } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                i11 = 0;
            } else if (lastPathSegment.endsWith(".ac4")) {
                i11 = i12;
            } else {
                i12 = 2;
                if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                    i11 = i12;
                } else if (lastPathSegment.endsWith(".amr")) {
                    i11 = 3;
                } else if (lastPathSegment.endsWith(".flac")) {
                    i11 = 4;
                } else if (lastPathSegment.endsWith(".flv")) {
                    i11 = 5;
                } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                    i11 = 15;
                } else if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                    if (lastPathSegment.endsWith(".mp3")) {
                        i11 = 7;
                    } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                        i11 = 8;
                    } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                        i11 = 9;
                    } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                        i11 = 10;
                    } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                        i11 = 11;
                    } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                        i11 = 12;
                    } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                        i11 = 13;
                    } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                        i11 = 14;
                    } else if (lastPathSegment.endsWith(".avi")) {
                        i11 = 16;
                    } else if (lastPathSegment.endsWith(".png")) {
                        i11 = 17;
                    } else if (lastPathSegment.endsWith(".webp")) {
                        i11 = 18;
                    } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
                        i11 = 19;
                    } else if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
                        i11 = 20;
                    } else if (lastPathSegment.endsWith(".avif")) {
                        i11 = 21;
                    } else {
                        i11 = -1;
                    }
                }
            }
            if (i11 != -1 && i11 != i10) {
                a(arrayList, i11);
            }
            int[] iArr = f15930c;
            for (int i13 = 0; i13 < 21; i13++) {
                int i14 = iArr[i13];
                if (i14 != i10 && i14 != i11) {
                    a(arrayList, i14);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (m2[]) arrayList.toArray(new m2[0]);
    }

    @Override // com.google.android.gms.internal.ads.p2
    public final synchronized m2[] zza() {
        return h(Uri.EMPTY, new HashMap());
    }
}
