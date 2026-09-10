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
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.activity.DomainMBCommonActivity;
import com.mbridge.msdk.activity.MBBaseActivity;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.interstitialvideo.out.MBInterstitialVideoHandler;
import com.mbridge.msdk.mbbanner.view.MBBannerWebView;
import com.mbridge.msdk.newout.IMBRRewardVideoHandler;
import com.mbridge.msdk.newout.MBBidRewardVideoHandler;
import com.mbridge.msdk.newreward.player.BaseActivity;
import com.mbridge.msdk.newreward.player.MBRewardVideoActivity;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.out.MBInterstitialHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.video.module.MBridgeBaseView;
import com.mbridge.msdk.video.module.MBridgeClickCTAView;
import com.mbridge.msdk.video.module.MBridgeClickMiniCardView;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeH5EndCardView;
import com.mbridge.msdk.video.module.MBridgeLandingPageView;
import com.mbridge.msdk.video.module.MBridgeNativeEndCardView;
import com.mbridge.msdk.video.module.MBridgePlayableView;
import com.mbridge.msdk.video.module.MBridgeVastEndCardView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.widget.MBImageView;
import com.mintegral.msdk.MIntegralConstans;
import com.mintegral.msdk.MIntegralSDK;
import com.mintegral.msdk.activity.DomainMTGCommonActivity;
import com.mintegral.msdk.activity.MTGCommonActivity;
import com.mintegral.msdk.appwall.BottomRefreshListView;
import com.mintegral.msdk.appwall.MintegralAdActivity;
import com.mintegral.msdk.appwall.ShuffleFragment;
import com.mintegral.msdk.appwall.TabListFragment;
import com.mintegral.msdk.appwall.WallFragment;
import com.mintegral.msdk.appwall.report.eventcache.ImpressionCampaignExModel;
import com.mintegral.msdk.appwall.service.WallService;
import com.mintegral.msdk.appwall.view.WallViewPager;
import com.mintegral.msdk.appwall.viewpager.indicater.TabPageIndicator;
import com.mintegral.msdk.appwallex.TabListView;
import com.mintegral.msdk.appwallex.WallView;
import com.mintegral.msdk.base.entity.CampaignEx;
import com.mintegral.msdk.base.entity.CampaignUnit;
import com.mintegral.msdk.base.fragment.BaseFragment;
import com.mintegral.msdk.base.webview.BrowserView;
import com.mintegral.msdk.base.webview.WebViewFragment;
import com.mintegral.msdk.click.AppReceiver;
import com.mintegral.msdk.click.CommonJumpLoader;
import com.mintegral.msdk.interstitial.jscommon.interstitial;
import com.mintegral.msdk.interstitial.view.MTGInterstitialActivity;
import com.mintegral.msdk.interstitialvideo.out.InterstitialVideoListener;
import com.mintegral.msdk.interstitialvideo.out.MTGBidInterstitialVideoHandler;
import com.mintegral.msdk.interstitialvideo.out.MTGInterstitialVideoHandler;
import com.mintegral.msdk.mtgbanner.view.MTGBannerWebView;
import com.mintegral.msdk.mtgbid.out.BidManager;
import com.mintegral.msdk.mtgbid.out.BidResponsed;
import com.mintegral.msdk.mtgjscommon.authority.activity.MTGAuthorityActivity;
import com.mintegral.msdk.mtgjscommon.base.BaseWebView;
import com.mintegral.msdk.mtgjscommon.windvane.WindVaneWebView;
import com.mintegral.msdk.out.AppWallTrackingListener;
import com.mintegral.msdk.out.BannerAdListener;
import com.mintegral.msdk.out.Campaign;
import com.mintegral.msdk.out.IDownloadListener;
import com.mintegral.msdk.out.InterstitialListener;
import com.mintegral.msdk.out.LoadingActivity;
import com.mintegral.msdk.out.MIntegralSDKFactory;
import com.mintegral.msdk.out.MTGBannerView;
import com.mintegral.msdk.out.MTGBidRewardVideoHandler;
import com.mintegral.msdk.out.MTGConfiguration;
import com.mintegral.msdk.out.MTGInterstitialHandler;
import com.mintegral.msdk.out.MTGOfferWallHandler;
import com.mintegral.msdk.out.MTGRewardVideoHandler;
import com.mintegral.msdk.out.MtgBidCommonHandler;
import com.mintegral.msdk.out.MtgWallHandler;
import com.mintegral.msdk.out.NativeListener;
import com.mintegral.msdk.out.OnMTGMediaViewListener;
import com.mintegral.msdk.out.RewardVideoListener;
import com.mintegral.msdk.reward.player.MTGRewardVideoActivity;
import com.mintegral.msdk.rover.RoverCampaignUnit;
import com.mintegral.msdk.shell.MTGActivity;
import com.mintegral.msdk.system.a;
import com.mintegral.msdk.video.js.activity.AbstractActivity;
import com.mintegral.msdk.video.js.activity.AbstractJSActivity;
import com.mintegral.msdk.video.js.activity.VideoWebViewActivity;
import com.mintegral.msdk.video.module.MintegralBaseView;
import com.mintegral.msdk.video.module.MintegralClickCTAView;
import com.mintegral.msdk.video.module.MintegralClickMiniCardView;
import com.mintegral.msdk.video.module.MintegralContainerView;
import com.mintegral.msdk.video.module.MintegralH5EndCardView;
import com.mintegral.msdk.video.module.MintegralLandingPageView;
import com.mintegral.msdk.video.module.MintegralNativeEndCardView;
import com.mintegral.msdk.video.module.MintegralPlayableView;
import com.mintegral.msdk.video.module.MintegralVastEndCardView;
import com.mintegral.msdk.video.module.MintegralVideoView;
import com.mintegral.msdk.videocommon.dialog.MTGAlertDialog;
import com.mintegral.msdk.videocommon.listener.InterVideoOutListener;
import com.mintegral.msdk.widget.MTGImageView;
import com.p004ironsource.cs;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.f3.b;
import com.smartdigimkt.sdk.basead.ui.animplayerview.scale.AlbumScaleMainView;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.thinkup.core.common.n.mo;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class bt extends bg {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f984 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f985 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f986 = 122;

    public static class d extends bt {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f987 = 0;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f988 = null;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f989 = 1;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static long f990;

        static {
            char[] cArr = new char[2772];
            ByteBuffer.wrap("\u0000.0g`Æ\u0090\u0083Á\u001fñÝ!àRG\u0082\f²\u009eã^\u0013aC£sµ¤RÔ©\u0004þ57·V\u0087\u0002×Æ'¿v@Fô\u0096³åi5\u0014\u0005ÛTk¤5ôóÄ\u009b\u0013Bcö\u0000M0\u0004`ô\u0090\u0093ÁQñæ!¼Rz\u0082\u0004²æãF\u0013\u0004CÚs\u0088¤UÔ÷\u0004¿5oe\u0013\u0000M0\u0019`Ý\u0090µÁQñö!¯Ri\u0082\f²ããk\u0013+Cùs\u0086¤wÔà\u0004¤5te\u001c\u0095ÞÆpö(\u0015Ò% uz\u0085\u0006ÔßäR4/Gý\u0097º§Xöã\u0006¼VYf\u000e±ÆÁn\u0011\" ðp\u009a\u0080J\u0000A0/`é\u0090\u0093ÁFñà!\u00adRo\u0082)²Öãv\u0013&Cês\u0080¤BÔú\u0000A0/`é\u0090\u0093ÁFñà!\u00adRo\u0082\"²æãC\u0013,Cès\u0080¤@Ôê\u0004¤5dþ6Îb\u009e¦nÝ?,\u000f\u008eßÜ¬\u0016|zLº\u001d\u0000\u0000M0\u0019`Ý\u0090¤Á[ñì!£Rt\u0082\u0006²ôãa\u0013;Cõs\u009f¤_Ô÷\u0004©\u0000M0\u0019`Ý\u0090¦ÁAñõ!¦Rt\u0082\u001a²Üãv\u00136CÝs\u008a¤BÔê\u0004¦5te\u001e\u0095Î\u0000C0,`÷\u0090\u0097ÁUñè!©Ru\u0000C0,`÷\u0090\u0097ÁUñè!©Ru\u0082-²Í\u0088A¸+èæ\u0018\u008aINyß©¯Úw\n\u0005:ÒkE\u009b2Ëàû\u00ad,W\\ø\u008c¬½pí\f\u001dÚN~\u0000I0#`î\u0090\u0082ÁFñò!ºRr\u0082\u001c²Üãc\u0013#CÊs\u0080¤RÔæ\u0004¿5Qe\u0003\u0095ÄÆpö4&ðV\u008e\u0087J\u0012,\"Vr\u0093\u0082øÓ8ã\u009b3æ@\f\u0090r ®ñ\u0013\u0001}Q\u008baä¶<Æ\u0098\u0016À'\u0006wf\u0011\u001c!Hq\u008c\u0081ÿÐ\u000bà¤0úC8\u0093J£\u0090ò:\u0002jR¤bÙµ\u000bÅ\u0093\u0015â$8tR\u0084\u0090×<çt7¶\u0007ö7\u009cgQ\u0097=ÆùöM&\u0005UÍ\u0085£µcäÜ\u0014\u009cDot?£úÓH\u0003\n2Ìb°\u0092z\u0000M0\u0019`Ý\u0090¥ÁUñï! R~\u0082\u001a²ããk\u0013*Cë\u0000c0\"`÷\u0090ÉÁYñè! Ro\u0082\r²Òãp\u0013.CðsÇ¤[Ôð\u0004´5veD\u0095ØÆqö%&°V¦\u0087l·Âç\u0090\u0018~H\u0002x×©cÙ!\tö9\u0084j_\u009að\u0000M0\u0019`Ý\u0090¥ÁUñï! R~\u0082\u001a²âãg\u0013-CÊs\u0080¤SÔô\u0000c0\"`÷\u0090ÉÁYñè! Ro\u0082\r²Òãp\u0013.CðsÇ¤[Ôð\u0004´5veD\u0095ÚÆpö6&üV\u008a\u0087V·ëç·\u0018mHBxÏ©oÙ6\t×9Ãjw\u009aÓÊ\u0093ûc+\u000f[Õ\u008cf¼0ìÐ\u001c¸MY}ë\u00ad\u0080ÞJ\u000e\u0015>Ê\u0000M0\u0019`Ý\u0090®ÁZñõ!«Ri\u0082\u001b²Áãk\u0013;Cõs\u0088¤ZÔË\u0004±5se\u000e\u0095ÛÆaö#\u0000M0\u0019`Ý\u0090®ÁZñõ!«Ri\u0082\u001b²Áãk\u0013;Cõs\u0088¤ZÔÕ\u0004¹5ye\u000f\u0095ØÆLö0&ðV\u008f\u0087T·àç BÅr\u0091\"UÒ=\u0083Ù³~c'\u0010áÀ\u0084ðk¡ãQ£\u0001q1\u000eæö\u0096jF6wñ'\u008e×Z\u0084þ\u0000M0\u0019`Ý\u0090¥Á]ñå!\u0087Ru\u0082\u001c²Ðãp\u0013<Cès\u0080¤BÔê\u0004±5qe<\u0095ÞÆ`ö4&ñV£\u0087Y·ëç¶\u0018sH\txËY\u0014i@9\u0084Éü\u0098\u0004¨¼xÅ\u000b'ÛFë\u008dº)Jr\u001a\u0093*Ùý\u000b\u008d¿]æl\f<RÌ\u0080\u009f9¯d\u007f¢\u000fÀ\u0000W0,`ö\u0090\u008bÁrñó!¯R|\u0082\u0005²Ðãl\u0013;ö=Æ|\u0096©f\u00977\u0007\u0007¶×þ¤1tSD\u008c\u0015.åpµ®\u0085\u0099R\u0005\"®òêÃ(\u0093\u001ac\u00880*\u0000\u007fÐ· Ôq\nA·\u0011¢î\u0016¾S\u008e\u008b_4/Kÿ\u008cÏÒ\u009c\u0003l´<ï\r\u0011ÝD¥x\u0095\u001aÅØ5¸dtTÒ\u0084´÷D'-\u0017÷FQ¶\u0017æÏÖ\u00ad\u0000N0,`î\u0090\u008eÁBñä!\u009aRi\u0082\t²Öãi\u0013&Còs\u008e¤zÔê\u0004£5ie\u000f\u0095ÙÆaö#\u0000N0,`î\u0090\u008eÁBñä!\u008fR\u007f\u0082$²Üãq\u0013;Cùs\u0087¤SÔñX\thu8¢Èø\u0099\u001d©¥yê\n\u0007ÚRê\u009c»)Kl\u001b½+Ïü\u0019\u008c\u0087\\ñm&=VÍ\u009a\u009e\"®|~¤\u0000T0,`ø\u0090«Á]ñò!ºR]\u0082\u001a²Ôãe\u0013\"Cùs\u0087¤B#§\u0013ÑC\u001b³uâ¦Ò\u0019\u0002_q©¡î\u0091 À\u00910Ö`\rPs\u0087¶\u0000M0$`ô\u0090\u0093ÁQñæ!¼Rz\u0082\u0004²ôãf\u0013\u000eCÿs\u009d¤_Ôõ\u0004¹5ie\u0013-K\u001d+Mç½\u009aìRÜå\f\u0095\u007fw¯\u0007\u009fÎÎn>5ný^¬\u0089Vùù)\u00ad\u0018BH\n¸Ûëz\u0000T0,`ø\u0090·ÁUñæ!«RR\u0082\u0006²Ñãk\u0013,Cýs\u009d¤YÔñ\u0000W0,`ö\u0090\u008bÁbñè!«Rl\u00828²Ôãe\u0013*Cî$ú\u0014»Dn´PåÀÕq\u00059vö¦\u0094\u0096KÇé7·giW^\u0080Âði -\u0011ïAÝ±OâíÒ¸\u0002pr\u0013£Í\u0093pÃe<ðl\u009c\\E\u008dèýä-n\u001d\u0015NÏ¾rî\u001bßÑ\u000f\u0092\u007fU¨Á\u0098\u00adÈ\\8\u0013i×\u008cc¼\u0018ìÂ\u001c¿MS}Ð\u00ad\u0088ÞY\u000e5>âoS\u0000I0 `ê\u0090\u0095ÁQñò!½Rr\u0082\u0007²ÛãA\u0013.Cñs\u0099¤WÔê\u0004·5se/\u0095ÏÆIö>&úV\u008e\u0087T\u0000T0,`ø\u0090«Á]ñò!ºRM\u0082\u0001²Ðãu\u00868¶Cæ\u0099\u0016äG\rw\u0087§ÄÔ\u0003\u0000c0\"`÷\u0090ÉÁYñè! Ro\u0082\r²Òãp\u0013.CðsÇ¤[Ôð\u0004´5veD\u0095ÖÆtö!&éV\u008a\u0087T·éç·\u0018gHBxî©gÙ?\tÌ9»jS\u009aâÊ£\u0000C0,`÷\u0090\u0097ÁUñè!©Ru\u0082=²Ûãk\u0013;\u0000B0,`é\u0090\u0082Árñó!¯R|\u0082\u0005²Ðãl\u0013;ï\u000eßs\u008f¹\u007fÜ.\u000b\u001e¨Îð½\u0001mM]\u009c\f9Ê\"úcª¶Z\u0088\u000b\u0018;©ëá\u0098.HLx\u0093)1Ùo\u0089±¹\u0086n\u001a\u001e±Îõÿ7¯\u0005_\u0094\f$<cìº\u009c\u0084M\u000e}¡-ñÒ(\u0082D²\u009dc0\u0013<Ã£óÞ \u0014P±\u0000æ1\u0005á]\u0091¬F vq&\u0094\u0000W0(`ø\u0090±Á]ñä!¹R]\u0082\u001a²Ôãe\u0013\"Cùs\u0087¤B\u0000A0=`ê\u0090µÁQñâ!«Rr\u0082\u001e²Ðãp\u0000C0\"`÷\u0090\u008aÁ[ñï!\u0084Rn\u0082\u0005²ÅãN\u0013 Cýs\u008d¤SÔñ\u0000M0\u0019`Ý\u0090®ÁYñà!©R~\u0082>²Üãg\u00138\u0000c0\"`÷\u0090ÉÁYñè! Ro\u0082\r²Òãp\u0013.CðsÇ¤[Ôð\u0004´5veD\u0095ÀÆmö5&ùV\u008e\u0087L·«ç\u009f\u0018KH+xð©kÙ2\tÇ9\u0088jl\u009aîÊ±ûVZ¹jð:\u0000Êg\u009b¥«\u0012{H\b\u008eØðè\u0012¹²Ið\u0000M0\u0004`ô\u0090\u0093ÁQñæ!¼Rz\u0082\u0004²öãm\u0013!Cïs\u009d¤WÔí\u0004£\u001e5.E~\u008b\u008eåß!ï¥?ÈL\u0011\u009c\u007f¬³ý\f\rO]\u0095mÛº?Ê\u008d\u001aÃ\u0000M09`ý\u0090°ÁUñí!¢RS\u0082\t²Ûãf\u0013#Cùs\u009b[Mk\u0019;ÝË¨\u009aRªçz«\tiÙ?éÔ¸nH#\u0018Ô(\u0088ÿX\u008fç_¼nx>\u0018e1UE\u0005\u0081õÙ¤!\u0094\u0099Dñ7\bçy×¤\u0086\u0011v]&¨\u0016ôÁ$±\u009baÀP\u0004\u0000dk\u0017[y\u000b ûØª\u0006\u009a´Jò9\u0001éPÙ\u009a\u00880xb(®\u0018ÆÏ\u0014ÿ\u0013ÏS\u009f¯oÊ>\u0000\u000e·Þû\u00ad }VM£\u001c1ìf¼²\u008cÖ[\u0002+¼ûø¡M\u0091\u0007ÁÊ1¦`bPÖ\u0080\u009eóV#8\u0013øBG²\u0007Ï\"ÿD¯\u009e_Ê\u000e5>\u008fîÏ\u009d\u001cMm}§\u0000B0$`þ\u0090µÁQñò!¾Rt\u0082\u0006²Æãg\u0013+sÊC¤\u0013aã\n²ë\u0082lR$!Åñ\u0089ÁX\u0090ýÁÓñ\u0092¡GQy\u0000é0Xà\u0010\u0093ßC½sb\"ÀÒ\u009e\u0082@²weë\u0015@Å\u0004ôÆ¤ôTj\u0007À7\u0086çD\u0097(FëvZ&\u000fÙÂ\u0089³¹gh\u0098\u0018\u0081Èqø.«ï[\u0019\u000b&:ðê\u00ad\u009anMï}\u0080-pÝ\t\u008cå¼\\l\u0011\u0000W0$`ô\u0090\u0083Ábñà! R~\u0082?²Ðã`\u0013\u0019Cõs\u008c¤A\u0000c0\"`÷\u0090ÉÁYñè! Ro\u0082\r²Òãp\u0013.CðsÇ¤[Ôð\u0004´5veD\u0095ÚÆpö6&ôV\u0098\u0087[·êç¿\u0018rH\u0003x×©(Ù$\tÉ9\u0083j^\u009añÊµûO+\u000b[\u0095\u008c_¼<ìÌ\u001c\u008bMj}è\u00ad¸ÞF\u000e'>Øoh\u009f\u0001ÏÍÿ\u00940I¨÷\u0098£Èg8\u001ciâY^\u0089\u0006úÕ*\u0096\u001afKÙ»\u0099ëIÛ4\u0000c0\"`÷\u0090ÉÁYñè! Ro\u0082\r²Òãp\u0013.CðsÇ¤[Ôð\u0004´5veD\u0095ÁÆmö5&ûV\u0084\u0087[·êç¿\u0018rH\u0003x×©(Ù7\tÉ9\u008cjV\u009aèÊ³û\u000f+#[ï\u008cO¼\u0014ìÎ\u001c\u008aMN}ý\u00ad\u0092ÞJ\u000e\u0011>Ñoe\u009f0\u0006®6Çf\u0017\u0096pÇ²÷\u0005'_T\u0099\u0084ç´\u0000å\u0088\u0015ÈE\u001aue¢\u0083Ò\t\u0002V3\u0089\u0000c0\"`÷\u0090ÉÁYñè! Ro\u0082\r²Òãp\u0013.CðsÇ¤[Ôð\u0004´5veD\u0095ÁÆmö5&ûV\u0084\u0087\u0016·èç½\u0018{H\u0019xÕ©cÙ}\tí9\u0084jT\u009aóÊ±ûF+\u001c[Ú\u008cd¼\u0003ìË\u001c\u008bMY}æ\u00ad\u0080ÞJ\u000e\u0015>Ê~ON&\u001eöî\u0091¿S\u008fä_¾,xü\u0006Ìá\u009dam>=ê\r®ÚZªåz\u0091K~\u001b\u001aëÑ¸P\u0088:Xù(\u009e\u0000c0\"`÷\u0090ÉÁYñè! Ro\u0082\r²Òãp\u0013.CðsÇ¤[Ôð\u0004´5veD\u0095ÁÆmö5&ûV\u0084\u0087\u0016·èç½\u0018{H\u0019xÕ©cÙ}\tí9\u0084jT\u009aóÊ±ûF+\u001c[Ú\u008cd¼\u0003ìÃ\u001c\u009cMH}Ì\u00ad¸ÞG\u000e3>Üox\u009f3Ïòÿ\u00980[`ü\r#=Jm\u009a\u009dýÌ?ü\u0088,Ò_\u0014\u008fj¿\u0095î\r\u001eUN\u009b~ñ©=Ù¨\tÐ8\u0017hG\u0098¸Ë\u0018û[+¦[ì\u008a3º\u009c\u0000c0\"`÷\u0090ÉÁYñè! Ro\u0082\r²Òãp\u0013.CðsÇ¤[Ôð\u0004´5veD\u0095ÁÆmö5&ûV\u0084\u0087\u0016·èç½\u0018{H\u0019xÕ©cÙ}\tí9\u0084jT\u009aóÊ±ûF+\u001c[Ú\u008cd¼\u001bìÃ\u001c\u009bMU}ÿ\u00ad³Þf\u000e\u001e>ÙoI\u009f6ÏÖÿ\u00950h`â\u0090½ÁR\u0003X31cá\u0093\u0086ÂDòó\"©Qo\u0081\u0011±ãà{\u00103@êp\u0097§`×Â\u0007\u00846^f\u0016\u0096ÇÅf\u0000c0\"`÷\u0090ÉÁYñè! Ro\u0082\r²Òãp\u0013.CðsÇ¤[Ôð\u0004´5veD\u0095ÁÆmö5&ûV\u0084\u0087\u0016·èç½\u0018{H\u0019xÕ©cÙ}\tí9\u0084jT\u009aóÊ±ûF+\u001c[Ú\u008cd¼\u0016ìÎ\u001c\u0086M_}â\u00ad\u0095Þw\u000e1>ëoc\u009f2ÏÓ«5\u009b\\Ë\u008c;ëj)Z\u009e\u008aÄù\u0002)|\u0019\u008fH\u001b¸Dè\u0081ØÇ\u000f'\u007f\u009e¯ßþ8Îy\u009e¬n\u0092?\u0002\u000f³ßû¬4|VL\u0089\u001d+íu½«\u008d\u009cZ\u0000*«úïË-\u009b\u001fk\u009a86\bnØ ¨ßyMI³\u0019ææ ¶B\u0086\u008eW8'&÷¶Çß\u0094\u000fd¨4ê\u0005\u001dÕG¥\u0081r?BL\u0012\u0098âÇ³\u0002\u0083\u0084Sä \u001dð\\\u0000M0$`ô\u0090\u0093ÁQñæ!¼Rz\u0082\u0004²öãn\u0013&Cÿs\u0082¤{Ôê\u0004¾5te)\u0095ÖÆvö5&ÈV\u0082\u0087]·ò\u0000c0\"`÷\u0090ÉÁYñè! Ro\u0082\r²Òãp\u0013.CðsÇ¤[Ôð\u0004´5veD\u0095ÁÆmö5&ûV\u0084\u0087\u0016·èç½\u0018{H\u0019xÕ©cÙ}\tí9\u0084jT\u009aóÊ±ûF+\u001c[Ú\u008cd¼\u0016ìÎ\u001c\u0086M_}â\u00ad\u009bÞJ\u000e\u001e>ÔoI\u009f6ÏÖÿ\u00950h`â\u0090½ÁR\u0005\u00945ýe-\u0095JÄ\u0088ô?$eW£\u0087Ý·/æ´\u0016øF1vQ¡\u0086Ñ4\u0001l0¶`å\u0090\u0007Ã¸óÿ×àç¡·tGJ\u0016Ú&kö#\u0085ìU\u008eeQ4óÄ\u00ad\u0094s¤DsØ\u0003sÓ7âõ²ÇBB\u0011î!¶ñx\u0081\u0007P\u0095`k0>Ïø\u009f\u009a¯V~à\u000eþÞnî\u0007½×Mp\u001d2,Åü\u009f\u008cY[çk\u0095;NË\u0002\u009aËªkz<\tÎÙ\u0096éL¸ßH½\u0018B(\u0005\u0000M0$`ô\u0090\u0093ÁQñæ!¼Rz\u0082\u0004²ýã7\u0013\nCòs\u008d¤uÔâ\u0004¢5ye<\u0095ÞÆaö&Ijy+)þÙÀ\u0088P¸áh©\u001bfË\u0004ûÛªyZ'\nù:ÎíR\u009dùM½|\u007f,MÜÈ\u008fd¿<oò\u001f\u008dÎ\u001fþá®´Qr\u0001\u00101Üàj\u0090t@äp\u008d#]Óú\u0083¸²Ob\u0015\u0012ÓÅmõ\u0014¥\u009eU£\u0004[4ää\u009c\u0097KG\u000bwÐ&UÖ7\u0086È¶\u008f\u0000M0$`ô\u0090\u0093ÁQñæ!¼Rz\u0082\u0004²ùãc\u0013!Cøs\u0080¤XÔä\u0004\u00805|e\r\u0095ÒÆRö8&ûV\u009c\u0000c0\"`÷\u0090ÉÁYñè! Ro\u0082\r²Òãp\u0013.CðsÇ¤[Ôð\u0004´5veD\u0095ÁÆmö5&ûV\u0084\u0087\u0016·èç½\u0018{H\u0019xÕ©cÙ}\tí9\u0084jT\u009aóÊ±ûF+\u001c[Ú\u008cd¼\u0019ìÃ\u001c\u0081MX}à\u00ad¸ÞD\u000e >Üom\u009f2Ïòÿ\u00980[`ü\u0019^)7yç\u0089\u0080ØBèõ8¯Ki\u009b\u0017«öú}\n=Zöj\u009b½GÍü\u001d¦,X|\u0010\u008cÁß`'Ï\u0017\u008eG[·eæõÖD\u0006\fuÃ¥¡\u0095~ÄÜ4\u0082d\\Tk\u0083÷ó\\#\u0018\u0012ÚBè²máÁÑ\u0099\u0001Wq( º\u0090DÀ\u0011?×oµ_y\u008eÏþÑ.A\u001e(Mø½_í\u001dÜê\f°|v«È\u009b©Ëb;\"jéZD\u008a\u0018ùã)¹\u0019GHÏ¸\u009eè\u007f\u0000O0#`×\u0090³ÁsñÌ!«R\u007f\u0082\u0001²ÔãT\u0013&Cùs\u009e¤zÔê\u0004£5ie\u000f\u0095ÙÆaö#\u0000B0,`ô\u0090\u0089ÁQñó!\u008fR\u007f\u0082$²Üãq\u0013;Cùs\u0087¤SÔñ\u0000S0$`ý\u0090\u0089ÁUñí!\u008fRy\u0082\u001b²Áãp\u0013.Cÿs\u009d¤|ÔÐ\u0004\u00915~e\u001e\u0095ÞÆrö8&êV\u0092|(L_\u001c\u0086ìò½.\u008d\u0096]÷.\u0001þ`Î«\u009f.oQ?\u0085\u000fÄØ$¨\u009dxÜ\u0000c0\"`÷\u0090ÉÁYñè! Ro\u0082\r²Òãp\u0013.CðsÇ¤[Ôð\u0004´5veD\u0095ÚÆpö6&íV\u0082\u0087_·ëç³\u0018sH\u000fxÖ©kÙ>\tÏ9\u0083j\u0014\u009aåÊµûR+\u000b[\u0095\u008cJ¼4ìÑ\u001c\u008aMk}ì\u00ad´Þu\u000e\u0019>Øo}\u0000S0$`ý\u0090\u0089ÁUñí!\u0099Rr\u0082\u0006²ÑãT\u0013.Còs\u008c¤aÔæ\u0004²5Ke\u0003\u0095ÒÆs¡@\u0091\u0001ÁÔ1ê`zPË\u0080\u0083óL#.\u0013ñBS²\râÓÒä\u0005xuÓ¥\u0097\u0094UÄg4ùgSW\u0015\u0087Î÷¡&|\u0016ÈF\u0090¹Pé,Ùõ\bHx\u001d¨ì\u0098 Ë7;Ók\u009eZl\u008a)úî-J\u001d\u0018Mä½âìHÜÃ\f\u009b\u007fd¯\u0005\u009fÿÎG>\u0011nÐ^·\u0091\u007fÁþ1\u0092`cP&$ã\u0014\u0085DP´!åúÕH\u0005$vè¦\u0088\u0096QÇÊ7\u0085gVW!\u0080ÿðe \u0014\u0011ÎA¤±fâÊÒ\u0082\u0002@\u0000c0\"`÷\u0090ÉÁYñè! Ro\u0082\r²Òãp\u0013.CðsÇ¤[Ôð\u0004´5veD\u0095ÖÆgö%&÷V\u009d\u0087Q·ñç«\u00181H(xÖ©kÙ2\tÉ9\u0083jw\u009aÓÊ\u0093ûb+\u0001[Ö\u008ce¼:ìÌ\u001c®M_}ý\u00ad¿ÞU\u000e\u0019>Éosa=Q\u007f\u0001¸ñò 3\u0090\u0090@Ì3\u000fãNÓ¬\u0082\u0016rZ\"\u0083\u0012ØÅ%µ\u0087eÉT\u001b\u0004sô³§\r\u0000c0\"`÷\u0090ÉÁYñã!¼Rr\u0082\f²Òãg\u0013aCñs\u009a¤RÔè\u0004þ5se\u000f\u0095ÀÆvö4&éV\u008a\u0087J·áçü\u0018oH\u0000xØ©\u007fÙ6\tÒ9Ãjw\u009aÅÊ\u0086ûD+\u0019[Ú\u008cz¼1ìô\u001c\u0086MX}ì\u00ad¹Þb\u000e\u0013>Éoc\u009f!ÏÍÿ\u00850GR\u0087bé2,ÂG\u0093°£'s\u007f\u0000·ÐÛà\u0019±³Aó\u0000c0\"`÷\u0090ÉÁYñã!¼Rr\u0082\f²Òãg\u0013aCñs\u009a¤RÔè\u0004þ5se\u000f\u0095ÀÆvö4&éV\u008a\u0087J·áçü\u0018oH\u0000xØ©\u007fÙ6\tÒ9Ãjx\u009aæÊ§ûD+/[Ø\u008c|¼<ìÔ\u001c\u0086MH}ð\u0000g0(`î\u0090ªÁ]ñï!ºR~\u0082\u000f²Çãc\u0013#CÏs\u00ad¤}\u0000g0(`î\u0090¤ÁUñì!¾Rz\u0082\u0001²Òãl\u0013\nCä¬\r\u009cBÌ\u0084<Ým?]\u0088\u008dÏþ\u0010.e\u001eºO&¿Dï\u009bßæ¹ß\u0089\u0090ÙV)\u001cxàHP\u0098\u0015ëÈ;\u0085\u000b\u007fZÖ\u0084\r´Bä\u0084\u0014ÁE7u\u0085¥ÏÖ%\u0006{6¯g\r\u0000g0(`î\u0090®ÁYñà!©R~\u0082=²Çãn×Èç\u0087·AG\u0001\u0016ø&Aö\u000f\u0085áUµev\u0000g0(`î\u0090¦ÁPñÈ!ª\u0000g0(`î\u0090¦ÁPñ÷!\u0087R\u007f\u0018^(\u0011x×\u0088\u0090ÙléÌ9\u009eJT\u009a4ªÚûR\u000b\u0012[Àk¿¼[ÌÈ\u001c\u0088-G}8\u008dçÞSî\u000f>ôN¦\u009fs¯Õÿ\u0085\u0000A\u0097\r§V÷\u0090\u0007ÛV+f\u0091¶ÞÅ\u0000\u0015d%\u009dt\u0015\u0084TÔ\u0095äÖ3,C±\u0093Ç¢\u0010ò`\u0002¬Q\u0014aJ±\u00920Z\u0000\u0015PÓ \u009bñmÁè\u0011\u008abV²0".getBytes(CharEncoding.ISO_8859_1)).asCharBuffer().get(cArr, 0, 2772);
            f988 = cArr;
            f990 = -8464856961018679219L;
        }

        public d(String str) {
            super(str);
        }

        /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
        private static String m1096(CampaignEx campaignEx) {
            f989 = (f987 + 61) % 128;
            String id = campaignEx.getId();
            int i2 = f987 + 99;
            f989 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 12 / 0;
            }
            return id;
        }

        /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
        private static String m1097(CampaignEx campaignEx) {
            int i2 = f987 + 3;
            f989 = i2 % 128;
            if (i2 % 2 == 0) {
                campaignEx.getAdvId();
                throw null;
            }
            String advId = campaignEx.getAdvId();
            f987 = (f989 + 99) % 128;
            return advId;
        }

        /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
        private static String m1098(CampaignEx campaignEx) {
            int i2 = f989 + 39;
            f987 = i2 % 128;
            if (i2 % 2 != 0) {
                campaignEx.getNativeVideoTrackingString();
                throw null;
            }
            String nativeVideoTrackingString = campaignEx.getNativeVideoTrackingString();
            f987 = (f989 + 13) % 128;
            return nativeVideoTrackingString;
        }

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private static int m1099(CampaignEx campaignEx) {
            int i2 = f987 + 37;
            f989 = i2 % 128;
            if (i2 % 2 != 0) {
                return campaignEx.getLinkType();
            }
            campaignEx.getLinkType();
            throw null;
        }

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private static String m1100(CampaignEx campaignEx) {
            int i2 = f987 + 67;
            f989 = i2 % 128;
            int i3 = i2 % 2;
            String clickURL = campaignEx.getClickURL();
            if (i3 == 0) {
                int i4 = 59 / 0;
            }
            return clickURL;
        }

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private static int m1101(CampaignEx campaignEx) {
            f987 = (f989 + 1) % 128;
            int adType = campaignEx.getAdType();
            f989 = (f987 + 37) % 128;
            return adType;
        }

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private static String m1102(CampaignEx campaignEx) {
            int i2 = f989 + 29;
            f987 = i2 % 128;
            int i3 = i2 % 2;
            String imageUrl = campaignEx.getImageUrl();
            if (i3 != 0) {
                int i4 = 64 / 0;
            }
            return imageUrl;
        }

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private static String m1103(CampaignEx campaignEx) {
            f989 = (f987 + 115) % 128;
            String iconUrl = campaignEx.getIconUrl();
            int i2 = f987 + 1;
            f989 = i2 % 128;
            if (i2 % 2 != 0) {
                return iconUrl;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        public static /* synthetic */ String m1105(CampaignEx campaignEx) {
            f987 = (f989 + 91) % 128;
            String strM1098 = m1098(campaignEx);
            int i2 = f989 + 47;
            f987 = i2 % 128;
            if (i2 % 2 == 0) {
                return strM1098;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        public static /* synthetic */ int m1106(CampaignEx campaignEx) {
            f989 = (f987 + 105) % 128;
            int iM1101 = m1101(campaignEx);
            f989 = (f987 + 23) % 128;
            return iM1101;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public static /* synthetic */ Object m1107() {
            int i2 = f987 + 13;
            f989 = i2 % 128;
            if (i2 % 2 == 0) {
                m1104();
                throw null;
            }
            Object objM1104 = m1104();
            f987 = (f989 + 43) % 128;
            return objM1104;
        }

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        public static /* synthetic */ String m1109(CampaignEx campaignEx) {
            f989 = (f987 + 15) % 128;
            String strM1096 = m1096(campaignEx);
            int i2 = f987 + 33;
            f989 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 63 / 0;
            }
            return strM1096;
        }

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static String m1110(CampaignEx campaignEx) {
            f989 = (f987 + 29) % 128;
            String packageName = campaignEx.getPackageName();
            f989 = (f987 + 55) % 128;
            return packageName;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ String m1111(CampaignEx campaignEx) {
            f987 = (f989 + 51) % 128;
            String strM1100 = m1100(campaignEx);
            int i2 = f987 + 21;
            f989 = i2 % 128;
            if (i2 % 2 != 0) {
                return strM1100;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ String m1112(CampaignEx campaignEx) {
            int i2 = f987 + 123;
            f989 = i2 % 128;
            if (i2 % 2 != 0) {
                return m1103(campaignEx);
            }
            m1103(campaignEx);
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ int m1114(CampaignEx campaignEx) {
            f987 = (f989 + 39) % 128;
            int iM1099 = m1099(campaignEx);
            f989 = (f987 + 63) % 128;
            return iM1099;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ String m1118(CampaignEx campaignEx) {
            f989 = (f987 + 101) % 128;
            String strM1102 = m1102(campaignEx);
            int i2 = f987 + 85;
            f989 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 11 / 0;
            }
            return strM1102;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ String m1120(CampaignEx campaignEx) {
            f987 = (f989 + 71) % 128;
            String strM1110 = m1110(campaignEx);
            f987 = (f989 + 47) % 128;
            return strM1110;
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static Object m1104() {
            f989 = (f987 + 125) % 128;
            a mIntegralSDK = MIntegralSDKFactory.getMIntegralSDK();
            int i2 = f987 + 19;
            f989 = i2 % 128;
            if (i2 % 2 != 0) {
                return mIntegralSDK;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public static /* synthetic */ String m1108(CampaignEx campaignEx) {
            f989 = (f987 + 39) % 128;
            String strM1097 = m1097(campaignEx);
            int i2 = f989 + 31;
            f987 = i2 % 128;
            if (i2 % 2 == 0) {
                return strM1097;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ CampaignEx m1115(MTGRewardVideoActivity mTGRewardVideoActivity) {
            f989 = (f987 + 93) % 128;
            CampaignEx campaignExM1117 = m1117(mTGRewardVideoActivity);
            int i2 = f987 + 37;
            f989 = i2 % 128;
            if (i2 % 2 != 0) {
                return campaignExM1117;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m1119(int i2, int i3, char c2) {
            String str;
            synchronized (a.f68) {
                try {
                    char[] cArr = new char[i2];
                    a.f69 = 0;
                    while (true) {
                        int i4 = a.f69;
                        if (i4 < i2) {
                            cArr[i4] = (char) ((((long) f988[i3 + i4]) ^ (((long) i4) * f990)) ^ ((long) c2));
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

        @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
        /* JADX INFO: renamed from: ﻛ */
        public final Map<String, bg.b> mo707() {
            HashMap map = new HashMap();
            map.put(m1119((ViewConfiguration.getFadingEdgeLength() >> 16) + 15, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2612, (char) Color.argb(0, 0, 0, 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.d.5
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return d.m1107();
                }
            });
            map.put(m1119(13 - Drawable.resolveOpacity(0, 0), Color.rgb(0, 0, 0) + 16779843, (char) KeyEvent.getDeadChar(0, 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.d.1
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return d.m1115((MTGRewardVideoActivity) list.get(0));
                }
            });
            map.put(m1119(TextUtils.lastIndexOf("", '0', 0) + 15, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2640, (char) (TextUtils.indexOf("", "", 0) + 44138)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.d.7
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return d.m1120((CampaignEx) list.get(0));
                }
            });
            map.put(m1119(TextUtils.lastIndexOf("", '0', 0, 0) + 12, 2654 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 47544)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.d.6
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return d.m1111((CampaignEx) list.get(0));
                }
            });
            map.put(m1119(11 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2664 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33897)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.d.8
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return Integer.valueOf(d.m1114((CampaignEx) list.get(0)));
                }
            });
            map.put(m1119(11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 2676 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.d.9
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return d.m1118((CampaignEx) list.get(0));
                }
            });
            map.put(m1119(View.MeasureSpec.makeMeasureSpec(0, 0) + 10, (Process.myTid() >> 22) + 2687, (char) (TextUtils.lastIndexOf("", '0') + 55216)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.d.10
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return d.m1112((CampaignEx) list.get(0));
                }
            });
            map.put(m1119(7 - Color.alpha(0), 2698 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.d.11
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return d.m1109((CampaignEx) list.get(0));
                }
            });
            map.put(m1119(TextUtils.indexOf("", "", 0) + 8, 2704 - Color.blue(0), (char) ((-1) - MotionEvent.axisFromString(""))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.d.12
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return d.m1108((CampaignEx) list.get(0));
                }
            });
            map.put(m1119(28 - (ViewConfiguration.getJumpTapTimeout() >> 16), 2712 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (6201 - (ViewConfiguration.getEdgeSlop() >> 16))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.d.4
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return d.m1105((CampaignEx) list.get(0));
                }
            });
            map.put(m1119(View.MeasureSpec.getMode(0) + 23, 2740 - (KeyEvent.getMaxKeyCode() >> 16), (char) (KeyEvent.getDeadChar(0, 0) + 38782)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.d.2
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    d.m1116((MTGBannerView) list.get(0), (BannerAdListener) list.get(1));
                    return null;
                }
            });
            map.put(m1119(9 - (Process.myPid() >> 22), 2763 - (Process.myTid() >> 22), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12349)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.d.3
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return Integer.valueOf(d.m1106((CampaignEx) list.get(0)));
                }
            });
            f989 = (f987 + 123) % 128;
            return map;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
        /* JADX INFO: renamed from: ﾇ */
        public final String mo793() {
            hw hwVarM2245;
            Class<MTGConfiguration> cls;
            int touchSlop;
            int scrollBarSize;
            int iMyPid;
            int i2 = f989 + 31;
            f987 = i2 % 128;
            if (i2 % 2 != 0) {
                hwVarM2245 = hr.m2242().m2245();
                cls = MTGConfiguration.class;
                touchSlop = 99 >> (ViewConfiguration.getTouchSlop() / 95);
                scrollBarSize = ViewConfiguration.getScrollBarSize() % 1;
                iMyPid = Process.myPid() << 88;
            } else {
                hwVarM2245 = hr.m2242().m2245();
                cls = MTGConfiguration.class;
                touchSlop = 18 - (ViewConfiguration.getTouchSlop() >> 8);
                scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                iMyPid = Process.myPid() >> 22;
            }
            return hwVarM2245.m2314(cls, m1119(touchSlop, scrollBarSize, (char) iMyPid).intern());
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ void m1116(MTGBannerView mTGBannerView, BannerAdListener bannerAdListener) {
            int i2 = f987 + 33;
            f989 = i2 % 128;
            int i3 = i2 % 2;
            m1113(mTGBannerView, bannerAdListener);
            if (i3 == 0) {
                throw null;
            }
            int i4 = f987 + 111;
            f989 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 85 / 0;
            }
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static CampaignEx m1117(MTGRewardVideoActivity mTGRewardVideoActivity) {
            f987 = (f989 + 25) % 128;
            CampaignEx campaignEx = mTGRewardVideoActivity.getCampaignEx();
            int i2 = f989 + 85;
            f987 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 13 / 0;
            }
            return campaignEx;
        }

        /* JADX WARN: Code duplicated, block: B:139:0x06e7  */
        /* JADX WARN: Code duplicated, block: B:57:0x02db  */
        /* JADX WARN: Code duplicated, block: B:66:0x034f  */
        /* JADX WARN: Code duplicated, block: B:89:0x0471  */
        @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
        /* JADX INFO: renamed from: ｋ */
        public final Class mo708(String str) {
            int i2 = f987 + 85;
            f989 = i2 % 128;
            if (i2 % 2 != 0) {
                byte b2 = 48;
                switch (str.hashCode()) {
                    case -2128525576:
                        b2 = !str.equals(m1119(11 - (ViewConfiguration.getFadingEdgeLength() >> 16), 848 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 40;
                        break;
                    case -2127096804:
                        if (!str.equals(m1119(39 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 554, (char) (63070 - View.MeasureSpec.getSize(0))).intern())) {
                            b2 = -1;
                        } else {
                            int i3 = f987 + 99;
                            f989 = i3 % 128;
                            if (i3 % 2 != 0) {
                                b2 = 26;
                            } else {
                                b2 = 33;
                            }
                        }
                        break;
                    case -2107186802:
                        if (!str.equals(m1119(Color.argb(0, 0, 0, 0) + 16, 628 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                            b2 = -1;
                        } else {
                            f989 = (f987 + 37) % 128;
                            b2 = 29;
                        }
                        break;
                    case -2088438133:
                        b2 = !str.equals(m1119(57 - ImageFormat.getBitsPerPixel(0), 1830 - View.getDefaultSize(0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern()) ? (byte) -1 : (byte) 80;
                        break;
                    case -2083223016:
                        b2 = !str.equals(m1119(29 - TextUtils.lastIndexOf("", '0'), (-16776728) - Color.rgb(0, 0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 23;
                        break;
                    case -2030516682:
                        b2 = !str.equals(m1119(53 - View.resolveSize(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1685, (char) KeyEvent.getDeadChar(0, 0)).intern()) ? (byte) -1 : (byte) 76;
                        break;
                    case -1980005015:
                        b2 = !str.equals(m1119(15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 982 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 47;
                        break;
                    case -1978654101:
                        b2 = !str.equals(m1119(38 - Gravity.getAbsoluteGravity(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, (char) ((-1) - Process.getGidForName(""))).intern()) ? (byte) -1 : (byte) 51;
                        break;
                    case -1969670564:
                        b2 = !str.equals(m1119(53 - TextUtils.indexOf("", ""), TextUtils.indexOf((CharSequence) "", '0') + 2142, (char) (Color.blue(0) + 10156)).intern()) ? (byte) -1 : (byte) 88;
                        break;
                    case -1940754118:
                        b2 = !str.equals(m1119(TextUtils.getTrimmedLength("") + 18, 111 - (Process.myPid() >> 22), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'))).intern()) ? (byte) -1 : (byte) 5;
                        break;
                    case -1919192581:
                        b2 = !str.equals(m1119(Gravity.getAbsoluteGravity(0, 0) + 23, View.resolveSize(0, 0) + 260, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4433)).intern()) ? (byte) -1 : (byte) 14;
                        break;
                    case -1876403509:
                        b2 = !str.equals(m1119(Drawable.resolveOpacity(0, 0) + 16, 738 - (Process.myTid() >> 22), (char) (KeyEvent.getMaxKeyCode() >> 16)).intern()) ? (byte) -1 : (byte) 35;
                        break;
                    case -1874906197:
                        if (!str.equals(m1119(24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1500 - View.MeasureSpec.getSize(0), (char) (Color.green(0) + 32258)).intern())) {
                            b2 = -1;
                        } else {
                            f989 = (f987 + 119) % 128;
                            b2 = 71;
                        }
                        break;
                    case -1812546352:
                        b2 = !str.equals(m1119(58 - Color.green(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1606, (char) View.MeasureSpec.makeMeasureSpec(0, 0)).intern()) ? (byte) -1 : (byte) 74;
                        break;
                    case -1766796574:
                        b2 = !str.equals(m1119(23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 607 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L)).intern()) ? (byte) -1 : (byte) 28;
                        break;
                    case -1702626105:
                        b2 = !str.equals(m1119(TextUtils.getCapsMode("", 0, 0) + 18, (KeyEvent.getMaxKeyCode() >> 16) + 1432, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1763)).intern()) ? (byte) -1 : (byte) 69;
                        break;
                    case -1674303146:
                        b2 = !str.equals(m1119(16 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 18, (char) ((Process.myPid() >> 22) + 46875)).intern()) ? (byte) -1 : (byte) 0;
                        break;
                    case -1656370481:
                        b2 = !str.equals(m1119(15 - View.MeasureSpec.makeMeasureSpec(0, 0), 1296 - View.combineMeasuredStates(0, 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern()) ? (byte) -1 : (byte) 65;
                        break;
                    case -1537112313:
                        if (!str.equals(m1119(21 - Drawable.resolveOpacity(0, 0), Drawable.resolveOpacity(0, 0) + 2324, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) {
                            b2 = -1;
                        } else {
                            f987 = (f989 + 49) % 128;
                            b2 = 94;
                        }
                        break;
                    case -1522474666:
                        b2 = !str.equals(m1119(22 - TextUtils.lastIndexOf("", '0', 0), 2403 - ImageFormat.getBitsPerPixel(0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9382)).intern()) ? (byte) -1 : (byte) 96;
                        break;
                    case -1507367077:
                        b2 = !str.equals(m1119(TextUtils.indexOf("", "", 0, 0) + 24, 518 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (Color.green(0) + 22873)).intern()) ? (byte) -1 : (byte) 24;
                        break;
                    case -1458291270:
                        b2 = !str.equals(m1119(View.resolveSize(0, 0) + 17, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 139, (char) View.combineMeasuredStates(0, 0)).intern()) ? (byte) -1 : (byte) 7;
                        break;
                    case -1325137233:
                        b2 = !str.equals(m1119(11 - TextUtils.indexOf("", "", 0, 0), 129 - TextUtils.getCapsMode("", 0, 0), (char) (65147 - View.combineMeasuredStates(0, 0))).intern()) ? (byte) -1 : (byte) 6;
                        break;
                    case -1265212384:
                        b2 = !str.equals(m1119(17 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 2256 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (31866 - TextUtils.lastIndexOf("", '0'))).intern()) ? (byte) -1 : (byte) 92;
                        break;
                    case -1077685820:
                        b2 = !str.equals(m1119(Process.getGidForName("") + 20, 1182 - AndroidCharacter.getMirror('0'), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 23296)).intern()) ? (byte) -1 : (byte) 56;
                        break;
                    case -1061727315:
                        b2 = !str.equals(m1119(16 - (ViewConfiguration.getEdgeSlop() >> 16), 352 - (Process.myPid() >> 22), (char) Color.blue(0)).intern()) ? (byte) -1 : (byte) 18;
                        break;
                    case -1058625022:
                        b2 = !str.equals(m1119(24 - Color.green(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2232, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 91;
                        break;
                    case -931831919:
                        if (!str.equals(m1119(13 - TextUtils.indexOf("", "", 0, 0), 303 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern())) {
                            b2 = -1;
                        } else {
                            int i4 = f989 + 95;
                            f987 = i4 % 128;
                            if (i4 % 2 == 0) {
                                b2 = 16;
                            } else {
                                b2 = 49;
                            }
                        }
                        break;
                    case -920590771:
                        b2 = !str.equals(m1119((ViewConfiguration.getScrollDefaultDelay() >> 16) + 22, 1888 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((-16775719) - Color.rgb(0, 0, 0))).intern()) ? (byte) -1 : (byte) 81;
                        break;
                    case -894298414:
                        b2 = !str.equals(m1119(25 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 2040 - KeyEvent.keyCodeFromString(""), (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern()) ? (byte) -1 : (byte) 85;
                        break;
                    case -811615267:
                        b2 = !str.equals(m1119(54 - (ViewConfiguration.getPressedStateDuration() >> 16), Color.rgb(0, 0, 0) + 16779126, (char) (55171 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).intern()) ? (byte) -1 : (byte) 82;
                        break;
                    case -667901878:
                        b2 = !str.equals(m1119(22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 1964, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 83;
                        break;
                    case -558926374:
                        b2 = !str.equals(m1119((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 54, 1986 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (18697 - Color.red(0))).intern()) ? (byte) -1 : (byte) 84;
                        break;
                    case -495785498:
                        b2 = !str.equals(m1119(21 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 2478, (char) (View.MeasureSpec.getMode(0) + 24944)).intern()) ? (byte) -1 : (byte) 98;
                        break;
                    case -464794090:
                        b2 = !str.equals(m1119(23 - (KeyEvent.getMaxKeyCode() >> 16), 645 - (KeyEvent.getMaxKeyCode() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0) + 22601)).intern()) ? (byte) -1 : (byte) 30;
                        break;
                    case -461263347:
                        b2 = !str.equals(m1119((ViewConfiguration.getEdgeSlop() >> 16) + 45, 767 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (9369 - TextUtils.getTrimmedLength(""))).intern()) ? (byte) -1 : (byte) 37;
                        break;
                    case -396369642:
                        b2 = !str.equals(m1119(51 - (KeyEvent.getMaxKeyCode() >> 16), 2426 - TextUtils.lastIndexOf("", '0'), (char) Color.argb(0, 0, 0, 0)).intern()) ? (byte) -1 : (byte) 97;
                        break;
                    case -249445036:
                        b2 = !str.equals(m1119((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13, KeyEvent.normalizeMetaState(0) + 754, (char) Color.green(0)).intern()) ? (byte) -1 : (byte) 36;
                        break;
                    case -228661957:
                        b2 = !str.equals(m1119(TextUtils.getCapsMode("", 0, 0) + 56, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1523, (char) ((-16777216) - Color.rgb(0, 0, 0))).intern()) ? (byte) -1 : (byte) 72;
                        break;
                    case -201859056:
                        b2 = !str.equals(m1119(10 - View.MeasureSpec.getMode(0), Color.alpha(0) + 1216, (char) (53088 - View.getDefaultSize(0, 0))).intern()) ? (byte) -1 : (byte) 61;
                        break;
                    case -156796625:
                        b2 = !str.equals(m1119((ViewConfiguration.getLongPressTimeout() >> 16) + 17, 1738 - (ViewConfiguration.getTouchSlop() >> 8), (char) (TextUtils.indexOf((CharSequence) "", '0') + 43897)).intern()) ? (byte) -1 : (byte) 77;
                        break;
                    case -126256187:
                        b2 = !str.equals(m1119(16 - TextUtils.indexOf((CharSequence) "", '0'), (-16776029) - Color.rgb(0, 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 65371)).intern()) ? (byte) -1 : (byte) 59;
                        break;
                    case -121577375:
                        b2 = !str.equals(m1119(12 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1075 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (23284 - (ViewConfiguration.getScrollBarSize() >> 8))).intern()) ? (byte) -1 : (byte) 52;
                        break;
                    case -75274960:
                        b2 = !str.equals(m1119(8 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 176, (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern()) ? (byte) -1 : (byte) 9;
                        break;
                    case -33766813:
                        b2 = !str.equals(m1119(Gravity.getAbsoluteGravity(0, 0) + 25, TextUtils.getOffsetBefore("", 0) + Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, (char) (ViewConfiguration.getJumpTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 12;
                        break;
                    case 148631506:
                        b2 = !str.equals(m1119(Color.red(0) + 20, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 156, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 8;
                        break;
                    case 154057692:
                        b2 = !str.equals(m1119(17 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 1086, (char) Color.alpha(0)).intern()) ? (byte) -1 : (byte) 53;
                        break;
                    case 329817920:
                        b2 = !str.equals(m1119(20 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 242, (char) (4734 - View.combineMeasuredStates(0, 0))).intern()) ? (byte) -1 : (byte) 13;
                        break;
                    case 336960212:
                        b2 = !str.equals(m1119(Gravity.getAbsoluteGravity(0, 0) + 12, 904 - (ViewConfiguration.getEdgeSlop() >> 16), (char) TextUtils.getTrimmedLength("")).intern()) ? (byte) -1 : (byte) 43;
                        break;
                    case 388542383:
                        b2 = !str.equals(m1119(8 - Color.red(0), ExpandableListView.getPackedPositionChild(0L) + 860, (char) (34416 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 41;
                        break;
                    case 522506349:
                        b2 = !str.equals(m1119(AndroidCharacter.getMirror('0') - 28, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 75, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 5508)).intern()) ? (byte) -1 : (byte) 3;
                        break;
                    case 604727084:
                        if (!str.equals(m1119(KeyEvent.getDeadChar(0, 0) + 12, ExpandableListView.getPackedPositionGroup(0L) + 1204, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 41252)).intern())) {
                            b2 = -1;
                        } else {
                            int i5 = f987 + 59;
                            f989 = i5 % 128;
                            if (i5 % 2 != 0) {
                                b2 = 60;
                            } else {
                                b2 = 21;
                            }
                        }
                        break;
                    case 675209731:
                        b2 = !str.equals(m1119((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 186, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 10;
                        break;
                    case 713779451:
                        b2 = !str.equals(m1119(Color.blue(0) + 26, 1804 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 79;
                        break;
                    case 745946635:
                        b2 = !str.equals(m1119(14 - TextUtils.getTrimmedLength(""), 592 - ExpandableListView.getPackedPositionChild(0L), (char) (TextUtils.getOffsetBefore("", 0) + 42294)).intern()) ? (byte) -1 : (byte) 27;
                        break;
                    case 751945826:
                        b2 = !str.equals(m1119(TextUtils.getCapsMode("", 0, 0) + 56, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2064, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()) ? (byte) -1 : (byte) 86;
                        break;
                    case 787683072:
                        b2 = !str.equals(m1119(TextUtils.indexOf("", "", 0, 0) + 12, ((Process.getThreadPriority(0) + 20) >> 6) + 1024, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1)).intern()) ? (byte) -1 : (byte) 50;
                        break;
                    case 824636291:
                        b2 = !str.equals(m1119(21 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 195, (char) (34824 - TextUtils.getCapsMode("", 0, 0))).intern()) ? (byte) -1 : (byte) 11;
                        break;
                    case 830238336:
                        b2 = !str.equals(m1119((ViewConfiguration.getDoubleTapTimeout() >> 16) + 14, KeyEvent.keyCodeFromString("") + 1120, (char) (Process.myTid() >> 22)).intern()) ? (byte) -1 : (byte) 55;
                        break;
                    case 849576491:
                        if (!str.equals(m1119(View.getDefaultSize(0, 0) + 19, TextUtils.indexOf((CharSequence) "", '0', 0) + 699, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 33;
                        }
                        break;
                    case 879499863:
                        b2 = !str.equals(m1119(50 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1450, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'))).intern()) ? (byte) -1 : (byte) 70;
                        break;
                    case 888727913:
                        b2 = !str.equals(m1119((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19, 35 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((-16777216) - Color.rgb(0, 0, 0))).intern()) ? (byte) -1 : (byte) 1;
                        break;
                    case 892841421:
                        if (!str.equals(m1119(11 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 928 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (61260 - ((Process.getThreadPriority(0) + 20) >> 6))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 45;
                        }
                        break;
                    case 897829864:
                        b2 = !str.equals(m1119(View.MeasureSpec.makeMeasureSpec(0, 0) + 11, 1239 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29576)).intern()) ? (byte) -1 : (byte) 63;
                        break;
                    case 923005467:
                        b2 = !str.equals(m1119(KeyEvent.getDeadChar(0, 0) + 22, 52 - TextUtils.lastIndexOf("", '0'), (char) ExpandableListView.getPackedPositionGroup(0L)).intern()) ? (byte) -1 : (byte) 2;
                        break;
                    case 963675317:
                        b2 = !str.equals(m1119(49 - Process.getGidForName(""), 368 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (AndroidCharacter.getMirror('0') - '0')).intern()) ? (byte) -1 : (byte) 19;
                        break;
                    case 985183301:
                        b2 = !str.equals(m1119(51 - Color.blue(0), TextUtils.indexOf((CharSequence) "", '0') + 2274, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 93;
                        break;
                    case 989671232:
                        b2 = !str.equals(m1119(Color.red(0) + 26, 1580 - KeyEvent.keyCodeFromString(""), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 3438)).intern()) ? (byte) -1 : (byte) 73;
                        break;
                    case 1014009286:
                        b2 = !str.equals(m1119(21 - View.MeasureSpec.getSize(0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1664, (char) (790 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 75;
                        break;
                    case 1027072306:
                        b2 = !str.equals(m1119(36 - (ViewConfiguration.getEdgeSlop() >> 16), View.resolveSize(0, 0) + Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, (char) KeyEvent.getDeadChar(0, 0)).intern()) ? (byte) -1 : (byte) 17;
                        break;
                    case 1031717908:
                        b2 = !str.equals(m1119(56 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 2499 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (Process.myPid() >> 22)).intern()) ? (byte) -1 : (byte) 99;
                        break;
                    case 1074855404:
                        if (!str.equals(m1119(Color.red(0) + 21, 2120 - ExpandableListView.getPackedPositionType(0L), (char) (TextUtils.indexOf((CharSequence) "", '0') + 6420)).intern())) {
                            b2 = -1;
                        } else {
                            f987 = (f989 + 123) % 128;
                            b2 = 87;
                        }
                        break;
                    case 1079743836:
                        b2 = !str.equals(m1119((ViewConfiguration.getLongPressTimeout() >> 16) + 22, TextUtils.getOffsetBefore("", 0) + 2194, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 89;
                        break;
                    case 1090486275:
                        b2 = !str.equals(m1119(TextUtils.indexOf("", "", 0, 0) + 52, ExpandableListView.getPackedPositionType(0L) + 1380, (char) (Process.myTid() >> 22)).intern()) ? (byte) -1 : (byte) 68;
                        break;
                    case 1134055712:
                        b2 = !str.equals(m1119(12 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2553 - Process.getGidForName(""), (char) (TextUtils.getCapsMode("", 0, 0) + 21189)).intern()) ? (byte) -1 : (byte) 100;
                        break;
                    case 1138147458:
                        if (!str.equals(m1119(19 - View.MeasureSpec.getMode(0), 1154 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (25980 - TextUtils.indexOf("", "", 0))).intern())) {
                            b2 = -1;
                        } else {
                            int i6 = f989 + 3;
                            f987 = i6 % 128;
                            if (i6 % 2 == 0) {
                                b2 = 57;
                            } else {
                                b2 = 45;
                            }
                        }
                        break;
                    case 1139753057:
                        b2 = !str.equals(m1119(12 - (ViewConfiguration.getEdgeSlop() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 915, (char) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern()) ? (byte) -1 : (byte) 44;
                        break;
                    case 1163838042:
                        b2 = !str.equals(m1119(13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 542 - (Process.myTid() >> 22), (char) (ViewConfiguration.getTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 25;
                        break;
                    case 1164173445:
                        b2 = !str.equals(m1119(59 - (ViewConfiguration.getEdgeSlop() >> 16), 2345 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (Color.red(0) + 41251)).intern()) ? (byte) -1 : (byte) 95;
                        break;
                    case 1194888483:
                        if (!str.equals(m1119(TextUtils.getCapsMode("", 0, 0) + 15, 668 - TextUtils.getOffsetBefore("", 0), (char) View.combineMeasuredStates(0, 0)).intern())) {
                            b2 = -1;
                        } else {
                            f987 = (f989 + 59) % 128;
                            b2 = 31;
                        }
                        break;
                    case 1253985693:
                        b2 = !str.equals(m1119(TextUtils.getTrimmedLength("") + 25, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 824, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 39;
                        break;
                    case 1297340448:
                        b2 = !str.equals(m1119(20 - TextUtils.indexOf("", ""), 283 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1983)).intern()) ? (byte) -1 : (byte) 15;
                        break;
                    case 1306792763:
                        if (!str.equals(m1119((ViewConfiguration.getFadingEdgeLength() >> 16) + 27, TextUtils.lastIndexOf("", '0') + 441, (char) TextUtils.getOffsetAfter("", 0)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 21;
                        }
                        break;
                    case 1331885131:
                        b2 = !str.equals(m1119((ViewConfiguration.getTapTimeout() >> 16) + 15, (ViewConfiguration.getJumpTapTimeout() >> 16) + 1172, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 27483)).intern()) ? (byte) -1 : (byte) 58;
                        break;
                    case 1355875652:
                        b2 = !str.equals(m1119(55 - Color.blue(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1311, (char) ('0' - AndroidCharacter.getMirror('0'))).intern()) ? (byte) -1 : (byte) 66;
                        break;
                    case 1357502028:
                        if (!str.equals(m1119(16 - TextUtils.getOffsetAfter("", 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1007, (char) TextUtils.indexOf("", "")).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 49;
                        }
                        break;
                    case 1448823153:
                        b2 = !str.equals(m1119(((Process.getThreadPriority(0) + 20) >> 6) + 16, 95 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) View.MeasureSpec.makeMeasureSpec(0, 0)).intern()) ? (byte) -1 : (byte) 4;
                        break;
                    case 1491724830:
                        b2 = !str.equals(m1119(TextUtils.indexOf("", "", 0) + 37, Process.getGidForName("") + 868, (char) (Process.myPid() >> 22)).intern()) ? (byte) -1 : (byte) 42;
                        break;
                    case 1505622627:
                        b2 = !str.equals(m1119((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16, 2264 - AndroidCharacter.getMirror('0'), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 90;
                        break;
                    case 1541095059:
                        b2 = !str.equals(m1119(21 - TextUtils.getCapsMode("", 0, 0), 716 - ExpandableListView.getPackedPositionChild(0L), (char) (11529 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 34;
                        break;
                    case 1607057168:
                        if (!str.equals(m1119((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11, 997 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (MotionEvent.axisFromString("") + 1)).intern())) {
                            b2 = -1;
                        }
                        break;
                    case 1658563378:
                        b2 = !str.equals(m1119(46 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2566, (char) (KeyEvent.getMaxKeyCode() >> 16)).intern()) ? (byte) -1 : (byte) 101;
                        break;
                    case 1659288939:
                        b2 = !str.equals(m1119(11 - (ViewConfiguration.getPressedStateDuration() >> 16), 812 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (TextUtils.getTrimmedLength("") + 35892)).intern()) ? (byte) -1 : (byte) 38;
                        break;
                    case 1704806948:
                        b2 = !str.equals(m1119(15 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1366, (char) (43193 - ExpandableListView.getPackedPositionChild(0L))).intern()) ? (byte) -1 : (byte) 67;
                        break;
                    case 1746536452:
                        b2 = !str.equals(m1119(47 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1250 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (49585 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 64;
                        break;
                    case 1792690910:
                        b2 = !str.equals(m1119((ViewConfiguration.getPressedStateDuration() >> 16) + 22, 418 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 20;
                        break;
                    case 1884374718:
                        b2 = !str.equals(m1119((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 21, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 466, (char) (17032 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).intern()) ? (byte) -1 : (byte) 22;
                        break;
                    case 1991923194:
                        b2 = !str.equals(m1119((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 16, 1103 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (7783 - TextUtils.getOffsetBefore("", 0))).intern()) ? (byte) -1 : (byte) 54;
                        break;
                    case 2004707743:
                        b2 = !str.equals(m1119((ViewConfiguration.getTouchSlop() >> 8) + 49, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1755, (char) (65114 - TextUtils.lastIndexOf("", '0', 0))).intern()) ? (byte) -1 : (byte) 78;
                        break;
                    case 2038381641:
                        b2 = !str.equals(m1119(KeyEvent.keyCodeFromString("") + 15, 682 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (TextUtils.getCapsMode("", 0, 0) + 9204)).intern()) ? (byte) -1 : (byte) 32;
                        break;
                    case 2095560678:
                        b2 = !str.equals(m1119(11 - TextUtils.indexOf((CharSequence) "", '0', 0), 1226 - Color.argb(0, 0, 0, 0), (char) KeyEvent.keyCodeFromString("")).intern()) ? (byte) -1 : (byte) 62;
                        break;
                    case 2118015322:
                        b2 = !str.equals(m1119(43 - (ViewConfiguration.getScrollBarSize() >> 8), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 939, (char) (51778 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 46;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                switch (b2) {
                    case 0:
                        return MTGConfiguration.class;
                    case 1:
                        return MIntegralSDKFactory.class;
                    case 2:
                        return MTGRewardVideoActivity.class;
                    case 3:
                        return VideoWebViewActivity.class;
                    case 4:
                        return AbstractActivity.class;
                    case 5:
                        return AbstractJSActivity.class;
                    case 6:
                        return MTGActivity.class;
                    case 7:
                        return MTGCommonActivity.class;
                    case 8:
                        return MTGAuthorityActivity.class;
                    case 9:
                        return Campaign.class;
                    case 10:
                        return CampaignEx.class;
                    case 11:
                        return InterVideoOutListener.class;
                    case 12:
                        return InterstitialVideoListener.class;
                    case 13:
                        return RewardVideoListener.class;
                    case 14:
                        return MTGInterstitialActivity.class;
                    case 15:
                        return InterstitialListener.class;
                    case 16:
                    case 17:
                        return MTGBannerView.class;
                    case 18:
                    case 19:
                        return MTGBannerWebView.class;
                    case 20:
                        return MTGInterstitialHandler.class;
                    case 21:
                        return MTGInterstitialVideoHandler.class;
                    case 22:
                        return MTGRewardVideoHandler.class;
                    case 23:
                        return MTGBidInterstitialVideoHandler.class;
                    case 24:
                        return MTGBidRewardVideoHandler.class;
                    case 25:
                    case 26:
                        return WallFragment.class;
                    case 27:
                        return NativeListener.class;
                    case 28:
                        return NativeListener.NativeTrackingListener.class;
                    case 29:
                        return NativeListener.NativeAdListener.class;
                    case 30:
                        return AppWallTrackingListener.class;
                    case 31:
                        return TabListFragment.class;
                    case 32:
                        return ShuffleFragment.class;
                    case 33:
                        return MintegralAdActivity.class;
                    case 34:
                        return BottomRefreshListView.class;
                    case 35:
                        return TabPageIndicator.class;
                    case 36:
                    case 37:
                        return WallViewPager.class;
                    case 38:
                        return WallService.class;
                    case 39:
                        return ImpressionCampaignExModel.class;
                    case 40:
                        return TabListView.class;
                    case 41:
                    case 42:
                        return WallView.class;
                    case 43:
                        return CampaignUnit.class;
                    case 44:
                        return BaseFragment.class;
                    case 45:
                    case 46:
                        return BrowserView.class;
                    case 47:
                        return WebViewFragment.class;
                    case 48:
                        return AppReceiver.class;
                    case 49:
                        return CommonJumpLoader.class;
                    case 50:
                    case AD_REWARD_USER_VALUE:
                        return MTGImageView.class;
                    case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                        return MIntegralSDK.class;
                    case 53:
                        return MIntegralConstans.class;
                    case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                        return RoverCampaignUnit.class;
                    case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                        return MtgWallHandler.class;
                    case 56:
                        return MTGOfferWallHandler.class;
                    case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                        return MtgBidCommonHandler.class;
                    case 58:
                        return LoadingActivity.class;
                    case 59:
                        return IDownloadListener.class;
                    case 60:
                        return interstitial.class;
                    case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                        return BidManager.class;
                    case 62:
                        return BidResponsed.class;
                    case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    case 64:
                        return BaseWebView.class;
                    case 65:
                    case 66:
                        return WindVaneWebView.class;
                    case 67:
                    case 68:
                        return MTGAlertDialog.class;
                    case mo.oom.onn /* 69 */:
                    case b.B0 /* 70 */:
                        return MintegralVideoView.class;
                    case 71:
                    case 72:
                        return MintegralVastEndCardView.class;
                    case 73:
                    case mo.oom.ooo /* 74 */:
                        return MintegralNativeEndCardView.class;
                    case mo.oom.oom /* 75 */:
                    case 76:
                        return MintegralClickCTAView.class;
                    case mo.oom.ono /* 77 */:
                    case 78:
                        return MintegralBaseView.class;
                    case mo.oom.on0 /* 79 */:
                    case 80:
                        return MintegralClickMiniCardView.class;
                    case mo.oom.m00 /* 81 */:
                    case 82:
                        return MintegralContainerView.class;
                    case 83:
                    case 84:
                        return MintegralH5EndCardView.class;
                    case 85:
                    case 86:
                        return MintegralLandingPageView.class;
                    case 87:
                    case 88:
                        return MintegralPlayableView.class;
                    case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                        return OnMTGMediaViewListener.class;
                    case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
                        return BannerAdListener.class;
                    case 91:
                        return com.mintegral.msdk.video.signal.activity.AbstractJSActivity.class;
                    case mo.oom.m0n /* 92 */:
                    case mo.oom.mo0 /* 93 */:
                        return com.mintegral.msdk.mtgsignalcommon.base.BaseWebView.class;
                    case 94:
                    case 95:
                        return com.mintegral.msdk.mtgsignalcommon.windvane.WindVaneWebView.class;
                    case 96:
                    case 97:
                        return DomainMTGCommonActivity.class;
                    case 98:
                    case 99:
                        return MBRewardVideoActivity.class;
                    case 100:
                    case 101:
                        return BaseActivity.class;
                    default:
                        return null;
                }
            }
            str.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static void m1113(MTGBannerView mTGBannerView, BannerAdListener bannerAdListener) {
            int i2 = f989 + 85;
            f987 = i2 % 128;
            int i3 = i2 % 2;
            mTGBannerView.setBannerAdListener(bannerAdListener);
            if (i3 != 0) {
                throw null;
            }
        }
    }

    public static class e extends bt {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f1003 = 0;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f1004 = 1;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char[] f1005;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static long f1006;

        static {
            char[] cArr = new char[2131];
            ByteBuffer.wrap("kÇÀÌ=«j Çþ<þi\u009dÆÜ3õhEÅ#2bobÄv1_n\"Û70<\u0000M«MV]\u0001B¬RW-\u00023\u00ad\u000eX\r\u0003õ®÷YÑ\u0004Ý¯¬Z¼\u0000M«FVp\u0001Y¬YW,\u0002(\u00ad\bX\u0014\u0003Ô®ÒYî\u0004ò¯¢Z±\u0005\u0095°\u009f[\u008d\u0007w\u0000M«MVL\u0001H¬KW*\u0002(\u00ad\rX.\u0003î®òYÀ\u0004Û¯\u0082Z±\u0005\u0095°\u0099[\u0089\u0007g²i]UW\u008aü¦\u0001¦V\u0092û\u0085\u0000áUòúÖ\u000fùT\u001fù\u001c\u000e\rS\u000bøa\roRCçO\fM\u0000M«MV_\u0001N¬HW\"\u0002,\u00ad\u0000X\f\u0003þ\u0000M«MV]\u0001B¬QW&\u00025\u00ad\u0007X9\u0003ä®âYÌ\u0004Â¯ªZ¦\u0005\u0098½p\u0016]ë@¼n\u0011nê\u0011¿\u000e\u00104!\u0094\u008a¹w¤ \u008a\u008d\u008avõ#ê\u008cÐyê\"(æ*M\u0002°\tç+J-±~äPKn¾~å\u008bHº¿³â£Iì¼ØãñVç½ùá\u0003T\u001b»=É¦b\u008e\u009f\u0085È§e¡\u009e×ËÁdï\u0091ãÊ\u0001g\u0018\u0090&Í\rfE\u0093YÌkyp\u0092\\Î\u0088{\u0081\u0094·Á±zË\u0097ÓÀõ^Êõò\bñ_ÔòÖ\t·\\\u0094ó\u0098\u0006\u0084]zða\u0007qZEñ(\u0004>[\u001cî\u0006\u0005\u0002YäPÔûÔ\u0006ÎQÚüÑ\u0007·R±ý\u0083\b\u0095Swþ{\tUTLÿ6\n\nU\u001bà\u001d\u000b\u000fWáâí\rÁXÛ\u0000I«aVj\u0001H¬NW8\u0002.\u00ad\u0000X\f\u0003î®÷YÉ\u0004ø¯ªZ¡\u0005\u0095°\u0095[\u0091\u0007k²o\u0000M«MV\\\u0001L¬RW%\u0002?\u00ad\u001bX.\u0003î®óYÒ\u0000c«`Vs\u0001\u0003¬QW)\u0002(\u00ad\u0000X\u001c\u0003à®óY\u008b\u0004Ù¯°Z¶\u0005\u008a°Þ[\u0090\u0007{²i]\u0002\bv³\b^\u001b\t\t´\u0019_è\nðµÖ`å\u000b«¶´a\u00970Y\u009b5f+1\u0018\u009c*gR2C\u009d{h}3§\u009e\u0084i°4\u0095\u009fÝjÀ5á\u0000c«`Vs\u0001\u0003¬QW)\u0002(\u00ad\u0000X\u001c\u0003à®óY\u008b\u0004Ù¯°Z¶\u0005\u008a°Þ[\u0092\u0007l²\u007f]M\bU³$^<\t\u001a´Y_ð\nüµÁ`Ä\u000bì¶\u009ca¢\f\u00ad·\u009fcc\u000er¹NdH\u000f\u001eº=e\u0005\u0010 »ìfñ\u0011Ô\u000f1¤1Y+\u000e?£4XR\rT¢fWp\f\u0092¡\u009eV°\u000b© ÓUæ\nü¿âTç\b\u001e½\u0004R\"\u0001LªLWV\u0000B\u00adIV/\u0003)¬\u001bY\r\u0002ï¯ãXÍ\u0005Ô®®[\u0085\u0004\u0089±\u0095Z\u009b\u0006`³T\\L\tT²/_4\b\fµ\u0004Æ(m>\u0090<Ç\u001aj<\u0091YÄ^k~\u009eyÅ´h\u009a\u009f¤Â´iÉ\u009cÿÃåvû\u009dþÁ\u0007t\u001d\u009b;\u0098\u008a3ªÎ®\u0099\u00804\u008eÏê\u009aÒ5ÄÀÏ\u009b767Á\u000f\u009c\u00157u¤è\u000fÈòÌ¥â\bìó\u0088¦¨\t½ü¿§B\n[ýj |\u000b\u0002þ8¡.\u0014%ÿ-£Í\u0016Õùï¬ï\u0000N«nVj\u0001D¬JW.\u0002\u001b\u00ad\rX4\u0003î®åYÑ\u0004Ñ¯\u00adZ·\u0005\u0093>N\u0095ch~?P\u0092Pi/<0\u0093\nf =ä\u0090ògÜ\u0000B«nVm\u0001H¬zW9\u0002;\u00ad\u000eX\u0015\u0003â®øYÑ¡§\n\u0098÷\u0094 ¿\rªöË£Í\fÚùô¢\u0007\u000f\u0004[nðm\r~Z\u000e÷\\\f/Y9ö\u0010\u0003\u0010Xíõé\u0002É_Õôà\u0001²^\u009fë\u0099\u0000\u0099\\-ér\u0006@SEè\"\u0005zR\u0012ï\u001f\u0004éQîîÀ;ÛP¸íò:¯W\u0090ì\u009c8wUbâC?ET\u0012á<>\u000fK\fU_þb\u0003tTsù]\u0002&W%ø'\r\u0002Vîûù\fÀQÙú¥\u000f®\u0000C«`Vs\u0001@¬SW%\u0002\u0010\u00ad\u001cX\u0015\u0003÷®ÚYÊ\u0004Õ¯§Z·\u0005\u0093ñ\u0016Z\u0016§\fð\u001b]\u0006¦wód\\d©Jò¹_º\u0000c«`Vs\u0001\u0003¬QW)\u0002(\u00ad\u0000X\u001c\u0003à®óY\u008b\u0004Ù¯°Z¶\u0005\u008a°Þ[\u0088\u0007g²y]K\b^³>^w\t%´5_Ï\nøµÅ`Ô\u000b§¶\u0087a\u0089\f\u008a·\u0089È°c»\u009e\u008dÉ¤d¤\u009fÑÊÕeõ\u0090éË)f/\u0091\u0013\u0000M«FVp\u0001Y¬YW,\u0002(\u00ad\bX\u0014\u0003Ä®ùYË\u0004Ç¯·Z³\u0005\u008f°\u0083º\\\u0011pìo»Y\u0016Eí5¸-\u00178â\u000b¹ã\u0014ïãÃ¾Í\u0015§à»\u0000I«KVq\u0001Z¬RW'\u00025\u00ad\bX\u001c\u0003Ë®ÿYÖ\u0004À¯¦Z¼\u0005\u0084°\u0082\u0000i«aVj\u0001H¬NW8\u0002.\u00ad\u0000X\f\u0003î®÷YÉßëtÇ\u0089ÄÞásÂ\u0088\u0087Ý\u0091r\u0096\u0087¸ÜKqH\u008d\u007f&|Ûo\u008c\u001f!MÚ5\u008f4 \u001cÕ\u0000\u008eü#ïÔ\u0097\u0089Å\"¬×ª\u0088\u0096=ÂÖ\u008e\u008ap?rÐY\u0085@>8Ó$\u0084\u00189\bÒõ\u0087ä8ÕíÀ\u0086°;ãì\u009e\u0081\u0092:\u0091ît\u0083.4uéG\u0082&7!è,\u009d\u000f6ûëÞ\u009cÖ1Ëêª®\b\u00059ø/¯\u0016\u00025ùu¬k\u0003Söp\u00ad½\u0000«÷¬ª\u0082\u0001ùôú\u0000c«`Vs\u0001\u0003¬QW)\u0002(\u00ad\u0000X\u001c\u0003à®óY\u008b\u0004Ù¯°Z¶\u0005\u008a°Þ[\u0092\u0007l²n]E\b\\³$^8\t\u0004´\u0014_é\nøµÉ`Ü\u000b¬¶ÿa\u0097\f\u0086·\u0090ci\u000ej¹JdT\u000f,ºve0\u0010\u001f»ëfð\u0011õ¼Óg¯\u0012µ½\u0088h\u008b\u0013\u009f¿Zjr\u0015OÀN\u0099\u00832¨Ï¾\u0098\u00975\u0097Îâ\u009bæ4ÆÁÚ\u009a\u001f71À\u000f\u009d\u001f6bÃJ\u009cF)[ÂFt/ß,\"?uOØ\u001d#evdÙL,Pw¬Ú¿-Çp\u0095Ûü.úqÆÄ\u0092/Ås+Æ5)\u0005|\u0018Ç(*x}KÀ_+¿~µÁ\u008d\u0014Ñ\u007fÃÂß\u0015ÞxÊÃÖ\u0017&z5Í1\u0010\u001f{aÎq\u0011DdlÏ \u0012½e\u0098¸ô\u0013ßîÉ¹à\u0014àï\u0095º\u0091\u0015±à\u00ad»h\u0016Náo¼y\u0017?â\u0005½<\b\nã'¿Å\nÀåÃ°ë\u000b\u0096æ\u0097\u0000c«`Vs\u0001\u0003¬QW)\u0002(\u00ad\u0000X\u001c\u0003à®óY\u008b\u0004Ù¯°Z¶\u0005\u008a°Þ[\u0089\u0007g²y]I\bT³d^4\t\u0007´\u0013_ó\nùµÁ`\u009d\u000b\u008f¶\u0093a\u0092\f\u0086·\u009acj\u000ey¹}d[\u000f:º,e\"\u0010\u0018»áf×\u0011Â¼Àg¥\u0012\u0086½¶h\u008b\u0013\u008a\u0000M«fVp\u0001Y¬YW,\u0002(\u00ad\bX\u0014\u0003É®÷YÑ\u0004Ý¯µZ·\u0005¤°\u009e[\u009b\u0007M²|]^\b_³\u001c^0\t\r´\u0000\u0000c«`Vs\u0001\u0003¬QW)\u0002(\u00ad\u0000X\u001c\u0003à®óY\u008b\u0004Ù¯°Z¶\u0005\u008a°Þ[\u0089\u0007g²y]I\bT³d^4\t\u0007´\u0013_ó\nùµÁ`\u009d\u000b\u008f¶\u0093a\u0092\f\u0086·\u009acj\u000ey¹ed[\u000f=º1e\u0011\u0010\u0013»Àfú\u0011Ç¼ñg \u0012¢½»h¸\u0013\u0094¿ijl,ñ\u0087ÚzÌ-å\u0080å{\u0090.\u0094\u0081´t¨/x\u0082Fup(k\u0083\u0014v-)\t\u009c\rw\u0015+Û\u009eÄqç\u0092ó9¿Ä¢\u0093\u0093>ÁÅõ\u0090ë?ÈÊÂ\u00910<\"Ë\u0013\u0096I=}Èr\u0097V\"HÉ\u0002\u0095« §Ï\u009b\u009a\u008d!öÌ¤\u009bÖ&ËÍ1\u00983'\u001bò\u0005\u0099?$Oóq\u009eN%Dñº\u009c¨+\u009döª\u009dö(â÷×\u0082Î)\u0015ô\u0013\u00831.7õ{\u0080f/{\u0000M«fVp\u0001Y¬YW,\u0002(\u00ad\bX\u0014\u0003Å®÷YÖ\u0004Ñ¯\u0095Z»\u0005\u0084°\u0087×\u0082|\u0081\u0081\u0092Öâ{°\u0080ÈÕÉzá\u008fýÔ\u0001y\u0012\u008ejÓ8xQ\u008dWÒkg?\u008chÐ\u0086e\u0098\u008a¨ßµd\u0085\u0089ÕÞæcò\u0088\u0012Ý\u0018b ·|Ünar¶sÛg`{´\u008bÙ\u0098n\u0088³ºØÛmÜ²ÐÇþl\u0001±\u0002\u0000M«fVp\u0001Y¬YW,\u0002(\u00ad\bX\u0014\u0003Ä®úYÌ\u0004×¯¨Z\u009f\u0005\u0088°\u009e[\u0096\u0007M²|]^\b_³\u001c^0\t\r´\u0000²/\u0019,ä?³O\u001e\u001dåe°d\u001fLêP±¬\u001c¿ëÇ¶\u0095\u001düèú·Æ\u0002\u0092éÅµ+\u00005ï\u0005º\u0018\u0001(ìx»K\u0006_í¿¸µ\u0007\u008dÒÑ¹Ã\u0004ßÓÞ¾Ê\u0005ÖÑ&¼5\u000b$Ö\u001a½l\bw×@¢w\t Ô¶£\u0086\u000e½Õì î\u000f÷Úô¡Ø\r%Ø \u0000M«fVp\u0001Y¬YW,\u0002(\u00ad\bX\u0014\u0003Ä®ùYË\u0004À¯¢Z»\u0005\u008f°\u0095[\u008d\u0007X²t]I\bL\u0000c«`Vs\u0001\u0003¬QW)\u0002(\u00ad\u0000X\u001c\u0003à®óY\u008b\u0004Ù¯°Z¶\u0005\u008a°Þ[\u0089\u0007g²y]I\bT³d^4\t\u0007´\u0013_ó\nùµÁ`\u009d\u000b\u008f¶\u0093a\u0092\f\u0086·\u009acj\u000ey¹hdU\u000f'º,e\u0006\u0010\u001f»ëfñ\u0011Ñ¼äg¨\u0012µ½¨$à\u008fËrÝ%ô\u0088ôs\u0081&\u0085\u0089¥|¹'b\u008a\u000e}M w\u008b\n~<!-\u0094/\u007f6#õ\u0096Ùyä,á\u0000\u008e«\u008dV\u009e\u0001î¬¼WÄ\u0002Å\u00adíXñ\u0003\r®\u001eYf\u00044¯]Z[\u0005g°3[d\u0007\u008a²\u0094]¤\b¹³\u0089^Ù\tê´þ_\u001e\n\u0014µ,`p\u000bb¶~a\u007f\fk·wc\u0087\u000e\u0094¹\u008edâ\u000fáºÛeî\u0010Ø»\tf\u000b\u0011*¼\tgE\u0012X½EÀ\u00adk\u0086\u0096\u0090Á¹l¹\u0097ÌÂÈmè\u0098ôÃ+n\u0017\u0099+Ä0oJ\u009a\\Åfp@\u009b~Ç\u0089r\u0098\u009d\u009aÈ²sÏ\u009eÎ\u0000c«`Vs\u0001\u0003¬QW)\u0002(\u00ad\u0000X\u001c\u0003à®óY\u008b\u0004Ù¯°Z¶\u0005\u008a°Þ[\u0089\u0007g²y]I\bT³d^4\t\u0007´\u0013_ó\nùµÁ`\u009d\u000b\u008f¶\u0093a\u0092\f\u0086·\u009acj\u000ey¹gd[\u000f'º<e\u000e\u0010\u0018»âfÄ\u0011Â¼Õg¤\u0012\u0086½¶h\u008b\u0013\u008a3V\u0098}ek2B\u009fBd713\u009e\u0013k\u000f0Ì\u009dájß7Ö\u009c¹i«6\u0096\u0083\u008eh²4|\u0081cn@Îªe©\u0098ºÏÊb\u0098\u0099àÌácÉ\u0096ÕÍ)`:\u0097BÊ\u0010ay\u0094\u007fËC~\u0017\u0095@É®|°\u0093\u0080Æ\u009d}\u00ad\u0090ýÇÎzÚ\u0091:Ä0{\b®TÅFxZ¯[ÂOyS\u00ad£À°w²ª\u009fÁátè«ÏÞÝu ¨8ß<r\u0012©m\u0000O«aVS\u0001o¬qW.\u0002>\u00ad\u0000X\u0019\u0003Ñ®ÿYÀ\u0004Ã¯\u008fZ»\u0005\u0092°\u0084[\u009a\u0007`²x]^\u0000B«nVp\u0001C¬YW9\u0002\u001b\u00ad\rX4\u0003î®åYÑ\u0004Ñ¯\u00adZ·\u0005\u0093\u0000S«fVy\u0001C¬]W'\u0002\u001b\u00ad\u000bX\u000b\u0003ó®äYÄ\u0004×¯·Z\u0098\u0005²°±[\u009c\u0007z²t]Z\bR³>^ Ã´h\u0090\u0095\u0083Â¼o¥\u0094ÕÁçnû\u009bËÀ\u0018m\u000b\u009a8Ç+l]\u0099cÆrst\u0098fÄ\u0088q\u0084\u009e¨Ë²~ÄÕÇ(Ô\u007f¤Òö)\u008e|\u008fÓ§&»}GÐT',z~Ñ\u0017$\u0011{-Îy%9yÊÌÎ#âvêÍ\u0084 \u008aw¶Êþ!et]Ën\u001euu\fÈ\u0018\u001f\nr\nÉ\u001a\u001dÅpÖÇá\u001aòq\u0080Ä¾\u001b£n¥ÅK\u0018EomÂa\u0019\u001fõô^ô£ÕôýYá¢\u0095÷\u0086X\u0099\u00ad¥öM\u0000R«jVi\u0001L¬NW/\u0002\u0013\u00ad\u0007X\u001e\u0003è\u0000M«MV\\\u0001D¬XW\u0019\u0002?\u00ad\u001eX\u0019\u0003õ®òYó\u0004Ý¯§Z·\u0005\u008e°¸[\u009e\u0007`²y]@\b^³8\u0000I«BV\\\u0001\u007f¬nW.\u0002-\u00ad\bX\n\u0003ã®ÀYÌ\u0004Ð¯¦Z½\u0005©°\u0091[\u0091\u0007j²q]I\bI2Ü\u0099ødû3í\u009eËe®0©\u009f\u0089j\u008e1C\u009cmkS6C\u009d>h\f7\u001a\u0082\u0011i\u00195ù\u0080áoÛ:Û\u0000g«jVj\u0001`¬UW%\u0002.\u00ad\fX\u001f\u0003õ®÷YÉ\u0004ç¯\u0087Z\u0099ówXz¥zòm_M¤8ñ!^\u0018«\u000fðò]ÈªÔ÷É\\¶\u0000g«jVj\u0001n¬PW\"\u00029\u00ad\u0002X-\u0003õ®úñãZî§îðå]Ñ¦¡óµ\\¹©\u0085òs_w\u000eð¥ýXý\u000fó¢ÆY½\fª£\u009bVº\rb m\u0000g«jVj\u0001d¬_W$\u00024\u00ad<X\n\u0003ëmèÆå;ålãÁ×:\u008do±\u008cn'wÚw\u008dr @Û8\u008e)!\u0011Ô\u0017\u008fÌ\"âÕÝ\u0088Þ#\u009fÖ«\u0089°<\u0084×\u0091\u008bg>eÑ_\u0084C?%\u0000g«jVj\u0001l¬XW\u001f\u0002#\u00ad\u0019X\u001d\"ý\u0089ðtð#ò\u008eÈuµ \u0093\u008f\u0090z\u0090!x\u008ci{Q&{\u008d+x$>c\u0095nhn?j\u0092Yi\"<.\u0093\ff\u0015=ä\u0090ügô:Þ\u0091®d¢;¬\u008e\u0090®\u0011\u0005\u001cø\u001c¯\u000b\u0002&ù\\¬O\u0003zöc\u00ad\u0094\u0000\u008e÷§ª\u008b\u0001Ñt\u0016ß\u001b\"\u001bu\u001eØ,#TvEÙ},{w£Ú\u0095-¸ï\u008cD\u0081¹\u0081î\u0087C³¸úíØBò\u0000g«jVj\u0001{¬UW/\u0002?\u00ad\u0006X-\u0003õ®úYà\u0004Ú¯ Z½\u0005\u0085°\u0095\u0000g«jVj\u0001n¬NW.\u0002;\u00ad\u001dX\u0011\u0003ñ®óYì\u0004Ð\u008e\u001a%\u0017Ø\u0017\u008f\u0011\"%Ù~\u008cS#yÖi\u0000g«jVj\u0001o¬]W%\u00024\u00ad\fX\n\u0003Ï®âYÈ\u0004Ø\u0000g«jVj\u0001}¬WW,\u0002\t\u00ad\u0006X\r\u0003õ®õYÀØ¯s¢\u008e¢Ù\u00adt\u0080\u008fîÚþuô\u0080ÂÛ#\u0000g«jVj\u0001`¬~W9\u00023\u00ad\rX\u001f\u0003â®ÆYÉ\u0004Õ¯ Z·\u0005\u008c°\u0095[\u0091\u0007z²T]H\u0000g«jVj\u0001`¬~W9\u00023\u00ad\rX\u001f\u0003â®ÃYË\u0004Ý¯·Z\u009b\u0005\u0085\u0000i«|VL\u0001H¬KW*\u0002(\u00ad\rX;\u0003è®ûYÕ\u0004Ø¯¦Z¦\u0005\u0084°¦[\u0096\u0007k²j\u0000g«jVj\u0001\u007f¬YW<\u0002;\u00ad\u001bX\u001c\u0003É®÷YÈ\u0004Ñ\u0000g«jVj\u0001\u007f¬YW<\u0002;\u00ad\u001bX\u001c\u0003Æ®ûYÊ\u0004Á¯\u00adZ¦4{\u009fvbv5\u007f\u0098Ac#6/\u0099\u0003l\u00017Í\u009aãmÝ0Í\u009b°n\u009a1\u008f\u0084\u008do\u00803y\u0086hi^<@\u0087\u0005j1=\u0006\u0080\u0002kô>î".getBytes(CharEncoding.ISO_8859_1)).asCharBuffer().get(cArr, 0, 2131);
            f1005 = cArr;
            f1006 = 2293121568085814031L;
        }

        public e(String str) {
            super(str);
        }

        /* JADX INFO: renamed from: Ḽ, reason: contains not printable characters */
        private static String m1121(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            int i2 = f1003 + 49;
            f1004 = i2 % 128;
            int i3 = i2 % 2;
            String nativeVideoTrackingString = campaignEx.getNativeVideoTrackingString();
            if (i3 == 0) {
                int i4 = 13 / 0;
            }
            int i5 = f1003 + 123;
            f1004 = i5 % 128;
            if (i5 % 2 != 0) {
                return nativeVideoTrackingString;
            }
            throw null;
        }

        /* JADX INFO: renamed from: Ṿ, reason: contains not printable characters */
        private static String m1122(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            int i2 = f1004 + 49;
            f1003 = i2 % 128;
            int i3 = i2 % 2;
            String pkgSource = campaignEx.getPkgSource();
            if (i3 != 0) {
                int i4 = 41 / 0;
            }
            f1004 = (f1003 + 107) % 128;
            return pkgSource;
        }

        /* JADX INFO: renamed from: Ὑ, reason: contains not printable characters */
        private static String m1123(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1003 = (f1004 + 95) % 128;
            String htmlUrl = campaignEx.getHtmlUrl();
            f1003 = (f1004 + 87) % 128;
            return htmlUrl;
        }

        /* JADX INFO: renamed from: Ὺ, reason: contains not printable characters */
        private static long m1124(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            long creativeId;
            int i2 = f1003 + 121;
            f1004 = i2 % 128;
            if (i2 % 2 == 0) {
                creativeId = campaignEx.getCreativeId();
                int i3 = 54 / 0;
            } else {
                creativeId = campaignEx.getCreativeId();
            }
            f1004 = (f1003 + 63) % 128;
            return creativeId;
        }

        /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
        private static String m1125(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            int i2 = f1004 + 93;
            f1003 = i2 % 128;
            int i3 = i2 % 2;
            String adHtml = campaignEx.getAdHtml();
            if (i3 != 0) {
                int i4 = 11 / 0;
            }
            int i5 = f1003 + 119;
            f1004 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 47 / 0;
            }
            return adHtml;
        }

        /* JADX INFO: renamed from: K, reason: contains not printable characters */
        private static String m1126(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1004 = (f1003 + 91) % 128;
            String bannerHtml = campaignEx.getBannerHtml();
            f1003 = (f1004 + 19) % 128;
            return bannerHtml;
        }

        /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
        private static String m1127(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            int i2 = f1004 + 125;
            f1003 = i2 % 128;
            int i3 = i2 % 2;
            String adZip = campaignEx.getAdZip();
            if (i3 != 0) {
                int i4 = 81 / 0;
            }
            f1004 = (f1003 + 119) % 128;
            return adZip;
        }

        /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
        private static String m1128(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1003 = (f1004 + 33) % 128;
            String videoUrlEncode = campaignEx.getVideoUrlEncode();
            int i2 = f1003 + 41;
            f1004 = i2 % 128;
            if (i2 % 2 != 0) {
                return videoUrlEncode;
            }
            throw null;
        }

        /* JADX INFO: renamed from: く, reason: contains not printable characters */
        private static String m1129(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1004 = (f1003 + 111) % 128;
            String campaignUnitId = campaignEx.getCampaignUnitId();
            int i2 = f1004 + 115;
            f1003 = i2 % 128;
            if (i2 % 2 == 0) {
                return campaignUnitId;
            }
            throw null;
        }

        /* JADX INFO: renamed from: っ, reason: contains not printable characters */
        private static String m1130(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            int i2 = f1004 + 91;
            f1003 = i2 % 128;
            if (i2 % 2 != 0) {
                campaignEx.getId();
                throw null;
            }
            String id = campaignEx.getId();
            int i3 = f1004 + 73;
            f1003 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 34 / 0;
            }
            return id;
        }

        /* JADX INFO: renamed from: へ, reason: contains not printable characters */
        private static String m1131(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1004 = (f1003 + 97) % 128;
            String placementId = campaignEx.getPlacementId();
            int i2 = f1003 + 95;
            f1004 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 67 / 0;
            }
            return placementId;
        }

        /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
        private static String m1132(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1004 = (f1003 + 41) % 128;
            String bannerUrl = campaignEx.getBannerUrl();
            f1003 = (f1004 + 125) % 128;
            return bannerUrl;
        }

        /* JADX INFO: renamed from: ト, reason: contains not printable characters */
        private static String m1133(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1004 = (f1003 + 11) % 128;
            String endScreenUrl = campaignEx.getEndScreenUrl();
            f1003 = (f1004 + 5) % 128;
            return endScreenUrl;
        }

        /* JADX INFO: renamed from: リ, reason: contains not printable characters */
        private static String m1134(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1004 = (f1003 + 55) % 128;
            String imageUrl = campaignEx.getImageUrl();
            int i2 = f1004 + 45;
            f1003 = i2 % 128;
            if (i2 % 2 == 0) {
                return imageUrl;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
        private static int m1135(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            int i2 = f1003 + 67;
            f1004 = i2 % 128;
            if (i2 % 2 != 0) {
                return campaignEx.getAdType();
            }
            campaignEx.getAdType();
            throw null;
        }

        /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
        private static int m1136(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1003 = (f1004 + 67) % 128;
            int linkType = campaignEx.getLinkType();
            int i2 = f1004 + 121;
            f1003 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 7 / 0;
            }
            return linkType;
        }

        /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
        private static String m1137(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            int i2 = f1004 + 3;
            f1003 = i2 % 128;
            int i3 = i2 % 2;
            String iconUrl = campaignEx.getIconUrl();
            if (i3 != 0) {
                int i4 = 83 / 0;
            }
            int i5 = f1004 + 97;
            f1003 = i5 % 128;
            if (i5 % 2 == 0) {
                return iconUrl;
            }
            throw null;
        }

        /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
        private static String m1138(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            int i2 = f1003 + 63;
            f1004 = i2 % 128;
            if (i2 % 2 == 0) {
                campaignEx.getClickURL();
                throw null;
            }
            String clickURL = campaignEx.getClickURL();
            f1004 = (f1003 + 61) % 128;
            return clickURL;
        }

        /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
        public static /* synthetic */ String m1139(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1003 = (f1004 + 61) % 128;
            String strM1126 = m1126(campaignEx);
            f1003 = (f1004 + 87) % 128;
            return strM1126;
        }

        /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
        public static /* synthetic */ String m1140(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            int i2 = f1004 + 43;
            f1003 = i2 % 128;
            if (i2 % 2 == 0) {
                return m1122(campaignEx);
            }
            m1122(campaignEx);
            throw null;
        }

        /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
        public static /* synthetic */ String m1141(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1003 = (f1004 + 63) % 128;
            String strM1123 = m1123(campaignEx);
            int i2 = f1004 + 5;
            f1003 = i2 % 128;
            if (i2 % 2 == 0) {
                return strM1123;
            }
            throw null;
        }

        /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
        public static /* synthetic */ String m1142(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1003 = (f1004 + 109) % 128;
            String strM1121 = m1121(campaignEx);
            f1004 = (f1003 + 117) % 128;
            return strM1121;
        }

        /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
        private static String m1143(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1004 = (f1003 + 77) % 128;
            String packageName = campaignEx.getPackageName();
            f1004 = (f1003 + 55) % 128;
            return packageName;
        }

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        public static /* synthetic */ String m1144(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1003 = (f1004 + 17) % 128;
            String strM1127 = m1127(campaignEx);
            int i2 = f1003 + 89;
            f1004 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 31 / 0;
            }
            return strM1127;
        }

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        public static /* synthetic */ long m1145(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1003 = (f1004 + 5) % 128;
            long jM1124 = m1124(campaignEx);
            f1004 = (f1003 + 11) % 128;
            return jM1124;
        }

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        public static /* synthetic */ String m1146(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            int i2 = f1004 + 41;
            f1003 = i2 % 128;
            if (i2 % 2 != 0) {
                m1132(campaignEx);
                throw null;
            }
            String strM1132 = m1132(campaignEx);
            f1004 = (f1003 + 23) % 128;
            return strM1132;
        }

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        public static /* synthetic */ String m1147(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            int i2 = f1003 + 51;
            f1004 = i2 % 128;
            int i3 = i2 % 2;
            String strM1125 = m1125(campaignEx);
            if (i3 == 0) {
                int i4 = 31 / 0;
            }
            return strM1125;
        }

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        public static /* synthetic */ String m1148(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1003 = (f1004 + 91) % 128;
            String strM1128 = m1128(campaignEx);
            f1003 = (f1004 + 67) % 128;
            return strM1128;
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        public static /* synthetic */ Object m1149() {
            int i2 = f1003 + 25;
            f1004 = i2 % 128;
            if (i2 % 2 == 0) {
                m1153();
                throw null;
            }
            Object objM1153 = m1153();
            int i3 = f1003 + 15;
            f1004 = i3 % 128;
            if (i3 % 2 != 0) {
                return objM1153;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        public static /* synthetic */ String m1151(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1004 = (f1003 + 13) % 128;
            String strM1130 = m1130(campaignEx);
            int i2 = f1004 + 65;
            f1003 = i2 % 128;
            if (i2 % 2 == 0) {
                return strM1130;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public static /* synthetic */ int m1152(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            int i2 = f1004 + 27;
            f1003 = i2 % 128;
            if (i2 % 2 == 0) {
                return m1135(campaignEx);
            }
            m1135(campaignEx);
            throw null;
        }

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        public static /* synthetic */ String m1155(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1003 = (f1004 + 35) % 128;
            String strM1131 = m1131(campaignEx);
            f1004 = (f1003 + 31) % 128;
            return strM1131;
        }

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        public static /* synthetic */ String m1156(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            int i2 = f1004 + 1;
            f1003 = i2 % 128;
            int i3 = i2 % 2;
            String strM1133 = m1133(campaignEx);
            if (i3 != 0) {
                int i4 = 45 / 0;
            }
            int i5 = f1004 + 125;
            f1003 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 27 / 0;
            }
            return strM1133;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ String m1158(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1004 = (f1003 + 67) % 128;
            String strM1143 = m1143(campaignEx);
            int i2 = f1003 + 37;
            f1004 = i2 % 128;
            if (i2 % 2 != 0) {
                return strM1143;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ String m1162(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            int i2 = f1003 + 101;
            f1004 = i2 % 128;
            if (i2 % 2 != 0) {
                return m1134(campaignEx);
            }
            m1134(campaignEx);
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ int m1165(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1004 = (f1003 + 65) % 128;
            int iM1136 = m1136(campaignEx);
            int i2 = f1004 + 69;
            f1003 = i2 % 128;
            if (i2 % 2 == 0) {
                return iM1136;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ String m1168(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1003 = (f1004 + 81) % 128;
            String strM1137 = m1137(campaignEx);
            int i2 = f1003 + 89;
            f1004 = i2 % 128;
            if (i2 % 2 != 0) {
                return strM1137;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ String m1171(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            int i2 = f1003 + 71;
            f1004 = i2 % 128;
            int i3 = i2 % 2;
            String strM1138 = m1138(campaignEx);
            if (i3 == 0) {
                int i4 = 78 / 0;
            }
            f1003 = (f1004 + 57) % 128;
            return strM1138;
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        public static /* synthetic */ String m1150(com.mbridge.msdk.foundation.entity.CampaignEx campaignEx) {
            f1004 = (f1003 + 39) % 128;
            String strM1129 = m1129(campaignEx);
            f1003 = (f1004 + 85) % 128;
            return strM1129;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static Object m1153() {
            f1004 = (f1003 + 107) % 128;
            com.mbridge.msdk.system.a mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
            int i2 = f1003 + 115;
            f1004 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 94 / 0;
            }
            return mBridgeSDK;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ String m1160(RewardInfo rewardInfo) {
            int i2 = f1004 + 83;
            f1003 = i2 % 128;
            int i3 = i2 % 2;
            String strM1154 = m1154(rewardInfo);
            if (i3 != 0) {
                int i4 = 96 / 0;
            }
            f1003 = (f1004 + 113) % 128;
            return strM1154;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ String m1163(MBridgeIds mBridgeIds) {
            f1004 = (f1003 + 91) % 128;
            String strM1159 = m1159(mBridgeIds);
            f1003 = (f1004 + 97) % 128;
            return strM1159;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ void m1166(MBBannerView mBBannerView, com.mbridge.msdk.out.BannerAdListener bannerAdListener) {
            int i2 = f1004 + 3;
            f1003 = i2 % 128;
            int i3 = i2 % 2;
            m1161(mBBannerView, bannerAdListener);
            if (i3 != 0) {
                throw null;
            }
            int i4 = f1004 + 81;
            f1003 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ String m1169(MBridgeIds mBridgeIds) {
            f1003 = (f1004 + 67) % 128;
            String strM1172 = m1172(mBridgeIds);
            int i2 = f1004 + 7;
            f1003 = i2 % 128;
            if (i2 % 2 == 0) {
                return strM1172;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ String m1173(RewardInfo rewardInfo) {
            f1003 = (f1004 + 41) % 128;
            String strM1164 = m1164(rewardInfo);
            int i2 = f1003 + 77;
            f1004 = i2 % 128;
            if (i2 % 2 != 0) {
                return strM1164;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static String m1154(RewardInfo rewardInfo) {
            int i2 = f1003 + 91;
            f1004 = i2 % 128;
            if (i2 % 2 != 0) {
                return rewardInfo.getRewardAmount();
            }
            rewardInfo.getRewardAmount();
            throw null;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m1159(MBridgeIds mBridgeIds) {
            int i2 = f1004 + 117;
            f1003 = i2 % 128;
            int i3 = i2 % 2;
            String unitId = mBridgeIds.getUnitId();
            if (i3 != 0) {
                int i4 = 34 / 0;
            }
            int i5 = f1004 + 9;
            f1003 = i5 % 128;
            if (i5 % 2 == 0) {
                return unitId;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ boolean m1167(RewardInfo rewardInfo) {
            f1003 = (f1004 + 93) % 128;
            boolean zM1170 = m1170(rewardInfo);
            f1004 = (f1003 + 45) % 128;
            return zM1170;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m1172(MBridgeIds mBridgeIds) {
            int i2 = f1004 + 73;
            f1003 = i2 % 128;
            if (i2 % 2 != 0) {
                mBridgeIds.getPlacementId();
                throw null;
            }
            String placementId = mBridgeIds.getPlacementId();
            f1004 = (f1003 + 105) % 128;
            return placementId;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
        /* JADX INFO: renamed from: ﻛ */
        public final Map<String, bg.b> mo707() {
            HashMap map = new HashMap();
            map.put(m1157((ViewConfiguration.getScrollDefaultDelay() >> 16) + 15, 1768 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.5
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return e.m1149();
                }
            });
            map.put(m1157(14 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1782 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 62224)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.12
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return e.m1158((com.mbridge.msdk.foundation.entity.CampaignEx) list.get(0));
                }
            });
            map.put(m1157(11 - View.MeasureSpec.makeMeasureSpec(0, 0), 1796 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.20
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return e.m1171((com.mbridge.msdk.foundation.entity.CampaignEx) list.get(0));
                }
            });
            map.put(m1157(View.combineMeasuredStates(0, 0) + 11, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1807, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 61829)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.24
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return Integer.valueOf(e.m1165((com.mbridge.msdk.foundation.entity.CampaignEx) list.get(0)));
                }
            });
            map.put(m1157(11 - TextUtils.getTrimmedLength(""), 1818 - Color.red(0), (char) (KeyEvent.getDeadChar(0, 0) + 3735)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.23
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return e.m1162((com.mbridge.msdk.foundation.entity.CampaignEx) list.get(0));
                }
            });
            map.put(m1157((ViewConfiguration.getLongPressTimeout() >> 16) + 10, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1828, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.22
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return e.m1168((com.mbridge.msdk.foundation.entity.CampaignEx) list.get(0));
                }
            });
            map.put(m1157((Process.myPid() >> 22) + 7, 1839 - (ViewConfiguration.getTapTimeout() >> 16), (char) (28047 - (ViewConfiguration.getTapTimeout() >> 16))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.25
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return e.m1151((com.mbridge.msdk.foundation.entity.CampaignEx) list.get(0));
                }
            });
            map.put(m1157(23 - Color.blue(0), 1846 - Drawable.resolveOpacity(0, 0), (char) (35869 - Color.green(0))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.21
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    e.m1166((MBBannerView) list.get(0), (com.mbridge.msdk.out.BannerAdListener) list.get(1));
                    return null;
                }
            });
            map.put(m1157((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 8, View.MeasureSpec.makeMeasureSpec(0, 0) + 1869, (char) (TextUtils.lastIndexOf("", '0') + 1)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.27
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return Integer.valueOf(e.m1152((com.mbridge.msdk.foundation.entity.CampaignEx) list.get(0)));
                }
            });
            map.put(m1157((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1878, (char) (8858 - (ViewConfiguration.getFadingEdgeLength() >> 16))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.4
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return e.m1156((com.mbridge.msdk.foundation.entity.CampaignEx) list.get(0));
                }
            });
            map.put(m1157(17 - Color.green(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 1894, (char) (View.resolveSize(0, 0) + 15876)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.2
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return e.m1150((com.mbridge.msdk.foundation.entity.CampaignEx) list.get(0));
                }
            });
            map.put(m1157((ViewConfiguration.getLongPressTimeout() >> 16) + 14, 1910 - TextUtils.getOffsetAfter("", 0), (char) (44661 - TextUtils.lastIndexOf("", '0'))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.1
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return e.m1155((com.mbridge.msdk.foundation.entity.CampaignEx) list.get(0));
                }
            });
            map.put(m1157(TextUtils.indexOf("", "") + 12, ExpandableListView.getPackedPositionGroup(0L) + 1924, (char) (TextUtils.indexOf("", "", 0, 0) + 29809)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.3
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return e.m1146((com.mbridge.msdk.foundation.entity.CampaignEx) list.get(0));
                }
            });
            map.put(m1157(Color.red(0) + 8, View.MeasureSpec.getMode(0) + 1936, (char) (TextUtils.getOffsetBefore("", 0) + 61419)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.6
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return e.m1144((com.mbridge.msdk.foundation.entity.CampaignEx) list.get(0));
                }
            });
            map.put(m1157(17 - View.resolveSizeAndState(0, 0, 0), 1944 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.8
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return e.m1148((com.mbridge.msdk.foundation.entity.CampaignEx) list.get(0));
                }
            });
            map.put(m1157(12 - Process.getGidForName(""), (ViewConfiguration.getTouchSlop() >> 8) + 1961, (char) (Process.getGidForName("") + 1)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.10
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return Long.valueOf(e.m1145((com.mbridge.msdk.foundation.entity.CampaignEx) list.get(0)));
                }
            });
            map.put(m1157(ImageFormat.getBitsPerPixel(0) + 10, 1975 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 36478)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.9
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return e.m1147((com.mbridge.msdk.foundation.entity.CampaignEx) list.get(0));
                }
            });
            map.put(m1157((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 14, 1982 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) TextUtils.getCapsMode("", 0, 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.7
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return e.m1139((com.mbridge.msdk.foundation.entity.CampaignEx) list.get(0));
                }
            });
            map.put(m1157(((Process.getThreadPriority(0) + 20) >> 6) + 12, 1996 - TextUtils.indexOf("", ""), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.13
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return e.m1140((com.mbridge.msdk.foundation.entity.CampaignEx) list.get(0));
                }
            });
            map.put(m1157(10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2008 - KeyEvent.getDeadChar(0, 0), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 55496)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.11
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return e.m1141((com.mbridge.msdk.foundation.entity.CampaignEx) list.get(0));
                }
            });
            map.put(m1157(Color.argb(0, 0, 0, 0) + 21, TextUtils.indexOf("", "", 0) + 2018, (char) View.MeasureSpec.getMode(0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.15
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return e.m1169((MBridgeIds) list.get(0));
                }
            });
            map.put(m1157(16 - Color.blue(0), 2039 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ExpandableListView.getPackedPositionType(0L)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.14
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return e.m1163((MBridgeIds) list.get(0));
                }
            });
            map.put(m1157(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 21, TextUtils.getOffsetBefore("", 0) + 2055, (char) ((-1) - ImageFormat.getBitsPerPixel(0))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.17
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return Boolean.valueOf(e.m1167((RewardInfo) list.get(0)));
                }
            });
            map.put(m1157(13 - (ViewConfiguration.getFadingEdgeLength() >> 16), Process.getGidForName("") + 2076, (char) View.resolveSizeAndState(0, 0, 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.18
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return e.m1173((RewardInfo) list.get(0));
                }
            });
            map.put(m1157(TextUtils.getTrimmedLength("") + 15, TextUtils.getTrimmedLength("") + 2088, (char) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.19
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return e.m1160((RewardInfo) list.get(0));
                }
            });
            map.put(m1157(28 - Color.red(0), 2103 - Color.red(0), (char) (13340 - (KeyEvent.getMaxKeyCode() >> 16))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bt.e.16
                @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo710(List<Object> list, ch chVar) {
                    return e.m1142((com.mbridge.msdk.foundation.entity.CampaignEx) list.get(0));
                }
            });
            f1003 = (f1004 + 125) % 128;
            return map;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
        /* JADX INFO: renamed from: ﾇ */
        public final String mo793() {
            hw hwVarM2245;
            int jumpTapTimeout;
            int scrollBarFadeDuration;
            int i2;
            int i3 = f1004 + 17;
            f1003 = i3 % 128;
            if (i3 % 2 != 0) {
                hwVarM2245 = hr.m2242().m2245();
                jumpTapTimeout = 71 >>> (ViewConfiguration.getJumpTapTimeout() % 40);
                scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() / 16;
                i2 = (ExpandableListView.getPackedPositionForGroup(1) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 0L ? 0 : -1)) + 8238;
            } else {
                hwVarM2245 = hr.m2242().m2245();
                jumpTapTimeout = 18 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                i2 = 27625 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            }
            return hwVarM2245.m2314(MBConfiguration.class, m1157(jumpTapTimeout, scrollBarFadeDuration, (char) i2).intern());
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static void m1161(MBBannerView mBBannerView, com.mbridge.msdk.out.BannerAdListener bannerAdListener) {
            int i2 = f1003 + 61;
            f1004 = i2 % 128;
            int i3 = i2 % 2;
            mBBannerView.setBannerAdListener(bannerAdListener);
            if (i3 == 0) {
                int i4 = 56 / 0;
            }
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static boolean m1170(RewardInfo rewardInfo) {
            f1004 = (f1003 + 51) % 128;
            boolean zIsCompleteView = rewardInfo.isCompleteView();
            int i2 = f1004 + 63;
            f1003 = i2 % 128;
            if (i2 % 2 == 0) {
                return zIsCompleteView;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:105:0x04f3  */
        /* JADX WARN: Code duplicated, block: B:111:0x052b  */
        /* JADX WARN: Code duplicated, block: B:15:0x00af  */
        /* JADX WARN: Code duplicated, block: B:39:0x01cf  */
        /* JADX WARN: Code duplicated, block: B:45:0x0206  */
        /* JADX WARN: Code duplicated, block: B:87:0x041c  */
        @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
        /* JADX INFO: renamed from: ｋ */
        public final Class mo708(String str) {
            byte b2 = -1;
            byte b3 = 48;
            switch (str.hashCode()) {
                case -2107186802:
                    if (!str.equals(m1157((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 15, 453 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) View.resolveSizeAndState(0, 0, 0)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 22;
                    }
                    break;
                case -1980005015:
                    b3 = !str.equals(m1157(15 - (ViewConfiguration.getJumpTapTimeout() >> 16), (Process.myPid() >> 22) + 547, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 21768)).intern()) ? (byte) -1 : (byte) 27;
                    break;
                case -1945308362:
                    b3 = !str.equals(m1157((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 54, TextUtils.indexOf("", "", 0, 0) + 993, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 45;
                    break;
                case -1940754118:
                    b3 = !str.equals(m1157((ViewConfiguration.getDoubleTapTimeout() >> 16) + 18, 73 - Color.blue(0), (char) (AndroidCharacter.getMirror('0') + 22427)).intern()) ? (byte) -1 : (byte) 3;
                    break;
                case -1874906197:
                    b3 = !str.equals(m1157(23 - Process.getGidForName(""), 892 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (47289 - View.combineMeasuredStates(0, 0))).intern()) ? (byte) -1 : (byte) 42;
                    break;
                case -1850171958:
                    b3 = !str.equals(m1157(16 - Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + com.smartdigimkt.b0.a.a1, (char) (12407 - View.MeasureSpec.getSize(0))).intern()) ? (byte) -1 : (byte) 15;
                    break;
                case -1766796574:
                    b3 = !str.equals(m1157(Color.blue(0) + 22, 431 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (42150 - (ViewConfiguration.getFadingEdgeLength() >> 16))).intern()) ? (byte) -1 : (byte) 21;
                    break;
                case -1728440643:
                    if (!str.equals(m1157(46 - TextUtils.getOffsetBefore("", 0), 845 - Gravity.getAbsoluteGravity(0, 0), (char) (29771 - TextUtils.lastIndexOf("", '0'))).intern())) {
                        b3 = -1;
                    } else {
                        f1003 = (f1004 + 57) % 128;
                        b3 = 41;
                    }
                    break;
                case -1702626105:
                    if (!str.equals(m1157(17 - TextUtils.lastIndexOf("", '0', 0), ExpandableListView.getPackedPositionChild(0L) + 828, (char) (39374 - Color.green(0))).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 40;
                    }
                    break;
                case -1679044855:
                    b3 = !str.equals(m1157(21 - KeyEvent.keyCodeFromString(""), 1548 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 60;
                    break;
                case -1656370481:
                    b3 = !str.equals(m1157((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15, 756 - View.resolveSize(0, 0), (char) (44640 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 38;
                    break;
                case -1358506046:
                    b3 = !str.equals(m1157(((Process.getThreadPriority(0) + 20) >> 6) + 33, View.resolveSizeAndState(0, 0, 0) + 254, (char) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern()) ? (byte) -1 : (byte) 14;
                    break;
                case -1355055839:
                    b3 = !str.equals(m1157(52 - Drawable.resolveOpacity(0, 0), 915 - View.MeasureSpec.getSize(0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1)).intern()) ? (byte) -1 : (byte) 43;
                    break;
                case -1346045035:
                    b3 = !str.equals(m1157(47 - ExpandableListView.getPackedPositionChild(0L), View.resolveSizeAndState(0, 0, 0) + IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT, (char) (Gravity.getAbsoluteGravity(0, 0) + 36124)).intern()) ? (byte) -1 : (byte) 37;
                    break;
                case -1119480813:
                    b3 = !str.equals(m1157(22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1611 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (View.resolveSize(0, 0) + 50160)).intern()) ? (byte) -1 : (byte) 63;
                    break;
                case -1091491584:
                    b3 = !str.equals(m1157(47 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 302, (char) (ViewConfiguration.getTouchSlop() >> 8)).intern()) ? (byte) -1 : (byte) 16;
                    break;
                case -1058625022:
                    b3 = !str.equals(m1157((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25, 1586 - View.MeasureSpec.getSize(0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern()) ? (byte) -1 : (byte) 62;
                    break;
                case -920590771:
                    b3 = !str.equals(m1157(22 - KeyEvent.getDeadChar(0, 0), KeyEvent.getDeadChar(0, 0) + 1260, (char) ExpandableListView.getPackedPositionType(0L)).intern()) ? (byte) -1 : (byte) 52;
                    break;
                case -894298414:
                    b3 = !str.equals(m1157(24 - Color.alpha(0), 1404 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (View.MeasureSpec.getSize(0) + 49376)).intern()) ? (byte) -1 : (byte) 56;
                    break;
                case -667901878:
                    if (!str.equals(m1157(23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1333 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (9388 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 54;
                    }
                    break;
                case -610610019:
                    b3 = !str.equals(m1157((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10, 1691 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 66;
                    break;
                case -495785498:
                    if (!str.equals(m1157(21 - Color.alpha(0), 52 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) Color.argb(0, 0, 0, 0)).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 2;
                    }
                    break;
                case -453012127:
                    b3 = !str.equals(m1157(15 - (ViewConfiguration.getJumpTapTimeout() >> 16), 18 - View.getDefaultSize(0, 0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'))).intern()) ? (byte) -1 : (byte) 0;
                    break;
                case -374448056:
                    b3 = !str.equals(m1157(52 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 1429, (char) (Process.myTid() >> 22)).intern()) ? (byte) -1 : (byte) 57;
                    break;
                case -323393690:
                    b3 = !str.equals(m1157(12 - (Process.myPid() >> 22), 242 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 13;
                    break;
                case -239039370:
                    if (!str.equals(m1157(47 - ImageFormat.getBitsPerPixel(0), 1632 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (32424 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 64;
                    }
                    break;
                case -156796625:
                    if (!str.equals(m1157(Drawable.resolveOpacity(0, 0) + 17, 1117 - TextUtils.lastIndexOf("", '0'), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                        b3 = -1;
                    } else {
                        f1004 = (f1003 + 71) % 128;
                    }
                    break;
                case -126256187:
                    b3 = !str.equals(m1157(17 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 667, (char) ((-1) - MotionEvent.axisFromString(""))).intern()) ? (byte) -1 : (byte) 34;
                    break;
                case -121577375:
                    b3 = !str.equals(m1157(11 - TextUtils.lastIndexOf("", '0', 0), 624 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (51453 - View.combineMeasuredStates(0, 0))).intern()) ? (byte) -1 : (byte) 31;
                    break;
                case -75274960:
                    b3 = !str.equals(m1157(8 - Drawable.resolveOpacity(0, 0), View.MeasureSpec.getMode(0) + 117, (char) (ExpandableListView.getPackedPositionType(0L) + 48435)).intern()) ? (byte) -1 : (byte) 6;
                    break;
                case -33766813:
                    b3 = !str.equals(m1157(25 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.resolveSize(0, 0) + 156, (char) (Gravity.getAbsoluteGravity(0, 0) + 51695)).intern()) ? (byte) -1 : (byte) 9;
                    break;
                case 114573451:
                    b3 = !str.equals(m1157(Color.green(0) + 11, Color.red(0) + 578, (char) (61787 - (Process.myTid() >> 22))).intern()) ? (byte) -1 : (byte) 29;
                    break;
                case 154057692:
                    b3 = !str.equals(m1157(View.getDefaultSize(0, 0) + 17, TextUtils.getTrimmedLength("") + 636, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 32;
                    break;
                case 174921027:
                    b3 = !str.equals(m1157((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49, 1282 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (TextUtils.lastIndexOf("", '0') + 1)).intern()) ? (byte) -1 : (byte) 53;
                    break;
                case 329817920:
                    b3 = !str.equals(m1157(19 - ((Process.getThreadPriority(0) + 20) >> 6), 180 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (KeyEvent.getDeadChar(0, 0) + 24216)).intern()) ? (byte) -1 : (byte) 10;
                    break;
                case 336960212:
                    if (!str.equals(m1157((ViewConfiguration.getTouchSlop() >> 8) + 12, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 470, (char) (15884 - TextUtils.indexOf((CharSequence) "", '0'))).intern())) {
                        b3 = -1;
                    } else {
                        b3 = 23;
                    }
                    break;
                case 373899945:
                    b3 = !str.equals(m1157(21 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 349 - ExpandableListView.getPackedPositionGroup(0L), (char) (MotionEvent.axisFromString("") + 3965)).intern()) ? (byte) -1 : (byte) 17;
                    break;
                case 427609920:
                    if (!str.equals(m1157(50 - (Process.myTid() >> 22), 1354 - TextUtils.getTrimmedLength(""), (char) (237 - (ViewConfiguration.getPressedStateDuration() >> 16))).intern())) {
                        b3 = -1;
                    } else {
                        int i2 = f1004 + 63;
                        f1003 = i2 % 128;
                        if (i2 % 2 == 0) {
                            b3 = 55;
                        } else {
                            b3 = 64;
                        }
                    }
                    break;
                case 604727084:
                    if (!str.equals(m1157((Process.myPid() >> 22) + 12, 685 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern())) {
                        b3 = -1;
                    } else {
                        int i3 = f1003 + 5;
                        f1004 = i3 % 128;
                        if (i3 % 2 != 0) {
                            b3 = 35;
                        } else {
                            b3 = 22;
                        }
                    }
                    break;
                case 675209731:
                    b3 = !str.equals(m1157((ViewConfiguration.getDoubleTapTimeout() >> 16) + 10, Gravity.getAbsoluteGravity(0, 0) + 125, (char) (8662 - Process.getGidForName(""))).intern()) ? (byte) -1 : (byte) 7;
                    break;
                case 713779451:
                    b3 = !str.equals(m1157(26 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1180, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0))).intern()) ? (byte) -1 : (byte) 50;
                    break;
                case 745946635:
                    b3 = !str.equals(m1157(13 - TextUtils.lastIndexOf("", '0', 0, 0), 417 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (View.MeasureSpec.getMode(0) + 39108)).intern()) ? (byte) -1 : (byte) 20;
                    break;
                case 824636291:
                    b3 = !str.equals(m1157(20 - TextUtils.indexOf((CharSequence) "", '0', 0), 135 - Color.red(0), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 58979)).intern()) ? (byte) -1 : (byte) 8;
                    break;
                case 858158177:
                    if (!str.equals(m1157(View.resolveSizeAndState(0, 0, 0) + 48, 1501 - (ViewConfiguration.getTapTimeout() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 52938)).intern())) {
                        b3 = -1;
                    } else {
                        int i4 = f1004 + 119;
                        f1003 = i4 % 128;
                        if (i4 % 2 == 0) {
                            b3 = 59;
                        } else {
                            b3 = 54;
                        }
                    }
                    break;
                case 888727913:
                    b3 = !str.equals(m1157((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19, TextUtils.indexOf("", "", 0, 0) + 33, (char) View.MeasureSpec.getSize(0)).intern()) ? (byte) -1 : (byte) 1;
                    break;
                case 892841421:
                    if (!str.equals(m1157(11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 494 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (View.resolveSizeAndState(0, 0, 0) + 41445)).intern())) {
                        b3 = -1;
                    } else {
                        f1003 = (f1004 + 41) % 128;
                        b3 = 25;
                    }
                    break;
                case 897829864:
                    b3 = !str.equals(m1157(11 - KeyEvent.normalizeMetaState(0), 698 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 57257)).intern()) ? (byte) -1 : (byte) 36;
                    break;
                case 950749305:
                    b3 = !str.equals(m1157(Gravity.getAbsoluteGravity(0, 0) + 45, (ViewConfiguration.getTouchSlop() >> 8) + 1135, (char) (Color.red(0) + 55265)).intern()) ? (byte) -1 : (byte) 49;
                    break;
                case 989671232:
                    b3 = !str.equals(m1157(25 - TextUtils.lastIndexOf("", '0', 0), 967 - TextUtils.getOffsetAfter("", 0), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 44;
                    break;
                case 1014009286:
                    b3 = !str.equals(m1157((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 21, 1047 - Gravity.getAbsoluteGravity(0, 0), (char) (11451 - TextUtils.lastIndexOf("", '0', 0, 0))).intern()) ? (byte) -1 : (byte) 46;
                    break;
                case 1050400725:
                    b3 = !str.equals(m1157(56 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 771 - (Process.myPid() >> 22), (char) (ViewConfiguration.getEdgeSlop() >> 16)).intern()) ? (byte) -1 : (byte) 39;
                    break;
                case 1074855404:
                    b3 = !str.equals(m1157(TextUtils.getOffsetBefore("", 0) + 21, 1481 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (13083 - Color.red(0))).intern()) ? (byte) -1 : (byte) 58;
                    break;
                case 1118286493:
                    b3 = !str.equals(m1157((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 34, 590 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) Color.green(0)).intern()) ? (byte) -1 : (byte) 30;
                    break;
                case 1139753057:
                    b3 = !str.equals(m1157(12 - View.MeasureSpec.makeMeasureSpec(0, 0), ExpandableListView.getPackedPositionType(0L) + 481, (char) KeyEvent.normalizeMetaState(0)).intern()) ? (byte) -1 : (byte) 24;
                    break;
                case 1297340448:
                    b3 = !str.equals(m1157(20 - Color.argb(0, 0, 0, 0), 222 - View.resolveSizeAndState(0, 0, 0), (char) TextUtils.indexOf("", "", 0, 0)).intern()) ? (byte) -1 : (byte) 12;
                    break;
                case 1331885131:
                    if (!str.equals(m1157(View.MeasureSpec.getMode(0) + 15, Drawable.resolveOpacity(0, 0) + 653, (char) (47632 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern())) {
                        b3 = -1;
                    } else {
                        f1004 = (f1003 + 41) % 128;
                        b3 = 33;
                    }
                    break;
                case 1342927760:
                    if (!str.equals(m1157(22 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getTouchSlop() >> 8) + 200, (char) (20633 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).intern())) {
                        b3 = -1;
                    } else {
                        int i5 = f1003 + 57;
                        f1004 = i5 % 128;
                        if (i5 % 2 != 0) {
                            b3 = 11;
                        } else {
                            b3 = 40;
                        }
                    }
                    break;
                case 1357502028:
                    if (!str.equals(m1157(ImageFormat.getBitsPerPixel(0) + 17, ExpandableListView.getPackedPositionGroup(0L) + TTAdConstant.STYLE_SIZE_RADIO_9_16, (char) (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                        b3 = -1;
                    } else {
                        int i6 = f1004 + 31;
                        f1003 = i6 % 128;
                        if (i6 % 2 == 0) {
                            b3 = 28;
                        } else {
                            b3 = 23;
                        }
                    }
                    break;
                case 1424096196:
                    b3 = !str.equals(m1157(10 - (Process.myTid() >> 22), 91 - View.MeasureSpec.getSize(0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 4;
                    break;
                case 1492060322:
                    b3 = !str.equals(m1157(((Process.getThreadPriority(0) + 20) >> 6) + 10, 1680 - Color.blue(0), (char) (62905 - KeyEvent.getDeadChar(0, 0))).intern()) ? (byte) -1 : (byte) 65;
                    break;
                case 1505622627:
                    b3 = !str.equals(m1157((ViewConfiguration.getDoubleTapTimeout() >> 16) + 16, 1570 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) TextUtils.getTrimmedLength("")).intern()) ? (byte) -1 : (byte) 61;
                    break;
                case 1664904176:
                    b3 = !str.equals(m1157((ViewConfiguration.getKeyRepeatDelay() >> 16) + 50, TextUtils.indexOf("", "", 0, 0) + 1068, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 37588)).intern()) ? (byte) -1 : (byte) 47;
                    break;
                case 1855930960:
                    b3 = !str.equals(m1157(TextUtils.indexOf("", "", 0) + 26, 370 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (256 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern()) ? (byte) -1 : (byte) 18;
                    break;
                case 1884374718:
                    b3 = !str.equals(m1157((KeyEvent.getMaxKeyCode() >> 16) + 21, 444 - AndroidCharacter.getMirror('0'), (char) (50789 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 19;
                    break;
                case 2041991951:
                    if (!str.equals(m1157(17 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 102 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) TextUtils.getTrimmedLength("")).intern())) {
                        b3 = -1;
                    } else {
                        int i7 = f1003 + 65;
                        f1004 = i7 % 128;
                        if (i7 % 2 != 0) {
                            b3 = 5;
                        } else {
                            b3 = 2;
                        }
                    }
                    break;
                case 2073767153:
                    b3 = !str.equals(m1157((KeyEvent.getMaxKeyCode() >> 16) + 54, (ViewConfiguration.getLongPressTimeout() >> 16) + cs.a.INSTANCE_VISIBLE, (char) (45643 - TextUtils.indexOf((CharSequence) "", '0'))).intern()) ? (byte) -1 : (byte) 51;
                    break;
                case 2118015322:
                    b3 = !str.equals(m1157(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 44, TextUtils.getCapsMode("", 0, 0) + 504, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23308)).intern()) ? (byte) -1 : (byte) 26;
                    break;
                default:
                    b3 = -1;
                    break;
            }
            switch (b3) {
                case 0:
                    return MBConfiguration.class;
                case 1:
                    return MBridgeSDKFactory.class;
                case 2:
                    return com.mbridge.msdk.reward.player.MBRewardVideoActivity.class;
                case 3:
                    return com.mbridge.msdk.video.signal.activity.AbstractJSActivity.class;
                case 4:
                    return MBBaseActivity.class;
                case 5:
                    return MBCommonActivity.class;
                case 6:
                    return com.mbridge.msdk.out.Campaign.class;
                case 7:
                    return com.mbridge.msdk.foundation.entity.CampaignEx.class;
                case 8:
                    return com.mbridge.msdk.videocommon.listener.InterVideoOutListener.class;
                case 9:
                    return com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListener.class;
                case 10:
                    return com.mbridge.msdk.out.RewardVideoListener.class;
                case 11:
                    return MBInterstitialActivity.class;
                case 12:
                    return com.mbridge.msdk.out.InterstitialListener.class;
                case 13:
                case 14:
                    return MBBannerView.class;
                case 15:
                case 16:
                    return MBBannerWebView.class;
                case 17:
                    return MBInterstitialHandler.class;
                case 18:
                    return MBInterstitialVideoHandler.class;
                case 19:
                    return MBRewardVideoHandler.class;
                case 20:
                    return com.mbridge.msdk.out.NativeListener.class;
                case 21:
                    return com.mbridge.msdk.out.NativeListener.NativeTrackingListener.class;
                case 22:
                    return com.mbridge.msdk.out.NativeListener.NativeAdListener.class;
                case 23:
                    return com.mbridge.msdk.foundation.entity.CampaignUnit.class;
                case 24:
                    return com.mbridge.msdk.foundation.fragment.BaseFragment.class;
                case 25:
                case 26:
                    return com.mbridge.msdk.foundation.webview.BrowserView.class;
                case 27:
                    return com.mbridge.msdk.foundation.webview.WebViewFragment.class;
                case 28:
                    return com.mbridge.msdk.click.CommonJumpLoader.class;
                case 29:
                case 30:
                    return MBImageView.class;
                case 31:
                    return MBridgeSDK.class;
                case 32:
                    return MBridgeConstans.class;
                case 33:
                    return com.mbridge.msdk.out.LoadingActivity.class;
                case 34:
                    return com.mbridge.msdk.out.IDownloadListener.class;
                case 35:
                    return com.mbridge.msdk.interstitial.signalcommon.interstitial.class;
                case 36:
                case 37:
                    return com.mbridge.msdk.mbsignalcommon.base.BaseWebView.class;
                case 38:
                case 39:
                    return com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView.class;
                case 40:
                case 41:
                    return MBridgeVideoView.class;
                case 42:
                case 43:
                    return MBridgeVastEndCardView.class;
                case 44:
                case 45:
                    return MBridgeNativeEndCardView.class;
                case 46:
                case 47:
                    return MBridgeClickCTAView.class;
                case 48:
                case 49:
                    return MBridgeBaseView.class;
                case 50:
                case AD_REWARD_USER_VALUE:
                    return MBridgeClickMiniCardView.class;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                case 53:
                    return MBridgeContainerView.class;
                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                    return MBridgeH5EndCardView.class;
                case 56:
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    return MBridgeLandingPageView.class;
                case 58:
                case 59:
                    return MBridgePlayableView.class;
                case 60:
                    return OnMBMediaViewListener.class;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    return com.mbridge.msdk.out.BannerAdListener.class;
                case 62:
                    return com.mbridge.msdk.video.signal.activity.AbstractJSActivity.class;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                case 64:
                    return DomainMBCommonActivity.class;
                case 65:
                    return MBridgeIds.class;
                case 66:
                    return RewardInfo.class;
                default:
                    switch (str.hashCode()) {
                        case -1258619456:
                            if (str.equals(m1157(22 - (ViewConfiguration.getTouchSlop() >> 8), KeyEvent.normalizeMetaState(0) + 1745, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 12946)).intern())) {
                                b2 = 3;
                            }
                            break;
                        case 834115686:
                            if (str.equals(m1157(24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Process.getGidForName("") + 1701, (char) Drawable.resolveOpacity(0, 0)).intern())) {
                                b2 = 1;
                            }
                            break;
                        case 1499766450:
                            if (str.equals(m1157(22 - Color.green(0), Color.rgb(0, 0, 0) + 16778939, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) {
                                b2 = 2;
                            }
                            break;
                        case 1884374718:
                            if (str.equals(m1157(KeyEvent.normalizeMetaState(0) + 21, 397 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 50788)).intern())) {
                                b2 = 0;
                            }
                            break;
                    }
                    if (b2 == 0) {
                        return com.mbridge.msdk.newout.MBRewardVideoHandler.class;
                    }
                    if (b2 == 1) {
                        return MBBidRewardVideoHandler.class;
                    }
                    if (b2 == 2) {
                        return IMBRRewardVideoHandler.class;
                    }
                    if (b2 != 3) {
                        return null;
                    }
                    return com.mbridge.msdk.newout.RewardVideoListener.class;
            }
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m1157(int i2, int i3, char c2) {
            String str;
            synchronized (a.f68) {
                try {
                    char[] cArr = new char[i2];
                    a.f69 = 0;
                    while (true) {
                        int i4 = a.f69;
                        if (i4 < i2) {
                            cArr[i4] = (char) ((((long) f1005[i3 + i4]) ^ (((long) i4) * f1006)) ^ ((long) c2));
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

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m1164(RewardInfo rewardInfo) {
            f1004 = (f1003 + 99) % 128;
            String rewardName = rewardInfo.getRewardName();
            int i2 = f1004 + 39;
            f1003 = i2 % 128;
            if (i2 % 2 == 0) {
                return rewardName;
            }
            throw null;
        }
    }

    public bt(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1095(int i2, int i3, int i4, String str, boolean z2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f672) {
            try {
                char[] cArr2 = new char[i3];
                b.f673 = 0;
                while (true) {
                    int i5 = b.f673;
                    if (i5 >= i3) {
                        break;
                    }
                    b.f671 = cArr[i5];
                    cArr2[b.f673] = (char) (b.f671 + i4);
                    int i6 = b.f673;
                    cArr2[i6] = (char) (cArr2[i6] - f986);
                    b.f673 = i6 + 1;
                }
                if (i2 > 0) {
                    b.f674 = i2;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    int i7 = b.f674;
                    System.arraycopy(cArr3, 0, cArr2, i3 - i7, i7);
                    int i8 = b.f674;
                    System.arraycopy(cArr3, i8, cArr2, 0, i3 - i8);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    b.f673 = 0;
                    while (true) {
                        int i9 = b.f673;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr4[i9] = cArr2[(i3 - i9) - 1];
                        b.f673 = i9 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        String strMo793 = mo793();
        if (strMo793 == null) {
            return null;
        }
        f985 = (f984 + 11) % 128;
        String str = strMo793.split(m1095(1 - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.indexOf("", "") + 1, 218 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u0000", true).intern())[1];
        f984 = (f985 + 93) % 128;
        return str;
    }
}
