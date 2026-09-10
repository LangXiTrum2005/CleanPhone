package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class aa extends w<View> implements View.OnLayoutChangeListener, jn {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f70 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f71;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f72 = {-195962772, -1974950459, 2032398468, 138799625, 1543825826, -577692779, 1357151006, 1309453754, -554458323, -1350134952, 639469298, -207331019, -66273853, 911925232, -1736004684, 696513830, -243687540, 604323};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private WeakHashMap<View, Boolean> f73;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private a f74;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Class f75;

    public class a extends w.e {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f76 = 1;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f77 = 11;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f78 = 0;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static long f79 = -8479458958448729447L;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f80;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f81;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f82;

        public a(aa aaVar) {
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ String m236(a aVar) {
            int i2 = f76 + 35;
            f78 = i2 % 128;
            int i3 = i2 % 2;
            String str = aVar.f82;
            if (i3 == 0) {
                return str;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ String m238(a aVar) {
            int i2 = f76 + 29;
            int i3 = i2 % 128;
            f78 = i3;
            int i4 = i2 % 2;
            String str = aVar.f80;
            if (i4 != 0) {
                int i5 = 51 / 0;
            }
            f76 = (i3 + 113) % 128;
            return str;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ String m240(a aVar) {
            int i2 = f76 + 73;
            f78 = i2 % 128;
            int i3 = i2 % 2;
            String str = aVar.f81;
            if (i3 == 0) {
                return str;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private a m241(String str) {
            int i2 = f76;
            int i3 = i2 + 33;
            f78 = i3 % 128;
            if (i3 % 2 != 0) {
                this.f81 = str;
                throw null;
            }
            this.f81 = str;
            int i4 = i2 + 91;
            f78 = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private a m242(String str) {
            int i2 = f76 + 73;
            int i3 = i2 % 128;
            f78 = i3;
            if (i2 % 2 != 0) {
                this.f82 = str;
                throw null;
            }
            this.f82 = str;
            f76 = (i3 + 121) % 128;
            return this;
        }

        public a(aa aaVar, JSONObject jSONObject) {
            m237(jSONObject.optString(m239("\ue2ee띹䧱\ue240들䥥\ue3f0둹仝\ue355뗘九\ue0eb딹侲\ue037몙伾\ue1a6먠䲔\ue108", 21893 - KeyEvent.keyCodeFromString("")).intern()));
            m242(jSONObject.optString(m243("\uffff\u0010\u0003\uffff\u0011\uffdd\u0006\ufffb\r\r￨\ufffb\u0007", 113 - KeyEvent.getDeadChar(0, 0), 12 - TextUtils.lastIndexOf("", '0', 0), false, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern()));
            m241(jSONObject.optString(m239("\ue2e9쪣뉝鯭䎛⬪ჭ\uf88dꀤ觝煇夂ڸ\uee60혊뾴", 10330 - ((byte) KeyEvent.getModifierMetaStateMask())).intern()));
            m2996(jSONObject.optString(m243("�\u000e\u0004\r￮\t￣\b\u0004\uffff", (Process.myPid() >> 22) + 113, 10 - TextUtils.indexOf("", "", 0), false, 1 - MotionEvent.axisFromString("")).intern()));
            m2998(false);
            m2995(!TextUtils.isEmpty(jSONObject.optString(m243("�\u000e\u0004\r￮\t￣\b\u0004\uffff", 113 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10, false, 2 - View.resolveSize(0, 0)).intern())) || jSONObject.optBoolean(m239("\ue2ecꌍ愲❻\ue560ꭸ榥⾡\uedc4돱燜㘘\uf424멇硕㹤", 16871 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) || jSONObject.optBoolean(m243("\u0000\ufff2\u0000\u000e\u0010\u000f\t\u0000\u0004\u0007\uffde\u0000\b\n\r\u0003\uffde�", TextUtils.getTrimmedLength("") + 112, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, true, 5 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern()));
            m2993(jSONObject.optBoolean(m239("\ue2ecꌍ愲❻\ue560ꭸ榥⾡\uedc4돱燜㘘\uf424멇硕㹤", 16871 - View.resolveSize(0, 0)).intern()));
            m2991(jSONObject.optBoolean(m239("\ue2ec螡⡪촽矍ᢚ봩⟵좋浉", 25931 - KeyEvent.getDeadChar(0, 0)).intern()));
            m2997(TextUtils.isEmpty(jSONObject.optString(m243("￼\uffff\u000e\u000b\b\u0002￦\b\ufffb", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 118, 8 - ImageFormat.getBitsPerPixel(0), false, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3).intern())) ? null : Arrays.asList(jSONObject.optString(m243("￼\uffff\u000e\u000b\b\u0002￦\b\ufffb", 117 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 9 - KeyEvent.getDeadChar(0, 0), false, 4 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern()).split(m239("\ue2b5", 15054 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())));
            m3000(jSONObject.optBoolean(m239("\ue2ec\uf5d9첚Ꝋ븴鄐槊䂏孢㈠Ԏᷘ\uf489", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 5938).intern(), true));
            m2999(false);
            m2990(jSONObject.optBoolean(m243("\uffff\n\u0002\u000b\u0003\t\ufffb\ufff9\u0004\ufff7\n\t\u0004\uffdf\ufffb\u0002\u0006", 117 - (ViewConfiguration.getFadingEdgeLength() >> 16), KeyEvent.normalizeMetaState(0) + 17, true, TextUtils.getCapsMode("", 0, 0) + 5).intern()));
            m2992(jSONObject.optBoolean(m243("\uffe7\u0006￨\u0007\u000b\f\u0001\u0005\b", KeyEvent.keyCodeFromString("") + 115, (ViewConfiguration.getScrollBarSize() >> 8) + 9, false, (Process.myPid() >> 22) + 6).intern()));
            m2994(kc.m2769(jSONObject.optJSONArray(m243("￠\u0006￫\n\u000e￼\u0000\r￼\t\u0006\u0005\ufffe", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 116, Color.blue(0) + 13, true, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 7).intern())));
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private a m237(String str) {
            int i2 = f76 + 69;
            f78 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f80 = str;
                return this;
            }
            this.f80 = str;
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m239(String str, int i2) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2055) {
                try {
                    g.f2056 = i2;
                    char[] cArr2 = new char[cArr.length];
                    g.f2054 = 0;
                    while (true) {
                        int i3 = g.f2054;
                        if (i3 < cArr.length) {
                            cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f79);
                            g.f2054++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m243(String str, int i2, int i3, boolean z2, int i4) {
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
                        cArr2[b.f673] = (char) (b.f671 + i2);
                        int i6 = b.f673;
                        cArr2[i6] = (char) (cArr2[i6] - f77);
                        b.f673 = i6 + 1;
                    }
                    if (i4 > 0) {
                        b.f674 = i4;
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
    }

    public aa(JSONObject jSONObject) {
        super(null);
        this.f73 = new WeakHashMap<>();
        this.f74 = new a(this);
        m233(jSONObject);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static View m222(View view) {
        int i2 = f70;
        int i3 = i2 + 19;
        f71 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        f71 = (i2 + 97) % 128;
        return view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        f70 = (f71 + 107) % 128;
        try {
            View viewM224 = m224(view, this.f75);
            if (viewM224 != null) {
                int i10 = f71 + 101;
                f70 = i10 % 128;
                if (i10 % 2 != 0) {
                    m227(viewM224);
                    view.removeOnLayoutChangeListener(this);
                } else {
                    m227(viewM224);
                    view.removeOnLayoutChangeListener(this);
                    throw null;
                }
            }
        } catch (Throwable th) {
            kb.m2752(m225(new int[]{1129516775, -1303352334, -2101213116, 156721360, -1034859228, 1689706910, 154523856, -264714292, -696253829, -1596625137}, 'C' - AndroidCharacter.getMirror('0')).intern(), m225(new int[]{1277651798, -73075828, 1075651811, -1570608783, 1759727075, 77633652, -1305248445, 134319199, 561352239, 1369803384, -1295515608, 403547890}, 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), th, false);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m228() {
        int i2 = f70 + 33;
        f71 = i2 % 128;
        if (i2 % 2 == 0) {
            m3006((p) null);
            jj.m2607().m2614(this);
        } else {
            m3006((p) null);
            jj.m2607().m2614(this);
            throw null;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final p<WebView, View> mo230() {
        int i2 = (f71 + 11) % 128;
        f70 = i2;
        int i3 = i2 + 23;
        f71 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 76 / 0;
        }
        return this;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ View mo232(View view) {
        f71 = (f70 + 15) % 128;
        View viewM222 = m222(view);
        int i2 = f70 + 65;
        f71 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 66 / 0;
        }
        return viewM222;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ void mo235(View view, List list) {
        int i2 = f71 + 43;
        f70 = i2 % 128;
        int i3 = i2 % 2;
        m221(view, (List<WebView>) list);
        if (i3 == 0) {
            throw null;
        }
        f71 = (f70 + 97) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private View m223(View view, String str) {
        ViewGroup viewGroup;
        int i2;
        int i3 = f71 + 79;
        int i4 = i3 % 128;
        f70 = i4;
        if (i3 % 2 == 0) {
            boolean z2 = view instanceof ViewGroup;
            throw null;
        }
        if (view instanceof ViewGroup) {
            int i5 = i4 + 77;
            f71 = i5 % 128;
            if (i5 % 2 != 0) {
                viewGroup = (ViewGroup) view;
                i2 = 1;
            } else {
                viewGroup = (ViewGroup) view;
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getClass().getName().startsWith(str)) {
                    return childAt;
                }
                View viewM223 = m223(childAt, str);
                if (viewM223 != null) {
                    return viewM223;
                }
                i2++;
            }
        }
        return null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.jn
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void mo231(View view) {
        View viewM223;
        View viewM224 = m224(view, this.f75);
        if (viewM224 != null) {
            m227(viewM224);
            return;
        }
        if (!TextUtils.isEmpty(a.m240(this.f74)) && (viewM223 = m223(view, a.m240(this.f74))) != null) {
            int i2 = f70 + 19;
            f71 = i2 % 128;
            int i3 = i2 % 2;
            viewM223.addOnLayoutChangeListener(this);
            if (i3 != 0) {
                throw null;
            }
        }
        int i4 = f70 + 57;
        f71 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m233(JSONObject jSONObject) {
        a aVar = new a(this, jSONObject);
        m2976((w.e) aVar);
        this.f74 = aVar;
        try {
            this.f75 = Class.forName(a.m236(aVar));
            f71 = (f70 + 123) % 128;
            m226();
            int i2 = f70 + 95;
            f71 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (ClassNotFoundException e2) {
            String strIntern = m225(new int[]{1129516775, -1303352334, -2101213116, 156721360, -1034859228, 1689706910, 154523856, -264714292, -696253829, -1596625137}, 19 - ExpandableListView.getPackedPositionGroup(0L)).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m225(new int[]{1277651798, -73075828, 157021924, -1170254582, 994903990, -1347846206, 1359229212, 1802901281, -505145627, -742090904, -768612974, -2144440920, -2094029601, 434054352, 2145809065, 1992710471}, 32 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
            sb.append(a.m236(aVar));
            sb.append(m225(new int[]{-1854616036, -2017920942}, 2 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern());
            sb.append(e2.getLocalizedMessage());
            n.m2826(strIntern, sb.toString());
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final ab mo234() {
        ad adVar = new ad();
        f70 = (f71 + 77) % 128;
        return adVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m227(View view) {
        if (this.f73.containsKey(view)) {
            return;
        }
        f71 = (f70 + 35) % 128;
        this.f73.put(view, Boolean.TRUE);
        mo2954(view, Integer.toHexString(view.hashCode()));
        f70 = (f71 + 17) % 128;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.jn
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void mo229(View view) {
        int i2 = f71 + 37;
        f70 = i2 % 128;
        if (i2 % 2 != 0) {
            View viewM224 = m224(view, this.f75);
            if (viewM224 == null || this.f73.remove(viewM224) == null) {
                return;
            }
            int i3 = f71 + 31;
            f70 = i3 % 128;
            int i4 = i3 % 2;
            mo2953(view);
            if (i4 == 0) {
                int i5 = 14 / 0;
                return;
            }
            return;
        }
        m224(view, this.f75);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m226() {
        int i2 = f71 + 87;
        f70 = i2 % 128;
        if (i2 % 2 != 0) {
            jj.m2607().m2613(this);
        } else {
            jj.m2607().m2613(this);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private View m224(View view, Class cls) {
        f71 = (f70 + 125) % 128;
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i2 = 0;
        while (i2 < viewGroup.getChildCount()) {
            f71 = (f70 + 35) % 128;
            View childAt = viewGroup.getChildAt(i2);
            if (cls.isAssignableFrom(childAt.getClass())) {
                return childAt;
            }
            View viewM224 = m224(childAt, cls);
            if (viewM224 != null) {
                return viewM224;
            }
            i2++;
            f71 = (f70 + 57) % 128;
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m221(View view, List<WebView> list) {
        int i2 = f71 + 13;
        f70 = i2 % 128;
        if (i2 % 2 == 0) {
            ke.m2795(view, WebView.class, a.m238(this.f74), false, false, null, this.f74.f3050, list);
        } else {
            ke.m2795(view, WebView.class, a.m238(this.f74), true, false, null, this.f74.f3050, list);
        }
        int i3 = f71 + 115;
        f70 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 8 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m225(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f72.clone();
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
