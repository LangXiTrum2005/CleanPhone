package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.crashlytics.internal.model.a;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ce extends bg {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1230 = 6;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1232 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1234 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1233 = {'T', 'J', 'A', 'd', 'U', 'n', 'i', 't', 'c', 'v', 'y', 'o', 'm', '.', 'a', 'p', 'j', 'C', 'e', 'P', 'l', 'D', 'B', 'r', 'w', 's', 'M', 'V', 'W', 'b', 'L', AbstractJsonLexerKt.UNICODE_ESC, 'S', 'g', 'X', 'Y'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f1231 = {-1832991700, -1271061845, -1256523278, -800769962, 2144407180, 1758547183, -17435220, -876523492, 833547339, -54632056, -545200866, -1000302033, 590793179, -1817785845, 927544906, -1422408457, -1403340660, 874454846};

    public ce(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m1440(TJPlacementData tJPlacementData) {
        f1232 = (f1234 + 65) % 128;
        String httpResponse = tJPlacementData.getHttpResponse();
        int i2 = f1234 + 37;
        f1232 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 75 / 0;
        }
        return httpResponse;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1443(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        int i2 = f1232 + 23;
        f1234 = i2 % 128;
        int i3 = i2 % 2;
        m1456(tJPlacement, tJPlacementVideoListener);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1444(TJPlacement tJPlacement) {
        f1234 = (f1232 + 81) % 128;
        String strM1446 = m1446(tJPlacement);
        f1232 = (f1234 + 47) % 128;
        return strM1446;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1447(TJPlacementData tJPlacementData) {
        f1232 = (f1234 + 105) % 128;
        String strM1454 = m1454(tJPlacementData);
        f1234 = (f1232 + 71) % 128;
        return strM1454;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ TJPlacementListener m1449(TJPlacement tJPlacement) {
        f1232 = (f1234 + 57) % 128;
        TJPlacementListener tJPlacementListenerM1441 = m1441(tJPlacement);
        int i2 = f1234 + 21;
        f1232 = i2 % 128;
        if (i2 % 2 == 0) {
            return tJPlacementListenerM1441;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ TJPlacementVideoListener m1453(TJPlacement tJPlacement) {
        int i2 = f1232 + 95;
        f1234 = i2 % 128;
        if (i2 % 2 == 0) {
            m1439(tJPlacement);
            throw null;
        }
        TJPlacementVideoListener tJPlacementVideoListenerM1439 = m1439(tJPlacement);
        int i3 = f1234 + 45;
        f1232 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 55 / 0;
        }
        return tJPlacementVideoListenerM1439;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static TJPlacementVideoListener m1439(TJPlacement tJPlacement) {
        f1232 = (f1234 + 109) % 128;
        TJPlacementVideoListener videoListener = tJPlacement.getVideoListener();
        int i2 = f1234 + 69;
        f1232 = i2 % 128;
        if (i2 % 2 == 0) {
            return videoListener;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1442(TJPlacementData tJPlacementData) {
        f1232 = (f1234 + 15) % 128;
        String placementName = tJPlacementData.getPlacementName();
        int i2 = f1232 + 119;
        f1234 = i2 % 128;
        if (i2 % 2 != 0) {
            return placementName;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1445(TJPlacementData tJPlacementData) {
        f1232 = (f1234 + 13) % 128;
        String strM1440 = m1440(tJPlacementData);
        int i2 = f1234 + 119;
        f1232 = i2 % 128;
        if (i2 % 2 == 0) {
            return strM1440;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1448(TJSplitWebView tJSplitWebView) {
        int i2 = f1234 + 109;
        f1232 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1455(tJSplitWebView);
        }
        m1455(tJSplitWebView);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1451(TJPlacementData tJPlacementData) {
        f1232 = (f1234 + 71) % 128;
        String strM1442 = m1442(tJPlacementData);
        f1234 = (f1232 + 81) % 128;
        return strM1442;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        int i2 = f1232 + 111;
        f1234 = i2 % 128;
        if (i2 % 2 == 0) {
            Tapjoy.getVersion();
            throw null;
        }
        String version = Tapjoy.getVersion();
        int i3 = f1234 + 67;
        f1232 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 58 / 0;
        }
        return version;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static TJPlacementListener m1441(TJPlacement tJPlacement) {
        int i2 = f1232 + 117;
        f1234 = i2 % 128;
        if (i2 % 2 == 0) {
            tJPlacement.getListener();
            throw null;
        }
        TJPlacementListener listener = tJPlacement.getListener();
        int i3 = f1234 + 27;
        f1232 = i3 % 128;
        if (i3 % 2 == 0) {
            return listener;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1450(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f1233;
                char c2 = f1230;
                char[] cArr3 = new char[i2];
                if (i2 % 2 != 0) {
                    i2--;
                    cArr3[i2] = (char) (cArr[i2] - b2);
                }
                if (i2 > 1) {
                    i.f2348 = 0;
                    while (true) {
                        int i3 = i.f2348;
                        if (i3 >= i2) {
                            break;
                        }
                        i.f2347 = cArr[i3];
                        i.f2345 = cArr[i.f2348 + 1];
                        if (i.f2347 == i.f2345) {
                            cArr3[i.f2348] = (char) (i.f2347 - b2);
                            cArr3[i.f2348 + 1] = (char) (i.f2345 - b2);
                        } else {
                            i.f2346 = i.f2347 / c2;
                            i.f2342 = i.f2347 % c2;
                            i.f2344 = i.f2345 / c2;
                            i.f2341 = i.f2345 % c2;
                            if (i.f2342 == i.f2341) {
                                i.f2346 = a.b(i.f2346, c2, 1, c2);
                                i.f2344 = a.b(i.f2344, c2, 1, c2);
                                int i4 = (i.f2346 * c2) + i.f2342;
                                int i5 = (i.f2344 * c2) + i.f2341;
                                int i6 = i.f2348;
                                cArr3[i6] = cArr2[i4];
                                cArr3[i6 + 1] = cArr2[i5];
                            } else if (i.f2346 == i.f2344) {
                                i.f2342 = a.b(i.f2342, c2, 1, c2);
                                i.f2341 = a.b(i.f2341, c2, 1, c2);
                                int i7 = (i.f2346 * c2) + i.f2342;
                                int i8 = (i.f2344 * c2) + i.f2341;
                                int i9 = i.f2348;
                                cArr3[i9] = cArr2[i7];
                                cArr3[i9 + 1] = cArr2[i8];
                            } else {
                                int i10 = (i.f2346 * c2) + i.f2341;
                                int i11 = (i.f2344 * c2) + i.f2342;
                                int i12 = i.f2348;
                                cArr3[i12] = cArr2[i10];
                                cArr3[i12 + 1] = cArr2[i11];
                            }
                        }
                        i.f2348 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1454(TJPlacementData tJPlacementData) {
        int i2 = f1234 + 39;
        f1232 = i2 % 128;
        if (i2 % 2 == 0) {
            return tJPlacementData.getUrl();
        }
        tJPlacementData.getUrl();
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m1452(new int[]{459920644, -1422124477, -65989670, -112633383, -1408402046, -649397006, -1038326330, -248712669}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return ce.m1451((TJPlacementData) list.get(0));
            }
        });
        map.put(m1450((byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 124), "\u001e\u0015\n\u0001\u0012\u0015", TextUtils.indexOf("", "") + 6).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return ce.m1447((TJPlacementData) list.get(0));
            }
        });
        map.put(m1452(new int[]{1313902396, -103693904, 270934848, 855532280, 808278591, 418902013, 444695141, 1214535014}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return ce.m1445((TJPlacementData) list.get(0));
            }
        });
        map.put(m1452(new int[]{843312343, 66431621, 389096977, 175060994}, Gravity.getAbsoluteGravity(0, 0) + 7).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return ce.m1444((TJPlacement) list.get(0));
            }
        });
        map.put(m1450((byte) (55 - ImageFormat.getBitsPerPixel(0)), "\u001e\u0015\u0006\u001f\u0007\u0018\u0006\u0013\u0000\u0017ª", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return ce.m1449((TJPlacement) list.get(0));
            }
        });
        map.put(m1452(new int[]{-1493386152, 1708884378, -450822548, -504246282, 403891856, 466653388, 525083607, 2032251586}, (ViewConfiguration.getScrollBarSize() >> 8) + 16).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return ce.m1453((TJPlacement) list.get(0));
            }
        });
        map.put(m1452(new int[]{-1416007910, 396799033, -450822548, -504246282, 403891856, 466653388, 525083607, 2032251586}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                ce.m1443((TJPlacement) list.get(0), (TJPlacementVideoListener) list.get(1));
                return null;
            }
        });
        map.put(m1450((byte) ((ViewConfiguration.getTouchSlop() >> 8) + 53), "\u001e\u0015\u0006\u001f\r\u001a\n\u0001\u0012\u0015", 10 - KeyEvent.getDeadChar(0, 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return ce.m1448((TJSplitWebView) list.get(0));
            }
        });
        f1234 = (f1232 + 49) % 128;
        return map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:97:0x03d7  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        byte b2;
        char c2 = '\f';
        switch (str.hashCode()) {
            case -1983375197:
                if (!str.equals(m1452(new int[]{1895640907, 1582639687, -932488073, -1580176607, 653126546, 369043319, -768176564, 1843854737}, 15 - TextUtils.getTrimmedLength("")).intern())) {
                    b2 = -1;
                } else {
                    b2 = 22;
                }
                break;
            case -1687314074:
                if (!str.equals(m1450((byte) (22 - View.resolveSize(0, 0)), "\t\u0006\r\u000e\b\r\u0010\u0011\u0006\u000b\u000e\r\u0014\u0011\t\u0000\u000f\u0007\f\u0018\u0019\f\u0017\u0012\u0006\u001d\u0018\u0013\u0088", 29 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 8;
                }
                break;
            case -1640254126:
                if (!str.equals(m1450((byte) (Gravity.getAbsoluteGravity(0, 0) + 90), "\u0001\u0002\u0017\u0011\u0001\u000b\u0017\u0000\b\u0001\t\b\u0007\n\u0007\bÓ", 17 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case -1628534628:
                if (!str.equals(m1450((byte) (86 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), "\u001d\u0014\f\b\t!\f\u0018Í", 9 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 9;
                }
                break;
            case -1429063965:
                if (!str.equals(m1450((byte) ((-16777201) - Color.rgb(0, 0, 0)), "\u0001\u0002\u0014\u0015\u0014\u000e\u0018\u0012\u0017\u0000\u0006\u001f\u0007\u0018\u0006\u0013\u0000\u0017\u0081", Process.getGidForName("") + 20).intern())) {
                    b2 = -1;
                } else {
                    b2 = 14;
                }
                break;
            case -1414965228:
                if (!str.equals(m1452(new int[]{-1145763308, 876688666, 2065241937, 1577075139, -153001796, -2102641413, -851377980, -1154928948}, ExpandableListView.getPackedPositionChild(0L) + 14).intern())) {
                    b2 = -1;
                } else {
                    f1234 = (f1232 + 117) % 128;
                    b2 = 5;
                }
                break;
            case -1147119309:
                if (!str.equals(m1452(new int[]{-834335329, -1089798845, -2019559079, -839492386, -371749877, -1859473911, -309647495, -1832154683, 51977901, -567790860}, 20 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    int i2 = f1232 + 25;
                    f1234 = i2 % 128;
                    b2 = i2 % 2 != 0 ? c2 : (byte) 59;
                }
                break;
            case -872754855:
                if (!str.equals(m1450((byte) (TextUtils.lastIndexOf("", '0', 0) + 13), "\u0001\u0002\u0014\u0015\u0014\u000e\u0018\u0012\u0017\u0000\t\u0013\r\bm", 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    f1232 = (f1234 + 1) % 128;
                    b2 = 4;
                }
                break;
            case -721136035:
                if (!str.equals(m1450((byte) (121 - TextUtils.getOffsetBefore("", 0)), "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b", View.getDefaultSize(0, 0) + 8).intern())) {
                    b2 = -1;
                } else {
                    b2 = 13;
                }
                break;
            case -668579974:
                if (!str.equals(m1452(new int[]{-834335329, -1089798845, -2019559079, -839492386, -921257082, 2140605159, 1492209953, -724820048, 1958793513, 1872976583, -493158211, 512040753, 556220718, 732874937, -1640319747, 1483958152}, 31 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    int i3 = f1234 + 35;
                    f1232 = i3 % 128;
                    b2 = i3 % 2 == 0 ? (byte) 10 : (byte) 112;
                }
                break;
            case -593336436:
                if (!str.equals(m1450((byte) (122 - View.MeasureSpec.makeMeasureSpec(0, 0)), "\u0001\u0002\u0000\u001a\u0011\u0014\u0005\u000f#\u0013\u0012\u0013\u0002\u000b\u0006\"\u0007\u0018\u0006\u0013\u0000\u0017ì", 23 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 23;
                }
                break;
            case -217417742:
                if (!str.equals(m1452(new int[]{-834335329, -1089798845, -2019559079, -839492386, -921257082, 2140605159, 1492209953, -724820048, 1958793513, 1872976583, -1476526266, 1522578057, -932488073, -1580176607, 85069739, 659308111, 1278469132, 1054418309}, ExpandableListView.getPackedPositionChild(0L) + 36).intern())) {
                    b2 = -1;
                } else {
                    f1234 = (f1232 + 79) % 128;
                    b2 = 6;
                }
                break;
            case 178410181:
                if (!str.equals(m1452(new int[]{-834335329, -1089798845, -2019559079, -839492386, -371749877, -1859473911, 441590976, 1108781690, 513846871, -1206218122, -1261786698, -265166030, -620364763, 522463323}, 24 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 25;
                }
                break;
            case 206635148:
                if (!str.equals(m1450((byte) (102 - (ViewConfiguration.getEdgeSlop() >> 16)), "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\b\u000e\b\u0007\n\u0007\b\u000b", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16).intern())) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case 268330895:
                if (!str.equals(m1452(new int[]{-1539503622, 693361464, -837785870, -501562700, 1508187754, 292546442, -459505395, 1911132708}, 16 - TextUtils.getOffsetBefore("", 0)).intern())) {
                    b2 = -1;
                } else {
                    int i4 = f1234 + 37;
                    f1232 = i4 % 128;
                    b2 = i4 % 2 == 0 ? (byte) 19 : (byte) 72;
                }
                break;
            case 327820672:
                if (!str.equals(m1452(new int[]{-1723430081, -235208914, -193177009, -496832962, 1938445209, 1065630825, -450822548, -504246282, 403891856, 466653388, 525083607, 2032251586}, 23 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                    b2 = -1;
                } else {
                    int i5 = f1234 + 125;
                    f1232 = i5 % 128;
                    b2 = i5 % 2 == 0 ? (byte) 18 : (byte) 65;
                }
                break;
            case 705136807:
                if (!str.equals(m1450((byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 113), "\u0001\u0002\r#ää\u0017\u0000\t\u000b", 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 20;
                }
                break;
            case 741045788:
                if (!str.equals(m1450((byte) (View.resolveSize(0, 0) + 58), "\t\u0006\r\u000e\b\r\u0010\u0011\u0006\u000b\f\u0001\u0002\u0003\u0004\u0005\u0000\u000b\b\u0001\t\b\u0007\n\u0007\b³", 26 - ImageFormat.getBitsPerPixel(0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 832039888:
                if (!str.equals(m1450((byte) (50 - (ViewConfiguration.getEdgeSlop() >> 16)), "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\u0018\u0016\u0018\u001c\f\u0018\u001e\u0000\u0007\u0018\u0006\u0013\u0000\u0017¤", ExpandableListView.getPackedPositionChild(0L) + 24).intern())) {
                    b2 = -1;
                } else {
                    b2 = 16;
                }
                break;
            case 906946425:
                if (!str.equals(m1452(new int[]{118132382, -596835296, -500272232, 316079474, 1717748346, 2103311115, 1798478896, 1935420994}, '?' - AndroidCharacter.getMirror('0')).intern())) {
                    b2 = -1;
                } else {
                    f1232 = (f1234 + 89) % 128;
                    b2 = 15;
                }
                break;
            case 1317517621:
                if (!str.equals(m1450((byte) (38 - (Process.myTid() >> 22)), "\u0001\u0002!\u000e\u0012\b\n\u0019\u0017\u0018\u0018\t\u0018\u001e", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14).intern())) {
                    b2 = -1;
                } else {
                    b2 = 24;
                }
                break;
            case 1504750787:
                if (!str.equals(m1450((byte) (98 - ExpandableListView.getPackedPositionChild(0L)), "\u0001\u0002\u0018\u0016\u0018\u001c\f\u0018Ú", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 9).intern())) {
                    b2 = -1;
                } else {
                    b2 = 11;
                }
                break;
            case 1519750415:
                if (!str.equals(m1452(new int[]{-1723430081, -235208914, -193177009, -496832962, 968247477, -1687914238}, 11 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    b2 = 21;
                }
                break;
            case 1815593736:
                c2 = 7;
                if (!str.equals(m1450((byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 70), "\u0017\u0012\u0006\u001d\u0018\u0013¸", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7).intern())) {
                    b2 = -1;
                } else {
                    f1232 = (f1234 + 3) % 128;
                }
                break;
            case 1891461874:
                if (!str.equals(m1450((byte) (29 - TextUtils.getTrimmedLength("")), "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\u0018\t\u0000\u0015\u0006#\u0007\u0018\u0006\u0013\u0000\u0017\u008f", 21 - View.resolveSize(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 17;
                }
                break;
            case 2041573826:
                if (!str.equals(m1450((byte) (30 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), "\t\u0006\r\u000e\b\r\u0010\u0011\u0006\u000b\f\u0001\u0005\r\u0011\u000b\u0006\u0013\u0001\u000b\b\u000e\b\u0007\n\u0007\b\u000b", 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
            case 1:
                return TJAdUnitActivity.class;
            case 2:
            case 3:
                return TJContentActivity.class;
            case 4:
                return TJPlacementData.class;
            case 5:
            case 6:
                return ActionHandler.class;
            case 7:
            case 8:
                return Browser.class;
            case 9:
            case 10:
                return MraidView.class;
            case 11:
            case 12:
                return TJWebView.class;
            case 13:
                return TJAdUnit.class;
            case 14:
                return TJPlacementListener.class;
            case 15:
                return TJVideoListener.class;
            case 16:
                return TJAdUnit.TJAdUnitWebViewListener.class;
            case 17:
                f1232 = (f1234 + 69) % 128;
                return TJAdUnit.TJAdUnitVideoListener.class;
            case 18:
                return TJPlacementVideoListener.class;
            case 19:
                return TJAdUnitJSBridge.class;
            case 20:
                return TJCurrency.class;
            case 21:
                return TJPlacement.class;
            case 22:
                return TJActionRequest.class;
            case 23:
                return TJAwardCurrencyListener.class;
            case 24:
            case 25:
                return TJSplitWebView.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1456(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        int i2 = f1234 + 5;
        f1232 = i2 % 128;
        int i3 = i2 % 2;
        tJPlacement.setVideoListener(tJPlacementVideoListener);
        if (i3 != 0) {
            throw null;
        }
        f1232 = (f1234 + 31) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1455(TJSplitWebView tJSplitWebView) {
        int i2 = f1232 + 27;
        f1234 = i2 % 128;
        if (i2 % 2 != 0) {
            return tJSplitWebView.getLastUrl();
        }
        tJSplitWebView.getLastUrl();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1446(TJPlacement tJPlacement) {
        int i2 = f1232 + 69;
        f1234 = i2 % 128;
        if (i2 % 2 != 0) {
            return tJPlacement.getName();
        }
        tJPlacement.getName();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1452(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1231.clone();
                d.f1584 = 0;
                while (true) {
                    int i3 = d.f1584;
                    if (i3 < iArr.length) {
                        int i4 = iArr[i3];
                        char c2 = (char) (i4 >> 16);
                        cArr[0] = c2;
                        char c3 = (char) i4;
                        cArr[1] = c3;
                        char c4 = (char) (iArr[i3 + 1] >> 16);
                        cArr[2] = c4;
                        char c5 = (char) iArr[i3 + 1];
                        cArr[3] = c5;
                        d.f1587 = (c2 << 16) + c3;
                        d.f1585 = (c4 << 16) + c5;
                        d.m1788(iArr2);
                        for (int i5 = 0; i5 < 16; i5++) {
                            int i6 = d.f1587 ^ iArr2[i5];
                            d.f1587 = i6;
                            int iM1787 = d.m1787(i6) ^ d.f1585;
                            int i7 = d.f1587;
                            d.f1587 = iM1787;
                            d.f1585 = i7;
                        }
                        int i8 = d.f1587;
                        int i9 = d.f1585;
                        d.f1587 = i9;
                        d.f1585 = i8;
                        int i10 = i8 ^ iArr2[16];
                        d.f1585 = i10;
                        int i11 = i9 ^ iArr2[17];
                        d.f1587 = i11;
                        cArr[0] = (char) (i11 >>> 16);
                        cArr[1] = (char) i11;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        d.m1788(iArr2);
                        int i12 = d.f1584;
                        cArr2[i12 << 1] = cArr[0];
                        cArr2[(i12 << 1) + 1] = cArr[1];
                        cArr2[(i12 << 1) + 2] = cArr[2];
                        cArr2[(i12 << 1) + 3] = cArr[3];
                        d.f1584 = i12 + 2;
                    } else {
                        str = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
