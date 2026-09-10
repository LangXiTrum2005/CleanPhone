package com.p004ironsource.adqualitysdk.sdk.i;

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
import com.amazon.device.ads.DTBAdView;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoAutomaticListener;
import com.p004ironsource.cs;
import com.p004ironsource.f9;
import com.p004ironsource.mediationsdk.AbstractAdapter;
import com.p004ironsource.mediationsdk.ISBannerSize;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.IronSourceBannerLayout;
import com.p004ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.p004ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.p004ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.p004ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener;
import com.p004ironsource.mediationsdk.ads.nativead.NativeAdLayout;
import com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface;
import com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInteractionListener;
import com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface;
import com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdLoadListener;
import com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.p004ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.p004ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.p004ironsource.mediationsdk.demandOnly.e;
import com.p004ironsource.mediationsdk.impressionData.ImpressionData;
import com.p004ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.mediationsdk.sdk.BannerSmashListener;
import com.p004ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.p004ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.p004ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.sdk.controller.ControllerActivity;
import com.p004ironsource.sdk.controller.InterstitialActivity;
import com.p004ironsource.sdk.controller.OpenUrlActivity;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.unity3d.ironsourceads.IronSourceAds;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import com.unity3d.ironsourceads.banner.BannerAdViewListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import com.unity3d.ironsourceads.interstitial.InterstitialAdListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import com.unity3d.ironsourceads.rewarded.RewardedAdListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class bv extends bg {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1052 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1053 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1054;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1055;

    static {
        char[] cArr = new char[cs.a.INSTANCE_NOT_FOUND_IN_SHOW];
        ByteBuffer.wrap("\u0000Aä\u0099É\u0085®\u0085\u0093\u009ex\u0086]\u0081B©'\u0099\f·ñ¯Ö¹»° Ú\u0085È\u0000Pä\u0097É\u0097®\u0092\u0093\u0089x\u008a]\u0087B³'¬\u0000Cä\u0094É\u0098®\u0085\u0093\u009ex\u0088]\u008eB±'½\f¡ñ\u008fÖª»° Ö\u0085ÌjÜOÄ4Ò\u0000cä\u0094É\u009b®ß\u0093\u0085x\u0095]\u008dB³'«\f¼ñ»Ö»»§ Ú\u0085\u0094jÆOÔ4À\u0019\u0088þÂãóÈù\u00adæ\u0092ÿwç\\ïA\u0012&\u001c\u000b\u0006ðAÕ)º\n\u009f\u000e\u0084/i$N>3 \u0018+ý'âOÇy¬P\u0091Zv@[R@v%n\nl8ÿÜ#ñ4\u0096\"«(@\"e z\u0002\u001f\u001a4\fÉ\u0019î\u0013\u00833\u0098j½xRjwp\ft!dÆn\u0000cä\u0094É\u009b®ß\u0093\u0085x\u0095]\u008dB³'«\f¼ñ»Ö»»§ Ú\u0085\u0094jÆOÔ4À\u0019\u0088þÂãóÈù\u00adæ\u0092ÿwç\\ïA\u0012&\u001c\u000b\u0006ðAÕ#º\u000b\u009f\u0014\u0084>i$N\"38\u0018.ý6âTÇY¬_\u0091ovJ[P@v%l\n|ïdÔr\u0000Oä\u008bÉ\u0093®\u009f\u0093¹x\u0095]\u008eB\u009c'»\f§ñ§Ö¿»\u00ad Ë\u0085Ã\u001e*úÝ×Ò°\u0096\u008dÌfÜCÄ\\ú9â\u0012õïòÈò¥î¾\u0093\u009bÝt\u008fQ\u009d*\u0089\u0007Áà\u008býºÖ°³¯\u008c¶i®B¦_[8U\u0015Oî\bËl¤\\\u0081L\u009a|wJPj-i\u0006Oãhü\u0000Ù\u0018²\f\u008f\u000eh\u0014E\u0014´ºPz}j\u001al'LÌ{édö\\\u0093H¸EE\u007fb[\u000fY\u0014\"1,Þ4û\u000f\u00809\u00ad,J=W\u001a|\u0010$\u001eÀéíæ\u008a¢·ø\\èyðfÎ\u0003Ö(ÁÕÆòÆ\u009fÚ\u0084§¡éN¥k¨\u0010²=²Ú½Ç\u0095ì\u0083\u0089\u0080¶\u009eS\u0086x\u009aeh\u0002*/@Ô`ñx\u009ev»N IM^j^\u0017R<_Ù}Æ!ã+\u0088 µ6R&\u007f\u0015d\u0003\u0001\u001e.\u0007Ë\u0018ð\u0002\"ÌÆ-ë1\u008c\u0015±\u0007Z\f\u007f\u0002`*\u0005\u000e.?Ó1ô)F\u001b¢Ã\u008fÁèÆÕÐ>Ì\u001bè\u0004éaàJù·ÿ\u0090Üýôæ\u0095Ã\u0097,\u0089\t\u0087r\u0097_\u008d\u0000Iä\u0089É\u0099®\u009f\u0093¿x\u0088]\u0097B¯'»\f¶ÈQ,\u008e\u0001\u009ef\u009b[\u0091°\u008c\u0095\u0089\u008a¬ï¯Ä¥9\u0092\u001e°s¨hÆ\u0000Iä\u0096É\u0086®\u0083\u0093\u0089x\u0094]\u0091B´'·\f½ñ\u008aÖ¨»° Þ\u0085öjÜOÃ4ß\u0019ÃþÏãùÈå^ìº\u0007\u0097\u001cð\u0018Í &\u0019\u0003#\u001c\u0010y\u0007Ó¿7H\u001aG}\u0003@Q«V\u008e_\u0091{ôkßa\"<\u0005qh}s\u0015V\u000f¹\n\u009c\tçYÊ\u001b-\u001903\u001be~\nA\u0005¤\u0016\u008f\u001e\u0092ÆõóØÁ#Ö\u0006Á\u0000Lä\u009eÉ\u0080®\u0094\u0093\u0080x·]\u008eB¼'¡\f\u0091ñ¯Ö§»ª Ú\u0085ÈjùOÙ4Ø\u0019ÒþÄãòÈò\u00adà\u0000Lä\u009eÉ\u0080®\u0094\u0093\u0080x·]\u008eB¼'¡\f\u009añ Ö½»¡ Í\u0085ÉjÁOÙ4ß\u0019ÏþÀãðÈÛ\u00adû\u0092þwü\\æA\u0010&\u001c\u000b\u0006m\u0001\u0089Ó¤ÍÃÙþÍ\u0015ú0Ã/ñJìaÌ\u009cæ»óÖèÍ\u0080è\u0093\u0007\u009d\"\u0099Y°t\u0082\u0093\u0088\u008e´¥µÀ\u009eÿµ\u001a±1¡,^KUfM\u009dK¸D×dòDée\u0004o#y^ouo\u0090}\u009f\u0006{ÔVÊ1Þ\fÊçýÂÄÝö¸ë\u0093ËnáIô$ï?\u0087\u001a\u0094õ\u009aÐ\u009e«·\u0086\u0085a\u008f|³W²2\u0094\r®è±Ã½ÞQ¹]\u0094[oW\u008b\noØBÆ%Ò\u0018ÆóñÖÈÉú¬ç\u0087Çzí]ø0ã+\u008b\u000e\u0098á\u0096Ä\u0092¿»\u0092\u0089u\u0083h¿C¾&\u0099\u0019ªü ×°ÊY\u00adS\u0080~{@^_1W\u0014C\u000fsâuÅetÙ\u0090\u0007½'Ú\u0007ç\u0012\f\u0010P\u0012´À\u0099ÞþÊÃÞ(é\rÐ\u0012âwÿ\\Ã¡ñ\u0086ãëóð\u0097Õ\u0081:ª\u001f\u008a\u0000Nä\u009aÉ\u0082®\u0098\u0093\u009ax\u0082]£B¹'\u0094\f²ñ·Ö¦»± Ë\u0000Lä\u009eÉ\u0080®\u0094\u0093\u0080x·]\u008eB¼'¡\f\u009dñ¯Ö½»\u00ad É\u0085ßjôOÔ4ç\u0019ÏþÒãèÈò\u00adü\u0092èwúà\u0001\u0004Ó)ÍNÙsÍ\u0098ú½Ã¢ñÇììÓ\u0011æ6à[à@\u0093e¡\u008a\u0091¯\u0098Ô\u0091\u001cöø(Õ ²6\u008f/d5A'^$;\u000e\u0010\u0010í\u0010Ê\b§\u0016¼I\u0099ivFSf(h\u0005p\u0000Nä\u009aÉ\u0082®\u0098\u0093\u009ax\u0082]£B¹'\u008e\fºñ«Ö¾»\u008c Ð\u0085ÖjÑOÕ4Ù\u0006\u0013âÏÏØ¨Î\u0095Ä~Ó[ÙDë!Ì\nè÷àÐú½è¦\u0080\u0083¡l\u008bI¦2\u0098\u001f\u008fø\u008få£Î£«\u00ad\u0094¥\u0000Nä\u009aÉ\u0082®\u0098\u0093\u009ax\u0082]£B¹'\u0099\f·ñ¯Ö¹»° Ú\u0085ÈjüOÞ4ß\u0019ÃþÓãúÈö\u00adñ\u0092è\u001a þôÓì´ö\u0089ôbìGÍX×=ò\u0016ÜëÔÌÆ¡ãº¿\u009f p¾U¬.£\u0003©ä¬ù\u0097\u0000Nä\u009aÉ\u0082®\u0098\u0093\u009ax\u0082]£B¹'\u0091\f½ñºÖ¬»¶ Þ\u0085ÙjÁOÙ4Ä\u0019ÈþíãõÈä\u00adæ\u0092èwæ\\æA\fl\u0096\u0088B¥ZÂ@ÿB\u0014Z1{.aKI`e\u009dbºt×nÌ\u0001é\u0003\u0006\u000e#\r§íC9n!\t;49ß!ú\u0000å\u001a\u00807«\u001fV\fq\u000e\u001c+\u0007u\"jÍbèv\u0093f¾`Yp\u0000Nä\u009aÉ\u0082®\u0098\u0093\u009ax\u0082]£B¹'\u008b\f¾ñ¯Öº»¬ ó\u0085ÓjÆOÄ4Î\u0019ÈþÄãî\u0000Nä\u009aÉ\u0082®\u0098\u0093\u009ax\u0082]£B¹'\u008e\fºñ«Ö¾»\u0086 Ö\u0085ÔjÑOÕ4Ù\u0019ïþÏãèÈò\u00adà\u0092ëwé\\àA\u001b6nÒ°ÿ\u009d\u0098¿¥·N©\u0000Lä\u009eÉ\u0080®\u0094\u0093\u0080x·]\u008eB¼'¡\f\u0092ñªÖ\u0080»ª Ù\u0085ÕÞf:´\u0017ªp¾Mª¦\u009d\u0083¤\u009c\u0096ù\u008bÒ»/\u0085\b\u008de\u0080~ð[â´Þ\u0091þê×Çå î=Á\u0000cä\u0094É\u009b®ß\u0093\u0099x\u0089]\u008bB©'¡\fàñªÖç»© Ú\u0085ÞjÜOÑ4ß\u0019ÏþÎãòÈ¹\u00adð\u0092ìwæ\\íA\u001b&\u000b\u000bZð#Õ\u000fº\u0013\u009f\u0005\u00847i\u0006N=3-\u0018>ý\u0000â\\ÇV¬]\u0091Kv[[e@{%L\n|ïuÔ|\u0000Lä\u009eÉ\u0080®\u0094\u0093\u0080x·]\u008eB¼'¡\f\u0091ñ¯Ö§»ª Ú\u0085ÈjôOÔ4ý\u0019ÏþÄãëÈÛ\u00adû\u0092þwü\\æA\u0010&\u001c\u000b\u0006\u0000Iä\u0089É\u0099®\u009f\u0093¿x\u0088]\u0097B¯'»\f¶ñ\u008fÖ\u00ad»· ù\u0085ÕjÇOÝ4Ê\u0019Ò39×áúã\u009dä òKînØqÂ\u0014ê?ÆÂÓåÝ°éT1y3\u001e4#\"È>í\bò\u0012\u0097!¼\u001dA\u0014f\u0017\u000b\n\u0010g5e\u0000Bä\u009aÉ\u0098®\u009f\u0093\u0089x\u0095]£B¹'\u008e\fºñ«Ö¾\u0000cä\u0094É\u009b®ß\u0093\u0099x\u0089]\u008bB©'¡\fàñªÖç»\u00ad Í\u0085ÕjÛOÃ4Ä\u0019ÓþÓãÿÈò\u00adó\u0092éwû\\\u00adA\u001c&\u0018\u000b\u001að\u0001Õ\u000fº\u0017\u009fN\u0084\u0019i7N?3\"\u0018\"ý0â|Ç\\¬e\u0091GvL[S\u001a:þâÓà´ç\u0089ñbíGÛXÁ=ö\u0016ÂëÓÌÆ¡ðº®\u009f±p¹U\u00ad.½\u0003»ä«\u0000Iä\u0095É\u0082®\u0094\u0093\u009ex\u0094]\u0096B´'¬\fºñ¯Ö¥»\u0085 Û\u0000Iä\u0095É\u0082®\u0094\u0093\u009ex\u0094]\u0096B´'¬\fºñ¯Ö¥»\u0085 Û\u0085ójÛOÖ4Ä\u0000Iä\u0095É\u0082®\u0094\u0093\u009ex\u0094]\u0096B´'¬\fºñ¯Ö¥»\u0085 Û\u0085öjÜOÃ4ß\u0019ÃþÏãùÈå\u0000Iä\u0095É\u0082®\u0094\u0093\u009ex\u0094]\u0096B´'¬\fºñ¯Ö¥»\u0085 Û\u0085èjÐOÁ4Þ\u0019ÃþÒãè\u0000Rä\u009eÉ\u0081®\u0090\u0093\u009ex\u0083]\u0087B¹'\u0099\f·\u0000Rä\u009eÉ\u0081®\u0090\u0093\u009ex\u0083]\u0087B¹'\u0099\f·ñ\u0087Ö§»¢ Ð\u0000Rä\u009eÉ\u0081®\u0090\u0093\u009ex\u0083]\u0087B¹'\u0099\f·ñ\u0082Ö »· Ë\u0085ßjÛOÕ4Ù\u0000Rä\u009eÉ\u0081®\u0090\u0093\u009ex\u0083]\u0087B¹'\u0099\f·ñ\u009cÖ¬»µ Ê\u0085ßjÆOÄ±'Uõxë\u001fÿ\"ëÉÜìåó×\u0096Ê½ñ@ËgÖ\nÊ\u0011¦4¢Ûªþ²\u0085´¨¤O«R\u009by½\u001c\u009d\u0000Lä\u009eÉ\u0080®\u0094\u0093\u0080x·]\u008eB¼'¡\f\u009añ Ö½»¡ Í\u0085ÉjÁOÙ4ß\u0019ÏþÀãðÈÖ\u00adö\u0092Áwá\\ðA\n&\u001c\u000b\u001að\nÕ\u0018\u0000Lä\u009eÉ\u0080®\u0094\u0093\u0080x·]\u008eB¼'¡\f\u0081ñ«Ö¾»¥ Í\u0085ÞjÐOÔ4ê\u0019Â\u0000Lä\u009eÉ\u0080®\u0094\u0093\u0080x·]\u008eB¼'¡\f\u0081ñ«Ö¾»¥ Í\u0085ÞjÐOÔ4ê\u0019ÂþíãõÈä\u00adæ\u0092èwæ\\æA\fÓ\u00967D\u001aZ}N@Z«m\u008eT\u0091fô{ß[\"q\u0005dh\u007fs\u0017V\u0004m\u0091\u0089h¤tÃWþv\u0015p0w/NJCa@\u009cV»KÖ|Í(è!\u0007&\u0000gä\u009eÉ\u0082®³\u0093\u008dx\u0089]\u008cB¸'ª\f\u009fñ¯Ö°»« Ê\u0085ÎjåOÜ4Ê\u0019ÅþÄãñÈò\u00adü\u0092ùwÆ\\âA\u0013&\u001c±7UÎxÒ\u001fè\"ÑÉÇìÀóè\u0096û½ð@÷gö\nú\u0011«4\u008bÛ\u0091þ\u0081\u0085±¨\u0085O\u009eR¢¾ÜZ\"w/\u0010\u0005-<Æ*ã-ü\u0005\u0099\u0016²\u001dO\u001ah\u001b\u0005\u0017\u001eF;fÔ|ñl\u008aZ§r@o]UvO\u0013A,UÉG\u0005Zá¶Ì³«¶\u0096²}ªX\u0083G\u0098\"\u0080\t\u0089ô\u0083Ó\u0092¾\u009f¥þ\u0080ýoóJÜ1â\u001cúûèæøÍÖ¨É\u0097ÑrÅYÅD3##gÚ\u00837®+É\u0016ô$\u001f::\"%\u0002@\u0014k;\u0096\u0003±,Ü\u0004Çeâg\ry(wSg~}¢MF´k¨\f\u00881£Ú¿ÿ¾à\u0092\u0085\u0080®½S\u0085t\u0097\u0019\u008f".getBytes(CharEncoding.ISO_8859_1)).asCharBuffer().get(cArr, 0, cs.a.INSTANCE_NOT_FOUND_IN_SHOW);
        f1055 = cArr;
        f1054 = 3792223598373692667L;
    }

    public bv(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1205(ImpressionDataListener impressionDataListener) {
        f1053 = (f1052 + 75) % 128;
        m1219(impressionDataListener);
        f1053 = (f1052 + 27) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1206(AdData adData) {
        f1053 = (f1052 + 91) % 128;
        String strM1213 = m1213(adData);
        int i2 = f1053 + 77;
        f1052 = i2 % 128;
        if (i2 % 2 == 0) {
            return strM1213;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1210(IronSourceBannerLayout ironSourceBannerLayout) {
        int i2 = f1052 + 115;
        f1053 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1217(ironSourceBannerLayout);
        }
        m1217(ironSourceBannerLayout);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m1216(ImpressionDataListener impressionDataListener) {
        f1052 = (f1053 + 45) % 128;
        m1212(impressionDataListener);
        f1053 = (f1052 + 119) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1218(Placement placement) {
        int i2 = f1053 + 75;
        f1052 = i2 % 128;
        int i3 = i2 % 2;
        String strM1211 = m1211(placement);
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        f1052 = (f1053 + 37) % 128;
        return strM1211;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1207(ImpressionData impressionData) {
        f1053 = (f1052 + 75) % 128;
        JSONObject jSONObjectM1214 = m1214(impressionData);
        int i2 = f1052 + 3;
        f1053 = i2 % 128;
        if (i2 % 2 != 0) {
            return jSONObjectM1214;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static JSONObject m1214(ImpressionData impressionData) {
        int i2 = f1053 + 105;
        f1052 = i2 % 128;
        if (i2 % 2 != 0) {
            impressionData.getAllData();
            throw null;
        }
        JSONObject allData = impressionData.getAllData();
        int i3 = f1053 + 67;
        f1052 = i3 % 128;
        if (i3 % 2 == 0) {
            return allData;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0650  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        byte b2 = 1;
        switch (str.hashCode()) {
            case -2063883567:
                if (!str.equals(m1209(18 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, (char) (Color.rgb(0, 0, 0) + 16834637)).intern())) {
                    b2 = -1;
                } else {
                    f1053 = (f1052 + 93) % 128;
                    b2 = 26;
                }
                break;
            case -2054763962:
                if (!str.equals(m1209(25 - Gravity.getAbsoluteGravity(0, 0), 602 - ImageFormat.getBitsPerPixel(0), (char) (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    f1053 = (f1052 + 109) % 128;
                    b2 = 25;
                }
                break;
            case -2044561387:
                b2 = !str.equals(m1209(21 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 731, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6765)).intern()) ? (byte) -1 : (byte) 31;
                break;
            case -2012752057:
                b2 = !str.equals(m1209(23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1242 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 45418)).intern()) ? (byte) -1 : (byte) 56;
                break;
            case -1879025222:
                b2 = !str.equals(m1209(9 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 369 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 24232)).intern()) ? (byte) -1 : (byte) 15;
                break;
            case -1810844504:
                b2 = !str.equals(m1209((ViewConfiguration.getEdgeSlop() >> 16) + 20, ExpandableListView.getPackedPositionType(0L) + 1088, (char) (Color.red(0) + 6776)).intern()) ? (byte) -1 : (byte) 47;
                break;
            case -1704786309:
                b2 = !str.equals(m1209(20 - (ViewConfiguration.getTapTimeout() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 91, (char) (Color.argb(0, 0, 0, 0) + 14518)).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -1678289205:
                b2 = !str.equals(m1209(48 - (ViewConfiguration.getTapTimeout() >> 16), 41 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (KeyEvent.getMaxKeyCode() >> 16)).intern()) ? (byte) -1 : (byte) 3;
                break;
            case -1555060867:
                b2 = !str.equals(m1209(27 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1315 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 59;
                break;
            case -1406023077:
                b2 = !str.equals(m1209(Drawable.resolveOpacity(0, 0) + 50, 110 - (Process.myPid() >> 22), (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern()) ? (byte) -1 : (byte) 5;
                break;
            case -1323215337:
                b2 = !str.equals(m1209(12 - (ViewConfiguration.getPressedStateDuration() >> 16), 292 - Gravity.getAbsoluteGravity(0, 0), (char) (Color.blue(0) + 8837)).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -1282106699:
                b2 = !str.equals(m1209((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 50, 906 - Color.red(0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1)).intern()) ? (byte) -1 : (byte) 40;
                break;
            case -1276273849:
                if (!str.equals(m1209(21 - TextUtils.indexOf((CharSequence) "", '0', 0), 346 - TextUtils.indexOf((CharSequence) "", '0'), (char) (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                    b2 = -1;
                } else {
                    f1053 = (f1052 + 87) % 128;
                }
                break;
            case -1115843213:
                b2 = !str.equals(m1209(View.getDefaultSize(0, 0) + 14, 333 - Color.red(0), (char) (51225 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 13;
                break;
            case -1088585376:
                b2 = !str.equals(m1209(29 - TextUtils.getTrimmedLength(""), Process.getGidForName("") + 957, (char) ('0' - AndroidCharacter.getMirror('0'))).intern()) ? (byte) -1 : (byte) 41;
                break;
            case -989825485:
                b2 = !str.equals(m1209(19 - Color.green(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 645, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7352)).intern()) ? (byte) -1 : (byte) 27;
                break;
            case -838208757:
                b2 = !str.equals(m1209(TextUtils.indexOf("", "", 0, 0) + 18, View.MeasureSpec.makeMeasureSpec(0, 0) + 665, (char) KeyEvent.getDeadChar(0, 0)).intern()) ? (byte) -1 : (byte) 28;
                break;
            case -643050252:
                if (!str.equals(m1209(45 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 174, (char) (7753 - TextUtils.indexOf("", "", 0, 0))).intern())) {
                    b2 = -1;
                } else {
                    f1053 = (f1052 + 23) % 128;
                    b2 = 7;
                }
                break;
            case -609786639:
                if (!str.equals(m1209(9 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 1184, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    b2 = 52;
                }
                break;
            case -559540471:
                b2 = !str.equals(m1209(View.combineMeasuredStates(0, 0) + 30, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 500, (char) ((Process.myTid() >> 22) + 40778)).intern()) ? (byte) -1 : (byte) 20;
                break;
            case -498709917:
                b2 = !str.equals(m1209(23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1140 - Color.argb(0, 0, 0, 0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 50;
                break;
            case -498060603:
                if (!str.equals(m1209(ImageFormat.getBitsPerPixel(0) + 10, 14 - ImageFormat.getBitsPerPixel(0), (char) (ExpandableListView.getPackedPositionChild(0L) + 1)).intern())) {
                    b2 = -1;
                }
                break;
            case -393802555:
                if (!str.equals(m1209((ViewConfiguration.getKeyRepeatDelay() >> 16) + 18, 1206 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                    b2 = -1;
                } else {
                    int i2 = f1053 + 13;
                    f1052 = i2 % 128;
                    if (i2 % 2 == 0) {
                        b2 = 54;
                    } else {
                        b2 = 52;
                    }
                }
                break;
            case -284636416:
                if (!str.equals(m1209(TextUtils.indexOf((CharSequence) "", '0', 0) + 16, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + f9.f24993l, (char) (45226 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern())) {
                    b2 = -1;
                } else {
                    f1053 = (f1052 + 17) % 128;
                    b2 = 44;
                }
                break;
            case -154075626:
                b2 = !str.equals(m1209((ViewConfiguration.getTapTimeout() >> 16) + 21, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 816, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 35;
                break;
            case -153002112:
                b2 = !str.equals(m1209((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 44, View.resolveSizeAndState(0, 0, 0) + IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED, (char) (TextUtils.lastIndexOf("", '0') + 1)).intern()) ? (byte) -1 : (byte) 46;
                break;
            case 30304559:
                b2 = !str.equals(m1209(35 - ImageFormat.getBitsPerPixel(0), 531 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 35653)).intern()) ? (byte) -1 : (byte) 21;
                break;
            case 85893348:
                b2 = !str.equals(m1209(19 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 985, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 42;
                break;
            case 149942051:
                b2 = !str.equals(m1209((ViewConfiguration.getScrollBarSize() >> 8) + 10, TextUtils.indexOf((CharSequence) "", '0') + 324, (char) (ViewConfiguration.getEdgeSlop() >> 16)).intern()) ? (byte) -1 : (byte) 12;
                break;
            case 204617641:
                b2 = !str.equals(m1209(View.resolveSizeAndState(0, 0, 0) + 19, 1296 - ExpandableListView.getPackedPositionType(0L), (char) Drawable.resolveOpacity(0, 0)).intern()) ? (byte) -1 : (byte) 58;
                break;
            case 204897024:
                b2 = !str.equals(m1209(22 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.getTrimmedLength("") + e.a.ERROR_INSTANCE_LOAD_EMPTY_SERVER_DATA, (char) TextUtils.getTrimmedLength("")).intern()) ? (byte) -1 : (byte) 51;
                break;
            case 307677661:
                b2 = !str.equals(m1209(TextUtils.getCapsMode("", 0, 0) + 12, Gravity.getAbsoluteGravity(0, 0) + 1004, (char) (13179 - (Process.myPid() >> 22))).intern()) ? (byte) -1 : (byte) 43;
                break;
            case 308060116:
                b2 = !str.equals(m1209(12 - TextUtils.indexOf("", "", 0), 1030 - Process.getGidForName(""), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1)).intern()) ? (byte) -1 : (byte) 45;
                break;
            case 320151695:
                b2 = !str.equals(m1209(14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1108 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (AndroidCharacter.getMirror('0') - '0')).intern()) ? (byte) -1 : (byte) 48;
                break;
            case 334118616:
                b2 = !str.equals(m1209(23 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getJumpTapTimeout() >> 16) + 409, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0))).intern()) ? (byte) -1 : (byte) 17;
                break;
            case 663296747:
                b2 = !str.equals(m1209((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 17, 24 - (KeyEvent.getMaxKeyCode() >> 16), (char) ('0' - AndroidCharacter.getMirror('0'))).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 766880816:
                if (!str.equals(m1209(28 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 837, (char) (Color.rgb(0, 0, 0) + 16777216)).intern())) {
                    b2 = -1;
                } else {
                    int i3 = f1052 + 33;
                    f1053 = i3 % 128;
                    b2 = i3 % 2 != 0 ? (byte) 36 : (byte) 14;
                }
                break;
            case 779287609:
                b2 = !str.equals(m1209(Color.green(0) + 22, 220 - TextUtils.indexOf("", "", 0), (char) (Color.blue(0) + 46323)).intern()) ? (byte) -1 : (byte) 8;
                break;
            case 823061407:
                b2 = !str.equals(m1209(17 - TextUtils.getTrimmedLength(""), 778 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27865)).intern()) ? (byte) -1 : (byte) 33;
                break;
            case 894546539:
                b2 = !str.equals(m1209(24 - TextUtils.indexOf("", "", 0, 0), ExpandableListView.getPackedPositionChild(0L) + 684, (char) (1626 - (ViewConfiguration.getScrollBarSize() >> 8))).intern()) ? (byte) -1 : (byte) 29;
                break;
            case 1052532031:
                b2 = !str.equals(m1209(14 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1193 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 53;
                break;
            case 1069602180:
                b2 = !str.equals(m1209((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + IronSourceError.ERROR_NT_INSTANCE_INIT_TIMEOUT, (char) KeyEvent.normalizeMetaState(0)).intern()) ? (byte) -1 : (byte) 30;
                break;
            case 1081984916:
                b2 = !str.equals(m1209(20 - ExpandableListView.getPackedPositionType(0L), View.getDefaultSize(0, 0) + 796, (char) (42914 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern()) ? (byte) -1 : (byte) 34;
                break;
            case 1180349927:
                b2 = !str.equals(m1209(50 - (Process.myPid() >> 22), 241 - TextUtils.lastIndexOf("", '0', 0), (char) (9342 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 9;
                break;
            case 1226831433:
                b2 = !str.equals(m1209(KeyEvent.normalizeMetaState(0) + 15, TextUtils.getOffsetBefore("", 0) + 870, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern()) ? (byte) -1 : (byte) 38;
                break;
            case 1266525324:
                b2 = !str.equals(m1209(22 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 885, (char) (56873 - TextUtils.indexOf((CharSequence) "", '0', 0))).intern()) ? (byte) -1 : (byte) 39;
                break;
            case 1267145181:
                b2 = !str.equals(m1209(Gravity.getAbsoluteGravity(0, 0) + 18, 1121 - Process.getGidForName(""), (char) (KeyEvent.getMaxKeyCode() >> 16)).intern()) ? (byte) -1 : (byte) 49;
                break;
            case 1304950957:
                b2 = !str.equals(m1209((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15, ViewConfiguration.getScrollDefaultDelay() >> 16, (char) (MotionEvent.axisFromString("") + 1)).intern()) ? (byte) -1 : (byte) 0;
                break;
            case 1432059210:
                b2 = !str.equals(m1209((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 39, 461 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (27982 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 19;
                break;
            case 1517126868:
                b2 = !str.equals(m1209(Color.argb(0, 0, 0, 0) + 15, View.combineMeasuredStates(0, 0) + 160, (char) TextUtils.indexOf("", "", 0, 0)).intern()) ? (byte) -1 : (byte) 6;
                break;
            case 1628896204:
                b2 = !str.equals(m1209((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27, 752 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 32;
                break;
            case 1715808775:
                if (!str.equals(m1209(15 - View.MeasureSpec.getSize(0), 1342 - (ViewConfiguration.getTouchSlop() >> 8), (char) (KeyEvent.getDeadChar(0, 0) + 54234)).intern())) {
                    b2 = -1;
                } else {
                    f1052 = (f1053 + 77) % 128;
                    b2 = 60;
                }
                break;
            case 1773831812:
                b2 = !str.equals(m1209(14 - (ViewConfiguration.getLongPressTimeout() >> 16), 589 - Color.argb(0, 0, 0, 0), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern()) ? (byte) -1 : (byte) 24;
                break;
            case 1870849118:
                b2 = !str.equals(m1209(View.resolveSize(0, 0) + 17, 1224 - TextUtils.lastIndexOf("", '0', 0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0))).intern()) ? (byte) -1 : (byte) 55;
                break;
            case 1910059890:
                b2 = !str.equals(m1209(17 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 572 - View.getDefaultSize(0, 0), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 20574)).intern()) ? (byte) -1 : (byte) 23;
                break;
            case 1910219460:
                b2 = !str.equals(m1209(19 - TextUtils.indexOf("", "", 0, 0), 304 - KeyEvent.getDeadChar(0, 0), (char) (18009 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern()) ? (byte) -1 : (byte) 11;
                break;
            case 1955369613:
                if (!str.equals(m1209(6 - TextUtils.getOffsetAfter("", 0), 864 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (13871 - Gravity.getAbsoluteGravity(0, 0))).intern())) {
                    b2 = -1;
                } else {
                    f1052 = (f1053 + 121) % 128;
                    b2 = 37;
                }
                break;
            case 1955530641:
                b2 = !str.equals(m1209((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 5, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 566, (char) (29848 - (ViewConfiguration.getFadingEdgeLength() >> 16))).intern()) ? (byte) -1 : (byte) 22;
                break;
            case 2019413793:
                if (!str.equals(m1209((ViewConfiguration.getScrollDefaultDelay() >> 16) + 31, 378 - ExpandableListView.getPackedPositionGroup(0L), (char) (54235 - ExpandableListView.getPackedPositionChild(0L))).intern())) {
                    b2 = -1;
                } else {
                    f1052 = (f1053 + 7) % 128;
                    b2 = 16;
                }
                break;
            case 2019599576:
                b2 = !str.equals(m1209(TextUtils.indexOf("", "") + 29, 432 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1)).intern()) ? (byte) -1 : (byte) 18;
                break;
            case 2102577435:
                b2 = !str.equals(m1209((KeyEvent.getMaxKeyCode() >> 16) + 31, (Process.myPid() >> 22) + 1265, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 57;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return AbstractAdapter.class;
            case 1:
                return Placement.class;
            case 2:
            case 3:
                return ControllerActivity.class;
            case 4:
            case 5:
                return InterstitialActivity.class;
            case 6:
            case 7:
                return OpenUrlActivity.class;
            case 8:
            case 9:
                return IronSourceBannerLayout.class;
            case 10:
                return ISBannerSize.class;
            case 11:
                return BannerSmashListener.class;
            case 12:
                return IronSource.class;
            case 13:
                return ImpressionData.class;
            case 14:
                return ImpressionDataListener.class;
            case 15:
            case 16:
                return DTBAdView.class;
            case 17:
                return LevelPlayBannerListener.class;
            case 18:
                return LevelPlayInterstitialListener.class;
            case 19:
                return LevelPlayRewardedVideoAutomaticListener.class;
            case 20:
                return LevelPlayRewardedVideoListener.class;
            case 21:
                return LevelPlayRewardedVideoManualListener.class;
            case 22:
                return AdInfo.class;
            case 23:
                return LevelPlayNativeAd.class;
            case 24:
                return NativeAdLayout.class;
            case 25:
                return LevelPlayNativeAdListener.class;
            case 26:
                return LevelPlayMediaView.class;
            case 27:
                return AdapterNativeAdData.class;
            case 28:
                return NativeAdViewHolder.class;
            case 29:
                return InternalNativeAdListener.class;
            case 30:
                return NativeAdAdapterInterface.class;
            case 31:
                return NativeAdDataInterface.class;
            case 32:
                return NativeAdInteractionListener.class;
            case 33:
                return NativeAdInterface.class;
            case 34:
                return NativeAdLoadListener.class;
            case 35:
                return NativeAdSmashListener.class;
            case 36:
                return NativeAdViewBinderInterface.class;
            case 37:
                return AdData.class;
            case 38:
                return LevelPlayAdInfo.class;
            case 39:
            case 40:
                return LevelPlayBannerAdView.class;
            case 41:
                return LevelPlayBannerAdViewListener.class;
            case 42:
                return IronSourceAds.AdFormat.class;
            case 43:
                return BannerAdInfo.class;
            case 44:
                return BannerAdRequest.class;
            case 45:
            case 46:
                return BannerAdView.class;
            case 47:
                return BannerAdViewListener.class;
            case 48:
                return InterstitialAd.class;
            case 49:
                return InterstitialAdInfo.class;
            case 50:
                return InterstitialAdListener.class;
            case AD_REWARD_USER_VALUE:
                return InterstitialAdRequest.class;
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                return RewardedAd.class;
            case 53:
                return RewardedAdInfo.class;
            case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                return RewardedAdListener.class;
            case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                return RewardedAdRequest.class;
            case 56:
                return LevelPlayInterstitialAd.class;
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                return LevelPlayInterstitialAdListener.class;
            case 58:
                return LevelPlayRewardedAd.class;
            case 59:
                return LevelPlayRewardedAdListener.class;
            case 60:
                return LevelPlayReward.class;
            default:
                return null;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        f1053 = (f1052 + 21) % 128;
        String sDKVersion = IronSourceUtils.getSDKVersion();
        f1052 = (f1053 + 111) % 128;
        return sDKVersion;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1208(LevelPlayNativeAd levelPlayNativeAd, LevelPlayNativeAdListener levelPlayNativeAdListener) {
        f1053 = (f1052 + 19) % 128;
        m1215(levelPlayNativeAd, levelPlayNativeAdListener);
        int i2 = f1052 + 29;
        f1053 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 48 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1215(LevelPlayNativeAd levelPlayNativeAd, LevelPlayNativeAdListener levelPlayNativeAdListener) {
        f1053 = (f1052 + 17) % 128;
        levelPlayNativeAd.setListener(levelPlayNativeAdListener);
        int i2 = f1052 + 9;
        f1053 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1217(IronSourceBannerLayout ironSourceBannerLayout) {
        f1053 = (f1052 + 67) % 128;
        String placementName = ironSourceBannerLayout.getPlacementName();
        f1053 = (f1052 + 101) % 128;
        return placementName;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1213(AdData adData) {
        int i2 = f1053 + 35;
        f1052 = i2 % 128;
        if (i2 % 2 != 0) {
            adData.getServerData();
            throw null;
        }
        String serverData = adData.getServerData();
        f1053 = (f1052 + 69) % 128;
        return serverData;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1219(ImpressionDataListener impressionDataListener) {
        f1052 = (f1053 + 91) % 128;
        IronSource.removeImpressionDataListener(impressionDataListener);
        int i2 = f1053 + 45;
        f1052 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 56 / 0;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m1209(16 - Gravity.getAbsoluteGravity(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1357, (char) (28150 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bv.m1218((Placement) list.get(0));
            }
        });
        map.put(m1209((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28, 1373 - (KeyEvent.getMaxKeyCode() >> 16), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bv.m1210((IronSourceBannerLayout) list.get(0));
            }
        });
        map.put(m1209(20 - TextUtils.lastIndexOf("", '0', 0, 0), 1402 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (KeyEvent.normalizeMetaState(0) + 45392)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bv.m1207((ImpressionData) list.get(0));
            }
        });
        map.put(m1209((ViewConfiguration.getKeyRepeatDelay() >> 16) + 25, 1470 - AndroidCharacter.getMirror('0'), (char) (48829 - TextUtils.getTrimmedLength(""))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bv.m1216((ImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m1209(TextUtils.getOffsetAfter("", 0) + 28, 1447 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (1320 - TextUtils.getOffsetBefore("", 0))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bv.m1205((ImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m1209(18 - ExpandableListView.getPackedPositionChild(0L), 1474 - TextUtils.indexOf((CharSequence) "", '0'), (char) (26538 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bv.m1208((LevelPlayNativeAd) list.get(0), (LevelPlayNativeAdListener) list.get(1));
                return null;
            }
        });
        map.put(m1209((ViewConfiguration.getKeyRepeatDelay() >> 16) + 13, 1494 - TextUtils.indexOf("", ""), (char) (41514 - TextUtils.getOffsetAfter("", 0))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bv.m1206((AdData) list.get(0));
            }
        });
        int i2 = f1053 + 1;
        f1052 = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1211(Placement placement) {
        int i2 = f1052 + 87;
        f1053 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (placement == null) {
            return null;
        }
        String placementName = placement.getPlacementName();
        f1053 = (f1052 + 105) % 128;
        return placementName;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1212(ImpressionDataListener impressionDataListener) {
        f1052 = (f1053 + 55) % 128;
        IronSource.addImpressionDataListener(impressionDataListener);
        f1052 = (f1053 + 121) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1209(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f1055[i3 + i4]) ^ (((long) i4) * f1054)) ^ ((long) c2));
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
