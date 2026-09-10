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
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.p004ironsource.cs;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.smartdigimkt.f3.b;
import com.smartdigimkt.sdk.basead.ui.animplayerview.scale.AlbumScaleMainView;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.thinkup.core.common.n.mo;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class de implements cl {

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static int f1598 = 1;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private static int f1599;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char[] f1600;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static long f1601;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final cw f1612 = new cw();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final dd f1613 = new dd();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final cs f1610 = new cs();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final cx f1611 = new cx();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final df f1614 = new df();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private final dc f1606 = new dc();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private final cy f1607 = new cy();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private final cv f1605 = new cv();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private final cr f1608 = new cr();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private final da f1609 = new da();

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private final db f1603 = new db();

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private final cu f1602 = new cu();

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private final ct f1604 = new ct();

    static {
        char[] cArr = new char[IronSourceError.ERROR_LEGACY_INIT_POST_FAILED];
        ByteBuffer.wrap("\u0000c\u0085\u001c\n\u0096\u0090 \u0015\u0086\u009bL Ý¦K+Ý±e6\n»\u0083A\rÆ²L9\u0000c\u0085\u001c\n\u0096\u0090 \u0015\u0086\u009bL Ý¦K+×±i6\u0014»\u0094A\u0007Æ£\u0000g\u0085\u0016\n\u0092\u0090\u001a\u0015¹\u009bM À¦@+ö±\u007f64»\u0082A\u000bÆ¹¼À9¥¶!,©©\n'þ\u009cs\u001aó\u0097E\rÌ\u008a\u0087\u00071ý¸z\n\u0000g\u0085\u0016\n\u0092\u0090\u0018\u0015¨\u009bh ×¦G+Î±b6\u001b»\u0086A\"Æ¥L%ÑÐWqÜÀbbçàl\u008aò\u0006w\u0096ý,\u0000i\u0085\u0000\n°\u00900\u0015©\u009bH ä¦L+ë±b6\u001c»\u009dA\u0001\u0003?\u0086N\tÊ\u0093W\u0016ý\u0098\u0002#\u009d\u0000g\u0085\u0016\n\u0092\u0090\u001a\u0015£\u009bQ Æ¦@+ö±\u007f6(»\u0098A\u0001Æ 4G±6>²¤?!\u0085¯z\u0014þ\u0092arÔ÷¥x!â¬g\u0016ééRmÔòYX\u0000g\u0085\u0016\n\u0092\u0090\u001f\u0015¥\u009bM Á¦Q+Þ±b6\u001b»\u009dA\u0000Æ\u0098L,ÑéWIÜÓbsb\u009fçîhjòçw]ùµB9Ä©I&Ó\u009aTãÙe#ø¤x.Û³15 ¾\u000b\u0000\u009c\u0085\u0014\u000eb\u0090þ\u0015b\u0000c\u0085\u0001\n\u0083\u00908\u0015¸\u009bZ ô¦L+ý±g6\u001a»µA\u0001Æ±L\bÑÈWYÜÏbrçìl\u008e\u0087¸\u0002É\u008dM\u0017Ë\u0092v\u001c\u0094§\u0005!\u0095¬#ü~y\u000fö\u008bl\ré°gRÜÃZS×åMa\u0000c\u0085\u0001\n\u0083\u00908\u0015¸\u009bZ ÿ¦@+ì±c6\u0011»\u0095A Æ²L,ÑÿWEÜÊbzçíl\u0099ò\u001dÃuF\u0004É\u0080S\rÖ·X_ãÓeCèÙrmõ\u001ex\u008a\u0082\u0018\u0005¢\u0086h\u0003\n\u008c\u0088\u00163\u0093³\u001dQ¦ê K\u00adò7r°\u0016=\u0092Ç+@¹Ê'WôÑNZÁäqaæê\u0092t\u0016\u0000g\u0085\u0016\n\u0092\u0090\u0016\u0015®\u009bU ×¦F+ìûñ~\u0080ñ\u0004k\u0080î8`ÃÛA]ÐÐzJî\u0000g\u0085\u0016\n\u0092\u0090\u0016\u0015®\u009bU ×¦F+ì±M6\u0017»\u0094A\bÆ³\b`\u008d\u0011\u0002\u0095\u0098\u0011\u001d©\u0093R(Ð®A#ë¹Z>\u0018³\u009aI\u0016Îµè¢mÓâWxÓýks\u0090È\u0012N\u0083Ã)Y\u0088ÞÒSQ©Í.v¤üä\u0010aaîåtañÙ\u007f\"Ä B1Ï\u009bU*Òh_ê¥f\"Å¨N\u0000v\u0085\u0016\n\u0094\u0090*\u0015¥\u009bP Ü¦f+÷±f6\u000e»\u0090A\u0016Æ²%Ó ¢/&µ¬0\u0014¾ç\u0005U\u0083å\u000e^\u0094Ö\u0013¤\u009e\"d£\u0000g\u0085\u0016\n\u0092\u0090\u0018\u0015 \u009bS à¦@+ÿ±n6\u0006»¼A\u0005Æ£L)ÑÕWUÜÐ\u0000g\u0085\u0016\n\u0092\u0090\u001f\u0015¥\u009bM Á¦Q+Ê±n6\u0019»\u0094A\u001cÆ\u009aL+ÑÉWSÜË\u0000i\u0085\u0000\n¡\u0090\u0003\u0015¥\u009bO ñ¦J+õ±{6\f»\u0094A\u0017Æ¤L/ÑÙWcÜ×bdçàl\u0092ò\b¦²#À¬S6à³w=\u0099\u0086\u0016\u0000\u0096\u008d=\u0017®\u0090ï\u001d}çÛ`qêÏw\u001fñ\u0094z\u001cÄ®A82\u0099·û8y¢Â'B© \u0012\u000e\u0094\u00ad\u0019\u0003\u0083\u009c\u0004á\u0089Gs÷ô^~Äã\"e¤î<P\u009e\u0000s\u0085\u0016\n\u0092\u0090,\u0015¼\u009by À¦D+õ±n62»\u0098A\u0017Æ£L/ÑÓWUÜÑ\u0000r\u0085\u0016\n\u008b\u00906\u0015º\u009bZ ô¦W+ù±f6\u001b»½A\rÆ¤L>ÑØW^ÜÆbd\u0000r\u0085\u0016\n\u0096\u00905\u0015\u00ad\u009b\\ ×¦j+ö±H6\u0012»\u0098A\u0007Æ¼L\u0006ÑÔWCÜ×bsççl\u0099ò\u001d£<&^©Ü3g¶ç8\u0005\u0083»\u0005\u0013\u0088¢\u0012#\u0095n\u0018Àâxeäï|r\u0081ô\u0004\u007f°Á D¥Ï×QUÔÓ^o!åË~N\u001aÁ\u009a[9Þ¡PPëÛmfàúzSý\u001dp\u0088\u008a\u000b\r³\u0087\n\u001aØ\u009cO\u0017Û©\u007f,ë§\u00959\u0011\u0082ü\u0007\u009e\u0088\u001c\u0012§\u0097'\u0019Å¢{$Ó©b3ã´®9\u0000Ã¯D'Î SAÕÇ^pààeeî\u0017p\u0095õ\u0013\u007f¯\u0000%\u0000g\u0085\u0016\n\u0092\u0090\u0016\u0015¢\u009b| Þ¦L+û±`62»\u0098A\u0017Æ£L/ÑÓWUÜÑpgõ\u0016z\u0092à\u0016e¢ëkPÝÖP[ûÁcF2Ë\u00981\u0017¶£</¡Ó'U¬Ñ\r\u001c\u0088~\u0007ü\u009dG\u0018Ç\u0096%-\u0080«?&\u0083¼\u001d;`¶ÞLwËÉALÜ§Z=Ñ\u0093o\u0007ê¦añÿuzíðK\u008fÅ\u0005!\u0080µ\u001e\u0012\u0095\u0082\u0013\u000b®q%÷£q>É´K.ú«\u0098$\u001a¾¡;!µÃ\u000ef\u0088Ù\u0005e\u009fû\u0018\u0086\u00958o\u0091è/bªÿAyÛòuLáÉYB\u000bÜ\u0090Y\u0014Ó\u0080¬8&Ñ£C=Ý¶c0û\u008d\u0091\u0000c\u0085\u0001\n\u0083\u00908\u0015¸\u009bZ ÿ¦@+ü±b6\u001f»¡A\bÆ¶L3ÑØWBÜìbxçÊl\u0093ò\u0002w\u0092ý9\u0082\u00ad\bO\u008dÇ\u0013N\u0098ú\u001eK£\u0013(\u009e®\u00143¶¹(>ÜÄ^\u0000c\u0085\u0001\n\u0083\u00908\u0015¸\u009bZ ÿ¦@+ü±b6\u001f»¡A\bÆ¶L3ÑØWBÜìbxçÚl\u0099ò\nw\u0089ý\u0016\u0082§\bV\u008dÞ\u0013M\u0098ñ\u001es£\u001f(¡®\t3 ¹2>ÜÄBIúÏ`\u0000c\u0085\u0001\n\u0083\u00908\u0015¸\u009bZ ý¦K+Ô±j6\u0007»\u009eA\u0011Æ£L\tÑÕWQÜÍbqçìl°ò\u0006w\u0091ý!\u0082\u00ad\bU\u008dË\u0013S\u009aÍ\u001f¯\u0090-\n\u0096\u008f\u0016\u0001ôºS<å±w+Ñ¬¤!>Û©\\\u0011Ö·KgÍÿFyøÝ}dö:h í\"g\u009c\u0018\u0003\u0092Ù\u0017i\u0089ü\u0002N\u0084Ì9º²&4¼Ø\u008b]ïÒoHÌÍTC¥ø.~\u0093ó\u000fi¡îâcm\u0099ö\u001em\u0094Ü\t)\u008f¹\u00046º\u008a?\u0004´`*Ú¯r%ßZEÐ§U9Ë½@\u001fqØô¼{<á\u009fd\u0007êöQ}×ÀZ\\ÀìG±Ê?0§·\u001c=° e&ÿ\u00ady\u0013Ý\u0096Q\u001d3\u0083¡\u0006\u0004\u008c\u0096ó\u0011yåüabåé[oß×LR(Ý¨G\u000bÂ\u0093Lb÷éqTüÈfxá%l«\u00963\u0011\u0088\u009b=\u0006í\u0080h\u000bòµd0Þ»±%% ¹*\u0005U\u0093ßw\u0000r\u0085\u0016\n\u0096\u00905\u0015\u00ad\u009b\\ ×¦j+ö±F6\u001b»\u0095A\rÆ¶L\tÑÒW]ÜÓbzçìl\u0088ò\u0006w\u008dý;\u0082\u0084\bR\u008dÝ\u0013U\u0098ñ\u001ei£\u001f(\u009f´\u009a1ë¾o$à¡T/¡\u0094 \u0012ª\u009f\u0004\u0005\u0082\u0082æ\u000fhõÚrKøÛe,ã¯h?Ö\u0088S\u001f\u0000c\u0085\u0001\n\u0083\u00908\u0015¸\u009bZ ð¦W+÷±j6\u001a»\u0092A\u0005Æ¤L>ÑïWUÜÀbsçàl\u008aò\nw\u0090iVì4c¶ù\r|\u008dòoIÓÏRBáØW_8Ò°(4¯\u008c%\u001a¸ú\u0000i\u0085\u0000\n§\u0090=\u0015\u009d\u009bJ Ó¦I+ñ±\u007f6\u0007»¡A\u0016Æ¸L2ÑÄW|ÜÊbeçýl\u0099ò\u0001w\u0087ý'\u0000c\u0085\u0001\n\u0083\u00908\u0015¸\u009bZ å¦@+ú±]6\u0017»\u0094A\u0013Æ\u009bL#ÑÎWDÜÆbxçìl\u008e\u0000s\u0085\u0016\n\u0092\u0090\u000e\u0015©\u009b] ä¦L+ý±|6=»\u009dA\rÆ²L$ÑÉ\u0000s\u0085\u0016\n\u0092\u0090\u000e\u0015©\u009b] ñ¦M+ê±d6\u0013»\u0094A'Æ»L#ÑØW^Ü×\u008dò\b\u0083\u0087\u0007\u001d\u009b\u0098<\u0016È\u00adq+Ù¦h<é»¨6\bÌ\u0098K'Á±\\\\\f°\u0089Á\u0006E\u009cÙ\u0019~\u0097\u008a,&ª\u009a'=½³:Ä·CMðÊl@ôÝ\u000f[\u0089Ð\u0000\u0000s\u0085\u0016\n\u0088\u0090=\u0015\u0089\u009bM À¦J+êÀ\tElÊòPGÕü[6à§f1ë§q\u0007öa{å\u0081j\u008fî\n\u0098\u0085\r\u001f\u0093\u009a5\u0014Õ¯S)Þ¤R>ü¹\u00814\u001fÎ\u0085I<Ã ^@\u0000g\u0085\u0016\n\u0092\u0090\u001a\u0015£\u009bQ Ü¦@+û±\u007f6\u0011»\u0083f/ã^lÚöRsëý\u0019F\u008eÀ\bM¨×7\u0000g\u0085\u0016\n\u0092\u0090\r\u0015¥\u009bR ×^\u0096ÛçTcÎäK\\Å½~7ø\u0080u\u0006ï\u008fhìåh\u0000g\u0085\u0016\n\u0092\u0090\u0015\u0015\u00ad\u009bL Æ¦q+÷±~6\u001d»\u0099A0Æ¾L'ÑØ\u0000g\u0085\u0016\n\u0092\u0090\u001a\u0015¹\u009bM À¦@+ö±\u007f6?»\u0092A\u0010Æ¾L<ÑÔWDÜÚ\u0000c\u0085\u0001\n\u0083\u00908\u0015¸\u009bZ ñ¦W+ý±j6\n»\u0098A\u0012Æ²L\u0003ÑÓWVÜÌ\u0000c\u0085\u0001\n\u0083\u00908\u0015¸\u009bZ ó¦A+î±n6\f»\u0085A\rÆ¤L/ÑÏWyÜÍbpçæÏKJ)Å«_\u0010Ú\u0090TrïÙi\u007fäÕ~Bù\"t°\u008e:\t\u009a\u0083+\u001eñ\u0098k\u0000c\u0085\u0001\n\u0083\u00908\u0015¸\u009bZ ÿ¦@+ü±b6\u001f»\u0085A\rÆ¸L$ÑùWQÜ×bw\u007fßú®u*ï²j\u0010äì_\\ÙøTRÎÀI¯Ä&>²\u008aJ\u000f;\u0080¿\u001a2\u009f\u0094\u0011~ªó,[¡Ñ;M¼\u00051¹Ë;L\u0089Æ\u000e[ÿÝs\u0017Ò\u0092£\u001d'\u0087¿\u0002\u0016\u008cå7j±ü<L¦í!¯¬/V\u0087Ñ\u0007[\u008dÆ{@ìËyuÍµv0\u0007¿\u0083%\t º.K\u0095Í\u0013@\u009eÛ\u0004\u007f\u0083\u0002\u000e\u008fô\u0001s£ù\u0018dÃâOiÔ×nRÿ\u0000c\u0085\u0001\n\u0083\u00908\u0015¸\u009bZ ö¦@+þ±j6\u000b»\u009dA\u0010Æ\u0092L<ÑØW^Ü×b\\çúl\u0093ò\u0001D`Á\u0011N\u0095Ô\u001dQ¤ßVdÛâGoüõxr\u0016ÿ\u0084\u00055\u0082µ\b?\u0095É\u0013^\u0098Ë&\u007f\u0000l\u0085\u001c\n\u0081\u0090\u001c\u0015º\u009bZ Ü¦QJ³ÏÚ@oÚç_}Ñ¬j\u0006ì«a'û¢|Ðñf\u000bÑ\u008ci\u0006õ\u0000g\u0085\u0016\n\u0092\u0090\u0018\u0015¨\u009bk Ë¦U+ý±O6\u001b»\u0082A\u0007Æ¥L#ÑÍWDÜÊbyçç\u0000g\u0085\u0016\n\u0092\u0090\u001a\u0015¹\u009bM À¦@+ö±\u007f6=»\u009eA\nÆ¹L/ÑÞWDÜÌbdçÇl\u009dò\u0002w\u0087\u0000g\u0085\u0016\n\u0092\u0090\u001a\u0015¹\u009bM À¦@+ö±\u007f62»\u0098A\u0017Æ£L/ÑÓWUÜÑbXçèl\u0091ò\n¥H !¯\u00845\u0017°\u0083>x\u0085ú\u0003c\u008eÿ\u0014E\u0093-\u001e³ä c¥é\u000etòòuyÇÇYBÉÉ¿W\"Ò¦X\u0010ï\tjxåü\u007ftúÍt?ÏºI\"Ä\u0091^+Ù\u007fTÖ®g)É£a>«¸*3¿\u008d\u0019\b¢\u0083ä\u001dd\u0098â\u0012Omöç0b²ü,w\u009fñ\u0007L`%ê \u0089/\u0001µ°0 ¾Ô\u0005[\u0083Þ\u000ed\u0094Æ\u0013\u0080\u009e\u001cd\u0082ã+ B%3ª·09µ\u0091;j\u0080ò\u0006r\u008bÔ\u0011C\u0096>\u001bºá5f±ì\u0000qö÷s|ïÂT\u0000g\u0085\u0016\n\u0092\u0090\u001c\u0015´\u009bO ×¦W+ñ±f6\u001b»\u009fA\u0010Æ\u0082L9ÑØWBÜ÷byçâl\u0099ò\u0001\u00adÑ( §$=ª¸\u00026ù\u008da\u000bá\u0086G\u001cÐ\u009b\u00ad\u0016)ì¦k5á\u008e|júïqaÏÓì\u0094iåæa|ïùGw¼Ì$J¤Ç\u0002]\u0095ÚèWl\u00adã*p Ë=/»ª0$ÛÇ^¿Ñ8·\u009f2ç½{'×\u0000a\u0085\u0001\n\u0094\u00908\u0015µ\u009bk Ë¦U+ý!Ý¤£+>±\u008e4\u001dºù\u0001H\u0087ö\nY\u0090ô\u0017©\u009a7`¾ç\nm\u009cç$bFíÄw\u007fòÿ|\u001dÇ§A\u0017Ì±V\"ÑX\\Ô¦O!õ@ªÅÞJPÐÎUzÛª`\u000bæ\u0094k.ñ\u0087vÎû[\u0001Ù\u0086n\föÚz_\u0016Ð\u009fJ'Ï\u0089A[úõ|Nñûkoì a\u0093\u009b\u001c\u001c¸\u0096!\u000bÓÄ\u008eAâÎkTÓÑv_¤ä bºï\u001fu\u0090òä\u007f@\u0085ô\u0002d\u0088Õ\u0015*\u0093 \u0018\t¦\u0080#\u0005¨g6ð³xosê\u0007e\u0089ÿ\u0017z£ô}OÜÉJD÷ÞoY\u001cÔ\u0084.\n©¤#\u001f¾Ô8C³Ç\rv\u0088ì\u0000p\u0085\u001c\n\u0095\u0090-\u0015\u0083\u009bQ ñ¦J+ö±e6\u001b»\u0092A\u0010Æ¸L8ÑéWXÜÑbsçèl\u0098\u009au\u001f\u0019\u0090\u0090\n(\u008f\u008d\u0001_ºÛ<A±ä+k¬\u001f!»Û\u000f\\\u0091Ö KÖÍ[FÃøp}øö\u0096h\u0018í³g8\u0018¿\u0092[\u0017Ê\u0089@\u0000g\u0085\u0016\n\u0092\u0090\u0015\u0015£\u009b\\ Ó¦I+Ú±y6\u0011»\u0090A\u0000Æ´L+ÑÎWDÜîbwççl\u009dò\bw\u0087ý'\u0082\u0081\bU\u008dÝ\u0013U\u0098õ\u001ei£\u0019(\u0088\u008cÍ\t©\u0086>\u001c\u008f\u0099\u0000\u0017ô¬h*è§e=Æº®7/Í¿J\u000bÀ\u0094]qÛûPNîÌkUà&~¹û+q\u008f\u000e\u0005\u0000u\u0085\u001d\n\u0094\u0090<\u0015«\u009bV Á¦Q+ý±y6<»\u0083A\u000bÆ¶L.ÑÞWQÜÐbbçÛl\u0099ò\fw\u0087ý<\u0082¾\b^\u008dÜ\u0000g\u0085\u0016\n\u0092\u0090\t\u0015\u00ad\u009bV À¦c+ñ±y6\r»\u0085A+ÆµL ÑØWSÜ×X\u009fÝîRjÈñMUÃ®x8þ\u008es\u0005é\u0090néãg\u0019ø\u009e`\u0014Ð\u0089/\u000f\u00ad\u00848:\u009a\u0000g\u0085\u0016\n\u0092\u0090\u0014\u0015©\u009b[ Û¦D+È±g6\u001f»\u0088A\u0001Æ¥ä\u0099aèîltãñW\u007f·Ä%B¸Ï\u0003U Òð_[¥ó\"D¨Ñ5\n³ 8\u0010\u0086\u0081\u0003\u001b\u0088k\u0016â\u0000m\u0085\u0012\n\u0096\u0000f\u0085\u001c\n\u0094\u0090\u001c\u0015\u00ad\u009b\\ ÚÈ¯MÓÂCXäÝ`S\u0084\u0000E\u0085\u0001\n\u0094\u00906\u0015¾\u009b\u001f ×¦]+ý±h6\u000b»\u0085A\rÆ¹L-Ñ\u009dW]ÜÆbbçál\u0093ò\u000bwÂ\u0000:\u0085S\n\u008b\u0090<\u0015¸\u009bW Ý¦A+¸±e6\u0011»\u0085ADÆ¤L?ÑÍW@ÜÌbdçýl\u0099ò\u000b".getBytes(CharEncoding.ISO_8859_1)).asCharBuffer().get(cArr, 0, IronSourceError.ERROR_LEGACY_INIT_POST_FAILED);
        f1600 = cArr;
        f1601 = 5379383979749049715L;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1813(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f1600[i3 + i4]) ^ (((long) i4) * f1601)) ^ ((long) c2));
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:162:0x081f  */
    /* JADX WARN: Code duplicated, block: B:32:0x017f  */
    /* JADX WARN: Code duplicated, block: B:361:0x1192  */
    /* JADX WARN: Code duplicated, block: B:53:0x0293  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻛ */
    public final Object mo1524(cp cpVar, String str, List<Object> list, dr drVar) {
        long j;
        try {
            byte b2 = 17;
            j = 0;
            try {
                switch (str.hashCode()) {
                    case -2004702861:
                        if (!str.equals(m1813(View.getDefaultSize(0, 0) + 25, 579 - TextUtils.getOffsetAfter("", 0), (char) (33439 - View.MeasureSpec.makeMeasureSpec(0, 0))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 36;
                        }
                        break;
                    case -2004586504:
                        if (!str.equals(m1813(Color.alpha(0) + 29, Color.rgb(0, 0, 0) + 16778059, (char) (55545 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 45;
                        }
                        break;
                    case -1940880443:
                        if (!str.equals(m1813(15 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 291 - TextUtils.getOffsetAfter("", 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1)).intern())) {
                            b2 = -1;
                        } else {
                            int i2 = f1599 + 87;
                            f1598 = i2 % 128;
                            b2 = i2 % 2 != 0 ? (byte) 20 : (byte) 38;
                        }
                        break;
                    case -1935452010:
                        if (!str.equals(m1813(22 - (ViewConfiguration.getFadingEdgeLength() >> 16), 412 - TextUtils.indexOf("", "", 0, 0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 28;
                        }
                        break;
                    case -1926335428:
                        if (!str.equals(m1813(TextUtils.indexOf((CharSequence) "", '0') + 15, 305 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 2055)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 21;
                        }
                        break;
                    case -1862527602:
                        if (str.equals(m1813(16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1098 - Color.red(0), (char) (TextUtils.getOffsetBefore("", 0) + 36245)).intern())) {
                            b2 = 56;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1811057601:
                        if (!str.equals(m1813(Gravity.getAbsoluteGravity(0, 0) + 14, 43 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((Process.myTid() >> 22) + 48307)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 3;
                        }
                        break;
                    case -1784213698:
                        if (!str.equals(m1813((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 17, 622 - TextUtils.getTrimmedLength(""), (char) (28673 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern())) {
                            b2 = -1;
                        } else {
                            f1598 = (f1599 + 123) % 128;
                        }
                        break;
                    case -1759122910:
                        if (!str.equals(m1813(TextUtils.indexOf((CharSequence) "", '0', 0) + 31, 872 - KeyEvent.normalizeMetaState(0), (char) (29098 - (ViewConfiguration.getEdgeSlop() >> 16))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 46;
                        }
                        break;
                    case -1673354837:
                        if (!str.equals(m1813(Drawable.resolveOpacity(0, 0) + 14, ExpandableListView.getPackedPositionType(0L) + 236, (char) (49938 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 16;
                        }
                        break;
                    case -1654145783:
                        if (!str.equals(m1813(20 - Color.alpha(0), 1452 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) TextUtils.indexOf("", "")).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 79;
                        }
                        break;
                    case -1475737971:
                        if (!str.equals(m1813((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14, KeyEvent.keyCodeFromString("") + 1709, (char) (16600 - Drawable.resolveOpacity(0, 0))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 94;
                        }
                        break;
                    case -1424907981:
                        if (!str.equals(m1813(9 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1671 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ExpandableListView.getPackedPositionType(0L)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 91;
                        }
                        break;
                    case -1412269250:
                        if (!str.equals(m1813(15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1002 - TextUtils.lastIndexOf("", '0'), (char) (26933 - (ViewConfiguration.getLongPressTimeout() >> 16))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 51;
                        }
                        break;
                    case -1296960936:
                        if (!str.equals(m1813(18 - View.getDefaultSize(0, 0), 394 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (MotionEvent.axisFromString("") + 1)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 27;
                        }
                        break;
                    case -1296887564:
                        if (str.equals(m1813(ExpandableListView.getPackedPositionGroup(0L) + 27, TextUtils.getCapsMode("", 0, 0) + 1889, (char) View.resolveSize(0, 0)).intern())) {
                            b2 = 102;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case -1274492040:
                        if (!str.equals(m1813(6 - View.resolveSizeAndState(0, 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 1999, (char) (51401 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 109;
                        }
                        break;
                    case -1253789331:
                        if (!str.equals(m1813(24 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 1864, (char) (36031 - Color.red(0))).intern())) {
                            b2 = -1;
                        }
                        break;
                    case -1242814655:
                        if (!str.equals(m1813((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19, 1410 - (ViewConfiguration.getTapTimeout() >> 16), (char) (17415 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).intern())) {
                            b2 = -1;
                        } else {
                            f1598 = (f1599 + 39) % 128;
                            b2 = 76;
                        }
                        break;
                    case -1214823651:
                        if (!str.equals(m1813(19 - Color.alpha(0), 491 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 32;
                        }
                        break;
                    case -1198560170:
                        if (!str.equals(m1813((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28, 1804 - Color.green(0), (char) (ExpandableListView.getPackedPositionGroup(0L) + 39429)).intern())) {
                            b2 = -1;
                        } else {
                            int i3 = f1598 + 83;
                            f1599 = i3 % 128;
                            if (i3 % 2 == 0) {
                                b2 = 99;
                            } else {
                                b2 = 75;
                            }
                        }
                        break;
                    case -1145074375:
                        if (!str.equals(m1813(35 - (ViewConfiguration.getScrollBarSize() >> 8), 640 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((Process.myTid() >> 22) + 3455)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 39;
                        }
                        break;
                    case -1124602405:
                        if (!str.equals(m1813(18 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1646 - (Process.myPid() >> 22), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 60660)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 88;
                        }
                        break;
                    case -1071201617:
                        if (!str.equals(m1813(15 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 1953, (char) ExpandableListView.getPackedPositionType(0L)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 105;
                        }
                        break;
                    case -1029444991:
                        if (!str.equals(m1813(Color.red(0) + 32, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 928, (char) View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 48;
                        }
                        break;
                    case -1029356152:
                        if (!str.equals(m1813(View.getDefaultSize(0, 0) + 14, 101 - TextUtils.indexOf("", "", 0), (char) View.getDefaultSize(0, 0)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 7;
                        }
                        break;
                    case -1013936139:
                        if (!str.equals(m1813(((Process.getThreadPriority(0) + 20) >> 6) + 23, 1472 - Color.green(0), (char) View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                            b2 = -1;
                        } else {
                            int i4 = f1599 + 41;
                            f1598 = i4 % 128;
                            if (i4 % 2 != 0) {
                                b2 = 80;
                            } else {
                                b2 = 53;
                            }
                        }
                        break;
                    case -997695964:
                        if (!str.equals(m1813(23 - ExpandableListView.getPackedPositionType(0L), Color.argb(0, 0, 0, 0) + 1740, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 50429)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 96;
                        }
                        break;
                    case -992018155:
                        if (!str.equals(m1813((ViewConfiguration.getJumpTapTimeout() >> 16) + 19, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1586, (char) (40997 - (Process.myTid() >> 22))).intern())) {
                            b2 = -1;
                        } else {
                            int i5 = f1598 + 17;
                            f1599 = i5 % 128;
                            if (i5 % 2 == 0) {
                                b2 = 85;
                            } else {
                                b2 = 86;
                            }
                        }
                        break;
                    case -952854909:
                        if (!str.equals(m1813(KeyEvent.normalizeMetaState(0) + 13, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 81, (char) Color.red(0)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 5;
                        }
                        break;
                    case -924373867:
                        if (!str.equals(m1813(20 - TextUtils.indexOf("", ""), Process.getGidForName("") + 1264, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 68;
                        }
                        break;
                    case -899502102:
                        if (!str.equals(m1813(13 - TextUtils.indexOf("", ""), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1141, (char) (View.MeasureSpec.getMode(0) + 49274)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 59;
                        }
                        break;
                    case -834290483:
                        if (!str.equals(m1813(40 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 744 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0'))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 42;
                        }
                        break;
                    case -788426345:
                        if (!str.equals(m1813(13 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getTrimmedLength("") + 363, (char) (TextUtils.indexOf((CharSequence) "", '0') + 9653)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 25;
                        }
                        break;
                    case -764989270:
                        if (!str.equals(m1813(30 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 675, (char) (11929 - Drawable.resolveOpacity(0, 0))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 40;
                        }
                        break;
                    case -678635926:
                        if (!str.equals(m1813(TextUtils.getTrimmedLength("") + 7, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1993, (char) (Color.rgb(0, 0, 0) + 16777216)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 108;
                        }
                        break;
                    case -633198692:
                        if (!str.equals(m1813(16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 1681, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 8626)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 92;
                        }
                        break;
                    case -622788386:
                        if (!str.equals(m1813(10 - (ViewConfiguration.getTouchSlop() >> 8), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 281, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 64406)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 19;
                        }
                        break;
                    case -588814953:
                        if (!str.equals(m1813(TextUtils.lastIndexOf("", '0', 0, 0) + 13, 1170 - ExpandableListView.getPackedPositionType(0L), (char) (TextUtils.lastIndexOf("", '0') + 1)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 61;
                        }
                        break;
                    case -525192167:
                        if (!str.equals(m1813(TextUtils.getCapsMode("", 0, 0) + 18, 1245 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 67;
                        }
                        break;
                    case -502936072:
                        if (!str.equals(m1813(19 - (KeyEvent.getMaxKeyCode() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1627, (char) (44470 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).intern())) {
                            b2 = -1;
                        }
                        break;
                    case -429121350:
                        if (!str.equals(m1813((ViewConfiguration.getWindowTouchSlop() >> 8) + 22, 250 - View.MeasureSpec.getMode(0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 34316)).intern())) {
                            b2 = -1;
                        }
                        break;
                    case -264400535:
                        if (!str.equals(m1813(KeyEvent.getDeadChar(0, 0) + 22, ExpandableListView.getPackedPositionGroup(0L) + 510, (char) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 33;
                        }
                        break;
                    case -100132040:
                        if (!str.equals(m1813(23 - Color.alpha(0), View.resolveSize(0, 0) + 151, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 25336)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 11;
                        }
                        break;
                    case -75121853:
                        if (!str.equals(m1813((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7, AndroidCharacter.getMirror('0') + 1144, (char) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 63;
                        }
                        break;
                    case -75062501:
                        if (!str.equals(m1813((ViewConfiguration.getWindowTouchSlop() >> 8) + 7, 94 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (856 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 6;
                        }
                        break;
                    case -39321397:
                        if (!str.equals(m1813(13 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getWindowTouchSlop() >> 8) + 29, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 2;
                        }
                        break;
                    case -37751474:
                        if (!str.equals(m1813(15 - TextUtils.indexOf("", ""), (KeyEvent.getMaxKeyCode() >> 16) + Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 59590)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 22;
                        }
                        break;
                    case -20195056:
                        if (!str.equals(m1813(View.getDefaultSize(0, 0) + 24, MotionEvent.axisFromString("") + 1020, (char) TextUtils.getOffsetBefore("", 0)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 52;
                        }
                        break;
                    case 107868:
                        if (!str.equals(m1813(TextUtils.lastIndexOf("", '0', 0, 0) + 4, Color.argb(0, 0, 0, 0) + 1989, (char) ExpandableListView.getPackedPositionType(0L)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 107;
                        }
                        break;
                    case 108960:
                        if (!str.equals(m1813(Color.argb(0, 0, 0, 0) + 3, 1665 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (View.getDefaultSize(0, 0) + 56233)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 89;
                        }
                        break;
                    case 1820707:
                        if (!str.equals(m1813(17 - Color.green(0), ExpandableListView.getPackedPositionType(0L) + 1332, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 35372)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 72;
                        }
                        break;
                    case 2656096:
                        if (!str.equals(m1813((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 9, 1132 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (AndroidCharacter.getMirror('0') - '0')).intern())) {
                            b2 = -1;
                        } else {
                            int i6 = f1599 + 41;
                            f1598 = i6 % 128;
                            b2 = i6 % 2 != 0 ? (byte) 58 : (byte) 87;
                        }
                        break;
                    case 3052374:
                        if (!str.equals(m1813((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3, View.MeasureSpec.getSize(0) + 1667, (char) (47100 - ((Process.getThreadPriority(0) + 20) >> 6))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 90;
                        }
                        break;
                    case 15484010:
                        if (!str.equals(m1813(15 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.getOffsetBefore("", 0) + 1437, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 19162)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 78;
                        }
                        break;
                    case 134176114:
                        if (!str.equals(m1813(View.combineMeasuredStates(0, 0) + 18, 1227 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) View.MeasureSpec.getSize(0)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 66;
                        }
                        break;
                    case 151150886:
                        if (!str.equals(m1813(View.MeasureSpec.makeMeasureSpec(0, 0) + 19, 1300 - TextUtils.indexOf("", "", 0, 0), (char) ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 70;
                        }
                        break;
                    case 171861489:
                        if (!str.equals(m1813((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, (char) (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 10;
                        }
                        break;
                    case 186649624:
                        if (!str.equals(m1813((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 20, 1783 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) TextUtils.getOffsetBefore("", 0)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 98;
                        }
                        break;
                    case 190032796:
                        if (!str.equals(m1813(14 - (ViewConfiguration.getScrollBarSize() >> 8), KeyEvent.keyCodeFromString("") + 15, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    case 317728381:
                        if (!str.equals(m1813(TextUtils.indexOf((CharSequence) "", '0', 0) + 23, 1388 - Color.red(0), (char) Color.blue(0)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 75;
                        }
                        break;
                    case 370758723:
                        if (!str.equals(m1813(20 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1934 - (Process.myTid() >> 22), (char) (22776 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 104;
                        }
                        break;
                    case 383897184:
                        if (!str.equals(m1813((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, ((Process.getThreadPriority(0) + 20) >> 6) + 1154, (char) (36751 - (ViewConfiguration.getJumpTapTimeout() >> 16))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 60;
                        }
                        break;
                    case 386145701:
                        if (!str.equals(m1813((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 18, 454 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (13050 - (ViewConfiguration.getPressedStateDuration() >> 16))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 30;
                        }
                        break;
                    case 398700013:
                        if (!str.equals(m1813(17 - View.resolveSize(0, 0), 1283 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (53032 - View.combineMeasuredStates(0, 0))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 69;
                        }
                        break;
                    case 404330675:
                        if (!str.equals(m1813(TextUtils.getTrimmedLength("") + 22, 214 - View.getDefaultSize(0, 0), (char) View.combineMeasuredStates(0, 0)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 15;
                        }
                        break;
                    case 413143991:
                        if (!str.equals(m1813(View.resolveSize(0, 0) + 15, 333 - ExpandableListView.getPackedPositionChild(0L), (char) (58486 - TextUtils.lastIndexOf("", '0', 0, 0))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 23;
                        }
                        break;
                    case 421306799:
                        if (!str.equals(m1813((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9, 124 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (Color.argb(0, 0, 0, 0) + 29363)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 9;
                        }
                        break;
                    case 449440345:
                        if (!str.equals(m1813(13 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1571, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 9608)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 84;
                        }
                        break;
                    case 451302467:
                        if (!str.equals(m1813(18 - TextUtils.indexOf((CharSequence) "", '0', 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1348, (char) (6069 - Color.red(0))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 73;
                        }
                        break;
                    case 468780064:
                        if (!str.equals(m1813(22 - (Process.myTid() >> 22), 556 - TextUtils.lastIndexOf("", '0'), (char) (TextUtils.getTrimmedLength("") + 51980)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 35;
                        }
                        break;
                    case 496987426:
                        if (str.equals(m1813(View.MeasureSpec.getSize(0) + 16, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 55818)).intern())) {
                            b2 = 95;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 502192375:
                        if (!str.equals(m1813(17 - TextUtils.lastIndexOf("", '0', 0, 0), ExpandableListView.getPackedPositionChild(0L) + 377, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 26;
                        }
                        break;
                    case 518569412:
                        if (!str.equals(m1813(18 - KeyEvent.getDeadChar(0, 0), 473 - ExpandableListView.getPackedPositionGroup(0L), (char) Color.blue(0)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 31;
                        }
                        break;
                    case 526577620:
                        if (!str.equals(m1813(21 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 175, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 12;
                        }
                        break;
                    case 600996866:
                        if (!str.equals(m1813(16 - TextUtils.indexOf("", ""), 1064 - View.MeasureSpec.getSize(0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 54;
                        }
                        break;
                    case 618460119:
                        if (!str.equals(m1813(9 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.lastIndexOf("", '0', 0, 0) + 196, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 34783)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 13;
                        }
                        break;
                    case 622025239:
                        if (!str.equals(m1813(TextUtils.getOffsetBefore("", 0) + 20, 1368 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (46354 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 74;
                        }
                        break;
                    case 660677592:
                        if (!str.equals(m1813((ViewConfiguration.getTouchSlop() >> 8) + 37, 705 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 41;
                        }
                        break;
                    case 672646709:
                        if (!str.equals(m1813(9 - (ViewConfiguration.getEdgeSlop() >> 16), MotionEvent.axisFromString("") + 273, (char) Color.red(0)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 18;
                        }
                        break;
                    case 675563679:
                        if (!str.equals(m1813(17 - ((byte) KeyEvent.getModifierMetaStateMask()), 1916 - View.MeasureSpec.getSize(0), (char) ('0' - AndroidCharacter.getMirror('0'))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 103;
                        }
                        break;
                    case 759503924:
                        if (!str.equals(m1813((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 980, (char) KeyEvent.keyCodeFromString("")).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 50;
                        }
                        break;
                    case 776628755:
                        if (!str.equals(m1813((ViewConfiguration.getJumpTapTimeout() >> 16) + 26, 902 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (Color.alpha(0) + 55102)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 47;
                        }
                        break;
                    case 791624502:
                        if (!str.equals(m1813((ViewConfiguration.getEdgeSlop() >> 16) + 32, ExpandableListView.getPackedPositionGroup(0L) + 1832, (char) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 100;
                        }
                        break;
                    case 861400366:
                        if (!str.equals(m1813(20 - TextUtils.indexOf("", "", 0, 0), 434 - KeyEvent.getDeadChar(0, 0), (char) (42710 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 29;
                        }
                        break;
                    case 956170787:
                        if (!str.equals(m1813(18 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1113 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3287)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 57;
                        }
                        break;
                    case 1057201549:
                        if (!str.equals(m1813(ExpandableListView.getPackedPositionType(0L) + 20, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1762, (char) (TextUtils.lastIndexOf("", '0', 0) + 28418)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 97;
                        }
                        break;
                    case 1076958445:
                        if (!str.equals(m1813(14 - ExpandableListView.getPackedPositionGroup(0L), 349 - TextUtils.getCapsMode("", 0, 0), (char) Color.red(0)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 24;
                        }
                        break;
                    case 1107904233:
                        if (!str.equals(m1813((-16777188) - Color.rgb(0, 0, 0), 783 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 43;
                        }
                        break;
                    case 1125810632:
                        if (!str.equals(m1813(Drawable.resolveOpacity(0, 0) + 31, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1541, (char) (61294 - TextUtils.getOffsetAfter("", 0))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 83;
                        }
                        break;
                    case 1414080697:
                        if (!str.equals(m1813(24 - Drawable.resolveOpacity(0, 0), TextUtils.indexOf("", "", 0) + 57, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 4;
                        }
                        break;
                    case 1444942133:
                        if (!str.equals(m1813(33 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 810, (char) (39598 - Color.argb(0, 0, 0, 0))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 44;
                        }
                        break;
                    case 1521072706:
                        if (!str.equals(m1813(22 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1495 - TextUtils.indexOf("", "", 0, 0), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 81;
                        }
                        break;
                    case 1525623361:
                        if (!str.equals(m1813(KeyEvent.getDeadChar(0, 0) + 22, 1967 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 58621)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 106;
                        }
                        break;
                    case 1546196954:
                        if (!str.equals(m1813(Color.alpha(0) + 24, 1517 - TextUtils.indexOf("", "", 0, 0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 42272)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 82;
                        }
                        break;
                    case 1557083836:
                        if (!str.equals(m1813((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 25, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 533, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 41823)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 34;
                        }
                        break;
                    case 1590874683:
                        if (!str.equals(m1813(22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 1605, (char) (Color.rgb(0, 0, 0) + 16777216)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 86;
                        }
                        break;
                    case 1622498214:
                        if (!str.equals(m1813(20 - (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.rgb(0, 0, 0) + 16778176, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 46333)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 49;
                        }
                        break;
                    case 1664124883:
                        if (!str.equals(m1813((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, (-1) - MotionEvent.axisFromString(""), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern())) {
                            b2 = -1;
                        } else {
                            f1599 = (f1598 + 123) % 128;
                            b2 = 0;
                        }
                        break;
                    case 1746583808:
                        if (!str.equals(m1813(16 - View.MeasureSpec.makeMeasureSpec(0, 0), 1211 - TextUtils.indexOf("", "", 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 65;
                        }
                        break;
                    case 1751981113:
                        if (!str.equals(m1813(14 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1695 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (TextUtils.indexOf("", "", 0, 0) + 59207)).intern())) {
                            b2 = -1;
                        } else {
                            int i7 = f1599 + 33;
                            f1598 = i7 % 128;
                            b2 = i7 % 2 != 0 ? (byte) 93 : (byte) 101;
                        }
                        break;
                    case 1777572999:
                        if (!str.equals(m1813((Process.myPid() >> 22) + 18, 604 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 37;
                        }
                        break;
                    case 1825714001:
                        if (!str.equals(m1813(View.MeasureSpec.makeMeasureSpec(0, 0) + 21, 1043 - Color.blue(0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 53;
                        }
                        break;
                    case 1876204439:
                        if (!str.equals(m1813(18 - View.MeasureSpec.getSize(0), 1079 - ExpandableListView.getPackedPositionChild(0L), (char) (Process.myTid() >> 22)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 55;
                        }
                        break;
                    case 1953253188:
                        if (!str.equals(m1813(9 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 114, (char) (13345 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 8;
                        }
                        break;
                    case 1988391289:
                        if (!str.equals(m1813(10 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1182, (char) (26184 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern())) {
                            b2 = -1;
                        } else {
                            f1598 = (f1599 + 93) % 128;
                            b2 = 62;
                        }
                        break;
                    case 1989757366:
                        if (!str.equals(m1813(8 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1428 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 77;
                        }
                        break;
                    case 1992394620:
                        if (!str.equals(m1813(AndroidCharacter.getMirror('0') - '&', 204 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (64537 - Color.argb(0, 0, 0, 0))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 14;
                        }
                        break;
                    case 1993407379:
                        if (!str.equals(m1813(12 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + cs.c.INSTANCE_LOAD_FAILED, (char) (24305 - (ViewConfiguration.getScrollBarSize() >> 8))).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 64;
                        }
                        break;
                    case 2034588468:
                        if (!str.equals(m1813(TextUtils.indexOf("", "", 0) + 13, 1319 - (Process.myPid() >> 22), (char) (TextUtils.getTrimmedLength("") + 32696)).intern())) {
                            b2 = -1;
                        } else {
                            b2 = 71;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                switch (b2) {
                    case 0:
                        return cw.m1732(list);
                    case 1:
                        return cw.m1731(list);
                    case 2:
                        return cw.m1733(cpVar);
                    case 3:
                        return cw.m1730(cpVar, list);
                    case 4:
                        return dd.m1812(list);
                    case 5:
                        return Boolean.valueOf(dd.m1810(list));
                    case 6:
                        return dd.m1811(list);
                    case 7:
                        return dd.m1809(list);
                    case 8:
                        return cs.m1715(list);
                    case 9:
                        return cs.m1714(list);
                    case 10:
                        return cs.m1713(list);
                    case 11:
                        return cs.m1716(list);
                    case 12:
                        return cs.m1712();
                    case 13:
                        return cx.m1735(list);
                    case 14:
                        return cx.m1734(list);
                    case 15:
                        return cx.m1736();
                    case 16:
                        return df.m1817(list);
                    case 17:
                        return df.m1814(list);
                    case 18:
                        return df.m1815(list);
                    case 19:
                        return df.m1816(list);
                    case 20:
                        return this.f1614.m1821(drVar, cpVar, list);
                    case 21:
                        return this.f1614.m1820(drVar, cpVar, list);
                    case 22:
                        return this.f1614.m1819(drVar, cpVar, list);
                    case 23:
                        return this.f1614.m1818(drVar, cpVar, list);
                    case 24:
                        return Integer.valueOf(dc.m1808(list));
                    case 25:
                        return dc.m1807(list);
                    case 26:
                        return dc.m1806(list);
                    case 27:
                        return dc.m1804(list);
                    case 28:
                        return Boolean.valueOf(dc.m1805(list));
                    case 29:
                        return dc.m1803(list);
                    case 30:
                        return this.f1607.m1763(cpVar, list, drVar);
                    case 31:
                        return cy.m1745(list);
                    case 32:
                        return cy.m1748(list);
                    case 33:
                        return this.f1607.m1767(list);
                    case 34:
                        return this.f1607.m1768(cpVar, list, drVar);
                    case 35:
                        return this.f1607.m1765(list);
                    case 36:
                        return this.f1607.m1762(cpVar, list, drVar);
                    case 37:
                        return cy.m1749(list);
                    case 38:
                        return cy.m1744(list);
                    case 39:
                        return this.f1607.m1766(cpVar, list, drVar);
                    case 40:
                        return this.f1607.m1769(cpVar, list, drVar);
                    case 41:
                        return this.f1607.m1760(cpVar, list, drVar);
                    case 42:
                        return this.f1607.m1753(cpVar, list, drVar);
                    case 43:
                        return this.f1607.m1755(cpVar, list, drVar);
                    case 44:
                        return this.f1607.m1758(cpVar, list, drVar);
                    case 45:
                        return this.f1607.m1756(list);
                    case 46:
                        return this.f1607.m1761(list);
                    case 47:
                        return this.f1607.m1754(list);
                    case 48:
                        return this.f1607.m1759(list);
                    case 49:
                        return cy.m1742(list);
                    case 50:
                        return this.f1607.m1757(cpVar, list, drVar);
                    case AD_REWARD_USER_VALUE:
                        return this.f1607.m1764(cpVar, list);
                    case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                        return Boolean.valueOf(cy.m1741(list));
                    case 53:
                        return cy.m1740(list);
                    case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                        return cy.m1743(list);
                    case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                        return cy.m1739(list);
                    case 56:
                        return cy.m1738(list);
                    case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                        return cy.m1737(list);
                    case 58:
                        return cv.m1728(cpVar, list);
                    case 59:
                        return cr.m1703(cpVar, list);
                    case 60:
                        return this.f1608.m1711(cpVar, list, drVar);
                    case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                        return cr.m1706(cpVar);
                    case 62:
                        return cr.m1702(cpVar);
                    case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                        return Long.valueOf(cr.m1701());
                    case 64:
                        return cr.m1700();
                    case 65:
                        return Long.valueOf(cr.m1705());
                    case 66:
                        return cr.m1695();
                    case 67:
                        return cr.m1707();
                    case 68:
                        return cr.m1688();
                    case mo.oom.onn /* 69 */:
                        return cr.m1692();
                    case b.B0 /* 70 */:
                        return cr.m1687();
                    case 71:
                        return cr.m1698(cpVar);
                    case 72:
                        return cr.m1708(cpVar);
                    case 73:
                        return cr.m1690();
                    case mo.oom.ooo /* 74 */:
                        return cr.m1694();
                    case mo.oom.oom /* 75 */:
                        return cr.m1697(cpVar);
                    case 76:
                        return cr.m1691(cpVar);
                    case mo.oom.ono /* 77 */:
                        return cr.m1696(list);
                    case 78:
                        return Boolean.valueOf(cr.m1685());
                    case mo.oom.on0 /* 79 */:
                        return cr.m1709(list);
                    case 80:
                        return cr.m1693(cpVar);
                    case mo.oom.m00 /* 81 */:
                        return cr.m1689(cpVar);
                    case 82:
                        return Boolean.valueOf(cr.m1686());
                    case 83:
                        return Double.valueOf(cr.m1684());
                    case 84:
                        return this.f1608.m1710(list);
                    case 85:
                        return cr.m1683();
                    case 86:
                        return cr.m1682();
                    case 87:
                        return cr.m1680();
                    case 88:
                        return cr.m1704(list);
                    case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                        return da.m1789(cpVar, list);
                    case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
                        return Character.valueOf(da.m1793(list));
                    case 91:
                        return da.m1791(list);
                    case mo.oom.m0n /* 92 */:
                        return Boolean.valueOf(da.m1790(list));
                    case mo.oom.mo0 /* 93 */:
                        return this.f1603.m1799(cpVar, list, drVar);
                    case 94:
                        return this.f1603.m1798(cpVar, list, drVar);
                    case 95:
                        return this.f1603.m1802(cpVar, list, drVar);
                    case 96:
                        return this.f1603.m1801(cpVar, list, drVar);
                    case 97:
                        return this.f1603.m1800(cpVar, list, drVar);
                    case 98:
                        return this.f1603.m1797(cpVar, list, drVar);
                    case 99:
                        return this.f1603.m1796(cpVar, list, drVar);
                    case 100:
                        return cu.m1724(list);
                    case 101:
                        return cu.m1727(list);
                    case 102:
                        return cu.m1725(list);
                    case 103:
                        return cu.m1723(list);
                    case 104:
                        return cu.m1722(list);
                    case 105:
                        return cu.m1721(list);
                    case 106:
                        return Long.valueOf(cu.m1726());
                    case 107:
                        return this.f1604.m1720(cpVar, list);
                    case 108:
                        return this.f1604.m1718(cpVar, list);
                    case 109:
                        return this.f1604.m1719(cpVar, list);
                    default:
                        String strM1616 = cpVar.m1616();
                        StringBuilder sb = new StringBuilder();
                        sb.append(m1813(23 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getOffsetAfter("", 0) + 2005, (char) ExpandableListView.getPackedPositionGroup(0L)).intern());
                        sb.append(str);
                        sb.append(m1813(21 - ImageFormat.getBitsPerPixel(0), 2029 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (KeyEvent.getMaxKeyCode() >> 16)).intern());
                        cq.m1676(strM1616, sb.toString(), null);
                        return null;
                }
            } catch (Exception e2) {
                e = e2;
                String strM1617 = cpVar.m1616();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m1813(ExpandableListView.getPackedPositionType(j) + 23, KeyEvent.keyCodeFromString("") + 2005, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
                sb2.append(str);
                cq.m1676(strM1617, sb2.toString(), e);
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            j = 0;
        }
    }
}
