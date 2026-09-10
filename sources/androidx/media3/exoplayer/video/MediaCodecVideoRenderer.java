package androidx.media3.exoplayer.video;

import A.RunnableC0887e;
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
import android.os.Trace;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.google.android.gms.common.Scopes;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.MoreExecutors;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.p004ironsource.d9;
import com.smartdigimkt.sdk.basead.ui.animplayerview.scale.AlbumScaleMainView;
import com.thinkup.core.common.n.mo;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.MimeTypes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecVideoRenderer extends MediaCodecRenderer implements VideoFrameReleaseControl.FrameTimingEvaluator {
    public static final int[] l2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean m2;
    public static boolean n2;
    public final Context F1;
    public final boolean G1;
    public final VideoRendererEventListener.EventDispatcher H1;
    public final int I1;
    public final boolean J1;
    public final VideoFrameReleaseControl K1;
    public final VideoFrameReleaseControl.FrameReleaseInfo L1;
    public CodecMaxValues M1;
    public boolean N1;
    public boolean O1;
    public VideoSink P1;
    public boolean Q1;
    public List R1;
    public Surface S1;
    public PlaceholderSurface T1;
    public Size U1;
    public boolean V1;
    public int W1;
    public long X1;
    public int Y1;
    public int Z1;
    public int a2;
    public long b2;
    public int c2;
    public long d2;
    public VideoSize e2;
    public VideoSize f2;
    public int g2;
    public boolean h2;
    public int i2;
    public OnFrameRenderedListenerV23 j2;
    public VideoFrameMetadataListener k2;

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
        public final int f6634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6636c;

        public CodecMaxValues(int i2, int i3, int i4) {
            this.f6634a = i2;
            this.f6635b = i3;
            this.f6636c = i4;
        }
    }

    public final class OnFrameRenderedListenerV23 implements MediaCodecAdapter.OnFrameRenderedListener, Handler.Callback {
        public final Handler X;

        public OnFrameRenderedListenerV23(MediaCodecAdapter mediaCodecAdapter) {
            Handler handlerM = Util.m(this);
            this.X = handlerM;
            mediaCodecAdapter.m(this, handlerM);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener
        public final void a(long j) {
            if (Util.f5683a >= 30) {
                b(j);
            } else {
                Handler handler = this.X;
                handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
            }
        }

        public final void b(long j) {
            Surface surface;
            MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
            if (this != mediaCodecVideoRenderer.j2 || mediaCodecVideoRenderer.L0 == null) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                mediaCodecVideoRenderer.y1 = true;
                return;
            }
            try {
                mediaCodecVideoRenderer.s0(j);
                mediaCodecVideoRenderer.y0(mediaCodecVideoRenderer.e2);
                mediaCodecVideoRenderer.A1.f5826e++;
                VideoFrameReleaseControl videoFrameReleaseControl = mediaCodecVideoRenderer.K1;
                boolean z2 = videoFrameReleaseControl.d != 3;
                videoFrameReleaseControl.d = 3;
                videoFrameReleaseControl.k.getClass();
                videoFrameReleaseControl.f = Util.I(SystemClock.elapsedRealtime());
                if (z2 && (surface = mediaCodecVideoRenderer.S1) != null) {
                    VideoRendererEventListener.EventDispatcher eventDispatcher = mediaCodecVideoRenderer.H1;
                    Handler handler = eventDispatcher.f6666a;
                    if (handler != null) {
                        handler.post(new t0(eventDispatcher, surface, SystemClock.elapsedRealtime(), 1));
                    }
                    mediaCodecVideoRenderer.V1 = true;
                }
                mediaCodecVideoRenderer.a0(j);
            } catch (ExoPlaybackException e2) {
                mediaCodecVideoRenderer.z1 = e2;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i2 = message.arg1;
            int i3 = message.arg2;
            int i4 = Util.f5683a;
            b(((((long) i2) & 4294967295L) << 32) | (4294967295L & ((long) i3)));
            return true;
        }
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, Handler handler, VideoRendererEventListener videoRendererEventListener) {
        super(2, factory, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.F1 = applicationContext;
        this.I1 = 50;
        this.H1 = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.G1 = true;
        this.K1 = new VideoFrameReleaseControl(applicationContext, this);
        this.L1 = new VideoFrameReleaseControl.FrameReleaseInfo();
        this.J1 = "NVIDIA".equals(Util.f5685c);
        this.U1 = Size.f5671c;
        this.W1 = 1;
        this.e2 = VideoSize.f5552e;
        this.i2 = 0;
        this.f2 = null;
        this.g2 = -1000;
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
    public static boolean t0(String str) {
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
                if (!m2) {
                    int i2 = Util.f5683a;
                    if (i2 <= 28) {
                        String str4 = Util.f5684b;
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
                                if (i2 <= 27 || !"HWEML".equals(Util.f5684b)) {
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
                                                str3 = Util.f5684b;
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
                                    str3 = Util.f5684b;
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
                                    str3 = Util.f5684b;
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
                    n2 = z2;
                    m2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return n2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int u0(MediaCodecInfo mediaCodecInfo, Format format) {
        int i2;
        int iIntValue;
        byte b2 = 2;
        int i3 = format.s;
        if (i3 != -1 && (i2 = format.t) != -1) {
            String str = format.m;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair pairD = MediaCodecUtil.d(format);
                str = (pairD == null || !((iIntValue = ((Integer) pairD.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
            }
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
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Util.f5685c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !mediaCodecInfo.f)))) {
                        return ((Util.f(i2, 16) * Util.f(i3, 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    return ((i3 * i2) * 3) / 8;
            }
        }
        return -1;
    }

    public static List v0(Context context, androidx.media3.exoplayer.mediacodec.d dVar, Format format, boolean z2, boolean z3) {
        List listE;
        String str = format.m;
        if (str == null) {
            return ImmutableList.x();
        }
        if (Util.f5683a >= 26 && "video/dolby-vision".equals(str) && !Api26.a(context)) {
            String strB = MediaCodecUtil.b(format);
            if (strB == null) {
                listE = ImmutableList.x();
            } else {
                dVar.getClass();
                listE = MediaCodecUtil.e(strB, z2, z3);
            }
            if (!listE.isEmpty()) {
                return listE;
            }
        }
        return MediaCodecUtil.g(dVar, format, z2, z3);
    }

    public static int w0(MediaCodecInfo mediaCodecInfo, Format format) {
        if (format.f5413n == -1) {
            return u0(mediaCodecInfo, format);
        }
        List list = format.f5414p;
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return format.f5413n + length;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final MediaCodecDecoderException A(IllegalStateException illegalStateException, MediaCodecInfo mediaCodecInfo) {
        Surface surface = this.S1;
        MediaCodecVideoDecoderException mediaCodecVideoDecoderException = new MediaCodecVideoDecoderException(illegalStateException, mediaCodecInfo);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecVideoDecoderException;
    }

    public final void A0() {
        Surface surface = this.S1;
        PlaceholderSurface placeholderSurface = this.T1;
        if (surface == placeholderSurface) {
            this.S1 = null;
        }
        if (placeholderSurface != null) {
            placeholderSurface.release();
            this.T1 = null;
        }
    }

    public final void B0(MediaCodecAdapter mediaCodecAdapter, int i2) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.j(i2, true);
        Trace.endSection();
        this.A1.f5826e++;
        this.Z1 = 0;
        if (this.P1 == null) {
            y0(this.e2);
            VideoFrameReleaseControl videoFrameReleaseControl = this.K1;
            boolean z2 = videoFrameReleaseControl.d != 3;
            videoFrameReleaseControl.d = 3;
            videoFrameReleaseControl.k.getClass();
            videoFrameReleaseControl.f = Util.I(SystemClock.elapsedRealtime());
            if (!z2 || (surface = this.S1) == null) {
                return;
            }
            VideoRendererEventListener.EventDispatcher eventDispatcher = this.H1;
            Handler handler = eventDispatcher.f6666a;
            if (handler != null) {
                handler.post(new t0(eventDispatcher, surface, SystemClock.elapsedRealtime(), 1));
            }
            this.V1 = true;
        }
    }

    public final void C0(MediaCodecAdapter mediaCodecAdapter, int i2, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.g(i2, j);
        Trace.endSection();
        this.A1.f5826e++;
        this.Z1 = 0;
        if (this.P1 == null) {
            y0(this.e2);
            VideoFrameReleaseControl videoFrameReleaseControl = this.K1;
            boolean z2 = videoFrameReleaseControl.d != 3;
            videoFrameReleaseControl.d = 3;
            videoFrameReleaseControl.k.getClass();
            videoFrameReleaseControl.f = Util.I(SystemClock.elapsedRealtime());
            if (!z2 || (surface = this.S1) == null) {
                return;
            }
            VideoRendererEventListener.EventDispatcher eventDispatcher = this.H1;
            Handler handler = eventDispatcher.f6666a;
            if (handler != null) {
                handler.post(new t0(eventDispatcher, surface, SystemClock.elapsedRealtime(), 1));
            }
            this.V1 = true;
        }
    }

    public final boolean D0(MediaCodecInfo mediaCodecInfo) {
        if (Util.f5683a < 23 || this.h2 || t0(mediaCodecInfo.f6292a)) {
            return false;
        }
        return !mediaCodecInfo.f || PlaceholderSurface.a(this.F1);
    }

    public final void E0(MediaCodecAdapter mediaCodecAdapter, int i2) {
        Trace.beginSection("skipVideoBuffer");
        mediaCodecAdapter.j(i2, false);
        Trace.endSection();
        this.A1.f++;
    }

    public final void F0(int i2, int i3) {
        DecoderCounters decoderCounters = this.A1;
        decoderCounters.f5827h += i2;
        int i4 = i2 + i3;
        decoderCounters.g += i4;
        this.Y1 += i4;
        int i5 = this.Z1 + i4;
        this.Z1 = i5;
        decoderCounters.f5828i = Math.max(i5, decoderCounters.f5828i);
        int i6 = this.I1;
        if (i6 <= 0 || this.Y1 < i6) {
            return;
        }
        x0();
    }

    public final void G0(long j) {
        DecoderCounters decoderCounters = this.A1;
        decoderCounters.k += j;
        decoderCounters.f5829l++;
        this.b2 += j;
        this.c2++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final int I(DecoderInputBuffer decoderInputBuffer) {
        return (Util.f5683a < 34 || !this.h2 || decoderInputBuffer.g0 >= this.m0) ? 0 : 32;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean J() {
        return this.h2 && Util.f5683a < 23;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final float K(float f, Format[] formatArr) {
        float fMax = -1.0f;
        for (Format format : formatArr) {
            float f2 = format.f5415u;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final ArrayList L(androidx.media3.exoplayer.mediacodec.d dVar, Format format, boolean z2) {
        List listV0 = v0(this.F1, dVar, format, z2, this.h2);
        Pattern pattern = MediaCodecUtil.f6305a;
        ArrayList arrayList = new ArrayList(listV0);
        Collections.sort(arrayList, new androidx.media3.exoplayer.mediacodec.f(new androidx.media3.exoplayer.mediacodec.e(format)));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x017b  */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x017b, please report this as an issue */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final MediaCodecAdapter.Configuration M(MediaCodecInfo mediaCodecInfo, Format format, MediaCrypto mediaCrypto, float f) {
        boolean z2;
        ColorInfo colorInfo;
        int i2;
        int iMax;
        CodecMaxValues codecMaxValues;
        Point point;
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        byte b2;
        boolean z3;
        Pair pairD;
        int iU0;
        PlaceholderSurface placeholderSurface = this.T1;
        boolean z4 = mediaCodecInfo.f;
        if (placeholderSurface != null && placeholderSurface.X != z4) {
            A0();
        }
        String str = mediaCodecInfo.f6294c;
        Format[] formatArr = this.k0;
        formatArr.getClass();
        int iMax2 = format.s;
        int iW0 = w0(mediaCodecInfo, format);
        int length = formatArr.length;
        float f2 = format.f5415u;
        int i3 = format.s;
        ColorInfo colorInfo2 = format.f5417z;
        int i4 = format.t;
        if (length == 1) {
            if (iW0 != -1 && (iU0 = u0(mediaCodecInfo, format)) != -1) {
                iW0 = Math.min((int) (iW0 * 1.5f), iU0);
            }
            z2 = z4;
            codecMaxValues = new CodecMaxValues(iMax2, i4, iW0);
            colorInfo = colorInfo2;
            i2 = i4;
        } else {
            int length2 = formatArr.length;
            int iMax3 = i4;
            int i5 = 0;
            boolean z5 = false;
            while (i5 < length2) {
                Format format2 = formatArr[i5];
                Format[] formatArr2 = formatArr;
                if (colorInfo2 != null && format2.f5417z == null) {
                    Format.Builder builderA = format2.a();
                    builderA.y = colorInfo2;
                    format2 = new Format(builderA);
                }
                if (mediaCodecInfo.b(format, format2).d != 0) {
                    int i6 = format2.t;
                    int i7 = format2.s;
                    b2 = -1;
                    z5 |= i7 == -1 || i6 == -1;
                    iMax2 = Math.max(iMax2, i7);
                    iMax3 = Math.max(iMax3, i6);
                    iW0 = Math.max(iW0, w0(mediaCodecInfo, format2));
                } else {
                    b2 = -1;
                }
                length2 = length2;
                i5++;
                formatArr = formatArr2;
            }
            int i8 = iMax3;
            if (z5) {
                Log.g("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax2 + "x" + i8);
                boolean z6 = i4 > i3;
                boolean z7 = z6;
                int i9 = z6 ? i4 : i3;
                z2 = z4;
                int i10 = z7 ? i3 : i4;
                float f3 = i10 / i9;
                int[] iArr = l2;
                colorInfo = colorInfo2;
                int i11 = 0;
                while (true) {
                    if (i11 < 9) {
                        int i12 = iArr[i11];
                        int i13 = i11;
                        int i14 = (int) (i12 * f3);
                        if (i12 > i9 && i14 > i10) {
                            int i15 = i10;
                            int i16 = i9;
                            if (Util.f5683a >= 21) {
                                int i17 = z7 ? i14 : i12;
                                if (!z7) {
                                    i12 = i14;
                                }
                                android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = mediaCodecInfo.d;
                                if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                    point = null;
                                } else {
                                    int widthAlignment = videoCapabilities.getWidthAlignment();
                                    int heightAlignment = videoCapabilities.getHeightAlignment();
                                    point = new Point(Util.f(i17, widthAlignment) * widthAlignment, Util.f(i12, heightAlignment) * heightAlignment);
                                }
                                if (point != null) {
                                    i2 = i4;
                                    if (mediaCodecInfo.f(point.x, point.y, f2)) {
                                    }
                                } else {
                                    i2 = i4;
                                }
                                i11 = i13 + 1;
                                i4 = i2;
                                i10 = i15;
                                i9 = i16;
                            } else {
                                i2 = i4;
                                try {
                                    int iF = Util.f(i12, 16) * 16;
                                    int iF2 = Util.f(i14, 16) * 16;
                                    if (iF * iF2 <= MediaCodecUtil.j()) {
                                        int i18 = z7 ? iF2 : iF;
                                        if (!z7) {
                                            iF = iF2;
                                        }
                                        point = new Point(i18, iF);
                                    } else {
                                        i11 = i13 + 1;
                                        i4 = i2;
                                        i10 = i15;
                                        i9 = i16;
                                    }
                                } catch (MediaCodecUtil.DecoderQueryException unused) {
                                    point = null;
                                }
                            }
                        }
                        if (point != null) {
                            iMax2 = Math.max(iMax2, point.x);
                            iMax = Math.max(i8, point.y);
                            Format.Builder builderA2 = format.a();
                            builderA2.r = iMax2;
                            builderA2.s = iMax;
                            iW0 = Math.max(iW0, u0(mediaCodecInfo, new Format(builderA2)));
                            Log.g("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax2 + "x" + iMax);
                        }
                        codecMaxValues = new CodecMaxValues(iMax2, iMax, iW0);
                    }
                    i2 = i4;
                    point = null;
                    if (point != null) {
                        iMax2 = Math.max(iMax2, point.x);
                        iMax = Math.max(i8, point.y);
                        Format.Builder builderA3 = format.a();
                        builderA3.r = iMax2;
                        builderA3.s = iMax;
                        iW0 = Math.max(iW0, u0(mediaCodecInfo, new Format(builderA3)));
                        Log.g("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax2 + "x" + iMax);
                    }
                    codecMaxValues = new CodecMaxValues(iMax2, iMax, iW0);
                }
            } else {
                z2 = z4;
                colorInfo = colorInfo2;
                i2 = i4;
            }
            iMax = i8;
            codecMaxValues = new CodecMaxValues(iMax2, iMax, iW0);
        }
        this.M1 = codecMaxValues;
        int i19 = this.h2 ? this.i2 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i3);
        mediaFormat.setInteger("height", i2);
        MediaFormatUtil.b(mediaFormat, format.f5414p);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        MediaFormatUtil.a(mediaFormat, "rotation-degrees", format.v);
        if (colorInfo != null) {
            ColorInfo colorInfo3 = colorInfo;
            MediaFormatUtil.a(mediaFormat, "color-transfer", colorInfo3.f5385c);
            MediaFormatUtil.a(mediaFormat, "color-standard", colorInfo3.f5383a);
            MediaFormatUtil.a(mediaFormat, "color-range", colorInfo3.f5384b);
            byte[] bArr = colorInfo3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(format.m) && (pairD = MediaCodecUtil.d(format)) != null) {
            MediaFormatUtil.a(mediaFormat, Scopes.PROFILE, ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", codecMaxValues.f6634a);
        mediaFormat.setInteger("max-height", codecMaxValues.f6635b);
        MediaFormatUtil.a(mediaFormat, "max-input-size", codecMaxValues.f6636c);
        int i20 = Util.f5683a;
        if (i20 >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.J1) {
            z3 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z3 = true;
        }
        if (i19 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z3);
            mediaFormat.setInteger("audio-session-id", i19);
        }
        if (i20 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.g2));
        }
        if (this.S1 == null) {
            if (!D0(mediaCodecInfo)) {
                throw new IllegalStateException();
            }
            if (this.T1 == null) {
                this.T1 = PlaceholderSurface.b(this.F1, z2);
            }
            this.S1 = this.T1;
        }
        VideoSink videoSink = this.P1;
        if (videoSink != null && !videoSink.i()) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        VideoSink videoSink2 = this.P1;
        return new MediaCodecAdapter.Configuration(mediaCodecInfo, mediaFormat, format, videoSink2 != null ? videoSink2.c() : this.S1, mediaCrypto);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void P(DecoderInputBuffer decoderInputBuffer) {
        if (this.O1) {
            ByteBuffer byteBuffer = decoderInputBuffer.h0;
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
                        MediaCodecAdapter mediaCodecAdapter = this.L0;
                        mediaCodecAdapter.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        mediaCodecAdapter.a(bundle);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void U(Exception exc) {
        Log.d("MediaCodecVideoRenderer", "Video codec error", exc);
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.H1;
        Handler handler = eventDispatcher.f6666a;
        if (handler != null) {
            handler.post(new f(eventDispatcher, exc, 1));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void V(String str, long j, long j2) {
        String str2;
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.H1;
        Handler handler = eventDispatcher.f6666a;
        if (handler != null) {
            str2 = str;
            handler.post(new androidx.media3.exoplayer.audio.d(eventDispatcher, str2, j, j2, 1));
        } else {
            str2 = str;
        }
        this.N1 = t0(str2);
        MediaCodecInfo mediaCodecInfo = this.S0;
        mediaCodecInfo.getClass();
        boolean z2 = false;
        if (Util.f5683a >= 29 && "video/x-vnd.on2.vp9".equals(mediaCodecInfo.f6293b)) {
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
        this.O1 = z2;
        z0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void W(String str) {
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.H1;
        Handler handler = eventDispatcher.f6666a;
        if (handler != null) {
            handler.post(new f(eventDispatcher, str, 2));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final DecoderReuseEvaluation X(FormatHolder formatHolder) {
        DecoderReuseEvaluation decoderReuseEvaluationX = super.X(formatHolder);
        Format format = formatHolder.f5911b;
        format.getClass();
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.H1;
        Handler handler = eventDispatcher.f6666a;
        if (handler != null) {
            handler.post(new RunnableC0887e(eventDispatcher, format, decoderReuseEvaluationX, 16));
        }
        return decoderReuseEvaluationX;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void Y(Format format, MediaFormat mediaFormat) {
        int integer;
        int i2;
        MediaCodecAdapter mediaCodecAdapter = this.L0;
        if (mediaCodecAdapter != null) {
            mediaCodecAdapter.setVideoScalingMode(this.W1);
        }
        int i3 = 0;
        if (this.h2) {
            i2 = format.s;
            integer = format.t;
        } else {
            mediaFormat.getClass();
            boolean z2 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z2 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z2 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i2 = integer2;
        }
        float f = format.f5416w;
        int i4 = Util.f5683a;
        int i5 = format.v;
        if (i4 >= 21) {
            if (i5 == 90 || i5 == 270) {
                f = 1.0f / f;
                int i6 = integer;
                integer = i2;
                i2 = i6;
            }
        } else if (this.P1 == null) {
            i3 = i5;
        }
        this.e2 = new VideoSize(i2, integer, i3, f);
        VideoSink videoSink = this.P1;
        if (videoSink == null) {
            this.K1.f(format.f5415u);
            return;
        }
        Format.Builder builderA = format.a();
        builderA.r = i2;
        builderA.s = integer;
        builderA.f5432u = i3;
        builderA.v = f;
        videoSink.j(new Format(builderA));
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void a0(long j) {
        super.a0(j);
        if (this.h2) {
            return;
        }
        this.a2--;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void b() {
        VideoSink videoSink = this.P1;
        if (videoSink != null) {
            videoSink.b();
            return;
        }
        VideoFrameReleaseControl videoFrameReleaseControl = this.K1;
        if (videoFrameReleaseControl.d == 0) {
            videoFrameReleaseControl.d = 1;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void b0() {
        VideoSink videoSink = this.P1;
        if (videoSink != null) {
            videoSink.o(N());
        } else {
            this.K1.c(2);
        }
        z0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void c0(DecoderInputBuffer decoderInputBuffer) {
        Surface surface;
        boolean z2 = this.h2;
        if (!z2) {
            this.a2++;
        }
        if (Util.f5683a >= 23 || !z2) {
            return;
        }
        long j = decoderInputBuffer.g0;
        s0(j);
        y0(this.e2);
        this.A1.f5826e++;
        VideoFrameReleaseControl videoFrameReleaseControl = this.K1;
        boolean z3 = videoFrameReleaseControl.d != 3;
        videoFrameReleaseControl.d = 3;
        videoFrameReleaseControl.k.getClass();
        videoFrameReleaseControl.f = Util.I(SystemClock.elapsedRealtime());
        if (z3 && (surface = this.S1) != null) {
            VideoRendererEventListener.EventDispatcher eventDispatcher = this.H1;
            Handler handler = eventDispatcher.f6666a;
            if (handler != null) {
                handler.post(new t0(eventDispatcher, surface, SystemClock.elapsedRealtime(), 1));
            }
            this.V1 = true;
        }
        a0(j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public final void d(float f, float f2) {
        super.d(f, f2);
        VideoSink videoSink = this.P1;
        if (videoSink != null) {
            videoSink.setPlaybackSpeed(f);
            return;
        }
        VideoFrameReleaseControl videoFrameReleaseControl = this.K1;
        if (f == videoFrameReleaseControl.j) {
            return;
        }
        videoFrameReleaseControl.j = f;
        VideoFrameReleaseHelper videoFrameReleaseHelper = videoFrameReleaseControl.f6642b;
        videoFrameReleaseHelper.f6654i = f;
        videoFrameReleaseHelper.m = 0L;
        videoFrameReleaseHelper.f6657p = -1L;
        videoFrameReleaseHelper.f6656n = -1L;
        videoFrameReleaseHelper.d(false);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void d0(Format format) throws ExoPlaybackException {
        VideoSink videoSink = this.P1;
        if (videoSink == null || videoSink.isInitialized()) {
            return;
        }
        try {
            this.P1.k(format);
        } catch (VideoSink.VideoSinkException e2) {
            throw o(e2, format, false, 7000);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean f0(long j, long j2, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i2, int i3, int i4, long j3, boolean z2, boolean z3, Format format) throws ExoPlaybackException {
        long j4;
        mediaCodecAdapter.getClass();
        long jN = j3 - N();
        int iA = this.K1.a(j3, j, j2, O(), z3, this.L1);
        if (iA != 4) {
            if (z2 && !z3) {
                E0(mediaCodecAdapter, i2);
                return true;
            }
            Surface surface = this.S1;
            PlaceholderSurface placeholderSurface = this.T1;
            VideoFrameReleaseControl.FrameReleaseInfo frameReleaseInfo = this.L1;
            if (surface != placeholderSurface || this.P1 != null) {
                VideoSink videoSink = this.P1;
                if (videoSink != null) {
                    try {
                        videoSink.render(j, j2);
                        long jF = this.P1.f(j3, z3);
                        if (jF != -9223372036854775807L) {
                            if (Util.f5683a >= 21) {
                                C0(mediaCodecAdapter, i2, jF);
                                return true;
                            }
                            B0(mediaCodecAdapter, i2);
                            return true;
                        }
                    } catch (VideoSink.VideoSinkException e2) {
                        throw o(e2, e2.X, false, 7001);
                    }
                } else {
                    if (iA == 0) {
                        this.h0.getClass();
                        long jNanoTime = System.nanoTime();
                        VideoFrameMetadataListener videoFrameMetadataListener = this.k2;
                        if (videoFrameMetadataListener != null) {
                            videoFrameMetadataListener.f(jN, jNanoTime, format, this.N0);
                        }
                        if (Util.f5683a >= 21) {
                            C0(mediaCodecAdapter, i2, jNanoTime);
                        } else {
                            B0(mediaCodecAdapter, i2);
                        }
                        G0(frameReleaseInfo.f6647a);
                        return true;
                    }
                    if (iA == 1) {
                        long j5 = frameReleaseInfo.f6648b;
                        long j6 = frameReleaseInfo.f6647a;
                        if (Util.f5683a >= 21) {
                            if (j5 == this.d2) {
                                E0(mediaCodecAdapter, i2);
                                j4 = j5;
                            } else {
                                VideoFrameMetadataListener videoFrameMetadataListener2 = this.k2;
                                if (videoFrameMetadataListener2 != null) {
                                    j4 = j5;
                                    videoFrameMetadataListener2.f(jN, j4, format, this.N0);
                                } else {
                                    j4 = j5;
                                }
                                C0(mediaCodecAdapter, i2, j4);
                            }
                            G0(j6);
                            this.d2 = j4;
                            return true;
                        }
                        if (j6 < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                            if (j6 > 11000) {
                                try {
                                    Thread.sleep((j6 - 10000) / 1000);
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                }
                            }
                            VideoFrameMetadataListener videoFrameMetadataListener3 = this.k2;
                            if (videoFrameMetadataListener3 != null) {
                                videoFrameMetadataListener3.f(jN, j5, format, this.N0);
                            }
                            B0(mediaCodecAdapter, i2);
                            G0(j6);
                            return true;
                        }
                    } else {
                        if (iA == 2) {
                            Trace.beginSection("dropVideoBuffer");
                            mediaCodecAdapter.j(i2, false);
                            Trace.endSection();
                            F0(0, 1);
                            G0(frameReleaseInfo.f6647a);
                            return true;
                        }
                        if (iA == 3) {
                            E0(mediaCodecAdapter, i2);
                            G0(frameReleaseInfo.f6647a);
                            return true;
                        }
                        if (iA != 5) {
                            throw new IllegalStateException(String.valueOf(iA));
                        }
                    }
                }
            } else if (frameReleaseInfo.f6647a < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                E0(mediaCodecAdapter, i2);
                G0(frameReleaseInfo.f6647a);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.video.VideoFrameReleaseControl] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r12v7, types: [androidx.media3.exoplayer.video.PlaceholderSurface] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.media3.exoplayer.mediacodec.MediaCodecAdapter] */
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
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public final void handleMessage(int i2, Object obj) {
        ?? B2;
        Handler handler;
        Surface surface;
        ?? r0 = this.K1;
        if (i2 == 1) {
            if (obj instanceof Surface) {
                surface = (Surface) obj;
            } else {
                B2 = 0;
            }
            if (B2 == 0) {
                PlaceholderSurface placeholderSurface = this.T1;
                if (placeholderSurface != null) {
                    B2 = surface;
                    B2 = placeholderSurface;
                } else {
                    MediaCodecInfo mediaCodecInfo = this.S0;
                    if (mediaCodecInfo != null && D0(mediaCodecInfo)) {
                        B2 = surface;
                        B2 = PlaceholderSurface.b(this.F1, mediaCodecInfo.f);
                        this.T1 = B2;
                    }
                }
            }
            B2 = surface;
            B2 = surface;
            B2 = surface;
            Surface surface2 = this.S1;
            VideoRendererEventListener.EventDispatcher eventDispatcher = this.H1;
            if (surface2 == B2) {
                if (B2 == 0 || B2 == this.T1) {
                    return;
                }
                VideoSize videoSize = this.f2;
                if (videoSize != null) {
                    eventDispatcher.a(videoSize);
                }
                Surface surface3 = this.S1;
                if (surface3 == null || !this.V1 || (handler = eventDispatcher.f6666a) == null) {
                    return;
                }
                handler.post(new t0(eventDispatcher, surface3, SystemClock.elapsedRealtime(), 1));
                return;
            }
            this.S1 = B2;
            if (this.P1 == null) {
                r0.g(B2);
            }
            this.V1 = false;
            int i3 = this.i0;
            ?? r1 = this.L0;
            if (r1 != 0 && this.P1 == null) {
                if (Util.f5683a < 23 || B2 == 0 || this.N1) {
                    h0();
                    S();
                } else {
                    r1.f(B2);
                }
            }
            if (B2 == 0 || B2 == this.T1) {
                this.f2 = null;
                VideoSink videoSink = this.P1;
                if (videoSink != null) {
                    videoSink.q();
                }
            } else {
                VideoSize videoSize2 = this.f2;
                if (videoSize2 != null) {
                    eventDispatcher.a(videoSize2);
                }
                if (i3 == 2) {
                    r0.f6646i = true;
                    r0.k.getClass();
                    r0.f6645h = SystemClock.elapsedRealtime() + 5000;
                }
            }
            z0();
            return;
        }
        if (i2 == 7) {
            obj.getClass();
            VideoFrameMetadataListener videoFrameMetadataListener = (VideoFrameMetadataListener) obj;
            this.k2 = videoFrameMetadataListener;
            VideoSink videoSink2 = this.P1;
            if (videoSink2 != null) {
                videoSink2.e(videoFrameMetadataListener);
                return;
            }
            return;
        }
        if (i2 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.i2 != iIntValue) {
                this.i2 = iIntValue;
                if (this.h2) {
                    h0();
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 16) {
            obj.getClass();
            this.g2 = ((Integer) obj).intValue();
            MediaCodecAdapter mediaCodecAdapter = this.L0;
            if (mediaCodecAdapter != null && Util.f5683a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.g2));
                mediaCodecAdapter.a(bundle);
                return;
            }
            return;
        }
        if (i2 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.W1 = iIntValue2;
            MediaCodecAdapter mediaCodecAdapter2 = this.L0;
            if (mediaCodecAdapter2 != null) {
                mediaCodecAdapter2.setVideoScalingMode(iIntValue2);
                return;
            }
            return;
        }
        if (i2 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            VideoFrameReleaseHelper videoFrameReleaseHelper = r0.f6642b;
            if (videoFrameReleaseHelper.j == iIntValue3) {
                return;
            }
            videoFrameReleaseHelper.j = iIntValue3;
            videoFrameReleaseHelper.d(true);
            return;
        }
        if (i2 == 13) {
            obj.getClass();
            List list = (List) obj;
            this.R1 = list;
            VideoSink videoSink3 = this.P1;
            if (videoSink3 != null) {
                videoSink3.h(list);
                return;
            }
            return;
        }
        if (i2 != 14) {
            super.handleMessage(i2, obj);
            return;
        }
        obj.getClass();
        Size size = (Size) obj;
        if (size.f5672a == 0 || size.f5673b == 0) {
            return;
        }
        this.U1 = size;
        VideoSink videoSink4 = this.P1;
        if (videoSink4 != null) {
            Surface surface4 = this.S1;
            Assertions.f(surface4);
            videoSink4.n(surface4, size);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public final boolean isEnded() {
        if (!this.w1) {
            return false;
        }
        VideoSink videoSink = this.P1;
        return videoSink == null || videoSink.isEnded();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public final boolean isReady() {
        PlaceholderSurface placeholderSurface;
        VideoSink videoSink;
        boolean z2 = super.isReady() && ((videoSink = this.P1) == null || videoSink.isReady());
        if (z2 && (((placeholderSurface = this.T1) != null && this.S1 == placeholderSurface) || this.L0 == null || this.h2)) {
            return true;
        }
        return this.K1.b(z2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void j0() {
        super.j0();
        this.a2 = 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean n0(MediaCodecInfo mediaCodecInfo) {
        return this.S1 != null || D0(mediaCodecInfo);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void p() {
        DecoderCounters decoderCounters;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.H1;
        this.f2 = null;
        VideoSink videoSink = this.P1;
        if (videoSink != null) {
            videoSink.p();
        } else {
            this.K1.c(0);
        }
        z0();
        this.V1 = false;
        this.j2 = null;
        try {
            super.p();
            decoderCounters = this.A1;
            eventDispatcher.getClass();
            synchronized (decoderCounters) {
            }
        } finally {
            decoderCounters = this.A1;
            eventDispatcher.getClass();
            synchronized (decoderCounters) {
                Handler handler = eventDispatcher.f6666a;
                if (handler != null) {
                    handler.post(new h(eventDispatcher, decoderCounters, 1));
                }
                eventDispatcher.a(VideoSize.f5552e);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final int p0(androidx.media3.exoplayer.mediacodec.d dVar, Format format) {
        boolean z2;
        int i2 = 0;
        if (!androidx.media3.common.MimeTypes.k(format.m)) {
            return RendererCapabilities.h(0, 0, 0, 0);
        }
        boolean z3 = format.q != null;
        Context context = this.F1;
        List listV0 = v0(context, dVar, format, z3, false);
        if (z3 && listV0.isEmpty()) {
            listV0 = v0(context, dVar, format, false, false);
        }
        if (listV0.isEmpty()) {
            return RendererCapabilities.h(1, 0, 0, 0);
        }
        int i3 = format.f5405J;
        if (i3 != 0 && i3 != 2) {
            return RendererCapabilities.h(2, 0, 0, 0);
        }
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) listV0.get(0);
        boolean zD = mediaCodecInfo.d(format);
        if (!zD) {
            int i4 = 1;
            while (true) {
                if (i4 >= listV0.size()) {
                    z2 = true;
                    break;
                }
                MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) listV0.get(i4);
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
        if (Util.f5683a >= 26 && "video/dolby-vision".equals(format.m) && !Api26.a(context)) {
            i8 = 256;
        }
        if (zD) {
            List listV1 = v0(context, dVar, format, z3, true);
            if (!listV1.isEmpty()) {
                Pattern pattern = MediaCodecUtil.f6305a;
                ArrayList arrayList = new ArrayList(listV1);
                Collections.sort(arrayList, new androidx.media3.exoplayer.mediacodec.f(new androidx.media3.exoplayer.mediacodec.e(format)));
                MediaCodecInfo mediaCodecInfo3 = (MediaCodecInfo) arrayList.get(0);
                if (mediaCodecInfo3.d(format) && mediaCodecInfo3.e(format)) {
                    i2 = 32;
                }
            }
        }
        return i5 | i6 | i2 | i7 | i8;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void q(boolean z2, boolean z3) {
        super.q(z2, z3);
        RendererConfiguration rendererConfiguration = this.e0;
        rendererConfiguration.getClass();
        boolean z4 = rendererConfiguration.f5983b;
        Assertions.e((z4 && this.i2 == 0) ? false : true);
        if (this.h2 != z4) {
            this.h2 = z4;
            h0();
        }
        DecoderCounters decoderCounters = this.A1;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.H1;
        Handler handler = eventDispatcher.f6666a;
        if (handler != null) {
            handler.post(new h(eventDispatcher, decoderCounters, 0));
        }
        boolean z5 = this.Q1;
        VideoFrameReleaseControl videoFrameReleaseControl = this.K1;
        if (!z5) {
            if ((this.R1 != null || !this.G1) && this.P1 == null) {
                CompositingVideoSinkProvider.Builder builder = new CompositingVideoSinkProvider.Builder(this.F1, videoFrameReleaseControl);
                androidx.media3.common.util.SystemClock systemClock = this.h0;
                systemClock.getClass();
                builder.f6609e = systemClock;
                Assertions.e(!builder.f);
                if (builder.d == null) {
                    if (builder.f6608c == null) {
                        builder.f6608c = new CompositingVideoSinkProvider.ReflectiveDefaultVideoFrameProcessorFactory();
                    }
                    builder.d = new CompositingVideoSinkProvider.ReflectivePreviewingSingleInputVideoGraphFactory(builder.f6608c);
                }
                CompositingVideoSinkProvider compositingVideoSinkProvider = new CompositingVideoSinkProvider(builder);
                builder.f = true;
                this.P1 = compositingVideoSinkProvider.f6599b;
            }
            this.Q1 = true;
        }
        VideoSink videoSink = this.P1;
        if (videoSink == null) {
            androidx.media3.common.util.SystemClock systemClock2 = this.h0;
            systemClock2.getClass();
            videoFrameReleaseControl.k = systemClock2;
            videoFrameReleaseControl.d = z3 ? 1 : 0;
            return;
        }
        videoSink.s(new VideoSink.Listener() { // from class: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.1
            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public final void a() {
                MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
                Assertions.f(mediaCodecVideoRenderer.S1);
                Surface surface = mediaCodecVideoRenderer.S1;
                VideoRendererEventListener.EventDispatcher eventDispatcher2 = mediaCodecVideoRenderer.H1;
                Handler handler2 = eventDispatcher2.f6666a;
                if (handler2 != null) {
                    handler2.post(new t0(eventDispatcher2, surface, SystemClock.elapsedRealtime(), 1));
                }
                mediaCodecVideoRenderer.V1 = true;
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public final void d() {
                MediaCodecVideoRenderer.this.F0(0, 1);
            }
        }, MoreExecutors.a());
        VideoFrameMetadataListener videoFrameMetadataListener = this.k2;
        if (videoFrameMetadataListener != null) {
            this.P1.e(videoFrameMetadataListener);
        }
        if (this.S1 != null && !this.U1.equals(Size.f5671c)) {
            this.P1.n(this.S1, this.U1);
        }
        this.P1.setPlaybackSpeed(this.J0);
        List list = this.R1;
        if (list != null) {
            this.P1.h(list);
        }
        this.P1.l(z3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void r(long j, boolean z2) {
        VideoSink videoSink = this.P1;
        if (videoSink != null) {
            videoSink.r(true);
            this.P1.o(N());
        }
        super.r(j, z2);
        VideoSink videoSink2 = this.P1;
        VideoFrameReleaseControl videoFrameReleaseControl = this.K1;
        if (videoSink2 == null) {
            VideoFrameReleaseHelper videoFrameReleaseHelper = videoFrameReleaseControl.f6642b;
            videoFrameReleaseHelper.m = 0L;
            videoFrameReleaseHelper.f6657p = -1L;
            videoFrameReleaseHelper.f6656n = -1L;
            videoFrameReleaseControl.g = -9223372036854775807L;
            videoFrameReleaseControl.f6644e = -9223372036854775807L;
            videoFrameReleaseControl.c(1);
            videoFrameReleaseControl.f6645h = -9223372036854775807L;
        }
        if (z2) {
            videoFrameReleaseControl.f6646i = false;
            videoFrameReleaseControl.k.getClass();
            videoFrameReleaseControl.f6645h = SystemClock.elapsedRealtime() + 5000;
        }
        z0();
        this.Z1 = 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public final void render(long j, long j2) throws ExoPlaybackException {
        super.render(j, j2);
        VideoSink videoSink = this.P1;
        if (videoSink != null) {
            try {
                videoSink.render(j, j2);
            } catch (VideoSink.VideoSinkException e2) {
                throw o(e2, e2.X, false, 7001);
            }
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void s() {
        VideoSink videoSink = this.P1;
        if (videoSink == null || !this.G1) {
            return;
        }
        videoSink.release();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void t() {
        try {
            super.t();
        } finally {
            this.Q1 = false;
            if (this.T1 != null) {
                A0();
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void u() {
        this.Y1 = 0;
        this.h0.getClass();
        this.X1 = SystemClock.elapsedRealtime();
        this.b2 = 0L;
        this.c2 = 0;
        VideoSink videoSink = this.P1;
        if (videoSink != null) {
            videoSink.m();
        } else {
            this.K1.d();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void v() {
        x0();
        int i2 = this.c2;
        if (i2 != 0) {
            long j = this.b2;
            VideoRendererEventListener.EventDispatcher eventDispatcher = this.H1;
            Handler handler = eventDispatcher.f6666a;
            if (handler != null) {
                handler.post(new g(eventDispatcher, i2, 1, j));
            }
            this.b2 = 0L;
            this.c2 = 0;
        }
        VideoSink videoSink = this.P1;
        if (videoSink != null) {
            videoSink.g();
        } else {
            this.K1.e();
        }
    }

    public final void x0() {
        if (this.Y1 > 0) {
            this.h0.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.X1;
            int i2 = this.Y1;
            VideoRendererEventListener.EventDispatcher eventDispatcher = this.H1;
            Handler handler = eventDispatcher.f6666a;
            if (handler != null) {
                handler.post(new g(eventDispatcher, i2, j));
            }
            this.Y1 = 0;
            this.X1 = jElapsedRealtime;
        }
    }

    public final void y0(VideoSize videoSize) {
        if (videoSize.equals(VideoSize.f5552e) || videoSize.equals(this.f2)) {
            return;
        }
        this.f2 = videoSize;
        this.H1.a(videoSize);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final DecoderReuseEvaluation z(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        DecoderReuseEvaluation decoderReuseEvaluationB = mediaCodecInfo.b(format, format2);
        CodecMaxValues codecMaxValues = this.M1;
        codecMaxValues.getClass();
        int i2 = format2.s;
        int i3 = codecMaxValues.f6634a;
        int i4 = decoderReuseEvaluationB.f5833e;
        if (i2 > i3 || format2.t > codecMaxValues.f6635b) {
            i4 |= 256;
        }
        if (w0(mediaCodecInfo, format2) > codecMaxValues.f6636c) {
            i4 |= 64;
        }
        int i5 = i4;
        return new DecoderReuseEvaluation(mediaCodecInfo.f6292a, format, format2, i5 != 0 ? 0 : decoderReuseEvaluationB.d, i5);
    }

    public final void z0() {
        int i2;
        MediaCodecAdapter mediaCodecAdapter;
        if (!this.h2 || (i2 = Util.f5683a) < 23 || (mediaCodecAdapter = this.L0) == null) {
            return;
        }
        this.j2 = new OnFrameRenderedListenerV23(mediaCodecAdapter);
        if (i2 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            mediaCodecAdapter.a(bundle);
        }
    }
}
