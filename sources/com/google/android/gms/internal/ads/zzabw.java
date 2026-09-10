package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.applovin.impl.Z;
import com.google.android.gms.common.Scopes;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.smartdigimkt.f3.b;
import com.smartdigimkt.sdk.basead.ui.animplayerview.scale.AlbumScaleMainView;
import com.thinkup.core.common.n.mo;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.MimeTypes;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzabw extends zzuq implements zzacl {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private int zzB;
    private int zzC;
    private zzmp zzD;
    private boolean zzE;
    private long zzF;
    private int zzG;
    private long zzH;
    private zzbv zzI;
    private zzbv zzJ;
    private int zzK;
    private int zzL;
    private zzacj zzM;
    private long zzN;
    private long zzO;
    private boolean zzP;
    private final Context zze;
    private final boolean zzf;
    private final zzadf zzg;
    private final boolean zzh;
    private final zzacm zzi;
    private final zzack zzj;
    private final long zzk;
    private final PriorityQueue zzl;
    private zzabv zzm;
    private boolean zzn;
    private boolean zzo;
    private zzadl zzp;
    private boolean zzq;
    private int zzr;
    private List zzs;
    private Surface zzt;
    private zzaby zzu;
    private zzes zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    public zzabw(zzabu zzabuVar) {
        super(2, zzabuVar.zzg(), zzabuVar.zzf(), false, 30.0f);
        Context applicationContext = zzabuVar.zze().getApplicationContext();
        this.zze = applicationContext;
        this.zzp = null;
        this.zzg = new zzadf(zzabuVar.zzh(), zzabuVar.zzi());
        this.zzf = this.zzp == null;
        this.zzi = new zzacm(applicationContext, this, 0L);
        this.zzj = new zzack();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzv = zzes.zza;
        this.zzx = 1;
        this.zzy = 0;
        this.zzI = zzbv.zza;
        this.zzL = 0;
        this.zzJ = null;
        this.zzK = -1000;
        this.zzN = -9223372036854775807L;
        this.zzO = -9223372036854775807L;
        this.zzl = new PriorityQueue();
        this.zzk = -9223372036854775807L;
        this.zzD = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    public static int zzat(zzuj zzujVar, zzv zzvVar) {
        int i2 = zzvVar.zzv;
        int i3 = zzvVar.zzw;
        if (i2 != -1 && i3 != -1) {
            String str = zzvVar.zzo;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                int i4 = zzvc.zza;
                Pair pairZzd = zzdo.zzd(zzvVar);
                if (pairZzd == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairZzd.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = "video/avc";
                    } else if (iIntValue == 1024) {
                        str = MimeTypes.VIDEO_AV1;
                    } else {
                        str = "video/hevc";
                    }
                }
            }
            int i5 = 4;
            switch (str) {
                case "video/3gpp":
                case "video/mp4v-es":
                case "video/av01":
                case "video/x-vnd.on2.vp8":
                    return ((i2 * i3) * 3) / i5;
                case "video/hevc":
                    return Math.max(2097152, ((i2 * i3) * 3) / 4);
                case "video/avc":
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !zzujVar.zzf)))) {
                        String str3 = zzfj.zza;
                        return ((((i3 + 15) / 16) * ((i2 + 15) / 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    i5 = 8;
                    return ((i2 * i3) * 3) / i5;
            }
        }
        return -1;
    }

    public static int zzbh(zzuj zzujVar, zzv zzvVar) {
        int i2 = zzvVar.zzp;
        if (i2 == -1) {
            return zzat(zzujVar, zzvVar);
        }
        List list = zzvVar.zzr;
        int size = list.size();
        int length = 0;
        for (int i3 = 0; i3 < size; i3++) {
            length += ((byte[]) list.get(i3)).length;
        }
        return i2 + length;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:102:0x014b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0153  */
    /* JADX WARN: Code duplicated, block: B:105:0x0157  */
    /* JADX WARN: Code duplicated, block: B:107:0x015f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0163  */
    /* JADX WARN: Code duplicated, block: B:110:0x016b  */
    /* JADX WARN: Code duplicated, block: B:111:0x016f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0177  */
    /* JADX WARN: Code duplicated, block: B:114:0x017b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0183  */
    /* JADX WARN: Code duplicated, block: B:117:0x0187  */
    /* JADX WARN: Code duplicated, block: B:119:0x018f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0193  */
    /* JADX WARN: Code duplicated, block: B:122:0x019b  */
    /* JADX WARN: Code duplicated, block: B:123:0x019f  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:131:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:134:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:135:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:137:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:138:0x01db  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:149:0x0207  */
    /* JADX WARN: Code duplicated, block: B:150:0x020b  */
    /* JADX WARN: Code duplicated, block: B:152:0x0213  */
    /* JADX WARN: Code duplicated, block: B:153:0x0217  */
    /* JADX WARN: Code duplicated, block: B:155:0x021f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0223  */
    /* JADX WARN: Code duplicated, block: B:158:0x022b  */
    /* JADX WARN: Code duplicated, block: B:159:0x022f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0237  */
    /* JADX WARN: Code duplicated, block: B:162:0x023b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0243  */
    /* JADX WARN: Code duplicated, block: B:165:0x0247  */
    /* JADX WARN: Code duplicated, block: B:167:0x024f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0253  */
    /* JADX WARN: Code duplicated, block: B:170:0x025b  */
    /* JADX WARN: Code duplicated, block: B:171:0x025f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0267  */
    /* JADX WARN: Code duplicated, block: B:174:0x026b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0273  */
    /* JADX WARN: Code duplicated, block: B:177:0x0277  */
    /* JADX WARN: Code duplicated, block: B:179:0x027f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0283  */
    /* JADX WARN: Code duplicated, block: B:182:0x028b  */
    /* JADX WARN: Code duplicated, block: B:183:0x028f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0297  */
    /* JADX WARN: Code duplicated, block: B:186:0x029b  */
    /* JADX WARN: Code duplicated, block: B:188:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:189:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:191:0x02af  */
    /* JADX WARN: Code duplicated, block: B:192:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:194:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:195:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:197:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:198:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:200:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:201:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:203:0x02df  */
    /* JADX WARN: Code duplicated, block: B:204:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:206:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:207:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:209:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:210:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:212:0x0302  */
    /* JADX WARN: Code duplicated, block: B:213:0x0306  */
    /* JADX WARN: Code duplicated, block: B:215:0x030e  */
    /* JADX WARN: Code duplicated, block: B:216:0x0312  */
    /* JADX WARN: Code duplicated, block: B:218:0x031a  */
    /* JADX WARN: Code duplicated, block: B:219:0x031e  */
    /* JADX WARN: Code duplicated, block: B:221:0x0326  */
    /* JADX WARN: Code duplicated, block: B:222:0x032a  */
    /* JADX WARN: Code duplicated, block: B:224:0x0332  */
    /* JADX WARN: Code duplicated, block: B:225:0x0336  */
    /* JADX WARN: Code duplicated, block: B:227:0x033e  */
    /* JADX WARN: Code duplicated, block: B:228:0x0342  */
    /* JADX WARN: Code duplicated, block: B:230:0x034a  */
    /* JADX WARN: Code duplicated, block: B:231:0x034e  */
    /* JADX WARN: Code duplicated, block: B:233:0x0356  */
    /* JADX WARN: Code duplicated, block: B:234:0x035a  */
    /* JADX WARN: Code duplicated, block: B:236:0x0362  */
    /* JADX WARN: Code duplicated, block: B:237:0x0366  */
    /* JADX WARN: Code duplicated, block: B:239:0x036e  */
    /* JADX WARN: Code duplicated, block: B:240:0x0372  */
    /* JADX WARN: Code duplicated, block: B:242:0x037a  */
    /* JADX WARN: Code duplicated, block: B:243:0x037e  */
    /* JADX WARN: Code duplicated, block: B:245:0x0386  */
    /* JADX WARN: Code duplicated, block: B:246:0x038a  */
    /* JADX WARN: Code duplicated, block: B:248:0x0392  */
    /* JADX WARN: Code duplicated, block: B:249:0x0396  */
    /* JADX WARN: Code duplicated, block: B:251:0x039e  */
    /* JADX WARN: Code duplicated, block: B:252:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:254:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:255:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:257:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:258:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:260:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:261:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:263:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:264:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:266:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:267:0x03db  */
    /* JADX WARN: Code duplicated, block: B:269:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:270:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:272:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:273:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:275:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:276:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:278:0x0407  */
    /* JADX WARN: Code duplicated, block: B:279:0x040b  */
    /* JADX WARN: Code duplicated, block: B:281:0x0413  */
    /* JADX WARN: Code duplicated, block: B:282:0x0417  */
    /* JADX WARN: Code duplicated, block: B:284:0x041f  */
    /* JADX WARN: Code duplicated, block: B:285:0x0423  */
    /* JADX WARN: Code duplicated, block: B:287:0x042b  */
    /* JADX WARN: Code duplicated, block: B:288:0x042f  */
    /* JADX WARN: Code duplicated, block: B:290:0x0437  */
    /* JADX WARN: Code duplicated, block: B:291:0x043b  */
    /* JADX WARN: Code duplicated, block: B:293:0x0443  */
    /* JADX WARN: Code duplicated, block: B:294:0x0447  */
    /* JADX WARN: Code duplicated, block: B:296:0x044f  */
    /* JADX WARN: Code duplicated, block: B:297:0x0453  */
    /* JADX WARN: Code duplicated, block: B:299:0x045b  */
    /* JADX WARN: Code duplicated, block: B:300:0x045f  */
    /* JADX WARN: Code duplicated, block: B:302:0x0467  */
    /* JADX WARN: Code duplicated, block: B:303:0x046b  */
    /* JADX WARN: Code duplicated, block: B:305:0x0473  */
    /* JADX WARN: Code duplicated, block: B:306:0x0477  */
    /* JADX WARN: Code duplicated, block: B:308:0x047f  */
    /* JADX WARN: Code duplicated, block: B:309:0x0483  */
    /* JADX WARN: Code duplicated, block: B:311:0x048b  */
    /* JADX WARN: Code duplicated, block: B:312:0x048f  */
    /* JADX WARN: Code duplicated, block: B:314:0x0497  */
    /* JADX WARN: Code duplicated, block: B:315:0x049a  */
    /* JADX WARN: Code duplicated, block: B:317:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:318:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:320:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:321:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:323:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:324:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:327:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:329:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:330:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:332:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:333:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:335:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:336:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:338:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:339:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:341:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:342:0x0500  */
    /* JADX WARN: Code duplicated, block: B:344:0x0508  */
    /* JADX WARN: Code duplicated, block: B:345:0x050c  */
    /* JADX WARN: Code duplicated, block: B:347:0x0514  */
    /* JADX WARN: Code duplicated, block: B:348:0x0518  */
    /* JADX WARN: Code duplicated, block: B:350:0x0520  */
    /* JADX WARN: Code duplicated, block: B:351:0x0524  */
    /* JADX WARN: Code duplicated, block: B:353:0x052c  */
    /* JADX WARN: Code duplicated, block: B:354:0x0530  */
    /* JADX WARN: Code duplicated, block: B:356:0x0538  */
    /* JADX WARN: Code duplicated, block: B:357:0x053c  */
    /* JADX WARN: Code duplicated, block: B:359:0x0544  */
    /* JADX WARN: Code duplicated, block: B:360:0x0548  */
    /* JADX WARN: Code duplicated, block: B:362:0x0550  */
    /* JADX WARN: Code duplicated, block: B:363:0x0554  */
    /* JADX WARN: Code duplicated, block: B:365:0x055c  */
    /* JADX WARN: Code duplicated, block: B:366:0x0560  */
    /* JADX WARN: Code duplicated, block: B:368:0x0568  */
    /* JADX WARN: Code duplicated, block: B:369:0x056c  */
    /* JADX WARN: Code duplicated, block: B:371:0x0574  */
    /* JADX WARN: Code duplicated, block: B:372:0x0578  */
    /* JADX WARN: Code duplicated, block: B:374:0x0580  */
    /* JADX WARN: Code duplicated, block: B:375:0x0584  */
    /* JADX WARN: Code duplicated, block: B:377:0x058c  */
    /* JADX WARN: Code duplicated, block: B:378:0x0590  */
    /* JADX WARN: Code duplicated, block: B:380:0x0598  */
    /* JADX WARN: Code duplicated, block: B:381:0x059c  */
    /* JADX WARN: Code duplicated, block: B:383:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:384:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:386:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:387:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:389:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:390:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:392:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:393:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:395:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:396:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:398:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:399:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:401:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:402:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:404:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:405:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:407:0x0604  */
    /* JADX WARN: Code duplicated, block: B:408:0x0608  */
    /* JADX WARN: Code duplicated, block: B:410:0x0610  */
    /* JADX WARN: Code duplicated, block: B:411:0x0614  */
    /* JADX WARN: Code duplicated, block: B:413:0x061c  */
    /* JADX WARN: Code duplicated, block: B:414:0x0620  */
    /* JADX WARN: Code duplicated, block: B:416:0x0628  */
    /* JADX WARN: Code duplicated, block: B:417:0x062c  */
    /* JADX WARN: Code duplicated, block: B:419:0x0634  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:420:0x0638  */
    /* JADX WARN: Code duplicated, block: B:422:0x0640  */
    /* JADX WARN: Code duplicated, block: B:423:0x0644  */
    /* JADX WARN: Code duplicated, block: B:425:0x064c  */
    /* JADX WARN: Code duplicated, block: B:426:0x0650  */
    /* JADX WARN: Code duplicated, block: B:428:0x0658  */
    /* JADX WARN: Code duplicated, block: B:429:0x065b  */
    /* JADX WARN: Code duplicated, block: B:431:0x0663  */
    /* JADX WARN: Code duplicated, block: B:432:0x0666  */
    /* JADX WARN: Code duplicated, block: B:434:0x066e  */
    /* JADX WARN: Code duplicated, block: B:435:0x0672  */
    /* JADX WARN: Code duplicated, block: B:437:0x067a  */
    /* JADX WARN: Code duplicated, block: B:438:0x067e  */
    /* JADX WARN: Code duplicated, block: B:440:0x0686  */
    /* JADX WARN: Code duplicated, block: B:441:0x068a  */
    /* JADX WARN: Code duplicated, block: B:443:0x0692  */
    /* JADX WARN: Code duplicated, block: B:444:0x0696  */
    /* JADX WARN: Code duplicated, block: B:446:0x069e  */
    /* JADX WARN: Code duplicated, block: B:447:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:449:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:450:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:452:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:453:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:455:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:456:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:458:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:459:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:461:0x06da  */
    /* JADX WARN: Code duplicated, block: B:462:0x06de  */
    /* JADX WARN: Code duplicated, block: B:464:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:465:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:467:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:468:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:470:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:471:0x0702  */
    /* JADX WARN: Code duplicated, block: B:473:0x070a  */
    /* JADX WARN: Code duplicated, block: B:474:0x070e  */
    /* JADX WARN: Code duplicated, block: B:476:0x0716  */
    /* JADX WARN: Code duplicated, block: B:477:0x071a  */
    /* JADX WARN: Code duplicated, block: B:479:0x0722  */
    /* JADX WARN: Code duplicated, block: B:480:0x0726  */
    /* JADX WARN: Code duplicated, block: B:482:0x072e  */
    /* JADX WARN: Code duplicated, block: B:483:0x0731  */
    /* JADX WARN: Code duplicated, block: B:485:0x0739  */
    /* JADX WARN: Code duplicated, block: B:486:0x073c  */
    /* JADX WARN: Code duplicated, block: B:488:0x0744  */
    /* JADX WARN: Code duplicated, block: B:489:0x0747  */
    /* JADX WARN: Code duplicated, block: B:491:0x074f  */
    /* JADX WARN: Code duplicated, block: B:492:0x0752  */
    /* JADX WARN: Code duplicated, block: B:494:0x075a  */
    /* JADX WARN: Code duplicated, block: B:495:0x075d  */
    /* JADX WARN: Code duplicated, block: B:497:0x0765  */
    /* JADX WARN: Code duplicated, block: B:498:0x0768  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:516:0x07a1, B:46:0x008a, B:49:0x0095, B:84:0x0104, B:509:0x078d, B:517:0x07a5), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:500:0x0770  */
    /* JADX WARN: Code duplicated, block: B:501:0x0773  */
    /* JADX WARN: Code duplicated, block: B:503:0x077b  */
    /* JADX WARN: Code duplicated, block: B:504:0x077e  */
    /* JADX WARN: Code duplicated, block: B:506:0x0786  */
    /* JADX WARN: Code duplicated, block: B:507:0x0789  */
    /* JADX WARN: Code duplicated, block: B:509:0x078d A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:516:0x07a1, B:46:0x008a, B:49:0x0095, B:84:0x0104, B:509:0x078d, B:517:0x07a5), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:513:0x0797  */
    /* JADX WARN: Code duplicated, block: B:532:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:540:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:560:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:570:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:580:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:590:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:600:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00be  */
    /* JADX WARN: Code duplicated, block: B:620:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:630:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:650:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:660:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:680:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00de  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:82:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x0104 A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:516:0x07a1, B:46:0x008a, B:49:0x0095, B:84:0x0104, B:509:0x078d, B:517:0x07a5), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:87:0x010f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0117  */
    /* JADX WARN: Code duplicated, block: B:90:0x011b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0123  */
    /* JADX WARN: Code duplicated, block: B:93:0x0127  */
    /* JADX WARN: Code duplicated, block: B:95:0x012f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0133  */
    /* JADX WARN: Code duplicated, block: B:98:0x013b  */
    /* JADX WARN: Code duplicated, block: B:99:0x013f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean zzbl(String str) {
        String str2;
        byte b2;
        String str3;
        byte b3;
        boolean z2 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzabw.class) {
            if (!zzc) {
                int i2 = Build.VERSION.SDK_INT;
                byte b4 = 28;
                if (i2 <= 28) {
                    String str4 = Build.DEVICE;
                    switch (str4.hashCode()) {
                        case -1339091551:
                            b3 = !str4.equals("dangal") ? (byte) -1 : (byte) 1;
                            break;
                        case -1220081023:
                            b3 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 3;
                            break;
                        case -1220066608:
                            b3 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                            break;
                        case -1012436106:
                            b3 = !str4.equals("oneday") ? (byte) -1 : (byte) 7;
                            break;
                        case -760312546:
                            b3 = !str4.equals("aquaman") ? (byte) -1 : (byte) 0;
                            break;
                        case -64886864:
                            b3 = !str4.equals("magnolia") ? (byte) -1 : (byte) 4;
                            break;
                        case 3415681:
                            b3 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                            break;
                        case 825323514:
                            b3 = !str4.equals("machuca") ? (byte) -1 : (byte) 5;
                            break;
                        default:
                            b3 = -1;
                            break;
                    }
                    switch (b3) {
                        default:
                            if (i2 <= 27 || !"HWEML".equals(Build.DEVICE)) {
                                str2 = Build.MODEL;
                                switch (str2.hashCode()) {
                                    case -349662828:
                                        if (!str2.equals("AFTJMST12")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 6;
                                        }
                                        break;
                                    case -321033677:
                                        if (!str2.equals("AFTKMST12")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 7;
                                        }
                                        break;
                                    case 2006354:
                                        if (!str2.equals("AFTA")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 0;
                                        }
                                        break;
                                    case 2006367:
                                        if (!str2.equals("AFTN")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 1;
                                        }
                                        break;
                                    case 2006371:
                                        if (!str2.equals("AFTR")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 2;
                                        }
                                        break;
                                    case 1785421873:
                                        if (!str2.equals("AFTEU011")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 3;
                                        }
                                        break;
                                    case 1785421876:
                                        if (!str2.equals("AFTEU014")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 4;
                                        }
                                        break;
                                    case 1798172390:
                                        if (!str2.equals("AFTSO001")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 8;
                                        }
                                        break;
                                    case 2119412532:
                                        if (!str2.equals("AFTEUFF014")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 5;
                                        }
                                        break;
                                    default:
                                        b2 = -1;
                                        break;
                                }
                                switch (b2) {
                                    default:
                                        if (i2 <= 26) {
                                            str3 = Build.DEVICE;
                                            switch (str3.hashCode()) {
                                                case -2144781245:
                                                    if (!str3.equals("GIONEE_SWW1609")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 54;
                                                    }
                                                    break;
                                                case -2144781185:
                                                    if (!str3.equals("GIONEE_SWW1627")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 55;
                                                    }
                                                    break;
                                                case -2144781160:
                                                    if (!str3.equals("GIONEE_SWW1631")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 56;
                                                    }
                                                    break;
                                                case -2097309513:
                                                    if (!str3.equals("K50a40")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 74;
                                                    }
                                                    break;
                                                case -2022874474:
                                                    if (!str3.equals("CP8676_I02")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 22;
                                                    }
                                                    break;
                                                case -1978993182:
                                                    if (!str3.equals("NX541J")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 89;
                                                    }
                                                    break;
                                                case -1978990237:
                                                    if (!str3.equals("NX573J")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 90;
                                                    }
                                                    break;
                                                case -1936688988:
                                                    if (!str3.equals("PGN528")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 101;
                                                    }
                                                    break;
                                                case -1936688066:
                                                    if (!str3.equals("PGN610")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 102;
                                                    }
                                                    break;
                                                case -1936688065:
                                                    if (!str3.equals("PGN611")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 103;
                                                    }
                                                    break;
                                                case -1931988508:
                                                    if (!str3.equals("AquaPowerM")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 13;
                                                    }
                                                    break;
                                                case -1885099851:
                                                    if (!str3.equals("RAIJIN")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 116;
                                                    }
                                                    break;
                                                case -1696512866:
                                                    if (!str3.equals("XT1663")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 137;
                                                    }
                                                    break;
                                                case -1680025915:
                                                    if (!str3.equals("ComioS1")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 21;
                                                    }
                                                    break;
                                                case -1615810839:
                                                    if (!str3.equals("Phantom6")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 104;
                                                    }
                                                    break;
                                                case -1600724499:
                                                    if (!str3.equals("pacificrim")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 95;
                                                    }
                                                    break;
                                                case -1554255044:
                                                    if (!str3.equals("vernee_M5")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 130;
                                                    }
                                                    break;
                                                case -1481772737:
                                                    if (!str3.equals("panell_dl")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 97;
                                                    }
                                                    break;
                                                case -1481772730:
                                                    if (!str3.equals("panell_ds")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 98;
                                                    }
                                                    break;
                                                case -1481772729:
                                                    if (!str3.equals("panell_dt")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 99;
                                                    }
                                                    break;
                                                case -1320080169:
                                                    if (!str3.equals("GiONEE_GBL7319")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 52;
                                                    }
                                                    break;
                                                case -1217592143:
                                                    if (!str3.equals("BRAVIA_ATV2")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 18;
                                                    }
                                                    break;
                                                case -1180384755:
                                                    if (!str3.equals("iris60")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 70;
                                                    }
                                                    break;
                                                case -1139198265:
                                                    if (!str3.equals("Slate_Pro")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 118;
                                                    }
                                                    break;
                                                case -1052835013:
                                                    if (!str3.equals("namath")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 87;
                                                    }
                                                    break;
                                                case -993250464:
                                                    if (!str3.equals("A10-70F")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 5;
                                                    }
                                                    break;
                                                case -993250458:
                                                    if (!str3.equals("A10-70L")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 6;
                                                    }
                                                    break;
                                                case -965403638:
                                                    if (!str3.equals("s905x018")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 120;
                                                    }
                                                    break;
                                                case -958336948:
                                                    if (!str3.equals("ELUGA_Ray_X")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 34;
                                                    }
                                                    break;
                                                case -879245230:
                                                    if (!str3.equals("tcl_eu")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 126;
                                                    }
                                                    break;
                                                case -842500323:
                                                    if (!str3.equals("nicklaus_f")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 88;
                                                    }
                                                    break;
                                                case -821392978:
                                                    if (!str3.equals("A7000-a")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 9;
                                                    }
                                                    break;
                                                case -797483286:
                                                    if (!str3.equals("SVP-DTV15")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 119;
                                                    }
                                                    break;
                                                case -794946968:
                                                    if (!str3.equals("watson")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 131;
                                                    }
                                                    break;
                                                case -788334647:
                                                    if (!str3.equals("whyred")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 132;
                                                    }
                                                    break;
                                                case -782144577:
                                                    if (!str3.equals("OnePlus5T")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 91;
                                                    }
                                                    break;
                                                case -575125681:
                                                    if (!str3.equals("GiONEE_CBL7513")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 51;
                                                    }
                                                    break;
                                                case -521118391:
                                                    if (!str3.equals("GIONEE_GBL7360")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 53;
                                                    }
                                                    break;
                                                case -430914369:
                                                    if (!str3.equals("Pixi4-7_3G")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 105;
                                                    }
                                                    break;
                                                case -290434366:
                                                    if (!str3.equals("taido_row")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 121;
                                                    }
                                                    break;
                                                case -282781963:
                                                    if (!str3.equals("BLACK-1X")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 17;
                                                    }
                                                    break;
                                                case -277133239:
                                                    if (!str3.equals("Z12_PRO")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 138;
                                                    }
                                                    break;
                                                case -173639913:
                                                    if (!str3.equals("ELUGA_A3_Pro")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 31;
                                                    }
                                                    break;
                                                case -56598463:
                                                    if (!str3.equals("woods_fn")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 134;
                                                    }
                                                    break;
                                                case 2126:
                                                    if (!str3.equals("C1")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 20;
                                                    }
                                                    break;
                                                case 2564:
                                                    if (!str3.equals("Q5")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 113;
                                                    }
                                                    break;
                                                case 2715:
                                                    if (!str3.equals("V1")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = AbstractJsonLexerKt.TC_INVALID;
                                                    }
                                                    break;
                                                case 2719:
                                                    if (!str3.equals("V5")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 129;
                                                    }
                                                    break;
                                                case 3091:
                                                    if (!str3.equals("b5")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 16;
                                                    }
                                                    break;
                                                case 3483:
                                                    if (!str3.equals("mh")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 84;
                                                    }
                                                    break;
                                                case 73405:
                                                    if (!str3.equals("JGZ")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 73;
                                                    }
                                                    break;
                                                case 75537:
                                                    if (!str3.equals("M04")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 79;
                                                    }
                                                    break;
                                                case 75739:
                                                    if (!str3.equals("M5c")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 80;
                                                    }
                                                    break;
                                                case 76779:
                                                    if (!str3.equals("MX6")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 86;
                                                    }
                                                    break;
                                                case 78669:
                                                    if (!str3.equals("P85")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 94;
                                                    }
                                                    break;
                                                case 79305:
                                                    if (!str3.equals("PLE")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 107;
                                                    }
                                                    break;
                                                case 80618:
                                                    if (!str3.equals("QX1")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 115;
                                                    }
                                                    break;
                                                case 88274:
                                                    if (!str3.equals("Z80")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 139;
                                                    }
                                                    break;
                                                case 98846:
                                                    if (!str3.equals("cv1")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 26;
                                                    }
                                                    break;
                                                case 98848:
                                                    if (!str3.equals("cv3")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 27;
                                                    }
                                                    break;
                                                case 99329:
                                                    if (!str3.equals("deb")) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 101481:
                                                    if (!str3.equals("flo")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 49;
                                                    }
                                                    break;
                                                case 1513190:
                                                    if (!str3.equals("1601")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 0;
                                                    }
                                                    break;
                                                case 1514184:
                                                    if (!str3.equals("1713")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 1;
                                                    }
                                                    break;
                                                case 1514185:
                                                    if (!str3.equals("1714")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 2;
                                                    }
                                                    break;
                                                case 2133089:
                                                    if (!str3.equals("F01H")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 36;
                                                    }
                                                    break;
                                                case 2133091:
                                                    if (!str3.equals("F01J")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 37;
                                                    }
                                                    break;
                                                case 2133120:
                                                    if (!str3.equals("F02H")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 38;
                                                    }
                                                    break;
                                                case 2133151:
                                                    if (!str3.equals("F03H")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 39;
                                                    }
                                                    break;
                                                case 2133182:
                                                    if (!str3.equals("F04H")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 40;
                                                    }
                                                    break;
                                                case 2133184:
                                                    if (!str3.equals("F04J")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 41;
                                                    }
                                                    break;
                                                case 2436959:
                                                    if (!str3.equals("P681")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 93;
                                                    }
                                                    break;
                                                case 2463773:
                                                    if (!str3.equals("Q350")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 109;
                                                    }
                                                    break;
                                                case 2464648:
                                                    if (!str3.equals("Q427")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 111;
                                                    }
                                                    break;
                                                case 2689555:
                                                    if (!str3.equals("XE2X")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 136;
                                                    }
                                                    break;
                                                case 3154429:
                                                    if (!str3.equals("fugu")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 50;
                                                    }
                                                    break;
                                                case 3284551:
                                                    if (!str3.equals("kate")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 75;
                                                    }
                                                    break;
                                                case 3351335:
                                                    if (!str3.equals("mido")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 85;
                                                    }
                                                    break;
                                                case 3386211:
                                                    if (!str3.equals("p212")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 92;
                                                    }
                                                    break;
                                                case 41325051:
                                                    if (!str3.equals("MEIZU_M5")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 83;
                                                    }
                                                    break;
                                                case 51349633:
                                                    if (!str3.equals("601LV")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 3;
                                                    }
                                                    break;
                                                case 51350594:
                                                    if (!str3.equals("602LV")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 4;
                                                    }
                                                    break;
                                                case 55178625:
                                                    if (!str3.equals("Aura_Note_2")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 15;
                                                    }
                                                    break;
                                                case 61542055:
                                                    if (!str3.equals("A1601")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 7;
                                                    }
                                                    break;
                                                case 65355429:
                                                    if (!str3.equals("E5643")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 30;
                                                    }
                                                    break;
                                                case 66214468:
                                                    if (!str3.equals("F3111")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 42;
                                                    }
                                                    break;
                                                case 66214470:
                                                    if (!str3.equals("F3113")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 43;
                                                    }
                                                    break;
                                                case 66214473:
                                                    if (!str3.equals("F3116")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 44;
                                                    }
                                                    break;
                                                case 66215429:
                                                    if (!str3.equals("F3211")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 45;
                                                    }
                                                    break;
                                                case 66215431:
                                                    if (!str3.equals("F3213")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 46;
                                                    }
                                                    break;
                                                case 66215433:
                                                    if (!str3.equals("F3215")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 47;
                                                    }
                                                    break;
                                                case 66216390:
                                                    if (!str3.equals("F3311")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 48;
                                                    }
                                                    break;
                                                case 76402249:
                                                    if (!str3.equals("PRO7S")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 108;
                                                    }
                                                    break;
                                                case 76404105:
                                                    if (!str3.equals("Q4260")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 110;
                                                    }
                                                    break;
                                                case 76404911:
                                                    if (!str3.equals("Q4310")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 112;
                                                    }
                                                    break;
                                                case 80963634:
                                                    if (!str3.equals("V23GB")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 128;
                                                    }
                                                    break;
                                                case 82882791:
                                                    if (!str3.equals("X3_HK")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 135;
                                                    }
                                                    break;
                                                case 98715550:
                                                    if (!str3.equals("i9031")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 67;
                                                    }
                                                    break;
                                                case 101370885:
                                                    if (!str3.equals("l5460")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 76;
                                                    }
                                                    break;
                                                case 102844228:
                                                    if (!str3.equals("le_x6")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 77;
                                                    }
                                                    break;
                                                case 165221241:
                                                    if (!str3.equals("A2016a40")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 8;
                                                    }
                                                    break;
                                                case 182191441:
                                                    if (!str3.equals("CPY83_I00")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 25;
                                                    }
                                                    break;
                                                case 245388979:
                                                    if (!str3.equals("marino_f")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 82;
                                                    }
                                                    break;
                                                case 287431619:
                                                    if (!str3.equals("griffin")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 60;
                                                    }
                                                    break;
                                                case 307593612:
                                                    if (!str3.equals("A7010a48")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 11;
                                                    }
                                                    break;
                                                case 308517133:
                                                    if (!str3.equals("A7020a48")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 12;
                                                    }
                                                    break;
                                                case 316215098:
                                                    if (!str3.equals("TB3-730F")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 122;
                                                    }
                                                    break;
                                                case 316215116:
                                                    if (!str3.equals("TB3-730X")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 123;
                                                    }
                                                    break;
                                                case 316246811:
                                                    if (!str3.equals("TB3-850F")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 124;
                                                    }
                                                    break;
                                                case 316246818:
                                                    if (!str3.equals("TB3-850M")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 125;
                                                    }
                                                    break;
                                                case 407160593:
                                                    if (!str3.equals("Pixi5-10_4G")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 106;
                                                    }
                                                    break;
                                                case 507412548:
                                                    if (!str3.equals("QM16XE_U")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 114;
                                                    }
                                                    break;
                                                case 793982701:
                                                    if (!str3.equals("GIONEE_WBL5708")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 57;
                                                    }
                                                    break;
                                                case 794038622:
                                                    if (!str3.equals("GIONEE_WBL7365")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 58;
                                                    }
                                                    break;
                                                case 794040393:
                                                    if (!str3.equals("GIONEE_WBL7519")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 59;
                                                    }
                                                    break;
                                                case 835649806:
                                                    if (!str3.equals("manning")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 81;
                                                    }
                                                    break;
                                                case 917340916:
                                                    if (!str3.equals("A7000plus")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 10;
                                                    }
                                                    break;
                                                case 958008161:
                                                    if (!str3.equals("j2xlteins")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 72;
                                                    }
                                                    break;
                                                case 1060579533:
                                                    if (!str3.equals("panell_d")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 96;
                                                    }
                                                    break;
                                                case 1150207623:
                                                    if (!str3.equals("LS-5017")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 78;
                                                    }
                                                    break;
                                                case 1176899427:
                                                    if (!str3.equals("itel_S41")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 71;
                                                    }
                                                    break;
                                                case 1280332038:
                                                    if (!str3.equals("hwALE-H")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 62;
                                                    }
                                                    break;
                                                case 1306947716:
                                                    if (!str3.equals("EverStar_S")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 35;
                                                    }
                                                    break;
                                                case 1349174697:
                                                    if (!str3.equals("htc_e56ml_dtul")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 61;
                                                    }
                                                    break;
                                                case 1522194893:
                                                    if (!str3.equals("woods_f")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 133;
                                                    }
                                                    break;
                                                case 1691543273:
                                                    if (!str3.equals("CPH1609")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 23;
                                                    }
                                                    break;
                                                case 1691544261:
                                                    if (!str3.equals("CPH1715")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 24;
                                                    }
                                                    break;
                                                case 1709443163:
                                                    if (!str3.equals("iball8735_9806")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 68;
                                                    }
                                                    break;
                                                case 1865889110:
                                                    if (!str3.equals("santoni")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 117;
                                                    }
                                                    break;
                                                case 1906253259:
                                                    if (!str3.equals("PB2-670M")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 100;
                                                    }
                                                    break;
                                                case 1977196784:
                                                    if (!str3.equals("Infinix-X572")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 69;
                                                    }
                                                    break;
                                                case 2006372676:
                                                    if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 19;
                                                    }
                                                    break;
                                                case 2019281702:
                                                    if (!str3.equals("DM-01K")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 29;
                                                    }
                                                    break;
                                                case 2029784656:
                                                    if (!str3.equals("HWBLN-H")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 63;
                                                    }
                                                    break;
                                                case 2030379515:
                                                    if (!str3.equals("HWCAM-H")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 64;
                                                    }
                                                    break;
                                                case 2033393791:
                                                    if (!str3.equals("ASUS_X00AD_2")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 14;
                                                    }
                                                    break;
                                                case 2047190025:
                                                    if (!str3.equals("ELUGA_Note")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 32;
                                                    }
                                                    break;
                                                case 2047252157:
                                                    if (!str3.equals("ELUGA_Prim")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 33;
                                                    }
                                                    break;
                                                case 2048319463:
                                                    if (!str3.equals("HWVNS-H")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 65;
                                                    }
                                                    break;
                                                case 2048855701:
                                                    if (!str3.equals("HWWAS-H")) {
                                                        b4 = -1;
                                                    } else {
                                                        b4 = 66;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                default:
                                                    if (str2.hashCode() == -594534941 && str2.equals("JSN-L21")) {
                                                    }
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                case 10:
                                                case 11:
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                case 16:
                                                case 17:
                                                case 18:
                                                case 19:
                                                case 20:
                                                case 21:
                                                case 22:
                                                case 23:
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                case 28:
                                                case 29:
                                                case 30:
                                                case 31:
                                                case 32:
                                                case 33:
                                                case 34:
                                                case 35:
                                                case 36:
                                                case 37:
                                                case 38:
                                                case 39:
                                                case 40:
                                                case 41:
                                                case 42:
                                                case 43:
                                                case 44:
                                                case 45:
                                                case 46:
                                                case 47:
                                                case 48:
                                                case 49:
                                                case 50:
                                                case AD_REWARD_USER_VALUE:
                                                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                                                case 53:
                                                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                                                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                                                case 56:
                                                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                                                case 58:
                                                case 59:
                                                case 60:
                                                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                                                case 62:
                                                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                                                case 64:
                                                case 65:
                                                case 66:
                                                case 67:
                                                case 68:
                                                case mo.oom.onn /* 69 */:
                                                case b.B0 /* 70 */:
                                                case 71:
                                                case 72:
                                                case 73:
                                                case mo.oom.ooo /* 74 */:
                                                case mo.oom.oom /* 75 */:
                                                case 76:
                                                case mo.oom.ono /* 77 */:
                                                case 78:
                                                case mo.oom.on0 /* 79 */:
                                                case 80:
                                                case mo.oom.m00 /* 81 */:
                                                case 82:
                                                case 83:
                                                case 84:
                                                case 85:
                                                case 86:
                                                case 87:
                                                case 88:
                                                case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                                                case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
                                                case 91:
                                                case mo.oom.m0n /* 92 */:
                                                case mo.oom.mo0 /* 93 */:
                                                case 94:
                                                case 95:
                                                case 96:
                                                case 97:
                                                case 98:
                                                case 99:
                                                case 100:
                                                case 101:
                                                case 102:
                                                case 103:
                                                case 104:
                                                case 105:
                                                case 106:
                                                case 107:
                                                case 108:
                                                case 109:
                                                case 110:
                                                case 111:
                                                case 112:
                                                case 113:
                                                case 114:
                                                case 115:
                                                case 116:
                                                case 117:
                                                case 118:
                                                case 119:
                                                case 120:
                                                case 121:
                                                case 122:
                                                case 123:
                                                case 124:
                                                case 125:
                                                case 126:
                                                case 127:
                                                case 128:
                                                case 129:
                                                case 130:
                                                case 131:
                                                case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                                case OMSDK_JS_WRITE_FAILED_VALUE:
                                                case 134:
                                                case 135:
                                                case PRIVACY_URL_ERROR_VALUE:
                                                case TPAT_RETRY_FAILED_VALUE:
                                                case 138:
                                                case 139:
                                                    z2 = true;
                                                    break;
                                            }
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        z2 = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z2 = true;
                            break;
                    }
                } else if (i2 <= 27) {
                    str2 = Build.MODEL;
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b2 = -1;
                            } else {
                                b2 = 6;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b2 = -1;
                            } else {
                                b2 = 7;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b2 = -1;
                            } else {
                                b2 = 0;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b2 = -1;
                            } else {
                                b2 = 1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b2 = -1;
                            } else {
                                b2 = 2;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b2 = -1;
                            } else {
                                b2 = 3;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b2 = -1;
                            } else {
                                b2 = 4;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b2 = -1;
                            } else {
                                b2 = 8;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b2 = -1;
                            } else {
                                b2 = 5;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        default:
                            if (i2 <= 26) {
                                str3 = Build.DEVICE;
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 54;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 55;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 56;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 74;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 22;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 89;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 90;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 101;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 102;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 103;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 13;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 116;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 137;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 21;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 104;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 95;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 130;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 97;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 98;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 99;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 52;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 18;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 70;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 118;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 87;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 5;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 6;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 120;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 34;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 126;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 88;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 9;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 119;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 131;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 132;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 91;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 51;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 53;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 105;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 121;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 17;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 138;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 31;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 134;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 20;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 113;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b4 = -1;
                                        } else {
                                            b4 = AbstractJsonLexerKt.TC_INVALID;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 129;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 16;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 84;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 73;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 79;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 80;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 86;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 94;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 107;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 115;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 139;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 26;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 27;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b4 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 49;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 0;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 2;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 36;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 37;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 38;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 39;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 40;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 41;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 93;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 109;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 111;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 136;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 50;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 75;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 85;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 92;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 83;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 3;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 4;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 15;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 7;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 30;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 42;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 43;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 44;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 45;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 46;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 47;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 48;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 108;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 110;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 112;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 128;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 135;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 67;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 76;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 77;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 8;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 25;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 82;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 60;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 11;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 12;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 122;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 123;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 124;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 125;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 106;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 114;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 57;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 58;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 59;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 81;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 10;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 72;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 96;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 78;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 71;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 62;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 35;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 61;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 133;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 23;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 24;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 68;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 117;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 100;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 69;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 19;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 29;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 63;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 64;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 14;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 32;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 33;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 65;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 66;
                                        }
                                        break;
                                    default:
                                        b4 = -1;
                                        break;
                                }
                                switch (b4) {
                                    default:
                                        if (str2.hashCode() == -594534941) {
                                            break;
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case AD_REWARD_USER_VALUE:
                                    case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                                    case 53:
                                    case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                                    case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                                    case 56:
                                    case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                                    case 58:
                                    case 59:
                                    case 60:
                                    case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                                    case 62:
                                    case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case mo.oom.onn /* 69 */:
                                    case b.B0 /* 70 */:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case mo.oom.ooo /* 74 */:
                                    case mo.oom.oom /* 75 */:
                                    case 76:
                                    case mo.oom.ono /* 77 */:
                                    case 78:
                                    case mo.oom.on0 /* 79 */:
                                    case 80:
                                    case mo.oom.m00 /* 81 */:
                                    case 82:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                    case 87:
                                    case 88:
                                    case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                                    case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
                                    case 91:
                                    case mo.oom.m0n /* 92 */:
                                    case mo.oom.mo0 /* 93 */:
                                    case 94:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case 99:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 120:
                                    case 121:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case 125:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                    case OMSDK_JS_WRITE_FAILED_VALUE:
                                    case 134:
                                    case 135:
                                    case PRIVACY_URL_ERROR_VALUE:
                                    case TPAT_RETRY_FAILED_VALUE:
                                    case 138:
                                    case 139:
                                        z2 = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z2 = true;
                            break;
                    }
                } else {
                    str2 = Build.MODEL;
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b2 = -1;
                            } else {
                                b2 = 6;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b2 = -1;
                            } else {
                                b2 = 7;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b2 = -1;
                            } else {
                                b2 = 0;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b2 = -1;
                            } else {
                                b2 = 1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b2 = -1;
                            } else {
                                b2 = 2;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b2 = -1;
                            } else {
                                b2 = 3;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b2 = -1;
                            } else {
                                b2 = 4;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b2 = -1;
                            } else {
                                b2 = 8;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b2 = -1;
                            } else {
                                b2 = 5;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        default:
                            if (i2 <= 26) {
                                str3 = Build.DEVICE;
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 54;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 55;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 56;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 74;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 22;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 89;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 90;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 101;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 102;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 103;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 13;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 116;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 137;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 21;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 104;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 95;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 130;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 97;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 98;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 99;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 52;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 18;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 70;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 118;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 87;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 5;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 6;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 120;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 34;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 126;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 88;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 9;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 119;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 131;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 132;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 91;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 51;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 53;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 105;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 121;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 17;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 138;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 31;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 134;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 20;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 113;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b4 = -1;
                                        } else {
                                            b4 = AbstractJsonLexerKt.TC_INVALID;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 129;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 16;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 84;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 73;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 79;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 80;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 86;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 94;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 107;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 115;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 139;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 26;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 27;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b4 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 49;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 0;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 2;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 36;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 37;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 38;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 39;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 40;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 41;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 93;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 109;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 111;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 136;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 50;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 75;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 85;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 92;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 83;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 3;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 4;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 15;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 7;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 30;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 42;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 43;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 44;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 45;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 46;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 47;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 48;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 108;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 110;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 112;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 128;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 135;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 67;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 76;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 77;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 8;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 25;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 82;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 60;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 11;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 12;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 122;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 123;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 124;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 125;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 106;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 114;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 57;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 58;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 59;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 81;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 10;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 72;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 96;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 78;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 71;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 62;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 35;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 61;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 133;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 23;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 24;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 68;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 117;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 100;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 69;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 19;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 29;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 63;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 64;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 14;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 32;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 33;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 65;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b4 = -1;
                                        } else {
                                            b4 = 66;
                                        }
                                        break;
                                    default:
                                        b4 = -1;
                                        break;
                                }
                                switch (b4) {
                                    default:
                                        if (str2.hashCode() == -594534941) {
                                            break;
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case AD_REWARD_USER_VALUE:
                                    case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                                    case 53:
                                    case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                                    case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                                    case 56:
                                    case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                                    case 58:
                                    case 59:
                                    case 60:
                                    case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                                    case 62:
                                    case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case mo.oom.onn /* 69 */:
                                    case b.B0 /* 70 */:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case mo.oom.ooo /* 74 */:
                                    case mo.oom.oom /* 75 */:
                                    case 76:
                                    case mo.oom.ono /* 77 */:
                                    case 78:
                                    case mo.oom.on0 /* 79 */:
                                    case 80:
                                    case mo.oom.m00 /* 81 */:
                                    case 82:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                    case 87:
                                    case 88:
                                    case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                                    case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
                                    case 91:
                                    case mo.oom.m0n /* 92 */:
                                    case mo.oom.mo0 /* 93 */:
                                    case 94:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case 99:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 120:
                                    case 121:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case 125:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                    case OMSDK_JS_WRITE_FAILED_VALUE:
                                    case 134:
                                    case 135:
                                    case PRIVACY_URL_ERROR_VALUE:
                                    case TPAT_RETRY_FAILED_VALUE:
                                    case 138:
                                    case 139:
                                        z2 = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z2 = true;
                            break;
                    }
                }
                zzd = z2;
                zzc = true;
            }
        }
        return zzd;
    }

    public static final boolean zzbm(zzuj zzujVar) {
        return Build.VERSION.SDK_INT >= 35 && zzujVar.zzh;
    }

    private static List zzbn(Context context, zzus zzusVar, zzv zzvVar, boolean z2, boolean z3) throws zzuu {
        String str = zzvVar.zzo;
        if (str == null) {
            return zzgtd.zzi();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzabt.zza(context)) {
            List listZzd = zzvc.zzd(zzusVar, zzvVar, z2, z3);
            if (!listZzd.isEmpty()) {
                return listZzd;
            }
        }
        return zzvc.zzc(zzusVar, zzvVar, z2, z3);
    }

    private final void zzbo(Object obj) throws zzit {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzt == surface) {
            if (surface != null) {
                zzbw();
                Surface surface2 = this.zzt;
                if (surface2 == null || !this.zzw) {
                    return;
                }
                this.zzg.zzg(surface2);
                return;
            }
            return;
        }
        this.zzt = surface;
        if (this.zzp == null) {
            this.zzi.zzd(surface);
        }
        this.zzw = false;
        int iZze = zze();
        zzug zzugVarZzaE = zzaE();
        if (zzugVarZzaE != null && this.zzp == null) {
            zzuj zzujVarZzaH = zzaH();
            zzujVarZzaH.getClass();
            if (!zzbs(zzujVarZzaH) || this.zzn) {
                zzaI();
                zzaA();
            } else {
                Surface surfaceZzbt = zzbt(zzujVarZzaH);
                if (surfaceZzbt != null) {
                    zzugVarZzaE.zzn(surfaceZzbt);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zzugVarZzaE.zzo();
                }
            }
        }
        if (surface != null) {
            zzbw();
        } else {
            this.zzJ = null;
            zzadl zzadlVar = this.zzp;
            if (zzadlVar != null) {
                zzadlVar.zzq();
            }
        }
        if (iZze == 2) {
            zzadl zzadlVar2 = this.zzp;
            if (zzadlVar2 != null) {
                zzadlVar2.zzw(true);
            } else {
                this.zzi.zzj(true);
            }
        }
    }

    private final boolean zzbp(zzih zzihVar) {
        if (zzcW() || zzihVar.zzd() || this.zzO == -9223372036854775807L) {
            return true;
        }
        return this.zzO - (zzihVar.zze - zzbb()) <= 100000;
    }

    private final boolean zzbq(zzih zzihVar) {
        return zzihVar.zze < zzG();
    }

    private final void zzbr(long j, long j2, zzv zzvVar) {
        zzacj zzacjVar = this.zzM;
        if (zzacjVar != null) {
            zzacjVar.zzcS(j, j2, zzvVar, zzaG());
        }
    }

    private final boolean zzbs(zzuj zzujVar) {
        if (this.zzp != null) {
            return true;
        }
        Surface surface = this.zzt;
        return (surface != null && surface.isValid()) || zzbm(zzujVar) || zzbg(zzujVar);
    }

    private final Surface zzbt(zzuj zzujVar) {
        zzadl zzadlVar = this.zzp;
        if (zzadlVar != null) {
            return zzadlVar.zzk();
        }
        Surface surface = this.zzt;
        if (surface != null) {
            return surface;
        }
        if (zzbm(zzujVar)) {
            return null;
        }
        zzgqa.zzi(zzbg(zzujVar));
        zzaby zzabyVar = this.zzu;
        if (zzabyVar != null) {
            if (zzabyVar.zza != zzujVar.zzf) {
                zzbu();
            }
        }
        if (this.zzu == null) {
            this.zzu = zzaby.zzb(this.zze, zzujVar.zzf);
        }
        return this.zzu;
    }

    private final void zzbu() {
        zzaby zzabyVar = this.zzu;
        if (zzabyVar != null) {
            zzabyVar.release();
            this.zzu = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull
    /* JADX INFO: renamed from: zzbv, reason: merged with bridge method [inline-methods] */
    public final void zzbj() {
        this.zzg.zzg(this.zzt);
        this.zzw = true;
    }

    private final void zzbw() {
        zzbv zzbvVar = this.zzJ;
        if (zzbvVar != null) {
            this.zzg.zzf(zzbvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuq, com.google.android.gms.internal.ads.zzij
    public final void zzA(long j, boolean z2, boolean z3) throws zzit {
        zzadl zzadlVar = this.zzp;
        if (zzadlVar != null && !z2) {
            zzadlVar.zzg(true);
        }
        super.zzA(j, z2, z3);
        if (this.zzp == null) {
            this.zzi.zzl();
        }
        if (z2) {
            zzadl zzadlVar2 = this.zzp;
            if (zzadlVar2 != null) {
                zzadlVar2.zzw(false);
            } else {
                this.zzi.zzj(false);
            }
        }
        this.zzB = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public final void zzB() {
        this.zzA = 0;
        this.zzz = zzL().zzb();
        this.zzF = 0L;
        this.zzG = 0;
        zzadl zzadlVar = this.zzp;
        if (zzadlVar != null) {
            zzadlVar.zza();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public final void zzC() {
        if (this.zzA > 0) {
            long jZzb = zzL().zzb();
            this.zzg.zzd(this.zzA, jZzb - this.zzz);
            this.zzA = 0;
            this.zzz = jZzb;
        }
        int i2 = this.zzG;
        if (i2 != 0) {
            this.zzg.zze(this.zzF, i2);
            this.zzF = 0L;
            this.zzG = 0;
        }
        zzadl zzadlVar = this.zzp;
        if (zzadlVar != null) {
            zzadlVar.zzb();
        } else {
            this.zzi.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuq, com.google.android.gms.internal.ads.zzij
    public final void zzD() {
        this.zzJ = null;
        this.zzO = -9223372036854775807L;
        this.zzw = false;
        this.zzE = true;
        try {
            super.zzD();
        } finally {
            zzadf zzadfVar = this.zzg;
            zzadfVar.zzi(((zzuq) this).zza);
            zzadfVar.zzf(zzbv.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuq, com.google.android.gms.internal.ads.zzij
    public final void zzE() {
        try {
            super.zzE();
        } finally {
            this.zzq = false;
            this.zzN = -9223372036854775807L;
            zzbu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public final void zzF() {
        zzadl zzadlVar = this.zzp;
        if (zzadlVar == null || !this.zzf) {
            return;
        }
        zzadlVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzmi, com.google.android.gms.internal.ads.zzmk
    public final String zzS() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final boolean zzU(long j) {
        long jZzaU = zzaU();
        return jZzaU == -9223372036854775807L || j > jZzaU - zzbb();
    }

    @Override // com.google.android.gms.internal.ads.zzuq, com.google.android.gms.internal.ads.zzmi
    public final void zzV(float f, float f2) throws zzit {
        super.zzV(f, f2);
        zzadl zzadlVar = this.zzp;
        if (zzadlVar != null) {
            zzadlVar.zzm(f);
        } else {
            this.zzi.zzn(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzW() {
        zzadl zzadlVar = this.zzp;
        if (zzadlVar == null) {
            this.zzi.zzh();
            return;
        }
        int i2 = this.zzr;
        if (i2 == 0 || i2 == 1) {
            this.zzr = 0;
        } else {
            zzadlVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuq, com.google.android.gms.internal.ads.zzmi
    public final void zzX(long j, long j2) throws Throwable {
        zzadl zzadlVar = this.zzp;
        if (zzadlVar != null) {
            try {
                zzadlVar.zzv(j, j2);
            } catch (zzadk e2) {
                throw zzN(e2, e2.zza, false, 7001);
            }
        }
        super.zzX(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzuq, com.google.android.gms.internal.ads.zzmi
    public final boolean zzY() {
        boolean zZzaW = zzaW();
        zzadl zzadlVar = this.zzp;
        if (zzadlVar != null) {
            return zzadlVar.zzh(zZzaW);
        }
        if (zZzaW && zzaE() == null) {
            return true;
        }
        return this.zzi.zzi(zZzaW);
    }

    @Override // com.google.android.gms.internal.ads.zzuq, com.google.android.gms.internal.ads.zzmi
    public final boolean zzZ() {
        if (!super.zzZ()) {
            return false;
        }
        zzadl zzadlVar = this.zzp;
        return zzadlVar == null || zzadlVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final boolean zzaC(zzuj zzujVar) {
        return zzbs(zzujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final boolean zzaK() {
        zzuj zzujVarZzaH = zzaH();
        if (this.zzp != null && zzujVarZzaH != null) {
            String str = zzujVarZzaH.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaK();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002a  */
    @Override // com.google.android.gms.internal.ads.zzuq
    public final boolean zzaL() {
        boolean z2;
        zzv zzvVarZzaF = zzaF();
        long j = this.zzO;
        if (j != -9223372036854775807L) {
            if (zzaM() + j + 1 > Long.MAX_VALUE - (zzbb() + this.zzO)) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = true;
        }
        return this.zzD == null || this.zzE || (zzvVarZzaF != null && zzvVarZzaF.zzq > 0) || z2 || zzba() != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final void zzaN() {
        super.zzaN();
        this.zzl.clear();
        this.zzC = 0;
        this.zzE = false;
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final zzui zzaP(Throwable th, zzuj zzujVar) {
        return new zzabq(th, zzujVar, this.zzt);
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final boolean zzaQ(zzv zzvVar) throws zzit {
        zzadl zzadlVar = this.zzp;
        if (zzadlVar == null || zzadlVar.zze()) {
            return true;
        }
        try {
            zzadlVar.zzd(zzvVar);
            return true;
        } catch (zzadk e2) {
            throw zzN(e2, zzvVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final void zzaR(zzih zzihVar) throws zzit {
        int iZzaS = zzaS(zzihVar);
        if (Build.VERSION.SDK_INT < 34 || (iZzaS & 32) == 0) {
            this.zzC++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final int zzaS(zzih zzihVar) {
        return (Build.VERSION.SDK_INT < 34 || this.zzD == null || !zzbq(zzihVar) || zzbp(zzihVar)) ? 0 : 32;
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final boolean zzaT(zzih zzihVar) {
        boolean z2 = false;
        if (zzbp(zzihVar)) {
            return false;
        }
        if (zzbq(zzihVar)) {
            if (zzihVar.zze()) {
                return false;
            }
            if (zzihVar.zzf()) {
                zzihVar.zza();
                z2 = true;
            }
            if (z2) {
                ((zzuq) this).zza.zzd++;
            }
        }
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final void zzaV(long j) {
        super.zzaV(j);
        this.zzC--;
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final int zzac(zzus zzusVar, zzv zzvVar) throws zzuu {
        boolean z2;
        String str = zzvVar.zzo;
        if (!zzas.zzb(str)) {
            return 128;
        }
        Context context = this.zze;
        int i2 = 0;
        boolean z3 = zzvVar.zzs != null;
        List listZzbn = zzbn(context, zzusVar, zzvVar, z3, false);
        if (z3 && listZzbn.isEmpty()) {
            listZzbn = zzbn(context, zzusVar, zzvVar, false, false);
        }
        if (listZzbn.isEmpty()) {
            return 129;
        }
        if (!zzuq.zzbd(zzvVar)) {
            return 130;
        }
        zzuj zzujVar = (zzuj) listZzbn.get(0);
        boolean zZzc = zzujVar.zzc(zzvVar);
        if (!zZzc) {
            int i3 = 1;
            while (true) {
                if (i3 >= listZzbn.size()) {
                    z2 = true;
                    break;
                }
                zzuj zzujVar2 = (zzuj) listZzbn.get(i3);
                if (zzujVar2.zzc(zzvVar)) {
                    zZzc = true;
                    z2 = false;
                    zzujVar = zzujVar2;
                    break;
                }
                i3++;
            }
        } else {
            z2 = true;
            break;
        }
        int i4 = true != zZzc ? 3 : 4;
        int i5 = true != zzujVar.zze(zzvVar) ? 8 : 16;
        int i6 = true != zzujVar.zzg ? 0 : 64;
        int i7 = true != z2 ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzabt.zza(context)) {
            i7 = 256;
        }
        if (zZzc) {
            List listZzbn2 = zzbn(context, zzusVar, zzvVar, z3, true);
            if (!listZzbn2.isEmpty()) {
                zzuj zzujVar3 = (zzuj) zzvc.zze(listZzbn2, zzvVar).get(0);
                if (zzujVar3.zzc(zzvVar) && zzujVar3.zze(zzvVar)) {
                    i2 = 32;
                }
            }
        }
        return i4 | i5 | i2 | i6 | i7;
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final List zzad(zzus zzusVar, zzv zzvVar, boolean z2) throws zzuu {
        return zzvc.zze(zzbn(this.zze, zzusVar, zzvVar, false, false), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final zzud zzaf(zzuj zzujVar, zzv zzvVar, MediaCrypto mediaCrypto, float f) {
        zzabv zzabvVar;
        Point pointZzi;
        int i2;
        zzv[] zzvVarArr;
        byte b2;
        boolean z2;
        int iZzat;
        zzv[] zzvVarArrZzI = zzI();
        int length = zzvVarArrZzI.length;
        int iZzbh = zzbh(zzujVar, zzvVar);
        int i3 = zzvVar.zzw;
        int i4 = zzvVar.zzv;
        boolean z3 = true;
        if (length == 1) {
            if (iZzbh != -1 && (iZzat = zzat(zzujVar, zzvVar)) != -1) {
                iZzbh = Math.min((int) (iZzbh * 1.5f), iZzat);
            }
            zzabvVar = new zzabv(i4, i3, iZzbh);
        } else {
            int iMax = i3;
            int iMax2 = i4;
            int i5 = 0;
            boolean z4 = false;
            while (i5 < length) {
                zzv zzvVarZzM = zzvVarArrZzI[i5];
                boolean z5 = z3;
                zzi zziVar = zzvVar.zzE;
                if (zziVar != null && zzvVarZzM.zzE == null) {
                    zzt zztVarZza = zzvVarZzM.zza();
                    zztVarZza.zzC(zziVar);
                    zzvVarZzM = zztVarZza.zzM();
                }
                if (zzujVar.zzf(zzvVar, zzvVarZzM).zzd != 0) {
                    int i6 = zzvVarZzM.zzv;
                    b2 = -1;
                    if (i6 != -1) {
                        zzvVarArr = zzvVarArrZzI;
                        if (zzvVarZzM.zzw != -1) {
                            z2 = false;
                        }
                        z4 |= z2;
                        iMax2 = Math.max(iMax2, i6);
                        iMax = Math.max(iMax, zzvVarZzM.zzw);
                        iZzbh = Math.max(iZzbh, zzbh(zzujVar, zzvVarZzM));
                    } else {
                        zzvVarArr = zzvVarArrZzI;
                    }
                    z2 = z5;
                    z4 |= z2;
                    iMax2 = Math.max(iMax2, i6);
                    iMax = Math.max(iMax, zzvVarZzM.zzw);
                    iZzbh = Math.max(iZzbh, zzbh(zzujVar, zzvVarZzM));
                } else {
                    zzvVarArr = zzvVarArrZzI;
                    b2 = -1;
                }
                i5++;
                z3 = z5;
                zzvVarArrZzI = zzvVarArr;
            }
            boolean z6 = z3;
            if (z4) {
                zzee.zzc("MediaCodecVideoRenderer", p005e.a.a(new StringBuilder(String.valueOf(iMax2).length() + 44 + String.valueOf(iMax).length()), iMax2, "Resolutions unknown. Codec max resolution: ", iMax, "x"));
                boolean z7 = i3 > i4 ? z6 : false;
                int i7 = z7 ? i3 : i4;
                int i8 = z6 != z7 ? i3 : i4;
                int[] iArr = zzb;
                int i9 = 0;
                while (true) {
                    if (i9 < 9) {
                        float f2 = i8;
                        float f3 = i7;
                        int i10 = iArr[i9];
                        int i11 = i9;
                        float f4 = i10;
                        if (i10 > i7 && (i2 = (int) (f4 * (f2 / f3))) > i8) {
                            int i12 = i8;
                            int i13 = true != z7 ? i10 : i2;
                            if (true != z7) {
                                i10 = i2;
                            }
                            pointZzi = zzujVar.zzi(i13, i10);
                            float f5 = zzvVar.zzz;
                            if (pointZzi != null) {
                                if (zzujVar.zzg(pointZzi.x, pointZzi.y, f5)) {
                                    break;
                                }
                            }
                            i9 = i11 + 1;
                            i8 = i12;
                            i7 = i7;
                            z7 = z7;
                        }
                    }
                    pointZzi = null;
                    break;
                }
                if (pointZzi != null) {
                    iMax2 = Math.max(iMax2, pointZzi.x);
                    iMax = Math.max(iMax, pointZzi.y);
                    zzt zztVarZza2 = zzvVar.zza();
                    zztVarZza2.zzt(iMax2);
                    zztVarZza2.zzu(iMax);
                    iZzbh = Math.max(iZzbh, zzat(zzujVar, zztVarZza2.zzM()));
                    zzee.zzc("MediaCodecVideoRenderer", p005e.a.a(new StringBuilder(Z.a(iMax2, 35) + String.valueOf(iMax).length()), iMax2, "Codec max resolution adjusted to: ", iMax, "x"));
                }
            }
            zzabvVar = new zzabv(iMax2, iMax, iZzbh);
        }
        String str = zzujVar.zzc;
        this.zzm = zzabvVar;
        boolean z8 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i4);
        mediaFormat.setInteger("height", i3);
        zzeh.zza(mediaFormat, zzvVar.zzr);
        float f6 = zzvVar.zzz;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        zzeh.zzb(mediaFormat, "rotation-degrees", zzvVar.zzA);
        zzi zziVar2 = zzvVar.zzE;
        if (zziVar2 != null) {
            zzeh.zzb(mediaFormat, "color-transfer", zziVar2.zzd);
            zzeh.zzb(mediaFormat, "color-standard", zziVar2.zzb);
            zzeh.zzb(mediaFormat, "color-range", zziVar2.zzc);
            byte[] bArr = zziVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzvVar.zzo)) {
            int i14 = zzvc.zza;
            Pair pairZzd = zzdo.zzd(zzvVar);
            if (pairZzd != null) {
                zzeh.zzb(mediaFormat, Scopes.PROFILE, ((Integer) pairZzd.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", zzabvVar.zza);
        mediaFormat.setInteger("max-height", zzabvVar.zzb);
        zzeh.zzb(mediaFormat, "max-input-size", zzabvVar.zzc);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z8) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzK));
        }
        Surface surfaceZzbt = zzbt(zzujVar);
        if (this.zzp != null && !zzfj.zzR(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzud.zzb(zzujVar, mediaFormat, zzvVar, surfaceZzbt, null);
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final zzil zzag(zzuj zzujVar, zzv zzvVar, zzv zzvVar2) {
        int i2;
        int i3;
        zzil zzilVarZzf = zzujVar.zzf(zzvVar, zzvVar2);
        int i4 = zzilVarZzf.zze;
        zzabv zzabvVar = this.zzm;
        zzabvVar.getClass();
        if (zzvVar2.zzv > zzabvVar.zza || zzvVar2.zzw > zzabvVar.zzb) {
            i4 |= 256;
        }
        if (zzbh(zzujVar, zzvVar2) > zzabvVar.zzc) {
            i4 |= 64;
        }
        String str = zzujVar.zza;
        if (i4 != 0) {
            i3 = 0;
            i2 = i4;
        } else {
            i2 = 0;
            i3 = zzilVarZzf.zzd;
        }
        return new zzil(str, zzvVar, zzvVar2, i3, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final float zzai(float f, zzv zzvVar, zzv[] zzvVarArr) {
        zzuj zzujVarZzaH;
        float fMax = -1.0f;
        for (zzv zzvVar2 : zzvVarArr) {
            float f2 = zzvVar2.zzz;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : fMax * f;
        if (this.zzD == null || (zzujVarZzaH = zzaH()) == null) {
            return f3;
        }
        float fZzh = zzujVarZzaH.zzh(zzvVar.zzv, zzvVar.zzw);
        return f3 != -1.0f ? Math.max(f3, fZzh) : fZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final void zzaj(String str, zzud zzudVar, long j, long j2) {
        this.zzg.zzb(str, j, j2);
        this.zzn = zzbl(str);
        zzuj zzujVarZzaH = zzaH();
        zzujVarZzaH.getClass();
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(zzujVarZzaH.zzb)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzujVarZzaH.zzb()) {
                if (codecProfileLevel.profile == 16384) {
                    z2 = true;
                    break;
                }
            }
        }
        this.zzo = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final void zzak(String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final void zzal(Exception exc) {
        zzee.zzf("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final zzil zzam(zzle zzleVar) throws zzit {
        zzil zzilVarZzam = super.zzam(zzleVar);
        zzv zzvVar = zzleVar.zzb;
        zzvVar.getClass();
        this.zzg.zzc(zzvVar, zzilVarZzam);
        return zzilVarZzam;
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final void zzan(zzv zzvVar, MediaFormat mediaFormat) {
        zzug zzugVarZzaE = zzaE();
        if (zzugVarZzaE != null) {
            zzugVarZzaE.zzq(this.zzx);
        }
        mediaFormat.getClass();
        boolean z2 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z2 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z2 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = zzvVar.zzB;
        int i2 = zzvVar.zzA;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer2;
            integer2 = integer;
            integer = i3;
        }
        this.zzI = new zzbv(integer, integer2, f);
        zzadl zzadlVar = this.zzp;
        if (zzadlVar == null || !this.zzP) {
            this.zzi.zze(zzvVar.zzz);
        } else {
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzt(integer);
            zztVarZza.zzu(integer2);
            zztVarZza.zzz(f);
            zzv zzvVarZzM = zztVarZza.zzM();
            int i4 = this.zzr;
            List listZzi = this.zzs;
            if (listZzi == null) {
                listZzi = zzgtd.zzi();
            }
            zzadlVar.zzs(1, zzvVarZzM, zzbc(), i4, listZzi);
            this.zzr = 2;
        }
        this.zzP = false;
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final boolean zzao(long j, long j2, long j3, boolean z2, boolean z3) throws zzit {
        int iZzP;
        if (this.zzp != null && this.zzf) {
            j2 -= -this.zzN;
        }
        if (j >= -500000 || z2 || (iZzP = zzP(j2)) == 0) {
            return false;
        }
        if (z3) {
            zzik zzikVar = ((zzuq) this).zza;
            int i2 = zzikVar.zzd + iZzP;
            zzikVar.zzd = i2;
            zzikVar.zzf += this.zzC;
            zzikVar.zzd = this.zzl.size() + i2;
        } else {
            ((zzuq) this).zza.zzj++;
            zzaw(this.zzl.size() + iZzP, this.zzC);
        }
        zzaJ();
        zzadl zzadlVar = this.zzp;
        if (zzadlVar != null) {
            zzadlVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final void zzap() {
        zzadl zzadlVar = this.zzp;
        if (zzadlVar != null) {
            zzadlVar.zzi();
            long jZzbc = this.zzN;
            if (jZzbc == -9223372036854775807L) {
                jZzbc = zzbc();
                this.zzN = jZzbc;
            }
            this.zzp.zzo(-jZzbc);
        } else {
            this.zzi.zza(2);
        }
        this.zzP = true;
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final boolean zzaq(long j, long j2, zzug zzugVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j3, boolean z2, boolean z3, zzv zzvVar) throws zzit {
        zzabw zzabwVar;
        long j4;
        zzugVar.getClass();
        long jZzbb = j3 - zzbb();
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.zzl;
            Long l2 = (Long) priorityQueue.peek();
            if (l2 == null || l2.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            i5++;
        }
        zzaw(i5, 0);
        zzadl zzadlVar = this.zzp;
        if (zzadlVar != null) {
            if (!z2 || z3) {
                return zzadlVar.zzu(j3, new zzabs(this, zzugVar, i2, jZzbb));
            }
            zzau(zzugVar, i2, jZzbb);
            return true;
        }
        zzacm zzacmVar = this.zzi;
        long jZzbc = zzbc();
        zzack zzackVar = this.zzj;
        int iZzk = zzacmVar.zzk(j3, j, j2, jZzbc, z2, z3, zzackVar);
        if (iZzk == 0) {
            long jZzc = zzL().zzc();
            zzbr(jZzbb, jZzc, zzvVar);
            zzay(zzugVar, i2, jZzbb, jZzc);
            zzax(zzackVar.zza());
            return true;
        }
        if (iZzk != 1) {
            if (iZzk == 2) {
                zzav(zzugVar, i2, jZzbb);
                zzax(zzackVar.zza());
                return true;
            }
            if (iZzk != 3) {
                return false;
            }
            zzau(zzugVar, i2, jZzbb);
            zzax(zzackVar.zza());
            return true;
        }
        long jZzb = zzackVar.zzb();
        long jZza = zzackVar.zza();
        if (jZzb == this.zzH) {
            zzau(zzugVar, i2, jZzbb);
            j4 = jZzb;
            zzabwVar = this;
        } else {
            zzbr(jZzbb, jZzb, zzvVar);
            zzay(zzugVar, i2, jZzbb, jZzb);
            zzabwVar = this;
            j4 = jZzb;
        }
        zzabwVar.zzax(jZza);
        zzabwVar.zzH = j4;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final void zzar() {
        zzadl zzadlVar = this.zzp;
        if (zzadlVar != null) {
            zzadlVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final void zzas(zzih zzihVar) throws zzit {
        if (this.zzo) {
            ByteBuffer byteBuffer = zzihVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4) {
                    if (b4 == 0 || b4 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzug zzugVarZzaE = zzaE();
                        zzugVarZzaE.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzugVarZzaE.zzp(bundle);
                    }
                }
            }
        }
    }

    public final void zzau(zzug zzugVar, int i2, long j) {
        Trace.beginSection("skipVideoBuffer");
        zzugVar.zzc(i2, false);
        Trace.endSection();
        ((zzuq) this).zza.zzf++;
    }

    public final void zzav(zzug zzugVar, int i2, long j) {
        Trace.beginSection("dropVideoBuffer");
        zzugVar.zzc(i2, false);
        Trace.endSection();
        zzaw(0, 1);
    }

    public final void zzaw(int i2, int i3) {
        zzik zzikVar = ((zzuq) this).zza;
        zzikVar.zzh += i2;
        int i4 = i2 + i3;
        zzikVar.zzg += i4;
        this.zzA += i4;
        int i5 = this.zzB + i4;
        this.zzB = i5;
        zzikVar.zzi = Math.max(i5, zzikVar.zzi);
    }

    public final void zzax(long j) {
        zzik zzikVar = ((zzuq) this).zza;
        zzikVar.zzk += j;
        zzikVar.zzl++;
        this.zzF += j;
        this.zzG++;
    }

    public final void zzay(zzug zzugVar, int i2, long j, long j2) {
        Trace.beginSection("releaseOutputBuffer");
        zzugVar.zzd(i2, j2);
        Trace.endSection();
        ((zzuq) this).zza.zze++;
        this.zzB = 0;
        if (this.zzp == null) {
            zzbv zzbvVar = this.zzI;
            if (!zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzJ)) {
                this.zzJ = zzbvVar;
                this.zzg.zzf(zzbvVar);
            }
            if (!this.zzi.zzf() || this.zzt == null) {
                return;
            }
            zzbj();
        }
    }

    public final boolean zzbg(zzuj zzujVar) {
        if (zzbl(zzujVar.zza)) {
            return false;
        }
        return !zzujVar.zzf || zzaby.zza(this.zze);
    }

    public final /* synthetic */ Surface zzbk() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzuq, com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmd
    public final void zzx(int i2, Object obj) throws zzit {
        if (i2 == 1) {
            zzbo(obj);
            return;
        }
        if (i2 == 7) {
            obj.getClass();
            zzacj zzacjVar = (zzacj) obj;
            this.zzM = zzacjVar;
            zzadl zzadlVar = this.zzp;
            if (zzadlVar != null) {
                zzadlVar.zzl(zzacjVar);
                return;
            }
            return;
        }
        if (i2 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.zzL != iIntValue) {
                this.zzL = iIntValue;
                return;
            }
            return;
        }
        if (i2 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.zzx = iIntValue2;
            zzug zzugVarZzaE = zzaE();
            if (zzugVarZzaE != null) {
                zzugVarZzaE.zzq(iIntValue2);
                return;
            }
            return;
        }
        if (i2 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.zzy = iIntValue3;
            zzadl zzadlVar2 = this.zzp;
            if (zzadlVar2 != null) {
                zzadlVar2.zzr(iIntValue3);
                return;
            } else {
                this.zzi.zzm(iIntValue3);
                return;
            }
        }
        if (i2 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbr.zza)) {
                zzadl zzadlVar3 = this.zzp;
                if (zzadlVar3 == null || !zzadlVar3.zze()) {
                    return;
                }
                zzadlVar3.zzf();
                return;
            }
            this.zzs = list;
            zzadl zzadlVar4 = this.zzp;
            if (zzadlVar4 != null) {
                zzadlVar4.zzn(list);
                return;
            }
            return;
        }
        if (i2 == 14) {
            obj.getClass();
            zzes zzesVar = (zzes) obj;
            if (zzesVar.zza() == 0 || zzesVar.zzb() == 0) {
                return;
            }
            this.zzv = zzesVar;
            zzadl zzadlVar5 = this.zzp;
            if (zzadlVar5 != null) {
                Surface surface = this.zzt;
                surface.getClass();
                zzadlVar5.zzp(surface, zzesVar);
                return;
            }
            return;
        }
        switch (i2) {
            case 16:
                obj.getClass();
                this.zzK = ((Integer) obj).intValue();
                zzug zzugVarZzaE2 = zzaE();
                if (zzugVarZzaE2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzK));
                    zzugVarZzaE2.zzp(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzt;
                zzbo(null);
                obj.getClass();
                ((zzabw) obj).zzx(1, surface2);
                break;
            case 18:
                boolean z2 = this.zzD != null;
                zzmp zzmpVar = (zzmp) obj;
                this.zzD = zzmpVar;
                if (z2 != (zzmpVar != null)) {
                    zzaZ();
                }
                break;
            default:
                super.zzx(i2, obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuq, com.google.android.gms.internal.ads.zzij
    public final void zzy(boolean z2, boolean z3) throws zzit {
        super.zzy(z2, z3);
        zzJ();
        this.zzg.zza(((zzuq) this).zza);
        if (!this.zzq) {
            if (this.zzs != null && this.zzp == null) {
                zzaca zzacaVar = new zzaca(this.zze, this.zzi);
                zzacaVar.zza(true);
                long j = this.zzk;
                zzacaVar.zzc(j != -9223372036854775807L ? -j : -9223372036854775807L);
                zzacaVar.zzb(zzL());
                zzaci zzaciVarZzd = zzacaVar.zzd();
                zzaciVarZzd.zza(1);
                this.zzp = zzaciVarZzd.zzb(0);
            }
            this.zzq = true;
        }
        int i2 = !z3 ? 1 : 0;
        zzadl zzadlVar = this.zzp;
        if (zzadlVar == null) {
            zzacm zzacmVar = this.zzi;
            zzacmVar.zzg(zzL());
            zzacmVar.zza(i2);
            return;
        }
        zzadlVar.zzc(new zzabr(this), zzgzd.zza());
        zzacj zzacjVar = this.zzM;
        if (zzacjVar != null) {
            this.zzp.zzl(zzacjVar);
        }
        if (this.zzt != null && !this.zzv.equals(zzes.zza)) {
            this.zzp.zzp(this.zzt, this.zzv);
        }
        this.zzp.zzr(this.zzy);
        this.zzp.zzm(zzaX());
        List list = this.zzs;
        if (list != null) {
            this.zzp.zzn(list);
        }
        this.zzr = i2;
        zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzuq, com.google.android.gms.internal.ads.zzij
    public final void zzz(zzv[] zzvVarArr, long j, long j2, zzwg zzwgVar) throws zzit {
        super.zzz(zzvVarArr, j, j2, zzwgVar);
        zzbf zzbfVarZzM = zzM();
        if (zzbfVarZzM.zzg()) {
            this.zzO = -9223372036854775807L;
        } else {
            this.zzO = zzbfVarZzM.zzo(zzwgVar.zza, new zzbd()).zzd;
        }
    }
}
