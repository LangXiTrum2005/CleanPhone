package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
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
import com.applovin.adview.AdViewController;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenThemedActivity;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.adview.AppLovinInterstitialActivity;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorEntity;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AdViewControllerImpl;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.mediation.MaxAdapterParametersImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.nativeAd.AppLovinMediaView;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.AppLovinMediationAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.adapters.MediationAdapterRouter;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class bj extends be {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f800 = null;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f801 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f802;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f803;

    static {
        char[] cArr = new char[2053];
        f2.v("\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l»\u009aáÈI\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l©\u009aáÿ²Ò\u001e¤¹whIè\u001b\u0094î4ÀÖ\u0093Ze\u00127\u0087\n%ÜÊ¯}\u0000c-ò[W\u0088ù¶\u0015äa\u0011Þ?'l\u0087\u009aóÈKõÑ#rP\u0098~ò¬EÙ¹\u0007\b5}b\u0089\u0090\u0005½\u0091ë\u000e\u0019WF×t#¡\u009bÏáým*\u00adX0\u0086j³ÅáJ\u0000A-ù[l\u0088¾¶\u0011äf\u0011í?$l\u0086\u009añÈPõÐ#0P\u0095~ó¬A\u00103=\u009fK8\u0098é¦iô\u0015\u0001µ/W|Ó\u008a\u0099Ø$å¨3\\@øn\u0090¼(ÉÖ\u0017v%\u0019r¹\u0080w\u00adðûx\t\u0000V¼dN±ôß\u0084\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l¡\u009aëÈVõÚ#.P\u008a~â¬ZÙ¤\u0007\u00045kbË\u0090\u0005½\u0085ë:\u0019rFÙt9¡\u009dÏè\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l©\u009aáÈaõÓ#5P\u009a~ý¬\u007fÙ¹\u0007\u001e5~bÂ\u0090*½\u0084ë\f\u0002\u008e/\"Y\u0085\u008aT´Ôæ¨\u0013\b=ênf\u0098.Ê©÷\u0019!àRF|5®\u009dÛf\u0005î7¬`\u001b\u0092ÿ¿Kéß\u001b±D\u0005P$}\u0088\u000b/Øþæ~´\u0002A¢o@<ÌÊ\u0084\u0098\u0015¥¿sN\u0000ý.\u0081ü2\u0089ùWae\u001c2¶ÀDíê»~I\fi\u000eD¢2\u0005áÔßT\u008d(x\u0088Vj\u0005æó®¡;\u009c\u0099Jw9Ó\u0017¶Å,°ónC\\<\u000b\u008aùjÔÍ\u0082Zp\u0018/\u009e\u001diÈÉ¦¥\u0094\rCã1[õÑØ}®Ú}\u000bC\u008b\u0011÷äWÊµ\u00999oq=á\u0000FÖ¶¥\f\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l©\u009aáÈvõÆ#,P\u009cl\u001bA·7\u0010äÁÚA\u0088=}\u009dS\u007f\u0000ûö±¤\u001b\u0099\u0080Oh<×\u0012¥À\u001fµãkMY5\u000e\u0099üWÑÕ\u0087Pu$*\u0090\u0018|ÍÜ£¼\u0091\u0002Fú4]ê5°÷\u009d[ëü8-\u0006\u00adTÑ¡q\u008f\u0093Ü\u0017*]xàEl\u0093\u0098à<ÎT\u001cìi\u0012·²\u0085ÝÒ} ³\r3\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l¿\u009aàÈ@õé#5P\u009c~á¬rÙ³\u0007\u00195cbÑ\u0090-½\u0095ë\u0007\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l©\u009aáÈqõÚ#.P\u008f~ÿ¬PÙµ\u0007$5gb×\u0090(X\u001eu²\u0003\u0015ÐÄîD¼8I\u0098gz4öÂ¾\u0090+\u00ad\u0089{f\bÑ&\u008cô\u001a\u0081ê_\\m!:´ÈråÍ³UA!\u001e\u0089,oùß\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l¾\u009aìÈFõÚ#3P¯~ÿ¬VÙ§\u0002®/\u0016Y\u0083\u008aQ´þæ\u0089\u0013\u0002=Ëni\u0098\u001eÊ¿÷?!ßRz|\u001c®®Ûv\u0005ï7\u0095`$íxÀÔ¶se¢[\"\t^üþÒ\u001c\u0081\u0090wØ%Y\u0018çÎ\u0016½¥\u0000M-ü[B\u0088\u0096¶\u0010äG\u0011Ç?.l\u009f\u0000M-ü[B\u0088\u009e¶\u001aäe\u0011Ë?9l\u009b\u009añÈKõË#5P\u0098~ú¬rÙ´\u0000M-ü[B\u0088\u0085¶\u0011äf\u0011Ï?9l\u008c\u009aàÈFõþ#8\u0000M-ü[B\u0088\u0096¶\u0010äG\u0011Ç?.l\u009f\u009aÌÈOõÏ#0\u0000M-ü[B\u0088\u0091¶\u0001ä}\u0011Â?8l\u008b\u009a÷ÈGõÚ#2P¸~ò¬zÙ½\u0007\u001d5f\u0000M-ü[B\u0088\u0096¶\u0010äp\u0011Þ??l\u008d\u009a÷ÈrõÞ#.P\u0098~û¬VÙ¤\u0007\b5xbÔ\u0090\r½\u008cë\u000e\u0019w&Ò\u000bg}Á®!\u0090\u008aÂú7X\u0019»J\u0019¼IîØÓR\u0005µv\u000fXj\u008aÉÿ\u0006!\u009f\u0013åDT\u0000M-ü[B\u0088\u0096¶\u0010äp\u0011Þ??l\u008d\u009a÷\u0090þ½OËñ\u0018%&£\u0000M-ü[B\u0088\u0096¶\u0010äW\u0011Á?9l\u0085\u009aäÈV¿_\u0092îäP7\u0084\t\u0002[O®Õ\u0080*Ó\u008e%òw^JÈ\u009c<ädÉÕ¿kl¿R9\u0000nõîÛ\u0007\u0088¶~í,o\u0011ÚÇ\u001c´£\u009aËH\u007f=\u0097ã!ÑQ\u0007é*X\\æ\u008f!±µãÂ\u0016k8\u009dk(\u000b¾&\u000fP±\u0083v½âï\u0095\u001a<4Êg\u007f\u0091\u0013Ãµþ\r(Ë[Fu\f§³ÒW\fû>\u0097i1\u009bÅ\u0000M-ø[^\u0088¾¶\u0015äe\u0011Ç?$l\u0086\u009aÄÈFõÞ#,P\u008d~ó¬AÙ\u0092\u0007\f5ybÂ\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l¥\u009aàÈFõÖ#=P\u008d~ÿ¬\\Ù¾\u0007,5nbÆ\u00904½\u0095ë\u001b\u0019iÄcéÖ\u009fpL\u0090r; KÕéû\n¨¨^ê\fh1ðç\u0002\u0094£ºÝho\u001d¬Ã,ñQ¦ýT\u000fy½\u0095e¸ÔÎj\u001d¾#8qo\u0084ïª\u0006ù·\u000fì]n`ö¶\u0004Å¥ëÛ9i\u0000M-ü[B\u0088\u009e¶\u001aäe\u0011Ë?9l\u009b\u009añÈKõË#5P\u0098~ú¬rÙ´\u0007\f5zbÓ\u0090!½\u0093\u0000M-ü[B\u0088\u0085¶\u0011äf\u0011Ï?9l\u008c\u009aàÈFõþ#8P\u0098~æ¬GÙµ\u0007\u001f\u0000M-ü[B\u0088\u0084¶\u001däv\u0011À?*l\u0084\u009aÕÈPõÐ#*P\u0090~ò¬VÙ¢\u0000M-ü[B\u0088\u0096¶\u0010äp\u0011Þ??l\u008d\u009a÷ÈrõÞ#.P\u0098~û¬VÙ¤\u0007\b5xbÔì\u0084Á5·\u008bd_ZÙ\b¹ý\u0017Óö\u0080Dv>$¹\u0019\u0013Ïæ¼@\u00920@\u00945jëÁÙ\u0093\u008e\u000f|ÿQI\u0007Úõ·ª\u0005\u0098ùMI#5\u0000M-ü[B\u0088\u0096¶\u0010äp\u0011Þ??l\u008d\u009a÷ÈqõÖ#;P\u0097~÷¬_Ù\u0093\u0007\u00025fbË\u0090!½\u0082ë\n\u0019rF×t;¡¢Ïîý^*¨X\u000b\u0086f³ÔáX\u000e¨<\u0004â4Ï\u0085¹;jïTi\u0006\tó§ÝF\u008eôx\u008e*\u0012\u0017¨ÁL²ô\u009c\u0086N+;Åå}×\t\u0080¿rI_ñ\thû\f¤\u0091\u0096MCù-\u0097\u001f8ÈÕºkd\u001fQ«\u00037\u0000M-ü[B\u0088\u0096¶\u0010äp\u0011Þ??l\u008d\u009a÷ÈnõÖ#/P\u008d~ó¬]Ùµ\u0007\u001f\u0000M-ü[B\u0088\u0096¶\u0010äG\u0011Ç?.l\u009f\u009aÄÈFõÞ#,P\u008d~ó¬AÙ\u009c\u0007\u00045ybÓ\u0090!½\u008fë\u001b\u0019i\u0000M-ü[B\u0088\u009e¶\u001aäe\u0011Ë?9l\u009b\u009añÈKõË#5P\u0098~ú¬rÙ´\u0007\f5zbÓ\u0090!½\u0093ë2\u0019rFËt!¡\u0097ÏáýI*»\u0000M-ü[B\u0088\u0085¶\u0011äf\u0011Ï?9l\u008c\u009aàÈFõþ#8P\u0098~æ¬GÙµ\u0007\u001f5FbÎ\u00907½\u0095ë\u001b\u0019uFÝt'\u0000M-ü[B\u0088\u0084¶\u001däv\u0011À?*l\u0084\u009aÆÈMõÓ#0P\u009c~õ¬GÙ¹\u0007\u00025dbë\u0090-½\u0092ë\n\u0019~FÖt0¡\u0080ÅkèÚ\u009edM´s !EÔçú\u001fW|zÐ\fwß¦á&³ZFúh\u0018;\u0097ÍÊ\u009fp¢ãt\u0005\u0007§)Êû}\u008e\u0099P\u001dbV5ôÇ\u0018ê»¼&NT\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%lª\u009a÷ÈMõÞ#8P\u009a~÷¬@Ù¤\u0007 5kbÉ\u0090%½\u0086ë\u001b\u0019iFêt0¡\u0091ÏêýE*¿X\u0003\u0086q\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l«\u009aêÈOõÒ#)P\u0097~ÿ¬PÙ±\u0007\u00195ebÕ\u0090\t½\u0084ë\r\u0019hFÙt2¡\u0097¢B\u008fóùV*»\u0014\u0000F~³Æ\u009d)Î\u00888ðjLWÌ\u0081\u0010ò\u009dÜä\u000eA{°¥\u000b\u0097nÀï2(\u001f\u0090I\u0013\u0080Í\u00adaÛÆ\b\u00176\u0097dë\u0091K¿©ì'\u001afHÃu^£¥Ð\u001bþs,ÜY=\u0087\u0095µéâYÂÆïj\u0099ÍJ\u001ct\u009c&àÓ@ý¢®,Xm\nÈ7Uá®\u0092\u0010¼xn×\u001b6Å\u009e÷â RR\u0090\u007f\u0013)\u009bÛï\u0084\\¶ c\u001c\rj?Îè<\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l«\u009aêÈOõÒ#)P\u0097~ÿ¬PÙ±\u0007\u00195ebÕ\u0090\u0014½\u0094ë\u001c\u0019wFÑt&¡\u009aÏêý^wyZÕ,rÿ£Á#\u0093_fÿH\u001d\u001b\u0093íÒ¿w\u0082êT\u0011'¯\tÇÛh®\u0089p!B]\u0015íç1Ê¼\u009c5nP1á\u0003\nÖ£¸Ù\u008as]¢/;ñIÄî\u0096ly\u0081K*\u0091P¼üÊ[\u0019\u008a'\nuv\u0080Ö®4ýº\u000bûY^dÃ²8Á\u0086ïî=AH \u0096\b¤tóÄ\u0001\u0010,\u009ez\u001b\u0088c×Ýå=\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l®\u009aðÈNõÓ#/P\u009a~ä¬VÙµ\u0007\u00035^bÏ\u0090!½\u008cë\u001b\u0019\u007fFùt6¡\u0086ÏæýZ* X\u0012\u0086z\u0000c-ò[W\u0088ù¶\u0015äa\u0011Þ?'l\u0087\u009aóÈKõÑ#rP\u0098~ò¬EÙ¹\u0007\b5}b\u0089\u0090\u0005½\u0091ë\u000e\u0019WF×t#¡\u009bÏáýj*¼X\n\u0086o³Óá^\u000e¨<\u0012jq\u0097ßÅ\u001aò\u0083 íNH{§©;Ö½\u0004ú2B_º\u008d\u0006»dèÞ\u0016>\u0001\u009a,+Z\u0095\u0089N·Âå²\u0010\u0010>êmZ\u009b\u0013É\u0091¨Ä\u0085uóË \u0010\u001e\u009cLì¹N\u0097´Ä\u00042M`Ï]z\u008b¼ø\u0003Ök\u0004ßq7¯\u0081\u009dñ\u0000M-ü[B\u0088\u0099¶\u0015äe\u0011Ç?=l\u008d\u009aÄÈFõó#3P\u0098~ò¬VÙ¢Æ.ë\u009f\u009d!Núpv\"\u0006×¤ù^ªî\\§\u000e%3\u0095åR\u0096ê¸\u0099\rx ÉVw\u0085¬» éP\u001cò2\ba¸\u0097ñÅsøÜ.\u0000]©sÔ\u0000c-ò[W\u0088ù¶\u0015äa\u0011Þ?'l\u0087\u009aóÈKõÑ#rP\u0094~ó¬WÙ¹\u0007\f5~bÎ\u0090+½\u008fëP\u0019uFÙt!¡\u009bÏùýI*\u0088X\u0002\u0086p³\u008eáp\u000e»<\u000fjZ\u0097ÐÅ:ò\u0082 þN@{\u0083©;Öª\u0004ð2S_¤\u0012¤?\u0015I«\u009ap¤üö\u008c\u0003.-Ô~d\u0088-Ú¯ç\u00001ÜBul\b¾\u0098ËP\u0015ê'\u0087p+\u0082ß\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l¦\u009aäÈVõÖ#*P\u009c~×¬WxÖUz#Ýð\fÎ\u008c\u009cðiPG²\u00141âs°Á\u008dA[½(\u000b\u0006@ÔÀ¡\u0002\u007f\u008cMø\u001a^è§Å:\u0093\u0080aÿ>[\f§Ù\u000b·}\u0085É\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l¦\u009aäÈVõÖ#*P\u009c~×¬WÙ\u0083\u0007\b5xbÑ\u0090-½\u0082ë\u001b{\u0090V< \u009bóJÍÊ\u009f¶j\u0016Dô\u0017tá1³\u0097\u008e\u0007Xì+~\u0005.×\u0087¢v\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l¾\u009aäÈQõË#\u0011P\u009c~ò¬ZÙ±\u0007;5cbÂ\u00903Ë^æò\u0090UC\u0084}\u0004/xÚØô:§¹Qû\u0003I>Éè5\u009b\u0083µÈgH\u0012\u0086Ì\u001fþe©Ô\u0000V-Ø[h\u0088\u0084¶=ä^\u0011à\u0000^-Á[^\u0088\u008c¶(äu\u0011\u0080?\u0016lÃ\u009aÙÈFõ\u009bXÂuI\u0003ÿÐ'î¡¼ãIsg\u00934:Â_\u0090ß\u00adg{\u009e\b<&Bôì\u0081\u0004_®\u0000s-ø[N\u0088\u0096¶\u0010äG\u0011Ç?/l\u008d\u009aêÈrõÓ#=P\u0080~ô¬RÙ³\u0007\u00065FbÎ\u00907½\u0095ë\u001b\u0019uFÝt'\u0000s-ø[N\u0088\u0096¶\u0010äU\u0011Ç?8l\u0098\u009aéÈCõÆ#\u0010P\u0090~å¬GÙµ\u0007\u00035obÕx{Uä#Rð\u008aÎ\f\u009c[iÛG2\u0014\u0083âÚ°Q\u008dÍ[4(\u0097\u0006åÔC¡ \u007f\u0014Md\u0000K-Ô[b\u0088º¶<ät\u0011æ?)l±\u009aÄÈlõö#\u0002\u0000g-ø[N\u0088\u0084¶\u001däk\u0011Ë\u0000g-ø[N\u0088\u0083¶\räa\u0011Ë\u0000g-ø[N\u0088\u008d¶\u001bä\u007f\u0011Ë?\u0002l\u008c\u0000g-ø[N\u0088\u0094¶\u0006ät\u0011Ï??l\u0081\u009aóÈGõö#8\u0000i-î[l\u0088¾¶\u0010ät\u0011Á?\nl\u008c\u009f°²7Ä¡\u0017o)Ã{¦\u008e\u0012 à\u0007®*)\\´\u008f~±Ðã³\u0016\u00078økF\u009d4Ï\u008cò\u0002$þWZy\u0010«\u0090]ëpt\u0006ÂÕ\u001aë\u0088¹íLnb¨1\u0012Ç`\u0095À¨q~¢\r\u001a#{ñÛ\u0084?Z\u0080hõ?_Í\u0085à\f¶\u009cDö\u001bS)¼ü\f\u0084+©¡ß\u0004\fç2^`<\u0095\u0092»`èð\u001e¬L\u000bqª§jÔÖú¦(\u0004]Ë\u0083F±<æ\u009f\u0014y9ÛoF\u009d1Â\u0095ð^%ÎKµy\u0010®ùÜI\u0002?7\u008bËºæ<\u0090\u0087C}}Ü/·Ú\u0012ôð§BQ8\u0003¬>\u0000èã\u009bzµ6g\u008a\u0012vÌÌþ\u0087©\u001a[ävO ÕÒ·\u008d\u0016¿éjI\u0004\u00126\u0086áe\u0093ÌM¥x\u0019*\u0097ÅgÊ®ç1\u0091\u0087B_|Í.¨Û+õí¦WP%\u0002\u0085?5éú\u009a]´2f\u008f\u0013wÍÍÿ ¨\u000fZùwG!ÅÓ\u009f\u008c\u0014¾ïkH\u0005'7\u0082àe\u0092ëL«y\u001d+\u0095 Í\rV{æ¨\u001a\u0096©ÄÝ1y\u001f\u0097L3ºoèóÕ@\u0003\u0092p7^d\u008câù\u0018'º\u0015ÚBZ°\u0095\u009d2Ë\u00ad9ÐfhT\u0082\u0081/ïPÝæ\n\u0018xª\u0000g-ø[N\u0088\u0099¶\u0015äe\u0011Ç?=l\u008d\u009aÄÈFõò#=P\u0090~ø¬zÙ½\u0007\f5mbÂ\u0090\u0011½\u0093ë\u0017\u0000s-ø[N\u0088\u0099¶\u0015äe\u0011Ç?=l\u008d\u009aÄÈFõú#*P\u009c~ø¬GÙ\u009c\u0007\u00045ybÓ\u0090!½\u008fë\u001b\u0019iü\u0013Ñ\u008c§:tíJa\u0018\u0011í³ÃI\u0090ùf°42\t\u0082ßK¬â\u0082\u008cP\u0012%Öûp", "ISO-8859-1", cArr, 0, 2053);
        f800 = cArr;
        f802 = 2710220064118746525L;
    }

    public bj(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static boolean m879(AppLovinAd appLovinAd) {
        f801 = (f803 + 69) % 128;
        boolean zIsVideoAd = appLovinAd.isVideoAd();
        f803 = (f801 + 21) % 128;
        return zIsVideoAd;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0035 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static boolean m880(AppLovinAd appLovinAd) {
        int i10 = f803 + 31;
        f801 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 11 / 0;
            if (appLovinAd != null) {
                if (m883(appLovinAd) != AppLovinAdSize.BANNER) {
                    return true;
                }
                f801 = (f803 + 13) % 128;
                if (m883(appLovinAd) != AppLovinAdSize.LEADER || m883(appLovinAd) == AppLovinAdSize.MREC) {
                }
            }
        } else if (appLovinAd != null) {
            if (m883(appLovinAd) != AppLovinAdSize.BANNER) {
                return true;
            }
            f801 = (f803 + 13) % 128;
            return m883(appLovinAd) != AppLovinAdSize.LEADER ? true : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static boolean m881(AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            f803 = (f801 + 29) % 128;
            if (appLovinAd.getType().equals(AppLovinAdType.INCENTIVIZED)) {
                return true;
            }
        }
        f803 = (f801 + InterfaceC0435l1.d.b.f29112i) % 128;
        return false;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static AppLovinAdType m882(AppLovinAd appLovinAd) {
        int i10 = f803 + 45;
        f801 = i10 % 128;
        if (i10 % 2 != 0) {
            return appLovinAd.getType();
        }
        appLovinAd.getType();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static AppLovinAdSize m883(AppLovinAd appLovinAd) {
        int i10 = f801 + 45;
        f803 = i10 % 128;
        if (i10 % 2 == 0) {
            return appLovinAd.getSize();
        }
        appLovinAd.getSize();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ boolean m884(AppLovinAd appLovinAd) {
        int i10 = f801 + 87;
        f803 = i10 % 128;
        if (i10 % 2 != 0) {
            m881(appLovinAd);
            throw null;
        }
        boolean zM881 = m881(appLovinAd);
        int i11 = f803 + 89;
        f801 = i11 % 128;
        if (i11 % 2 != 0) {
            return zM881;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long m885(AppLovinAd appLovinAd) {
        f801 = (f803 + 51) % 128;
        long adIdNumber = appLovinAd.getAdIdNumber();
        f803 = (f801 + 119) % 128;
        return adIdNumber;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static String m886(AppLovinAd appLovinAd) {
        f801 = (f803 + 39) % 128;
        String zoneId = appLovinAd.getZoneId();
        int i10 = f801 + 35;
        f803 = i10 % 128;
        if (i10 % 2 == 0) {
            return zoneId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Uri m887(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        f801 = (f803 + 89) % 128;
        Uri uriM896 = m896(appLovinNativeAdImpl);
        f801 = (f803 + InterfaceC0435l1.d.b.f29105b) % 128;
        return uriM896;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Bundle m897(CommunicatorMessageImpl communicatorMessageImpl) {
        int i10 = f803 + 23;
        f801 = i10 % 128;
        if (i10 % 2 != 0) {
            return m903(communicatorMessageImpl);
        }
        m903(communicatorMessageImpl);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ AdViewController m904(AppLovinAdView appLovinAdView) {
        int i10 = f803 + 93;
        f801 = i10 % 128;
        if (i10 % 2 == 0) {
            m917(appLovinAdView);
            throw null;
        }
        AdViewController adViewControllerM917 = m917(appLovinAdView);
        int i11 = f801 + 85;
        f803 = i11 % 128;
        if (i11 % 2 == 0) {
            return adViewControllerM917;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Uri m912(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i10 = f801 + 125;
        f803 = i10 % 128;
        if (i10 % 2 != 0) {
            m902(appLovinNativeAdImpl);
            throw null;
        }
        Uri uriM902 = m902(appLovinNativeAdImpl);
        int i11 = f803 + 59;
        f801 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 81 / 0;
        }
        return uriM902;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ long m916(AppLovinAd appLovinAd) {
        f801 = (f803 + 25) % 128;
        long jM885 = m885(appLovinAd);
        int i10 = f801 + 55;
        f803 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 66 / 0;
        }
        return jM885;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ AppLovinAdType m888(AppLovinAd appLovinAd) {
        int i10 = f803 + 79;
        f801 = i10 % 128;
        if (i10 % 2 == 0) {
            m882(appLovinAd);
            throw null;
        }
        AppLovinAdType appLovinAdTypeM882 = m882(appLovinAd);
        f803 = (f801 + 117) % 128;
        return appLovinAdTypeM882;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ AppLovinBroadcastManager m898(Context context) {
        int i10 = f803 + 85;
        f801 = i10 % 128;
        int i11 = i10 % 2;
        AppLovinBroadcastManager appLovinBroadcastManagerM918 = m918(context);
        if (i11 == 0) {
            int i12 = 71 / 0;
        }
        f801 = (f803 + InterfaceC0435l1.d.b.f29112i) % 128;
        return appLovinBroadcastManagerM918;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ AppLovinAdSize m905(AppLovinAd appLovinAd) {
        f803 = (f801 + 53) % 128;
        AppLovinAdSize appLovinAdSizeM883 = m883(appLovinAd);
        f801 = (f803 + 49) % 128;
        return appLovinAdSizeM883;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m913(AdViewController adViewController, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        f803 = (f801 + 13) % 128;
        m891(adViewController, appLovinAdDisplayListener);
        int i10 = f801 + 121;
        f803 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m919(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        int i10 = f801 + 49;
        f803 = i10 % 128;
        int i11 = i10 % 2;
        appLovinInterstitialAdDialog.setAdVideoPlaybackListener(appLovinAdVideoPlaybackListener);
        if (i11 != 0) {
            throw null;
        }
        int i12 = f803 + 39;
        f801 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 56 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m892(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdClickListener appLovinAdClickListener) {
        int i10 = f803 + 13;
        f801 = i10 % 128;
        int i11 = i10 % 2;
        m908(appLovinInterstitialAdDialog, appLovinAdClickListener);
        if (i11 == 0) {
            throw null;
        }
        f803 = (f801 + 25) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m899(AppLovinAd appLovinAd) {
        int i10 = f801 + 25;
        f803 = i10 % 128;
        if (i10 % 2 == 0) {
            return m886(appLovinAd);
        }
        m886(appLovinAd);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m907(MaxAd maxAd) {
        int i10 = f803 + 85;
        f801 = i10 % 128;
        int i11 = i10 % 2;
        String strM889 = m889(maxAd);
        if (i11 == 0) {
            int i12 = 57 / 0;
        }
        int i13 = f801 + 87;
        f803 = i13 % 128;
        if (i13 % 2 == 0) {
            return strM889;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m915(AppLovinAd appLovinAd) {
        int i10 = f803 + 3;
        f801 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM879 = m879(appLovinAd);
        if (i11 == 0) {
            int i12 = 45 / 0;
        }
        int i13 = f801 + 19;
        f803 = i13 % 128;
        if (i13 % 2 == 0) {
            return zM879;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static AdViewController m917(AppLovinAdView appLovinAdView) {
        int i10 = f801 + 13;
        f803 = i10 % 128;
        if (i10 % 2 == 0) {
            return appLovinAdView.getAdViewController();
        }
        appLovinAdView.getAdViewController();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m895(bj bjVar, Context context, String str, String str2) {
        f803 = (f801 + 51) % 128;
        bjVar.m890(context, str, str2);
        int i10 = f801 + 99;
        f803 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m900(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver) {
        f803 = (f801 + 123) % 128;
        m893(appLovinBroadcastManager, receiver);
        f801 = (f803 + 81) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m909(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        int i10 = f803 + 61;
        f801 = i10 % 128;
        int i11 = i10 % 2;
        m919(appLovinInterstitialAdDialog, appLovinAdVideoPlaybackListener);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f803 + 83;
        f801 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static AppLovinBroadcastManager m918(Context context) {
        int i10 = f801 + 27;
        f803 = i10 % 128;
        int i11 = i10 % 2;
        AppLovinBroadcastManager appLovinBroadcastManager = AppLovinBroadcastManager.getInstance(context);
        if (i11 != 0) {
            int i12 = 11 / 0;
        }
        f801 = (f803 + 13) % 128;
        return appLovinBroadcastManager;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        map.put(m906((char) (TextUtils.indexOf("", "") + 22705), TextUtils.lastIndexOf("", '0', 0) + 1664, 18 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                bj.m892((AppLovinInterstitialAdDialog) list.get(0), (AppLovinAdClickListener) list.get(1));
                return null;
            }
        });
        map.put(m906((char) (Process.getGidForName("") + 1), 1681 - View.MeasureSpec.getSize(0), Color.blue(0) + 26).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.15
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                bj.m909((AppLovinInterstitialAdDialog) list.get(0), (AppLovinAdVideoPlaybackListener) list.get(1));
                return null;
            }
        });
        map.put(m906((char) Color.argb(0, 0, 0, 0), KeyEvent.normalizeMetaState(0) + 1707, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 19).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.14
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                bj.m913((AdViewController) list.get(0), (AppLovinAdDisplayListener) list.get(1));
                return null;
            }
        });
        map.put(m906((char) (Gravity.getAbsoluteGravity(0, 0) + 30748), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1727, (ViewConfiguration.getLongPressTimeout() >> 16) + 19).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.20
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bj.m904((AppLovinAdView) list.get(0));
            }
        });
        map.put(m906((char) (44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 1746 - Color.blue(0), 13 - ExpandableListView.getPackedPositionType(0L)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.17
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return Long.valueOf(bj.m916((AppLovinAd) list.get(0)));
            }
        });
        map.put(m906((char) ((Process.getThreadPriority(0) + 20) >> 6), 1759 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 7 - View.resolveSize(0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.16
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bj.m905((AppLovinAd) list.get(0));
            }
        });
        map.put(m906((char) Color.red(0), 1766 - (Process.myPid() >> 22), 7 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.19
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bj.m888((AppLovinAd) list.get(0));
            }
        });
        map.put(m906((char) (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 1774, 9 - KeyEvent.normalizeMetaState(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.18
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bj.m899((AppLovinAd) list.get(0));
            }
        });
        map.put(m906((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 1782, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.25
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bj.m907((MaxAd) list.get(0));
            }
        });
        map.put(m906((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 1795 - (ViewConfiguration.getTouchSlop() >> 8), 10 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return Boolean.valueOf(bj.m915((AppLovinAd) list.get(0)));
            }
        });
        map.put(m906((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 40922), 1804 - ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.getMode(0) + 8).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return Boolean.valueOf(bj.m901(bj.this, (AppLovinAd) list.get(0)));
            }
        });
        map.put(m906((char) (1991 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1812, (Process.myTid() >> 22) + 16).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return Boolean.valueOf(bj.m884((AppLovinAd) list.get(0)));
            }
        });
        map.put(m906((char) (KeyEvent.normalizeMetaState(0) + 23948), View.getDefaultSize(0, 0) + 1828, View.combineMeasuredStates(0, 0) + 27).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bj.m898((Context) list.get(0));
            }
        });
        map.put(m906((char) (TextUtils.indexOf("", "") + 33881), 1855 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 33).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                bj.m910((AppLovinBroadcastManager) list.get(0), (AppLovinBroadcastManager.Receiver) list.get(1), (IntentFilter) list.get(2));
                return null;
            }
        });
        map.put(m906((char) (52175 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1888, 35 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                bj.m900((AppLovinBroadcastManager) list.get(0), (AppLovinBroadcastManager.Receiver) list.get(1));
                return null;
            }
        });
        map.put(m906((char) (51913 - Color.blue(0)), Gravity.getAbsoluteGravity(0, 0) + 1923, 34 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bj.m897((AppLovinCommunicatorMessage) list.get(0));
            }
        });
        map.put(m906((char) (8382 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 1957 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 30 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                bj.m895(bj.this, (Context) list.get(0), (String) list.get(1), (String) list.get(2));
                return null;
            }
        });
        map.put(m906((char) ExpandableListView.getPackedPositionType(0L), 1989 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), Color.red(0) + 23).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bj.m887((AppLovinNativeAdImpl) list.get(0));
            }
        });
        map.put(m906((char) TextUtils.getCapsMode("", 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + IronSourceError.ERROR_OLD_INIT_API_APP_KEY_IS_NULL, (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 24).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.13
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                bj.m911((AppLovinNativeAdImpl) list.get(0), (AppLovinNativeAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m906((char) (AndroidCharacter.getMirror('0') + 64580), View.resolveSizeAndState(0, 0, 0) + 2035, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 18).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.11
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bj.m912((AppLovinNativeAdImpl) list.get(0));
            }
        });
        int i10 = f801 + 99;
        f803 = i10 % 128;
        if (i10 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m901(bj bjVar, AppLovinAd appLovinAd) {
        int i10 = f801 + 73;
        f803 = i10 % 128;
        if (i10 % 2 != 0) {
            m880(appLovinAd);
            throw null;
        }
        boolean zM880 = m880(appLovinAd);
        int i11 = f803 + 25;
        f801 = i11 % 128;
        if (i11 % 2 != 0) {
            return zM880;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m910(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver, IntentFilter intentFilter) {
        int i10 = f803 + 91;
        f801 = i10 % 128;
        int i11 = i10 % 2;
        m914(appLovinBroadcastManager, receiver, intentFilter);
        if (i11 == 0) {
            int i12 = 96 / 0;
        }
        int i13 = f801 + 73;
        f803 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        f803 = (f801 + 41) % 128;
        try {
            try {
                String str = (String) AppLovinSdk.class.getDeclaredField(m906((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1644 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 7).intern()).get(null);
                f801 = (f803 + 119) % 128;
                return str;
            } catch (Exception unused) {
                return id.m2382().m2383().m2493(AppLovinSdk.class, m906((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), TextUtils.lastIndexOf("", '0', 0) + 1652, 11 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Uri m896(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        f801 = (f803 + 33) % 128;
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        f801 = (f803 + 115) % 128;
        return mainImageUri;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m911(AppLovinNativeAdImpl appLovinNativeAdImpl, AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        int i10 = f803 + 77;
        f801 = i10 % 128;
        int i11 = i10 % 2;
        m894(appLovinNativeAdImpl, appLovinNativeAdEventListener);
        if (i11 == 0) {
            int i12 = 84 / 0;
        }
        f801 = (f803 + 55) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:202:0x09ff  */
    /* JADX WARN: Code duplicated, block: B:28:0x0159  */
    /* JADX WARN: Code duplicated, block: B:9:0x0060  */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        byte b10;
        switch (str.hashCode()) {
            case -2080431557:
                b10 = !str.equals(m906((char) ((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1), 1097 - ExpandableListView.getPackedPositionGroup(0L), 26 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 54;
                break;
            case -2043340463:
                b10 = !str.equals(m906((char) ((-1) - MotionEvent.axisFromString("")), 980 - (ViewConfiguration.getPressedStateDuration() >> 16), 26 - Color.blue(0)).intern()) ? (byte) -1 : (byte) 49;
                break;
            case -2004957298:
                b10 = !str.equals(m906((char) TextUtils.indexOf("", "", 0), MotionEvent.axisFromString("") + 672, 25 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 36;
                break;
            case -1881559119:
                b10 = !str.equals(m906((char) (51999 - (ViewConfiguration.getEdgeSlop() >> 16)), 1624 - TextUtils.indexOf("", "", 0), 20 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern()) ? (byte) -1 : (byte) 75;
                break;
            case -1833485839:
                b10 = !str.equals(m906((char) (1 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 1518 - (Process.myPid() >> 22), Color.rgb(0, 0, 0) + 16777232).intern()) ? (byte) -1 : (byte) 70;
                break;
            case -1467734148:
                if (!str.equals(m906((char) (719 - Color.alpha(0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 164, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 25).intern())) {
                    b10 = -1;
                } else {
                    f803 = (f801 + 97) % 128;
                    b10 = 8;
                }
                break;
            case -1450375470:
                b10 = !str.equals(m906((char) ((ViewConfiguration.getTouchSlop() >> 8) + 43145), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1383, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 19).intern()) ? (byte) -1 : (byte) 64;
                break;
            case -1375681914:
                b10 = !str.equals(m906((char) ((Process.myPid() >> 22) + 45238), TextUtils.indexOf("", "") + 304, 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 14;
                break;
            case -1352001524:
                b10 = !str.equals(m906((char) (Process.myTid() >> 22), 486 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 13 - TextUtils.getOffsetAfter("", 0)).intern()) ? (byte) -1 : (byte) 24;
                break;
            case -1287385676:
                if (!str.equals(m906((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49798), 1167 - Gravity.getAbsoluteGravity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 31).intern())) {
                    b10 = -1;
                } else {
                    b10 = 57;
                }
                break;
            case -1229948432:
                b10 = !str.equals(m906((char) (26959 - (ViewConfiguration.getTouchSlop() >> 8)), 213 - TextUtils.getOffsetAfter("", 0), (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 30).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -1201363365:
                b10 = !str.equals(m906((char) (KeyEvent.keyCodeFromString("") + 48914), Color.red(0) + 589, (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 13).intern()) ? (byte) -1 : (byte) 31;
                break;
            case -1179967667:
                b10 = !str.equals(m906((char) (Color.rgb(0, 0, 0) + 16782057), 1496 - TextUtils.lastIndexOf("", '0', 0, 0), (Process.myPid() >> 22) + 21).intern()) ? (byte) -1 : (byte) 69;
                break;
            case -1153520596:
                if (!str.equals(m906((char) ((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 32907), 1147 - (KeyEvent.getMaxKeyCode() >> 16), 21 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f803 + 31;
                    f801 = i10 % 128;
                    b10 = i10 % 2 != 0 ? (byte) 56 : (byte) 83;
                }
                break;
            case -1109694355:
                if (!str.equals(m906((char) ((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 27738), 272 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 33 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    int i11 = f801 + 63;
                    f803 = i11 % 128;
                    if (i11 % 2 == 0) {
                        b10 = 13;
                    } else {
                        b10 = 57;
                    }
                }
                break;
            case -1073613085:
                if (!str.equals(m906((char) (58408 - TextUtils.lastIndexOf("", '0', 0)), 602 - View.getDefaultSize(0, 0), 19 - Drawable.resolveOpacity(0, 0)).intern())) {
                    b10 = -1;
                } else {
                    int i12 = f803 + 41;
                    f801 = i12 % 128;
                    b10 = i12 % 2 == 0 ? (byte) 41 : (byte) 32;
                }
                break;
            case -1046364472:
                b10 = !str.equals(m906((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 652, 19 - TextUtils.indexOf((CharSequence) "", '0')).intern()) ? (byte) -1 : (byte) 35;
                break;
            case -998829219:
                b10 = !str.equals(m906((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 30520), 1226 - (ViewConfiguration.getJumpTapTimeout() >> 16), 35 - ExpandableListView.getPackedPositionChild(0L)).intern()) ? (byte) -1 : (byte) 59;
                break;
            case -922738309:
                b10 = !str.equals(m906((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 35, 34 - Gravity.getAbsoluteGravity(0, 0)).intern()) ? (byte) -1 : (byte) 3;
                break;
            case -859912744:
                b10 = !str.equals(m906((char) Color.green(0), 1320 - Gravity.getAbsoluteGravity(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 52).intern()) ? (byte) -1 : (byte) 62;
                break;
            case -812800838:
                b10 = !str.equals(m906((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, View.resolveSize(0, 0) + 10).intern()) ? (byte) -1 : (byte) 1;
                break;
            case -781635730:
                if (!str.equals(m906((char) (ViewConfiguration.getLongPressTimeout() >> 16), 113 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.rgb(0, 0, 0) + 16777244).intern())) {
                    b10 = -1;
                } else {
                    f801 = (f803 + 95) % 128;
                    b10 = 6;
                }
                break;
            case -702340466:
                b10 = !str.equals(m906((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1448 - TextUtils.lastIndexOf("", '0', 0, 0), (-16777168) - Color.rgb(0, 0, 0)).intern()) ? (byte) -1 : (byte) 68;
                break;
            case -558305015:
                b10 = !str.equals(m906((char) (KeyEvent.keyCodeFromString("") + 3059), 629 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getFadingEdgeLength() >> 16) + 21).intern()) ? (byte) -1 : (byte) 34;
                break;
            case -529676547:
                b10 = !str.equals(m906((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 30871), 1534 - Color.green(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 29).intern()) ? (byte) -1 : (byte) 71;
                break;
            case -515103971:
                b10 = !str.equals(m906((char) ((-1) - Process.getGidForName("")), 773 - View.MeasureSpec.makeMeasureSpec(0, 0), 17 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern()) ? (byte) -1 : (byte) 41;
                break;
            case -499617006:
                if (!str.equals(m906((char) (ViewConfiguration.getLongPressTimeout() >> 16), Process.getGidForName("") + 1066, 32 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    int i13 = f801 + 41;
                    f803 = i13 % 128;
                    if (i13 % 2 == 0) {
                        b10 = 53;
                    } else {
                        b10 = 46;
                    }
                }
                break;
            case -490511554:
                b10 = !str.equals(m906((char) (50787 - (KeyEvent.getMaxKeyCode() >> 16)), 1419 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf("", "", 0, 0) + 15).intern()) ? (byte) -1 : (byte) 66;
                break;
            case -490128445:
                b10 = !str.equals(m906((char) (3381 - View.getDefaultSize(0, 0)), 1434 - View.getDefaultSize(0, 0), (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 15).intern()) ? (byte) -1 : (byte) 67;
                break;
            case -388222861:
                b10 = !str.equals(m906((char) KeyEvent.getDeadChar(0, 0), 950 - ExpandableListView.getPackedPositionType(0L), 30 - (ViewConfiguration.getScrollBarSize() >> 8)).intern()) ? (byte) -1 : (byte) 48;
                break;
            case -313801005:
                b10 = !str.equals(m906((char) (ExpandableListView.getPackedPositionChild(0L) + 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 456, 17 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 22;
                break;
            case -294317262:
                b10 = !str.equals(m906((char) (4210 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 85 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 28 - (Process.myPid() >> 22)).intern()) ? (byte) -1 : (byte) 5;
                break;
            case -292897006:
                b10 = !str.equals(m906((char) (41473 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (-16776092) - Color.rgb(0, 0, 0), 23 - KeyEvent.getDeadChar(0, 0)).intern()) ? (byte) -1 : (byte) 55;
                break;
            case -265039036:
                b10 = !str.equals(m906((char) View.MeasureSpec.getSize(0), 69 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 15 - Process.getGidForName("")).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -155576673:
                b10 = !str.equals(m906((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), Process.getGidForName("") + 734, (KeyEvent.getMaxKeyCode() >> 16) + 22).intern()) ? (byte) -1 : (byte) 39;
                break;
            case -62837376:
                b10 = !str.equals(m906((char) (50222 - (ViewConfiguration.getJumpTapTimeout() >> 16)), TextUtils.lastIndexOf("", '0') + 696, (ViewConfiguration.getScrollBarSize() >> 8) + 22).intern()) ? (byte) -1 : (byte) 37;
                break;
            case 9498927:
                b10 = !str.equals(m906((char) (22623 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 370 - (ViewConfiguration.getTapTimeout() >> 16), 27 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern()) ? (byte) -1 : (byte) 17;
                break;
            case 74118279:
                b10 = !str.equals(m906((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 37043), 573 - (ViewConfiguration.getScrollBarSize() >> 8), (Process.myPid() >> 22) + 5).intern()) ? (byte) -1 : (byte) 29;
                break;
            case 113294717:
                b10 = !str.equals(m906((char) View.MeasureSpec.getMode(0), TextUtils.lastIndexOf("", '0') + 756, 18 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 40;
                break;
            case 113748919:
                b10 = !str.equals(m906((char) ExpandableListView.getPackedPositionType(0L), 927 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 24 - Color.green(0)).intern()) ? (byte) -1 : (byte) 47;
                break;
            case 148784004:
                b10 = !str.equals(m906((char) KeyEvent.getDeadChar(0, 0), 1563 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 23).intern()) ? (byte) -1 : (byte) 72;
                break;
            case 404925231:
                b10 = !str.equals(m906((char) (37137 - (Process.myTid() >> 22)), View.combineMeasuredStates(0, 0) + 1262, 26 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern()) ? (byte) -1 : (byte) 60;
                break;
            case 448683812:
                if (!str.equals(m906((char) (TextUtils.lastIndexOf("", '0', 0) + 50471), 1033 - (Process.myTid() >> 22), Process.getGidForName("") + 9).intern())) {
                    b10 = -1;
                } else {
                    f801 = (f803 + 11) % 128;
                    b10 = 51;
                }
                break;
            case 572995203:
                b10 = !str.equals(m906((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), Color.blue(0), 11 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern()) ? (byte) -1 : (byte) 0;
                break;
            case 605983675:
                b10 = !str.equals(m906((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0', 0) + 839, 36 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern()) ? (byte) -1 : (byte) 44;
                break;
            case 729244021:
                b10 = !str.equals(m906((char) TextUtils.indexOf("", ""), 519 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 24).intern()) ? (byte) -1 : (byte) 26;
                break;
            case 735058557:
                b10 = !str.equals(m906((char) (ExpandableListView.getPackedPositionChild(0L) + 9888), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 543, TextUtils.getCapsMode("", 0, 0) + 20).intern()) ? (byte) -1 : (byte) 27;
                break;
            case 752486192:
                b10 = !str.equals(m906((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1197, TextUtils.getOffsetBefore("", 0) + 29).intern()) ? (byte) -1 : (byte) 58;
                break;
            case 794586549:
                b10 = !str.equals(m906((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 790 - (Process.myPid() >> 22), 19 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 42;
                break;
            case 896010188:
                b10 = !str.equals(m906((char) ExpandableListView.getPackedPositionType(0L), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 449, TextUtils.getTrimmedLength("") + 9).intern()) ? (byte) -1 : (byte) 21;
                break;
            case 983006005:
                b10 = !str.equals(m906((char) (57977 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 874 - TextUtils.getCapsMode("", 0, 0), 34 - View.combineMeasuredStates(0, 0)).intern()) ? (byte) -1 : (byte) 45;
                break;
            case 1003087195:
                b10 = !str.equals(m906((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), View.resolveSizeAndState(0, 0, 0) + 349, (ViewConfiguration.getTapTimeout() >> 16) + 21).intern()) ? (byte) -1 : (byte) 16;
                break;
            case 1072916356:
                b10 = !str.equals(m906((char) (View.MeasureSpec.getSize(0) + 751), (ViewConfiguration.getTouchSlop() >> 8) + 414, (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 20).intern()) ? (byte) -1 : (byte) 19;
                break;
            case 1152082353:
                b10 = !str.equals(m906((char) (ViewConfiguration.getEdgeSlop() >> 16), 1402 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16).intern()) ? (byte) -1 : (byte) 65;
                break;
            case 1234617814:
                b10 = !str.equals(m906((char) ((Process.myTid() >> 22) + 60617), View.MeasureSpec.makeMeasureSpec(0, 0) + 810, 28 - (Process.myPid() >> 22)).intern()) ? (byte) -1 : (byte) 43;
                break;
            case 1265496546:
                b10 = !str.equals(m906((char) Gravity.getAbsoluteGravity(0, 0), (-16776716) - Color.rgb(0, 0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19).intern()) ? (byte) -1 : (byte) 25;
                break;
            case 1278030609:
                b10 = !str.equals(m906((char) TextUtils.indexOf("", "", 0), Drawable.resolveOpacity(0, 0) + 326, (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 23).intern()) ? (byte) -1 : (byte) 15;
                break;
            case 1318309173:
                b10 = !str.equals(m906((char) (1 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 474 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 13 - ((Process.getThreadPriority(0) + 20) >> 6)).intern()) ? (byte) -1 : (byte) 23;
                break;
            case 1337781577:
                b10 = !str.equals(m906((char) KeyEvent.normalizeMetaState(0), 397 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17).intern()) ? (byte) -1 : (byte) 18;
                break;
            case 1342402498:
                b10 = !str.equals(m906((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 141 - TextUtils.indexOf("", "", 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24).intern()) ? (byte) -1 : (byte) 7;
                break;
            case 1342953158:
                b10 = !str.equals(m906((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1603, KeyEvent.keyCodeFromString("") + 21).intern()) ? (byte) -1 : (byte) 74;
                break;
            case 1383609003:
                if (!str.equals(m906((char) (60728 - TextUtils.indexOf((CharSequence) "", '0')), 435 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Color.green(0) + 14).intern())) {
                    b10 = -1;
                } else {
                    f801 = (f803 + 73) % 128;
                    b10 = 20;
                }
                break;
            case 1384123355:
                b10 = !str.equals(m906((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 62865), Color.rgb(0, 0, 0) + 16777460, 14 - View.getDefaultSize(0, 0)).intern()) ? (byte) -1 : (byte) 11;
                break;
            case 1384168212:
                b10 = !str.equals(m906((char) (Process.myPid() >> 22), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 258, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 14).intern()) ? (byte) -1 : (byte) 12;
                break;
            case 1384212095:
                b10 = !str.equals(m906((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 65524), (ViewConfiguration.getLongPressTimeout() >> 16) + 21, Color.alpha(0) + 14).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 1384605075:
                b10 = !str.equals(m906((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1955), 621 - Color.green(0), Color.red(0) + 9).intern()) ? (byte) -1 : (byte) 33;
                break;
            case 1450884094:
                b10 = !str.equals(m906((char) (471 - Color.red(0)), 1371 - Process.getGidForName(""), 11 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern()) ? (byte) -1 : Utf8.REPLACEMENT_BYTE;
                break;
            case 1620186974:
                b10 = !str.equals(m906((char) (MotionEvent.axisFromString("") + 1), 578 - (ViewConfiguration.getTouchSlop() >> 8), 11 - Color.alpha(0)).intern()) ? (byte) -1 : (byte) 30;
                break;
            case 1724415069:
                b10 = !str.equals(m906((char) (20581 - (Process.myTid() >> 22)), (ViewConfiguration.getPressedStateDuration() >> 16) + PsExtractor.PRIVATE_STREAM_1, TextUtils.indexOf("", "", 0) + 24).intern()) ? (byte) -1 : (byte) 9;
                break;
            case 1753212735:
                if (!str.equals(m906((char) ((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1), (ViewConfiguration.getTapTimeout() >> 16) + 908, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18).intern())) {
                    b10 = -1;
                } else {
                    b10 = 46;
                }
                break;
            case 1880938499:
                b10 = !str.equals(m906((char) (22333 - View.resolveSizeAndState(0, 0, 0)), (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION, 24 - Color.alpha(0)).intern()) ? (byte) -1 : (byte) 52;
                break;
            case 1944524259:
                b10 = !str.equals(m906((char) (Process.getGidForName("") + 38185), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 716, 16 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 38;
                break;
            case 1991372702:
                b10 = !str.equals(m906((char) View.combineMeasuredStates(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 1007, 27 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern()) ? (byte) -1 : (byte) 50;
                break;
            case 2016893291:
                if (!str.equals(m906((char) (ViewConfiguration.getScrollBarSize() >> 8), 563 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 10 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    b10 = -1;
                } else {
                    f803 = (f801 + 35) % 128;
                    b10 = 28;
                }
                break;
            case 2063749596:
                if (!str.equals(m906((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1289 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 32 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 61;
                }
                break;
            case 2145283122:
                if (!str.equals(m906((char) (31698 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1586 - TextUtils.getOffsetAfter("", 0), 17 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    int i14 = f801 + 37;
                    f803 = i14 % 128;
                    if (i14 % 2 == 0) {
                        b10 = 73;
                    } else {
                        b10 = 61;
                    }
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return AppLovinSdk.class;
            case 1:
                return AppLovinAd.class;
            case 2:
            case 3:
                return AppLovinAdView.class;
            case 4:
                return AdViewController.class;
            case 5:
                return AppLovinInterstitialActivity.class;
            case 6:
                return AppLovinInterstitialAdDialog.class;
            case 7:
                return AppLovinAdClickListener.class;
            case 8:
                return AppLovinAdDisplayListener.class;
            case 9:
                return AppLovinAdRewardListener.class;
            case 10:
                return AppLovinAdVideoPlaybackListener.class;
            case 11:
                return AppLovinAdSize.class;
            case 12:
                return AppLovinAdType.class;
            case 13:
                return AppLovinIncentivizedInterstitial.class;
            case 14:
                return AppLovinInterstitialAd.class;
            case 15:
                return AppLovinWebViewActivity.class;
            case 16:
                return AppLovinAdServiceImpl.class;
            case 17:
                return AppLovinAdViewEventListener.class;
            case 18:
                return AppLovinVideoView.class;
            case 19:
                return AdViewControllerImpl.class;
            case 20:
                return AppLovinAdBase.class;
            case 21:
                return MaxAdView.class;
            case 22:
                return MaxInterstitialAd.class;
            case 23:
                return MaxRewardedAd.class;
            case 24:
                return MaxAdViewImpl.class;
            case 25:
                return MaxFullscreenAdImpl.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                return MaxAdapterParametersImpl.class;
            case 27:
                return MediationServiceImpl.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                return MaxAdapter.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                return MaxAd.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                return MaxAdFormat.class;
            case 31:
                return MaxAdListener.class;
            case 32:
                return MaxAdViewAdListener.class;
            case 33:
                return MaxReward.class;
            case 34:
                return MaxRewardedAdListener.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                return MediationAdapterBase.class;
            case 36:
                return AppLovinMediationAdapter.class;
            case 37:
                return MediationAdapterRouter.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                return MaxAdViewAdapter.class;
            case 39:
                return MaxInterstitialAdapter.class;
            case 40:
                return MaxRewardedAdapter.class;
            case 41:
                return MaxSignalProvider.class;
            case 42:
                return MaxAdapterParameters.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                return MaxAdapterResponseParameters.class;
            case 44:
                return MaxAdapterSignalCollectionParameters.class;
            case 45:
                return MaxAdapterInitializationParameters.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                return MaxAdapterListener.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                return MaxAdViewAdapterListener.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                return MaxInterstitialAdapterListener.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                return MaxRewardedAdapterListener.class;
            case 50:
                return MaxSignalCollectionListener.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                return MaxError.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                return AppLovinBroadcastManager.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                return AppLovinBroadcastManager.Receiver.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                return AppLovinCommunicatorMessage.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                return CommunicatorMessageImpl.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                return AppLovinCommunicator.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                return AppLovinCommunicatorSubscriber.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                return AppLovinCommunicatorPublisher.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                return AppLovinCommunicatorMessagingService.class;
            case 60:
                return AppLovinCommunicatorEntity.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
            case 62:
                return AppLovinFullscreenThemedActivity.class;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                return MaxNativeAd.class;
            case 64:
                return MaxNativeAdListener.class;
            case 65:
                return MaxNativeAdLoader.class;
            case 66:
                return MaxNativeAdImpl.class;
            case 67:
            case 68:
                return MaxNativeAdView.class;
            case 69:
                return MaxNativeAdViewBinder.class;
            case 70:
                return AppLovinNativeAd.class;
            case 71:
                return AppLovinNativeAdEventListener.class;
            case 72:
                return AppLovinNativeAdService.class;
            case 73:
                return AppLovinMediaView.class;
            case 74:
                return AppLovinVastMediaView.class;
            case 75:
                return AppLovinNativeAdImpl.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m891(AdViewController adViewController, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        f803 = (f801 + 123) % 128;
        adViewController.setAdDisplayListener(appLovinAdDisplayListener);
        f803 = (f801 + 25) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m889(MaxAd maxAd) {
        f801 = (f803 + 123) % 128;
        String creativeId = maxAd.getCreativeId();
        int i10 = f801 + 71;
        f803 = i10 % 128;
        if (i10 % 2 == 0) {
            return creativeId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m893(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver) {
        int i10 = f801 + 51;
        f803 = i10 % 128;
        if (i10 % 2 == 0) {
            throw new IncompatibleClassChangeError();
        }
        throw new IncompatibleClassChangeError();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m890(Context context, final String str, String str2) {
        AppLovinCommunicator.getInstance(context).subscribe(new AppLovinCommunicatorSubscriber() { // from class: com.ironsource.adqualitysdk.sdk.i.bj.12
            @Override // com.applovin.communicator.AppLovinCommunicatorEntity
            public final String getCommunicatorId() {
                return str;
            }

            @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
            public final void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
            }
        }, str2);
        f801 = (f803 + 123) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m894(AppLovinNativeAdImpl appLovinNativeAdImpl, AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        f803 = (f801 + 95) % 128;
        appLovinNativeAdImpl.setEventListener(appLovinNativeAdEventListener);
        f801 = (f803 + 57) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m914(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver, IntentFilter intentFilter) {
        int i10 = f801 + 95;
        f803 = i10 % 128;
        if (i10 % 2 == 0) {
            throw new IncompatibleClassChangeError();
        }
        throw new IncompatibleClassChangeError();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m908(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdClickListener appLovinAdClickListener) {
        f801 = (f803 + 97) % 128;
        appLovinInterstitialAdDialog.setAdClickListener(appLovinAdClickListener);
        int i10 = f801 + 47;
        f803 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 50 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Bundle m903(CommunicatorMessageImpl communicatorMessageImpl) {
        int i10 = f803 + 67;
        f801 = i10 % 128;
        if (i10 % 2 != 0) {
            return communicatorMessageImpl.getMessageData();
        }
        communicatorMessageImpl.getMessageData();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Uri m902(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i10 = f803 + InterfaceC0435l1.d.b.f29114k;
        f801 = i10 % 128;
        if (i10 % 2 != 0) {
            return appLovinNativeAdImpl.getIconUri();
        }
        appLovinNativeAdImpl.getIconUri();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m906(char c4, int i10, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i11];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f800[i10 + i12]) ^ (((long) i12) * f802)) ^ ((long) c4));
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
