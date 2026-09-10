package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.InterfaceC0435l1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x<T> extends u<WebView, T> {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ja f3204;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private z f3205;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Map<T, z> f3206 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private x<T>.a f3203 = new a();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a {

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private boolean f3216;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private boolean f3217;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private boolean f3218;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private boolean f3219;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private boolean f3220;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private boolean f3221;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private boolean f3222;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private List<String> f3223;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        protected List<String> f3224 = new ArrayList();

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private boolean f3225;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f3226;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        public final x<T>.a m3109(boolean z10) {
            this.f3217 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public final x<T>.a m3110(boolean z10) {
            this.f3216 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        public final x<T>.a m3111(boolean z10) {
            this.f3219 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final x<T>.a m3112(boolean z10) {
            this.f3221 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final x<T>.a m3113(String str) {
            this.f3226 = str;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final x<T>.a m3116(boolean z10) {
            this.f3222 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final x<T>.a m3117(List<String> list) {
            this.f3223 = list;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final x<T>.a m3119(boolean z10) {
            this.f3220 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final x<T>.a m3115(boolean z10) {
            this.f3225 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final x<T>.a m3118(boolean z10) {
            this.f3218 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final x<T>.a m3114(List<String> list) {
            if (list != null) {
                this.f3224 = list;
            }
            return this;
        }
    }

    public x(ja jaVar) {
        this.f3204 = jaVar;
    }

    /* JADX INFO: renamed from: ﻐ */
    public abstract View mo209(T t10);

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m3093(ja jaVar) {
        this.f3204 = jaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.t
    /* JADX INFO: renamed from: ｋ */
    public final /* synthetic */ void mo249(JSONObject jSONObject, Object obj, Object obj2) {
        super.mo246(jSONObject, (WebView) obj, obj2);
    }

    /* JADX INFO: renamed from: ﾇ */
    public abstract t<WebView, T> mo214();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public void mo3097(T t10, String str) {
        m3094(new JSONObject(), (Object) t10, str);
    }

    /* JADX INFO: renamed from: ﾇ */
    public abstract void mo215(T t10, List<WebView> list);

    /* JADX INFO: renamed from: ﾒ */
    public abstract z mo216();

    @Override // com.ironsource.adqualitysdk.sdk.i.u
    /* JADX INFO: renamed from: ﾒ */
    public final String mo244(T t10) {
        return (((a) this.f3203).f3219 ? this.f3206.get(t10) : this.f3205).mo244(t10);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m3094(final JSONObject jSONObject, final T t10, String str) {
        boolean z10 = ((a) this.f3203).f3225 && !TextUtils.isEmpty(((a) this.f3203).f3226);
        z zVarMo216 = ((a) this.f3203).f3219 ? this.f3206.get(t10) : this.f3205;
        if (zVarMo216 == null) {
            zVarMo216 = mo216();
            if (((a) this.f3203).f3219) {
                this.f3206.put(t10, zVarMo216);
            } else {
                this.f3205 = zVarMo216;
            }
            zVarMo216.m3075(mo214());
        }
        z zVar = zVarMo216;
        zVar.m3179();
        zVar.m3176(((a) this.f3203).f3226, ((a) this.f3203).f3223, z10, ((a) this.f3203).f3218, ((a) this.f3203).f3217);
        zVar.m3181(str);
        if (!((a) this.f3203).f3221) {
            super.mo249(jSONObject, null, t10);
            return;
        }
        ArrayList arrayList = new ArrayList();
        mo215(t10, arrayList);
        List<WebView> arrayList2 = new ArrayList<>();
        ja jaVar = this.f3204;
        if (jaVar != null) {
            arrayList2 = jaVar.mo1655(t10);
        }
        final List<WebView> listM2804 = ke.m2804(arrayList, arrayList2);
        if (listM2804.isEmpty() || ((a) this.f3203).f3220) {
            View viewMo209 = mo209(t10);
            if (viewMo209 != null) {
                viewMo209.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.x.2

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static int f3207 = 1;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static int f3208 = 0;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static long f3209 = 644889847829842669L;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static String m3098(String str2, int i10) {
                        String str3;
                        Object charArray = str2;
                        if (str2 != null) {
                            charArray = str2.toCharArray();
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
                                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f3209);
                                        i.f2434++;
                                    } else {
                                        str3 = new String(cArr2);
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return str3;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        try {
                            ArrayList arrayList3 = new ArrayList();
                            x.this.mo215(t10, arrayList3);
                            if (arrayList3.isEmpty()) {
                                return;
                            }
                            View viewMo2010 = x.this.mo209(t10);
                            if (viewMo2010 != null) {
                                f3207 = (f3208 + 41) % 128;
                                if (!x.this.f3203.f3220) {
                                    f3208 = (f3207 + InterfaceC0435l1.d.b.f29114k) % 128;
                                    viewMo2010.removeOnLayoutChangeListener(this);
                                }
                            }
                            x.this.m3092(t10, arrayList3);
                            x.this.mo251(new JSONObject(), arrayList3.get(0), t10);
                        } catch (Throwable th2) {
                            kl.m2899(m3098("䪫ꗕ鐛蝦\uf7aa\ue60f텑솓ム⌶Ꭾˆ紹汥岵伊빑꺕駵", TextUtils.getOffsetBefore("", 0) + 61261).intern(), m3098("䪨ᷨ\ue471䳧ᝃﾞ䙎⻂\uf175妭‥袼匘㮟舀啡㷩葉泛㝙鿏晉캲", 22391 - Color.blue(0)).intern(), th2, false);
                        }
                    }
                });
            }
            if (listM2804.isEmpty()) {
                super.mo249(jSONObject, null, t10);
                return;
            }
        }
        if (((a) this.f3203).f3216) {
            p.m3000().post(new Runnable() { // from class: com.ironsource.adqualitysdk.sdk.i.x.4
                @Override // java.lang.Runnable
                public final void run() {
                    x.this.m3092(t10, listM2804);
                    x.super.mo249(jSONObject, (WebView) listM2804.get(0), t10);
                }
            });
        } else {
            m3092(t10, listM2804);
            super.mo249(jSONObject, listM2804.get(0), t10);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m3095(x<T>.a aVar) {
        this.f3203 = aVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public void mo3096(T t10) {
        z zVar;
        JSONObject jSONObject = new JSONObject();
        if (((a) this.f3203).f3219) {
            zVar = this.f3206.get(t10);
        } else {
            zVar = this.f3205;
        }
        mo248(jSONObject, zVar.m3175(), t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public void m3092(T t10, List<WebView> list) {
        z zVar;
        z zVar2;
        if (((a) this.f3203).f3219) {
            zVar = this.f3206.get(t10);
        } else {
            zVar = this.f3205;
        }
        zVar.m3177(list);
        if (((a) this.f3203).f3222) {
            if (((a) this.f3203).f3219) {
                zVar2 = this.f3206.get(t10);
            } else {
                zVar2 = this.f3205;
            }
            zVar2.m3181(Integer.toHexString(list.get(0).hashCode()));
        }
    }
}
