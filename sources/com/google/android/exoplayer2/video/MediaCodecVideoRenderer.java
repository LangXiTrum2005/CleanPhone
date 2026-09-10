package com.google.android.exoplayer2.video;

import A.C0880a0;
import A.t0;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import com.applovin.impl.H0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecInfo;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.d;
import com.google.android.exoplayer2.mediacodec.e;
import com.google.android.exoplayer2.mediacodec.f;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MediaFormatUtil;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.common.Scopes;
import com.google.common.collect.ImmutableList;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.p004ironsource.d9;
import com.smartdigimkt.sdk.basead.ui.animplayerview.scale.AlbumScaleMainView;
import com.thinkup.core.common.n.mo;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.di.ServiceProvider;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class MediaCodecVideoRenderer extends MediaCodecRenderer {
    public static final int[] m2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean n2;
    public static boolean o2;
    public final Context C1;
    public final VideoFrameReleaseHelper D1;
    public final VideoRendererEventListener.EventDispatcher E1;
    public final long F1;
    public final int G1;
    public final boolean H1;
    public CodecMaxValues I1;
    public boolean J1;
    public boolean K1;
    public Surface L1;
    public PlaceholderSurface M1;
    public boolean N1;
    public int O1;
    public boolean P1;
    public boolean Q1;
    public boolean R1;
    public long S1;
    public long T1;
    public long U1;
    public int V1;
    public int W1;
    public int X1;
    public long Y1;
    public long Z1;
    public long a2;
    public int b2;
    public long c2;
    public int d2;
    public int e2;
    public int f2;
    public float g2;
    public VideoSize h2;
    public boolean i2;
    public int j2;
    public OnFrameRenderedListenerV23 k2;
    public VideoFrameMetadataListener l2;

    public static final class Api26 {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService(d9.h.d);
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i2 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i2 == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static final class CodecMaxValues {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19008c;

        public CodecMaxValues(int i2, int i3, int i4) {
            this.f19006a = i2;
            this.f19007b = i3;
            this.f19008c = i4;
        }
    }

    public final class OnFrameRenderedListenerV23 implements MediaCodecAdapter.OnFrameRenderedListener, Handler.Callback {
        public final Handler X;

        public OnFrameRenderedListenerV23(MediaCodecAdapter mediaCodecAdapter) {
            Handler handlerL = Util.l(this);
            this.X = handlerL;
            mediaCodecAdapter.d(this, handlerL);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.OnFrameRenderedListener
        public final void a(long j) {
            if (Util.f18979a >= 30) {
                b(j);
            } else {
                Handler handler = this.X;
                handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
            }
        }

        public final void b(long j) {
            MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
            if (this != mediaCodecVideoRenderer.k2 || mediaCodecVideoRenderer.G0 == null) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                mediaCodecVideoRenderer.v1 = true;
                return;
            }
            try {
                mediaCodecVideoRenderer.i0(j);
                mediaCodecVideoRenderer.p0();
                mediaCodecVideoRenderer.x1.f17429e++;
                mediaCodecVideoRenderer.o0();
                mediaCodecVideoRenderer.R(j);
            } catch (ExoPlaybackException e2) {
                mediaCodecVideoRenderer.w1 = e2;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i2 = message.arg1;
            int i3 = message.arg2;
            int i4 = Util.f18979a;
            b(((((long) i2) & 4294967295L) << 32) | (4294967295L & ((long) i3)));
            return true;
        }
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, Handler handler, VideoRendererEventListener videoRendererEventListener) {
        super(2, factory, 30.0f);
        this.F1 = 5000L;
        this.G1 = 50;
        Context applicationContext = context.getApplicationContext();
        this.C1 = applicationContext;
        this.D1 = new VideoFrameReleaseHelper(applicationContext);
        this.E1 = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.H1 = "NVIDIA".equals(Util.f18981c);
        this.T1 = -9223372036854775807L;
        this.d2 = -1;
        this.e2 = -1;
        this.g2 = -1.0f;
        this.O1 = 1;
        this.j2 = 0;
        this.h2 = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0126  */
    /* JADX WARN: Code duplicated, block: B:103:0x012f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:107:0x013c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0140  */
    /* JADX WARN: Code duplicated, block: B:111:0x0149  */
    /* JADX WARN: Code duplicated, block: B:112:0x014d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0156  */
    /* JADX WARN: Code duplicated, block: B:116:0x015a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0163  */
    /* JADX WARN: Code duplicated, block: B:120:0x0167  */
    /* JADX WARN: Code duplicated, block: B:123:0x0170  */
    /* JADX WARN: Code duplicated, block: B:124:0x0174  */
    /* JADX WARN: Code duplicated, block: B:127:0x017d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0181  */
    /* JADX WARN: Code duplicated, block: B:131:0x018a  */
    /* JADX WARN: Code duplicated, block: B:132:0x018e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0197  */
    /* JADX WARN: Code duplicated, block: B:136:0x019b  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:151:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:155:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:159:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:160:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:163:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:164:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:167:0x0207  */
    /* JADX WARN: Code duplicated, block: B:168:0x020b  */
    /* JADX WARN: Code duplicated, block: B:171:0x0215  */
    /* JADX WARN: Code duplicated, block: B:172:0x0219  */
    /* JADX WARN: Code duplicated, block: B:175:0x0223  */
    /* JADX WARN: Code duplicated, block: B:176:0x0227  */
    /* JADX WARN: Code duplicated, block: B:179:0x0231  */
    /* JADX WARN: Code duplicated, block: B:180:0x0235  */
    /* JADX WARN: Code duplicated, block: B:183:0x023f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0243  */
    /* JADX WARN: Code duplicated, block: B:187:0x024d  */
    /* JADX WARN: Code duplicated, block: B:188:0x0251  */
    /* JADX WARN: Code duplicated, block: B:191:0x025b  */
    /* JADX WARN: Code duplicated, block: B:192:0x025f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0269  */
    /* JADX WARN: Code duplicated, block: B:196:0x026d  */
    /* JADX WARN: Code duplicated, block: B:199:0x0277  */
    /* JADX WARN: Code duplicated, block: B:200:0x027b  */
    /* JADX WARN: Code duplicated, block: B:203:0x0285  */
    /* JADX WARN: Code duplicated, block: B:204:0x0289  */
    /* JADX WARN: Code duplicated, block: B:207:0x0293  */
    /* JADX WARN: Code duplicated, block: B:208:0x0297  */
    /* JADX WARN: Code duplicated, block: B:211:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:212:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:215:0x02af  */
    /* JADX WARN: Code duplicated, block: B:216:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:219:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:220:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:223:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:224:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:227:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:228:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:231:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:232:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:235:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:236:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:239:0x0303  */
    /* JADX WARN: Code duplicated, block: B:240:0x0307  */
    /* JADX WARN: Code duplicated, block: B:243:0x0311  */
    /* JADX WARN: Code duplicated, block: B:244:0x0315  */
    /* JADX WARN: Code duplicated, block: B:247:0x031f  */
    /* JADX WARN: Code duplicated, block: B:248:0x0323  */
    /* JADX WARN: Code duplicated, block: B:251:0x032d  */
    /* JADX WARN: Code duplicated, block: B:252:0x0331  */
    /* JADX WARN: Code duplicated, block: B:255:0x033b  */
    /* JADX WARN: Code duplicated, block: B:256:0x033f  */
    /* JADX WARN: Code duplicated, block: B:259:0x0349  */
    /* JADX WARN: Code duplicated, block: B:260:0x034d  */
    /* JADX WARN: Code duplicated, block: B:263:0x0357  */
    /* JADX WARN: Code duplicated, block: B:264:0x035b  */
    /* JADX WARN: Code duplicated, block: B:267:0x0365  */
    /* JADX WARN: Code duplicated, block: B:268:0x0369  */
    /* JADX WARN: Code duplicated, block: B:271:0x0373  */
    /* JADX WARN: Code duplicated, block: B:272:0x0377  */
    /* JADX WARN: Code duplicated, block: B:275:0x0381  */
    /* JADX WARN: Code duplicated, block: B:276:0x0385  */
    /* JADX WARN: Code duplicated, block: B:279:0x038f  */
    /* JADX WARN: Code duplicated, block: B:280:0x0393  */
    /* JADX WARN: Code duplicated, block: B:283:0x039d  */
    /* JADX WARN: Code duplicated, block: B:284:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:287:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:288:0x03af  */
    /* JADX WARN: Code duplicated, block: B:291:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:292:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:295:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:296:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:299:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:300:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:303:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:304:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:307:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:308:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:311:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:312:0x0403  */
    /* JADX WARN: Code duplicated, block: B:315:0x040d  */
    /* JADX WARN: Code duplicated, block: B:316:0x0411  */
    /* JADX WARN: Code duplicated, block: B:319:0x041b  */
    /* JADX WARN: Code duplicated, block: B:320:0x041f  */
    /* JADX WARN: Code duplicated, block: B:323:0x0429  */
    /* JADX WARN: Code duplicated, block: B:324:0x042d  */
    /* JADX WARN: Code duplicated, block: B:327:0x0437  */
    /* JADX WARN: Code duplicated, block: B:328:0x043b  */
    /* JADX WARN: Code duplicated, block: B:331:0x0445  */
    /* JADX WARN: Code duplicated, block: B:332:0x0449  */
    /* JADX WARN: Code duplicated, block: B:335:0x0453  */
    /* JADX WARN: Code duplicated, block: B:336:0x0457  */
    /* JADX WARN: Code duplicated, block: B:339:0x0461  */
    /* JADX WARN: Code duplicated, block: B:340:0x0465  */
    /* JADX WARN: Code duplicated, block: B:343:0x046f  */
    /* JADX WARN: Code duplicated, block: B:344:0x0473  */
    /* JADX WARN: Code duplicated, block: B:347:0x047d  */
    /* JADX WARN: Code duplicated, block: B:348:0x0481  */
    /* JADX WARN: Code duplicated, block: B:351:0x048b  */
    /* JADX WARN: Code duplicated, block: B:352:0x048f  */
    /* JADX WARN: Code duplicated, block: B:355:0x0499  */
    /* JADX WARN: Code duplicated, block: B:356:0x049d  */
    /* JADX WARN: Code duplicated, block: B:359:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:360:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:363:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:364:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:367:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:368:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:371:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:372:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:375:0x04df  */
    /* JADX WARN: Code duplicated, block: B:376:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:379:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:380:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:383:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:384:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:387:0x0509  */
    /* JADX WARN: Code duplicated, block: B:388:0x050d  */
    /* JADX WARN: Code duplicated, block: B:391:0x0517  */
    /* JADX WARN: Code duplicated, block: B:392:0x051b  */
    /* JADX WARN: Code duplicated, block: B:395:0x0525  */
    /* JADX WARN: Code duplicated, block: B:396:0x0529  */
    /* JADX WARN: Code duplicated, block: B:399:0x0533  */
    /* JADX WARN: Code duplicated, block: B:400:0x0537  */
    /* JADX WARN: Code duplicated, block: B:403:0x0541  */
    /* JADX WARN: Code duplicated, block: B:404:0x0545  */
    /* JADX WARN: Code duplicated, block: B:407:0x054f  */
    /* JADX WARN: Code duplicated, block: B:408:0x0553  */
    /* JADX WARN: Code duplicated, block: B:411:0x055d  */
    /* JADX WARN: Code duplicated, block: B:412:0x0561  */
    /* JADX WARN: Code duplicated, block: B:415:0x056b  */
    /* JADX WARN: Code duplicated, block: B:416:0x056f  */
    /* JADX WARN: Code duplicated, block: B:419:0x0579  */
    /* JADX WARN: Code duplicated, block: B:420:0x057d  */
    /* JADX WARN: Code duplicated, block: B:423:0x0587  */
    /* JADX WARN: Code duplicated, block: B:424:0x058b  */
    /* JADX WARN: Code duplicated, block: B:427:0x0595  */
    /* JADX WARN: Code duplicated, block: B:428:0x0599  */
    /* JADX WARN: Code duplicated, block: B:431:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:432:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:435:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:436:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:439:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:440:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:443:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:444:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:447:0x05db  */
    /* JADX WARN: Code duplicated, block: B:448:0x05df  */
    /* JADX WARN: Code duplicated, block: B:451:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:452:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:455:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:456:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:459:0x0605  */
    /* JADX WARN: Code duplicated, block: B:460:0x0609  */
    /* JADX WARN: Code duplicated, block: B:463:0x0613  */
    /* JADX WARN: Code duplicated, block: B:464:0x0617  */
    /* JADX WARN: Code duplicated, block: B:467:0x0621  */
    /* JADX WARN: Code duplicated, block: B:468:0x0625  */
    /* JADX WARN: Code duplicated, block: B:471:0x062f  */
    /* JADX WARN: Code duplicated, block: B:472:0x0633  */
    /* JADX WARN: Code duplicated, block: B:475:0x063d  */
    /* JADX WARN: Code duplicated, block: B:476:0x0641  */
    /* JADX WARN: Code duplicated, block: B:479:0x064b  */
    /* JADX WARN: Code duplicated, block: B:480:0x064f  */
    /* JADX WARN: Code duplicated, block: B:483:0x0659  */
    /* JADX WARN: Code duplicated, block: B:484:0x065d  */
    /* JADX WARN: Code duplicated, block: B:487:0x0667  */
    /* JADX WARN: Code duplicated, block: B:488:0x066b  */
    /* JADX WARN: Code duplicated, block: B:491:0x0675  */
    /* JADX WARN: Code duplicated, block: B:492:0x0679  */
    /* JADX WARN: Code duplicated, block: B:495:0x0683  */
    /* JADX WARN: Code duplicated, block: B:496:0x0687  */
    /* JADX WARN: Code duplicated, block: B:499:0x0691  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:500:0x0695  */
    /* JADX WARN: Code duplicated, block: B:503:0x069f  */
    /* JADX WARN: Code duplicated, block: B:504:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:507:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:508:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:511:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:512:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:515:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:516:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:519:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:520:0x06db  */
    /* JADX WARN: Code duplicated, block: B:523:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:524:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:527:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:528:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:531:0x0701  */
    /* JADX WARN: Code duplicated, block: B:532:0x0705  */
    /* JADX WARN: Code duplicated, block: B:535:0x070f  */
    /* JADX WARN: Code duplicated, block: B:536:0x0713  */
    /* JADX WARN: Code duplicated, block: B:539:0x071d  */
    /* JADX WARN: Code duplicated, block: B:540:0x0721  */
    /* JADX WARN: Code duplicated, block: B:543:0x072b  */
    /* JADX WARN: Code duplicated, block: B:544:0x072f  */
    /* JADX WARN: Code duplicated, block: B:547:0x0739  */
    /* JADX WARN: Code duplicated, block: B:548:0x073c  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f A[Catch: all -> 0x08be, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x001d, B:9:0x0021, B:11:0x0025, B:662:0x08b9, B:51:0x0094, B:54:0x009f, B:96:0x0117, B:665:0x08c0), top: B:670:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:551:0x0746  */
    /* JADX WARN: Code duplicated, block: B:552:0x0749  */
    /* JADX WARN: Code duplicated, block: B:555:0x0753  */
    /* JADX WARN: Code duplicated, block: B:558:0x075d  */
    /* JADX WARN: Code duplicated, block: B:559:0x0761  */
    /* JADX WARN: Code duplicated, block: B:562:0x076b  */
    /* JADX WARN: Code duplicated, block: B:563:0x076f  */
    /* JADX WARN: Code duplicated, block: B:566:0x0779  */
    /* JADX WARN: Code duplicated, block: B:567:0x077d  */
    /* JADX WARN: Code duplicated, block: B:570:0x0787  */
    /* JADX WARN: Code duplicated, block: B:571:0x078b  */
    /* JADX WARN: Code duplicated, block: B:574:0x0795  */
    /* JADX WARN: Code duplicated, block: B:575:0x0799  */
    /* JADX WARN: Code duplicated, block: B:578:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:579:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:582:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:583:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:586:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:587:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:590:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:591:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:594:0x07db  */
    /* JADX WARN: Code duplicated, block: B:595:0x07df  */
    /* JADX WARN: Code duplicated, block: B:598:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:599:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:602:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:603:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:606:0x0805  */
    /* JADX WARN: Code duplicated, block: B:607:0x0809  */
    /* JADX WARN: Code duplicated, block: B:610:0x0813  */
    /* JADX WARN: Code duplicated, block: B:611:0x0817  */
    /* JADX WARN: Code duplicated, block: B:614:0x0821  */
    /* JADX WARN: Code duplicated, block: B:615:0x0825  */
    /* JADX WARN: Code duplicated, block: B:618:0x082f  */
    /* JADX WARN: Code duplicated, block: B:619:0x0833  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:622:0x083d  */
    /* JADX WARN: Code duplicated, block: B:623:0x0841  */
    /* JADX WARN: Code duplicated, block: B:626:0x084b  */
    /* JADX WARN: Code duplicated, block: B:627:0x084f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:630:0x0859  */
    /* JADX WARN: Code duplicated, block: B:631:0x085b  */
    /* JADX WARN: Code duplicated, block: B:634:0x0865  */
    /* JADX WARN: Code duplicated, block: B:635:0x0867  */
    /* JADX WARN: Code duplicated, block: B:638:0x0871  */
    /* JADX WARN: Code duplicated, block: B:639:0x0873  */
    /* JADX WARN: Code duplicated, block: B:642:0x087d  */
    /* JADX WARN: Code duplicated, block: B:643:0x087f  */
    /* JADX WARN: Code duplicated, block: B:646:0x0889  */
    /* JADX WARN: Code duplicated, block: B:647:0x088b  */
    /* JADX WARN: Code duplicated, block: B:650:0x0895  */
    /* JADX WARN: Code duplicated, block: B:651:0x0897  */
    /* JADX WARN: Code duplicated, block: B:654:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:655:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:658:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:660:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:680:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:700:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:710:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:720:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:740:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:749:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:750:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:760:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:780:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:784:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:789:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:790:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:798:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:799:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:800:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:801:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:802:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:803:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:804:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:808:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:809:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:810:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:811:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:812:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:813:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:814:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:815:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:816:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:817:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:818:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:819:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:820:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:821:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:822:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:823:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:824:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:825:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:826:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:827:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:828:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0117 A[Catch: all -> 0x08be, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x001d, B:9:0x0021, B:11:0x0025, B:662:0x08b9, B:51:0x0094, B:54:0x009f, B:96:0x0117, B:665:0x08c0), top: B:670:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0123  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean k0(String str) {
        String str2;
        byte b2;
        String str3;
        byte b3;
        byte b4 = 26;
        boolean z2 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (MediaCodecVideoRenderer.class) {
            try {
                if (!n2) {
                    int i2 = Util.f18979a;
                    if (i2 <= 28) {
                        String str4 = Util.f18980b;
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case -1339091551:
                                b3 = !str4.equals("dangal") ? (byte) -1 : (byte) 0;
                                break;
                            case -1220081023:
                                b3 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 1;
                                break;
                            case -1220066608:
                                b3 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                                break;
                            case -1012436106:
                                b3 = !str4.equals("oneday") ? (byte) -1 : (byte) 3;
                                break;
                            case -760312546:
                                b3 = !str4.equals("aquaman") ? (byte) -1 : (byte) 4;
                                break;
                            case -64886864:
                                b3 = !str4.equals("magnolia") ? (byte) -1 : (byte) 5;
                                break;
                            case 3415681:
                                b3 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                                break;
                            case 825323514:
                                b3 = !str4.equals("machuca") ? (byte) -1 : (byte) 7;
                                break;
                            default:
                                b3 = -1;
                                break;
                        }
                        switch (b3) {
                            default:
                                if (i2 <= 27 || !"HWEML".equals(Util.f18980b)) {
                                    str2 = Util.d;
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -349662828:
                                            if (!str2.equals("AFTJMST12")) {
                                                b2 = 0;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -321033677:
                                            if (!str2.equals("AFTKMST12")) {
                                                b2 = 1;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 2006354:
                                            if (!str2.equals("AFTA")) {
                                                b2 = 2;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 2006367:
                                            if (!str2.equals("AFTN")) {
                                                b2 = 3;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 2006371:
                                            if (!str2.equals("AFTR")) {
                                                b2 = 4;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 1785421873:
                                            if (!str2.equals("AFTEU011")) {
                                                b2 = 5;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 1785421876:
                                            if (!str2.equals("AFTEU014")) {
                                                b2 = 6;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 1798172390:
                                            if (!str2.equals("AFTSO001")) {
                                                b2 = 7;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 2119412532:
                                            if (!str2.equals("AFTEUFF014")) {
                                                b2 = 8;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                                    switch (b2) {
                                        default:
                                            if (i2 <= 26) {
                                                str3 = Util.f18980b;
                                                str3.getClass();
                                                switch (str3.hashCode()) {
                                                    case -2144781245:
                                                        if (!str3.equals("GIONEE_SWW1609")) {
                                                            b4 = 0;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -2144781185:
                                                        if (!str3.equals("GIONEE_SWW1627")) {
                                                            b4 = 1;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -2144781160:
                                                        if (!str3.equals("GIONEE_SWW1631")) {
                                                            b4 = 2;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -2097309513:
                                                        if (!str3.equals("K50a40")) {
                                                            b4 = 3;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -2022874474:
                                                        if (!str3.equals("CP8676_I02")) {
                                                            b4 = 4;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1978993182:
                                                        if (!str3.equals("NX541J")) {
                                                            b4 = 5;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1978990237:
                                                        if (!str3.equals("NX573J")) {
                                                            b4 = 6;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1936688988:
                                                        if (!str3.equals("PGN528")) {
                                                            b4 = 7;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1936688066:
                                                        if (!str3.equals("PGN610")) {
                                                            b4 = 8;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1936688065:
                                                        if (!str3.equals("PGN611")) {
                                                            b4 = 9;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1931988508:
                                                        if (!str3.equals("AquaPowerM")) {
                                                            b4 = 10;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1885099851:
                                                        if (!str3.equals("RAIJIN")) {
                                                            b4 = 11;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1696512866:
                                                        if (!str3.equals("XT1663")) {
                                                            b4 = 12;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1680025915:
                                                        if (!str3.equals("ComioS1")) {
                                                            b4 = 13;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1615810839:
                                                        if (!str3.equals("Phantom6")) {
                                                            b4 = 14;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1600724499:
                                                        if (!str3.equals("pacificrim")) {
                                                            b4 = 15;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1554255044:
                                                        if (!str3.equals("vernee_M5")) {
                                                            b4 = 16;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1481772737:
                                                        if (!str3.equals("panell_dl")) {
                                                            b4 = 17;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1481772730:
                                                        if (!str3.equals("panell_ds")) {
                                                            b4 = 18;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1481772729:
                                                        if (!str3.equals("panell_dt")) {
                                                            b4 = 19;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1320080169:
                                                        if (!str3.equals("GiONEE_GBL7319")) {
                                                            b4 = 20;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1217592143:
                                                        if (!str3.equals("BRAVIA_ATV2")) {
                                                            b4 = 21;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1180384755:
                                                        if (!str3.equals("iris60")) {
                                                            b4 = 22;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1139198265:
                                                        if (!str3.equals("Slate_Pro")) {
                                                            b4 = 23;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1052835013:
                                                        if (!str3.equals("namath")) {
                                                            b4 = 24;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -993250464:
                                                        if (!str3.equals("A10-70F")) {
                                                            b4 = 25;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -993250458:
                                                        if (!str3.equals("A10-70L")) {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -965403638:
                                                        if (!str3.equals("s905x018")) {
                                                            b4 = 27;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -958336948:
                                                        if (!str3.equals("ELUGA_Ray_X")) {
                                                            b4 = 28;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -879245230:
                                                        if (!str3.equals("tcl_eu")) {
                                                            b4 = 29;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -842500323:
                                                        if (!str3.equals("nicklaus_f")) {
                                                            b4 = 30;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -821392978:
                                                        if (!str3.equals("A7000-a")) {
                                                            b4 = 31;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -797483286:
                                                        if (!str3.equals("SVP-DTV15")) {
                                                            b4 = 32;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -794946968:
                                                        if (!str3.equals("watson")) {
                                                            b4 = 33;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -788334647:
                                                        if (!str3.equals("whyred")) {
                                                            b4 = 34;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -782144577:
                                                        if (!str3.equals("OnePlus5T")) {
                                                            b4 = 35;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -575125681:
                                                        if (!str3.equals("GiONEE_CBL7513")) {
                                                            b4 = 36;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -521118391:
                                                        if (!str3.equals("GIONEE_GBL7360")) {
                                                            b4 = 37;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -430914369:
                                                        if (!str3.equals("Pixi4-7_3G")) {
                                                            b4 = 38;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -290434366:
                                                        if (!str3.equals("taido_row")) {
                                                            b4 = 39;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -282781963:
                                                        if (!str3.equals("BLACK-1X")) {
                                                            b4 = 40;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -277133239:
                                                        if (!str3.equals("Z12_PRO")) {
                                                            b4 = 41;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -173639913:
                                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                                            b4 = 42;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -56598463:
                                                        if (!str3.equals("woods_fn")) {
                                                            b4 = 43;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2126:
                                                        if (!str3.equals("C1")) {
                                                            b4 = 44;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (!str3.equals("Q5")) {
                                                            b4 = 45;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2715:
                                                        if (!str3.equals("V1")) {
                                                            b4 = 46;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2719:
                                                        if (!str3.equals("V5")) {
                                                            b4 = 47;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 3091:
                                                        if (!str3.equals("b5")) {
                                                            b4 = 48;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 3483:
                                                        if (!str3.equals("mh")) {
                                                            b4 = 49;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 73405:
                                                        if (!str3.equals("JGZ")) {
                                                            b4 = 50;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 75537:
                                                        if (!str3.equals("M04")) {
                                                            b4 = 51;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 75739:
                                                        if (!str3.equals("M5c")) {
                                                            b4 = 52;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 76779:
                                                        if (!str3.equals("MX6")) {
                                                            b4 = 53;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 78669:
                                                        if (!str3.equals("P85")) {
                                                            b4 = 54;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 79305:
                                                        if (!str3.equals("PLE")) {
                                                            b4 = 55;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 80618:
                                                        if (!str3.equals("QX1")) {
                                                            b4 = 56;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 88274:
                                                        if (!str3.equals("Z80")) {
                                                            b4 = 57;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 98846:
                                                        if (!str3.equals("cv1")) {
                                                            b4 = 58;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 98848:
                                                        if (!str3.equals("cv3")) {
                                                            b4 = 59;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 99329:
                                                        if (!str3.equals("deb")) {
                                                            b4 = 60;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 101481:
                                                        if (!str3.equals("flo")) {
                                                            b4 = 61;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1513190:
                                                        if (!str3.equals("1601")) {
                                                            b4 = 62;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1514184:
                                                        if (!str3.equals("1713")) {
                                                            b4 = 63;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1514185:
                                                        if (!str3.equals("1714")) {
                                                            b4 = 64;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2133089:
                                                        if (!str3.equals("F01H")) {
                                                            b4 = 65;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2133091:
                                                        if (!str3.equals("F01J")) {
                                                            b4 = 66;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2133120:
                                                        if (!str3.equals("F02H")) {
                                                            b4 = 67;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2133151:
                                                        if (!str3.equals("F03H")) {
                                                            b4 = 68;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2133182:
                                                        if (!str3.equals("F04H")) {
                                                            b4 = 69;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2133184:
                                                        if (!str3.equals("F04J")) {
                                                            b4 = 70;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2436959:
                                                        if (!str3.equals("P681")) {
                                                            b4 = 71;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2463773:
                                                        if (!str3.equals("Q350")) {
                                                            b4 = 72;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2464648:
                                                        if (!str3.equals("Q427")) {
                                                            b4 = 73;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2689555:
                                                        if (!str3.equals("XE2X")) {
                                                            b4 = 74;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 3154429:
                                                        if (!str3.equals("fugu")) {
                                                            b4 = 75;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 3284551:
                                                        if (!str3.equals("kate")) {
                                                            b4 = 76;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 3351335:
                                                        if (!str3.equals("mido")) {
                                                            b4 = 77;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 3386211:
                                                        if (!str3.equals("p212")) {
                                                            b4 = 78;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 41325051:
                                                        if (!str3.equals("MEIZU_M5")) {
                                                            b4 = 79;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 51349633:
                                                        if (!str3.equals("601LV")) {
                                                            b4 = 80;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 51350594:
                                                        if (!str3.equals("602LV")) {
                                                            b4 = 81;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 55178625:
                                                        if (!str3.equals("Aura_Note_2")) {
                                                            b4 = 82;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 61542055:
                                                        if (!str3.equals("A1601")) {
                                                            b4 = 83;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 65355429:
                                                        if (!str3.equals("E5643")) {
                                                            b4 = 84;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 66214468:
                                                        if (!str3.equals("F3111")) {
                                                            b4 = 85;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 66214470:
                                                        if (!str3.equals("F3113")) {
                                                            b4 = 86;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 66214473:
                                                        if (!str3.equals("F3116")) {
                                                            b4 = 87;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 66215429:
                                                        if (!str3.equals("F3211")) {
                                                            b4 = 88;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 66215431:
                                                        if (!str3.equals("F3213")) {
                                                            b4 = 89;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 66215433:
                                                        if (!str3.equals("F3215")) {
                                                            b4 = 90;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 66216390:
                                                        if (!str3.equals("F3311")) {
                                                            b4 = 91;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 76402249:
                                                        if (!str3.equals("PRO7S")) {
                                                            b4 = 92;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 76404105:
                                                        if (!str3.equals("Q4260")) {
                                                            b4 = 93;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 76404911:
                                                        if (!str3.equals("Q4310")) {
                                                            b4 = 94;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 80963634:
                                                        if (!str3.equals("V23GB")) {
                                                            b4 = 95;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 82882791:
                                                        if (!str3.equals("X3_HK")) {
                                                            b4 = 96;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 98715550:
                                                        if (!str3.equals("i9031")) {
                                                            b4 = 97;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 101370885:
                                                        if (!str3.equals("l5460")) {
                                                            b4 = 98;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 102844228:
                                                        if (!str3.equals("le_x6")) {
                                                            b4 = 99;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 165221241:
                                                        if (!str3.equals("A2016a40")) {
                                                            b4 = 100;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 182191441:
                                                        if (!str3.equals("CPY83_I00")) {
                                                            b4 = 101;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 245388979:
                                                        if (!str3.equals("marino_f")) {
                                                            b4 = 102;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 287431619:
                                                        if (!str3.equals("griffin")) {
                                                            b4 = 103;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 307593612:
                                                        if (!str3.equals("A7010a48")) {
                                                            b4 = 104;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 308517133:
                                                        if (!str3.equals("A7020a48")) {
                                                            b4 = 105;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 316215098:
                                                        if (!str3.equals("TB3-730F")) {
                                                            b4 = 106;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 316215116:
                                                        if (!str3.equals("TB3-730X")) {
                                                            b4 = 107;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 316246811:
                                                        if (!str3.equals("TB3-850F")) {
                                                            b4 = 108;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 316246818:
                                                        if (!str3.equals("TB3-850M")) {
                                                            b4 = 109;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 407160593:
                                                        if (!str3.equals("Pixi5-10_4G")) {
                                                            b4 = 110;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 507412548:
                                                        if (!str3.equals("QM16XE_U")) {
                                                            b4 = 111;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 793982701:
                                                        if (!str3.equals("GIONEE_WBL5708")) {
                                                            b4 = 112;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 794038622:
                                                        if (!str3.equals("GIONEE_WBL7365")) {
                                                            b4 = 113;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 794040393:
                                                        if (!str3.equals("GIONEE_WBL7519")) {
                                                            b4 = 114;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 835649806:
                                                        if (!str3.equals("manning")) {
                                                            b4 = 115;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 917340916:
                                                        if (!str3.equals("A7000plus")) {
                                                            b4 = 116;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 958008161:
                                                        if (!str3.equals("j2xlteins")) {
                                                            b4 = 117;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1060579533:
                                                        if (!str3.equals("panell_d")) {
                                                            b4 = 118;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1150207623:
                                                        if (!str3.equals("LS-5017")) {
                                                            b4 = 119;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1176899427:
                                                        if (!str3.equals("itel_S41")) {
                                                            b4 = 120;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1280332038:
                                                        if (!str3.equals("hwALE-H")) {
                                                            b4 = 121;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1306947716:
                                                        if (!str3.equals("EverStar_S")) {
                                                            b4 = 122;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1349174697:
                                                        if (!str3.equals("htc_e56ml_dtul")) {
                                                            b4 = 123;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1522194893:
                                                        if (!str3.equals("woods_f")) {
                                                            b4 = 124;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1691543273:
                                                        if (!str3.equals("CPH1609")) {
                                                            b4 = 125;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1691544261:
                                                        if (!str3.equals("CPH1715")) {
                                                            b4 = 126;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1709443163:
                                                        if (!str3.equals("iball8735_9806")) {
                                                            b4 = AbstractJsonLexerKt.TC_INVALID;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1865889110:
                                                        if (!str3.equals("santoni")) {
                                                            b4 = 128;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1906253259:
                                                        if (!str3.equals("PB2-670M")) {
                                                            b4 = 129;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1977196784:
                                                        if (!str3.equals("Infinix-X572")) {
                                                            b4 = 130;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2006372676:
                                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                            b4 = 131;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2019281702:
                                                        if (!str3.equals("DM-01K")) {
                                                            b4 = 132;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2029784656:
                                                        if (!str3.equals("HWBLN-H")) {
                                                            b4 = 133;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2030379515:
                                                        if (!str3.equals("HWCAM-H")) {
                                                            b4 = 134;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2033393791:
                                                        if (!str3.equals("ASUS_X00AD_2")) {
                                                            b4 = 135;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2047190025:
                                                        if (!str3.equals("ELUGA_Note")) {
                                                            b4 = 136;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2047252157:
                                                        if (!str3.equals("ELUGA_Prim")) {
                                                            b4 = 137;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2048319463:
                                                        if (!str3.equals("HWVNS-H")) {
                                                            b4 = 138;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 2048855701:
                                                        if (!str3.equals("HWWAS-H")) {
                                                            b4 = 139;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b4 = -1;
                                                        break;
                                                }
                                                switch (b4) {
                                                    default:
                                                        if (str2.equals("JSN-L21")) {
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
                                                    case com.smartdigimkt.f3.b.B0 /* 70 */:
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
                        str2 = Util.d;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b2 = 0;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b2 = 1;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b2 = 2;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b2 = 3;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b2 = 4;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b2 = 5;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b2 = 6;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b2 = 7;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b2 = 8;
                                } else {
                                    b2 = -1;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            default:
                                if (i2 <= 26) {
                                    str3 = Util.f18980b;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b4 = 0;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b4 = 1;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b4 = 2;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b4 = 3;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b4 = 4;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b4 = 5;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b4 = 6;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b4 = 7;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b4 = 8;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b4 = 9;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b4 = 10;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b4 = 11;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b4 = 12;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b4 = 13;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b4 = 14;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b4 = 15;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b4 = 16;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b4 = 17;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b4 = 18;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b4 = 19;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b4 = 20;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b4 = 21;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b4 = 22;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b4 = 23;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b4 = 24;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b4 = 25;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b4 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b4 = 27;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b4 = 28;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b4 = 29;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b4 = 30;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b4 = 31;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b4 = 32;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b4 = 33;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b4 = 34;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b4 = 35;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b4 = 36;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b4 = 37;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b4 = 38;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b4 = 39;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b4 = 40;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b4 = 41;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b4 = 42;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b4 = 43;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b4 = 44;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b4 = 45;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b4 = 46;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b4 = 47;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b4 = 48;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b4 = 49;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b4 = 50;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b4 = 51;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b4 = 52;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b4 = 53;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b4 = 54;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b4 = 55;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b4 = 56;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b4 = 57;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b4 = 58;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b4 = 59;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b4 = 60;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b4 = 61;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b4 = 62;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b4 = 63;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b4 = 64;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b4 = 65;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b4 = 66;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b4 = 67;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b4 = 68;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b4 = 69;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b4 = 70;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b4 = 71;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b4 = 72;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b4 = 73;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b4 = 74;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b4 = 75;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b4 = 76;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b4 = 77;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b4 = 78;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b4 = 79;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b4 = 80;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b4 = 81;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b4 = 82;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b4 = 83;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b4 = 84;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b4 = 85;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b4 = 86;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b4 = 87;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b4 = 88;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b4 = 89;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b4 = 90;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b4 = 91;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b4 = 92;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b4 = 93;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b4 = 94;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b4 = 95;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b4 = 96;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b4 = 97;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b4 = 98;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b4 = 99;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b4 = 100;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b4 = 101;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b4 = 102;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b4 = 103;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b4 = 104;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b4 = 105;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b4 = 106;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b4 = 107;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b4 = 108;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b4 = 109;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b4 = 110;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b4 = 111;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b4 = 112;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b4 = 113;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b4 = 114;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b4 = 115;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b4 = 116;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b4 = 117;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b4 = 118;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b4 = 119;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b4 = 120;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b4 = 121;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b4 = 122;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b4 = 123;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b4 = 124;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b4 = 125;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b4 = 126;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b4 = AbstractJsonLexerKt.TC_INVALID;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b4 = 128;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b4 = 129;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b4 = 130;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b4 = 131;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b4 = 132;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b4 = 133;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b4 = 134;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b4 = 135;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b4 = 136;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b4 = 137;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b4 = 138;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b4 = 139;
                                            } else {
                                                b4 = -1;
                                            }
                                            break;
                                        default:
                                            b4 = -1;
                                            break;
                                    }
                                    switch (b4) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
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
                                        case com.smartdigimkt.f3.b.B0 /* 70 */:
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
                        str2 = Util.d;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b2 = -1;
                                } else {
                                    b2 = 0;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b2 = -1;
                                } else {
                                    b2 = 1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b2 = -1;
                                } else {
                                    b2 = 2;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b2 = -1;
                                } else {
                                    b2 = 3;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b2 = -1;
                                } else {
                                    b2 = 4;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b2 = -1;
                                } else {
                                    b2 = 5;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b2 = -1;
                                } else {
                                    b2 = 6;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b2 = -1;
                                } else {
                                    b2 = 7;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b2 = -1;
                                } else {
                                    b2 = 8;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            default:
                                if (i2 <= 26) {
                                    str3 = Util.f18980b;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 0;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 2;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 3;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 4;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 5;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 6;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 7;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 8;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 9;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 10;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 11;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 12;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 13;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 14;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 15;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 16;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 17;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 18;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 19;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 20;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 21;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 22;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 23;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 24;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 25;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b4 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 27;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 28;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 29;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 30;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 31;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 32;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 33;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 34;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 35;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 36;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 37;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 38;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 39;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 40;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 41;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 42;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 43;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 44;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 45;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 46;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 47;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 48;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 49;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 50;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 51;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 52;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 53;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 54;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 55;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 56;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 57;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 58;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 59;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 60;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 61;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 62;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 63;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 64;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 65;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 66;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 67;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 68;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 69;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 70;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 71;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 72;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 73;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 74;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 75;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 76;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 77;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 78;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 79;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 80;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 81;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 82;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 83;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 84;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 85;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 86;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 87;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 88;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 89;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 90;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 91;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 92;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 93;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 94;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 95;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 96;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 97;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 98;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 99;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 100;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 101;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 102;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 103;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 104;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 105;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 106;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 107;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 108;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 109;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 110;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 111;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 112;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 113;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 114;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 115;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 116;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 117;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 118;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 119;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 120;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 121;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 122;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 123;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 124;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 125;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 126;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b4 = -1;
                                            } else {
                                                b4 = AbstractJsonLexerKt.TC_INVALID;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 128;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 129;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 130;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 131;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 132;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 133;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 134;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 135;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 136;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 137;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 138;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b4 = -1;
                                            } else {
                                                b4 = 139;
                                            }
                                            break;
                                        default:
                                            b4 = -1;
                                            break;
                                    }
                                    switch (b4) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
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
                                        case com.smartdigimkt.f3.b.B0 /* 70 */:
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
                    o2 = z2;
                    n2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int l0(MediaCodecInfo mediaCodecInfo, Format format) {
        int i2;
        int iIntValue;
        byte b2 = 2;
        int i3 = format.r0;
        if (i3 != -1 && (i2 = format.s0) != -1) {
            String str = format.m0;
            if ("video/dolby-vision".equals(str)) {
                Pair pairD = MediaCodecUtil.d(format);
                str = (pairD == null || !((iIntValue = ((Integer) pairD.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
            }
            str.getClass();
            switch (str.hashCode()) {
                case -1664118616:
                    b2 = !str.equals("video/3gpp") ? (byte) -1 : (byte) 0;
                    break;
                case -1662735862:
                    b2 = !str.equals(MimeTypes.VIDEO_AV1) ? (byte) -1 : (byte) 1;
                    break;
                case -1662541442:
                    if (!str.equals("video/hevc")) {
                        b2 = -1;
                    }
                    break;
                case 1187890754:
                    b2 = !str.equals("video/mp4v-es") ? (byte) -1 : (byte) 3;
                    break;
                case 1331836730:
                    b2 = !str.equals("video/avc") ? (byte) -1 : (byte) 4;
                    break;
                case 1599127256:
                    b2 = !str.equals("video/x-vnd.on2.vp8") ? (byte) -1 : (byte) 5;
                    break;
                case 1599127257:
                    b2 = !str.equals("video/x-vnd.on2.vp9") ? (byte) -1 : (byte) 6;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                case 1:
                case 3:
                case 5:
                    return ((i3 * i2) * 3) / 4;
                case 2:
                    return Math.max(2097152, ((i3 * i2) * 3) / 4);
                case 4:
                    String str2 = Util.d;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Util.f18981c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !mediaCodecInfo.f)))) {
                        return ((Util.g(i2, 16) * Util.g(i3, 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    return ((i3 * i2) * 3) / 8;
            }
        }
        return -1;
    }

    public static ImmutableList m0(Context context, d dVar, Format format, boolean z2, boolean z3) {
        String str = format.m0;
        if (str == null) {
            return ImmutableList.x();
        }
        dVar.getClass();
        List listE = MediaCodecUtil.e(str, z2, z3);
        String strB = MediaCodecUtil.b(format);
        if (strB == null) {
            return ImmutableList.u(listE);
        }
        List listE2 = MediaCodecUtil.e(strB, z2, z3);
        if (Util.f18979a >= 26 && "video/dolby-vision".equals(format.m0) && !listE2.isEmpty() && !Api26.a(context)) {
            return ImmutableList.u(listE2);
        }
        ImmutableList.Builder builderS = ImmutableList.s();
        builderS.f(listE);
        builderS.f(listE2);
        return builderS.j();
    }

    public static int n0(MediaCodecInfo mediaCodecInfo, Format format) {
        if (format.n0 == -1) {
            return l0(mediaCodecInfo, format);
        }
        List list = format.o0;
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return format.n0 + length;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean B() {
        return this.i2 && Util.f18979a < 23;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final float C(float f, Format[] formatArr) {
        float fMax = -1.0f;
        for (Format format : formatArr) {
            float f2 = format.t0;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final ArrayList D(d dVar, Format format, boolean z2) {
        ImmutableList immutableListM0 = m0(this.C1, dVar, format, z2, this.i2);
        Pattern pattern = MediaCodecUtil.f18180a;
        ArrayList arrayList = new ArrayList(immutableListM0);
        Collections.sort(arrayList, new f(new e(format)));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0173  */
    /* JADX WARN: Instruction removed from duplicated block: B:88:0x0173, please report this as an issue */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final MediaCodecAdapter.Configuration F(MediaCodecInfo mediaCodecInfo, Format format, MediaCrypto mediaCrypto, float f) {
        ColorInfo colorInfo;
        int i2;
        CodecMaxValues codecMaxValues;
        Point point;
        Point point2;
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        byte b2;
        boolean z2;
        Pair pairD;
        int iL0;
        PlaceholderSurface placeholderSurface = this.M1;
        if (placeholderSurface != null && placeholderSurface.X != mediaCodecInfo.f) {
            if (this.L1 == placeholderSurface) {
                this.L1 = null;
            }
            placeholderSurface.release();
            this.M1 = null;
        }
        String str = mediaCodecInfo.f18172c;
        Format[] formatArr = this.i0;
        formatArr.getClass();
        int iMax = format.r0;
        int iN0 = n0(mediaCodecInfo, format);
        int length = formatArr.length;
        float f2 = format.t0;
        int i3 = format.r0;
        ColorInfo colorInfo2 = format.y0;
        int i4 = format.s0;
        if (length == 1) {
            if (iN0 != -1 && (iL0 = l0(mediaCodecInfo, format)) != -1) {
                iN0 = Math.min((int) (iN0 * 1.5f), iL0);
            }
            codecMaxValues = new CodecMaxValues(iMax, i4, iN0);
            colorInfo = colorInfo2;
            i2 = i4;
        } else {
            int iMax2 = i4;
            int i5 = 0;
            boolean z3 = false;
            for (int length2 = formatArr.length; i5 < length2; length2 = length2) {
                Format format2 = formatArr[i5];
                Format[] formatArr2 = formatArr;
                if (colorInfo2 != null && format2.y0 == null) {
                    Format.Builder builderA = format2.a();
                    builderA.f17091w = colorInfo2;
                    format2 = new Format(builderA);
                }
                if (mediaCodecInfo.b(format, format2).d != 0) {
                    int i6 = format2.s0;
                    int i7 = format2.r0;
                    b2 = -1;
                    z3 |= i7 == -1 || i6 == -1;
                    iMax = Math.max(iMax, i7);
                    iMax2 = Math.max(iMax2, i6);
                    iN0 = Math.max(iN0, n0(mediaCodecInfo, format2));
                } else {
                    b2 = -1;
                }
                i5++;
                formatArr = formatArr2;
            }
            if (z3) {
                Log.g("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z4 = i4 > i3;
                int i8 = z4 ? i4 : i3;
                boolean z5 = z4;
                int i9 = z4 ? i3 : i4;
                float f3 = i9 / i8;
                int[] iArr = m2;
                colorInfo = colorInfo2;
                int i10 = 0;
                while (true) {
                    if (i10 < 9) {
                        int i11 = iArr[i10];
                        int i12 = i10;
                        int i13 = (int) (i11 * f3);
                        if (i11 > i8 && i13 > i9) {
                            int i14 = i9;
                            int i15 = i8;
                            if (Util.f18979a >= 21) {
                                int i16 = z5 ? i13 : i11;
                                if (!z5) {
                                    i11 = i13;
                                }
                                android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = mediaCodecInfo.d;
                                if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                    point2 = null;
                                } else {
                                    int widthAlignment = videoCapabilities.getWidthAlignment();
                                    int heightAlignment = videoCapabilities.getHeightAlignment();
                                    point2 = new Point(Util.g(i16, widthAlignment) * widthAlignment, Util.g(i11, heightAlignment) * heightAlignment);
                                }
                                i2 = i4;
                                if (mediaCodecInfo.f(point2.x, point2.y, f2)) {
                                    point = point2;
                                } else {
                                    i10 = i12 + 1;
                                    i4 = i2;
                                    i9 = i14;
                                    i8 = i15;
                                }
                            } else {
                                i2 = i4;
                                try {
                                    int iG = Util.g(i11, 16) * 16;
                                    int iG2 = Util.g(i13, 16) * 16;
                                    if (iG * iG2 <= MediaCodecUtil.i()) {
                                        int i17 = z5 ? iG2 : iG;
                                        if (!z5) {
                                            iG = iG2;
                                        }
                                        point2 = new Point(i17, iG);
                                        point = point2;
                                    } else {
                                        i10 = i12 + 1;
                                        i4 = i2;
                                        i9 = i14;
                                        i8 = i15;
                                    }
                                } catch (MediaCodecUtil.DecoderQueryException unused) {
                                    point = null;
                                }
                            }
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            Format.Builder builderA2 = format.a();
                            builderA2.f17089p = iMax;
                            builderA2.q = iMax2;
                            iN0 = Math.max(iN0, l0(mediaCodecInfo, new Format(builderA2)));
                            Log.g("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                        }
                    }
                    i2 = i4;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        Format.Builder builderA3 = format.a();
                        builderA3.f17089p = iMax;
                        builderA3.q = iMax2;
                        iN0 = Math.max(iN0, l0(mediaCodecInfo, new Format(builderA3)));
                        Log.g("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                    }
                }
            } else {
                colorInfo = colorInfo2;
                i2 = i4;
            }
            codecMaxValues = new CodecMaxValues(iMax, iMax2, iN0);
        }
        this.I1 = codecMaxValues;
        int i18 = this.i2 ? this.j2 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i3);
        mediaFormat.setInteger("height", i2);
        MediaFormatUtil.b(mediaFormat, format.o0);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        MediaFormatUtil.a(mediaFormat, "rotation-degrees", format.u0);
        if (colorInfo != null) {
            ColorInfo colorInfo3 = colorInfo;
            MediaFormatUtil.a(mediaFormat, "color-transfer", colorInfo3.Z);
            MediaFormatUtil.a(mediaFormat, "color-standard", colorInfo3.X);
            MediaFormatUtil.a(mediaFormat, "color-range", colorInfo3.f18991Y);
            byte[] bArr = colorInfo3.e0;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(format.m0) && (pairD = MediaCodecUtil.d(format)) != null) {
            MediaFormatUtil.a(mediaFormat, Scopes.PROFILE, ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", codecMaxValues.f19006a);
        mediaFormat.setInteger("max-height", codecMaxValues.f19007b);
        MediaFormatUtil.a(mediaFormat, "max-input-size", codecMaxValues.f19008c);
        if (Util.f18979a >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.H1) {
            z2 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z2 = true;
        }
        if (i18 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z2);
            mediaFormat.setInteger("audio-session-id", i18);
        }
        if (this.L1 == null) {
            if (!s0(mediaCodecInfo)) {
                throw new IllegalStateException();
            }
            if (this.M1 == null) {
                this.M1 = PlaceholderSurface.c(this.C1, mediaCodecInfo.f);
            }
            this.L1 = this.M1;
        }
        return new MediaCodecAdapter.Configuration(mediaCodecInfo, mediaFormat, format, this.L1, mediaCrypto);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void H(DecoderInputBuffer decoderInputBuffer) {
        if (this.K1) {
            ByteBuffer byteBuffer = decoderInputBuffer.g0;
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
                        MediaCodecAdapter mediaCodecAdapter = this.G0;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        mediaCodecAdapter.a(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void L(Exception exc) {
        Log.d("MediaCodecVideoRenderer", "Video codec error", exc);
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.E1;
        Handler handler = eventDispatcher.f19024a;
        if (handler != null) {
            handler.post(new a(2, eventDispatcher, exc));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void M(String str, long j, long j2) {
        String str2;
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.E1;
        Handler handler = eventDispatcher.f19024a;
        if (handler != null) {
            str2 = str;
            handler.post(new androidx.media3.exoplayer.audio.d(eventDispatcher, str2, j, j2, 3));
        } else {
            str2 = str;
        }
        this.J1 = k0(str2);
        MediaCodecInfo mediaCodecInfo = this.N0;
        mediaCodecInfo.getClass();
        boolean z2 = false;
        if (Util.f18979a >= 29 && "video/x-vnd.on2.vp9".equals(mediaCodecInfo.f18171b)) {
            android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = mediaCodecInfo.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new android.media.MediaCodecInfo.CodecProfileLevel[0];
            }
            for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z2 = true;
                    break;
                }
            }
        }
        this.K1 = z2;
        if (Util.f18979a < 23 || !this.i2) {
            return;
        }
        MediaCodecAdapter mediaCodecAdapter = this.G0;
        mediaCodecAdapter.getClass();
        this.k2 = new OnFrameRenderedListenerV23(mediaCodecAdapter);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void N(String str) {
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.E1;
        Handler handler = eventDispatcher.f19024a;
        if (handler != null) {
            handler.post(new a(1, eventDispatcher, str));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final DecoderReuseEvaluation O(FormatHolder formatHolder) {
        DecoderReuseEvaluation decoderReuseEvaluationO = super.O(formatHolder);
        Format format = formatHolder.f17094b;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.E1;
        Handler handler = eventDispatcher.f19024a;
        if (handler != null) {
            handler.post(new H0(eventDispatcher, format, decoderReuseEvaluationO, 11));
        }
        return decoderReuseEvaluationO;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void P(Format format, MediaFormat mediaFormat) {
        MediaCodecAdapter mediaCodecAdapter = this.G0;
        if (mediaCodecAdapter != null) {
            mediaCodecAdapter.setVideoScalingMode(this.O1);
        }
        if (this.i2) {
            this.d2 = format.r0;
            this.e2 = format.s0;
        } else {
            mediaFormat.getClass();
            boolean z2 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.d2 = z2 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.e2 = z2 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f = format.v0;
        this.g2 = f;
        int i2 = Util.f18979a;
        int i3 = format.u0;
        if (i2 < 21) {
            this.f2 = i3;
        } else if (i3 == 90 || i3 == 270) {
            int i4 = this.d2;
            this.d2 = this.e2;
            this.e2 = i4;
            this.g2 = 1.0f / f;
        }
        float f2 = format.t0;
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.D1;
        videoFrameReleaseHelper.f = f2;
        FixedFrameRateEstimator fixedFrameRateEstimator = videoFrameReleaseHelper.f19013a;
        fixedFrameRateEstimator.f18993a.c();
        fixedFrameRateEstimator.f18994b.c();
        fixedFrameRateEstimator.f18995c = false;
        fixedFrameRateEstimator.d = -9223372036854775807L;
        fixedFrameRateEstimator.f18996e = 0;
        videoFrameReleaseHelper.b();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void R(long j) {
        super.R(j);
        if (this.i2) {
            return;
        }
        this.X1--;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void S() {
        j0();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void T(DecoderInputBuffer decoderInputBuffer) {
        boolean z2 = this.i2;
        if (!z2) {
            this.X1++;
        }
        if (Util.f18979a >= 23 || !z2) {
            return;
        }
        long j = decoderInputBuffer.f0;
        i0(j);
        p0();
        this.x1.f17429e++;
        o0();
        R(j);
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0270  */
    /* JADX WARN: Code duplicated, block: B:157:0x0274  */
    /* JADX WARN: Code duplicated, block: B:158:0x0277  */
    /* JADX WARN: Code duplicated, block: B:162:0x027f  */
    /* JADX WARN: Code duplicated, block: B:164:0x0282 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x0284  */
    /* JADX WARN: Code duplicated, block: B:166:0x028a  */
    /* JADX WARN: Code duplicated, block: B:169:0x029e  */
    /* JADX WARN: Code duplicated, block: B:171:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:173:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:175:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:176:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:178:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:183:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:185:0x02da  */
    /* JADX WARN: Code duplicated, block: B:187:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:194:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean V(long j, long j2, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i2, int i3, int i4, long j3, boolean z2, boolean z3, Format format) throws ExoPlaybackException {
        long j4;
        long j5;
        boolean z4;
        byte b2;
        boolean z5;
        boolean z6;
        boolean z7;
        VideoFrameMetadataListener videoFrameMetadataListener;
        VideoFrameMetadataListener videoFrameMetadataListener2;
        long j6;
        boolean z8;
        boolean z9;
        long j7;
        long j8;
        boolean z10;
        mediaCodecAdapter.getClass();
        if (this.S1 == -9223372036854775807L) {
            this.S1 = j;
        }
        if (j3 != this.Y1) {
            VideoFrameReleaseHelper videoFrameReleaseHelper = this.D1;
            j4 = -9223372036854775807L;
            long j9 = videoFrameReleaseHelper.f19020n;
            if (j9 != -1) {
                videoFrameReleaseHelper.f19021p = j9;
                videoFrameReleaseHelper.q = videoFrameReleaseHelper.o;
            }
            videoFrameReleaseHelper.m++;
            long j10 = j3 * 1000;
            FixedFrameRateEstimator fixedFrameRateEstimator = videoFrameReleaseHelper.f19013a;
            fixedFrameRateEstimator.f18993a.b(j10);
            if (fixedFrameRateEstimator.f18993a.a()) {
                fixedFrameRateEstimator.f18995c = false;
                j5 = 0;
            } else {
                j5 = 0;
                if (fixedFrameRateEstimator.d != -9223372036854775807L) {
                    if (fixedFrameRateEstimator.f18995c) {
                        FixedFrameRateEstimator.Matcher matcher = fixedFrameRateEstimator.f18994b;
                        long j11 = matcher.d;
                        if (j11 == 0) {
                            z10 = false;
                        } else {
                            z10 = matcher.g[(int) ((j11 - 1) % 15)];
                        }
                        if (z10) {
                            fixedFrameRateEstimator.f18994b.c();
                            fixedFrameRateEstimator.f18994b.b(fixedFrameRateEstimator.d);
                        }
                    } else {
                        fixedFrameRateEstimator.f18994b.c();
                        fixedFrameRateEstimator.f18994b.b(fixedFrameRateEstimator.d);
                    }
                    fixedFrameRateEstimator.f18995c = true;
                    fixedFrameRateEstimator.f18994b.b(j10);
                }
            }
            if (fixedFrameRateEstimator.f18995c && fixedFrameRateEstimator.f18994b.a()) {
                FixedFrameRateEstimator.Matcher matcher2 = fixedFrameRateEstimator.f18993a;
                fixedFrameRateEstimator.f18993a = fixedFrameRateEstimator.f18994b;
                fixedFrameRateEstimator.f18994b = matcher2;
                fixedFrameRateEstimator.f18995c = false;
            }
            fixedFrameRateEstimator.d = j10;
            fixedFrameRateEstimator.f18996e = fixedFrameRateEstimator.f18993a.a() ? 0 : fixedFrameRateEstimator.f18996e + 1;
            videoFrameReleaseHelper.b();
            this.Y1 = j3;
        } else {
            j4 = -9223372036854775807L;
            j5 = 0;
        }
        long jG = G();
        long j12 = j3 - jG;
        if (z2 && !z3) {
            t0(mediaCodecAdapter, i2);
            return true;
        }
        double d = this.E0;
        byte b3 = this.g0 == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j13 = (long) ((j3 - j) / d);
        if (b3 != false) {
            j13 -= jElapsedRealtime - j2;
        }
        if (this.L1 == this.M1) {
            if ((j13 < -30000) != false) {
                t0(mediaCodecAdapter, i2);
                v0(j13);
                return true;
            }
        } else {
            long j14 = jElapsedRealtime - this.Z1;
            if (this.R1 ? this.P1 : !(b3 == true || this.Q1)) {
                z4 = true;
                b2 = false;
            } else {
                z4 = true;
                b2 = true;
            }
            if (this.T1 != j4 || j < jG) {
                z5 = false;
            } else {
                if (b2 == false) {
                    if (b3 != false) {
                        if ((!((j13 > (-30000L) ? 1 : (j13 == (-30000L) ? 0 : -1)) < 0 ? z4 : false) || j14 <= 100000) ? false : z4) {
                        }
                    }
                    z5 = false;
                }
                z5 = z4;
            }
            if (z5) {
                long jNanoTime = System.nanoTime();
                VideoFrameMetadataListener videoFrameMetadataListener3 = this.l2;
                if (videoFrameMetadataListener3 != null) {
                    videoFrameMetadataListener3.f(j12, jNanoTime, format, this.I0);
                }
                if (Util.f18979a >= 21) {
                    r0(mediaCodecAdapter, i2, jNanoTime);
                } else {
                    q0(mediaCodecAdapter, i2);
                }
                v0(j13);
                return z4;
            }
            if (b3 != false && j != this.S1) {
                long jNanoTime2 = System.nanoTime();
                long j15 = (j13 * 1000) + jNanoTime2;
                VideoFrameReleaseHelper videoFrameReleaseHelper2 = this.D1;
                if (videoFrameReleaseHelper2.f19021p == r11 || !videoFrameReleaseHelper2.f19013a.f18993a.a()) {
                    videoFrameReleaseHelper2 = videoFrameReleaseHelper2;
                } else {
                    FixedFrameRateEstimator fixedFrameRateEstimator2 = videoFrameReleaseHelper2.f19013a;
                    if (fixedFrameRateEstimator2.f18993a.a()) {
                        FixedFrameRateEstimator.Matcher matcher3 = fixedFrameRateEstimator2.f18993a;
                        long j16 = matcher3.f19000e;
                        j8 = j16 == j5 ? j5 : matcher3.f / j16;
                    } else {
                        j8 = j4;
                    }
                    long j17 = videoFrameReleaseHelper2.q + ((long) (((videoFrameReleaseHelper2.m - videoFrameReleaseHelper2.f19021p) * j8) / videoFrameReleaseHelper2.f19018i));
                    if (Math.abs(j15 - j17) <= 20000000) {
                        j15 = j17;
                    } else {
                        videoFrameReleaseHelper2.m = j5;
                        videoFrameReleaseHelper2.f19021p = -1L;
                        videoFrameReleaseHelper2.f19020n = -1L;
                    }
                }
                videoFrameReleaseHelper2.f19020n = videoFrameReleaseHelper2.m;
                videoFrameReleaseHelper2.o = j15;
                VideoFrameReleaseHelper.VSyncSampler vSyncSampler = videoFrameReleaseHelper2.f19015c;
                if (vSyncSampler != null && videoFrameReleaseHelper2.k != j4) {
                    long j18 = vSyncSampler.X;
                    if (j18 != j4) {
                        long j19 = videoFrameReleaseHelper2.k;
                        long j20 = (((j15 - j18) / j19) * j19) + j18;
                        if (j15 <= j20) {
                            j7 = j20 - j19;
                        } else {
                            j7 = j20;
                            j20 = j19 + j20;
                        }
                        if (j20 - j15 >= j15 - j7) {
                            j20 = j7;
                        }
                        j15 = j20 - videoFrameReleaseHelper2.f19019l;
                    }
                }
                long j21 = j15;
                long j22 = (j21 - jNanoTime2) / 1000;
                boolean z11 = this.T1 != j4 ? z4 : false;
                if ((j22 >= -500000 || z3) ? false : z4) {
                    SampleStream sampleStream = this.h0;
                    sampleStream.getClass();
                    int iSkipData = sampleStream.skipData(j - this.j0);
                    if (iSkipData == 0) {
                        z9 = false;
                    } else {
                        if (z11) {
                            DecoderCounters decoderCounters = this.x1;
                            decoderCounters.d += iSkipData;
                            decoderCounters.f += this.X1;
                        } else {
                            this.x1.j++;
                            u0(iSkipData, this.X1);
                        }
                        if (z()) {
                            J();
                        }
                        z9 = z4;
                    }
                    if (!z9) {
                        if (j22 < -30000) {
                            z6 = z4;
                        } else {
                            z6 = false;
                        }
                        if (z6 || z3) {
                            z7 = false;
                        } else {
                            z7 = z4;
                        }
                        if (z7) {
                            if (z11) {
                                t0(mediaCodecAdapter, i2);
                                z8 = z4;
                            } else {
                                TraceUtil.a("dropVideoBuffer");
                                mediaCodecAdapter.j(i2, false);
                                TraceUtil.b();
                                z8 = z4;
                                u0(0, z8 ? 1 : 0);
                            }
                            v0(j22);
                            return z8;
                        }
                        if (Util.f18979a >= 21) {
                            if (j22 < ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                                if (j21 == this.c2) {
                                    t0(mediaCodecAdapter, i2);
                                    j6 = j21;
                                } else {
                                    videoFrameMetadataListener2 = this.l2;
                                    if (videoFrameMetadataListener2 != null) {
                                        videoFrameMetadataListener2.f(j12, j21, format, this.I0);
                                    }
                                    j6 = j21;
                                    r0(mediaCodecAdapter, i2, j6);
                                }
                                v0(j22);
                                this.c2 = j6;
                                return true;
                            }
                        } else if (j22 < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                            if (j22 > 11000) {
                                try {
                                    Thread.sleep((j22 - 10000) / 1000);
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    return false;
                                }
                            }
                            videoFrameMetadataListener = this.l2;
                            if (videoFrameMetadataListener != null) {
                                videoFrameMetadataListener.f(j12, j21, format, this.I0);
                            }
                            q0(mediaCodecAdapter, i2);
                            v0(j22);
                            return true;
                        }
                    }
                } else {
                    if (j22 < -30000) {
                        z6 = z4;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        if (z11) {
                            t0(mediaCodecAdapter, i2);
                            z8 = z4;
                        } else {
                            TraceUtil.a("dropVideoBuffer");
                            mediaCodecAdapter.j(i2, false);
                            TraceUtil.b();
                            z8 = z4;
                            u0(0, z8 ? 1 : 0);
                        }
                        v0(j22);
                        return z8;
                    }
                    if (Util.f18979a >= 21) {
                        if (j22 < ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                            if (j21 == this.c2) {
                                t0(mediaCodecAdapter, i2);
                                j6 = j21;
                            } else {
                                videoFrameMetadataListener2 = this.l2;
                                if (videoFrameMetadataListener2 != null) {
                                    videoFrameMetadataListener2.f(j12, j21, format, this.I0);
                                }
                                j6 = j21;
                                r0(mediaCodecAdapter, i2, j6);
                            }
                            v0(j22);
                            this.c2 = j6;
                            return true;
                        }
                    } else if (j22 < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                        if (j22 > 11000) {
                            Thread.sleep((j22 - 10000) / 1000);
                        }
                        videoFrameMetadataListener = this.l2;
                        if (videoFrameMetadataListener != null) {
                            videoFrameMetadataListener.f(j12, j21, format, this.I0);
                        }
                        q0(mediaCodecAdapter, i2);
                        v0(j22);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void Z() {
        super.Z();
        this.X1 = 0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    public final void d(float f, float f2) throws ExoPlaybackException {
        super.d(f, f2);
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.D1;
        videoFrameReleaseHelper.f19018i = f;
        videoFrameReleaseHelper.m = 0L;
        videoFrameReleaseHelper.f19021p = -1L;
        videoFrameReleaseHelper.f19020n = -1L;
        videoFrameReleaseHelper.c(false);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean d0(MediaCodecInfo mediaCodecInfo) {
        return this.L1 != null || s0(mediaCodecInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final int f0(d dVar, Format format) {
        boolean z2;
        int i2 = 0;
        if (!"video".equals(com.google.android.exoplayer2.util.MimeTypes.e(format.m0))) {
            return RendererCapabilities.c(0, 0, 0);
        }
        boolean z3 = format.p0 != null;
        Context context = this.C1;
        ImmutableList immutableListM0 = m0(context, dVar, format, z3, false);
        if (z3 && immutableListM0.isEmpty()) {
            immutableListM0 = m0(context, dVar, format, false, false);
        }
        if (immutableListM0.isEmpty()) {
            return RendererCapabilities.c(1, 0, 0);
        }
        int i3 = format.H0;
        if (i3 != 0 && i3 != 2) {
            return RendererCapabilities.c(2, 0, 0);
        }
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) immutableListM0.get(0);
        boolean zD = mediaCodecInfo.d(format);
        if (!zD) {
            int i4 = 1;
            while (true) {
                if (i4 >= immutableListM0.size()) {
                    z2 = true;
                    break;
                }
                MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) immutableListM0.get(i4);
                if (mediaCodecInfo2.d(format)) {
                    zD = true;
                    z2 = false;
                    mediaCodecInfo = mediaCodecInfo2;
                    break;
                }
                i4++;
            }
        } else {
            z2 = true;
            break;
        }
        int i5 = zD ? 4 : 3;
        int i6 = mediaCodecInfo.e(format) ? 16 : 8;
        int i7 = mediaCodecInfo.g ? 64 : 0;
        int i8 = z2 ? 128 : 0;
        if (Util.f18979a >= 26 && "video/dolby-vision".equals(format.m0) && !Api26.a(context)) {
            i8 = 256;
        }
        if (zD) {
            ImmutableList immutableListM1 = m0(context, dVar, format, z3, true);
            if (!immutableListM1.isEmpty()) {
                Pattern pattern = MediaCodecUtil.f18180a;
                ArrayList arrayList = new ArrayList(immutableListM1);
                Collections.sort(arrayList, new f(new e(format)));
                MediaCodecInfo mediaCodecInfo3 = (MediaCodecInfo) arrayList.get(0);
                if (mediaCodecInfo3.d(format) && mediaCodecInfo3.e(format)) {
                    i2 = 32;
                }
            }
        }
        return i5 | i6 | i2 | i7 | i8;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.exoplayer2.mediacodec.MediaCodecAdapter] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.google.android.exoplayer2.video.PlaceholderSurface] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    public final void handleMessage(int i2, Object obj) throws ExoPlaybackException {
        ?? C;
        Handler handler;
        Handler handler2;
        Surface surface;
        int iIntValue;
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.D1;
        if (i2 != 1) {
            if (i2 == 7) {
                this.l2 = (VideoFrameMetadataListener) obj;
                return;
            }
            if (i2 == 10) {
                int iIntValue2 = ((Integer) obj).intValue();
                if (this.j2 != iIntValue2) {
                    this.j2 = iIntValue2;
                    if (this.i2) {
                        X();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i2 != 4) {
                if (i2 == 5 && videoFrameReleaseHelper.j != (iIntValue = ((Integer) obj).intValue())) {
                    videoFrameReleaseHelper.j = iIntValue;
                    videoFrameReleaseHelper.c(true);
                    return;
                }
                return;
            }
            int iIntValue3 = ((Integer) obj).intValue();
            this.O1 = iIntValue3;
            MediaCodecAdapter mediaCodecAdapter = this.G0;
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.setVideoScalingMode(iIntValue3);
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            C = 0;
        }
        if (C == 0) {
            PlaceholderSurface placeholderSurface = this.M1;
            if (placeholderSurface != null) {
                C = surface;
                C = placeholderSurface;
            } else {
                MediaCodecInfo mediaCodecInfo = this.N0;
                if (mediaCodecInfo != null && s0(mediaCodecInfo)) {
                    C = surface;
                    C = PlaceholderSurface.c(this.C1, mediaCodecInfo.f);
                    this.M1 = C;
                }
            }
        }
        C = surface;
        C = surface;
        C = surface;
        Surface surface2 = this.L1;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.E1;
        if (surface2 == C) {
            if (C == 0 || C == this.M1) {
                return;
            }
            VideoSize videoSize = this.h2;
            if (videoSize != null && (handler = eventDispatcher.f19024a) != null) {
                handler.post(new a(0, eventDispatcher, videoSize));
            }
            if (this.N1) {
                Surface surface3 = this.L1;
                Handler handler3 = eventDispatcher.f19024a;
                if (handler3 != null) {
                    handler3.post(new t0(eventDispatcher, surface3, SystemClock.elapsedRealtime(), 3));
                    return;
                }
                return;
            }
            return;
        }
        this.L1 = C;
        videoFrameReleaseHelper.getClass();
        ?? r10 = C instanceof PlaceholderSurface ? 0 : C;
        if (videoFrameReleaseHelper.f19016e != r10) {
            videoFrameReleaseHelper.a();
            videoFrameReleaseHelper.f19016e = r10;
            videoFrameReleaseHelper.c(true);
        }
        this.N1 = false;
        int i3 = this.g0;
        ?? r0 = this.G0;
        if (r0 != 0) {
            if (Util.f18979a < 23 || C == 0 || this.J1) {
                X();
                J();
            } else {
                r0.f(C);
            }
        }
        if (C == 0 || C == this.M1) {
            this.h2 = null;
            j0();
            return;
        }
        VideoSize videoSize2 = this.h2;
        if (videoSize2 != null && (handler2 = eventDispatcher.f19024a) != null) {
            handler2.post(new a(0, eventDispatcher, videoSize2));
        }
        j0();
        if (i3 == 2) {
            long j = this.F1;
            this.T1 = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    public final boolean isReady() {
        PlaceholderSurface placeholderSurface;
        if (super.isReady() && (this.P1 || (((placeholderSurface = this.M1) != null && this.L1 == placeholderSurface) || this.G0 == null || this.i2))) {
            this.T1 = -9223372036854775807L;
            return true;
        }
        if (this.T1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.T1) {
            return true;
        }
        this.T1 = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void j() {
        DecoderCounters decoderCounters;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.E1;
        this.h2 = null;
        j0();
        this.N1 = false;
        this.k2 = null;
        try {
            super.j();
            decoderCounters = this.x1;
            eventDispatcher.getClass();
            synchronized (decoderCounters) {
            }
        } finally {
            decoderCounters = this.x1;
            eventDispatcher.getClass();
            synchronized (decoderCounters) {
                Handler handler = eventDispatcher.f19024a;
                if (handler != null) {
                    handler.post(new c(eventDispatcher, decoderCounters, 0));
                }
            }
        }
    }

    public final void j0() {
        MediaCodecAdapter mediaCodecAdapter;
        this.P1 = false;
        if (Util.f18979a < 23 || !this.i2 || (mediaCodecAdapter = this.G0) == null) {
            return;
        }
        this.k2 = new OnFrameRenderedListenerV23(mediaCodecAdapter);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void k(boolean z2, boolean z3) {
        super.k(z2, z3);
        RendererConfiguration rendererConfiguration = this.Z;
        rendererConfiguration.getClass();
        boolean z4 = rendererConfiguration.f17197a;
        Assertions.d((z4 && this.j2 == 0) ? false : true);
        if (this.i2 != z4) {
            this.i2 = z4;
            X();
        }
        DecoderCounters decoderCounters = this.x1;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.E1;
        Handler handler = eventDispatcher.f19024a;
        if (handler != null) {
            handler.post(new c(eventDispatcher, decoderCounters, 1));
        }
        this.Q1 = z3;
        this.R1 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void l(long j, boolean z2) {
        super.l(j, z2);
        j0();
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.D1;
        videoFrameReleaseHelper.m = 0L;
        videoFrameReleaseHelper.f19021p = -1L;
        videoFrameReleaseHelper.f19020n = -1L;
        this.Y1 = -9223372036854775807L;
        this.S1 = -9223372036854775807L;
        this.W1 = 0;
        if (!z2) {
            this.T1 = -9223372036854775807L;
        } else {
            long j2 = this.F1;
            this.T1 = j2 > 0 ? SystemClock.elapsedRealtime() + j2 : -9223372036854775807L;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void m() {
        PlaceholderSurface placeholderSurface;
        try {
            super.m();
            placeholderSurface = this.M1;
            if (placeholderSurface != null) {
                if (this.L1 == placeholderSurface) {
                    this.L1 = null;
                }
            }
        } finally {
            if (this.M1 != null) {
                Surface surface = this.L1;
                placeholderSurface = this.M1;
                if (surface == placeholderSurface) {
                    this.L1 = null;
                }
                placeholderSurface.release();
                this.M1 = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void n() {
        this.V1 = 0;
        this.U1 = SystemClock.elapsedRealtime();
        this.Z1 = SystemClock.elapsedRealtime() * 1000;
        this.a2 = 0L;
        this.b2 = 0;
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.D1;
        videoFrameReleaseHelper.d = true;
        videoFrameReleaseHelper.m = 0L;
        videoFrameReleaseHelper.f19021p = -1L;
        videoFrameReleaseHelper.f19020n = -1L;
        VideoFrameReleaseHelper.DisplayHelper displayHelper = videoFrameReleaseHelper.f19014b;
        if (displayHelper != null) {
            VideoFrameReleaseHelper.VSyncSampler vSyncSampler = videoFrameReleaseHelper.f19015c;
            vSyncSampler.getClass();
            vSyncSampler.f19023Y.sendEmptyMessage(1);
            displayHelper.a(new C0880a0(videoFrameReleaseHelper, 13));
        }
        videoFrameReleaseHelper.c(false);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void o() {
        this.T1 = -9223372036854775807L;
        int i2 = this.V1;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.E1;
        if (i2 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.U1;
            int i3 = this.V1;
            Handler handler = eventDispatcher.f19024a;
            if (handler != null) {
                handler.post(new b(eventDispatcher, i3, j));
            }
            this.V1 = 0;
            this.U1 = jElapsedRealtime;
        }
        int i4 = this.b2;
        if (i4 != 0) {
            long j2 = this.a2;
            Handler handler2 = eventDispatcher.f19024a;
            if (handler2 != null) {
                handler2.post(new b(eventDispatcher, j2, i4));
            }
            this.a2 = 0L;
            this.b2 = 0;
        }
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.D1;
        videoFrameReleaseHelper.d = false;
        VideoFrameReleaseHelper.DisplayHelper displayHelper = videoFrameReleaseHelper.f19014b;
        if (displayHelper != null) {
            displayHelper.b();
            VideoFrameReleaseHelper.VSyncSampler vSyncSampler = videoFrameReleaseHelper.f19015c;
            vSyncSampler.getClass();
            vSyncSampler.f19023Y.sendEmptyMessage(2);
        }
        videoFrameReleaseHelper.a();
    }

    public final void o0() {
        this.R1 = true;
        if (this.P1) {
            return;
        }
        this.P1 = true;
        Surface surface = this.L1;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.E1;
        Handler handler = eventDispatcher.f19024a;
        if (handler != null) {
            handler.post(new t0(eventDispatcher, surface, SystemClock.elapsedRealtime(), 3));
        }
        this.N1 = true;
    }

    public final void p0() {
        int i2 = this.d2;
        if (i2 == -1 && this.e2 == -1) {
            return;
        }
        VideoSize videoSize = this.h2;
        if (videoSize != null && videoSize.X == i2 && videoSize.f19026Y == this.e2 && videoSize.Z == this.f2 && videoSize.e0 == this.g2) {
            return;
        }
        VideoSize videoSize2 = new VideoSize(this.d2, this.e2, this.f2, this.g2);
        this.h2 = videoSize2;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.E1;
        Handler handler = eventDispatcher.f19024a;
        if (handler != null) {
            handler.post(new a(0, eventDispatcher, videoSize2));
        }
    }

    public final void q0(MediaCodecAdapter mediaCodecAdapter, int i2) {
        p0();
        TraceUtil.a("releaseOutputBuffer");
        mediaCodecAdapter.j(i2, true);
        TraceUtil.b();
        this.Z1 = SystemClock.elapsedRealtime() * 1000;
        this.x1.f17429e++;
        this.W1 = 0;
        o0();
    }

    public final void r0(MediaCodecAdapter mediaCodecAdapter, int i2, long j) {
        p0();
        TraceUtil.a("releaseOutputBuffer");
        mediaCodecAdapter.g(i2, j);
        TraceUtil.b();
        this.Z1 = SystemClock.elapsedRealtime() * 1000;
        this.x1.f17429e++;
        this.W1 = 0;
        o0();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final DecoderReuseEvaluation s(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        DecoderReuseEvaluation decoderReuseEvaluationB = mediaCodecInfo.b(format, format2);
        CodecMaxValues codecMaxValues = this.I1;
        int i2 = codecMaxValues.f19006a;
        int i3 = decoderReuseEvaluationB.f17438e;
        if (format2.r0 > i2 || format2.s0 > codecMaxValues.f19007b) {
            i3 |= 256;
        }
        if (n0(mediaCodecInfo, format2) > this.I1.f19008c) {
            i3 |= 64;
        }
        int i4 = i3;
        return new DecoderReuseEvaluation(mediaCodecInfo.f18170a, format, format2, i4 != 0 ? 0 : decoderReuseEvaluationB.d, i4);
    }

    public final boolean s0(MediaCodecInfo mediaCodecInfo) {
        if (Util.f18979a < 23 || this.i2 || k0(mediaCodecInfo.f18170a)) {
            return false;
        }
        return !mediaCodecInfo.f || PlaceholderSurface.b(this.C1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final MediaCodecDecoderException t(IllegalStateException illegalStateException, MediaCodecInfo mediaCodecInfo) {
        Surface surface = this.L1;
        MediaCodecVideoDecoderException mediaCodecVideoDecoderException = new MediaCodecVideoDecoderException(illegalStateException, mediaCodecInfo);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecVideoDecoderException;
    }

    public final void t0(MediaCodecAdapter mediaCodecAdapter, int i2) {
        TraceUtil.a("skipVideoBuffer");
        mediaCodecAdapter.j(i2, false);
        TraceUtil.b();
        this.x1.f++;
    }

    public final void u0(int i2, int i3) {
        int i4;
        DecoderCounters decoderCounters = this.x1;
        decoderCounters.f17430h += i2;
        int i5 = i2 + i3;
        decoderCounters.g += i5;
        this.V1 += i5;
        int i6 = this.W1 + i5;
        this.W1 = i6;
        decoderCounters.f17431i = Math.max(i6, decoderCounters.f17431i);
        int i7 = this.G1;
        if (i7 <= 0 || (i4 = this.V1) < i7 || i4 <= 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.U1;
        int i8 = this.V1;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.E1;
        Handler handler = eventDispatcher.f19024a;
        if (handler != null) {
            handler.post(new b(eventDispatcher, i8, j));
        }
        this.V1 = 0;
        this.U1 = jElapsedRealtime;
    }

    public final void v0(long j) {
        DecoderCounters decoderCounters = this.x1;
        decoderCounters.k += j;
        decoderCounters.f17432l++;
        this.a2 += j;
        this.b2++;
    }
}
