package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ChartboostActivity;
import com.chartboost.sdk.ChartboostDelegate;
import com.chartboost.sdk.InPlay.CBInPlay;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.requests.models.MediationModel;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.view.CBImpressionActivity;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class bk extends be {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f826 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f827 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f828 = 1568892743;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f829 = 1060878042;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f830 = 65;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static short[] f832;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] f831 = {-101, -95, -119, -93, -117, -89, -72, 99, -105, -102, -106, -93, -124, -104, -89, -113, -69, 97, 100, 96, 109, 78, 98, 113, 89, -123, -119, -85, -110, -102, -111, -97, -71, 104, -103, -100, -104, -91, -122, -102, -87, -111, -67, 112, -96, -102, -105, -107, -102, -102, -121, -74, 17, 23, -1, 25, 1, 29, 46, -33, 11, 18, 2, 12, 26, -1, 14, 15, 48, 19, 11, 33, -63, 34, 14, 6, 14, 5, 74, -49, 19, -3, 81, -58, 13, 16, 12, 25, -6, 14, 29, 5, 17, 65, -51, 10, 24, 27, 8, 5, 27, 5, 17, 17, 29, 1, 22, 53, -2, 0, -15, 16, -23, 17, 18, -79, -85, -88, -97, -87, -76, -57, -120, -88, -86, -101, -70, -109, -69, -68, 92, 86, 83, 74, 84, 95, 114, 35, 86, 101, 65, 117, -54, -48, -72, -46, -70, -42, -25, -104, -60, -53, -69, -59, -45, -72, -57, -56, -23, -52, -60, -38, 124, -41, -63, -72, 13, -120, -52, -74, 10, 127, -58, -55, -59, -46, -77, -57, -42, -66, -54, -6, -122, -61, -47, 53, 48, 54, 43, 115, -121, -114, 89, 123, -86, 72, -118, 121, 67, 101, 76, 84, 75, 89, 115, 52, 96, 51, 92, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static long f825 = -1711821536687410055L;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends ChartboostDelegate implements hj<ChartboostDelegate> {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f842 = 1;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f843;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static long f844;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char[] f845;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private ck f847;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ChartboostDelegate f848;

        static {
            char[] cArr = new char[1261];
            f2.v("\u0000CÃ©\u0087ãK1\u000fpÒ§\u0096éZ(\u001e{á½¥Îi.-`ð¨´éx.<dÿ´Ã¼\u0087 K|\u000eºÒã\u0096;Z|\u001d\u008báÿ¥*ii,¸ðí´+xi;\u008fÿÖÃ\u0006\u0087VJ\u0096\u000eÒÒ\u000e\u0096\\Y\u0080\u001dËá\u0007çR$¸`ò¬ èa5¶qø½9ùj\u0006¬Bß\u008e?Êq\u0017¹Sø\u009f?Ûu\u0018¥$\u00ad`1¬mé«5òq*½mú\u008c\u0006âB9\u008e}Ë \u0017îS7\u009fxÜ\u009e\u0018Ç$\u0017`G\u00ad\u0087éÃ5\u001fqM¾\u0091úÚ\u0006\u0016\u0000CÃ©\u0087ãK1\u000fpÒ§\u0096éZ(\u001e{á½¥Îi.-`ð¨´éx.<dÿ´Ã¼\u00877K}\u000e±ÒÕ\u00966Z{\u001d±áÿ¥\u0012ir,©ðû´-xS;\u0095ÿËÃ\u0017\u0087MJ\u0084\u000eÊ\u0000CÃ©\u0087ãK1\u000fpÒ§\u0096éZ(\u001e{á½¥Îi.-`ð¨´éx.<dÿ´Ã¼\u00877K}\u000e±ÒÐ\u00966Zq\u001dµáÎ¥4iP,²ðÿ´;xi;\u008fÿÖÃ\u0006\u0087VJ\u0096\u000eÒÒ\u000e\u0096\\Y\u0080\u001dËá\u0007ÃA\u0000«Dá\u00883Ìr\u0011¥Uë\u0099*Ýy\"¿fÌª,îb3ªwë»,ÿf<¶\u0000¾D5\u0088\u007fÍ³\u0011ÐU<\u0099iÞ¶\"ñf*ªmï\u00963òw)»Gø\u0091<Ó\u0000\u0015DO\u0089\u0093ÍÍ\u0011\u0004UFXÐ\u009b:ßp\u0013¢Wã\u008a4Îz\u0002»Fè¹.ý]1½uó¨;ìz ½d÷§'\u009b/ß¤\u0013îV\"\u008aFÎ¨\u0002äE9¹lý\u00811át:¨hì¾ Àc\u0006§X\u009b\u0084ßÞ\u0012\u0017VY¤¹gS#\u0019ïË«\u008av]2\u0013þÒº\u0081EG\u00014ÍÔ\u0089\u009aTR\u0010\u0013ÜÔ\u0098\u009e[NgF#Íï\u0087ªKv/2Áþ\u008b¹@E\u000b\u0001èÍ\u0088\u0088ST\u0001\u0010×Ü©\u009fo[1gí#·î~ª0Wú\u0094\u0010ÐZ\u001c\u0088XÉ\u0085\u001eÁP\r\u0091IÂ¶\u0004òw>\u0097zÙ§\u0011ãP/\u0097kÝ¨\r\u0094\u0005Ð\u008e\u001cÄY\b\u0085kÁ\u0087\rÒJ\u0010¶Oò\u0083>Ü{-§Iã\u0092/ül*¨h\u0094®Ðô\u001d(Yv\u0085¿Áý\u0000CÃ©\u0087ãK1\u000fpÒ§\u0096éZ(\u001e{á½¥Îi.-`ð¨´éx.<dÿ´Ã¼\u00877K}\u000e±ÒÕ\u00968Zu\u001d©áö¥>ih,¸ð×´1xT;\u0084ÿÐÃ\u0010\u0087PJ\u008c\u000eÒÒ\u000e\u0096IY\u0085\u0000CÃ©\u0087ãK1\u000fpÒ§\u0096éZ(\u001e{á½¥Îi.-`ð¨´éx.<dÿ´Ã¼\u0087 K|\u000eºÒã\u0096;Z|\u001d\u008báÿ¥*ii,¸ðí´+xm;\u008eÿÐÃ\u0006\u0087eJ\u0095\u000eÖÒ\u0014\u0007\u001cÄö\u0080¼Ln\b/Õø\u0091¶]w\u0019$æâ¢\u0091nq*?÷÷³¶\u007fq;;øëÄã\u0080hL\"\tîÕ\u008a\u0091i]$\u001aîæ ¢In,+ð÷¤³A\u007f\u000f<Îø\u008e_j\u009c\u0080ØÊ\u0014\u0018PY\u008d\u008eÉÀ\u0005\u0001AR¾\u0094úç6\u0007rI¯\u0081ëÀ'\u0007cM \u009d\u009c\u0095Ø\t\u0014UQ\u0093\u008dÊÉ\u0012\u0005UB´¾Úú\u00016Es\u0098¯Öë\u000f'Dd§ ù\u009c/ØL\u0015¼Qÿ\u008d=¯²lX(\u0012äÀ \u0081}V9\u0018õÙ±\u008aNL\n?Æß\u0082\u0091_Y\u001b\u0018×ß\u0093\u0095PElM(Æä\u008c¡@}!9Çõ\u0080²DN?\nÅÆ¡\u0083C_\u000e\u001bÊ×\u009c\u0094\u007fP!l÷(\u0094åd¡'}å\u0090ÑS;\u0017qÛ£\u009fâB5\u0006{Êº\u008eéq/5\\ù¼½ò`:${è¼¬öo&S.\u0017¥Ûï\u009e#B@\u0006¬Êù\u008d&qa5ºùý¼\u0002`c$¿è×«2o@S\u0081\u0017Å\u0091ÏR%\u0016oÚ½\u009eüC+\u0007eË¤\u008f÷p14Bø¢¼ìa$%eé¢\u00adèn8R0\u0016»Úñ\u009f=CY\u0007·Ëû\u008c&ps4\u009aøÿ½#aw%\u0092éÜª\u001dn]\u0000CÃ©\u0087ãK1\u000fpÒ§\u0096éZ(\u001e{á½¥Îi.-`ð¨´éx.<dÿ´Ã¼\u00877K}\u000e±ÒÕ\u0096;Zq\u001dºáñ¥\u0016is,¯ðû´\u001exP;\u0091ÿÑ\u0000CÃ©\u0087ãK1\u000fpÒ§\u0096éZ(\u001e{á½¥Îi.-`ð¨´éx.<dÿ´Ã¼\u00877K}\u000e±ÒÒ\u0096>Zk\u001d©áö¥:ie,\u0090ðñ´-xE; ÿÒÃ\u0013\u0087W\u0000CÃ©\u0087ãK1\u000fpÒ§\u0096éZ(\u001e{á½¥Îi.-`ð¨´éx.<dÿ´Ã¼\u00877K}\u000e±ÒÐ\u00966Zq\u001dµáÎ¥4iN,¸ðý´0xR;\u0085ÿáÃ\u000f\u0087MJ\u0086\u000eÍ\u0011\u0006Òì\u0096¦Zt\u001e5Ãâ\u0087¬Km\u000f>ðø´\u008bxk<%áí¥¬ik-!îñÒù\u0096rZ8\u001fôÃ\u0083\u0087sK(\fïðº´]x5=ñá¸¥qi#*Ëî\u0095Òe\u0096\u000e[Î\u001f\u0085ÃK\u0087\u001fHÁ\f\u008eðZ´\u0000yÇ=\u0085\u0000dÃ¨\u0087æK\u0013\u000feÒ°\u0096õZ\"\u001eKá¥¥ãi(-gð\u008b´áx=<Sÿ¾Ãü\u00875K}\u000e§Òû\u00966Zl\u001d°áõ¥5a\u008f¢eæ/*ýn¼³k÷%;ä\u007f·\u0080qÄ\u0002\bâL¬\u0091dÕ%\u0019â]¨\u009ex¢pæì*°ov³/÷÷;°|Q\u0080?Ää\b M}\u00913Õê\u0019¾ZH\u009e\u0019¢Îæ\u009a+Mo\u000f³Ï÷²8L|\u0002\u0080ÂÄ\u008f\u0000CÃ©\u0087ãK1\u000fpÒ§\u0096éZ(\u001e{á½¥Îi.-`ð¨´éx.<dÿ´Ã¼\u00877K}\u000e±ÒÕ\u00966Z{\u001d±áÿ¥\tiy,ªðÿ´-xD;\u0084ÿÆÃ5\u0087MJ\u0081\u000eÃÒ\b\u0000CÃ©\u0087ãK1\u000fpÒ§\u0096éZ(\u001e{á½¥Îi.-`ð¨´éx.<dÿ´Ã¼\u00877K}\u000e±ÒÐ\u00966Zq\u001dµáÎ¥4iP,²ðÿ´;xr;\u0084ÿÕÃ\u0002\u0087VJ\u0081\u000eÃÒ\u0003\u0096~Y\u0080\u001dÎá\u000e¥C\u0000CÃ©\u0087ãK1\u000fpÒ§\u0096éZ(\u001e{á½¥Îi.-`ð¨´éx.<dÿ´Ã¼\u00877K}\u000e±ÒÒ\u0096>Zk\u001d´áó¥(io,\u008fðû´(xA;\u0093ÿÆÃ\u0006\u0087@J³\u000eÏÒ\u0003\u0096MY\u0086Íÿ\u000e\u0015J_\u0086\u008dÂÌ\u001f\u001b[U\u0097\u0094ÓÇ,\u0001hr¤\u0092àÜ=\u0014yUµ\u0092ñØ2\b\u000e\u0000J\u008b\u0086ÁÃ\r\u001fi[\u0087\u0097ËÐ\u0016,Chµ¤Åá\u0016=Cy\u0091µøö82z\u000e\u0089Jñ\u0087=Ã\u007f\u001f´\u0000CÃ©\u0087ãK1\u000fpÒ§\u0096éZ(\u001e{á½¥Îi.-`ð¨´éx.<dÿ´Ã¼\u00877K}\u000e±ÒÕ\u0096;Zq\u001dºáñ¥\tiy,ªðÿ´-xD;\u0084ÿÆÃ5\u0087MJ\u0081\u000eÃÒ\b\u0000CÃ©\u0087ãK1\u000fpÒ§\u0096éZ(\u001e{á½¥Îi.-`ð¨´éx.<dÿ´Ã¼\u00877K}\u000e±ÒÕ\u00968Zu\u001d©áö¥>ih,¸ðÌ´:xW;\u0080ÿÐÃ\u0007\u0087AJ\u0081\u000eðÒ\u000e\u0096LY\u008c\u001dÅË-\bÇL\u008d\u0080_Ä\u001e\u0019É]\u0087\u0091FÕ\u0015*Ón ¢@æ\u000e;Æ\u007f\u0087³@÷\n4Ú\bÒLY\u0080\u0013Åß\u0019¼]P\u0091\u0005ÖÇ*\u0098nT¢\u000bçá;\u0095\u007fF³/ðý4¨\bhL.\u0081ÝÅ¡\u0019m]#\u0092è7\u008aô`°*|ø8¹ån¡ má)²Öt\u0092\u0007^ç\u001a©Ça\u0083 Oç\u000b\u00adÈ}ôu°í|´9på3¡Úm¸*cÖ#\u0092þ^´\u001bmÇ\u0001\u0083ÿO\u008d\fMÈ\u0004\u0081·B]\u0006\u0017ÊÅ\u008e\u0084SS\u0017\u001dÛÜ\u009f\u008f`I$:èÚ¬\u0094q\\5\u001dùÚ½\u0090~@BH\u0006ÃÊ\u0089\u008fES!\u0017ÂÛ\u008f\u009cE`\u000b$æè\u0086\u00adyq\u00065Êù\u00ad\u0000CÃ©\u0087ãK1\u000fpÒ§\u0096éZ(\u001e{á½¥Îi.-`ð¨´éx.<dÿ´Ã¼\u00877K}\u000e±ÒÐ\u00966Zq\u001dµáÎ¥4iP,²ðÿ´;xi;\u008fÿòÃ\u000f\u0087EJ\u009c\u0000CÃ©\u0087ãK1\u000fpÒ§\u0096éZ(\u001e{á½¥Îi.-`ð¨´éx.<dÿ´Ã¼\u00877K}\u000e±Òß\u00969Zq\u001d\u00adáó¥:ip,´ðä´:", "ISO-8859-1", cArr, 0, 1261);
            f845 = cArr;
            f844 = -1180229412076272703L;
        }

        public a(ChartboostDelegate chartboostDelegate, ck ckVar) {
            this.f848 = chartboostDelegate;
            this.f847 = ckVar;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private ChartboostDelegate m940() {
            int i10 = f843;
            int i11 = i10 + 51;
            f842 = i11 % 128;
            int i12 = i11 % 2;
            ChartboostDelegate chartboostDelegate = this.f848;
            if (i12 == 0) {
                int i13 = 29 / 0;
            }
            int i14 = i10 + 69;
            f842 = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 61 / 0;
            }
            return chartboostDelegate;
        }

        public void didCacheInPlay(String str) {
            f842 = (f843 + 95) % 128;
            bk.this.m823(this, this.f847, m941((char) (33268 - KeyEvent.getDeadChar(0, 0)), TextUtils.getOffsetAfter("", 0) + 1158, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                int i10 = f843 + 67;
                f842 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didCacheInPlay(str);
                if (i11 == 0) {
                    int i12 = 1 / 0;
                }
            }
        }

        public void didCacheInterstitial(String str) {
            f843 = (f842 + 35) % 128;
            bk.this.m823(this, this.f847, m941((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 88 - KeyEvent.keyCodeFromString(""), ((Process.getThreadPriority(0) + 20) >> 6) + 39).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCacheInterstitial(str);
            }
            f843 = (f842 + 33) % 128;
        }

        public void didCacheMoreApps(String str) {
            f843 = (f842 + 91) % 128;
            bk.this.m823(this, this.f847, m941((char) (1887 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Color.alpha(0) + 413, 36 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCacheMoreApps(str);
                f843 = (f842 + 123) % 128;
            }
        }

        public void didCacheRewardedVideo(String str) {
            bk.this.m823(this, this.f847, m941((char) (TextUtils.lastIndexOf("", '0', 0) + 1), TextUtils.indexOf((CharSequence) "", '0', 0) + 832, 40 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                f843 = (f842 + 7) % 128;
                chartboostDelegate.didCacheRewardedVideo(str);
            }
            int i10 = f843 + InterfaceC0435l1.d.b.f29112i;
            f842 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        public void didClickInterstitial(String str) {
            bk.this.m823(this, this.f847, m941((char) (ExpandableListView.getPackedPositionType(0L) + 42234), Process.getGidForName("") + 252, 38 - Process.getGidForName("")).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                f842 = (f843 + 77) % 128;
                chartboostDelegate.didClickInterstitial(str);
            }
            f842 = (f843 + InterfaceC0435l1.d.b.f29109f) % 128;
        }

        public void didClickMoreApps(String str) {
            f842 = (f843 + 11) % 128;
            bk.this.m823(this, this.f847, m941((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 600 - View.combineMeasuredStates(0, 0), 35 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                int i10 = f842 + 117;
                f843 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didClickMoreApps(str);
                if (i11 != 0) {
                    int i12 = 96 / 0;
                }
            }
        }

        public void didClickRewardedVideo(String str) {
            bk.this.m823(this, this.f847, m941((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 997, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 41).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                int i10 = f843 + 79;
                f842 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didClickRewardedVideo(str);
                if (i11 == 0) {
                    int i12 = 55 / 0;
                }
                f843 = (f842 + 67) % 128;
            }
        }

        public void didCloseInterstitial(String str) {
            bk.this.m823(this, this.f847, m941((char) (22675 - Color.green(0)), 212 - (ViewConfiguration.getFadingEdgeLength() >> 16), 39 - Color.argb(0, 0, 0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                f843 = (f842 + 81) % 128;
                chartboostDelegate.didCloseInterstitial(str);
            }
            f843 = (f842 + 121) % 128;
        }

        public void didCloseMoreApps(String str) {
            f843 = (f842 + 13) % 128;
            bk.this.m823(this, this.f847, m941((char) (Gravity.getAbsoluteGravity(0, 0) + 37260), ((byte) KeyEvent.getModifierMetaStateMask()) + 566, 35 - TextUtils.indexOf("", "")).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                f842 = (f843 + 49) % 128;
                chartboostDelegate.didCloseMoreApps(str);
            }
        }

        public void didCloseRewardedVideo(String str) {
            f843 = (f842 + InterfaceC0435l1.d.b.f29112i) % 128;
            bk.this.m823(this, this.f847, m941((char) (52669 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 958 - Color.red(0), 40 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                f843 = (f842 + 27) % 128;
                chartboostDelegate.didCloseRewardedVideo(str);
                f842 = (f843 + 123) % 128;
            }
        }

        public void didCompleteInterstitial(String str) {
            bk.this.m823(this, this.f847, m941((char) KeyEvent.getDeadChar(0, 0), Drawable.resolveOpacity(0, 0) + 331, View.getDefaultSize(0, 0) + 42).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                f842 = (f843 + 67) % 128;
                chartboostDelegate.didCompleteInterstitial(str);
            }
            int i10 = f843 + 119;
            f842 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        public void didCompleteRewardedVideo(String str, int i10) {
            bk.this.m823(this, this.f847, m941((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + IronSourceError.ERROR_IS_SHOW_EXCEPTION, AndroidCharacter.getMirror('0') - 5).intern(), str, Integer.valueOf(i10));
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                f842 = (f843 + 69) % 128;
                chartboostDelegate.didCompleteRewardedVideo(str, i10);
                f842 = (f843 + InterfaceC0435l1.d.b.f29114k) % 128;
            }
        }

        public void didDismissInterstitial(String str) {
            f842 = (f843 + 93) % 128;
            bk.this.m823(this, this.f847, m941((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 49923), 171 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 41).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                f843 = (f842 + 17) % 128;
                chartboostDelegate.didDismissInterstitial(str);
            }
        }

        public void didDismissMoreApps(String str) {
            f843 = (f842 + 107) % 128;
            bk.this.m823(this, this.f847, m941((char) (TextUtils.indexOf("", "") + 37010), 528 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf("", "", 0) + 37).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                f843 = (f842 + 35) % 128;
                chartboostDelegate.didDismissMoreApps(str);
                f842 = (f843 + 97) % 128;
            }
        }

        public void didDismissRewardedVideo(String str) {
            f842 = (f843 + 45) % 128;
            bk.this.m823(this, this.f847, m941((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 916 - (ViewConfiguration.getWindowTouchSlop() >> 8), Color.rgb(0, 0, 0) + 16777258).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                f843 = (f842 + 17) % 128;
                chartboostDelegate.didDismissRewardedVideo(str);
            }
        }

        public void didDisplayInterstitial(String str) {
            f842 = (f843 + 83) % 128;
            bk.this.m823(this, this.f847, m941((char) (View.MeasureSpec.getSize(0) + 22457), TextUtils.getOffsetAfter("", 0) + 290, ExpandableListView.getPackedPositionType(0L) + 41).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                chartboostDelegate.didDisplayInterstitial(str);
                f842 = (f843 + 79) % 128;
            }
        }

        public void didDisplayMoreApps(String str) {
            f843 = (f842 + 53) % 128;
            bk.this.m823(this, this.f847, m941((char) (ViewConfiguration.getTapTimeout() >> 16), 635 - (ViewConfiguration.getLongPressTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 37).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                chartboostDelegate.didDisplayMoreApps(str);
            }
            int i10 = f842 + 35;
            f843 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        public void didDisplayRewardedVideo(String str) {
            f843 = (f842 + 119) % 128;
            bk.this.m823(this, this.f847, m941((char) (52078 - TextUtils.indexOf("", "", 0)), 1081 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                chartboostDelegate.didDisplayRewardedVideo(str);
            }
            f843 = (f842 + 13) % 128;
        }

        public void didFailToLoadInPlay(String str, CBError.CBImpressionError cBImpressionError) {
            f842 = (f843 + 53) % 128;
            bk.this.m823(this, this.f847, m941((char) TextUtils.getTrimmedLength(""), 1191 - ExpandableListView.getPackedPositionType(0L), 37 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                int i10 = f842 + 53;
                f843 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.didFailToLoadInPlay(str, cBImpressionError);
                if (i11 != 0) {
                    int i12 = 43 / 0;
                }
            }
        }

        public void didFailToLoadInterstitial(String str, CBError.CBImpressionError cBImpressionError) {
            bk.this.m823(this, this.f847, m941((char) (TextUtils.lastIndexOf("", '0', 0) + 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, 44 - View.MeasureSpec.getMode(0)).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                f843 = (f842 + 87) % 128;
                chartboostDelegate.didFailToLoadInterstitial(str, cBImpressionError);
            }
            int i10 = f843 + InterfaceC0435l1.d.b.f29114k;
            f842 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        public void didFailToLoadMoreApps(String str, CBError.CBImpressionError cBImpressionError) {
            f842 = (f843 + 29) % 128;
            bk.this.m823(this, this.f847, m941((char) (Color.blue(0) + 45041), TextUtils.getTrimmedLength("") + 488, 39 - MotionEvent.axisFromString("")).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                chartboostDelegate.didFailToLoadMoreApps(str, cBImpressionError);
            }
            f843 = (f842 + InterfaceC0435l1.d.b.f29109f) % 128;
        }

        public void didFailToLoadRewardedVideo(String str, CBError.CBImpressionError cBImpressionError) {
            f843 = (f842 + 63) % 128;
            bk.this.m823(this, this.f847, m941((char) ExpandableListView.getPackedPositionType(0L), 871 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 46 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                f842 = (f843 + 125) % 128;
                chartboostDelegate.didFailToLoadRewardedVideo(str, cBImpressionError);
            }
        }

        public void didFailToRecordClick(String str, CBError.CBClickError cBClickError) {
            f843 = (f842 + 61) % 128;
            bk.this.m823(this, this.f847, m941((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 672 - (ViewConfiguration.getTapTimeout() >> 16), 39 - Gravity.getAbsoluteGravity(0, 0)).intern(), str, cBClickError);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                f843 = (f842 + 39) % 128;
                chartboostDelegate.didFailToRecordClick(str, cBClickError);
            }
        }

        public void didInitialize() {
            f842 = (f843 + 77) % 128;
            bk.this.m823(this, this.f847, m941((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 1229 - Gravity.getAbsoluteGravity(0, 0), 32 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), new Object[0]);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                f842 = (f843 + 107) % 128;
                chartboostDelegate.didInitialize();
                f843 = (f842 + 55) % 128;
            }
        }

        public void didPauseClickForConfirmation(Activity activity) {
            bk.this.m823(this, this.f847, m941((char) (TextUtils.getCapsMode("", 0, 0) + 4421), 711 - View.MeasureSpec.getMode(0), 47 - Color.alpha(0)).intern(), activity);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                f843 = (f842 + 3) % 128;
                try {
                    chartboostDelegate.getClass().getDeclaredMethod(m941((char) ExpandableListView.getPackedPositionGroup(0L), 758 - Drawable.resolveOpacity(0, 0), 28 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), Activity.class).invoke(this.f848, activity);
                    int i10 = f842 + 115;
                    f843 = i10 % 128;
                    if (i10 % 2 != 0) {
                        throw null;
                    }
                } catch (Throwable unused) {
                }
            }
        }

        public boolean shouldDisplayInterstitial(String str) {
            f843 = (f842 + 81) % 128;
            bk.this.m823(this, this.f847, m941((char) (59153 - TextUtils.indexOf("", "", 0)), Gravity.getAbsoluteGravity(0, 0) + 44, View.MeasureSpec.getSize(0) + 44).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate == null) {
                return false;
            }
            boolean zShouldDisplayInterstitial = chartboostDelegate.shouldDisplayInterstitial(str);
            int i10 = f842 + 73;
            f843 = i10 % 128;
            if (i10 % 2 == 0) {
                return zShouldDisplayInterstitial;
            }
            throw null;
        }

        public boolean shouldDisplayMoreApps(String str) {
            f843 = (f842 + 41) % 128;
            bk.this.m823(this, this.f847, m941((char) (TextUtils.getCapsMode("", 0, 0) + 24361), 448 - (Process.myTid() >> 22), 39 - TextUtils.lastIndexOf("", '0', 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate == null) {
                f843 = (f842 + 123) % 128;
                return false;
            }
            int i10 = f843 + 121;
            f842 = i10 % 128;
            if (i10 % 2 != 0) {
                return chartboostDelegate.shouldDisplayMoreApps(str);
            }
            int i11 = 48 / 0;
            return chartboostDelegate.shouldDisplayMoreApps(str);
        }

        public boolean shouldDisplayRewardedVideo(String str) {
            f843 = (f842 + 39) % 128;
            bk.this.m823(this, this.f847, m941((char) (KeyEvent.getDeadChar(0, 0) + 25036), 785 - ((byte) KeyEvent.getModifierMetaStateMask()), (-16777171) - Color.rgb(0, 0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate == null) {
                return false;
            }
            int i10 = f842 + InterfaceC0435l1.d.b.f29110g;
            f843 = i10 % 128;
            if (i10 % 2 == 0) {
                return chartboostDelegate.shouldDisplayRewardedVideo(str);
            }
            chartboostDelegate.shouldDisplayRewardedVideo(str);
            throw null;
        }

        public boolean shouldRequestInterstitial(String str) {
            f842 = (f843 + 91) % 128;
            bk.this.m823(this, this.f847, m941((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 44 - View.MeasureSpec.getSize(0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate == null) {
                int i10 = f843 + 17;
                f842 = i10 % 128;
                if (i10 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            int i11 = f842 + 71;
            f843 = i11 % 128;
            if (i11 % 2 == 0) {
                return chartboostDelegate.shouldRequestInterstitial(str);
            }
            chartboostDelegate.shouldRequestInterstitial(str);
            throw null;
        }

        public boolean shouldRequestMoreApps(String str) {
            bk.this.m823(this, this.f847, m941((char) KeyEvent.getDeadChar(0, 0), TextUtils.getCapsMode("", 0, 0) + 373, Color.red(0) + 40).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate == null) {
                return false;
            }
            f842 = (f843 + 3) % 128;
            boolean zShouldRequestMoreApps = chartboostDelegate.shouldRequestMoreApps(str);
            f843 = (f842 + 33) % 128;
            return zShouldRequestMoreApps;
        }

        public void willDisplayVideo(String str) {
            f842 = (f843 + 1) % 128;
            bk.this.m823(this, this.f847, m941((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 14282), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1122, (ViewConfiguration.getPressedStateDuration() >> 16) + 35).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f848;
            if (chartboostDelegate != null) {
                int i10 = f843 + 125;
                f842 = i10 % 128;
                int i11 = i10 % 2;
                chartboostDelegate.willDisplayVideo(str);
                if (i11 == 0) {
                    throw null;
                }
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hj
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ ChartboostDelegate mo800() {
            f842 = (f843 + 123) % 128;
            ChartboostDelegate chartboostDelegateM940 = m940();
            f843 = (f842 + 57) % 128;
            return chartboostDelegateM940;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m941(char c4, int i10, int i11) {
            String str;
            synchronized (c.f1153) {
                try {
                    char[] cArr = new char[i11];
                    c.f1154 = 0;
                    while (true) {
                        int i12 = c.f1154;
                        if (i12 < i11) {
                            cArr[i12] = (char) ((((long) f845[i10 + i12]) ^ (((long) i12) * f844)) ^ ((long) c4));
                            c.f1154 = i12 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str;
        }
    }

    public bk(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static Object m920() {
        f826 = (f827 + InterfaceC0435l1.d.b.f29109f) % 128;
        com.chartboost.sdk.a delegate = Chartboost.getDelegate();
        int i10 = f827 + 93;
        f826 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 98 / 0;
        }
        return delegate;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static boolean m921() {
        f826 = (f827 + 89) % 128;
        boolean zIsWebViewEnabled = Chartboost.isWebViewEnabled();
        int i10 = f826 + 63;
        f827 = i10 % 128;
        if (i10 % 2 == 0) {
            return zIsWebViewEnabled;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static Object m922() {
        int i10 = f827 + 121;
        f826 = i10 % 128;
        if (i10 % 2 == 0) {
            com.chartboost.sdk.impl.a aVar = com.chartboost.sdk.g.d;
            throw null;
        }
        com.chartboost.sdk.impl.a aVar2 = com.chartboost.sdk.g.d;
        int i11 = f827 + 7;
        f826 = i11 % 128;
        if (i11 % 2 != 0) {
            return aVar2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static /* synthetic */ boolean m923() {
        f827 = (f826 + 17) % 128;
        boolean zM921 = m921();
        f826 = (f827 + 59) % 128;
        return zM921;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static boolean m924() {
        f827 = (f826 + InterfaceC0435l1.d.b.f29105b) % 128;
        boolean z10 = m920() instanceof a;
        f826 = (f827 + 33) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ Object m925() {
        Object objM922;
        int i10 = f827 + 55;
        f826 = i10 % 128;
        if (i10 % 2 == 0) {
            objM922 = m922();
            int i11 = 36 / 0;
        } else {
            objM922 = m922();
        }
        int i12 = f826 + InterfaceC0435l1.d.b.f29109f;
        f827 = i12 % 128;
        if (i12 % 2 == 0) {
            return objM922;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ Object m926() {
        f826 = (f827 + 97) % 128;
        Object objM920 = m920();
        int i10 = f827 + 55;
        f826 = i10 % 128;
        if (i10 % 2 != 0) {
            return objM920;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private a m929(ChartboostDelegate chartboostDelegate, ck ckVar) {
        a aVar = new a(chartboostDelegate, ckVar);
        int i10 = f827 + 35;
        f826 = i10 % 128;
        if (i10 % 2 != 0) {
            return aVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m932(CBInPlay cBInPlay) {
        f826 = (f827 + InterfaceC0435l1.d.b.f29109f) % 128;
        String strM930 = m930(cBInPlay);
        int i10 = f826 + 79;
        f827 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM930;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m934(CBInPlay cBInPlay) {
        f826 = (f827 + 19) % 128;
        String strM927 = m927(cBInPlay);
        f826 = (f827 + 117) % 128;
        return strM927;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ a m935(bk bkVar, ChartboostDelegate chartboostDelegate, ck ckVar) {
        f826 = (f827 + 91) % 128;
        a aVarM929 = bkVar.m929(chartboostDelegate, ckVar);
        f826 = (f827 + 53) % 128;
        return aVarM929;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        int i10 = f827 + 11;
        f826 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                return Chartboost.getSDKVersion();
            }
            int i11 = 73 / 0;
            return Chartboost.getSDKVersion();
        } catch (Error unused) {
            return m936((short) ((ViewConfiguration.getLongPressTimeout() >> 16) - 51), (-1060877988) - TextUtils.indexOf("", ""), (-60) - (ViewConfiguration.getJumpTapTimeout() >> 16), (-1568892558) - Color.alpha(0), (byte) (1 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)))).intern();
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m930(CBInPlay cBInPlay) {
        f826 = (f827 + 95) % 128;
        String location = cBInPlay.getLocation();
        int i10 = f826 + 55;
        f827 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 83 / 0;
        }
        return location;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m933(bk bkVar, ck ckVar) {
        int i10 = f827 + InterfaceC0435l1.d.b.f29114k;
        f826 = i10 % 128;
        int i11 = i10 % 2;
        bkVar.m938(ckVar);
        if (i11 == 0) {
            int i12 = 26 / 0;
        }
        int i13 = f826 + 47;
        f827 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m937(ChartboostDelegate chartboostDelegate) {
        f826 = (f827 + 15) % 128;
        m928(chartboostDelegate);
        f826 = (f827 + 37) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        map.put(m931("㐊ҵ啟ꗖ\uf6bf읰\u17ea悊녔臯튂⍎珰", 12457 - TextUtils.indexOf("", "", 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                bk.m933(bk.this, ckVar);
                return null;
            }
        });
        map.put(m931("㐞⮙ଇ檵䨅ꦁ褕\ue8ae젳⾻༤溽丱근赚\uecde챌⏋͂拒䉸", 8069 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bk.m926();
            }
        });
        map.put(m931("㐞ڑ儗ꎝ︥죙ᭅ嗖ꁳ\uf2e3추᠅檑ꔆ\uf7f7쉥Ო潻릣\uf44a윘ᆄ氂뺵褠\udbc8ᙎ", Color.green(0) + 12941).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bk.m925();
            }
        });
        map.put(m931("㐚⛆ᆆ౿缹樝䓣랠ꉒ鴤蠚醙햑쁲㌠⸕ᣚஐ晗儫䰑뻍ꦀ葳\uf735\ue219", MotionEvent.axisFromString("") + 4814).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bk.m935(bk.this, (ChartboostDelegate) list.get(0), ckVar);
            }
        });
        map.put(m931("㐊傃ﴳ᧧ꙭ쌃澱\uf454უ북\uda20曟荹⠮뒮텄緬骑✶䏀\ue870", 25758 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                bk.m937((ChartboostDelegate) list.get(0));
                return null;
            }
        });
        map.put(m931("㐐\uf8db권副ݟ㐺\uf8f6궫劆ݥ㐽\uf8e3귗劈ݲ㐢", 52433 - Color.alpha(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return Boolean.valueOf(bk.m923());
            }
        });
        map.put(m931("㐞暏鄫쎌繚ꣅ\udb6a瘈ꂈ팽ඩ", 21139 - KeyEvent.normalizeMetaState(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bk.m932((CBInPlay) list.get(0));
            }
        });
        map.put(m936((short) ((PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 123), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1060877939, (-55) - Color.argb(0, 0, 0, 0), (-1568892554) - (ViewConfiguration.getScrollBarSize() >> 8), (byte) View.MeasureSpec.getMode(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bk.m934((CBInPlay) list.get(0));
            }
        });
        map.put(m936((short) ((-83) - Process.getGidForName("")), (-1060877937) - Color.argb(0, 0, 0, 0), (-53) - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.indexOf("", "", 0, 0) - 1568892545, (byte) ((-1) - ExpandableListView.getPackedPositionChild(0L))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return Boolean.valueOf(bk.m939(bk.this));
            }
        });
        int i10 = f826 + 73;
        f827 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 98 / 0;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m931(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2435) {
            try {
                i.f2436 = i10;
                char[] cArr2 = new char[cArr.length];
                i.f2434 = 0;
                while (true) {
                    int i11 = i.f2434;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f825);
                        i.f2434++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m939(bk bkVar) {
        int i10 = f826 + 61;
        f827 = i10 % 128;
        if (i10 % 2 != 0) {
            m924();
            throw null;
        }
        boolean zM924 = m924();
        f827 = (f826 + 47) % 128;
        return zM924;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        f827 = (f826 + 59) % 128;
        switch (str.hashCode()) {
            case -1602236458:
                if (str.equals(m936((short) (103 - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1060877958, (-38) - View.getDefaultSize(0, 0), Color.red(0) - 1568892717, (byte) KeyEvent.normalizeMetaState(0)).intern())) {
                    return a.class;
                }
                return null;
            case -1251618628:
                if (!str.equals(m931("㐺敊雒쁇燍ꌾ\udcbaฝ뾂\ue8e9᩼䯌\ue563ᚭ䀲\uf191⌨岛跿㽳棛驕쮻攧", KeyEvent.keyCodeFromString("") + 20849).intern())) {
                    return null;
                }
                f826 = (f827 + 75) % 128;
                return CBImpressionActivity.class;
            case -921117961:
                if (str.equals(m931("㐺ᔎ癚型냝鈂\uf322\udc79㶢ọ砄奐멄鮫\ue4eb옋❟\u0095憷䋯", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 8500).intern())) {
                    return com.chartboost.sdk.CBImpressionActivity.class;
                }
                return null;
            case -869710636:
                if (str.equals(m936((short) (View.MeasureSpec.getMode(0) + 106), View.resolveSize(0, 0) - 1060877975, (-46) - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1568892743, (byte) (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                    return ChartboostActivity.class;
                }
                return null;
            case -513187163:
                if (str.equals(m936((short) ((KeyEvent.getMaxKeyCode() >> 16) - 96), Color.rgb(0, 0, 0) - 1044100759, (-55) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-1568892727) - Process.getGidForName(""), (byte) ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    return Chartboost.class;
                }
                return null;
            case -416101408:
                if (!str.equals(m931("㐺뀀㱆뢥ⓥꄬ\u2d7eꦗᗒ鈃Ṙ骞۱苣༤譭瞪\uf3eb砞\ue47b悑\uecc7椝핝内\uddc3", Color.alpha(0) + 33851).intern())) {
                    return null;
                }
                f827 = (f826 + 3) % 128;
                return com.chartboost.sdk.legacy.CBImpressionActivity.class;
            case -371244199:
                if (str.equals(m931("㐺\ufff8ꎲ坕ᬑ컟\uf28aꙘ樈᷍솉", Color.argb(0, 0, 0, 0) + 52163).intern())) {
                    return Chartboost.CBMediation.class;
                }
                return null;
            case -352872024:
                if (str.equals(m931("㐸ढ乄莥샩خ孡颡\udde2ጥ", 15679 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    return AdCallback.class;
                }
                return null;
            case -305846637:
                if (str.equals(m936((short) (ExpandableListView.getPackedPositionGroup(0L) + 87), (-1060877961) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-48) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) - 1568892628, (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) {
                    return RewardedCallback.class;
                }
                return null;
            case -221039695:
                if (str.equals(m931("㐰돊㮷ꎋ⭿鍛ᬣ茛\u0ae5\uf2d5窺\ue26a橦툡娃쇦䧋ㆵ릐ⅵ", TextUtils.lastIndexOf("", '0', 0, 0) + 34782).intern())) {
                    return InterstitialCallback.class;
                }
                return null;
            case -174936018:
                if (!str.equals(m936((short) ((-16777215) - Color.rgb(0, 0, 0)), (-1060877960) - View.MeasureSpec.getMode(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 58, (-1568892635) - Gravity.getAbsoluteGravity(0, 0), (byte) ((-1) - ImageFormat.getBitsPerPixel(0))).intern())) {
                    return null;
                }
                f827 = (f826 + 11) % 128;
                return Rewarded.class;
            case 2115:
                if (!str.equals(m931("㐸\u0ef8", 15077 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    return null;
                }
                f827 = (f826 + 7) % 128;
                return Ad.class;
            case 296803428:
                if (str.equals(m931("㐽镥盠큋뇄ፃﲴ帣㾳餈窎쐿ꕡۋ\ue07e䇎⍅賞渢쾵ꤶ", (ViewConfiguration.getTapTimeout() >> 16) + 41333).intern())) {
                    return DismissibleAdCallback.class;
                }
                return null;
            case 544981520:
                if (str.equals(m936((short) (60 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) - 1060877943, (Process.myPid() >> 22) - 21, (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1568892601, (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    return CBImpressionActivity.class;
                }
                return null;
            case 604162924:
                if (!str.equals(m936((short) (View.resolveSizeAndState(0, 0, 0) - 12), Color.blue(0) - 1060877943, (-19) - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1568892691, (byte) (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                    return null;
                }
                f826 = (f827 + 87) % 128;
                return com.chartboost.sdk.legacy.CBImpressionActivity.class;
            case 650412337:
                if (str.equals(m931("㐴贈ꦧ墇ཬ㹜\ued3e鰝䋿燱₴흢虀딬", TextUtils.indexOf("", "") + 52957).intern())) {
                    return MediationModel.class;
                }
                return null;
            case 753858215:
                if (str.equals(m936((short) ((-84) - View.resolveSize(0, 0)), (-1060877959) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 52, TextUtils.getTrimmedLength("") - 1568892613, (byte) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                    return StartCallback.class;
                }
                return null;
            case 769047372:
                if (!str.equals(m936((short) ((-16) - ExpandableListView.getPackedPositionGroup(0L)), (-1060877970) - TextUtils.indexOf((CharSequence) "", '0', 0), (-52) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (-1568892646) - (ViewConfiguration.getScrollBarSize() >> 8), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                    return null;
                }
                f827 = (f826 + 65) % 128;
                return Interstitial.class;
            case 1443881784:
                if (!str.equals(m931("㐺뫴⦮顺༕\ufe1e泂펩", (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 36559).intern())) {
                    return null;
                }
                int i10 = f826 + 7;
                f827 = i10 % 128;
                if (i10 % 2 == 0) {
                    return CBInPlay.class;
                }
                return Chartboost.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m938(ck ckVar) {
        f827 = (f826 + 65) % 128;
        m928(m929((ChartboostDelegate) m920(), ckVar));
        f827 = (f826 + 13) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m936(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f830;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f831;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f828 + i12] + i13);
                    } else {
                        i14 = (short) (f832[f828 + i12] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f828 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f829);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f831;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f832;
                            int i17 = n.f3072;
                            n.f3072 = i17 - 1;
                            n.f3074 = (char) (n.f3075 + (((short) (sArr[i17] + s10)) ^ n.f3073));
                        }
                        sb2.append(n.f3074);
                        n.f3075 = n.f3074;
                        n.f3071++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m928(ChartboostDelegate chartboostDelegate) {
        int i10 = f826 + 17;
        f827 = i10 % 128;
        int i11 = i10 % 2;
        Chartboost.setDelegate(chartboostDelegate);
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m927(CBInPlay cBInPlay) {
        f826 = (f827 + 59) % 128;
        String appName = cBInPlay.getAppName();
        f826 = (f827 + 23) % 128;
        return appName;
    }
}
