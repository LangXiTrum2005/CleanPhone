package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ac extends x<View> implements View.OnLayoutChangeListener, jv {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f62 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f63 = {1878297906, -1226617177, -571530587, 1016795243, 455023386, 371462824, 472464473, -1011257313, 1551789801, -1371825369, 2065371415, -2118655947, -918875199, 1621952738, 141078768, -744116610, 2096663244, -203981541};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f64;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Class f65;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private WeakHashMap<View, Boolean> f66;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private c f67;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c extends x.a {

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f68 = 0;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f69 = 1;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static long f70 = 99295043727978549L;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static long f71 = 2231152186400035710L;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f72;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private String f73;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f74;

        public c(ac acVar) {
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ String m218(c cVar) {
            int i10 = f69;
            f68 = (i10 + 23) % 128;
            String str = cVar.f73;
            f68 = (i10 + InterfaceC0435l1.d.b.f29112i) % 128;
            return str;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ String m220(c cVar) {
            int i10 = (f68 + 61) % 128;
            f69 = i10;
            String str = cVar.f72;
            int i11 = i10 + 91;
            f68 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 88 / 0;
            }
            return str;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private c m221(String str) {
            int i10 = f69 + 43;
            f68 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f73 = str;
                return this;
            }
            this.f73 = str;
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ String m224(c cVar) {
            int i10 = f69;
            int i11 = i10 + 107;
            f68 = i11 % 128;
            int i12 = i11 % 2;
            String str = cVar.f74;
            if (i12 != 0) {
                throw null;
            }
            int i13 = i10 + 73;
            f68 = i13 % 128;
            if (i13 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public c(ac acVar, JSONObject jSONObject) {
            m223(jSONObject.optString(m222("猏獸齰ᠠ\u0ad6㺞浸䱫䨽룋뺾烺\ue893⍤ﰡ曣骩\uf16c⸷ᓽ䒿䝇怇싆\uf6beᕅ", 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern()));
            m221(jSONObject.optString(m222("\udc43\udc35ꊞ凡셄釸傓熉ϭ獈\uf778뭉䟀ẩ뗵굎㗎", ViewConfiguration.getScrollBarFadeDuration() >> 16).intern()));
            m217(jSONObject.optString(m219("\uf045鮏⟱돁強\ueb06睁ʡ꺈㫱웫刮︔詌ᖦꆘ", ImageFormat.getBitsPerPixel(0) + 27612).intern()));
            m3113(jSONObject.optString(m222("ᰉᱣ\uecb8ઃᎂ冸ậ㾵墵ꆀ갫榗螚傯", 1 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern()));
            m3116(false);
            m3112(!TextUtils.isEmpty(jSONObject.optString(m222("ᰉᱣ\uecb8ઃᎂ冸ậ㾵墵ꆀ갫榗螚傯", TextUtils.getTrimmedLength("")).intern())) || jSONObject.optBoolean(m219("\uf040緝\ueb66墳옼㑐ꇁ⽡鲈\u0a31硸\ue5f0匘삏両뱔", 36251 - (ViewConfiguration.getScrollBarSize() >> 8)).intern()) || jSONObject.optBoolean(m219("\uf040\ud8fdꄦ詓劼㯰Д\ued40떟黉朖すᢲ\ue126쩦銥篫䐪", TextUtils.lastIndexOf("", '0', 0) + 10428).intern()));
            m3118(jSONObject.optBoolean(m219("\uf040緝\ueb66墳옼㑐ꇁ⽡鲈\u0a31硸\ue5f0匘삏両뱔", 36251 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern()));
            m3109(jSONObject.optBoolean(m222("\uf5f5\uf580䵜अ쇯롵뽓鹑嬚珃꾜믐湏\uf14c", KeyEvent.keyCodeFromString("")).intern()));
            m3117(TextUtils.isEmpty(jSONObject.optString(m219("\uf040ম\u038bᷞ៣ᇝ⬥┃㼅", 63977 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) ? null : Arrays.asList(jSONObject.optString(m219("\uf040ম\u038bᷞ៣ᇝ⬥┃㼅", 63977 - Drawable.resolveOpacity(0, 0)).intern()).split(m222("ᥰᥜ뢪ꄿ䳿", (-16777216) - Color.rgb(0, 0, 0)).intern())));
            m3115(jSONObject.optBoolean(m219("\uf040\uffe7\uef12\ude9c컐빦궒鴡赞糮氖宮䯍", 4001 - Color.blue(0)).intern(), true));
            m3119(false);
            m3111(jSONObject.optBoolean(m222("캃컮갾ퟤ뱞茒帳缵藬็煴왐唺ဵ㏫큎✊숽\ue1f3ꉗ蘿", ViewConfiguration.getPressedStateDuration() >> 16).intern()));
            m3110(jSONObject.optBoolean(m222("얢엋캈歍즹蠴㲽ᶛ㥚箍췁뎌带", 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern()));
            m3114(kj.m2852(jSONObject.optJSONArray(m219("\uf043\ue46f\ud836쳛ꂊ钞襨紙凊䖐㦤\u2e76ȴ", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5172).intern())));
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private c m217(String str) {
            int i10 = (f68 + InterfaceC0435l1.d.b.f29110g) % 128;
            f69 = i10;
            this.f72 = str;
            int i11 = i10 + 97;
            f68 = i11 % 128;
            if (i11 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private c m223(String str) {
            int i10 = (f69 + 87) % 128;
            f68 = i10;
            this.f74 = str;
            f69 = (i10 + 65) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m222(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2127) {
                try {
                    char[] cArrM2229 = g.m2229(f71, cArr, i10);
                    g.f2129 = 4;
                    while (true) {
                        int i11 = g.f2129;
                        if (i11 < cArrM2229.length) {
                            int i12 = i11 - 4;
                            g.f2128 = i12;
                            cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f71));
                            g.f2129 = i11 + 1;
                        } else {
                            str2 = new String(cArrM2229, 4, cArrM2229.length - 4);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m219(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (i.f2435) {
                try {
                    i.f2436 = i10;
                    char[] cArr2 = new char[cArr.length];
                    i.f2434 = 0;
                    while (true) {
                        int i11 = i.f2434;
                        if (i11 < cArr.length) {
                            cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f70);
                            i.f2434++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    public ac(JSONObject jSONObject) {
        super(null);
        this.f66 = new WeakHashMap<>();
        this.f67 = new c(this);
        m211(jSONObject);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        f62 = (f64 + 41) % 128;
        try {
            View viewM205 = m205(view, this.f65);
            if (viewM205 != null) {
                int i18 = f62 + 13;
                f64 = i18 % 128;
                if (i18 % 2 == 0) {
                    m206(viewM205);
                    view.removeOnLayoutChangeListener(this);
                } else {
                    m206(viewM205);
                    view.removeOnLayoutChangeListener(this);
                    throw null;
                }
            }
        } catch (Throwable th2) {
            kl.m2899(m208(new int[]{-309412633, 1023172094, -1533480888, -2100515236, 1488542177, 233447488, -1862095654, -1463384731, 1230305435, -672575845}, 19 - TextUtils.getOffsetAfter("", 0)).intern(), m208(new int[]{-422206219, 667418301, 290068697, 310897032, 335302059, -2120590982, -1758788593, 753314242, -1439532795, 1016528876, -553894967, 224949978}, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 22).intern(), th2, false);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ View mo209(View view) {
        f64 = (f62 + 79) % 128;
        View viewM202 = m202(view);
        int i10 = f64 + 73;
        f62 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 12 / 0;
        }
        return viewM202;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m211(JSONObject jSONObject) {
        c cVar = new c(this, jSONObject);
        m3095(cVar);
        this.f67 = cVar;
        try {
            this.f65 = Class.forName(c.m218(cVar));
            int i10 = (f64 + 67) % 128;
            f62 = i10;
            f64 = (i10 + 11) % 128;
            m203();
        } catch (ClassNotFoundException e10) {
            String strIntern = m208(new int[]{-309412633, 1023172094, -1533480888, -2100515236, 1488542177, 233447488, -1862095654, -1463384731, 1230305435, -672575845}, (-16777197) - Color.rgb(0, 0, 0)).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m208(new int[]{-422206219, 667418301, 912841165, -1719601002, -1609181823, 1311551507, -53925952, 251638534, -1307013793, -106614965, -213606665, 1263136232, 1218919679, 1240503722, 1840365755, -424065269}, TextUtils.indexOf("", "", 0) + 31).intern());
            sb2.append(c.m218(cVar));
            sb2.append(m208(new int[]{-1481431655, -1418800040}, 1 - ((byte) KeyEvent.getModifierMetaStateMask())).intern());
            sb2.append(e10.getLocalizedMessage());
            m.m2964(strIntern, sb2.toString());
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m212() {
        f64 = (f62 + 43) % 128;
        m3075((t) null);
        jp.m2705().m2709(this);
        int i10 = f62 + 21;
        f64 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 3 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ void mo215(View view, List list) {
        f62 = (f64 + 21) % 128;
        m204(view, (List<WebView>) list);
        f64 = (f62 + 93) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final z mo216() {
        aa aaVar = new aa();
        f64 = (f62 + 107) % 128;
        return aaVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: avoid collision after fix types in other method and contains not printable characters */
    private static View m202(View view) {
        f64 = (f62 + InterfaceC0435l1.d.b.f29105b) % 128;
        return view;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private View m207(View view, String str) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        int i10 = (f64 + InterfaceC0435l1.d.b.f29105b) % 128;
        f62 = i10;
        ViewGroup viewGroup = (ViewGroup) view;
        f64 = (i10 + 79) % 128;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt.getClass().getName().startsWith(str)) {
                f64 = (f62 + 97) % 128;
                return childAt;
            }
            View viewM207 = m207(childAt, str);
            if (viewM207 != null) {
                return viewM207;
            }
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final t<WebView, View> mo214() {
        int i10 = f64;
        int i11 = i10 + 67;
        f62 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        int i12 = i10 + 41;
        f62 = i12 % 128;
        if (i12 % 2 != 0) {
            return this;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m206(View view) {
        int i10 = f64 + 91;
        f62 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f66.containsKey(view);
            throw null;
        }
        if (this.f66.containsKey(view)) {
            return;
        }
        this.f66.put(view, Boolean.TRUE);
        mo3097(view, Integer.toHexString(view.hashCode()));
        f62 = (f64 + 41) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jv
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void mo213(View view) {
        f62 = (f64 + 83) % 128;
        View viewM205 = m205(view, this.f65);
        if (viewM205 != null) {
            int i10 = f64 + 65;
            f62 = i10 % 128;
            if (i10 % 2 != 0) {
                m206(viewM205);
                return;
            } else {
                m206(viewM205);
                throw null;
            }
        }
        if (TextUtils.isEmpty(c.m220(this.f67))) {
            return;
        }
        f64 = (f62 + InterfaceC0435l1.d.b.f29112i) % 128;
        View viewM207 = m207(view, c.m220(this.f67));
        if (viewM207 != null) {
            f64 = (f62 + 15) % 128;
            viewM207.addOnLayoutChangeListener(this);
            f62 = (f64 + 53) % 128;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m203() {
        f64 = (f62 + 67) % 128;
        jp.m2705().m2710(this);
        int i10 = f64 + 39;
        f62 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jv
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void mo210(View view) {
        View viewM205 = m205(view, this.f65);
        if (viewM205 != null) {
            f64 = (f62 + 67) % 128;
            if (this.f66.remove(viewM205) != null) {
                mo3096(view);
            }
        }
        int i10 = f62 + 121;
        f64 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 32 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m208(int[] iArr, int i10) {
        String str;
        synchronized (a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f63.clone();
                a.f58 = 0;
                while (true) {
                    int i11 = a.f58;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c4 = (char) (i12 >> 16);
                        cArr[0] = c4;
                        char c5 = (char) i12;
                        cArr[1] = c5;
                        char c10 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c10;
                        char c11 = (char) iArr[i11 + 1];
                        cArr[3] = c11;
                        a.f59 = (c4 << 16) + c5;
                        a.f60 = (c10 << 16) + c11;
                        a.m199(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = a.f59 ^ iArr2[i13];
                            a.f59 = i14;
                            int iM200 = a.m200(i14) ^ a.f60;
                            int i15 = a.f59;
                            a.f59 = iM200;
                            a.f60 = i15;
                        }
                        int i16 = a.f59;
                        int i17 = a.f60;
                        a.f59 = i17;
                        a.f60 = i16;
                        int i18 = i16 ^ iArr2[16];
                        a.f60 = i18;
                        int i19 = i17 ^ iArr2[17];
                        a.f59 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        a.m199(iArr2);
                        int i20 = a.f58;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        a.f58 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m204(View view, List<WebView> list) {
        int i10 = f64 + 125;
        f62 = i10 % 128;
        if (i10 % 2 == 0) {
            kq.m2962(view, WebView.class, c.m224(this.f67), true, false, null, this.f67.f3224, list);
        } else {
            kq.m2962(view, WebView.class, c.m224(this.f67), true, false, null, this.f67.f3224, list);
        }
        f62 = (f64 + 117) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private View m205(View view, Class cls) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        f64 = (f62 + 77) % 128;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            f62 = (f64 + 53) % 128;
            View childAt = viewGroup.getChildAt(i10);
            if (cls.isAssignableFrom(childAt.getClass())) {
                return childAt;
            }
            View viewM205 = m205(childAt, cls);
            if (viewM205 != null) {
                f62 = (f64 + 87) % 128;
                return viewM205;
            }
        }
        return null;
    }
}
