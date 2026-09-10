package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class w<T> extends x<WebView, T> {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private iq f3027;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ab f3029;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Map<T, ab> f3030 = new WeakHashMap();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private w<T>.e f3028 = new e();

    public class e {

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private boolean f3041;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private boolean f3042;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private boolean f3043;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private boolean f3044;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private boolean f3045;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private boolean f3046;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private boolean f3047;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private String f3048;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private boolean f3049;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        protected List<String> f3050 = new ArrayList();

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private List<String> f3051;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        public final w<T>.e m2990(boolean z2) {
            this.f3046 = z2;
            return this;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public final w<T>.e m2991(boolean z2) {
            this.f3042 = z2;
            return this;
        }

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        public final w<T>.e m2992(boolean z2) {
            this.f3041 = z2;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final w<T>.e m2993(boolean z2) {
            this.f3044 = z2;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final w<T>.e m2995(boolean z2) {
            this.f3043 = z2;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final w<T>.e m2996(String str) {
            this.f3048 = str;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final w<T>.e m2999(boolean z2) {
            this.f3045 = z2;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final w<T>.e m3000(boolean z2) {
            this.f3047 = z2;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final w<T>.e m2994(List<String> list) {
            if (list != null) {
                this.f3050 = list;
            }
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final w<T>.e m2997(List<String> list) {
            this.f3051 = list;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final w<T>.e m2998(boolean z2) {
            this.f3049 = z2;
            return this;
        }
    }

    public w(iq iqVar) {
        this.f3027 = iqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public void m2973(T t, List<WebView> list) {
        (((e) this.f3028).f3046 ? this.f3030.get(t) : this.f3029).m264(list);
        if (((e) this.f3028).f3049) {
            (((e) this.f3028).f3046 ? this.f3030.get(t) : this.f3029).m266(Integer.toHexString(list.get(0).hashCode()));
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public void mo2954(T t, String str) {
        m2977(new JSONObject(), (Object) t, str);
    }

    /* JADX INFO: renamed from: ﻛ */
    public abstract p<WebView, T> mo230();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.x, com.p004ironsource.adqualitysdk.sdk.i.p
    /* JADX INFO: renamed from: ｋ */
    public final /* synthetic */ void mo265(JSONObject jSONObject, Object obj, Object obj2) {
        super.mo258(jSONObject, (WebView) obj, obj2);
    }

    /* JADX INFO: renamed from: ﾇ */
    public abstract View mo232(T t);

    /* JADX INFO: renamed from: ﾒ */
    public abstract ab mo234();

    /* JADX INFO: renamed from: ﾒ */
    public abstract void mo235(T t, List<WebView> list);

    /* JADX INFO: renamed from: ﻐ */
    public void mo2953(T t) {
        mo1633(new JSONObject(), (((e) this.f3028).f3046 ? this.f3030.get(t) : this.f3029).m267(), t);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2976(w<T>.e eVar) {
        this.f3028 = eVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2978(iq iqVar) {
        this.f3027 = iqVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2977(final JSONObject jSONObject, final T t, String str) {
        ab abVarMo234;
        boolean z2 = ((e) this.f3028).f3047 && !TextUtils.isEmpty(((e) this.f3028).f3048);
        if (((e) this.f3028).f3046) {
            abVarMo234 = this.f3030.get(t);
        } else {
            abVarMo234 = this.f3029;
        }
        if (abVarMo234 == null) {
            abVarMo234 = mo234();
            if (((e) this.f3028).f3046) {
                this.f3030.put(t, abVarMo234);
            } else {
                this.f3029 = abVarMo234;
            }
            abVarMo234.m3006(mo230());
        }
        ab abVar = abVarMo234;
        abVar.m260();
        abVar.m263(((e) this.f3028).f3048, ((e) this.f3028).f3051, z2, ((e) this.f3028).f3044, ((e) this.f3028).f3042);
        abVar.m266(str);
        if (!((e) this.f3028).f3043) {
            super.mo265(jSONObject, (Object) null, t);
            return;
        }
        ArrayList arrayList = new ArrayList();
        mo235(t, arrayList);
        List<WebView> arrayList2 = new ArrayList<>();
        iq iqVar = this.f3027;
        if (iqVar != null) {
            arrayList2 = iqVar.mo1665(t);
        }
        final List<WebView> listM2669 = ju.m2669(arrayList, arrayList2);
        if (listM2669.isEmpty() || ((e) this.f3028).f3045) {
            View viewMo232 = mo232(t);
            if (viewMo232 != null) {
                viewMo232.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.w.2

                    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                    private static int f3031 = 1;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static int f3033;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static char[] f3032 = {9414, 25138, 43362, 61625, 16367, 17664, 35928, 52116, 4829, 22545, 59143, 11881, 30108, 48378, 64012, 333, 18588, 38866, 56588, 19589, 2677, 49468, 39162, 22446, 11523, 58371, 41951, 31448, 12368, 36712, 17921, 7669, 54434, 37453, 26908, 8388, 65460, 46422, 3172, 52002, 33524, 22975};

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static long f3034 = 4886772979458262727L;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static String m2979(int i2, char c2, int i3) {
                        String str2;
                        synchronized (a.f68) {
                            try {
                                char[] cArr = new char[i3];
                                a.f69 = 0;
                                while (true) {
                                    int i4 = a.f69;
                                    if (i4 < i3) {
                                        cArr[i4] = (char) ((((long) f3032[i2 + i4]) ^ (((long) i4) * f3034)) ^ ((long) c2));
                                        a.f69 = i4 + 1;
                                    } else {
                                        str2 = new String(cArr);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return str2;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        try {
                            ArrayList arrayList3 = new ArrayList();
                            w.this.mo235(t, arrayList3);
                            if (!arrayList3.isEmpty()) {
                                f3031 = (f3033 + 21) % 128;
                                View viewMo233 = w.this.mo232(t);
                                if (viewMo233 != null) {
                                    int i10 = f3033 + 39;
                                    f3031 = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        boolean unused = w.this.f3028.f3045;
                                        throw null;
                                    }
                                    if (!w.this.f3028.f3045) {
                                        viewMo233.removeOnLayoutChangeListener(this);
                                    }
                                }
                                w.this.m2973(t, arrayList3);
                                w.this.mo1642(new JSONObject(), arrayList3.get(0), t);
                            }
                            int i11 = f3031 + 69;
                            f3033 = i11 % 128;
                            if (i11 % 2 != 0) {
                                int i12 = 25 / 0;
                            }
                        } catch (Throwable th) {
                            kb.m2752(m2979(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (Color.argb(0, 0, 0, 0) + 9344), 18 - ImageFormat.getBitsPerPixel(0)).intern(), m2979(TextUtils.getOffsetAfter("", 0) + 19, (char) (19648 - KeyEvent.normalizeMetaState(0)), 23 - TextUtils.indexOf("", "", 0)).intern(), th, false);
                        }
                    }
                });
            }
            if (listM2669.isEmpty()) {
                super.mo265(jSONObject, (Object) null, t);
                return;
            }
        }
        if (!((e) this.f3028).f3041) {
            m2973(t, listM2669);
            super.mo265(jSONObject, listM2669.get(0), t);
        } else {
            s.m2921().post(new Runnable() { // from class: com.ironsource.adqualitysdk.sdk.i.w.4
                @Override // java.lang.Runnable
                public final void run() {
                    w.this.m2973(t, listM2669);
                    w.super.mo265(jSONObject, (WebView) listM2669.get(0), t);
                }
            });
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.x
    /* JADX INFO: renamed from: ｋ */
    public final String mo261(T t) {
        ab abVar;
        if (((e) this.f3028).f3046) {
            abVar = this.f3030.get(t);
        } else {
            abVar = this.f3029;
        }
        return abVar.mo261(t);
    }
}
