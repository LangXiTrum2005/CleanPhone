package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
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
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.Z3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class bi extends be {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f763 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f764;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f765;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f766;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e extends ThreadPoolExecutor implements hj<ThreadPoolExecutor>, AutoCloseable {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f795 = 1;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f796 = -4926456818211646809L;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f797;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private ck f798;

        /* JADX WARN: Illegal instructions before constructor call */
        public e(ThreadPoolExecutor threadPoolExecutor, ck ckVar) {
            int corePoolSize = threadPoolExecutor.getCorePoolSize();
            int maximumPoolSize = threadPoolExecutor.getMaximumPoolSize();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            super(corePoolSize, maximumPoolSize, threadPoolExecutor.getKeepAliveTime(timeUnit), timeUnit, threadPoolExecutor.getQueue());
            this.f798 = ckVar;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private ThreadPoolExecutor m877() {
            int i10 = f795 + 19;
            f797 = i10 % 128;
            if (i10 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m878(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2127) {
                try {
                    char[] cArrM2229 = g.m2229(f796, cArr, i10);
                    g.f2129 = 4;
                    while (true) {
                        int i11 = g.f2129;
                        if (i11 < cArrM2229.length) {
                            int i12 = i11 - 4;
                            g.f2128 = i12;
                            cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f796));
                            g.f2129 = i11 + 1;
                        } else {
                            str2 = new String(cArrM2229, 4, cArrM2229.length - 4);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        @Override // java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            boolean zIsTerminated;
            if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
                return;
            }
            shutdown();
            boolean z10 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f797 = (f795 + 97) % 128;
            bi.this.m823(this, this.f798, m878("ꤨ࣡疩ꥼ騄ꉳ傢ᗾ\ue3d1헁ᨶꂖ㱿⽌콼\uef3b皎竬烢㗙茽뗘㩲䁮\udc41༱\uef86輆ᛥ", 1 - View.resolveSizeAndState(0, 0, 0)).intern(), runnable);
            super.execute(runnable);
            int i10 = f797 + 43;
            f795 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hj
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ ThreadPoolExecutor mo800() {
            int i10 = f795 + 93;
            f797 = i10 % 128;
            if (i10 % 2 == 0) {
                return m877();
            }
            m877();
            throw null;
        }
    }

    static {
        char[] cArr = new char[1191];
        f2.v("Ò<\u0017óY©\u0083[Åe\u000e¹p´º±ü\u0017&\u001akÕ\u00ad\u0085\u0097¼_ã\u009a\rÔf\u000e¦Hé\u0083<ý\u00137[q\u0088«àæ8 r\u001aIT\u0083\u0015'Ðü\u009e·DC\u0002,Éà·È}\u0098;Rá4¬ô\u0000cÅ¤\u008bûQO\u0017MÜ\u009a¢£h÷.7ôM¹À\u007fÝEá\u000b9Ñs\u0096\u0086\\Õ\"Uè'®us¯9\u0089ÿ6Åi\u008bJP\u0092\u0016ýÜ\u001d¢]g\u0089-£óá¹\u0019î³+he#¿ßùµ2tLP\u0086\bÀÜ\u001a Wp\u0091:«\u001aåÙ?\u0081xS²$Ìø\u0006Ø@\u0090\u009dB×$\u0011ü\u0000cÅ¤\u008bûQO\u0017MÜ\u009a¢£h÷.7ôM¹À\u007fÝEá\u000b9Ñs\u0096\u0086\\Õ\"Uè'®us¯9\u0089ÿ6Åi\u008bJP\u009a\u0016ðÜ\u001d¢Qg\u008d-¹óá¹\t\u007f_D\u009f\n Ðà\u0096\u0016\\A!\u0099çÑ\u00adõs'9mþ\u009da-¤öê½0Iv!½ßÃÈ\t\u0090OX\u0095<Øî\u001e¤$\u0094\u0000cÅ¤\u008bûQO\u0017MÜ\u009a¢£h÷.7ôM¹À\u007fÝEá\u000b9Ñs\u0096\u0086\\Õ\"Uè'®us¯9\u0089ÿ6Åi\u008bJP\u0092\u0016úÜ(¢Wg\u008b-£óã¹\t\u007f_D\u008f\u0000DÅ\u009f\u008bÔQ \u0017HÜ¾¢¬hù.=ôQ¹\u009d\u007fÍEí\u000b;Ñs\u0096\u0084\\Üb\u0016§Íé\u00863ru\u001a¾éÀÿ\n¾Ln\u0096\u0014ÛÎ\u009e\u0093[H\u0015\u0003Ï÷\u0089\u009fBr<pö+°új\u0091'Já\u001aè#-øc³¹Gÿ/4ÂJÀ\u0080\u0099ÆO\u001c+Qç\u0097\u00ad\u00ad\u0086\u0000DÅ\u009f\u008bÔQ \u0017HÜ¡¢«hè./\u0000cÅ¤\u008bûQO\u0017MÜ\u009a¢£h÷.7ôM¹À\u007fÝEá\u000b9Ñs\u0096\u0086\\Õ\"Uè'®us¯9\u0089ÿ6Åi\u008bJP\u0092\u0016úÜ?¢]g\u009a-½i_¬\u0084âÏ8;~Sµ¿Ë°\u0001ìG&\u0081³Dh\n#Ð×\u0096¿]V#\\é\u001f¯Øu\u00878lþ>Ä\u0003\u008a×P\u009f\u0017fÝ\u0004£àiØ/\u0083òE¸$Ê¼\u000fgA,\u009bßÝ±\u0016{hY¢\u001däæ>ºsuµ5\u008f\u0013ÁÅ\u001b\u009b\u0000DÅ\u009f\u008bÔQ'\u0017IÜ\u0083¢¡hå.\u0015ôB¹\u0080\u007fØEã\u000b*Ñh»\u0006~Ý0\u0096êq¬\u000bgÛ\u0019äÓª\u0095hO\u0004\u0002Þ\u0000DÅ\u009f\u008bÔQ \u0017HÜµ¢£hã.6ôF¹\u009c\u007fõEí\u000b<Ñn\u0096\u0080\\Þ\"\u001eè4\u0000DÅ\u009f\u008bÔQ \u0017HÜµ¢£hþ.=ôa¹\u008f\u007f×Eê\u000b*Ñh\u0096©\\Ù\"\bè2®ts²9Âÿ\u0000\u0004:Áá\u008fªU^\u00136ØË¦Ýl\u0080*Cð\u0014½þ{³A\u009f\u000fCÕ\u0017\u0092ïX§&qìQª\u000ewÎ=\u0095ûeÁ0\u008f\u0002TÈ\u0012\u008eØr¦8\u0000DÅ\u009f\u008bÔQ \u0017HÜ´¢£há.4ôA¹\u008f\u007fÚEïÜÖ\u0019\rWF\u008d²ËÚ\u0000 ~(´oò«(ße\u0018£N\u0099r×\u0091\ráJ\u0004\u0080Vþ\u008c4ºræ¯<\u0000DÅ\u009f\u008bÔQ \u0017HÜ¾¢¬hù.=ôQ¹\u009d\u007fÍEí\u000b;Ñs\u0096\u0084\\Ü\"7è/®bs¨9Âÿ\u001cÅX\u008bz\u0000DÅ\u009f\u008bÔQ \u0017HÜ»¢«hþ.,ôF¹\u0080\u007fÜEö\u0010ÍÕ\u0010\u009bBA\u0099\u0007ÛÌ\u000f²<xq>³äò©\u0016oSUu\u001b\u009bÁâ\u0086\fµíp0>jä ¢ði-\u0017\u000eÝ@\u009b\u008eAè\f\u0004ÊeðO¾\u0080dÊ#?él\u0000AÅ»\u008båQ(\u0017BÜ\u0083¢§hÿ.+ôW¹\u0087\u007fÍEí\u000b.Ñv\u0096¤\\Ó\"\u000fè/®gsµ9Óÿ\u000b\u0000cÅ¤\u008bûQO\u0017MÜ\u009a¢£h÷.7ôM¹À\u007fØEô\u000b<Ñ4\u0096\u0084\\Ô\"\bèh®ps¿9Óÿ\u001bÅK\u008baP§\u0016çÜG¢ug\u008f-¹óÜ¹\u000e\u007f_D\u0093\n³Ðÿ\u0096#\\K!\u0099çÑ\u00adâs\"9Xþ\u0087ÄÛ\u008a\u0013P3\u0016yÛ¯¡ß?\u001aúà´¾n{(\u0013ãí\u009dúW¢\u0011jË\u000e\u0086Ü@\u0096z¦\u0000cÅ¤\u008bûQO\u0017MÜ\u009a¢£h÷.7ôM¹À\u007fØEô\u000b<Ñ4\u0096\u0084\\Ô\"\bèh®ps¿9Óÿ\u001bÅK\u008baP§\u0016çÜG¢ug\u008f-¹óÔ¹\u0004\u007fjD\u0095\nµÐå\u0096!\\K!\u0099çÁ\u0000AÅ»\u008båQ \u0017HÜ¡¢«hè./\u0000AÅ»\u008bå>vû\u008cµÒo\u0017)\u007fO!\u008aÛÄ\u0085\u001e@X(\u0093ÔíÍ'\u0083aL»1öá0µ\n\u0088DJ\u009e\b\u0000AÅ»\u008båQ \u0017HÜ»¢«hþ.,ôF¹\u0080\u007fÜEöùM<·ré¨,îD%©[«\u0091ð×!\rJ@\u0091\u0086Á¼Äò*(eo\u009d¥ÙÛ\u0019\u0011/Wo\u0000AÅ»\u008båQ \u0017HÜ±¢\u00adhÿ.5ôB¹\u009aª\\o¦!øû=½Uv¾\b¦Âà\u0084 \u0003þÆ\u0004\u0088ZR\u009f\u0014÷ß\u001a¡\u0018kC-\u0092÷ùº\"|rïa*¨dä¾&øZ3\u0081M\u008f\u0087îÁ'P%\u0095ìÛ \u0001eG\u000b\u008cÁòã8§~\\¤\u0000éÏ/\u008f\u0015©[\u007f\u0081!Æî\f\u009crJ¸pþ2#ði\u0086¯U¦¼cu-9÷û±\u0093z~\u0004|Î%\u0088óR\u0097\u001f[Ù\u0011ã:\u00adÖw¨0Zú\"\u0084Ä\u0000gÅ®\u008bâQ \u0017HÜ¥¢§hþ.(ôL¹\u0080\u007fÊEá\u000b\fÑh\u0096\u0080\\Ñ\"\u000fè/®gs¹9îÿ\u0016\u0000gÅ®\u008bâQ \u0017HÜ¥¢§hþ.(ôL¹\u0080\u007fÊEá\u000b\u0006Ñw\u0096\u0095\\Â\"\u001eè5®bsµ9Èÿ\u001cÅh\u008bzP¿\u0000gÅ®\u008bâQ \u0017HÜ¥¢§hþ.(ôL¹\u0080\u007fÊEá\u000b\u001dÑ\u007f\u0096\u008b\\Ô\"\u001eè4®xs²9Àÿ?Å\\\u008bx!þä7ª{p¹6Ñý<\u0083>Ig\u000f±ÕÕ\u0098\u0019^Sdx*\u0084ðæ·\u0012}M\u0003\u0087É\u00ad\u008fáR+\u0018YÞ©äÑªÿq.7ký\u0095[´\u009e}Ð1\nöL\u009a\u0087Bùp3+uç¯\u0084âk$\u0003\u001e3Pù\u008a¦Íw\u0007\u0007yÛ³Çõ§(~b\u0001¤Ä\u009e\u009dÐ¯\u000bCM8\u0087Éù\u0093<Cvt¨\u0016âÒ$\u008a\u001fDQ\u007f\u008b,\u0000gÅ®\u008bâQ \u0017HÜ¥¢§hþ.(ôL¹\u0080\u007fÊEá\u000b\u000eÑ~\u0096\u0096\u0000gÅ®\u008bâQ \u0017HÜ¥¢§hþ.(ôL¹\u0080\u007fÊEá\u000b\u001fÑh\u0096\u008c\\Ó\"\u001eè\u0016®~sµ9Éÿ\u0006v ³éý¥'ga\u000fªãÔì\u001e°Xz\u00827ÏÅ\t\u00913·}]§\bàë*³\u0000gÅ®\u008bâQ \u0017HÜ¤¢«h÷.=ôb¹\u008a\u007fíEý\u000b?Ñ\u007fsH¶\u0081øÍ\"\u000fdg¯\u008bÑ\u0084\u001bØ]\u0012\u0087\\Ê´\fô6øx\u0005¢Aå¾/öQ:\u009b\u000eÝM\u0000iÅ¸\u008b×Q\u0005\u0017\u007fÜ\u009e¢¸hè.\u0011ôM¹\u009a\u007fÜEö\u000b<Ñn\u0096\u008c\\Ä\"\u0012è'®}s\u009d9Ã\u0000cÅ¹\u008bóQ\u0000\u0017XÜ\u0092¢\u0096hÏ.\u001eôF¹\u009a\u007fÚEì\u000b\tÑ{\u0096\u0086\\Ä\"\u0014è4®hs\u00919Æÿ\u001cÅ\\\u008boP¶\u0016ìÜ$¢Ug\u008f\u0000cÅ¹\u008bóQ\u0000\u0017XÜ\u0092¢\u0096hÏ.\u001dô[¹\u008b\u007fÚEñ\u000b;Ñu\u0096\u0097\\ã\"\u001eè4®gsµ9Äÿ\u0017\u0000gÅ®\u008bâQ \u0017\\Ü\u0084¢\u0083hé.\nôF¹\u009f\u007fÌEá\u000b<Ñn Cå\u008a«Æq\u00077aü·\u0082¯HÇ\u000e\u001aÔh\u0097\u0004RÍ\u001c\u0081ÆR\u0080=Ký5Âÿ\u008b¹kc/.äè´Ò\u0093\u0094\u009cQU\u001f\u0019ÅÉ\u0083»Hc6Mü#ºÖ`±-q¤.aç/«õi³\u0015xÍ\u0006ÊÌ \u008aWP\u0005\u001dÕÛ\u009dá¬¯r!wä¾ªòp06Xý«\u0083½Iü\u000f,ÕV\u0098\u008c\u0000gÅ®\u008bâQ \u0017HÜ¡¢«hè./", "ISO-8859-1", cArr, 0, 1191);
        f766 = cArr;
        f765 = -6125157440420461109L;
    }

    public bi(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static DTBFetchFactory m827() {
        DTBFetchFactory dTBFetchFactory;
        int i10 = f763 + 1;
        f764 = i10 % 128;
        if (i10 % 2 != 0) {
            dTBFetchFactory = DTBFetchFactory.getInstance();
            int i11 = 35 / 0;
        } else {
            dTBFetchFactory = DTBFetchFactory.getInstance();
        }
        int i12 = f764 + 115;
        f763 = i12 % 128;
        if (i12 % 2 != 0) {
            return dTBFetchFactory;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static HashMap<String, Object> m830(DTBAdResponse dTBAdResponse) {
        int i10 = f763 + 3;
        f764 = i10 % 128;
        int i11 = i10 % 2;
        HashMap<String, Object> renderingMap = dTBAdResponse.getRenderingMap();
        if (i11 != 0) {
            int i12 = 81 / 0;
        }
        f763 = (f764 + 121) % 128;
        return renderingMap;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static String m832() {
        f764 = (f763 + InterfaceC0435l1.d.b.f29105b) % 128;
        String appKey = AdRegistration.getAppKey();
        int i10 = f763 + 91;
        f764 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 63 / 0;
        }
        return appKey;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static ApsAdRequest m834(ApsAd apsAd) {
        f763 = (f764 + 13) % 128;
        ApsAdRequest adLoader = apsAd.getAdLoader();
        f764 = (f763 + 27) % 128;
        return adLoader;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static Bundle m835(DTBAdResponse dTBAdResponse) {
        int i10 = f763 + 81;
        f764 = i10 % 128;
        if (i10 % 2 != 0) {
            dTBAdResponse.getRenderingBundle();
            throw null;
        }
        Bundle renderingBundle = dTBAdResponse.getRenderingBundle();
        f764 = (f763 + 47) % 128;
        return renderingBundle;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ DTBAdView m838(ApsAd apsAd) {
        int i10 = f763 + 23;
        f764 = i10 % 128;
        int i11 = i10 % 2;
        DTBAdView dTBAdViewM831 = m831(apsAd);
        if (i11 != 0) {
            int i12 = 99 / 0;
        }
        return dTBAdViewM831;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ Map m842(DTBAdResponse dTBAdResponse) {
        int i10 = f763 + 31;
        f764 = i10 % 128;
        int i11 = i10 % 2;
        Map<String, String> mapM833 = m833(dTBAdResponse);
        if (i11 != 0) {
            int i12 = 19 / 0;
        }
        f764 = (f763 + InterfaceC0435l1.d.b.f29110g) % 128;
        return mapM833;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m845(DTBAdResponse dTBAdResponse) {
        f764 = (f763 + 45) % 128;
        String crid = dTBAdResponse.getCrid();
        int i10 = f763 + 53;
        f764 = i10 % 128;
        if (i10 % 2 == 0) {
            return crid;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ DTBFetchFactory m847() {
        f763 = (f764 + 121) % 128;
        DTBFetchFactory dTBFetchFactoryM827 = m827();
        int i10 = f764 + 33;
        f763 = i10 % 128;
        if (i10 % 2 != 0) {
            return dTBFetchFactoryM827;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ ApsAdRequest m849(ApsAd apsAd) {
        f764 = (f763 + 79) % 128;
        ApsAdRequest apsAdRequestM834 = m834(apsAd);
        f763 = (f764 + 99) % 128;
        return apsAdRequestM834;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m854(ApsAd apsAd) {
        f764 = (f763 + 51) % 128;
        String strM841 = m841(apsAd);
        int i10 = f764 + 15;
        f763 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM841;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m857(ApsAd apsAd) {
        int i10 = f763 + 67;
        f764 = i10 % 128;
        if (i10 % 2 != 0) {
            m844(apsAd);
            throw null;
        }
        String strM844 = m844(apsAd);
        int i11 = f764 + 47;
        f763 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 23 / 0;
        }
        return strM844;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ ApsAdFormat m861(ApsAd apsAd) {
        int i10 = f763 + 91;
        f764 = i10 % 128;
        if (i10 % 2 != 0) {
            m836(apsAd);
            throw null;
        }
        ApsAdFormat apsAdFormatM836 = m836(apsAd);
        int i11 = f764 + InterfaceC0435l1.d.b.f29109f;
        f763 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 14 / 0;
        }
        return apsAdFormatM836;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Bundle m864(DTBAdResponse dTBAdResponse) {
        int i10 = f764 + 69;
        f763 = i10 % 128;
        int i11 = i10 % 2;
        Bundle bundleM835 = m835(dTBAdResponse);
        if (i11 == 0) {
            int i12 = 11 / 0;
        }
        f763 = (f764 + 11) % 128;
        return bundleM835;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ AdType m869(DTBAdSize dTBAdSize) {
        int i10 = f764 + 69;
        f763 = i10 % 128;
        if (i10 % 2 == 0) {
            m837(dTBAdSize);
            throw null;
        }
        AdType adTypeM837 = m837(dTBAdSize);
        int i11 = f764 + 85;
        f763 = i11 % 128;
        if (i11 % 2 != 0) {
            return adTypeM837;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static List<DTBAdSize> m829(DTBAdResponse dTBAdResponse) {
        int i10 = f763 + 61;
        f764 = i10 % 128;
        int i11 = i10 % 2;
        List<DTBAdSize> dTBAds = dTBAdResponse.getDTBAds();
        if (i11 != 0) {
            int i12 = 17 / 0;
        }
        return dTBAds;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static Map<String, String> m833(DTBAdResponse dTBAdResponse) {
        int i10 = f763 + InterfaceC0435l1.d.b.f29114k;
        f764 = i10 % 128;
        if (i10 % 2 != 0) {
            dTBAdResponse.getDefaultVideoAdsRequestCustomParams();
            throw null;
        }
        Map<String, String> defaultVideoAdsRequestCustomParams = dTBAdResponse.getDefaultVideoAdsRequestCustomParams();
        int i11 = f764 + 45;
        f763 = i11 % 128;
        if (i11 % 2 != 0) {
            return defaultVideoAdsRequestCustomParams;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static ApsAdFormat m836(ApsAd apsAd) {
        f764 = (f763 + 77) % 128;
        ApsAdFormat apsAdFormat = apsAd.getApsAdFormat();
        int i10 = f764 + 107;
        f763 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 45 / 0;
        }
        return apsAdFormat;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ String m839() {
        f763 = (f764 + 93) % 128;
        String strM832 = m832();
        f763 = (f764 + 49) % 128;
        return strM832;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static JSONObject m843(DTBAdSize dTBAdSize) {
        f763 = (f764 + InterfaceC0435l1.d.b.f29112i) % 128;
        JSONObject pubSettings = dTBAdSize.getPubSettings();
        f764 = (f763 + 57) % 128;
        return pubSettings;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m844(ApsAd apsAd) {
        f764 = (f763 + 95) % 128;
        String pricePoint = apsAd.getPricePoint();
        f763 = (f764 + 13) % 128;
        return pricePoint;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m848(DTBAdResponse dTBAdResponse) {
        f764 = (f763 + 115) % 128;
        String impressionUrl = dTBAdResponse.getImpressionUrl();
        f763 = (f764 + 73) % 128;
        return impressionUrl;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ List m850(DTBAdResponse dTBAdResponse) {
        f764 = (f763 + 115) % 128;
        List<DTBAdSize> listM829 = m829(dTBAdResponse);
        int i10 = f763 + 61;
        f764 = i10 % 128;
        if (i10 % 2 == 0) {
            return listM829;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m855(DTBAdSize dTBAdSize) {
        int i10 = f763 + 19;
        f764 = i10 % 128;
        int i11 = i10 % 2;
        String strM863 = m863(dTBAdSize);
        if (i11 != 0) {
            int i12 = 86 / 0;
        }
        return strM863;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m858(DTBAdResponse dTBAdResponse) {
        f763 = (f764 + 33) % 128;
        String strM840 = m840(dTBAdResponse);
        int i10 = f763 + 97;
        f764 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 13 / 0;
        }
        return strM840;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m862(DTBAdResponse dTBAdResponse) {
        int i10 = f764 + 121;
        f763 = i10 % 128;
        if (i10 % 2 != 0) {
            return m848(dTBAdResponse);
        }
        m848(dTBAdResponse);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ ApsAdRequest m865(ApsAd apsAd) {
        f764 = (f763 + 7) % 128;
        ApsAdRequest apsAdRequestM846 = m846(apsAd);
        int i10 = f763 + 11;
        f764 = i10 % 128;
        if (i10 % 2 == 0) {
            return apsAdRequestM846;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ b m870(bi biVar, HashMap map, ck ckVar) {
        f763 = (f764 + 71) % 128;
        b bVarM852 = biVar.m852((HashMap<String, DTBFetchManager>) map, ckVar);
        int i10 = f764 + 61;
        f763 = i10 % 128;
        if (i10 % 2 != 0) {
            return bVarM852;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static String m828(ApsAd apsAd) {
        f764 = (f763 + 21) % 128;
        String slotUuid = apsAd.getSlotUuid();
        f764 = (f763 + 33) % 128;
        return slotUuid;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static DTBAdView m831(ApsAd apsAd) {
        int i10 = f763 + 75;
        f764 = i10 % 128;
        if (i10 % 2 != 0) {
            apsAd.getAdView();
            throw null;
        }
        DTBAdView adView = apsAd.getAdView();
        f764 = (f763 + 91) % 128;
        return adView;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m840(DTBAdResponse dTBAdResponse) {
        int i10 = f763 + 121;
        f764 = i10 % 128;
        if (i10 % 2 != 0) {
            dTBAdResponse.getBidId();
            throw null;
        }
        String bidId = dTBAdResponse.getBidId();
        f763 = (f764 + 63) % 128;
        return bidId;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m841(ApsAd apsAd) {
        int i10 = f764 + 49;
        f763 = i10 % 128;
        if (i10 % 2 == 0) {
            apsAd.getBidInfo();
            throw null;
        }
        String bidInfo = apsAd.getBidInfo();
        int i11 = f764 + InterfaceC0435l1.d.b.f29107d;
        f763 = i11 % 128;
        if (i11 % 2 != 0) {
            return bidInfo;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static ApsAdRequest m846(ApsAd apsAd) {
        f763 = (f764 + 125) % 128;
        ApsAdRequest apsAdRequest = apsAd.getApsAdRequest();
        f764 = (f763 + 99) % 128;
        return apsAdRequest;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static boolean m851(DTBAdSize dTBAdSize) {
        f764 = (f763 + 27) % 128;
        boolean zIsInterstitialAd = dTBAdSize.isInterstitialAd();
        f764 = (f763 + 1) % 128;
        return zIsInterstitialAd;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ HashMap m856(DTBAdResponse dTBAdResponse) {
        f764 = (f763 + 79) % 128;
        HashMap<String, Object> mapM830 = m830(dTBAdResponse);
        int i10 = f763 + 5;
        f764 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 52 / 0;
        }
        return mapM830;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m859(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        f763 = (f764 + 95) % 128;
        String strM867 = m867(dTBAdResponse, dTBAdSize);
        int i10 = f764 + 45;
        f763 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 43 / 0;
        }
        return strM867;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m868(DTBAdSize dTBAdSize) {
        f764 = (f763 + 99) % 128;
        JSONObject jSONObjectM843 = m843(dTBAdSize);
        f763 = (f764 + 63) % 128;
        return jSONObjectM843;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ e m871(bi biVar, ThreadPoolExecutor threadPoolExecutor, ck ckVar) {
        f763 = (f764 + 117) % 128;
        e eVarM853 = biVar.m853(threadPoolExecutor, ckVar);
        int i10 = f764 + 57;
        f763 = i10 % 128;
        if (i10 % 2 != 0) {
            return eVarM853;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0163  */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        byte b10;
        switch (str.hashCode()) {
            case -2137858584:
                b10 = !str.equals(m866((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25169), 204 - ExpandableListView.getPackedPositionType(0L), 11 - ExpandableListView.getPackedPositionGroup(0L)).intern()) ? (byte) -1 : (byte) 8;
                break;
            case -2133119933:
                b10 = !str.equals(m866((char) (20321 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), View.MeasureSpec.getMode(0) + 673, 15 - Color.alpha(0)).intern()) ? (byte) -1 : (byte) 34;
                break;
            case -1987686071:
                if (!str.equals(m866((char) Gravity.getAbsoluteGravity(0, 0), TextUtils.lastIndexOf("", '0') + 483, 14 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    f763 = (f764 + 93) % 128;
                    b10 = 24;
                }
                break;
            case -1885106463:
                b10 = !str.equals(m866((char) (TextUtils.getCapsMode("", 0, 0) + 5475), 28 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 11).intern()) ? (byte) -1 : (byte) 1;
                break;
            case -1879113962:
                if (!str.equals(m866((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26907), ((byte) KeyEvent.getModifierMetaStateMask()) + 281, 10 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    f764 = (f763 + 97) % 128;
                    b10 = 13;
                }
                break;
            case -1879025222:
                if (!str.equals(m866((char) Color.alpha(0), Color.argb(0, 0, 0, 0) + PsExtractor.VIDEO_STREAM_MASK, TextUtils.indexOf("", "") + 9).intern())) {
                    b10 = -1;
                } else {
                    b10 = 11;
                }
                break;
            case -1554728876:
                if (!str.equals(m866((char) View.MeasureSpec.getMode(0), 94 - Color.blue(0), 45 - ExpandableListView.getPackedPositionType(0L)).intern())) {
                    b10 = -1;
                } else {
                    f764 = (f763 + 75) % 128;
                    b10 = 4;
                }
                break;
            case -1464660218:
                b10 = !str.equals(m866((char) (View.resolveSizeAndState(0, 0, 0) + 1150), 394 - (ViewConfiguration.getJumpTapTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 30).intern()) ? (byte) -1 : (byte) 20;
                break;
            case -1358954558:
                b10 = !str.equals(m866((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 51959), 311 - (ViewConfiguration.getWindowTouchSlop() >> 8), View.combineMeasuredStates(0, 0) + 15).intern()) ? (byte) -1 : (byte) 15;
                break;
            case -1293925587:
                b10 = !str.equals(m866((char) (61176 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 71, 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 3;
                break;
            case -1291566264:
                if (!str.equals(m866((char) (959 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 741 - TextUtils.indexOf("", ""), 12 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    f764 = (f763 + 75) % 128;
                    b10 = 39;
                }
                break;
            case -1092884085:
                b10 = !str.equals(m866((char) (Process.myPid() >> 22), TextUtils.getOffsetBefore("", 0) + 152, Color.alpha(0) + 35).intern()) ? (byte) -1 : (byte) 6;
                break;
            case -1090060454:
                if (!str.equals(m866((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 40664), 215 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 12 - View.MeasureSpec.getMode(0)).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f764 + 3;
                    f763 = i10 % 128;
                    b10 = i10 % 2 != 0 ? (byte) 9 : (byte) 121;
                }
                break;
            case -832298225:
                b10 = !str.equals(m866((char) (4249 - ExpandableListView.getPackedPositionGroup(0L)), 495 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 16 - Gravity.getAbsoluteGravity(0, 0)).intern()) ? (byte) -1 : (byte) 25;
                break;
            case -791598050:
                b10 = !str.equals(m866((char) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.lastIndexOf("", '0', 0, 0) + 722, 11 - ExpandableListView.getPackedPositionType(0L)).intern()) ? (byte) -1 : (byte) 37;
                break;
            case -723985259:
                b10 = !str.equals(m866((char) (47938 - Color.blue(0)), ImageFormat.getBitsPerPixel(0) + 342, 10 - TextUtils.lastIndexOf("", '0')).intern()) ? (byte) -1 : (byte) 17;
                break;
            case -696695160:
                b10 = !str.equals(m866((char) (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 38 - (Process.myTid() >> 22), (ViewConfiguration.getPressedStateDuration() >> 16) + 33).intern()) ? (byte) -1 : (byte) 2;
                break;
            case -694845532:
                b10 = !str.equals(m866((char) (24937 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ViewConfiguration.getPressedStateDuration() >> 16) + 139, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12).intern()) ? (byte) -1 : (byte) 5;
                break;
            case -466918522:
                b10 = !str.equals(m866((char) View.resolveSize(0, 0), (-16776845) - Color.rgb(0, 0, 0), 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern()) ? (byte) -1 : (byte) 19;
                break;
            case -341719851:
                b10 = !str.equals(m866((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), ImageFormat.getBitsPerPixel(0) + 353, (ViewConfiguration.getTapTimeout() >> 16) + 19).intern()) ? (byte) -1 : (byte) 18;
                break;
            case -300800492:
                b10 = !str.equals(m866((char) (46520 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 510 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17).intern()) ? (byte) -1 : (byte) 26;
                break;
            case -197992833:
                b10 = !str.equals(m866((char) (MotionEvent.axisFromString("") + 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 528, TextUtils.lastIndexOf("", '0', 0, 0) + 24).intern()) ? (byte) -1 : (byte) 27;
                break;
            case -27446238:
                b10 = !str.equals(m866((char) (56466 - (Process.myPid() >> 22)), 436 - (ViewConfiguration.getFadingEdgeLength() >> 16), 22 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 22;
                break;
            case 66052:
                b10 = !str.equals(m866((char) Color.green(0), View.resolveSize(0, 0) + 665, 4 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern()) ? (byte) -1 : (byte) 32;
                break;
            case 63478087:
                b10 = !str.equals(m866((char) (15928 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 668 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4).intern()) ? (byte) -1 : (byte) 33;
                break;
            case 355568411:
                b10 = !str.equals(m866((char) Color.green(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 687, Color.green(0) + 13).intern()) ? (byte) -1 : (byte) 35;
                break;
            case 568188517:
                b10 = !str.equals(m866((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 325, 15 - ExpandableListView.getPackedPositionGroup(0L)).intern()) ? (byte) -1 : (byte) 16;
                break;
            case 620798166:
                if (!str.equals(m866((char) (View.MeasureSpec.getSize(0) + 59495), TextUtils.indexOf("", "", 0) + 227, 13 - Color.alpha(0)).intern())) {
                    b10 = -1;
                } else {
                    int i11 = f763 + 3;
                    f764 = i11 % 128;
                    b10 = i11 % 2 == 0 ? (byte) 10 : (byte) 106;
                }
                break;
            case 788901082:
                b10 = !str.equals(m866((char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 423, (ViewConfiguration.getPressedStateDuration() >> 16) + 13).intern()) ? (byte) -1 : (byte) 21;
                break;
            case 1036908700:
                b10 = !str.equals(m866((char) (24482 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 13, (ViewConfiguration.getLongPressTimeout() >> 16) + 14).intern()) ? (byte) -1 : (byte) 0;
                break;
            case 1251356764:
                b10 = !str.equals(m866((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 41 - TextUtils.getCapsMode("", 0, 0)).intern()) ? (byte) -1 : (byte) 30;
                break;
            case 1306698049:
                b10 = !str.equals(m866((char) ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.indexOf("", "", 0) + 187, 17 - View.getDefaultSize(0, 0)).intern()) ? (byte) -1 : (byte) 7;
                break;
            case 1328085269:
                b10 = !str.equals(m866((char) View.combineMeasuredStates(0, 0), 457 - TextUtils.indexOf("", "", 0, 0), 25 - KeyEvent.getDeadChar(0, 0)).intern()) ? (byte) -1 : (byte) 23;
                break;
            case 1340383521:
                if (!str.equals(m866((char) ((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 43548), 732 - TextUtils.getCapsMode("", 0, 0), 9 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    int i12 = f764 + 57;
                    f763 = i12 % 128;
                    if (i12 % 2 != 0) {
                        b10 = 38;
                    } else {
                        b10 = 11;
                    }
                }
                break;
            case 1340427404:
                b10 = !str.equals(m866((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 655, (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 9).intern()) ? (byte) -1 : (byte) 31;
                break;
            case 1600627740:
                b10 = !str.equals(m866((char) (TextUtils.lastIndexOf("", '0') + 63757), 701 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.getTrimmedLength("") + 20).intern()) ? (byte) -1 : (byte) 36;
                break;
            case 1648408950:
                b10 = !str.equals(m866((char) (16219 - (ViewConfiguration.getScrollBarSize() >> 8)), 601 - TextUtils.lastIndexOf("", '0', 0), 12 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern()) ? (byte) -1 : (byte) 29;
                break;
            case 1713728997:
                if (!str.equals(m866((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 552 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 50 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                    b10 = -1;
                } else {
                    int i13 = f764 + 77;
                    f763 = i13 % 128;
                    b10 = i13 % 2 != 0 ? (byte) 28 : (byte) 82;
                }
                break;
            case 2019413793:
                b10 = !str.equals(m866((char) TextUtils.getTrimmedLength(""), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 249, 31 - View.getDefaultSize(0, 0)).intern()) ? (byte) -1 : (byte) 12;
                break;
            case 2144664800:
                if (!str.equals(m866((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 33270), 289 - (Process.myTid() >> 22), View.combineMeasuredStates(0, 0) + 22).intern())) {
                    b10 = -1;
                } else {
                    f763 = (f764 + 7) % 128;
                    b10 = 14;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                int i14 = f763 + 107;
                f764 = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 21 / 0;
                }
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
                return b.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                return e.class;
            case 27:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                return ApsInterstitialActivity.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                return ApsAdActivity.class;
            case 31:
                return ApsAdView.class;
            case 32:
                return Aps.class;
            case 33:
                return ApsAd.class;
            case 34:
                return ApsAdController.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                return ApsAdListener.class;
            case 36:
                return ApsAdRequestListener.class;
            case 37:
                return ApsAdFormat.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                return ApsAdType.class;
            case 39:
                return ApsAdRequest.class;
            default:
                return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends HashMap<String, DTBFetchManager> implements hj<HashMap<String, DTBFetchManager>> {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f790 = 0;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f791 = 9070945986215708967L;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f792 = 1;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private ck f793;

        public b(HashMap<String, DTBFetchManager> map, ck ckVar) {
            super(map);
            this.f793 = ckVar;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m874(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2127) {
                try {
                    char[] cArrM2229 = g.m2229(f791, cArr, i10);
                    g.f2129 = 4;
                    while (true) {
                        int i11 = g.f2129;
                        if (i11 < cArrM2229.length) {
                            int i12 = i11 - 4;
                            g.f2128 = i12;
                            cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f791));
                            g.f2129 = i11 + 1;
                        } else {
                            str2 = new String(cArrM2229, 4, cArrM2229.length - 4);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private DTBFetchManager m875(String str, DTBFetchManager dTBFetchManager) {
            int i10 = f792 + 67;
            f790 = i10 % 128;
            if (i10 % 2 != 0) {
                bi biVar = bi.this;
                ck ckVar = this.f793;
                String strIntern = m874("騶呋죥驲\udd38\ue457\udae9罤뻏識\ufe6c\u242e퍃虵錍\u009b\uf785ꋕ䢵\ued75ࠎ侽氨짚\u2d77ᐙǏ뛸䇮ヱ╧", 0 - (ViewConfiguration.getTapTimeout() % 42)).intern();
                Object[] objArr = new Object[5];
                objArr[1] = str;
                objArr[1] = dTBFetchManager;
                biVar.m823(this, ckVar, strIntern, objArr);
            } else {
                bi.this.m823(this, this.f793, m874("騶呋죥驲\udd38\ue457\udae9罤뻏識\ufe6c\u242e퍃虵錍\u009b\uf785ꋕ䢵\ued75ࠎ侽氨짚\u2d77ᐙǏ뛸䇮ヱ╧", 1 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), str, dTBFetchManager);
            }
            return (DTBFetchManager) super.put(str, dTBFetchManager);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object put(Object obj, Object obj2) {
            int i10 = f790 + 71;
            f792 = i10 % 128;
            int i11 = i10 % 2;
            DTBFetchManager dTBFetchManagerM875 = m875((String) obj, (DTBFetchManager) obj2);
            if (i11 == 0) {
                int i12 = 64 / 0;
            }
            int i13 = f792 + 29;
            f790 = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 75 / 0;
            }
            return dTBFetchManagerM875;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hj
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ HashMap<String, DTBFetchManager> mo800() {
            int i10 = f790 + 25;
            f792 = i10 % 128;
            int i11 = i10 % 2;
            HashMap<String, DTBFetchManager> mapM876 = m876();
            if (i11 == 0) {
                int i12 = 71 / 0;
            }
            return mapM876;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private HashMap<String, DTBFetchManager> m876() {
            int i10 = f792 + 41;
            f790 = i10 % 128;
            if (i10 % 2 == 0) {
                return this;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static AdType m837(DTBAdSize dTBAdSize) {
        int i10 = f763 + 65;
        f764 = i10 % 128;
        int i11 = i10 % 2;
        AdType dTBAdType = dTBAdSize.getDTBAdType();
        if (i11 != 0) {
            int i12 = 69 / 0;
        }
        f763 = (f764 + InterfaceC0435l1.d.b.f29107d) % 128;
        return dTBAdType;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m860(DTBAdSize dTBAdSize) {
        int i10 = f763 + 29;
        f764 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM851 = m851(dTBAdSize);
        if (i11 != 0) {
            int i12 = 90 / 0;
        }
        int i13 = f764 + 63;
        f763 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 59 / 0;
        }
        return zM851;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m872(ApsAd apsAd) {
        f764 = (f763 + 15) % 128;
        String strM828 = m828(apsAd);
        int i10 = f764 + 85;
        f763 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM828;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        f764 = (f763 + 79) % 128;
        Matcher matcher = Pattern.compile(m866((char) (53778 - (ViewConfiguration.getEdgeSlop() >> 16)), ViewConfiguration.getKeyRepeatDelay() >> 16, 13 - TextUtils.getOffsetAfter("", 0)).intern()).matcher(mo818());
        if (matcher.matches()) {
            return matcher.group(1);
        }
        int i10 = f763 + 63;
        f764 = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        map.put(m866((char) (Drawable.resolveOpacity(0, 0) + 61190), AndroidCharacter.getMirror('0') + 705, 9 - View.resolveSizeAndState(0, 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m839();
            }
        });
        map.put(m866((char) (TextUtils.getTrimmedLength("") + 20546), (ViewConfiguration.getJumpTapTimeout() >> 16) + 762, 22 - TextUtils.lastIndexOf("", '0', 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.11
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m847();
            }
        });
        map.put(m866((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 42715), TextUtils.indexOf("", "", 0, 0) + 785, Color.blue(0) + 18).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.19
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m858((DTBAdResponse) list.get(0));
            }
        });
        map.put(m866((char) ((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1), TextUtils.getTrimmedLength("") + 803, ((byte) KeyEvent.getModifierMetaStateMask()) + 24).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.20
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m873((DTBAdResponse) list.get(0));
            }
        });
        map.put(m866((char) (Process.getGidForName("") + 1), Gravity.getAbsoluteGravity(0, 0) + 826, 26 - (Process.myTid() >> 22)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.17
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m862((DTBAdResponse) list.get(0));
            }
        });
        map.put(m866((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 851, Color.blue(0) + 25).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.18
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m856((DTBAdResponse) list.get(0));
            }
        });
        map.put(m866((char) (8601 - (ViewConfiguration.getTouchSlop() >> 8)), 876 - Process.getGidForName(""), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.22
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m864((DTBAdResponse) list.get(0));
            }
        });
        map.put(m866((char) (23508 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 905, 37 - (Process.myTid() >> 22)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.25
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m842((DTBAdResponse) list.get(0));
            }
        });
        map.put(m866((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 942 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.combineMeasuredStates(0, 0) + 16).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.21
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m850((DTBAdResponse) list.get(0));
            }
        });
        map.put(m866((char) (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 959, KeyEvent.keyCodeFromString("") + 23).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m859((DTBAdResponse) list.get(0), (DTBAdSize) list.get(1));
            }
        });
        map.put(m866((char) (30279 - View.resolveSizeAndState(0, 0, 0)), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 981, 17 - View.MeasureSpec.getMode(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m855((DTBAdSize) list.get(0));
            }
        });
        map.put(m866((char) View.MeasureSpec.getMode(0), 999 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m869((DTBAdSize) list.get(0));
            }
        });
        map.put(m866((char) (29488 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + Z3.f28072i, 20 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m868((DTBAdSize) list.get(0));
            }
        });
        map.put(m866((char) (ViewConfiguration.getPressedStateDuration() >> 16), 1033 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 22).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return Boolean.valueOf(bi.m860((DTBAdSize) list.get(0)));
            }
        });
        map.put(m866((char) Color.red(0), 1055 - View.MeasureSpec.getMode(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m870(bi.this, (HashMap) list.get(0), ckVar);
            }
        });
        map.put(m866((char) View.getDefaultSize(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 1085, 23 - View.resolveSizeAndState(0, 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m871(bi.this, (ThreadPoolExecutor) list.get(0), ckVar);
            }
        });
        map.put(m866((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 1108 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 15 - View.MeasureSpec.getSize(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m865((ApsAd) list.get(0));
            }
        });
        map.put(m866((char) ((ViewConfiguration.getTouchSlop() >> 8) + 8228), 1123 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m854((ApsAd) list.get(0));
            }
        });
        map.put(m866((char) (38755 - Color.argb(0, 0, 0, 0)), 1132 - ImageFormat.getBitsPerPixel(0), 13 - Color.argb(0, 0, 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.13
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m857((ApsAd) list.get(0));
            }
        });
        map.put(m866((char) (TextUtils.indexOf((CharSequence) "", '0') + 38140), View.getDefaultSize(0, 0) + 1146, 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.15
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m872((ApsAd) list.get(0));
            }
        });
        map.put(m866((char) (AndroidCharacter.getMirror('0') + 42009), 1157 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 14 - Color.argb(0, 0, 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.12
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m861((ApsAd) list.get(0));
            }
        });
        map.put(m866((char) (ExpandableListView.getPackedPositionType(0L) + 8464), 1171 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf("", "", 0) + 11).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.14
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m849((ApsAd) list.get(0));
            }
        });
        map.put(m866((char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1182, '9' - AndroidCharacter.getMirror('0')).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.16
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bi.m838((ApsAd) list.get(0));
            }
        });
        f764 = (f763 + 13) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m873(DTBAdResponse dTBAdResponse) {
        f763 = (f764 + 5) % 128;
        String strM845 = m845(dTBAdResponse);
        int i10 = f764 + 51;
        f763 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM845;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻛ */
    public final String mo818() {
        f764 = (f763 + 125) % 128;
        String version = AdRegistration.getVersion();
        f764 = (f763 + 125) % 128;
        return version;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private b m852(HashMap<String, DTBFetchManager> map, ck ckVar) {
        b bVar = new b(map, ckVar);
        f764 = (f763 + 77) % 128;
        return bVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private e m853(ThreadPoolExecutor threadPoolExecutor, ck ckVar) {
        e eVar = new e(threadPoolExecutor, ckVar);
        f764 = (f763 + 95) % 128;
        return eVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m867(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        f763 = (f764 + 31) % 128;
        String pricePoints = dTBAdResponse.getPricePoints(dTBAdSize);
        int i10 = f763 + 41;
        f764 = i10 % 128;
        if (i10 % 2 == 0) {
            return pricePoints;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m866(char c4, int i10, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i11];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f766[i10 + i12]) ^ (((long) i12) * f765)) ^ ((long) c4));
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m863(DTBAdSize dTBAdSize) {
        f763 = (f764 + 61) % 128;
        String slotUUID = dTBAdSize.getSlotUUID();
        int i10 = f764 + 117;
        f763 = i10 % 128;
        if (i10 % 2 != 0) {
            return slotUUID;
        }
        throw null;
    }
}
