package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.explorestack.iab.mraid.MraidActivity;
import com.explorestack.iab.mraid.MraidAdView;
import com.explorestack.iab.mraid.MraidDialogActivity;
import com.explorestack.iab.mraid.MraidInterstitial;
import com.explorestack.iab.mraid.MraidInterstitialListener;
import com.explorestack.iab.mraid.MraidView;
import com.explorestack.iab.mraid.MraidViewListener;
import com.explorestack.iab.vast.VastViewListener;
import com.explorestack.iab.vast.activity.VastActivity;
import com.explorestack.iab.vast.activity.VastView;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.adcom.Ad;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.AdContentType;
import io.bidmachine.AdFullScreenListener;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.AdView;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachine;
import io.bidmachine.BidMachineAd;
import io.bidmachine.CreativeFormat;
import io.bidmachine.FullScreenAd;
import io.bidmachine.ImageData;
import io.bidmachine.MediaAssetType;
import io.bidmachine.banner.BannerListener;
import io.bidmachine.banner.BannerView;
import io.bidmachine.interstitial.InterstitialAd;
import io.bidmachine.interstitial.InterstitialListener;
import io.bidmachine.nativead.NativeAd;
import io.bidmachine.nativead.NativeListener;
import io.bidmachine.nativead.view.MediaView;
import io.bidmachine.nativead.view.NativeMediaView;
import io.bidmachine.nativead.view.VideoPlayerActivity;
import io.bidmachine.protobuf.RequestExtension;
import io.bidmachine.rewarded.RewardedAd;
import io.bidmachine.rewarded.RewardedListener;
import io.bidmachine.richmedia.RichMediaListener;
import io.bidmachine.richmedia.RichMediaView;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class bl extends bg {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f847 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f848;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f849;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f850;

    static {
        char[] cArr = new char[1179];
        ByteBuffer.wrap("\u0092\u0086Ú¯\u0002êJ\u0002²(úk#ôk¨Ó«\u001b\u0007C\u0012\u008b%\u0000AHO\u0090\u0015Øî Âh£±gùCA,\u0089×Ñ×\u0019©batE<Kä\u0016¬ìTÛ\u001c£Åj\u008dH5%\u0000AHO\u0090\u0000Øè Èh²±mµ\u0081ý\u008f%Ðm4\u0095\u0000Ý{\u0004\u0091L\u008eôê<&d\u000b¬w×\u0088\u001f\u0086Gé\u008f17\u0015\u007fu¦£î\u0083\u0000AHO\u0090\u001aØè ßh£±gùCA=\u0089ñ\u0000AHO\u0090\u0004Øä Ýh¢±gù^A,X \u0010®Èå\u0080\u0005x<0Cé\u0086¡¿\u0019ÍÑ2\u0089.AJ:\u0084ò£ªÞb\u0010Ú4\u0092HK\u0094\u0000AHO\u0090%ØÕ Õh§±g\u0000AHO\u0090\u0000Øè Éh \b4@<\u0098NÐ\u0099(¿`Ó¹8ñ2I]\u0081\u0081Ù½\u0011Áj\u0017¢+\u0000BHJ\u00908Øï Éh¥±TùDA=\u0089ô6ù~Ô¦èîs\u0016U^#\u0087ÿÏÜw«¿{çW/'Tñ\u009c\u0091Ä¨\ft´Nü%%ómÓ\u0095âÝU\u0005CM#òö:Æb¼ªOÒM\u001a*Cí\u0000BHB\u00902ØÌ Íh´±jùDA6\u0089æj\u0011\"\u0011úa²\u009fJ\u009e\u0002çÛ9\u0093\u0017+eãµ»¼sî\u0000CHY\u00903Øà Øh¾±tùHA\u001e\u0089ìÑÜ\u0019´beª[\u0098\u0010Ð\u001f\bn@¿¸\u0090ðÊ):a\u0000Ù`\u008bØÃÔ\u001b³Su«Oã5:çrÕÊ½\u0002{Z^\u0092$éÔ!Ú\u0000IHE\u0090\"Øä Þh¤±vùDA,\u0089êÑÏ\u0019µbHªFò):ñ\u0082ÕÊµ\u0013c[C\u0084ÛÌÃ\u0014§\\p¤bì)5í}ÕÅ \rpUr\u009d \u001feWf\u008f\u001aÇÀ?åw¾®Yæv^\u0015\u0096ßÎÒ\u0006\u0088}\\µbÎY\u0086Z^&\u0016üîÙ¦\u0095\u007f\u007f7\\\u008f;\u0000iHD\u0090xØã Åh³±oùLA;\u0089ëÑÇ\u0019·baª\u0001ò4:ä\u0082ÄÊ²\u0013p[T£=ëã3\u009c{«Äa\fVT)\u009c§äù,ºun½\\\u0005\u0001MÝ\u0095ßÝ\u0084&{\u0000NHJ\u0090\"Øè Úh²±CùI\u0000NHJ\u0090\"Øè Úh²±NùDA+\u0089÷ÑË\u0019·baª]\u0000NHJ\u0090\"Øè Úh²±OùHA<\u0089êÑÏ\u0019\u008fbmªJò-Ò7\u009a+BD\n\u0085ò»ºÖc\u0002+,\u0093|[\u0082:iruª\u001aâÛ\u001aåR\u0088\u008b\\Ãr{/³Ñëæ#\u0096XZ\u0090zÈ\u0004\u0000Ì{\u00933\u0083ëô£([ \u0013sÊ§\u0082\u0085:øò\u000eª\u0006bk\u0019±Ñ\u008b\u0089õA!ù\u0003\u0000RHB\u00905Øé áh²±fùDA9\u0089ÕÑÇ\u0019¼bs\u0000iHD\u0090xØã Åh³±oùLA;\u0089ëÑÇ\u0019·baª\u0001ò(:ì\u0082ÓÊ³\u0013k[T£8ëî3Ó{óÄZ\fZT=\u009cáäù,ºun½\\\u0005\u0001MÝ\u0095ßÝ\u0084&{\u001a\u001aR\u000e\u008a~Â¨:\u008frË«\"ã\u0000[m\u0093ªË\u0090\u0003Ôx+°\u0017è\u007f ¿\u0098\u0095Ðã\t3\u009f\u0085×¨\u000f\u0094G\u000f¿)÷_.\u0083f Þ×\u0016\u0007N+\u0086[ý\u008d5ímØ¥\b\u001d(U^\u008c\u009cÄ¸<Ñt\u000f¬päG[\u008d\u0093ºËÅ\u0003K{\u000e³Zê\u0082\"¼\u009aãÒ7\n6Bl¹\u0099ñ¾)üa Ù7\u0011{H\u008b\u0080£øá0\u0017h/\u0000AHO©\u0001á\u00159{q¤\u0089\u0084ÁÚ\u0018-P\u0015è} ¹x\u008b°áË1\u0097Òßõ\u0007\u008aO\u001e·xÿ\u001e&ÃnðÖ\u0086\u001e@Fz\u008e\u001bõÁ=ÿe\u0088\u00ad_\u0015/]\u0003\u0084ÖÌâ4Ã|[¤qì\rSÐ\u009bæÃÁ\u000busw»\u000fâÒ*à\u0092\u0090ÚY\u0002sJ9±Ëùï!§iE\u0000MHY\u00907Øè Èh\u0093±kùLA4\u0089ìÑÉ\u0019\u0098bgª[ò3:ó\u0082ÙÊ¯\u0013\u007f\u0000cHD\u0090;Ø¯ Éh¯±rùAA7\u0089ñÑË\u0019ªbpªNò9:î\u0082\u009eÊ²\u0013g[S£rëê3À{¼Äa\fWTp\u009cÄäÆ,¾uc½Q\u0005$Mâ\u0095×Ý\u008d&cnP¶#þîFÌ\u008e\u008a×x\u001fPg\u0010¯ö\u0000MHY\u00907Øè Èh\u009e±lùYA=\u0089ñÑÝ\u0019\u00adbmª[ò3:ä\u0082Ü¢áêõ2\u009bzD\u0082dÊ2\u0013À[õã\u0091+]sq»\u0001ÀÁ\b÷P\u009f\u0098H ph;±Ãùî\u0001\u0084IN\u0091pÙ\u0014fÖ\u0000MHY\u00907Øè Èh\u0081±kùHA/\u0000cHD\u0090;Ø¯ Éh¯±rùAA7\u0089ñÑË\u0019ªbpªNò9:î\u0082\u009eÊ²\u0013g[S£rëê3À{¼Äa\fWTp\u009cÄäÆ,¾uc½Q\u00056Mâ\u0095ÓÝ\u0096\u0000MHY\u00907Øè Èh\u0081±kùHA/\u0089ÏÑÇ\u0019ªbpªJò4:à\u0082ÂkI#Uû:³êKò\u0003«Úi\u0092[*1âõºÅr¿\u0000cHD\u0090;Ø¯ Éh¯±rùAA7\u0089ñÑË\u0019ªbpªNò9:î\u0082\u009eÊ²\u0013g[S£rëñ3Ó{®Ä|\f\u001dT?\u009cêäÀ,¶u|½\\\u0005\u0014Mò\u0095\u0098Ý·&mnD¶\u0016þÌFÛ\u008e\u0097×g\u001fOg\r¯û÷Ã\u0098=Ð!\bN@\u009e¸\u0091ðÕ)\fa1\u0000cHD\u0090;Ø¯ Éh¯±rùAA7\u0089ñÑË\u0019ªbpªNò9:î\u0082\u009eÊ²\u0013g[S£rëñ3Ó{®Ä|\f\u001dT?\u009cêäÀ,¶u|½\\\u0005\u0014Mò\u0095\u0098Ý·&mnD¶\u0016þÛFÑ\u008e\u0086×y\u0000MHY\u00907Øè Èh\u0096±fù{A1\u0089æÑÙ\u0006\u0017N0\u0096OÞÛ&½nÛ·\u0006ÿ5GC\u008f\u0085×¿\u001fÞd\u0004¬:ôM<\u009a\u0084êÌÆ\u0015\u0013]'¥\u0006í\u009e5´}ÈÂ\u0015\n#R\u0004\u009a°â²*Ês\u0017»%\u0003UK\u009b\u0093\u0094Ûü \u001dh4\u0000VHJ\u0090%Øõ úh¾±gùZA\u0014\u0089êÑÝ\u0019\u00adbaªAò?:÷\tbA~\u0099\u0017ÑÄ)ùa\u0094¸FðXH\u0010\u0080ÇØû\u0010\u0087kG£vû\u00053Û\u0000gHN\u0090\"ØÅ Åh¤±rùAA9\u0089úÑï\u0019½bi!ii@±,ùÙ\u0001ËI½\u0090iØL`\u0017¨éðÍ\u0000gHN\u0090\"ØÃ Ùh¹±fùAA=\u0000gHN\u0090\"ØÅ Åh¤±rùAA9\u0089ú\u0083=Ë\u0014\u0013x[\u009f£\u009fëþ2(z\u001bÂc\n R¶\u009aâá0)\u001bqe¹\u00adúw²^j2\"ÓÚÝ\u0092©K|\u0003X»:sÖ+Æã½\u0098DPM\b%ÀáxÏ0\u0087é\u007f¡RY8Ô¶\u009c\u009fDó\f\u0006ô\u0014¼be¶-\u0093\u0000gHN\u0090\"ØÀ Èh¸±oùLA1\u0089í\u0000gHN\u0090\"ØÂ Þh²±cùYA1\u0089õÑË\u0019\u0090b`ã\u0080«©sÅ;6Ã'\u008bQR\u0086\u001a¯¢Òj\u00012'úJ\u0081ªI¬\u0000gHN\u0090\"ØÀ Èh\u0083±{ù]A=\u0000gHN\u0090\"ØÒ Éh»±nùHA*\u0089ÊÑÊ\u0000sHN\u0090\"ØÈ Âh£±gù_A+\u0089÷ÑÇ\u0019\u00adbmªNò6:É\u0082ÙÊ¨\u0013r[T£2ëâ3À\u0000sHN\u0090\"ØÓ Éh ±cù_A<\u0089æÑÊ\u0019\u0095bmª\\ò.:à\u0082ÞÊ¾\u0013tt]<`ä\f¬íTã\u001c\u0097ÅB\u008df5\u0004ýá¥ém\u0084\u0016^Þd\u0086\u001aNÎöì\u0000gHN\u0090\"ØÄ Ôh£±Rù_A7\u0089÷ÑÁ\u0019\u0095bmª\\ò.)\u0005a,¹@ñ¡\t·AÁ\u0098\u0005Ð\u001chN \u0093ø¥0ÕK\u0001\u0000bHR\u0090\"Øä ÿh£±pùDA6\u0089äÑú\u0019¶bWª[ò(:ì\u0082ÞÊ¼".getBytes(CharEncoding.ISO_8859_1)).asCharBuffer().get(cArr, 0, 1179);
        f848 = cArr;
        f850 = 7826944689241081899L;
    }

    public bl(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m911(Ad ad) {
        f847 = (f849 + 43) % 128;
        String id = ad.getId();
        f849 = (f847 + 73) % 128;
        return id;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static List<Any> m912(Ad ad) {
        f849 = (f847 + 33) % 128;
        List<Any> extProtoList = ad.getExtProtoList();
        int i2 = f849 + 17;
        f847 = i2 % 128;
        if (i2 % 2 != 0) {
            return extProtoList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static Ad.Video m913(Ad ad) {
        int i2 = f847 + 71;
        f849 = i2 % 128;
        int i3 = i2 % 2;
        Ad.Video video = ad.getVideo();
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
        return video;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ ByteString m914(Any any) {
        f847 = (f849 + 97) % 128;
        ByteString byteStringM922 = m922(any);
        f847 = (f849 + 17) % 128;
        return byteStringM922;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m924(Ad ad) {
        f849 = (f847 + 103) % 128;
        String strM911 = m911(ad);
        f849 = (f847 + 109) % 128;
        return strM911;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Ad.Display m932(Ad ad) {
        int i2 = f847 + 11;
        f849 = i2 % 128;
        if (i2 % 2 != 0) {
            m943(ad);
            throw null;
        }
        Ad.Display displayM943 = m943(ad);
        f847 = (f849 + 115) % 128;
        return displayM943;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m938(Ad ad, int i2) {
        int i3 = f847 + 87;
        f849 = i3 % 128;
        if (i3 % 2 != 0) {
            m920(ad, i2);
            throw null;
        }
        String strM920 = m920(ad, i2);
        int i4 = f847 + 83;
        f849 = i4 % 128;
        if (i4 % 2 == 0) {
            return strM920;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Ad.Display.Banner m942(Ad.Display display) {
        int i2 = f849 + 107;
        f847 = i2 % 128;
        int i3 = i2 % 2;
        Ad.Display.Banner bannerM915 = m915(display);
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        f849 = (f847 + 51) % 128;
        return bannerM915;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Ad.Video m916(Ad ad) {
        f849 = (f847 + 109) % 128;
        Ad.Video videoM913 = m913(ad);
        int i2 = f849 + 107;
        f847 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 7 / 0;
        }
        return videoM913;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m927(RequestExtension requestExtension) {
        f847 = (f849 + 43) % 128;
        String strM946 = m946(requestExtension);
        int i2 = f847 + 35;
        f849 = i2 % 128;
        if (i2 % 2 == 0) {
            return strM946;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m933(Ad.Display display) {
        int i2 = f847 + 115;
        f849 = i2 % 128;
        if (i2 % 2 != 0) {
            m923(display);
            throw null;
        }
        String strM923 = m923(display);
        f847 = (f849 + 39) % 128;
        return strM923;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ List m940(Ad ad) {
        f847 = (f849 + 61) % 128;
        List<Any> listM912 = m912(ad);
        int i2 = f847 + 63;
        f849 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 27 / 0;
        }
        return listM912;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m944(Ad ad, int i2) {
        int i3 = f849 + 39;
        f847 = i3 % 128;
        int i4 = i3 % 2;
        String strM925 = m925(ad, i2);
        if (i4 == 0) {
            int i5 = 50 / 0;
        }
        return strM925;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m918(ByteString byteString) {
        f847 = (f849 + 61) % 128;
        String strM937 = m937(byteString);
        f847 = (f849 + 47) % 128;
        return strM937;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m935(AdRequestParameters adRequestParameters) {
        f847 = (f849 + 87) % 128;
        String strM926 = m926(adRequestParameters);
        int i2 = f847 + 125;
        f849 = i2 % 128;
        if (i2 % 2 == 0) {
            return strM926;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m941(BannerView bannerView, BannerListener bannerListener) {
        int i2 = f847 + 85;
        f849 = i2 % 128;
        int i3 = i2 % 2;
        m929(bannerView, bannerListener);
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m945(AdRequestParameters adRequestParameters) {
        int i2 = f849 + 9;
        f847 = i2 % 128;
        if (i2 % 2 == 0) {
            m939(adRequestParameters);
            throw null;
        }
        String strM939 = m939(adRequestParameters);
        int i3 = f849 + 53;
        f847 = i3 % 128;
        if (i3 % 2 != 0) {
            return strM939;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m917(KeyEvent.getDeadChar(0, 0) + 13, 928 - TextUtils.indexOf((CharSequence) "", '0'), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bl.m933((Ad.Display) list.get(0));
            }
        });
        map.put(m917(11 - ExpandableListView.getPackedPositionType(0L), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 941, (char) (8462 - Color.red(0))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bl.m919((Ad.Video) list.get(0));
            }
        });
        map.put(m917(9 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getEdgeSlop() >> 16) + 953, (char) TextUtils.indexOf("", "")).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bl.m944((Ad) list.get(0), ((Integer) list.get(1)).intValue());
            }
        });
        map.put(m917(10 - TextUtils.indexOf("", ""), 962 - Gravity.getAbsoluteGravity(0, 0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bl.m932((Ad) list.get(0));
            }
        });
        map.put(m917(16 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 972 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (33626 - Color.argb(0, 0, 0, 0))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bl.m942((Ad.Display) list.get(0));
            }
        });
        map.put(m917(21 - KeyEvent.getDeadChar(0, 0), 988 - TextUtils.getOffsetBefore("", 0), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 64016)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bl.m921((Ad.Display.Banner) list.get(0));
            }
        });
        map.put(m917(8 - View.combineMeasuredStates(0, 0), 1009 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (54481 - TextUtils.getTrimmedLength(""))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bl.m916((Ad) list.get(0));
            }
        });
        map.put(m917(9 - Process.getGidForName(""), 1016 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bl.m938((Ad) list.get(0), ((Integer) list.get(1)).intValue());
            }
        });
        map.put(m917((ViewConfiguration.getWindowTouchSlop() >> 8) + 13, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + IronSourceError.ERROR_RV_LOAD_DURING_LOAD, (char) View.resolveSize(0, 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bl.m924((Ad) list.get(0));
            }
        });
        map.put(m917((ViewConfiguration.getPressedStateDuration() >> 16) + 14, 1040 - View.combineMeasuredStates(0, 0), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 58342)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bl.m945((AdRequestParameters) list.get(0));
            }
        });
        map.put(m917(9 - KeyEvent.getDeadChar(0, 0), TextUtils.getOffsetBefore("", 0) + IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW, (char) ExpandableListView.getPackedPositionGroup(0L)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bl.m935((AdRequestParameters) list.get(0));
            }
        });
        map.put(m917(11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 1064, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bl.m927((RequestExtension) list.get(0));
            }
        });
        map.put(m917(TextUtils.indexOf("", "", 0) + 23, Color.alpha(0) + 1074, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bl.m936((InterstitialAd) list.get(0), (InterstitialListener) list.get(1));
                return null;
            }
        });
        map.put(m917(20 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 1098, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bl.m947((RewardedAd) list.get(0), (RewardedListener) list.get(1));
                return null;
            }
        });
        map.put(m917(17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.rgb(0, 0, 0) + 16778332, (char) (29742 - Color.green(0))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bl.m941((BannerView) list.get(0), (BannerListener) list.get(1));
                return null;
            }
        });
        map.put(m917(TextUtils.getOffsetAfter("", 0) + 15, 1133 - (Process.myTid() >> 22), (char) ((-1) - MotionEvent.axisFromString(""))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bl.m940((Ad) list.get(0));
            }
        });
        map.put(m917(Color.red(0) + 13, ImageFormat.getBitsPerPixel(0) + 1149, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 10594)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bl.m914((Any) list.get(0));
            }
        });
        map.put(m917(TextUtils.indexOf((CharSequence) "", '0') + 19, 1162 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bl.m918((ByteString) list.get(0));
            }
        });
        int i2 = f849 + 37;
        f847 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 6 / 0;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m919(Ad.Video video) {
        f847 = (f849 + 99) % 128;
        String strM934 = m934(video);
        f847 = (f849 + 107) % 128;
        return strM934;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m936(InterstitialAd interstitialAd, InterstitialListener interstitialListener) {
        int i2 = f847 + 87;
        f849 = i2 % 128;
        int i3 = i2 % 2;
        m930(interstitialAd, interstitialListener);
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m937(ByteString byteString) {
        f849 = (f847 + 87) % 128;
        String stringUtf8 = byteString.toStringUtf8();
        int i2 = f849 + 49;
        f847 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 40 / 0;
        }
        return stringUtf8;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m947(RewardedAd rewardedAd, RewardedListener rewardedListener) {
        f847 = (f849 + 79) % 128;
        m931(rewardedAd, rewardedListener);
        int i2 = f849 + 73;
        f847 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ List m921(Ad.Display.Banner banner) {
        int i2 = f849 + 93;
        f847 = i2 % 128;
        if (i2 % 2 != 0) {
            return m928(banner);
        }
        m928(banner);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m939(AdRequestParameters adRequestParameters) {
        f849 = (f847 + 11) % 128;
        String placementId = adRequestParameters.getPlacementId();
        f849 = (f847 + 51) % 128;
        return placementId;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        byte b2;
        switch (str.hashCode()) {
            case -2127904484:
                b2 = !str.equals(m917((Process.myTid() >> 22) + 17, ExpandableListView.getPackedPositionGroup(0L) + 381, (char) (31681 - KeyEvent.keyCodeFromString(""))).intern()) ? (byte) -1 : (byte) 27;
                break;
            case -2032115546:
                b2 = !str.equals(m917(ExpandableListView.getPackedPositionType(0L) + 14, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 188, (char) (ViewConfiguration.getEdgeSlop() >> 16)).intern()) ? (byte) -1 : (byte) 14;
                break;
            case -1921270373:
                if (!str.equals(m917(12 - ((Process.getThreadPriority(0) + 20) >> 6), 738 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (27423 - ExpandableListView.getPackedPositionGroup(0L))).intern())) {
                    b2 = -1;
                } else {
                    int i2 = f847 + 11;
                    f849 = i2 % 128;
                    b2 = i2 % 2 == 0 ? (byte) 42 : (byte) 114;
                }
                break;
            case -1798479256:
                b2 = !str.equals(m917(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 48, 751 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0') + 1)).intern()) ? (byte) -1 : (byte) 43;
                break;
            case -1683121555:
                if (!str.equals(m917(TextUtils.lastIndexOf("", '0', 0) + 13, 177 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 27219)).intern())) {
                    b2 = -1;
                } else {
                    f847 = (f849 + 79) % 128;
                    b2 = 13;
                }
                break;
            case -1628534628:
                b2 = !str.equals(m917(9 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 675, (char) (ExpandableListView.getPackedPositionChild(0L) + 1)).intern()) ? (byte) -1 : (byte) 39;
                break;
            case -1627944928:
                b2 = !str.equals(m917((ViewConfiguration.getKeyRepeatDelay() >> 16) + 14, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 112, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2166)).intern()) ? (byte) -1 : (byte) 9;
                break;
            case -1518365947:
                b2 = !str.equals(m917(ImageFormat.getBitsPerPixel(0) + 17, 896 - ImageFormat.getBitsPerPixel(0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern()) ? (byte) -1 : (byte) 48;
                break;
            case -1507727624:
                if (!str.equals(m917(37 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Color.blue(0) + 281, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    f847 = (f849 + 121) % 128;
                    b2 = 21;
                }
                break;
            case -1371195010:
                if (!str.equals(m917(Color.argb(0, 0, 0, 0) + 12, 246 - TextUtils.getTrimmedLength(""), (char) (33949 - View.getDefaultSize(0, 0))).intern())) {
                    b2 = -1;
                } else {
                    int i3 = f849 + 89;
                    f847 = i3 % 128;
                    b2 = i3 % 2 != 0 ? (byte) 18 : (byte) 113;
                }
                break;
            case -1246480821:
                b2 = !str.equals(m917(19 - View.resolveSize(0, 0), 448 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (6731 - TextUtils.indexOf((CharSequence) "", '0'))).intern()) ? (byte) -1 : (byte) 30;
                break;
            case -1146475727:
                if (!str.equals(m917((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8, 797 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (39018 - TextUtils.lastIndexOf("", '0', 0, 0))).intern())) {
                    b2 = -1;
                } else {
                    int i4 = f849 + 109;
                    f847 = i4 % 128;
                    b2 = i4 % 2 != 0 ? (byte) 44 : (byte) 122;
                }
                break;
            case -1087582685:
                b2 = !str.equals(m917(View.getDefaultSize(0, 0) + 17, 633 - MotionEvent.axisFromString(""), (char) ((-1) - Process.getGidForName(""))).intern()) ? (byte) -1 : (byte) 37;
                break;
            case -1011229113:
                b2 = !str.equals(m917(46 - (Process.myTid() >> 22), KeyEvent.normalizeMetaState(0) + 588, (char) View.resolveSizeAndState(0, 0, 0)).intern()) ? (byte) -1 : (byte) 36;
                break;
            case -838844802:
                b2 = !str.equals(m917(Process.getGidForName("") + 44, 805 - View.combineMeasuredStates(0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern()) ? (byte) -1 : (byte) 45;
                break;
            case -642689680:
                b2 = !str.equals(m917(ExpandableListView.getPackedPositionChild(0L) + 18, 721 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 41;
                break;
            case -609786639:
                b2 = !str.equals(m917((ViewConfiguration.getTapTimeout() >> 16) + 10, (KeyEvent.getMaxKeyCode() >> 16) + 355, (char) (53861 - KeyEvent.normalizeMetaState(0))).intern()) ? (byte) -1 : (byte) 25;
                break;
            case -589219056:
                b2 = !str.equals(m917(12 - TextUtils.lastIndexOf("", '0'), 12 - Drawable.resolveOpacity(0, 0), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -572702516:
                b2 = !str.equals(m917(9 - View.MeasureSpec.makeMeasureSpec(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 71, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 5;
                break;
            case -475472046:
                b2 = !str.equals(m917(20 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 42, (char) (Color.alpha(0) + 46528)).intern()) ? (byte) -1 : (byte) 3;
                break;
            case -211807062:
                b2 = !str.equals(m917(10 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 167, (char) (Process.getGidForName("") + 1)).intern()) ? (byte) -1 : (byte) 12;
                break;
            case -150492023:
                b2 = !str.equals(m917(9 - TextUtils.getCapsMode("", 0, 0), 271 - TextUtils.lastIndexOf("", '0', 0), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 52756)).intern()) ? (byte) -1 : (byte) 20;
                break;
            case 2115:
                b2 = !str.equals(m917(2 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getTouchSlop() >> 8) + 514, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 32;
                break;
            case 1282165:
                b2 = !str.equals(m917(36 - (KeyEvent.getMaxKeyCode() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 684, (char) (KeyEvent.getMaxKeyCode() >> 16)).intern()) ? (byte) -1 : (byte) 40;
                break;
            case 3368703:
                b2 = !str.equals(m917(TextUtils.getTrimmedLength("") + 9, KeyEvent.getDeadChar(0, 0) + 25, (char) (KeyEvent.keyCodeFromString("") + 29700)).intern()) ? (byte) -1 : (byte) 1;
                break;
            case 141091039:
                if (!str.equals(m917(40 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 528 - ExpandableListView.getPackedPositionChild(0L), (char) (38833 - KeyEvent.getDeadChar(0, 0))).intern())) {
                    b2 = -1;
                } else {
                    int i5 = f847 + 97;
                    f849 = i5 % 128;
                    b2 = i5 % 2 == 0 ? (byte) 34 : (byte) 83;
                }
                break;
            case 320151695:
                b2 = !str.equals(m917((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, ((byte) KeyEvent.getModifierMetaStateMask()) + 213, (char) (ExpandableListView.getPackedPositionGroup(0L) + 35729)).intern()) ? (byte) -1 : (byte) 16;
                break;
            case 503762424:
                if (!str.equals(m917(ExpandableListView.getPackedPositionGroup(0L) + 7, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 34, (char) TextUtils.indexOf("", "", 0, 0)).intern())) {
                    b2 = -1;
                } else {
                    f847 = (f849 + 75) % 128;
                    b2 = 2;
                }
                break;
            case 529939434:
                b2 = !str.equals(m917(7 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 100 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 7;
                break;
            case 625873720:
                b2 = !str.equals(m917(37 - TextUtils.indexOf((CharSequence) "", '0', 0), 859 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (ExpandableListView.getPackedPositionGroup(0L) + 1652)).intern()) ? (byte) -1 : (byte) 47;
                break;
            case 713768498:
                b2 = !str.equals(m917(ExpandableListView.getPackedPositionGroup(0L) + 15, TextUtils.lastIndexOf("", '0') + 341, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern()) ? (byte) -1 : (byte) 24;
                break;
            case 737636858:
                if (!str.equals(m917(47 - TextUtils.getCapsMode("", 0, 0), 467 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 40940)).intern())) {
                    b2 = -1;
                } else {
                    f847 = (f849 + 1) % 128;
                    b2 = 31;
                }
                break;
            case 742497451:
                b2 = !str.equals(m917((Process.myTid() >> 22) + 37, 412 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern()) ? (byte) -1 : (byte) 29;
                break;
            case 745946635:
                b2 = !str.equals(m917(TextUtils.lastIndexOf("", '0') + 15, 326 - TextUtils.getOffsetBefore("", 0), (char) Color.red(0)).intern()) ? (byte) -1 : (byte) 23;
                break;
            case 961844241:
                b2 = !str.equals(m917(Color.red(0) + 10, Color.red(0) + 126, (char) (ViewConfiguration.getTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 10;
                break;
            case 1125320581:
                b2 = !str.equals(m917(TextUtils.indexOf("", "", 0, 0) + 9, 203 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (39002 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern()) ? (byte) -1 : (byte) 15;
                break;
            case 1165508119:
                b2 = !str.equals(m917(Color.alpha(0) + 10, (Process.myTid() >> 22) + 61, (char) TextUtils.getTrimmedLength("")).intern()) ? (byte) -1 : (byte) 4;
                break;
            case 1212533506:
                b2 = !str.equals(m917(17 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 365 - View.resolveSize(0, 0), (char) (14907 - (Process.myPid() >> 22))).intern()) ? (byte) -1 : (byte) 26;
                break;
            case 1297340448:
                b2 = !str.equals(m917((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20, TextUtils.lastIndexOf("", '0', 0, 0) + 227, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1)).intern()) ? (byte) -1 : (byte) 17;
                break;
            case 1387614166:
                b2 = !str.equals(m917(ExpandableListView.getPackedPositionType(0L) + 19, 80 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (22753 - Color.argb(0, 0, 0, 0))).intern()) ? (byte) -1 : (byte) 6;
                break;
            case 1395486086:
                b2 = !str.equals(m917(13 - (ViewConfiguration.getJumpTapTimeout() >> 16), 516 - KeyEvent.normalizeMetaState(0), (char) ((-16733876) - Color.rgb(0, 0, 0))).intern()) ? (byte) -1 : (byte) 33;
                break;
            case 1444286894:
                if (!str.equals(m917((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19, Drawable.resolveOpacity(0, 0) + 569, (char) Color.red(0)).intern())) {
                    b2 = -1;
                } else {
                    f847 = (f849 + 19) % 128;
                    b2 = 35;
                }
                break;
            case 1461955341:
                b2 = !str.equals(m917(13 - (Process.myTid() >> 22), 397 - ImageFormat.getBitsPerPixel(0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 28;
                break;
            case 1494941328:
                b2 = !str.equals(m917((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16, 913 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2351)).intern()) ? (byte) -1 : (byte) 49;
                break;
            case 1917129446:
                b2 = !str.equals(m917(14 - Color.alpha(0), 257 - MotionEvent.axisFromString(""), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7976)).intern()) ? (byte) -1 : (byte) 19;
                break;
            case 1955913096:
                if (!str.equals(m917(5 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 106 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                    b2 = -1;
                } else {
                    int i6 = f847 + 43;
                    f849 = i6 % 128;
                    b2 = i6 % 2 == 0 ? (byte) 8 : (byte) 116;
                }
                break;
            case 2034998687:
                b2 = !str.equals(m917(10 - TextUtils.lastIndexOf("", '0'), 848 - Color.green(0), (char) (ViewConfiguration.getTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 46;
                break;
            case 2110329530:
                b2 = !str.equals(m917((ViewConfiguration.getJumpTapTimeout() >> 16) + 8, (ViewConfiguration.getScrollBarSize() >> 8) + Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 22;
                break;
            case 2112955383:
                b2 = !str.equals(m917(TextUtils.lastIndexOf("", '0', 0) + 26, 650 - TextUtils.indexOf((CharSequence) "", '0'), (char) (TextUtils.indexOf((CharSequence) "", '0') + 41645)).intern()) ? (byte) -1 : (byte) 38;
                break;
            case 2136410007:
                b2 = !str.equals(m917(31 - View.resolveSize(0, 0), 135 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 13968)).intern()) ? (byte) -1 : (byte) 11;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return AdContentType.class;
            case 1:
                return Ad.Display.class;
            case 2:
                return Ad.Video.class;
            case 3:
                return AdFullScreenListener.class;
            case 4:
                return AdListener.class;
            case 5:
                return AdRequest.class;
            case 6:
                return AdRequestParameters.class;
            case 7:
                return AdsType.class;
            case 8:
                return AdView.class;
            case 9:
                return BannerListener.class;
            case 10:
            case 11:
                return BannerView.class;
            case 12:
                return BidMachine.class;
            case 13:
                return BidMachineAd.class;
            case 14:
                return CreativeFormat.class;
            case 15:
                return ImageData.class;
            case 16:
                return InterstitialAd.class;
            case 17:
                return InterstitialListener.class;
            case 18:
                return FullScreenAd.class;
            case 19:
                return MediaAssetType.class;
            case 20:
            case 21:
                return MediaView.class;
            case 22:
                return NativeAd.class;
            case 23:
                return NativeListener.class;
            case 24:
                return NativeMediaView.class;
            case 25:
                return RewardedAd.class;
            case 26:
                return RewardedListener.class;
            case 27:
                return RichMediaListener.class;
            case 28:
            case 29:
                return RichMediaView.class;
            case 30:
            case 31:
                return VideoPlayerActivity.class;
            case 32:
                return Ad.class;
            case 33:
            case 34:
                return MraidActivity.class;
            case 35:
            case 36:
                return MraidDialogActivity.class;
            case 37:
                return MraidInterstitial.class;
            case 38:
                return MraidInterstitialListener.class;
            case 39:
            case 40:
                return MraidView.class;
            case 41:
                return MraidViewListener.class;
            case 42:
            case 43:
                return VastActivity.class;
            case 44:
            case 45:
                return VastView.class;
            case 46:
            case 47:
                return MraidAdView.class;
            case 48:
                return VastViewListener.class;
            case 49:
                return RequestExtension.class;
            default:
                return null;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        f847 = (f849 + 121) % 128;
        try {
            String strM2314 = hr.m2242().m2245().m2314(BidMachine.class, m917((KeyEvent.getMaxKeyCode() >> 16) + 12, ExpandableListView.getPackedPositionGroup(0L), (char) (37592 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern());
            f849 = (f847 + 61) % 128;
            return strM2314;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Ad.Display.Banner m915(Ad.Display display) {
        int i2 = f847 + 31;
        f849 = i2 % 128;
        if (i2 % 2 != 0) {
            display.getBanner();
            throw null;
        }
        Ad.Display.Banner banner = display.getBanner();
        f849 = (f847 + 51) % 128;
        return banner;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m920(Ad ad, int i2) {
        int i3 = f847 + 19;
        f849 = i3 % 128;
        if (i3 % 2 == 0) {
            return ad.getAdomain(i2);
        }
        ad.getAdomain(i2);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m917(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f848[i3 + i4]) ^ (((long) i4) * f850)) ^ ((long) c2));
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Ad.Display m943(Ad ad) {
        f847 = (f849 + 27) % 128;
        Ad.Display display = ad.getDisplay();
        f849 = (f847 + 49) % 128;
        return display;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m946(RequestExtension requestExtension) {
        int i2 = f847 + 5;
        f849 = i2 % 128;
        if (i2 % 2 != 0) {
            requestExtension.getSellerId();
            throw null;
        }
        String sellerId = requestExtension.getSellerId();
        int i3 = f849 + 109;
        f847 = i3 % 128;
        if (i3 % 2 != 0) {
            return sellerId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m923(Ad.Display display) {
        f847 = (f849 + 85) % 128;
        String adm = display.getAdm();
        f847 = (f849 + 83) % 128;
        return adm;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m925(Ad ad, int i2) {
        f847 = (f849 + 17) % 128;
        String bundle = ad.getBundle(i2);
        int i3 = f847 + 125;
        f849 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 83 / 0;
        }
        return bundle;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List<Any> m928(Ad.Display.Banner banner) {
        int i2 = f849 + 35;
        f847 = i2 % 128;
        int i3 = i2 % 2;
        List<Any> extProtoList = banner.getExtProtoList();
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        return extProtoList;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static ByteString m922(Any any) {
        int i2 = f847 + 65;
        f849 = i2 % 128;
        if (i2 % 2 == 0) {
            return any.getValue();
        }
        any.getValue();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m926(AdRequestParameters adRequestParameters) {
        int i2 = f849 + 125;
        f847 = i2 % 128;
        int i3 = i2 % 2;
        AdsType adsType = adRequestParameters.getAdsType();
        if (i3 != 0) {
            return adsType.getName();
        }
        adsType.getName();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m930(InterstitialAd interstitialAd, InterstitialListener interstitialListener) {
        int i2 = f849 + 23;
        f847 = i2 % 128;
        int i3 = i2 % 2;
        interstitialAd.setListener(interstitialListener);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m931(RewardedAd rewardedAd, RewardedListener rewardedListener) {
        f849 = (f847 + 45) % 128;
        rewardedAd.setListener(rewardedListener);
        int i2 = f849 + 55;
        f847 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 16 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m929(BannerView bannerView, BannerListener bannerListener) {
        f847 = (f849 + 33) % 128;
        bannerView.setListener(bannerListener);
        int i2 = f847 + 21;
        f849 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 53 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m934(Ad.Video video) {
        f847 = (f849 + 3) % 128;
        String adm = video.getAdm();
        int i2 = f849 + 113;
        f847 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 78 / 0;
        }
        return adm;
    }
}
