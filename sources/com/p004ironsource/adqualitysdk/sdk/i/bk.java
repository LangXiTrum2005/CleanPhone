package com.p004ironsource.adqualitysdk.sdk.i;

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
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.chartboost.sdk.CBImpressionActivity;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ChartboostActivity;
import com.chartboost.sdk.ChartboostDelegate;
import com.chartboost.sdk.InPlay.CBInPlay;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.requests.models.MediationModel;
import com.chartboost.sdk.a;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.g;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class bk extends bg {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f827 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f829 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f828 = {'C', 48608, 31601, 14570, 63060, 46026, 29023, 11991, 60467, 43452, 26385, 9403, 57876, 40833, 23814, 6801, 55540, 38513, 45370, 3225, 51720, 35219, 18221, 691, 49190, 40878, 23882, 6341, 9619, 38938, 24201, 7462, 54176, 38420, 21633, 2833, 39499, 10178, 57685, 41717, 27724, 10697, 60249, 46276, 30241, 13231, 64822, 63166, 19230, 36231, 52738, 178, 17711, 34730, 55332, 6877, 24438, 37324, 53839, 5366, 26999, 20652, 60674, 11145, 26627, 42685, 58162, 8617, 32291, 48339, 63859, 14272, 29761, 45802, 53092, 3562, 19055, 34839, 50819, 796, 16804, 40509, 56508, 6445, 22439, 37977, 53956, 28493, 3317, 45436, 30703, 13379, 64230, 49004, 32227, 8829, 57477, 42263, 27529, 10240, 61082, 37691, 20897, 5679, 54357, 39623, 24423, 7629, 49762, 33015, 17776, 3047, 51202, 36487, 'c', 48615, 31613, 14518, 63043, 46016, 29009, 11978, 60468, 43434, 26431, 9399, 57875, 40860, 23902, 6795, 55524, 38499, 21438, 4468, 52933, 35919, 18897, 1883, 50361, 33382, 16275, 64794, 47785, 30725, 13696, 62218, 45413, 28411, 11363, 59889, 42831, 25798, 8817, 57307, 40244, 23201, 6182, 54705, 37652, 20625, 38484, 11259, 60793, 44768, 24655, 9670, 59225, 47308, 31273, 16316, 61740, 45737, 21516, 59827, 12089, 27815, 41484, 59282, 9483, 31362, 10622, 38081, 21067, 4565, 57214, 39648, 22649, 2032, 50479, 32901, 19984, 3480, 52014, 46757, 29759, 13247, 35022, 13639, 62420, 45176, 32477, 15191, 63960, 42566, 25790, 8492, 61362, 44091, 27323, 5900, 54680, 37378, 20556, 7910, 56169, 39420, 18011, 1228, 49481, 36812, 1652, 48126, 32119, 16072, 61531, 46554, 30545, 10463, 59953, 44980, 24876, 8888, 58375, 39359, 23302, 7303, 57078, 36988, 21986, 6015, 51414, 'g', 48621, 31588, 14555, 63048, 46025, 28994, 11980, 60450, 43431, 26431, 9387, 57876, 40894, 23880, 6823, 55476, 38487, 21408, 4444, 52933, 35908, 18901, 1887, 50337, 33340, 16309, 'c', 48634, 31605, 14585, 63060, 46029, 29028, 12026, 60419, 43424, 26417, 9386, 57876, 40842, 23839, 6807, 55539, 38524, 21460, 4477, 52940, 35917, 18903, 1881, 50356, 33325, 'i', 48635, 31559, 14589, 63042, 46078, 29017, 11997, 60471, 43405, 26430, 9401, 57858, 40836, 23829, 6812, 23829, 57503, 9750, 26027, 43810, 61098, 11276, 29611, 45407, 62687};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f826 = 6250170775138319752L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f830 = 4025454710350715304L;

    public class e extends ChartboostDelegate implements hg<ChartboostDelegate> {

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f840 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f841 = 1;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static long f842;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char[] f843;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private ch f845;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ChartboostDelegate f846;

        static {
            char[] cArr = new char[1261];
            ByteBuffer.wrap("\u0012¸ý\u009cÌ\u0084ß¤®³¹Ò\u0088Î\u009býjðu\bD)W;&#1]\u0000N\u0013{â\u007fÍaÝÛ¬\u0095¿¿\u008e¯\u0099ÄhÎ{÷JÞU\u0018$\u001f7*\u0006-\u0011Jà^óRÂz\u00adq½\u0093\u008c\u0095\u009f£nµyÛH×[õ*ì5\u0012\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾n\u00adD\u009cT\u008b?z5i\fX3Gï6æ%Ô\u0014ß\u0003£ò¨á©Ð\u0081¿\u008a¯h\u009en\u008dX|Nk Z,I\u000e8\u0017'é`å\u008fÁ¾Ù\u00adùÜîË\u008fú\u0093é \u0018\u00ad\u0007U6t%fT~C\u0000r\u0013a&\u0090\"¿<¯\u0086ÞßÍãüùë¯\u001a\u009e\t\u00ad8¹'EVzEltac\u0001\u0092\u0005\u00815°=ß1ÏßþÓíì\u001cðø_\u0017{&c5CDTS5b)q\u001a\u0080\u0017\u009fï®Î½ÜÌÄÛºê©ù\u009c\b\u0098'\u00867<FeUYdCs\u0010\u0082$\u0091\u001d \u0007¿ÎÎæÝôìÀû¿\n©\u0019µ(\u009dG\u0096WtfruD\u0084R\u0093<¢0±\u0012À\u000bßõ\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\u000ez0i\u001bX\u001aGï6æ%×\u0014ú\u0003¬ò¥á\u0085Ð\u009d¿\u008d¯y\u009eu\u008d_|Sk(Z4\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\tz5i\u0007X\u0004Gã6Ü%Ê\u0014Ç\u0003§ò£á\u0093Ð\u009b¿\u0097¯y\u009eu\u008dJ|V\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\tz5i\u0001X\u0014Gí6Ü%Ê\u0014Ç\u0003§ò£á\u0093Ð\u009b¿\u0097¯y\u009eu\u008dJ|VìC\u0003g2\u007f!_PHG)v5e\u0006\u0094\u000b\u008bóºÒ©ÀØØÏ¦þµí\u0080\u001c\u00843\u009a# RyAEp_g\u000e\u00960\u0085\u001b´\u0007«êÚôÉÝøúï¬\u001e¥\r\u0085<\u009dS\u008dCyrua_\u0090S\u0087(¶4\u008f\u009a`¾Q¦B\u00863\u0091$ð\u0015ì\u0006ß÷Òè*Ù\u000bÊ\u0019»\u0001¬\u007f\u009dl\u008eY\u007f]PC@ù1 \"\u009c\u0013\u0086\u0004ÐõïæÜ×ÞÈ3¹)ª\t\u009b\u000f\u008cR}fnM_S0U §\u0011±\u0002\u009bó\u0097äùÕàÆÒ\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾n\u00adD\u009cT\u008b?z5i\fX%Gã6ä%Ñ\u0014Ö\u0003±ò¥á\u00adÐ\u0080¿\u008c¯h\u009e]\u008d[|Jk:°À_änü}Ü\fË\u001bª*¶9\u0085È\u0088×pæQõC\u0084[\u0093%¢6±\u0003@\u0007o\u0019\u007f£\u000eú\u001dÆ,Ü;\u008aÊ»Ù\u0088è\u009c÷`\u0086[\u0095H¤B³$B\u0013Q\u0013`\u001c\u000f\u000e9\u008aÖ®ç¶ô\u0096\u0085\u0081\u0092à£ü°ÏAÂ^:o\u001b|\t\r\u0011\u001ao+|8IÉMæSöé\u0087§\u0094\u008d¥\u009d²öCüPÅaú~&\u000f/\u001c\u001d-\u0016:jËaØdéI\u0086E\u0096¡§\u0094´\u0092E\u0083Ró\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\fz8i\u0001X\u001bGÒ6ú%è\u0014Ü\u0003£òµá\u00adÐ\u0080¿\u008c¯h\u009e]\u008d[|Jk:\u0088àgÄVÜEü4ë#\u008a\u0012\u0096\u0001¥ð¨ïPÞqÍc¼{«\u0005\u009a\u0016\u0089#x'W9G\u00836Ú%æ\u0014ü\u0003\u00adò\u0093á¸Ð¹ÏL¾E\u00adt\u009c]\u008b\u000ez\u0000i&X\r7-'Þ\u0016Ì\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\tz5i\u0007X\u0004Gã6Ø%Ë\u0014Á\u0003§ò\u0090á\u0090Ð\u009f¿\u008d\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\tz5i\u0001X\u0014Gí6Ø%Ë\u0014Á\u0003§ò\u0090á\u0090Ð\u009f¿\u008d\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\u000ez0i\u001bX\u0007Gê6ô%Ý\u0014þ\u0003\u00adò£á\u0085Ð®¿\u008e¯}\u009eo\u009e§q\u0083@\u009bS»\"¬5Í\u0004Ñ\u0017âæïù\u0017È6Û$ª<½B\u008cQ\u009fdn`A~QÄ \u009d3¡\u0002»\u0015èäÜ÷åÆÿÙ6¨\u001e»\u0012\u008a2\u009dElZ\u007fvNo!Y1\u0085\u0000\u0091\u0013¬âµ\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\u001az8i\u001dX\u0004Gã6Ö%È\u0014Ú\u0003¡òºá¦Ð\u0080¿\u008c¯N\u009es\u008dE|\\k Z*I\n8\u0017'ñ\u0016ý\u0005ÌôÜ\u0000dïfÞzÍ}¼]«>\u009a)\u0089\fx;gëVÿEÆ4ß#\u0085\u0012½\u0001\u0093ð³ß\u0090Ï`¾{\u00adE\u009cI\u008b'z8i\u001cX\u001eGé6ûU]ºy\u008ba\u0098AéVþ7Ï+Ü\u0018-\u00152í\u0003Ì\u0010ÞaÆv¸G«T\u009e¥\u009a\u008a\u0084\u009a>ëpøZÉJÞ!/+<\u0012\r-\u0012ñcøpÊAÁV½§¶´¬\u0085\u0094ê\u0097úrËpØQ)A>3\u000f\u0010\u001c\u0010m\frþCå\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\tz8i\u000bX\u001fGã6Ç%Á\u0014Ä\u0003£ò£á\u0084Ð\u008a¿\u009a¯[\u009eu\u008dO|_k&\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\fz8i\u0001X\u001bGÒ6ú%è\u0014Ü\u0003£òµá²Ð\u008a¿\u0089¯l\u009en\u008dO|_k-Z\u000eI\u000e8\u0012'à\u0016û\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\u000ez0i\u001bX\u001aGï6æ%×\u0014á\u0003§ò¦á\u0081Ð\u009d¿\u009a¯h\u009ex\u008d}|Sk-Z=I\bÒX=|\fd\u001fDnSy2H.[\u001dª\u0010µè\u0084É\u0097ÛæÃñ½À®Ó\u009b\"\u009f\r\u0081\u001d;lb\u007f^NDY\u0012¨.»\u001c\u008a\u001f\u0095øäÜ÷ÚÆßÑ¸ ¸3\u009f\u0002\u0091m\u0081}@Ln_T®D¹=\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\tz5i\u0001X\u0014Gí6Ç%Á\u0014Ä\u0003£ò£á\u0084Ð\u008a¿\u009a¯[\u009eu\u008dO|_k&\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\tz6i\u0005X\u0007Gê6ð%Ð\u0014Ö\u0003\u0090ò´á\u0097Ð\u008e¿\u008c¯i\u009ey\u008dO|lk Z<I\u00028\u0019\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\u000ez0i\u001bX\u0007Gê6ô%Ý\u0014á\u0003§ò¦á\u0081Ð\u009d¿\u009a¯h\u009ex\u008d}|Sk-Z=I\bìv\u0003R2J!jP}G\u001cv\u0000e3\u0094>\u008bÆºç©õØíÏ\u0093þ\u0080íµ\u001c±3¯#\u0015R_Appbg\u0013\u0096(\u00854´1«ÃÚÌÉðøÿï¡\u001e\u008d\r±<¿S¤\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\tz8i\u000bX\u001fGã6Ü%Ê\u0014ã\u0003®ò°á\u0099\u0000CïgÞ\u007fÍ_¼H«)\u009a5\u0089\u0006x\u000bgóVÒEÀ4Ø#¦\u0012µ\u0001\u0080ð\u0084ß\u009aÏ ¾y\u00adE\u009c_\u008b\fz8i\u0001X\u001bGÒ6ú%è\u0014Ü\u0003£òµá©Ð\u0081¿®¯a\u009e}\u008dR\t\ræ)×1Ä\u0011µ\u0006¢g\u0093{\u0080HqEn½_\u009cL\u008e=\u0096*è\u001bû\bÎùÊÖÔÆn·7¤\u000b\u0095\u0011\u0082Msy`OQMN¡?º,\u0086\u001d\u0094\nöûú".getBytes(CharEncoding.ISO_8859_1)).asCharBuffer().get(cArr, 0, 1261);
            f843 = cArr;
            f842 = 2331273901551709967L;
        }

        public e(ChartboostDelegate chartboostDelegate, ch chVar) {
            this.f846 = chartboostDelegate;
            this.f845 = chVar;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private ChartboostDelegate m909() {
            int i2 = f841 + 123;
            f840 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.f846;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m910(int i2, int i3, char c2) {
            String str;
            synchronized (a.f68) {
                try {
                    char[] cArr = new char[i2];
                    a.f69 = 0;
                    while (true) {
                        int i4 = a.f69;
                        if (i4 < i2) {
                            cArr[i4] = (char) ((((long) f843[i3 + i4]) ^ (((long) i4) * f842)) ^ ((long) c2));
                            a.f69 = i4 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str;
        }

        public void didCacheInPlay(String str) {
            f840 = (f841 + 103) % 128;
            bk.this.m790(this, this.f845, m910(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 34, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1157, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                int i2 = f840 + 91;
                f841 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didCacheInPlay(str);
                if (i3 == 0) {
                    throw null;
                }
            }
        }

        public void didCacheInterstitial(String str) {
            f841 = (f840 + 89) % 128;
            bk.this.m790(this, this.f845, m910(TextUtils.indexOf((CharSequence) "", '0', 0) + 40, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 88, (char) ((Process.myTid() >> 22) + 24742)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                f841 = (f840 + 1) % 128;
                chartboostDelegate.didCacheInterstitial(str);
                f841 = (f840 + 95) % 128;
            }
        }

        public void didCacheMoreApps(String str) {
            f840 = (f841 + 91) % 128;
            bk.this.m790(this, this.f845, m910(Color.blue(0) + 35, KeyEvent.getDeadChar(0, 0) + TTAdConstant.VIDEO_INFO_CODE, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45187)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                int i2 = f841 + 21;
                f840 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didCacheMoreApps(str);
                if (i3 != 0) {
                    int i4 = 36 / 0;
                }
                f840 = (f841 + 109) % 128;
            }
        }

        public void didCacheRewardedVideo(String str) {
            bk.this.m790(this, this.f845, m910(40 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 831 - Color.argb(0, 0, 0, 0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                f840 = (f841 + 117) % 128;
                chartboostDelegate.didCacheRewardedVideo(str);
                f841 = (f840 + 85) % 128;
            }
        }

        public void didClickInterstitial(String str) {
            f840 = (f841 + 33) % 128;
            bk.this.m790(this, this.f845, m910(TextUtils.indexOf((CharSequence) "", '0', 0) + 40, TextUtils.getOffsetAfter("", 0) + 251, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                int i2 = f841 + 101;
                f840 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didClickInterstitial(str);
                if (i3 != 0) {
                    throw null;
                }
            }
        }

        public void didClickMoreApps(String str) {
            f840 = (f841 + 31) % 128;
            bk.this.m790(this, this.f845, m910((ViewConfiguration.getPressedStateDuration() >> 16) + 35, 600 - KeyEvent.getDeadChar(0, 0), (char) TextUtils.getOffsetBefore("", 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                f841 = (f840 + 113) % 128;
                chartboostDelegate.didClickMoreApps(str);
            }
            f840 = (f841 + 71) % 128;
        }

        public void didClickRewardedVideo(String str) {
            f840 = (f841 + 75) % 128;
            bk.this.m790(this, this.f845, m910(40 - Gravity.getAbsoluteGravity(0, 0), ExpandableListView.getPackedPositionType(0L) + 998, (char) Drawable.resolveOpacity(0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                int i2 = f840 + 3;
                f841 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didClickRewardedVideo(str);
                if (i3 == 0) {
                    throw null;
                }
            }
            int i4 = f840 + 7;
            f841 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public void didCloseInterstitial(String str) {
            f840 = (f841 + 67) % 128;
            bk.this.m790(this, this.f845, m910(38 - ExpandableListView.getPackedPositionChild(0L), MotionEvent.axisFromString("") + Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCloseInterstitial(str);
                f840 = (f841 + 19) % 128;
            }
        }

        public void didCloseMoreApps(String str) {
            f840 = (f841 + 53) % 128;
            bk.this.m790(this, this.f845, m910(35 - Drawable.resolveOpacity(0, 0), View.resolveSize(0, 0) + 565, (char) ((-16777216) - Color.rgb(0, 0, 0))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCloseMoreApps(str);
                f840 = (f841 + 77) % 128;
            }
        }

        public void didCloseRewardedVideo(String str) {
            f841 = (f840 + 3) % 128;
            bk.this.m790(this, this.f845, m910(AndroidCharacter.getMirror('0') - '\b', 957 - MotionEvent.axisFromString(""), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 53787)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                int i2 = f841 + 81;
                f840 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didCloseRewardedVideo(str);
                if (i3 != 0) {
                    throw null;
                }
            }
            f841 = (f840 + 91) % 128;
        }

        public void didCompleteInterstitial(String str) {
            f841 = (f840 + 63) % 128;
            bk.this.m790(this, this.f845, m910(42 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 331 - View.combineMeasuredStates(0, 0), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 36825)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCompleteInterstitial(str);
                f841 = (f840 + 99) % 128;
            }
        }

        public void didCompleteRewardedVideo(String str, int i2) {
            f841 = (f840 + 3) % 128;
            bk.this.m790(this, this.f845, m910(View.getDefaultSize(0, 0) + 43, TextUtils.indexOf("", "", 0) + IronSourceError.ERROR_RV_SHOW_EXCEPTION, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern(), str, Integer.valueOf(i2));
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCompleteRewardedVideo(str, i2);
            }
            int i3 = f841 + 105;
            f840 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 79 / 0;
            }
        }

        public void didDismissInterstitial(String str) {
            f840 = (f841 + 117) % 128;
            bk.this.m790(this, this.f845, m910((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 40, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 171, (char) (Process.myPid() >> 22)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                int i2 = f840 + 11;
                f841 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didDismissInterstitial(str);
                if (i3 == 0) {
                    throw null;
                }
            }
        }

        public void didDismissMoreApps(String str) {
            f841 = (f840 + 105) % 128;
            bk.this.m790(this, this.f845, m910(37 - ExpandableListView.getPackedPositionGroup(0L), ExpandableListView.getPackedPositionChild(0L) + 529, (char) (34980 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                int i2 = f841 + 19;
                f840 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didDismissMoreApps(str);
                if (i3 != 0) {
                    throw null;
                }
            }
        }

        public void didDismissRewardedVideo(String str) {
            f841 = (f840 + 79) % 128;
            bk.this.m790(this, this.f845, m910(42 - (ViewConfiguration.getScrollBarSize() >> 8), 916 - Color.alpha(0), (char) (Process.myPid() >> 22)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                int i2 = f841 + 5;
                f840 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didDismissRewardedVideo(str);
                if (i3 != 0) {
                    int i4 = 65 / 0;
                }
            }
        }

        public void didDisplayInterstitial(String str) {
            f840 = (f841 + 93) % 128;
            bk.this.m790(this, this.f845, m910(40 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 291 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 60416)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                f840 = (f841 + 113) % 128;
                chartboostDelegate.didDisplayInterstitial(str);
            }
        }

        public void didDisplayMoreApps(String str) {
            f841 = (f840 + 63) % 128;
            bk.this.m790(this, this.f845, m910((ViewConfiguration.getKeyRepeatDelay() >> 16) + 37, (ViewConfiguration.getScrollBarSize() >> 8) + 635, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                f841 = (f840 + 73) % 128;
                chartboostDelegate.didDisplayMoreApps(str);
            }
        }

        public void didDisplayRewardedVideo(String str) {
            f841 = (f840 + 33) % 128;
            bk.this.m790(this, this.f845, m910(42 - (ViewConfiguration.getLongPressTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 1081, (char) View.getDefaultSize(0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                chartboostDelegate.didDisplayRewardedVideo(str);
            }
            f841 = (f840 + 19) % 128;
        }

        public void didFailToLoadInPlay(String str, CBError.CBImpressionError cBImpressionError) {
            f840 = (f841 + 3) % 128;
            bk.this.m790(this, this.f845, m910(Color.red(0) + 38, View.getDefaultSize(0, 0) + 1191, (char) ExpandableListView.getPackedPositionType(0L)).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                chartboostDelegate.didFailToLoadInPlay(str, cBImpressionError);
                f840 = (f841 + 77) % 128;
            }
        }

        public void didFailToLoadInterstitial(String str, CBError.CBImpressionError cBImpressionError) {
            f840 = (f841 + 125) % 128;
            bk.this.m790(this, this.f845, m910(44 - KeyEvent.normalizeMetaState(0), TextUtils.indexOf("", "", 0) + 127, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 63516)).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                int i2 = f840 + 47;
                f841 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didFailToLoadInterstitial(str, cBImpressionError);
                if (i3 == 0) {
                    int i4 = 18 / 0;
                }
            }
        }

        public void didFailToLoadMoreApps(String str, CBError.CBImpressionError cBImpressionError) {
            bk.this.m790(this, this.f845, m910((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 39, 487 - TextUtils.indexOf((CharSequence) "", '0'), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                int i2 = f840 + 123;
                f841 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didFailToLoadMoreApps(str, cBImpressionError);
                if (i3 == 0) {
                    throw null;
                }
            }
            f840 = (f841 + 95) % 128;
        }

        public void didFailToLoadRewardedVideo(String str, CBError.CBImpressionError cBImpressionError) {
            f840 = (f841 + 75) % 128;
            bk.this.m790(this, this.f845, m910((KeyEvent.getMaxKeyCode() >> 16) + 45, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 872, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1)).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                f840 = (f841 + 9) % 128;
                chartboostDelegate.didFailToLoadRewardedVideo(str, cBImpressionError);
            }
            f840 = (f841 + 5) % 128;
        }

        public void didFailToRecordClick(String str, CBError.CBClickError cBClickError) {
            bk.this.m790(this, this.f845, m910(View.MeasureSpec.getSize(0) + 39, (ViewConfiguration.getTouchSlop() >> 8) + 672, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 40676)).intern(), str, cBClickError);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                int i2 = f840 + 67;
                f841 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didFailToRecordClick(str, cBClickError);
                if (i3 == 0) {
                    int i4 = 24 / 0;
                }
            }
            f840 = (f841 + 67) % 128;
        }

        public void didInitialize() {
            f841 = (f840 + 27) % 128;
            bk.this.m790(this, this.f845, m910(((byte) KeyEvent.getModifierMetaStateMask()) + 33, Color.alpha(0) + 1229, (char) (View.resolveSizeAndState(0, 0, 0) + 2382)).intern(), new Object[0]);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                chartboostDelegate.didInitialize();
                f841 = (f840 + 77) % 128;
            }
        }

        public void didPauseClickForConfirmation(Activity activity) {
            f840 = (f841 + 65) % 128;
            bk.this.m790(this, this.f845, m910(Color.green(0) + 47, View.MeasureSpec.getMode(0) + IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_ADAPTER, (char) View.combineMeasuredStates(0, 0)).intern(), activity);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                f840 = (f841 + 65) % 128;
                try {
                    chartboostDelegate.getClass().getDeclaredMethod(m910(MotionEvent.axisFromString("") + 29, 757 - TextUtils.indexOf((CharSequence) "", '0'), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), Activity.class).invoke(this.f846, activity);
                    return;
                } catch (Throwable unused) {
                }
            }
            int i2 = f840 + 3;
            f841 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        public boolean shouldDisplayInterstitial(String str) {
            f840 = (f841 + 121) % 128;
            bk.this.m790(this, this.f845, m910(43 - TextUtils.lastIndexOf("", '0', 0), 44 - TextUtils.indexOf("", "", 0), (char) TextUtils.indexOf("", "", 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate == null) {
                return false;
            }
            boolean zShouldDisplayInterstitial = chartboostDelegate.shouldDisplayInterstitial(str);
            int i2 = f840 + 103;
            f841 = i2 % 128;
            if (i2 % 2 != 0) {
                return zShouldDisplayInterstitial;
            }
            throw null;
        }

        public boolean shouldDisplayMoreApps(String str) {
            f840 = (f841 + 15) % 128;
            bk.this.m790(this, this.f845, m910((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39, 447 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (14794 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate == null) {
                return false;
            }
            f840 = (f841 + 111) % 128;
            return chartboostDelegate.shouldDisplayMoreApps(str);
        }

        public boolean shouldDisplayRewardedVideo(String str) {
            bk.this.m790(this, this.f845, m910(45 - View.MeasureSpec.getMode(0), Color.rgb(0, 0, 0) + 16778002, (char) (21790 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                f840 = (f841 + 81) % 128;
                return chartboostDelegate.shouldDisplayRewardedVideo(str);
            }
            f841 = (f840 + 93) % 128;
            return false;
        }

        public boolean shouldRequestInterstitial(String str) {
            bk.this.m790(this, this.f845, m910(44 - (ViewConfiguration.getScrollDefaultDelay() >> 16), View.resolveSize(0, 0), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4859)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                f840 = (f841 + 107) % 128;
                return chartboostDelegate.shouldRequestInterstitial(str);
            }
            int i2 = f841 + 79;
            f840 = i2 % 128;
            if (i2 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public boolean shouldRequestMoreApps(String str) {
            f840 = (f841 + 63) % 128;
            bk.this.m790(this, this.f845, m910(41 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 373, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate == null) {
                return false;
            }
            int i2 = f840 + 61;
            f841 = i2 % 128;
            if (i2 % 2 != 0) {
                return chartboostDelegate.shouldRequestMoreApps(str);
            }
            chartboostDelegate.shouldRequestMoreApps(str);
            throw null;
        }

        public void willDisplayVideo(String str) {
            f841 = (f840 + 61) % 128;
            bk.this.m790(this, this.f845, m910((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 35, 1124 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (Drawable.resolveOpacity(0, 0) + 60469)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f846;
            if (chartboostDelegate != null) {
                chartboostDelegate.willDisplayVideo(str);
            }
            f840 = (f841 + 103) % 128;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﻛ */
        public final /* synthetic */ ChartboostDelegate mo713() {
            f840 = (f841 + 41) % 128;
            ChartboostDelegate chartboostDelegateM909 = m909();
            int i2 = f841 + 19;
            f840 = i2 % 128;
            if (i2 % 2 == 0) {
                return chartboostDelegateM909;
            }
            throw null;
        }
    }

    public bk(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static boolean m889() {
        int i2 = f827 + 13;
        f829 = i2 % 128;
        if (i2 % 2 != 0) {
            return m891() instanceof e;
        }
        int i3 = 81 / 0;
        return m891() instanceof e;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static boolean m890() {
        f827 = (f829 + 59) % 128;
        boolean zIsWebViewEnabled = Chartboost.isWebViewEnabled();
        int i2 = f829 + 45;
        f827 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 2 / 0;
        }
        return zIsWebViewEnabled;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static Object m891() {
        int i2 = f829 + 121;
        f827 = i2 % 128;
        if (i2 % 2 != 0) {
            Chartboost.getDelegate();
            throw null;
        }
        a delegate = Chartboost.getDelegate();
        int i3 = f829 + 47;
        f827 = i3 % 128;
        if (i3 % 2 == 0) {
            return delegate;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static Object m892() {
        f829 = (f827 + 25) % 128;
        com.chartboost.sdk.impl.a aVar = g.d;
        f827 = (f829 + 123) % 128;
        return aVar;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static /* synthetic */ boolean m893() {
        f829 = (f827 + 41) % 128;
        boolean zM890 = m890();
        f827 = (f829 + 77) % 128;
        return zM890;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ Object m894() {
        f827 = (f829 + 87) % 128;
        Object objM891 = m891();
        f827 = (f829 + 19) % 128;
        return objM891;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ Object m895() {
        int i2 = f827 + 125;
        f829 = i2 % 128;
        if (i2 % 2 != 0) {
            return m892();
        }
        m892();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m896(CBInPlay cBInPlay) {
        f829 = (f827 + 67) % 128;
        String strM900 = m900(cBInPlay);
        int i2 = f827 + 13;
        f829 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 97 / 0;
        }
        return strM900;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m901(ChartboostDelegate chartboostDelegate) {
        f829 = (f827 + 123) % 128;
        m904(chartboostDelegate);
        int i2 = f829 + 57;
        f827 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ e m902(bk bkVar, ChartboostDelegate chartboostDelegate, ch chVar) {
        f827 = (f829 + 45) % 128;
        e eVarM899 = bkVar.m899(chartboostDelegate, chVar);
        int i2 = f829 + 59;
        f827 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 83 / 0;
        }
        return eVarM899;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m906(CBInPlay cBInPlay) {
        int i2 = f827 + 33;
        f829 = i2 % 128;
        if (i2 % 2 != 0) {
            return m908(cBInPlay);
        }
        m908(cBInPlay);
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        int i2 = f829 + 49;
        f827 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                return Chartboost.getSDKVersion();
            }
            Chartboost.getSDKVersion();
            throw null;
        } catch (Error unused) {
            return m907("馞鸛隣轑蟬", 1997 - AndroidCharacter.getMirror('0')).intern();
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m898(bk bkVar) {
        f827 = (f829 + 111) % 128;
        boolean zM889 = m889();
        f829 = (f827 + 99) % 128;
        return zM889;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m905(bk bkVar, ch chVar) {
        int i2 = f827 + 65;
        f829 = i2 % 128;
        int i3 = i2 % 2;
        bkVar.m897(chVar);
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        int i5 = f827 + 81;
        f829 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m907(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2055) {
            try {
                g.f2056 = i2;
                char[] cArr2 = new char[cArr.length];
                g.f2054 = 0;
                while (true) {
                    int i3 = g.f2054;
                    if (i3 < cArr.length) {
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f830);
                        g.f2054++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m907("駛쑘⋶腃\uef9e䨅ꢳᛗ略폲㸛鲻בּ", (ViewConfiguration.getTouchSlop() >> 8) + 23957).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bk.m905(bk.this, chVar);
                return null;
            }
        });
        map.put(m903(Color.rgb(0, 0, 0) + 16777237, TextUtils.indexOf("", "", 0, 0) + Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1554)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bk.m894();
            }
        });
        map.put(m903((ViewConfiguration.getTouchSlop() >> 8) + 27, Color.argb(0, 0, 0, 0) + 241, (char) KeyEvent.getDeadChar(0, 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bk.m895();
            }
        });
        map.put(m903(ExpandableListView.getPackedPositionType(0L) + 26, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 268, (char) View.resolveSize(0, 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bk.m902(bk.this, (ChartboostDelegate) list.get(0), chVar);
            }
        });
        map.put(m907("駛Ṭ隞༈蝄㿬된ⲻ꓂嵮햍䨰쉐竁\uf303殫\ue3dd顾ႛ褯ř", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 34721).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bk.m901((ChartboostDelegate) list.get(0));
                return null;
            }
        });
        map.put(m903(16 - ExpandableListView.getPackedPositionType(0L), 294 - Color.green(0), (char) Gravity.getAbsoluteGravity(0, 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return Boolean.valueOf(bk.m893());
            }
        });
        map.put(m907("駏췺ㆲ敁줛㳘悃푝㡹氨폠", 21559 - ExpandableListView.getPackedPositionType(0L)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bk.m896((CBInPlay) list.get(0));
            }
        });
        map.put(m903(10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 310 - Color.green(0), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23922)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bk.m906((CBInPlay) list.get(0));
            }
        });
        map.put(m907("駁\ue970碪쯋孀ꪚ㷆赠Თ濊ｲ五", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28843).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return Boolean.valueOf(bk.m898(bk.this));
            }
        });
        f827 = (f829 + 61) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m897(ch chVar) {
        f827 = (f829 + 63) % 128;
        m904(m899((ChartboostDelegate) m891(), chVar));
        int i2 = f829 + 27;
        f827 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:78:0x0323  */
    /* JADX WARN: Code duplicated, block: B:9:0x0050  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        byte b2 = 0;
        switch (str.hashCode()) {
            case -1602236458:
                if (!str.equals(m903(AndroidCharacter.getMirror('0') - 21, 60 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (20728 - (Process.myPid() >> 22))).intern())) {
                    b2 = -1;
                } else {
                    f827 = (f829 + 33) % 128;
                    b2 = 6;
                }
                break;
            case -1251618628:
                if (!str.equals(m903(23 - Process.getGidForName(""), 196 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (34957 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).intern())) {
                    b2 = -1;
                } else {
                    f829 = (f827 + 113) % 128;
                    b2 = 17;
                }
                break;
            case -921117961:
                if (!str.equals(m907("駫㑫싣酆\u2fdc著裋❜\uf5d3聈廍\ued4d믥噆\ue4d2덎䇎᱐\uaace祂", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44417).intern())) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case -869710636:
                if (!str.equals(m903(18 - ExpandableListView.getPackedPositionType(0L), 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern())) {
                    b2 = -1;
                }
                break;
            case -513187163:
                if (!str.equals(m903(Gravity.getAbsoluteGravity(0, 0) + 10, TextUtils.getOffsetBefore("", 0) + 18, (char) (45432 - TextUtils.indexOf((CharSequence) "", '0'))).intern())) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case -416101408:
                if (str.equals(m903((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 88, (char) (View.getDefaultSize(0, 0) + 3254)).intern())) {
                    int i2 = f829 + 107;
                    f827 = i2 % 128;
                    b2 = i2 % 2 == 0 ? (byte) 7 : (byte) 27;
                } else {
                    b2 = -1;
                }
                break;
            case -371244199:
                if (!str.equals(m903(11 - Drawable.resolveOpacity(0, 0), Color.rgb(0, 0, 0) + 16777252, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 39432)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case -352872024:
                if (!str.equals(m907("駩ꕉ\ue0e1ⱆ毐띝\uf2d4㹪緣륮", Color.green(0) + 15493).intern())) {
                    b2 = -1;
                } else {
                    int i3 = f827 + 65;
                    f829 = i3 % 128;
                    b2 = i3 % 2 != 0 ? (byte) 12 : (byte) 70;
                }
                break;
            case -305846637:
                b2 = 15;
                if (!str.equals(m903(15 - Process.getGidForName(""), 180 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (10540 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern())) {
                    b2 = -1;
                }
                break;
            case -221039695:
                if (!str.equals(m907("駡匫ఆ金뉮潺塒ᖺ캴뮔璋⇫\u1af7ퟀ脲稧㜚\ue074\udd61陔", 51949 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    f827 = (f829 + 9) % 128;
                    b2 = 14;
                }
                break;
            case -174936018:
                if (!str.equals(m903(Gravity.getAbsoluteGravity(0, 0) + 8, 172 - TextUtils.indexOf("", "", 0, 0), (char) (View.MeasureSpec.getMode(0) + 21598)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 11;
                }
                break;
            case 2115:
                if (!str.equals(m907("駩敹", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 64693).intern())) {
                    b2 = -1;
                } else {
                    b2 = 9;
                }
                break;
            case 296803428:
                if (!str.equals(m907("駬\ue950磹졶宅ꬎ㪽訶ᵂ泝ﱧ俒\udf00⺶븧ƻ郔\ue06b珻쌈劗", Color.rgb(0, 0, 0) + 16806033).intern())) {
                    b2 = -1;
                } else {
                    b2 = 13;
                }
                break;
            case 544981520:
                if (!str.equals(m907("駋솒⥯酹\uf89f\u2069蠷\uf389孴茷\uea95剠먧\ue58d䴠딠Ნ䑦걼ទ罥Ꜵຑ瘥\ude13㦧慃줲ゔ须쀻⮐鍻הּ⊍詙\uf21d嶂蕂\ued32咖뱜\ue42e侖", (ViewConfiguration.getFadingEdgeLength() >> 16) + 22613).intern())) {
                    b2 = -1;
                } else {
                    f829 = (f827 + 57) % 128;
                    b2 = 18;
                }
                break;
            case 604162924:
                if (!str.equals(m903(45 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 114 - (Process.myTid() >> 22), (char) TextUtils.getTrimmedLength("")).intern())) {
                    b2 = -1;
                } else {
                    int i4 = f827 + 29;
                    f829 = i4 % 128;
                    b2 = i4 % 2 != 0 ? (byte) 8 : (byte) 30;
                }
                break;
            case 650412337:
                if (!str.equals(m903(AndroidCharacter.getMirror('0') - '\"', (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 46, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 63218)).intern())) {
                    b2 = -1;
                } else {
                    f829 = (f827 + 57) % 128;
                    b2 = 5;
                }
                break;
            case 753858215:
                if (!str.equals(m907("駻䞫┧ʿ\ue000솸꼃貅橼䯥⥯ᛖ\uf457", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 56952).intern())) {
                    b2 = -1;
                } else {
                    b2 = 16;
                }
                break;
            case 769047372:
                if (!str.equals(m903(12 - (Process.myPid() >> 22), 159 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (ImageFormat.getBitsPerPixel(0) + 38430)).intern())) {
                    b2 = -1;
                } else {
                    int i5 = f829 + 79;
                    f827 = i5 % 128;
                    b2 = i5 % 2 == 0 ? (byte) 10 : (byte) 45;
                }
                break;
            case 1443881784:
                if (!str.equals(m903(8 - KeyEvent.getDeadChar(0, 0), 27 - ExpandableListView.getPackedPositionChild(0L), (char) (9680 - View.getDefaultSize(0, 0))).intern())) {
                    b2 = -1;
                } else {
                    int i6 = f829 + 45;
                    f827 = i6 % 128;
                    if (i6 % 2 == 0) {
                        b2 = 3;
                    } else {
                        b2 = 2;
                    }
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return ChartboostActivity.class;
            case 1:
                return CBImpressionActivity.class;
            case 2:
                return Chartboost.class;
            case 3:
                return CBInPlay.class;
            case 4:
                return Chartboost.CBMediation.class;
            case 5:
                return MediationModel.class;
            case 6:
                return e.class;
            case 7:
            case 8:
                return com.chartboost.sdk.legacy.CBImpressionActivity.class;
            case 9:
                return Ad.class;
            case 10:
                return Interstitial.class;
            case 11:
                return Rewarded.class;
            case 12:
                return AdCallback.class;
            case 13:
                return DismissibleAdCallback.class;
            case 14:
                return InterstitialCallback.class;
            case 15:
                return RewardedCallback.class;
            case 16:
                return StartCallback.class;
            case 17:
            case 18:
                return com.chartboost.sdk.view.CBImpressionActivity.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m908(CBInPlay cBInPlay) {
        f827 = (f829 + 45) % 128;
        String appName = cBInPlay.getAppName();
        int i2 = f829 + 93;
        f827 = i2 % 128;
        if (i2 % 2 == 0) {
            return appName;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private e m899(ChartboostDelegate chartboostDelegate, ch chVar) {
        e eVar = new e(chartboostDelegate, chVar);
        int i2 = f829 + 59;
        f827 = i2 % 128;
        if (i2 % 2 == 0) {
            return eVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m900(CBInPlay cBInPlay) {
        f829 = (f827 + 115) % 128;
        String location = cBInPlay.getLocation();
        f829 = (f827 + 117) % 128;
        return location;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m904(ChartboostDelegate chartboostDelegate) {
        f827 = (f829 + 47) % 128;
        Chartboost.setDelegate(chartboostDelegate);
        f827 = (f829 + 53) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m903(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f828[i3 + i4]) ^ (((long) i4) * f826)) ^ ((long) c2));
                        a.f69 = i4 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
