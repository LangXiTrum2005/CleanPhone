package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
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
import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdController;
import com.amazon.aps.ads.ApsAdRequest;
import com.amazon.aps.ads.ApsAdView;
import com.amazon.aps.ads.activity.ApsAdActivity;
import com.amazon.aps.ads.activity.ApsInterstitialActivity;
import com.amazon.aps.ads.listeners.ApsAdListener;
import com.amazon.aps.ads.listeners.ApsAdRequestListener;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.model.ApsAdType;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.AdType;
import com.amazon.device.ads.DTBActivity;
import com.amazon.device.ads.DTBAdActivity;
import com.amazon.device.ads.DTBAdBannerListener;
import com.amazon.device.ads.DTBAdBaseBannerListener;
import com.amazon.device.ads.DTBAdBaseInterstitialListener;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdExpandedListener;
import com.amazon.device.ads.DTBAdInterstitial;
import com.amazon.device.ads.DTBAdInterstitialListener;
import com.amazon.device.ads.DTBAdListener;
import com.amazon.device.ads.DTBAdLoader;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DTBAdView;
import com.amazon.device.ads.DTBAdViewSupportClient;
import com.amazon.device.ads.DTBFetchFactory;
import com.amazon.device.ads.DTBFetchManager;
import com.amazon.device.ads.DTBInterstitialActivity;
import com.amazon.device.ads.DTBRenderer;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class bj extends bg {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f789 = null;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f790 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f791;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f792;

    public class a extends HashMap<String, DTBFetchManager> implements hg<HashMap<String, DTBFetchManager>> {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f816 = 1;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static long f817 = 8917010822505236717L;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f818;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private ch f820;

        public a(HashMap<String, DTBFetchManager> map, ch chVar) {
            super(map);
            this.f820 = chVar;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private HashMap<String, DTBFetchManager> m886() {
            int i2 = f816 + 55;
            f818 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 33 / 0;
            }
            return this;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object put(Object obj, Object obj2) {
            f818 = (f816 + 57) % 128;
            DTBFetchManager dTBFetchManagerM884 = m884((String) obj, (DTBFetchManager) obj2);
            f818 = (f816 + 7) % 128;
            return dTBFetchManagerM884;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﻛ */
        public final /* synthetic */ HashMap<String, DTBFetchManager> mo713() {
            f818 = (f816 + 45) % 128;
            HashMap<String, DTBFetchManager> mapM886 = m886();
            f818 = (f816 + 115) % 128;
            return mapM886;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private DTBFetchManager m884(String str, DTBFetchManager dTBFetchManager) {
            f816 = (f818 + 71) % 128;
            bj.this.m790(this, this.f820, m885("ࢩ쥴謵䷌ྼ솘艀䐞ۈ\ud8b9骁孃ᴖ\udfe1醩厅ᑵ협ꣴ檲Ⲥ\ued5d꼃憨⎥\ue59dꙋ", 49612 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), str, dTBFetchManager);
            DTBFetchManager dTBFetchManager2 = (DTBFetchManager) super.put(str, dTBFetchManager);
            int i2 = f818 + 79;
            f816 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 0;
            }
            return dTBFetchManager2;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m885(String str, int i2) {
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
                            cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f817);
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
    }

    public class d extends ThreadPoolExecutor implements hg<ThreadPoolExecutor> {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char[] f821 = {'2', 'l', 't', 'l', 'd', 'n', 'n', 'I', 'I', 'd', 'f', 'o', 't', 'k', '\\', 'b', 'p', 'q', 't', 'l', 'd', 'n', '^', 'C', 'K'};

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f822 = 1;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f823;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ch f825;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(ThreadPoolExecutor threadPoolExecutor, ch chVar) {
            int corePoolSize = threadPoolExecutor.getCorePoolSize();
            int maximumPoolSize = threadPoolExecutor.getMaximumPoolSize();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            super(corePoolSize, maximumPoolSize, threadPoolExecutor.getKeepAliveTime(timeUnit), timeUnit, threadPoolExecutor.getQueue());
            this.f825 = chVar;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private ThreadPoolExecutor m887() {
            int i2 = f823;
            int i3 = i2 + 13;
            f822 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 69 / 0;
            }
            int i5 = i2 + 99;
            f822 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 83 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m888(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
            String str2;
            Object bytes = str;
            if (str != null) {
                bytes = str.getBytes(CharEncoding.ISO_8859_1);
            }
            byte[] bArr = (byte[]) bytes;
            synchronized (h.f2186) {
                try {
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    int i4 = iArr[2];
                    int i5 = iArr[3];
                    char[] cArr = new char[i3];
                    System.arraycopy(f821, i2, cArr, 0, i3);
                    if (bArr != null) {
                        char[] cArr2 = new char[i3];
                        h.f2185 = 0;
                        char c2 = 0;
                        while (true) {
                            int i6 = h.f2185;
                            if (i6 >= i3) {
                                break;
                            }
                            if (bArr[i6] == 1) {
                                cArr2[i6] = (char) (((cArr[i6] << 1) + 1) - c2);
                            } else {
                                cArr2[i6] = (char) ((cArr[i6] << 1) - c2);
                            }
                            c2 = cArr2[i6];
                            h.f2185 = i6 + 1;
                        }
                        cArr = cArr2;
                    }
                    if (i5 > 0) {
                        char[] cArr3 = new char[i3];
                        System.arraycopy(cArr, 0, cArr3, 0, i3);
                        int i7 = i3 - i5;
                        System.arraycopy(cArr3, 0, cArr, i7, i5);
                        System.arraycopy(cArr3, i5, cArr, 0, i7);
                    }
                    if (z2) {
                        char[] cArr4 = new char[i3];
                        h.f2185 = 0;
                        while (true) {
                            int i8 = h.f2185;
                            if (i8 >= i3) {
                                break;
                            }
                            cArr4[i8] = cArr[(i3 - i8) - 1];
                            h.f2185 = i8 + 1;
                        }
                        cArr = cArr4;
                    }
                    if (i4 > 0) {
                        h.f2185 = 0;
                        while (true) {
                            int i9 = h.f2185;
                            if (i9 >= i3) {
                                break;
                            }
                            cArr[i9] = (char) (cArr[i9] - iArr[2]);
                            h.f2185 = i9 + 1;
                        }
                    }
                    str2 = new String(cArr);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            int i2 = f823 + 31;
            f822 = i2 % 128;
            if (i2 % 2 == 0) {
                bj bjVar = bj.this;
                ch chVar = this.f825;
                String strIntern = m888(false, new int[]{0, 25, 0, 0}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000").intern();
                Object[] objArr = new Object[0];
                objArr[0] = runnable;
                bjVar.m790(this, chVar, strIntern, objArr);
            } else {
                bj.this.m790(this, this.f825, m888(true, new int[]{0, 25, 0, 0}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000").intern(), runnable);
            }
            super.execute(runnable);
            f822 = (f823 + 115) % 128;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﻛ */
        public final /* synthetic */ ThreadPoolExecutor mo713() {
            f822 = (f823 + 65) % 128;
            ThreadPoolExecutor threadPoolExecutorM887 = m887();
            int i2 = f822 + 61;
            f823 = i2 % 128;
            if (i2 % 2 == 0) {
                return threadPoolExecutorM887;
            }
            throw null;
        }
    }

    static {
        char[] cArr = new char[1191];
        ByteBuffer.wrap("KqØ<màò¬\u0006 «n8\u008dM\u008eÑJfå\u008b¬\u001fR¬\u0019¿S,?\u0099Ò\u0006¬òQ_\u0016Ì×¹\u0099%(\u0092â\u007f¼ëXX\u0011ÅÉ÷\u0012dKÑ\u0086NÌº\u0011\u0017O\u0084\u0089ñßmwÚ³7õÕ~F;óâlè\u0098X5\u001d¦ÊÓ\u0098O:øâ\u0015é\u0081Z2\u0014¯ÞØ\u008at9áè\u0012ê\u008e^;\u0012TÚÁÎ}\u001fîÆ\u001b\u0087·} \u0014]ÚÎ\u0088z.\u0097ú\u0000¾¼D\u008b\u000b\u0018R\u00ad\u009f2ÝÆ\u0005kVø\u009c\u008dÂ\u0011t¦ªKüß\u0018lJñ\u009b\u0086Ý*I¿¼LâÐ\u0004eR\n\u0092\u009fÆ#p\u0000\u0007\u0093B&\u009b¹\u0091M!àds³\u0006á\u009aC-\u009bÀ\u0090T#çmz§\ró¡@4\u0091Ç\u0093['îk\u0081£\u0014·¨f;¿Îþb\fõ`\u0088£\u001bý¯SB\u0099ÕÇi-üy\u008f¿\"þ¶LI¨ÜÑp\u000f\u0003e\u0096£)÷½SP\u0091Ì}_$êéu£\u0081y,\u0015¿ìÊ²V\u0018áÞ\f\u008a\u0098n+,\u0000c\u0093&&ÿ¹õMEà\u0000s×\u0006\u0085\u009a'-ÿÀôTGç\tzÃ\r\u0097¡$4õÇ÷[Cî\u000f\u0081Ç\u0014Ó¨\u0002;ÛÎ\u009ab`õ\u000e\u0088ò\u001b\u009f¯1BçÕ¡iIü\u001d\u008fË\u0095Ö\u0006\u008f³B,\bØÒu¶æJ\u0093\u0019\u000f¿¸qU;ÁÅr\u0097ïS\u0098\u00054´¡n\u0012.\u0081w4º«ð_*òKa³\u0014ô\u0088F?\u009eÒÂ\u0000D\u0093\u001d&Ð¹\u009aM@à?sÓ\u0006\u008e\u009a=-ôÀ©TW\u0000D\u0093\u001d&Ð¹\u009aM@à?sÓ\u0006\u008c\u009a8-þÀ´TPç\t\u0000D\u0093\u001d&Ð¹\u009aM@à;sß\u0006\u009a\u009a?\u0000c\u0093&&ÿ¹õMEà\u0000s×\u0006\u0085\u009a'-ÿÀôTGç\tzÃ\r\u0097¡$4õÇ÷[Cî\u000f\u0081Ç\u0014Ó¨\u0002;ÛÎ\u009ab`õ\u000e\u0088å\u001b\u0095¯ Bùdñ÷¨BeÝ/)õ\u0084\u008b\u0017jb0þ\u0098u\næSS\u009eÌÔ8\u000e\u0095u\u0006\u0091sÔïqX\u008cµá!\u001d\u0092R\u000f\u0094xÂÔ}A\u009d²û.\u0005\u009b@ô\u0094aÇ\u0000D\u0093\u001d&Ð¹\u009dMAà\u0019sÕ\u0006\u0097\u009a\u000e-ðÀ¹TWç\u0003zÇ\r\u0087=ã®º\u001bw\u0084:pæÝ¾Nr;0§¢\u0010Wý\u0013iåÚ¬Gw0+\u0000D\u0093\u001d&Ð¹\u0089MAà\u0003sÒ\u0006\u009a\u009a:-ôÀ¨\u0000D\u0093\u001d&Ð¹\u009aM@à/s×\u0006\u0091\u009a&-ôÀ¨Toç\u0005zÆ\r\u008a¡\"4þÇ¼[Pì±\u007fèÊ%Uo¡µ\fÚ\u009f\"êyvØÁ&,N¸¸\u000b÷\u0096%áyMþØ\f+_·£\u0002ûm/ømDÁ\u0000D\u0093\u001d&Ð¹\u009aM@à/s×\u0006\u008c\u009a--ØÀ´TWç\tzÇ\r\u008d¡34ùÇ\u00ad[Kî\n\u0081Ø\u0014±¨/;üÎ¬bDõ\u0004\u0088Ö\u001b\u008e\u0000D\u0093\u001d&Ð¹\u009aM@à.s×\u0006\u0093\u009a$-óÀ»T@ç\u0007\u0000D\u0093\u001d&Ð¹\u009aM@à(sÎ\u0006\u008f\u009a)-ÿÀ¾TFç\bzù\r\u0097¡44äÇ¼[Lî\u000e\u0081Æ\u0000D\u0093\u001d&Ð¹\u009aM@à$sØ\u0006\u008b\u009a--ãÀ©TWç\u0005zÁ\r\u0097¡&4üÇ\u0095[Kî\u0018\u0081À\u0014\u0098¨(;êÎªLâß»jvõ<\u0001æ¬\u0087?yJ*Ö\u009aaR\u008c\u0012\u0018à«¸]¾Îá{5äP\u0010 ½æ.;[pÇÐp3\u009dQ\tººî'\u0012PuüÝº9)f\u009cº\u0003Î÷,ZcÉ®¼æ J\u0097\u008ezäî+]sÀ®·ú\u001bI\u008e\u0098\u009c²\u000fÊº\u0012%aÑ¹|êï \u009a~\u0006È±\u0016\\@È¤{öæ'\u0091a=õ¨\u0000[^Ç¸rî\u001d.\u0088z4Ì\u0000c\u0093&&ÿ¹õMEà\u0000s×\u0006\u0085\u009a'-ÿÀôTBç\u001czÆ\rÐ¡&4ôÇª[\fî\n\u0081×\u0014\u0089¨/;ùÎ±bUõ\u0013\u0088\u009d\u001b½¯5BýÕ\u009eiNü\u001d\u008f×\"\u0089¶7IùÜ¿pk\u0003\u0001\u0096Ð)\u0096½\u0002Pïã¡ww\n\u0011\u009dÙ0\u008dÄ;\u0011\\\u0082$7ü¨\u0087\\]ñ1bÈ\u0017\u0096\u008b<<úÑ®EJö\b\u0000c\u0093&&ÿ¹õMEà\u0000s×\u0006\u0085\u009a'-ÿÀôTBç\u001czÆ\rÐ¡&4ôÇª[\fî\n\u0081×\u0014\u0089¨/;ùÎ±bUõ\u0013\u0088\u009d\u001b½¯5BýÕ\u0096iDü(\u008fÑ\"\u008f¶-IûÜ¿pk\u0003\u0011§\f4t\u0081¬\u001e×ê\rGvÔ\u0092¡×=rD%×]b\u0085\u008fÓ\u001c«©s6\bÂÒ{iè\u0011]ÉÂ²6h\u009b\u0006\bñ}¹á\u0014VË»\u009d/g\u009c(\u0001øv¤\u0000A\u00939&á¹\u009aM@à!sß\u0006\u008c\u009a<-ôÀ´TFç\u001e\u0018É\u008b±>i¡\u0012UÈø·k[\u001e\u0006\u0082µ5|Ø!Lßÿ¨bT\u0015\u0005¹»,}ß?CÏö\u0091\u000f_\u009c')ÿ¶\u0084B^ï5|Ç\t\u0093\u0095;\"îÏ°\u0000A\u00939&á¹\u009aM@à9sÏ\u0006\u008f\u009a-\u0000A\u00939&á¹\u009aM@à?sÓ\u0006\u008e\u009a=-ôÀ©TW\u0000g\u0093,&æ¹\u009aMTà\u001dsý\u0006\u009a\u009a1NºÝñh;÷@\u0003\u009c®Ä=\bHJÔÓc-\u008ed\u001a\u008a©Þ4\u001aCZïÓz#\u0089w\u0015\u008b ×Ï\u0007ZCæþ\u0000g\u0093,&æ¹\u009aM@à?sÓ\u0006\u008c\u009a8-þÀ´TPç\tz÷\r\u0097¡#4ÙÇ½\u0006<\u0095w ½¿ÁK\u001bædu\u0088\u0000×\u009cc+¥ÆïR\u000báR|\u00ad\u000b×§y2ªÁö]\u0010èF\u0087\u008a\u0012ï®y\u0083\u0095\u0010Þ¥\u0014:hÎ²cÍð!\u0085~\u0019Ê®\fCF×¢dûù\u000e\u008ea\"Å·\u0010DNØ£mê\u0002/\u0097`+Ú¸(MXá¿e\u0087öÌC\u0006Üz( \u0085ß\u00163clÿØH\u001e¥T1°\u0082é\u001f\u0007h{ÄÉQ\u0014¢\\>°\u008bâä:qzÍë^\u000e«H\u0000g\u0093,&æ¹\u009aM@à?sÓ\u0006\u008c\u009a8-þÀ´TPç\tzç\r\u009b¡)4ôÇ¼[Pî\u0002\u0081Ú\u0014\u009a¨\u0004;úÎ¶bEõ\u0006\u0088Ö\u0000g\u0093,&æ¹\u009fMAà\u000bs×\u0006\u008a\u009a$-åÀ\u008cTJç\bzÐ\r\u0091¡\u00064ôÇª[pî\u000e\u0081Å\u0014\u0088¨#;üÎ¬bbõ\u001f\u0088À\u001b\u0088¯*BãÕ\u0087iAü\u001b\u008fÓ\"\u0096¶7\u0000g\u0093,&æ¹\u009aM@à?sÓ\u0006\u008c\u009a8-þÀ´TPç\tzô\r\u009a¡4\"ã±¨\u0004b\u009b\u001eoÄÂ»QW$\b¸¼\u000fzâ0vÔÅ\u008dXa/\b\u0083ª\u0016wå8yöÌ\u0080£Y6\u0017\u008a¶\u0000g\u0093,&æ¹\u009aM@à>sß\u0006\u0085\u009a--ÂÀ¶TLç\u0018zà\r«¡\u000e4Ô\u0000g\u0093,&æ¹\u009aM@à>sß\u0006\u0085\u009a--ÐÀ¾Twç\u0015zÅ\r\u009b\u0000g\u0093,&æ¹\u009aM@à>sß\u0006\u0085\u009a--ÁÀ¯TAç?zÐ\r\u008a¡34ùÇ·[Eî\u0018\u000fn\u009c=)Ô¶¸Bpï\u0003|Ë\t\u009d\u0095\u0006\"øÏ©[Aè\u0019uÁ\u0002\u008d®);ãÈ·TDá\u0000\u008eò\u001b\u009e\u0000c\u0093;&÷¹ºMPà\bsâ\u0006½\u009a\u000e-ôÀ®T@ç\u0004zó\r\u009f¡$4äÇ¶[Pî\u0012\u0081ù\u0014\u009c¨(;îÎ¿bDõ\u0018\u0088þ\u001b\u009d¯5\u0000c\u0093;&÷¹ºMPà\bsâ\u0006½\u009a\r-éÀ¿T@ç\u0019zÁ\r\u0091¡54ÃÇ¼[Pî\u001d\u0081Ý\u0014\u009e¨#\u0000g\u0093,&æ¹\u009aMTà\u001es÷\u0006\u009b\u009a\u001a-ôÀ«TVç\tzÆ\r\u008a\u008b®\u0018å\u00ad/2PÆ\u0084kÀø6\u008dX\u0011ç¦7\u0000g\u0093,&æ¹\u008bMVà\u0004sÕ\u0006\u009a\u009a\u0018-þÀ³TMç\u0018ÚFI\rüÇc©\u0097i:#©ãÜ\u008b@\u001c÷Ù\u001a\u009f,Y¿\u0012\nØ\u0095¤ajÌ _É*¥¶0\u0001Àì\u0096xpË3Vÿ\u001a=\u0089v<¼£ÀW\u001aú{i\u0083\u001cÄ\u0080v7®ÚòSäÀ¯ueê\u0019\u001eÃ³¸ \\U\u0019É¼".getBytes(CharEncoding.ISO_8859_1)).asCharBuffer().get(cArr, 0, 1191);
        f789 = cArr;
        f791 = 7391298023995904841L;
    }

    public bj(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static DTBFetchFactory m838() {
        DTBFetchFactory dTBFetchFactory;
        int i2 = f792 + 9;
        f790 = i2 % 128;
        if (i2 % 2 == 0) {
            dTBFetchFactory = DTBFetchFactory.getInstance();
            int i3 = 43 / 0;
        } else {
            dTBFetchFactory = DTBFetchFactory.getInstance();
        }
        int i4 = f792 + 83;
        f790 = i4 % 128;
        if (i4 % 2 != 0) {
            return dTBFetchFactory;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static String m841() {
        int i2 = f790 + 23;
        f792 = i2 % 128;
        if (i2 % 2 == 0) {
            return AdRegistration.getAppKey();
        }
        int i3 = 2 / 0;
        return AdRegistration.getAppKey();
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static ApsAdFormat m843(ApsAd apsAd) {
        int i2 = f792 + 63;
        f790 = i2 % 128;
        if (i2 % 2 == 0) {
            apsAd.getApsAdFormat();
            throw null;
        }
        ApsAdFormat apsAdFormat = apsAd.getApsAdFormat();
        f790 = (f792 + 73) % 128;
        return apsAdFormat;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static List<DTBAdSize> m845(DTBAdResponse dTBAdResponse) {
        f790 = (f792 + 97) % 128;
        List<DTBAdSize> dTBAds = dTBAdResponse.getDTBAds();
        int i2 = f792 + 51;
        f790 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 67 / 0;
        }
        return dTBAds;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static Bundle m846(DTBAdResponse dTBAdResponse) {
        int i2 = f792 + 85;
        f790 = i2 % 128;
        int i3 = i2 % 2;
        Bundle renderingBundle = dTBAdResponse.getRenderingBundle();
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        int i5 = f790 + 29;
        f792 = i5 % 128;
        if (i5 % 2 == 0) {
            return renderingBundle;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ DTBAdView m847(ApsAd apsAd) {
        int i2 = f792 + 41;
        f790 = i2 % 128;
        if (i2 % 2 == 0) {
            m840(apsAd);
            throw null;
        }
        DTBAdView dTBAdViewM840 = m840(apsAd);
        int i3 = f790 + 51;
        f792 = i3 % 128;
        if (i3 % 2 == 0) {
            return dTBAdViewM840;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m851(DTBAdResponse dTBAdResponse) {
        f792 = (f790 + 45) % 128;
        String bidId = dTBAdResponse.getBidId();
        f792 = (f790 + 95) % 128;
        return bidId;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ String m855() {
        int i2 = f792 + 7;
        f790 = i2 % 128;
        if (i2 % 2 != 0) {
            return m841();
        }
        int i3 = 2 / 0;
        return m841();
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ ApsAdRequest m857(ApsAd apsAd) {
        f792 = (f790 + 95) % 128;
        ApsAdRequest apsAdRequestM837 = m837(apsAd);
        int i2 = f792 + 101;
        f790 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 0;
        }
        return apsAdRequestM837;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ List m861(DTBAdResponse dTBAdResponse) {
        f790 = (f792 + 71) % 128;
        List<DTBAdSize> listM845 = m845(dTBAdResponse);
        f792 = (f790 + 125) % 128;
        return listM845;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ AdType m862(DTBAdSize dTBAdSize) {
        f790 = (f792 + 107) % 128;
        AdType adTypeM854 = m854(dTBAdSize);
        int i2 = f790 + 97;
        f792 = i2 % 128;
        if (i2 % 2 == 0) {
            return adTypeM854;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m866(ApsAd apsAd) {
        int i2 = f790 + 25;
        f792 = i2 % 128;
        int i3 = i2 % 2;
        String strM860 = m860(apsAd);
        if (i3 != 0) {
            int i4 = 71 / 0;
        }
        return strM860;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ ApsAdFormat m870(ApsAd apsAd) {
        int i2 = f792 + 87;
        f790 = i2 % 128;
        int i3 = i2 % 2;
        ApsAdFormat apsAdFormatM843 = m843(apsAd);
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return apsAdFormatM843;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Bundle m874(DTBAdResponse dTBAdResponse) {
        int i2 = f792 + 9;
        f790 = i2 % 128;
        int i3 = i2 % 2;
        Bundle bundleM846 = m846(dTBAdResponse);
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        f792 = (f790 + 89) % 128;
        return bundleM846;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ ApsAdRequest m878(ApsAd apsAd) {
        f792 = (f790 + 107) % 128;
        ApsAdRequest apsAdRequestM853 = m853(apsAd);
        int i2 = f790 + 63;
        f792 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 65 / 0;
        }
        return apsAdRequestM853;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static Map<String, String> m839(DTBAdResponse dTBAdResponse) {
        int i2 = f792 + 23;
        f790 = i2 % 128;
        if (i2 % 2 == 0) {
            dTBAdResponse.getDefaultVideoAdsRequestCustomParams();
            throw null;
        }
        Map<String, String> defaultVideoAdsRequestCustomParams = dTBAdResponse.getDefaultVideoAdsRequestCustomParams();
        f792 = (f790 + 47) % 128;
        return defaultVideoAdsRequestCustomParams;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static HashMap<String, Object> m842(DTBAdResponse dTBAdResponse) {
        f790 = (f792 + 125) % 128;
        HashMap<String, Object> renderingMap = dTBAdResponse.getRenderingMap();
        int i2 = f790 + 39;
        f792 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 / 0;
        }
        return renderingMap;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static String m844(ApsAd apsAd) {
        f792 = (f790 + 115) % 128;
        String slotUuid = apsAd.getSlotUuid();
        f792 = (f790 + 17) % 128;
        return slotUuid;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ DTBFetchFactory m848() {
        int i2 = f792 + 105;
        f790 = i2 % 128;
        if (i2 % 2 != 0) {
            return m838();
        }
        m838();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean m852(DTBAdSize dTBAdSize) {
        int i2 = f792 + 41;
        f790 = i2 % 128;
        if (i2 % 2 == 0) {
            dTBAdSize.isInterstitialAd();
            throw null;
        }
        boolean zIsInterstitialAd = dTBAdSize.isInterstitialAd();
        int i3 = f790 + 29;
        f792 = i3 % 128;
        if (i3 % 2 == 0) {
            return zIsInterstitialAd;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m856(DTBAdResponse dTBAdResponse) {
        int i2 = f792 + 33;
        f790 = i2 % 128;
        if (i2 % 2 == 0) {
            dTBAdResponse.getCrid();
            throw null;
        }
        String crid = dTBAdResponse.getCrid();
        f790 = (f792 + 11) % 128;
        return crid;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m858(DTBAdResponse dTBAdResponse) {
        f790 = (f792 + 61) % 128;
        String impressionUrl = dTBAdResponse.getImpressionUrl();
        f792 = (f790 + 121) % 128;
        return impressionUrl;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static String m860(ApsAd apsAd) {
        f790 = (f792 + 35) % 128;
        String bidInfo = apsAd.getBidInfo();
        f792 = (f790 + 79) % 128;
        return bidInfo;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m864(ApsAd apsAd) {
        int i2 = f790 + 63;
        f792 = i2 % 128;
        if (i2 % 2 != 0) {
            m844(apsAd);
            throw null;
        }
        String strM844 = m844(apsAd);
        f792 = (f790 + 51) % 128;
        return strM844;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m867(DTBAdResponse dTBAdResponse) {
        int i2 = f792 + 23;
        f790 = i2 % 128;
        if (i2 % 2 != 0) {
            return m851(dTBAdResponse);
        }
        m851(dTBAdResponse);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ HashMap m872(DTBAdResponse dTBAdResponse) {
        f792 = (f790 + 73) % 128;
        HashMap<String, Object> mapM842 = m842(dTBAdResponse);
        int i2 = f792 + 25;
        f790 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 74 / 0;
        }
        return mapM842;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m876(ApsAd apsAd) {
        f792 = (f790 + 55) % 128;
        String strM850 = m850(apsAd);
        int i2 = f790 + 7;
        f792 = i2 % 128;
        if (i2 % 2 == 0) {
            return strM850;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ a m879(bj bjVar, HashMap map, ch chVar) {
        int i2 = f792 + 13;
        f790 = i2 % 128;
        if (i2 % 2 != 0) {
            return bjVar.m863((HashMap<String, DTBFetchManager>) map, chVar);
        }
        bjVar.m863((HashMap<String, DTBFetchManager>) map, chVar);
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static ApsAdRequest m837(ApsAd apsAd) {
        int i2 = f790 + 37;
        f792 = i2 % 128;
        int i3 = i2 % 2;
        ApsAdRequest adLoader = apsAd.getAdLoader();
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        return adLoader;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static DTBAdView m840(ApsAd apsAd) {
        f792 = (f790 + 53) % 128;
        DTBAdView adView = apsAd.getAdView();
        f792 = (f790 + 35) % 128;
        return adView;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ Map m849(DTBAdResponse dTBAdResponse) {
        int i2 = f792 + 97;
        f790 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> mapM839 = m839(dTBAdResponse);
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        int i5 = f790 + 69;
        f792 = i5 % 128;
        if (i5 % 2 == 0) {
            return mapM839;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m850(ApsAd apsAd) {
        int i2 = f792 + 73;
        f790 = i2 % 128;
        if (i2 % 2 != 0) {
            return apsAd.getPricePoint();
        }
        apsAd.getPricePoint();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static AdType m854(DTBAdSize dTBAdSize) {
        f790 = (f792 + 37) % 128;
        AdType dTBAdType = dTBAdSize.getDTBAdType();
        int i2 = f790 + 7;
        f792 = i2 % 128;
        if (i2 % 2 == 0) {
            return dTBAdType;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static JSONObject m859(DTBAdSize dTBAdSize) {
        f792 = (f790 + 11) % 128;
        JSONObject pubSettings = dTBAdSize.getPubSettings();
        f790 = (f792 + 29) % 128;
        return pubSettings;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m865(DTBAdResponse dTBAdResponse) {
        int i2 = f792 + 3;
        f790 = i2 % 128;
        if (i2 % 2 == 0) {
            m856(dTBAdResponse);
            throw null;
        }
        String strM856 = m856(dTBAdResponse);
        f792 = (f790 + 9) % 128;
        return strM856;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m868(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        f792 = (f790 + 19) % 128;
        String strM871 = m871(dTBAdResponse, dTBAdSize);
        f792 = (f790 + 103) % 128;
        return strM871;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m873(DTBAdSize dTBAdSize) {
        int i2 = f790 + 37;
        f792 = i2 % 128;
        if (i2 % 2 != 0) {
            m852(dTBAdSize);
            throw null;
        }
        boolean zM852 = m852(dTBAdSize);
        f792 = (f790 + 69) % 128;
        return zM852;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m877(DTBAdSize dTBAdSize) {
        int i2 = f792 + 107;
        f790 = i2 % 128;
        if (i2 % 2 != 0) {
            return m883(dTBAdSize);
        }
        m883(dTBAdSize);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ d m880(bj bjVar, ThreadPoolExecutor threadPoolExecutor, ch chVar) {
        f792 = (f790 + 91) % 128;
        d dVarM881 = bjVar.m881(threadPoolExecutor, chVar);
        int i2 = f790 + 107;
        f792 = i2 % 128;
        if (i2 % 2 == 0) {
            return dVarM881;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static ApsAdRequest m853(ApsAd apsAd) {
        int i2 = f790 + 67;
        f792 = i2 % 128;
        int i3 = i2 % 2;
        ApsAdRequest apsAdRequest = apsAd.getApsAdRequest();
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        return apsAdRequest;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private a m863(HashMap<String, DTBFetchManager> map, ch chVar) {
        a aVar = new a(map, chVar);
        f792 = (f790 + 113) % 128;
        return aVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m869(DTBAdSize dTBAdSize) {
        int i2 = f792 + 99;
        f790 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM859 = m859(dTBAdSize);
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        return jSONObjectM859;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m882(DTBAdResponse dTBAdResponse) {
        int i2 = f790 + 101;
        f792 = i2 % 128;
        int i3 = i2 % 2;
        String strM858 = m858(dTBAdResponse);
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        f790 = (f792 + 59) % 128;
        return strM858;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        byte b2;
        switch (str.hashCode()) {
            case -2137858584:
                b2 = !str.equals(m875(11 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 204, (char) (4714 - TextUtils.getOffsetBefore("", 0))).intern()) ? (byte) -1 : (byte) 8;
                break;
            case -2133119933:
                b2 = !str.equals(m875(15 - View.MeasureSpec.getSize(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 673, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31528)).intern()) ? (byte) -1 : (byte) 34;
                break;
            case -1987686071:
                b2 = !str.equals(m875(TextUtils.indexOf((CharSequence) "", '0') + 14, View.MeasureSpec.getMode(0) + 482, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 19622)).intern()) ? (byte) -1 : (byte) 24;
                break;
            case -1885106463:
                b2 = !str.equals(m875((ViewConfiguration.getTouchSlop() >> 8) + 11, 27 - KeyEvent.keyCodeFromString(""), (char) (Color.green(0) + 63318)).intern()) ? (byte) -1 : (byte) 1;
                break;
            case -1879113962:
                b2 = !str.equals(m875(9 - (ViewConfiguration.getScrollBarSize() >> 8), 280 - ExpandableListView.getPackedPositionGroup(0L), (char) (25781 - (ViewConfiguration.getLongPressTimeout() >> 16))).intern()) ? (byte) -1 : (byte) 13;
                break;
            case -1879025222:
                b2 = !str.equals(m875(8 - TextUtils.indexOf((CharSequence) "", '0', 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 241, (char) View.MeasureSpec.getMode(0)).intern()) ? (byte) -1 : (byte) 11;
                break;
            case -1554728876:
                if (!str.equals(m875(TextUtils.lastIndexOf("", '0', 0, 0) + 46, 94 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (View.getDefaultSize(0, 0) + 100)).intern())) {
                    b2 = -1;
                } else {
                    f792 = (f790 + 99) % 128;
                    b2 = 4;
                }
                break;
            case -1464660218:
                b2 = !str.equals(m875(28 - Process.getGidForName(""), KeyEvent.normalizeMetaState(0) + 394, (char) ((-1) - Process.getGidForName(""))).intern()) ? (byte) -1 : (byte) 20;
                break;
            case -1358954558:
                b2 = !str.equals(m875(AndroidCharacter.getMirror('0') - '!', (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 15;
                break;
            case -1293925587:
                if (!str.equals(m875(23 - Color.green(0), TextUtils.indexOf("", "", 0, 0) + 71, (char) (35663 - Gravity.getAbsoluteGravity(0, 0))).intern())) {
                    b2 = -1;
                } else {
                    f792 = (f790 + 55) % 128;
                    b2 = 3;
                }
                break;
            case -1291566264:
                if (!str.equals(m875(11 - MotionEvent.axisFromString(""), 741 - View.resolveSize(0, 0), (char) (Color.rgb(0, 0, 0) + 16777216)).intern())) {
                    b2 = -1;
                } else {
                    f792 = (f790 + 69) % 128;
                    b2 = 39;
                }
                break;
            case -1092884085:
                b2 = !str.equals(m875((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 35, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 152, (char) TextUtils.getOffsetBefore("", 0)).intern()) ? (byte) -1 : (byte) 6;
                break;
            case -1090060454:
                b2 = !str.equals(m875(11 - TextUtils.lastIndexOf("", '0', 0), TextUtils.lastIndexOf("", '0', 0, 0) + Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, (char) View.MeasureSpec.getSize(0)).intern()) ? (byte) -1 : (byte) 9;
                break;
            case -832298225:
                b2 = !str.equals(m875('@' - AndroidCharacter.getMirror('0'), MotionEvent.axisFromString("") + 496, (char) (Color.green(0) + 24042)).intern()) ? (byte) -1 : (byte) 25;
                break;
            case -791598050:
                b2 = !str.equals(m875(11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.getDefaultSize(0, 0) + 721, (char) (3869 - TextUtils.indexOf((CharSequence) "", '0'))).intern()) ? (byte) -1 : (byte) 37;
                break;
            case -723985259:
                b2 = !str.equals(m875((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 342, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 17;
                break;
            case -696695160:
                b2 = !str.equals(m875(Gravity.getAbsoluteGravity(0, 0) + 33, 39 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (Color.argb(0, 0, 0, 0) + 54557)).intern()) ? (byte) -1 : (byte) 2;
                break;
            case -694845532:
                b2 = !str.equals(m875(((byte) KeyEvent.getModifierMetaStateMask()) + 14, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 138, (char) (TextUtils.getTrimmedLength("") + 52281)).intern()) ? (byte) -1 : (byte) 5;
                break;
            case -466918522:
                if (!str.equals(m875(23 - TextUtils.indexOf("", ""), 371 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (View.resolveSizeAndState(0, 0, 0) + 60661)).intern())) {
                    b2 = -1;
                } else {
                    int i2 = f792 + 125;
                    f790 = i2 % 128;
                    b2 = i2 % 2 != 0 ? (byte) 19 : (byte) 125;
                }
                break;
            case -341719851:
                b2 = str.equals(m875(ExpandableListView.getPackedPositionGroup(0L) + 19, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 352, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern()) ? (byte) 18 : (byte) -1;
                break;
            case -300800492:
                if (str.equals(m875(17 - ExpandableListView.getPackedPositionType(0L), 511 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 47726)).intern())) {
                    f792 = (f790 + 93) % 128;
                    b2 = 26;
                } else {
                    b2 = -1;
                }
                break;
            case -197992833:
                b2 = !str.equals(m875(22 - TextUtils.indexOf((CharSequence) "", '0', 0), 528 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 40178)).intern()) ? (byte) -1 : (byte) 27;
                break;
            case -27446238:
                b2 = !str.equals(m875((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 21, (ViewConfiguration.getFadingEdgeLength() >> 16) + 436, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 22;
                break;
            case 66052:
                if (!str.equals(m875((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3, 665 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (View.resolveSize(0, 0) + 17508)).intern())) {
                    b2 = -1;
                } else {
                    int i3 = f790 + 111;
                    f792 = i3 % 128;
                    b2 = i3 % 2 == 0 ? (byte) 32 : (byte) 119;
                }
                break;
            case 63478087:
                b2 = !str.equals(m875((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 4, 668 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (Drawable.resolveOpacity(0, 0) + 36754)).intern()) ? (byte) -1 : (byte) 33;
                break;
            case 355568411:
                b2 = !str.equals(m875(12 - TextUtils.lastIndexOf("", '0'), 689 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1)).intern()) ? (byte) -1 : (byte) 35;
                break;
            case 568188517:
                if (!str.equals(m875((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16, View.resolveSize(0, 0) + 326, (char) (View.combineMeasuredStates(0, 0) + 15783)).intern())) {
                    b2 = -1;
                } else {
                    f792 = (f790 + 99) % 128;
                    b2 = 16;
                }
                break;
            case 620798166:
                b2 = !str.equals(m875((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12, (KeyEvent.getMaxKeyCode() >> 16) + 227, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern()) ? (byte) -1 : (byte) 10;
                break;
            case 788901082:
                if (!str.equals(m875(13 - TextUtils.indexOf("", "", 0), 423 - View.combineMeasuredStates(0, 0), (char) TextUtils.getTrimmedLength("")).intern())) {
                    b2 = -1;
                } else {
                    f792 = (f790 + 107) % 128;
                    b2 = 21;
                }
                break;
            case 1036908700:
                b2 = !str.equals(m875(14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13, (char) (48914 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern()) ? (byte) -1 : (byte) 0;
                break;
            case 1251356764:
                b2 = !str.equals(m875(KeyEvent.keyCodeFromString("") + 41, 615 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) View.resolveSizeAndState(0, 0, 0)).intern()) ? (byte) -1 : (byte) 30;
                break;
            case 1306698049:
                b2 = !str.equals(m875(ExpandableListView.getPackedPositionGroup(0L) + 17, 187 - KeyEvent.keyCodeFromString(""), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 38290)).intern()) ? (byte) -1 : (byte) 7;
                break;
            case 1328085269:
                b2 = !str.equals(m875(TextUtils.lastIndexOf("", '0', 0) + 26, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 456, (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 23;
                break;
            case 1340383521:
                b2 = !str.equals(m875(9 - Color.red(0), 732 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) View.MeasureSpec.getMode(0)).intern()) ? (byte) -1 : (byte) 38;
                break;
            case 1340427404:
                b2 = !str.equals(m875(Color.argb(0, 0, 0, 0) + 9, 655 - TextUtils.lastIndexOf("", '0'), (char) (ExpandableListView.getPackedPositionType(0L) + 42829)).intern()) ? (byte) -1 : (byte) 31;
                break;
            case 1600627740:
                b2 = !str.equals(m875((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 20, 701 - Color.argb(0, 0, 0, 0), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6279)).intern()) ? (byte) -1 : (byte) 36;
                break;
            case 1648408950:
                if (!str.equals(m875(13 - TextUtils.getOffsetBefore("", 0), 601 - Process.getGidForName(""), (char) (Color.blue(0) + 4381)).intern())) {
                    b2 = -1;
                } else {
                    int i4 = f792 + 79;
                    f790 = i4 % 128;
                    b2 = i4 % 2 != 0 ? (byte) 29 : (byte) 99;
                }
                break;
            case 1713728997:
                b2 = !str.equals(m875(51 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 551, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 28;
                break;
            case 2019413793:
                b2 = !str.equals(m875(31 - ExpandableListView.getPackedPositionGroup(0L), 249 - ExpandableListView.getPackedPositionGroup(0L), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 12;
                break;
            case 2144664800:
                if (!str.equals(m875(22 - Color.alpha(0), 289 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 30029)).intern())) {
                    b2 = -1;
                } else {
                    int i5 = f792 + 13;
                    f790 = i5 % 128;
                    b2 = i5 % 2 != 0 ? (byte) 14 : (byte) 103;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return AdRegistration.class;
            case 1:
            case 2:
                return DTBActivity.class;
            case 3:
            case 4:
                return DTBInterstitialActivity.class;
            case 5:
            case 6:
                return DTBAdActivity.class;
            case 7:
                return DTBAdInterstitial.class;
            case 8:
                return DTBAdLoader.class;
            case 9:
                return DTBAdRequest.class;
            case 10:
                return DTBAdResponse.class;
            case 11:
            case 12:
                return DTBAdView.class;
            case 13:
                return DTBAdSize.class;
            case 14:
                return DTBAdViewSupportClient.class;
            case 15:
                return DTBFetchFactory.class;
            case 16:
                return DTBFetchManager.class;
            case 17:
                return DTBRenderer.class;
            case 18:
                return DTBAdBannerListener.class;
            case 19:
                return DTBAdBaseBannerListener.class;
            case 20:
                return DTBAdBaseInterstitialListener.class;
            case 21:
                return DTBAdCallback.class;
            case 22:
                return DTBAdExpandedListener.class;
            case 23:
                return DTBAdInterstitialListener.class;
            case 24:
                return DTBAdListener.class;
            case 25:
                return a.class;
            case 26:
                return d.class;
            case 27:
            case 28:
                return ApsInterstitialActivity.class;
            case 29:
            case 30:
                return ApsAdActivity.class;
            case 31:
                return ApsAdView.class;
            case 32:
                return Aps.class;
            case 33:
                return ApsAd.class;
            case 34:
                return ApsAdController.class;
            case 35:
                return ApsAdListener.class;
            case 36:
                return ApsAdRequestListener.class;
            case 37:
                return ApsAdFormat.class;
            case 38:
                return ApsAdType.class;
            case 39:
                return ApsAdRequest.class;
            default:
                return null;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    public final String mo793() {
        int i2 = f792 + 89;
        f790 = i2 % 128;
        if (i2 % 2 != 0) {
            return AdRegistration.getVersion();
        }
        AdRegistration.getVersion();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m875(int i2, int i3, char c2) {
        String str;
        synchronized (com.p004ironsource.adqualitysdk.sdk.i.a.f68) {
            try {
                char[] cArr = new char[i2];
                com.p004ironsource.adqualitysdk.sdk.i.a.f69 = 0;
                while (true) {
                    int i4 = com.p004ironsource.adqualitysdk.sdk.i.a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f789[i3 + i4]) ^ (((long) i4) * f791)) ^ ((long) c2));
                        com.p004ironsource.adqualitysdk.sdk.i.a.f69 = i4 + 1;
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

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m875((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10, 753 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m855();
            }
        });
        map.put(m875(23 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 762 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (20189 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m848();
            }
        });
        map.put(m875(18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 785, (char) (ViewConfiguration.getTouchSlop() >> 8)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m867((DTBAdResponse) list.get(0));
            }
        });
        map.put(m875(TextUtils.indexOf((CharSequence) "", '0', 0) + 24, 802 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (TextUtils.getTrimmedLength("") + 1627)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m865((DTBAdResponse) list.get(0));
            }
        });
        map.put(m875(TextUtils.getTrimmedLength("") + 26, Color.argb(0, 0, 0, 0) + 826, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 33778)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m882((DTBAdResponse) list.get(0));
            }
        });
        map.put(m875(25 - (Process.myTid() >> 22), 852 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 26080)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m872((DTBAdResponse) list.get(0));
            }
        });
        map.put(m875(28 - Color.red(0), 877 - TextUtils.getCapsMode("", 0, 0), (char) ((-16777216) - Color.rgb(0, 0, 0))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.21
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m874((DTBAdResponse) list.get(0));
            }
        });
        map.put(m875(37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 905, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.22
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m849((DTBAdResponse) list.get(0));
            }
        });
        map.put(m875(16 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 941 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.24
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m861((DTBAdResponse) list.get(0));
            }
        });
        map.put(m875(23 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 959, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 8837)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m868((DTBAdResponse) list.get(0), (DTBAdSize) list.get(1));
            }
        });
        map.put(m875(((Process.getThreadPriority(0) + 20) >> 6) + 17, 981 - Gravity.getAbsoluteGravity(0, 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m877((DTBAdSize) list.get(0));
            }
        });
        map.put(m875((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15, (ViewConfiguration.getPressedStateDuration() >> 16) + 998, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m862((DTBAdSize) list.get(0));
            }
        });
        map.put(m875(Color.blue(0) + 20, 1013 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewConfiguration.getTapTimeout() >> 16)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m869((DTBAdSize) list.get(0));
            }
        });
        map.put(m875(21 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 3847)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return Boolean.valueOf(bj.m873((DTBAdSize) list.get(0)));
            }
        });
        map.put(m875(29 - ExpandableListView.getPackedPositionChild(0L), Color.alpha(0) + 1055, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m879(bj.this, (HashMap) list.get(0), chVar);
            }
        });
        map.put(m875(23 - (Process.myPid() >> 22), TextUtils.getOffsetAfter("", 0) + 1085, (char) (AndroidCharacter.getMirror('0') - '0')).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m880(bj.this, (ThreadPoolExecutor) list.get(0), chVar);
            }
        });
        map.put(m875(KeyEvent.normalizeMetaState(0) + 15, View.combineMeasuredStates(0, 0) + 1108, (char) Color.argb(0, 0, 0, 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m878((ApsAd) list.get(0));
            }
        });
        map.put(m875(9 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getTapTimeout() >> 16) + 1123, (char) (35785 - View.MeasureSpec.makeMeasureSpec(0, 0))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m866((ApsAd) list.get(0));
            }
        });
        map.put(m875(TextUtils.getOffsetAfter("", 0) + 13, 1132 - Process.getGidForName(""), (char) View.resolveSizeAndState(0, 0, 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m876((ApsAd) list.get(0));
            }
        });
        map.put(m875(TextUtils.indexOf((CharSequence) "", '0', 0) + 12, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1146, (char) (View.resolveSize(0, 0) + 55841)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m864((ApsAd) list.get(0));
            }
        });
        map.put(m875(TextUtils.getTrimmedLength("") + 14, (ViewConfiguration.getScrollBarSize() >> 8) + 1157, (char) (11325 - TextUtils.indexOf((CharSequence) "", '0', 0))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m870((ApsAd) list.get(0));
            }
        });
        map.put(m875(11 - TextUtils.getOffsetAfter("", 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1170, (char) (View.combineMeasuredStates(0, 0) + 6746)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m857((ApsAd) list.get(0));
            }
        });
        map.put(m875((ViewConfiguration.getJumpTapTimeout() >> 16) + 9, Color.blue(0) + 1182, (char) (21379 - KeyEvent.getDeadChar(0, 0))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bj.m847((ApsAd) list.get(0));
            }
        });
        int i2 = f790 + 109;
        f792 = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        Matcher matcher = Pattern.compile(m875(13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.alpha(0), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 19295)).intern()).matcher(mo793());
        if (matcher.matches()) {
            int i2 = f792 + 85;
            f790 = i2 % 128;
            return i2 % 2 == 0 ? matcher.group(1) : matcher.group(1);
        }
        int i3 = f790 + 3;
        f792 = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m883(DTBAdSize dTBAdSize) {
        f790 = (f792 + 45) % 128;
        String slotUUID = dTBAdSize.getSlotUUID();
        int i2 = f792 + 103;
        f790 = i2 % 128;
        if (i2 % 2 != 0) {
            return slotUUID;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private d m881(ThreadPoolExecutor threadPoolExecutor, ch chVar) {
        d dVar = new d(threadPoolExecutor, chVar);
        int i2 = f792 + 5;
        f790 = i2 % 128;
        if (i2 % 2 != 0) {
            return dVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m871(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        f790 = (f792 + 125) % 128;
        String pricePoints = dTBAdResponse.getPricePoints(dTBAdSize);
        f792 = (f790 + 35) % 128;
        return pricePoints;
    }
}
