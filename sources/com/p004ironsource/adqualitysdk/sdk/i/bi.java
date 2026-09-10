package com.p004ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
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
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.smartdigimkt.f3.b;
import com.smartdigimkt.v0.p;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.thinkup.core.common.n.mo;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class bi extends bg {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f764 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f765;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f766;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f767;

    static {
        char[] cArr = new char[2053];
        ByteBuffer.wrap("8\u0000\u0083±O1\n\u008dÖ.\u0091·](\u0018¯ä\u0012¯¥k*\u0000A»ðwp2Ìîo©öei îÜA\u0097ä\u0000A»ðwp2Ìîo©öei îÜA\u0097äSV\u000eéÊe\u0085÷\u0000c»ïwm2®îa©ðep ìÜo\u0097öSi\u000eîÊ.\u0085áAdüö¸iså/wê®¦Aað\u001dpØÌ\u0094oOö\u000biÆî\u0082A=äùV´épe+÷\u0000A»äwV2éîe©÷eC ïÜn\u0097ôSr\u000eïÊl\u0085ìAeüò\u0000A»ðwp2Ìîo©öei îÜI\u0097îSt\u000eåÊr\u0085óAtüé¸tsé/aêì¦Aaã\u001dtØé\u0094vOé\u000btÆù0x\u008bÉGI\u0002õÞV\u0099ÏUP\u0010×ìp§×cM>ÜúKµÊqMÌÐ\u0088MCÐ\u001fXÚÕ\u0096xQÝ-}èÐ¤X\u007fÕ;VöÞ\u0000A»ðwp2Ìîo©öei îÜA\u0097äSC\u000eìÊi\u0085ãAküÌ¸isó/têå¦naå\u001dr%Î\u009e\u007fRÿ\u0017CËà\u008cy@æ\u0005aùÎ²kvË+fïü \u007fdãÙn\u009döVC\næÏ|\u0083ûDj8áýj±ý\u0000A»ðwp2Ìîo©öei îÜA\u0097äSR\u000eåÊw\u0085áArüä¸Lsé/sêô¦eaî\u001deØòn\u000bÕº\u0019:\\\u0086\u0080%Ç¼\u000b#N¤²\u000bù®=\u001c`£¤.ë¯/%\u0092\u009aÖ&\u001d«A3\u0084¨È+\u000f©s!¶\u0086ú#!¹e>¨¯ì$S¯\u00978\u0000A»ðwp2Ìîo©öei îÜA\u0097äSS\u000eéÊz\u0085å\u0000A»ðwp2Ìîo©öei îÜA\u0097äST\u000eùÊp\u0085å\u0000A»ðwp2Ìîo©öei îÜI\u0097îSc\u000eåÊn\u0085ôAiüö¸isú/eêä¦Iaî\u001dtØå\u0094rOó\u000btÆé\u0082t=éùa´ì¤@\u001fñÓq\u0096ÍJn\r÷Áh\u0084ïxH3ï÷uªäns!òåuXè\u001cu×è\u008b`Ní\u0002@Åå\u0000A»ðwp2Ìîo©öei îÜW\u0097åSb\u000eÖÊi\u0085åAwüÁ¸csô/iêö¦iaô\u001dy¹ÿ\u0002NÎÎ\u008brWÑ\u0010HÜ×\u0099Peÿ.Zêí·[sÌ<Hø×E]\u0001ÛÊw\u0096ÓSN\u001fÒ\u0089Ú2kþë»Wgô mìò©uUÚ\u001e\u007fÚÍ\u0087rCþ\flÈÞum1þúu¦ïcW/òèh\u0094ïQ~\u001dõÆ~\u0082é\u0000A»ðwp2Ìîo©öei îÜV\u0097éSd\u000eåÊo\u0085ÖAiüå¸w4î\u008fKCù\u0006FÚÊ\u009dXQì\u0014@èÁ£[gÝ:@þÃ±CuÊÈ]\u008cæGB\u001bßÞC\u009có'BëÂ®~rÝ5DùÛ¼\\@ó\u000bVÏð\u0092SVÁ\u0019W\u0083|8ÐôI±ðmU*çæX£Ô_F\u0000M»áwx2Éîn©ôee òÜs\u0097ôSi\u000eôÊi\u0085áAlüÁ¸d\u0000M»áwx2Òîe©÷ea òÜd\u0097åSd\u000eÁÊd\u0000M»áwx2Áîd©Öei åÜw\u0097ÉSm\u000eðÊlã.X\u0082\u0094\u001bÑ¥\r\u0016J\u008f\u0086\u000fÃ\u0090?\u0000t\u0091°\u0006í\u0086)\rf¢¢\u0007\u001fª[\u000e\u0090\u0093Ì\u000f\u0000M»áwx2Áîd©áep ôÜe\u0097òSP\u000eáÊr\u0085áAmüå¸tså/rêó¦Iaí\u001dpØì\u0000M»åwd2éîa©ôei ïÜn\u0097ÓSe\u000eòÊv\u0085éAcüå¸Isí/pêìÐékE§Üâe>ÀyEµÔðP\fÁGV\u0000M»áwx2Áîd> \u0085\u008cI\u0015\f¬Ð\t\u0097«[\u0002\u001e\u009fâ\u0000©\u008cm\u0019\u0000M»áwx2Áîd©Ìei óÜt\u0097åSn\u000eåÊr\u0000M»áwx2Áîd©Öei åÜw\u0097ÁSd\u000eÌÊi\u0085óAtüå¸nså/r\u0000M»áwx2Òîe©÷ea òÜd\u0000M»áwx2Òîe©÷ea òÜd\u0097åSd\u000eÁÊd\u0085ÌAiüó¸tså/nêå¦r\u0000M»åwd2éîa©ôei ïÜn\u0097ÁSd\u000eáÊp\u0085ôAeüò¸Bsá/sêå\u0000A»ðwp2Ìîo©öei îÜM\u0097åSd\u000eéÊa\u0085ôAiüï¸nsÁ/dêá¦paô\u001deØòUdîÌ\"MgÀ»HüÝ0@uÆ\u0089GÂè\u0006M[È\u009fYÐÝ\u0014L©Ûí{&Æz\\¿ÝóL4Û\u0000M»áwx2Áîd©Öei åÜw\u0097ÁSd\u000eáÊp\u0085ôAeüòÚða\\\u00adÅèt4ÓsI¿ØúO\u0006ÎMI\u0089ÔÔI\u0010Ô_\\\u009bÑ&|bÙ©\\õÍ0I|Ø»O\u008b&0\u008aü\u0013¹¹e\u000e\"\u009cî\n«\u0099W\u000f\u001c\u008eØ\u000f\u0085ªA\u000f\u000e\u008aÊ\u001bw\u009f3\u000eø\u0099\u0000M»áwx2Óîi©çen áÜl\u0097ÐSr\u000eïÊv\u0085éAdüå¸r6:\u008d\u0096A\u000f\u0004¶Ø\u0013\u009f\u0096S\u0007\u0016\u0083ê\u0012¡\u0085e'8\u0096ü\u0005³\u0096w\u001aÊ\u0092\u008e\u0003E\u0092\u0019\u0005Ü\u0084\u007feÄÉ\bPMé\u0091LÖÉ\u001aX_Ü£MèÚ,zqÍµ[úØ>G\u0083ÆÇ[\fÍPx\u0095ÉÙZ\u001eÉbE§Íë\\0ÍtZ¹Û\u0000M»áwx2Áîd©áep ôÜe\u0097òSS\u000eéÊg\u0085îAaüì¸Csï/lêì¦eaã\u001dtØé\u0094oOî\u000bPÆá\u0082r=áùm´åpt+åçr¢ó\u0087Ý<qðèµQiô.qâà§d[õ\u0010bÔÙ\u0089~Mù\u0002dÆù{q?üôy¨êmq!äæy\u009aÿ_~\u0013ÀÈq\u008câAq\u0005ýºu~ä3u÷â¬c\u0000M»áwx2Áîd©áep ôÜe\u0097òSL\u000eéÊs\u0085ôAeüî¸esò\u001bp ÜlE)üõY²ë~T;ØÇJ\u008cüHY\u0015ÜÑM\u009eÉZXçÏ£qhÔ4NñÉ½XzÓ\u0006XÃÏ\u0000M»áwx2Éîn©ôee òÜs\u0097ôSi\u000eôÊi\u0085áAlüÁ¸dsá/pêô¦eaò\u001dLØé\u0094sOô\u000beÆî\u0082e=òèÑS}\u009fäÚN\u0006ùAk\u008dýÈn4ø\u007fy»øæ]\"øm}©ì\u0014hPù\u009bnÇÐ\u0002uNï\u0089hõù0r|ù§n\u0000M»áwx2Óîi©çen áÜl\u0097ÃSo\u000eìÊl\u0085åAcüô¸isï/nêÌ¦iaó\u001dtØå\u0094nOå\u000brRnéÂ%[`æ¼QûÑ7LrÑUùîH\"Ègt»×üN0ÑuV\u0089úÂJ\u0006×[Y\u009fÜÐ[\u0014Ù©KíÌ&uzÙ¿VóÙ4_HÝ\u008dJL´÷\u0005;\u0085~9¢\u009aå\u0003)\u009cl\u001b\u0090·Û\u0007\u001f\u009aB\u0014\u0086\u0091É\u0016\r\u0094°\u0006ô\u0081?8c\u0094¦\u001bê\u0094-\u0012Q\u0090\u0094\u0007Ø§\u0003\u0010G\u0096\u008a\u0010Î\u009cq\u0003µ\u0090ø\u0007\u0000A»ðwp2Ìîo©öei îÜC\u0097ïSm\u000eíÊu\u0085îAiüã¸asô/oêò¦Maå\u001dsØó\u0094aOç\u000beÍ\u0092v>º¼ÿ<#¤d?¨¸í2\u0011°Z%\u009e¾Ã#\u0007\u009cH4\u008c¢1\"u°¾6â´'\u0018k¼¬!Ð½\u0000A»ðwp2Ìîo©öei îÜC\u0097ïSm\u000eíÊu\u0085îAiüã¸asô/oêò§¶\u001c\u0007Ð\u0087\u0095;I\u0098\u000e\u0001Â\u009e\u0087\u0019{´0\u0018ô\u009a©\u001am\u0082\"\u0019æ\u009e[\u0014\u001f\u0096Ô\u0003\u0088\u0098M\u0005\u0001¤Æ\u0002º\u0095\u007f\u00043\u0094è\u0005¬\u009ea\u0015%\u0092\u009a\u0005\u0000A»ðwp2Ìîo©öei îÜC\u0097ïSm\u000eíÊu\u0085îAiüã¸asô/oêò¦Paõ\u001dbØì\u0094iOó\u000bhÆå\u0082r\u0000A»ðwp2Ìîo©öei îÜC\u0097ïSm\u000eíÊu\u0085îAiüã¸asô/oêò¦Maå\u001dsØó\u0094aOç\u000biÆî\u0082g=Óùe´òpv+éçc¢å[\u008eà?,¿i\u0003µ ò9>¦{!\u0087\u008cÌ \b¢U\"\u0091ºÞ!\u001a¦§,ã®(;t ±=ý\u008a:!F»\u0083&Ï»\u00146/ú\u0094KXË\u001dwÁÔ\u0086MJÒ\u000fUóý¸N|×!WåÈªXnÉÓ^\u0097Þ\\U\u0000ïÅS\u0089ÞNV2Þ÷_»ú`X$ÏéR\u00adÍ\u0012RÖÏ\u009bB\u0000c»ïwm2®îa©ðep ìÜo\u0097öSi\u000eîÊ.\u0085áAdüö¸iså/wê®¦Aað\u001dpØÌ\u0094oOö\u000biÆî\u0082F=õùl´ìps+ãçr¢å^e\u0019îÕT\u0090èLe\u0007íÃe~ä:Aõã±tlé(vãé\u009ftZù¿3\u0004\u009fÈ\u0006\u008d°Q\u001f\u0016\u008aÚ\u0017\u009f\u0088c\u001b(¿ì\u001a\u0000M»áwx2Îîa©ôei öÜe\u0097ÁSd\u000eÌÊi\u0085óAtüå¸nså/r\u008dl6ÀúY¿ïc@$ÕèH\u00ad×QD\u001aàÞE\u0083íGN\bÀÌEqÄ5SòàIL\u0085ÕÀc\u001cÌ[Y\u0097ÄÒ[.Èel¡Éüd8Àw]³Á\u0000M»áwx2Îîa©ôei öÜe\u0097ÁSd\u000eÖÊi\u0085åAw\u0000c»ïwm2®îa©ðep ìÜo\u0097öSi\u000eîÊ.\u0085íAeüä¸isá/têé¦oaî\u001d.Øî\u0094aOô\u000biÆö\u0082e=Áùd´óp.+Íça¢ø^N\u0019áÕt\u0090éLv\u0007åÃA~ä:Võé±el÷þÆEj\u0089óÌE\u0010êW\u007f\u009bâÞ}\"îiJ\u00adïð]4â{n¿ü\u0002IFâ\u008deÑï\u0014nXù\u0000A»ðwp2Ìîo©öei îÜN\u0097áSt\u000eéÊv\u0085åAAüäÚ¶a\u0007\u00ad\u0087è;4\u0098s\u0001¿\u009eú\u0019\u0006¹M\u0016\u0089\u0083Ô\u001e\u0010\u0081_\u0012\u009b¶&\u0013b²©\u0001õ\u00920\u0019|\u0083»;Ç\u009e\u0002\u0004N\u0083\u0095\u0012Ñ\u0099\u001c\u0012X\u0085\u0000A»ðwp2Ìîo©öei îÜN\u0097áSt\u000eéÊv\u0085åAAüä¸Sså/rêö¦iaã\u001de\u0000A»ðwp2Ìîo©öei îÜM\u0097åSd\u000eéÊa\u0085ÖAiüå¸wV½í\f!\u008cd0¸\u0093ÿ\n3\u0095v\u0012\u008aªÁ\u001d\u0005\u008fX\b\u009c±Ó\u0019\u0017\u0098ª\u0015î\u009d%*y\u0095¼\u0019ð\u008b\u0000A»ðwp2Ìîo©öei îÜN\u0097áSt\u000eéÊv\u0085åAAüä¸Isí/pêìnÔÕG\u0019Ð\\Q\u0080ËÇM\u000bÌ\u0081\u009c:\u001eö¦³\u0019o\u009e(&äì¡\u001f]é\u0016\u001eÒ¦\u008ff}§Æ1\n O\u0015\u0093°Ô\u0017\u0018¸]=¡·ê?.\u0098s=·§ø <±\u0081:Å±\u000e&·º\f,À½\u0085\bY\u00ad\u001e\u001fÒ \u0097-k¬ &ä\u0099¹%}¨20ö«K(\u000fªÄ\"\u0098\u0085] \u0011ºÖ=ª¬o'#¬ø;\u0000s»åwt2Áîd©Äei óÜp\u0097ìSa\u000eùÊL\u0085éAsüô¸esî/eêò\u0000g»åwt2Áîd©Öei åÜw\u0097ÃSo\u000eîÊt\u0085òAoüì¸lså/rs\u0011È\u0093\u0004\u0002A·\u009d\u0012Ú¿\u0016\u0012S¸¯\u0003ä\u009b \u0014}\u0093¹\u0004\u0000g»åwt2Óîi©úee}ëÆi\nøOX\u0093õÔ|\u0018éü\u008dG\u000f\u008b\u009eÎ0\u0012\u0085U\u0004\u0099\u008fÜ# \u008e\u0000g»åwt2Ãîr©åea ôÜi\u0097öSe\u000eÉÊd\u0000i»ówV2éîd©åeo ÁÜdÄÁ\u007f[³êöI*ÆmF¡ÍäZ\u0002\u0083¹\u0019u£0\u0004ì\u0089«\u000fg\u0084\"\u001eÞ\u0083\u0095\u001cQ\u0083\f\u0010È\u008f\u0087\u000eC«þ\u000e\u0097Ã,AàÐ¥eyÔ>Tòè·KKÒ\u0000MÄÊ\u0099f]Ö\u0012KÖÅk@/ÇäE¸×}P1éöE\u008aÊOE\u0003ÃØA\u009cÖ0\u0002\u008b\u0095G\u0017\u0002\u0099Þ\u0003\u0099\u0084U\u0015\u0010\u0082ì1§\u0080c\u0000>¼ú\u001fµ\u0086q\u0019Ì\u009e\u00882C\u0082\u001f\u001fÚ\u0091\u0096\u0014Q\u0093-\u0011è\u0083¤\u0004\u007f¢;\u0015ö\u0093²\u0015\r\u0099É\u0006\u0084\u0095@\u0002\u0082\u00189\u0083õ\u001f°\u0088l\n+\u0084ç\u001e¢\u0099^\b\u0015\u009fÑ,\u008c\u009dH\u001d\u0007¡Ã\u0002~\u009b:\u0004ñ\u0083\u00ad/h\u009f$\u0002ã\u008c\u009f\tZ\u008e\u0016\fÍ\u009e\u0089\u0019D¿\u0000\b¿\u008e{\b6\u0084ò\u001b©\u0088e\u001f\u0000g»åwt2Áîp©ðeL ïÜv\u0097éSn\u000eÃÊo\u0085íAmüõ¸nsé/cêá¦taï\u001drØÍ\u0094eOó\u000bsÆá\u0082g=åùD´ápt+á\u0085¬>*ò½·,k¼,-à¶¥=Yº\u0012\u000bÖ°\u008b\u001eO¯\u0000/Ä\u0093y0=©ö6ª±o\u001c#°ä2\u0098²]*\u0011±Ê6\u008e¼C>\u0007«¸0|\u00ad6ð\u008drAã\u0004YØö\u009fcSþ\u0016aêò¡Veó8Züö³~wùÊ^\u008eúEv\u0019ðÜr\u0090ÂWe+þ\u0082\u00179\u0081õ\u0010°ªl\u0005+\u0090ç\r¢\u0092^\u0001\u0015¥Ñ\u0000\u008c¡H\u0012\u0007\u0081Ã\n~\u0090:(ñ\u008d\u00ad\u0017h\u0090$\u0001ã\u008a\u009f\u0001Z\u0096\u0000g»åwt2Îîa©ôei öÜe\u0097ÁSd\u000eÉÊc\u0085ïAnüÕ¸rsé".getBytes(CharEncoding.ISO_8859_1)).asCharBuffer().get(cArr, 0, 2053);
        f766 = cArr;
        f765 = 3143407519750077312L;
    }

    public bi(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static boolean m796(AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            int i2 = f767 + 33;
            f764 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 67 / 0;
                if (m803(appLovinAd) == AppLovinAdSize.BANNER) {
                    return true;
                }
            } else if (m803(appLovinAd) == AppLovinAdSize.BANNER) {
                return true;
            }
            f764 = (f767 + 65) % 128;
            if (m803(appLovinAd) == AppLovinAdSize.LEADER) {
                return true;
            }
            int i4 = f764 + 29;
            f767 = i4 % 128;
            if (i4 % 2 != 0) {
                m803(appLovinAd);
                int i5 = AppLovinAdSize.SPAN;
                throw null;
            }
            if (m803(appLovinAd) == AppLovinAdSize.MREC) {
                return true;
            }
        }
        f764 = (f767 + 17) % 128;
        return false;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static boolean m797(AppLovinAd appLovinAd) {
        if (appLovinAd == null || !appLovinAd.getType().equals(AppLovinAdType.INCENTIVIZED)) {
            f767 = (f764 + 43) % 128;
            return false;
        }
        int i2 = f764 + 45;
        f767 = i2 % 128;
        return i2 % 2 == 0;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static boolean m798(AppLovinAd appLovinAd) {
        int i2 = f767 + 89;
        f764 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsVideoAd = appLovinAd.isVideoAd();
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        int i5 = f767 + 119;
        f764 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return zIsVideoAd;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static AppLovinAdType m799(AppLovinAd appLovinAd) {
        int i2 = f764 + 37;
        f767 = i2 % 128;
        if (i2 % 2 == 0) {
            return appLovinAd.getType();
        }
        appLovinAd.getType();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m800(AppLovinAd appLovinAd) {
        f767 = (f764 + 55) % 128;
        String zoneId = appLovinAd.getZoneId();
        f767 = (f764 + 83) % 128;
        return zoneId;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long m801(AppLovinAd appLovinAd) {
        int i2 = f764 + 1;
        f767 = i2 % 128;
        if (i2 % 2 == 0) {
            return appLovinAd.getAdIdNumber();
        }
        appLovinAd.getAdIdNumber();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ boolean m802(AppLovinAd appLovinAd) {
        int i2 = f767 + 63;
        f764 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM797 = m797(appLovinAd);
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
        return zM797;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static AppLovinAdSize m803(AppLovinAd appLovinAd) {
        f764 = (f767 + 11) % 128;
        AppLovinAdSize size = appLovinAd.getSize();
        int i2 = f764 + 9;
        f767 = i2 % 128;
        if (i2 % 2 == 0) {
            return size;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Uri m804(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        f767 = (f764 + 115) % 128;
        Uri uriM812 = m812(appLovinNativeAdImpl);
        int i2 = f764 + 15;
        f767 = i2 % 128;
        if (i2 % 2 == 0) {
            return uriM812;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ AppLovinBroadcastManager m813(Context context) {
        f767 = (f764 + 89) % 128;
        AppLovinBroadcastManager appLovinBroadcastManagerM805 = m805(context);
        int i2 = f764 + 31;
        f767 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 43 / 0;
        }
        return appLovinBroadcastManagerM805;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m819(AppLovinAd appLovinAd) {
        int i2 = f764 + 121;
        f767 = i2 % 128;
        if (i2 % 2 != 0) {
            m800(appLovinAd);
            throw null;
        }
        String strM800 = m800(appLovinAd);
        int i3 = f767 + 19;
        f764 = i3 % 128;
        if (i3 % 2 != 0) {
            return strM800;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ long m822(AppLovinAd appLovinAd) {
        int i2 = f764 + 45;
        f767 = i2 % 128;
        if (i2 % 2 != 0) {
            m801(appLovinAd);
            throw null;
        }
        long jM801 = m801(appLovinAd);
        f767 = (f764 + 77) % 128;
        return jM801;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Uri m829(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i2 = f767 + 91;
        f764 = i2 % 128;
        if (i2 % 2 != 0) {
            return m823(appLovinNativeAdImpl);
        }
        m823(appLovinNativeAdImpl);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m806(MaxAd maxAd) {
        int i2 = f767 + 71;
        f764 = i2 % 128;
        if (i2 % 2 != 0) {
            return m833(maxAd);
        }
        m833(maxAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ AppLovinAdSize m814(AppLovinAd appLovinAd) {
        f764 = (f767 + 5) % 128;
        AppLovinAdSize appLovinAdSizeM803 = m803(appLovinAd);
        int i2 = f767 + 83;
        f764 = i2 % 128;
        if (i2 % 2 != 0) {
            return appLovinAdSizeM803;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m820(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver) {
        int i2 = f764 + 115;
        f767 = i2 % 128;
        int i3 = i2 % 2;
        m817(appLovinBroadcastManager, receiver);
        if (i3 != 0) {
            throw null;
        }
        f764 = (f767 + 39) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Bundle m824(CommunicatorMessageImpl communicatorMessageImpl) {
        int i2 = f767 + 67;
        f764 = i2 % 128;
        if (i2 % 2 != 0) {
            return m830(communicatorMessageImpl);
        }
        m830(communicatorMessageImpl);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ AppLovinAdType m832(AppLovinAd appLovinAd) {
        int i2 = f764 + 83;
        f767 = i2 % 128;
        int i3 = i2 % 2;
        AppLovinAdType appLovinAdTypeM799 = m799(appLovinAd);
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        int i5 = f764 + 101;
        f767 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
        return appLovinAdTypeM799;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m808(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        int i2 = f767 + 87;
        f764 = i2 % 128;
        int i3 = i2 % 2;
        m816(appLovinInterstitialAdDialog, appLovinAdVideoPlaybackListener);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m815(AdViewController adViewController, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        f767 = (f764 + 83) % 128;
        m807(adViewController, appLovinAdDisplayListener);
        int i2 = f767 + 77;
        f764 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 52 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m821(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver, IntentFilter intentFilter) {
        int i2 = f767 + 69;
        f764 = i2 % 128;
        int i3 = i2 % 2;
        m818(appLovinBroadcastManager, receiver, intentFilter);
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        int i5 = f764 + 83;
        f767 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ AdViewController m825(AppLovinAdView appLovinAdView) {
        int i2 = f767 + 43;
        f764 = i2 % 128;
        int i3 = i2 % 2;
        AdViewController adViewControllerM831 = m831(appLovinAdView);
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        f767 = (f764 + 7) % 128;
        return adViewControllerM831;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m834(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdClickListener appLovinAdClickListener) {
        int i2 = f767 + 63;
        f764 = i2 % 128;
        int i3 = i2 % 2;
        m828(appLovinInterstitialAdDialog, appLovinAdClickListener);
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m809(AppLovinNativeAdImpl appLovinNativeAdImpl, AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        int i2 = f767 + 47;
        f764 = i2 % 128;
        int i3 = i2 % 2;
        m835(appLovinNativeAdImpl, appLovinNativeAdEventListener);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m828(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdClickListener appLovinAdClickListener) {
        f767 = (f764 + 63) % 128;
        appLovinInterstitialAdDialog.setAdClickListener(appLovinAdClickListener);
        f767 = (f764 + 117) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m836(bi biVar, AppLovinAd appLovinAd) {
        int i2 = f767 + 81;
        f764 = i2 % 128;
        if (i2 % 2 == 0) {
            m796(appLovinAd);
            throw null;
        }
        boolean zM796 = m796(appLovinAd);
        int i3 = f767 + 21;
        f764 = i3 % 128;
        if (i3 % 2 != 0) {
            return zM796;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m826(View.getDefaultSize(0, 0) + 18, 1663 - ExpandableListView.getPackedPositionType(0L), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32211)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bi.m834((AppLovinInterstitialAdDialog) list.get(0), (AppLovinAdClickListener) list.get(1));
                return null;
            }
        });
        map.put(m826(26 - KeyEvent.normalizeMetaState(0), 1681 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (47049 - Color.green(0))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bi.m808((AppLovinInterstitialAdDialog) list.get(0), (AppLovinAdVideoPlaybackListener) list.get(1));
                return null;
            }
        });
        map.put(m826(20 - (ViewConfiguration.getFadingEdgeLength() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1707, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bi.m815((AdViewController) list.get(0), (AppLovinAdDisplayListener) list.get(1));
                return null;
            }
        });
        map.put(m826((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19, 1728 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ViewConfiguration.getTouchSlop() >> 8)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bi.m825((AppLovinAdView) list.get(0));
            }
        });
        map.put(m826((ViewConfiguration.getPressedStateDuration() >> 16) + 13, 1745 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (Color.blue(0) + 29558)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return Long.valueOf(bi.m822((AppLovinAd) list.get(0)));
            }
        });
        map.put(m826(TextUtils.lastIndexOf("", '0', 0, 0) + 8, 1759 - TextUtils.getOffsetBefore("", 0), (char) (Color.rgb(0, 0, 0) + 16777216)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bi.m814((AppLovinAd) list.get(0));
            }
        });
        map.put(m826(7 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (Process.myPid() >> 22) + 1766, (char) (32141 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bi.m832((AppLovinAd) list.get(0));
            }
        });
        map.put(m826((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9, View.getDefaultSize(0, 0) + 1773, (char) (KeyEvent.keyCodeFromString("") + 64746)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bi.m819((AppLovinAd) list.get(0));
            }
        });
        map.put(m826(13 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 1782, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.24
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bi.m806((MaxAd) list.get(0));
            }
        });
        map.put(m826(TextUtils.indexOf("", "", 0, 0) + 9, 1795 - View.MeasureSpec.getSize(0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return Boolean.valueOf(bi.m811((AppLovinAd) list.get(0)));
            }
        });
        map.put(m826((ViewConfiguration.getDoubleTapTimeout() >> 16) + 8, (ViewConfiguration.getFadingEdgeLength() >> 16) + 1804, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 50345)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return Boolean.valueOf(bi.m836(bi.this, (AppLovinAd) list.get(0)));
            }
        });
        map.put(m826(Color.rgb(0, 0, 0) + 16777232, 1812 - TextUtils.getOffsetBefore("", 0), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 745)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return Boolean.valueOf(bi.m802((AppLovinAd) list.get(0)));
            }
        });
        map.put(m826(TextUtils.indexOf("", "") + 27, (ViewConfiguration.getScrollBarSize() >> 8) + 1828, (char) (ExpandableListView.getPackedPositionGroup(0L) + 38820)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bi.m813((Context) list.get(0));
            }
        });
        map.put(m826((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 33, 1855 - TextUtils.getOffsetAfter("", 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 12401)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bi.m821((AppLovinBroadcastManager) list.get(0), (AppLovinBroadcastManager.Receiver) list.get(1), (IntentFilter) list.get(2));
                return null;
            }
        });
        map.put(m826(35 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1887 - TextUtils.indexOf((CharSequence) "", '0'), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 33390)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bi.m820((AppLovinBroadcastManager) list.get(0), (AppLovinBroadcastManager.Receiver) list.get(1));
                return null;
            }
        });
        map.put(m826((ViewConfiguration.getScrollBarSize() >> 8) + 34, 1923 - (Process.myTid() >> 22), (char) Color.blue(0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bi.m824((AppLovinCommunicatorMessage) list.get(0));
            }
        });
        map.put(m826(((Process.getThreadPriority(0) + 20) >> 6) + 31, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1956, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 34270)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bi.m810(bi.this, (Context) list.get(0), (String) list.get(1), (String) list.get(2));
                return null;
            }
        });
        map.put(m826(MotionEvent.axisFromString("") + 24, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1989, (char) (TextUtils.lastIndexOf("", '0') + 13976)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bi.m804((AppLovinNativeAdImpl) list.get(0));
            }
        });
        map.put(m826(23 - TextUtils.indexOf((CharSequence) "", '0'), ExpandableListView.getPackedPositionGroup(0L) + 2011, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33379)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bi.m809((AppLovinNativeAdImpl) list.get(0), (AppLovinNativeAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m826((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 18, 2035 - Gravity.getAbsoluteGravity(0, 0), (char) View.combineMeasuredStates(0, 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bi.m829((AppLovinNativeAdImpl) list.get(0));
            }
        });
        int i2 = f767 + 111;
        f764 = i2 % 128;
        if (i2 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0205  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        byte b2;
        switch (str.hashCode()) {
            case -2080431557:
                b2 = !str.equals(m826('K' - AndroidCharacter.getMirror('0'), 1096 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) View.MeasureSpec.getMode(0)).intern()) ? (byte) -1 : (byte) 54;
                break;
            case -2043340463:
                b2 = !str.equals(m826(26 - (Process.myTid() >> 22), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 981, (char) (59548 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).intern()) ? (byte) -1 : (byte) 49;
                break;
            case -2004957298:
                b2 = !str.equals(m826((ViewConfiguration.getScrollBarSize() >> 8) + 24, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 671, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 36;
                break;
            case -1881559119:
                b2 = !str.equals(m826(20 - (KeyEvent.getMaxKeyCode() >> 16), View.combineMeasuredStates(0, 0) + 1624, (char) Drawable.resolveOpacity(0, 0)).intern()) ? (byte) -1 : (byte) 75;
                break;
            case -1833485839:
                b2 = !str.equals(m826(Gravity.getAbsoluteGravity(0, 0) + 16, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1518, (char) View.getDefaultSize(0, 0)).intern()) ? (byte) -1 : (byte) 70;
                break;
            case -1467734148:
                b2 = !str.equals(m826(25 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 164, (char) (9615 - (ViewConfiguration.getJumpTapTimeout() >> 16))).intern()) ? (byte) -1 : (byte) 8;
                break;
            case -1450375470:
                if (!str.equals(m826(Process.getGidForName("") + 20, 1383 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    f764 = (f767 + 55) % 128;
                    b2 = 64;
                }
                break;
            case -1375681914:
                b2 = !str.equals(m826(TextUtils.lastIndexOf("", '0') + 23, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 304, (char) (AndroidCharacter.getMirror('0') + 41937)).intern()) ? (byte) -1 : (byte) 14;
                break;
            case -1352001524:
                b2 = !str.equals(m826(Color.blue(0) + 13, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 487, (char) KeyEvent.keyCodeFromString("")).intern()) ? (byte) -1 : (byte) 24;
                break;
            case -1287385676:
                if (!str.equals(m826((ViewConfiguration.getFadingEdgeLength() >> 16) + 30, 1167 - (ViewConfiguration.getTouchSlop() >> 8), (char) (42999 - KeyEvent.getDeadChar(0, 0))).intern())) {
                    b2 = -1;
                } else {
                    int i2 = f764 + 107;
                    f767 = i2 % 128;
                    b2 = i2 % 2 == 0 ? (byte) 57 : (byte) 73;
                }
                break;
            case -1229948432:
                b2 = str.equals(m826(31 - TextUtils.indexOf("", "", 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 28235)).intern()) ? (byte) 10 : (byte) -1;
                break;
            case -1201363365:
                if (!str.equals(m826(13 - Gravity.getAbsoluteGravity(0, 0), 589 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    f767 = (f764 + 73) % 128;
                    b2 = 31;
                }
                break;
            case -1179967667:
                b2 = !str.equals(m826(21 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1497 - Color.blue(0), (char) (65163 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern()) ? (byte) -1 : (byte) 69;
                break;
            case -1153520596:
                b2 = !str.equals(m826(19 - Process.getGidForName(""), 1147 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) View.combineMeasuredStates(0, 0)).intern()) ? (byte) -1 : (byte) 56;
                break;
            case -1109694355:
                b2 = !str.equals(m826(32 - View.MeasureSpec.getMode(0), Color.blue(0) + 272, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern()) ? (byte) -1 : (byte) 13;
                break;
            case -1073613085:
                b2 = !str.equals(m826((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19, 602 - TextUtils.getTrimmedLength(""), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 32;
                break;
            case -1046364472:
                b2 = !str.equals(m826(Gravity.getAbsoluteGravity(0, 0) + 20, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 651, (char) (Process.myPid() >> 22)).intern()) ? (byte) -1 : (byte) 35;
                break;
            case -998829219:
                b2 = !str.equals(m826(36 - TextUtils.getOffsetAfter("", 0), (KeyEvent.getMaxKeyCode() >> 16) + 1226, (char) Color.red(0)).intern()) ? (byte) -1 : (byte) 59;
                break;
            case -922738309:
                b2 = !str.equals(m826((Process.myPid() >> 22) + 34, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 36, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1)).intern()) ? (byte) -1 : (byte) 3;
                break;
            case -859912744:
                b2 = !str.equals(m826(View.MeasureSpec.getSize(0) + 52, 1319 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) TextUtils.indexOf("", "")).intern()) ? (byte) -1 : (byte) 62;
                break;
            case -812800838:
                b2 = !str.equals(m826(View.getDefaultSize(0, 0) + 10, 11 - TextUtils.getTrimmedLength(""), (char) Color.alpha(0)).intern()) ? (byte) -1 : (byte) 1;
                break;
            case -781635730:
                b2 = !str.equals(m826(28 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 113, (char) (12344 - TextUtils.lastIndexOf("", '0', 0))).intern()) ? (byte) -1 : (byte) 6;
                break;
            case -702340466:
                if (!str.equals(m826(48 - (Process.myPid() >> 22), ExpandableListView.getPackedPositionType(0L) + 1449, (char) TextUtils.getOffsetAfter("", 0)).intern())) {
                    b2 = -1;
                } else {
                    int i3 = f764 + 109;
                    f767 = i3 % 128;
                    b2 = i3 % 2 == 0 ? (byte) 68 : (byte) 85;
                }
                break;
            case -558305015:
                b2 = !str.equals(m826((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 21, 631 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) View.resolveSizeAndState(0, 0, 0)).intern()) ? (byte) -1 : (byte) 34;
                break;
            case -529676547:
                b2 = !str.equals(m826(29 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1534 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 56056)).intern()) ? (byte) -1 : (byte) 71;
                break;
            case -515103971:
                b2 = !str.equals(m826(17 - (ViewConfiguration.getTapTimeout() >> 16), 773 - Color.argb(0, 0, 0, 0), (char) TextUtils.indexOf("", "", 0)).intern()) ? (byte) -1 : (byte) 41;
                break;
            case -499617006:
                b2 = !str.equals(m826(TextUtils.getTrimmedLength("") + 32, (ViewConfiguration.getLongPressTimeout() >> 16) + 1065, (char) (Gravity.getAbsoluteGravity(0, 0) + 19701)).intern()) ? (byte) -1 : (byte) 53;
                break;
            case -490511554:
                b2 = !str.equals(m826('?' - AndroidCharacter.getMirror('0'), 1419 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 62125)).intern()) ? (byte) -1 : (byte) 66;
                break;
            case -490128445:
                b2 = !str.equals(m826(AndroidCharacter.getMirror('0') - '!', 1434 - TextUtils.indexOf("", "", 0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 67;
                break;
            case -388222861:
                b2 = !str.equals(m826((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29, (-16776266) - Color.rgb(0, 0, 0), (char) TextUtils.getTrimmedLength("")).intern()) ? (byte) -1 : (byte) 48;
                break;
            case -313801005:
                b2 = !str.equals(m826(17 - Color.red(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 456, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 22;
                break;
            case -294317262:
                if (!str.equals(m826(29 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Color.alpha(0) + 85, (char) (Process.myPid() >> 22)).intern())) {
                    b2 = -1;
                } else {
                    int i4 = f767 + 67;
                    f764 = i4 % 128;
                    if (i4 % 2 != 0) {
                        b2 = 5;
                    } else {
                        b2 = 2;
                    }
                }
                break;
            case -292897006:
                b2 = !str.equals(m826(23 - (ViewConfiguration.getPressedStateDuration() >> 16), 1124 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (52689 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern()) ? (byte) -1 : (byte) 55;
                break;
            case -265039036:
                b2 = !str.equals(m826(16 - View.combineMeasuredStates(0, 0), Gravity.getAbsoluteGravity(0, 0) + 69, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -155576673:
                b2 = !str.equals(m826(22 - Drawable.resolveOpacity(0, 0), 733 - View.resolveSizeAndState(0, 0, 0), (char) (ExpandableListView.getPackedPositionChild(0L) + 55998)).intern()) ? (byte) -1 : (byte) 39;
                break;
            case -62837376:
                b2 = !str.equals(m826(TextUtils.indexOf((CharSequence) "", '0') + 23, 695 - KeyEvent.getDeadChar(0, 0), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 21801)).intern()) ? (byte) -1 : (byte) 37;
                break;
            case 9498927:
                b2 = !str.equals(m826(26 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 369, (char) (Color.red(0) + 35227)).intern()) ? (byte) -1 : (byte) 17;
                break;
            case 74118279:
                if (!str.equals(m826(5 - TextUtils.indexOf("", ""), 573 - ExpandableListView.getPackedPositionType(0L), (char) Color.red(0)).intern())) {
                    b2 = -1;
                } else {
                    f767 = (f764 + 91) % 128;
                    b2 = 29;
                }
                break;
            case 113294717:
                b2 = !str.equals(m826(18 - Color.blue(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 755, (char) (35692 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 40;
                break;
            case 113748919:
                b2 = !str.equals(m826((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24, 926 - TextUtils.indexOf("", ""), (char) (6973 - View.MeasureSpec.getMode(0))).intern()) ? (byte) -1 : (byte) 47;
                break;
            case 148784004:
                b2 = !str.equals(m826(23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Gravity.getAbsoluteGravity(0, 0) + 1563, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'))).intern()) ? (byte) -1 : (byte) 72;
                break;
            case 404925231:
                b2 = !str.equals(m826(26 - (KeyEvent.getMaxKeyCode() >> 16), ImageFormat.getBitsPerPixel(0) + 1263, (char) ((-16753713) - Color.rgb(0, 0, 0))).intern()) ? (byte) -1 : (byte) 60;
                break;
            case 448683812:
                if (!str.equals(m826((ViewConfiguration.getTouchSlop() >> 8) + 8, 1033 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (View.getDefaultSize(0, 0) + 21027)).intern())) {
                    b2 = -1;
                } else {
                    f764 = (f767 + 109) % 128;
                    b2 = 51;
                }
                break;
            case 572995203:
                b2 = !str.equals(m826(11 - (ViewConfiguration.getJumpTapTimeout() >> 16), ViewConfiguration.getKeyRepeatDelay() >> 16, (char) (14401 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern()) ? (byte) -1 : (byte) 0;
                break;
            case 605983675:
                b2 = !str.equals(m826(36 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 838, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 44;
                break;
            case 729244021:
                b2 = !str.equals(m826(TextUtils.getCapsMode("", 0, 0) + 24, 519 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern()) ? (byte) -1 : (byte) 26;
                break;
            case 735058557:
                b2 = !str.equals(m826(KeyEvent.keyCodeFromString("") + 20, 543 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) TextUtils.getTrimmedLength("")).intern()) ? (byte) -1 : (byte) 27;
                break;
            case 752486192:
                b2 = str.equals(m826((ViewConfiguration.getFadingEdgeLength() >> 16) + 29, (ViewConfiguration.getTouchSlop() >> 8) + 1197, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1)).intern()) ? (byte) 58 : (byte) -1;
                break;
            case 794586549:
                b2 = !str.equals(m826(20 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 790 - Drawable.resolveOpacity(0, 0), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13943)).intern()) ? (byte) -1 : (byte) 42;
                break;
            case 896010188:
                b2 = !str.equals(m826((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 8, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + p.e.f39014a, (char) (View.MeasureSpec.getMode(0) + 33585)).intern()) ? (byte) -1 : (byte) 21;
                break;
            case 983006005:
                b2 = !str.equals(m826((ViewConfiguration.getEdgeSlop() >> 16) + 34, 874 - (KeyEvent.getMaxKeyCode() >> 16), (char) (34705 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 45;
                break;
            case 1003087195:
                if (!str.equals(m826(21 - View.combineMeasuredStates(0, 0), 349 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (AndroidCharacter.getMirror('0') + 47502)).intern())) {
                    b2 = -1;
                } else {
                    int i5 = f767 + 15;
                    f764 = i5 % 128;
                    b2 = i5 % 2 != 0 ? (byte) 16 : (byte) 86;
                }
                break;
            case 1072916356:
                b2 = !str.equals(m826(20 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + TTAdConstant.VIDEO_URL_CODE, (char) (13487 - (Process.myTid() >> 22))).intern()) ? (byte) -1 : (byte) 19;
                break;
            case 1152082353:
                b2 = !str.equals(m826(17 - (ViewConfiguration.getTouchSlop() >> 8), 1402 - Color.red(0), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36129)).intern()) ? (byte) -1 : (byte) 65;
                break;
            case 1234617814:
                b2 = !str.equals(m826((ViewConfiguration.getDoubleTapTimeout() >> 16) + 28, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 809, (char) (32551 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 43;
                break;
            case 1265496546:
                b2 = !str.equals(m826(19 - (ViewConfiguration.getLongPressTimeout() >> 16), 500 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (58211 - TextUtils.getCapsMode("", 0, 0))).intern()) ? (byte) -1 : (byte) 25;
                break;
            case 1278030609:
                b2 = !str.equals(m826(((Process.getThreadPriority(0) + 20) >> 6) + 23, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 326, (char) View.combineMeasuredStates(0, 0)).intern()) ? (byte) -1 : (byte) 15;
                break;
            case 1318309173:
                b2 = !str.equals(m826(View.MeasureSpec.getSize(0) + 13, TextUtils.getOffsetBefore("", 0) + 474, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 23;
                break;
            case 1337781577:
                b2 = !str.equals(m826(TextUtils.indexOf("", "", 0) + 17, 397 - ExpandableListView.getPackedPositionGroup(0L), (char) TextUtils.getCapsMode("", 0, 0)).intern()) ? (byte) -1 : (byte) 18;
                break;
            case 1342402498:
                if (!str.equals(m826(23 - TextUtils.indexOf("", ""), 140 - TextUtils.lastIndexOf("", '0', 0), (char) (Process.myTid() >> 22)).intern())) {
                    b2 = -1;
                } else {
                    f767 = (f764 + 23) % 128;
                    b2 = 7;
                }
                break;
            case 1342953158:
                b2 = !str.equals(m826((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 21, View.MeasureSpec.getMode(0) + 1603, (char) (22268 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern()) ? (byte) -1 : (byte) 74;
                break;
            case 1383609003:
                b2 = !str.equals(m826(14 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 434, (char) (Drawable.resolveOpacity(0, 0) + 40114)).intern()) ? (byte) -1 : (byte) 20;
                break;
            case 1384123355:
                b2 = !str.equals(m826(15 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 243, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'))).intern()) ? (byte) -1 : (byte) 11;
                break;
            case 1384168212:
                b2 = !str.equals(m826(14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 258, (char) Color.blue(0)).intern()) ? (byte) -1 : (byte) 12;
                break;
            case 1384212095:
                if (!str.equals(m826(14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getJumpTapTimeout() >> 16) + 21, (char) Color.argb(0, 0, 0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 1384605075:
                b2 = !str.equals(m826((-16777207) - Color.rgb(0, 0, 0), 620 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 33;
                break;
            case 1450884094:
                b2 = !str.equals(m826(10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1372 - TextUtils.getOffsetAfter("", 0), (char) (KeyEvent.getDeadChar(0, 0) + 49022)).intern()) ? (byte) -1 : (byte) 63;
                break;
            case 1620186974:
                b2 = !str.equals(m826(11 - View.combineMeasuredStates(0, 0), 578 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (15981 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).intern()) ? (byte) -1 : (byte) 30;
                break;
            case 1724415069:
                b2 = !str.equals(m826(TextUtils.lastIndexOf("", '0') + 25, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + PsExtractor.PRIVATE_STREAM_1, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 9;
                break;
            case 1753212735:
                b2 = !str.equals(m826(18 - (ViewConfiguration.getEdgeSlop() >> 16), 908 - Color.green(0), (char) TextUtils.getCapsMode("", 0, 0)).intern()) ? (byte) -1 : (byte) 46;
                break;
            case 1880938499:
                b2 = !str.equals(m826(24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1040 - ExpandableListView.getPackedPositionChild(0L), (char) (KeyEvent.getDeadChar(0, 0) + 21944)).intern()) ? (byte) -1 : (byte) 52;
                break;
            case 1944524259:
                b2 = !str.equals(m826(16 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 717, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 38;
                break;
            case 1991372702:
                b2 = !str.equals(m826((-16777189) - Color.rgb(0, 0, 0), 1006 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) TextUtils.indexOf("", "")).intern()) ? (byte) -1 : (byte) 50;
                break;
            case 2016893291:
                b2 = !str.equals(m826(9 - MotionEvent.axisFromString(""), 563 - Color.alpha(0), (char) (KeyEvent.keyCodeFromString("") + 53412)).intern()) ? (byte) -1 : (byte) 28;
                break;
            case 2063749596:
                b2 = !str.equals(m826(32 - (Process.myPid() >> 22), 1288 - View.resolveSizeAndState(0, 0, 0), (char) (TextUtils.getOffsetAfter("", 0) + 12219)).intern()) ? (byte) -1 : (byte) 61;
                break;
            case 2145283122:
                if (!str.equals(m826(16 - TextUtils.lastIndexOf("", '0', 0, 0), (Process.myTid() >> 22) + 1586, (char) TextUtils.getOffsetBefore("", 0)).intern())) {
                    b2 = -1;
                } else {
                    f764 = (f767 + 69) % 128;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
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
            case 26:
                return MaxAdapterParametersImpl.class;
            case 27:
                return MediationServiceImpl.class;
            case 28:
                return MaxAdapter.class;
            case 29:
                return MaxAd.class;
            case 30:
                return MaxAdFormat.class;
            case 31:
                return MaxAdListener.class;
            case 32:
                return MaxAdViewAdListener.class;
            case 33:
                return MaxReward.class;
            case 34:
                return MaxRewardedAdListener.class;
            case 35:
                return MediationAdapterBase.class;
            case 36:
                return AppLovinMediationAdapter.class;
            case 37:
                return MediationAdapterRouter.class;
            case 38:
                return MaxAdViewAdapter.class;
            case 39:
                return MaxInterstitialAdapter.class;
            case 40:
                return MaxRewardedAdapter.class;
            case 41:
                return MaxSignalProvider.class;
            case 42:
                return MaxAdapterParameters.class;
            case 43:
                return MaxAdapterResponseParameters.class;
            case 44:
                return MaxAdapterSignalCollectionParameters.class;
            case 45:
                return MaxAdapterInitializationParameters.class;
            case 46:
                return MaxAdapterListener.class;
            case 47:
                return MaxAdViewAdapterListener.class;
            case 48:
                return MaxInterstitialAdapterListener.class;
            case 49:
                return MaxRewardedAdapterListener.class;
            case 50:
                return MaxSignalCollectionListener.class;
            case AD_REWARD_USER_VALUE:
                return MaxError.class;
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                return AppLovinBroadcastManager.class;
            case 53:
                return AppLovinBroadcastManager.Receiver.class;
            case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                return AppLovinCommunicatorMessage.class;
            case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                return CommunicatorMessageImpl.class;
            case 56:
                return AppLovinCommunicator.class;
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                return AppLovinCommunicatorSubscriber.class;
            case 58:
                return AppLovinCommunicatorPublisher.class;
            case 59:
                return AppLovinCommunicatorMessagingService.class;
            case 60:
                return AppLovinCommunicatorEntity.class;
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
            case 62:
                return AppLovinFullscreenThemedActivity.class;
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
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
            case mo.oom.onn /* 69 */:
                return MaxNativeAdViewBinder.class;
            case b.B0 /* 70 */:
                return AppLovinNativeAd.class;
            case 71:
                return AppLovinNativeAdEventListener.class;
            case 72:
                return AppLovinNativeAdService.class;
            case 73:
                return AppLovinMediaView.class;
            case mo.oom.ooo /* 74 */:
                return AppLovinVastMediaView.class;
            case mo.oom.oom /* 75 */:
                return AppLovinNativeAdImpl.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m810(bi biVar, Context context, String str, String str2) {
        f767 = (f764 + 63) % 128;
        biVar.m827(context, str, str2);
        f764 = (f767 + 49) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m827(Context context, final String str, String str2) {
        AppLovinCommunicator.getInstance(context).subscribe(new AppLovinCommunicatorSubscriber() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.13
            @Override // com.applovin.communicator.AppLovinCommunicatorEntity
            public final String getCommunicatorId() {
                return str;
            }

            @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
            public final void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
            }
        }, str2);
        int i2 = f764 + 67;
        f767 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 71 / 0;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        f764 = (f767 + 79) % 128;
        try {
            try {
                String str = (String) AppLovinSdk.class.getDeclaredField(m826(7 - (Process.myPid() >> 22), 1643 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 28291)).intern()).get(null);
                f764 = (f767 + 47) % 128;
                return str;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return hr.m2242().m2245().m2314(AppLovinSdk.class, m826(ImageFormat.getBitsPerPixel(0) + 13, Color.red(0) + 1651, (char) (33218 - Drawable.resolveOpacity(0, 0))).intern());
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m811(AppLovinAd appLovinAd) {
        f767 = (f764 + 69) % 128;
        boolean zM798 = m798(appLovinAd);
        int i2 = f764 + 3;
        f767 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
        }
        return zM798;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Uri m823(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i2 = f764 + 75;
        f767 = i2 % 128;
        if (i2 % 2 != 0) {
            appLovinNativeAdImpl.getIconUri();
            throw null;
        }
        Uri iconUri = appLovinNativeAdImpl.getIconUri();
        f764 = (f767 + 7) % 128;
        return iconUri;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m807(AdViewController adViewController, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        f767 = (f764 + 49) % 128;
        adViewController.setAdDisplayListener(appLovinAdDisplayListener);
        int i2 = f767 + 53;
        f764 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m826(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f766[i3 + i4]) ^ (((long) i4) * f765)) ^ ((long) c2));
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static AppLovinBroadcastManager m805(Context context) {
        int i2 = f764 + 43;
        f767 = i2 % 128;
        if (i2 % 2 != 0) {
            AppLovinBroadcastManager.getInstance(context);
            throw null;
        }
        AppLovinBroadcastManager appLovinBroadcastManager = AppLovinBroadcastManager.getInstance(context);
        f767 = (f764 + 123) % 128;
        return appLovinBroadcastManager;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static AdViewController m831(AppLovinAdView appLovinAdView) {
        f764 = (f767 + 105) % 128;
        AdViewController adViewController = appLovinAdView.getAdViewController();
        f767 = (f764 + 85) % 128;
        return adViewController;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m833(MaxAd maxAd) {
        int i2 = f764 + 35;
        f767 = i2 % 128;
        if (i2 % 2 == 0) {
            return maxAd.getCreativeId();
        }
        maxAd.getCreativeId();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Bundle m830(CommunicatorMessageImpl communicatorMessageImpl) {
        int i2 = f764 + 111;
        f767 = i2 % 128;
        if (i2 % 2 == 0) {
            return communicatorMessageImpl.getMessageData();
        }
        communicatorMessageImpl.getMessageData();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m835(AppLovinNativeAdImpl appLovinNativeAdImpl, AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        int i2 = f767 + 97;
        f764 = i2 % 128;
        int i3 = i2 % 2;
        appLovinNativeAdImpl.setEventListener(appLovinNativeAdEventListener);
        if (i3 == 0) {
            throw null;
        }
        f764 = (f767 + 19) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m816(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        int i2 = f764 + 103;
        f767 = i2 % 128;
        int i3 = i2 % 2;
        appLovinInterstitialAdDialog.setAdVideoPlaybackListener(appLovinAdVideoPlaybackListener);
        if (i3 != 0) {
            int i4 = 11 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m818(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver, IntentFilter intentFilter) {
        int i2 = f764 + 105;
        f767 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new IncompatibleClassChangeError();
        }
        throw new IncompatibleClassChangeError();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m817(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver) {
        f764 = (f767 + 123) % 128;
        throw new IncompatibleClassChangeError();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Uri m812(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i2 = f767 + 57;
        f764 = i2 % 128;
        if (i2 % 2 != 0) {
            return appLovinNativeAdImpl.getMainImageUri();
        }
        appLovinNativeAdImpl.getMainImageUri();
        throw null;
    }
}
