package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
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
import com.google.firebase.crashlytics.internal.model.a;
import com.vungle.warren.AdActivity;
import com.vungle.warren.AdvertisementPresentationFactory;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.VungleBanner;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.Report;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.ui.VungleActivity;
import com.vungle.warren.ui.VungleWebViewActivity;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.LocalAdContract;
import com.vungle.warren.ui.contract.WebAdContract;
import com.vungle.warren.ui.presenter.LocalAdPresenter;
import com.vungle.warren.ui.presenter.MRAIDAdPresenter;
import com.vungle.warren.ui.view.LocalAdView;
import com.vungle.warren.ui.view.MRAIDAdView;
import com.vungle.warren.ui.view.VungleBannerView;
import com.vungle.warren.ui.view.VungleNativeView;
import com.vungle.warren.ui.view.VungleWebClient;
import com.vungle.warren.ui.view.WebViewAPI;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class cd extends bg {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1219 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1220 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1221 = 1302285000612553467L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1222 = {';', 'V', AbstractJsonLexerKt.UNICODE_ESC, 'n', 'g', 'l', 'e', 'A', 'c', 't', 'i', 'v', 'y', 'o', 'm', '.', 'w', 'a', 'r', 'W', 'b', 'P', 'd', 'C', 'k', 'R', 'p', 's', 'L', 'M', 'I', 'D', 'F', 'B', 'N', '<'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1223 = 6;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1224;

    public cd(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m1425() {
        f1220 = (f1219 + 17) % 128;
        Class clsM1426 = m1426();
        hr.m2242().m2244();
        try {
            Iterator<Field> it = hr.m2242().m2244().m2218(clsM1426, ho.m2212().m2238(String.class).m2237(8).m2240(16).m2239()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next().get(null);
                if (!str.startsWith(m1429("\uec25솰\uec73茄沯挾욜萹枥\uef32劧\u181fﮜ笙\udea5氈", 1 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                    int i2 = f1219 + 103;
                    f1220 = i2 % 128;
                    if (i2 % 2 != 0) {
                        if (!str.startsWith(m1429("䄂雲䅔灅\u187a㑼㗝\uf0ec쪂롰ꇣ法嚵ⱈⷯ", 1 << KeyEvent.getDeadChar(0, 1)).intern())) {
                            f1219 = (f1220 + 103) % 128;
                        }
                    } else if (!str.startsWith(m1429("䄂雲䅔灅\u187a㑼㗝\uf0ec쪂롰ꇣ法嚵ⱈⷯ", KeyEvent.getDeadChar(0, 0) + 1).intern())) {
                        f1219 = (f1220 + 103) % 128;
                    }
                }
                String str2 = str.split(m1434((byte) (97 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "\u009d", Color.argb(0, 0, 0, 0) + 1).intern())[0];
                f1220 = (f1219 + 9) % 128;
                return str2;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static Map<String, String> m1427(Advertisement advertisement) {
        int i2 = f1219 + 61;
        f1220 = i2 % 128;
        if (i2 % 2 == 0) {
            return advertisement.getDownloadableUrls();
        }
        advertisement.getDownloadableUrls();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1428(Advertisement advertisement) {
        f1219 = (f1220 + 63) % 128;
        String campaign = advertisement.getCampaign();
        f1219 = (f1220 + 53) % 128;
        return campaign;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Placement m1432(Repository repository, String str) {
        int i2 = f1220 + 109;
        f1219 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1430(repository, str);
        }
        m1430(repository, str);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Map m1435(Advertisement advertisement) {
        f1220 = (f1219 + 1) % 128;
        Map<String, String> mapM1427 = m1427(advertisement);
        int i2 = f1219 + 37;
        f1220 = i2 % 128;
        if (i2 % 2 == 0) {
            return mapM1427;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1437(Advertisement advertisement) {
        int i2 = f1220 + 65;
        f1219 = i2 % 128;
        if (i2 % 2 == 0) {
            m1428(advertisement);
            throw null;
        }
        String strM1428 = m1428(advertisement);
        int i3 = f1220 + 17;
        f1219 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 96 / 0;
        }
        return strM1428;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m1434((byte) (TextUtils.getCapsMode("", 0, 0) + 28), "\u0000\n\u000f\u001b\u000b\u0017\t\u0007\f\b\t\u000f", (ViewConfiguration.getWindowTouchSlop() >> 8) + 12).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cd.m1432((Repository) list.get(0), (String) list.get(1));
            }
        });
        map.put(m1429("\ue3fcᾍ\ue395\uda07Ⱥ봅龸\ueaa5桳ㄏ\u0b8b皓\uf44dꔨ螠ʉ䁝奖", Drawable.resolveOpacity(0, 0) + 1).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return Boolean.valueOf(cd.m1436((Placement) list.get(0)));
            }
        });
        map.put(m1429("렸鐤롟䪱鳞㚺༳瑮㎰몎鬲\ue871꾋⺒ᜋ鱞ᮘ", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cd.m1433((Advertisement) list.get(0));
            }
        });
        map.put(m1429("采\uf7f8醠诖ꘃ啦칔亱ᩊ\ud972婄튿虶䵌홶", TextUtils.indexOf("", "", 0) + 1).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cd.m1437((Advertisement) list.get(0));
            }
        });
        map.put(m1429("軑殠躶斱臋줾″楾Ւ䔰됽\uf57a饦턒㠛腣\u2d77\u2d73豮ഫꄓ륧ၤ", (ViewConfiguration.getTapTimeout() >> 16) + 1).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cd.m1435((Advertisement) list.get(0));
            }
        });
        f1219 = (f1220 + 81) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static Class m1426() {
        Class<VungleApiClient> cls;
        int i2 = f1220 + 83;
        int i3 = i2 % 128;
        f1219 = i3;
        if (i2 % 2 == 0) {
            cls = VungleApiClient.class;
            int i4 = 68 / 0;
        } else {
            cls = VungleApiClient.class;
        }
        f1220 = (i3 + 75) % 128;
        return cls;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1429(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f1955) {
            try {
                char[] cArrM2116 = f.m2116(f1221, cArr, i2);
                f.f1954 = 4;
                while (true) {
                    int i3 = f.f1954;
                    if (i3 < cArrM2116.length) {
                        int i4 = i3 - 4;
                        f.f1953 = i4;
                        cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f1221));
                        f.f1954 = i3 + 1;
                    } else {
                        str2 = new String(cArrM2116, 4, cArrM2116.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1433(Advertisement advertisement) {
        int i2 = f1220 + 95;
        f1219 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1431(advertisement);
        }
        m1431(advertisement);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1436(Placement placement) {
        int i2 = f1220 + 61;
        f1219 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM1438 = m1438(placement);
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        f1220 = (f1219 + 65) % 128;
        return zM1438;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        f1220 = (f1219 + 53) % 128;
        String strMo793 = mo793();
        if (strMo793 == null) {
            return null;
        }
        int i2 = f1219 + 55;
        f1220 = i2 % 128;
        String str = i2 % 2 != 0 ? strMo793.split(m1429("鵥૪鵊\uf505縉", 0 % (ViewConfiguration.getLongPressTimeout() * 70)).intern())[1] : strMo793.split(m1429("鵥૪鵊\uf505縉", (ViewConfiguration.getLongPressTimeout() >> 16) + 1).intern())[1];
        int i3 = f1220 + 5;
        f1219 = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:119:0x0473  */
    /* JADX WARN: Code duplicated, block: B:39:0x0187  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a2  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        byte b2;
        f1219 = (f1220 + 97) % 128;
        switch (str.hashCode()) {
            case -2075872274:
                if (!str.equals(m1434((byte) (26 - View.getDefaultSize(0, 0)), "\u0018\u001a\u0006\u001f\u0001\r\u0017\u0016\u0018\f\u0018\t\t\u000f\f\u0018", (KeyEvent.getMaxKeyCode() >> 16) + 16).intern())) {
                    b2 = -1;
                } else {
                    int i2 = f1220 + 25;
                    f1219 = i2 % 128;
                    b2 = i2 % 2 != 0 ? (byte) 17 : (byte) 9;
                }
                break;
            case -2012803321:
                if (!str.equals(m1434((byte) (TextUtils.indexOf("", "") + 58), "\u0007\u000e\u000f\u0010\b\u0005\u0004\u0005\u0000\u000b\u0010\u0011\f\u0017\u0018\f\t\u0015\u0004\b\u0011\t\u000b\u0007\u0011\u0010\u0002\u0003\u0004\u0005\u0000\u000b#\u0010\n\u000b\u0006\u0007\u0004\u0007\n\f", (-16777174) - Color.rgb(0, 0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 32;
                }
                break;
            case -1853707364:
                if (!str.equals(m1434((byte) (48 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), "\u0007\u000e\u000f\u0010\b\u0005\u0004\u0005\u0000\u000b\u0010\u0011\f\u0017\u0018\f\t\u0015\u0004\b\u0011\t\u000b\u0007\u0011\u0010\u0002\u0003\u0004\u0005\u0000\u000b#\u000f\u009e\u009e\f\u0018\u0004\u0007\n\f", View.MeasureSpec.getSize(0) + 42).intern())) {
                    b2 = -1;
                } else {
                    b2 = 30;
                }
                break;
            case -1850654380:
                if (!str.equals(m1429("ڳꍧۡ璠폞ǹㄦ㭀购跴", TextUtils.getTrimmedLength("") + 1).intern())) {
                    b2 = -1;
                } else {
                    b2 = 8;
                }
                break;
            case -1836618638:
                if (!str.equals(m1429("䲎㷻䳏竨搟齤㽟貍윖፵ꭼႫ嬢蝑", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    b2 = 26;
                }
                break;
            case -1740904301:
                if (!str.equals(m1429("料ᦩ旕┎⻦묽悛왶\uee19㜏\uf488婭爨ꌟ碷", (-16777215) - Color.rgb(0, 0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 13;
                }
                break;
            case -1721428911:
                if (!str.equals(m1434((byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4), "\u0002\u0003\u0004\u0005\u0000\u000b", 6 - ExpandableListView.getPackedPositionType(0L)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case -1057659822:
                if (!str.equals(m1429("\udf55䆣\udf14ᶮꋬ\ue33c堮䩸哋漰찥홂죨יִ䀅ꉋ糥\u074c\uf466⸼\uf096鍭桦먹撬\u1f46ᱣؤ颫ꭅ邾鋡౭㞥ҷỽ聐䎖뢝\ueacf", (ViewConfiguration.getScrollBarSize() >> 8) + 1).intern())) {
                    b2 = -1;
                } else {
                    b2 = 25;
                }
                break;
            case -965507231:
                if (!str.equals(m1434((byte) (84 - TextUtils.getTrimmedLength("")), "\u0012\u0007\u0013\u0002\u000b\u0007\r\n\u0012!", (ViewConfiguration.getWindowTouchSlop() >> 8) + 10).intern())) {
                    b2 = -1;
                } else {
                    b2 = 22;
                }
                break;
            case -899612152:
                if (!str.equals(m1434((byte) (124 - Process.getGidForName("")), "\u0007\u000e\u000f\u0010\b\u0005\u0004\u0005\u0000\u000b\u0010\u0011\f\u0017\u0018\f\t\u0015\u0004\b\r\u0003\u0003\u0004\u0005\u0000\u0007\u0012\b\u0012\u0004\u0007\n\f\b\t\n\u000b\u0006\u000b\u0006\u000f", 42 - View.MeasureSpec.getMode(0)).intern())) {
                    b2 = -1;
                } else {
                    f1220 = (f1219 + 23) % 128;
                    b2 = 4;
                }
                break;
            case -828205665:
                if (!str.equals(m1429("﯀獖ﮍ馢ᦛ퇿\udc15\uf123灨巰䠤洐\uec71짠쐛", View.MeasureSpec.getSize(0) + 1).intern())) {
                    b2 = -1;
                } else {
                    int i3 = f1219 + 19;
                    f1220 = i3 % 128;
                    if (i3 % 2 == 0) {
                        b2 = 23;
                    } else {
                        b2 = 14;
                    }
                }
                break;
            case -747599243:
                if (!str.equals(m1429("\ue3a3쯀\ue3e2Ӡ喿楟䅕봡校\ue553핰℃\uf418照", 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    f1220 = (f1219 + 31) % 128;
                }
                break;
            case -498060603:
                if (!str.equals(m1434((byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 1), "\u0017\u0003\u000e\u000b\b\f\t\u0000u", View.combineMeasuredStates(0, 0) + 9).intern())) {
                    b2 = -1;
                } else {
                    f1220 = (f1219 + 107) % 128;
                    b2 = 6;
                }
                break;
            case -350701718:
                if (!str.equals(m1434((byte) (7 - MotionEvent.axisFromString("")), "\u0018\u0007\u0019\u000e\u001c\t\u0007\u000f\u0018\u0012", (ViewConfiguration.getTouchSlop() >> 8) + 10).intern())) {
                    b2 = -1;
                } else {
                    b2 = 10;
                }
                break;
            case -92732536:
                if (!str.equals(m1434((byte) (TextUtils.getOffsetBefore("", 0) + 30), "\u0007\u000e\u000f\u0010\b\u0005\u0004\u0005\u0000\u000b\u0010\u0011\f\u0017\u0018\f\t\u0015\u0002\u0003\u0004\u0005\u0000\u000b#\u000f\u008c\u008c\f\u0018", 30 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 28;
                }
                break;
            case 156342925:
                if (!str.equals(m1434((byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 88), "\u0002\u0003\u0004\u0005\u0000\u000b#\u0010\n\u000b\u0006\u0007\u0004\u0007\n\f", 16 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 31;
                }
                break;
            case 315438882:
                if (!str.equals(m1429("ⴎ쎁ⵘꕎ\ue31f意\ue0d6உꚎ\ued03瓮鞣㪸礼\uf8e5\ue3a4躜蕗䲑濝", 1 - TextUtils.getOffsetAfter("", 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 29;
                }
                break;
            case 332396988:
                if (!str.equals(m1434((byte) (29 - (ViewConfiguration.getJumpTapTimeout() >> 16)), "\u0012\u0007\u0013\b\u0013\u0004\u000b\u0007\u0094", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9).intern())) {
                    b2 = -1;
                } else {
                    b2 = 20;
                }
                break;
            case 505165239:
                if (!str.equals(m1434((byte) (KeyEvent.normalizeMetaState(0) + 63), "\u0002\u0003\u0004\u0005\u0000\u000b\u0012\u0007\u0013\u0002\u000b\u0007\r\n\t\n\u000b\u0006\u000b\n¸", ExpandableListView.getPackedPositionGroup(0L) + 21).intern())) {
                    b2 = -1;
                } else {
                    f1220 = (f1219 + 15) % 128;
                    b2 = 3;
                }
                break;
            case 670892517:
                if (!str.equals(m1429("ꪄ佑\uaac5\ue1c6\udc93\uedceꑆ㐇ℚ懂き\ua83d봹\uf5ef뱭\udc34ऴ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1).intern())) {
                    b2 = -1;
                } else {
                    int i4 = f1219 + 103;
                    f1220 = i4 % 128;
                    if (i4 % 2 == 0) {
                        b2 = 5;
                    } else {
                        b2 = 2;
                    }
                }
                break;
            case 746354589:
                if (!str.equals(m1434((byte) (105 - Color.alpha(0)), "\u0019\u0010\u000b\u000e\u0003\u0017\u0018\f\u0018\t\t\u000f\f\u0018", View.resolveSize(0, 0) + 14).intern())) {
                    b2 = -1;
                } else {
                    int i5 = f1220 + 69;
                    f1219 = i5 % 128;
                    b2 = i5 % 2 != 0 ? (byte) 15 : (byte) 11;
                }
                break;
            case 798818448:
                if (!str.equals(m1429("ힲ䏭\ud7fe\u0b79鯒\ue179们獂尲浜\udaf2\uef6a쀝", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern())) {
                    b2 = -1;
                } else {
                    b2 = 14;
                }
                break;
            case 1033471823:
                if (!str.equals(m1434((byte) (View.resolveSizeAndState(0, 0, 0) + 34), "\u0007\u000e\u000f\u0010\b\u0005\u0004\u0005\u0000\u000b\u0010\u0011\f\u0017\u0018\f\t\u0015\u0004\b\r\u0003\u0003\u0004\u0005\u0000\u0007\b\t\n\u000b\u0006\u000b\n\u009b", 35 - Drawable.resolveOpacity(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 1110462460:
                if (!str.equals(m1429("넆點녋쁇\uf0bb㱷藰᠃㪮끽ᇀ萊ꚻ⑪鷨\uf006ኧ", 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    b2 = 24;
                }
                break;
            case 1205766784:
                if (!str.equals(m1434((byte) (4 - ExpandableListView.getPackedPositionType(0L)), "\u0002\u0003\u0004\u0005\u0000\u000b\b\t\n\u000b\u0006\u000b\u0006\u000f", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13).intern())) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 1208038126:
                if (!str.equals(m1429("む綢ブ㭘鍄\udf2c绀篒묀匠\ueaed\ue7fc✺윲曺鏤錡㭳튖", -TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case 1230133745:
                if (!str.equals(m1429("姵䘮妢鏼懈\ue4b0홨襸퉽梙䉬ᕰ乞ﲘ친慵穀ã", 1 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 21;
                }
                break;
            case 1461477995:
                if (!str.equals(m1434((byte) (70 - Gravity.getAbsoluteGravity(0, 0)), "\n\u0013\u0006\u0007\u0015\u0006\t\u001c\b\f\t\u0000\u000f\u001b\u0018\f\u0018\t\t\u000f\u000f\u000b\u0007\u0010\u0002!\u000e\u000b\u0007\u000f\u0018\u0012", 32 - KeyEvent.normalizeMetaState(0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 19;
                }
                break;
            case 1611471226:
                if (!str.equals(m1434((byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 40), "\u0019\u0010\u000b\u000e\u0001\u000b\u0017\u0016\u0018\f\u0018\t\t\u000f\f\u0018", TextUtils.indexOf("", "", 0, 0) + 16).intern())) {
                    b2 = -1;
                } else {
                    b2 = 16;
                }
                break;
            case 1731532800:
                if (!str.equals(m1434((byte) (100 - View.MeasureSpec.getMode(0)), "\u0019\u0010\u000b\u000e\u0001\u000b\u0017\u0012\u000f\u0001\u0006\u0015\u000e\u000bØ", 15 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 12;
                }
                break;
            case 1766407901:
                if (!str.equals(m1429("줾镟쥨ﮆ᥊㟑븞\uf1dc䊾믝⨦淶\ude88\u2fe2\ua62d᧱", -TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                    b2 = -1;
                } else {
                    b2 = 27;
                }
                break;
            case 1777696764:
                if (!str.equals(m1434((byte) (KeyEvent.getDeadChar(0, 0) + 56), "\u0017\u0003\f\r\n\u0013\u001d\u0017¤¤\u0017\u000e\u0006\u001a", 14 - TextUtils.getTrimmedLength("")).intern())) {
                    b2 = -1;
                } else {
                    f1220 = (f1219 + 7) % 128;
                }
                break;
            case 1861686093:
                if (!str.equals(m1429("왕箼옔릘곧\ud923ﰭ䑹䷗唯栈\ud85b퇮섛\ue409걯旵㵵假†\ue991\ua97e챍됣綤╎롤ࠞ膍配㒃鳭ᕄලꂆყ饇", View.resolveSizeAndState(0, 0, 0) + 1).intern())) {
                    b2 = -1;
                } else {
                    b2 = 18;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return Vungle.class;
            case 1:
            case 2:
                return VungleActivity.class;
            case 3:
            case 4:
                return VungleWebViewActivity.class;
            case 5:
                return Advertisement.class;
            case 6:
                return Placement.class;
            case 7:
                return VungleWebClient.class;
            case 8:
                return Report.class;
            case 9:
                return PlayAdCallback.class;
            case 10:
                return Repository.class;
            case 11:
                return AdContract.class;
            case 12:
                return LocalAdContract.class;
            case 13:
                return LocalAdView.class;
            case 14:
                return LocalAdContract.LocalView.class;
            case 15:
                return LocalAdContract.LocalPresenter.class;
            case 16:
                return LocalAdPresenter.class;
            case 17:
                return MRAIDAdPresenter.class;
            case 18:
                return AdContract.AdvertisementPresenter.class;
            case 19:
                return AdvertisementPresentationFactory.class;
            case 20:
                return WebAdContract.WebAdView.class;
            case 21:
                return WebAdContract.WebAdPresenter.class;
            case 22:
                return WebViewAPI.class;
            case 23:
                return MRAIDAdView.class;
            case 24:
                return WebViewAPI.MRAIDDelegate.class;
            case 25:
                return AdContract.AdvertisementPresenter.EventListener.class;
            case 26:
                return AdActivity.class;
            case 27:
            case 28:
                return VungleBanner.class;
            case 29:
            case 30:
                return VungleBannerView.class;
            case 31:
            case 32:
                return VungleNativeView.class;
            default:
                return null;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    public final String mo793() {
        int i2 = f1219;
        f1220 = (i2 + 27) % 128;
        if (this.f1224 == null) {
            int i3 = i2 + 95;
            f1220 = i3 % 128;
            if (i3 % 2 != 0) {
                String strM1425 = m1425();
                this.f1224 = strM1425;
                m788(strM1425);
                int i4 = 11 / 0;
            } else {
                String strM1426 = m1425();
                this.f1224 = strM1426;
                m788(strM1426);
            }
        }
        String str = this.f1224;
        int i5 = f1220 + 87;
        f1219 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m1438(Placement placement) {
        f1220 = (f1219 + 11) % 128;
        boolean zIsIncentivized = placement.isIncentivized();
        int i2 = f1219 + 15;
        f1220 = i2 % 128;
        if (i2 % 2 == 0) {
            return zIsIncentivized;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1431(Advertisement advertisement) {
        int i2 = f1220 + 41;
        f1219 = i2 % 128;
        if (i2 % 2 != 0) {
            return advertisement.getAdMarketId();
        }
        advertisement.getAdMarketId();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Placement m1430(Repository repository, String str) {
        int i2 = f1220 + 69;
        f1219 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Placement placement = (Placement) repository.load(str, Placement.class).get();
        f1219 = (f1220 + 85) % 128;
        return placement;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1434(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f1222;
                char c2 = f1223;
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
}
