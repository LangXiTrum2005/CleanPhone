package b2;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.ImageView;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustThirdPartySharing;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.p2;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.mediation.adapters.AppLovinAdapterAdViewListener;
import com.applovin.sdk.AppLovinAd;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventQueue;
import com.facebook.appevents.AppEventsLoggerImpl;
import com.facebook.appevents.SessionEventsState;
import com.facebook.appevents.codeless.CodelessLoggingEventListener;
import com.facebook.appevents.codeless.ViewIndexer;
import com.facebook.appevents.codeless.ViewIndexer$schedule$indexingTask$1;
import com.ironsource.EnumC0672y5;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.mbridge.msdk.config.component.wei.WeiCpt;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.ads.gmascar.managers.BiddingBaseManager;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import ea.f2;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import oa.e2;
import oa.n1;
import oa.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5350c;

    public /* synthetic */ o(int i10, Object obj, Object obj2) {
        this.f5348a = i10;
        this.f5349b = obj;
        this.f5350c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0332 A[Catch: e0 | IllegalArgumentException -> 0x01cd, e0 | IllegalArgumentException -> 0x01cd, TryCatch #1 {e0 | IllegalArgumentException -> 0x01cd, blocks: (B:79:0x01ad, B:82:0x01d0, B:84:0x01d5, B:85:0x01d8, B:87:0x01e0, B:88:0x01e8, B:90:0x01f4, B:91:0x01f6, B:92:0x0212, B:94:0x0235, B:96:0x023d, B:98:0x0248, B:97:0x0243, B:99:0x024d, B:101:0x0251, B:103:0x0255, B:106:0x0268, B:108:0x026e, B:111:0x0280, B:112:0x0283, B:113:0x028b, B:114:0x0292, B:115:0x0293, B:116:0x02b3, B:117:0x02b6, B:118:0x02bb, B:119:0x02bc, B:122:0x02ca, B:126:0x02d6, B:127:0x02e9, B:128:0x02f0, B:129:0x02f1, B:131:0x02f9, B:133:0x0300, B:135:0x0308, B:139:0x0318, B:139:0x0318, B:147:0x0329, B:147:0x0329, B:149:0x0332, B:149:0x0332, B:152:0x0343, B:152:0x0343, B:153:0x034b, B:153:0x034b, B:136:0x030d, B:138:0x0314, B:138:0x0314, B:132:0x02fc, B:154:0x035f, B:154:0x035f, B:155:0x0364, B:155:0x0364, B:158:0x0378, B:158:0x0378, B:160:0x037e, B:160:0x037e, B:163:0x038b, B:163:0x038b, B:164:0x0393, B:164:0x0393, B:165:0x03ae, B:165:0x03ae), top: B:220:0x019f }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0342  */
    /* JADX WARN: Code duplicated, block: B:152:0x0343 A[Catch: e0 | IllegalArgumentException -> 0x01cd, e0 | IllegalArgumentException -> 0x01cd, TryCatch #1 {e0 | IllegalArgumentException -> 0x01cd, blocks: (B:79:0x01ad, B:82:0x01d0, B:84:0x01d5, B:85:0x01d8, B:87:0x01e0, B:88:0x01e8, B:90:0x01f4, B:91:0x01f6, B:92:0x0212, B:94:0x0235, B:96:0x023d, B:98:0x0248, B:97:0x0243, B:99:0x024d, B:101:0x0251, B:103:0x0255, B:106:0x0268, B:108:0x026e, B:111:0x0280, B:112:0x0283, B:113:0x028b, B:114:0x0292, B:115:0x0293, B:116:0x02b3, B:117:0x02b6, B:118:0x02bb, B:119:0x02bc, B:122:0x02ca, B:126:0x02d6, B:127:0x02e9, B:128:0x02f0, B:129:0x02f1, B:131:0x02f9, B:133:0x0300, B:135:0x0308, B:139:0x0318, B:139:0x0318, B:147:0x0329, B:147:0x0329, B:149:0x0332, B:149:0x0332, B:152:0x0343, B:152:0x0343, B:153:0x034b, B:153:0x034b, B:136:0x030d, B:138:0x0314, B:138:0x0314, B:132:0x02fc, B:154:0x035f, B:154:0x035f, B:155:0x0364, B:155:0x0364, B:158:0x0378, B:158:0x0378, B:160:0x037e, B:160:0x037e, B:163:0x038b, B:163:0x038b, B:164:0x0393, B:164:0x0393, B:165:0x03ae, B:165:0x03ae), top: B:220:0x019f }] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        n1 n1VarA;
        int i10;
        boolean z10;
        n nVar;
        long j10;
        int i11 = this.f5348a;
        Object obj = this.f5350c;
        Object obj2 = this.f5349b;
        switch (i11) {
            case 0:
                eb.d0 d0Var = (eb.d0) obj2;
                oa.j0 j0Var = (oa.j0) obj;
                q qVar = (q) d0Var.f39977c;
                qVar.getClass();
                p pVar = qVar.f5376g;
                SparseArray sparseArray = qVar.f5375f;
                Pattern pattern = j0.f5304b;
                if (!pattern.matcher((CharSequence) j0Var.get(0)).matches()) {
                    Matcher matcher = j0.f5303a.matcher((CharSequence) j0Var.get(0));
                    go.k.i(matcher.matches());
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    j0.a(strGroup);
                    String strGroup2 = matcher.group(2);
                    strGroup2.getClass();
                    Uri.parse(strGroup2);
                    int iIndexOf = j0Var.indexOf("");
                    go.k.i(iIndexOf > 0);
                    List listSubList = j0Var.subList(1, iIndexOf);
                    n5.f fVar = new n5.f(2);
                    fVar.n(listSubList);
                    r rVar = new r(fVar);
                    new na.g(j0.f5310h).C(j0Var.subList(iIndexOf + 1, j0Var.size()));
                    String strB = rVar.b("CSeq");
                    strB.getClass();
                    int i12 = Integer.parseInt(strB);
                    q qVar2 = (q) pVar.f5365d;
                    p pVar2 = new p(InterfaceC0435l1.a.b.f29085e, new r(new n5.f(qVar2.f5372c, qVar2.f5380k, i12)), "");
                    r rVar2 = (r) pVar2.f5364c;
                    int i13 = pVar2.f5363b;
                    go.k.i(rVar2.b("CSeq") != null);
                    oa.e0 e0Var = new oa.e0(4);
                    if (i13 == 200) {
                        str = "OK";
                    } else if (i13 == 461) {
                        str = "Unsupported Transport";
                    } else if (i13 == 500) {
                        str = "Internal Server Error";
                    } else if (i13 == 505) {
                        str = "RTSP Version Not Supported";
                    } else if (i13 == 301) {
                        str = "Move Permanently";
                    } else if (i13 == 302) {
                        str = "Move Temporarily";
                    } else if (i13 == 400) {
                        str = "Bad Request";
                    } else if (i13 == 401) {
                        str = "Unauthorized";
                    } else if (i13 == 404) {
                        str = "Not Found";
                    } else if (i13 != 405) {
                        switch (i13) {
                            case 454:
                                str = "Session Not Found";
                                break;
                            case 455:
                                str = "Method Not Valid In This State";
                                break;
                            case 456:
                                str = "Header Field Not Valid";
                                break;
                            case 457:
                                str = "Invalid Range";
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    } else {
                        str = "Method Not Allowed";
                    }
                    String str2 = l1.y.f44830a;
                    Locale locale = Locale.US;
                    e0Var.b("RTSP/1.0 " + i13 + " " + str);
                    oa.l0 l0Var = rVar2.f5392a;
                    e2 it = l0Var.f47296d.keySet().iterator();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        oa.j0 j0VarK = l0Var.k(str3);
                        for (int i14 = 0; i14 < j0VarK.size(); i14++) {
                            e0Var.b(String.format(Locale.US, "%s: %s", str3, j0VarK.get(i14)));
                        }
                    }
                    e0Var.b("");
                    e0Var.b((String) pVar2.f5365d);
                    qVar2.f5378i.b(e0Var.g());
                    pVar.f5363b = Math.max(pVar.f5363b, i12 + 1);
                    return;
                }
                Matcher matcher2 = pattern.matcher((CharSequence) j0Var.get(0));
                go.k.i(matcher2.matches());
                String strGroup3 = matcher2.group(1);
                strGroup3.getClass();
                int i15 = Integer.parseInt(strGroup3);
                int iIndexOf2 = j0Var.indexOf("");
                go.k.i(iIndexOf2 > 0);
                List listSubList2 = j0Var.subList(1, iIndexOf2);
                n5.f fVar2 = new n5.f(2);
                fVar2.n(listSubList2);
                r rVar3 = new r(fVar2);
                String strC = new na.g(j0.f5310h).C(j0Var.subList(iIndexOf2 + 1, j0Var.size()));
                String strB2 = rVar3.b("CSeq");
                strB2.getClass();
                int i16 = Integer.parseInt(strB2);
                t tVar = qVar.f5370a;
                k0 k0Var = (k0) sparseArray.get(i16);
                if (k0Var == null) {
                    return;
                }
                sparseArray.remove(i16);
                int i17 = k0Var.f5314b;
                try {
                    if (i15 != 200) {
                        if (i15 == 401) {
                            if (qVar.f5379j == null || qVar.f5385q) {
                                q.a(qVar, new z(j0.g(i17) + " " + i15));
                                return;
                            }
                            oa.j0 j0VarK2 = rVar3.f5392a.k(r.a("WWW-Authenticate"));
                            if (j0VarK2.isEmpty()) {
                                throw i1.e0.b("Missing WWW-Authenticate header in a 401 response.", null);
                            }
                            for (int i18 = 0; i18 < j0VarK2.size(); i18++) {
                                h9.k kVarE = j0.e((String) j0VarK2.get(i18));
                                qVar.f5382n = kVarE;
                                if (kVarE.f42286a == 2) {
                                    pVar.n();
                                    qVar.f5385q = true;
                                    return;
                                }
                            }
                            pVar.n();
                            qVar.f5385q = true;
                            return;
                        }
                        if (i15 == 461) {
                            String str4 = j0.g(i17) + " " + i15;
                            String strB3 = k0Var.f5315c.b("Transport");
                            strB3.getClass();
                            q.a(qVar, (i17 != 10 || strB3.contains("TCP")) ? new z(str4) : new a0(str4));
                            return;
                        }
                        if (i15 != 301 && i15 != 302) {
                            q.a(qVar, new z(j0.g(i17) + " " + i15));
                            return;
                        }
                        if (qVar.f5383o != -1) {
                            qVar.f5383o = 0;
                        }
                        String strB4 = rVar3.b("Location");
                        if (strB4 == null) {
                            tVar.f("Redirection without new location.", null);
                            return;
                        }
                        Uri uri = Uri.parse(strB4);
                        qVar.f5377h = uri;
                        h0 h0VarD = j0.d(uri);
                        if (h0VarD != null) {
                            qVar.f5379j = h0VarD;
                        }
                        Uri uri2 = qVar.f5377h;
                        String str5 = qVar.f5380k;
                        pVar.getClass();
                        pVar.o(pVar.k(2, str5, s1.j(1, new Object[]{"Accept", "application/sdp"}, null), uri2));
                        return;
                    }
                    switch (i17) {
                        case 1:
                        case 3:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                            return;
                        case 2:
                            d0Var.W0(new f2(rVar3, false, p0.a(strC), 5));
                            return;
                        case 4:
                            oa.j0 j0VarX = oa.j0.x(j0.b(rVar3.b("Public")));
                            if (qVar.f5381m != null) {
                                return;
                            }
                            if (!j0VarX.isEmpty() && !j0VarX.contains(2)) {
                                tVar.f("DESCRIBE not supported.", null);
                                return;
                            }
                            Uri uri3 = qVar.f5377h;
                            String str6 = qVar.f5380k;
                            pVar.getClass();
                            pVar.o(pVar.k(2, str6, s1.j(1, new Object[]{"Accept", "application/sdp"}, null), uri3));
                            return;
                        case 5:
                            d0Var.X0();
                            return;
                        case 6:
                            String strB5 = rVar3.b(Command.HTTP_HEADER_RANGE);
                            l0 l0VarA = strB5 == null ? l0.f5321c : l0.a(strB5);
                            try {
                                String strB6 = rVar3.b("RTP-Info");
                                if (strB6 == null) {
                                    oa.f0 f0Var = oa.j0.f47265b;
                                    n1VarA = n1.f47281e;
                                } else {
                                    n1VarA = m0.a(qVar.f5377h, strB6);
                                }
                            } catch (i1.e0 unused) {
                                oa.f0 f0Var2 = oa.j0.f47265b;
                                n1VarA = n1.f47281e;
                            }
                            oa.j0 j0VarX2 = oa.j0.x(n1VarA);
                            int i19 = qVar.f5383o;
                            if (i19 != 1) {
                                i10 = 2;
                                if (i19 != 2) {
                                    z10 = false;
                                }
                                go.k.t(z10);
                                qVar.f5383o = i10;
                                if (qVar.f5381m == null) {
                                    j10 = qVar.l / 2;
                                    nVar = new n(qVar, j10);
                                    qVar.f5381m = nVar;
                                    if (nVar.f5335c) {
                                        nVar.f5335c = true;
                                        nVar.f5333a.postDelayed(nVar, j10);
                                    }
                                }
                                qVar.f5387s = C.TIME_UNSET;
                                qVar.f5371b.e(l1.y.M(l0VarA.f5323a), j0VarX2);
                                return;
                            }
                            i10 = 2;
                            z10 = true;
                            go.k.t(z10);
                            qVar.f5383o = i10;
                            if (qVar.f5381m == null) {
                                j10 = qVar.l / 2;
                                nVar = new n(qVar, j10);
                                qVar.f5381m = nVar;
                                if (nVar.f5335c) {
                                    nVar.f5335c = true;
                                    nVar.f5333a.postDelayed(nVar, j10);
                                }
                            }
                            qVar.f5387s = C.TIME_UNSET;
                            qVar.f5371b.e(l1.y.M(l0VarA.f5323a), j0VarX2);
                            return;
                        case 10:
                            String strB7 = rVar3.b("Session");
                            String strB8 = rVar3.b("Transport");
                            if (strB7 == null || strB8 == null) {
                                throw i1.e0.b("Missing mandatory session or transport header", null);
                            }
                            i0 i0VarC = j0.c(strB7);
                            go.k.t(qVar.f5383o != -1);
                            qVar.f5383o = 1;
                            qVar.f5380k = i0VarC.f5300a;
                            qVar.l = i0VarC.f5301b;
                            qVar.d();
                            return;
                        default:
                            throw new IllegalStateException();
                    }
                } catch (i1.e0 | IllegalArgumentException e10) {
                    q.a(qVar, new z(e10));
                    return;
                }
            case 1:
                fc.f fVar3 = (fc.f) obj2;
                ((bc.h) fVar3.f40781c).i((String) fVar3.f40780b, (List) obj);
                return;
            case 2:
                ((ActivityHandler) obj2).lambda$trackThirdPartySharing$37((AdjustThirdPartySharing) obj);
                return;
            case 3:
                ((ActivityHandler) obj2).lambda$new$2((AdjustConfig) obj);
                return;
            case 4:
                ((AppLovinFullscreenActivity) obj2).a((Long) obj);
                return;
            case 5:
                ((AppLovinFullscreenActivity) obj2).a((p2) obj);
                return;
            case 6:
                ((com.applovin.impl.adview.a) obj2).b((MotionEvent) obj);
                return;
            case 7:
                ((com.applovin.impl.adview.a) obj2).b((WebView) obj);
                return;
            case 8:
                ((com.applovin.impl.adview.a) obj2).a((AppLovinAd) obj);
                return;
            case 9:
                ((com.applovin.impl.sdk.nativeAd.b) obj2).b((AppLovinNativeAdImpl) obj);
                return;
            case 10:
                ((AppLovinAdapterAdViewListener) obj2).lambda$adReceived$0((AppLovinAd) obj);
                return;
            case 11:
                AppEventQueue.add$lambda$3((AccessTokenAppIdPair) obj2, (AppEvent) obj);
                return;
            case 12:
                AppEventQueue.handleResponse$lambda$5((AccessTokenAppIdPair) obj2, (SessionEventsState) obj);
                return;
            case 13:
                AppEventsLoggerImpl.Companion.initializeLib$lambda$4((Context) obj2, (AppEventsLoggerImpl) obj);
                return;
            case 14:
                CodelessLoggingEventListener.logEvent$lambda$0((String) obj2, (Bundle) obj);
                return;
            case 15:
                ViewIndexer.schedule$lambda$0((ViewIndexer) obj2, (ViewIndexer$schedule$indexingTask$1) obj);
                return;
            case 16:
                ViewIndexer.sendToServer$lambda$1((String) obj2, (ViewIndexer) obj);
                return;
            case 17:
                IronSourceThreadManager.a((Runnable) obj2, (CountDownLatch) obj);
                return;
            case 18:
                ((com.ironsource.sdk.controller.v) obj2).k((String) obj);
                return;
            case 19:
                ((com.mbridge.msdk.config.component.info.provider.subprovider.a) obj2).b((com.mbridge.msdk.config.component.info.provider.listener.a) obj);
                return;
            case 20:
                ((com.mbridge.msdk.config.component.info.provider.subprovider.e) obj2).b((com.mbridge.msdk.config.component.info.provider.listener.a) obj);
                return;
            case 21:
                ((com.mbridge.msdk.config.component.info.provider.subprovider.e) obj2).b((Context) obj);
                return;
            case 22:
                ((WeiCpt) obj2).a((com.mbridge.msdk.config.component.wei.model.a) obj);
                return;
            case 23:
                com.mbridge.msdk.config.dynamic.utils.image.b.a((Bitmap[]) obj2, (ImageView) obj);
                return;
            case 24:
                ((ImageView) obj2).setImageDrawable((com.mbridge.msdk.video.dynview.shape.a) obj);
                return;
            case 25:
                ((com.mbridge.msdk.setting.i) obj2).j((String) obj);
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                InlineStoreActivity.a((Map) obj2, (EnumC0672y5) obj);
                return;
            case 27:
                UnityAdsImplementation.lambda$load$1((IUnityAdsLoadListener) obj2, (String) obj);
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                ((BiddingBaseManager) obj2).lambda$uploadSignals$2((BiddingSignals) obj);
                return;
            default:
                ((BiddingBaseManager) obj2).lambda$onUnityAdsTokenReady$0((String) obj);
                return;
        }
    }
}
