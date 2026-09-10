package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.ironsource.B5;
import com.ironsource.InterfaceC0435l1;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJAdUnit;
import com.tapjoy.TJAdUnitActivity;
import com.tapjoy.TJAdUnitJSBridge;
import com.tapjoy.TJAwardCurrencyListener;
import com.tapjoy.TJContentActivity;
import com.tapjoy.TJCurrency;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementData;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementVideoListener;
import com.tapjoy.TJSplitWebView;
import com.tapjoy.TJVideoListener;
import com.tapjoy.TJWebView;
import com.tapjoy.Tapjoy;
import com.tapjoy.mraid.view.ActionHandler;
import com.tapjoy.mraid.view.Browser;
import com.tapjoy.mraid.view.MraidView;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ce extends be {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1229 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1230 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1231 = 30447;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1232 = {'<', 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'Z', 'q', 'i', 'l', 'q', 'n', 'Y', 'F', 'O', 'R', 171, 176, 143, 147, 172, 170, 175, 174, 182, 149, 131, 145, 136, 155, 176, 179, 174, 171, 179, 156, 148, 173, 176, 177, 177, 176, 184, 'y', 237, 235, 252, 260, 256, 258, 263, 263, 263, 271, 250, 240, 264, 264, '1', 'i', 'n', 'M', 'Q', 'j', 'h', 'm', 'l', 't', 'S', 'M', 'o', 'i', 'e', 'f', 'I', 'R', 'o', 'g', 'n', 'R', '8', 'Z', 'p', 's', 'u', 'l', 'k', 'P', 154, 157, 165, 172, 163, 141, 142, 156, '2', 'g', '_', '\\', 'c', '^', 'P', 'O', 'A', 'S', 't', 'l', 'm', 'h', 'j', 'Q', 'M', 'n', 'i', 'm', ':', 'n', 'k', 'a', '\\', 'R', 'E', 'O', B5.U, 'v', 't', 133, 141, 137, 139, 144, 144, 144, 152, 135, 129, 149, 154, 147, 144, 144, 146, '&', ']', 'j', 'd', 'f', '_', 'e', 'q', 'i', 'i', 'i', 'd', 'b', 'f', '^', 'M', 'O', 'c', 'k', 'i', 'i', 'l', 's', 'n', '6', '^', 'M', 'O', 'd', 'q', 'i', 'i', 'i', 'd', 'b', 147, 285, 290, 304, 302, 304, 301, 276, 263, 273, 294, 309, 302, 303, 309, '\\', 189, 187, 171, 181, 192, 186};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1233 = 56280;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1234 = 58784;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1235 = 62286;

    public ce(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m1476(TJPlacementData tJPlacementData) {
        f1230 = (f1229 + 5) % 128;
        String httpResponse = tJPlacementData.getHttpResponse();
        f1230 = (f1229 + 37) % 128;
        return httpResponse;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1477(TJPlacement tJPlacement) {
        int i10 = f1229 + 93;
        f1230 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1487(tJPlacement);
        }
        m1487(tJPlacement);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1480(TJPlacementData tJPlacementData) {
        f1229 = (f1230 + 51) % 128;
        String strM1476 = m1476(tJPlacementData);
        int i10 = f1230 + 57;
        f1229 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM1476;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ TJPlacementListener m1482(TJPlacement tJPlacement) {
        int i10 = f1229 + 85;
        f1230 = i10 % 128;
        int i11 = i10 % 2;
        TJPlacementListener tJPlacementListenerM1479 = m1479(tJPlacement);
        if (i11 != 0) {
            int i12 = 72 / 0;
        }
        int i13 = f1230 + 83;
        f1229 = i13 % 128;
        if (i13 % 2 != 0) {
            return tJPlacementListenerM1479;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1488(TJPlacementData tJPlacementData) {
        f1229 = (f1230 + 19) % 128;
        String strM1490 = m1490(tJPlacementData);
        f1230 = (f1229 + InterfaceC0435l1.d.b.f29114k) % 128;
        return strM1490;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ TJPlacementVideoListener m1489(TJPlacement tJPlacement) {
        f1230 = (f1229 + 11) % 128;
        TJPlacementVideoListener tJPlacementVideoListenerM1475 = m1475(tJPlacement);
        f1229 = (f1230 + 77) % 128;
        return tJPlacementVideoListenerM1475;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static TJPlacementVideoListener m1475(TJPlacement tJPlacement) {
        int i10 = f1230 + 11;
        f1229 = i10 % 128;
        if (i10 % 2 == 0) {
            tJPlacement.getVideoListener();
            throw null;
        }
        TJPlacementVideoListener videoListener = tJPlacement.getVideoListener();
        int i11 = f1229 + 43;
        f1230 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 62 / 0;
        }
        return videoListener;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static TJPlacementListener m1479(TJPlacement tJPlacement) {
        int i10 = f1230 + 49;
        f1229 = i10 % 128;
        if (i10 % 2 == 0) {
            tJPlacement.getListener();
            throw null;
        }
        TJPlacementListener listener = tJPlacement.getListener();
        int i11 = f1229 + 45;
        f1230 = i11 % 128;
        if (i11 % 2 == 0) {
            return listener;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1483(TJPlacementData tJPlacementData) {
        int i10 = f1230 + 79;
        f1229 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1478(tJPlacementData);
        }
        m1478(tJPlacementData);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1492(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        f1230 = (f1229 + 69) % 128;
        m1481(tJPlacement, tJPlacementVideoListener);
        f1230 = (f1229 + 97) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        String version;
        int i10 = f1230 + 11;
        f1229 = i10 % 128;
        if (i10 % 2 == 0) {
            version = Tapjoy.getVersion();
            int i11 = 31 / 0;
        } else {
            version = Tapjoy.getVersion();
        }
        int i12 = f1229 + 5;
        f1230 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 31 / 0;
        }
        return version;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        map.put(m1485("\uf383㔗澍卯똌渠ﯡ᧘ꦚŻ鈛핅\udff2患ꦚŻ", (ViewConfiguration.getWindowTouchSlop() >> 8) + 16).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return ce.m1488((TJPlacementData) list.get(0));
            }
        });
        map.put(m1485("\uf383㔗⹏ꗨ渴㢙", Process.getGidForName("") + 7).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return ce.m1483((TJPlacementData) list.get(0));
            }
        });
        map.put(m1485("\uf383㔗㡧㮳\u0cfd\u1979ᕅ濑鿦藴\ue408ᢾ᭺㛽煉訨", 15 - (Process.myTid() >> 22)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return ce.m1480((TJPlacementData) list.get(0));
            }
        });
        map.put(m1486("\u0001\u0000\u0000\u0001\u0000\u0001\u0000", new int[]{195, 7, 84, 0}, true).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return ce.m1477((TJPlacement) list.get(0));
            }
        });
        map.put(m1485("\uf383㔗琩鈱茴ᄔ⍔̈́鮩ꚬᜉ誡", TextUtils.indexOf((CharSequence) "", '0', 0) + 12).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return ce.m1482((TJPlacement) list.get(0));
            }
        });
        map.put(m1485("\uf383㔗雋迾뱈淄硜䭋꤬㴯覥\uab08㔊ደ硸뚽", 16 - Color.blue(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return ce.m1489((TJPlacement) list.get(0));
            }
        });
        map.put(m1485("ᖦ吓雋迾뱈淄硜䭋꤬㴯覥\uab08㔊ደ硸뚽", 16 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                ce.m1492((TJPlacement) list.get(0), (TJPlacementVideoListener) list.get(1));
                return null;
            }
        });
        map.put(m1485("\uf383㔗琩鈱ី囝⹏ꗨ渴㢙", Color.rgb(0, 0, 0) + 16777226).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return ce.m1484((TJSplitWebView) list.get(0));
            }
        });
        int i10 = f1230 + 65;
        f1229 = i10 % 128;
        if (i10 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1478(TJPlacementData tJPlacementData) {
        int i10 = f1230 + 51;
        f1229 = i10 % 128;
        if (i10 % 2 == 0) {
            tJPlacementData.getUrl();
            throw null;
        }
        String url = tJPlacementData.getUrl();
        f1229 = (f1230 + 75) % 128;
        return url;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1481(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        f1230 = (f1229 + 49) % 128;
        tJPlacement.setVideoListener(tJPlacementVideoListener);
        int i10 = f1230 + 9;
        f1229 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1484(TJSplitWebView tJSplitWebView) {
        int i10 = f1229 + 81;
        f1230 = i10 % 128;
        if (i10 % 2 != 0) {
            m1491(tJSplitWebView);
            throw null;
        }
        String strM1491 = m1491(tJSplitWebView);
        f1229 = (f1230 + 49) % 128;
        return strM1491;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1490(TJPlacementData tJPlacementData) {
        int i10 = f1230 + 33;
        f1229 = i10 % 128;
        int i11 = i10 % 2;
        String placementName = tJPlacementData.getPlacementName();
        if (i11 == 0) {
            int i12 = 48 / 0;
        }
        int i13 = f1230 + 97;
        f1229 = i13 % 128;
        if (i13 % 2 != 0) {
            return placementName;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1491(TJSplitWebView tJSplitWebView) {
        f1230 = (f1229 + 117) % 128;
        String lastUrl = tJSplitWebView.getLastUrl();
        f1229 = (f1230 + 107) % 128;
        return lastUrl;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        switch (str.hashCode()) {
            case -1983375197:
                if (!str.equals(m1486("\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000", new int[]{180, 15, 194, 10}, true).intern())) {
                    return null;
                }
                int i10 = f1229 + InterfaceC0435l1.d.b.f29109f;
                f1230 = i10 % 128;
                if (i10 % 2 != 0) {
                    return MraidView.class;
                }
                return TJActionRequest.class;
            case -1687314074:
                if (str.equals(m1486("\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001", new int[]{60, 29, 0, 0}, false).intern())) {
                    return Browser.class;
                }
                return null;
            case -1640254126:
                if (str.equals(m1486("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000", new int[]{0, 17, 0, 0}, true).intern())) {
                    return TJContentActivity.class;
                }
                return null;
            case -1628534628:
                if (str.equals(m1485("濙凌拡뛵ꢯ粇ᜨ齢㶭읏", Color.blue(0) + 9).intern())) {
                    return MraidView.class;
                }
                return null;
            case -1429063965:
                if (!str.equals(m1486("\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{WebSocketProtocol.PAYLOAD_SHORT, 19, 39, 0}, false).intern())) {
                    return null;
                }
                int i11 = f1230 + 99;
                f1229 = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 74 / 0;
                }
                return TJPlacementListener.class;
            case -1414965228:
                if (str.equals(m1485("狨\udfd4嗷靾곁⪷뤝빜㪱펉徿㡁ᜉ誡", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 13).intern())) {
                    return ActionHandler.class;
                }
                return null;
            case -1147119309:
                if (str.equals(m1486("\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000", new int[]{98, 20, 0, 19}, true).intern())) {
                    return TJWebView.class;
                }
                return null;
            case -872754855:
                if (str.equals(m1486("\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{45, 15, 158, 0}, false).intern())) {
                    return TJPlacementData.class;
                }
                return null;
            case -721136035:
                if (!str.equals(m1486("\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000", new int[]{118, 8, 0, 0}, true).intern())) {
                    return null;
                }
                f1229 = (f1230 + 1) % 128;
                return TJAdUnit.class;
            case -668579974:
                if (str.equals(m1485("ޜ澡䏜ڰ椹둕ꡏᕠ斛簎뀭⋰ඳ쀆뱈淄ᔛ\u0cffᜨ齢쓖阍濙凌拡뛵ꢯ粇ᜨ齢㶭읏", 31 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    return MraidView.class;
                }
                return null;
            case -593336436:
                if (str.equals(m1485("َ뺙殰த苮孬뢤쉗╘恕⮫傴꒤\ufb1c耋ꪑ茴ᄔ⍔̈́鮩ꚬᜉ誡", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22).intern())) {
                    return TJAwardCurrencyListener.class;
                }
                return null;
            case -217417742:
                if (str.equals(m1485("ޜ澡䏜ڰ椹둕ꡏᕠ斛簎뀭⋰ඳ쀆뱈淄ᔛ\u0cffᜨ齢쓖阍狨\udfd4嗷靾곁⪷뤝빜㪱펉徿㡁ᜉ誡", 34 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                    return ActionHandler.class;
                }
                return null;
            case 178410181:
                if (str.equals(m1485("ޜ澡䏜ڰ椹둕ꡏᕠ斛簎槡똣碸뙼徼즸鞮絕鶒遲\ue233槭ᜨ齢㶭읏", 25 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                    return TJSplitWebView.class;
                }
                return null;
            case 206635148:
                if (str.equals(m1485("َ뺙뾫㼴Ẉ粊鞮絕狨\udfd4嗷靾뵨漏䭗ꟷ", View.resolveSize(0, 0) + 16).intern())) {
                    return TJAdUnitActivity.class;
                }
                return null;
            case 268330895:
                if (str.equals(m1485("َ뺙뾫㼴Ẉ粊鞮絕碸뙼Ԙ\uf0cd뱈淄\uf383㔗", 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                    return TJAdUnitJSBridge.class;
                }
                return null;
            case 327820672:
                if (str.equals(m1486("\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000", new int[]{145, 24, 0, 17}, true).intern())) {
                    return TJPlacementVideoListener.class;
                }
                return null;
            case 705136807:
                if (str.equals(m1485("َ뺙䃱ኢ讫甛㔊ደ诙闃", 9 - MotionEvent.axisFromString("")).intern())) {
                    return TJCurrency.class;
                }
                return null;
            case 741045788:
                if (str.equals(m1485("ޜ澡䏜ڰ椹둕ꡏᕠ斛簎槡똣\ue55c㰄矡ꖈ菭夫墤깆㩐떞弈\uea62鞮絕咾ꔄ", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 26).intern())) {
                    return TJAdUnitActivity.class;
                }
                return null;
            case 832039888:
                if (str.equals(m1485("َ뺙뾫㼴Ẉ粊鞮絕鶒遲\ue233槭ᜨ齢풕彞茴ᄔ⍔̈́鮩ꚬᜉ誡", 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    return TJAdUnit.TJAdUnitWebViewListener.class;
                }
                return null;
            case 906946425:
                if (str.equals(m1485("َ뺙뭽嗔\uef12瓌\uec4aꗤ茴ᄔ⍔̈́鮩ꚬᜉ誡", 15 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                    return TJVideoListener.class;
                }
                return null;
            case 1317517621:
                if (str.equals(m1485("َ뺙娏\uf3b0㫹\ud96e㚂禋䉲⍅뭽嗔Ώ헍", MotionEvent.axisFromString("") + 15).intern())) {
                    return TJSplitWebView.class;
                }
                return null;
            case 1504750787:
                if (str.equals(m1486("\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000", new int[]{89, 9, 62, 5}, false).intern())) {
                    return TJWebView.class;
                }
                return null;
            case 1519750415:
                if (str.equals(m1486("\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000", new int[]{169, 11, 0, 4}, true).intern())) {
                    return TJPlacement.class;
                }
                return null;
            case 1815593736:
                if (!str.equals(m1485("Ԙ\uf0cd揓꜎ᖦ吓ᜉ誡", TextUtils.getOffsetBefore("", 0) + 7).intern())) {
                    return null;
                }
                int i13 = f1230 + 71;
                f1229 = i13 % 128;
                if (i13 % 2 == 0) {
                    return null;
                }
                return Browser.class;
            case 1891461874:
                if (!str.equals(m1485("َ뺙뾫㼴Ẉ粊鞮絕뭽嗔\uef12瓌\uec4aꗤ茴ᄔ⍔̈́鮩ꚬᜉ誡", 21 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    return null;
                }
                f1230 = (f1229 + 61) % 128;
                return TJAdUnit.TJAdUnitVideoListener.class;
            case 2041573826:
                if (!str.equals(m1486("\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{17, 28, 66, 0}, false).intern())) {
                    return null;
                }
                f1230 = (f1229 + 27) % 128;
                return TJContentActivity.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1487(TJPlacement tJPlacement) {
        int i10 = f1229 + InterfaceC0435l1.d.b.f29107d;
        f1230 = i10 % 128;
        if (i10 % 2 == 0) {
            return tJPlacement.getName();
        }
        tJPlacement.getName();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1485(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f3076) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3077 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3077;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c4 = cArr3[1];
                            char c5 = cArr3[0];
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f1234)) ^ ((c5 >>> 5) + f1233)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f1235) ^ ((c10 + i12) ^ ((c10 << 4) + f1231))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3077;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3077 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1486(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2261) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f1232, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    h.f2262 = 0;
                    char c4 = 0;
                    while (true) {
                        int i14 = h.f2262;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c4);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c4);
                        }
                        c4 = cArr2[i14];
                        h.f2262 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    h.f2262 = 0;
                    while (true) {
                        int i16 = h.f2262;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        h.f2262 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    h.f2262 = 0;
                    while (true) {
                        int i17 = h.f2262;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        h.f2262 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
